/*
 *	File: @(#)ExcelPaceProject.java 	Package: com.pace.base.project.alt 	Project: Paf Base Libraries
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
import org.apache.poi.ss.usermodel.Workbook;

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
import com.pace.base.project.excel.elements.ApplicationDefExcelElementItem;
import com.pace.base.project.excel.elements.CustomFunctionsExcelElementItem;
import com.pace.base.project.excel.elements.CustomMenusExcelElementItem;
import com.pace.base.project.excel.elements.DynamicMembersExcelElementItem;
import com.pace.base.project.excel.elements.GlobalStylesExcelElementItem;
import com.pace.base.project.excel.elements.HierarchyFormatsExcelElementItem;
import com.pace.base.project.excel.elements.MeasuresExcelElementItem;
import com.pace.base.project.excel.elements.MemberTagsExcelElementItem;
import com.pace.base.project.excel.elements.NumericFormatsExcelElementItem;
import com.pace.base.project.excel.elements.PlanCyclesExcelElementItem;
import com.pace.base.project.excel.elements.PrintStylesExcelElementItem;
import com.pace.base.project.excel.elements.RoleConfigsExcelElementItem;
import com.pace.base.project.excel.elements.RolesExcelElementItem;
import com.pace.base.project.excel.elements.RoundingRulesExcelElementItem;
import com.pace.base.project.excel.elements.RuleSetsExcelElementItem;
import com.pace.base.project.excel.elements.SeasonsExcelElementItem;
import com.pace.base.project.excel.elements.UserMemberListExcelElementItem;
import com.pace.base.project.excel.elements.UserSecurityExcelElementItem;
import com.pace.base.project.excel.elements.UserSelectionsExcelElementItem;
import com.pace.base.project.excel.elements.VersionsExcelElementItem;
import com.pace.base.project.excel.elements.ViewGroupsExcelElementItem;
import com.pace.base.project.excel.elements.ViewSectionsExcelElementItem;
import com.pace.base.project.excel.elements.ViewsExcelElementItem;
import com.pace.base.project.utils.PafExcelUtil;
import com.pace.base.rules.RoundingRule;
import com.pace.base.rules.RuleSet;
import com.pace.base.ui.PrintStyle;
import com.pace.base.utility.FileUtils;
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
public class ExcelPaceProject extends PaceProject {	

	private static final Logger logger = Logger.getLogger(ExcelPaceProject.class);
		
	private boolean isCellReferencingEnabled = false;
	
	private boolean addDependenciesOnSave = false;
	
	private Workbook workbook = null;
	
	private static Map<ProjectElementId, Set<ProjectElementId>> projectIdDependencyMap = new HashMap<ProjectElementId, Set<ProjectElementId>>();
	
	static {
		
		projectIdDependencyMap.put(ProjectElementId.ApplicationDef, new HashSet<ProjectElementId>(Arrays.asList(ProjectElementId.Versions)));
		projectIdDependencyMap.put(ProjectElementId.NumericFormats, new HashSet<ProjectElementId>(Arrays.asList(ProjectElementId.Versions, ProjectElementId.Measures, ProjectElementId.ViewSections)));
		projectIdDependencyMap.put(ProjectElementId.Versions, new HashSet<ProjectElementId>(Arrays.asList(ProjectElementId.PlanCycles)));
		projectIdDependencyMap.put(ProjectElementId.ViewSections, new HashSet<ProjectElementId>(Arrays.asList(ProjectElementId.Views)));
		projectIdDependencyMap.put(ProjectElementId.Views, new HashSet<ProjectElementId>(Arrays.asList(ProjectElementId.ViewGroups)));
		projectIdDependencyMap.put(ProjectElementId.ViewGroups, new HashSet<ProjectElementId>(Arrays.asList(ProjectElementId.RoleConfigs)));
		projectIdDependencyMap.put(ProjectElementId.PlanCycles, new HashSet<ProjectElementId>(Arrays.asList(ProjectElementId.Seasons, ProjectElementId.RoleConfigs)));
		projectIdDependencyMap.put(ProjectElementId.Seasons, new HashSet<ProjectElementId>(Arrays.asList(ProjectElementId.Roles)));
		projectIdDependencyMap.put(ProjectElementId.Roles, new HashSet<ProjectElementId>(Arrays.asList(ProjectElementId.RoleConfigs)));
		projectIdDependencyMap.put(ProjectElementId.RoleConfigs, new HashSet<ProjectElementId>(Arrays.asList(ProjectElementId.ViewGroups, ProjectElementId.RuleSets, ProjectElementId.Versions, ProjectElementId.DynamicMembers, ProjectElementId.Views, ProjectElementId.ViewGroups, ProjectElementId.CustomFunctions, ProjectElementId.CustomMenus, ProjectElementId.Measures)));
		projectIdDependencyMap.put(ProjectElementId.GlobalStyles, new HashSet<ProjectElementId>(Arrays.asList(ProjectElementId.HierarchyFormats)));
		projectIdDependencyMap.put(ProjectElementId.DynamicMembers, new HashSet<ProjectElementId>(Arrays.asList(ProjectElementId.ApplicationDef, ProjectElementId.RoleConfigs)));
	}
	
	/**
	 * @param projectDataMap
	 */
	protected ExcelPaceProject(Map<ProjectElementId, Object> projectDataMap) {
		super(projectDataMap);
	}
	
	/**
	 * @param fullExcelWorkbookLocation
	 * @throws PafException
	 */
	public ExcelPaceProject(String fullExcelWorkbookLocation) throws InvalidPaceProjectInputException, PaceProjectCreationException {
		this(fullExcelWorkbookLocation, null);
	}	
	
	/**
	 * @param fullExcelWorkbookLocation
	 * @param filterSet
	 * @throws PafException
	 */
	public ExcelPaceProject(String fullExcelWorkbookLocation, Set<ProjectElementId> filterSet)
			throws InvalidPaceProjectInputException, PaceProjectCreationException {
		super(fullExcelWorkbookLocation, filterSet);
		
		validateInput(fullExcelWorkbookLocation);
		
		setWorkbook(fullExcelWorkbookLocation);
		
		read(filterSet);
		
		if ( getProjectErrorMap().size() > 0 ) {
			
			throw new PaceProjectCreationException(getProjectErrorMap());
			
		}
		
	}
	
	private void setWorkbook(String fullExcelWorkbookLocation) throws PaceProjectCreationException {

		try {
			workbook = PafExcelUtil.readWorkbook(fullExcelWorkbookLocation);
		} catch (PafException e) {
			throw new PaceProjectCreationException("Could not open workbook: " + e.getMessage());
		}
		
	}

	private void validateInput(String fullExcelWorkbookLocation) throws InvalidPaceProjectInputException {

		//validate input
		if ( fullExcelWorkbookLocation == null ||
				! ( fullExcelWorkbookLocation.endsWith(PafBaseConstants.XLSX_EXT) || fullExcelWorkbookLocation.endsWith(PafBaseConstants.XLSM_EXT))) {
			
			throw new InvalidPaceProjectInputException("Workbook location can not be null and must end with " + PafBaseConstants.XLSX_EXT + " or " + PafBaseConstants.XLSX_EXT);
			
		}
		
	}

	@Override
	protected void write(String writeFile, Set<ProjectElementId> filterSet) throws ProjectSaveException {
				
		logger.info("Writing Excel workbook to: " + writeFile);
	
		//try to validate this is a xlsx file.
		try {
			
			validateInput(writeFile);
			
		} catch (InvalidPaceProjectInputException e) {
			
			logger.error(e.getMessage());
			
			e.printStackTrace();
			
			throw new ProjectSaveException(e.getMessage());
			
		}

		String currentProjectInput = getProjectInput();
		
		boolean isSameWorkbook = false;
		
		if ( currentProjectInput != null ) {
			
			isSameWorkbook = writeFile.equals(currentProjectInput);
			
		}
		
		Workbook currentWorkbook = null;
		
		if ( ! isSameWorkbook ) {
		
			currentWorkbook = getWorkbook();
			
			try {
				
				setWorkbook(writeFile);
				
				setProjectInput(writeFile);
				
			} catch (PaceProjectCreationException e) {
				
				logger.error(e.getMessage());
				
				e.printStackTrace();
				
				throw new ProjectSaveException(e.getMessage());
			}
			
		}
		
		write(filterSet);
		
		if ( ! isSameWorkbook ) {
		
			setProjectInput(currentProjectInput);
			setWorkbook(currentWorkbook);
			
		}
			
	}
	
	
	
	/* (non-Javadoc)
	 * @see com.pace.base.project.PaceProject#write(java.util.Set)
	 */
	@Override
	protected void write(Set<ProjectElementId> filterSet) throws ProjectSaveException {

		//verify workbook is not already open
		if ( FileUtils.isFileLocked(new File(getProjectInput())) ) {
			
			throw new ProjectSaveException("File " + getProjectInput() + " is currently open in another program.  Please close and try again.");
			
		}
		
		logger.debug("Add Dependencies On? " + addDependenciesOnSave);
		
		if ( filterSet != null && addDependenciesOnSave ) {
					
			logger.debug("Filter Set Before Dependencies: " + filterSet);
			
			filterSet = getProjectIdSetDependencies(new HashSet<ProjectElementId>(filterSet));
			
			logger.debug("Filter Set After Dependencies: " + filterSet);
			
		}
		
		super.write(filterSet);
		
		try {
			
			//write out workbook
			PafExcelUtil.writeWorkbook(getWorkbook(), getProjectInput());
			
			//re-read workbook and save instance
			setWorkbook(PafExcelUtil.readWorkbook(getProjectInput()));
			
		} catch (PafException e) {
			
			logger.error(e.getMessage());
			
			e.printStackTrace();
			
			throw new ProjectSaveException(e.getMessage());
						
		} 
		
		
	}

	/* (non-Javadoc)
	 * @see com.pace.base.project.PaceProject#getProjectElementIdListOrder()
	 */
	@Override
	protected List<ProjectElementId> getProjectElementIdListOrder() {
		
		//Pseudo code
		//1. get list from super.getProjectElementIdListOrder
		//2. create new list by specifying ordered elements
		//3. remove items in new list from items in super.x list
		//4. append items in super.x list (remaining elements) to new list
		//5. return new list.		
		List<ProjectElementId> newProjectOrderList = new ArrayList<ProjectElementId>();
		
		//have app def as 1st tab
		newProjectOrderList.add(ProjectElementId.ApplicationDef);
		
		//dependency order
		newProjectOrderList.add(ProjectElementId.NumericFormats);
		newProjectOrderList.add(ProjectElementId.GlobalStyles);
		newProjectOrderList.add(ProjectElementId.Versions);
		newProjectOrderList.add(ProjectElementId.Measures);
		newProjectOrderList.add(ProjectElementId.HierarchyFormats);
		newProjectOrderList.add(ProjectElementId.PlanCycles);
		newProjectOrderList.add(ProjectElementId.Seasons);
		newProjectOrderList.add(ProjectElementId.Roles);
		newProjectOrderList.add(ProjectElementId.UserSecurity);
		newProjectOrderList.add(ProjectElementId.DynamicMembers);
		newProjectOrderList.add(ProjectElementId.ViewSections);
		newProjectOrderList.add(ProjectElementId.Views);
		newProjectOrderList.add(ProjectElementId.ViewGroups);
		newProjectOrderList.add(ProjectElementId.CustomMenus);
		newProjectOrderList.add(ProjectElementId.RuleSets);
		newProjectOrderList.add(ProjectElementId.RoleConfigs);
		//TTN 900 
		newProjectOrderList.add(ProjectElementId.PrintStyles);

		List<ProjectElementId> defaultProjectOrderList = super.getProjectElementIdListOrder();
		
		//add any other project tabs not needing order
		if ( defaultProjectOrderList != null ) {
			
			defaultProjectOrderList.removeAll(newProjectOrderList);
			newProjectOrderList.addAll(defaultProjectOrderList);
			
		}	
		
		return newProjectOrderList;
	}

	/**
	 * @return the cellReferencingEnabled
	 */
	public boolean isCellReferencingEnabled() {
		return isCellReferencingEnabled;
	}

	/**
	 * @param cellReferencingEnabled the cellReferencingEnabled to set
	 */
	public void setCellReferencingEnabled(boolean cellReferencingEnabled) {
		this.isCellReferencingEnabled = cellReferencingEnabled;
	}

	@Override
	protected void readApplicationDefinitions() {

		logger.debug("Reading application def.");
		
		ApplicationDefExcelElementItem<List<PafApplicationDef>> excelElementItem = new ApplicationDefExcelElementItem<List<PafApplicationDef>>(getWorkbook());
		
		try {
			
			List<PafApplicationDef> pafAppList = excelElementItem.read(); 
			
			if ( pafAppList != null && pafAppList.size() == 1 ) {
				
				PafApplicationDef pafApp = pafAppList.remove(0);
				
				List<PlanCycle> planCycleList = getPlanCycles();
				
				if ( planCycleList != null && planCycleList.size() > 0 ) {
					
					pafApp.setPlanCycles(planCycleList.toArray(new PlanCycle[0]));
					
				}
				
				List<Season> seasonList = getSeasons();
				
				if ( seasonList != null && seasonList.size() > 0 ) {
					
					SeasonList seasons = new SeasonList();
					
					seasons.setSeasons(new HashSet<Season>(seasonList));
				
					pafApp.setSeasonList(seasons);
					
				}				
				
				pafAppList.add(pafApp);
				
			}
			
			setApplicationDefinitions(pafAppList);
			
		} catch (PaceProjectReadException e) {

			addErrorsToProjectCreationMap(excelElementItem.getProjectDataErrorList());
			
		}		
		
	}

	@Override
	protected void readCustomFunctions() {
		
		CustomFunctionsExcelElementItem<List<CustomFunctionDef>> excelElementItem = new CustomFunctionsExcelElementItem<List<CustomFunctionDef>>(getWorkbook());

		try {

			setCustomFunctions(excelElementItem.read());

		} catch (PaceProjectReadException e) {

			addErrorsToProjectCreationMap(excelElementItem
					.getProjectDataErrorList());

		}
		
	}

	@Override
	protected void readCustomMenus() {

		CustomMenusExcelElementItem<List<CustomMenuDef>> excelElementItem = new CustomMenusExcelElementItem<List<CustomMenuDef>>(getWorkbook());
		
		try {
			
			setCustomMenus(excelElementItem.read());
			
		} catch (PaceProjectReadException e) {

			addErrorsToProjectCreationMap(excelElementItem.getProjectDataErrorList());
			
		}			
		
	}

	@Override
	protected void readDynamicMembers() {
		
		DynamicMembersExcelElementItem<List<DynamicMemberDef>> excelElementItem = new DynamicMembersExcelElementItem<List<DynamicMemberDef>>(getWorkbook());
		
		try {
			
			setDynamicMembers(excelElementItem.read());
			
		} catch (PaceProjectReadException e) {

			addErrorsToProjectCreationMap(excelElementItem.getProjectDataErrorList());
			
		}		
		
	}

	@Override
	protected void readGlobalStyles() {

		logger.debug("Reading global styles.");
				
		GlobalStylesExcelElementItem<Map<String,PafStyle>> excelElementItem = new GlobalStylesExcelElementItem<Map<String,PafStyle>>(getWorkbook());
		
		try {
			
			setGlobalStyles(excelElementItem.read());
			
		} catch (PaceProjectReadException e) {

			addErrorsToProjectCreationMap(excelElementItem.getProjectDataErrorList());
			
		}		
	}

	@Override
	protected void readHierarchyFormats() {
				
		logger.debug("Reading hierarchy formats.");

		HierarchyFormatsExcelElementItem<Map<String,HierarchyFormat>> excelElementItem = new HierarchyFormatsExcelElementItem<Map<String,HierarchyFormat>>(getWorkbook());
		
		try {
			
			setHierarchyFormats(excelElementItem.read());
			
		} catch (PaceProjectReadException e) {

			addErrorsToProjectCreationMap(excelElementItem.getProjectDataErrorList());
			
		}		
		
		
	}

	@Override
	protected void readMeasures() {

		logger.debug("Reading measures.");
		
		MeasuresExcelElementItem<List<MeasureDef>> excelElementItem = new MeasuresExcelElementItem<List<MeasureDef>>(getWorkbook());
		
		try {
			
			setMeasures(excelElementItem.read());
			
		} catch (PaceProjectReadException e) {

			addErrorsToProjectCreationMap(excelElementItem.getProjectDataErrorList());
			
		}		
		
	}

	@Override
	protected void readMemberTags() {

		logger.debug("Reading member tags.");
		
		MemberTagsExcelElementItem<List<MemberTagDef>> excelElementItem = new MemberTagsExcelElementItem<List<MemberTagDef>>(getWorkbook());
		
		try {
			
			setMemberTags(excelElementItem.read());
			
		} catch (PaceProjectReadException e) {

			addErrorsToProjectCreationMap(excelElementItem.getProjectDataErrorList());
			
		}		
		
	}

	@Override
	protected void readNumericFormats() {

		logger.debug("Reading numeric formats.");
		
		NumericFormatsExcelElementItem<Map<String,PafNumberFormat>> excelElementItem = new NumericFormatsExcelElementItem<Map<String,PafNumberFormat>>(getWorkbook());
		
		try {
			
			setNumericFormats(excelElementItem.read());
			
		} catch (PaceProjectReadException e) {

			addErrorsToProjectCreationMap(excelElementItem.getProjectDataErrorList());
			
		}		
		
		
	}

	@Override
	protected void readPlanCycles() {

		logger.debug("Reading plan cycles.");
		
		PlanCyclesExcelElementItem<List<PlanCycle>> excelElementItem = new PlanCyclesExcelElementItem<List<PlanCycle>>(getWorkbook());
		
		try {
			
			setPlanCycles(excelElementItem.read());
			
		} catch (PaceProjectReadException e) {

			addErrorsToProjectCreationMap(excelElementItem.getProjectDataErrorList());
			
		}		
		
	}

	@Override
	protected void readSeasons() {

		logger.debug("Reading seasons.");
		
		SeasonsExcelElementItem<List<Season>> excelElementItem = new SeasonsExcelElementItem<List<Season>>(
				getWorkbook());

		try {

			setSeasons(excelElementItem.read());

		} catch (PaceProjectReadException e) {

			addErrorsToProjectCreationMap(excelElementItem
					.getProjectDataErrorList());

		}	
		
	}
	
	@Override
	protected void readRoleConfigurations() {

		logger.debug("Reading role configs.");
		
		RoleConfigsExcelElementItem<List<PafPlannerConfig>> excelElementItem = new RoleConfigsExcelElementItem<List<PafPlannerConfig>>(
				getWorkbook());

		try {

			setRoleConfigurations(excelElementItem.read());

		} catch (PaceProjectReadException e) {

			addErrorsToProjectCreationMap(excelElementItem
					.getProjectDataErrorList());

		}	
		
	}

	@Override
	protected void readRoles() {
		
		RolesExcelElementItem<List<PafPlannerRole>> excelElementItem = new RolesExcelElementItem<List<PafPlannerRole>>(getWorkbook());
		
		try {
			
			setRoles(excelElementItem.read());
			
		} catch (PaceProjectReadException e) {

			addErrorsToProjectCreationMap(excelElementItem.getProjectDataErrorList());
			
		}		
		
	}

	@Override
	protected void readRoundingRules() {
		
		RoundingRulesExcelElementItem<List<RoundingRule>> excelElementItem = new RoundingRulesExcelElementItem<List<RoundingRule>>(getWorkbook());
		
		try {
			
			setRoundingRules(excelElementItem.read());
			
		} catch (PaceProjectReadException e) {

			addErrorsToProjectCreationMap(excelElementItem.getProjectDataErrorList());
			
		}		
		
	}

	@Override
	protected void readRuleSets() {

		logger.debug("Reading rule sets.");
		
		RuleSetsExcelElementItem<Map<String,RuleSet>> excelElementItem = new RuleSetsExcelElementItem<Map<String,RuleSet>>(getWorkbook());
		
		try {
			
			setRuleSets(excelElementItem.read());
			
		} catch (PaceProjectReadException e) {

			addErrorsToProjectCreationMap(excelElementItem.getProjectDataErrorList());
			
		}	
		
	}

	@Override
	protected void readUserSecurity() {

		logger.debug("Reading user security.");
						
		List<String> hierDims = getHierarchyDimensions();
			
		UserSecurityExcelElementItem<List<PafUserSecurity>> excelElementItem = new UserSecurityExcelElementItem<List<PafUserSecurity>>(
				getWorkbook(), hierDims);

		try {

			setUserSecurity(excelElementItem.read());

		} catch (PaceProjectReadException e) {

			addErrorsToProjectCreationMap(excelElementItem
					.getProjectDataErrorList());

		}

	}
	
	@Override
	protected void readUserSelections() {
		
		logger.debug("Reading user selections.");
		
		UserSelectionsExcelElementItem<List<PafUserSelection>> excelElementItem = new UserSelectionsExcelElementItem<List<PafUserSelection>>(getWorkbook());
		
		try {
			
			setUserSelections(excelElementItem.read());
			
		} catch (PaceProjectReadException e) {

			addErrorsToProjectCreationMap(excelElementItem.getProjectDataErrorList());
			
		}		
		
	}

	@Override
	protected void readVersions() {
		
		//TODO: uncomment and refactor
		
		logger.debug("Reading versions.");
										
		VersionsExcelElementItem<List<VersionDef>> excelElementItem = new VersionsExcelElementItem<List<VersionDef>>(getWorkbook());
		
		try {
			
			setVersions(excelElementItem.read());
			
		} catch (PaceProjectReadException e) {

			addErrorsToProjectCreationMap(excelElementItem.getProjectDataErrorList());
			
		}		
		
	}
		

	@Override
	protected void readViewGroups() {

		logger.debug("Reading view groups.");
		
		ViewGroupsExcelElementItem<Map<String,PafViewGroup>> excelElementItem = new ViewGroupsExcelElementItem<Map<String,PafViewGroup>>(getWorkbook());
		
		try {
			
			setViewGroups(excelElementItem.read());
			
		} catch (PaceProjectReadException e) {

			addErrorsToProjectCreationMap(excelElementItem.getProjectDataErrorList());
			
		}		
		
	}

	@Override
	protected void readViewSections() {
		
		logger.debug("Reading view sections.");
		
		ViewSectionsExcelElementItem<List<PafViewSection>> excelElementItem = new ViewSectionsExcelElementItem<List<PafViewSection>>(getWorkbook());
		
		try {
			
			setViewSections(excelElementItem.read());
			
		} catch (PaceProjectReadException e) {
						
			addErrorsToProjectCreationMap(excelElementItem.getProjectDataErrorList());
			
		}		
		
	}

	@Override
	protected void readViews() {

		logger.debug("Reading views.");
		
		ViewsExcelElementItem<List<PafView>> excelElementItem = new ViewsExcelElementItem<List<PafView>>(getWorkbook());
		
		try {
			
			setViews(excelElementItem.read());
			
		} catch (PaceProjectReadException e) {
						
			addErrorsToProjectCreationMap(excelElementItem.getProjectDataErrorList());
			
		}		
		
	}

	@Override
	protected void readPrintStyles() throws PaceProjectReadException {
		logger.debug("Reading print styles.");
		
		PrintStylesExcelElementItem<Map<String,PrintStyle>> excelElementItem = new PrintStylesExcelElementItem<Map<String,PrintStyle>>(getWorkbook());
		
		try {
			
			setPrintStyles(excelElementItem.read());
			
		} catch (PaceProjectReadException e) {

			throw new PaceProjectReadException("Error reading Print Styles.");
			//addErrorsToProjectCreationMap(excelElementItem.getProjectDataErrorList());
			
		}		
		
	}

	@Override
	protected void writeApplicationDefinitions() throws PaceProjectWriteException {

		logger.debug("Writing application def.");
		
		ApplicationDefExcelElementItem<List<PafApplicationDef>> excelElementItem = new ApplicationDefExcelElementItem<List<PafApplicationDef>>(getWorkbook(), this.isCellReferencingEnabled);
		
		excelElementItem.write(getApplicationDefinitions());
	}

	@Override
	protected void writeCustomFunctions() throws PaceProjectWriteException {
		
		logger.debug("Writing custom menus.");
		
		CustomFunctionsExcelElementItem<List<CustomFunctionDef>> excelElementItem = new CustomFunctionsExcelElementItem<List<CustomFunctionDef>>(getWorkbook());

		excelElementItem.write(getCustomFunctions());
	}

	@Override
	protected void writeCustomMenus() throws PaceProjectWriteException {

		logger.debug("Writing custom menus.");
		
		CustomMenusExcelElementItem<List<CustomMenuDef>> excelElementItem = new CustomMenusExcelElementItem<List<CustomMenuDef>>(getWorkbook(), this.isCellReferencingEnabled);
		
		excelElementItem.write(getCustomMenus());
		
		
	}

	@Override
	protected void writeDynamicMembers() throws PaceProjectWriteException {

		DynamicMembersExcelElementItem<List<DynamicMemberDef>> excelElementItem = new DynamicMembersExcelElementItem<List<DynamicMemberDef>>(getWorkbook(), this.isCellReferencingEnabled);

		excelElementItem.write(getDynamicMembers());
		
	}

	@Override
	protected void writeGlobalStyles() throws PaceProjectWriteException {

		logger.debug("Writing numeric formats.");
		
		GlobalStylesExcelElementItem<Map<String, PafStyle>> excelElementItem = new GlobalStylesExcelElementItem<Map<String, PafStyle>>(getWorkbook());

		excelElementItem.write(getGlobalStyles());
		
		
		
	}

	@Override
	protected void writeHierarchyFormats() throws PaceProjectWriteException {
		
		logger.debug("Writing hierarchy formats.");
		
		HierarchyFormatsExcelElementItem<Map<String,HierarchyFormat>> excelElementItem = new HierarchyFormatsExcelElementItem<Map<String,HierarchyFormat>>(getWorkbook(), this.isCellReferencingEnabled);
		
		excelElementItem.write(getHierarchyFormats());
	}

	@Override
	protected void writeMeasures() throws PaceProjectWriteException {

		logger.debug("Writing measures.");
		
		MeasuresExcelElementItem<List<MeasureDef>> excelElementItem = new MeasuresExcelElementItem<List<MeasureDef>>(getWorkbook(), this.isCellReferencingEnabled);
		
		excelElementItem.write(getMeasures());
		
	}

	@Override
	protected void writeMemberTags() throws PaceProjectWriteException {

		logger.debug("Writing member tags.");
		
		MemberTagsExcelElementItem<List<MemberTagDef>> excelElementItem = new MemberTagsExcelElementItem<List<MemberTagDef>>(getWorkbook(), this.isCellReferencingEnabled);
		
		excelElementItem.write(getMemberTags());
		
	}

	@Override
	protected void writeNumericFormats() throws PaceProjectWriteException {

		logger.debug("Writing numeric formats.");
		
		NumericFormatsExcelElementItem<Map<String, PafNumberFormat>> excelElementItem = new NumericFormatsExcelElementItem<Map<String, PafNumberFormat>>(getWorkbook());

		excelElementItem.write(getNumericFormats());
		
	}

	@Override
	protected void writePlanCycles() throws PaceProjectWriteException {
		
		logger.debug("Writing plan cycles.");
						
		PlanCyclesExcelElementItem<List<PlanCycle>> excelElementItem = new PlanCyclesExcelElementItem<List<PlanCycle>>(getWorkbook(), isCellReferencingEnabled);

		excelElementItem.write(getPlanCycles());
		
	}

	@Override
	protected void writeRoleConfigurations() throws PaceProjectWriteException {

		logger.debug("Writing role configs.");
		
		RoleConfigsExcelElementItem<List<PafPlannerConfig>> excelElementItem = new RoleConfigsExcelElementItem<List<PafPlannerConfig>>(
				getWorkbook(), this.isCellReferencingEnabled);
		
		excelElementItem.write(getRoleConfigurations());
		
	}

	@Override
	protected void writeRoles() throws PaceProjectWriteException {

		logger.debug("Writing roles.");
		
		RolesExcelElementItem<List<PafPlannerRole>> excelElementItem = new RolesExcelElementItem<List<PafPlannerRole>>(getWorkbook(), this.isCellReferencingEnabled);
		
		excelElementItem.write(getRoles());
		
	}

	@Override
	protected void writeRoundingRules() throws PaceProjectWriteException {

		logger.debug("Writing rounding rules.");
		
		RoundingRulesExcelElementItem<List<RoundingRule>> excelElementItem = new RoundingRulesExcelElementItem<List<RoundingRule>>(getWorkbook(), this.isCellReferencingEnabled);

		excelElementItem.write(getRoundingRules());
		
	}

	@Override
	protected void writeRuleSets() throws PaceProjectWriteException {

		logger.debug("Writing rule sets.");
		
		RuleSetsExcelElementItem<Map<String,RuleSet>> excelElementItem = new RuleSetsExcelElementItem<Map<String,RuleSet>>(getWorkbook());
		
		excelElementItem.write(getRuleSets());
		
	}

	@Override
	protected void writeUserSecurity() throws PaceProjectWriteException {

		logger.debug("Writing user security.");
		
		List<String> hierDims = getHierarchyDimensions();
			
		UserSecurityExcelElementItem<List<PafUserSecurity>> excelElementItem = new UserSecurityExcelElementItem<List<PafUserSecurity>>(
				getWorkbook(), this.isCellReferencingEnabled, hierDims);
		
		excelElementItem.write(getUserSecurity());

		
	}

	@Override
	protected void writeUserSelections() throws PaceProjectWriteException {

		logger.debug("Writing user selections.");
		
		UserSelectionsExcelElementItem<List<PafUserSelection>> excelElementItem = new UserSelectionsExcelElementItem<List<PafUserSelection>>(getWorkbook(), this.isCellReferencingEnabled);		

		excelElementItem.write(getUserSelections());
		
	}

	@Override
	protected void writeVersions() throws PaceProjectWriteException {

		logger.debug("Writing versions.");
		
		VersionsExcelElementItem<List<VersionDef>> excelElementItem = new VersionsExcelElementItem<List<VersionDef>>(getWorkbook(), this.isCellReferencingEnabled);
		
		excelElementItem.write(getVersions());	
		
	}
	
	@Override
	protected void writeViewGroups() throws PaceProjectWriteException {

		logger.debug("Writing view groups.");
		
		ViewGroupsExcelElementItem<Map<String,PafViewGroup>> excelElementItem = new ViewGroupsExcelElementItem<Map<String,PafViewGroup>>(getWorkbook(), this.isCellReferencingEnabled);
		
		excelElementItem.write(getViewGroups());
		
		
	}

	@Override
	protected void writeViewSections() throws PaceProjectWriteException {
		
		logger.debug("Writing view sections.");
		
		ViewSectionsExcelElementItem<List<PafViewSection>> excelElementItem = new ViewSectionsExcelElementItem<List<PafViewSection>>(getWorkbook(), this.isCellReferencingEnabled);

		excelElementItem.write(getViewSections());
		
	}

	@Override
	protected void writeViews() throws PaceProjectWriteException {
		
		logger.debug("Writing views.");
		
		ViewsExcelElementItem<List<PafView>> excelElementItem = new ViewsExcelElementItem<List<PafView>>(getWorkbook(), this.isCellReferencingEnabled);

		excelElementItem.write(getViews());
		
	}


	@Override
	protected void writeSeasons() throws PaceProjectWriteException {

		logger.debug("Writing seasons.");
		
		SeasonsExcelElementItem<List<Season>> excelElementItem = new SeasonsExcelElementItem<List<Season>>(
				getWorkbook(), this.isCellReferencingEnabled);

		excelElementItem.write(getSeasons());
		
	}
	
	private List<String> getHierarchyDimensions() {

		List<String> hierDims = new ArrayList<String>();
		
		List<PafApplicationDef> pafAppList = getApplicationDefinitions();
		
		if ( pafAppList != null && pafAppList.size() > 0 ) {
			
			PafApplicationDef pafApp = pafAppList.get(0);
			
			if ( pafApp != null && pafApp.getMdbDef() != null ) {
				
				String[] hierDimAr = pafApp.getMdbDef().getHierDims();
				
				if ( hierDimAr != null ) {
					
					hierDims.addAll(Arrays.asList(hierDimAr));
					
				}
				
			}
			
		}
		
		return hierDims;
		
	}

	@Override
	protected void writePrintStyles() throws PaceProjectWriteException {
		logger.debug("Writing Print Styles.");
		
		PrintStylesExcelElementItem<Map<String, PrintStyle>> excelElementItem = new PrintStylesExcelElementItem<Map<String, PrintStyle>>(getWorkbook());
		Map<String, PrintStyle> printStyles = getPrintStyles();
		excelElementItem.write(printStyles);
	}
	/**
	 * @return the workbook
	 */
	public Workbook getWorkbook() {
		return workbook;
	}

	/**
	 * @param workbook the workbook to set
	 */
	public void setWorkbook(Workbook workbook) {
		this.workbook = workbook;
	}
	
	

	/**
	 * @return the addDependenciesOnSave
	 */
	public boolean isAddDependenciesOnSave() {
		return addDependenciesOnSave;
	}

	/**
	 * @param addDependenciesOnSave the addDependenciesOnSave to set
	 */
	public void setAddDependenciesOnSave(boolean addDependenciesOnSave) {
		this.addDependenciesOnSave = addDependenciesOnSave;
	}

	/**
	 * 
	 * Returns a set of excel project id dependencies based on a set of project ids.
	 * 
	 * For example, if a user needed dependencies of a Plan Cycle, this would return a set
	 * of the following: [ViewGroups, CustomMenus, Roles, PlanCycles, DynamicMembers, RuleSets, ApplicationDef, CustomFunctions, Versions, RoleConfigs, Seasons, Views]
	 * 
	 * Recursion is used to dynamically generate the set.  Plan Cycle has two dependencies, Seasons and Role Configs.  Seasons has dependencies 
	 * and so do Role Configs.  
	 * 
	 * @param projectIdSet project id set to be searched for dependencies
	 * @return a set of project ids that are the dependencies of the set passed in.  the items passed in will also be included in the set.
	 */
	public static Set<ProjectElementId> getProjectIdSetDependencies(Set<ProjectElementId> projectIdSet) {
		
		Set<ProjectElementId> projectIdDependencySet = new HashSet<ProjectElementId>();
		
		if ( projectIdSet != null ) {
			
			for ( ProjectElementId projectId : projectIdSet ) {
				
				projectIdDependencySet.add(projectId);
				
				if ( projectIdDependencyMap.containsKey(projectId) && projectIdDependencyMap.get(projectId).size() > 0 ) {
					
					getProjectIdSetDependencies(projectIdDependencySet, projectIdDependencyMap.get(projectId));
		
					logger.info("Dependencies for " + projectId + " : " + projectIdDependencySet);
					
				} 
				
			}
			
		}		
						
		return projectIdDependencySet;		
		
	}
	
	/**
	 * 
	 * Recursive method that builds a set of project dependencies base on the new project dependency set.
	 * 
	 * @param projectIdDependencySet  running total of dependencies
	 * @param newProjectDependencySet new project dependencies to add
	 */
	private static void getProjectIdSetDependencies(Set<ProjectElementId> projectIdDependencySet, Set<ProjectElementId> newProjectDependencySet) {		
		
		if ( projectIdDependencySet != null && newProjectDependencySet != null ) {
			
			for ( ProjectElementId projectId : newProjectDependencySet ) {				
												
				if ( projectIdDependencyMap.containsKey(projectId) && projectIdDependencyMap.get(projectId).size() > 0  ) {
					
					if ( ! projectIdDependencySet.contains(projectId) ) {
					
						projectIdDependencySet.add(projectId);
						
						getProjectIdSetDependencies(projectIdDependencySet, projectIdDependencyMap.get(projectId));
					
					}					
					
				} else {
					
					projectIdDependencySet.add(projectId);
					
				}			
															
			}
			
		}				
		
	}

	@Override
	protected void readUserMemberLists() throws PaceProjectReadException {
		logger.debug("Reading user memberlist.");
		
		UserMemberListExcelElementItem<UserMemberLists> excelElementItem = new UserMemberListExcelElementItem<UserMemberLists>(getWorkbook());
		try {
			
			setUserMemberLists((UserMemberLists)excelElementItem.read());
			
		} catch (PaceProjectReadException e) {

			throw new PaceProjectReadException("Error reading Print Styles.");
			//addErrorsToProjectCreationMap(excelElementItem.getProjectDataErrorList());
			
		}		
	}

	@Override
	protected void writeUserMemberLists() throws PaceProjectWriteException {
		logger.debug("Writing user member list.");
		
		UserMemberListExcelElementItem<UserMemberLists> excelElementItem = new UserMemberListExcelElementItem<UserMemberLists>(getWorkbook());
		UserMemberLists userMemberList = getUserMemberLists();
		excelElementItem.write(userMemberList);
		
	}

	
}
