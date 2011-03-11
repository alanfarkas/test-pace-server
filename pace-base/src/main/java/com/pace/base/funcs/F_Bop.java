/*
 *	File: @(#)F_Next.java 	Package: com.pace.base.funcs 	Project: Paf Base Libraries
 *	Created: Mar 21, 2006  		By: jim
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
package com.pace.base.funcs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.pace.base.PafException;
import com.pace.base.app.PafApplicationDef;
import com.pace.base.data.IPafDataCache;
import com.pace.base.data.Intersection;
import com.pace.base.mdb.PafDimMember;
import com.pace.base.mdb.PafDimTree;
import com.pace.base.state.IPafEvalState;

/**
 * Implements a next function. It looks up the value of the a particular intersection in the datacache
 * ie. @Next(BOP_DLR, Time, 1)
 * would return the value of at the intersection, that starts at the source intersection, but is invoked
 * for the measure BOP_DLR, and is offset in the Time dimension + 1
 *
 * @version	x.xx
 * @author jim
 *
 */

// TODO add support for multiple offset increments in next function
public class F_Bop extends AbstractFunction {
	Map<String, Set<String>> filterMap = new HashMap<String, Set<String>>(); 
	public double calculate(Intersection sourceIs, IPafDataCache dataCache, IPafEvalState evalState) throws PafException {
    	double result;
    	PafApplicationDef app = evalState.getAppDef();

    	Intersection dataIs = sourceIs.clone();
    	
        
    	if ( parms.length > 0 )
    		dataIs.setCoordinate(app.getMdbDef().getMeasureDim(), parms[0]);
    	
    	String offsetDim;
    	if (parms.length > 1 ) 
    		offsetDim = parms[1];
    	else 
    		offsetDim = app.getMdbDef().getTimeDim();
    	
        
    	PafDimTree offsetTree = evalState.getDataCacheTrees().getTree(offsetDim);
        PafDimMember firstMbr = offsetTree.getLowestLevelMembers().get(0);

		dataIs.setCoordinate(offsetDim, firstMbr.getKey());
		result = dataCache.getCellValue(dataIs.getCoordinates());

    	return result;
    }

	@SuppressWarnings("unused")
	@Override
	public Set<Intersection> getTriggerIntersections(IPafEvalState evalState) throws PafException {

		String msrDim = evalState.getAppDef().getMdbDef().getMeasureDim(); 
		String timeDim = evalState.getAppDef().getMdbDef().getTimeDim();
		filterMap.put(msrDim, new HashSet<String>());
		filterMap.put(timeDim, new HashSet<String>()); 

		filterMap.get(timeDim).add(evalState.getFirstTimeSlice()); 
		filterMap.get(msrDim).add(this.measureName); 

		Set<Intersection> iSet;
		iSet = findIntersections(filterMap, evalState.getCurrentChangedCells()); 
		return iSet;

	}
    

}
