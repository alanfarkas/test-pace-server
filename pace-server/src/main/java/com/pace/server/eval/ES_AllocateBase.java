/*
 *	File: @(#)ES_AllocateUpperBase.java 	Package: com.pace.base.eval 	Project: PafServer
 *	Created: Sep 6, 2005  					By: JWatkins
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

import java.util.*;

import org.apache.log4j.Logger;

import com.pace.base.PafException;
import com.pace.base.data.EvalUtil;
import com.pace.base.data.Intersection;
import com.pace.base.mdb.PafDataCache;
import com.pace.base.state.EvalState;
import com.pace.server.PafDataService;

/**
 * Performs one step in an evaluation strategy.
 * Responsible for allocating changes down hierarchical
 * dimensions. This is a base class containing utility allocation
 * methods utilized by more complex extension classes.
 *
 * @version	x.xx
 * @author JWatkins
 *
 */
public abstract class ES_AllocateBase extends ES_EvalBase implements IEvalStep {
    
    @SuppressWarnings("unused")
	private static Logger logger = Logger.getLogger(ES_AllocateBase.class);
    protected PafDataService dataService = PafDataService.getInstance();
    // TODO Remove processedIntersections as used here. Currently serving two purposes:
    // Holding the result of allocations, which are by definition level 0 and potentially could
    // be removed from allocation, but aren't. Also holds changes allocated, but again no 
    // found value.
//    protected HashSet<Intersection> processedIntersections = new HashSet<Intersection>();
    protected Set<Intersection> unlockIntersections = new HashSet<Intersection>(50000);
    
    public abstract void performEvaluation(EvalState evalState) throws PafException; 
    
    
    protected void allocateToTargets(Set<Intersection> targets, double allocAvailable, double origTargetSum, PafDataCache dataCache, EvalState evalState) throws PafException {
        double origValue = 0;
        double allocValue = 0;
        int places = 0;
   
//        if (logger.isDebugEnabled()) logger.debug("Original total of unlocked allocation targets: " + origTargetSum);  
        
//        String targetMsr = "";
        long stepTime;
        
        stepTime = System.currentTimeMillis();
        
        for (Intersection target : targets ) {

            origValue = dataCache.getCellValue(target);
//            if (origValue == 0 && origTargetSum == 0) {
            if (origTargetSum == 0) {                
                allocValue = allocAvailable / targets.size();
            }
            else {
                allocValue = ((origValue / origTargetSum) * (allocAvailable));
            }
            
    		if (evalState.getAppDef().getAppSettings() != null && evalState.getAppDef().getAppSettings().isEnableRounding())
    		{
	            String currentMeasure = target.getCoordinate(evalState.getAppDef().getMdbDef().getMeasureDim());
	    		if (evalState.getRoundingRules().containsKey(currentMeasure)){
	    			places = evalState.getRoundingRules().get(currentMeasure).getDigits();
	    			allocValue = EvalUtil.Round(allocValue, places);
	    			evalState.getAllocatedLockedCells().add(target);
	    		}
    		}
            
            dataCache.setCellValue(target, allocValue);
            
//            if (logger.isDebugEnabled()) logger.debug("Allocating " + target.toString() + " new value: " + allocValue);
            
            // add cells to locks
           	evalState.getCurrentLockedCells().add(target);
            
            // add to changed cell list
			evalState.addChangedCell(target);
            
            
        }        
 
        // default is to lock the results of allocation, but can be overriden,
		// however unlocking can only occur at the end of the overall allocation pass
        if (!evalState.getRule().isLockAllocation())
        	unlockIntersections.addAll(targets);        
        
    }
    
    /**
     * Performs an allocation using the shape of another measure. The intersection for the corresponding "baseMeasure" is
     * used to calculate the weight of the normal pushed into the target.
     * 
     * @param targets
     * @param baseMeasure
     * @param allocAvailable
     * @param dataCache
     * @param evalState
     * @throws PafException
     */
    protected void allocateToTargets(Set<Intersection> targets, String baseMeasure, double allocAvailable, PafDataCache dataCache, EvalState evalState) throws PafException {
        double baseValue = 0;
        double allocValue = 0;
        double baseTargetSum = 0;
        int places = 0;
        
        String msrDim = evalState.getAppDef().getMdbDef().getMeasureDim();
        String targetMsr;
        
        // Save off original measure from 1st target
        if (targets.size() > 0)
        	targetMsr = targets.iterator().next().getCoordinate(msrDim);
        else //Just return if no targets, no work to do
        	return;
        

    	// Calculate the sum of the base measure intersections that will comprise
        // the allocation "shape". This requires the conversion of each target 
        // intersection into it's corresponding base measure intersection by
        // replacing the target measure coordinate with the base measure
        // coordinate.
        //
        // A better way would have been to just clone base intersections from the 
        // original target intersections. However, this would add a lot of overhead
        // to the process.
        //
    	// Each base intersection will be converted back to a target intersection 
        // in the next step, before each allocated value is written to the data
        // cache.
       for (Intersection baseIs : targets ) {
         	baseIs.setCoordinate(msrDim, baseMeasure);
            baseTargetSum += dataCache.getCellValue(baseIs);
        }
        
//      if (logger.isDebugEnabled()) logger.debug("Original total of unlocked base measure targets: " + baseTargetSum);  
        
       
        // Allocate into each target intersection, using the shape of the base measure.
        for (Intersection intersection : targets ) {

        	// At this point, the "target" intersection is really a base measure intersection,
        	// having been converted in the previous step (base measure intersection sum
        	// calculation). 
            baseValue = dataCache.getCellValue(intersection);
            if (baseTargetSum == 0) {
            	// If the base measure shape total is zero, then do an even spread across
            	// the target intersections.
                allocValue = allocAvailable / targets.size();
            }
            else {
            	// Else allocate a new value according to the shape of the base measure
                allocValue = ((baseValue / baseTargetSum) * (allocAvailable));
            }
            
            // Convert base measure intersection back into the original target 
            // intersection.
            intersection.setCoordinate(msrDim, targetMsr);

            // Round the allocated value, if rounding is enabled on the target measure.
            // Then add the target intersection to the allocated locked cells collection, 
            // to preserve the target intersection's value and protect it from 
            // subsequent allocations.
            if (evalState.getAppDef().getAppSettings() != null && evalState.getAppDef().getAppSettings().isEnableRounding())
    		{
	    		if (evalState.getRoundingRules().containsKey(targetMsr)){
	    			places = evalState.getRoundingRules().get(targetMsr).getDigits();
	    			allocValue = EvalUtil.Round(allocValue, places);
	    			evalState.getAllocatedLockedCells().add(intersection);
	    		}
    		}
            	
            // Write allocated amount (possibly rounded) out to the data cache.
            dataCache.setCellValue(intersection, allocValue);
            
//            if (logger.isDebugEnabled()) logger.debug("Allocating " + target.toString() + " new value: " + allocValue);
            
            // Add allocated intersection to locks
           	evalState.getCurrentLockedCells().add(intersection);
            
            // Add allocated intersection to changed cell list
			evalState.addChangedCell(intersection);
           
        }  
        
        // default is to lock the results of allocation, but can be overridden,
		// however unlocking can only occur at the end of the overall allocation pass
        if (!evalState.getRule().isLockAllocation())
        	unlockIntersections.addAll(targets);        
    	
    }
       
}
