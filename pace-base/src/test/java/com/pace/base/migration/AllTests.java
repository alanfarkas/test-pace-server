package com.pace.base.migration;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for com.pace.base.migration");
		//$JUnit-BEGIN$
		suite.addTestSuite(PafSecurityMigrationActionTest.class);
		suite.addTestSuite(PafViewsSeparationMigrationActionTest.class);
		suite.addTestSuite(PafDTDtoXSDMigrationActionTest.class);
		suite.addTestSuite(PafPlannerConfigMigrationActionTest.class);
		suite.addTestSuite(PafDynamicMembersMigrationActionTest.class);
		suite.addTestSuite(PafViewSectionsSeparationMigrationActionTest.class);
		suite.addTestSuite(PafGlobalStylesMigrationActionTest.class);
		suite.addTestSuite(PafRuleSetsSeparationMigrationActionTest.class);
		suite.addTestSuite(PafViewGroupsMigrationActionTest.class);
		suite.addTestSuite(PafViewSectionBorderMigrationTest.class);
		suite.addTestSuite(PafGenerationToHierarchyMigrationTest.class);
		suite.addTestSuite(PafAppsMigrationActionTest.class);
		//$JUnit-END$
		return suite;
	}

}
