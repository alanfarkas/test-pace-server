/*
 *	File: @(#)EsbCalculateTest.java 	Package: com.pace.ext.cmds 	Project: pace-ext-cmds
 *	Created: May 12, 2006  				By: Alan Farkas
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

import junit.framework.TestCase;

import org.apache.log4j.Logger;

import com.pace.base.CustomCommandResult;
import com.pace.base.PafBaseConstants;
import com.pace.base.comm.ClientInitRequest;
import com.pace.base.mdb.IPafConnectionProps;
import com.pace.base.mdb.testCommonParms;
import com.pace.base.state.IPafClientState;
import com.pace.base.state.PafClientState;

/**
 * Test Execute
 *
 * @version	x.xx
 * @author Alan Farkas
 *
 */
public class EsbCalcCmdTest extends TestCase {
	
	private Properties tokenCatalog = new Properties();
	private IPafConnectionProps connectionProps = testCommonParms.getPafConnectionProps();
	private static Logger logger = Logger.getLogger(EsbCalcCmdTest.class);
	
	/*
	 * Test method for 'com.pace.base.cc.EsbCalcCmd.execute()'
	 */
	public void testExecute() {
		
		boolean isSuccess = true;
		final String dataSource = "Titan", calcScript = "zClcTst";
		final String actionParmPrefix = PafBaseConstants.CC_TOKEN_PREFIX_ACTION_PARM;
		final String tokenStartChar = PafBaseConstants.CC_TOKEN_START_CHAR;
		final String tokenEndChar = PafBaseConstants.CC_TOKEN_END_CHAR;
		
		EsbCalcCmd esbCalcCmd = new EsbCalcCmd();
		CustomCommandResult result = null;
		IPafClientState clientState = null;
		
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create dummy properties
			logger.info("Creating tokenCatalog");
			tokenCatalog.setProperty(tokenStartChar + actionParmPrefix + "DATASOURCEID" + tokenEndChar, dataSource);
			tokenCatalog.setProperty(tokenStartChar + actionParmPrefix + "CALCSCRIPT" + tokenEndChar, calcScript);
		
			// Create dummy client state
			logger.info("Creating client state object");
			clientState = testCommonParms.getClientState();
			clientState.getDataSources().put("Titan", connectionProps);
			
			// Execute custom Essbase calc process
			logger.info("Running custom Essbase calc process");
			result = esbCalcCmd.execute(tokenCatalog, clientState);
			
			// Display response
			logger.info("Result: " + result.getReturnMessage());
			
		} catch (Exception e) {
			logger.info("Java Exception: " + e.getMessage());	
			isSuccess = false;
		} finally {
			assertTrue(isSuccess);
			System.out.print(this.getName());
			if (isSuccess) {
				logger.info(this.getName() + " - Successful");
				logger.info("***************************************************\n");
			}
			else {
				logger.info(this.getName() + " - Failed");			
				logger.info("***************************************************\n");
			}
		}
	}
}