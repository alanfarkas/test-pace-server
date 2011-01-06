/*
 *	File: @(#)CUMCountFunc.java 		Package: com.palladium.paf.cf 		Project: Paf Base Libraries
 *	Created: April 10, 2006  	By: Alan Farkas
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
package com.palladium.paf.cf;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.palladium.paf.PafException;
import com.palladium.paf.app.PafApplicationDef;
import com.palladium.paf.data.IPafDataCache;
import com.palladium.paf.data.Intersection;
import com.palladium.paf.funcs.AbstractFunction;
import com.palladium.paf.mdb.PafDimMember;
import com.palladium.paf.mdb.PafDimTree;
import com.palladium.paf.state.IPafEvalState;

/**
 * "CUM Count" Custom Function - Provides a count of the level 0 members up to and including the current 
 * intersection member, in the specified dimension. If no dimension is used, then the time dimension is
 * used by default.
 * 
 * @version	x.xx
 * @author AFarkas
 *
 */
public class CUMCountFunc extends AbstractFunction {

    public double calculate(Intersection sourceIs, IPafDataCache dataCache, IPafEvalState evalState) {
  
    	double result = 0;
    	int level = 0;
        PafApplicationDef app = evalState.getAppDef();
        String cumDim = null;
    	
       	// Determine which dimension is being accumulated
    	if ( parms.length > 0 ){
    		// TODO Check if valid dimension is specified
    		cumDim = parms[0];
    	} else {
    		cumDim = app.getMdbDef().getTimeDim();
    	}

       	PafDimTree cumTree = evalState.getDataCacheTrees().getTree(cumDim);
    	
       	// Check for level option
    	if ( parms.length > 1 ){
    		// TODO Check for valid integer / maybe default level to lowest level in tree
    		level = Integer.valueOf(parms[1]);
    	} else {
    		// If no level specified, then default to lowest level in localized time tree
    		level = cumTree.getLowestAbsLevelInTree();
    	}

       	// Get list of cum members for the specified level

       	String currentMember = sourceIs.getCoordinate(cumDim);
       	List<PafDimMember> cumMembers = cumTree.getCumMembers(currentMember, level);
       	
    	// Return "cumulative count" (number of cum members)
       	result = cumMembers.size();
        return result;
    }
    
	@Override
	public Set<Intersection> getTriggerIntersections(IPafEvalState evalState) throws PafException {
		// TODO Auto-generated method stub
		return new HashSet<Intersection>(0);
	}

}
