/*
 *	File: @(#)NumericFormatsExcelElementItem.java 	Package: com.palladium.paf.project.excel.elements 	Project: Paf Base Libraries
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
import com.palladium.paf.project.ExcelPaceProjectConstants;
import com.palladium.paf.project.ExcelProjectDataErrorException;
import com.palladium.paf.project.PaceProjectReadException;
import com.palladium.paf.project.PaceProjectWriteException;
import com.palladium.paf.project.ProjectElementId;
import com.palladium.paf.project.excel.IExcelDynamicReferenceElementItem;
import com.palladium.paf.project.excel.PafExcelInput;
import com.palladium.paf.project.excel.PafExcelRow;
import com.palladium.paf.project.excel.PafExcelValueObject;
import com.palladium.paf.project.utils.PafExcelUtil;
import com.palladium.paf.view.PafNumberFormat;

/**
 * Reads/writes numeric formats from/to an Excel 2007 workbook.
 *
 * @author jmilliron
 * @version	1.00
 *
 */
public class NumericFormatsExcelElementItem<T extends Map<String, PafNumberFormat>> extends PafExcelElementItem<T> implements IExcelDynamicReferenceElementItem {

	/**
	 * Creates an excel element item.
	 * 
	 * @param workbook workbook used for read/write
	 */
	public NumericFormatsExcelElementItem(Workbook workbook) {
		super(workbook);
	}

	@Override
	protected void createHeaderListMapEntries() {

		getHeaderListMap().put(getSheetName(), Arrays.asList("name", "pattern", "is default format"));
		
	}

	@Override
	public ProjectElementId getProjectElementId() {
		return ProjectElementId.NumericFormats;
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

		Map<String, PafNumberFormat> numericFormatMap = new HashMap<String, PafNumberFormat>();

		PafNumberFormat nf = null;

		for (PafExcelRow row : excelRowList) {

			nf = new PafNumberFormat();

			for (Integer rowIndex : row.getRowItemOrderedIndexes()) {

				List<PafExcelValueObject> rowItemList = row
						.getRowItem(rowIndex);

				PafExcelValueObject firstValueObject = rowItemList.get(0);

				try { 
				
					switch (rowIndex) {

					// name
					case 0:

						nf.setName(PafExcelUtil.getString(getProjectElementId(),
								firstValueObject, true));

						break;

					// pattern
					case 1:

						nf.setPattern(PafExcelUtil.getString(getProjectElementId(),
								firstValueObject, true));

						break;
					// is defualt format
					case 2:

						nf.setDefaultFormat(PafExcelUtil.getBoolean(
								getProjectElementId(), firstValueObject, true));

						break;
					}
				
				} catch (ExcelProjectDataErrorException epdee) {
					
					addProjectDataErrorToList(epdee.getProjectDataError());
					
				}

			}

			// if required vars are there, add to map
			if (nf.getName() != null && nf.getPattern() != null) {

				numericFormatMap.put(nf.getName(), nf);

			}

		}
			
		return (T) numericFormatMap;
		
		
	}

	@Override
	protected void writeExcelSheet(T t) throws PaceProjectWriteException, PafException {

		PafExcelInput input = new PafExcelInput.Builder(getWorkbook(), getSheetName(), getHeaderListMap().get(getSheetName()).size())
			.endOfSheetIdnt(ExcelPaceProjectConstants.END_OF_SHEET_IDENT)
			.build();
		
		
		Map<String, PafNumberFormat> numericFormatMap = t;
		
		List<PafExcelRow> excelRowList = new ArrayList<PafExcelRow>();

		//create and add header to list
		excelRowList.add(PafExcelUtil.createHeaderRow(getHeaderListMap().get(getSheetName())));
		
		if ( numericFormatMap != null ) {
			
			for ( String numericFormatName : numericFormatMap.keySet() ) {
				
				PafNumberFormat pafNumericFormat = numericFormatMap.get(numericFormatName);
				
				PafExcelRow excelRow = new PafExcelRow();
				
				//name
				excelRow.addRowItem(0, PafExcelValueObject.createFromString(pafNumericFormat.getName()));
				
				//pattern
				excelRow.addRowItem(1, PafExcelValueObject.createFromString(pafNumericFormat.getPattern()));
				
				//is default format
				excelRow.addRowItem(2, PafExcelValueObject.createFromBoolean(pafNumericFormat.isDefaultFormat()));
								
				excelRowList.add(excelRow);			
				
			}
			
		}
					
		PafExcelUtil.writeExcelSheet(input, excelRowList);
				
	}

	/**
	 * Creates a dynamic reference map used to reference numeric format cells.  Key is numeric format name, value
	 * is the Excel sheet/cell reference.  Example =NumericFormats!$A$2.
	 */
	public Map<String, String> getDynamicReferenceMap() {

		Map<String, String> dynamicRefMap = null;
		
		PafExcelInput versionInput = new PafExcelInput.Builder(this.getWorkbook(), this.getSheetName(), 1)
			.headerListMap(this.getHeaderListMap())
			.excludeHeaderRows(true)
			.excludeEmptyRows(true)
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
