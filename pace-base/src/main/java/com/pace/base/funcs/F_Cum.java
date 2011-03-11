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
import java.util.List;
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
 * Implements a cumulative function. It totals up all the intersections along a particular
 * dimensional axis. The default axis is the time diemnsion
 *
 * @version	x.xx
 * @author jim
 *
 */


public class F_Cum extends AbstractFunction {
	Map<String, Set<String>> filterMap = new HashMap<String, Set<String>>(); 
	
    public double calculate(Intersection sourceIs, IPafDataCache dataCache, IPafEvalState evalState) throws PafException {
    	double result = 0;
    	PafApplicationDef app = evalState.getAppDef();

    	Intersection dataIs = sourceIs.clone();
    	
        // usual use case is to provide a measure parameter this operation will apply to
    	if ( parms.length > 0 )
    		dataIs.setCoordinate(app.getMdbDef().getMeasureDim(), parms[0]);
    	
        // by default this accumulates values along the time dimension, however the dimension
        // of accumulation can be altered.
    	String offsetDim;
    	if (parms.length > 1 ) 
    		offsetDim = parms[1];
    	else 
    		offsetDim = app.getMdbDef().getTimeDim();
    	
        
    	// get all members at the current level of the current intersection
    	PafDimTree offsetTree = evalState.getDataCacheTrees().getTree(offsetDim);
    	PafDimMember curMbr = offsetTree.getMember(dataIs.getCoordinate(offsetDim));
        List<PafDimMember> peers = offsetTree.getMembersAtLevel(offsetTree.getRootNode().getKey(), (short) curMbr.getMemberProps().getLevelNumber());
        
        // add the value at this intersection to the running total 1st
        result += dataCache.getCellValue(dataIs.getCoordinates());
        
        // add all previous values
        for (PafDimMember peer : peers) {
            if (peer.getKey().equals(curMbr.getKey())) break;
            dataIs.setCoordinate(offsetDim, peer.getKey());
            result += dataCache.getCellValue(dataIs.getCoordinates());
        }
	
    	return result;
    }
    

	/**
	 *	This method augments the normal dependency logic in a formula. In this case a dependency being changed
	 *  causes all intersections corresponding to the result term in the rule rolling forward to also be
	 *  recalculated.
	 * @param evalState
	 *
	 * @return Set of intersection objects
	 */
	public Set<Intersection> getTriggerIntersections(IPafEvalState evalState) {	
		
		// this function forces the recalculation of all subsequent intersections involving
		// the measure on the left hand side of this rule and time periods subsequent to the 
		// current time period
		
		String measureName = this.getMeasureName();	
        String timeDim = evalState.getAppDef().getMdbDef().getTimeDim();


		
		// if their has been a receipt change prior to this time slice, also evaluate
		// the left hand measure in the intersection = (curent msr, cur ts, rcptchg1, rcptchg2...)
		// .or pretend their is a change in the current time period for the measure so that the
		// cumulative recalcs in this period
		Set<Intersection> chngBaseMsrs = evalState.getChangedCellsByMsr().get(measureName);
		Set<Intersection> iSet = null;
		
		Intersection currentChange;
		if (chngBaseMsrs != null) {
			iSet = new HashSet<Intersection>( chngBaseMsrs.size() * 2);
			for (Intersection is : chngBaseMsrs) {
				currentChange = is.clone();
				currentChange.setCoordinate(timeDim, evalState.getCurrentTimeSlice());
				iSet.add(currentChange);
			}
		}
		else {
			iSet = new HashSet<Intersection>(0);
		}

		return iSet;                           
		
	}

}
