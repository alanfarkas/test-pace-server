/*
 *	File: @(#)ProjectElementId.java 	Package: com.pace.base.project 	Project: Paf Base Libraries
 *	Created: Jul 13, 2009  		By: jmilliron
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

/**
 * Project Data sections.  It will be used by a Pace Project and import/export data classes.
 *
 * @author jmilliron
 * @version	1.0
 *
 */
public enum ProjectElementId {

	ApplicationDef ("Application Definition", "Application information such as data sources, global settings, etc."),  
	Views ("Views", "All Views."), 
	ViewSections ("View Sections", "All View Sections."), 
	ViewGroups ("View Groups", "All View Groups."),
	RuleSets ("Rule Sets", "All Rule Sets."),
	UserSecurity ("User Security", "Users defined for this application."),
	PlanCycles ("Plan Cycles", "A list of Plan Cycles used in Roles and Processes."), 
	Seasons ("Seasons", "A list of seasons used in Roles and Processes."), 
	Roles ("Roles", "A list of roles used in Roles and Processes."), 
	RoleConfigs ("Role Configurations", "A list of role configurations used in Roles in Processes."),
	Versions ("Versions", "Pace Version definitions."),
	Measures ("Measures", "Pace Measure definitions"), 
	NumericFormats ("Numeric Formats", "Numerical formats that can be applied throughout the application."), 
	HierarchyFormats ("Hierarchy Formats", "Formats that can be applied at a view level."), 
	GlobalStyles ("Global Styles", "Styles that can be used thoughout the application."), 
	UserSelections ("User Selections", "User selections used within views."), 
	DynamicMembers ("Dynamic Members", "Dynamic Members used within views."), 
	CustomMenus ("Custom Menus", "Custom Menus provide the ability to setup menus in Pace."), 
	CustomFunctions ("Custom Functions", "Custom Functions provide the ability to write and use custom functions in Pace."),
 	MemberTags ("Member Tags", "Member Tag Definitions."), 
	RoundingRules ("Rounding Rules", "A list of Rounding Rules."),
	
	//only used for excel and as sub data regions
	RuleSet_RuleSet,
	RuleSet_RuleGroup,
	RuleSet_Rule;
	
	//user friendly name
	private String name;
	
	//description
	private String description;
	
	ProjectElementId() {
		
	}
	
	ProjectElementId(String name, String description) {
	
		this.name = name;
		this.description = description;
		
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	
	
	
}
