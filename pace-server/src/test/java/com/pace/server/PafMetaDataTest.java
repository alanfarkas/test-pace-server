package com.pace.server;

import java.util.List;

import junit.framework.TestCase;

import com.pace.base.app.PafApplicationDef;
import com.pace.base.db.membertags.MemberTagDef;
import com.pace.base.view.PafView;

public class PafMetaDataTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
		PafMetaData.loadAppSettings();
		PafMetaData.updateApplicationConfig();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}


	/*
	 * Test method for 'com.pace.base.server.PafMetaData.importScreens()'
	 */
	public void testImportScreens() {
		PafView[] viewCache = PafViewService.getInstance().assembleViews();
		assertTrue (viewCache.length > 0);
	}
    
//
// Commented out this unit test since "install.properties" file isn't used anymore. 
//  AFarkas (3/8/2010)
//	
//    public void testGetPafProps() {
//        Properties props = PafMetaData.getPafProps();
//        assertNotNull(props);
//        assertEquals(props.getProperty("UnitTestValidate"), "Success");
//    }
//    
    public void testImportApps() {
        List<PafApplicationDef> apps = PafMetaData.getPaceProject().getApplicationDefinitions();
        assertNotNull(apps);
        assertEquals(1, apps.size());
    }

    public void testImportMemberTags() {
        List<MemberTagDef> memberTags = PafMetaData.getPaceProject().getMemberTags();
        assertNotNull(memberTags);
    }
    
//    public void testDataReload() {
//    	
//    	PaceProject pp = PafMetaData.getPaceProject();
//    	
//    	assertNotNull(pp);
//    	
//    	String saveToDirName = PafBaseConstants.DN_JUnit + File.separator + PafBaseConstants.DN_ConfFldr;
//    	
//    	File saveToDir = new File(saveToDirName);
//    	
//    	if ( saveToDir.exists()) {
//    		
//    		FileUtils.deleteFilesInDir(saveToDir, true);
//    		
//    	}    	
//    	
//    	assertFalse(saveToDir.exists());
//    	
//    	try {
//			pp.saveTo(saveToDirName);
//		} catch (ProjectSaveException e) {
//			fail(e.getMessage());
//		}
//		
//		assertTrue(saveToDir.exists());
//				   	
//    	
//    }
    

}
