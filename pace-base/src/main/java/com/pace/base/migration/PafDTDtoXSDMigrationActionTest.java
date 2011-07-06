/*
 *	File: @(#)PafDTDtoXSDMigrationActionTest.java 	Package: com.pace.baseration 	Project: Paf Base Libraries
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
package com.pace.base.migration;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;

import com.pace.base.PafBaseConstants;
import com.pace.base.project.InvalidPaceProjectInputException;
import com.pace.base.project.PaceProjectCreationException;
import com.pace.base.project.ProjectElementId;
import com.pace.base.project.XMLPaceProject;
import com.pace.base.utility.*;


/**
 * Class_description_goes_here
 *
 * @author jmilliron
 * @version	x.xx
 *
 */
public class PafDTDtoXSDMigrationActionTest extends TestCase {

	
	File systemTempDir = new File(System.getProperty("java.io.tmpdir"));

	File tempDirectory = FileUtils.createTempDirectory(systemTempDir);
	
	String dynamicDirName = tempDirectory.getAbsolutePath();
	
	XMLPaceProject titanPP = null;
	
	XMLPaceProject titanPP2820 = null;
	
	XMLPaceProject aafesPP = null;
	
	Set<ProjectElementId> set = new HashSet<ProjectElementId>();

	File confParentDir = new File(PafBaseConstants.DN_PaceTestFldr);
	
	File confDir = new File(confParentDir, "confTitan");
	
	File confDir2820 = new File(dynamicDirName);
	
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
		PafZipUtil.unzipFile("./test_files/pace2820.paf", confDir2820.toString());
		
		titanPP = new XMLPaceProject(confDir.getAbsolutePath(), set, false);
		aafesPP = new XMLPaceProject(confAafesDir.getAbsolutePath(), set, false);
		titanPP2820 = new XMLPaceProject(confDir2820.getAbsolutePath(), set, false);
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
		
		titanPP = null;
		aafesPP = null;
		titanPP2820 = null;
		
		set.clear();
		
		FileUtils.deleteDirectory(confParentDir);
		FileUtils.deleteDirectory(new File(dynamicDirName));
	}

	/**
	 * Test method for {@link com.pace.base.migration.com.pace.base.migrationPafDTDtoXSDMigrationAction(com.pace.base.project.XMLPaccom.pace.base.projectc void testPafDTDtoXSDMigrationAction() {

		
		for (XMLPaceProject xmlPaceProject : Arrays.asList(titanPP, aafesPP)) {
			
			PafDTDtoXSDMigrationAction action = new PafDTDtoXSDMigrationAction(xmlPaceProject);
			assertNotNull(action);
			assertNotNull(action.getXMLPaceProject());
			assertEquals(action.getXMLPaceProject(), xmlPaceProject);
		
		}
		
		//FileUtils.deleteDirectory(confParentDir);
	}

	/**
	 * Test method for {@link com.pace.base.migration.PafDTDtocom.pace.base.migrations()}.
	 */
	public void testGetStatus() {

		for (XMLPaceProject xmlPaceProject : Arrays.asList(titanPP, aafesPP)) {
		
			PafDTDtoXSDMigrationAction action = new PafDTDtoXSDMigrationAction(xmlPaceProject);
		
			assertEquals(MigrationActionStatus.NotStarted, action.getStatus());
		
		}
		
	}

	/**
	 * Test method for {@link com.pace.base.migration.PafDTDtoXSDMcom.pace.base.migrations()}.
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
				//changed to true because of changes in 2.8.2.x xml
				xmlPaceProject = new XMLPaceProject(xmlPaceProject.getProjectInput(), true);
			} catch (InvalidPaceProjectInputException e) {
				fail(e.getMessage());
			} catch (PaceProjectCreationException e) {
				fail(e.getMessage());
			}
			
			assertNotNull(xmlPaceProject);
			assertEquals(0, xmlPaceProject.getProjectErrorList().size());

		}
						
		FileUtils.deleteFilesInDir(confDir, true);
		FileUtils.deleteFilesInDir(confDir2820, true);
		
		//===============start 2.4 tests=============
		
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
			HashSet<ProjectElementId> filter = new HashSet<ProjectElementId>();
			filter.add(ProjectElementId.ApplicationDef);
			filter.add(ProjectElementId.NumericFormats);
			titanPP = new XMLPaceProject(confDir.getAbsolutePath(), filter, false);
		} catch (InvalidPaceProjectInputException e) {
			fail(e.getMessage());
		} catch (PaceProjectCreationException e) {
			fail(e.getMessage());
		}
		
		assertNotNull(titanPP);
		
		action.setXMLPaceProject(titanPP);
						
		assertEquals(MigrationActionStatus.NotStarted, action.getStatus());		
		
		//=-==============end 2.4 tests==================
		
		
		//==============start 2.8.2.0 tests==========
		try {
			PafZipUtil.unzipFile("./test_files/pace2820.paf", confDir2820.toString());
		} catch (IOException e) {
			fail(e.getMessage());
		}
		
		action = new PafDTDtoXSDMigrationAction(titanPP2820);
		
		assertEquals(MigrationActionStatus.Completed, action.getStatus());
		
		try {
			titanPP2820 = new XMLPaceProject(confDir2820.getAbsolutePath(), true);
		} catch (InvalidPaceProjectInputException e) {
			fail(e.getMessage());
		} catch (PaceProjectCreationException e) {
			fail(e.getMessage());
		}
		
		assertNotNull(titanPP2820);
		
		action.setXMLPaceProject(titanPP2820);
						
		assertEquals(MigrationActionStatus.Completed, action.getStatus());
		
		FileUtils.deleteFilesInDir(confDir2820, true);
						
		try {
			PafZipUtil.unzipFile("./test_files/pace2820.paf", confDir2820.toString());
		} catch (IOException e) {
			fail(e.getMessage());
		}
		
		assertEquals(MigrationActionStatus.Completed, action.getStatus());
		
		try {
			HashSet<ProjectElementId> filter = new HashSet<ProjectElementId>();
			titanPP2820 = new XMLPaceProject(confDir2820.getAbsolutePath(), filter, false);
		} catch (InvalidPaceProjectInputException e) {
			fail(e.getMessage());
		} catch (PaceProjectCreationException e) {
			fail(e.getMessage());
		}
		
		assertNotNull(titanPP2820);
		
		action.setXMLPaceProject(titanPP2820);
						
		assertEquals(MigrationActionStatus.Completed, action.getStatus());	
		//============end 2.8.2.0 tests=============
	}

}
