/*
 *	File: @(#)TestPafDataCache.java 	Package: com.pace.base.mdb 	Project: Essbase Provider
 *	Created: Sep 5, 2005  				By: Alan Farkas
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

import com.pace.base.PafBaseConstants;
import com.pace.base.PafException;
import com.pace.base.app.PafApplicationDef;
import com.pace.base.app.UnitOfWork;
import com.pace.base.data.Intersection;
import com.pace.base.data.PafDataSlice;
import com.pace.base.mdb.IMdbData;
import com.pace.base.mdb.PafDataCache;
import com.pace.base.mdb.PafDataSliceParms;
import com.pace.base.mdb.testCommonParms;
import com.pace.base.state.PafClientState;
import com.pace.base.utility.StringUtils;
import com.pace.base.view.PafMVS;

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author Alan Farkas
 *
 */
public class PafDataCacheTest extends TestCase {
	
    private static Logger logger = Logger.getLogger("TestPafDataCache");

	private Properties props = testCommonParms.getConnectionProps();
    private String currentYear = testCommonParms.getCurrentYear();
    private String nextYear = testCommonParms.getNextYear();
    private String fcstVersion = testCommonParms.getFcstVersion();
    private String planVersion = testCommonParms.getPlanVersion();
    //TODO update activeVersion to planVersions
    @SuppressWarnings("unused")
	private String[] activeVersions = testCommonParms.getActiveVersions();
    private Map<String, Set<String>> lockedPeriodMap = testCommonParms.getLockedPeriodMap();
    @SuppressWarnings("unused")
	private String mdxSelect = testCommonParms.getSampleMdxSelect();
	private IMdbData esbData = null;
	private PafApplicationDef appDef = testCommonParms.getAppDef();
	private PafDataCache dataCache = null;
	private UnitOfWork uowSpec = testCommonParms.getUowSpec();
	private PafClientState clientState = testCommonParms.getClientState();
	private Map<String, Map<Integer, List<String>>> dataSpecByVersion = testCommonParms.getDataSpecByVersion(uowSpec.buildUowMap(), appDef);
	@SuppressWarnings("unused")
	private String[] uowDims = testCommonParms.getUowDims();
	private PafMVS pafMVS = testCommonParms.getPafMVS();

	/*
	 * Test method for 'com.pace.base.mdb.PafDataCache.PafDataCache(double[], int, int[], boolean[], int[], String)'
	 */
	public void testPafDataCache() {
		
		
		boolean isSuccess = true;
		
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbData object
			esbData = new EsbData(props);
			
			// Get Data
//			PafDataCache = esbData.getDataCache(mdxSelect, appDef, activeVersions, lockedPeriods);
						
//		} catch (PafException pfe) {
//			logger.error("*** " + pfe.getMessage() + " ***");
//			logger.error("*** " + pfe.getCause() + " ***");
//			pfe.printStackTrace();
//			isSuccess = false;
		} catch (Exception e) {
			logger.error("*** Java Exception: " + e.getMessage() + e.getCause() + " ***");
			logger.error("*** " + e.getCause() + " ***");
			e.printStackTrace();
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
	 * Test method for 'com.pace.base.mdb.PafDataCache.getAxisCount()'
	 */
	public void testGetAxisCount() {
	
	}


	/*
	 * Test method for 'com.pace.base.mdb.PafDataCache.setAxisCount(int)'
	 */
	public void testSetAxisCount() {

	}

	/*
	 * Test method for 'com.pace.base.mdb.PafDataCache.getAxisSize()'
	 */
	public void testGetAxisSize() {

	}

	/*
	 * Test method for 'com.pace.base.mdb.PafDataCache.setAxisSize(int[])'
	 */
	public void testSetAxisSize() {

	}

	/*
	 * Test method for 'com.pace.base.mdb.PafDataCache.getBlockSize()'
	 */
	public void testGetBlockSize() {

	}

	/*
	 * Test method for 'com.pace.base.mdb.PafDataCache.getCellCount()'
	 */
	public void testGetCellCount() {

	}

	/*
	 * Test method for 'com.pace.base.mdb.PafDataCache.setCellValue(int[], double)'
	 */
	public void testSetCellValue() {

		boolean isSuccess = true;
		
		double cellValue = 0, newCellValue = 0;
		double[] newCellValues = {99.99999999999999, 200.1, 300.000000009, 400, 500.000000004};
		
		String[] dims = clientState.getUnitOfWork().getDimensions();
		
		// Member#2 will cause an unknown member error
		String[][] coords = {{"RECRTL_DLR", "ClassChn", "Mar", "WP", "FY2006", "DPT120", "StoreTotal"}
								, {"RECRTL_DLR", "ClassChn", "Mar", "WP", "FY2000", "DPT120", "StoreTotal"}
		};

		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbData object
			esbData = new EsbData(props);
			
			// Get Data
			dataCache = new PafDataCache(clientState);
			esbData.updateDataCache(dataCache, dataSpecByVersion);
			int i = 0;
			
			try {
				logger.info("Getting cell value for intersection: " 
						+ StringUtils.arrayToString(coords[i], "{", "}", "[", "]", " "));
				Intersection cell = new Intersection(dims, coords[i]);
				cellValue = dataCache.getCellValue(cell);
				logger.info("Original cell value is: " + cellValue);
				newCellValue = newCellValues[i];
				logger.info("Changing to: " + newCellValue);
				dataCache.setCellValue(cell, newCellValue);
				cellValue = dataCache.getCellValue(cell);
				logger.info("Updated value is: " + cellValue);
				if (Math.abs(cellValue - newCellValue) > PafBaseConstants.DC_TRACK_CHANGES_THRESHHOLD) {
					logger.error ("*** Error in setValue process ***");
					isSuccess = false;
				}

				//	} catch (PafException pfe) {
			} catch (Exception e) {
				logger.error("*** Java Exception: " + e.getMessage() + " ***");
				isSuccess = false;
			
			}

			if (isSuccess) {
				try {
					i = 1;
					isSuccess = false;
					logger.info("Getting cell value for intersection: "
							+ StringUtils.arrayToString(coords[i], "{", "}",
									"[", "]", " "));
					Intersection cell = new Intersection(dims, coords[i]);
					cellValue = dataCache.getCellValue(cell);
					logger.info("Original cell value is: " + cellValue);
					newCellValue = newCellValues[i];
					logger.info("Changing to: " + newCellValue);
					dataCache.setCellValue(cell, newCellValue);
					cellValue = dataCache.getCellValue(cell);
					logger.info("Updated value is: " + cellValue);
					if (Math.abs(cellValue - newCellValue) > PafBaseConstants.DC_TRACK_CHANGES_THRESHHOLD) {
						logger.error("*** Error in setValue process ***");
						isSuccess = false;
					}

					//	} catch (PafException pfe) {
				} catch (Exception e) {
					logger.error("*** Java Exception: " + e.getMessage()
							+ " ***");
					isSuccess = true;
				}
			}



		} catch (Exception e) {
			logger.error("*** Java Exception: " + e.getMessage() + " ***");
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
	 * Test method for 'com.pace.base.mdb.PafDataCache.getColumnCount()'
	 */
	public void testGetColumnCount() {

	}

	/*
	 * Test method for 'com.pace.base.mdb.PafDataCache.getData()'
	 */
	public void testGetData() {

	}

	/*
	 * Test method for 'com.pace.base.mdb.PafDataCache.setData(double[])'
	 */
	public void testSetData() {

	}


	/*
	 * Test method for 'com.pace.base.mdb.PafDataCache.getDataSlice()'
	 */
	public void testGetDataSlice() {

		boolean isSuccess = true;
		
		PafDataSlice dataSlice = null;
		PafDataSliceParms dsParms = null;
		
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbData object
			esbData = new EsbData(props);
			
			// Get Data
			dataCache = new PafDataCache(clientState);
			dataCache.setPafMVS(pafMVS);
			esbData.updateDataCache(dataCache, dataSpecByVersion);
			
			// Create new PafDataSliceParms object
			dsParms = new PafDataSliceParms();
			logger.info("Setting data slice parameters");
			dsParms.setPageDimensions(new String[] {"PlanType", "Years", "Location"});
			dsParms.setPageMembers(new String[] {"ClassChn", "FY2006", "Store1"});
			dsParms.setRowDimensions(new String[] {"Time", "Product"});
			dsParms.setRowTuples(new String[][] { 
					{"Feb", "DPT110"}, {"Mar", "DPT110"}, {"Apr", "DPT110"}, 
					{"May", "DPT110"}, {"Jun", "DPT110"}, {"Jul", "DPT110"}, 
					{"Feb", "DPT130"}, {"Mar", "DPT130"}, {"Apr", "DPT130"}, 
					{"May", "DPT130"}, {"Jun", "DPT130"}, {"Jul", "DPT130"}
					});
			dsParms.setColDimensions(new String[] {"Measures", "Version"});
			final String version = "WF";
			dsParms.setColTuples(new String[][] { 
					{"SLS_DLR", version}, {"RECRTL_DLR", version}, {"EOPRTL_DLR", version}
					});
			dsParms.setDimSequence(dataCache.getBaseDimensions());
			
			// Get data slice
			logger.info("Getting data slice");
			dataSlice = dataCache.getDataSlice(dsParms);
			
			// Get data slice statistics
			logger.info("Getting data slice statistics...");
			int cols = dataSlice.getColumnCount();
			logger.info("Columns: " + cols);
			double[] data = dataSlice.getData();
			int cellCount = data.length;
			logger.info("Cell Count: " + cellCount);
			int rows = cellCount / cols;
			logger.info("Rows: " + rows);
			
			// Display Data
			logger.info("Displaying data...\n" + dataSlice.toString());
			
		} catch (PafException pfe) {
			logger.error("*** " + pfe.getMessage() + " ***");
			isSuccess = false;
		} catch (Exception e) {
			logger.error("*** Java Exception: " + e.getMessage() + " ***");
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


//	/*
//	 * Test method for 'com.pace.base.mdb.PafDataCache.testUpdateDataCache()'
//	 */
//	public void testUpdateDataCache() {
//
//		boolean isSuccess = true;
//		double[] dataSlice = null;		
//		PafDataSlice pafDataSlice = null;
//		PafDataSliceParms dsParms = null;
//		
//		logger.info("***************************************************");
//		logger.info(this.getName() +  " - Test Started");
//		try {
//			// Create new EsbData object
//			esbData = new EsbData(props);
//			
//			// Get Data Cache
//			dataCache = new PafDataCache(clientState);
//			dataCache.setPafMVS(pafMVS);
//			esbData.updateDataCache(dataCache, dataSpecByVersion);
//			
//			// Display Original Data
//			logger.info("Displaying data cache...\n" + dataCache.toString());
//
//			// Create new PafDataSliceParms object
//			dsParms = new PafDataSliceParms();
//			logger.info("Setting data slice parameters");
//			dsParms.setPageDimensions(new String[] {"PlanType", "Years", "Location"});
//			dsParms.setPageMembers(new String[] {"ClassChn", "FY2006", "Store1"});
//			dsParms.setRowDimensions(new String[] {"Time", "Product"});
//			dsParms.setRowTuples(new String[][] { 
//					{"Feb", "DPT110"}, {"Mar", "DPT110"}, {"Apr", "DPT110"}, 
//					{"May", "DPT110"}, {"Jun", "DPT110"}, {"Jul", "DPT110"}, 
//					{"Feb", "DPT120"}, {"Mar", "DPT120"}, {"Apr", "DPT120"}, 
//					{"May", "DPT120"}, {"Jun", "DPT120"}, {"Jul", "DPT120"}
//					});
//			dsParms.setColDimensions(new String[] {"Measures", "Version"});
//			dsParms.setColTuples(new String[][] { 
//					{"SLS_DLR", "WP"}, {"RECRTL_DLR", "WP"}, {"EOPRTL_DLR", "WP"}
//					});
//			
//			// Get data slice
//			logger.info("Getting data slice");
//			String[] dims = dataCache.getBaseDimensions();
//			pafDataSlice = dataCache.getDataSlice(dsParms, dims);
//			dataSlice = pafDataSlice.getData();
//			
//			// Get data slice statistics
//			logger.info("Getting data slice statistics...");
//			logger.info("Columns: " + pafDataSlice.getColumnCount());
//			logger.info("Columns: " + pafDataSlice.getRowCount());
//			logger.info("Cell Count: " + dataSlice.length);
//	
//			// Display Original Data
//			logger.info("Displaying original data slice...\n" + pafDataSlice.toString());
//
//			// Updating data slice values
//			logger.info("Updating data slice values with test values");
//			for (int i = 0; i < dataSlice.length; i++) {
//				dataSlice[i] = -i;
//			}
//		
//			// Display Updated Data Slice
//			logger.info("Displaying updated data slice...\n" + pafDataSlice.toString());
//			
//			// Update data cache with data slice
//			logger.info("Updating data cache with data slice");
//			dataCache.update(pafDataSlice, dsParms, dims);
//			
//			// Display updated data cache
//			logger.info("Displaying updated data cache...\n" + dataCache.toString());
//
//		
//		} catch (PafException pfe) {
//			logger.error("*** " + pfe.getMessage() + " ***");
//			isSuccess = false;
//		} catch (Exception e) {
//			logger.error("*** Java Exception: " + e.getMessage() + " ***");
//			isSuccess = false;
//		} finally {
//			try {
//				assertTrue(isSuccess);
//			} finally {
//				if (isSuccess) {
//					logger.info(this.getName() + " - Successful");
//					logger.info("***************************************************\n");
//				}
//				else {
//					logger.info(this.getName() + " - Failed");			
//					logger.info("***************************************************\n");
//				}
//			}
//		}
//
//	}
//
//	
	/*
	 * Test method for 'com.pace.base.mdb.PafDataCache.getDimCount()'
	 */
	public void testGetDimCount() {

	}

	/*
	 * Test method for 'com.pace.base.mdb.PafDataCache.setDimCount(int[])'
	 */
	public void testSetDimCount() {

	}
		
	/*
	 * Test method for 'com.pace.base.mdb.PafDataCache.getDimIndex()'
	 */
	public void testGetDimIndex() {

		boolean isSuccess = true;
		int index = 0;
		String dimension = null;
		String[] dimensions = null;
		
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbData object
			esbData = new EsbData(props);
			
			// Get Data
			dataCache = new PafDataCache(clientState);
			esbData.updateDataCache(dataCache, dataSpecByVersion);
			
			// Loop through dimension array
			dimensions = dataCache.getBaseDimensions();
			for (int i = 0; i < dimensions.length; i++) {
				dimension = dimensions[i];
				logger.info("Getting index for dimension [" + i
						+ "]: " + dimension); 
				index = dataCache.getAxisIndex(dimension);
				logger.info("Dimension index is: " + index);
				if (index != i) {
					// Invalid index
					logger.error ("*** Invalid index value ***");
					isSuccess = false;
				}
			}
			
//		} catch (PafException pfe) {
//			logger.error("*** " + pfe.getMessage() + " ***");
//			isSuccess = false;
		} catch (Exception e) {
			logger.error("*** Java Exception: " + e.getMessage() + " ***");
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
	 * Test method for 'com.pace.base.mdb.PafDataCache.testGetForwardPlannablePeriods()'
	 */
	public void testGetForwardPlannablePeriods() {

		boolean isSuccess = true;
		List<String> fpPeriods = null;
		
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbData object
			esbData = new EsbData(props);
			
			// Get Data Cache
			clientState.setLockedPeriodMap(lockedPeriodMap);
			dataCache = new PafDataCache(clientState);
			esbData.updateDataCache(dataCache, dataSpecByVersion);
			
			// Get Forward Plannable Periods
			logger.info("Getting Forward Plannable periods, with year: [" + currentYear +"]");
			fpPeriods = dataCache.getForwardPlannablePeriods(currentYear);
			Set<String> lockedPeriods = dataCache.getLockedPeriods(currentYear);
			logger.info("Locked Periods: " + StringUtils.arrayToString(lockedPeriods.toArray()));
			logger.info("Forward Plannable Periods: " + StringUtils.arrayToString(fpPeriods.toArray()));
			
			for (String period:fpPeriods) {
				if (lockedPeriods.contains(period)) {
					logger.error("*** Invalid test results. The locked period [" + period + "] was found in the list of Forward Plannable Periods. ***");
					isSuccess = false;
				}
			}

		
//		} catch (PafException pfe) {
//			logger.error("*** " + pfe.getMessage() + " ***");
//			isSuccess = false;
		} catch (Exception e) {
			logger.error("*** Java Exception: " + e.getMessage() + " ***");
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
	 * Test method for 'com.pace.base.mdb.PafDataCache.getIsSlicerAxis()'
	 */
	public void testGetIsSlicerAxis() {

	}

	/*
	 * Test method for 'com.pace.base.mdb.PafDataCache.setIsSlicerAxis(boolean[])'
	 */
	public void testSetIsSlicerAxis() {

	}

	/*
	 * Test method for 'com.pace.base.mdb.PafDataCache.getMdxQuery()'
	 */
	public void testGetMdxQuery() {

	}

	/*
	 * Test method for 'com.pace.base.mdb.PafDataCache.setMdxQuery(String)'
	 */
	public void testSetMdxQuery() {

	}

	/*
	 * Test method for 'com.pace.base.mdb.PafDataCache.testGetOpenPeriods(String, String)'
	 */
	public void testGetOpenPeriods() {

		boolean isSuccess = true;
		final String fcstVarVersion = "WF_vs_LY";
		final String planVarVersion = "WP_vs_LY";
		List<String> openPeriods = null;
		
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbData object
			esbData = new EsbData(props);
			
			// Get Data Cache
			dataCache = new PafDataCache(clientState);
			esbData.updateDataCache(dataCache, dataSpecByVersion);
			
			// Get Open Periods
			
			logger.info("Getting open periods - current year, plan version");
			openPeriods = dataCache.getOpenPeriods(planVersion, currentYear);
			Set<String> lockedPeriods = dataCache.getLockedPeriods(currentYear);
			logger.info("Locked Periods: " + StringUtils.arrayToString(lockedPeriods.toArray()));
			logger.info("Open Periods: " + StringUtils.arrayToString(openPeriods.toArray()));
			logger.info("");
			
//			for (String period:fpPeriods) {
//				if (lockedPeriods.contains(period)) {
//					logger.error("*** Invalid test results. The locked period [" + period + "] was found in the list of Forward Plannable Periods. ***");
//					isSuccess = false;
//				}
//			}

			logger.info("Getting open periods - current year, forecast version");
			openPeriods = dataCache.getOpenPeriods(fcstVersion, currentYear);
			logger.info("Locked Periods: " + StringUtils.arrayToString(lockedPeriods.toArray()));
			logger.info("Open Periods: " + StringUtils.arrayToString(openPeriods.toArray()));
			logger.info("");
			
			logger.info("Getting open periods - next year, forecast version");
			openPeriods = dataCache.getOpenPeriods(fcstVersion, nextYear);
			logger.info("Locked Periods: " + StringUtils.arrayToString(lockedPeriods.toArray()));
			logger.info("Open Periods: " + StringUtils.arrayToString(openPeriods.toArray()));
			logger.info("");

			logger.info("Getting open periods - current year, " + planVarVersion);
			openPeriods = dataCache.getOpenPeriods(planVarVersion, currentYear);
			logger.info("Locked Periods: " + StringUtils.arrayToString(lockedPeriods.toArray()));
			logger.info("Open Periods: " + StringUtils.arrayToString(openPeriods.toArray()));
			logger.info("");
			
			logger.info("Getting open periods - current year, " + fcstVarVersion);
			openPeriods = dataCache.getOpenPeriods(fcstVarVersion, currentYear);
			logger.info("Locked Periods: " + StringUtils.arrayToString(lockedPeriods.toArray()));
			logger.info("Open Periods: " + StringUtils.arrayToString(openPeriods.toArray()));
			logger.info("");

//		} catch (PafException pfe) {
//			logger.error("*** " + pfe.getMessage() + " ***");
//			isSuccess = false;
		} catch (Exception e) {
			logger.error("*** Java Exception: " + e.getMessage() + " ***");
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
	 * Test method for 'com.pace.base.mdb.PafDataCache.getRowCount()'
	 */
	public void testGetRowCount() {

	}

}
