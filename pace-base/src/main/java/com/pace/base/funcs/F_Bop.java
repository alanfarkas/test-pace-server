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
import com.pace.base.data.TimeSlice;
import com.pace.base.mdb.PafDimMember;
import com.pace.base.mdb.PafDimTree;
import com.pace.base.state.IPafEvalState;

/**
 * Implements a beginning of period function for the specified measure and 
 * dimension. ie. @BOP(SLS_DLR, Time)
 * 
 * This function would return the intersection for SLS_DLR that is at the first
 * floor member, within the current UOW, of the Time dimension (or whatever
 * dimension is supplied).
 * 
 * Other dimensions besides Time can be supplied to this function. If no
 * dimension is supplied, then the Time dimension will be used by default.
 * 
 * @version x.xx
 * @author jim
 * 
 */

public class F_Bop extends AbstractFunction {

	Map<String, Set<String>> filterMap = new HashMap<String, Set<String>>();

	public double calculate(Intersection sourceIs, IPafDataCache dataCache,
			IPafEvalState evalState) throws PafException {

		double result;
		PafApplicationDef app = evalState.getAppDef();

		Intersection dataIs = sourceIs.clone();

		if (parms.length > 0)
			dataIs.setCoordinate(app.getMdbDef().getMeasureDim(), parms[0]);

		String offsetDim;
		if (parms.length > 1)
			offsetDim = parms[1];
		else
			offsetDim = app.getMdbDef().getTimeDim();

		dataIs = dataCache.getFirstFloorIs(dataIs, offsetDim);
		result = dataCache.getCellValue(dataIs);

		return result;
	}

	@Override
	public Set<Intersection> getTriggerIntersections(IPafEvalState evalState)
			throws PafException {

		String msrDim = evalState.getAppDef().getMdbDef().getMeasureDim();
		String timeDim = evalState.getTimeDim();
		filterMap.put(msrDim, new HashSet<String>());
		filterMap.put(timeDim, new HashSet<String>());

		// Return all intersections that match current measure
		filterMap.get(msrDim).add(this.measureName);

		// ... and first time slice in uow. Since time slice is 
		// comprised of a time and year component, these need 
		// to be set separately (TTN-1595).
		// filterMap.get(timeDim).add(evalState.getFirstTimeSlice());
		String yearDim = evalState.getAppDef().getMdbDef().getYearDim();
		filterMap.put(yearDim, new HashSet<String>());
		TimeSlice firstTimeSlice = new TimeSlice(evalState.getFirstTimeSlice());
		filterMap.get(timeDim).add(firstTimeSlice.getPeriod());
		filterMap.get(yearDim).add(firstTimeSlice.getYear());

		Set<Intersection> iSet;
		iSet = findIntersections(filterMap, evalState.getCurrentChangedCells(),
				evalState);
		return iSet;

	}

}
