/*
 *	File: @(#)EsbCalcCmd.java 	Package: com.pace.base.cc 	Project: PafCustomCommands
 *	Created: May 7, 2006  		By: AFarkas
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
package com.pace.ext.cmds;

import java.util.Properties;

import com.pace.base.CustomCommandResult;
import com.pace.base.IPafCustomCommand;
import com.pace.base.PafException;
import com.pace.base.state.IPafClientState;
import com.pace.mdb.essbase.EsbData;

/**
 * "EsbCalc" Custom Command - Executes a tokenized Essbase Calculation script against the specified 
 * Essbase database.
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class EsbCalcCmd extends EssbaseCmd implements IPafCustomCommand {

	private static final String CALC_SCRIPT_TO_RUN = "CALCSCRIPT";

	/* (non-Javadoc)
	 * @see com.pace.base.IPafCustomCommand#execute(java.util.Properties, com.pace.base.IPafClientState)
	 */
	public CustomCommandResult execute(Properties tokenCatalog, IPafClientState clientState) throws PafException {
		
		// Get calculation properties
		String calcScript = this.getActionParm(CALC_SCRIPT_TO_RUN, tokenCatalog, true);
		
		// Get Essbase data connection
		EsbData esbData = this.getEsbDataConnection(tokenCatalog, clientState);
		
		// Run tokenized calc script
		esbData.runTokenizedCalcScript(calcScript, tokenCatalog, clientState);
				
		// Return results
		return result;
	}

}
