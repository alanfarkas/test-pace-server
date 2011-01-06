/*
 *	File: @(#)UserSelectionsExcelElementItem.java 	Package: com.palladium.paf.project.excel.elements 	Project: Paf Base Libraries
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
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Workbook;

import com.palladium.paf.PafException;
import com.palladium.paf.app.PafApplicationDef;
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
import com.palladium.paf.view.PafUserSelection;

/**
 * Reads/writes user selections from/to an Excel 2007 workbook.
 *
 * @author jmilliron
 * @version	1.00
 *
 */
public class UserSelectionsExcelElementItem<T extends List<PafUserSelection>> extends PafExcelElementItem<T> {

	/**
	 * Creates an excel element item.
	 * 
	 * @param workbook workbook used for read/write
	 */
	public UserSelectionsExcelElementItem(Workbook workbook) {
		super(workbook);
	}
	
	/**
	 * Creates an excel element item. Mainly used for writing user selections.
	 * 
	 * @param workbook workbook used for read/write
	 * @param isCellReferencingEnabled true if cell referencing is enabled
	 */
	public UserSelectionsExcelElementItem(Workbook workbook,
			boolean isCellReferencingEnabled) {
		super(workbook, isCellReferencingEnabled);
	
	}	

	@Override
	protected void createHeaderListMapEntries() {

		getHeaderListMap().put(getSheetName(), Arrays.asList("name", "dimension", "allow multiple selection", "prompt string"));
		
	}

	@Override
	public ProjectElementId getProjectElementId() {
		return ProjectElementId.UserSelections;
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
		
		List<PafUserSelection> userSelectionList = new ArrayList<PafUserSelection>();
				
		PafUserSelection userSel = null;
		
		for ( PafExcelRow row : excelRowList ) {
		
			userSel = new PafUserSelection();
			
			for ( Integer rowIndex : row.getRowItemOrderedIndexes()) {
			
				List<PafExcelValueObject> rowItemList = row.getRowItem(rowIndex);
				
				PafExcelValueObject firstValueObject = rowItemList.get(0);
			
				try {
				
				switch (rowIndex) {
				
					//name
					case 0:											
					
						userSel.setId(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true));
						break;
					
					//version type
					case 1:						
					
						userSel.setDimension(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true));
						break;
					
					//allow multiple selection
					case 2:	
					
						userSel.setMultiples(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject, true));
						break;

					//prompt string
					case 3:		
					
						userSel.setPromptString(PafExcelUtil.getString(getProjectElementId(), firstValueObject));
						break;
					
					
					}
				
				} catch (ExcelProjectDataErrorException epdee) {
					
					addProjectDataErrorToList(epdee.getProjectDataError());
					
				}
			
			
			}
		
		userSelectionList.add(userSel);
		
		}
		
		return (T) userSelectionList;
		
	}

	@Override
	protected void writeExcelSheet(T t) throws PaceProjectWriteException, PafException {

		Map<String, String> dimensionRefMap = null;
		
		//if cell referencing is enabled, read in global styles
		if ( isCellReferencingEnabled() ) {			
			
			//dimension name refs
			IExcelDynamicReferenceElementItem appDefElementItem = new ApplicationDefExcelElementItem<List<PafApplicationDef>>(getWorkbook());
			dimensionRefMap = appDefElementItem.getDynamicReferenceMap();
			
		}
		
		PafExcelInput input = new PafExcelInput.Builder(getWorkbook(), getSheetName(), getHeaderListMap().get(getSheetName()).size())
			.endOfSheetIdnt(ExcelPaceProjectConstants.END_OF_SHEET_IDENT)
			.build();	
	
		List<PafUserSelection> userSelectionList = t;
		
		List<PafExcelRow> excelRowList = new ArrayList<PafExcelRow>();
	
		//create and add header to list
		excelRowList.add(PafExcelUtil.createHeaderRow(getHeaderListMap().get(getSheetName())));
		
		if ( userSelectionList != null ) {
			
			for ( PafUserSelection userSelection : userSelectionList ) {
				
				PafExcelRow excelRow = new PafExcelRow();
				
				//name
				excelRow.addRowItem(0, PafExcelValueObject.createFromString(userSelection.getId()));
				
				//dimension
				excelRow.addRowItem(1, PafExcelValueObject.createFromFormulaReferenceMap(userSelection.getDimension(), dimensionRefMap));
								
				//allow multiple selection
				excelRow.addRowItem(2, PafExcelValueObject.createFromBoolean(userSelection.isMultiples()));				
				
				//prompt string
				excelRow.addRowItem(3, PafExcelValueObject.createFromString(userSelection.getPromptString()));
				
				excelRowList.add(excelRow);			
				
			}
			
		}	
			
		PafExcelUtil.writeExcelSheet(input, excelRowList);
		
	}	

}
