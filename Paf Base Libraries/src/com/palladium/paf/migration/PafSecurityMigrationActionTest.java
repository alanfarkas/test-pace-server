/*
 *	File: @(#)PafSecurityMigrationActionTest.java 	Package: com.palladium.paf.migration 	Project: Paf Base Libraries
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

import java.util.List;
import java.util.Map;

import com.palladium.paf.app.PafDimSpec;
import com.palladium.paf.app.PafUserSecurity;
import com.palladium.paf.app.PafWorkSpec;
import com.palladium.paf.project.ProjectSaveException;


/**
 * Class_description_goes_here
 *
 * @author jmilliron
 * @version	x.xx
 *
 */
public class PafSecurityMigrationActionTest extends MigrationActionTestCase {

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {

		super.setUp("./test_files/pace1210.paf");
		
	}

	/**
	 * Test method for {@link com.palladium.paf.migration.PafSecurityMigrationAction#PafSecurityMigrationAction(com.palladium.paf.project.XMLPaceProject)}.
	 */
	public void testPafSecurityMigrationActionXMLPaceProject() {
		
		MigrationAction action = new PafSecurityMigrationAction(pp);
		
		assertNotNull(action);
		assertNotNull(action.getXMLPaceProject());
		assertEquals(action.getXMLPaceProject(), pp);
	}

	/**
	 * Test method for {@link com.palladium.paf.migration.PafSecurityMigrationAction#getStatus()}.
	 */
	public void testGetStatus() {
		
		MigrationAction action = new PafSecurityMigrationAction(pp);
		
		assertEquals(MigrationActionStatus.NotStarted, action.getStatus());
		
		List<PafUserSecurity> userSecurityList = pp.getUserSecurity();
		
		for (PafUserSecurity userSecurity : userSecurityList ) {
			
			Map<String, PafWorkSpec[]> workSpecArMap = userSecurity.getRoleFilters();
			
			for (PafWorkSpec[] workSpecAr : workSpecArMap.values()) {
						
				for ( PafWorkSpec workSpec :  workSpecAr ) {
					
					for (PafDimSpec dimSpec : workSpec.getDimSpec() ) {
						
						assertTrue(dimSpec.isSelectable());
						
					}
					
				}
				
			}
		}
		
		pp.setUserSecurity(userSecurityList);
		
		assertEquals(MigrationActionStatus.NotStarted, action.getStatus());
		
		try {
			pp.save();
		} catch (ProjectSaveException e) {
			fail(e.getMessage());
		}
		
		assertEquals(MigrationActionStatus.Completed, action.getStatus());
		
	}

	/**
	 * Test method for {@link com.palladium.paf.migration.PafSecurityMigrationAction#run()}.
	 */
	public void testRun() {
		
		MigrationAction action = new PafSecurityMigrationAction(pp);
		
		assertEquals(MigrationActionStatus.NotStarted, action.getStatus());
		
		action.run();
		
		assertEquals(MigrationActionStatus.Completed, action.getStatus());
	
		List<PafUserSecurity> userSecurityList = pp.getUserSecurity();
		
		for (PafUserSecurity userSecurity : userSecurityList ) {
			
			Map<String, PafWorkSpec[]> workSpecArMap = userSecurity.getRoleFilters();
			
			for (PafWorkSpec[] workSpecAr : workSpecArMap.values()) {
						
				for ( PafWorkSpec workSpec :  workSpecAr ) {
					
					for (PafDimSpec dimSpec : workSpec.getDimSpec() ) {
						
						assertFalse(dimSpec.isSelectable());
						
					}
					
				}
				
			}
		}
		
	}

}
