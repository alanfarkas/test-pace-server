/*
 *	File: @(#)CUMCountFunc.java 		Package: com.pace.base.cf 		Project: Paf Base Libraries
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
package com.pace.ext.funcs;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.pace.base.PafException;
import com.pace.base.app.PafApplicationDef;
import com.pace.base.data.IPafDataCache;
import com.pace.base.data.Intersection;
import com.pace.base.funcs.AbstractFunction;
import com.pace.base.mdb.PafDimMember;
import com.pace.base.mdb.PafDimTree;
import com.pace.base.state.IPafEvalState;

/**
 * "CUM Count" Custom Function - Provides a count of the descendants, at the specified level, of 
 * the current intersection, and it's left peers along the specified dimension. 
 * 
 * The time dimension is used by default if no dimension parameter is supplied. 
 * The dimension floor level is used by default if no level parameter is supplied. 
 * 
 * @version	x.xx
 * @author AFarkas
 *
 */
public class CUMCountFunc extends AbstractFunction {

    public double calculate(Intersection sourceIs, IPafDataCache dataCache, IPafEvalState evalState) {
  
    	double result = 0;
    	int level = -1;
        String cumDim = null;
    	
        // Get the cum member count based on which function parameters have been supplied.
        // Default parameter handling is performed within the called CumMbrCount methods.       
        if ( parms.length == 0 ){
        	// No parameters have been supplied
        	result = dataCache.getCumMbrCount(sourceIs);
        } else {
        	// Dimension name has been supplied
        	cumDim = parms[0];
        	if ( parms.length == 1 ) {
        		result = dataCache.getCumMbrCount(sourceIs, cumDim);
        	} else {
        		// Level number has been supplied
        		level = Integer.valueOf(parms[1]);
        		result = dataCache.getCumMbrCount(sourceIs, cumDim, level);
        	}
        }

        return result;
    }
    
	@Override
	public Set<Intersection> getTriggerIntersections(IPafEvalState evalState) throws PafException {
		// TODO Auto-generated method stub
		return new HashSet<Intersection>(0);
	}

}
