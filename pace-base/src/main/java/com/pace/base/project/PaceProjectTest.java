/*
 *	File: @(#)PaceProjectTest.java 	Package: com.pace.base.project 	Project: Paf Base Libraries
 *	Created: Aug 3, 2009  		By: jmilliron
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
package com.pace.base.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.pace.base.app.*;
import com.pace.base.comm.CustomMenuDef;
import com.pace.base.comm.PafPlannerConfig;
import com.pace.base.db.membertags.MemberTagDef;
import com.pace.base.funcs.CustomFunctionDef;
import com.pace.base.migration.MigrationActionTestCase;
import com.pace.base.rules.RoundingRule;
import com.pace.base.rules.RuleSet;
import com.pace.base.view.*;

/**
 * Class_description_goes_here
 *
 * @author jmilliron
 * @version	x.xx
 *
 */
public class PaceProjectTest extends MigrationActionTestCase {
	
	/*
	public void testRead() {
		fail("Not yet implemented");
	}

	
	public void testWriteSetOfProjectElementId() {
		fail("Not yet implemented");
	}
		
	public void testSave() {
		fail("Not yet implemented");
	}

	
	public void testSaveSetOfProjectElementId() {
		fail("Not yet implemented");
	}

	
	public void testSaveToString() {
		fail("Not yet implemented");
	}

	
	public void testSaveToStringSetOfProjectElementId() {
		fail("Not yet implemented");
	}

	
	public void testConvertTo() {
		fail("Not yet implemented");
	}

	
	public void testReloadData() {
		fail("Not yet implemented");
	}

	
	public void testLoadData() {
		fail("Not yet implemented");
	}
	*/

	
	
	/**
	 * Test method for {@link com.pace.base.project.PaceProject#getApplicationDefinitions()}.
	 */
	public void testGetApplicationDefinitions() {				
		
		assertNotNull(pp);
		
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());
		
		assertNotNull(pp.getApplicationDefinitions());
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.ApplicationDef));
		
		assertEquals(1, pp.getApplicationDefinitions().size());
		
		PafApplicationDef pafApp = pp.getApplicationDefinitions().get(0);
		
		assertEquals("TitanCopy", pafApp.getAppId());
		assertNotNull(pafApp.getAppSettings());
		assertEquals(true, pafApp.getAppSettings().isGlobalReplicateEnabled());
		assertEquals(true, pafApp.getAppSettings().isGlobalReplicateAllEnabled());
		assertEquals(false, pafApp.getAppSettings().isGlobalDataFilteredUow());
		assertEquals(false, pafApp.getAppSettings().isGlobalUserFilteredUow());
		assertEquals(false, pafApp.getAppSettings().isEnableRounding());
		assertNotNull(pafApp.getAppSettings().getGlobalAliasMappings());
		assertEquals(12, pafApp.getAppSettings().getGlobalAliasMappings().length);
		assertNotNull(pafApp.getMdbDef());
		assertEquals("Titan", pafApp.getMdbDef().getDataSourceId());
		assertEquals(30000, pafApp.getEssNetTimeOut().intValue());
		
	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#getCustomFunctions()}.
	 */
	public void testGetCustomFunctions() {
		
		assertNotNull(pp);		
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());		
		assertNotNull(pp.getCustomFunctions());
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.CustomFunctions));
		
		assertEquals(13, pp.getCustomFunctions().size());
		
	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#getCustomMenus()}.
	 */
	public void testGetCustomMenus() {
		
		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());	
		assertNotNull(pp.getCustomMenus());
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.CustomMenus));
		
		assertEquals(4, pp.getCustomMenus().size());
		
		List<CustomMenuDef> customMenus = pp.getCustomMenus();
		
		for (CustomMenuDef cmd : customMenus) {
			
			assertNotNull(cmd.getCustomActionDefs());
			assertEquals(1, cmd.getCustomActionDefs().length);
			
			assertEquals("com.pace.ext.cmds.EsbCalcCmd", cmd.getCustomActionDefs()[0].getActionClassName());
			assertNotNull(cmd.getCustomActionDefs()[0].getActionNamedParameters());
			assertEquals(2, cmd.getCustomActionDefs()[0].getActionNamedParameters().length);
			
		}
		
		
	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#getDynamicMembers()}.
	 */
	public void testGetDynamicMembers() {
		
		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());	
		assertNotNull(pp.getDynamicMembers());
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.DynamicMembers));
		
		assertEquals(1, pp.getDynamicMembers().size());
		assertEquals("Version", pp.getDynamicMembers().get(0).getDimension());
		assertEquals(3, pp.getDynamicMembers().get(0).getMemberSpecs().length);
			
		
	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#getGlobalStyles()}.
	 */
	public void testGetGlobalStyles() {
		
		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());	
		assertNotNull(pp.getGlobalStyles());
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.GlobalStyles));
		
		assertEquals(22, pp.getGlobalStyles().size());

	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#getHierarchyFormats()}.
	 */
	public void testGetHierarchyFormats() {
		
		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());	
		assertNotNull(pp.getHierarchyFormats());
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.HierarchyFormats));
		
		assertEquals(9, pp.getHierarchyFormats().size());
	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#getMeasures()}.
	 */
	public void testGetMeasures() {

		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());	
		assertNotNull(pp.getMeasures());
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.Measures));
		
		assertEquals(88, pp.getMeasures().size());
	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#getMemberTags()}.
	 */
	public void testGetMemberTags() {
		
		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());	
		assertNotNull(pp.getMemberTags());
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.MemberTags));
		
		assertEquals(2, pp.getMemberTags().size());
	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#getNumericFormats()}.
	 */
	public void testGetNumericFormats() {
		
		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());	
		assertNotNull(pp.getNumericFormats());
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.NumericFormats));
		
		assertEquals(14, pp.getNumericFormats().size());
		
	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#getPlanCycles()}.
	 */
	public void testGetPlanCycles() {
		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());	
		assertNotNull(pp.getPlanCycles());
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.PlanCycles));
		
		assertEquals(3, pp.getPlanCycles().size());
	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#getSeasons()}.
	 */
	public void testGetSeasons() {
		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());	
		assertNotNull(pp.getSeasons());
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.Seasons));
		
		assertEquals(7, pp.getSeasons().size());
	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#getRoleConfigurations()}.
	 */
	public void testGetRoleConfigurations() {
		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());	
		assertNotNull(pp.getRoleConfigurations());
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.RoleConfigs));
		
		assertEquals(11, pp.getRoleConfigurations().size());
	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#getRoles()}.
	 */
	public void testGetRoles() {
		
		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());	
		assertNotNull(pp.getRoles());
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.Roles));
		
		assertEquals(7, pp.getRoles().size());
	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#getRoundingRules()}.
	 */
	public void testGetRoundingRules() {
		
		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());	
		assertNotNull(pp.getRoundingRules());
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.RoundingRules));
		
		assertEquals(1, pp.getRoundingRules().size());
	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#getRuleSets()}.
	 */
	public void testGetRuleSets() {
		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());	
		assertNotNull(pp.getRuleSets());
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.RuleSets));
		
		assertEquals(15, pp.getRuleSets().size());
	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#getUserSecurity()}.
	 */
	public void testGetUserSecurity() {
		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());	
		assertNotNull(pp.getUserSecurity());
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.UserSecurity));
		
		assertEquals(6, pp.getUserSecurity().size());
	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#getUserSelections()}.
	 */
	public void testGetUserSelections() {
		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());	
		assertNotNull(pp.getUserSelections());
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.UserSelections));
		
		assertEquals(22, pp.getUserSelections().size());
	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#getVersions()}.
	 */
	public void testGetVersions() {
		
		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());	
		assertNotNull(pp.getVersions());
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.Versions));
		
		assertEquals(23, pp.getVersions().size());
	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#getViewGroups()}.
	 */
	public void testGetViewGroups() {
		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());	
		assertNotNull(pp.getViewGroups());
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.ViewGroups));
		
		assertEquals(9, pp.getViewGroups().size());
	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#getViewSections()}.
	 */
	public void testGetViewSections() {
		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());	
		assertNotNull(pp.getViewSections());
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.ViewSections));
		
		assertEquals(85, pp.getViewSections().size());
	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#getViews()}.
	 */
	public void testGetViews() {
		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());	
		assertNotNull(pp.getViews());
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.Views));
		
		assertEquals(84, pp.getViews().size());
	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#setApplicationDefinitions(java.util.List)}.
	 */
	public void testSetApplicationDefinitions() {
	
		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());	
		
		PafApplicationDef pafAppDef = new PafApplicationDef();
		
		String appId = "new app id";
		
		pafAppDef.setAppId(appId);
		
		pp.setApplicationDefinitions(new ArrayList<PafApplicationDef>(Arrays.asList(pafAppDef)));
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());	
		
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.ApplicationDef));
		
		List<PafApplicationDef> pafAppList = pp.getApplicationDefinitions();
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());	
		
		assertEquals(1, pafAppList.size());
		
		assertEquals(appId, pafAppList.get(0).getAppId());
		
		pp.setApplicationDefinitions(null);
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());
		
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.ApplicationDef));
		
		assertNull(pp.getProjectDataMap().get(ProjectElementId.ApplicationDef));
		
		//pp.save
		
		
	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#setCustomFunctions(java.util.List)}.
	 */
	public void testSetCustomFunctions() {
		
		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());	
		
		CustomFunctionDef cfd1 = new CustomFunctionDef();
		CustomFunctionDef cfd2 = new CustomFunctionDef();
		
		pp.setCustomFunctions(new ArrayList<CustomFunctionDef>(Arrays.asList(cfd1, cfd2)));
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());	
		
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.CustomFunctions));
		
		List<CustomFunctionDef> customFunctionList = pp.getCustomFunctions();
		
		assertEquals(2, customFunctionList.size());
		assertEquals(cfd1, customFunctionList.get(0));
		assertEquals(cfd2, customFunctionList.get(1));
		
	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#setCustomMenus(java.util.List)}.
	 */
	public void testSetCustomMenus() {
		
		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());	
		
		CustomMenuDef cmd1 = new CustomMenuDef();
		CustomMenuDef cmd2 = new CustomMenuDef();
		
		pp.setCustomMenus(new ArrayList<CustomMenuDef>(Arrays.asList(cmd1, cmd2)));
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());	
		
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.CustomMenus));
		
		List<CustomMenuDef> customMenuList = pp.getCustomMenus();
		
		assertEquals(2, customMenuList.size());
		assertEquals(cmd1, customMenuList.get(0));
		assertEquals(cmd2, customMenuList.get(1));
	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#setDynamicMembers(java.util.List)}.
	 */
	public void testSetDynamicMembers() {
		
		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());	
		
		DynamicMemberDef dmd1 = new DynamicMemberDef();
		DynamicMemberDef dmd2 = new DynamicMemberDef();
		
		pp.setDynamicMembers(new ArrayList<DynamicMemberDef>(Arrays.asList(dmd1, dmd2)));
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());	
		
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.DynamicMembers));
		
		List<DynamicMemberDef> dynamicMemberList = pp.getDynamicMembers();
		
		assertEquals(2, dynamicMemberList.size());
		assertEquals(dmd1, dynamicMemberList.get(0));
		assertEquals(dmd2, dynamicMemberList.get(1));
	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#setGlobalStyles(java.util.Map)}.
	 */
	public void testSetGlobalStyles() {
		
		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());	
		
		PafStyle ps1 = new PafStyle();
		ps1.setName("gs1");
		
		PafStyle ps2 = new PafStyle();
		ps2.setName("gs2");
		
		PafStyle ps3 = new PafStyle();
		ps3.setName("gs3");
		
		Map<String, PafStyle> map = new TreeMap<String, PafStyle>();
		
		map.put(ps1.getName(), ps1);
		map.put(ps2.getName(), ps2);
		map.put(ps3.getName(), ps3);
		
		pp.setGlobalStyles(map);

		assertEquals(1, pp.getLoadedProjectElementIdSet().size());	
		
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.GlobalStyles));
		
		Map<String, PafStyle> map2 = pp.getGlobalStyles();
		
		assertTrue(map2 instanceof TreeMap);
		
		assertEquals(3, map2.size());
						
		assertTrue(map2.containsKey(ps1.getName()));
		assertTrue(map2.containsKey(ps2.getName()));
		assertTrue(map2.containsKey(ps3.getName()));
		
		assertTrue(map2.containsValue(ps1));
		assertTrue(map2.containsValue(ps2));
		assertTrue(map2.containsValue(ps3));
		
	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#setHierarchyFormats(java.util.Map)}.
	 */
	public void testSetHierarchyFormats() {
		
		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());	
		
		HierarchyFormat hf1 = new HierarchyFormat();
		hf1.setName("hf1");
		
		HierarchyFormat hf2 = new HierarchyFormat();
		hf2.setName("hf2");
		
		HierarchyFormat hf3 = new HierarchyFormat();
		hf3.setName("hf3");
		
		Map<String, HierarchyFormat> map = new TreeMap<String, HierarchyFormat>();
		
		map.put(hf1.getName(), hf1);
		map.put(hf2.getName(), hf2);
		map.put(hf3.getName(), hf3);
		
		pp.setHierarchyFormats(map);

		assertEquals(1, pp.getLoadedProjectElementIdSet().size());	
		
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.HierarchyFormats));
		
		Map<String, HierarchyFormat> map2 = pp.getHierarchyFormats();
		
		assertTrue(map2 instanceof TreeMap);
		
		assertEquals(3, map2.size());
		
		assertTrue(map2.containsKey(hf1.getName()));
		assertTrue(map2.containsKey(hf2.getName()));
		assertTrue(map2.containsKey(hf3.getName()));
		
		assertTrue(map2.containsValue(hf1));
		assertTrue(map2.containsValue(hf2));
		assertTrue(map2.containsValue(hf3));
	}

	
	
	/**
	 * Test method for {@link com.pace.base.project.PaceProject#setMeasures(java.util.List)}.
	 */
	public void testSetMeasures() {

		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());	
		
		MeasureDef m1 = new MeasureDef();
		MeasureDef m2 = new MeasureDef();
		
		pp.setMeasures(new ArrayList<MeasureDef>(Arrays.asList(m1, m2)));
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());	
		
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.Measures));
		
		List<MeasureDef> measureList = pp.getMeasures();
		
		assertEquals(2, measureList.size());
		assertEquals(m1, measureList.get(0));
		assertEquals(m2, measureList.get(1));		
		
	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#setMemberTags(java.util.List)}.
	 */
	public void testSetMemberTags() {


		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());	
		
		MemberTagDef m1 = new MemberTagDef();
		MemberTagDef m2 = new MemberTagDef();
		
		pp.setMemberTags(new ArrayList<MemberTagDef>(Arrays.asList(m1, m2)));
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());	
		
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.MemberTags));
		
		List<MemberTagDef> memberTagList = pp.getMemberTags();
		
		assertEquals(2, memberTagList.size());
		assertEquals(m1, memberTagList.get(0));
		assertEquals(m2, memberTagList.get(1));		
		
	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#setNumericFormats(java.util.Map)}.
	 */
	public void testSetNumericFormats() {
		
		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());	
		
		PafNumberFormat n1 = new PafNumberFormat();
		n1.setName("n1");
		
		PafNumberFormat n2 = new PafNumberFormat();
		n2.setName("n2");
		
		PafNumberFormat n3 = new PafNumberFormat();
		n3.setName("n3");
		
		Map<String, PafNumberFormat> map = new TreeMap<String, PafNumberFormat>();
		
		map.put(n1.getName(), n1);
		map.put(n2.getName(), n2);
		map.put(n3.getName(), n3);
		
		pp.setNumericFormats(map);

		assertEquals(1, pp.getLoadedProjectElementIdSet().size());	
		
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.NumericFormats));
		
		Map<String, PafNumberFormat> map2 = pp.getNumericFormats();
		
		assertTrue(map2 instanceof TreeMap);
		
		assertEquals(3, map2.size());
		
		assertTrue(map2.containsKey(n1.getName()));
		assertTrue(map2.containsKey(n2.getName()));
		assertTrue(map2.containsKey(n3.getName()));
		
		assertTrue(map2.containsValue(n1));
		assertTrue(map2.containsValue(n2));
		assertTrue(map2.containsValue(n3));
		
	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#setPlanCycles(java.util.List)}.
	 */
	public void testSetPlanCycles() {
		
		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());	
		
		PlanCycle pc1 = new PlanCycle();
		PlanCycle pc2 = new PlanCycle();
		
		pp.setPlanCycles(new ArrayList<PlanCycle>(Arrays.asList(pc1, pc2)));
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());	
		
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.PlanCycles));
		
		List<PlanCycle> planCycleList = pp.getPlanCycles();
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());
		
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.PlanCycles));
		
		assertEquals(2, planCycleList.size());
		assertEquals(pc1, planCycleList.get(0));
		assertEquals(pc2, planCycleList.get(1));		
		
	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#setSeasons(java.util.List)}.
	 */
	public void testSetSeasons() {
		
		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());	
		
		Season s1 = new Season();
		Season s2 = new Season();
		
		pp.setSeasons(new ArrayList<Season>(Arrays.asList(s1, s2)));
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());	
		
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.Seasons));
		
		List<Season> seasonList = pp.getSeasons();
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());
		
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.Seasons));
		
		assertEquals(2, seasonList.size());
		assertEquals(s1, seasonList.get(0));
		assertEquals(s2, seasonList.get(1));		
		
	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#setRoleConfigurations(java.util.List)}.
	 */
	public void testSetRoleConfigurations() {
		
		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());			
			
		PafPlannerConfig rc1 = new PafPlannerConfig();
		PafPlannerConfig rc2 = new PafPlannerConfig();
		
		pp.setRoleConfigurations(new ArrayList<PafPlannerConfig>(Arrays.asList(rc1, rc2)));
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());	
		
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.RoleConfigs));
		
		List<PafPlannerConfig> roleConfigList = pp.getRoleConfigurations();
								
		assertEquals(2, roleConfigList.size());
		assertEquals(rc1, roleConfigList.get(0));
		assertEquals(rc2, roleConfigList.get(1));		
		
	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#setRoles(java.util.List)}.
	 */
	public void testSetRoles() {
		
		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());			
			
		PafPlannerRole rc1 = new PafPlannerRole();
		PafPlannerRole rc2 = new PafPlannerRole();
		
		pp.setRoles(new ArrayList<PafPlannerRole>(Arrays.asList(rc1, rc2)));
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());	
		
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.Roles));
		
		List<PafPlannerRole> roleList = pp.getRoles();
								
		assertEquals(2, roleList.size());
		assertEquals(rc1, roleList.get(0));
		assertEquals(rc2, roleList.get(1));		
		
	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#setRoundingRules(java.util.List)}.
	 */
	public void testSetRoundingRules() {
		
		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());			
			
		RoundingRule rr1 = new RoundingRule();
		RoundingRule rr2 = new RoundingRule();
						
		pp.setRoundingRules(new ArrayList<RoundingRule>(Arrays.asList(rr1, rr2)));
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());	
		
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.RoundingRules));
		
		List<RoundingRule> roundingRuleList = pp.getRoundingRules();
								
		assertEquals(2, roundingRuleList.size());
		assertEquals(rr1, roundingRuleList.get(0));
		assertEquals(rr2, roundingRuleList.get(1));		
	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#setRuleSets(java.util.Map)}.
	 */
	public void testSetRuleSets() {
	
		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());	
		
		RuleSet rs1 = new RuleSet();
		rs1.setName("n1");
		
		RuleSet rs2 = new RuleSet();
		rs2.setName("n2");
		
		RuleSet rs3 = new RuleSet();
		rs3.setName("n3");
		
		Map<String, RuleSet> map = new HashMap<String, RuleSet>();
		
		map.put(rs1.getName(), rs1);
		map.put(rs2.getName(), rs2);
		map.put(rs3.getName(), rs3);
		
		pp.setRuleSets(map);

		assertEquals(1, pp.getLoadedProjectElementIdSet().size());	
		
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.RuleSets));
		
		Map<String, RuleSet> map2 = pp.getRuleSets();
		
		assertTrue(map2 instanceof HashMap);
		
		assertEquals(3, map2.size());
		
		assertTrue(map2.containsKey(rs1.getName()));
		assertTrue(map2.containsKey(rs2.getName()));
		assertTrue(map2.containsKey(rs3.getName()));
		
		assertTrue(map2.containsValue(rs1));
		assertTrue(map2.containsValue(rs2));
		assertTrue(map2.containsValue(rs3));
		
	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#setUserSecurity(java.util.List)}.
	 */
	public void testSetUserSecurity() {
	
		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());			
			
		PafUserSecurity us1 = new PafUserSecurity();
		PafUserSecurity us2 = new PafUserSecurity();
						
		pp.setUserSecurity(new ArrayList<PafUserSecurity>(Arrays.asList(us1, us2)));
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());	
		
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.UserSecurity));
		
		List<PafUserSecurity> userSecurityList = pp.getUserSecurity();
								
		assertEquals(2, userSecurityList.size());
		assertEquals(us1, userSecurityList.get(0));
		assertEquals(us2, userSecurityList.get(1));		
		
	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#setUserSelections(java.util.List)}.
	 */
	public void testSetUserSelections() {
	
		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());			
			
		PafUserSelection us1 = new PafUserSelection();
		
		us1.setId("Id1");
		
		PafUserSelection us2 = new PafUserSelection();
		
		us2.setId("Id2");
		
		pp.setUserSelections(new ArrayList<PafUserSelection>(Arrays.asList(us1, us2)));
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());	
		
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.UserSelections));
		
		List<PafUserSelection> userSelectionList = pp.getUserSelections();
								
		assertEquals(2, userSelectionList.size());
		assertEquals(us1, userSelectionList.get(0));
		assertEquals(us2, userSelectionList.get(1));		
		
	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#setVersions(java.util.List)}.
	 */
	public void testSetVersions() {
		
		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());			
			
		VersionDef vd1 = new VersionDef();
		VersionDef vd2 = new VersionDef();
						
		pp.setVersions(new ArrayList<VersionDef>(Arrays.asList(vd1, vd2)));
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());	
		
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.Versions));
		
		List<VersionDef> versionList = pp.getVersions();
								
		assertEquals(2, versionList.size());
		assertEquals(vd1, versionList.get(0));
		assertEquals(vd2, versionList.get(1));		
		
	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#setViewGroups(java.util.Map)}.
	 */
	public void testSetViewGroups() {
		
		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());	
		
		PafViewGroup vg1 = new PafViewGroup();
		vg1.setName("n1");
		
		PafViewGroup vg2 = new PafViewGroup();
		vg2.setName("n2");
		
		PafViewGroup vg3 = new PafViewGroup();
		vg3.setName("n3");
		
		Map<String, PafViewGroup> map = new HashMap<String, PafViewGroup>();
		
		map.put(vg1.getName(), vg1);
		map.put(vg2.getName(), vg2);
		map.put(vg3.getName(), vg3);
		
		pp.setViewGroups(map);

		assertEquals(1, pp.getLoadedProjectElementIdSet().size());	
		
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.ViewGroups));
		
		Map<String, PafViewGroup> map2 = pp.getViewGroups();
		
		assertTrue(map2 instanceof HashMap);
		
		assertEquals(3, map2.size());
		
		assertTrue(map2.containsKey(vg1.getName()));
		assertTrue(map2.containsKey(vg2.getName()));
		assertTrue(map2.containsKey(vg3.getName()));
		
		assertTrue(map2.containsValue(vg1));
		assertTrue(map2.containsValue(vg2));
		assertTrue(map2.containsValue(vg3));	
		
	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#setViewSections(java.util.List)}.
	 */
	public void testSetViewSections() {
		
		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());			
			
		PafViewSection vd1 = new PafViewSection();
		PafViewSection vd2 = new PafViewSection();
						
		pp.setViewSections(new ArrayList<PafViewSection>(Arrays.asList(vd1, vd2)));
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());	
		
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.ViewSections));
		
		List<PafViewSection> vsList = pp.getViewSections();
								
		assertEquals(2, vsList.size());
		assertEquals(vd1, vsList.get(0));
		assertEquals(vd2, vsList.get(1));		
		
	}

	/**
	 * Test method for {@link com.pace.base.project.PaceProject#setViews(java.util.List)}.
	 */
	public void testSetViews() {

		assertNotNull(pp);
		assertEquals(0, pp.getLoadedProjectElementIdSet().size());			
			
		PafView vd1 = new PafView();
		PafView vd2 = new PafView();
						
		pp.setViews(new ArrayList<PafView>(Arrays.asList(vd1, vd2)));
		
		assertEquals(1, pp.getLoadedProjectElementIdSet().size());	
		
		assertTrue(pp.getLoadedProjectElementIdSet().contains(ProjectElementId.Views));
		
		List<PafView> vsList = pp.getViews();
								
		assertEquals(2, vsList.size());
		assertEquals(vd1, vsList.get(0));
		assertEquals(vd2, vsList.get(1));		
	}
	
	
}
