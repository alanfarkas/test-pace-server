/**
 * 
 */
package com.palladium.paf.project.utils.excel.test;

import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;

import com.palladium.paf.PafException;
import com.palladium.paf.project.utils.PaceProjectExcelUtil;
import com.palladium.paf.project.utils.excel.PaceExcelSheetId;

/**
 * @author jmilliron
 *
 */
public class PaceProjectExcelUtilTest extends TestCase {

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Test method for {@link com.palladium.paf.project.utils.PaceProjectExcelUtil#importProject(java.lang.String, java.lang.String, java.util.Set)}.
	 */
	public void testImportProject() {
		
		Set<PaceExcelSheetId> importSet = new HashSet<PaceExcelSheetId>();
		
		importSet.add(PaceExcelSheetId.PlanCycles);
		
		try {
			PaceProjectExcelUtil.importProject("C:\\tmp\\exceltest\\conf", "C:\\tmp\\exceltest\\wb\\project.xlsx", importSet);
		} catch (PafException e) {
			fail(e.getMessage());
		}
		
	}
	
	public void testExportProject() {
		
		try {
			PaceProjectExcelUtil.exportProject("C:\\tmp\\exceltest\\conf", "C:\\tmp\\exceltest\\wb\\", true);
		} catch (PafException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}

}
