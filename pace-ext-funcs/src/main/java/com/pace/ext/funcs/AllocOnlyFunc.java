package com.pace.ext.funcs;

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
import com.pace.base.mdb.PafDimMember;
import com.pace.base.mdb.PafDimTree;
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
public class AllocOnlyFunc extends AbstractFunction {

   	private static int MEASURE_ARGS = 1, REQUIRED_ARGS = 1; //, MAX_ARGS = 4;
   	
  	private String msrToAlloc = null;
	
	private boolean hasRestrictedTargets;
	private List<String> targets;
	
	private static Logger logger = Logger.getLogger(AllocOnlyFunc.class);

    public double calculate(Intersection sourceIs, IPafDataCache dataCache, IPafEvalState evalState) throws PafException {


    	// convenience variables
      	String measureDim = dataCache.getMeasureDim(), timeDim = dataCache.getTimeDim();
   	
 	
    	// Validate function parameters
    	parseParms(evalState);
    	   	 	
    	
    	// this function will allocate a specified measure into its hierarchical children
    	// if only a measure is specified the allocation occurs by default into it's children
    	// if additional paramaters are passed then the allocation is limited to the included measures
    	
    	
    	
    	
      	// Get the list of periods at bottom level or selected level, whichever is higher
//    	logger.debug("Getting list of periods");
       	PafDimTree timeTree = evalState.getDataCacheTrees().getTree(timeDim);
       	int timeFloor = timeTree.getLowestAbsLevelInTree();

       	
       	// Get current period attributes
//       	PafDimMember currTimeMbr = timeTree.getMember(currentPeriod);
//        int currPeriodNo = periods.indexOf(currTimeMbr);     	
//      	
//        // If time dimension intersection not at week level, set week number to first descendant week
//        if (currPeriodNo == -1) {
//        	currTimeMbr = timeTree.getFirstDescendant(currTimeMbr.getKey(), (short) validPeriodLevel);
//        	currPeriodNo = periods.indexOf(currTimeMbr);           
//       }               
//        
//       	// Get POS value
//      	tempIs = sourceIs.clone();
////      	tempIs.setCoordinate(measureDim, wosMeas);
//        double pos = dataCache.getCellValue(tempIs);
//    	int posFloor = (int) pos;
//
//        if (!bWrap) {
//        	int tmpMax;
//        	tmpMax = periods.size() - currPeriodNo;
//        	posFloor = tmpMax < posFloor ? tmpMax : posFloor;
//        }
//    	
//    	
//        // If POS <= 0, return 0
//        if (pos <= 0) {
//        	return 0;
//        }
//        
//        // Main IWOS logic - Compute cumulative sales based on the specified WOS.
//        // Start at the current week and proceed forward, until the desired number
//        // of whole weeks has been reached, wrapping around the time hierarchy, if 
//        // necessary.
//        double cumSales = 0;
//        double weeklySales = 0;
//        int periodInx = currPeriodNo;
//        tempIs = sourceIs.clone();
////    	tempIs.setCoordinate(measureDim, salesMeas);
//        for (int weekCount = 0; weekCount < posFloor; weekCount++) {
//
//        	// Compute week index (0-based). Week index is adjusted to allow
//        	// "wrap around" logic.
//        	periodInx = periodInx % periods.size();
//        	
//        	// Compute cumulative sales
//        	String weekIs = periods.get(periodInx).getKey();
//        	tempIs.setCoordinate(timeDim, weekIs);
//        	weeklySales = dataCache.getCellValue(tempIs);
//        	cumSales += weeklySales;
//        	
//        	// Advance to next week
//        	periodInx++;
//        }
//        
//        
//        // Initially, the beginning inventory is set to the cumulative sales
//        // corresponding to the span of time represented by the wos floor.
//        beginInv = cumSales;
//        
//        // If the wos is not a whole number, add in the fractional part of the last 
//        // week of sales.
//        double partialWeek = pos - posFloor;
//        if (partialWeek > 0 && bWrap) {
//        	int lastWeekNo = (currPeriodNo + posFloor) % periods.size();
//        	String lastWeek = periods.get(lastWeekNo).getKey();
//        	tempIs.setCoordinate(timeDim, lastWeek);
//        	double lastWeekOfSales = dataCache.getCellValue(tempIs);
//        	beginInv += partialWeek * lastWeekOfSales;
//        }
        
        // Return beginning inventory
        return 0;
    }
    

    /**
     *  Parse and validate function parameters 
     *
     * @param evalState Evaluation state object
     * @throws PafException
     */
    private void parseParms(IPafEvalState evalState) throws PafException {

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
   	
    	
    	// Check validity of measure arguments
    	PafDimTree measureTree = evalState.getDataCacheTrees().getTree(measureDim);
    	for (parmIndex = 0; parmIndex < MEASURE_ARGS; parmIndex++) {
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
    		targets.add(parms[index++]);
    	}
    	
    	

		
	}


	/* (non-Javadoc)
	 * @see com.pace.base.funcs.AbstractFunction#getTriggerIntersections(com.pace.base.state.IPafEvalState)
	 */
	public Set<Intersection> getTriggerIntersections(IPafEvalState evalState) throws PafException {
		
		/*
		 * The trigger intersections for the @IWOS function are:
		 *
		 * 1. Any changed intersection containing the alloc measure measure
		 * 
		 */
		
		Set<Intersection> triggerIntersections = null; // = new HashSet<Intersection>(0);
		Map<String, Set<Intersection>> changedCellsByMsr = evalState.getChangedCellsByMsr();
    	
    	// Parse function parameters
     	parseParms(evalState);
    	   					
		// Add in wos intersections
//     	Set<Intersection> wosIntersections = changedCellsByMsr.get(wosMeas);
//     	if (wosIntersections == null) {
//     		triggerIntersections = new HashSet<Intersection>(0);
//     	}
//     	else {
//       		triggerIntersections = new HashSet<Intersection>( 2 * wosIntersections.size() );
//     		triggerIntersections.addAll(wosIntersections);
//     	}
//     	

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
    	
    	// Parse function parameters
    	parseParms(evalState);
    	   	
    	// Add WOS Measure
    	Set<String> memberList = new HashSet<String>();
    	memberList.add(msrToAlloc);
    	dependencyMap.put(measureDim, memberList);
    	
		// Return member dependency map
		return dependencyMap;
    	
    }

	
}
