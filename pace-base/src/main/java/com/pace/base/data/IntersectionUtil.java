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
import com.pace.base.utility.StringOdometer;

/**
 * General purpose intersection-based utilities. 
 * 
 * If specific evaluation logic is required, the EvalUtil class should be used instead.
 *
 */
public class IntersectionUtil {

	/**
	 * Return the ancestor intersections above the specified intersection. If there are no ancestors
	 * then the original intersection will be returned.
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
	 * Return the specified base intersection's ancestor intersections. If there are no ancestors
	 * then the original intersection will be returned.
	 * 
	 * @param is Base (non-attribute) intersection
	 * @param dataCache Data Cache
	 * 
	 * @return List of ancestor intersections
	 */
	public static List<Intersection> buildBaseAncestorIntersections(Intersection is, PafDataCache dataCache) {
		
		List<Intersection> ancestorIntersections = new ArrayList<Intersection>();
		Map<String, List<String>> memberMap = new HashMap<String, List<String>>();
		MemberTreeSet clientTrees = dataCache.getDimTrees();
		
		// Collate the list of ancestors in each dimension. The original coordinate
		// needs to be included as well, in order to get all ancestor intersections.
		String[] dimensions = is.getDimensions();
		for (String dim : dimensions) {
			String coord = is.getCoordinate(dim);
			PafDimTree dimTree = clientTrees.getTree(dim);
			List<String> ancestors = new ArrayList<String>();
			ancestors.add(coord);
			ancestors.addAll(PafDimTree.getMemberNames(dimTree.getAncestors(coord)));
			memberMap.put(dim, ancestors);
		}
		
		// Build ancestor intersections, making sure that original intersection
		// isn't included.
		ancestorIntersections = IntersectionUtil.buildIntersections(memberMap, dimensions);
		ancestorIntersections.remove(is);
		
		// Return ancestor intersections
		return ancestorIntersections;
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

		MemberTreeSet clientTrees = dataCache.getDimTrees();
	    String timeDim = dataCache.getTimeDim(); 
	    String yearDim = dataCache.getYearDim(); 
		PafDimTree timeHorizonTree = clientTrees.getTree(dataCache.getTimeHorizonDim());			
	    Map<String, List<String>> memberListMap = new HashMap<String, List<String>>();
	    List<String> memberList;
	    
	     
	    // Get floor members of each dimension. Use time horizon tree for time/year explosion.
	    for (String dim : is.getDimensions()) {
	
	       	// Time dimension - use time horizon tree
	    	if (dim.equals(timeDim)) {
	    		String timeHorizCoord = TimeSlice.buildTimeHorizonCoord(is.getCoordinate(timeDim), is.getCoordinate(yearDim));
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
	    	memberList = tree.getLowestMemberNames(is.getCoordinate(dim));
	     	memberListMap.put(dim, memberList);
	    }
	
	    // Build floor intersections
	    List<Intersection> floorIntersections =  buildIntersections(memberListMap, is.getDimensions());
	    
	    // Translate time horizon coordinates back into regular time & year coordinates
	    floorIntersections = translateTimeHorizonCoordinates(floorIntersections, dataCache);
	    
	    // Return the floor intersections
	    return floorIntersections;
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
	 * Translate the time horizon coordinates, in the supplied list of intersections, into time/year coordinates
	 * 
	 * @param intersections List of data cache intersections
	 * @param dataCache Data cache 
	 * 
	 * @return List of translated intersections
	 */
	public static List<Intersection> translateTimeHorizonCoordinates(List<Intersection> intersections, PafDataCache dataCache) {
		
	    // Convert time horizon intersections back to time/year intersections 
	    int timeAxis = dataCache.getTimeAxis(), yearAxis = dataCache.getYearAxis();
	    for (Intersection floorIs : intersections) {
	    	TimeSlice.translateTimeHorizonCoords(floorIs.getCoordinates(), timeAxis, yearAxis);
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


}
