/*
 *	File: @(#)PafXStreamDataItemTest.java 	Package: com.pace.base.project 	Project: Paf Base Libraries
 *	Created: Jul 30, 2009  		By: jmilliron
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2007 Palladium Group, Inc. All rights reserved.
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
package com.pace.base.project;

import java.io.File;
import java.util.Date;

import com.pace.base.PafBaseConstants;
import com.pace.base.app.PafApplicationDef;
import com.pace.base.migration.MigrationActionTestCase;

/**
 * Class_description_goes_here
 *
 * @author jmilliron
 * @version	x.xx
 *
 */
public class PafXStreamElementItemTest extends MigrationActionTestCase {

	PafXStreamElementItem<PafApplicationDef[]> pafAppXStreamDataItem;
	
	//String CONF_DIR = "C:\\Program Files (x86)\\Pace\\PafServer\\conf_test\\";
	
	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		
		pafAppXStreamDataItem = new PafXStreamElementItem<PafApplicationDef[]>(tempConfDir.getAbsolutePath() + File.separator + PafBaseConstants.FN_ApplicationMetaData);
		
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}
	
	/**
	 * Test method for {@link com.pace.base.project.PafXStreamElementItem#PafXStreamDataItem(java.lang.String)}.
	 */
	public void testPafXStreamDataItem() {
		
		pafAppXStreamDataItem = new PafXStreamElementItem<PafApplicationDef[]>(tempConfDir.getAbsolutePath() + File.separator + PafBaseConstants.FN_ApplicationMetaData);
		
		assertNotNull(pafAppXStreamDataItem);
		
	}
	
	/**
	 * Test method for {@link com.pace.base.project.PafXStreamElementItem#read()}.
	 */
	public void testRead() {
		
		PafApplicationDef[] pafApps = null;
		try {
			pafApps = pafAppXStreamDataItem.read();
		} catch (PaceProjectReadException e) {
			fail(e.getMessage());
		}
		
		assertNotNull(pafApps);
		assertEquals(1, pafApps.length);
		
	}

	/**
	 * Test method for {@link com.pace.base.project.PafXStreamElementItem#write(java.lang.Object)}.
	 */
	public void testWrite() {
		
		PafApplicationDef[] pafApps = null;
		try {
			pafApps = pafAppXStreamDataItem.read();
		} catch (PaceProjectReadException e) {
			fail(e.getMessage());
		}
		
		assertNotNull(pafApps);
		assertEquals(1, pafApps.length);
		
		String oldAppId = pafApps[0].getAppId();
		
		String newAppId = (new Date()).toString();
		
		pafApps[0].setAppId(newAppId);
		
		pafAppXStreamDataItem.write(pafApps);
						
		PafApplicationDef[] updatedPafApps = null;
		
		try {
			updatedPafApps = pafAppXStreamDataItem.read();
		} catch (PaceProjectReadException e) {
			fail(e.getMessage());
		}
		
		assertNotNull(updatedPafApps);
		assertEquals(1, updatedPafApps.length);
		assertEquals(newAppId, updatedPafApps[0].getAppId());
		
		pafApps[0].setAppId(oldAppId);
		pafAppXStreamDataItem.write(pafApps);
		
		try {
			updatedPafApps = pafAppXStreamDataItem.read();
		} catch (PaceProjectReadException e) {
			fail(e.getMessage());
		}
		
		assertNotNull(updatedPafApps);
		assertEquals(1, updatedPafApps.length);
		assertEquals(oldAppId, updatedPafApps[0].getAppId());
	}

}
