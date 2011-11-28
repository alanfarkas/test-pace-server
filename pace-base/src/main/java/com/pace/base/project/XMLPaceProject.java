/*
 *	File: @(#)XMLPaceProject.java 	Package: com.pace.base.project.alt 	Project: Paf Base Libraries
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
package com.pace.base.project;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

import com.pace.base.PafBaseConstants;
import com.pace.base.PafException;
import com.pace.base.app.DynamicMemberDef;
import com.pace.base.app.MeasureDef;
import com.pace.base.app.PafApplicationDef;
import com.pace.base.app.PafPlannerRole;
import com.pace.base.app.PafUserSecurity;
import com.pace.base.app.PlanCycle;
import com.pace.base.app.Season;
import com.pace.base.app.SeasonList;
import com.pace.base.app.VersionDef;
import com.pace.base.comm.CustomMenuDef;
import com.pace.base.comm.PafPlannerConfig;
import com.pace.base.data.UserMemberLists;
import com.pace.base.db.membertags.MemberTagDef;
import com.pace.base.funcs.CustomFunctionDef;
import com.pace.base.migration.CustomFunctionDefClassNameMigrationAction;
import com.pace.base.migration.CustomMenuDefActionClassNameMigrationAction;
import com.pace.base.migration.MemberTagDefTypeClassNameMigrationAction;
import com.pace.base.migration.MigrationAction;
import com.pace.base.migration.MigrationActionStatus;
import com.pace.base.migration.PafAppsMigrationAction;
import com.pace.base.migration.PafDTDtoXSDMigrationAction;
import com.pace.base.migration.PafDynamicMembersMigrationAction;
import com.pace.base.migration.PafGenerationToHierarchyMigration;
import com.pace.base.migration.PafGlobalStylesClassNameMigrationAction;
import com.pace.base.migration.PafGlobalStylesMigrationAction;
import com.pace.base.migration.PafPlannerConfigMigrationAction;
import com.pace.base.migration.PafRuleSetsSeparationMigrationAction;
import com.pace.base.migration.PafSecurityMigrationAction;
import com.pace.base.migration.PafStringCaseInsensitiveComparatorMigrationAction;
import com.pace.base.migration.PafViewGroupsMigrationAction;
import com.pace.base.migration.PafViewPrintStylesMigrationAction;
import com.pace.base.migration.PafViewSectionBorderMigration;
import com.pace.base.migration.PafViewSectionsSeparationMigrationAction;
import com.pace.base.migration.PafViewsSeparationMigrationAction;
import com.pace.base.migration.PrintStylesMigrationAction;
import com.pace.base.migration.UserMemberListsMigrationAction;
import com.pace.base.rules.RoundingRule;
import com.pace.base.rules.RuleSet;
import com.pace.base.ui.PrintStyle;
import com.pace.base.ui.PrintStyles;
import com.pace.base.utility.FileUtils;
import com.pace.base.utility.MigrateServerUtil;
import com.pace.base.view.HierarchyFormat;
import com.pace.base.view.PafNumberFormat;
import com.pace.base.view.PafStyle;
import com.pace.base.view.PafUserSelection;
import com.pace.base.view.PafView;
import com.pace.base.view.PafViewGroup;
import com.pace.base.view.PafViewSection;

/**
 * Class_description_goes_here
 *
 * @author jmilliron
 * @version	x.xx
 *
 */
public class XMLPaceProject extends PaceProject {

	private static final Logger logger = Logger.getLogger(XMLPaceProject.class);
		
	private boolean upgradeProject;
	
	private List<String> attributeDimList = new ArrayList<String>();

	private File outputConfDir;
	
	private boolean updateOnly;

	/**
	 * @param projectDataMap
	 */
	protected XMLPaceProject(Map<ProjectElementId, Object> projectDataMap) {
		super(projectDataMap);
	}
	
	/**
	 * @param confDir
	 * @throws PafException
	 */
	public XMLPaceProject(String confDir, boolean upgradeProject) throws InvalidPaceProjectInputException, PaceProjectCreationException {
		this(confDir, null, upgradeProject, null);		
	}
	
	/**
	 * @param confDir
	 * @param filterSet
	 * @throws PafException
	 */
	public XMLPaceProject(String confDir, Set<ProjectElementId> filterSet, boolean upgradeProject)
			throws InvalidPaceProjectInputException, PaceProjectCreationException {
		this(confDir, filterSet, upgradeProject, null);
	}	
	
	/**
	 * @param confDir
	 * @throws PafException
	 */
	public XMLPaceProject(String confDir, boolean upgradeProject, List<String> attributeDimList) throws InvalidPaceProjectInputException, 
			PaceProjectCreationException {
		this(confDir, null, upgradeProject, attributeDimList);
		
	}

	/**
	 * @param confDir
	 * @param filterSet
	 * @throws PafException
	 */
	public XMLPaceProject(String confDir, Set<ProjectElementId> filterSet, boolean upgradeProject, List<String> attributeDimList)
			throws InvalidPaceProjectInputException, PaceProjectCreationException {
		
		super(confDir, filterSet);
						
		File inputConfDir = new File(getProjectInput());
		
		if ( ! inputConfDir.isDirectory()) {
			
			String errorMessage = "Invalid conf directory: " + confDir; 
			
			logger.error(errorMessage);
			
			throw new InvalidPaceProjectInputException(errorMessage);
			
		}
		
		if ( ! confDir.endsWith(File.separator)) {
			
			confDir += File.separator;
			
			setProjectInput(confDir);			
			
		}
		
		this.upgradeProject = upgradeProject;
		
		if ( attributeDimList != null) {
			this.attributeDimList.addAll(attributeDimList);
		}
		
		
		//if upgrade project
		if ( isUpgradeProject() ) {
		
			//do migration action
			(new PafDTDtoXSDMigrationAction(this)).run();
			
		}
		
		read(filterSet);
		
		if ( getProjectErrorMap().size() > 0 ) {
			
			throw new PaceProjectCreationException(getProjectErrorMap());
			
		}
				
	}
		
	public String getProjectOutputDir() {
		
		String outputDir = null;
		
		if ( outputConfDir == null || ! outputConfDir.isDirectory()) {
			
			outputDir = getProjectInput(); 
			
			
		} else {
			
			outputDir = outputConfDir.toString() + File.separator;
			
		}
		
		return outputDir;
	}
	
	@Override
	protected void write(String writeToDir, Set<ProjectElementId> filterSet) throws ProjectSaveException {

		System.out.println("Writing XML files: " + writeToDir);
		
		//if writeToDir is null, get input dir to overwrite input.
		if ( writeToDir == null ) {
			
			writeToDir = getProjectInputDir();
			
		}
		
		//TODO: set output dir as private var		
		outputConfDir = new File(writeToDir);
		
		if ( ! outputConfDir.exists() ) {
			
			boolean dirCreated = outputConfDir.mkdir();
			
			if ( ! dirCreated ) {
				
				logger.error("Directory " + outputConfDir.toString() + " could not be created.");
				
			}
			
		} else {
			
			//TODO: delete all contents in dir to prepare for save.
			
		}
		
		write(filterSet);
				
		//TODO: clear output dir		
		outputConfDir = null;
				
	}
	
	@Override
	protected void readApplicationDefinitions() throws PaceProjectReadException {
		
		//if upgrade project project
		if ( upgradeProject ) {
			
			//run migration
			PafAppsMigrationAction migrationAction = new PafAppsMigrationAction(this);
			
			if ( attributeDimList != null && attributeDimList.size() > 0 ) {
			
				migrationAction.setAttributeDimensionNames(attributeDimList.toArray(new String[0]));
				
			}			
			
			migrationAction.run();
			
		}
		
		PafXStreamElementItem<PafApplicationDef[]> pafXStreamElementItem = new PafXStreamElementItem<PafApplicationDef[]>(getProjectInput() + PafBaseConstants.FN_ApplicationMetaData);
							
		PafApplicationDef[] objectAr = pafXStreamElementItem.read();
			
		setApplicationDefinitions((objectAr == null) ? null : Arrays.asList(objectAr));
		
	}
	
	@Override
	protected void readCustomFunctions() throws PaceProjectReadException {
		
		if ( upgradeProject ) {
			
			 new CustomFunctionDefClassNameMigrationAction(this).run();
		 }
		
		PafXStreamElementItem<CustomFunctionDef[]> pafXStreamElementItem = new PafXStreamElementItem<CustomFunctionDef[]>(getProjectInput() + PafBaseConstants.FN_CustomFunctionMetaData);
		
		CustomFunctionDef[] objectAr = pafXStreamElementItem.read();
			
		setCustomFunctions((objectAr == null) ? null : Arrays.asList(objectAr));
		
	}

	@Override
	protected void readCustomMenus() throws PaceProjectReadException {
		
		if ( upgradeProject ) {
			
			 new CustomMenuDefActionClassNameMigrationAction(this).run();
		 }
		
		PafXStreamElementItem<CustomMenuDef[]> pafXStreamElementItem = new PafXStreamElementItem<CustomMenuDef[]>(getProjectInput() + PafBaseConstants.FN_CustomMenus);
		
		CustomMenuDef[] objectAr = pafXStreamElementItem.read();
			
		setCustomMenus((objectAr == null) ? null : Arrays.asList(objectAr));
		
	}
		

	@Override
	protected void readDynamicMembers() throws PaceProjectReadException {

		if ( upgradeProject ) {
			
			 new PafDynamicMembersMigrationAction(this).run();
			 
		 }
		
		PafXStreamElementItem<DynamicMemberDef[]> pafXStreamElementItem = new PafXStreamElementItem<DynamicMemberDef[]>(getProjectInput() + PafBaseConstants.FN_DynamicMembers);
		
		DynamicMemberDef[] objectAr = pafXStreamElementItem.read();
						
		setDynamicMembers((objectAr == null) ? null : Arrays.asList(objectAr));
			
		
		
	}

	@Override
	protected void readGlobalStyles() throws PaceProjectReadException {
		
		//if upgrade project project
		if ( upgradeProject) {
			
			new PafGlobalStylesClassNameMigrationAction(this).run();
			
			//run global Styles migration action
			new PafGlobalStylesMigrationAction(this).run();
			
		}

		PafXStreamElementItem<Map<String, PafStyle>> pafXStreamElementItem = new PafXStreamElementItem<Map<String, PafStyle>>(getProjectInput() + PafBaseConstants.FN_GlobalStyleMetaData);
		
		Map<String, PafStyle> objectMap = pafXStreamElementItem.read();
						
		setGlobalStyles(objectMap);
				
	}

	@Override
	protected void readHierarchyFormats() throws PaceProjectReadException {

		//if auto convert project, try to convert gen formats to hier formats
		if ( upgradeProject ) {

			new PafStringCaseInsensitiveComparatorMigrationAction(new String[] {PafBaseConstants.FN_HierarchyFormats }, this.getProjectInputDir()).run();
			
			//run conversion action
			new PafGenerationToHierarchyMigration(this).run();
			
		}
		
		PafXStreamElementItem<Map<String, HierarchyFormat>> pafXStreamElementItem = new PafXStreamElementItem<Map<String, HierarchyFormat>>(getProjectInput() + PafBaseConstants.FN_HierarchyFormats);
		
		Map<String, HierarchyFormat> objectMap = pafXStreamElementItem.read();
						
		setHierarchyFormats(objectMap);
		
	}

	@Override
	protected void readMeasures() throws PaceProjectReadException {
		
		PafXStreamElementItem<MeasureDef[]> pafXStreamElementItem = new PafXStreamElementItem<MeasureDef[]>(getProjectInput() + PafBaseConstants.FN_MeasureMetaData);
		
		MeasureDef[] objectAr = pafXStreamElementItem.read();
	
		setMeasures((objectAr == null) ? null : Arrays.asList(objectAr));

	}

	@Override
	protected void readMemberTags() throws PaceProjectReadException {

		//if auto convert project, try to convert member tags.
		if ( upgradeProject ) {
			new MemberTagDefTypeClassNameMigrationAction(new String[] {PafBaseConstants.FN_MemberTagMetaData }, this.getProjectInputDir()).run();
		}
		
		PafXStreamElementItem<MemberTagDef[]> pafXStreamElementItem = new PafXStreamElementItem<MemberTagDef[]>(getProjectInput() + PafBaseConstants.FN_MemberTagMetaData);
		
		MemberTagDef[] objectAr = pafXStreamElementItem.read();
		
		setMemberTags((objectAr == null) ? null : Arrays.asList(objectAr));
			
		
	}

	@Override
	protected void readNumericFormats() throws PaceProjectReadException {
		
		//if auto convert project, try to convert gen formats to hier formats
		if ( upgradeProject ) {

			new PafStringCaseInsensitiveComparatorMigrationAction(new String[] {PafBaseConstants.FN_NumericFormatsMetaData }, this.getProjectInputDir()).run();

		}
		
		PafXStreamElementItem<Map<String, PafNumberFormat>> pafXStreamElementItem = new PafXStreamElementItem<Map<String, PafNumberFormat>>(getProjectInput() + PafBaseConstants.FN_NumericFormatsMetaData);
		
		Map<String, PafNumberFormat> objectMap = pafXStreamElementItem.read();
									
		setNumericFormats(objectMap);
		
	}

	@Override
	protected void readPlanCycles() throws PaceProjectReadException {
		
		PafXStreamElementItem<PafApplicationDef[]> pafXStreamElementItem = new PafXStreamElementItem<PafApplicationDef[]>(getProjectInput() + PafBaseConstants.FN_ApplicationMetaData);
		
		PafApplicationDef[] pafApplicationDef = pafXStreamElementItem.read();
		
		if ( pafApplicationDef != null && pafApplicationDef.length == 1 ) {
			
			PlanCycle[] planCycles = pafApplicationDef[0].getPlanCycles();
				
			setPlanCycles((planCycles == null) ? null : Arrays.asList(planCycles));		
			
		}
		
	}

	@Override
	protected void readSeasons() throws PaceProjectReadException {

		PafXStreamElementItem<PafApplicationDef[]> pafXStreamElementItem = new PafXStreamElementItem<PafApplicationDef[]>(getProjectInput() + PafBaseConstants.FN_ApplicationMetaData);
		
		PafApplicationDef[] pafApplicationDef = pafXStreamElementItem.read();
		
		if ( pafApplicationDef != null && pafApplicationDef.length == 1 ) {
			
			SeasonList seasonsList = pafApplicationDef[0].getSeasonList();
			
			if ( seasonsList != null && seasonsList.getSeasons() != null ) {
								
				setSeasons((seasonsList.getSeasons() == null) ? null : new ArrayList<Season>(seasonsList.getSeasons()));
				
			}
			
		}
		
	}
	
	@Override
	protected void readRoleConfigurations() throws PaceProjectReadException {
		
		if (upgradeProject) {

			new PafPlannerConfigMigrationAction(this).run();

		}
		
		PafXStreamElementItem<PafPlannerConfig[]> pafXStreamElementItem = new PafXStreamElementItem<PafPlannerConfig[]>(getProjectInput() + PafBaseConstants.FN_PlannerConfigs);
		
		PafPlannerConfig[] objectAr = pafXStreamElementItem.read();
				
		setRoleConfigurations((objectAr == null) ? null : Arrays.asList(objectAr));
			
		
	}

	@Override
	protected void readRoles() throws PaceProjectReadException {
		
		PafXStreamElementItem<PafPlannerRole[]> pafXStreamElementItem = new PafXStreamElementItem<PafPlannerRole[]>(getProjectInput() + PafBaseConstants.FN_RoleMetaData);
		
		PafPlannerRole[] objectAr = pafXStreamElementItem.read();
			
		setRoles((objectAr == null) ? null : Arrays.asList(objectAr));
		
	}

	@Override
	protected void readRoundingRules() throws PaceProjectReadException {
		
		PafXStreamElementItem<RoundingRule[]> pafXStreamElementItem = new PafXStreamElementItem<RoundingRule[]>(getProjectInput() + PafBaseConstants.FN_RoundingRules);
		
		RoundingRule[] objectAr = pafXStreamElementItem.read();
		
		setRoundingRules((objectAr == null) ? null : Arrays.asList(objectAr));
			
		
	}

	@Override
	protected void readRuleSets() throws PaceProjectReadException {

		// if upgrade project project is true, upgrade project using this action
		if (upgradeProject) {

			MigrationAction migrationAction = new PafRuleSetsSeparationMigrationAction(this);

			if (migrationAction.getStatus().equals(MigrationActionStatus.NotStarted)) {

				migrationAction.run();

			}

		}

		// create empty map
		Map<String, RuleSet> ruleSetMap = new HashMap<String, RuleSet>();
		
		// get ref to data folder
		File pafRuleSetsDirectory = new File(getProjectInput() + File.separator
				+ PafBaseConstants.DN_RuleSetsFldr);

		// if data folder exists
		if (pafRuleSetsDirectory != null && pafRuleSetsDirectory.isDirectory()) {

			// for each data file in data folder
			for (File pafRuleSetFile : pafRuleSetsDirectory.listFiles()) {
				
				//if a file and ends with xml
				if ( pafRuleSetFile.isFile() && pafRuleSetFile.toString().endsWith(PafBaseConstants.XML_EXT)) {
					
					PafXStreamElementItem<RuleSet> pafXStreamElementItem = new PafXStreamElementItem<RuleSet>(pafRuleSetFile
							.getAbsolutePath());
					
					RuleSet rs = pafXStreamElementItem.read();
					
					if ( rs != null ) {
						
						ruleSetMap.put(rs.getName(), rs);
						
					}
					
				}
				
			}
			
		}
					
		setRuleSets(ruleSetMap);
		
	}

	@Override
	protected void readUserMemberLists() throws PaceProjectReadException {

		//if upgrade project project
		if ( upgradeProject) {
			
			//run migration
			new UserMemberListsMigrationAction(this).run();
			
		}
		
		PafXStreamElementItem<UserMemberLists> pafXStreamElementItem = new PafXStreamElementItem<UserMemberLists> (getProjectInput() + PafBaseConstants.FN_UserMemberLists);
		
		UserMemberLists uml = pafXStreamElementItem.read();
	
		setUserMemberLists((uml == null) ? null : uml);
			
	}
	
	@Override
	protected void readUserSecurity() throws PaceProjectReadException {

		//if upgrade project project
		if ( upgradeProject) {
			
			//run security migration
			new PafSecurityMigrationAction(this).run();
			
		}
		
		PafXStreamElementItem<PafUserSecurity[]> pafXStreamElementItem = new PafXStreamElementItem<PafUserSecurity[]>(getProjectInput() + PafBaseConstants.FN_SecurityMetaData);
		
		PafUserSecurity[] objectAr = pafXStreamElementItem.read();
	
		setUserSecurity((objectAr == null) ? null : Arrays.asList(objectAr));
			
	}

	@Override
	protected void readUserSelections() throws PaceProjectReadException {
		
		PafXStreamElementItem<PafUserSelection[]> pafXStreamElementItem = new PafXStreamElementItem<PafUserSelection[]>(getProjectInput() + PafBaseConstants.FN_UserSelections);
		
		PafUserSelection[] objectAr = pafXStreamElementItem.read();
			
		setUserSelections((objectAr == null) ? null : Arrays.asList(objectAr));
			
	}

	@Override
	protected void readVersions() throws PaceProjectReadException {

		PafXStreamElementItem<VersionDef[]> pafXStreamElementItem = new PafXStreamElementItem<VersionDef[]>(getProjectInput() + PafBaseConstants.FN_VersionMetaData);
		
		VersionDef[] objectAr = pafXStreamElementItem.read();
			
		setVersions((objectAr == null) ? null : Arrays.asList(objectAr));
		
	}

	@Override
	protected void readViewGroups() throws PaceProjectReadException {

		if (upgradeProject) {

			new PafViewGroupsMigrationAction(this).run();

		}
		
		PafXStreamElementItem<Map<String, PafViewGroup>> pafXStreamElementItem = new PafXStreamElementItem<Map<String, PafViewGroup>>(getProjectInput() + PafBaseConstants.FN_ViewGroups);
		
		Map<String, PafViewGroup> objectMap = pafXStreamElementItem.read();
						
		setViewGroups(objectMap);
			
	}

	@Override
	protected void readViewSections() throws PaceProjectReadException {

		// if upgrade project project is true, upgrade project using this action
		if (upgradeProject) {

			//1st split view sections
			new PafViewSectionsSeparationMigrationAction(this).run();
			
			//2nd copy border value to dataBorder
			new PafViewSectionBorderMigration(this).run();
					

		}
		
		List<PafViewSection> viewSectionList = new ArrayList<PafViewSection>();
		
		// get ref to data folder
		File pafViewsDirectory = new File(getProjectInput() + File.separator
				+ PafBaseConstants.DN_ViewSectionsFldr);

		// if data folder exists
		if (pafViewsDirectory != null && pafViewsDirectory.isDirectory()) {

			// for each data file in data folder
			for (File dataFile : pafViewsDirectory.listFiles()) {

				//if a file and ends with xml
				if ( dataFile.isFile() && dataFile.toString().endsWith(PafBaseConstants.XML_EXT)) {
														
					PafXStreamElementItem<PafViewSection> pafXStreamElementItem = new PafXStreamElementItem<PafViewSection>(dataFile.getAbsolutePath());
										
					PafViewSection pafViewSection = pafXStreamElementItem.read();
					
					if ( pafViewSection != null ) {
						
						viewSectionList.add(pafViewSection);
						
					}
					
				}

			}

		}
		
		logger.info("Successfully read " + viewSectionList.size() + " view section files.");
				
		setViewSections(viewSectionList);
		
	}

	@Override
	protected void readViews() throws PaceProjectReadException {

		// if upgrade project project is true, upgrade project using this action
		if (upgradeProject) {

			new PafViewsSeparationMigrationAction(this).run();
			//TTN 900
			new PafViewPrintStylesMigrationAction(this).run();

		}
		
		// create empty list
		List<PafView> pafViewList = new ArrayList<PafView>();
		
		// get ref to data folder
		File pafViewsDirectory = new File(getProjectInput() + File.separator
				+ PafBaseConstants.DN_ViewsFldr);

		// if data folder exists
		if (pafViewsDirectory != null && pafViewsDirectory.isDirectory()) {

			logger.info("About to read " + pafViewsDirectory.list().length + " view files.");
			
			// for each data file in data folder
			for (File dataFile : pafViewsDirectory.listFiles()) {

				//if a file and ends with xml
				if ( dataFile.isFile() && dataFile.toString().endsWith(PafBaseConstants.XML_EXT)) {
														
					PafXStreamElementItem<PafView> pafXStreamElementItem = new PafXStreamElementItem<PafView>(dataFile.getAbsolutePath());
										
					PafView pafView = pafXStreamElementItem.read();
					
					if ( pafView != null ) {
						
						pafViewList.add(pafView);
						
					}
					
				}

			}

		}
		
		logger.info("Successfully read " + pafViewList.size() + " view files.");
		
		setViews(pafViewList);
		
		
	}

	//TTN 900 - Added by Iris
	@Override
	protected void readPrintStyles() throws PaceProjectReadException {
		//if auto convert project, create at least one default print style
		if ( upgradeProject ) {
			new PrintStylesMigrationAction(this).run();
		}

		PafXStreamElementItem<PrintStyles> pafXStreamElementItem 
			= new PafXStreamElementItem<PrintStyles>(getProjectInput() + PafBaseConstants.FN_PrintStyles);
		PrintStyles pp = null;
		try {
			pp = pafXStreamElementItem.read();
		} catch ( PaceProjectReadException e ) {
			throw new PaceProjectReadException(getProjectInput() + PafBaseConstants.FN_PrintStyles, e.getMessage());
		}
		setPrintStyles(pp==null?null:pp.getPrintStyles());
				
	}

	@Override
	protected void writeApplicationDefinitions() {

		List<PafApplicationDef> list = getApplicationDefinitions();
									
		PafXStreamElementItem<PafApplicationDef[]> pafXStreamElementItem = new PafXStreamElementItem<PafApplicationDef[]>(getProjectOutputDir() + PafBaseConstants.FN_ApplicationMetaData);
			
		pafXStreamElementItem.write(list.toArray(new PafApplicationDef[0]));				
		
	}

	@Override
	protected void writeCustomFunctions() {
		
		List<CustomFunctionDef> list = getCustomFunctions();
		
		PafXStreamElementItem<CustomFunctionDef[]> pafXStreamElementItem = new PafXStreamElementItem<CustomFunctionDef[]>(getProjectOutputDir() + PafBaseConstants.FN_CustomFunctionMetaData);
			
		pafXStreamElementItem.write(list.toArray(new CustomFunctionDef[0]));
		
	}

	@Override
	protected void writeCustomMenus() {

		List<CustomMenuDef> list = getCustomMenus();
		
		PafXStreamElementItem<CustomMenuDef[]> pafXStreamElementItem = new PafXStreamElementItem<CustomMenuDef[]>(getProjectOutputDir() + PafBaseConstants.FN_CustomMenus);
			
		pafXStreamElementItem.write(list.toArray(new CustomMenuDef[0]));
		
	}

	@Override
	protected void writeDynamicMembers() {

		List<DynamicMemberDef> list = getDynamicMembers();
		
		PafXStreamElementItem<DynamicMemberDef[]> pafXStreamElementItem = new PafXStreamElementItem<DynamicMemberDef[]>(getProjectOutputDir() + PafBaseConstants.FN_DynamicMembers);
			
		pafXStreamElementItem.write(list.toArray(new DynamicMemberDef[0]));
				
		
	}

	@Override
	protected void writeGlobalStyles() {

		Map<String, PafStyle> map = getGlobalStyles();
				
		PafXStreamElementItem<Map<String, PafStyle>> pafXStreamElementItem = new PafXStreamElementItem<Map<String, PafStyle>>(getProjectOutputDir() + PafBaseConstants.FN_GlobalStyleMetaData);
			
		pafXStreamElementItem.write(map);
						
	}

	@Override
	protected void writeHierarchyFormats() {

		Map<String, HierarchyFormat> map = getHierarchyFormats();
			
		PafXStreamElementItem<Map<String, HierarchyFormat>> pafXStreamElementItem = new PafXStreamElementItem<Map<String, HierarchyFormat>>(getProjectOutputDir() + PafBaseConstants.FN_HierarchyFormats);
		
		pafXStreamElementItem.write(map);
			
		
		
	}
	
	@Override
	protected void writeMeasures() {

		List<MeasureDef> list = getMeasures();
											
		PafXStreamElementItem<MeasureDef[]> pafXStreamElementItem = new PafXStreamElementItem<MeasureDef[]>(getProjectOutputDir() + PafBaseConstants.FN_MeasureMetaData);
		
		pafXStreamElementItem.write(list.toArray(new MeasureDef[0]));
			
		
		
	}

	@Override
	protected void writeMemberTags() {
		
		List<MemberTagDef> list = getMemberTags();
									
		PafXStreamElementItem<MemberTagDef[]> pafXStreamElementItem = new PafXStreamElementItem<MemberTagDef[]>(getProjectOutputDir() + PafBaseConstants.FN_MemberTagMetaData);
		
		pafXStreamElementItem.write(list.toArray(new MemberTagDef[0]));
			
		
		
	}

	@Override
	protected void writeNumericFormats() {
						
		PafXStreamElementItem<Map<String, PafNumberFormat>> pafXStreamElementItem = new PafXStreamElementItem<Map<String, PafNumberFormat>>(getProjectOutputDir() + PafBaseConstants.FN_NumericFormatsMetaData);
		pafXStreamElementItem.write(getNumericFormats());
			
				
	}

	/**
	 * 1st. Updates the project data map with new plan cycles if a ProjectElementId.ApplicationDef entry exists.
	 * 2nd. Reads the paf apps from xml, update plan cycles, then write to xml.
	 */
	@Override
	protected void writePlanCycles() {

		List<PlanCycle> planCycleList = getPlanCycles();
		
		PlanCycle[] planCycleAr = null;
		
		if ( planCycleList.size() > 0 ) {
			
			planCycleAr = planCycleList.toArray(new PlanCycle[0]);
			
		}
		
		//if project has imported app def, update with plan cycles.
		if ( projectDataMap.containsKey(ProjectElementId.ApplicationDef)) {
									
			List<PafApplicationDef> pafAppList = getApplicationDefinitions();
			
			if ( pafAppList.size() > 0 ) {
			
				pafAppList.get(0).setPlanCycles(planCycleAr);
				
			}			
			
		}
		
		PafXStreamElementItem<PafApplicationDef[]> pafXStreamElementItem = new PafXStreamElementItem<PafApplicationDef[]>(getProjectOutputDir() + PafBaseConstants.FN_ApplicationMetaData);
		
		PafApplicationDef[] pafAppDef = null;
		try {
			pafAppDef = pafXStreamElementItem.read();
		} catch (PaceProjectReadException e) {
			logger.error(e.getMessage());
		}
		
		//if app def exists and only has one item, update and write to disk
		if ( pafAppDef != null && pafAppDef.length == 1 ) {
						
			pafAppDef[0].setPlanCycles(planCycleAr);
			
			pafXStreamElementItem.write(pafAppDef);
			
		}	
		
		
	}
	
	/**
	 * 1st. Updates the project data map with new seasons if a ProjectElementId.ApplicationDef entry exists.
	 * 2nd. Reads the paf apps from xml, update seasons, then write to xml.
	 */
	@Override
	protected void writeSeasons() {

		
		List<Season> seasonList = getSeasons();
		
		SeasonList sl = new SeasonList();
		
		Set<Season> seasonSet = new HashSet<Season>();
		
		if ( seasonList.size() > 0 ) {
			
			seasonSet.addAll(seasonList);
			
		}
		
				
		sl.setSeasons(seasonSet);
		
		//if project has imported app def, update with plan cycles.
		if ( projectDataMap.containsKey(ProjectElementId.ApplicationDef)) {
									
			List<PafApplicationDef> pafAppList = getApplicationDefinitions();
			
			if ( pafAppList.size() > 0 ) {
			
				pafAppList.get(0).setSeasonList(sl);
				
			}			
			
		}
		
		PafXStreamElementItem<PafApplicationDef[]> pafXStreamElementItem = new PafXStreamElementItem<PafApplicationDef[]>(getProjectOutputDir() + PafBaseConstants.FN_ApplicationMetaData);
		
		PafApplicationDef[] pafAppDef = null;
		try {
			pafAppDef = pafXStreamElementItem.read();
		} catch (PaceProjectReadException e) {
			logger.error(e.getMessage());
		}
		
		//if app def exists and only has one item, update and write to disk
		if ( pafAppDef != null && pafAppDef.length == 1 ) {
						
			pafAppDef[0].setSeasonList(sl);
			
			pafXStreamElementItem.write(pafAppDef);
			
		}	
		
	}

	@Override
	protected void writeRoleConfigurations() {

		List<PafPlannerConfig> list = getRoleConfigurations();
		
		PafXStreamElementItem<PafPlannerConfig[]> pafXStreamElementItem = new PafXStreamElementItem<PafPlannerConfig[]>(getProjectOutputDir() + PafBaseConstants.FN_PlannerConfigs);
		
		pafXStreamElementItem.write(list.toArray(new PafPlannerConfig[0]));
		
	}

	@Override
	protected void writeRoles() {

		List<PafPlannerRole> list = getRoles();
		
		PafXStreamElementItem<PafPlannerRole[]> pafXStreamElementItem = new PafXStreamElementItem<PafPlannerRole[]>(getProjectOutputDir() + PafBaseConstants.FN_RoleMetaData);
		
		pafXStreamElementItem.write(list.toArray(new PafPlannerRole[0]));
		
	}

	@Override
	protected void writeRoundingRules() {

		List<RoundingRule> list = getRoundingRules();
		
		PafXStreamElementItem<RoundingRule[]> pafXStreamElementItem = new PafXStreamElementItem<RoundingRule[]>(getProjectOutputDir() + PafBaseConstants.FN_RoundingRules);
		
		pafXStreamElementItem.write(list.toArray(new RoundingRule[0]));
		
	}

	@Override
	protected void writeRuleSets() {

		Map<String, RuleSet> ruleSetMap = getRuleSets();
		
		File pafRuleSetsDirectory = new File(getProjectOutputDir() + File.separator
				+ PafBaseConstants.DN_RuleSetsFldr);

		if (!pafRuleSetsDirectory.exists()) {
			
			boolean dirCreated = pafRuleSetsDirectory.mkdir();
			
			if ( ! dirCreated ) {
				
				logger.error("Directory " + pafRuleSetsDirectory.toString() + " could not be created.");
				
			}

		} else {

			if ( ! updateOnly ) {
				FileUtils.deleteFilesInDir(pafRuleSetsDirectory, false);
			} else {
				logger.info("Not deleting all rule sets only updating current set");
			}

		}

		if ( pafRuleSetsDirectory.isDirectory() ) {
			
			String ruleSetDir = pafRuleSetsDirectory.toString()+ File.separator; 
			
			// loop over view sections and write each out to its own
			// filename
			for (RuleSet ruleSet : ruleSetMap.values()) {
											
				PafXStreamElementItem<RuleSet> pafXStreamElementItem = new PafXStreamElementItem<RuleSet>(ruleSetDir + ruleSet.getName() + PafBaseConstants.XML_EXT);
				
				pafXStreamElementItem.write(ruleSet);
				
			}
			
			
		}

		
	}

	@Override
	protected void writeUserMemberLists() {

		UserMemberLists uml = getUserMemberLists();
		
		PafXStreamElementItem<UserMemberLists> pafXStreamElementItem = new PafXStreamElementItem<UserMemberLists> (getProjectOutputDir() + PafBaseConstants.FN_UserMemberLists);
		
		pafXStreamElementItem.write(uml);
		
	}	
	
	@Override
	protected void writeUserSecurity() {

		List<PafUserSecurity> list = getUserSecurity();
		
		PafXStreamElementItem<PafUserSecurity[]> pafXStreamElementItem = new PafXStreamElementItem<PafUserSecurity[]>(getProjectOutputDir() + PafBaseConstants.FN_SecurityMetaData);
		
		pafXStreamElementItem.write(list.toArray(new PafUserSecurity[0]));
		
	}

	@Override
	protected void writeUserSelections() {

		List<PafUserSelection> list = getUserSelections();
		
		PafXStreamElementItem<PafUserSelection[]> pafXStreamElementItem = new PafXStreamElementItem<PafUserSelection[]>(getProjectOutputDir() + PafBaseConstants.FN_UserSelections);
		
		pafXStreamElementItem.write(list.toArray(new PafUserSelection[0]));
		
	}

	@Override
	protected void writeVersions() {

		List<VersionDef> list = getVersions();
		
		PafXStreamElementItem<VersionDef[]> pafXStreamElementItem = new PafXStreamElementItem<VersionDef[]>(getProjectOutputDir() + PafBaseConstants.FN_VersionMetaData);
		
		pafXStreamElementItem.write(list.toArray(new VersionDef[0]));
		
	}

	@Override
	protected void writeViewGroups() {

		PafXStreamElementItem<Map<String, PafViewGroup>> pafXStreamElementItem = new PafXStreamElementItem<Map<String, PafViewGroup>>(getProjectOutputDir() + PafBaseConstants.FN_ViewGroups);
		pafXStreamElementItem.write(getViewGroups());	
		
	}

	@Override
	protected void writeViewSections() {

		//view section dir
		File pafViewSectionsDirectory = new File(getProjectOutputDir() + File.separator
				+ PafBaseConstants.DN_ViewSectionsFldr);

		//if the dir doesn't exists, create dir, otherwise delete all files in dir
		if ( ! pafViewSectionsDirectory.exists()) {

			boolean dirCreated = pafViewSectionsDirectory.mkdir();
			
			if ( ! dirCreated ) {
			
				logger.error("Directory " + pafViewSectionsDirectory.getAbsolutePath() + " was not created.");
				
			} 

		} else {
			
			if( ! updateOnly ){
				FileUtils.deleteFilesInDir(pafViewSectionsDirectory, false);
			} else {
				 logger.info("Not deleting all view sections only updating current set");
			 }

		}
		
		if ( pafViewSectionsDirectory.isDirectory()) {

			List<PafViewSection> viewSectionList = getViewSections();
			
			PafXStreamElementItem<PafViewSection> pafXStreamElementItem;
			
			String viewSectionDir = pafViewSectionsDirectory.toString()	+ File.separator;
			
			// loop over view sections and write each out to its own
			// filename
			for (PafViewSection pafViewSection : viewSectionList) {

				// generated file name off of view name
				String generatedFileName = MigrateServerUtil
						.generateFileName(pafViewSection.getName())
						+ PafBaseConstants.XML_EXT;

				logger.info("Creating file " + generatedFileName);
								
				if ( pafViewSection != null) {
					
					pafXStreamElementItem = new PafXStreamElementItem<PafViewSection>(viewSectionDir + generatedFileName);
					pafXStreamElementItem.write(pafViewSection);
					
				}				

			}

		}

	}
	

	@Override
	protected void writeViews() {

		//view section dir
		File pafViewsDirectory = new File(getProjectOutputDir() + File.separator
				+ PafBaseConstants.DN_ViewsFldr);

		//if the dir doesn't exists, create dir, otherwise delete all files in dir
		if ( ! pafViewsDirectory.exists()) {

			boolean dirCreated = pafViewsDirectory.mkdir();
			
			if ( ! dirCreated ) {
			
				logger.error("Directory " + pafViewsDirectory.getAbsolutePath() + " was not created.");
				
			}
				

		} else {
			
			 if( ! updateOnly ){
				FileUtils.deleteFilesInDir(pafViewsDirectory, false);
			 } else {
				 logger.info("Not deleting all views only updating current set");
			 }

		}
		
		if ( pafViewsDirectory.isDirectory()) {

			List<PafView> viewList = getViews();
			
			PafXStreamElementItem<PafView> pafXStreamElementItem;
			
			String viewDir = pafViewsDirectory.toString()	+ File.separator;
			
			// loop over view sections and write each out to its own
			// filename
			for (PafView pafView : viewList) {

				// generated file name off of view name
				String generatedFileName = MigrateServerUtil
						.generateFileName(pafView.getName())
						+ PafBaseConstants.XML_EXT;

				logger.info("Creating file " + generatedFileName);
								
				if ( pafView != null) {
					
					pafXStreamElementItem = new PafXStreamElementItem<PafView>(viewDir + generatedFileName);
					pafXStreamElementItem.write(pafView);
					
				}				

			}

		}
		
	}
	//TTN 900 - Added by Iris
	@Override
	protected void writePrintStyles() {
		Map<String, PrintStyle> map = getPrintStyles();
		PrintStyles ps = new PrintStyles();
		ps.setPrintStyles(map);
		PafXStreamElementItem<PrintStyles> pafXStreamElementItem = new PafXStreamElementItem<PrintStyles>(getProjectOutputDir() + PafBaseConstants.FN_PrintStyles);
		pafXStreamElementItem.write(ps);
	}

	
	
	/**
	 * @return the updateOnly
	 */
	public boolean isUpdateOnly() {
		return updateOnly;
	}

	/**
	 * @param updateOnly the updateOnly to set
	 */
	public void setUpdateOnly(boolean updateOnly) {
		this.updateOnly = updateOnly;
	}

	/**
	 * @return the upgradeProject
	 */
	public boolean isUpgradeProject() {
		return upgradeProject;
	}

	/**
	 * @param upgradeProject the upgradeProject to set
	 */
	public void setUpgradeProject(boolean upgradeProject) {
		this.upgradeProject = upgradeProject;
	}
		

	
}
