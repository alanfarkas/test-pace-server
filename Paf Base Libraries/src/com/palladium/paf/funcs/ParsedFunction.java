/*
 *	File: @(#)ParsedFunction.java 	Package: com.palladium.paf.funcs 	Project: Paf Base Libraries
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
package com.palladium.paf.funcs;

import java.util.Set;

import com.palladium.paf.PafErrSeverity;
import com.palladium.paf.PafException;
import com.palladium.paf.data.IPafDataCache;
import com.palladium.paf.data.Intersection;
import com.palladium.paf.state.IPafEvalState;

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
	 * @see com.palladium.paf.funcs.AbstractFunction#calculate(com.palladium.paf.data.Intersection, com.palladium.paf.data.IPafRoDataCache, com.palladium.paf.state.IPafEvalState, java.lang.String[])
	 */
	@Override
	public double calculate(@SuppressWarnings("unused")
	Intersection sourceIs, @SuppressWarnings("unused")
	IPafDataCache dataCache,
			@SuppressWarnings("unused")
			IPafEvalState evalState) throws PafException {
		throw new PafException("Can't calculate a Parsed Function. This function has not been converted into a concrete funtion.", PafErrSeverity.Warning);
	}

	@SuppressWarnings("unused")
	@Override
	public Set<Intersection> getTriggerIntersections(@SuppressWarnings("unused")
	IPafEvalState evalState) throws PafException {
		// TODO Auto-generated method stub
		return null;
	}


}
