/*
 *	File: @(#)PafPlannerConfigTest.java 	Package: com.pace.base.comm 	Project: Paf Base Libraries
 *	Created: Mar 9, 2010  		By: jmilliron
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2010 Palladium Group, Inc. All rights reserved.
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
package com.pace.base.comm;

import com.pace.base.app.PafDimSpec;

import junit.framework.TestCase;

/**
 * Class_description_goes_here
 *
 * @author jmilliron
 * @version	x.xx
 *
 */
public class PafPlannerConfigTest extends TestCase {

	/**
	 * @param name
	 */
	public PafPlannerConfigTest(String name) {
		super(name);
	}

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
	 * Test method for {@link java.lang.Object#clone()}.
	 */
	public void testClone() {

		PafPlannerConfig plannerConfig = new PafPlannerConfig();
		
		PafPlannerConfig clonedPlannerConfig = plannerConfig.clone();
		
		assertNotNull(clonedPlannerConfig);
		assertEquals(plannerConfig, clonedPlannerConfig);
		
		String role = "test role";
		plannerConfig.setRole(role);
		
		String cycle = "test cycle";
		plannerConfig.setCycle(cycle);
		
		Integer uowSizeLarge = 99;
		plannerConfig.setUowSizeLarge(uowSizeLarge);
		
		Integer uowSizeMax = 1000;
		plannerConfig.setUowSizeMax(uowSizeMax);
		
		Boolean isUserFilteredUow = true;
		plannerConfig.setIsUserFilteredUow(isUserFilteredUow);
		
		Boolean isDataFilteredUow = false;
		plannerConfig.setIsDataFilteredUow(isDataFilteredUow);
		
		UserFilterSpec userFilterSpec = new UserFilterSpec();
		userFilterSpec.setAttrDimNames(new String[] { "att1", "att2"});		
		plannerConfig.setUserFilterSpec(userFilterSpec);
		
		DataFilterSpec dataFilterSpec = new DataFilterSpec();
		
		PafDimSpec pds1 = new PafDimSpec();
		pds1.setDimension("dim1");
		pds1.setExpressionList(new String[] { "exp1", "exp2" });
		
		PafDimSpec pds2 = new PafDimSpec();
		pds2.setDimension("dim2");
		pds2.setExpressionList(new String[] { "exp3", "exp4" });
		
		dataFilterSpec.setDimSpec(new PafDimSpec[] {pds1, pds2});
		plannerConfig.setDataFilterSpec(dataFilterSpec);
		
	    String[] viewTreeItemNames = new String[] { "one", "two", "three"};
	    plannerConfig.setViewTreeItemNames(viewTreeItemNames);
	    
	    String[] menuItemNames = new String[] { "one", "two", "three"};
	    plannerConfig.setMenuItemNames(menuItemNames);
	    
	    String[] autoRunOnSaveMenuItemNames = new String[] { "one", "two", "three"};
	    plannerConfig.setAutoRunOnSaveMenuItemNames(autoRunOnSaveMenuItemNames);
	    
	    String[] ruleSetNames = new String[] { "one", "two", "three"};
	    plannerConfig.setRuleSetNames(ruleSetNames);
	    
	    String defaultRulesetName = "defualt rule set name";
	    plannerConfig.setDefaultRulesetName(defaultRulesetName);
	    
	    boolean defaultEvalEnabledWorkingVersion = true;
	    plannerConfig.setDefaultEvalEnabledWorkingVersion(defaultEvalEnabledWorkingVersion);
	    
	    String[] defaultEvalRefVersions = new String[] { "one", "two", "three"};
	    plannerConfig.setDefaultEvalRefVersions(defaultEvalRefVersions);
	    
	    boolean mdbSaveWorkingVersionOnUowLoad = false;
	    plannerConfig.setMdbSaveWorkingVersionOnUowLoad(mdbSaveWorkingVersionOnUowLoad);
	    
	    Boolean defaultEvalEnabled = true;
	    plannerConfig.setDefaultEvalEnabledWorkingVersion(defaultEvalEnabled);
	    
	    boolean calcElapsedPeriods = true;
	    plannerConfig.setCalcElapsedPeriods(calcElapsedPeriods);
	    
	    String[] versionFilter  = new String[] { "one", "two", "three"};
	    plannerConfig.setVersionFilter(versionFilter);
	    
	    Boolean replicateEnabled = false;
	    plannerConfig.setReplicateEnabled(replicateEnabled);
	    
	    Boolean replicateAllEnabled = true;
	    plannerConfig.setReplicateAllEnabled(replicateAllEnabled);
	    
	    clonedPlannerConfig = plannerConfig.clone();
		
		assertNotNull(clonedPlannerConfig);
		assertEquals(plannerConfig, clonedPlannerConfig);
		assertEquals(plannerConfig.getUserFilterSpec(), clonedPlannerConfig.getUserFilterSpec());
		assertEquals(plannerConfig.getDataFilterSpec(), clonedPlannerConfig.getDataFilterSpec());
		
	}

}
