/*
 *	File: @(#)CustomMenusExcelElementItem.java 	Package: com.pace.base.project.excel.elements 	Project: Paf Base Libraries
 *	Created: Jan 11, 2010  		By: jmilliron
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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Workbook;

import com.pace.base.PafException;
import com.pace.base.app.CustomActionDef;
import com.pace.base.app.DynamicMemberDef;
import com.pace.base.app.VersionDef;
import com.pace.base.comm.CustomMenuDef;
import com.pace.base.project.ExcelPaceProjectConstants;
import com.pace.base.project.ExcelProjectDataErrorException;
import com.pace.base.project.PaceProjectReadException;
import com.pace.base.project.PaceProjectWriteException;
import com.pace.base.project.ProjectElementId;
import com.pace.base.project.excel.IExcelDynamicReferenceElementItem;
import com.pace.base.project.excel.PafExcelInput;
import com.pace.base.project.excel.PafExcelRow;
import com.pace.base.project.excel.PafExcelValueObject;
import com.pace.base.project.utils.PafExcelUtil;
import com.pace.base.utility.CollectionsUtil;
import com.pace.base.view.PafView;

/**
 * Reads/writes custom menus from/to an Excel 2007 workbook.
 *
 * @author jmilliron
 * @version	1.00
 *
 */
public class CustomMenusExcelElementItem<T extends List<CustomMenuDef>> extends PafExcelElementItem<T> implements IExcelDynamicReferenceElementItem {

	/**
	 * Creates an excel element item. Mainly used for reading custom menus.
	 * 
	 * @param workbook workbook used for read/write
	 */
	public CustomMenusExcelElementItem(Workbook workbook) {
		super(workbook);
	}
	
	/**
	 * Creates an excel element item. Mainly used for writing custom menus.
	 * 
	 * @param workbook workbook used for read/write
	 * @param isCellReferencingEnabled true if cell referencing is enabled
	 */	
	public CustomMenusExcelElementItem(Workbook workbook,
			boolean isCellReferencingEnabled) {
		super(workbook, isCellReferencingEnabled);
	}

	@Override
	protected void createHeaderListMapEntries() {

		getHeaderListMap().put(getSheetName(), Arrays.asList("key", "caption", "face id", "begin group", "enable button", "action class name", "action class params", "user prompts", "auto save uow", "auto refresh uow", "confirmation message", "termination message", "view filters", "auto refresh version filters"));
																	
	}

	@Override
	public ProjectElementId getProjectElementId() {
		return ProjectElementId.CustomMenus;
	}

	@SuppressWarnings("unchecked")
	@Override
	protected T readExcelSheet() throws PaceProjectReadException, PafException {
		
		PafExcelInput input = new PafExcelInput.Builder(getWorkbook(), getSheetName(), getHeaderListMap().get(getSheetName()).size())
			.headerListMap(getHeaderListMap())
			.excludeHeaderRows(true)
			.excludeEmptyRows(true)
			.sheetRequired(true)
			.multiDataRow(true)
			.endOfSheetIdnt(ExcelPaceProjectConstants.END_OF_SHEET_IDENT)
			.build();

		List<PafExcelRow> excelRowList = PafExcelUtil.readExcelSheet(input);
		
		List<CustomMenuDef> customMenuList = new ArrayList<CustomMenuDef>();
				
		CustomMenuDef customMenu = null;
		
		for ( PafExcelRow row : excelRowList ) {
		
			customMenu = new CustomMenuDef();
			
			String[] customActionClassNameAr = null;
			
			for ( Integer rowIndex : row.getRowItemOrderedIndexes()) {
			
				List<PafExcelValueObject> rowItemList = row.getRowItem(rowIndex);
				
				PafExcelValueObject firstValueObject = rowItemList.get(0);
			
				try {
				
					switch (rowIndex) {
					
						//key
						case 0:											
						
							customMenu.setKey(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true));
							break;
						
						//caption
						case 1:						
													
							customMenu.setCaption(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true));	
							break;
							
						//face id
						case 2:											
						
							customMenu.setFaceID(PafExcelUtil.getInteger(getProjectElementId(), firstValueObject));
							break;
						
						//begin group
						case 3:						
													
							customMenu.setBeginGroup(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject, true));	
							break;
							
						//enable button
						case 4:						
													
							customMenu.setEnableButton(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject, true));	
							break;							
							
						//action class name
						case 5:
														
							customActionClassNameAr = PafExcelUtil.getStringAr(getProjectElementId(), rowItemList);
													
							break;
							
						//action class parms
						case 6:

							//will loop over the customActionClassNameAr and customActionClassParmsAr to populate a 
							//set that will hold a custom action def and list of action parms.  Once set has been
							//populated, the actual custom action def with parms (nulls trimmed) will be created and set.
							
							String[] customActionClassParmsAr = PafExcelUtil.getStringAr(getProjectElementId(), rowItemList);
							
							Set<CustomActionDef> customActionDefSet = new LinkedHashSet<CustomActionDef>();
														
							if ( customActionClassNameAr != null && customActionClassParmsAr != null && 
								customActionClassNameAr.length == customActionClassParmsAr.length ) {
																						
								CustomActionDef lastCustomActionDef = null;
																			
								List<String> customActionParmList = null;
								
								for (int i = 0; i < customActionClassNameAr.length; i++) {
									
									if ( customActionClassNameAr[i] != null ) {
																				
										lastCustomActionDef = new CustomActionDef();
										lastCustomActionDef.setActionClassName(customActionClassNameAr[i]);
										
										customActionParmList = new ArrayList<String>();
										customActionParmList.add(customActionClassParmsAr[i]);
									
										lastCustomActionDef.setActionNamedParameters(customActionParmList.toArray(new String[0]));
										
										customActionDefSet.add(lastCustomActionDef);
									
									} else {
										
										if ( lastCustomActionDef != null ) {
																					
											customActionParmList.add(customActionClassParmsAr[i]);
											
											lastCustomActionDef.setActionNamedParameters(customActionParmList.toArray(new String[0]));
																						
										}
											
									}										
										
								}
								
							}
								
							for (CustomActionDef customActionDef : customActionDefSet) {
								
								if ( customActionDef.getActionNamedParameters() != null ) {
								
									List<String> customActionParmList = Arrays.asList(customActionDef.getActionNamedParameters());
									
									if ( customActionParmList != null && customActionParmList.size() > 0 ) {
										
										String[] actionNamedParms = customActionParmList.toArray(new String[0]);
									
										customActionParmList = CollectionsUtil.arrayToListPruneNulls(actionNamedParms);
										
										if ( customActionParmList != null && customActionParmList.size() > 0 ) {
											
											customActionDef.setActionNamedParameters(customActionParmList.toArray(new String[0]));
											
										}
									}
								}								
																								
							}
								
							
							if ( customActionDefSet.size() > 0 ) {
								
								customMenu.setCustomActionDefs(customActionDefSet.toArray(new CustomActionDef[0]));
								
							}
							
							break;		
							
						//user prompts
						case 7:
							
							List<String> userPromptList = CollectionsUtil.arrayToListPruneNulls(PafExcelUtil.getStringAr(getProjectElementId(), rowItemList));
							
							if ( userPromptList != null && userPromptList.size() > 0 ) {
							
								customMenu.setUserPrompts(userPromptList.toArray(new String[0]));
								
							}
							
							break;
							
						//auto save uow
						case 8:						
													
							customMenu.setAutoSaveUow(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject, true));	
							break;
							
						//auto refresh
						case 9:						
													
							customMenu.setAutoRefreshUow(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject, true));	
							break;		
					
						//confirmation message
						case 10:											
						
							customMenu.setConfirmationMessage(PafExcelUtil.getString(getProjectElementId(), firstValueObject));
							break;
							
						//termination message
						case 11:											
						
							customMenu.setTerminationMessage(PafExcelUtil.getString(getProjectElementId(), firstValueObject));
							break;
							
						//view filters
						case 12:
							
							List<String> viewFilterList = CollectionsUtil.arrayToListPruneNulls(PafExcelUtil.getStringAr(getProjectElementId(), rowItemList)); 
							
							if ( viewFilterList.size() > 0 ) {
								
								customMenu.setViewFilter(viewFilterList.toArray(new String[0]));
								
							}
								
							break;
							
						//auto refresh version filters
						case 13:
							
							List<String> autoRefreshVersionFilterList = CollectionsUtil.arrayToListPruneNulls(PafExcelUtil.getStringAr(getProjectElementId(), rowItemList)); 
							
							if ( autoRefreshVersionFilterList.size() > 0 ) {
								
								customMenu.setAutoRefreshVersionFilter(autoRefreshVersionFilterList.toArray(new String[0]));
								
							}
								
							break;
							
						}			
					
					
					} catch (ExcelProjectDataErrorException epdee) {
						
						addProjectDataErrorToList(epdee.getProjectDataError());
						
					}
			
			
			}
		
		customMenuList.add(customMenu);
		
		}
		
		return (T) customMenuList;
		
	}

	@Override
	protected void writeExcelSheet(T t) throws PaceProjectWriteException, PafException {
		
		Map<String, String> viewDynamicRefMap = null;
		
		Map<String, String> versionNameOrDynamicMemberReferenceMap = null;
								
		//if cell referencing is enabled, read in dynamic member map
		if ( isCellReferencingEnabled() ) {			
									
			versionNameOrDynamicMemberReferenceMap = new HashMap<String, String>();
			
			Map<String, String> versionNameReferenceMap = null;
			
			Map<String, String> dynamicMemberReferenceMap = null;
			
			//view names
			IExcelDynamicReferenceElementItem viewElementItem = new ViewsExcelElementItem<List<PafView>>(getWorkbook());
			viewDynamicRefMap = viewElementItem.getDynamicReferenceMap();
									
			//version names
			IExcelDynamicReferenceElementItem versionExcelElementItem = new VersionsExcelElementItem<List<VersionDef>>(getWorkbook());
			versionNameReferenceMap = versionExcelElementItem.getDynamicReferenceMap();
			
			if ( versionNameReferenceMap != null ) {
				
				versionNameOrDynamicMemberReferenceMap.putAll(versionNameReferenceMap);
				
			}
			
			//dynamic members
			IExcelDynamicReferenceElementItem dynamicMemberExcelElementItem = new DynamicMembersExcelElementItem<List<DynamicMemberDef>>(getWorkbook());
			dynamicMemberReferenceMap = dynamicMemberExcelElementItem.getDynamicReferenceMap();
			
			if ( dynamicMemberReferenceMap != null ) {
				
				versionNameOrDynamicMemberReferenceMap.putAll(dynamicMemberReferenceMap);
				
			}
			
		}
		
		PafExcelInput input = new PafExcelInput.Builder(getWorkbook(), getSheetName(), getHeaderListMap().get(getSheetName()).size())
			.endOfSheetIdnt(ExcelPaceProjectConstants.END_OF_SHEET_IDENT)
			.build();

		List<CustomMenuDef> list = t;
		
		List<PafExcelRow> excelRowList = new ArrayList<PafExcelRow>();
	
		//create and add header to list
		excelRowList.add(PafExcelUtil.createHeaderRow(getHeaderListMap().get(getSheetName())));
		
		if ( list != null ) {

			for ( CustomMenuDef customMenuDef : list ) {
				
				PafExcelRow excelRow = new PafExcelRow();
				
				//key
				excelRow.addRowItem(0, PafExcelValueObject.createFromString(customMenuDef.getKey()));
	
				//caption
				excelRow.addRowItem(1, PafExcelValueObject.createFromString(customMenuDef.getCaption()));
				
				//face id
				excelRow.addRowItem(2, PafExcelValueObject.createFromInteger(customMenuDef.getFaceID()));
				
				//begin group 
				excelRow.addRowItem(3, PafExcelValueObject.createFromBoolean(customMenuDef.isBeginGroup()));
				
				//enable button
				excelRow.addRowItem(4, PafExcelValueObject.createFromBoolean(customMenuDef.isEnableButton()));
				
				//custom menu defs
				if ( customMenuDef.getCustomActionDefs() != null ) {
					
					CustomActionDef[] customActionDefs = customMenuDef.getCustomActionDefs();
										
					for ( CustomActionDef cad : customActionDefs ) {
						
						//action class name						
						excelRow.addRowItem(5, PafExcelValueObject.createFromString(cad.getActionClassName()));
						
						if ( cad.getActionNamedParameters() != null ) {
						
							int actionParmNdx = 0;
							
							for (String actionNamedParm : cad.getActionNamedParameters() ) {
							
								if ( actionParmNdx++ > 0 ) {
									
									//action class name						
									excelRow.addRowItem(5, PafExcelValueObject.createBlank());
									
								}
								
								//action class param						
								excelRow.addRowItem(6, PafExcelValueObject.createFromString(actionNamedParm));
														
							}
						}
						
					}
					
				}
				
				if ( customMenuDef.getUserPrompts() != null ) {
					
					for (String userPrompt : customMenuDef.getUserPrompts()) {
					
						//user prompts
						excelRow.addRowItem(7, PafExcelValueObject.createFromString(userPrompt));
					
					}
					
				}
				
				//auto save uow
				excelRow.addRowItem(8, PafExcelValueObject.createFromBoolean(customMenuDef.isAutoSaveUow()));
				
				//auto refresh uow
				excelRow.addRowItem(9, PafExcelValueObject.createFromBoolean(customMenuDef.isAutoRefreshUow()));

				//conf message
				excelRow.addRowItem(10, PafExcelValueObject.createFromString(customMenuDef.getConfirmationMessage()));
				
				//term message
				excelRow.addRowItem(11, PafExcelValueObject.createFromString(customMenuDef.getTerminationMessage()));
								
				//view filters: view name
				if ( customMenuDef.getViewFilter() != null ) {
				
					for ( String viewName : customMenuDef.getViewFilter() ) {
					
						/*if ( isCellReferencingEnabled() && viewDynamicRefMap != null && viewDynamicRefMap.containsKey(viewName)) {
							
							excelRow.addRowItem(12, PafExcelValueObject.createFromFormula(viewDynamicRefMap.get(viewName)));
							
						} else {
							
							excelRow.addRowItem(12, PafExcelValueObject.createFromString(viewName));		
							
						}*/
						
						excelRow.addRowItem(12, PafExcelValueObject.createFromFormulaReferenceMap(viewName, viewDynamicRefMap));
						
					}					
					
				}					
				
				//auto refresh version filters
				if ( customMenuDef.getAutoRefreshVersionFilter() != null ) {
				
					for ( String versionFilterName : customMenuDef.getAutoRefreshVersionFilter() ) {
					
						excelRow.addRowItem(13, PafExcelValueObject.createFromFormulaReferenceMap(versionFilterName, versionNameOrDynamicMemberReferenceMap));
						
					}					
					
				}					
				
				excelRowList.add(excelRow);			
				
			}				
			
		}		
			
		PafExcelUtil.writeExcelSheet(input, excelRowList);
		
	}

	/**
	 * Creates a dynamic reference map used to reference custom menu cells.  Key is custom menu name, value
	 * is the Excel sheet/cell reference.  Example =CustomMenus!$A$2.
	 */
	public Map<String, String> getDynamicReferenceMap() {

		Map<String, String> dynamicRefMap = null;
		
		PafExcelInput input = new PafExcelInput.Builder(this.getWorkbook(), this.getSheetName(), 1)
			.headerListMap(this.getHeaderListMap())
			.excludeHeaderRows(true)
			.excludeEmptyRows(true)
			.multiDataRow(true)
			.startDataReadColumnIndex(0)
			.sheetRequired(false)
			.endOfSheetIdnt(ExcelPaceProjectConstants.END_OF_SHEET_IDENT)
			.build();
	
		try {
			
			dynamicRefMap = PafExcelUtil.createCellReferenceMap(input);
			
		} catch (PafException e) {
									
			logger.warn(ExcelPaceProjectConstants.COULD_NOT_CREATE_THE_REFERENCE_MAP + e.getMessage());
			
		}
		
		return dynamicRefMap;		

	}	
		

}
