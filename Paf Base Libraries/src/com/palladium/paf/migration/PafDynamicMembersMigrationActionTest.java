/*
 *	File: @(#)PafDynamicMembersMigrationActionTest.java 	Package: com.palladium.paf.migration 	Project: Paf Base Libraries
 *	Created: Aug 13, 2009  		By: jmilliron
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
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import com.palladium.paf.PafBaseConstants;
import com.palladium.paf.PafException;
import com.palladium.paf.app.DynamicMemberDef;
import com.palladium.paf.project.InvalidPaceProjectInputException;
import com.palladium.paf.project.PaceProjectCreationException;
import com.palladium.paf.project.ProjectElementId;
import com.palladium.paf.project.ProjectSaveException;
import com.palladium.paf.project.XMLPaceProject;
import com.palladium.utility.FileUtils;

/**
 * Class_description_goes_here
 *
 * @author jmilliron
 * @version	x.xx
 *
 */
public class PafDynamicMembersMigrationActionTest extends MigrationActionTestCase {

	/**
	 * Test method for {@link com.palladium.paf.migration.PafDynamicMembersMigrationAction#PafDynamicMembersMigrationAction(com.palladium.paf.project.XMLPaceProject)}.
	 */
	public void testPafDynamicMembersMigrationActionXMLPaceProject() {
		
		PafDynamicMembersMigrationAction action = new PafDynamicMembersMigrationAction(pp);
		
		assertNotNull(action);
		assertNotNull(action.getXMLPaceProject());
		assertEquals(action.getXMLPaceProject(), pp);
	}

	/**
	 * Test method for {@link com.palladium.paf.migration.PafDynamicMembersMigrationAction#getStatus()}.
	 */
	public void testGetStatus() {
		
		PafDynamicMembersMigrationAction action = new PafDynamicMembersMigrationAction(pp);
		
		assertEquals(MigrationActionStatus.Completed, action.getStatus());
		
		String versionName = pp.getApplicationDefinitions().get(0).getMdbDef().getVersionDim();
		
		assertEquals(versionName, pp.getDynamicMembers().get(0).getDimension());
		
		pp.getDynamicMembers().get(0).setDimension("NOT VERSION DIM");
		
		assertEquals(MigrationActionStatus.NotStarted, action.getStatus());
		
		pp.getDynamicMembers().get(0).setDimension(versionName);
		
		assertEquals(MigrationActionStatus.Completed, action.getStatus());
		
		File dynamicMembersFile = new File(tempConfDir, PafBaseConstants.FN_DynamicMembers);
		
		assertTrue(dynamicMembersFile.isFile());
		
		FileUtils.deleteFilesInDir(tempConfDir, new String[] { PafBaseConstants.FN_DynamicMembers } );
		
		assertFalse(dynamicMembersFile.exists());
		
		try {
			pp.loadData(new HashSet<ProjectElementId>(Arrays.asList(ProjectElementId.DynamicMembers)));
		} catch (PafException e) {
			fail(e.getMessage());
		}
		
		assertEquals(MigrationActionStatus.NotStarted, action.getStatus());
				
		assertFalse(dynamicMembersFile.exists());
		
		try {
			pp = new XMLPaceProject(pp.getProjectInput(), new HashSet<ProjectElementId>(Arrays.asList(ProjectElementId.DynamicMembers)), true);
		} catch (InvalidPaceProjectInputException e) {
			fail(e.getMessage());
		} catch (PaceProjectCreationException e) {
			fail(e.getMessage());
		}
		
		action.setXMLPaceProject(pp);
		
		assertEquals(MigrationActionStatus.Completed, action.getStatus());
		
		FileUtils.deleteFilesInDir(tempConfDir, new String[] { PafBaseConstants.FN_DynamicMembers } );
		
		assertFalse(dynamicMembersFile.exists());
		
		try {
			pp = new XMLPaceProject(pp.getProjectInput(), new HashSet<ProjectElementId>(Arrays.asList(ProjectElementId.DynamicMembers)), false);
		} catch (InvalidPaceProjectInputException e) {
			fail(e.getMessage());
		} catch (PaceProjectCreationException e) {
			fail(e.getMessage());
		}
		
		action.setXMLPaceProject(pp);
		
		assertEquals(MigrationActionStatus.NotStarted, action.getStatus());
						
	}

	/**
	 * Test method for {@link com.palladium.paf.migration.PafDynamicMembersMigrationAction#run()}.
	 */
	public void testRun() {
		
		PafDynamicMembersMigrationAction action = new PafDynamicMembersMigrationAction(pp);
		
		assertEquals(MigrationActionStatus.Completed, action.getStatus());
		
		File dynamicMembersFile = new File(tempConfDir, PafBaseConstants.FN_DynamicMembers);
		
		assertTrue(dynamicMembersFile.isFile());
		
		FileUtils.deleteFilesInDir(tempConfDir, new String[] { PafBaseConstants.FN_DynamicMembers } );
		
		assertFalse(dynamicMembersFile.exists());
		
		try {
			pp.loadData(new HashSet<ProjectElementId>(Arrays.asList(ProjectElementId.DynamicMembers)));
		} catch (PafException e) {
			fail(e.getMessage());
		}
		
		assertEquals(MigrationActionStatus.NotStarted, action.getStatus());
		
		action.run();
		
		assertEquals(MigrationActionStatus.Completed, action.getStatus());
		
		//List<DynamicMemberDef> dynamicMemberList = pp.getDynamicMembers();
		
		assertEquals(1, pp.getDynamicMembers().size());
		
		assertEquals(pp.getApplicationDefinitions().get(0).getMdbDef().getVersionDim(), pp.getDynamicMembers().get(0).getDimension());
		
		pp.getDynamicMembers().get(0).setDimension("NOT VERSION DIM");
		
		assertNotSame(pp.getApplicationDefinitions().get(0).getMdbDef().getVersionDim(), pp.getDynamicMembers().get(0).getDimension());
		
		assertEquals(MigrationActionStatus.NotStarted, action.getStatus());
		
		action.run();
		
		assertEquals(1, pp.getDynamicMembers().size());
		assertEquals(pp.getApplicationDefinitions().get(0).getMdbDef().getVersionDim(), pp.getDynamicMembers().get(0).getDimension());
		assertEquals(1, pp.getDynamicMembers().get(0).getMemberSpecs().length);
		assertEquals(PafBaseConstants.PLAN_VERSION, pp.getDynamicMembers().get(0).getMemberSpecs()[0]);
		
		try {
			pp.save();
		} catch (ProjectSaveException e) {
			fail(e.getMessage());
		}
						
		assertTrue(dynamicMembersFile.isFile());
				
	}

}
