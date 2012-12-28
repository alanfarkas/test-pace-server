/*
 *	File: @(#)IntersectionUtil.java 	Package: com.pace.base.data 	Project: pace-base
 *	Created: Dec 18, 2012  				By: Alan Farkas
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2012 Alvarez and Marsal Software, LLC. All rights reserved.
 *
 *	This software is the confidential and proprietary information of A&M Software, LLC.
 *	("Confidential Information"). You shall not disclose such Confidential Information and 
 * 	should use it only in accordance with the terms of the license agreement you entered into
 *	with A&M Software, LLC.
 *
 *
 *
 Date			Author			Version			Changes
 xx/xx/xx		xxxxxxxx		x.xx			..............
 * 
 */
package com.pace.base.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pace.base.comm.SimpleCoordList;
import com.pace.base.mdb.AttributeUtil;
import com.pace.base.mdb.PafDataCache;
import com.pace.base.mdb.PafDimTree;
import com.pace.base.utility.IOdometer;
import com.pace.base.utility.StringOdometer;

/**
 * General purpose intersection-based utilities. 
 * 
 * If specific evaluation logic is required, the EvalUtil class should be used instead.
 *
 */
public class IntersectionUtil {


	/**
	 * Return the coordinates of the ancestor intersections above the specified intersection
	 * coordinates. 
	 * 
	 * (Attribute intersections are not supported at this time)
	 * 
	 * @param cords Intersection coordinates
	 * @param dataCache Data cache
	 * 
	 * @return ArrayList of coordinates for each ancestor intersection
	 */
	public static List<String[]> buildAncestorIsCoords(String[] coords, PafDataCache dataCache) {

		List<String[]> ancestorIsCoords = null;
		if (dataCache.isBaseIntersection(coords)) {
			ancestorIsCoords = buildBaseAncestorIsCoords(coords, dataCache);
		} else {
			//TODO Create AttributeUtil.buildAncestorIsCoords
//			ancestorIsCoords = AttributeUtil.buildAncestorIsCoords(is, dataCache);
			String errMsg = "Attribute intersections are not currently supported by 'buildAncestorIsCoords()'";
			throw new IllegalArgumentException(errMsg);
		}
		return ancestorIsCoords;
	}


	/**
	 * Return the coordinates of the ancestor intersections above the specified base intersection
	 * coordinates. 
	 * 
	 * (Attribute intersections are not supported at this time)
	 * 
	 * @param cords Intersection coordinates
	 * @param dataCache Data cache
	 * 
	 * @return ArrayList of coordinates for each ancestor intersection
	 */
	public static List<String[]> buildBaseAncestorIsCoords(String[] coords, PafDataCache dataCache) {

		List<String[]> ancestorIsCoords = new ArrayList<String[]>();
		Map<String, List<String>> memberListMap = new HashMap<String, List<String>>();
	    final String timeDim = dataCache.getTimeDim(); 
	    final String yearDim = dataCache.getYearDim(); 
	    final int timeAxis = dataCache.getTimeAxis(), yearAxis = dataCache.getYearAxis();
		final MemberTreeSet clientTrees = dataCache.getDimTrees();
		final PafDimTree timeHorizonTree = clientTrees.getTree(dataCache.getTimeHorizonDim());
		final String[] baseDims = dataCache.getBaseDimensions();
		
		// Collate the list of ancestors in each dimension. The original coordinate
		// needs to be included as well, in order to get all ancestor intersections.
		for (String dim : baseDims) {
			
			List<String> ancestorList = new ArrayList<String>();
			
	       	// Time dimension - use time horizon tree
	    	if (dim.equals(timeDim)) {
	    		String timeHorizCoord = TimeSlice.buildTimeHorizonCoord(coords, dataCache);
	    		ancestorList.add(timeHorizCoord);
	    		ancestorList.addAll(PafDimTree.getMemberNames(timeHorizonTree.getAncestors(timeHorizCoord)));
	    		memberListMap.put(dim, ancestorList);
	    		continue;
	    	}
	
	    	// Year dimension - use time horizon default year member
		    if (dim.equals(yearDim)) {
		    	ancestorList.add(TimeSlice.getTimeHorizonYear());
	    		memberListMap.put(dim, ancestorList);
	    		continue;
	    	}
	    	
	    	// All other dimensions - use corresponding tree to get the coordinate's ancestors
			String coord = coords[dataCache.getAxisIndex(dim)];
			PafDimTree dimTree = clientTrees.getTree(dim);
			ancestorList.add(coord);
			ancestorList.addAll(PafDimTree.getMemberNames(dimTree.getAncestors(coord)));
			memberListMap.put(dim, ancestorList);
		}
		
		// Build ancestor intersections
		ancestorIsCoords = IntersectionUtil.buildIsCoordList(memberListMap, baseDims);
		
	    // Translate time horizon coordinates back into regular time & year coordinates
	    ancestorIsCoords = translateTimeHorizonCoords(ancestorIsCoords, dataCache);
	    
	    // Remove original intersection from set of ancestors
		ancestorIsCoords.remove(coords);
		
		// Return ancestor intersections
		return ancestorIsCoords;
	}


	/**
	 * Return the ancestor intersections above the specified intersection. 
	 * 
	 * (Attribute intersections are not supported at this time)
	 * 
	 * @param is Intersection
	 * @param dataCache Data cache
	 * 
	 * @return ArrayList of ancestor intersections
	 */
	public static List<Intersection> buildAncestorIntersections(Intersection is, PafDataCache dataCache) {

		List<Intersection> ancestorIntersections = null;
		if (dataCache.isBaseIntersection(is)) {
			ancestorIntersections = buildBaseAncestorIntersections(is, dataCache);
		} else {
			//TODO Create AttributeUtil.buildAncestorIntersections
//			ancestorIntersections = AttributeUtil.buildAncestorIntersections(is, dataCache);
			String errMsg = "Attribute intersections are not currently supported by 'buildAncestorIntersections()'";
			throw new IllegalArgumentException(errMsg);
		}
		return ancestorIntersections;
	}

	
	/**
	 * Return the specified base intersection's ancestor intersections. 
	 * 
	 * @param is Base (non-attribute) intersection
	 * @param dataCache Data Cache
	 * 
	 * @return List of ancestor intersections
	 */
	public static List<Intersection> buildBaseAncestorIntersections(Intersection is, PafDataCache dataCache) {
		
		List<Intersection> ancestorIntersections = new ArrayList<Intersection>();
	    String timeDim = dataCache.getTimeDim(); 
	    String yearDim = dataCache.getYearDim(); 
		MemberTreeSet clientTrees = dataCache.getDimTrees();
		PafDimTree timeHorizonTree = clientTrees.getTree(dataCache.getTimeHorizonDim());			
		Map<String, List<String>> memberListMap = new HashMap<String, List<String>>();
		
		// Collate the list of ancestors in each dimension. The original coordinate
		// needs to be included as well, in order to get all ancestor intersections.
		String[] dimensions = is.getDimensions();
		for (String dim : dimensions) {
			
			List<String> ancestorList = new ArrayList<String>();
			
	       	// Time dimension - use time horizon tree
	    	if (dim.equals(timeDim)) {
	    		String timeHorizCoord = TimeSlice.buildTimeHorizonCoord(is.getCoordinate(timeDim), is.getCoordinate(yearDim));
	    		ancestorList.add(timeHorizCoord);
	    		ancestorList.addAll(PafDimTree.getMemberNames(timeHorizonTree.getAncestors(timeHorizCoord)));
	    		memberListMap.put(dim, ancestorList);
	    		continue;
	    	}
	
	    	// Year dimension - use time horizon default year member
		    if (dim.equals(yearDim)) {
		    	ancestorList.add(TimeSlice.getTimeHorizonYear());
	    		memberListMap.put(dim, ancestorList);
	    		continue;
	    	}
	    	
	    	// All other dimensions - use corresponding tree to get the coordinate's ancestors
			String coord = is.getCoordinate(dim);
			PafDimTree dimTree = clientTrees.getTree(dim);
			ancestorList.add(coord);
			ancestorList.addAll(PafDimTree.getMemberNames(dimTree.getAncestors(coord)));
			memberListMap.put(dim, ancestorList);
		}
		
		// Build ancestor intersections
		ancestorIntersections = IntersectionUtil.buildIntersections(memberListMap, dimensions);
		
	    // Translate time horizon coordinates back into regular time & year coordinates
	    ancestorIntersections = translateTimeHorizonIntersections(ancestorIntersections, dataCache);
	    
	    // Remove original intersection from set of ancestors
		ancestorIntersections.remove(is);
		
		// Return ancestor intersections
		return ancestorIntersections;
	}




	/**
	 * Return the coordinates of the floor intersections beneath the specified intersection
	 * 
	 * @param is Intersection
	 * @param dataCache Data cache
	 * 
	 * @return ArrayList of floor intersections coordinates
	 */
	public static List<String[]> buildFloorIsCoords(Intersection is, PafDataCache dataCache) {

		List<String[]> floorIsCoords = null;
		if (dataCache.isBaseIntersection(is)) {
			floorIsCoords = buildBaseFloorIsCoords(is, dataCache);
		} else {
			floorIsCoords = AttributeUtil.buildAttrFloorIsCoords(is, dataCache);
		}
		return floorIsCoords;
	}


	/**
	 * Return the coordinates of the floor intersections beneath the specified base intersection
	 * 
	 * @param is Base (non-attribute) intersection
	 * @param dataCache Data Cache
	 * 
	 * @return List of floor intersections
	 */
	public static List<String[]> buildBaseFloorIsCoords(Intersection is, PafDataCache dataCache) {
	
	    // Build floor intersection coordinate list
	    Map<String, List<String>> memberListMap = buildBaseFloorMemberMap(is, dataCache);
	    List<String[]> floorIsCoords =  buildIsCoordList(memberListMap, is.getDimensions());
	    
	    // Translate time horizon coordinates back into regular time & year coordinates
	    floorIsCoords = translateTimeHorizonCoords(floorIsCoords, dataCache);
	    
	    // Return the floor intersections
	    return floorIsCoords;
	}

	/**
	 * Return the coordinates of the floor intersections beneath the specified base intersection
	 * 
	 * @param coords Base (non-attribute) intersection coordinates
	 * @param dataCache Data Cache
	 * 
	 * @return List of floor intersections
	 */
	public static List<String[]> buildBaseFloorIsCoords(String[] coords, PafDataCache dataCache) {
	
	    // Build floor intersection coordinate list
	    Map<String, List<String>> memberListMap = buildBaseFloorMemberMap(coords, dataCache);
	    List<String[]> floorIsCoords =  buildIsCoordList(memberListMap, dataCache.getBaseDimensions());
	    
	    // Translate time horizon coordinates back into regular time & year coordinates
	    floorIsCoords = translateTimeHorizonCoords(floorIsCoords, dataCache);
	    
	    // Return the floor intersections
	    return floorIsCoords;
	}


	/**
	 * Return the floor intersections beneath the specified intersection
	 * 
	 * @param is Intersection
	 * @param dataCache Data cache
	 * 
	 * @return ArrayList of floor intersections
	 */
	public static List<Intersection> buildFloorIntersections(Intersection is, PafDataCache dataCache) {
		
		List<Intersection> floorIntersections = null;
		if (dataCache.isBaseIntersection(is)) {
			floorIntersections = buildBaseFloorIntersections(is, dataCache);
		} else {
			floorIntersections = AttributeUtil.buildAttrFloorIntersections(is, dataCache);
		}
		return floorIntersections;
		
	}


	/**
	 * Return the specified base intersection's descendant floor intersections
	 * 
	 * @param is Base (non-attribute) intersection
	 * @param dataCache Data Cache
	 * 
	 * @return List of floor intersections
	 */
	public static List<Intersection> buildBaseFloorIntersections(Intersection is, PafDataCache dataCache) {

	    // Build floor intersections
	    Map<String, List<String>> memberListMap = buildBaseFloorMemberMap(is, dataCache);
	    List<Intersection> floorIntersections = buildIntersections(memberListMap, is.getDimensions());
	    
	    // Translate time horizon coordinates back into regular time & year coordinates
	    floorIntersections = translateTimeHorizonIntersections(floorIntersections, dataCache);
	    
	    // Return the floor intersections
	    return floorIntersections;
	}


	/**
	 * Build the member map that represents the union of all coordinates representing the specified 
	 * base intersection's floor intersections
	 * 
	 * @param is Base (non-attribute) intersection
	 * @param dataCache Data Cache
	 * 
	 * @return Map of members by dimension
	 */
	private static Map<String, List<String>> buildBaseFloorMemberMap(Intersection is, PafDataCache dataCache) {
		return buildBaseFloorMemberMap(is.getCoordinates(), dataCache);
	}

	/**
	 * Build the member map that represents the union of all coordinates representing the specified 
	 * base intersection's floor intersections
	 * 
	 * @param coords Base (non-attribute) intersection coordinates
	 * @param dataCache Data Cache
	 * 
	 * @return Map of members by dimension
	 */
	private static Map<String, List<String>> buildBaseFloorMemberMap(String[] coords, PafDataCache dataCache) {

		final MemberTreeSet clientTrees = dataCache.getDimTrees();
	    final String timeDim = dataCache.getTimeDim(); 
	    final String yearDim = dataCache.getYearDim(); 
		final PafDimTree timeHorizonTree = clientTrees.getTree(dataCache.getTimeHorizonDim());	
		final String[] baseDims = dataCache.getBaseDimensions();
	    Map<String, List<String>> memberListMap = new HashMap<String, List<String>>();
	    List<String> memberList;
	    
	     
	    // Get floor members of each dimension. Use time horizon tree for time/year explosion.
	    for (String dim : baseDims) {
	
	       	// Time dimension - use time horizon tree
	    	if (dim.equals(timeDim)) {
	    		String timeHorizCoord = TimeSlice.buildTimeHorizonCoord(coords, dataCache);
	    		memberList = timeHorizonTree.getLowestMemberNames(timeHorizCoord);
	    		memberListMap.put(dim, memberList);
	    		continue;
	    	}
	
	    	// Year dimension - use time horizon default year member
		    if (dim.equals(yearDim)) {
	    		memberList = Arrays.asList(new String[]{TimeSlice.getTimeHorizonYear()});
	    		memberListMap.put(dim, memberList);
	    		continue;
	    	}
	    	
	    	// All other dimensions - just add the lowest members under branch. This 
		    // tree method will return the member itself if it has no children.
	    	PafDimTree tree = clientTrees.getTree(dim);
	    	memberList = tree.getLowestMemberNames(coords[dataCache.getAxisIndex(dim)]);
	     	memberListMap.put(dim, memberList);
	    }
	
		return memberListMap;
	}


	/**
	 *	Return an iterator that will generate the coordinates of the corresponding 
	 *  descendant floor intersections for the specified base intersection.
	 *  	 
	 *  NOTE: 
	 *  
	 *  The returned iterator will generate time horizon coordinates. These must be
	 *  converted back to time and year coordinates
	 * 
	 * 
	 * @param is Base (non-attribute) intersection
	 * @param dataCache Data Cache
	 * 
	 * @return IOdometer
	 */
	public static IOdometer explodeBaseIntersection(Intersection is, PafDataCache dataCache) {
	
	    // Build floor intersections
	    Map<String, List<String>> memberListMap = buildBaseFloorMemberMap(is, dataCache);
	    IOdometer floorCoordIterator = new StringOdometer(memberListMap, is.getDimensions());
	    return floorCoordIterator;
	}


	/**
	 * Build a list of intersection coordinates that represents all possible combinations of the supplied member lists
	 * 
	 * @param memberLists Member lists by dimension
	 * @param axisSequence Sorted list of dimensions
	 * 
	 * @return List of intersection coordinates
	 */
	public static List<String[]> buildIsCoordList(Map<String, List<String>> memberLists, String[] axisSequence) {

		@SuppressWarnings("unchecked")
		ArrayList<String>[] memberArrays = new ArrayList[memberLists.size()];
		int i = 0;

		for (String axis : axisSequence) {         
			memberArrays[i++] = new ArrayList<String>(memberLists.get(axis));
		}

		StringOdometer odom = new StringOdometer(memberArrays);
		List<String[]> isCoordList = buildIsCoordList(odom, axisSequence);

		return isCoordList;
	}
	

	/**
	 * Build a list of intersection coordinates using the supplied odometer to generate each intersection's coordinates
	 * 
	 * @param coordOdometer Odometer that will iterate through each set of intersection coordinates
	 * @param dimensions The dimensions that will be used to construct each intersection
	 * 
	 * @return List of intersection coordinates
	 */
	public static List<String[]> buildIsCoordList(StringOdometer coordOdometer, String[] dimensions) {
		
		List<String[]> isCoordList = new ArrayList<String[]>(coordOdometer.getCount());
		while (coordOdometer.hasNext()) {
			isCoordList.add(coordOdometer.nextValue());
		}
		
		return isCoordList;
	}


	/**
	 * Build a list of intersections that represents all possible combinations of the supplied member lists
	 * 
	 * @param memberLists Member lists by dimension
	 * @param axisSequence Sorted list of dimensions
	 * 
	 * @return List of intersections
	 */
	public static List<Intersection> buildIntersections(Map<String, List<String>> memberLists, String[] axisSequence) {

		@SuppressWarnings("unchecked")
		ArrayList<String>[] memberArrays = new ArrayList[memberLists.size()];
		int i = 0;

		for (String axis : axisSequence) {         
			memberArrays[i++] = new ArrayList<String>(memberLists.get(axis));
		}

		StringOdometer odom = new StringOdometer(memberArrays);
		List<Intersection> intersections = buildIntersections(odom, axisSequence);

		return intersections;
	}
	
	
	/**
	 * Build a list of intersections using the supplied odometer to generate each intersection's coordinates
	 * 
	 * @param coordOdometer Odometer that will iterate through each set of intersection coordinates
	 * @param dimensions The dimensions that will be used to construct each intersection
	 * 
	 * @return List of intersections
	 */
	public static List<Intersection> buildIntersections(StringOdometer coordOdometer, String[] dimensions) {
		
		List<Intersection> intersections = new ArrayList<Intersection>(coordOdometer.getCount());
		while (coordOdometer.hasNext()) {
			Intersection is = new Intersection(dimensions, coordOdometer.nextValue());
			intersections.add(is);
		}
		
		return intersections;
	}


	/**
	 * Translate the time horizon coordinates, in the supplied list of intersection coordinates, into time/year coordinates
	 * 
	 * @param isCoordList List of data cache intersection coordinates
	 * @param dataCache Data cache 
	 * 
	 * @return List of translated intersection coordinates
	 */
	public static List<String[]> translateTimeHorizonCoords(List<String[]> isCoordList, PafDataCache dataCache) {
		
	    // Convert time horizon intersections back to time/year intersections 
	    int timeAxis = dataCache.getTimeAxis(), yearAxis = dataCache.getYearAxis();
	    for (String[] coords : isCoordList) {
	    	TimeSlice.translateTimeHorizonCoords(coords, timeAxis, yearAxis);
	    }
	    
	    // Return translated intersections
	    return isCoordList;
	}


	/**
	 * Translate the time horizon coordinates, in the supplied list of intersections, into time/year coordinates
	 * 
	 * @param intersections List of data cache intersections
	 * @param dataCache Data cache 
	 * 
	 * @return List of translated intersections
	 */
	public static List<Intersection> translateTimeHorizonIntersections(List<Intersection> intersections, PafDataCache dataCache) {
		
	    // Convert time horizon intersections back to time/year intersections 
	    int timeAxis = dataCache.getTimeAxis(), yearAxis = dataCache.getYearAxis();
	    for (Intersection is : intersections) {
	    	TimeSlice.translateTimeHorizonCoords(is.getCoordinates(), timeAxis, yearAxis);
	    }
	    
	    // Return translated intersections
	    return intersections;
	}


	/**
	 * Convert a collection of "like" intersections to a simple coordinate list
	 * 
	 * @param intersections List of intersections
	 * @return SimpleCoordList
	 */
	public static SimpleCoordList convertIntersectionsToSimpleCoordList(Collection<Intersection> intersections) {
		
		boolean isFirstIs = true;
		String[] dimensions = null;
		List<String> coordList = new ArrayList<String>();
		

		// Iterate through all intersections and assemble all coordinates into a single list
		for (Intersection intersection : intersections) {
			
			// Get list of dimensions (assume that all intersections have the same dimensionality)
			if (isFirstIs) {
				dimensions = intersection.getDimensions();
				isFirstIs = false;
			}
			
			// Get intersections coordinates
			coordList.addAll(Arrays.asList(intersection.getCoordinates()));		
		}

		// Construct and return the SimpleCoordList
		SimpleCoordList simpleCoordList = new SimpleCoordList(dimensions, coordList.toArray(new String[0]));
		return simpleCoordList;
	}


	/**
	 * Convert a list of "like" intersection coordinates to a simple coordinate list
	 * 
	 * @param dimensions Intersection dimensions
	 * @param isCoordList List of each intersection's coordinates
	 * 
	 * @return SimpleCoordList
	 */
	public static SimpleCoordList convertIsCoordListToSimpleCoordList(String[] dimensions, Collection<String[]> isCoordsList) {

		List<String> coordList = new ArrayList<String>();
		
		// Iterate through all intersections and assemble all coordinates into a single list
		for (String[] coords : isCoordsList) {
			coordList.addAll(Arrays.asList(coords));		
		}

		// Construct and return the SimpleCoordList
		SimpleCoordList simpleCoordList = new SimpleCoordList(dimensions, coordList.toArray(new String[0]));
		return simpleCoordList;
	}

	
}
