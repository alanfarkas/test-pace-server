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
import com.pace.base.utility.StringUtils;

/**
 * "Periods of Supply" Custom Function - Compute the periods of supply for the current data intersection, using
 * the specified Sales and Inventory measures. The periods will be selected from the bottom of the
 * Time hierarchy, unless an optional level parameter has been defined.
 * 
 * This function simulates TBFirst logic in calculating results at aggregated Time intersections, since Pace does not
 * currently support measures that are both Recalc and Time Balance.
 * 
 * 
 * The calling signature of this function is '@WOS(Sales_Measure, Inventory_Measure, optional_Wrap_Year, Flag, optional Period_Level, optional Max_Periods)'.
 * This function can be used against weeks or days, or any other Time dimension level.
 * 
 * TB First logic will be used on upper level time members.
 * 
 * @version	x.xx
 * @author AFarkas
 *
 */
public class WOSFunc extends AbstractFunction {


	private static int MEASURE_ARGS = 2, REQUIRED_ARGS = 2, MAX_ARGS = 5;
	private int periodLevel = 0, maxPeriods = 999;
	private String salesMeas = null, invMeas = null;
	private boolean bWrap = true;
	private static Logger logger = Logger.getLogger(WOSFunc.class);
	String errMsg;

    public double calculate(Intersection sourceIs, IPafDataCache dataCache, IPafEvalState evalState) throws PafException {

    	double pos = 0;
       	String measureDim = dataCache.getMeasureDim(), timeDim = dataCache.getTimeDim();
      	String currentPeriod = sourceIs.getCoordinate(timeDim);
    	Intersection tempIs = null;
    	
    	
    	// Parse function parameters
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
    	
       	// Get beginning inventory value at adjusted period member 
      	tempIs = sourceIs.clone();
      	tempIs.setCoordinate(measureDim, invMeas); 
      	tempIs.setCoordinate(timeDim, currTimeMbr.getKey()); 
      	double beginInv = dataCache.getCellValue(tempIs);
       	
        // If beginning inventory <= 0, return 0
        if (beginInv <= 0) {
        	return 0;
        }
        
        
        // Main POS logic - Start at the current week and proceed forward, until
        // cumulative sales > beginning inventory. Wrap around time hierarchy, if 
        // necessary, until goal is reached or maximum number of weeks have been 
        // searched.
        double cumSales = 0, prevCumSales = 0;
        double periodSales = 0;
    	tempIs.setCoordinate(measureDim, salesMeas);
    	boolean bMaxPeriods = false;
    	for (int periodCount = 1; !bMaxPeriods; periodCount++) {

    		// Compute cumulative sales
    		periodSales = dataCache.getCellValue(tempIs);
    		cumSales += periodSales;

    		// Exit loop if cumulative sales > beginning inventory 
    		if (cumSales >=  beginInv) {
    			break;
    		}

    		// Advance to next week
    		prevCumSales = cumSales;
    		tempIs = dataCache.getNextIntersection(tempIs, timeDim, 1, bWrap);
    		pos = periodCount;

    		// Check if we've reached max periods
    		if (tempIs == null || periodCount >= maxPeriods) {
    			bMaxPeriods = true;
    		}
    	}

    	// If the maximum number of periods have not been reached, determine if 
    	// there are any fractional weeks to add to result.
    	if (!bMaxPeriods  && beginInv > prevCumSales) {
    		// Add in ratio of remaining inventory divided by the next week's sales
    		pos += (beginInv - prevCumSales) / periodSales;
    	}

    	// Return weeks of supply
    	return pos;
    }
    
	/**
	 *  Parse and validate function parameters 
	 *
	 * @param evalState Evaluation state object
	 * @throws PafException
	 */
	private void parseParms(IPafEvalState evalState) throws PafException {
		
      	int parmIndex = 0;
    	String measureDim = evalState.getAppDef().getMdbDef().getMeasureDim();
    	errMsg = "Error in [WOSFunc] - ";

    	// Check for existence of arguments
    	if (parms == null) {
    		errMsg += "[" + REQUIRED_ARGS + "] arguments are required, but none were provided.";
    		logger.error(errMsg);
    		throw new PafException(errMsg, PafErrSeverity.Error);
    	}
    	
    	// Check for the correct number of arguments
    	if (parms.length < REQUIRED_ARGS) {
    		errMsg += "[" + REQUIRED_ARGS + "] arguments are required, but only [" + parms.length + "] were provided.";
    		logger.error(errMsg);
    		throw new PafException(errMsg, PafErrSeverity.Error);
    	}
    	
    	// Check for too many arguments
    	if (parms.length > MAX_ARGS) {
    		errMsg += "A maximum of [" + MAX_ARGS + "] arguments are allowed, but [" + parms.length + "] were provided.";
    		logger.error(errMsg);
    		throw new PafException(errMsg, PafErrSeverity.Error);
    	}
    	
    	// Get required arguments
    	salesMeas = parms[0];
    	invMeas = parms[1];


    	// Check for 1st optional parameter - wrap around time period
    	parmIndex = REQUIRED_ARGS;
    	if (parms.length > parmIndex) {
    		bWrap = Boolean.valueOf(parms[parmIndex]);
    	}   
    	
    	// Check for 2nd optional parameter - period level
    	parmIndex++;
    	if (parms.length > parmIndex) {
    		periodLevel = Integer.valueOf(parms[parmIndex]);
    	}
    	
    	// Check for 3rd optional parameter - max periods
    	parmIndex++;
    	if (parms.length > parmIndex) {
    		maxPeriods = Integer.valueOf(parms[parmIndex]);
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
   
		
	}

	/* (non-Javadoc)
	 * @see com.pace.base.funcs.AbstractFunction#getTriggerIntersections(com.pace.base.state.IPafEvalState)
	 */
	public Set<Intersection> getTriggerIntersections(IPafEvalState evalState) throws PafException {
		
		/*
		 * The trigger intersections for the @WOS function are:
		 *
		 * 1. Any changed intersection containing the SALES measure, across any period
		 * 2. Any changed intersection containing the INVENTORY measure
		 * 
		 */
		
		Set<Intersection> triggerIntersections = null; 
		Map<String, Set<Intersection>> changedCellsByMsr = evalState.getChangedCellsByMsr();
     	String timeDim = evalState.getAppDef().getMdbDef().getTimeDim();
     	String msrDim = evalState.getAppDef().getMdbDef().getMeasureDim();
    	
    	// Parse function parameters
     	parseParms(evalState);
    	   			
      	// Get all periods in tree
        PafDimTree timeTree = evalState.getDataCacheTrees().getTree(timeDim);
       	String[] periods = timeTree.getMemberKeys();

       	
//       	Set<Intersection> salesSet = evalState.getChangedCellsByTime().get( evalState.getCurrentTimeSlice() );

       	
//       	Map<String, Set<String>> filterMap = new HashMap<String, Set<String>> ();
//       	Set<String> srchMeasures = new HashSet<String>();
//       	srchMeasures.add(salesMeas);
//       	filterMap.put(evalState.getMsrDim(), srchMeasures);
//    	Set<Intersection> salesIntersections = null; // = changedCellsByMsr.get(salesMeas);
//    	
//    	if (salesSet != null) {
//    		  salesIntersections = this.findIntersections(filterMap, salesSet);
//    	}

    	
    	Set<Intersection> allSalesIntersections = changedCellsByMsr.get(salesMeas);
    	Set<Intersection> salesIntersections = null;  
    	
    	if (allSalesIntersections != null) {
    	
	    	// Find 1 intersection from set / unique dimensionality excluding time.
	    	// Generate a dimension match set ( all dimensions excluding measures and time )   	
	    	
	    	Set<String> matchDims = new HashSet<String> (10);
	    	for (String dim : evalState.getAppDef().getMdbDef().getAllDims() ) {
	    		if ( !(dim.equals(timeDim) || dim.equals(msrDim)) ) matchDims.add(dim);
	    	}
	    	
	    	// This structure will hold an intersection unique by all dimensions except time and measure
	    	// It will be keyed by the intersections match string.
	    	Map<String, Intersection> uniqueChangesByTime = new HashMap<String, Intersection>();
	    	
	    	for (Intersection is : allSalesIntersections) {
	    		// if haven't already found an intersection for that dimensionality add
	    		// generate unique key for this intersection based upon all other dims besides time & measure ( measure assumed constant in this set )
	    		String matchStr = is.getMatchString(matchDims);
	    		if (!uniqueChangesByTime.containsKey(matchStr)) uniqueChangesByTime.put(matchStr, is);
	    	}
	    	
	
	    	salesIntersections = new HashSet<Intersection>( uniqueChangesByTime.values().size() * 2 );
	    	salesIntersections.addAll( uniqueChangesByTime.values() );
    	
    	}


    	
    	
     	Set<Intersection> invIntersections = changedCellsByMsr.get(invMeas);
    	
     	// Calculate size of appropriate hashmap to initialize for trigger intersections
     	int salesSz = salesIntersections == null? 0 : salesIntersections.size() ;
     	int invSz = invIntersections == null? 0 : invIntersections.size() ;
     	
     	triggerIntersections = new HashSet<Intersection>( (salesSz * periods.length + invSz) * 2 );
     	
       	// Clone each changed sales intersection across each period to force all periods to be 
       	// recalculated.
    	if (salesIntersections != null) {
    		for (Intersection salesIs : salesIntersections) {
    			for (String period : periods) {
    				Intersection periodIs = salesIs.clone();
    				periodIs.setCoordinate(timeDim, period);
    				triggerIntersections.add(periodIs);       				
    			}
    		}
    	}
		
    	// Add in inventory intersections
     	if (invIntersections != null) {
     		triggerIntersections.addAll(invIntersections);
     	}
     	

		return triggerIntersections;
	}
	
	/* (non-Javadoc)
	 * @see com.pace.base.funcs.AbstractFunction#changeTriggersFormula(com.pace.base.data.Intersection, com.pace.base.state.IPafEvalState)
	 */
	public boolean changeTriggersFormula(Intersection is, IPafEvalState evalState) {
		
		/*
		 * A change to the SALES or INVENTORY measure triggers this formula
		 *
		 */

    	String measureDim = evalState.getAppDef().getMdbDef().getMeasureDim();
		String measure = is.getCoordinate(measureDim);	
		if (measure.equals(salesMeas) || measure.equals(invMeas))	
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
    	   	
    	// Add SALES and INVENTORY measures
    	Set<String> members = new HashSet<String>();
    	members.add(salesMeas);
    	members.add(invMeas);
    	dependencyMap.put(measureDim, members);
    	
		// Return member dependency map
		return dependencyMap;
    	
    }

}
