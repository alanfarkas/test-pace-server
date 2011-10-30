/*
 *	File: @(#)ParsedFunction.java 	Package: com.pace.base.funcs 	Project: Paf Base Libraries
 *	Created: Aug 16, 2006  		By: jim
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

import java.util.Set;

import com.pace.base.PafErrSeverity;
import com.pace.base.PafException;
import com.pace.base.data.IPafDataCache;
import com.pace.base.data.Intersection;
import com.pace.base.state.IPafEvalState;

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author jim
 *
 */
public class ParsedFunction extends AbstractFunction {

	public ParsedFunction(String functionString) {
		this.parseParameters(functionString);
	}
	
	/* (non-Javadoc)
	 * @see com.pace.base.funcs.AbstractFunction#calculate(com.pace.base.data.Intersection, com.pace.base.data.IPafRoDataCache, com.pace.base.state.IPafEvalState, java.lang.String[])
	 */
	@Override
	public double calculate(Intersection sourceIs, IPafDataCache dataCache,
			IPafEvalState evalState) throws PafException {
		throw new PafException("Can't calculate a Parsed Function. This function has not been converted into a concrete funtion.", PafErrSeverity.Warning);
	}

	@Override
	public Set<Intersection> getTriggerIntersections(IPafEvalState evalState) throws PafException {
		// TODO Auto-generated method stub
		return null;
	}


}
