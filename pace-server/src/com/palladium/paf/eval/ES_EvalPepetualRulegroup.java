/*
 *	File: @(#)ES_EvalnvMeasures.java 	Package: com.pace.base.eval 	Project: PafServer
 *	Created: Sep 26, 2005  		By: JWatkins
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2006 Palladium Group, Inc. All rights reserved.
 *
 *	This software is the confidential and proprietary information of Palladium Group, Inc.
 *	("Confidential Information"). You shall not disclose such Confidential Information and 
 * 	should use it only in accordance with the terms of the license agreement you entered into
 *	with Palladium Group, Inc.
 *
 *
 *
 Date			Author			Version			Changes
 xx/xx/xx		xxxxxxxx		x.xx			..............
 * 
 */
package com.palladium.paf.eval;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;

import com.pace.base.PafErrSeverity;
import com.pace.base.PafException;
import com.pace.base.data.Intersection;
import com.pace.base.funcs.IPafFunction;
import com.pace.base.mdb.PafDataCache;
import com.pace.base.mdb.PafDimMember;
import com.pace.base.mdb.PafDimTree;
import com.pace.base.rules.Formula;
import com.pace.base.rules.Rule;
import com.pace.base.state.EvalState;
import com.pace.base.utility.LogUtil;
import com.palladium.paf.server.PafDataService;
import com.palladium.paf.server.RuleMngr;

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author JWatkins
 *
 */
public class ES_EvalPepetualRulegroup extends ES_EvalBase implements IEvalStep {
	
	private static Logger logger = Logger.getLogger(ES_EvalPepetualRulegroup.class);
	PafDataService dataService = PafDataService.getInstance();
	
	public void performEvaluation(EvalState evalState) throws PafException {
		
		long startTime = System.currentTimeMillis();
		long stepTime;
		PafDataCache dataCache = evalState.getDataCache();
        String measureDim = evalState.getAppDef().getMdbDef().getMeasureDim();
        String timeDim = evalState.getAppDef().getMdbDef().getTimeDim();
        
		HashSet<Intersection> newChngCells = new HashSet<Intersection>();
		HashMap<Intersection, Formula> cellsToCalc = new HashMap<Intersection, Formula>();
		
		Intersection calcIntersection;

		IPafFunction measFunc = null;
        if (evalState.getRule().getFormula().isResultFunction())
                measFunc = evalState.getRule().getFormula().extractResultFunction();

		stepTime = System.currentTimeMillis();       
		Set<Intersection> chngCells = new HashSet<Intersection>(500);
		
		stepTime = System.currentTimeMillis();
		Rule leadingRule;
		
		// if the rule currently being examined isn't a measure function, then only changes within the current timeslice need to be
		// examined
		if (measFunc == null) {
			
			// if any lookback function is used on the right side of the equation then that timeslice must also
			// be added to the pool
			
            chngCells = impactingChangeList(evalState.getRule(), evalState);
            
			for (Intersection is : chngCells) {
				// does this intersection change force the current rule to evaluate?
				// 1st criteria, it has to be a component of this rule.
//                if ( EvalUtil.changeTriggersFormula( is, evalState.getRule(), evalState) ) {
					// it will if it is the highest priority rule within this group that can execute
					// this is true if the left hand term for every other rule above this rule is
					// locked.
                	leadingRule = RuleMngr.findLeadingRule(evalState.getRuleGroup(), evalState, is);

					if (leadingRule != null && leadingRule.equals(evalState.getRule())) {
						calcIntersection = is.clone();
						calcIntersection.setCoordinate(measureDim, leadingRule.getFormula().getResultTerm());
						calcIntersection.setCoordinate(timeDim, evalState.getCurrentTimeSlice());
                        
                        // handle lockAllPrior tag.
                        // this tag indicates that when an intersection is calculated, all prior periods level 0
                        // intersections are locked. This preserves their value as as subsequent allocations are
                        // resolved.
                        
                        if ( evalState.getRule().isLockAllPriorTime() ) {
                            Set<Intersection> priorLocks = calculatePriorTimeIntersections(calcIntersection, evalState);
                            if (logger.isDebugEnabled()) {
                            	logger.debug("Locking prior time periods for Intersection: " + calcIntersection);
                            	logger.debug(Arrays.toString(priorLocks.toArray(new Intersection[0])));
                            }
                            evalState.getCurrentLockedCells().addAll(priorLocks);
                        }
                        

                        if ( // override locks set or not locked to begin with and not already specified as having a formula
                                (evalState.getRule().getEvalLockedIntersections() || !evalState.getCurrentLockedCells().contains(calcIntersection))
                                && !cellsToCalc.containsKey(calcIntersection)
                            ) {
							cellsToCalc.put(calcIntersection, leadingRule.getFormula());
						}
					}
//				}		
			}
		}
		//now we must consider changes in other locations depending on the rule we're processing
		else {
			// figure out which time slice to examine for changes
			// a little custom for the current next previous stuff...should be encapsulated better

			// FIXME This will need to work with default parameters like the function on the right hand
            // side of the equation
			
			PafDimMember offsetTimeMember = null;  
			
			if (measFunc.getOpCode().equalsIgnoreCase("@NEXT")) {       		
				offsetTimeMember = evalState.getTimeSubTree().getPrevSibling(evalState.getCurrentTimeMember(), false);
			}
			else if  (measFunc.getOpCode().equalsIgnoreCase("@PREV")){
				offsetTimeMember = evalState.getTimeSubTree().getNextSibling(evalState.getCurrentTimeMember(), false);        		
			}
            else {
                throw new PafException("Illegal function used on left side of formula expression. Only Next() and Prev() operations are allowed. [" + evalState.getRule().toString() + "]", PafErrSeverity.Error);
            }
			if (offsetTimeMember != null) {
				if (evalState.getChangedCellsByTime().get(offsetTimeMember.getKey()) != null)
					chngCells.addAll(evalState.getChangedCellsByTime().get(offsetTimeMember.getKey()));
			} 
			
			
//			chngCells.addAll(measFunc.getDirtyIntersections(evalState));
			
			for (Intersection is : chngCells) {
				// does this intersection change force the current rule to evaluate?
				// 1st criteria, it has to be a component of this rule.
                if ( EvalUtil.changeTriggersFormula( is, evalState.getRule(), evalState) ) {
					// it will if it is the highest priority rule within this group that can execute
					// this is true if the left hand term for every other rule above this rule is
					// locked.
					leadingRule = evalState.getRule();
					calcIntersection = EvalUtil.translocateIntersection(is, measFunc, evalState);
					// emergency exit, not sure I need this anymore
					// TODO Make time evaluation boundary check more generic
					if ((calcIntersection != null) && (evalState.getClientState().getUowTrees().getTree(timeDim).hasMember(calcIntersection.getCoordinate(timeDim)) == true)) {
						calcIntersection.setCoordinate(measureDim, measFunc.getMeasureName());                        
                        if ( // override locks set or not locked to begin with and not already specified as having a formula
                                (evalState.getRule().getEvalLockedIntersections() || !evalState.getCurrentLockedCells().contains(calcIntersection))
                                && !cellsToCalc.containsKey(calcIntersection)
                            ) {
							cellsToCalc.put(calcIntersection, leadingRule.getFormula());
						}
					}		
				}
			}    		
		}
		
        if (logger.isDebugEnabled())
        	logger.debug(LogUtil.timedStep("Found relevant changed cells out of " + evalState.getCurrentChangedCells().size() + " cells", stepTime));          			          
		
		stepTime = System.currentTimeMillis();

		for (Intersection is : cellsToCalc.keySet()) {
			if (measFunc == null) {
				EvalUtil.evalFormula(cellsToCalc.get(is), measureDim, is, dataCache, evalState);
			}
			else {
				Formula f = cellsToCalc.get(is);
                      
				Intersection srcIs = EvalUtil.inverseTranslocateIntersection(is, measFunc, evalState);
				srcIs.setCoordinate(measureDim, f.getExpression().trim());
                EvalUtil.evalFormula(cellsToCalc.get(is), measureDim, srcIs, is, dataCache, evalState);				
			}

			newChngCells.add(is);
		}
		
        if (logger.isDebugEnabled())
        	logger.debug(LogUtil.timedStep("Calculating " + newChngCells.size() + " newly changed cells", stepTime));
		
		
		if (newChngCells.size() > 0) {
			
			// any cell that is changed from formula evaluation is a potential target for allocation
			// Normally evaluation results are not locked or allocated to preserve shape
			// However this can be overriden by a rule flag
			if (evalState.getRule().isLockSystemEvaluationResult()) {
				evalState.getCurrentLockedCells().addAll(newChngCells);
				evalState.addAllAllocations(newChngCells);
			}
	
			evalState.addAllChangedCells(newChngCells);
			evalState.setStateChanged(true);
		}
    
		if (logger.isDebugEnabled())
        	logger.debug(LogUtil.timedStep("Evaluate measures step complete", startTime));

	}

    private Set<Intersection> calculatePriorTimeIntersections(Intersection calcIntersection, EvalState evalState) {
        Set<Intersection> locks = new HashSet<Intersection>();
        
        // setup some local variables
        PafDimTree timeTree = evalState.getTimeSubTree();
        String timeDim = evalState.getAppDef().getMdbDef().getTimeDim();
        String isTime = calcIntersection.getCoordinate(timeDim);
        
        // dump out of no previous sibling
        PafDimMember prevSibling = timeTree.getPrevSibling(timeTree.getMember(isTime)); 
        if (prevSibling == null) return locks;
        
        
        // get cumulative level 0 members leading up to and including the sibling
        List<PafDimMember> prevMembers = timeTree.getLPeers(isTime);
        
        // add to list holding all other dimensions constant
        Intersection isCopy;
        for (PafDimMember m : prevMembers) {
            isCopy = calcIntersection.clone();
            isCopy.setCoordinate(timeDim, m.getKey());
            locks.addAll(EvalUtil.buildFloorIntersections(isCopy, evalState));
        }
                
        return locks;
    }
    
     
 
    
}
