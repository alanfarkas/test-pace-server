package com.pace.base.project;

import java.io.File;
import java.io.IOException;

import junit.framework.TestCase;

import com.pace.base.utility.FileUtils;
import com.pace.base.utility.PafZipUtil;

public class KatzPaceProjectTest extends TestCase {

	private File tempDir;

	private static final String TEST_FILES = FileUtils.getSystemTempDirectory().getAbsolutePath() + File.separator;

	private static final String TEST_FILES_PROJECT_WRITE_XLSX = TEST_FILES + "project-write.xlsx";

	private XMLPaceProject xmlProject = null;
		
	private ExcelPaceProject excelProject = null;
	
	protected File tempConfDir = FileUtils.createTempDirectory();
	
	public KatzPaceProjectTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		tempDir = FileUtils.createTempDirectory();
		
		
		try {
			PafZipUtil.unzipFile("./test_files/katz.paf", tempDir.toString());
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
			assertEquals(xmlProject.getCustomFunctions().size(), epp.getCustomFunctions().size());
			assertEquals(xmlProject.getCustomMenus().size(), epp.getCustomMenus().size());
			assertEquals(xmlProject.getDynamicMembers().size(), epp.getDynamicMembers().size());
			assertEquals(xmlProject.getGlobalStyles().size(), epp.getGlobalStyles().size());
			assertEquals(xmlProject.getHierarchyFormats().size(), epp.getHierarchyFormats().size());
			assertEquals(xmlProject.getMeasures().size(), epp.getMeasures().size());
			assertEquals(xmlProject.getMemberTags().size(), epp.getMemberTags().size());
			assertEquals(xmlProject.getNumericFormats().size(), epp.getNumericFormats().size());
			assertEquals(xmlProject.getPlanCycles().size(), epp.getPlanCycles().size());
			assertEquals(xmlProject.getPrintStyles().size(), epp.getPrintStyles().size());
			assertEquals(xmlProject.getRoleConfigurations().size(), epp.getRoleConfigurations().size());
			assertEquals(xmlProject.getRoles().size(), epp.getRoles().size());
			assertEquals(xmlProject.getRoundingRules().size(), epp.getRoundingRules().size());
			assertEquals(xmlProject.getRuleSets().size(), epp.getRuleSets().size());
			assertEquals(xmlProject.getSeasons().size(), epp.getSeasons().size());
			assertEquals(xmlProject.getUserMemberLists().getMemberLists().size(), epp.getUserMemberLists().getMemberLists().size());
			assertEquals(xmlProject.getUserSecurity().size(), epp.getUserSecurity().size());
			assertEquals(xmlProject.getUserSelections().size(), epp.getUserSelections().size());
			assertEquals(xmlProject.getVersions().size(), epp.getVersions().size());
			assertEquals(xmlProject.getViewGroups().size(), epp.getViewGroups().size());
			assertEquals(xmlProject.getViews().size(), epp.getViews().size());
			assertEquals(xmlProject.getViewSections().size(), epp.getViewSections().size());
			
		} catch (InvalidPaceProjectInputException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (PaceProjectCreationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}	

}
