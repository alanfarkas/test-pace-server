/*
 *	File: @(#)ApplicationDefExcelElementItem.java 	Package: com.pace.base.project.excel.elements 	Project: Paf Base Libraries
 *	Created: Jan 6, 2010  		By: jmilliron
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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Workbook;

import com.pace.base.PafException;
import com.pace.base.app.AliasMapping;
import com.pace.base.app.AllocType;
import com.pace.base.app.AppColors;
import com.pace.base.app.AppSettings;
import com.pace.base.app.MdbDef;
import com.pace.base.app.PafApplicationDef;
import com.pace.base.app.PafDimSpec;
import com.pace.base.app.SuppressZeroSettings;
import com.pace.base.comm.DataFilterSpec;
import com.pace.base.comm.UserFilterSpec;
import com.pace.base.project.ExcelPaceProjectConstants;
import com.pace.base.project.ExcelProjectDataErrorException;
import com.pace.base.project.PaceProjectReadException;
import com.pace.base.project.PaceProjectWriteException;
import com.pace.base.project.ProjectDataError;
import com.pace.base.project.ProjectElementId;
import com.pace.base.project.excel.IExcelDynamicReferenceElementItem;
import com.pace.base.project.excel.PafExcelInput;
import com.pace.base.project.excel.PafExcelRow;
import com.pace.base.project.excel.PafExcelValueObject;
import com.pace.base.project.utils.PafExcelUtil;
import com.pace.base.utility.CollectionsUtil;

/**
 * Reads/writes user selections from/to an Excel 2007 workbook.
 *
 * @author jmilliron
 * @version	1.00
 *
 */
public class ApplicationDefExcelElementItem<T extends List<PafApplicationDef>> extends PafExcelElementItem<T> implements IExcelDynamicReferenceElementItem {

	/**
	 * Creates an excel element item.
	 * 
	 * @param workbook workbook used for read/write
	 */
	public ApplicationDefExcelElementItem(Workbook workbook) {
		super(workbook);

	}
	
	/**
	 * Creates an excel element item. Mainly used for writing app defs .
	 * 
	 * @param workbook workbook used for read/write
	 * @param isCellReferencingEnabled true if cell referencing is enabled
	 */
	public ApplicationDefExcelElementItem(Workbook workbook,
			boolean isCellReferencingEnabled) {
		super(workbook, isCellReferencingEnabled);
	}

	@Override
	protected void createHeaderListMapEntries() {

		getHeaderListMap().put(getSheetName(), Arrays.asList("app id", "app title", "app settings - global large uow size", "app settings - global max uow size", 
				"app settings - global replicate enabled", "app settings - global replicate all enabled",  "app settings - global lift enabled", "app settings - global lift all enabled",
				"app settings - is global user filtered uow", "app settings - is global user filtered multi-select", "app settings - is global data filtered uow", 
				"app settings - global data filter spec - dimension name", "app settings - global data filter spec - expression list", "app settings - global user filter spec - attribute dimension names", 
				"app settings - enable rounding", "app settings - alloc type", "app settings - week 53 years", "app settings - week 53 members", "app colors - non plannable protected color", 
				"app colors - forward plannable protected color", "app colors - protected color", "app colors - system lock color", "app colors - user lock color", "app colors - note color", 
				"alias mapping - dim name", "alias mapping - alias table name", "alias mapping - primary row column format", "alias mapping - additional row column format", "global suppress zero settings - enabled", 
				"global suppress zero settings - visible", "global suppress zero settings - row suppressed", "global suppress zero settings - col suppressed", "mdb def - data source id", 
				"mdb def - measure dim", "mdb def - measure root", "mdb def - time dim", "mdb def - plan type dim", "mdb def - version dim", "mdb def - year dim", "mdb def - hierarchy dimensions",
				"mdb def - axis priority dimensions", "last period", "current year", "essbase net timeout", "essbase attribute dimension filter list"));
		
	}

	@Override
	public ProjectElementId getProjectElementId() {

		return ProjectElementId.ApplicationDef;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T readExcelSheet() throws PaceProjectReadException, PafException {
		
		logger.debug("Reading application def.");
		
		PafExcelInput input = new PafExcelInput.Builder(getWorkbook(), getSheetName(), getHeaderListMap().get(getSheetName()).size())
									.headerListMap(getHeaderListMap())
									.excludeHeaderRows(true)
									.excludeEmptyRows(true)
									.sheetRequired(true)
									.multiDataRow(true)
									.endOfSheetIdnt(ExcelPaceProjectConstants.END_OF_SHEET_IDENT)
									.build();
		
		List<PafApplicationDef> pafAppList = new ArrayList<PafApplicationDef>();
				
	 	List<PafExcelRow> excelRowList = PafExcelUtil.readExcelSheet(input);
													
		PafApplicationDef pafApp = null;
		
		AppSettings appSettings = null;
		
		MdbDef mdbDef = null;
		
		for ( PafExcelRow row : excelRowList ) {
			
			pafApp = new PafApplicationDef();
			appSettings = new AppSettings();
			mdbDef = new MdbDef();
			
			for ( Integer rowIndex : row.getRowItemOrderedIndexes()) {
				
				List<PafExcelValueObject> rowItemList = row.getRowItem(rowIndex);
				
				PafExcelValueObject firstValueObject = rowItemList.get(0);
				
				try {
				
					switch (rowIndex) {
					
					//appId
					case 0:											
					
						pafApp.setAppId(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true));
											
						break;
						
					//app title
					case 1:																			
						appSettings.setAppTitle(PafExcelUtil.getString(getProjectElementId(), firstValueObject));						
						break;
						
					//app settings - global large uow size
					case 2:
						appSettings.setGlobalUowSizeLarge(PafExcelUtil.getInteger(getProjectElementId(), firstValueObject));
						break;
						
					//app settings - global max uow size
					case 3:
						appSettings.setGlobalUowSizeMax(PafExcelUtil.getInteger(getProjectElementId(), firstValueObject));
						break;

					//app settings - global replicate enabled
					case 4:	
						appSettings.setGlobalReplicateEnabled(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject, true));
						break;

					//app settings - global replicate all enabled
					case 5:	
						appSettings.setGlobalReplicateAllEnabled(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject, true));
						break;
						
					//app settings - global lift enabled
					case 6:	
						appSettings.setGlobalLiftEnabled(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject, true));
						break;

					//app settings - global lift all enabled
					case 7:	
						appSettings.setGlobalLiftAllEnabled(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject, true));
						break;
						
					//app settings - is global user filtered uow
					case 8:	
						appSettings.setGlobalUserFilteredUow(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject, true));
						break;

					//app settings - is Global User Filtered Multi-Select
					case 9:	
						appSettings.setGlobalUserFilteredMultiSelect(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject, true));
						break;

					//app settings - is global data filtered uow
					case 10:
						appSettings.setGlobalDataFilteredUow(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject, true));
						break;

					//app settings - global data filter spec - dimension name
					case 11:	
					//app settings - global data filter spec - expression list
					case 12:
						
						if ( rowIndex == 11 && rowItemList.size() > 0 && row.getRowItem(rowIndex + 1).size() > 0) {
							
							Map<PafExcelValueObject, List<PafExcelValueObject>> valueObjectMap = CollectionsUtil.createMapFromLists(PafExcelUtil.convertBlanksToNullInList(rowItemList), row.getRowItem(rowIndex+1));

							List<PafDimSpec> pafDimSpecList = new ArrayList<PafDimSpec>();
							
							for (PafExcelValueObject keyValueObject : valueObjectMap.keySet() ) {
								
								if ( ! keyValueObject.isString() && ! keyValueObject.isFormula() ) {
									
									addProjectDataErrorToList(ProjectDataError.createInvalidValueProjectDataError(getProjectElementId(), keyValueObject));
									
								} else {
									
									String keyString = keyValueObject.getString();

									List<String> valueStringList = new ArrayList<String>(valueObjectMap.get(keyValueObject).size());
									
									for ( PafExcelValueObject mapValueObject : valueObjectMap.get(keyValueObject)) {
										
										if ( mapValueObject.isBlank()) {
											
											addProjectDataErrorToList(ProjectDataError.createMissingValueProjectDataError(getProjectElementId(), mapValueObject));
											
										} else {
											
											valueStringList.add(mapValueObject.getValueAsString());
											
										}
										
									}
									
									PafDimSpec pds = new PafDimSpec();
									
									pds.setDimension(keyString);
									
									pds.setExpressionList(valueStringList.toArray(new String[0]));
									
									pafDimSpecList.add(pds);
									
								}
							
							}
							
							if ( pafDimSpecList.size() > 0 ) {
	
								DataFilterSpec dfs = new DataFilterSpec();
								
								dfs.setDimSpec(pafDimSpecList.toArray(new PafDimSpec[0]));
								
								appSettings.setGlobalDataFilterSpec(dfs);															
								
							}
							
						}
						
						break;
						
					//app settings - global user filter spec - attribute dimension names
					case 13:
						
						List<String> attributeDimNameList = CollectionsUtil.arrayToListPruneNulls(PafExcelUtil.getStringAr(getProjectElementId(), rowItemList));
											
						if ( attributeDimNameList.size() > 0 ) {
							
							UserFilterSpec ufs = new UserFilterSpec();
							
							ufs.setAttrDimNames(attributeDimNameList.toArray(new String[0]));
							
							appSettings.setGlobalUserFilterSpec(ufs);
							
						}
						
						break;
						
					//app settings - enable rounding
					case 14:
						
						appSettings.setEnableRounding(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject, true));						
						break;
						
					//app settings - alloc type
					case 15:
						if ( ! firstValueObject.isBlank() ) {
							appSettings.setGlobalAllocType(AllocType.valueOf(PafExcelUtil.getString(getProjectElementId(), firstValueObject)));
						}
						break;
							
					//week 53 years
					case 16:											
						//Update for TTN-1862
						if( rowItemList.size() != 0 ) {
							Set<String> years = new HashSet<String>();
							boolean yearsReadError = false;
							for ( PafExcelValueObject year : rowItemList ) {
								if( PafExcelUtil.getString(getProjectElementId(), year) !=null ) {
									try {
										years.add(PafExcelUtil.getString(getProjectElementId(), year));
									} catch (ExcelProjectDataErrorException epdee) {
										addProjectDataErrorToList(epdee.getProjectDataError());
										yearsReadError = true;
									}
								}
							}
							if ( ! yearsReadError && years.size() > 0 ) {
								appSettings.setWeek53Years(years);
							}
						}
						break;
	
					//week 53 members
					case 17:											
						//Update for TTN-1862						
						if( rowItemList.size() != 0 ) {
							Set<String> members = new HashSet<String>();
							boolean membersReadError = false;
							for ( PafExcelValueObject member : rowItemList ) {
								if( PafExcelUtil.getString(getProjectElementId(), member) != null ) {
									try {
										members.add(PafExcelUtil.getString(getProjectElementId(), member));
									} catch (ExcelProjectDataErrorException epdee) {
										addProjectDataErrorToList(epdee.getProjectDataError());
										membersReadError = true;
									}
								}
							}
							if ( ! membersReadError && members.size() > 0 ) {
								appSettings.setWeek53Years(members);
							}
						}
						break;

						//app colors
					case 18:						
					case 19:
					case 20:
					case 21:
					case 22:
					case 23:
						
						AppColors appColors = appSettings.getAppColors();
						
						if ( appColors == null ) {
							
							appColors = new AppColors();
							
						}					
						
						switch (rowIndex) {
							
							//app colors - non plannable protected color
							case 18:											
								appColors.setNonPlannableProtectedColor(PafExcelUtil.getHexNumber(getProjectElementId(), firstValueObject));											
								break;
								
							//app colors - forward plannable protected color
							case 19:
								appColors.setForwardPlannableProtectedColor(PafExcelUtil.getHexNumber(getProjectElementId(), firstValueObject));
								break;
								
							//app colors - protected color
							case 20:	
								appColors.setProtectedColor(PafExcelUtil.getHexNumber(getProjectElementId(), firstValueObject));
								break;
								
							//app colors - system lock color
							case 21:	
								appColors.setSystemLockColor(PafExcelUtil.getHexNumber(getProjectElementId(), firstValueObject));
								break;
								
							//app colors - user lock color
							case 22:	
								appColors.setUserLockColor(PafExcelUtil.getHexNumber(getProjectElementId(), firstValueObject));
								break;
								
							//app colors - note color	
							case 23:
								appColors.setNoteColor(PafExcelUtil.getHexNumber(getProjectElementId(), firstValueObject));
								break;
						}		
						
						appSettings.setAppColors(appColors);
						
						break;
						
					//alias mappings
					case 24:	
					case 25:
					case 26:
					case 27:	
						
						//alias mapping - dim name
						if ( rowIndex == 24 ) {
							
							List<AliasMapping> aliasMappingList = new ArrayList<AliasMapping>();
							
							for ( int i = 0; i < rowItemList.size(); i++ ) {
								
								PafExcelValueObject dimNameValueObject = row.getRowItem(24).get(i);
								PafExcelValueObject aliasTableNameValueObject = row.getRowItem(25).get(i);
								PafExcelValueObject primaryRowColumnFormatValueObject = row.getRowItem(26).get(i);
								PafExcelValueObject additionalRowColumnFormatValueObject = row.getRowItem(27).get(i);
								
								if ( dimNameValueObject.isBlank() && aliasTableNameValueObject.isBlank() && primaryRowColumnFormatValueObject.isBlank() && additionalRowColumnFormatValueObject.isBlank()) {
									
									//continue to next row item
									continue;
									
								}
								
								AliasMapping am = new AliasMapping();
								
								if ( dimNameValueObject.isBlank() ) {
									
									addProjectDataErrorToList(ProjectDataError.createMissingValueProjectDataError(getProjectElementId(), dimNameValueObject));
									
								} else if ( dimNameValueObject.isString() || dimNameValueObject.isFormula() ) {
									
									am.setDimName(dimNameValueObject.getValueAsString());
																		
								} else {
									
									addProjectDataErrorToList(ProjectDataError.createInvalidValueProjectDataError(getProjectElementId(), dimNameValueObject));
									
								}
								
								if ( aliasTableNameValueObject.isBlank() ) {
									
									addProjectDataErrorToList(ProjectDataError.createMissingValueProjectDataError(getProjectElementId(), aliasTableNameValueObject));
									
								} else if ( aliasTableNameValueObject.isString() ) {
									
									am.setAliasTableName(aliasTableNameValueObject.getString());
																		
								} else {
									
									addProjectDataErrorToList(ProjectDataError.createInvalidValueProjectDataError(getProjectElementId(), aliasTableNameValueObject));
									
								}
								
								if ( primaryRowColumnFormatValueObject.isBlank() ) {
									
									addProjectDataErrorToList(ProjectDataError.createMissingValueProjectDataError(getProjectElementId(), primaryRowColumnFormatValueObject));
									
								} else if ( primaryRowColumnFormatValueObject.isString() ) {
									
									String priRowColFormat = primaryRowColumnFormatValueObject.getString();
									
									if ( CollectionsUtil.containsIgnoreCase(ExcelPaceProjectConstants.VALID_ALIAS_MEMBER_LIST, priRowColFormat ) ) {
										
										am.setPrimaryRowColumnFormat(priRowColFormat);
										
									} else {

										addProjectDataErrorToList(ProjectDataError.createInvalidValueProjectDataError(getProjectElementId(), primaryRowColumnFormatValueObject, ExcelPaceProjectConstants.VALID_ALIAS_MEMBER_LIST));
										
									}
																										
								} else {
									
									addProjectDataErrorToList(ProjectDataError.createInvalidValueProjectDataError(getProjectElementId(), primaryRowColumnFormatValueObject, ExcelPaceProjectConstants.VALID_ALIAS_MEMBER_LIST));
									
								}
								
								//not required
								if ( ! additionalRowColumnFormatValueObject.isBlank() ) {
									
									if ( additionalRowColumnFormatValueObject.isString() ) {
									
										String addRowColFormat = additionalRowColumnFormatValueObject.getString();
										
										if ( CollectionsUtil.containsIgnoreCase(ExcelPaceProjectConstants.VALID_ALIAS_MEMBER_LIST, addRowColFormat ) ) {
											
											am.setAdditionalRowColumnFormat(addRowColFormat);
											
										} else {
										
											addProjectDataErrorToList(ProjectDataError.createInvalidValueProjectDataError(getProjectElementId(), additionalRowColumnFormatValueObject, ExcelPaceProjectConstants.VALID_ALIAS_MEMBER_LIST));
											
										}
																		
									} else {
										
										addProjectDataErrorToList(ProjectDataError.createInvalidValueProjectDataError(getProjectElementId(), additionalRowColumnFormatValueObject, ExcelPaceProjectConstants.VALID_ALIAS_MEMBER_LIST));
										
									}
								} else {
									
									am.setAdditionalRowColumnFormat("");
									
								}
								
								aliasMappingList.add(am);
								
							}
							
							if ( aliasMappingList.size() > 0 ) {
								
								appSettings.setGlobalAliasMappings(aliasMappingList.toArray(new AliasMapping[0]));
								
							}							
						}
						
						break;	
						
					//global suppress zero settings
					case 28:	
					case 29:	
					case 30:
					case 31:	
						
						SuppressZeroSettings szs = appSettings.getGlobalSuppressZeroSettings();
						
						if ( szs == null ) {
						
							szs = new SuppressZeroSettings();
							
						}					
						
						switch (rowIndex) {
						
						//global suppress zero settings - enabled
						case 28:									
							szs.setEnabled(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject));									
							break;
							
						//global suppress zero settings - visible
						case 29:
							szs.setVisible(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject));
							break;
							
						//global suppress zero settings - row suppressed
						case 30:	
							szs.setRowsSuppressed(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject));
							break;
							
						//global suppress zero settings - col suppressed
						case 31:
							szs.setColumnsSuppressed(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject));
							break;
						
						}			
						
						appSettings.setGlobalSuppressZeroSettings(szs);						
						break;
						
					//mdb def - data source id
					case 32:
						mdbDef.setDataSourceId(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true));
						break;
						
					//mdb def - measure dim
					case 33:
						mdbDef.setMeasureDim(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true));
						break;
	
					//mdb def - measure root
					case 34:							
						mdbDef.setMeasureRoot(PafExcelUtil.getString(getProjectElementId(), firstValueObject));
						break;

					//mdb def - time dim
					case 35:	
						mdbDef.setTimeDim(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true));
						break;
						
					//mdb def - plan type dim
					case 36:	
						mdbDef.setPlanTypeDim(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true));
						break;
						
					//mdb def - version dim
					case 37:	
						mdbDef.setVersionDim(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true));
						break;
						
					//mdb def - year dim
					case 38:
						mdbDef.setYearDim(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true));
						break;
						
					//mdb def - hierarchy dimensions
					case 39:	
						
						List<String> hierDimList = CollectionsUtil.arrayToListPruneNulls(PafExcelUtil.getStringAr(getProjectElementId(), rowItemList, true));
						mdbDef.setHierDims(hierDimList.toArray(new String[0]));
						break;
						
					//mdb def - axis priority dimensions
					case 40:
						
						List<String> axisPriorityDimList = CollectionsUtil.arrayToListPruneNulls(PafExcelUtil.getStringAr(getProjectElementId(), rowItemList));

						if ( axisPriorityDimList.size() > 0 ) {
														
							mdbDef.setAxisPriority(axisPriorityDimList.toArray(new String[0]));
							
						}						
						break;
						
					//last period
					case 41:	
						pafApp.setLastPeriod(PafExcelUtil.getString(getProjectElementId(), firstValueObject));
						break;
						
					//current year
					case 42:	
						pafApp.setCurrentYear(PafExcelUtil.getString(getProjectElementId(), firstValueObject));
						break;
						
					//essbase net timeout
					case 43:	
						pafApp.setEssNetTimeOut(PafExcelUtil.getInteger(getProjectElementId(), firstValueObject));	
						break;
						
					//essbase attribute dimension filter list
					case 44:	
						
						List<String> essbaseAttDimFilterList = CollectionsUtil.arrayToListPruneNulls(PafExcelUtil.getStringAr(getProjectElementId(), rowItemList));
						
						if ( essbaseAttDimFilterList.size() > 0 ) {
														
							pafApp.setEssAttrDimFilter(essbaseAttDimFilterList.toArray(new String[0]));
							
						}
						
						break;
						
					}
				
				} catch (ExcelProjectDataErrorException epdee) {
					
					addProjectDataErrorToList(epdee.getProjectDataError());
					
				}
				
				
			}
			
			pafApp.setAppSettings(appSettings);
			pafApp.setMdbDef(mdbDef);				
			pafAppList.add(pafApp);
			
		}
				
		return (T) pafAppList;

		
	}

	@Override
	protected void writeExcelSheet(T t) throws PaceProjectWriteException, PafException {
		
		Map<String, String> dimensionRefMap = null;
		
		if ( isCellReferencingEnabled() ) {

			this.setCellReferencingEnabled(false);
			
			write(t);
			
			dimensionRefMap = getDynamicReferenceMap();
			
			this.setCellReferencingEnabled(true);
			
		}
		
		
		PafExcelInput input = new PafExcelInput.Builder(getWorkbook(), getSheetName(), getHeaderListMap().get(getSheetName()).size())
			.autoSizeColumns(false)
			.endOfSheetIdnt(ExcelPaceProjectConstants.END_OF_SHEET_IDENT)
			.build();	

		List<PafApplicationDef> applicationDefList = t;
		
		List<PafExcelRow> excelRowList = new ArrayList<PafExcelRow>();
	
		//create and add header to list
		excelRowList.add(PafExcelUtil.createHeaderRow(getHeaderListMap().get(getSheetName())));
		
		if ( applicationDefList != null ) {
			
			for ( PafApplicationDef appDef : applicationDefList ) {
				
				PafExcelRow excelRow = new PafExcelRow();
				
				//app id				
				excelRow.addRowItem(0, PafExcelValueObject.createFromString(appDef.getAppId()));
				
				if ( appDef.getAppSettings() != null ) {

					AppSettings as = appDef.getAppSettings();
					
					//app title
					excelRow.addRowItem(1, PafExcelValueObject.createFromString(as.getAppTitle()));
					
					//app settings - global large uow size
					excelRow.addRowItem(2, PafExcelValueObject.createFromInteger(as.getGlobalUowSizeLarge()));
					
					//app settings - global max uow size
					excelRow.addRowItem(3, PafExcelValueObject.createFromInteger(as.getGlobalUowSizeMax()));
					
					//app settings - global replicate enabled
					excelRow.addRowItem(4, PafExcelValueObject.createFromBoolean(as.isGlobalReplicateEnabled()));
					
					//app settings - global replicate all enabled
					excelRow.addRowItem(5, PafExcelValueObject.createFromBoolean(as.isGlobalReplicateAllEnabled()));
					
					//app settings - global lift enabled
					excelRow.addRowItem(6, PafExcelValueObject.createFromBoolean(as.isGlobalLiftEnabled()));
					
					//app settings - global lift all enabled
					excelRow.addRowItem(7, PafExcelValueObject.createFromBoolean(as.isGlobalLiftAllEnabled()));
					
					//app settings - is global user filtered uow
					excelRow.addRowItem(8, PafExcelValueObject.createFromBoolean(as.isGlobalUserFilteredUow()));
					
					//app settings - is global user filtered multi-select
					excelRow.addRowItem(9, PafExcelValueObject.createFromBoolean(as.isGlobalUserFilteredMultiSelect()));
					
					//app settings - is global data filtered uow
					excelRow.addRowItem(10, PafExcelValueObject.createFromBoolean(as.isGlobalDataFilteredUow()));
										
					//global data filter spec
					if ( as.getGlobalDataFilterSpec() != null ) {
						
						DataFilterSpec dsf = as.getGlobalDataFilterSpec();
						
						if ( dsf.getDimSpec() != null ) {
							
							PafDimSpec[] pafDimSpecAr = dsf.getDimSpec();
							
							for ( PafDimSpec pds : pafDimSpecAr ) {
								
								int ndx = 0;
								
								String dimName = pds.getDimension();
								
								//app settings - global data filter spec - dimension name
								if ( dimName != null && dimensionRefMap != null && dimensionRefMap.containsKey(dimName) ) {
									
									excelRow.addRowItem(11, PafExcelValueObject.createFromFormula(dimensionRefMap.get(dimName)));
									
								} else {
								
									excelRow.addRowItem(11, PafExcelValueObject.createFromString(dimName));
									
								}
								
								for ( String expression : 	pds.getExpressionList() ) {
									
									if ( ndx++ != 0 ) {

										//app settings - global data filter spec - dimension name ( create blanks for additional items)
										excelRow.addRowItem(11, PafExcelValueObject.createBlank());
										
									}
									
									//app settings - global data filter spec - expression list
									excelRow.addRowItem(12, PafExcelValueObject.createFromString(expression));
									
								}
								
							}
							
						}
						
					}
					
					//app settings - global user filter spec - attribute dimension names
					if ( as.getGlobalUserFilterSpec() != null ) {
						
						UserFilterSpec ufs = as.getGlobalUserFilterSpec();
						
						if ( ufs != null && ufs.getAttrDimNames() != null ) {							
							
							for (String attrDimName : ufs.getAttrDimNames()) {
								
								excelRow.addRowItem(13, PafExcelValueObject.createFromString(attrDimName));
								
							}
							
						}
						
					}
					
					//app settings - enable rounding
					excelRow.addRowItem(14, PafExcelValueObject.createFromBoolean(as.isEnableRounding()));
					
					if( as.getGlobalAllocType() != null ) {
						//app settings - alloc type
						excelRow.addRowItem(15, PafExcelValueObject.createFromString(as.getGlobalAllocType().toString()));
					}

					//week 53 years
					//TTN 1862 - week 53 import/export
					Set<String> week53Years = as.getWeek53Years();
					if ( week53Years != null ) {
						for (String year : week53Years ) {
								excelRow.addRowItem(16, PafExcelValueObject.createFromString(year));
						}
					}
					Set<String> week53Members = as.getWeek53Members();
					if ( week53Members != null ) {
						for (String member : week53Members ) {
								excelRow.addRowItem(17, PafExcelValueObject.createFromString(member));
						}
					}

					if ( as.getAppColors() != null ) {
						
						//app colors - non plannable protected color
						excelRow.addRowItem(18, PafExcelValueObject.createFromString(as.getAppColors().getNonPlannableProtectedColor()));
						
						//app colors - forward plannable protected color
						excelRow.addRowItem(19, PafExcelValueObject.createFromString(as.getAppColors().getForwardPlannableProtectedColor()));
						
						//app colors - protected color
						excelRow.addRowItem(20, PafExcelValueObject.createFromString(as.getAppColors().getProtectedColor()));
						
						//app colors - system lock color
						excelRow.addRowItem(21, PafExcelValueObject.createFromString(as.getAppColors().getSystemLockColor()));
						
						//app colors - user lock color
						excelRow.addRowItem(22, PafExcelValueObject.createFromString(as.getAppColors().getUserLockColor()));
						
						//app colors - note color
						excelRow.addRowItem(22, PafExcelValueObject.createFromString(as.getAppColors().getNoteColor()));
					}

					//alias mappings
					if ( as.getGlobalAliasMappings() != null ) {
						
						for (AliasMapping am : as.getGlobalAliasMappings()) {
							
							//alias mapping - dim name
							
							if ( am.getDimName() != null && dimensionRefMap != null && dimensionRefMap.containsKey(am.getDimName()) ) {
														
								excelRow.addRowItem(24, PafExcelValueObject.createFromFormula(dimensionRefMap.get(am.getDimName())));
								
							} else {
							
								excelRow.addRowItem(24, PafExcelValueObject.createFromString(am.getDimName()));
								
							}
														
							//alias mapping - alias table name
							excelRow.addRowItem(25, PafExcelValueObject.createFromString(am.getAliasTableName()));
							
							//alias mapping - primary row column format
							excelRow.addRowItem(26, PafExcelValueObject.createFromString(am.getPrimaryRowColumnFormat()));
							
							//alias mapping - additional row column format
							excelRow.addRowItem(27, PafExcelValueObject.createFromString(am.getAdditionalRowColumnFormat()));
														
						}
						
					}
					
					//suppress zeros
					if ( as.getGlobalSuppressZeroSettings() != null ) {
						
						SuppressZeroSettings szs = as.getGlobalSuppressZeroSettings();
						
						//global suppress zero settings - enabled	
						excelRow.addRowItem(28, PafExcelValueObject.createFromBoolean(szs.getEnabled()));
						
						//global suppress zero settings - visible
						excelRow.addRowItem(29, PafExcelValueObject.createFromBoolean(szs.getVisible()));
						
						//global suppress zero settings - row suppressed	
						excelRow.addRowItem(30, PafExcelValueObject.createFromBoolean(szs.getRowsSuppressed()));
						
						//global suppress zero settings - col suppressed
						excelRow.addRowItem(31, PafExcelValueObject.createFromBoolean(szs.getColumnsSuppressed()));

						
					}
					
				}
				
				if ( appDef.getMdbDef() != null ) {
					
					MdbDef mdbDef = appDef.getMdbDef();
					
					//mdb def - data source id	
					excelRow.addRowItem(32, PafExcelValueObject.createFromString(mdbDef.getDataSourceId()));
					
					//mdb def - measure dim
					excelRow.addRowItem(33, PafExcelValueObject.createFromString(mdbDef.getMeasureDim()));
					
					//mdb def - measure root
					excelRow.addRowItem(34, PafExcelValueObject.createFromString(mdbDef.getMeasureRoot()));
					
					//mdb def - time dim	
					excelRow.addRowItem(35, PafExcelValueObject.createFromString(mdbDef.getTimeDim()));
					
					//mdb def - plan type dim	
					excelRow.addRowItem(36, PafExcelValueObject.createFromString(mdbDef.getPlanTypeDim()));
					
					//mdb def - version dim
					excelRow.addRowItem(37, PafExcelValueObject.createFromString(mdbDef.getVersionDim()));
					
					//mdb def - year dim
					excelRow.addRowItem(38, PafExcelValueObject.createFromString(mdbDef.getYearDim()));
					
					//mdb def - hierarchy dimensions	
					if ( mdbDef.getHierDims() != null ) {
						
						for (String hierDim : mdbDef.getHierDims()) {
							
							excelRow.addRowItem(39, PafExcelValueObject.createFromString(hierDim));
							
						}
						
					}
					
					//mdb def - axis priority dimensions
					if ( mdbDef.getAxisPriority() != null ) {
						
						for (String axisPriorityDim : mdbDef.getAxisPriority()) {
							
							if ( axisPriorityDim != null && dimensionRefMap != null && dimensionRefMap.containsKey(axisPriorityDim) ) {
								
								excelRow.addRowItem(40, PafExcelValueObject.createFromFormula(dimensionRefMap.get(axisPriorityDim)));
								
							} else {
							
								excelRow.addRowItem(40, PafExcelValueObject.createFromString(axisPriorityDim));
								
							}
							
						}
						
					}
					
				}

				//last period
				excelRow.addRowItem(41, PafExcelValueObject.createFromString(appDef.getLastPeriod()));
				
				//current year
				excelRow.addRowItem(42, PafExcelValueObject.createFromString(appDef.getCurrentYear()));
				
				//essbase net timeout	
				
				excelRow.addRowItem(43, PafExcelValueObject.createFromInteger(appDef.getEssNetTimeOut()));
				
				//essbase attribute dimension filter list
				if ( appDef.getEssAttrDimFilter() != null ) {
					
					for (String essAttDimFilter : appDef.getEssAttrDimFilter() ) {
						
						excelRow.addRowItem(44, PafExcelValueObject.createFromString(essAttDimFilter));
						
					}
					
				}
				
				excelRowList.add(excelRow);			
				
			}
			
		}	
			
		PafExcelUtil.writeExcelSheet(input, excelRowList);
			
	}

	public Map<String, String> getDynamicReferenceMap() {
		
		Map<String, String> dynamicRefMap = new HashMap<String, String>();
		
		List<PafExcelInput> inputList = Arrays.asList(
		
		//measures dim
		new PafExcelInput.Builder(this.getWorkbook(), this.getSheetName(), 28)
			.headerListMap(this.getHeaderListMap())
			.excludeHeaderRows(true)
			.excludeEmptyRows(true)
			.multiDataRow(true)
			.startDataReadColumnIndex(27)
			.sheetRequired(false)
			.endOfSheetIdnt(ExcelPaceProjectConstants.END_OF_SHEET_IDENT)
			.build(),
			
		//time dim
		new PafExcelInput.Builder(this.getWorkbook(), this.getSheetName(), 30)
			.headerListMap(this.getHeaderListMap())
			.excludeHeaderRows(true)
			.excludeEmptyRows(true)
			.multiDataRow(true)
			.startDataReadColumnIndex(29)
			.sheetRequired(false)
			.endOfSheetIdnt(ExcelPaceProjectConstants.END_OF_SHEET_IDENT)
			.build(),
			
		//plan type dim
		new PafExcelInput.Builder(this.getWorkbook(), this.getSheetName(), 31)
				.headerListMap(this.getHeaderListMap())
				.excludeHeaderRows(true)
				.excludeEmptyRows(true)
				.multiDataRow(true)
				.startDataReadColumnIndex(30)
				.sheetRequired(false)
				.endOfSheetIdnt(ExcelPaceProjectConstants.END_OF_SHEET_IDENT)
				.build(),
				
		//versions dim
		new PafExcelInput.Builder(this.getWorkbook(), this.getSheetName(), 32)
				.headerListMap(this.getHeaderListMap())
				.excludeHeaderRows(true)
				.excludeEmptyRows(true)
				.multiDataRow(true)
				.startDataReadColumnIndex(31)
				.sheetRequired(false)
				.endOfSheetIdnt(ExcelPaceProjectConstants.END_OF_SHEET_IDENT)
				.build(),
				
		//year dim
		new PafExcelInput.Builder(this.getWorkbook(), this.getSheetName(), 33)
				.headerListMap(this.getHeaderListMap())
				.excludeHeaderRows(true)
				.excludeEmptyRows(true)
				.multiDataRow(true)
				.startDataReadColumnIndex(32)
				.sheetRequired(false)
				.endOfSheetIdnt(ExcelPaceProjectConstants.END_OF_SHEET_IDENT)
				.build(),
				
		//hier dims
		new PafExcelInput.Builder(this.getWorkbook(), this.getSheetName(), 34)
				.headerListMap(this.getHeaderListMap())
				.excludeHeaderRows(true)
				.excludeEmptyRows(true)
				.multiDataRow(true)
				.startDataReadColumnIndex(33)
				.sheetRequired(false)
				.endOfSheetIdnt(ExcelPaceProjectConstants.END_OF_SHEET_IDENT)
				.build()
			
		
		);
	
		try {			
			
			for (PafExcelInput input : inputList ) {
						
				Map<String, String> tmpDynamicRefMap = PafExcelUtil.createCellReferenceMap(input);
				
				if ( tmpDynamicRefMap != null)  {
					
					dynamicRefMap.putAll(tmpDynamicRefMap);
					
				}
			
			}
			
			
		} catch (PafException e) {
									
			logger.warn(ExcelPaceProjectConstants.COULD_NOT_CREATE_THE_REFERENCE_MAP + e.getMessage());
			
		}
		
		if ( dynamicRefMap.size() == 0 ) {
			
			dynamicRefMap = null;
			
		}
		
		return dynamicRefMap;		
		
		
	}
	
}
