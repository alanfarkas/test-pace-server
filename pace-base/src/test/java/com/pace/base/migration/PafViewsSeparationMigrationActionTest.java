/*
 *	File: @(#)PafViewsSeparationMigrationActionTest.java 	Package: com.pace.base.migration 	Project: Paf Base Libraries
 *	Created: Aug 19, 2009  		By: jmilliron
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
package com.pace.base.migration;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.pace.base.PafBaseConstants;
import com.pace.base.PafConfigFileNotFoundException;
import com.pace.base.utility.PafXStream;
import com.pace.base.view.PafView;

/**
 * Class_description_goes_here
 *
 * @author jmilliron
 * @version	x.xx
 *
 */
public class PafViewsSeparationMigrationActionTest extends
		MigrationActionTestCase {

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {

		super.setUp("./test_files/pace1210.paf");
		
	}
	
	/**
	 * Test method for {@link com.pace.base.migration.PafViewsSeparationMigrationAction#PafViewsSeparationMigrationAction(com.pace.base.project.XMLPaceProject)}.
	 */
	public void testPafViewsSeparationMigrationAction() {
		
		MigrationAction action = new PafViewsSeparationMigrationAction(pp);
		
		assertNotNull(action);
		assertNotNull(action.getXMLPaceProject());
		assertEquals(action.getXMLPaceProject(), pp);
	}

	/**
	 * Test method for {@link com.pace.base.migration.PafViewsSeparationMigrationAction#getStatus()}.
	 */
	public void testGetStatus() {

		MigrationAction action = new PafViewsSeparationMigrationAction(pp);
		
		assertEquals(MigrationActionStatus.NotStarted, action.getStatus());
		
		File pafViewsXmlFile = new File(tempConfDir + File.separator
				+ PafBaseConstants.FN_ViewsMetaData);
		
		File newPafViewsDir = new File(tempConfDir+ File.separator + PafBaseConstants.DN_ViewsFldr);
		
		assertTrue(pafViewsXmlFile.exists());
		assertFalse(newPafViewsDir.exists());
		
		assertTrue(pafViewsXmlFile.delete());
		assertTrue(newPafViewsDir.mkdir());
		
		assertEquals(MigrationActionStatus.Completed, action.getStatus());
		
	}

	/**
	 * Test method for {@link com.pace.base.migration.PafViewsSeparationMigrationAction#run()}.
	 */
	public void testRun() {

		MigrationAction action = new PafViewsSeparationMigrationAction(pp);
		
		assertEquals(MigrationActionStatus.NotStarted, action.getStatus());
		
		List<PafView> list = pp.getViews();
		
		assertNotNull(list);
		assertEquals(0, list.size());
		
		File pafViewsXmlFile = new File(tempConfDir + File.separator
				+ PafBaseConstants.FN_ViewsMetaData);
		
		assertTrue(pafViewsXmlFile.exists());
		
		list = null;
		
		try {
			 PafView[] viewAr = (PafView[]) PafXStream.importObjectFromXml(pafViewsXmlFile.toString());
			 
			 assertNotNull(viewAr);
			 
			 assertTrue(viewAr.length > 0 );
			 
			 list = new ArrayList<PafView>(Arrays.asList(viewAr));
			 
		} catch (PafConfigFileNotFoundException e) {
			fail(e.getMessage());
		}
		
		assertNotNull(list);
		assertEquals(29, list.size());	
		
		File newViewsDir = new File(tempConfDir+ File.separator + PafBaseConstants.DN_ViewsFldr);
		
		assertFalse(newViewsDir.exists());
		
		action.run();
		
		assertEquals(MigrationActionStatus.Completed, action.getStatus());
		
		assertFalse(pafViewsXmlFile.exists());
		
		File pafViewsXmlFileBak = new File(tempConfDir + File.separator
				+ PafBaseConstants.FN_ViewsMetaData + PafBaseConstants.BAK_EXT);
		
		assertTrue(pafViewsXmlFileBak.exists());
		assertTrue(newViewsDir.exists());
		
		List<PafView> list2 = pp.getViews();
		
		assertNotNull(list2);
		assertEquals(29, list2.size());
		
		//2 xml and 2 backup's with all tags
		assertEquals(29, newViewsDir.list().length);
		
	}

}
