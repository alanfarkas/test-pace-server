package com.pace.base.migration;


public class PafGlobalStylesClassNameMigrationActionTest extends MigrationActionTestCase {


	protected void setUp() throws Exception {
		super.setUp("./test_files/pace2600.paf");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testPafGlobalStylesClassNameMigrationAction() {
		
		MigrationAction action = new PafGlobalStylesClassNameMigrationAction(pp);
		
		assertNotNull(action);
		assertNotNull(action.getXMLPaceProject());
		assertEquals(action.getXMLPaceProject(), pp);
	}

	public void testGetStatus() {
		MigrationAction action = new PafGlobalStylesClassNameMigrationAction(pp);
		
		assertEquals(MigrationActionStatus.NotStarted, action.getStatus());
	}

	public void testRun() {
		MigrationAction action = new PafGlobalStylesClassNameMigrationAction(pp);
		
		assertEquals(MigrationActionStatus.NotStarted, action.getStatus());
		
		action.run();
		
		assertEquals(MigrationActionStatus.Completed, action.getStatus());
	}

}
