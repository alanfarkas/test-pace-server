/*
 *	File: @(#)PafIntersectionIterator.java 	Package: com.palladium.paf.mdb 	Project: Essbase Provider
 *	Created: Sep 19, 2005  		By: AFarkas
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
package com.palladium.paf.mdb;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.apache.log4j.Logger;

import com.palladium.utility.StringUtils;

/**
 * Iterates through all intersections for the specified dimensions
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class PafIntersectionIterator {

	private boolean[] hasFilter = null;
	private int absoluteIndex = 0;
	private int count = 0;
	private int intersectionSize = 0;
	private int lastDim = 0;
	private int memberIndex = 0;
	private int[] dimSizes = null, intersection = null;
	private boolean[] carryFlag = null;
	private int[] memberIndexes = null;
	private Map<Integer, int[]> filterMemberIndexes = new HashMap<Integer, int []>();
	private static Logger logger = Logger.getLogger(PafIntersectionIterator.class);
	
	
	/**
	 * @param dimIndexes Index corresponding to each dimension to iterate (a subset of all data cache dimensions)
	 * @param dataCache Instance of Paf Data Cache
	 */
	public PafIntersectionIterator(int[] dimIndexes, PafDataCache dataCache) {	
		this(dimIndexes, dataCache, null);		
	}
	
	
	/**
	 * @param dimIndexes Index corresponding to each dimension to iterate (a subset of all data cache dimensions)
	 * @param dataCache Instance of Paf Data Cache
	 * @param memberFilters Map containing lists of members by dimension to filter on
	 */
	public PafIntersectionIterator(int[] dimIndexes, PafDataCache dataCache, Map<String, List<String>> memberFilters) {
		
		logger.debug("Creating instance of: " + this.getClass().getSimpleName());
		
		
		// Initialize instance variables
		intersectionSize = dimIndexes.length;
		dimSizes = new int[intersectionSize];
		hasFilter = new boolean[intersectionSize];
		carryFlag = new boolean[intersectionSize];
		lastDim = intersectionSize - 1;
		
		
		// Set iteration and filtering options on all iteration dimensions
		count = 1;
		for (int dimIndex = 0; dimIndex < intersectionSize; dimIndex++) {
			
			int axisIndex = dimIndexes[dimIndex];
			dimSizes[dimIndex] = dataCache.getAxisSize(axisIndex);
			hasFilter[dimIndex] = false;
			
			// Process any member filters
			if (memberFilters != null) {
				String dimension = dataCache.getDimension(axisIndex);
				// Process member filter for current dimension
				if (memberFilters.containsKey(dimension)){
					// Set dimension filter flag to TRUE
					hasFilter[dimIndex] = true;
					// Adjust dimension size to match number of filtered members for dimension
					List<String> memberFilter = memberFilters.get(dimension);
					int filterSize = memberFilter.size();
					dimSizes[dimIndex] = filterSize;
					// Convert list of members to their corresponding index values
					int[] memberIndexes = new int[filterSize];
					for (int i = 0; i < filterSize; i++) {
						String member = memberFilter.get(i);
						int memberIndex = dataCache.getMemberIndex(member,axisIndex);
						memberIndexes[i] = memberIndex;
					}
					// Sort and add list of indexes to internal filterMemberIndex map
					Arrays.sort(memberIndexes);
					filterMemberIndexes.put(dimIndex, memberIndexes);
				}
			}
			
			// Tabulate iteration count
			count = count * dimSizes[dimIndex];
		}
		
		
		// Check if member filter contains any undefined dimensions
		if (memberFilters != null && (memberFilters.size() != filterMemberIndexes.size())) {
			String errMsg = "IllegalArgumentException: memberFilter contains one or more dimensions not defined in the iterator";
			logger.error(errMsg);
			IllegalArgumentException iae = new IllegalArgumentException(errMsg);    
			throw iae;          					
		}
		
	}
	
		
	/**
	 * @return Return intersection count
	 */
	public int getCount() {
		return count;
	}

	
	/**
	 *	Returns true if we are at the top of the intersection queue
	 *
	 * @return True if at top of the intersection queue
	 */
	public boolean atTop() {
		
		boolean atTop = false;
		
		if (intersection == null) {
			atTop = true;
		} else {
			atTop = false;
		}
		return atTop;
	}
	
	
	/**
	 *	Get next valid intersection
	 *
	 * @return Next valid intersection
	 */
	public int[] getNext() {
		
		// If this is the first get next request than return the first valid itersection value
		if (atTop()) {
			intersection = new int[intersectionSize];
			// For any filtered dimensions, set dimension member index to first filtered member 
			for (int i = 0; i < intersectionSize; i++) {
				if (hasFilter[i]) {
					intersection[i] = filterMemberIndexes.get(i)[0];
				}
			}
			return intersection;
		}
		
		// Verify that there are more intersections to iterate through
		if (!hasNext()) {
			String errMsg = "No more intersections to iterate through - current intersection value is: "
				+ toString();
			logger.error(errMsg);
			NoSuchElementException nse = new NoSuchElementException(errMsg);
			throw nse;
		}

		
		// Initialize carry flag array
		for (int i = 0; i < intersectionSize - 1; i++) {
			carryFlag[i] = false;
		}
		
		// Increment intersection index of first dimension by 1
		carryFlag[0] = true;	
		
		// Propogate addition operation across remaining dimensions in intersection index
		for (int dimIndex = 0; dimIndex < intersectionSize; dimIndex++) {
			
			// If carry flag is set, process any pending additions to intersection index of current dimension
			if (carryFlag[dimIndex]) {	
				
				absoluteIndex = 0;
				
				// Check whether dimension has a member filter assigned to it
				if (!hasFilter[dimIndex]) {
					
					// No filter, increment intersection by 1
					absoluteIndex = intersection[dimIndex] + 1;
					intersection[dimIndex] = absoluteIndex % dimSizes[dimIndex];
					
				} else {
					
					// Filter found, process filtered member list for current dimension
					memberIndexes = filterMemberIndexes.get(dimIndex);
					memberIndex = Arrays.binarySearch(memberIndexes, intersection[dimIndex]);
					
					// Check for index failure
					if (memberIndex < 0) {
						String errMsg = "Intersection iterator error - increment failure - can't find filter member index ["
							+ intersection[dimIndex] + "] in intersection dimension [#" + dimIndex + "].";
						logger.error(errMsg);
						NoSuchElementException nse = new NoSuchElementException(errMsg);
						throw nse;							
					}
					
					// Increment intersection to next filtered member
					absoluteIndex = memberIndex + 1;
					intersection[dimIndex] = memberIndexes[absoluteIndex % dimSizes[dimIndex]];
				}				
				
				// Check for any amount to carry over into next dimension
				if (absoluteIndex >= dimSizes[dimIndex]) {
					// Check for overflow condition (should never happen0
					if(dimIndex == lastDim) {
						String errMsg = "Intersection iterator overflow error";
						logger.error(errMsg);
						NoSuchElementException nse = new NoSuchElementException(errMsg);
						throw nse;	
					}
					// Process carry to next dimension
					carryFlag[dimIndex + 1] = true;
				} else {
					// No pending carry operations - no need to visit remaining dimensions
					break;						
				}				
			}					
		}
		
		return intersection;
	}


	/**
	 *	Return itersection value.
	 *
	 * @return int[]
	 */
	public int[] getValue() {
		return intersection;
	}


	/**
	 *	Indicates if there are more member intersections to iterate through
	 *
	 * @return True if there are more member intersections to iterate through.
	 */
	public boolean hasNext() {	
		
		boolean hasNext = false;
		
		// If top of intersection queue than set "hasNext" to true
		if (atTop()) {
			hasNext = true;
		} else {		
			// Else, check each intersection member index to determine if at least
			// one index is below the uppper bound for its corresponding dimension
			for (int dimIndex = 0; dimIndex < intersectionSize; dimIndex++ ) {
				
				// Check for member filter on current dimension
				if (!hasFilter[dimIndex]) {
					// No filter on current dimension, just check index value
					if (intersection[dimIndex] < dimSizes[dimIndex] - 1) {
						hasNext = true;
						break;
					}
					
				} else {
					
					// Filter found, lookup index value for current dimension value
					memberIndexes = filterMemberIndexes.get(dimIndex);
					memberIndex = Arrays.binarySearch(memberIndexes, intersection[dimIndex]);
					
					// Check for index failure
					if (memberIndex < 0) {
						String errMsg = "Intersection iterator error - hasNext failure - can't find filter member index ["
							+ intersection[dimIndex] + "] in intersection dimension [#" + dimIndex + "].";
						logger.error(errMsg);
						NoSuchElementException nse = new NoSuchElementException(errMsg);
						throw nse;							
					}
					
					// Check if last filtered member has been reached
					if (memberIndex < dimSizes[dimIndex] - 1) {
						hasNext = true;
						break;
					}
				}
			}
		}
		
		return hasNext;
	}
	
	
	/**
	 *	Reset iterator value
	 *
	 */
	public void reset() {
		intersection = null;
	}

	
	/*
	 *	Dispaly the current PafIntersection value
	 *
	 * @see java.lang.Object#toString()
	 */
	public String toString() {

		String toString = null;
		
		if (atTop()) {
			toString =  "{top of queue}";
		} else {
			toString = StringUtils.arrayToString(intersection);
		}
		return toString;
	}


}
