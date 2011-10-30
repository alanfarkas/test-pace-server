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

import java.util.HashSet;
import java.util.Set;

import com.pace.base.PafException;
import com.pace.base.app.PafApplicationDef;
import com.pace.base.data.IPafDataCache;
import com.pace.base.data.Intersection;
import com.pace.base.state.IPafEvalState;

/**
 * This intersection just acts as a flag for evaluation logic in many ways. It takes a particular
 * intersection and substitutes the measure passed in as a parameter and replaces it in the source
 * intersection in order to retrieve a value. However it's primary value is to indicate in the
 * evaluation logic, that the "triggering intersection's coordinates are to be used here rather
 * than normal evaluation intersection. See ES_EvalDelayedInvMeasures
 *
 * @version	x.xx
 * @author jim
 *
 */


// TODO add support for multiple offset increments in next function
public class F_TriggerIntersection extends AbstractFunction {

    /* (non-Javadoc)
     * @see com.pace.base.funcs.IPafFunction#calculate(com.pace.base.data.Intersection, com.pace.base.data.IPafRoDataCache, com.pace.base.data.IPafEvalState, java.lang.String[])
     */
    public double calculate(Intersection sourceIs, IPafDataCache dataCache, IPafEvalState evalState) throws PafException {
    	double result = 0;
    	PafApplicationDef app = evalState.getAppDef();

    	Intersection dataIs = sourceIs.clone();
    	
        // usual use case is to provide a measure parameter this operation will apply to
    	if ( parms.length > 0 )
    		dataIs.setCoordinate(app.getMdbDef().getMeasureDim(), parms[0]);
    	
        result = dataCache.getCellValue(dataIs);

    	return result;
    }

	@Override
	public Set<Intersection> getTriggerIntersections(IPafEvalState evalState) throws PafException {
		// TODO Auto-generated method stub
		return new HashSet<Intersection>(0);
	}

}
