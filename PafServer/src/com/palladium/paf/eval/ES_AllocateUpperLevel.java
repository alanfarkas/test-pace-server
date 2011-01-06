/*
 *	File: @(#)ES_AllocateUpperLevel.java 	Package: com.palladium.paf.eval 	Project: PafServer
 *	Created: Sep 6, 2005  		By: JWatkins
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

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;

import com.palladium.paf.PafException;
import com.palladium.paf.SortOrder;
import com.palladium.paf.app.MeasureType;
import com.palladium.paf.app.VersionType;
import com.palladium.paf.data.Intersection;
import com.palladium.paf.mdb.PafDataCache;
import com.palladium.paf.mdb.PafDimMember;
import com.palladium.paf.mdb.PafDimTree;
import com.palladium.paf.state.EvalState;
import com.palladium.utility.LogUtil;

/**
 * Performs one step in an evaluation strategy.
 * Responsible for allocating changes down hierarchical
 * dimensions
 *
 * @version	x.xx
 * @author JWatkins
 *
 */
public class ES_AllocateUpperLevel extends ES_AllocateBase implements IEvalStep {
    
    private static Logger logger = Logger.getLogger(ES_AllocateUpperLevel.class);

    
    public void performEvaluation(EvalState evalState) throws PafException {
        long startTime = System.currentTimeMillis();
        long stepTime;
        PafDataCache dataCache = evalState.getDataCache();
        String timeDim = evalState.getTimeDim();
       
        // don't do non-aggregate or recalc measures
        if ( evalState.getMeasureType() == MeasureType.Recalc 
        		|| evalState.getMeasureType() == MeasureType.NonAggregate) {
        	return;
        }

        HashSet<Intersection> allocIntersections = new HashSet<Intersection>( evalState.getLoadFactor() * 10 );
        HashSet<Intersection> skipIS = new HashSet<Intersection>();
        unlockIntersections.clear();
        
        allocIntersections.addAll(evalState.getAllocationsByMsr(evalState.getMeasureName()));
        // if in time slice mode, 1st filter down to only allocations in the current time slice

        // special tag to sync all time balance first changes changes. Any change that would allocate
        // TBFirst fashion into week one need to allocate here also. perform no other allocations
        if ( evalState.getRule().isInitialTBFirstAllocation() ) {
        	// only perform work during 1st time period
        	if ( evalState.getCurrentTimeSlice().equals(evalState.getFirstTimeSlice())) {

	            // calculate ancenstor list of 1st period
	            PafDimTree timeTree = evalState.getTimeSubTree();
	            List<PafDimMember> timeAncestors = timeTree.getAncestors(evalState.getCurrentTimeSlice());
	            
	            // convert into name strings
	            List<String> ancNames = new ArrayList<String>();
	            for (PafDimMember m : timeAncestors) ancNames.add(m.getKey());
	            
	            // add 1st time period to the list
	            ancNames.add(evalState.getFirstTimeSlice());
	            
	            // now find any changes for the current measure involving any of these time periods
	            // Assert: only 1 change will exist that satisfies all these conditions
	            Intersection chngedTBFirst = null;
	            for (Intersection is : allocIntersections) {
	                if ( ancNames.contains(is.getCoordinate(timeDim))) {
	                    chngedTBFirst = is;
	                }
	            }
	            if (chngedTBFirst != null) {
	            	// set all intersections to the changed intersections value
	            	
	            	// get value
	            	double chngVal = dataCache.getCellValue( chngedTBFirst.getCoordinates() );
	            	
	            	// remove change from list
	            	ancNames.remove(chngedTBFirst.getCoordinate(timeDim));
	            	
	            	// for each remaining timeperiod update the data value and put in changed cell stack
	            	for (String name : ancNames) {
		            	Intersection tmp = chngedTBFirst.clone();	            		
	            		tmp.setCoordinate(timeDim, name);
	            		dataCache.setCellValue(tmp.getCoordinates(), chngVal);
	            		evalState.addChangedCell(tmp);
	            	}
	            }
        	}
            // our work here is done
//            return;
        }
        
        else if ( evalState.isTimeSliceMode() ) {
            for (Intersection is : allocIntersections) {
                if ( !is.getCoordinate(timeDim).equalsIgnoreCase(evalState.getCurrentTimeSlice())) skipIS.add(is);
            }
        }

        // opt out if flag set for this rule
        if ( evalState.getRule().isSkipAllocation() ) return;        
        
        
        // remove all the intersections calculated in the previous steps
        allocIntersections.removeAll(skipIS);

        // if nothing left to allocate skip out
        if (allocIntersections.size() == 0) {
//            if (logger.isDebugEnabled()) logger.debug("No changes to allocate");
            return;
        }
        
        
        String[] axisSeq = evalState.getAxisPriority();
        Intersection[] allocCells;

        stepTime = System.currentTimeMillis();
        allocCells = EvalUtil.sortIntersectionsByAxis(allocIntersections.toArray(new Intersection[0]), 
        		evalState.getClientState().getMemberIndexLists(),axisSeq, SortOrder.Ascending);            
//        if (logger.isDebugEnabled()) logger.debug(LogUtil.timedStep("Sorting intersections in axis sequence", stepTime));

        stepTime = System.currentTimeMillis();
        for (Intersection intersection : allocCells) {
        	dataCache = allocateChange(intersection, evalState, dataCache);
        }

        // unlock any allocations at end of step if specified
        if (!evalState.getRule().isLockAllocation())
        	evalState.getCurrentLockedCells().removeAll(unlockIntersections);         

        logEvalDetail(this, evalState, dataCache);
        
//        if (logger.isDebugEnabled()) {
//        	logger.debug(LogUtil.timedStep("Allocating " + allocCells.length + " intersections", stepTime));   
//        	logger.debug(LogUtil.timedStep("Allocation step", startTime));
//        }

    }

    /**
     *  Method_description_goes_here
     *
     * @param intersection
     * @param evalState 
     * @param dataCache 
     * @param tb 
     * 
     * @return PafUowCache
     * @throws PafException 
     */
    public PafDataCache allocateChange(Intersection intersection, EvalState evalState, PafDataCache dataCache) throws PafException {

    	double allocTotal = dataCache.getCellValue(intersection.getCoordinates());
//  	if (logger.isDebugEnabled()) logger.debug("Allocating change for :" + intersection.toString() + " = " + allocTotal);

    	// useful values
    	String timeDim = evalState.getAppDef().getMdbDef().getTimeDim();
        String currentYear = evalState.getAppDef().getCurrentYear(); 
        String yearDim = evalState.getAppDef().getMdbDef().getYearDim();
    	
    	long stepTime = System.currentTimeMillis();

    	// initial check, don't allocate any intersection that is "elapsed" during forward plannable sessions
        // if current plan is forward plannable, also don't allow
        // allocation into any intersections containing protected time periods
        Set lockedTimePeriods = null;

        if (evalState.getPlanVersion().getType() == VersionType.ForwardPlannable) {
            lockedTimePeriods = evalState.getClientState().getLockedPeriods();
        }
        if (lockedTimePeriods == null)
            lockedTimePeriods = new HashSet(0);  
        
        // dump out if current intersection is in an elapsed period
        if (lockedTimePeriods.contains(intersection.getCoordinate(timeDim))) return dataCache;
    	
        
    	List<Intersection> targetList = EvalUtil.buildFloorIntersections(intersection, evalState);
    	if (targetList.size() == 0) return dataCache;
    	if (targetList.size() == 1 && targetList.get(0).equals(intersection)) {
    		return dataCache;
    	}

    	Set<Intersection> targets = new HashSet<Intersection>(targetList.size() * 2);
        targets.addAll(targetList);
        
        // total locked cells under intersection
        stepTime = System.currentTimeMillis();    
        

        
        double lockedTotal = 0;
        Set<Intersection> lockedTargets = new HashSet<Intersection>(evalState.getLoadFactor());
        
        // add up all locked cell values
        for (Intersection target : targets) {
            if (evalState.getCurrentLockedCells().contains(target) || 
                    (lockedTimePeriods.contains(target.getCoordinate(timeDim)) && 
                            target.getCoordinate(yearDim).equals(currentYear))  ) {
                lockedTotal += dataCache.getCellValue(target.getCoordinates());
                lockedTargets.add(target);              
            }
        }

        double allocAvailable = 0;
        
        // normal routine, remove locked intersections from available allocation targets
        if (targets.size() != lockedTargets.size() || evalState.isRoundingResourcePass() ) {
            targets.removeAll(lockedTargets);
            allocAvailable = allocTotal - lockedTotal;                    
        }
        else { // all targets locked so special case
        	// if some of the locks are original user changes
            ArrayList<Intersection> userLockedTargets = new ArrayList<Intersection>(evalState.getLoadFactor());
            ArrayList<Intersection> elapsedTargets = new ArrayList<Intersection>(evalState.getLoadFactor());
            double userLockedTotal = 0;
            double elapsedTotal = 0;
            for (Intersection target : targets) {
            
//              if (evalState.getOrigLockedCells().contains(target) ||
//            		  (lockedTimePeriods.contains(target.getCoordinate(timeDim)) && 
//                        target.getCoordinate(yearDim).equals(currentYear))
//            		  
//              ) { 
//            	userLockedTotal += dataCache.getCellValue(target.getCoordinates());
//                userLockedTargets.add(target);              
//            }            	
//            	

                // total elapsed period locks and add them to a specific collection
                if (lockedTimePeriods.contains(target.getCoordinate(timeDim)) && 
                                target.getCoordinate(yearDim).equals(currentYear) ) {
                	elapsedTotal += dataCache.getCellValue(target.getCoordinates());
                	elapsedTargets.add(target);              
                }  
            	
            	// total user locks and add them to a specific collection. These are user locks "only"
            	// and don't include elapsed period locks
                if (
                		(evalState.getOrigLockedCells().contains(target) || evalState.getOrigChangedCells().contains(target)) // user change true
                		&&
                		(!elapsedTargets.contains(target)) // not already counted as an elapsed period
                ) {
                	userLockedTotal += dataCache.getCellValue(target.getCoordinates());
                    userLockedTargets.add(target);              
                }
            }
            
            // always remove elapsed periods from the allocation
            targets.removeAll(elapsedTargets);
            allocAvailable = allocTotal - elapsedTotal;
            
            
            if (targets.size() != userLockedTargets.size()) {
            	// some targets are user locks so remove them and allocate into rest
            	targets.removeAll(userLockedTargets);
                allocAvailable -= userLockedTotal; 
            }
//            else { // all potential targets are user locks, so allocate evenly into them
//            	allocAvailable = allocAvailable;
//            }
        }
        
        // if no quantity to allocate, dump out.
//        if (allocAvailable == 0) return dataCache;
            
            
        double origTargetSum = 0;        
        for (Intersection target : targets ) {
            origTargetSum += dataCache.getCellValue(target.getCoordinates());
        }
        
        // begin timing allocation step
        stepTime = System.currentTimeMillis();
//		logger.info("Allocating intersection: " + intersection);
//		logger.info("Allocating into " + targets.size() + " targets" );          
        
    	if (origTargetSum == 0 && 
    			evalState.getRule().getBaseAllocateMeasure() != null
    					&& !evalState.getRule().getBaseAllocateMeasure().equals("")) {
			// in this case, perform the exact same logic as the normal allocation step, however, use the "shape"
			// from base measure to determine the allocation percentages.
			allocateToTargets(targets, evalState.getRule().getBaseAllocateMeasure(), allocAvailable, dataCache, evalState);    				
    		}
    	else {		
			// normal allocation to open targets
			allocateToTargets(targets, allocAvailable, origTargetSum, dataCache, evalState);	
    		}


//     logger.info(LogUtil.timedStep("Allocation completed ", stepTime));                
  
        return dataCache;
    } 
    
}
