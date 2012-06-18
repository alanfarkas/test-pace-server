/*
 *	File: @(#)MemberTagDefTypeClassNameMigrationActionTest.java
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

import com.pace.base.PafBaseConstants;

public class MemberTagDefTypeClassNameMigrationActionTest extends  MigrationActionTestCase {

	protected void setUp() throws Exception {
		super.setUp("./test_files/TestProject.paf");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testMemberTagDefTypeClassNameMigrationAction() {
		MigrationAction action = new MemberTagDefTypeClassNameMigrationAction(new String[] {PafBaseConstants.FN_MemberTagMetaData }, this.tempConfDir.getAbsolutePath());
		
		assertNotNull(action);
	}
	public void testGetStatus() {
		MigrationAction action = new MemberTagDefTypeClassNameMigrationAction(new String[] {PafBaseConstants.FN_MemberTagMetaData }, this.tempConfDir.getAbsolutePath());
		
		assertEquals(MigrationActionStatus.NotStarted, action.getStatus());
	}

	public void testRun() {
		MigrationAction action = new MemberTagDefTypeClassNameMigrationAction(new String[] {PafBaseConstants.FN_MemberTagMetaData }, this.tempConfDir.getAbsolutePath());
		
		assertEquals(MigrationActionStatus.NotStarted, action.getStatus());
		
		action.run();
		
		assertEquals(MigrationActionStatus.Completed, action.getStatus());
	}

}
