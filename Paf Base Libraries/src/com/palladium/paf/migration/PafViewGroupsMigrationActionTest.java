/*
 *	File: @(#)PafViewGroupsMigrationActionTest.java 	Package: com.palladium.paf.migration 	Project: Paf Base Libraries
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
package com.palladium.paf.migration;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.palladium.paf.PafBaseConstants;
import com.palladium.paf.PafException;
import com.palladium.paf.project.ProjectSaveException;
import com.palladium.paf.view.PafViewGroup;
import com.palladium.utility.FileFilterUtility;


/**
 * Class_description_goes_here
 *
 * @author jmilliron
 * @version	x.xx
 *
 */
public class PafViewGroupsMigrationActionTest extends MigrationActionTestCase {

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {

		super.setUp("./test_files/pace1210.paf");
		
	}
	
	/**
	 * Test method for {@link com.palladium.paf.migration.PafViewGroupsMigrationAction#PafViewGroupsMigrationAction(com.palladium.paf.project.XMLPaceProject)}.
	 */
	public void testPafViewGroupsMigrationAction() {
		
		MigrationAction action = new PafViewGroupsMigrationAction(pp);
		
		assertNotNull(action);
		assertNotNull(action.getXMLPaceProject());
		assertEquals(action.getXMLPaceProject(), pp);
	}

	/**
	 * Test method for {@link com.palladium.paf.migration.PafViewGroupsMigrationAction#getStatus()}.
	 */
	public void testGetStatus() {
		
		MigrationAction action = new PafViewGroupsMigrationAction(pp);
		
		assertEquals(MigrationActionStatus.NotStarted, action.getStatus());
		
		PafViewGroup vg1 = new PafViewGroup();
		
		vg1.setName("VG1");
	
		Map<String, PafViewGroup> viewGroupMap = new HashMap<String, PafViewGroup>();
		
		viewGroupMap.put(vg1.getName(), vg1);
				
		pp.setViewGroups(viewGroupMap);
		
		try {
			pp.save();
		} catch (ProjectSaveException e) {
			fail(e.getMessage());
		}
		
		assertEquals(MigrationActionStatus.Completed, action.getStatus());
		
		
		
	}

	/**
	 * Test method for {@link com.palladium.paf.migration.PafViewGroupsMigrationAction#run()}.
	 */
	public void testRun() {
		
		MigrationAction action = new PafViewGroupsMigrationAction(pp);
		
		assertEquals(MigrationActionStatus.NotStarted, action.getStatus());
		
		Map<String, PafViewGroup> viewGroupMap =  pp.getViewGroups();
		
		/*try {
			for (PafViewGroup vg : viewGroupMap.values()) {
				
				System.out.println(vg.getName());
				
			}
		} catch (ClassCastException cce ) {
			fail(cce.getMessage());
		}*/
		
		File viewGroupFile = new File(tempConfDir + File.separator + PafBaseConstants.FN_ViewGroups);
		
		Set<String> filterSet = new HashSet<String>	();
		
		filterSet.add("<PafViewGroup>");
		
		try {
			assertFalse(FileFilterUtility.doFiltersExistsInFile(viewGroupFile, filterSet));
		} catch (FileNotFoundException e1) {
			fail(e1.getMessage());
		}
		
		//assertEquals(0, viewGroupMap.size());
		
		action.run();
				
		assertEquals(MigrationActionStatus.Completed, action.getStatus());
		

		try {
			assertTrue(FileFilterUtility.doFiltersExistsInFile(viewGroupFile, filterSet));
		} catch (FileNotFoundException e1) {
			fail(e1.getMessage());
		}
		
		try {
			pp.reloadData();
		} catch (PafException e) {
			fail(e.getMessage());
		}
		
		viewGroupMap =  pp.getViewGroups();
		
		assertEquals(5, viewGroupMap.size());
		
				
	}

}
