/*
 *	File: @(#)IPaceProject.java 	Package: com.palladium.paf.project.alt 	Project: Paf Base Libraries
 *	Created: Jul 22, 2009  		By: jmilliron
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
package com.palladium.paf.project;

import java.util.List;
import java.util.Map;

import com.palladium.paf.app.DynamicMemberDef;
import com.palladium.paf.app.MeasureDef;
import com.palladium.paf.app.PafApplicationDef;
import com.palladium.paf.app.PafPlannerRole;
import com.palladium.paf.app.PafUserSecurity;
import com.palladium.paf.app.PlanCycle;
import com.palladium.paf.app.VersionDef;
import com.palladium.paf.comm.CustomMenuDef;
import com.palladium.paf.comm.PafPlannerConfig;
import com.palladium.paf.db.membertags.MemberTagDef;
import com.palladium.paf.funcs.CustomFunctionDef;
import com.palladium.paf.rules.RoundingRule;
import com.palladium.paf.rules.RuleSet;
import com.palladium.paf.view.HierarchyFormat;
import com.palladium.paf.view.PafNumberFormat;
import com.palladium.paf.view.PafStyle;
import com.palladium.paf.view.PafUserSelection;
import com.palladium.paf.view.PafView;
import com.palladium.paf.view.PafViewGroup;
import com.palladium.paf.view.PafViewSection;

/**
 * Class_description_goes_here
 *
 * @author jmilliron
 * @version	x.xx
 *
 */
public interface IPaceProject {
	
	public List<PlanCycle> getPlanCycles();
	public List<PafApplicationDef> getApplicationDefinitions();
	public Map<String, PafNumberFormat> getNumericFormats();
	public Map<String, PafStyle> getGlobalStyles();
	public Map<String, HierarchyFormat> getHierarchyFormats();
	public List<PafUserSelection> getUserSelections();
	public List<VersionDef> getVersions();
	public List<MeasureDef> getMeasures();
	public List<DynamicMemberDef> getDynamicMembers();
	public List<PafPlannerRole> getRoles();
	public List<PafPlannerConfig> getRoleConfigurations();
	public List<CustomMenuDef> getCustomMenus();
	public List<CustomFunctionDef> getCustomFunctions();
	public List<PafView> getViews();
	public List<PafViewSection> getViewSections();
	public Map<String, PafViewGroup> getViewGroups();
	public List<MemberTagDef> getMemberTags();
	public List<PafUserSecurity> getUserSecurity();
	public List<RoundingRule> getRoundingRules();
	public Map<String, RuleSet> getRuleSets();

	public void setPlanCycles(List<PlanCycle> planCycleList);
	public void setApplicationDefinitions(List<PafApplicationDef> appDefList);
	public void setNumericFormats(Map<String, PafNumberFormat> numericFormatMap);
	public void setGlobalStyles(Map<String, PafStyle> globalStyleMap);
	public void setHierarchyFormats(Map<String, HierarchyFormat> hierarchyFormatMap);
	public void setUserSelections(List<PafUserSelection> pafUserSelectionList);
	public void setVersions(List<VersionDef> versionDefList);
	public void setMeasures(List<MeasureDef> measureDefList);
	public void setDynamicMembers(List<DynamicMemberDef> dynamicMembersDefList);
	public void setRoles(List<PafPlannerRole> roleList);
	public void setRoleConfigurations(List<PafPlannerConfig> plannerConfigList);
	public void setCustomMenus(List<CustomMenuDef> customMenuDefList);
	public void setCustomFunctions(List<CustomFunctionDef> customFunctionDefList);
	public void setViews(List<PafView> viewList);
	public void setViewSections(List<PafViewSection> viewSectionList);
	public void setViewGroups(Map<String, PafViewGroup> viewGroupMap);
	public void setMemberTags(List<MemberTagDef> memberTagDefList);
	public void setUserSecurity(List<PafUserSecurity> userSecurityList);
	public void setRoundingRules(List<RoundingRule> roundingRuleList);
	public void setRuleSets(Map<String, RuleSet> ruleSetList);	


}
