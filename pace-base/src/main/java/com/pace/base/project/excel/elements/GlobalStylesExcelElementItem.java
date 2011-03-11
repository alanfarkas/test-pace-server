/*
 *	File: @(#)GlobalStylesExcelElementItem.java 	Package: com.pace.base.project.excel.elements 	Project: Paf Base Libraries
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
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Workbook;

import com.pace.base.PafException;
import com.pace.base.project.*;
import com.pace.base.project.excel.IExcelDynamicReferenceElementItem;
import com.pace.base.project.excel.PafExcelInput;
import com.pace.base.project.excel.PafExcelRow;
import com.pace.base.project.excel.PafExcelValueObject;
import com.pace.base.project.utils.PafExcelUtil;
import com.pace.base.view.PafAlignment;
import com.pace.base.view.PafStyle;

/**
 * Reads/writes global styles from/to an Excel 2007 workbook.
 *
 * @author jmilliron
 * @version	1.00
 *
 */
public class GlobalStylesExcelElementItem<T extends Map<String, PafStyle>> extends PafExcelElementItem<T> implements IExcelDynamicReferenceElementItem {

	/**
	 * Creates an excel element item.
	 * 
	 * @param workbook workbook used for read/write
	 */
	public GlobalStylesExcelElementItem(Workbook workbook) {
		super(workbook);
	}

	@Override
	public void createHeaderListMapEntries() {
	
		getHeaderListMap().put(getSheetName(), Arrays.asList("name", "font name", "font color", "font size", "font alignment", "font bold", "font italic", "font strikeout", "font underline", "font double underline", "background fill color"));
		
	}

	@Override
	public ProjectElementId getProjectElementId() {
		
		return ProjectElementId.GlobalStyles;
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

		List<PafExcelRow> excelRowList = null;

		Map<String, PafStyle> pafStyleMap = new HashMap<String, PafStyle>();
		

			excelRowList = PafExcelUtil.readExcelSheet(input);
			
			PafStyle mapEntry = null;

			for (PafExcelRow row : excelRowList) {

				mapEntry = new PafStyle();

				for (Integer rowIndex : row.getRowItemOrderedIndexes()) {

					List<PafExcelValueObject> rowItemList = row
							.getRowItem(rowIndex);

					PafExcelValueObject firstValueObject = rowItemList.get(0);

					try {
						
						switch (rowIndex) {
	
						// name
						case 0:
	
							mapEntry.setName(PafExcelUtil.getString(
									getProjectElementId(), firstValueObject, true));
	
							break;
	
						// font name
						case 1:
	
							mapEntry.setFontName(PafExcelUtil.getString(
									getProjectElementId(), firstValueObject));
	
							break;
						// font color
						case 2:
	
							mapEntry.setFontHexColor(PafExcelUtil.getHexNumber(getProjectElementId(),
									firstValueObject));
	
							break;
						case 3:
	
							mapEntry.setSize(PafExcelUtil.getInteger(getProjectElementId(),
									firstValueObject));
	
							break;
						// font alignment
						case 4:
	
							if (!firstValueObject.isBlank()) {
	
								if (firstValueObject.isString()) {
	
									String fontAlignment = firstValueObject
											.getString();
	
									PafAlignment alignment = null;
	
									for (String fontAlignmentOption : ExcelPaceProjectConstants.VALID_FONT_ALIGNMENT_LIST) {
	
										if (fontAlignmentOption
												.equalsIgnoreCase(fontAlignment)) {
	
											alignment = new PafAlignment();
	
											alignment.setValue(fontAlignmentOption);
	
											break;
										}
	
									}
	
									if (alignment != null) {
	
										mapEntry.setAlignment(alignment);
	
									} else {
	
										addProjectDataErrorToList(ProjectDataError.createInvalidValueProjectDataError(
												getProjectElementId(), firstValueObject,
												ExcelPaceProjectConstants.VALID_FONT_ALIGNMENT_LIST));
	
									}
	
								} else {
	
									addProjectDataErrorToList(new ProjectDataError(
											getProjectElementId(), firstValueObject,
											ExcelPaceProjectConstants.INVALID_VALUE + firstValueObject.getValueAsString()));
											
								}
	
							}
	
							break;
						// bold, italic, strikeout, underline, double underline
						case 5:
							mapEntry.setBold(PafExcelUtil.getBoolean(
									getProjectElementId(), firstValueObject));
							break;
						case 6:
							mapEntry.setItalics(PafExcelUtil.getBoolean(
									getProjectElementId(), firstValueObject));
							break;
						case 7:
							mapEntry.setStrikeOut(PafExcelUtil.getBoolean(
									getProjectElementId(), firstValueObject));
							break;
						case 8:
							mapEntry.setUnderline(PafExcelUtil.getBoolean(
									getProjectElementId(), firstValueObject));
							break;
						case 9:
							mapEntry.setDoubleUnderline(PafExcelUtil.getBoolean(
									getProjectElementId(), firstValueObject));
							break;
	
						// bg fill color
						case 10:
	
							mapEntry.setBgHexFillColor(PafExcelUtil.getHexNumber(
									getProjectElementId(), firstValueObject));
	
							break;
						}
					
					} catch (ExcelProjectDataErrorException epdee) {
						
						addProjectDataErrorToList(epdee.getProjectDataError());
						
					}

				}

				// if required vars are there, add to map
				if (mapEntry.getName() != null) {

					pafStyleMap.put(mapEntry.getName(), mapEntry);

				}

			}
	
		
		return (T) pafStyleMap;
	}

	@Override
	protected void writeExcelSheet(T t) throws PaceProjectWriteException, PafException {

		PafExcelInput input = new PafExcelInput.Builder(getWorkbook(), getSheetName(), getHeaderListMap().get(getSheetName()).size())
			.excludeDefaultValuesOnWrite(false)
			.endOfSheetIdnt(ExcelPaceProjectConstants.END_OF_SHEET_IDENT)
			.build();
	
	
		Map<String, PafStyle> globalStyleMap = t;
		
		List<PafExcelRow> excelRowList = new ArrayList<PafExcelRow>();
	
		//create and add header to list
		excelRowList.add(PafExcelUtil.createHeaderRow(getHeaderListMap().get(getSheetName())));
		
		if ( globalStyleMap != null ) {
			
			for ( String numericFormatName : globalStyleMap.keySet() ) {
				
				PafStyle globalStyle = globalStyleMap.get(numericFormatName);
				
				PafExcelRow excelRow = new PafExcelRow();
				
				//name
				excelRow.addRowItem(0, PafExcelValueObject.createFromString(globalStyle.getName()));
				
				//font name
				excelRow.addRowItem(1, PafExcelValueObject.createFromString(globalStyle.getFontName()));
				
				//font color
				excelRow.addRowItem(2, PafExcelValueObject.createFromString(globalStyle.getFontHexColor()));
								
				//font size
				excelRow.addRowItem(3, PafExcelValueObject.createFromInteger(globalStyle.getSize()));
								
				//font alignment
				if ( globalStyle.getAlignment() != null ) {
					
					excelRow.addRowItem(4, PafExcelValueObject.createFromString(globalStyle.getAlignment().getValue()));
					
				} /*else {
					
					excelRow.addRowItem(4, PafExcelValueObject.createBlank());
					
				}*/
				
				//font bold
				excelRow.addRowItem(5, PafExcelValueObject.createFromBoolean(globalStyle.getBold()));
				
				//font italic
				excelRow.addRowItem(6, PafExcelValueObject.createFromBoolean(globalStyle.getItalics()));
				
				//font strikeout
				excelRow.addRowItem(7, PafExcelValueObject.createFromBoolean(globalStyle.getStrikeOut()));
				
				//font underline
				excelRow.addRowItem(8, PafExcelValueObject.createFromBoolean(globalStyle.getUnderline()));
				
				//font double underline
				excelRow.addRowItem(9, PafExcelValueObject.createFromBoolean(globalStyle.getDoubleUnderline()));
				
				//background fill color
				excelRow.addRowItem(10, PafExcelValueObject.createFromString(globalStyle.getBgHexFillColor()));
				
				excelRowList.add(excelRow);			
				
			}
			
		}
					
		PafExcelUtil.writeExcelSheet(input, excelRowList);
							
	}

	/**
	 * Creates a dynamic reference map used to reference global style cells.  Key is global style name, value
	 * is the Excel sheet/cell reference.  Example =GlobalStyles!$A$2.
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
