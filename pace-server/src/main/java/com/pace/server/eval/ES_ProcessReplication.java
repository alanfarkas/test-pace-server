/*
 *	File: @(#)ES_ProcessReplication.java 	Package: com.pace.base.eval 	Project: PafServer
 *	Created: Jan 16, 2007  		By: jwatkins
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
package com.pace.server.eval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

import com.pace.base.PafErrSeverity;
import com.pace.base.PafException;
import com.pace.base.SortOrder;
import com.pace.base.app.MeasureDef;
import com.pace.base.app.VarRptgFlag;
import com.pace.base.app.VersionDef;
import com.pace.base.app.VersionFormula;
import com.pace.base.data.EvalUtil;
import com.pace.base.data.Intersection;
import com.pace.base.mdb.PafDataCache;
import com.pace.base.rules.Formula;
import com.pace.base.rules.RuleSet;
import com.pace.base.state.EvalState;
import com.pace.base.state.SliceState;
import com.pace.base.utility.StringUtils;

/**
 *
 * @version	x.xx
 * @author kmoos
 *
 */
public class ES_ProcessReplication implements IEvalStep {
    private static Logger logger = Logger.getLogger(ES_ProcessReplication.class);
    
	public enum ReplicationType { ReplicateAll, ReplicateExisting, LiftAll, LiftExisting, RSLiftAll, RSLiftExisting };
	
    /* (non-Javadoc)
     * @see com.pace.base.eval.IEvalStep#performEvaluation(com.pace.base.state.EvalState)
     */
    public void performEvaluation(EvalState evalState) throws PafException {
    	
    	PafDataCache dataCache = evalState.getDataCache();
    	logger.info("Protected cell intersections: " + evalState.getCurrentProtectedCells().size());
    	
    	if(evalState != null && evalState.getSliceState() != null){
    		
        	//the replicate all cells
	    	Intersection[] replicateAll = evalState.getSliceState().getReplicateAllCells();
	    	if(replicateAll != null){
	    		this.replicateCells(evalState, dataCache, replicateAll, ReplicationType.ReplicateAll);
	    	}

	    	//the replicate existing cells
	    	Intersection[] replicateExis = evalState.getSliceState().getReplicateExistingCells();
	    	if(replicateExis != null){
	    		this.replicateCells(evalState, dataCache, replicateExis, ReplicationType.ReplicateExisting);
	    	}

	    	//the lift all cells (TTN-1793)
	    	Intersection[] liftAll = evalState.getSliceState().getLiftAllCells();
	    	if(liftAll != null){
	    		this.replicateCells(evalState, dataCache, liftAll, ReplicationType.LiftAll);
	    	}

	    	//the lift existing cells (TTN-1793)
	    	Intersection[] liftExis = evalState.getSliceState().getLiftExistingCells();
	    	if(liftExis != null){
	    		this.replicateCells(evalState, dataCache, liftExis, ReplicationType.LiftExisting);
	    	}

	    	//the rule set lift all cells (TTN-1793)
	    	Intersection[] rsLiftAll = evalState.getSliceState().getRuleSetLiftAllCells();
	    	if(rsLiftAll != null){
	    		this.replicateCells(evalState, dataCache, rsLiftAll, ReplicationType.RSLiftAll);
	    	}

	    	//the rule set lift existing cells (TTN-1793)
	    	Intersection[] rsLiftExis = evalState.getSliceState().getRuleSetLiftExistingCells();
	    	if(rsLiftExis != null){
	    		this.replicateCells(evalState, dataCache, rsLiftExis, ReplicationType.RSLiftExisting);
	    	}
    	}
    	
    }

    /**
     * 
     * @param evalState Evaluation sequence.
     * @param dataCache PafUowCache
     * @param replicatedIx All the intersections to replicate on the view.
     * @param replicationType Type of replication to be performed.
     * @throws PafException
     */
    private void replicateCells(EvalState evalState, PafDataCache dataCache, 
    		Intersection[] replicatedIx, ReplicationType replicationType) throws PafException{

    	String versionDim = evalState.getVersionDim();
    	Set<String> varianceVersions = new HashSet<String>(dataCache.getVarianceVersions());

    	
		// Sort replicated cells so that lower level intersections are handled first. 
		// This is done to allow lower level replicated intersections to be created.
    	// Else their targets will get locked out by upper level intersections. 
		Intersection[] sortedReplicatedIx =  EvalUtil.sortIntersectionsByAxis(replicatedIx, 
				evalState.getClientState().getMemberIndexLists(), evalState.getAxisSortPriority(), 
				SortOrder.Ascending);            


    	// Take each user replication and push down to the floor of the uow.
    	for(Intersection ix : sortedReplicatedIx){
 
    		//get the list of floor intersections for the intersection to be replicated.
    		List<Intersection> flrIx = EvalUtil.buildFloorIntersections(ix, evalState);
    		
    		double replicatedValue = 0;
    		String baseVersion = null;
    		

    		// Variance version replication preparation
    		boolean isVarVer = false;
    		String ixVersion = ix.getCoordinate(versionDim);
    		if(varianceVersions.contains(ixVersion)){
    			isVarVer = true;
    			VersionDef versionDef = dataCache.getVersionDef(ixVersion);
    			baseVersion = versionDef.getVersionFormula().getBaseVersion();
    		}

     		//get the value of the the intersection to be replicated
    		replicatedValue = dataCache.getCellValue(ix);
    		
       		// Lift allocation pre-processing. The lift amount for a lift allocation defined in a rule set
    		// is calculated by subtracting the original value of the allocated cell from the current value.
    		// For a lift allocation initiated from the client, the lift amount is just the value entered.
    		// (TTN-1793).
    		double origCellValue = 0, liftAmount = 0;
    		if (replicationType == ReplicationType.RSLiftAll || replicationType == ReplicationType.RSLiftExisting) {
    			origCellValue = dataCache.getSnapshotValue(ix);
    			liftAmount = replicatedValue - origCellValue;
    		} else if (replicationType == ReplicationType.LiftAll || replicationType == ReplicationType.LiftExisting) {
    			liftAmount = replicatedValue;
    		}
    		
    		if(flrIx != null){
    			//add all of the floor intersections to the changed cell stack.
	    		for(Intersection i : flrIx){
	    			//see if the intersection was a user change(is so, don't 
	    			//replicate over it) and make sure it's not under protection.
	    			//
	    			//also filter out level 0 elapsed period intersections, as they 
	    			//are not locked if any upper level member appears in the
	    			//page header (TTN-1259).
	    			//
	    			//if variance version replication, need to convert target
	    			//intersection to its corresponding base intersection for 
	    			//comparison to changed and locked cells collections. (AF-8/24/11)
	    			//TODO Clean up variance version logic and overlap with convertChange method
	  				Intersection tempIx = null;
	    			if (isVarVer) {
	    				tempIx = i.clone();
	    				tempIx.setCoordinate(versionDim, baseVersion);
	    			} else {
	    				tempIx = i;
	    			}
 	    			if(!evalState.getCurrentChangedCells().contains(tempIx) &&
	    					!evalState.getCurrentLockedCells().contains(tempIx) &&
	    					!isIntersectionUnderProtection(evalState, tempIx) &&
	    					!EvalUtil.isElapsedIs(tempIx, evalState)){		//TTN-1595
	    				
	    				boolean cellChanged = true;
	    				
		    			switch (replicationType) {
			    			case ReplicateAll:
			    				//update no matter what.
			    				if(isVarVer){
			    					//convert the variance version to a base version and update the value.
			    					tempIx = convertChange(i, evalState, dataCache, replicatedValue);
			    				}else{
			    					//just update the value.
			    					dataCache.setCellValue(i, replicatedValue);
			    					tempIx = i;
			    				}
			    				break;
			    			case ReplicateExisting:
			    				//update only if != to zero.
			    				if(isVarVer){
			    					if (getBaseVersionValue(i, evalState, dataCache) != 0){
			    						//convert the variance version to a base version and update the value.
			    						tempIx = convertChange(i, evalState, dataCache, replicatedValue);
				    				} else {
				    					cellChanged = false;
				    				}
			    				}else{
				    				if (dataCache.getCellValue(i) != 0){
				    					dataCache.setCellValue(i, replicatedValue);
				    				} else {
				    					cellChanged = false;
				    				}
				    				tempIx = i;
			    				}
			    				break;
			    			case LiftAll: case RSLiftAll:			// TTN-1793
			    				replicatedValue = dataCache.getSnapshotValue(i) + liftAmount;
			    				//update no matter what.
			    				if(isVarVer){
			    					//convert the variance version to a base version and update the value.
			    					tempIx = convertChange(i, evalState, dataCache, replicatedValue);
			    				}else{
			    					//just update the value.
			    					dataCache.setCellValue(i, replicatedValue);
			    					tempIx = i;
			    				}
			    				break;
			    			case LiftExisting: case RSLiftExisting:	// TTN-1793
			    				replicatedValue = dataCache.getSnapshotValue(i) + liftAmount;
			    				//update only if != to zero.
			    				if(isVarVer){
			    					if (getBaseVersionValue(i, evalState, dataCache) != 0){
			    						//convert the variance version to a base version and update the value.
			    						tempIx = convertChange(i, evalState, dataCache, replicatedValue);
				    				} else {
				    					cellChanged = false;
				    				}
			    				}else{
				    				if (dataCache.getCellValue(i) != 0){
				    					dataCache.setCellValue(i, replicatedValue);
				    				} else {
				    					cellChanged = false;
				    				}
				    				tempIx = i;
			    				}
			    				break;
		    			}
		    			//if the intersection changed then add it to the appropriate lists
		    			if(cellChanged){
		    				//add the intersection to the changed cell stack.
		    				evalState.addChangedCell(tempIx);
		    				//lock this intersection
		    				evalState.getCurrentLockedCells().add(tempIx);	
		    			}
	    			}
	    		}
    		}
    	}
    }

    /***
     * Checks the set of protected intersections passed from the client to see if an intersection exists in that set.
     * @param evalState Evaluation sequence.
     * @param ix The intersection to search for.
     * @return true if the intersection is in the set of protected intersections, false if not.
     * @throws PafException
     */
    private boolean isIntersectionUnderProtection(EvalState evalState, Intersection ix) throws PafException
    {
    	boolean ret = false;
    	
    	if(evalState != null && evalState.getCurrentProtectedCells() != null){
    		if(evalState.getCurrentProtectedCells().contains(ix)){
    			ret = true;
    		}
    	}
    	return ret;
    }
    
    /***
     * converts a variance version to a base version.
     * @param is the intersection to be converted
     * @param evalState Evaluation sequence.
     * @param dataCache PafUowCache
     * @return the new intersection
     * @throws PafException
     */
    private Intersection convertChange(Intersection is, EvalState evalState, PafDataCache dataCache, 
    		double valueToReplace) throws PafException {

    	String measDim = evalState.getClientState().getApp().getMdbDef().getMeasureDim();
        String versDim = evalState.getClientState().getApp().getMdbDef().getVersionDim();
		VarRptgFlag varRptgFlag = null;

        // the only thing that should change in this case is the version
        // so look up appropriate variance version
        VersionDef vd = evalState.getClientState().getApp().getVersionDef(is.getCoordinate(versDim));
        VersionFormula versFormula = vd.getVersionFormula();
       
		// get cell value of corresponding comparison version intersection
		Intersection tempIs = is.clone();
		tempIs.setCoordinate(versDim, versFormula.getCompareVersion());
		double compareValue = dataCache.getCellValue(tempIs);
		
		// Get the variance reporting flag for the measure being calculated
   		String measure = is.getCoordinate(measDim);
		try {
			MeasureDef measureDef = dataCache.getMeasureDef(measure);
			varRptgFlag = measureDef.getVarRptgFlag();
		} catch (RuntimeException e) {
			// No Measure Def found for selected measure - use default value of Revenue Reporting Flag
			varRptgFlag = VarRptgFlag.RevenueReporting;
		}

   		 //construct formula that will be used to back into the base version
		String formulaString = vd.getBaseFormulaString(varRptgFlag, compareValue);
		formulaString = formulaString.replace(vd.getName(), Double.toString(valueToReplace));
		
        //and create new intersection = to version base
        Intersection newIs = is.clone();
        newIs.setCoordinate(versDim, vd.getVersionFormula().getBaseVersion());
       
        Formula f = new Formula(formulaString);
        f.parse(evalState.getAppDef().getMeasureFunctionFactory());
        EvalUtil.evalFormula(f, versDim, newIs, dataCache, evalState);
        
        return newIs;
    }
    
    /***
     * gets the value for a base variance version intersection.
     * @param is the intersection of the variance version
     * @param evalState Evaluation sequence.
     * @param dataCache PafUowCache
     * @return the double value of the base version.
     * @throws PafException
     */
    private double getBaseVersionValue(Intersection is, EvalState evalState, PafDataCache dataCache) throws PafException {
        String versDim = evalState.getClientState().getApp().getMdbDef().getVersionDim();

        // the only thing that should change in this case is the version
        // so look up appropriate variance version
        VersionDef vd = evalState.getClientState().getApp().getVersionDef(is.getCoordinate(versDim));
        VersionFormula versFormula = vd.getVersionFormula();
       
		// get cell value of corresponding comparison version intersection
		Intersection tempIs = is.clone();
		tempIs.setCoordinate(versDim, versFormula.getBaseVersion());

		return dataCache.getCellValue(tempIs);
		
    }

	/**
	 *  Convert user changes that correspond to lift allocation measures to lift allocation
	 *  changes.
	 *  
	 * @param sliceState Slice state
	 * @param ruleSet Measure rule set
	 * @param dataCache Data cache
	 */
	public static void convertLiftAllocChanges(SliceState sliceState, RuleSet ruleSet, PafDataCache dataCache) {
		
        String[] liftAllMeasures = ruleSet.getLiftAllMeasureList(), liftExistMeasures = ruleSet.getLiftExistingMeasureList();

        
		// Intercept user changes that correspond to lift allocation measures and take
        // those user changes and move them into the appropriate lift collections.
        if ( (liftAllMeasures != null && liftAllMeasures.length > 0)
        		|| (liftExistMeasures != null && liftExistMeasures.length > 0)) {
        	
        	// Initialization
        	Intersection[] changedCells = sliceState.getChangedCells();
        	Set<Intersection> changedCellSet = new HashSet<Intersection>(Arrays.asList(changedCells));
        	Set<Intersection> lockedCellSet = new HashSet<Intersection>(Arrays.asList(sliceState.getLockedCells()));
    		List<Intersection> rsLiftAllCellList = new ArrayList<Intersection>(), rsLiftExistCellList = new ArrayList<Intersection>();
            final int measureAxis = dataCache.getMeasureAxis();

    		// Convert changed cells array to map for quick lookup of intersection by measure
         	Map<String, Set<Intersection>> changedCellsByMsr = new HashMap<String, Set<Intersection>>();
        	for (Intersection changedCell : changedCells) {
        		String measure = changedCell.getCoordinates()[measureAxis];
        		if (!changedCellsByMsr.containsKey(measure)) {
        			changedCellsByMsr.put(measure, new HashSet<Intersection>());
        		}
        		changedCellsByMsr.get(measure).add(changedCell);
        	}
        	
        	// Intercept lift allocation changes
        	interceptLiftAllocationChanges(ruleSet.getLiftAllMeasureList(), rsLiftAllCellList, changedCellsByMsr, changedCellSet, lockedCellSet);
			interceptLiftAllocationChanges(ruleSet.getLiftExistingMeasureList(), rsLiftExistCellList, changedCellsByMsr, changedCellSet, lockedCellSet);
			
			// Apply updates to cell collections
			sliceState.setChangedCells(changedCellSet.toArray(new Intersection[0]));
			sliceState.setLockedCells(lockedCellSet.toArray(new Intersection[0]));
			sliceState.setRuleSetLiftAllCells(rsLiftAllCellList.toArray(new Intersection[0]));
			sliceState.setRuleSetLiftExistingCells(rsLiftExistCellList.toArray(new Intersection[0]));
		}       
    }
	
		
    /**
     * Intercept any user changes that belong to any lift allocation
     * measures.
     * 
     * @param liftMeasures Lift allocation measures
     * @param liftCellList Lift cell list (to be created)
     * @param changedCellsByMsr User changed cells by measure
     * @param changedCellSet All user changed cells
     * @param lockedCellSet Set of user locked cells
     */
    private static void interceptLiftAllocationChanges(String[] liftMeasures, List<Intersection> liftCellList, Map<String, Set<Intersection>> changedCellsByMsr, Set<Intersection> changedCellSet, Set<Intersection> lockedCellSet) {
    	
    	// Nothing to do if no lift allocation measures defined in rule set
    	if (liftMeasures == null || liftMeasures.length == 0) return;
    	
    	// Convert all user changes for any lift measures into lift allocation changes
    	for (String liftMeasure : liftMeasures) {
    		
    		// Look for any intersections for lift measure
    		Set<Intersection> liftCells = changedCellsByMsr.get(liftMeasure);
    		if (liftCells != null && !liftCells.isEmpty()) {
    			
    			// Add these lift cells into the lift cells collection
    			liftCellList.addAll(liftCells);
    			
    			// Remove these lift cells from the changed and locked cells collections
    			changedCellsByMsr.remove(liftMeasure);
    			changedCellSet.removeAll(liftCells);
    			lockedCellSet.removeAll(liftCells);
    		}
    	}
    			
	}
 
}
