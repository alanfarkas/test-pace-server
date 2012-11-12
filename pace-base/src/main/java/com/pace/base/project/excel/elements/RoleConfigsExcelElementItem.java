/*
 *	File: @(#)RoleConfigsExcelElementItem.java 	Package: com.pace.base.project.excel.elements 	Project: Paf Base Libraries
 *	Created: Jan 12, 2010  		By: jmilliron
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
package com.pace.base.project.excel.elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Workbook;

import com.pace.base.PafException;
import com.pace.base.app.*;
import com.pace.base.comm.CustomMenuDef;
import com.pace.base.comm.DataFilterSpec;
import com.pace.base.comm.PafPlannerConfig;
import com.pace.base.comm.UserFilterSpec;
import com.pace.base.project.*;
import com.pace.base.project.excel.PafExcelInput;
import com.pace.base.project.excel.PafExcelRow;
import com.pace.base.project.excel.PafExcelValueObject;
import com.pace.base.project.excel.PafExcelValueObjectUtil;
import com.pace.base.project.utils.PafExcelUtil;
import com.pace.base.rules.RuleSet;
import com.pace.base.utility.StringUtils;
import com.pace.base.view.PafView;
import com.pace.base.view.PafViewGroup;

/**
 * Reads/writes role configurations from/to an Excel 2007 workbook.
 *
 * @author jmilliron
 * @version	1.00
 *
 */
public class RoleConfigsExcelElementItem<T extends List<PafPlannerConfig>> extends PafExcelElementItem<T> {
	
	private static final String DIM_MEMBER_SEPERATOR = "=";

	/**
	 * Creates an excel element item.
	 * 
	 * @param workbook workbook used for read/write
	 */
	public RoleConfigsExcelElementItem(Workbook workbook) {
		super(workbook);
	}
	
	/**
	 * Creates an excel element item. Mainly used for writing role configs.
	 * 
	 * @param workbook workbook used for read/write
	 * @param isCellReferencingEnabled true if cell referencing is enabled
	 */
	public RoleConfigsExcelElementItem(Workbook workbook,
			boolean isCellReferencingEnabled) {
		super(workbook, isCellReferencingEnabled);
	}

	@Override
	protected void createHeaderListMapEntries() {

		getHeaderListMap().put(getSheetName(), Arrays.asList("role name", "plan cycle name", "default eval on working version", "save working version on uow load", "default rule set name", "rule set names (pipe delimited)", "read only measures (pipe delimited)", "version filters (pipe delimited)", "enable role filter", "enable multi-select role filter", "role filter (pipe delimited)", "view / view group names (pipe delimited)", "visible menus (pipe delimited)", "auto save menus (pipe delimited)", "replicate enabled", "replicate all enabled",  "lift enabled", "lift all enabled", "allow suppress invalid intersections", "suppress invalid intersection entrys (pipe delimited)", "large cell limit", "max cell limit"));

	}

	@Override
	public ProjectElementId getProjectElementId() {
		return ProjectElementId.RoleConfigs;
	}

	@SuppressWarnings("unchecked")
	@Override
	protected T readExcelSheet() throws PaceProjectReadException, PafException {
		
		PafExcelInput input = new PafExcelInput.Builder(getWorkbook(), getSheetName(), getHeaderListMap().get(getSheetName()).size())
			.headerListMap(getHeaderListMap())
			.excludeHeaderRows(true)
			.excludeEmptyRows(true)
			.sheetRequired(true)
			.endOfSheetIdnt(ExcelPaceProjectConstants.END_OF_SHEET_IDENT)
			.build();

		List<PafExcelRow> excelRowList = PafExcelUtil.readExcelSheet(input);
		
		List<PafPlannerConfig> roleConfigList = new ArrayList<PafPlannerConfig>();
				
		PafPlannerConfig roleConfig = null;
		
		for ( PafExcelRow row : excelRowList ) {
		
			roleConfig = new PafPlannerConfig();
			
			for ( Integer rowIndex : row.getRowItemOrderedIndexes()) {
			
				List<PafExcelValueObject> rowItemList = row.getRowItem(rowIndex);
				
				PafExcelValueObject firstValueObject = rowItemList.get(0);
			
				try {
				
					switch (rowIndex) {
					
						//role name
						case 0:											
						
							if ( firstValueObject.isBlank()) {
								
								roleConfig.setRole("");
								
							} else {
								
								roleConfig.setRole(PafExcelUtil.getString(getProjectElementId(), firstValueObject));
								
							}
							
							break;
						
						//plan cycle name
						case 1:						
									
							if ( firstValueObject.isBlank()) {
								
								roleConfig.setCycle("");
								
							} else {
								
								roleConfig.setCycle(PafExcelUtil.getString(getProjectElementId(), firstValueObject));
								
							}
								
							break;
							
						//is default eval enabled on working version
						case 2:											
						
							roleConfig.setDefaultEvalEnabledWorkingVersion(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject, true));
							break;
							
						//is save working version on uow load
						case 3:											
						
							roleConfig.setMdbSaveWorkingVersionOnUowLoad(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject, true));
							break;							
						
						//default rule set name
						case 4:						
							
							//if blank, add empty string
							if ( firstValueObject.isBlank()) {
								
								roleConfig.setDefaultRulesetName("");
								
							} else {
							
								roleConfig.setDefaultRulesetName(PafExcelUtil.getString(getProjectElementId(), firstValueObject));
								
							}
							
							break;
							
						//rule set names
						case 5:						
									
							//if blank, add empty array
							if ( firstValueObject.isBlank()) {
							
								roleConfig.setRuleSetNames(new String[0]);
								
							} else {
							
								roleConfig.setRuleSetNames(PafExcelUtil.getStringArFromDelimValueObject(getProjectElementId(), firstValueObject));
								
							}
								
							break;							
						
						case 6: 
							
							roleConfig.setReadOnlyMeasures(PafExcelUtil.getStringArFromDelimValueObject(getProjectElementId(), firstValueObject));
							break;
							
						//version filter
						case 7:
							
							roleConfig.setVersionFilter(PafExcelUtil.getStringArFromDelimValueObject(getProjectElementId(), firstValueObject));
							break;
							
						//enable role filter
						case 8:
							
							roleConfig.setIsUserFilteredUow(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject));							
							break;		
						
						//enable multi-select role filter
						case 9:
							
							roleConfig.setIsUserFilteredMultiSelect(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject));							
							break;		
								
						//role filter
						case 10:							
							
							String[] roleFilters = PafExcelUtil.getStringArFromDelimValueObject(getProjectElementId(), firstValueObject);
							
							if ( roleFilters != null ) {
							
								UserFilterSpec userFilterSpec = new UserFilterSpec();
								
								userFilterSpec.setAttrDimNames(roleFilters);
																	
								roleConfig.setUserFilterSpec(userFilterSpec);
								
							}						
							
							break;
							
						//view & view group names
						case 11:						

							roleConfig.setViewTreeItemNames(PafExcelUtil.getStringArFromDelimValueObject(getProjectElementId(), firstValueObject, true));
							break;

						//visible menus
						case 12:
													
							roleConfig.setMenuItemNames(PafExcelUtil.getStringArFromDelimValueObject(getProjectElementId(), firstValueObject));
							break;
							
						//auto save menus 
						case 13:
													
							roleConfig.setAutoRunOnSaveMenuItemNames(PafExcelUtil.getStringArFromDelimValueObject(getProjectElementId(), firstValueObject));
							break;
							
						//replicate enabled
						case 14:
													
							roleConfig.setReplicateEnabled(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject));
							break;							
						
						//replicate all enabled
						case 15:
													
							roleConfig.setReplicateAllEnabled(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject));
							break;
							
							//lift enabled
						case 16:
													
							roleConfig.setLiftEnabled(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject));
							break;							
						
						//lift all enabled
						case 17:
													
							roleConfig.setLiftAllEnabled(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject));
							break;
								
						//allow suppress invalid intersection
						case 18:
													
							roleConfig.setIsDataFilteredUow(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject));
							break;
					

						//suppress invalid intersection entry
						case 19:
							
							String[] dimensionValueAr = PafExcelUtil.getStringArFromDelimValueObject(getProjectElementId(), firstValueObject);
							
							if ( dimensionValueAr != null && dimensionValueAr.length > 0 ) {
								
								DataFilterSpec dfs = new DataFilterSpec();
								
								List<PafDimSpec> dimSpectList = new ArrayList<PafDimSpec>();
								
								for (String dimensionValue : dimensionValueAr) {
									
									List<String> dimValList = StringUtils.stringToList(dimensionValue, DIM_MEMBER_SEPERATOR);
									
									//ensure 2 items
									if ( dimValList != null && dimValList.size() == 2 ) {
										
										String dim = dimValList.get(0);
										String val = dimValList.get(1);
										
										PafDimSpec pafDimSpec = new PafDimSpec();
										pafDimSpec.setDimension(dim);
										pafDimSpec.setExpressionList(new String[] { val });
										
										dimSpectList.add(pafDimSpec);					
										
									} else {
										
										throw new ExcelProjectDataErrorException(new ProjectDataError(getProjectElementId(), firstValueObject, "Invalid format.  An example would be: Measures=ACCT1|PlanType=@UOW_ROOT|Time=WK01|Version=@PLAN_VERSION|Years=@UOW_ROOT"));
										
									}
								}
								
								dfs.setDimSpec(dimSpectList.toArray(new PafDimSpec[0]));
								
								roleConfig.setDataFilterSpec(dfs);
									
							}
							
							break;
							
						//large cell limit	
						case 20: 
							
							Integer largeUowSize = PafExcelUtil.getInteger(getProjectElementId(), firstValueObject);
							
							validateUowSizeValue(firstValueObject, largeUowSize);
							
							roleConfig.setUowSizeLarge(largeUowSize);
							
							break;
							
						//max cell limit	
						case 21: 
							
							Integer maxUowSize = PafExcelUtil.getInteger(getProjectElementId(), firstValueObject);
							
							validateUowSizeValue(firstValueObject, maxUowSize);
							
							roleConfig.setUowSizeMax(maxUowSize);
							
							break;							
							
						}				
					
					
					} catch (ExcelProjectDataErrorException epdee) {
						
						addProjectDataErrorToList(epdee.getProjectDataError());
						
					}
			
			
			}
		
			roleConfigList.add(roleConfig);
		
		}
		
		return (T) roleConfigList;
		
	}

	private void validateUowSizeValue(PafExcelValueObject valueObject, Integer uowSizeLimit) throws ExcelProjectDataErrorException {

		if ( uowSizeLimit != null ) {

			int min = 0;
			int max = 100000000;
			
			if ( uowSizeLimit < min || uowSizeLimit > max ) {
				
				throw new ExcelProjectDataErrorException(new ProjectDataError(getProjectElementId(), valueObject, "Invalid Value: " + uowSizeLimit + ". The valid range is from " + min + " to " + max + "."));
				
			}
			
		}
		
	}

	@Override
	protected void writeExcelSheet(T t) throws PaceProjectWriteException, PafException {

		Map<ProjectElementId, Map<String, String>> dynamicRefProjectElementMap = new HashMap<ProjectElementId, Map<String, String>>();
		
		//if cell referencing is enabled, read in versions
		if ( isCellReferencingEnabled() ) {			
			
			//roles
			dynamicRefProjectElementMap.put(ProjectElementId.Roles, new RolesExcelElementItem<List<PafPlannerRole>>(getWorkbook()).getDynamicReferenceMap());
			
			//plan cycles
			dynamicRefProjectElementMap.put(ProjectElementId.PlanCycles, new PlanCyclesExcelElementItem<List<PlanCycle>>(getWorkbook()).getDynamicReferenceMap());
			
			//version
			dynamicRefProjectElementMap.put(ProjectElementId.Measures, new MeasuresExcelElementItem<List<MeasureDef>>(getWorkbook()).getDynamicReferenceMap());
			
			//version
			dynamicRefProjectElementMap.put(ProjectElementId.Versions, new VersionsExcelElementItem<List<VersionDef>>(getWorkbook()).getDynamicReferenceMap());
			
			//dynamic members
			dynamicRefProjectElementMap.put(ProjectElementId.DynamicMembers, new DynamicMembersExcelElementItem<List<DynamicMemberDef>>(getWorkbook()).getDynamicReferenceMap());

			//views
			dynamicRefProjectElementMap.put(ProjectElementId.Views, new ViewsExcelElementItem<List<PafView>>(getWorkbook()).getDynamicReferenceMap());
			
			//view groups
			dynamicRefProjectElementMap.put(ProjectElementId.ViewGroups, new ViewGroupsExcelElementItem<Map<String, PafViewGroup>>(getWorkbook()).getDynamicReferenceMap());
			
			//custom menus
			dynamicRefProjectElementMap.put(ProjectElementId.CustomMenus, new CustomMenusExcelElementItem<List<CustomMenuDef>>(getWorkbook()).getDynamicReferenceMap());
						
			//rule sets			
			dynamicRefProjectElementMap.put(ProjectElementId.RuleSets, new RuleSetsExcelElementItem<Map<String, RuleSet>>(getWorkbook()).getDynamicReferenceMap());
			
		}
						
		PafExcelInput input = new PafExcelInput.Builder(getWorkbook(), getSheetName(), getHeaderListMap().get(getSheetName()).size())
			//.excludeDefaultValuesOnWrite(true)
			.endOfSheetIdnt(ExcelPaceProjectConstants.END_OF_SHEET_IDENT)
			.build();
		
		
		List<PafPlannerConfig> roleConfigList = t;
		
		List<PafExcelRow> excelRowList = new ArrayList<PafExcelRow>();

		//create and add header to list
		excelRowList.add(PafExcelUtil.createHeaderRow(getHeaderListMap().get(getSheetName())));
						
		if ( roleConfigList != null ) {
			
			List<PafExcelValueObject> valueObjectList = null;
			
			for ( PafPlannerConfig plannerConfig : roleConfigList ) {
				
				PafExcelRow excelRow = new PafExcelRow();
				
				//role name
				excelRow.addRowItem(0,  PafExcelValueObject.createFromFormulaReferenceMap(plannerConfig.getRole(), dynamicRefProjectElementMap.get(ProjectElementId.Roles)));
				
				//cycle
				excelRow.addRowItem(1, PafExcelValueObject.createFromFormulaReferenceMap(plannerConfig.getCycle(), dynamicRefProjectElementMap.get(ProjectElementId.PlanCycles)));
				
				//defaultEvalEnabledWorkingVersion
				excelRow.addRowItem(2, PafExcelValueObject.createFromBoolean(plannerConfig.isDefaultEvalEnabledWorkingVersion()));
				
				//mdbSaveWorkingVersionOnUowLoad
				excelRow.addRowItem(3, PafExcelValueObject.createFromBoolean(plannerConfig.isMdbSaveWorkingVersionOnUowLoad()));
				
				//defaultRulesetName
				excelRow.addRowItem(4, PafExcelValueObject.createFromFormulaReferenceMap(plannerConfig.getDefaultRulesetName(), dynamicRefProjectElementMap.get(ProjectElementId.RuleSets)));
								
				//ruleSetNames
				if ( plannerConfig.getRuleSetNames() != null && plannerConfig.getRuleSetNames().length > 0 ) {
												
					valueObjectList = PafExcelValueObjectUtil.createListOfDynamicReferencePafExcelValueObjects(plannerConfig.getRuleSetNames(), dynamicRefProjectElementMap.get(ProjectElementId.RuleSets));
					
					excelRow.addRowItem(5, PafExcelUtil.getDelimValueObjectFromList(valueObjectList));
				}	
				
				//read only measures
				if ( plannerConfig.getReadOnlyMeasures() != null && plannerConfig.getReadOnlyMeasures().length > 0 ) {
					
					valueObjectList = new ArrayList<PafExcelValueObject>();
					
					Map<String, String> measuresRefMap = dynamicRefProjectElementMap.get(ProjectElementId.Measures);
					
					for (String measureName : plannerConfig.getReadOnlyMeasures()) {
						
						if ( measuresRefMap != null && measuresRefMap.containsKey(measureName) ) {
							
							valueObjectList.add(PafExcelValueObject.createFromFormulaReferenceMap(measureName, measuresRefMap));
							
						} else {
							
							valueObjectList.add(PafExcelValueObject.createFromString(measureName));
							
						}
						
					}
					
					excelRow.addRowItem(6, PafExcelUtil.getDelimValueObjectFromList(valueObjectList));
					
				}
				
				//version filter
				if ( plannerConfig.getVersionFilter() != null && plannerConfig.getVersionFilter().length > 0 ) {
				
					valueObjectList = new ArrayList<PafExcelValueObject>();
					
					Map<String, String> dynamicMembersRefMap = dynamicRefProjectElementMap.get(ProjectElementId.DynamicMembers);
					Map<String, String> versionsRefMap = dynamicRefProjectElementMap.get(ProjectElementId.Versions);
					
					for ( String versionFilterItem : plannerConfig.getVersionFilter() ) {
						
						if ( dynamicMembersRefMap != null && dynamicMembersRefMap.containsKey(versionFilterItem)) {
							
							valueObjectList.add(PafExcelValueObject.createFromFormulaReferenceMap(versionFilterItem, dynamicMembersRefMap));
							
						} else if ( versionsRefMap != null && versionsRefMap.containsKey(versionFilterItem) ) {
							
							valueObjectList.add(PafExcelValueObject.createFromFormulaReferenceMap(versionFilterItem, versionsRefMap));
							
						} else {
							
							valueObjectList.add(PafExcelValueObject.createFromString(versionFilterItem));
							
						}
						
						
					}
					
					excelRow.addRowItem(7, PafExcelUtil.getDelimValueObjectFromList(valueObjectList));
					
				}	
				
				//isUserFilteredUow
				excelRow.addRowItem(8, PafExcelValueObject.createFromBoolean(plannerConfig.getIsUserFilteredUow()));
				
				//isUserFilteredMultiSelect
				excelRow.addRowItem(9, PafExcelValueObject.createFromBoolean(plannerConfig.getIsUserFilteredMultiSelect()));
				
				//user filter spec
				if ( plannerConfig.getUserFilterSpec() != null ) {
				
					excelRow.addRowItem(10, PafExcelUtil.getDelimValueObjectFromStringAr(plannerConfig.getUserFilterSpec().getAttrDimNames()));
												
				}
				
				//view tree item names
				if ( plannerConfig.getViewTreeItemNames() != null && plannerConfig.getViewTreeItemNames().length > 0 ) {
					
					valueObjectList = new ArrayList<PafExcelValueObject>();
					
					Map<String, String> dynamicViewRefMap = dynamicRefProjectElementMap.get(ProjectElementId.Views);
					Map<String, String> dynamicViewGroupRefMap = dynamicRefProjectElementMap.get(ProjectElementId.ViewGroups);
					
					for ( String viewTreeItemName : plannerConfig.getViewTreeItemNames() ) {
						
						if ( dynamicViewRefMap != null && dynamicViewRefMap.containsKey(viewTreeItemName)) {
							
							valueObjectList.add(PafExcelValueObject.createFromFormulaReferenceMap(viewTreeItemName, dynamicViewRefMap));
							
						} else if ( dynamicViewGroupRefMap != null && dynamicViewGroupRefMap.containsKey(viewTreeItemName) ) {
							
							valueObjectList.add(PafExcelValueObject.createFromFormulaReferenceMap(viewTreeItemName, dynamicViewGroupRefMap));
							
						} else {
							
							valueObjectList.add(PafExcelValueObject.createFromString(viewTreeItemName));
							
						}
						
						
					}
					
					excelRow.addRowItem(11, PafExcelUtil.getDelimValueObjectFromList(valueObjectList));
										
				}
				
				//menu item names
				if ( plannerConfig.getMenuItemNames() != null && plannerConfig.getMenuItemNames().length > 0 ) {
												
					valueObjectList = PafExcelValueObjectUtil.createListOfDynamicReferencePafExcelValueObjects(plannerConfig.getMenuItemNames(), dynamicRefProjectElementMap.get(ProjectElementId.CustomMenus));
					
					excelRow.addRowItem(12, PafExcelUtil.getDelimValueObjectFromList(valueObjectList));
					
				}	
				
				//auto run on save menu item names
				if ( plannerConfig.getAutoRunOnSaveMenuItemNames() != null && plannerConfig.getAutoRunOnSaveMenuItemNames().length > 0 ) {
												
					valueObjectList = PafExcelValueObjectUtil.createListOfDynamicReferencePafExcelValueObjects(plannerConfig.getAutoRunOnSaveMenuItemNames(), dynamicRefProjectElementMap.get(ProjectElementId.CustomMenus));
					
					excelRow.addRowItem(13, PafExcelUtil.getDelimValueObjectFromList(valueObjectList));
					
				}	
				
				//replicate enabled
				excelRow.addRowItem(14, PafExcelValueObject.createFromBoolean(plannerConfig.getReplicateEnabled()));
				
				//replicate all enabled
				excelRow.addRowItem(15, PafExcelValueObject.createFromBoolean(plannerConfig.getReplicateAllEnabled()));
				
				//lift enabled
				excelRow.addRowItem(16, PafExcelValueObject.createFromBoolean(plannerConfig.getLiftEnabled()));
				
				//lift all enabled
				excelRow.addRowItem(17, PafExcelValueObject.createFromBoolean(plannerConfig.getLiftAllEnabled()));
				//is data filtered uow
				excelRow.addRowItem(18, PafExcelValueObject.createFromBoolean(plannerConfig.getIsDataFilteredUow()));
				
				//data filter spec
				if ( plannerConfig.getDataFilterSpec() != null && plannerConfig.getDataFilterSpec().getDimSpec() != null && 
						plannerConfig.getDataFilterSpec().getDimSpec().length > 0 ) {
										
					StringBuilder strBuff = new StringBuilder();
					
					int pafDimSpecNdx = 0;
					
					PafDimSpec[] pafDimSpecAr =  plannerConfig.getDataFilterSpec().getDimSpec();
					
					for ( PafDimSpec pafDimSpec : pafDimSpecAr ) {
						
						String dimension = pafDimSpec.getDimension();
						
						String[] expressionAr = pafDimSpec.getExpressionList();
						
						if ( dimension != null && expressionAr != null && expressionAr.length > 0 ) {
							
							strBuff.append(dimension + DIM_MEMBER_SEPERATOR + expressionAr[0]);
							
							//append comma if not last item
							if ( ++pafDimSpecNdx != pafDimSpecAr.length ) {
								
								strBuff.append(ExcelPaceProjectConstants.EXCEL_STRING_FIELD_DELIM);
								
							}
							
						}
						
					}
					
					excelRow.addRowItem(19, PafExcelValueObject.createFromString(strBuff.toString()));					
					
				}
				
				//uow size large
				excelRow.addRowItem(20, PafExcelValueObject.createFromInteger(plannerConfig.getUowSizeLarge()));
								
				//uow size max				
				excelRow.addRowItem(21, PafExcelValueObject.createFromInteger(plannerConfig.getUowSizeMax()));
				
				excelRowList.add(excelRow);			
				
			}
			
		}
		
		
			
		PafExcelUtil.writeExcelSheet(input, excelRowList);
		
	}
		
}
