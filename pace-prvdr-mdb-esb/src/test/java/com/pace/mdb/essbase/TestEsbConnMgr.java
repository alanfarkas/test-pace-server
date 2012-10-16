/*
 *	File: @(#)TestEsbConnMgr.java 	Package: com.pace.base.mdb.essbase 	Project: Essbase Provider
 *	Created: Aug 10, 2005  			By: Alan Farkas
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

import com.pace.base.PafBaseConstants;
import com.pace.base.PafException;
import com.pace.base.mdb.testCommonParms;
import com.pace.base.utility.PropertyLoader;

/**
 * Test the EsbConnMgr class
 *
 * @version	x.xx
 * @author Alan Farkas
 *
 */

public class TestEsbConnMgr extends TestCase {
	
//	private Properties props = testCommonParms.getConnectionProps();
	private Properties props = PropertyLoader.loadProperties(PafBaseConstants.FN_EssbaseConnPropTest);
	
	private static Logger logger = Logger.getLogger("TestEsbConnMgr");
	
	/*
	 * Test method for 'com.pace.base.mdb.essbse.EsbConnMgr.EsbConnMgr()'
	 */
	public void testEsbConnMgr() {
		boolean isSuccess = true;
		
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			logger.info("-- Creating new EsbConnMgr object");
			EsbConnMgr esbConnMgr = new EsbConnMgr();
			logger.info("-- Disconnecting EsbConnMgr object");
			esbConnMgr.cleanup();
			esbConnMgr = null;
			
		} catch (PafException pfe) {
			logger.info("*** " + pfe.getMessage() + " ***");
			isSuccess = false;
		} catch (Exception ex) {
			logger.info("*** Java Exception: " + ex.getMessage() + " ***");
			isSuccess = false;
		} finally {
			try {
				assertTrue(isSuccess);
			} finally {
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
	
	
	/*
	 * Test method for 'com.pace.base.mdb.essbse.EsbConnMgr.GetEsbDomain()'
	 */
	public void testGetEsbDomain() {
		boolean isSuccess = true;
		
			logger.info("***************************************************");
			logger.info(this.getName() +  " - Test Started");
			try {
				logger.info("-- Creating new EsbConnMgr object");
				EsbConnMgr esbConnMgr = new EsbConnMgr();
				logger.info("-- Getting  esbConnection object");
				@SuppressWarnings("unused")
				EsbDomain esbDomain = esbConnMgr.getEsbDomain();
				logger.info("-- Disconnecting EsbConnMgr object");
				esbConnMgr.cleanup();
				esbConnMgr = null;
				
			} catch (PafException pfe) {
				logger.info("*** " + pfe.getMessage() + " ***");
				isSuccess = false;
			} catch (Exception ex) {
				logger.info("*** Java Exception: " + ex.getMessage() + " ***");
				isSuccess = false;
			} finally {
				try {
					assertTrue(isSuccess);
				} finally {
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
		
		/*
		 * Test method for 'com.pace.base.mdb.essbse.EsbConnMgr.GetConnection()'
		 */
		
		public void testGetConnection() {
			
			boolean isSuccess = true;
			EsbConnMgr esbConnMgr = null;
			
			logger.info("***************************************************");
			logger.info(this.getName() +  " - Test Started");
			try {
				logger.info("-- Creating new EsbConnMgr object");
				esbConnMgr = new EsbConnMgr();
				
				// Create a server connection using existing domain connection
				logger.info("-- Creating server connection ");
				EsbServerConn esbServerConn = (EsbServerConn) esbConnMgr.getConnection(props);		
				logger.info("  -- Connect to server: " + esbServerConn.getEssOlapServer().getName());
				
				// Create a cube connection using existing domain connection
				logger.info("-- Creating cube connection ");
				EsbCubeConn esbCubeConn = (EsbCubeConn) esbConnMgr.getConnection(props);		
				logger.info("  -- Connect to server: " + esbCubeConn.getEssOlapServer().getName());
				// GetApplicationName cause EDS to create a ghost connection on the Essbase server to the TitanPool app/db
				//	logger.info("  -- Connect to app: " + esbCubeConn.getEssCube().getApplicationName());
				logger.info("  -- Connect to db: " + esbCubeConn.getEssCube().getName());
				
				// Create a cube connection#2 using existing domain connection
				logger.info("-- Creating cube connection ");
				esbCubeConn = (EsbCubeConn) esbConnMgr.getConnection(props);		
				logger.info("  -- Connect to server: " + esbCubeConn.getEssOlapServer().getName());
				logger.info("  -- Connect to app: " + esbCubeConn.getEssCube().getApplicationName());
				logger.info("  -- Connect to db: " + esbCubeConn.getEssCube().getName());
				
			} catch (PafException pfe) {
				logger.info("*** " + pfe.getMessage() + " ***");
				isSuccess = false;
			} catch (Exception ex) {
				logger.info("*** Java Exception: " + ex.getMessage() + " ***");
				isSuccess = false;
			} finally {
				try {
					// Close down EsbConnMgr object
					if (esbConnMgr != null) {
						logger.info("-- Disconnecting EsbConnMgr object");
						esbConnMgr.cleanup();
						esbConnMgr = null;
					}
					/*	} catch (EssException ee) {
					 isSuccess = false;
					 logger.info.println("Essbase Error: " + ee.getMessage());	*/		
				} catch (Exception e) {
					isSuccess = false;
					logger.info("Java Exception: " + e.getMessage());			
				} finally {
					try {			
						assertTrue(isSuccess);
					} finally {
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
		}
		
		public void testDisconnect() {
			//TODO Implement disconnect().
		}
		
	}
