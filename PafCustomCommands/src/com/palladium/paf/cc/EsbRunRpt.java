/*
 *	File: @(#)EsbRunRpt.java 	Package: com.palladium.paf.cc 	Project: PafCustomCommands
 *	Created: May 19, 2009  		By: AFarkas
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2009 Palladium Group, Inc. All rights reserved.
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
 * "EsbRunRpt" Custom Command - Executes a tokenized Essbase Report script against the specified 
 * Essbase database.
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class EsbRunRpt extends EssbaseCmd implements IPafCustomCommand {

	private static final String PROPKEY_REPORT_SCRIPT_TO_RUN = "REPORTSCRIPT";
	private static final String PROPKEY_OUTPUT_FILE = "OUTPUTFILE";

	
	/* (non-Javadoc)
	 * @see com.palladium.paf.IPafCustomCommand#execute(java.util.Properties, com.palladium.paf.IPafClientState)
	 */
	public CustomCommandResult execute(Properties tokenCatalog, IPafClientState clientState) throws PafException {
		
		// Get calculation properties
		String reportScript = this.getActionParm(PROPKEY_REPORT_SCRIPT_TO_RUN, tokenCatalog, true);
		String outputFile = this.getActionParm(PROPKEY_OUTPUT_FILE, tokenCatalog, true);

		// Get Essbase data connection
		EsbData esbData = this.getEsbDataConnection(tokenCatalog, clientState);

		// Run tokenized report script
		esbData.runTokenizedReportScript(reportScript, outputFile, tokenCatalog, clientState);

		// Return results
		return result;
	}

}
