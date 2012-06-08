package com.pace.base.project;

import java.io.File;
import java.io.IOException;

import junit.framework.TestCase;

import com.pace.base.utility.FileUtils;
import com.pace.base.utility.PafZipUtil;

public class HelzbergPaceProjectTest extends TestCase {
	
	private File tempDir;

	private static final String TEST_FILES = FileUtils.getSystemTempDirectory().getAbsolutePath() + File.separator;

	private static final String TEST_FILES_PROJECT_WRITE_XLSX = TEST_FILES + "project-write.xlsx";

	private XMLPaceProject xmlProject = null;
		
	private ExcelPaceProject excelProject = null;
	
	protected File tempConfDir = FileUtils.createTempDirectory();
	
	public HelzbergPaceProjectTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		tempDir = FileUtils.createTempDirectory();
		
		
		try {
			PafZipUtil.unzipFile("./test_files/Helzberg.paf", tempDir.toString());
		} catch (IOException e) {
			fail(e.getMessage());
		}
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		FileUtils.deleteDirectory(tempDir);
		
	}

	public void testUpgradePaceProjectToCurrent(){
		//read a project from a paf
		try {
			xmlProject = new XMLPaceProject(tempDir.toString(), true);
		} catch (InvalidPaceProjectInputException e) {
			fail(e.getMessage());
		} catch (PaceProjectCreationException e) {
			fail(e.getMessage());
		}
		
		assertNotNull(xmlProject);
		assertEquals(0, xmlProject.getProjectErrorList().size());
		
		try {
			xmlProject = new XMLPaceProject(tempDir.toString(), false);
		} catch (InvalidPaceProjectInputException e) {
			fail(e.getMessage());
		} catch (PaceProjectCreationException e) {
			fail(e.getMessage());
		}
		
		assertNotNull(xmlProject);
		assertEquals(0, xmlProject.getProjectErrorList().size());
		
	   //write a project to Excel
		excelProject = (ExcelPaceProject) xmlProject.convertTo(ProjectSerializationType.XLSX);
		
		File excelFile = new File(TEST_FILES_PROJECT_WRITE_XLSX);
		if ( excelFile.exists()) {
			excelFile.delete();
		}
		
		try {
			excelProject.saveTo(TEST_FILES_PROJECT_WRITE_XLSX);
		} catch (ProjectSaveException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//read a project from Excel
		try {
			ExcelPaceProject epp = new ExcelPaceProject(TEST_FILES_PROJECT_WRITE_XLSX);
			
			assertEquals(xmlProject.getApplicationDefinitions().size(), epp.getApplicationDefinitions().size());
			assertEquals(xmlProject.getApplicationDefinitions().get(0).getAppId(), epp.getApplicationDefinitions().get(0).getAppId());
			assertEquals(xmlProject.getCustomFunctions().size(), epp.getCustomFunctions().size());
			assertEquals(xmlProject.getCustomFunctions().get(0).getFunctionName(), epp.getCustomFunctions().get(0).getFunctionName());
			assertEquals(xmlProject.getCustomMenus().size(), epp.getCustomMenus().size());
			assertEquals(xmlProject.getCustomMenus().get(0).getKey(), epp.getCustomMenus().get(0).getKey());
			assertEquals(xmlProject.getDynamicMembers().size(), epp.getDynamicMembers().size());
			assertEquals(xmlProject.getDynamicMembers().get(0).getDimension(), epp.getDynamicMembers().get(0).getDimension());
			assertEquals(xmlProject.getGlobalStyles().size(), epp.getGlobalStyles().size());
			assertEquals(xmlProject.getGlobalStyles().get(0).getName(), epp.getGlobalStyles().get(0).getName());
			assertEquals(xmlProject.getHierarchyFormats().size(), epp.getHierarchyFormats().size());
			assertEquals(xmlProject.getHierarchyFormats().get(0).getName(), epp.getHierarchyFormats().get(0).getName());
			assertEquals(xmlProject.getMeasures().size(), epp.getMeasures().size());
			assertEquals(xmlProject.getMeasures().get(0).getNumericFormatName(), epp.getMeasures().get(0).getNumericFormatName());
			assertEquals(xmlProject.getMemberTags().size(), epp.getMemberTags().size());
			assertEquals(xmlProject.getMemberTags().get(0).getName(), epp.getMemberTags().get(0).getName());
			assertEquals(xmlProject.getNumericFormats().size(), epp.getNumericFormats().size());
			assertEquals(xmlProject.getNumericFormats().get(0).getName(), epp.getNumericFormats().get(0).getName());
			assertEquals(xmlProject.getPlanCycles().size(), epp.getPlanCycles().size());
			assertEquals(xmlProject.getPlanCycles().get(0).getLabel(), epp.getPlanCycles().get(0).getLabel());
			assertEquals(xmlProject.getPrintStyles().size(), epp.getPrintStyles().size());
			assertEquals(xmlProject.getPrintStyles().get(0).getGUID(), epp.getPrintStyles().get(0).getGUID());
			assertEquals(xmlProject.getRoleConfigurations().size(), epp.getRoleConfigurations().size());
			assertEquals(xmlProject.getRoleConfigurations().get(0).getRole(), epp.getRoleConfigurations().get(0).getRole());
			assertEquals(xmlProject.getRoles().size(), epp.getRoles().size());
			assertEquals(xmlProject.getRoles().get(0).getRoleName(), epp.getRoles().get(0).getRoleName());
			assertEquals(xmlProject.getRoundingRules().size(), epp.getRoundingRules().size());
			assertEquals(xmlProject.getRoundingRules().get(0).getRoundingFunction(), epp.getRoundingRules().get(0).getRoundingFunction());
			assertEquals(xmlProject.getRuleSets().size(), epp.getRuleSets().size());
			assertEquals(xmlProject.getRuleSets().get(0).getName(), epp.getRuleSets().get(0).getName());
			assertEquals(xmlProject.getSeasons().size(), epp.getSeasons().size());
			assertEquals(xmlProject.getSeasons().get(0).getId(), epp.getSeasons().get(0).getId());
			assertEquals(xmlProject.getUserMemberLists().getMemberLists().size(), epp.getUserMemberLists().getMemberLists().size());
			assertEquals(xmlProject.getUserMemberLists().getMemberLists().get(0).getDimName(), epp.getUserMemberLists().getMemberLists().get(0).getDimName());
			assertEquals(xmlProject.getUserSecurity().size(), epp.getUserSecurity().size());
			assertEquals(xmlProject.getUserSecurity().get(0).getUserName(), epp.getUserSecurity().get(0).getUserName());
			assertEquals(xmlProject.getUserSelections().size(), epp.getUserSelections().size());
			assertEquals(xmlProject.getUserSelections().get(0).getId(), epp.getUserSelections().get(0).getId());
			assertEquals(xmlProject.getVersions().size(), epp.getVersions().size());
			assertEquals(xmlProject.getVersions().get(0).getName(), epp.getVersions().get(0).getName());
			assertEquals(xmlProject.getViewGroups().size(), epp.getViewGroups().size());
			assertEquals(xmlProject.getViewGroups().get(0).getName(), epp.getViewGroups().get(0).getName());
			assertEquals(xmlProject.getViews().size(), epp.getViews().size());
			assertEquals(xmlProject.getViews().get(0).getName(), epp.getViews().get(0).getName());
			assertEquals(xmlProject.getViewSections().size(), epp.getViewSections().size());
			assertEquals(xmlProject.getViewSections().get(0).getName(), epp.getViewSections().get(0).getName());
			
		} catch (InvalidPaceProjectInputException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (PaceProjectCreationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}	
}
