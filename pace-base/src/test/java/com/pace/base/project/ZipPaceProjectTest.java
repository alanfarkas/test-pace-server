/*
 *	File: @(#)ZipPaceProjectTest2.java 	Package: com.pace.base.project 	Project: Paf Base Libraries
 *	Created: Aug 3, 2009  		By: jmilliron
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
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import junit.framework.TestCase;

import com.pace.base.PafBaseConstants;
import com.pace.base.PafException;
import com.pace.base.app.MeasureDef;
import com.pace.base.app.PafApplicationDef;
import com.pace.base.utility.FileUtils;
import com.pace.base.utility.PafZipUtil;

/**
 * Class_description_goes_here
 *
 * @author jmilliron
 * @version	x.xx
 *
 */
public class ZipPaceProjectTest extends TestCase {

	private static final String PACE_TEST = "pace-test\\";

	String inputFile = "./test_files/pace.paf";
		
	PaceProject pp = null;
	
	File outputPafFile = new File("./test_files/pace-output.paf");
	
	File saveAsFile = new File("./test_files/pace-saveas.paf");
	
	private File paceTempDir = new File(PafBaseConstants.DN_PaceTestFldr);
	
	String saveTo = "./test_files/saveTo.paf";
			
	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		
		//pp = new ZipPaceProject(inputFile);
		
		if ( outputPafFile.exists() ) {
			
			outputPafFile.delete();
			
		}
		
		File tmpC = new File(PACE_TEST);
		
		if ( ! tmpC.exists() ) {
			
			tmpC.mkdir();
			
		}
		
		assertFalse(outputPafFile.exists());
		
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();

		pp = null;
		
		
	}
		
	public void testScenario1() {
		
		Set<ProjectElementId> set = new HashSet<ProjectElementId>();
		
		set.add(ProjectElementId.ApplicationDef);
		
		try {
			pp = new ZipPaceProject(inputFile, set);
		} catch (InvalidPaceProjectInputException e) {
			fail(e.getMessage());
		} catch (PaceProjectCreationException e) {
			fail(e.getMessage());
		}
		
		assertNotNull(pp);
		
		List<PafApplicationDef> pafAppList = pp.getApplicationDefinitions();
		
		assertEquals(1, pafAppList.size());
		
		PafApplicationDef pafApp = pafAppList.get(0);
		
		assertEquals("TitanCopy", pafApp.getAppId());
		
		String oldAppId = pafApp.getAppId();
		
		String newAppId = (new Date()).toString();
		
		pafApp.setAppId(newAppId);
		
		pafAppList.set(0, pafApp);
		
		pp.setApplicationDefinitions(pafAppList);
						
		try {
			pp.save();
		} catch (ProjectSaveException e1) {
			fail(e1.getMessage());
		}
		
		PaceProject pp2 = null;
		
		try {
			pp2 = new ZipPaceProject(inputFile, set);
		} catch (InvalidPaceProjectInputException e) {
			fail(e.getMessage());
		} catch (PaceProjectCreationException e) {
			fail(e.getMessage());
		}
		
		assertNotNull(pp2);
		
		pafAppList = pp2.getApplicationDefinitions();
		
		assertEquals(1, pafAppList.size());
		
		pafApp = pafAppList.get(0);
		
		assertEquals(newAppId, pafApp.getAppId());
		
		pafAppList.get(0).setAppId(oldAppId);
		
		pp2.setApplicationDefinitions(pafAppList);
		
		try {
			pp2.save();
		} catch (ProjectSaveException e) {
			fail(e.getMessage());
		}
		
		
	}

	public void testScenario2() {
						
		Set<ProjectElementId> set = new HashSet<ProjectElementId>();
		
		set.add(ProjectElementId.ApplicationDef);
		
		try {
			pp = new ZipPaceProject(inputFile, set);
		} catch (InvalidPaceProjectInputException e) {
			fail(e.getMessage());
		} catch (PaceProjectCreationException e) {
			fail(e.getMessage());
		}
		
		assertNotNull(pp);
		
		assertEquals(1, pp.getProjectDataMap().size());
		
		File tempDirectory = FileUtils.createTempDirectory(paceTempDir);
						
		assertTrue(tempDirectory.isDirectory());
								
		try {
			pp.saveTo(outputPafFile.toString());
		} catch (ProjectSaveException e) {
			fail(e.getMessage());
		}
		
		FileUtils.deleteFilesInDir(tempDirectory.getParentFile(), true);
		
		assertFalse(tempDirectory.isDirectory());
		
	}
	
	public void testScenario3() {
		
		//Set<ProjectElementId> set = new HashSet<ProjectElementId>();
		
		//set.add(ProjectElementId.ApplicationDef);
		
		PaceProject zipPP = null;
		
		try {
			zipPP = new ZipPaceProject(inputFile);
		} catch (InvalidPaceProjectInputException e) {
			fail(e.getMessage());
		} catch (PaceProjectCreationException e) {
			fail(e.getMessage());
		}
		
		assertNotNull(zipPP);
						
		try {
			zipPP.saveTo(outputPafFile.toString());
		} catch (ProjectSaveException e) {
			fail(e.getMessage());
		}
		
		PaceProject xmlPP = zipPP.convertTo(ProjectSerializationType.XML);
		
		try {
			xmlPP.save();
		} catch (ProjectSaveException e) {
			assertNotNull(e);
		}
		
		try {
			xmlPP.saveTo(PACE_TEST + Long.valueOf((new Date()).getTime()).toString());
		} catch (ProjectSaveException e) {
			fail(e.getMessage());
		}	
		
		Set<ProjectElementId> set = new HashSet<ProjectElementId>();
		
		set.add(ProjectElementId.ApplicationDef);
		set.add(ProjectElementId.RuleSets);
		
		
		try {
			xmlPP.saveTo(PACE_TEST + Long.valueOf((new Date()).getTime()).toString(), set);
		} catch (ProjectSaveException e) {
			fail(e.getMessage());
		}	
				
	}
	
	public void testScenario4() {

		File tempDirectory = FileUtils.createTempDirectory(paceTempDir);
	
		FileUtils.deleteFilesInDir(tempDirectory, true);
	
		PaceProject zipPP = null;
		
		try {
			zipPP = new ZipPaceProject(inputFile);
			
			assertEquals(23, zipPP.getProjectDataMap().size());
			
		} catch (InvalidPaceProjectInputException e) {
			fail(e.getMessage());
		} catch (PaceProjectCreationException e) {
			fail(e.getMessage());
		}
		
		assertNotNull(zipPP);
								
		PaceProject pp = zipPP.convertTo(ProjectSerializationType.XML);
		
		assertEquals(23, pp.getProjectDataMap().size());
		
		assertTrue(tempDirectory.isDirectory());
					
		try {
			pp.saveTo(tempDirectory.toString());
		} catch (ProjectSaveException e) {
			fail(e.getMessage());
		}
					
		//System.out.println("Pace temp: " + tempDirectory.getAbsolutePath());
		
		XMLPaceProject xmlPP = null;
		
		try {
			 xmlPP = new XMLPaceProject(tempDirectory.toString(), false);
		} catch (InvalidPaceProjectInputException e) {
			fail(e.getMessage());
		} catch (PaceProjectCreationException e) {
			fail(e.getMessage());
		}
		
		assertNotNull(xmlPP);
		
		assertEquals(23, xmlPP.getProjectDataMap().size());
		
		PaceProject zipPP2 = xmlPP.convertTo(ProjectSerializationType.PAF);		
		
		try {
			zipPP2.saveTo(outputPafFile.toString());
		} catch (ProjectSaveException e) {
			fail(e.getMessage());
		}
		
		PaceProject zipPP3 = null;
		
		try {
			zipPP3 = new ZipPaceProject(outputPafFile.toString());
		} catch (InvalidPaceProjectInputException e) {
			fail(e.getMessage());
		} catch (PaceProjectCreationException e) {
			fail(e.getMessage());
		}
		
		assertNotNull(zipPP3);
		
		assertEquals(23, zipPP3.getProjectDataMap().size());
		
		List<PafApplicationDef> pafAppList = zipPP3.getApplicationDefinitions();
		
		assertEquals(1, pafAppList.size());
		
		PafApplicationDef pafApp = pafAppList.get(0);
		
		String appId = pafApp.getAppId();
		
		String updated_txt = "UPDATED";
		
		String updatedAppId = appId + updated_txt;
		
		pafApp.setAppId(updatedAppId);
		
		List<MeasureDef> measureList = zipPP3.getMeasures();
		
		for (MeasureDef measureDef : measureList) {
			
			assertFalse(measureDef.getName().contains(updated_txt));
			
			measureDef.setName(measureDef.getName() + updated_txt);
			
			assertTrue(measureDef.getName().contains(updated_txt));
			
		}
		
		zipPP3.setMeasures(measureList);
		
		zipPP3.setApplicationDefinitions(Arrays.asList(pafApp));
		
		Set<ProjectElementId> filterSet = new HashSet<ProjectElementId>();
		
		filterSet.add(ProjectElementId.ApplicationDef);
		
		try {
			zipPP3.save(filterSet);
		} catch (ProjectSaveException e) {
			fail(e.getMessage());
		}
		
		PaceProject zipPP4 = null;
		
		try {
			zipPP4 = new ZipPaceProject(outputPafFile.toString());
		} catch (InvalidPaceProjectInputException e) {
			fail(e.getMessage());
		} catch (PaceProjectCreationException e) {
			fail(e.getMessage());
		}
		
		assertNotNull(zipPP4);
		
		assertEquals(23, zipPP4.getProjectDataMap().size());
		
		pafAppList = zipPP4.getApplicationDefinitions();
		
		assertEquals(1, pafAppList.size());
		
		pafApp = pafAppList.get(0);
		
		assertEquals(pafApp.getAppId(), updatedAppId);
		
		measureList = zipPP4.getMeasures();
		
		for (MeasureDef measureDef : measureList) {
			
			assertFalse(measureDef.getName().contains(updated_txt));
			
		}
		
		//save with measures
		try {
			zipPP3.save();
		} catch (ProjectSaveException e) {
			fail(e.getMessage());
		}
		
		filterSet.clear();
		filterSet.add(ProjectElementId.Measures);
		
		try {
			zipPP4.loadData(filterSet);
		} catch (PafException e) {
			fail(e.getMessage());
		}
		
		measureList = zipPP4.getMeasures();
		
		for (MeasureDef measureDef : measureList) {
			
			assertTrue(measureDef.getName().contains(updated_txt));
			
		}		
		
		FileUtils.deleteFilesInDir(tempDirectory.getParentFile(), true);
		
		assertFalse(tempDirectory.exists());
	}
	
	
	public void testSaveTo() {

		if ( saveAsFile.exists()) {
			
			assertTrue(saveAsFile.delete());
			
		}
		
		try {
			pp = new ZipPaceProject(inputFile, null);
		} catch (InvalidPaceProjectInputException e) {
			fail(e.getMessage());
		} catch (PaceProjectCreationException e) {
			fail(e.getMessage());
		}
								
		Set<ProjectElementId> firstSet = new HashSet<ProjectElementId>();
		
		firstSet.add(ProjectElementId.ApplicationDef);
		
		Set<ProjectElementId> secondSet = new HashSet<ProjectElementId>();
		
		secondSet.add(ProjectElementId.CustomFunctions);
		secondSet.add(ProjectElementId.CustomMenus);
		
		try {
			pp.saveTo(saveAsFile.toString(), firstSet);
		} catch (ProjectSaveException e) {
			fail(e.getMessage());
		}

		try {
			PaceProject tmpPP = new ZipPaceProject(saveAsFile.toString(), null);
			
			assertTrue(tmpPP.getApplicationDefinitions().size() > 0);
			assertFalse(tmpPP.getCustomMenus().size() > 0);
			assertFalse(tmpPP.getCustomFunctions().size() > 0);
			
			pp.saveTo(saveAsFile.toString(), secondSet);
			
			tmpPP = null;
			
			tmpPP = new ZipPaceProject(saveAsFile.toString(), null);
			
			assertTrue(tmpPP.getApplicationDefinitions().size() > 0);
			assertTrue(tmpPP.getCustomMenus().size() > 0);
			assertTrue(tmpPP.getCustomFunctions().size() > 0);
			
		} catch (InvalidPaceProjectInputException e) {
			fail(e.getMessage());
		} catch (PaceProjectCreationException e) {
			fail(e.getMessage());
		} catch (ProjectSaveException e) {
			fail(e.getMessage());
		}
		
		//clean up
		if ( saveAsFile.exists()) {
			
			assertTrue(saveAsFile.delete());
			
		}
		
	}
	
    public void testProjectUpgrade1210ToCurrent(){
		
    	loadUpgradeAndTestProject("./test_files/pace1210.paf");
		
	}
    
    public void testProjectUpgrade2000ToCurrent(){
		
    	loadUpgradeAndTestProject("./test_files/pace2000.paf");
		
	}
    
    public void testProjectUpgrade2010ToCurrent(){
		
    	loadUpgradeAndTestProject("./test_files/pace2010.paf");
		
	}
    
    public void testProjectUpgrade2020ToCurrent(){
		
    	loadUpgradeAndTestProject("./test_files/pace2020.paf");
		
	}
    
    public void testProjectUpgrade2021ToCurrent(){
		
    	loadUpgradeAndTestProject("./test_files/pace2021.paf");
		
	}
    
    public void testProjectUpgrade2030ToCurrent(){
		
    	loadUpgradeAndTestProject("./test_files/pace2030.paf");
		
	}
    
    public void testProjectUpgrade2031ToCurrent(){
		
    	loadUpgradeAndTestProject("./test_files/pace2031.paf");
		
	}
    
    public void testProjectUpgrade2032ToCurrent(){
		
    	loadUpgradeAndTestProject("./test_files/pace2032.paf");
		
	}
    
    public void testProjectUpgrade2200ToCurrent(){
		
    	loadUpgradeAndTestProject("./test_files/pace2200.paf");
		
	}
	
	public void testProjectUpgrade2400ToCurrent(){
		
		loadUpgradeAndTestProject("./test_files/pace2400.paf");
		
	}
	
	public void testProjectUpgrade2410ToCurrent(){
		
		loadUpgradeAndTestProject("./test_files/pace2410.paf");
		
	}
	
	public void testProjectUpgrade2420ToCurrent(){
		
		loadUpgradeAndTestProject("./test_files/pace2420.paf");
		
	}
	
	public void testProjectUpgrade2430ToCurrent(){
		
		loadUpgradeAndTestProject("./test_files/pace2430.paf");
		
	}
	
	public void testProjectUpgrade2440ToCurrent(){
		
		loadUpgradeAndTestProject("./test_files/pace2440.paf");
		
	}
	
	public void testProjectUpgrade2600ToCurrent(){
		
		loadUpgradeAndTestProject("./test_files/pace2600.paf");
		
	}
	
	public void testProjectUpgrade2601ToCurrent(){
		
		loadUpgradeAndTestProject("./test_files/pace2601.paf");
		
	}
	
	public void testProjectUpgrade2602ToCurrent(){
		
		loadUpgradeAndTestProject("./test_files/pace2602.paf");
		
	}
	
	public void testProjectUpgrade2610ToCurrent(){
		
		loadUpgradeAndTestProject("./test_files/pace2610.paf");
		
	}
	
	public void testProjectUpgrade2800ToCurrent(){
		
		loadUpgradeAndTestProject("./test_files/pace2800.paf");
		
	}
	
	public void testProjectUpgrade2810ToCurrent(){
		
		loadUpgradeAndTestProject("./test_files/pace2810.paf");
		
	}
	
	
	public void testProjectUpgrade2811ToCurrent(){
		
		loadUpgradeAndTestProject("./test_files/pace2811.paf");
		
	}
	
	public void testProjectUpgrade2820ToCurrent(){
		
		loadUpgradeAndTestProject("./test_files/pace2820.paf");
		
	}
	
	public void testProjectUpgradeCatLiteSafewayToCurrent(){
		
		loadUpgradeAndTestProject("./test_files/CatLiteSafeway.paf");
		
	}
	
	public void testProjectUpgradeMerchPlanAafesToCurrent(){
		
		loadUpgradeAndTestProject("./test_files/MerchPlnAAFES.paf");
		
	}
	
	public void testProjectUpgradeTestProjectToCurrent(){
		
		loadUpgradeAndTestProject("./test_files/TestProject.paf");
		
	}	
	
	public void testProjectUpgradeOddTestProjectToCurrent(){
		
		//loadUpgradeAndTestProject("./test_files/OddProjectFromJim.paf");
		
		String path = "./test_files/OddProjectFromJim.paf";
		
		//convert project
		PaceProject tempPaceProject = null;
		
		try {
			tempPaceProject = new ZipPaceProject(path, null, true);
		} catch (InvalidPaceProjectInputException e) {
			assertTrue(tempPaceProject.getProjectErrorList().size() > 0);
		} catch (PaceProjectCreationException e) {
			 assertTrue(e.getProjectCreationErrorMap().size() > 0);
		}
		
	}	
	
	public void testProjectUpgradeKatzToCurrent(){
		
		loadUpgradeAndTestProject("./test_files/katz.paf");
		
	}	
	
	public void loadUpgradeAndTestProject(String path){
		
		//convert project
		PaceProject tempPaceProject = null;
		
		try {
			tempPaceProject = new ZipPaceProject(path, null, true);
		} catch (InvalidPaceProjectInputException e) {
			fail(e.getMessage());
		} catch (PaceProjectCreationException e) {
			fail(e.getMessage());
		}
		
		assertNotNull(tempPaceProject);
		assertEquals(0, tempPaceProject.getProjectErrorList().size());
		
		
		PaceProject zp = (ZipPaceProject) tempPaceProject.convertTo(ProjectSerializationType.PAF);
		String tempFile = FileUtils.createTempFile(".paf");
		
		try {
			zp.saveTo(tempFile);
		} catch (ProjectSaveException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Test converted project.
		File tempDir = FileUtils.createTempDirectory();
		
		try {
			PafZipUtil.unzipFile(tempFile, tempDir.toString());
		} catch (IOException e) {
			fail(e.getMessage());
		}
		
		try {
			pp = new XMLPaceProject(tempDir.toString(), false);
		} catch (InvalidPaceProjectInputException e) {
			fail(e.getMessage());
		} catch (PaceProjectCreationException e) {
			fail(e.getMessage());
		}
		
		assertNotNull(pp);
		assertEquals(0, pp.getProjectErrorList().size());
		

		FileUtils.deleteDirectory(tempDir);
		
		FileUtils.deleteFile(tempFile);

	}
	
	
}
