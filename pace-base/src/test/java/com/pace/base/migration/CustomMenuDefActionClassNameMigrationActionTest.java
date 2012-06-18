/*
 *	File: @(#)CustomMenuDefActionClassNameMigrationActionTest.java
 * 	Package: com.pace.base.migration 	
 *  Project: Paf Base Libraries
 *  Created: July 07, 2011  		
 *  By: themoosman
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2011 A&M Software, Inc. All rights reserved.
 *
 *	This software is the confidential and proprietary information of Palladium Group, Inc.
 *	("Confidential Information"). You shall not disclose such Confidential Information and 
 * 	should use it only in accordance with the terms of the license agreement you entered into
 *	with A&M Software, Inc.
 */

package com.pace.base.migration;

public class CustomMenuDefActionClassNameMigrationActionTest extends MigrationActionTestCase {

	protected void setUp() throws Exception {
		super.setUp("./test_files/pace2600.paf");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testCustomMenuDefActionClassNameMigrationAction() {
		MigrationAction action = new CustomMenuDefActionClassNameMigrationAction(pp);
		
		assertNotNull(action);
		assertNotNull(action.getXMLPaceProject());
		assertEquals(action.getXMLPaceProject(), pp);
	}

	public void testGetStatus() {
		MigrationAction action = new CustomMenuDefActionClassNameMigrationAction(pp);
		
		assertEquals(MigrationActionStatus.NotStarted, action.getStatus());
	}

	public void testRun() {
		MigrationAction action = new CustomMenuDefActionClassNameMigrationAction(pp);
		
		assertEquals(MigrationActionStatus.NotStarted, action.getStatus());
		
		action.run();
		
		assertEquals(MigrationActionStatus.Completed, action.getStatus());
	}

}
