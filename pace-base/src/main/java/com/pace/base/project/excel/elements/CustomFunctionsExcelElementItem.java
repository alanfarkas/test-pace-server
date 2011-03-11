/*
 *	File: @(#)CustomFunctionsExcelElementItem.java 	Package: com.pace.base.project.excel.elements 	Project: Paf Base Libraries
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
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;

import com.pace.base.PafException;
import com.pace.base.funcs.CustomFunctionDef;
import com.pace.base.project.*;
import com.pace.base.project.excel.PafExcelInput;
import com.pace.base.project.excel.PafExcelRow;
import com.pace.base.project.excel.PafExcelValueObject;
import com.pace.base.project.utils.PafExcelUtil;

/**
 * Reads/writes custom functions from/to an Excel 2007 workbook.
 *
 * @author jmilliron
 * @version	1.00
 *
 */
public class CustomFunctionsExcelElementItem<T extends List<CustomFunctionDef>> extends PafExcelElementItem<T> {

	/**
	 * Creates an excel element item.
	 * 
	 * @param workbook workbook used for read/write
	 */
	public CustomFunctionsExcelElementItem(Workbook workbook) {
		super(workbook);

	}
		
	@Override
	protected void createHeaderListMapEntries() {

		getHeaderListMap().put(getSheetName(), Arrays.asList("class name", "function name"));
												

	}

	@Override
	public ProjectElementId getProjectElementId() {
		return ProjectElementId.CustomFunctions;
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
		
		List<CustomFunctionDef> customFunctionList = new ArrayList<CustomFunctionDef>();
				
		CustomFunctionDef customFunction = null;
		
		for ( PafExcelRow row : excelRowList ) {
		
			customFunction = new CustomFunctionDef();
			
			for ( Integer rowIndex : row.getRowItemOrderedIndexes()) {
			
				List<PafExcelValueObject> rowItemList = row.getRowItem(rowIndex);
				
				PafExcelValueObject firstValueObject = rowItemList.get(0);
			
				try {
				
					switch (rowIndex) {
					
						//key
						case 0:											
						
							customFunction.setClassName(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true));
							break;
						
						//caption
						case 1:						
													
							customFunction.setFunctionName(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true));	
							break;
												
						}			
					
					
					} catch (ExcelProjectDataErrorException epdee) {
						
						addProjectDataErrorToList(epdee.getProjectDataError());
						
					}
			
			
			}
		
		customFunctionList.add(customFunction);
		
		}
		
		return (T) customFunctionList;
		
	}

	@Override
	protected void writeExcelSheet(T t) throws PaceProjectWriteException, PafException {

		PafExcelInput input = new PafExcelInput.Builder(getWorkbook(), getSheetName(), getHeaderListMap().get(getSheetName()).size())
		.endOfSheetIdnt(ExcelPaceProjectConstants.END_OF_SHEET_IDENT)
		.build();
	
		List<CustomFunctionDef> customFunctionList = t;
		
		List<PafExcelRow> excelRowList = new ArrayList<PafExcelRow>();
	
		//create and add header to list
		excelRowList.add(PafExcelUtil.createHeaderRow(getHeaderListMap().get(getSheetName())));
		
		if ( customFunctionList != null ) {
			
			for ( CustomFunctionDef customFunction : customFunctionList ) {
				
				PafExcelRow excelRow = new PafExcelRow();
				
				//class name
				excelRow.addRowItem(0, PafExcelValueObject.createFromString(customFunction.getClassName()));
				
				//function name
				excelRow.addRowItem(1, PafExcelValueObject.createFromString(customFunction.getFunctionName()));
				
				excelRowList.add(excelRow);			
				
			}
			
		}	
			
		PafExcelUtil.writeExcelSheet(input, excelRowList);
		
	}
}
