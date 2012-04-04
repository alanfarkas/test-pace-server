package com.pace.ext.funcs;

import java.util.HashSet;

import org.apache.log4j.Logger;

import com.pace.base.PafErrSeverity;
import com.pace.base.PafException;
import com.pace.base.mdb.PafDimMember;
import com.pace.base.mdb.PafDimTree;
import com.pace.base.state.IPafEvalState;

/**
 * "AllocOnly" Custom Function - 
 * 
 * The calling signature of this function is '@ALLOCONLY(msrToAllocate, [msrAllocTargets+] )'.
 * This function allocates the initial measure into the measures specified in the subsequent parameters
 * 
 * @version	2.8.2.0
 * @author JWatkins
 *
 */
public class AllocOnlyFunc extends AllocFunc {

	private static Logger logger = Logger.getLogger(AllocOnlyFunc.class);
	
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
//    	if (this.isValidated) return;
    	
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
    	PafDimTree measureTree = evalState.getEvaluationTree(measureDim);
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
    	targetMsrs = new HashSet<String>();
    	if (parms.length > 1) {
    		while (index<parms.length)
    			targetMsrs.add(parms[index++]);
    	}
    	else { // default measure list is children of measure specified
        	for (PafDimMember msrMbr : measureTree.getChildren(msrToAlloc)) {
        		targetMsrs.add(msrMbr.getKey());      		
        	}
    	}
    	
    	this.isValidated = true;
	}
	
}
