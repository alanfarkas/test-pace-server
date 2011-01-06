/*
 *	File: @(#)F_Abs.java 		Package: com.palladium.paf.funcs 	Project: Paf Base Libraries
 *	Created: Jul 24, 2007  		By: AFarkas
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
package com.palladium.paf.funcs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

import com.palladium.paf.PafException;
import com.palladium.paf.data.IPafDataCache;
import com.palladium.paf.data.Intersection;
import com.palladium.paf.state.IPafEvalState;

/**
 * "Abs" Custom Function - Returns the absolute value of the supplied version member 
* 
 * The calling signature of this function is '@Abs(version)'.
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class F_Abs extends AbstractFunction {

	private static Logger logger = Logger.getLogger(F_CrossDim.class);
		
	public double calculate(Intersection sourceIs, IPafDataCache dataCache, IPafEvalState evalState) throws PafException {

		// Get parms
		String dimension = dataCache.getVersionDim();
		String member = parms[0];
		
		// Clone current intersection
		Intersection cloneIs = sourceIs.clone();

		// Get value
		int dimCount = 1;
		for (int i = 0; i < dimCount; i++) {
			cloneIs.setCoordinate(dimension, member);
		}
				
		// Return value of cross dimensional intersection
		double result = dataCache.getCellValue(cloneIs.getCoordinates());
		return Math.abs(result);
	}

		
	/* 
	 * Return the set of intersections that might cause this function to need to re-evaulate
	 * TODO Re-arrange parsing logic and trigger logic so that this function can be called without a current member
	 */
	public Set<Intersection> getTriggerIntersections(IPafEvalState evalState) throws PafException {
		
		Set<Intersection> triggerSet = new HashSet<Intersection>();
		
		// Return set of trigger intersections
		return triggerSet;
	}

}
