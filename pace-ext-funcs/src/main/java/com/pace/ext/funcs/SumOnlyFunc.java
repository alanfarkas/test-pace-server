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
import com.pace.base.data.IPafDataCache;
import com.pace.base.data.Intersection;
import com.pace.base.data.IntersectionUtil;
import com.pace.base.funcs.AbstractFunction;
import com.pace.base.mdb.PafDataCache;
import com.pace.base.mdb.PafDimMember;
import com.pace.base.mdb.PafDimTree;
import com.pace.base.state.EvalState;
import com.pace.base.state.IPafEvalState;

/**
 * "Allocation" Custom Function - 
 * 
 * The calling signature of this function is '@ALLOC(, [msrAllocTargets*] )'.
 * This function can be used against weeks or days, or any other Time dimension level.
 * 
 * @version	2.8.2.0
 * @author JWatkins
 *
 */
public class SumOnlyFunc extends AbstractFunction {

   	private static int MEASURE_ARGS = 1, REQUIRED_ARGS = 1; //, MAX_ARGS = 4;
   	
  	private String msrToAlloc = null;
	
	private boolean hasRestrictedTargets;
	private List<String> targetMsrs;
	
	private static Logger logger = Logger.getLogger(SumOnlyFunc.class);

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
        
//        sumTargets(allocTargets, )
    	


       	

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
    
 
 

	
}
