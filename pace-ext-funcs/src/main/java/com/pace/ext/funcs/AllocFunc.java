package com.pace.ext.funcs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

import com.pace.base.PafErrSeverity;
import com.pace.base.PafException;
import com.pace.base.app.VersionType;
import com.pace.base.data.IPafDataCache;
import com.pace.base.data.Intersection;
import com.pace.base.data.IntersectionUtil;
import com.pace.base.funcs.AbstractFunction;
import com.pace.base.mdb.PafDataCache;
import com.pace.base.mdb.PafDimMember;
import com.pace.base.mdb.PafDimTree;
import com.pace.base.state.EvalState;
import com.pace.base.state.IPafEvalState;
import com.pace.base.data.EvalUtil;

/**
 * "Allocation" Custom Function - 
 * 
 * The calling signature of this function is '@ALLOC(msrToAllocate, [msrsToExclude*] )'.
 * This function allocates the initial measure into the hierarchical children of the measure
 * specified. A list of measures to be excluded can be optionally passed in.
 
 * @version	2.8.2.0
 * @author JWatkins
 *
 */

public class AllocFunc extends AbstractFunction {

   	private static int MEASURE_ARGS = 1, REQUIRED_ARGS = 1; //, MAX_ARGS = 4;
   	
  	private String msrToAlloc = null;
	
	private boolean hasRestrictedTargets;
	private List<String> targetMsrs;
	private List<Intersection> unlockIntersections;
	
	private static Logger logger = Logger.getLogger(AllocFunc.class);

    public double calculate(Intersection sourceIs, IPafDataCache dataCache, IPafEvalState evalState) throws PafException {


    	// convenience variables
      	String msrDim = dataCache.getMeasureDim(), timeDim = dataCache.getTimeDim();
       	PafDimTree msrTree = evalState.getDataCacheTrees().getTree(msrDim);

 	
    	// Validate function parameters
    	validateParms(evalState);
   	   	 	
    	// this function will allocate a specified measure into its hierarchical children
    	// if only a measure is specified the allocation occurs by default into it's children
    	// if additional parameters are passed then the allocation is limited to the included measures
    	
        // targets holds all intersections to allocate into.
    	// initialize it off the list of target measures and the evalstate collections
    	

        List<Intersection> allocTargets = new ArrayList<Intersection>();
        if (this.hasRestrictedTargets) {
        	for (String msr : this.targetMsrs) {
        		// for each msr in the list I need the equivalent intersection populated from the sourceIsx
				Intersection allocTarget = sourceIs.clone();
				allocTarget.setCoordinate(msrDim, msr);
				allocTargets.addAll(IntersectionUtil.buildFloorIntersections(allocTarget, evalState));  					
        	}
        }
        else {
        	// no specific measures so defaults to the children of the measures
        	for (PafDimMember msrMbr : msrTree.getChildren(sourceIs.getCoordinate(msrDim))) {
				Intersection allocTarget = sourceIs.clone();
				allocTarget.setCoordinate(msrDim, msrMbr.getKey());
				allocTargets.addAll(IntersectionUtil.buildFloorIntersections(allocTarget, evalState));         		
        	}
        }
        
        // allocateToTargets(allocTargets, )
    	


       	

        return dataCache.getCellValue(sourceIs);
    }
    

    /**
     *  Parse and validate function parameters 
     *
     * @param evalState Evaluation state object
     * @throws PafException
     */
    private void validateParms(IPafEvalState evalState) throws PafException {

    	int parmIndex = 0;
    	String errMsg = "Error in [" + this.getClass().getName() + "] - ";
    	String measureDim = evalState.getAppDef().getMdbDef().getMeasureDim();
    	
    	
     	// Check for existence of arguments
    	if (parms == null) {
    		errMsg += "[" + REQUIRED_ARGS + "] arguments are required, but none were provided.";
    		logger.error(errMsg);
    		throw new PafException(errMsg, PafErrSeverity.Error);
    	}
    	
    	// Check for the correct number of arguments
    	if (parms.length < REQUIRED_ARGS) {
    		errMsg += "[" + REQUIRED_ARGS + "] arguments are required, but [" + parms.length + "] were provided.";
    		logger.error(errMsg);
    		throw new PafException(errMsg, PafErrSeverity.Error);
    	}
   	
    	
    	// Check validity of all arguments for existence in measures dimension
    	PafDimTree measureTree = evalState.getDataCacheTrees().getTree(measureDim);
    	for (parmIndex = 0; parmIndex < parms.length; parmIndex++) {
    		String member = parms[parmIndex];
    		if (!measureTree.hasMember(member)){
     			errMsg += "[" + member + "] is not a valid member of the [" + measureDim + "] dimension.";
    			logger.error(errMsg);
    			throw new PafException(errMsg, PafErrSeverity.Error);
    		}
    	}
   	
    	// Get required arguments
    	msrToAlloc = this.measureName;

    	
    	// Check for optional parameters - if any other parameters 
    	// then they represent the targets rather than the default children
    	int index = 1;
    	if (parms.length > 1) {
    		hasRestrictedTargets = true;
    		while (index<=parms.length)
    			targetMsrs.add(parms[index++]);
    	}
		
	}


	/* (non-Javadoc)
	 * @see com.pace.base.funcs.AbstractFunction#getTriggerIntersections(com.pace.base.state.IPafEvalState)
	 */
	public Set<Intersection> getTriggerIntersections(IPafEvalState evalState) throws PafException {
		
		/*
		 * The trigger intersections for the @ALLOC function are:
		 *
		 * 1. Any changed intersection containing the alloc measure 
		 * 
		 */
		
		Set<Intersection> triggerIntersections = null; // = new HashSet<Intersection>(0);
		Map<String, Set<Intersection>> changedCellsByMsr = evalState.getChangedCellsByMsr();
    	
    	// Parse function parameters
     	validateParms(evalState);
    	   					
		// Add in alloc measure
     	Set<Intersection> allocIsxs = changedCellsByMsr.get(msrToAlloc);
     	if (allocIsxs == null) {
     		triggerIntersections = new HashSet<Intersection>(0);
     	}
     	else {
       		triggerIntersections = new HashSet<Intersection>( 2 * allocIsxs.size() );
     		triggerIntersections.addAll(allocIsxs);
     	}

		return triggerIntersections;
	}
	
	/* (non-Javadoc)
	 * @see com.pace.base.funcs.AbstractFunction#changeTriggersFormula(com.pace.base.data.Intersection, com.pace.base.state.IPafEvalState)
	 */
	public boolean changeTriggersFormula(Intersection is, IPafEvalState evalState) {
		
		/*
		 * A change to the allocation measure triggers this formula
		 *
		 */

    	String measureDim = evalState.getAppDef().getMdbDef().getMeasureDim();
		String measure = is.getCoordinate(measureDim);	
		if (measure.equals(msrToAlloc))	
			return true;
		else
			return false;
	}
	
	   /* (non-Javadoc)
     * @see com.pace.base.funcs.AbstractFunction#getMemberDependencyMap(com.pace.base.state.IPafEvalState)
     */
    public Map<String, Set<String>> getMemberDependencyMap(IPafEvalState evalState) throws PafException {
    	
    	Map<String, Set<String>> dependencyMap = new HashMap<String, Set<String>>();
    	String measureDim = evalState.getMsrDim();
    	
    	// validate function parameters
    	validateParms(evalState);
    	   	
    	// Add all parameters
    	Set<String> memberList = new HashSet<String>();
    	memberList.add(msrToAlloc);
    	memberList.addAll(targetMsrs);
    	dependencyMap.put(measureDim, memberList);
    	
		// Return member dependency map
		return dependencyMap;
    	
    }
    
    /**
	     * @param intersection
	     * @param evalState
	     * @param dataCache
	     * @return
	     * @throws PafException
	     */
	    public PafDataCache allocateChange(Intersection intersection, EvalState evalState, PafDataCache dataCache) throws PafException {
	
	    	double allocTotal = dataCache.getCellValue(intersection);
	//  	if (logger.isDebugEnabled()) logger.debug("Allocating change for :" + intersection.toString() + " = " + allocTotal);
	
	    	// useful values
	    	String timeDim = evalState.getAppDef().getMdbDef().getTimeDim();
	        String currentYear = evalState.getAppDef().getCurrentYear(); 
	        String yearDim = evalState.getAppDef().getMdbDef().getYearDim();
	    	
	    	long stepTime = System.currentTimeMillis();
	
	    	// initial check, don't allocate any intersection that is "elapsed" during forward plannable sessions
	        // if current plan is forward plannable, also don't allow
	        // allocation into any intersections containing protected time periods
	        Set<String> lockedTimePeriods = null;
	
	        if (evalState.getPlanVersion().getType() == VersionType.ForwardPlannable) {
	            lockedTimePeriods = evalState.getClientState().getLockedPeriods();
	        }
	        if (lockedTimePeriods == null)
	            lockedTimePeriods = new HashSet<String>(0);  
	        
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
	                lockedTotal += dataCache.getCellValue(target);
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
	                	elapsedTotal += dataCache.getCellValue(target);
	                	elapsedTargets.add(target);              
	                }  
	            	
	            	// total user locks and add them to a specific collection. These are user locks "only"
	            	// and don't include elapsed period locks
	                if (
	                		(evalState.getOrigLockedCells().contains(target) || evalState.getOrigChangedCells().contains(target)) // user change true
	                		&&
	                		(!elapsedTargets.contains(target)) // not already counted as an elapsed period
	                ) {
	                	userLockedTotal += dataCache.getCellValue(target);
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
	            origTargetSum += dataCache.getCellValue(target);
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


	protected void allocateToTargets(Set<Intersection> targets, double allocAvailable, double origTargetSum, PafDataCache dataCache, EvalState evalState) throws PafException {
        double origValue = 0;
        double allocValue = 0;
        int places = 0;
   
        long stepTime = System.currentTimeMillis();

        
        
        for (Intersection target : targets ) {

            origValue = dataCache.getCellValue(target);
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
	    			allocValue = IntersectionUtil.Round(allocValue, places);
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
    
    protected void allocateToTargets(Set<Intersection> targets, String baseMeasure, double allocAvailable, PafDataCache dataCache, EvalState evalState) throws PafException {
        double baseValue = 0;
        double allocValue = 0;
        double baseTargetSum = 0;
        int places = 0;
        
        String msrDim = evalState.getAppDef().getMdbDef().getMeasureDim();

        // find index of measure dimension in axis
        int msrIndex = dataCache.getAxisIndex(msrDim);
        String[] baseCoords;
        String targetMsr;
        
        // save off original measure from 1st target
        if (targets.size() > 0)
        	targetMsr = targets.iterator().next().getCoordinate(msrDim);
        else //just return if no targets, no work to do
        	return;
        

        // recalculate origTargetSum over base measure intersections
        for (Intersection target : targets ) {
        	baseCoords = target.getCoordinates();
        	baseCoords[msrIndex] = baseMeasure;
            baseTargetSum += dataCache.getCellValue(target.getDimensions(), baseCoords);
        }
        
//        if (logger.isDebugEnabled()) logger.debug("Original total of unlocked base measure targets: " + baseTargetSum);  
        
        // allocate into each target intersection, using the shape of the 
        for (Intersection target : targets ) {

        	// target coordinates have already been shifted by the 
        	// addition operation above.
            baseValue = dataCache.getCellValue(target);
            if (baseTargetSum == 0) {
                allocValue = allocAvailable / targets.size();
            }
            else {
                allocValue = ((baseValue / baseTargetSum) * (allocAvailable));
            }
            
    		if (evalState.getAppDef().getAppSettings() != null && evalState.getAppDef().getAppSettings().isEnableRounding())
    		{
	    		if (evalState.getRoundingRules().containsKey(targetMsr)){
	    			places = evalState.getRoundingRules().get(targetMsr).getDigits();
	    			allocValue = EvalUtil.Round(allocValue, places);
	    			evalState.getAllocatedLockedCells().add(target);
	    		}
    		}
            	
            // put target msr coordinate back to original measure for assignment
            target.setCoordinate(msrDim, targetMsr);
            
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
	
}
