package com.pace.base.migration;

import com.pace.base.PafBaseConstants;

public class PafStringCaseInsensitiveComparatorMigrationActionTest extends MigrationActionTestCase {


	protected void setUp() throws Exception {
		super.setUp("./test_files/pace2600.paf");
	}


	public void testPafStringCaseInsensitiveComparatorMigrationActionStringArrayString() {
		
		MigrationAction action = new PafStringCaseInsensitiveComparatorMigrationAction(new String[] {PafBaseConstants.FN_HierarchyFormats }, this.tempConfDir.getAbsolutePath());
		
		assertNotNull(action);
	}

	public void testGetStatus() {
		
		MigrationAction action = new 
			PafStringCaseInsensitiveComparatorMigrationAction(new String[] {PafBaseConstants.FN_HierarchyFormats }, this.tempConfDir.getAbsolutePath());
		
		assertEquals(MigrationActionStatus.NotStarted, action.getStatus());
	}

	public void testRun() {
		
		MigrationAction action = new 
			PafStringCaseInsensitiveComparatorMigrationAction(new String[] {PafBaseConstants.FN_HierarchyFormats }, this.tempConfDir.getAbsolutePath());
	
		assertEquals(MigrationActionStatus.NotStarted, action.getStatus());
		
		action.run();
		
		assertEquals(MigrationActionStatus.Completed, action.getStatus());
	}

}
