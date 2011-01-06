/*
 *	File: @(#)PafRuleSetsSeparationMigrationActionTest.java 	Package: com.palladium.paf.migration 	Project: Paf Base Libraries
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
package com.palladium.paf.migration;

import java.io.File;
import java.util.List;
import java.util.Map;

import com.palladium.paf.PafBaseConstants;
import com.palladium.paf.PafConfigFileNotFoundException;
import com.palladium.paf.rules.RuleSet;
import com.palladium.utility.PafXStream;


/**
 * Class_description_goes_here
 *
 * @author jmilliron
 * @version	x.xx
 *
 */
public class PafRuleSetsSeparationMigrationActionTest extends MigrationActionTestCase {

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {

		super.setUp("./test_files/pace1210.paf");
		
	}
	
	/**
	 * Test method for {@link com.palladium.paf.migration.PafRuleSetsSeparationMigrationAction#PafRuleSetsSeparationMigrationAction(com.palladium.paf.project.XMLPaceProject)}.
	 */
	public void testPafRuleSetsSeparationMigrationActionXMLPaceProject() {
	
		MigrationAction action = new PafRuleSetsSeparationMigrationAction(pp);
		
		assertNotNull(action);
		assertNotNull(action.getXMLPaceProject());
		assertEquals(action.getXMLPaceProject(), pp);
		
	}

	/**
	 * Test method for {@link com.palladium.paf.migration.PafRuleSetsSeparationMigrationAction#getStatus()}.
	 */
	public void testGetStatus() {
		
		MigrationAction action = new PafRuleSetsSeparationMigrationAction(pp);
		
		assertEquals(MigrationActionStatus.NotStarted, action.getStatus());
		
		File pafRuleSetsXmlFile = new File(tempConfDir + File.separator
				+ PafBaseConstants.FN_RuleSetMetaData);
		
		File newPafRuleSetsDir = new File(tempConfDir+ File.separator + PafBaseConstants.DN_RuleSetsFldr);
		
		assertTrue(pafRuleSetsXmlFile.exists());
		assertFalse(newPafRuleSetsDir.exists());
		
		assertTrue(pafRuleSetsXmlFile.delete());
		assertTrue(newPafRuleSetsDir.mkdir());
		
		assertEquals(MigrationActionStatus.Completed, action.getStatus());
	}

	/**
	 * Test method for {@link com.palladium.paf.migration.PafRuleSetsSeparationMigrationAction#run()}.
	 */
	public void testRun() {
		
		MigrationAction action = new PafRuleSetsSeparationMigrationAction(pp);
		
		assertEquals(MigrationActionStatus.NotStarted, action.getStatus());
		
		Map<String, RuleSet> ruleSetMap = pp.getRuleSets();
		
		assertNotNull(ruleSetMap);
		assertEquals(0, ruleSetMap.size());
		
		File pafRuleSetsXmlFile = new File(tempConfDir + File.separator
				+ PafBaseConstants.FN_RuleSetMetaData);
		
		assertTrue(pafRuleSetsXmlFile.exists());
		
		List<RuleSet> ruleSets = null;
		
		try {
			 ruleSets = (List<RuleSet>) PafXStream.importObjectFromXml(pafRuleSetsXmlFile.toString());
		} catch (PafConfigFileNotFoundException e) {
			fail(e.getMessage());
		}
		
		assertNotNull(ruleSets);
		assertEquals(2, ruleSets.size());	
		
		File newPafRuleSetsDir = new File(tempConfDir+ File.separator + PafBaseConstants.DN_RuleSetsFldr);
		
		assertFalse(newPafRuleSetsDir.exists());
		
		action.run();
		
		assertEquals(MigrationActionStatus.Completed, action.getStatus());
		
		assertFalse(pafRuleSetsXmlFile.exists());
		
		File pafRuleSetsXmlFileBak = new File(tempConfDir + File.separator
				+ PafBaseConstants.FN_RuleSetMetaData + PafBaseConstants.BAK_EXT);
		
		assertTrue(pafRuleSetsXmlFileBak.exists());
		assertTrue(newPafRuleSetsDir.exists());
		
		Map<String, RuleSet> ruleSetMap2 = pp.getRuleSets();
		
		assertNotNull(ruleSetMap2);
		assertEquals(2, ruleSetMap2.size());
		
		//2 xml and 2 backup's with all tags
		assertEquals(4, newPafRuleSetsDir.list().length);
		
		
	}

}
