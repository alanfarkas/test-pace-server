/*
 *	File: @(#)IntersectionUtil.java 	Package: com.pace.base.utility 		Project: Paf Base Libraries
 *	Created: Apr 14, 2008  				By: AFarkas
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2007 Palladium Group, Inc. All rights reserved.
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
package com.pace.base.utility;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.pace.base.data.Intersection;

/**
 * Intersection Utilities
 *
 * @version	1.00
 * @author AFarkas
 *
 */
public class IntersectionUtils {
	
	/**
	 *  Return a filtered set of intersections
	 *  
	 * @param intersections Set of intersections
	 * @param memberFilter Map of filtered dimension members
	 * 
	 * @return Set<Intersection>
	 */
	public static Set<Intersection> getFilteredIntersections(Set<Intersection> intersections, Map<String, List<String>> memberFilter) {
		
		Set<Intersection> filteredIntersections = new HashSet<Intersection>();
		for (Intersection intersection : intersections) {
			
			// Check each filtered intersection dimension
			boolean isMatch = true;
			for (String dimension : memberFilter.keySet()) {
				String member = intersection.getCoordinate(dimension);
				List<String> filteredMembers = memberFilter.get(dimension);
				if (!filteredMembers.contains(member)) {
					isMatch = false;
					break;
				}
			}
			
			// If intersection matches filter, then add to collection
			if (isMatch) {
				filteredIntersections.add(intersection);
			}
			
		}
		
		// Return filtered intersections
		return filteredIntersections;
	}

	/**
	 *  Return a filtered set of intersections
	 *  
	 * @param intersections Set of intersections
	 * @param memberFilter Map of filtered dimension members
	 * 
	 * @return Set<Intersection>
	 */
	public static Set<Intersection> getFilteredIntersections(Intersection[] intersections, Map<String, List<String>> memberFilter) {
		
		Set<Intersection> intersectionSet = new HashSet<Intersection>(Arrays.asList(intersections));
		return getFilteredIntersections(intersectionSet, memberFilter);
	}
	
}
