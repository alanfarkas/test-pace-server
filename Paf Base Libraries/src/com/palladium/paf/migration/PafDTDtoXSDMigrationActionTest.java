/*
 *	File: @(#)PafDTDtoXSDMigrationActionTest.java 	Package: com.palladium.paf.migration 	Project: Paf Base Libraries
 *	Created: Aug 12, 2009  		By: jmilliron
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
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;

import com.palladium.paf.PafBaseConstants;
import com.palladium.paf.project.InvalidPaceProjectInputException;
import com.palladium.paf.project.PaceProjectCreationException;
import com.palladium.paf.project.ProjectElementId;
import com.palladium.paf.project.XMLPaceProject;
import com.palladium.utility.FileUtils;
import com.palladium.utility.PafZipUtil;

/**
 * Class_description_goes_here
 *
 * @author jmilliron
 * @version	x.xx
 *
 */
public class PafDTDtoXSDMigrationActionTest extends TestCase {

	XMLPaceProject titanPP = null;
	
	XMLPaceProject aafesPP = null;
	
	Set<ProjectElementId> set = new HashSet<ProjectElementId>();

	File confParentDir = new File(PafBaseConstants.DN_PaceTestFldr);
	
	File confDir = new File(confParentDir, "confTitan");
	
	File confAafesDir = new File(confParentDir, "confAAFES");
	
	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
				
		if ( ! confDir.exists() ) {
			
			assertTrue(confDir.mkdirs());
		}
		
		if ( ! confAafesDir.exists() ) {
			
			assertTrue(confAafesDir.mkdirs());
		}
		
		PafZipUtil.unzipFile("./test_files/pace2400.paf", confDir.toString());
		PafZipUtil.unzipFile("./test_files/aafes2400.paf", confAafesDir.toString());
		
		titanPP = new XMLPaceProject(confDir.getAbsolutePath(), set, false);
		aafesPP = new XMLPaceProject(confAafesDir.getAbsolutePath(), set, false);
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
		
		titanPP = null;
		aafesPP = null;
		
		set.clear();
		
		FileUtils.deleteDirectory(confParentDir);
	}

	/**
	 * Test method for {@link com.palladium.paf.migration.PafDTDtoXSDMigrationAction#PafDTDtoXSDMigrationAction(com.palladium.paf.project.XMLPaceProject)}.
	 */
	public void testPafDTDtoXSDMigrationAction() {

		
		for (XMLPaceProject xmlPaceProject : Arrays.asList(titanPP, aafesPP)) {
			
			PafDTDtoXSDMigrationAction action = new PafDTDtoXSDMigrationAction(xmlPaceProject);
			assertNotNull(action);
			assertNotNull(action.getXMLPaceProject());
			assertEquals(action.getXMLPaceProject(), xmlPaceProject);
		
		}
		
		//FileUtils.deleteDirectory(confParentDir);
	}

	/**
	 * Test method for {@link com.palladium.paf.migration.PafDTDtoXSDMigrationAction#getStatus()}.
	 */
	public void testGetStatus() {

		for (XMLPaceProject xmlPaceProject : Arrays.asList(titanPP, aafesPP)) {
		
			PafDTDtoXSDMigrationAction action = new PafDTDtoXSDMigrationAction(xmlPaceProject);
		
			assertEquals(MigrationActionStatus.NotStarted, action.getStatus());
		
		}
		
	}

	/**
	 * Test method for {@link com.palladium.paf.migration.PafDTDtoXSDMigrationAction#run()}.
	 */
	public void testRun() {
		
		for (XMLPaceProject xmlPaceProject : Arrays.asList(titanPP, aafesPP)) {

			PafDTDtoXSDMigrationAction action = new PafDTDtoXSDMigrationAction(xmlPaceProject);
			
			assertEquals(MigrationActionStatus.NotStarted, action.getStatus());
			
			action.run();
			
			assertEquals(MigrationActionStatus.Completed, action.getStatus());
			
			PafDTDtoXSDMigrationAction action2 = new PafDTDtoXSDMigrationAction(xmlPaceProject);
			
			assertEquals(MigrationActionStatus.Completed, action2.getStatus());
			
			try {
				xmlPaceProject = new XMLPaceProject(xmlPaceProject.getProjectInput(), false);
			} catch (InvalidPaceProjectInputException e) {
				fail(e.getMessage());
			} catch (PaceProjectCreationException e) {
				fail(e.getMessage());
			}
			
			assertNotNull(xmlPaceProject);
			assertEquals(0, xmlPaceProject.getProjectErrorList().size());

		}
						
		FileUtils.deleteFilesInDir(confDir, true);
		
		try {
			PafZipUtil.unzipFile("./test_files/pace2400.paf", confDir.toString());
		} catch (IOException e) {
			fail(e.getMessage());
		}
		
		PafDTDtoXSDMigrationAction action = new PafDTDtoXSDMigrationAction(titanPP);
		
		assertEquals(MigrationActionStatus.NotStarted, action.getStatus());
		
		try {
			titanPP = new XMLPaceProject(confDir.getAbsolutePath(), true);
		} catch (InvalidPaceProjectInputException e) {
			fail(e.getMessage());
		} catch (PaceProjectCreationException e) {
			fail(e.getMessage());
		}
		
		assertNotNull(titanPP);
		
		action.setXMLPaceProject(titanPP);
						
		assertEquals(MigrationActionStatus.Completed, action.getStatus());
		
		FileUtils.deleteFilesInDir(confDir, true);
						
		try {
			PafZipUtil.unzipFile("./test_files/pace2400.paf", confDir.toString());
		} catch (IOException e) {
			fail(e.getMessage());
		}
		
		assertEquals(MigrationActionStatus.NotStarted, action.getStatus());
		
		try {
			titanPP = new XMLPaceProject(confDir.getAbsolutePath(), false);
		} catch (InvalidPaceProjectInputException e) {
			fail(e.getMessage());
		} catch (PaceProjectCreationException e) {
			fail(e.getMessage());
		}
		
		assertNotNull(titanPP);
		
		action.setXMLPaceProject(titanPP);
						
		assertEquals(MigrationActionStatus.NotStarted, action.getStatus());		
		
		
	}

}
