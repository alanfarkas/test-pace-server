/*
 *	File: @(#)EsbCalculateTest.java 	Package: com.pace.base.mdb 	Project: Essbase Provider
 *	Created: Oct 24, 2005  		By: Alan Farkas
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
package com.pace.mdb.essbase;

import java.util.Properties;

import junit.framework.TestCase;

import org.apache.log4j.Logger;

import com.pace.base.PafErrSeverity;
import com.pace.base.PafException;
import com.pace.base.mdb.testCommonParms;

/**
 * EsbCalculate Unit Tests
 *
 * @version	x.xx
 * @author Alan Farkas
 *
 */
public class EsbCalculateTest extends TestCase {        
	
	private static Properties connectionProps = testCommonParms.getConnectionProps();
	private static Logger logger = Logger.getLogger(EsbCalculateTest.class);
	
	/*
	 * Test method for 'com.pace.base.mdb.essbase.EsbCalcCmd.execute()'
	 */
	public void testExecute() {
		
		boolean isSuccess = true;
		final String dataSourceID = "Titan", calcScript = "zClcTst";
		String esbErrorMsg = null;
				
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			
			// Create Essbase data object
			logger.info("Creating Essbase data object");
			EsbData esbData = new EsbData(connectionProps, dataSourceID);
			
			// Execute custom Essbase calc process
			logger.info("Running custom Essbase calc [" + calcScript + "]");
			esbErrorMsg = esbData.runCalcScript(calcScript);
			if (esbErrorMsg != null) {
				String errMsg = "Calc script error: " + esbErrorMsg;
				throw new PafException(errMsg, PafErrSeverity.Fatal);			
			}
			
		} catch (PafException pfe) {
			logger.error(pfe.getMessage());	
			isSuccess = false;
		} catch (Exception e) {
			logger.error("Java Exception: " + e.getMessage());	
			isSuccess = false;
		} finally {
			System.out.print(this.getName());
			if (isSuccess) {
				logger.info(this.getName() + " - Successful");
				logger.info("***************************************************\n");
			} else {
				logger.info(this.getName() + " - Failed");			
				logger.info("***************************************************\n");
			}
			assertTrue(isSuccess);
		}
	}
}