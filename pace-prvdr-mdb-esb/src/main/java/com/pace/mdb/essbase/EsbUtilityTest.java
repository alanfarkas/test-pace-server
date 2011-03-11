/*
 *	File: @(#)EsbUtilityTest.java 	Package: com.pace.base.mdb.essbase 	Project: Essbase Provider
 *	Created: May 11, 2006  		By: AFarkas
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

import java.io.File;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.essbase.api.datasource.IEssCube;
import com.essbase.api.datasource.IEssOlapServer;
import com.pace.base.PafException;
import com.pace.base.mdb.testCommonParms;

import junit.framework.TestCase;

/**
 * EsbUtility Unit Tests
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class EsbUtilityTest extends TestCase {

	private static final Properties connectionProps = testCommonParms.getConnectionProps();
	private static final Logger logger = Logger.getLogger(EsbUtilityTest.class);
	private static final String filePath = "." + File.separator;
	private static final String calcScript = "zClcTst";
	private static final String dataSourceID = "Titan";

	/*
	 * Test method for 'com.pace.base.mdb.essbase.EsbUtility.copyCalcScriptToFile()'
	 */
	public void testCopyCalcScriptToFile() {
		
		boolean isSuccess = true;
		EsbCube esbCube = null;
		IEssCube cube = null;
		IEssOlapServer olapServer = null;
		
				
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			
			// Open the Essbase cube
			logger.info("Opening cube: [" + dataSourceID + "]"); 
			esbCube = new EsbCube(connectionProps);				
			cube = esbCube.getEssCube();
			olapServer = esbCube.getOlapServer();
				
			// Copy calc script to file
			logger.info("Copying calc script [" + calcScript + "] to file");
			File calcScriptFile = EsbUtility.copyCalcScriptToFile(olapServer, cube, calcScript, filePath);
			logger.info("Temp file: " + calcScriptFile.getPath());
			
				
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

	
	/*
	 * Test method for 'com.pace.base.mdb.essbase.EsbUtility.copyCalcScriptToServer()'
	 */
	public void testCopyCalcScriptToServer() {
		
		boolean isSuccess = true;
		String calcScriptFileName = null, calcScriptName = null;
		File calcScriptFile = null;
		EsbCube esbCube = null;
		IEssCube cube = null;
		IEssOlapServer olapServer = null;
		
				
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			
			// Open the Essbase cube
			logger.info("Opening cube: [" + dataSourceID + "]"); 
			esbCube = new EsbCube(connectionProps);				
			cube = esbCube.getEssCube();
			olapServer = esbCube.getOlapServer();
			
			// Copy calc script to file
			logger.info("Copying calc script [" + calcScript + "] to file");
			calcScriptFile = EsbUtility.copyCalcScriptToFile(olapServer, cube, calcScript, filePath);
			logger.info("Temp file: " + calcScriptFile.getPath());
					
			// Copy calc script file to server
			calcScriptFileName = calcScriptFile.getPath();
			calcScriptName = calcScriptFile.getName().substring(0,8);
			logger.info("Copying calc script file[" + calcScriptFileName + "] to server as " + calcScriptName);
			calcScriptName = EsbUtility.copyCalcScriptToServer(olapServer, cube, calcScriptFile, calcScriptName);
			logger.info("CalcScriptName: [" + calcScriptName + "]");
			
				
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
