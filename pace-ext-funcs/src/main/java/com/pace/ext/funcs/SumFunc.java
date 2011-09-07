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
 * "Sum" Custom Function - 
 * 
 * The calling signature of this function is '@SUM(msrTotal, [msrsToExclude*] )'.
 * This function aggregates all the children of the measure specified in the 1st parameter
 * into the msrTotal. An optional list of measures to exlcude can be added.
 * 
 * @version	2.8.2.0
 * @author JWatkins
 *
 */
public class SumFunc extends AbstractFunction {

   	private static int MEASURE_ARGS = 1, REQUIRED_ARGS = 1; //, MAX_ARGS = 4;
   	
  	private String msrToSum = null;

	private Set<String> inputMsrs = new HashSet<String>();
	
	private static Logger logger = Logger.getLogger(SumFunc.class);

    public double calculate(Intersection sourceIs, IPafDataCache dataCache, IPafEvalState evalState) throws PafException {


    	// convenience variables
      	String msrDim = dataCache.getMeasureDim(), timeDim = dataCache.getTimeDim();
       	PafDimTree msrTree = evalState.getDataCacheTrees().getTree(msrDim);

 	
    	// Validate function parameters
    	validateParms(evalState);
   	   	 	
    	// this function will sum a specified measure from its hierarchical children
    	// if only a measure is specified the aggregation occurs by default from it's children
    	// if additional parameters are passed then the aggregation is limited to the included measures
    	
        // inputs holds all intersections to sum.
    	// initialize it off the list of target measures and the evalstate collections
    	
    	double sum = 0;

        List<Intersection> inputs = new ArrayList<Intersection>();
       	for (String msr : this.inputMsrs) {
        		// for each msr in the list I need the equivalent intersection populated from the sourceIsx
				Intersection input = sourceIs.clone();
				input.setCoordinate(msrDim, msr);
        		sum += dataCache.getCellValue(input);
        	}
        
        return sum;
 
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
    	msrToSum = this.measureName;
    	

    	
    	// Check for optional parameters - if any other parameters 
    	// then they represent the inputs rather than the default children
    	int index = 1;
    	inputMsrs.clear();
    	if (parms.length > 1) {
    		while (index<=parms.length)
    			inputMsrs.add(parms[index++]);
    	}
    	else { // default measure list is children of measure specified
        	for (PafDimMember msrMbr : measureTree.getChildren(msrToSum)) {
        		inputMsrs.add(msrMbr.getKey());      		
        	}
    	}
	}


	/* (non-Javadoc)
	 * @see com.pace.base.funcs.AbstractFunction#getTriggerIntersections(com.pace.base.state.IPafEvalState)
	 */
	public Set<Intersection> getTriggerIntersections(IPafEvalState evalState) throws PafException {
		
		/*
		 * The trigger intersections for the @ALLOC function are:
		 *
		 * 1. Any changed intersection containing the input measures 
		 * 
		 */
		
		Set<Intersection> triggerIntersections = new HashSet<Intersection>();
		Map<String, Set<Intersection>> changedCellsByMsr = evalState.getChangedCellsByMsr();
    	
    	// Parse function parameters
     	validateParms(evalState);
      	
     	// return any intersection that is on the right hand side
     	for (String msr : this.inputMsrs) {
     		if (changedCellsByMsr.get(msr) != null) {
     			triggerIntersections.addAll(changedCellsByMsr.get(msr));
     		}
     	}
     	
		return triggerIntersections;
	}
	
	/* (non-Javadoc)
	 * @see com.pace.base.funcs.AbstractFunction#changeTriggersFormula(com.pace.base.data.Intersection, com.pace.base.state.IPafEvalState)
	 */
	public boolean changeTriggersFormula(Intersection is, IPafEvalState evalState) {
		
		/*
		 * A change to any of the input measures triggers this formula
		 *
		 */

    	String msrDim = evalState.getAppDef().getMdbDef().getMeasureDim();
		
     	// return any intersection that is on the right hand side
     	for (String msr : this.inputMsrs)
     		if (msr.equals(is.getCoordinate(msrDim))) return true;

     	// no matches, doesn't trigger
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
    	memberList.addAll(inputMsrs);
    	dependencyMap.put(measureDim, memberList);
    	
		// Return member dependency map
		return dependencyMap;
    	
    }
    
 
 

	
}
