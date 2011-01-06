/*
 *	File: @(#)TestPafIntersectionIterator.java 	Package: com.palladium.paf.mdb 	Project: Essbase Provider
 *	Created: Aug 4, 2005  						By: Alan Farkas
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
package com.palladium.paf.mdb.essbase;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import junit.framework.TestCase;

import org.apache.log4j.Logger;

import com.palladium.paf.app.PafApplicationDef;
import com.palladium.paf.mdb.IMdbData;
import com.palladium.paf.mdb.PafUowCache;
import com.palladium.paf.mdb.PafIntersectionIterator;
import com.palladium.paf.mdb.testCommonParms;
import com.palladium.utility.StringUtils;

public class TestPafIntersectionIterator extends TestCase {

	/**
	 *  
	 * @author Alan Farkas
	 * 
	 */
	private Properties props = testCommonParms.getConnectionProps();
	@SuppressWarnings("unused")
	private PafApplicationDef appDef = testCommonParms.getAppDef();
	@SuppressWarnings("unused")
	private String[] activeVersions = testCommonParms.getActiveVersions();

	private int[] intersectIndexes = {0, 1, 3, 4, 5};
	private Map<String,List<String>> memberFilters = testCommonParms.getMemberFilters();

	@SuppressWarnings("unused")
	private String mdxSelect = testCommonParms.getSampleMdxSelect();
	private Map<Integer, List<String>> expandedUow = testCommonParms.getExpandedUow();

	@SuppressWarnings("unused")
	private IMdbData esbData = null;
	private PafUowCache pafUowCache = null;
	private PafIntersectionIterator intersectIter = null;

	private static Logger logger = Logger.getLogger(TestPafIntersectionIterator.class);

	/*
	 * Test method for 'com.palladium.paf.mdb.PafIntersectionIterator.PafIntersectionIterator(int[], PafUowCache)'
	 */
	public void testPafIntersectionIterator() {
		
		boolean isSuccess = true;
		
		String intersectString = null;
		
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbData object
			esbData = new EsbData(props);
			
			// Get data
			pafUowCache = esbData.getUowCache(testCommonParms.getExpandedUow(), appDef, activeVersions);
			logger.info("Data cache retrieved with [" + pafUowCache.getCellCount() + "] cells, [" + pafUowCache.getRowCount()
					+ "] rows, and [" + pafUowCache.getColumnCount() + "] columns...");
			
			// Intialize paf intersection iterator
			intersectIter = new PafIntersectionIterator(intersectIndexes, pafUowCache);
			
			// Display initial intersection value
			intersectString = intersectIter.toString();
			logger.info("Initial intersection value is: " + intersectString);
						
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
			}
		}
		
	}
	
	/*
	 * Test method for 'com.palladium.paf.mdb.PafIntersectionIterator.getNext()'
	 */
	public void testGetNext() {
		
		boolean isSuccess = true;
		int[] intersection = null;
		int[] finalIntersection = {34, 4, 0, 9, 0};
				
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbData object
			esbData = new EsbData(props);
			
			// Get data
			pafUowCache = esbData.getUowCache(expandedUow, appDef, activeVersions);
			logger.info("Data cache retrieved with [" + pafUowCache.getCellCount() + "] cells, [" + pafUowCache.getRowCount()
					+ "] rows, and [" + pafUowCache.getColumnCount() + "] columns...");
			
			// Intialize paf intersection iterator
			intersectIter = new PafIntersectionIterator(intersectIndexes, pafUowCache);
			
			// Display iniitial intersection value
			logger.info("Initial intersection value is: " + intersectIter.toString());
			
			//Iterate through all intersections twice
			for (int i = 0; i < 2; i++) {
				logger.info("\n");
				logger.info("Intersection pass: " + (i + 1));
				intersectIter.reset();
				logger.info("Beginning value is: " + intersectIter.toString());				
				while (intersectIter.hasNext()) {
					intersection = intersectIter.getNext();
					logger.info("intersection is: " + StringUtils.arrayToString(intersection));
				}
			}
			
			// Validate last intersection
			String intersectString = intersectIter.toString();
			String finalIntersectString = StringUtils.arrayToString(finalIntersection);
			if (!intersectString.equals(finalIntersectString)) {
				logger.info("Invalid final intersection value of : " + intersectIter.toString());
				isSuccess = false;
			}
			
//		} catch (PafException pfe) {
//			logger.error("*** " + pfe.getMessage() + " ***");
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
			}
		}
		
	}
	
	/*
	 * Test method for 'com.palladium.paf.mdb.PafIntersectionIterator.getNext2()'
	 */
	public void testGetNext2() {
		
		boolean isSuccess = true;
		int[] intersection = null;
		int[] finalIntersection = {12, 1, 0, 9, 0};
				
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbData object
			esbData = new EsbData(props);
			
			// Get data
			pafUowCache = esbData.getUowCache(expandedUow, appDef, activeVersions);
			logger.info("Data cache retrieved with [" + pafUowCache.getCellCount() + "] cells, [" + pafUowCache.getRowCount()
					+ "] rows, and [" + pafUowCache.getColumnCount() + "] columns...");
			
			// Intialize paf intersection iterator
			intersectIter = new PafIntersectionIterator(intersectIndexes, pafUowCache, memberFilters);
			
			// Display iniitial intersection value
			logger.info("Initial intersection value is: " + intersectIter.toString());
			
			//Iterate through all intersections twice
			for (int i = 0; i < 2; i++) {
				logger.info("\n");
				logger.info("Intersection pass: " + (i + 1));
				intersectIter.reset();
				logger.info("Beginning value is: " + intersectIter.toString());				
				while (intersectIter.hasNext()) {
					intersection = intersectIter.getNext();
					logger.info("intersection is: " + StringUtils.arrayToString(intersection));
				}
			}
			
			// Validate last intersection
			String intersectString = intersectIter.toString();
			String finalIntersectString = StringUtils.arrayToString(finalIntersection);
			if (!intersectString.equals(finalIntersectString)) {
				logger.info("Invalid final intersection value of : " + intersectIter.toString());
				isSuccess = false;
			}
			
//		} catch (PafException pfe) {
//			logger.error("*** " + pfe.getMessage() + " ***");
//			logger.error("*** " + pfe.getCause() + " ***");
//			pfe.printStackTrace();			
//			isSuccess = false;
		} catch (Exception ex) {
			logger.error("*** Java Exception: " + ex.getMessage() + " ***");
			logger.error("*** " + ex.getCause() + " ***");			
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
			}
		}
		
	}
}