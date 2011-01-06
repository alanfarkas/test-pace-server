/*
 *	File: @(#)MeasureDefsExcelElementItem.java 	Package: com.palladium.paf.project.excel.elements 	Project: Paf Base Libraries
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
package com.palladium.paf.project.excel.elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Workbook;

import com.palladium.paf.PafException;
import com.palladium.paf.app.MeasureDef;
import com.palladium.paf.app.MeasureType;
import com.palladium.paf.app.VarRptgFlag;
import com.palladium.paf.project.ExcelPaceProjectConstants;
import com.palladium.paf.project.ExcelProjectDataErrorException;
import com.palladium.paf.project.PaceProjectReadException;
import com.palladium.paf.project.PaceProjectWriteException;
import com.palladium.paf.project.ProjectDataError;
import com.palladium.paf.project.ProjectElementId;
import com.palladium.paf.project.excel.IExcelDynamicReferenceElementItem;
import com.palladium.paf.project.excel.PafExcelInput;
import com.palladium.paf.project.excel.PafExcelRow;
import com.palladium.paf.project.excel.PafExcelValueObject;
import com.palladium.paf.project.utils.PafExcelUtil;
import com.palladium.paf.view.PafNumberFormat;
import com.palladium.utility.CollectionsUtil;

/**
 * Reads/writes measures from/to an Excel 2007 workbook.
 *
 * @author jmilliron
 * @version	1.00
 *
 */
public class MeasuresExcelElementItem<T extends List<MeasureDef>> extends
		PafExcelElementItem<T> implements IExcelDynamicReferenceElementItem {

	/**
	 * Creates an excel element item. Mainly used for reading measures.
	 * 
	 * @param workbook workbook used for read/write
	 */
	public MeasuresExcelElementItem(Workbook workbook) {
		super(workbook);
	}
	
	/**
	 * Creates an excel element item. Mainly used for writing measures.
	 * 
	 * @param workbook workbook used for read/write
	 * @param isCellReferencingEnabled true if cell referencing is enabled
	 */
	public MeasuresExcelElementItem(Workbook workbook,
			boolean isCellReferencingEnabled) {
		super(workbook, isCellReferencingEnabled);
	}



	@Override
	protected void createHeaderListMapEntries() {

		getHeaderListMap().put(getSheetName(), Arrays.asList("name", "type", "numeric format name", "var report flag", "plannable"));

	}

	@Override
	public ProjectElementId getProjectElementId() {
		return ProjectElementId.Measures;
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

		List<PafExcelRow> excelRowList = PafExcelUtil.readExcelSheet(input);

		List<MeasureDef> measureDefList = new ArrayList<MeasureDef>();

		MeasureDef md = null;

		for (PafExcelRow row : excelRowList) {

			md = new MeasureDef();

			for (Integer rowIndex : row.getRowItemOrderedIndexes()) {

				List<PafExcelValueObject> rowItemList = row
						.getRowItem(rowIndex);

				PafExcelValueObject firstValueObject = rowItemList.get(0);

				try {
					
					switch (rowIndex) {
	
					// name
					case 0:
	
						md.setName(PafExcelUtil.getString(getProjectElementId(),
								firstValueObject, true));
	
						break;
	
					// measure type
					case 1:
	
						Map<String, MeasureType> measureMap = ExcelPaceProjectConstants.MEASURE_TYPE_MAP;
	
						String measureType = PafExcelUtil.getString(getProjectElementId(),
								firstValueObject, true, Arrays.asList(measureMap
										.keySet().toArray(new String[0])));
	
						if (measureType != null) {
	
							measureType = CollectionsUtil
									.getCaseSenstiveKeyFromMap(measureMap,
											measureType);
	
							if (measureType != null
									&& measureMap.containsKey(measureType)) {
	
								md.setType(measureMap.get(measureType));
	
							}
	
						}
	
						break;
						
					// alias table key and value
					/*REMOVED FOR TTN-1438
					case 2:
					case 3:
	
						if (rowIndex == 2) {
	
							List<PafExcelValueObject> aliasExclueValueList = row
									.getRowItem(rowIndex + 1);
	
							if (rowItemList.size() == aliasExclueValueList.size()
									&& rowItemList.size() > 0
									&& aliasExclueValueList.size() > 0) {
	
								Map<String, String> aliasMap = new HashMap<String, String>();
	
								for (int i = 0; i < rowItemList.size(); i++) {
	
									if (rowItemList.get(i).isBlank()
											&& aliasExclueValueList.get(i)
													.isBlank()) {
	
										continue;
	
									} else if (rowItemList.get(i).isBlank()
											&& aliasExclueValueList.get(i)
													.isBlank()) {
	
										if (rowItemList.get(i).isBlank()) {
	
											addProjectDataErrorToList(ProjectDataError.createMissingKeyProjectDataError(
													getProjectElementId(), rowItemList
															.get(i)));
	
										} else if (aliasExclueValueList.get(i)
												.isBlank()) {
	
											addProjectDataErrorToList(ProjectDataError.createMissingValueProjectDataError(
													getProjectElementId(),
													aliasExclueValueList.get(i)));
	
										}
	
									} else {
	
										aliasMap.put(rowItemList.get(i)
												.getValueAsString(),
												aliasExclueValueList.get(i)
														.getValueAsString());
	
									}
	
								}
	
								if (aliasMap.size() > 0) {
	
									md.setAliases(aliasMap);
	
								}
	
							}
	
						}
	
						break;
					*/
					//numeric format name
					case 2:
	
						md.setNumericFormatName(PafExcelUtil.getString(
								getProjectElementId(), firstValueObject));
						break;
						
					//var report flag
					case 3:
	
						Map<String, VarRptgFlag> map = ExcelPaceProjectConstants.VAR_RPTG_FLAG_MAP;
	
						String varRptgFlag = PafExcelUtil.getString(getProjectElementId(),
								firstValueObject, true, Arrays.asList(map.keySet()
										.toArray(new String[0])));
	
						if (varRptgFlag != null) {
	
							varRptgFlag = CollectionsUtil
									.getCaseSenstiveKeyFromMap(map, varRptgFlag);
	
							if (varRptgFlag != null && map.containsKey(varRptgFlag)) {
	
								md.setVarRptgFlag(map.get(varRptgFlag));
	
							}
	
						}
	
						break;
						
					//is plannable
					case 4:
	
						md.setPlannable(PafExcelUtil.getBoolean(getProjectElementId(),
								firstValueObject));	
						break;
	
					//recalc TB override
					/*REMOVED FOR TTN-1441
					case 5:
	
						measureMap = ExcelPaceProjectConstants.MEASURE_TYPE_MAP;
	
						measureType = PafExcelUtil.getString(getProjectElementId(), firstValueObject,
								false, Arrays.asList(measureMap.keySet().toArray(
										new String[0])));
	
						if (measureType != null) {
	
							measureType = CollectionsUtil
									.getCaseSenstiveKeyFromMap(measureMap,
											measureType);
	
							if (measureType != null
									&& measureMap.containsKey(measureType)) {
	
								md.setRecalcTBOveride(measureMap.get(measureType));
	
							}
	
						}
	
						break;
						*/
					}
				
				} catch (ExcelProjectDataErrorException epdee) {
					
					addProjectDataErrorToList(epdee.getProjectDataError());
					
				}

			}

			measureDefList.add(md);

		}
		return (T) measureDefList;

	}

	@Override
	protected void writeExcelSheet(T t) throws PaceProjectWriteException, PafException {

		Map<String, String> numericFormatDynamicRefMap = null;
		
		//if cell referencing is enabled, read in versions
		if ( isCellReferencingEnabled() ) {			
			
			IExcelDynamicReferenceElementItem numericFormatElementItem = new NumericFormatsExcelElementItem<Map<String,PafNumberFormat>>(getWorkbook());
			numericFormatDynamicRefMap = numericFormatElementItem.getDynamicReferenceMap();
			
		}
		
		PafExcelInput input = new PafExcelInput.Builder(getWorkbook(), getSheetName(), getHeaderListMap().get(getSheetName()).size())
			//.excludeDefaultValuesOnWrite(true)
			.endOfSheetIdnt(ExcelPaceProjectConstants.END_OF_SHEET_IDENT)
			.build();
		
		
		List<MeasureDef> measureList = t;
		
		List<PafExcelRow> excelRowList = new ArrayList<PafExcelRow>();

		//create and add header to list
		excelRowList.add(PafExcelUtil.createHeaderRow(getHeaderListMap().get(getSheetName())));
		
		if ( measureList != null ) {
			
			for ( MeasureDef md : measureList ) {
				
				PafExcelRow excelRow = new PafExcelRow();
				
				//measure name
				excelRow.addRowItem(0, PafExcelValueObject.createFromString(md.getName()));

				//type
				if ( md.getType() != null ) {
					
					excelRow.addRowItem(1, PafExcelValueObject.createFromString(md.getType().toString()));
					
				}
				
				/*REMOVED FOR TTN-1438
				//alias table name and alias value
				Map<String, String> aliasTableMap = md.getAliases();
				
				if ( aliasTableMap != null ) {
				
					for (String aliasTableName : aliasTableMap.keySet() ) {
						
						excelRow.addRowItem(2, PafExcelValueObject.createFromString(aliasTableName));
						excelRow.addRowItem(3, PafExcelValueObject.createFromString(aliasTableMap.get(aliasTableName)));
						
					}
					
					
				}		
				*/		
				
				//numeric format name
				excelRow.addRowItem(2, PafExcelValueObject.createFromFormulaReferenceMap(md.getNumericFormatName(), numericFormatDynamicRefMap));
				
				
				
				//var report flag
				if ( md.getVarRptgFlag() != null) {
					
					excelRow.addRowItem(3, PafExcelValueObject.createFromString(md.getVarRptgFlag().toString()));
					
				}
				
				excelRow.addRowItem(4, PafExcelValueObject.createFromBoolean(md.getPlannable()));
				
				/*REMOVED FOR TTN-1441
				//relcalc tb override
				if ( md.getRecalcTBOveride() != null ) {
				
					excelRow.addRowItem(7, PafExcelValueObject.createFromString(md.getRecalcTBOveride().toString()));
					
				}
				*/
				
				excelRowList.add(excelRow);			
				
			}
			
		}
			
		PafExcelUtil.writeExcelSheet(input, excelRowList);
		
	}
	
	/**
	 * Creates a dynamic reference map used to reference measure cells.  Key is measure name, value
	 * is the Excel sheet/cell reference.  Example =Measures!$A$1.
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
