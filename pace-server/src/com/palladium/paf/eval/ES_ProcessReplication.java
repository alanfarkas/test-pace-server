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
package com.palladium.paf.eval;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;

import com.pace.base.PafException;
import com.pace.base.app.*;
import com.pace.base.data.Intersection;
import com.pace.base.mdb.PafDataCache;
import com.pace.base.rules.Formula;
import com.pace.base.state.EvalState;

/**
 *
 * @version	x.xx
 * @author kmoos
 *
 */
public class ES_ProcessReplication implements IEvalStep {
    @SuppressWarnings("unused")
	private static Logger logger = Logger.getLogger(ES_ProcessReplication.class);
    
	public enum ReplicationType { ReplicateAll, ReplicateExisting };
	
    /* (non-Javadoc)
     * @see com.pace.base.eval.IEvalStep#performEvaluation(com.pace.base.state.EvalState)
     */
    public void performEvaluation(EvalState evalState) throws PafException {
    	
    	PafDataCache dataCache = evalState.getDataCache();
    	logger.info("Protected cell intersections: " + evalState.getCurrentProtectedCells().size());
    	
    	//the replicate all cells
    	if(evalState != null && evalState.getSliceState() != null){
	    	Intersection[] replicateAll = evalState.getSliceState().getReplicateAllCells();
	    	if(replicateAll != null){
	    		this.replicateCells(evalState, dataCache, replicateAll, ReplicationType.ReplicateAll);
	    	}
    	}
    	
    	//the replicate existing cells
    	if(evalState != null && evalState.getSliceState() != null){
	    	Intersection[] replicateExis = evalState.getSliceState().getReplicateExistingCells();
	    	if(replicateExis != null){
	    		this.replicateCells(evalState, dataCache, replicateExis, ReplicationType.ReplicateExisting);
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

    	String timeDim = evalState.getTimeDim();

    	// Get the list of locked periods on the view
    	Set<String> lockedPeriods = evalState.getClientState().getLockedPeriods();
    	if (lockedPeriods == null) {
    		lockedPeriods = new HashSet<String>(0);  
    	}

    	// Take each user replication and push down to the floor of the uow.
    	for(Intersection ix : replicatedIx){
    		//get the list of floor inter. for the intersection to be replicated.
    		List<Intersection> flrIx = EvalUtil.buildFloorIntersections(ix, evalState);
    		
    		double replicatedValue = 0;
    		boolean isVarVer = false;
    		
    		//get the value of the the intersection to be replicated - from the DC, or the eval state
    		//if the intersection is a variance version.
    		if(evalState != null && evalState.getVarianceReplicationValues() != null && evalState.getVarianceReplicationValues().containsKey(ix)){
    			isVarVer = true;
    			replicatedValue = evalState.getVarianceReplicationValues().get(ix);
    		}else{
    			replicatedValue = dataCache.getCellValue(ix.getCoordinates());
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
	    			if(!evalState.getCurrentChangedCells().contains(i) &&
	    					!evalState.getCurrentLockedCells().contains(i) &&
	    					!isIntersectionUnderProtection(evalState, i) &&
	    					!lockedPeriods.contains(i.getCoordinate(timeDim))){
	    				
	    				boolean cellChanged = true;
	    				Intersection tempIx = null;
	    				
		    			switch (replicationType) {
			    			case ReplicateAll:
			    				//update no matter what.
			    				if(isVarVer){
			    					//convert the variance version to a base version and update the value.
			    					tempIx = convertChange(i, evalState, dataCache, replicatedValue);
			    				}else{
			    					//just update the value.
			    					dataCache.setCellValue(i.getCoordinates(), replicatedValue);
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
				    				if (dataCache.getCellValue(i.getCoordinates()) != 0){
				    					dataCache.setCellValue(i.getCoordinates(), replicatedValue);
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
        VersionFormula versFormula = (VersionFormula) vd.getVersionFormula();
       
		// get cell value of corresponding comparison version intersection
		Intersection tempIs = is.clone();
		tempIs.setCoordinate(versDim, versFormula.getCompareVersion());
		double compareValue = dataCache.getCellValue(tempIs.getCoordinates());

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
     * gets the value for a base varaiance version intersection.
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
        VersionFormula versFormula = (VersionFormula) vd.getVersionFormula();
       
		// get cell value of corresponding comparison version intersection
		Intersection tempIs = is.clone();
		tempIs.setCoordinate(versDim, versFormula.getBaseVersion());

		return dataCache.getCellValue(tempIs.getCoordinates());
		
    }
    
}
