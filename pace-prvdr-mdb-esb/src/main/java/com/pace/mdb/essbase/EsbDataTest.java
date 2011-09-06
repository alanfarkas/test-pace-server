/*
 *	File: @(#)TestEsbData.java 	Package: com.pace.base.mdb.essbase 	Project: Essbase Provider
 *	Created: Aug 15, 2005  		By: Alan Farkas
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

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import junit.framework.TestCase;

import org.apache.log4j.Logger;

import com.pace.base.PafException;
import com.pace.base.app.PafApplicationDef;
import com.pace.base.app.UnitOfWork;
import com.pace.base.data.Intersection;
import com.pace.base.mdb.PafDataCache;
import com.pace.base.mdb.testCommonParms;
import com.pace.base.state.PafClientState;
import com.pace.base.utility.Odometer;


/*
 * Test EsbData Class
 *
 * @version	x.xx
 * @author Alan Farkas
 *
 */
public class EsbDataTest extends TestCase {
	
	private PafApplicationDef appDef = testCommonParms.getAppDef();
	private Properties props = testCommonParms.getConnectionProps();
	@SuppressWarnings("unused")
	private String[] activeVersions = testCommonParms.getActiveVersions();
	PafClientState clientState = testCommonParms.getClientState();
	@SuppressWarnings("unused")
	private Set<String> lockedPeriods = testCommonParms.getLockedPeriods();
	private UnitOfWork uowSpec = testCommonParms.getUowSpec();
	private Map<String, Map<Integer, List<String>>> dataSpecByVersion = testCommonParms.getDataSpecByVersion(uowSpec.buildUowMap(), appDef);
	@SuppressWarnings("unused")
	private String[] uowDims = testCommonParms.getUowDims();
	private static Logger logger = Logger.getLogger(EsbDataTest.class);
	
	/*
	 * Test method for 'com.pace.base.mdb.essbase.EsbData'
	 */
	public void testEsbData() {
		
		boolean isSuccess = true;
		
		String esbConnAlias = "TitanCube2";
		@SuppressWarnings("unused") 
		EsbData esbData = null;
		
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbData object, omitting the 'useConnPool' parameter
			logger.info("Creating new EsbData object (omitting the 'useConnPool' parameter - should default to 'true')");
			esbData = new EsbData(props);
			esbData = null;
			
			// Create new EsbData object, don't specify whether a connection pool should be used
			logger.info("-- Creating new EsbData object ('useConnPool' set to 'false')");
			esbData = new EsbData(esbConnAlias, false);
			esbData = null;
			
//			} catch (PafException pfe) {
//			logger.info("*** " + pfe.getMessage() + " ***");
//			isSuccess = false;
		} catch (Exception e) {
			logger.info("*** Java Exception: " + e.getMessage() + " ***");
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
				try {
					// Disconnect from Essbase
					logger.info("Disconnecting.........");
					//esbData.disconnect();
//					} catch (PafException pfe) {
//					logger.info("\n*** " + pfe.getMessage() + " ***");
//					isSuccess = false;
				} catch (Exception ex) {
					logger.info("*** Java Exception: " + ex.getMessage() + " ***");
					isSuccess = false;
				}
			}
		}
	}
	
	
	
	
	
	/*
	 * Test method for 'com.pace.base.mdb.essbase.EsbData.SendData(String, String, boolean, String, String)'
	 */
	public void testSendData() {
		
		boolean isSuccess = true;
		
		EsbData esbData = null;
		PafDataCache dataCache = null;
		
		logger.info("***************************************************");
		logger.info(this.getName() +  "Test Started");
		try {
			dataCache = new PafDataCache(clientState);
			esbData = new EsbData(props);		
			esbData.updateDataCache(dataCache, dataSpecByVersion);
			
			//logger.info("Displaying existing data...\n" + dataCache.toString());
			
			// Update data cache
			String[] dims = dataCache.getBaseDimensions();
			Odometer dcIterator = dataCache.getCellIterator(dims);
			while (dcIterator.hasNext()) {
				@SuppressWarnings("unchecked")
				List<String> coords = dcIterator.nextValue();
				Intersection cell = new Intersection(dims, coords);
				double cellValue = dataCache.getCellValue(cell);
				dataCache.setCellValue(cell, cellValue * -1);
			}
			
			// Display pending updates
			//logger.info("Pending updates...\n" + dataCache.toString());
			
			// Sending updated data To Essbase
			logger.info("Sending updated data to Essbase");
			PafClientState clientState = testCommonParms.getClientState();
			esbData.sendData(dataCache, clientState);
			
			// Retrieve data from Essbase - Verify sent data
			//logger.info("Getting updated data from Essbase");
			//dataCache = esbData.getDataCache(mdxSelect, appDef, activeVersions, lockedPeriods);			
			//logger.info("Displaying updated data...\n" + dataCache.toString());
			
		} catch (PafException pfe) {
			logger.info("*** " + pfe.getMessage() + "***");
			isSuccess = false;
		} catch (Exception ex) {
			logger.info("*** Java Exception: " + ex.getMessage() + "***");
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
					try {
						// Disconnect from Essbase
						logger.info("\nDisconnecting.........");
						//} catch (PafException pfe) {
						//	logger.info("\n*** " + pfe.getMessage() + "***");
						//	isSuccess = false;
					} catch (Exception ex) {
						logger.info("*** Java Exception: " + ex.getMessage() + "***");
						isSuccess = false;
					} finally {
						logger.info("***************************************************\n");
						esbData = null;
					}
				}
			}
		}
	}


	/*
	 * Test method for 'com.pace.base.mdb.essbase.EsbData.SendData2(String, String, boolean, String, String)'
	 */
	public void testSendData2() {
		
		boolean isSuccess = true;
		
		@SuppressWarnings("unused")
		String mdxSelect = null;
		
		EsbData esbData = null;
		PafDataCache dataCache = null;
		
			
		logger.info("***************************************************");
		logger.info(this.getName() +  "Test Started");
		try {
			// Create new EsbData object
			esbData = new EsbData(props);
			
			// Retrieve data from Essbase - Displaying existing data
			dataCache = new PafDataCache(clientState);
			esbData.updateDataCache(dataCache, dataSpecByVersion);
			logger.info("Displaying existing data...\n" + dataCache.toString());
			
			// Update data cache
			String[] dims = dataCache.getBaseDimensions();
			Odometer dcIterator = dataCache.getCellIterator(dims);
			while (dcIterator.hasNext()) {
				@SuppressWarnings("unchecked")
				List<String> coords = dcIterator.nextValue();
				Intersection cell = new Intersection(dims, coords);
				double cellValue = dataCache.getCellValue(cell);
				dataCache.setCellValue(cell, cellValue * -1);
			}
			
			// Display pending updates
			//logger.info("Pending updates...\n" + pafDataCache.toString());
			
			// Sending updated data To Essbase
			logger.info("Sending updated data to Essbase");
			esbData.sendData(dataCache, testCommonParms.getClientState());
			
			// Retrieve data from Essbase - Verify sent data
			logger.info("Getting updated data from Essbase");
			esbData.updateDataCache(dataCache, dataSpecByVersion);			
			logger.info("Displaying updated data...\n" + dataCache.toString());
			
		} catch (PafException pfe) {
			logger.info("*** " + pfe.getMessage() + "***");
			isSuccess = false;
		} catch (Exception ex) {
			logger.info("*** Java Exception: " + ex.getMessage() + "***");
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
					try {
						// Disconnect from Essbase
						logger.info("\nDisconnecting.........");
						//} catch (PafException pfe) {
						//	logger.info("\n*** " + pfe.getMessage() + "***");
						//	isSuccess = false;
					} catch (Exception ex) {
						logger.info("*** Java Exception: " + ex.getMessage() + "***");
						isSuccess = false;
					} finally {
						logger.info("***************************************************\n");
						esbData = null;
					}
				}
			}
		}
	}


	/*
	 * Test method for 'com.pace.base.mdb.essbase.EsbData.SendData(String, String, boolean, String, String)'
	 */
	public void testSendDataLoad() {
		
		boolean isSuccess = true;
		
		@SuppressWarnings("unused")
		String mdxSelect = null;
		
		EsbData esbData = null;
		PafDataCache dataCache = null;
					
		logger.info("***************************************************");
		logger.info(this.getName() +  "Test Started");
		try {
			// Create new EsbData object
			esbData = new EsbData(props);
			
			// Retrieve data from Essbase - Displaying existing data
			dataCache = new PafDataCache(clientState);
			esbData.updateDataCache(dataCache, dataSpecByVersion);
			logger.info("Displaying existing data...\n" + dataCache.toString());
			
			// Update data cache
			String[] dims = dataCache.getBaseDimensions();
			Odometer dcIterator = dataCache.getCellIterator(dims);
			while (dcIterator.hasNext()) {
				@SuppressWarnings("unchecked")
				List<String> coords = dcIterator.nextValue();
				Intersection cell = new Intersection(dims, coords);
				double cellValue = dataCache.getCellValue(cell);
				dataCache.setCellValue(cell, cellValue * -1);
			}
			
			// Display pending updates
			//logger.info("Pending updates...\n" + pafDataCache.toString());
			
			// Sending updated data To Essbase
			logger.info("Sending updated data load to Essbase");
			esbData.sendData(dataCache, testCommonParms.getClientState());
			
			// Retrieve data from Essbase - Verify sent data
			logger.info("Getting updated data from Essbase");
			esbData.updateDataCache(dataCache, dataSpecByVersion);
			logger.info("Displaying updated data...\n" + dataCache.toString());
			
		} catch (PafException pfe) {
			logger.info("*** " + pfe.getMessage() + "***");
			pfe.printStackTrace();
			isSuccess = false;
		} catch (Exception ex) {
			logger.info("*** Java Exception: " + ex.getMessage() + "***");
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
					try {
						// Disconnect from Essbase
						logger.info("\nDisconnecting.........");
						//} catch (PafException pfe) {
						//	logger.info("\n*** " + pfe.getMessage() + "***");
						//	isSuccess = false;
					} catch (Exception ex) {
						logger.info("*** Java Exception: " + ex.getMessage() + "***");
						isSuccess = false;
					} finally {
						logger.info("***************************************************\n");
						esbData = null;
					}
				}
			}
		}
	}
}
