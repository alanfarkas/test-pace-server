/*
 *	File: @(#)PafPlannerConfigMigrationActionTest.java 	Package: com.pace.base.migration 	Project: Paf Base Libraries
 *	Created: Aug 19, 2009  		By: jmilliron
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
package com.pace.base.migration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pace.base.comm.PafPlannerConfig;
import com.pace.base.project.ProjectSaveException;


/**
 * Class_description_goes_here
 *
 * @author jmilliron
 * @version	x.xx
 *
 */
public class PafPlannerConfigMigrationActionTest extends MigrationActionTestCase {

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {

		super.setUp("./test_files/pace1210.paf");
		
	}

	/**
	 * Test method for {@link com.pace.base.migration.PafPlannerConfigMigrationAction#PafPlannerConfigMigrationAction(com.pace.base.project.XMLPaceProject)}.
	 */
	public void testPafPlannerConfigMigrationActionXMLPaceProject() {
		
		MigrationAction action = new PafPlannerConfigMigrationAction(pp);
		
		assertNotNull(action);
		assertNotNull(action.getXMLPaceProject());
		assertEquals(action.getXMLPaceProject(), pp);
	}

	/**
	 * Test method for {@link com.pace.base.migration.PafPlannerConfigMigrationAction#getStatus()}.
	 */
	public void testGetStatus() {

		MigrationAction action = new PafPlannerConfigMigrationAction(pp);
		
		assertEquals(MigrationActionStatus.NotStarted, action.getStatus());
		
		List<PafPlannerConfig> planerConfigList = pp.getRoleConfigurations();
		
		for (PafPlannerConfig planner : planerConfigList ) {
			
			planner.setDefaultEvalEnabled(null);
			
		}
		
		pp.setRoleConfigurations(planerConfigList);
		
		try {
			pp.save();
		} catch (ProjectSaveException e) {
			fail(e.getMessage());
		}
		
		assertEquals(MigrationActionStatus.Completed, action.getStatus());
		
	}

	/**
	 * Test method for {@link com.pace.base.migration.PafPlannerConfigMigrationAction#run()}.
	 */
	public void testRun() {
		
		MigrationAction action = new PafPlannerConfigMigrationAction(pp);
		
		assertEquals(MigrationActionStatus.NotStarted, action.getStatus());
		
		List<PafPlannerConfig> planerConfigList = pp.getRoleConfigurations();
		
		Map<String, Boolean> plannerConfigMap = new HashMap<String, Boolean>();
		
		for (PafPlannerConfig planner : planerConfigList ) {
											
			assertFalse(planner.isDefaultEvalEnabledWorkingVersion());
			assertFalse(planner.isMdbSaveWorkingVersionOnUowLoad());
			
			if ( planner.getDefaultEvalEnabled() != null ) {
				
				plannerConfigMap.put(planner.getRole() + "|" + planner.getCycle(), planner.getDefaultEvalEnabled());
				
			}
						
		}
		
		action.run();
		
		assertEquals(MigrationActionStatus.Completed, action.getStatus());
				
		planerConfigList = pp.getRoleConfigurations();
		
		for (PafPlannerConfig planner : planerConfigList ) {
			
			assertNull(planner.getDefaultEvalEnabled());			
			
			if ( plannerConfigMap.containsKey(planner.getRole() + "|" + planner.getCycle())) {
				
				Boolean boolValue = plannerConfigMap.get(planner.getRole() + "|" + planner.getCycle());
				
				assertNotNull(boolValue);
				assertEquals(boolValue, Boolean.valueOf(planner.isDefaultEvalEnabledWorkingVersion()));
				assertEquals(boolValue, Boolean.valueOf(planner.isMdbSaveWorkingVersionOnUowLoad()));
				
			} else {
				
				assertFalse(planner.isDefaultEvalEnabledWorkingVersion());
				assertFalse(planner.isMdbSaveWorkingVersionOnUowLoad());	
				
			}
								
			
		}
		
	}

}
