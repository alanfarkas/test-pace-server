/*
 *	File: @(#)WOSFuncTest.java 	Package: com.pace.base.cf 	Project: PafCustomFunctions
 *	Created: May 23, 2006  		By: Alan Farkas
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

package com.pace.ext.funcs;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import junit.framework.TestCase;

import org.apache.log4j.Logger;

import com.pace.base.PafException;
import com.pace.base.app.PafApplicationDef;
import com.pace.base.comm.ClientInitRequest;
import com.pace.base.data.Intersection;
import com.pace.base.data.MemberTreeSet;
import com.pace.base.mdb.PafBaseTree;
import com.pace.base.mdb.PafDataCache;
import com.pace.base.mdb.testCommonParms;
import com.pace.base.state.EvalState;
import com.pace.base.state.PafClientState;
import com.pace.base.utility.StringUtils;
import com.pace.mdb.essbase.EsbData;
import com.pace.mdb.essbase.EsbMetaData;

/**
 * Test Execute
 *
 * @version	x.xx
 * @author Alan Farkas
 *
 */
public class WOSFuncTest extends TestCase {
	
    private static String[] activeVersions = testCommonParms.getActiveVersions();
	private static Map<Integer, List<String>> expandedUow = testCommonParms.getExpandedUow();
	private PafApplicationDef appDef = testCommonParms.getAppDef();
	private Properties props = testCommonParms.getConnectionProps();
	private static Logger logger = Logger.getLogger(WOSFuncTest.class);
	
	/*
	 * Test method for 'com.pace.base.cf.WOSFuncTest.calculate()'
	 */
	public void testCalculate() {
		
		boolean isSuccess = true;
		double result = 0;
		String timeDim = null, measureDim = null;
		String[] args = null;
		final String salesMeas = "SLS_DLR";
		final String invMeas = "BOPRTL_DLR";
		final String timeRoot = "S01";
		
		Intersection sourceIs = null;
		PafDataCache dataCache = null;
		EvalState evalState = null;
		WOSFunc wosFunc = new WOSFunc();
		PafClientState clientState = null;
		
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			
			// Get data
			logger.info("Getting essbase data");
			EsbData esbData = new EsbData(props);		
			dataCache = esbData.getUowCache(expandedUow, appDef, activeVersions);
			measureDim = dataCache.getMeasureDim();
			timeDim = dataCache.getTimeDim();
			
			// Create intersection object
			logger.info("Creating intersection object");
			//sourceIs = new Intersection(new String[]{"a"});
//			String[] dims = {"Version", "PlanType", timeDim, "Product", measureDim, "Location", "Years"};
//			sourceIs = new Intersection(dims, mbrs);
//			String[] mbrs = {"WP", "ClassChn", "WK05", "DPT110", "FWOS", "Store1", "FY2005"};
			String[] dims = dataCache.getAllDimensions();
			sourceIs = new Intersection(dims);
			sourceIs.setCoordinate("Years", "FY2006");
			sourceIs.setCoordinate("PlanType", "ClassChn");
			sourceIs.setCoordinate("Version", "WP");
			sourceIs.setCoordinate("Location", "Store1");
			sourceIs.setCoordinate("Product", "DPT110");
			sourceIs.setCoordinate(measureDim, "FWOS");
			sourceIs.setCoordinate(timeDim, "WK05");

			// Create time tree (prune down to S01)
			logger.info("Creating time tree");
			EsbMetaData esbMetaData = new EsbMetaData(props);
			PafBaseTree timeTree = esbMetaData.getBaseDimension(dataCache.getTimeDim());
			timeTree = timeTree.getSubTreeCopy(timeRoot);
			
			// Create measures tree
			logger.info("Creating measure tree");
			PafBaseTree measureTree = esbMetaData.getBaseDimension(measureDim);
			
			// Create client state
			logger.info("Creating client state");
			clientState = testCommonParms.getClientState();
			clientState.setApp(appDef);
			
			// Test relies on Measure and Time tree
			MemberTreeSet treeSet = new MemberTreeSet();			
			treeSet.addTree(timeDim, timeTree);			
			treeSet.addTree(measureDim, measureTree);			
			clientState.setUowTrees(treeSet);
			
			// Create eval state
			logger.info("Creating eval state");
			evalState = new EvalState(clientState, dataCache);
			evalState.getDataCacheTrees().addTree(timeDim, timeTree);
			try {
				// Execute WOSFunction - No Parms
				isSuccess = true;
				logger.info("Executing WOS Function - No Parms");
				result = wosFunc.calculate(sourceIs, dataCache, evalState);
				isSuccess = false;
			} catch (PafException pfe) {
			} finally {
				assertTrue(isSuccess);
				logger.info("");
			}
			
			try {
				// Execute WOSFunction - One Parms
				isSuccess = true;
				logger.info("Executing WOS Function - 1 Parm");
				args = new String[1];
				args[0] = salesMeas;
				wosFunc.parseParameters(StringUtils.arrayToString(args, "(", ")", "", "", ","));
				result = wosFunc.calculate(sourceIs, dataCache, evalState);
				isSuccess = false;
			} catch (PafException pfe) {
			} finally {
				assertTrue(isSuccess);
				logger.info("");
			}
			
			try {
				// Execute WOSFunction - Bad sales meaure
				isSuccess = true;
				logger.info("Executing WOS Function - 2 Parms / Bad Sales Measure");
				args = new String[2];
				args[0] = "BAD_SALES";
				args[1] = invMeas;
				wosFunc.parseParameters(StringUtils.arrayToString(args, "(", ")", "", "", ","));
				result = wosFunc.calculate(sourceIs, dataCache, evalState);
				isSuccess = false;
			} catch (PafException pfe) {
			} finally {
				assertTrue(isSuccess);
				logger.info("");
			}
			
			try {
				// Execute WOSFunction - Bad inventory meaure
				isSuccess = true;
				logger.info("Executing WOS Function - 2 Parms / Bad Inventory");
				args = new String[2];
				args[0] = salesMeas;
				args[1] = "BAD_INV";
				wosFunc.parseParameters(StringUtils.arrayToString(args, "(", ")", "", "", ","));
				result = wosFunc.calculate(sourceIs, dataCache, evalState);
				isSuccess = false;
			} catch (PafException pfe) {
			} finally {
				assertTrue(isSuccess);
				logger.info("");
			}
									
			//sourceIs = new Intersection(new String[]{"a"});
			
			try {
				// Execute WOSFunction - Not at Quarter
				isSuccess = true;
				logger.info("Executing WOS Function - At Quarter");
				args = new String[2];
				args[0] = salesMeas;
				args[1] = invMeas;
				Intersection sourceIsQ1 = sourceIs.clone();
				sourceIsQ1.setCoordinate(timeDim, "Q1");
				result = wosFunc.calculate(sourceIsQ1, dataCache, evalState);
				isSuccess = (result == 0 ? true:false);
			} catch (PafException pfe) {
			} finally {
				assertTrue(isSuccess);
				logger.info("");
			}

			// Execute WOSFunction - Good Parms
			isSuccess = false;
			logger.info("Executing WOS Function - Good Parms");
			args = new String[2];
			args[0] = salesMeas;
			args[1] = invMeas;
			wosFunc.parseParameters(StringUtils.arrayToString(args, "(", ")", "", "", ","));
			result = wosFunc.calculate(sourceIs, dataCache, evalState);

			// Display response
			logger.info("Result: " + result);
			isSuccess = true;
						
		} catch (Exception e) {
			logger.info("Exception: " + e.getMessage());	
			isSuccess = false;
		} finally {
			logger.info(this.getName());
			if (isSuccess) {
				logger.info(this.getName() + " - Successful");
				logger.info("***************************************************\n");
			}
			else {
				logger.info(this.getName() + " - Failed");			
				logger.info("***************************************************\n");
			}
			assertTrue(isSuccess);
//			assertTrue(true);		
		}
	}
}