/*
 *	File: @(#)PafViewSectionsSeparationMigrationActionTest.java 	Package: com.pace.base.migration 	Project: Paf Base Libraries
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
import com.pace.base.view.PafViewSection;

/**
 * Class_description_goes_here
 *
 * @author jmilliron
 * @version	x.xx
 *
 */
public class PafViewSectionsSeparationMigrationActionTest extends
		MigrationActionTestCase {

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {

		super.setUp("./test_files/pace1210.paf");
		
	}
	
	/**
	 * Test method for {@link com.pace.base.migration.PafViewSectionsSeparationMigrationAction#PafViewSectionsSeparationMigrationAction(com.pace.base.project.XMLPaceProject)}.
	 */
	public void testPafViewSectionsSeparationMigrationAction() {
		
		MigrationAction action = new PafViewSectionsSeparationMigrationAction(pp);
		
		assertNotNull(action);
		assertNotNull(action.getXMLPaceProject());
		assertEquals(action.getXMLPaceProject(), pp);
		
	}

	/**
	 * Test method for {@link com.pace.base.migration.PafViewSectionsSeparationMigrationAction#getStatus()}.
	 */
	public void testGetStatus() {

		MigrationAction action = new PafViewSectionsSeparationMigrationAction(pp);
		
		assertEquals(MigrationActionStatus.NotStarted, action.getStatus());
		
		File pafViewSectionsXmlFile = new File(tempConfDir + File.separator
				+ PafBaseConstants.FN_ViewSectionsMetaData);
		
		File newPafViewSectionsDir = new File(tempConfDir+ File.separator + PafBaseConstants.DN_ViewSectionsFldr);
		
		assertTrue(pafViewSectionsXmlFile.exists());
		assertFalse(newPafViewSectionsDir.exists());
		
		assertTrue(pafViewSectionsXmlFile.delete());
		assertTrue(newPafViewSectionsDir.mkdir());
		
		assertEquals(MigrationActionStatus.Completed, action.getStatus());
		
	}

	/**
	 * Test method for {@link com.pace.base.migration.PafViewSectionsSeparationMigrationAction#run()}.
	 */
	public void testRun() {
		
		MigrationAction action = new PafViewSectionsSeparationMigrationAction(pp);
		
		assertEquals(MigrationActionStatus.NotStarted, action.getStatus());
		
		List<PafViewSection> list = pp.getViewSections();
		
		assertNotNull(list);
		assertEquals(0, list.size());
		
		File pafViewSectionsXmlFile = new File(tempConfDir + File.separator
				+ PafBaseConstants.FN_ViewSectionsMetaData);
		
		assertTrue(pafViewSectionsXmlFile.exists());
		
		list = null;
		
		try {
			 PafViewSection[] viewSectionAr = (PafViewSection[]) PafXStream.importObjectFromXml(pafViewSectionsXmlFile.toString());
			 
			 assertNotNull(viewSectionAr);
			 
			 assertTrue(viewSectionAr.length > 0 );
			 
			 list = new ArrayList<PafViewSection>(Arrays.asList(viewSectionAr));
			 
		} catch (PafConfigFileNotFoundException e) {
			fail(e.getMessage());
		}
		
		assertNotNull(list);
		assertEquals(30, list.size());	
		
		File newViewSectionsDir = new File(tempConfDir+ File.separator + PafBaseConstants.DN_ViewSectionsFldr);
		
		assertFalse(newViewSectionsDir.exists());
		
		action.run();
		
		assertEquals(MigrationActionStatus.Completed, action.getStatus());
		
		assertFalse(pafViewSectionsXmlFile.exists());
		
		File pafViewSectionsXmlFileBak = new File(tempConfDir + File.separator
				+ PafBaseConstants.FN_ViewSectionsMetaData + PafBaseConstants.BAK_EXT);
		
		assertTrue(pafViewSectionsXmlFileBak.exists());
		assertTrue(newViewSectionsDir.exists());
		
		List<PafViewSection> list2 = pp.getViewSections();
		
		assertNotNull(list2);
		assertEquals(30, list2.size());
		
		//2 xml and 2 backup's with all tags
		assertEquals(30, newViewSectionsDir.list().length);
		
	}

}
