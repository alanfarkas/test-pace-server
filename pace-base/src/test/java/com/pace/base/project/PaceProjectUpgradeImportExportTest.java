package com.pace.base.project;

import java.io.File;
import java.io.IOException;

import com.pace.base.utility.FileUtils;
import com.pace.base.utility.PafZipUtil;

import junit.framework.TestCase;

public class PaceProjectUpgradeImportExportTest extends TestCase {

	public PaceProjectUpgradeImportExportTest(String name) {
		super(name);
	}

	private File tempDir = null;

	private XMLPaceProject xmlProject = null;
	
	private ExcelPaceProject excelProject = null;
	
	private static final String TEST_FILES = FileUtils.getSystemTempDirectory().getAbsolutePath() + File.separator;

	private static final String TEST_FILES_PROJECT_WRITE_XLSX = TEST_FILES + "project-write.xlsx";

	protected void setUp() throws Exception {
		super.setUp();
		tempDir = FileUtils.createTempDirectory();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		FileUtils.deleteDirectory(tempDir);
	}

	public void testUpgradeAAFESPaceProjectToCurrent(){
		try {
			PafZipUtil.unzipFile("./test_files/MerchPlnAAFES.paf", tempDir.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		verfoyUpgradePaceProjectToCurrent();
	}	
	
	public void testUpgradeGiantEaglePaceProjectToCurrent(){
		try {
			PafZipUtil.unzipFile("./test_files/GEPlan.paf", tempDir.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		verfoyUpgradePaceProjectToCurrent();
	}	
	
	public void testUpgradeHelzbergPaceProjectToCurrent(){
		try {
			PafZipUtil.unzipFile("./test_files/Helzberg.paf", tempDir.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		verfoyUpgradePaceProjectToCurrent();
	}	

	public void testUpgradeKatzPaceProjectToCurrent(){
		try {
			PafZipUtil.unzipFile("./test_files/katz.paf", tempDir.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		verfoyUpgradePaceProjectToCurrent();
	}	
	
	public void testUpgradeMichaelsPaceProjectToCurrent(){
		try {
			PafZipUtil.unzipFile("./test_files/Michaels.paf", tempDir.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		verfoyUpgradePaceProjectToCurrent();
	}	
	
	public void testUpgradeOutbackPaceProjectToCurrent(){
		try {
			PafZipUtil.unzipFile("./test_files/Outback.paf", tempDir.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		verfoyUpgradePaceProjectToCurrent();
	}	
	
	public void testUpgradeSafewayPaceProjectToCurrent(){
		try {
			PafZipUtil.unzipFile("./test_files/CatLiteSafeway.paf", tempDir.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		verfoyUpgradePaceProjectToCurrent();
	}	
	
	private void verfoyUpgradePaceProjectToCurrent(){
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

		try {
			ExcelPaceProject epp = new ExcelPaceProject(TEST_FILES_PROJECT_WRITE_XLSX);
			
			assertEquals(xmlProject.getApplicationDefinitions().size(), epp.getApplicationDefinitions().size());
			if( xmlProject.getApplicationDefinitions().size() > 0 && epp.getApplicationDefinitions().size() > 0 ) {
				assertEquals(xmlProject.getApplicationDefinitions().get(0).getAppId(), epp.getApplicationDefinitions().get(0).getAppId());
			}
			
			assertEquals(xmlProject.getCustomFunctions().size(), epp.getCustomFunctions().size());
			if( xmlProject.getCustomFunctions().size() > 0 && epp.getCustomFunctions().size() > 0 ) {
				assertEquals(xmlProject.getCustomFunctions().get(0).getFunctionName(), epp.getCustomFunctions().get(0).getFunctionName());
			}
			
			assertEquals(xmlProject.getCustomMenus().size(), epp.getCustomMenus().size());
			if( xmlProject.getCustomMenus().size() > 0 && epp.getCustomMenus().size() > 0 ) {
				assertEquals(xmlProject.getCustomMenus().get(0).getKey(), epp.getCustomMenus().get(0).getKey());
			}
			
			assertEquals(xmlProject.getDynamicMembers().size(), epp.getDynamicMembers().size());
			if( xmlProject.getDynamicMembers().size() > 0 && epp.getDynamicMembers().size() > 0 ) {
				assertEquals(xmlProject.getDynamicMembers().get(0).getDimension(), epp.getDynamicMembers().get(0).getDimension());
			}
			
			assertEquals(xmlProject.getGlobalStyles().size(), epp.getGlobalStyles().size());
			assertEquals(xmlProject.getGlobalStyles().keySet(), epp.getGlobalStyles().keySet());
			
			assertEquals(xmlProject.getHierarchyFormats().size(), epp.getHierarchyFormats().size());
			assertEquals(xmlProject.getHierarchyFormats().keySet(), epp.getHierarchyFormats().keySet());
			
			assertEquals(xmlProject.getMeasures().size(), epp.getMeasures().size());
			if( xmlProject.getMeasures().size() > 0 && epp.getMeasures().size() > 0 ) {
				assertEquals(xmlProject.getMeasures().get(0).getNumericFormatName(), epp.getMeasures().get(0).getNumericFormatName());
			}
			
			assertEquals(xmlProject.getMemberTags().size(), epp.getMemberTags().size());
			if( xmlProject.getMemberTags().size() > 0 && epp.getMemberTags().size() > 0 ) {
				assertEquals(xmlProject.getMemberTags().get(0).getName(), epp.getMemberTags().get(0).getName());
			}
			
			assertEquals(xmlProject.getNumericFormats().size(), epp.getNumericFormats().size());
			assertEquals(xmlProject.getNumericFormats().keySet(), epp.getNumericFormats().keySet());
			
			assertEquals(xmlProject.getPlanCycles().size(), epp.getPlanCycles().size());
			if( xmlProject.getPlanCycles().size() > 0 && epp.getPlanCycles().size() > 0 ) {
				assertEquals(xmlProject.getPlanCycles().get(0).getLabel(), epp.getPlanCycles().get(0).getLabel());
			}
			
			assertEquals(xmlProject.getPrintStyles().size(), epp.getPrintStyles().size());
	//		assertEquals(xmlProject.getPrintStyles().keySet(), epp.getPrintStyles().keySet());
			
			assertEquals(xmlProject.getRoleConfigurations().size(), epp.getRoleConfigurations().size());
			if( xmlProject.getRoleConfigurations().size() > 0 && epp.getRoleConfigurations().size() > 0 ) {
				assertEquals(xmlProject.getRoleConfigurations().get(0).getRole(), epp.getRoleConfigurations().get(0).getRole());
			}
			
			assertEquals(xmlProject.getRoles().size(), epp.getRoles().size());
			if( xmlProject.getRoles().size() > 0 && epp.getRoles().size() > 0 ) {
				assertEquals(xmlProject.getRoles().get(0).getRoleName(), epp.getRoles().get(0).getRoleName());
			}
			
			assertEquals(xmlProject.getRoundingRules().size(), epp.getRoundingRules().size());
			if( xmlProject.getRoundingRules().size() > 0 && epp.getRoundingRules().size() > 0 ) {
				assertEquals(xmlProject.getRoundingRules().get(0).getRoundingFunction(), epp.getRoundingRules().get(0).getRoundingFunction());
			}
			
			assertEquals(xmlProject.getRuleSets().size(), epp.getRuleSets().size());
			assertEquals(xmlProject.getRuleSets().keySet(), epp.getRuleSets().keySet());
			
			assertEquals(xmlProject.getSeasons().size(), epp.getSeasons().size());
			if( xmlProject.getSeasons().size() > 0 && epp.getSeasons().size() > 0 ) {
				assertEquals(xmlProject.getSeasons().get(0).getId(), epp.getSeasons().get(0).getId());
			}
			
			assertEquals(xmlProject.getUserMemberLists().getMemberLists().size(), epp.getUserMemberLists().getMemberLists().size());
			assertEquals(xmlProject.getUserMemberLists().getMemberLists().keySet(), epp.getUserMemberLists().getMemberLists().keySet());
			
			assertEquals(xmlProject.getUserSecurity().size(), epp.getUserSecurity().size());
			if( xmlProject.getUserSecurity().size() > 0 && epp.getUserSecurity().size() > 0 ) {
				assertEquals(xmlProject.getUserSecurity().get(0).getUserName(), epp.getUserSecurity().get(0).getUserName());
			}
			
			assertEquals(xmlProject.getUserSelections().size(), epp.getUserSelections().size());
			if( xmlProject.getUserSelections().size() > 0 && epp.getUserSelections().size() > 0 ) {
				assertEquals(xmlProject.getUserSelections().get(0).getId(), epp.getUserSelections().get(0).getId());
			}
			
			assertEquals(xmlProject.getVersions().size(), epp.getVersions().size());
			if( xmlProject.getVersions().size() > 0 && epp.getVersions().size() > 0 ) {
				assertEquals(xmlProject.getVersions().get(0).getName(), epp.getVersions().get(0).getName());
			}
			
			assertEquals(xmlProject.getViewGroups().size(), epp.getViewGroups().size());
			assertEquals(xmlProject.getViewGroups().keySet(), epp.getViewGroups().keySet());
			
			assertEquals(xmlProject.getViews().size(), epp.getViews().size());
			if( xmlProject.getViews().size() > 0 && epp.getViews().size() > 0 ) {
				assertEquals(xmlProject.getViews().get(0).getName(), epp.getViews().get(0).getName());
			}
			
			assertEquals(xmlProject.getViewSections().size(), epp.getViewSections().size());
			if( xmlProject.getViewSections().size() > 0 && epp.getViewSections().size() > 0 ) {
				assertEquals(xmlProject.getViewSections().get(0).getName(), epp.getViewSections().get(0).getName());
			}
		} catch (InvalidPaceProjectInputException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (PaceProjectCreationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
	}
}
