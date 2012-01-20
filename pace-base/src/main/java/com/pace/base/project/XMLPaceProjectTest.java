/*
 *	File: @(#)XMLPaceProjectTest.java 	Package: com.pace.base.project 	Project: Paf Base Libraries
 *	Created: Jul 27, 2009  		By: jmilliron
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
import java.util.Map;
import java.util.Set;

import junit.framework.TestCase;

import com.pace.base.PafBaseConstants;
import com.pace.base.PafException;
import com.pace.base.app.DynamicMemberDef;
import com.pace.base.app.PafApplicationDef;
import com.pace.base.app.PlanCycle;
import com.pace.base.app.Season;
import com.pace.base.rules.RuleSet;
import com.pace.base.utility.FileUtils;
import com.pace.base.utility.PafXStream;
import com.pace.base.utility.PafZipUtil;
import com.pace.base.view.PafView;
import com.pace.base.view.PafViewSection;

/**
 * Class_description_goes_here
 *
 * @author jmilliron
 * @version	x.xx
 *
 */
public class XMLPaceProjectTest extends TestCase {

	String CONF_DIR = PafBaseConstants.DN_PaceTestFldr + File.separator;
			
	File testDir = new File(CONF_DIR);
	
	Set<ProjectElementId> projectElementIdSet;
	
	PaceProject pp = null;
		
	//protected File tempConfDir = new File(PafBaseConstants.DN_PaceTestFldr+"2");
	
	protected File tempConfDir = FileUtils.createTempDirectory();
	
	String CONF_DIR_2 = null;
	
	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		
		if ( ! tempConfDir.exists() ) {
						
			boolean dirCreated = tempConfDir.mkdir();
			
			if ( ! dirCreated ) {
				
				fail("Directory " + tempConfDir.toString() + " could not be created.");
				
			}
			
		}		
		
		String pareArchiveFileName = "./test_files/pace.paf";
		
		File paceArchiveFile = new File(pareArchiveFileName);
			
		assertTrue(paceArchiveFile.isFile());
			
		CONF_DIR_2 = tempConfDir.toString() + File.separator;
		
		PafZipUtil.unzipFile(paceArchiveFile.toString(), tempConfDir.toString());
		
		if ( ! testDir.exists())  {
			
			boolean createdNewDir = testDir.mkdir();
			
			if ( ! createdNewDir ) {
				fail("Can't create test dir: " + testDir.toString());
			}
			
		}
		
		projectElementIdSet = new HashSet<ProjectElementId>();
		
		try {
			 pp = new XMLPaceProject(CONF_DIR_2, false);
		} catch (PaceProjectCreationException e) {
			fail(e.getMessage());
		} catch (InvalidPaceProjectInputException e) {
			// TODO Auto-generated catch block
			fail(e.getMessage());
		}
		
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
						
		FileUtils.deleteDirectory(tempConfDir);
		
		if ( testDir.exists() ) {
			
			FileUtils.deleteFilesInDir(testDir, true);
			
			boolean deleted = testDir.delete();
			
			if (! deleted) {
				
				System.out.println("Can't delete dir: " + testDir.getAbsolutePath());
				
			}
			
		}
	}

	/**
	 * 
	 */
	public XMLPaceProjectTest() {
		super();	
	}
	
	/**
	 * Test method for {@link com.pace.base.project.XMLPaceProject#readApplicationDefinitions()}.
	 */
	public void testReadApplicationDefinitions() {
		
		//PaceProject pp = null;
		
		try {
			 pp = new XMLPaceProject(CONF_DIR, projectElementIdSet, false);
		} catch (PaceProjectCreationException e) {
			fail(e.getMessage());
		} catch (InvalidPaceProjectInputException e) {
			// TODO Auto-generated catch block
			fail(e.getMessage());
		}
		
		assertNotNull(pp);
		assertNotNull(pp.getApplicationDefinitions());
		assertEquals(0, pp.getApplicationDefinitions().size());
		
		String appId = "TEST APP ID";
		
		PafApplicationDef sourceAppDef = new PafApplicationDef();
		sourceAppDef.setAppId(appId);
		
		PafXStream.exportObjectToXml(new PafApplicationDef[] { sourceAppDef }, CONF_DIR + PafBaseConstants.FN_ApplicationMetaData );
						
		try {
			 projectElementIdSet.add(ProjectElementId.ApplicationDef);
			 pp = new XMLPaceProject(CONF_DIR, projectElementIdSet, false);
		} catch (PaceProjectCreationException e) {
			fail(e.getMessage());
		} catch (InvalidPaceProjectInputException e) {
			// TODO Auto-generated catch block
			fail(e.getMessage());
		}
		
		assertNotNull(pp);
		assertNotNull(pp.getApplicationDefinitions());
		assertEquals(1, pp.getApplicationDefinitions().size());
		assertEquals(appId, pp.getApplicationDefinitions().get(0).getAppId());
		
	}

	/**
	 * Test method for {@link com.pace.base.project.XMLPaceProject#writeApplicationDefinitions()}.
	 */
	public void testWriteApplicationDefinitions() {
		
		//PaceProject pp = null;
				
		String appId = (new Date()).toString();
		
		PafApplicationDef sourceAppDef = new PafApplicationDef();
		sourceAppDef.setAppId(appId);
						
		try {
			 
			 projectElementIdSet.add(ProjectElementId.ApplicationDef);
			 
			 pp = new XMLPaceProject(CONF_DIR, projectElementIdSet, false);
			 
			 pp.setApplicationDefinitions(Arrays.asList(new PafApplicationDef[] {sourceAppDef}));
			 
			 try {
				pp.save(projectElementIdSet);
			} catch (ProjectSaveException e) {
				fail(e.getMessage());
			}
			 
			 pp = new XMLPaceProject(CONF_DIR, projectElementIdSet, false);
			 
		} catch (PaceProjectCreationException e) {
			fail(e.getMessage());
		} catch (InvalidPaceProjectInputException e) {
			// TODO Auto-generated catch block
			fail(e.getMessage());
		}
		
		assertNotNull(pp);
		assertNotNull(pp.getApplicationDefinitions());
		assertEquals(1, pp.getApplicationDefinitions().size());
		assertEquals(appId, pp.getApplicationDefinitions().get(0).getAppId());
		
	}
	
	public void testReadScenario1() {
		
		//PaceProject pp = null;
		
		try {
			pp = new XMLPaceProject(CONF_DIR_2, false);
		} catch (InvalidPaceProjectInputException e) {
			fail(e.getMessage());
		} catch (PaceProjectCreationException e) {
			fail(e.getMessage());
		}	
		
		assertNotNull(pp);
		
		assertEquals(CONF_DIR_2, pp.getProjectInput());
		assertEquals(CONF_DIR_2, pp.getProjectInputDir());
		
		assertEquals(23, pp.getProjectDataMap().size());
		
		List<PafApplicationDef> pafAppList = pp.getApplicationDefinitions();
		
		assertNotNull(pafAppList);
		assertEquals(1, pafAppList.size());
		
		List<PlanCycle> planCycleList = pp.getPlanCycles();
		
		assertNotNull(planCycleList);
		assertEquals(true, (planCycleList.size() > 0));
		assertEquals(pafAppList.get(0).getPlanCycles().length, planCycleList.size());
		
		List<Season> seasonList = pp.getSeasons();
		
		assertNotNull(seasonList);
		assertEquals(true, (seasonList.size() > 0));
		assertEquals(pafAppList.get(0).getSeasonList().getSeasons().size(), seasonList.size());
		
		Map<String, RuleSet> ruleSetMap = pp.getRuleSets();
		
		assertNotNull(ruleSetMap);
		assertEquals(16, ruleSetMap.size());
		
		List<PafView> viewList = pp.getViews();
		assertNotNull(viewList);
		assertEquals(84, viewList.size());
		
		List<PafViewSection> viewSectionList = pp.getViewSections();
		assertNotNull(viewSectionList);
		assertEquals(85, viewSectionList.size());
		
		List<DynamicMemberDef> dynamicMemberList = pp.getDynamicMembers();
		assertNotNull(dynamicMemberList);
		assertEquals(1, dynamicMemberList.size());
		assertEquals("Version", dynamicMemberList.get(0).getDimension());
				
		
	}
	
	public void testReadScenario2() {
		
		//PaceProject pp = null;
		
		Set<ProjectElementId> filterSet = new HashSet<ProjectElementId>();
		
		try {
			pp = new XMLPaceProject(CONF_DIR_2, filterSet, false);
		} catch (InvalidPaceProjectInputException e) {
			fail(e.getMessage());
		} catch (PaceProjectCreationException e) {
			fail(e.getMessage());
		}	
		
		assertNotNull(pp);
		
		assertEquals(CONF_DIR_2, pp.getProjectInput());
		assertEquals(CONF_DIR_2, pp.getProjectInputDir());
		
		assertEquals(0, pp.getProjectDataMap().size());
		
		filterSet.add(ProjectElementId.ApplicationDef);
		
		try {
			pp = new XMLPaceProject(CONF_DIR_2, filterSet, false);
		} catch (InvalidPaceProjectInputException e) {
			fail(e.getMessage());
		} catch (PaceProjectCreationException e) {
			fail(e.getMessage());
		}
		
		assertEquals(1, pp.getProjectDataMap().size());
		
		filterSet.add(ProjectElementId.PlanCycles);
		
		try {
			pp = new XMLPaceProject(CONF_DIR_2, filterSet, false);
		} catch (InvalidPaceProjectInputException e) {
			fail(e.getMessage());
		} catch (PaceProjectCreationException e) {
			fail(e.getMessage());
		}
		
		assertEquals(2, pp.getProjectDataMap().size());
		
		try {
			pp.reloadData();
		} catch (PafException e) {
			fail(e.getMessage());
		}
		
		filterSet.clear();
						
		assertEquals(84, pp.getViews().size());
				
		try {
			pp.reloadData();
		} catch (PafException e) {
			fail(e.getMessage());
		}
		
		assertEquals(3, pp.getProjectDataMap().size());
		assertEquals(84, pp.getViews().size());
		
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
	public void testProjectUpgradeKatzToCurrent(){
		
		loadUpgradeAndTestProject("./test_files/katz.paf");
		
	}	

	public void loadUpgradeAndTestProject(String path){
		
		File tempDir = FileUtils.createTempDirectory();
		
		
		try {
			PafZipUtil.unzipFile(path, tempDir.toString());
		} catch (IOException e) {
			fail(e.getMessage());
		}
		
		try {
			pp = new XMLPaceProject(tempDir.toString(), true);
		} catch (InvalidPaceProjectInputException e) {
			fail(e.getMessage());
		} catch (PaceProjectCreationException e) {
			fail(e.getMessage());
		}
		
		assertNotNull(pp);
		assertEquals(0, pp.getProjectErrorList().size());
		
		
		
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
		
	}

}
