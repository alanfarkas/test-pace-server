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
import com.pace.base.funcs.AbstractFunction;
import com.pace.base.mdb.PafDataCache;
import com.pace.base.mdb.PafDimMember;
import com.pace.base.mdb.PafDimTree;
import com.pace.base.state.EvalState;
import com.pace.base.state.IPafEvalState;

/**
 * "SumOnly" Custom Function - 
 * 
 * The calling signature of this function is '@SUMONLY(msrTotal, [msrComponents+] )'.
 * This function aggregates all the measures listed after the 1st parameters into the msrTotal
 * 
 * @version	2.8.2.0
 * @author JWatkins
 *
 */
public class SumOnlyFunc extends SumFunc {

	private static Logger logger = Logger.getLogger(SumOnlyFunc.class);

	protected int REQUIRED_ARGS = 2; 
	// This function requires two parameters since it's expected to include at least 1 specific member.
	
	 /**
     *  Parse and validate function parameters 
     *
     * @param evalState Evaluation state object
     * @throws PafException
     */
    protected void validateParms(IPafEvalState evalState) throws PafException {

    	int parmIndex = 0;
    	// quick check to get out if it looks like these have been validated already
    	if (this.isValidated) return;
    	
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
    	// then they represent the targets rather than the default children
    	int index = 1;
    	inputMsrs.clear();
    	
    	if (parms.length > 1) {
    		while (index<parms.length)
    			inputMsrs.add(parms[index++]);
    	}
    	else { // default measure list is children of measure specified
        	for (PafDimMember msrMbr : measureTree.getChildren(msrToSum)) {
        		inputMsrs.add(msrMbr.getKey());      		
        	}
    	}
    	
    	this.isValidated = true;
	}
	
}