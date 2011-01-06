/*
 *	File: @(#)IEvalStrategy.java 	Package: com.palladium.paf.eval 	Project: PafServer
 *	Created: Aug 30, 2005  		By: jim
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

import com.palladium.paf.PafException;
import com.palladium.paf.mdb.PafDataCache;
import com.palladium.paf.state.EvalState;


/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author jim
 *
 */
public interface IEvalStrategy {
    
    public PafDataCache executeStrategy(EvalState evalState) throws PafException;

    public PafDataCache executeDefaultStrategy(EvalState evalState) throws PafException;

    public PafDataCache executeAttributeStrategy(EvalState evalState) throws PafException;

}
