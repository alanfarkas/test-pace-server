/*
 *	File: @(#)VersionsExcelElementItem.java 	Package: com.pace.base.project.excel.elements 	Project: Paf Base Libraries
 *	Created: Jan 8, 2010  		By: jmilliron
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
import com.pace.base.project.*;
import com.pace.base.project.excel.IExcelDynamicReferenceElementItem;
import com.pace.base.project.excel.PafExcelInput;
import com.pace.base.project.excel.PafExcelRow;
import com.pace.base.project.excel.PafExcelValueObject;
import com.pace.base.project.utils.PafExcelUtil;
import com.pace.base.utility.CollectionsUtil;
import com.pace.base.view.PafNumberFormat;

/**
 * Reads/writes versions from/to an Excel 2007 workbook.
 *
 * @author jmilliron
 * @version	1.00
 *
 */
public class VersionsExcelElementItem<T extends List<VersionDef>> extends PafExcelElementItem<T> implements IExcelDynamicReferenceElementItem {

	/**
	 * Creates an excel element item. Mainly used for reading versions.
	 * 
	 * @param workbook workbook used for read/write
	 */
	public VersionsExcelElementItem(Workbook workbook) {
		super(workbook);
	}
	
	/**
	 * Creates an excel element item. Mainly used for writing versions.
	 * 
	 * @param workbook workbook used for read/write
	 * @param isCellReferencingEnabled true if cell referencing is enabled
	 */
	public VersionsExcelElementItem(Workbook workbook,
			boolean isCellReferencingEnabled) {
		super(workbook, isCellReferencingEnabled);
	}



	@Override
	protected void createHeaderListMapEntries() {

		getHeaderListMap().put(getSheetName(), Arrays.asList("name", "type", "base version", "compare version", "variance type", "compare dimension", "compare member list", "numeric format name"));

	}

	@Override
	public ProjectElementId getProjectElementId() {
		return ProjectElementId.Versions;
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
				.multiDataRow(true)
				.build();

		List<PafExcelRow> versionExcelRowList = PafExcelUtil.readExcelSheet(input);
		
		List<VersionDef> versionDefList = new ArrayList<VersionDef>();
				
		VersionDef vd = null;
		
		for ( PafExcelRow row : versionExcelRowList ) {
		
			vd = new VersionDef();
			
			for ( Integer rowIndex : row.getRowItemOrderedIndexes()) {
			
			List<PafExcelValueObject> rowItemList = row.getRowItem(rowIndex);
			
			PafExcelValueObject firstValueObject = rowItemList.get(0);
			
			try {
				
				switch (rowIndex) {
					
					//name
					case 0:	
					
						vd.setName(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true));
						break;
					
					//version type
					case 1:						
								
						String versionType = PafExcelUtil.getString(getProjectElementId(), firstValueObject, true, Arrays.asList(ExcelPaceProjectConstants.VERSION_TYPE_MAP.keySet().toArray(new String[0])));
																
						if ( versionType != null ) {
						
							versionType = CollectionsUtil.getCaseSenstiveKeyFromMap(ExcelPaceProjectConstants.VERSION_TYPE_MAP, versionType);
							
							if ( versionType != null && ExcelPaceProjectConstants.VERSION_TYPE_MAP.containsKey(versionType)) {
								
								vd.setType(ExcelPaceProjectConstants.VERSION_TYPE_MAP.get(versionType));
								
							}
						
						}
						
						break;
						
					//alias key and value
					/*REMOVED for TTN-138
					case 2:			
					case 3:		
					
						if ( rowIndex == 2 ) {
						
						List<PafExcelValueObject> aliasExclueValueList = row.getRowItem(rowIndex + 1);
						
						if ( rowItemList.size() == aliasExclueValueList.size() && rowItemList.size() > 0 && aliasExclueValueList.size() > 0 ) {								
							
							Map<String, String> aliasMap = new HashMap<String, String>();
							
							for (int i = 0; i < rowItemList.size(); i++) {									
								
								if ( rowItemList.get(i).isBlank() && aliasExclueValueList.get(i).isBlank()) {
									
									continue;
									
								} else if ( rowItemList.get(i).isBlank() && aliasExclueValueList.get(i).isBlank() ) {
									
									if ( rowItemList.get(i).isBlank() ) {
										
										addProjectDataErrorToList(ProjectDataError.createMissingKeyProjectDataError(getProjectElementId(), rowItemList.get(i)));
										
									} else if ( aliasExclueValueList.get(i).isBlank() ) {
										
										addProjectDataErrorToList(ProjectDataError.createMissingValueProjectDataError(getProjectElementId(), aliasExclueValueList.get(i)));
										
									}
									
								} else {
									
									aliasMap.put(rowItemList.get(i).getValueAsString(), aliasExclueValueList.get(i).getValueAsString());
									
								}
								
								
							}			
							
							if ( aliasMap.size() > 0 ) {
								
								vd.setAliases(aliasMap);
								
							}
							
						}							
						
						}					
						
						break;
					*/
						
					//base version	
					case 2:			
																	
						if ( ! firstValueObject.isBlank() ) {
					
							VersionFormula vf = new VersionFormula();
							vf.setBaseVersion(PafExcelUtil.getString(getProjectElementId(), firstValueObject));
							vd.setVersionFormula(vf);
						
						}
						break;
					
					//compare version
					case 3:
																	
						if ( vd.getVersionFormula() != null ) {
							
							VersionFormula vf = vd.getVersionFormula();							
							vf.setCompareVersion(PafExcelUtil.getString(getProjectElementId(), firstValueObject));
							vd.setVersionFormula(vf);
							
						}
						
						break;
						
					//variance type
					case 4:
						
						if ( vd.getVersionFormula() != null ) {
							
							VersionFormula vf = vd.getVersionFormula();
											
							Map<String, VersionVarianceType> validOptionsMap = ExcelPaceProjectConstants.VERSION_VARIANCE_TYPE_MAP;
							
							String versionVarType = PafExcelUtil.getString(getProjectElementId(), firstValueObject, false, Arrays.asList(validOptionsMap.keySet().toArray(new String[0])));
							
							if ( versionVarType != null ) {
							
								versionVarType = CollectionsUtil.getCaseSenstiveKeyFromMap(validOptionsMap, versionVarType);
								
								if ( versionVarType != null && validOptionsMap.containsKey(versionVarType)) {
									
									vf.setVarianceType(validOptionsMap.get(versionVarType));
									
									vd.setVersionFormula(vf);
									
								}
							
							}		
							
						}
						
						break;
						
					case 5:
					case 6:
					
						if ( vd.getVersionFormula() != null ) {
						
							if ( rowIndex == 5 && rowItemList.size() > 0 && row.getRowItem(rowIndex + 1).size() > 0) {
														
								Map<PafExcelValueObject, List<PafExcelValueObject>> valueObjectMap = CollectionsUtil.createMapFromLists(PafExcelUtil.convertBlanksToNullInList(rowItemList), row.getRowItem(rowIndex+1));
								
								List<PafDimSpec> pafDimSpecList = new ArrayList<PafDimSpec>();
								
								for (PafExcelValueObject keyValueObject : valueObjectMap.keySet() ) {
									
									//if not string or formula
									if ( ! keyValueObject.isString() && ! keyValueObject.isFormula() ) {
										
										addProjectDataErrorToList(ProjectDataError.createInvalidValueProjectDataError(getProjectElementId(), keyValueObject));
										
									} else {
										
										String keyString = keyValueObject.getValueAsString();
								
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
									
									VersionFormula vf = vd.getVersionFormula();
									
									vf.setCompareIsSpec(pafDimSpecList.toArray(new PafDimSpec[0]));
									
									vd.setVersionFormula(vf);
									
								}
								
							}
						}
						
						break;
					
					case 7:
										
						vd.setNumericFormatName(PafExcelUtil.getString(getProjectElementId(), firstValueObject));
						break;						
					
				}
				
			} catch (ExcelProjectDataErrorException epdee) {
			
				addProjectDataErrorToList(epdee.getProjectDataError());
				
			}
		
		
		}
		
		versionDefList.add(vd);
		
		}		
		
		return (T) versionDefList;
	}

	@Override
	protected void writeExcelSheet(T t) throws PaceProjectWriteException, PafException {

		Map<String, String> numericFormatDynamicRefMap = null;
		Map<String, String> versionDynamicRefMap = null;
		Map<String, String> dimensionRefMap = null;
		
		//if cell referencing is enabled, read in versions
		if ( isCellReferencingEnabled() ) {			
			
			IExcelDynamicReferenceElementItem numericFormatElementItem = new NumericFormatsExcelElementItem<Map<String,PafNumberFormat>>(getWorkbook());
			numericFormatDynamicRefMap = numericFormatElementItem.getDynamicReferenceMap();
			
			this.setCellReferencingEnabled(false);
			
			//1st write out model in order to get correct references
			this.write(t);
			
			//2nd read in dynamic ref map
			versionDynamicRefMap = this.getDynamicReferenceMap();
			
			this.setCellReferencingEnabled(true);
			
			//dimension name refs
			IExcelDynamicReferenceElementItem appDefElementItem = new ApplicationDefExcelElementItem<List<PafApplicationDef>>(getWorkbook());
			dimensionRefMap = appDefElementItem.getDynamicReferenceMap();
			
		}
		

		PafExcelInput input = new PafExcelInput.Builder(getWorkbook(), getSheetName(), getHeaderListMap().get(getSheetName()).size())
			.endOfSheetIdnt(ExcelPaceProjectConstants.END_OF_SHEET_IDENT)
			.build();
		
		
		List<VersionDef> versionList = t;
		
		List<PafExcelRow> excelRowList = new ArrayList<PafExcelRow>();

		//create and add header to list
		excelRowList.add(PafExcelUtil.createHeaderRow(getHeaderListMap().get(getSheetName())));
		
		if ( versionList != null ) {
			
			for ( VersionDef vd : versionList ) {
				
				PafExcelRow excelRow = new PafExcelRow();
				
				//name
				excelRow.addRowItem(0, PafExcelValueObject.createFromString(vd.getName()));

				//type
				if ( vd.getType() != null ) {
					
					excelRow.addRowItem(1, PafExcelValueObject.createFromString(vd.getType().toString()));
					
				}
				
				/*REMOVED FOR TTN-1438
				//alias table name and alias value
				Map<String, String> aliasTableMap = vd.getAliases();
				
				if ( aliasTableMap != null ) {
				
					for (String aliasTableName : aliasTableMap.keySet() ) {
						
						excelRow.addRowItem(2, PafExcelValueObject.createFromString(aliasTableName));
						excelRow.addRowItem(3, PafExcelValueObject.createFromString(aliasTableMap.get(aliasTableName)));
						
					}
					
					
				}			
				*/
				
				if ( vd.getVersionFormula() != null ) {

					VersionFormula vf = vd.getVersionFormula();
					
					//base version
					excelRow.addRowItem(2, PafExcelValueObject.createFromFormulaReferenceMap(vf.getBaseVersion(), versionDynamicRefMap));
					
					//compare version					
					excelRow.addRowItem(3, PafExcelValueObject.createFromFormulaReferenceMap(vf.getCompareVersion(), versionDynamicRefMap));
														
					//type
					if ( vf.getVarianceType() != null ) {
						
						excelRow.addRowItem(4, PafExcelValueObject.createFromString(vf.getVarianceType().toString()));
						
					}
					
					if ( vf.getCompareIsSpec() != null) {
						
						for (PafDimSpec pafDimSpec : vf.getCompareIsSpec() ) {
							
							String dimension = pafDimSpec.getDimension();
							
							if ( pafDimSpec.getExpressionList() != null) {
								
								for (int i = 0; i < pafDimSpec.getExpressionList().length; i++) {
									
									if ( i == 0 ) {
										
										excelRow.addRowItem(5, PafExcelValueObject.createFromFormulaReferenceMap(dimension, dimensionRefMap));
										
									} else {
										
										excelRow.addRowItem(5, PafExcelValueObject.createBlank());
										
									}
									
									excelRow.addRowItem(6, PafExcelValueObject.createFromString(pafDimSpec.getExpressionList()[i]));
									
								}
								
							}
							
						}
						
					}
					
				}
				
				//numeric format name
				excelRow.addRowItem(7, PafExcelValueObject.createFromFormulaReferenceMap(vd.getNumericFormatName(), numericFormatDynamicRefMap));
								
				excelRowList.add(excelRow);			
				
			}
			
		}		
			
		PafExcelUtil.writeExcelSheet(input, excelRowList);
					
	}

	/**
	 * Creates a dynamic reference map used to reference version cells.  Key is version name, value
	 * is the Excel sheet/cell reference.  Example =Versions!$A$2.
	 */
	public Map<String, String> getDynamicReferenceMap() {

		Map<String, String> dynamicRefMap = null;
		
		PafExcelInput versionInput = new PafExcelInput.Builder(this.getWorkbook(), this.getSheetName(), 1)
			.headerListMap(this.getHeaderListMap())
			.excludeHeaderRows(true)
			.excludeEmptyRows(true)
			.multiDataRow(true)
			.startDataReadColumnIndex(0)
			.sheetRequired(false)
			.endOfSheetIdnt(ExcelPaceProjectConstants.END_OF_SHEET_IDENT)
			.build();
	
		try {
			
			dynamicRefMap = PafExcelUtil.createCellReferenceMap(versionInput);
			
		} catch (PafException e) {
									
			logger.warn(ExcelPaceProjectConstants.COULD_NOT_CREATE_THE_REFERENCE_MAP + e.getMessage());
			
		}
		
		return dynamicRefMap;		

	}

}
