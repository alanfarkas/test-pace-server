/*
 *	File: @(#)TestPafDataCacheCalc.java 	Package: com.pace.base.mdb 	Project: Essbase Provider
 *	Created: Sep 21, 2005  		By: Alan Farkas
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import junit.framework.TestCase;

import org.apache.log4j.Logger;

import com.pace.base.PafException;
import com.pace.base.app.PafApplicationDef;
import com.pace.base.mdb.*;
//import com.pace.base.eval.PafUowCacheCalc;

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author Alan Farkas
 *
 */
public class TestPafDataCacheCalc extends TestCase {
	
	private Properties props = testCommonParms.getConnectionProps();
	@SuppressWarnings("unused")
	private PafApplicationDef appDef = testCommonParms.getAppDef();
	@SuppressWarnings("unused")
	private String mdxSelect = testCommonParms.getSampleMdxSelect();
	@SuppressWarnings("unused")
	private String[] activeVersions = testCommonParms.getActiveVersions();
	private Map<String, List<String>> emptyMemberFilters = testCommonParms.getEmptyMemberFilters();
	@SuppressWarnings("unused")
	private Map<String, List<String>> memberFilters = testCommonParms.getMemberFilters();
	@SuppressWarnings("unused")
	private Set<String> lockedPeriods = testCommonParms.getLockedPeriods();
	private static Logger logger = Logger.getLogger(TestPafDataCacheCalc.class);
	
	
	
	/*
	 * Test method for 'com.pace.base.mdb.PafUowCacheCalc.aggDimension(String, PafUowCache, PafBaseTree)'
	 */
	public void testAggDimensionProductNoFilter() {
		
		boolean isSuccess = true;
		
		@SuppressWarnings("unused")
		String aggDimName = "Product", aggBranch = "DIV01";
		@SuppressWarnings("unused") String mdxSelect2 = "SELECT " 
			+ " Descendants ( [Q1] )"
//			+ "{[WK01]}"
			+ " ON AXIS(0), "
//			+ " {[BOPRTL_DLR], [EOPRTL_DLR],[MD_DLR], [RECRTL_DLR], [SLS_DLR]} "
			+ " {[EOPRTL_DLR], [BOPRTL_DLR]} "
			+ " ON AXIS(2), "
			+ " Descendants ( [" + aggBranch + "] ) "
			+ " ON AXIS(1), "
			+ " {[ClassChn]} "
			+ " ON AXIS(3), "
			+ " {[WP]} "
			+ " ON AXIS(4), "
			+ " {[FY2005]}"
			+ " ON AXIS(5), "
			+ " Descendants ( [Location]) "
			+ " ON AXIS(6) ";
			
		IMdbData esbData = null;
		IMdbMetaData esbMetaData = null;
		PafUowCache pafUowCache = null;
		@SuppressWarnings("unused")
		PafBaseTree pafBaseTree = null;

		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbData object
			esbData = new EsbData(props);
			
			// Get data
//			pafDataCache = esbData.getDataCache(mdxSelect, appDef, activeVersions, lockedPeriods);
			logger.info("Data cache retrieved with [" + pafUowCache.getCellCount() + "] cells, [" + pafUowCache.getRowCount()
					+ "] rows, and [" + pafUowCache.getColumnCount() + "] columns...");
			
			// Create new EsbMetaData object
			esbMetaData = new EsbMetaData(props);

			// Get paf member tree for selected branch
			pafBaseTree = esbMetaData.getBaseDimension(aggBranch);
			
			// Display initial data
//			logger.info("Intial data..." + pafDataCache.toString());
			
			// Aggregate data
//			PafUowCacheCalc.aggDimension(aggDimName, pafUowCache, pafBaseTree);
			
			// Display initial data
//			logger.info("Aggregated data..." + pafDataCache.toString());
			
			// Send updated data cache back to Essbase 
			esbData.sendData(pafUowCache, testCommonParms.getClientState());
			
		} catch (PafException pfe) {
			logger.error("*** Paf Exception: " + pfe.getMessage() + " ***");
			pfe.printStackTrace();
			isSuccess = false;
		} catch (Exception ex) {
			logger.error("*** Java Exception: " + ex.getMessage() + " ***");
			ex.printStackTrace();
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
					esbMetaData.disconnect();
				} catch (PafException pfe) {
					logger.info("*** " + pfe.getMessage() + " ***");
					isSuccess = false;
				} catch (Exception e) {
					logger.info("*** Java Exception: " + e.getMessage() + " ***");
					isSuccess = false;
				} finally {
					esbMetaData = null;
					pafBaseTree = null;
				}
			}
		}
		
	}

	/*
	 * Test method for 'com.pace.base.mdb.PafUowCacheCalc.aggDimension2(String, PafUowCache, PafBaseTree)'
	 */
	public void testAggDimensionProductWithFilter() {
		
		boolean isSuccess = true;
		
		@SuppressWarnings("unused")
		String aggDimName = "Product", aggBranch = "DIV01";
		
		IMdbData esbData = null;
		IMdbMetaData esbMetaData = null;
		PafUowCache pafUowCache = null;
		@SuppressWarnings("unused")
		PafBaseTree pafBaseTree = null;

		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbData object
			esbData = new EsbData(props);
			
			// Get data
///			pafDataCache = esbData.getDataCache(mdxSelect, appDef, activeVersions, lockedPeriods);
			logger.info("Data cache retrieved with [" + pafUowCache.getCellCount() + "] cells, [" + pafUowCache.getRowCount()
					+ "] rows, and [" + pafUowCache.getColumnCount() + "] columns...");
			
			// Create new EsbMetaData object
			esbMetaData = new EsbMetaData(props);

			// Get paf member tree for selected branch
			pafBaseTree = esbMetaData.getBaseDimension(aggBranch);
			
			// Display initial data
//			logger.info("Intial data..." + pafDataCache.toString());
			
			// Aggregate data
//			PafUowCacheCalc.aggDimension(aggDimName, pafUowCache, pafBaseTree, memberFilters);
			
			// Display initial data
//			logger.info("Aggregated data..." + pafDataCache.toString());
			
			// Send updated data cache back to Essbase 
			esbData.sendData(pafUowCache, testCommonParms.getClientState());
			
		} catch (PafException pfe) {
			logger.error("*** Paf Exception: " + pfe.getMessage() + " ***");
			pfe.printStackTrace();
			isSuccess = false;
		} catch (Exception ex) {
			logger.error("*** Java Exception: " + ex.getMessage() + " ***");
			ex.printStackTrace();
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
					esbMetaData.disconnect();
				} catch (PafException pfe) {
					logger.info("*** " + pfe.getMessage() + " ***");
					isSuccess = false;
				} catch (Exception e) {
					logger.info("*** Java Exception: " + e.getMessage() + " ***");
					isSuccess = false;
				} finally {
					esbMetaData = null;
					pafBaseTree = null;
				}
			}
		}
		
	}

	/*
	 * Test method for 'com.pace.base.mdb.PafUowCacheCalc.aggDimension2(String, PafUowCache, PafBaseTree)'
	 */
	public void testAggDimensionProductEmptyFilter() {
		
		boolean isSuccess = true;
		
		@SuppressWarnings("unused")
		String aggDimName = "Product", aggBranch = "DIV01";
		
		IMdbData esbData = null;
		IMdbMetaData esbMetaData = null;
		PafUowCache pafUowCache = null;
		@SuppressWarnings("unused")
		PafBaseTree pafBaseTree = null;

		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbData object
			esbData = new EsbData(props);
			
			// Get data
//			pafDataCache = esbData.getDataCache(mdxSelect, appDef, activeVersions, lockedPeriods);
			logger.info("Data cache retrieved with [" + pafUowCache.getCellCount() + "] cells, [" + pafUowCache.getRowCount()
					+ "] rows, and [" + pafUowCache.getColumnCount() + "] columns...");
			
			// Create new EsbMetaData object
			esbMetaData = new EsbMetaData(props);

			// Get paf member tree for selected branch
			pafBaseTree = esbMetaData.getBaseDimension(aggBranch);
			
			// Display initial data
//			logger.info("Intial data..." + pafDataCache.toString());
			
			// Aggregate data
//			PafUowCacheCalc.aggDimension(aggDimName, pafUowCache, pafBaseTree, emptyMemberFilters);
			
			// Display initial data
//			logger.info("Aggregated data..." + pafDataCache.toString());
			
			// Send updated data cache back to Essbase 
			esbData.sendData(pafUowCache, testCommonParms.getClientState());
			
		} catch (PafException pfe) {
			logger.error("*** Paf Exception: " + pfe.getMessage() + " ***");
			pfe.printStackTrace();
			isSuccess = false;
		} catch (IllegalArgumentException iae) {
			logger.error("*** Illegal Argument Exception: " + iae.getMessage() + " ***");
			isSuccess = true;
		} catch (Exception ex) {
			logger.error("*** Java Exception: " + ex.getMessage() + " ***");
			ex.printStackTrace();
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
					esbMetaData.disconnect();
				} catch (PafException pfe) {
					logger.info("*** " + pfe.getMessage() + " ***");
					isSuccess = false;
				} catch (Exception e) {
					logger.info("*** Java Exception: " + e.getMessage() + " ***");
					isSuccess = false;
				} finally {
					esbMetaData = null;
					pafBaseTree = null;
				}
			}
		}
		
	}

	/*
	 * Test method for 'com.pace.base.mdb.PafUowCacheCalc.aggDimension3(String, PafUowCache, PafBaseTree)'
	 */
	public void testAggDimensionTime() {
		
		boolean isSuccess = true;
		
		@SuppressWarnings("unused")
		String aggDimName = "Time", aggBranch = "S01";
		@SuppressWarnings("unused") String mdxSelect2 = "SELECT " 
			+ " Descendants ( [Q1] )"
//			+ "{[WK01]}"
			+ " ON AXIS(0), "
//			+ " {[BOPRTL_DLR], [EOPRTL_DLR],[MD_DLR], [RECRTL_DLR], [SLS_DLR]} "
			+ " {[BOPRTL_DLR], [SLS_DLR]} "
//			+ " {[EOPRTL_DLR], [BOPRTL_DLR]} "
			+ " ON AXIS(2), "
//			+ " Descendants ( [" + aggBranch + "] ) "
			+ " {[CLS110-00]} "
			+ " ON AXIS(1), "
			+ " {[ClassChn]} "
			+ " ON AXIS(3), "
			+ " {[WP]} "
			+ " ON AXIS(4), "
			+ " {[FY2005]}"
			+ " ON AXIS(5), "
//			+ " Descendants ( [Location]) "
			+ " {[Store1]} "
			+ " ON AXIS(6) ";
		
		IMdbData esbData = null;
		IMdbMetaData esbMetaData = null;
		PafUowCache pafUowCache = null;
//		PafBaseTree pafBaseTree = null;

		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbData object
			esbData = new EsbData(props);
			
			// Get data
//			pafDataCache = esbData.getDataCache(mdxSelect, appDef, activeVersions, lockedPeriods);
			logger.info("Data cache retrieved with [" + pafUowCache.getCellCount() + "] cells, [" + pafUowCache.getRowCount()
					+ "] rows, and [" + pafUowCache.getColumnCount() + "] columns...");
			
			// Create new EsbMetaData object
			esbMetaData = new EsbMetaData(props);

			// Get paf member tree for selected branch
//			pafBaseTree = esbMetaData.getBaseDimension(aggBranch);
			
			// Display initial data
			//logger.info("Intial data..." + pafDataCache.toString());
			
			// Aggregate data
//			PafUowCacheCalc.aggDimension(aggDimName, pafUowCache, pafBaseTree, null);
			
			// Display initial data
			//logger.info("Aggregated data..." + pafDataCache.toString());
			
			// Send updated data cache back to Essbase 
			esbData.sendData(pafUowCache, testCommonParms.getClientState());
			
//		} catch (PafException pfe) {
//			logger.error("*** Paf Exception: " + pfe.getMessage() + " ***");
//			isSuccess = false;
		} catch (Exception ex) {
			logger.error("*** Java Exception: " + ex.getMessage() + " ***");
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
					esbMetaData.disconnect();
				} catch (PafException pfe) {
					logger.info("*** " + pfe.getMessage() + " ***");
					isSuccess = false;
				} catch (Exception e) {
					logger.info("*** Java Exception: " + e.getMessage() + " ***");
					isSuccess = false;
				} finally {
					esbMetaData = null;
//					pafBaseTree = null;
				}
			}
		}
		
	}
	
	/*
	 * Test method for 'com.pace.base.mdb.PafUowCacheCalc.aggDimension(String, PafUowCache, PafBaseTree)'
	 */
	public void testCalcVersionNoFilter() {
		
		boolean isSuccess = true;	
		IMdbData esbData = null;
		IMdbMetaData esbMetaData = null;
		PafUowCache pafUowCache = null;
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbData object
			esbData = new EsbData(props);
			
			// Get data
//			pafDataCache = esbData.getDataCache(mdxSelect, appDef, activeVersions, lockedPeriods);
			logger.info("Data cache retrieved with [" + pafUowCache.getCellCount() + "] cells, [" + pafUowCache.getRowCount()
					+ "] rows, and [" + pafUowCache.getColumnCount() + "] columns...");
			
			// Create new EsbMetaData object
			esbMetaData = new EsbMetaData(props);

			// Display initial data
//			logger.info("Intial data..." + pafDataCache.toString());
			
			// Calculate data
//			PafUowCacheCalc.calcVersionDim(pafDataCache);
			
			// Display initial data
//			logger.info("Aggregated data..." + pafDataCache.toString());
			
			// Send updated data cache back to Essbase 
			esbData.sendData(pafUowCache, testCommonParms.getClientState());
			
		} catch (PafException pfe) {
			logger.error("*** Paf Exception: " + pfe.getMessage() + " ***");
			pfe.printStackTrace();
			isSuccess = false;
		} catch (Exception ex) {
			logger.error("*** Java Exception: " + ex.getMessage() + " ***");
			ex.printStackTrace();
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
					esbMetaData.disconnect();
				} catch (PafException pfe) {
					logger.info("*** " + pfe.getMessage() + " ***");
					isSuccess = false;
				} catch (Exception e) {
					logger.info("*** Java Exception: " + e.getMessage() + " ***");
					isSuccess = false;
				} finally {
					esbMetaData = null;
				}
			}
		}
		
	}

	/*
	 * Test method for 'com.pace.base.mdb.PafUowCacheCalc.aggDimension(String, PafUowCache, PafBaseTree)'
	 */
	public void testCalcVersionVersionFilter() {
		
		boolean isSuccess = true;	
		IMdbData esbData = null;
		IMdbMetaData esbMetaData = null;
		List<String> members = new ArrayList<String>();
		Map<String, List<String>> versionFilter = new HashMap<String, List<String>>();
		PafUowCache pafUowCache = null;
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbData object
			esbData = new EsbData(props);
			
			// Get data
//			pafDataCache = esbData.getDataCache(mdxSelect, appDef, activeVersions, lockedPeriods);
			logger.info("Data cache retrieved with [" + pafUowCache.getCellCount() + "] cells, [" + pafUowCache.getRowCount()
					+ "] rows, and [" + pafUowCache.getColumnCount() + "] columns...");
			
			// Create new EsbMetaData object
			esbMetaData = new EsbMetaData(props);

			// Display initial data
//			logger.info("Intial data..." + pafDataCache.toString());
			
			// Create filter on Version dimension
			members.add("WP_vs_LY");
			members.add("WP_vs_LY_%");
			versionFilter.put(pafUowCache.getVersionDim(), members);
			
			// Calculate data
//			PafUowCacheCalc.calcVersionDim(pafDataCache, versionFilter);
			
			// Display initial data
//			logger.info("Aggregated data..." + pafDataCache.toString());
			
			// Send updated data cache back to Essbase 
			esbData.sendData(pafUowCache, testCommonParms.getClientState());
			
		} catch (PafException pfe) {
			logger.error("*** Paf Exception: " + pfe.getMessage() + " ***");
			pfe.printStackTrace();
			isSuccess = false;
		} catch (Exception ex) {
			logger.error("*** Java Exception: " + ex.getMessage() + " ***");
			ex.printStackTrace();
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
					esbMetaData.disconnect();
				} catch (PafException pfe) {
					logger.info("*** " + pfe.getMessage() + " ***");
					isSuccess = false;
				} catch (Exception e) {
					logger.info("*** Java Exception: " + e.getMessage() + " ***");
					isSuccess = false;
				} finally {
					esbMetaData = null;
				}
			}
		}
		
	}

	/*
	 * Test method for 'com.pace.base.mdb.PafUowCacheCalc.aggDimension(String, PafUowCache, PafBaseTree)'
	 */
	public void testCalcVersionEmptyFilter() {
		
		boolean isSuccess = true;	
		@SuppressWarnings("unused")
		IMdbData esbData = null;
		IMdbMetaData esbMetaData = null;
		@SuppressWarnings("unused")
		List<String> members = new ArrayList<String>();
		@SuppressWarnings("unused")
		Map<String, List<String>> versionFilter = emptyMemberFilters;
		PafUowCache pafUowCache = null;
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbData object
			esbData = new EsbData(props);
			
			// Get data
//			pafDataCache = esbData.getDataCache(mdxSelect, appDef, activeVersions, lockedPeriods);
			logger.info("Data cache retrieved with [" + pafUowCache.getCellCount() + "] cells, [" + pafUowCache.getRowCount()
					+ "] rows, and [" + pafUowCache.getColumnCount() + "] columns...");
			
			// Create new EsbMetaData object
			esbMetaData = new EsbMetaData(props);

			// Display initial data
//			logger.info("Intial data..." + pafDataCache.toString());
						
			// Calculate data
//			PafUowCacheCalc.calcVersionDim(pafDataCache, versionFilter);
			
		} catch (PafException pfe) {
			logger.error("*** Paf Exception: " + pfe.getMessage() + " ***");
			pfe.printStackTrace();
			isSuccess = false;
		} catch (IllegalArgumentException iae) {
			logger.error("*** Illegal Argument Exception: " + iae.getMessage() + " ***");
			isSuccess = true;
		} catch (Exception ex) {
			logger.error("*** Java Exception: " + ex.getMessage() + " ***");
			ex.printStackTrace();
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
					esbMetaData.disconnect();
				} catch (PafException pfe) {
					logger.info("*** " + pfe.getMessage() + " ***");
					isSuccess = false;
				} catch (Exception e) {
					logger.info("*** Java Exception: " + e.getMessage() + " ***");
					isSuccess = false;
				} finally {
					esbMetaData = null;
				}
			}
		}
		
	}

	/*
	 * Test method for 'com.pace.base.mdb.PafUowCacheCalc.aggDimension(String, PafUowCache, PafBaseTree)'
	 */
	public void testCalcVersionVersionandTimeFilter() {
		
		boolean isSuccess = true;	
		IMdbData esbData = null;
		IMdbMetaData esbMetaData = null;
		List<String> members = new ArrayList<String>(), members2 = new ArrayList<String>();
		Map<String, List<String>> memberFilters = new HashMap<String, List<String>>();
		PafUowCache pafUowCache = null;
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbData object
			esbData = new EsbData(props);
			
			// Get data
//			pafDataCache = esbData.getDataCache(mdxSelect, appDef, activeVersions, lockedPeriods);
			logger.info("Data cache retrieved with [" + pafUowCache.getCellCount() + "] cells, [" + pafUowCache.getRowCount()
					+ "] rows, and [" + pafUowCache.getColumnCount() + "] columns...");
			
			// Create new EsbMetaData object
			esbMetaData = new EsbMetaData(props);

			// Display initial data
//			logger.info("Intial data..." + pafDataCache.toString());
			
			// Create filter for variance calc
			members.add("WP_vs_LY");
			members.add("WP_vs_LY_%");
			memberFilters.put(pafUowCache.getVersionDim(), members);
			members2.add("WK01");
			members2.add("WK02");
			members2.add("WK03");
			memberFilters.put(pafUowCache.getTimeDim(), members2);
			
			// Calculate data
//			PafUowCacheCalc.calcVersionDim(pafDataCache, memberFilters);
			
			// Display initial data
//			logger.info("Aggregated data..." + pafDataCache.toString());
			
			// Send updated data cache back to Essbase 
			esbData.sendData(pafUowCache, testCommonParms.getClientState());
			
		} catch (PafException pfe) {
			logger.error("*** Paf Exception: " + pfe.getMessage() + " ***");
			pfe.printStackTrace();
			isSuccess = false;
		} catch (Exception ex) {
			logger.error("*** Java Exception: " + ex.getMessage() + " ***");
			ex.printStackTrace();
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
					esbMetaData.disconnect();
				} catch (PafException pfe) {
					logger.info("*** " + pfe.getMessage() + " ***");
					isSuccess = false;
				} catch (Exception e) {
					logger.info("*** Java Exception: " + e.getMessage() + " ***");
					isSuccess = false;
				} finally {
					esbMetaData = null;
				}
			}
		}
	}

}
