/*
 *	File: @(#)ES_VarianceVersionImpacts.java 	Package: com.pace.base.eval 	Project: PafServer
 *	Created: Sep 6, 2005  		By: JWatkins
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
package com.palladium.paf.eval;

import com.pace.base.mdb.PafDataCache;
import com.pace.base.state.EvalState;

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author JWatkins
 *
 */
public class ES_VarianceVersionImpacts implements IEvalStep {

	public void performEvaluation(EvalState evalState) {
        // TODO Calculate variance version impacts
        PafDataCache dataCache = evalState.getDataCache();        
	}
}
