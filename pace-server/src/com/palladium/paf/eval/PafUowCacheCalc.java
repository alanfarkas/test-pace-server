/*
 *	File: @(#)PafUowCacheCalc.java 	Package: com.pace.base.eval 	Project: PafServer
 *	Created: Sep 19, 2005  				By: Alan Farkas
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

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.apache.log4j.Logger;

import com.pace.base.PafErrSeverity;
import com.pace.base.PafException;
import com.pace.base.app.MeasureDef;
import com.pace.base.app.MeasureType;
import com.pace.base.mdb.*;

/**
 * Manages all calculation operations against the PafUowCache
 *
 * @version	x.xx
 * @author Alan Farkas
 *
 */
public abstract class PafUowCacheCalc {

	private static Logger logger = Logger.getLogger(PafUowCacheCalc.class);

	public PafUowCacheCalc (){
		logger.info("Creating instance of: " + this.getClass().getName());
	}

	/**
	 *	Aggregate data across the selected dimension. This is a convenience method
	 * 	that calls aggDimension(aggDimension, dataCache, memberTree, memberFilters)
	 *  with the 'appendChangedCells' parameter set to true.
	 *
	 * @param aggDimension Name of dimension to aggregate
	 * @param dataCache Paf data cache object
	 * @param memberTree Hiearchy for aggregated dimension
	 * 
	 * @return Paf data cache object
	 * @throws PafException 
	 */
	public static PafDataCache aggDimension(String aggDimension, PafUowCache dataCache, PafBaseTree memberTree) throws PafException {  	
		return aggDimension(aggDimension, dataCache, memberTree, true);
	}


	/**
	 *	Aggregate data across the selected dimension. This is a convenience method
	 * 	that calls aggDimension(aggDimension, dataCache, memberTree, memberFilters, 
	 * 	appendChangedCells) with the 'memberFilters' parameter set to null.
	 *
	 * @param aggDimension Name of dimension to aggregate
	 * @param dataCache Paf data cache object
	 * @param memberTree Hiearchy for aggregated dimension
	 * @param appendChangedCells Indicates if the list of changed cells should be appended or overwritten
	 * 
	 * @return Paf data cache object
	 * @throws PafException 
	 */
	public static PafDataCache aggDimension(String aggDimension, PafUowCache dataCache, PafBaseTree memberTree, boolean appendChangedCells) throws PafException {
		return aggDimension(aggDimension, dataCache, memberTree, null, appendChangedCells);
	}

	/**
	 *	Aggregate data across the selected dimension. This is a convenience method
	 * 	that calls aggDimension(aggDimension, dataCache, memberTree, memberFilters, 
	 * 	appendChangedCells) with the 'appendChangedCells' parameter set to true.
	 *
	 * @param aggDimension Name of dimension to aggregate
	 * @param dataCache Paf data cache object
	 * @param memberTree Hiearchy for aggregated dimension
	 * @param memberFilters Map of member lists, by dimension, that can be used to narrow the focus of the calculation process
	 * 
	 * @return Paf data cache object
	 * @throws PafException 
	 */
	public static PafDataCache aggDimension(String aggDimension, PafUowCache dataCache, PafBaseTree memberTree, Map<String, List<String>> memberFilters) throws PafException {
		return aggDimension(aggDimension, dataCache, memberTree, memberFilters, true);
	}


	/**
	 *	Aggregate data across the selected dimension, for the selected dimension member.
	 *
	 * @param aggDimension Name of dimension to aggregate
	 * @param dataCache Paf data cache object
	 * @param memberTree Hiearchy for aggregated dimension
	 * @param memberFilters Map of member lists, by dimension, that can be used to narrow the focus of the calculation process
	 * @param appendChangedCells Indicates if the list of changed cells should be appended or overwritten
	 * 
	 * @return Paf data cache object
	 * @throws PafException 
	 */
	public static PafDataCache aggDimension(String aggDimension, PafDataCache dataCache, PafDimTree memberTree, Map<String, List<String>> memberFilters, boolean appendChangedCells) throws PafException {

		boolean isTimeAggregation = false;
		int aggDimAxis=0, aggDimIndex = 0, arrayIndex = 0, dimCount = 0, intersectDimCount = 0;
		int measureAxis = dataCache.getMeasureAxis(), timeAxis = dataCache.getTimeAxis();
		int[] cellIndex = null, intersectDimIndexes = null, intersection = null;
		long calcStart = 0, calcEnd = 0;
		String versionDim = dataCache.getVersionDim();
		String timeDim = dataCache.getTimeDim();
		String[] activeVersions = dataCache.getActiveVersions();
		List<String> aggMembers = null;
		Set<MeasureType> aggMeasureTypes = new HashSet<MeasureType>();
		PafIntersectionIterator intersections = null;
		List<String> timeOpenPeriods = new ArrayList<String>();


		// Validate aggregation dimension name
		calcStart = System.currentTimeMillis();
		logger.info("Aggregating dimension [" + aggDimension + "]"); 	
		aggDimAxis = dataCache.getAxisIndex(aggDimension);

		// Initialize changed cells list if 'appendChangedCells' parameter is set to FALSE
		if (!appendChangedCells) {
			dataCache.initChangedCells();
		}

		// Check if this is a time dimension
		if (aggDimAxis == timeAxis) {
			logger.debug("Aggregation of Time Dimension is detected. Time Balance processing will be applied to Time Balance members.");
			isTimeAggregation = true;
		}

		// Add filter for the Version dimension if it's not the aggregated dimension
		// and it doesn't already have a filter on it
		if (!aggDimension.equalsIgnoreCase(versionDim)) {
			if (memberFilters == null) {
				memberFilters = new HashMap<String, List<String>>();
			}
			if (!memberFilters.containsKey(versionDim)) {
				memberFilters.put(versionDim, Arrays.asList(activeVersions));
			}
		}

		// Enter a list of filtered dimensions into the log
		if (memberFilters != null){

			//BEGIN(1) - TTN-584
			//if time arr and member filter contains time filter
			if ( isTimeAggregation && memberFilters.containsKey(timeDim)) {

				//get time open periods
				if ( memberFilters.get(timeDim) != null ) {
					timeOpenPeriods = memberFilters.get(timeDim);
				}

				//remove time filter from map, we will readd at end of method
				memberFilters.remove(timeDim);

			}
			//END(1) - TTN-584

			String dimList = "";
			for (String dimension:memberFilters.keySet()) {
				dimList = dimList + " [" + dimension + "],"; 
			}
			dimList = dimList.substring(1, dimList.length() - 1);
			logger.debug("Aggregation filters have been specified on the following dimensions: " + dimList);

			// Validate aggregation filters
			dataCache.validateMemberFilters(memberFilters);

		}

		// Loop through data cache dimensions to generate aggregation process parameters
		dimCount = dataCache.getAxisCount();
		intersectDimCount = dimCount - 1;
		intersectDimIndexes = new int [intersectDimCount];
		arrayIndex = 0;
		for (int axisIndex = 0; axisIndex < dimCount; axisIndex++) {
			String dimension = dataCache.getDimension(axisIndex);
			// Is the current dimension the dimension being aggregated ?
			if (dimension.equalsIgnoreCase(aggDimension)) { 
				// Yes - Get corresponding aggregate dimension index number
				aggDimIndex = dataCache.getAxisIndex(aggDimension);
			} else {
				// No - Add the dimension and corresponding index to processing arrays
				if (arrayIndex > intersectDimCount) { 
					// Index out of bounds issue - throw NoSuchElementException
					String errMsg = "Index out of bounds error encountered when adding item to [dimIndexes] array";
					logger.error(errMsg);
					NoSuchElementException nse = new NoSuchElementException(errMsg);
					throw nse;
				}
				intersectDimIndexes[arrayIndex] = axisIndex;
				arrayIndex ++;
			}
		}

		// Main aggregation process - Aggregate the selected dimension across all 
		// remaining dimensions. Only aggregate the following measure types: 
		// Aggregate, TimeBalanceFirst, and TimeBalanceLast
		logger.debug("Starting main aggregation process for dimension [" + aggDimension + "]....");
		try {
			// Create a lookup set of the valid Measure Types for aggregation
			aggMeasureTypes.add(MeasureType.Aggregate);
			aggMeasureTypes.add(MeasureType.TimeBalFirst);
			aggMeasureTypes.add(MeasureType.TimeBalLast);

			// Get list of members to aggregate - level 1  and above (Post Order)
			logger.debug("Getting list of members to aggregate");
			aggMembers = memberTree.getMemberNames(TreeTraversalOrder.POST_ORDER, 1);

			// Initialize indexing objects
			intersections = new PafIntersectionIterator(intersectDimIndexes, dataCache, memberFilters);
			cellIndex = new int[dimCount];

			// Cycle through aggregation members
			for (String member:aggMembers) {

				//BEGIN(2) - TTN-584
				if ( isTimeAggregation && timeOpenPeriods.size() > 0 && ! timeOpenPeriods.contains(member)) {

					logger.debug("Skipping aggregation on time member [" + member + "]");

					continue;

				} else {

					logger.debug("Aggregating member [" + member + "]");

				}
				//END(2) - TTN-584

				List<PafDimMember> children = memberTree.getMember(member).getChildren();
				intersections.reset();

				// Process the member only if the member has children
				if (children.size() > 0) {

					// Cycle through all member intersections in data cache
					while (intersections.hasNext()) {
						// Get next member intersection
						intersection = intersections.getNext();
						// Update data cell index
						cellIndex = dataCache.updateCellIndex(cellIndex, intersectDimIndexes, intersection);
						double aggAmount = 0;
						// Determine the "Measure Type" property
						int measureIndex = cellIndex[measureAxis];
						String measure = dataCache.getDimMember(measureAxis, measureIndex);
						MeasureDef measureDef = dataCache.getMeasureDef(measure);
						MeasureType measureType = measureDef.getType();

						// Filter on valid aggregation types
						if (aggMeasureTypes.contains(measureType)) {

							// Aggregate children across selected member intersection. When aggregating 
							// across the "Time" dimension, the aggregation process must properly aggregate 
							// any measures set with the "Time Balance First" or "Time Balance Last" proptery.
							if (!isTimeAggregation || measureType == MeasureType.Aggregate){
								// Standard aggregation process - sum up children of selected member
								for (PafDimMember child:children) {
									cellIndex[aggDimIndex] = dataCache.getMemberIndex(child.getKey(), aggDimIndex);
									double cellValue = dataCache.getCellValue(cellIndex);
									aggAmount = aggAmount + cellValue;
								}
							} else if (measureType == MeasureType.TimeBalFirst)  {
								// Time Balance First - selected time dimension member equals it's first child
								PafDimMember child = children.get(0);
								cellIndex[aggDimIndex] = dataCache.getMemberIndex(child.getKey(), aggDimIndex);
								aggAmount = dataCache.getCellValue(cellIndex);												
							} else if (measureType == MeasureType.TimeBalLast) {
								// Time Balance Last - selected time dimension member equals it's last child
								PafDimMember child = children.get(children.size() - 1);
								cellIndex[aggDimIndex] = dataCache.getMemberIndex(child.getKey(), aggDimIndex);
								aggAmount = dataCache.getCellValue(cellIndex);	
							} else {
								// Invalid Measure Type - Throw IllegalArgumentException
								String errMsg = "Agg Dimension error - invalid Measure Type of [" + measureType.toString() + "] encountered.";
								logger.error(errMsg);
								IllegalArgumentException iae = new IllegalArgumentException(errMsg);
								throw iae;
							}

							// Update member total
							cellIndex[aggDimIndex] = dataCache.getMemberIndex(member, aggDimIndex);
							dataCache.setCellValueAndTrackChanges(cellIndex, aggAmount);	

						}
					}
				}	
			}

		} catch (PafException pfe) {
			// throw Paf Exception
			throw pfe;
		} catch (Exception ex) {
			// throw Paf Exception
			String errMsg = ex.getMessage();
			logger.error(errMsg);
			PafException pfe = new PafException(errMsg, PafErrSeverity.Error, ex);	
			throw pfe;
		}

		// Return aggregated data cache
		calcEnd = System.currentTimeMillis();
		float calcElapsed = (float)(calcEnd - calcStart) / 1000;
		DecimalFormat decimalFormat = new DecimalFormat("[#,##0.00]");
		String formattedTime = decimalFormat.format(calcElapsed);
		logger.debug("[" + aggDimension + "] aggregated in: " + formattedTime + " seconds") ;

		//BEGIN(3) - TTN-584
		//if time agg and open time periods exists, readd to member filter
		if ( isTimeAggregation && timeOpenPeriods.size() > 0 ) {

			memberFilters.put(timeDim, timeOpenPeriods);

		}	
		//END(3) - TTN-584

		return dataCache;
	}



	/**
	 *	Validate that array is not empty or null
	 *
	 * @param array Array to validate
	 * @param arrayName Array name
	 */
	@SuppressWarnings("unused")
	private static void validateArrayNotEmpty(boolean[] array, String arrayName) {

		// Validate that the array contains data and is the proper size
		if (array == null || array.length == 0) {
			// Empty or null array
			String errMsg = "Illegal Argument Exception: Parms error - empty or null [" + arrayName + "] array";
			logger.error(errMsg);
			IllegalArgumentException iae = new IllegalArgumentException(errMsg);    
			throw iae; 
		}
	}

	/**
	 *	Validate that array is not empty or null
	 *
	 * @param array Array to validate
	 * @param arrayName Array name
	 */
	@SuppressWarnings("unused")
	private static void validateArrayNotEmpty(int[] array, String arrayName) {

		// Validate that the array contains data and is the proper size
		if (array == null || array.length == 0) {
			// Empty or null array
			String errMsg = "Illegal Argument Exception: Parms error - empty or null [" + arrayName + "] array";
			logger.error(errMsg);
			IllegalArgumentException iae = new IllegalArgumentException(errMsg);    
			throw iae; 
		}
	}

	/**
	 *	Validate that array is not empty or null
	 *
	 * @param array Array to validate
	 * @param arrayName Array name
	 */
	@SuppressWarnings("unused")
	private static void validateArrayNotEmpty(Object[] array, String arrayName) {

		// Validate that the array contains data and is the proper size
		if (array == null || array.length == 0) {
			// Empty or null array
			String errMsg = "Illegal Argument Exception: Parms error - empty or null [" + arrayName + "] array";
			logger.error(errMsg);
			IllegalArgumentException iae = new IllegalArgumentException(errMsg);    
			throw iae; 
		}
	}

}
