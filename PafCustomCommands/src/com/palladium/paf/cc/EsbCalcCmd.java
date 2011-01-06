/*
 *	File: @(#)EsbCalcCmd.java 	Package: com.palladium.paf.cc 	Project: PafCustomCommands
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
package com.palladium.paf.cc;

import java.util.Properties;

import com.palladium.paf.CustomCommandResult;
import com.palladium.paf.IPafCustomCommand;
import com.palladium.paf.PafException;
import com.palladium.paf.mdb.essbase.EsbData;
import com.palladium.paf.state.IPafClientState;

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
	 * @see com.palladium.paf.IPafCustomCommand#execute(java.util.Properties, com.palladium.paf.IPafClientState)
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
