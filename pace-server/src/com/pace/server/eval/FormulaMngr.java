/*
 *	File: @(#)FormulaMngr.java 	Package: com.pace.base.eval 	Project: PafServer
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
package com.pace.server.eval;

import com.pace.base.rules.Formula;

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author jim
 *
 */
public class FormulaMngr {
	IFormulaEvalEngine formulaEngine;
	
	public FormulaMngr(IFormulaEvalEngine evaleng) {
		formulaEngine = evaleng;
	}
	
	public double[] processFormulas(Formula[] formulas) {
		double[] results = new double[formulas.length];
		
		
		return results;
		
	}
}
