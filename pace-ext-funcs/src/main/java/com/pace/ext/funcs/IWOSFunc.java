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
 * "Inverse Periods of Supply" Custom Function - Computes the beginning inventory needed to 
 * support the specified POS and Sales measures.
 * 
 * The calling signature of this function is '@IWOS(Sales_Measure, WOS_Measure, optional_Wrap_Year_Flag, optional Period_Level)'.
 * This function can be used against weeks or days, or any other Time dimension level.
 * 
 * @version	x.xx
 * @author AFarkas
 *
 */
public class IWOSFunc extends AbstractFunction {

   	private static int MEASURE_ARGS = 2, REQUIRED_ARGS = 2, MAX_ARGS = 4;
	private double beginInv = 0;
  	private int periodLevel = 0;
  	private String salesMeas = null, wosMeas = null;
	private boolean bWrap = true;
	private static Logger logger = Logger.getLogger(IWOSFunc.class);

    public double calculate(Intersection sourceIs, IPafDataCache dataCache, IPafEvalState evalState) throws PafException {

      	String measureDim = dataCache.getMeasureDim(), timeDim = dataCache.getTimeDim();
      	String currentPeriod = sourceIs.getCoordinate(timeDim);
     	Intersection tempIs = null;
    	
     	
    	// Validate function parameters
    	parseParms(evalState);
    	   	 	
      	// Get the list of periods at bottom level or selected level, whichever is higher
       	PafDimTree timeTree = evalState.getDataCacheTrees().getTree(timeDim);
       	int timeFloor = timeTree.getLowestAbsLevelInTree();
       	int validPeriodLevel = Math.max(timeFloor, periodLevel);
       	List<PafDimMember> periods = timeTree.getMembersByLevel().get(validPeriodLevel);
       	
       	// Get current period attributes
       	PafDimMember currTimeMbr = timeTree.getMember(currentPeriod);
        int currPeriodNo = periods.indexOf(currTimeMbr);     	
      	
        // TBFirst Logic - If time dimension intersection not at bottom/selected level, 
        // set period number to first descendant period.
        if (currPeriodNo == -1) {
        	currTimeMbr = timeTree.getFirstDescendant(currTimeMbr.getKey(), (short) validPeriodLevel);
        	currPeriodNo = periods.indexOf(currTimeMbr);           
       }               
        
       	// Get POS value
      	tempIs = sourceIs.clone();
      	tempIs.setCoordinate(measureDim, wosMeas);
        double pos = dataCache.getCellValue(tempIs);
    	int posFloor = (int) pos;

        // If POS <= 0, return 0
        if (pos <= 0) {
        	return 0;
        }
        
        // Main IWOS logic - Compute cumulative sales based on the specified WOS.
        // Start at the current week and proceed forward, until the desired number
        // of whole weeks has been reached, wrapping around the time hierarchy, if 
        // necessary.
        double cumSales = 0;
        double weeklySales = 0;
      	tempIs.setCoordinate(measureDim, salesMeas);
        for (int weekCount = 0; weekCount < posFloor && tempIs != null; weekCount++) {

        	// Compute cumulative sales
        	weeklySales = dataCache.getCellValue(tempIs);
        	cumSales += weeklySales;
        	
        	// Advance to next week
     		tempIs = dataCache.getNextIntersection(tempIs, timeDim, 1, bWrap);
        }
        
        
        // Initially, the beginning inventory is set to the cumulative sales
        // corresponding to the span of time represented by the wos floor.
        beginInv = cumSales;
        
        // If the wos is not a whole number, add in the fractional part of the last 
        // week of sales.
        double partialWeek = pos - posFloor;
        if (partialWeek > 0 && bWrap) {
        	double lastWeekOfSales = dataCache.getCellValue(tempIs);
        	beginInv += partialWeek * lastWeekOfSales;
        }

        // Return beginning inventory
        return beginInv;
    }
    

    /**
     *  Parse and validate function parameters 
     *
     * @param evalState Evaluation state object
     * @throws PafException
     */
    private void parseParms(IPafEvalState evalState) throws PafException {

    	int parmIndex = 0;
    	String errMsg = "Error in [IWOSFunc] - ";
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
    	
    	// Check for too many parms
    	if (parms.length > MAX_ARGS) {
    		errMsg += "A maximum of [" + MAX_ARGS + "] arguments are allowed, but [" + parms.length + "] were provided.";
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
    	salesMeas = parms[0];
    	wosMeas = parms[1];

    	
    	// Check for 1st optional parameter - boolean to wrap around
    	parmIndex = REQUIRED_ARGS;
    	if (parms.length > parmIndex) {
    		bWrap  = Boolean.valueOf(parms[parmIndex]);
    	}
    	
    	// Check for 2nd optional parameter - period level
    	parmIndex++;
    	if (parms.length > parmIndex) {
    		periodLevel = Integer.valueOf(parms[parmIndex]);
    	}
    	
		
	}


	/* (non-Javadoc)
	 * @see com.pace.base.funcs.AbstractFunction#getTriggerIntersections(com.pace.base.state.IPafEvalState)
	 */
	public Set<Intersection> getTriggerIntersections(IPafEvalState evalState) throws PafException {
		
		/*
		 * The trigger intersections for the @IWOS function are:
		 *
		 * 1. Any changed intersection containing the WOS measure
		 * 
		 */
		
		Set<Intersection> triggerIntersections = null; // = new HashSet<Intersection>(0);
		Map<String, Set<Intersection>> changedCellsByMsr = evalState.getChangedCellsByMsr();
    	
    	// Parse function parameters
     	parseParms(evalState);
    	   					
		// Add in wos intersections
     	Set<Intersection> wosIntersections = changedCellsByMsr.get(wosMeas);
     	if (wosIntersections == null) {
     		triggerIntersections = new HashSet<Intersection>(0);
     	}
     	else {
       		triggerIntersections = new HashSet<Intersection>( 2 * wosIntersections.size() );
     		triggerIntersections.addAll(wosIntersections);
     	}
     	

		return triggerIntersections;
	}
	
	/* (non-Javadoc)
	 * @see com.pace.base.funcs.AbstractFunction#changeTriggersFormula(com.pace.base.data.Intersection, com.pace.base.state.IPafEvalState)
	 */
	public boolean changeTriggersFormula(Intersection is, IPafEvalState evalState) {
		
		/*
		 * A change to the WOS measure triggers this formula
		 *
		 */

    	String measureDim = evalState.getAppDef().getMdbDef().getMeasureDim();
		String measure = is.getCoordinate(measureDim);	
		if (measure.equals(wosMeas))	
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
    	memberList.add(wosMeas);
    	dependencyMap.put(measureDim, memberList);
    	
		// Return member dependency map
		return dependencyMap;
    	
    }

	
}
