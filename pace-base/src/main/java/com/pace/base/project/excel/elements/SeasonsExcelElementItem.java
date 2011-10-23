/*
 *	File: @(#)SeasonsExcelElementItem.java 	Package: com.pace.base.project.excel.elements 	Project: Paf Base Libraries
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
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Workbook;

import com.pace.base.PafException;
import com.pace.base.app.PlanCycle;
import com.pace.base.app.Season;
import com.pace.base.project.*;
import com.pace.base.project.excel.IExcelDynamicReferenceElementItem;
import com.pace.base.project.excel.PafExcelInput;
import com.pace.base.project.excel.PafExcelRow;
import com.pace.base.project.excel.PafExcelValueObject;
import com.pace.base.project.utils.PafExcelUtil;

/**
 * Reads/writes seasons from/to an Excel 2007 workbook.
 *
 * @author jmilliron
 * @version	1.00
 *
 */
public class SeasonsExcelElementItem<T extends List<Season>> extends PafExcelElementItem<T> implements IExcelDynamicReferenceElementItem {

	/**
	 * Creates an excel element item. Mainly used for reading seasons.
	 * 
	 * @param workbook workbook used for read/write
	 */
	public SeasonsExcelElementItem(Workbook workbook) {
		super(workbook);
	}
	
	/**
	 * Creates an excel element item. Mainly used for writing seasons.
	 * 
	 * @param workbook workbook used for read/write
	 * @param isCellReferencingEnabled true if cell referencing is enabled
	 */
	public SeasonsExcelElementItem(Workbook workbook,
			boolean isCellReferencingEnabled) {
		super(workbook, isCellReferencingEnabled);
	}



	@Override
	protected void createHeaderListMapEntries() {

		getHeaderListMap().put(getSheetName(), Arrays.asList("id", "plan cycle", "year", "is open", "time"));
		//TODO change year to years (TTN-1595)
	}

	@Override
	public ProjectElementId getProjectElementId() {
		return ProjectElementId.Seasons;
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
//		.multiDataRow(true) TTN-1595
			.build();

		List<PafExcelRow> excelRowList = PafExcelUtil.readExcelSheet(input);
		
		List<Season> seasonList = new ArrayList<Season>();
				
		Season season = null;
		
		for ( PafExcelRow row : excelRowList ) {
		
			season = new Season();
			
			for ( Integer rowIndex : row.getRowItemOrderedIndexes()) {
			
				List<PafExcelValueObject> rowItemList = row.getRowItem(rowIndex);
				
				PafExcelValueObject firstValueObject = rowItemList.get(0);
			
				try {
				
					switch (rowIndex) {
					
						//id
						case 0:											
						
							season.setId(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true));
							break;
						
						//plan cycle
						case 1:						
													
							season.setPlanCycle(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true));	
							break;
							
						//year
						case 2:											
						//TODO Update for TTN-1595
//							season.setYear(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true));
							break;
						
						//is open
						case 3:						
													
							season.setOpen(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject, true));	
							break;
							
						//time
						case 4:						
							
							season.setTimePeriod(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true));	
							break;		
							
						}
					
					
					
					} catch (ExcelProjectDataErrorException epdee) {
						
						addProjectDataErrorToList(epdee.getProjectDataError());
						
					}
			
			
			}
		
		seasonList.add(season);
		
		}
		
		return (T) seasonList;
		
	}

	@Override
	public void writeExcelSheet(T t) throws PaceProjectWriteException, PafException {
		
		Map<String, String> planCycleReferenceMap = null;
		
		//if cell referencing is enabled, read in versions
		if ( isCellReferencingEnabled() ) {
			
			/*IExcelDynamicReferenceElementItem elementItem = new SeasonsExcelElementItem<List<Season>>(getWorkbookLocation());
			
			planCycleReferenceMap = elementItem.getDynamicReferenceMap();*/
			
			IExcelDynamicReferenceElementItem elementItem = new PlanCyclesExcelElementItem<List<PlanCycle>>(getWorkbook());
			
			planCycleReferenceMap = elementItem.getDynamicReferenceMap();
		
		}
		
		//plan cycle input
		PafExcelInput input = new PafExcelInput.Builder(getWorkbook(), getSheetName(), getHeaderListMap().get(getSheetName()).size())
			.endOfSheetIdnt(ExcelPaceProjectConstants.END_OF_SHEET_IDENT)
			.build();
		
		
		List<Season> seasonList = t;
		
		List<PafExcelRow> excelRowList = new ArrayList<PafExcelRow>();

		//create and add header to list
		excelRowList.add(PafExcelUtil.createHeaderRow(getHeaderListMap().get(getSheetName())));
		
		if ( seasonList != null ) {
			
			for ( Season season : seasonList ) {
				
				PafExcelRow excelRow = new PafExcelRow();
				
				//id
				excelRow.addRowItem(0, PafExcelValueObject.createFromString(season.getId()));
				
				//plan cycle
				String planCycleName = season.getPlanCycle();
				
				//if referencing enabled and key exists in map, use dynamic reference
				if ( isCellReferencingEnabled() && planCycleReferenceMap != null && planCycleReferenceMap.containsKey(planCycleName) ) {
					
					excelRow.addRowItem(1, PafExcelValueObject.createFromFormula(planCycleReferenceMap.get(planCycleName)));
					
				//plan cycle name
				} else {

					excelRow.addRowItem(1, PafExcelValueObject.createFromString(planCycleName));
					
				}
				
				//years
				//TODO update for TTN-1595
//				excelRow.addRowItem(2, PafExcelValueObject.createFromString(season.getYear()));
				
				//is open
				excelRow.addRowItem(3, PafExcelValueObject.createFromBoolean(season.isOpen()));		
				
				//time
				excelRow.addRowItem(4, PafExcelValueObject.createFromString(season.getTimePeriod()));
				
				excelRowList.add(excelRow);			
				
			}
			
		}
			
		PafExcelUtil.writeExcelSheet(input, excelRowList);
		
	}

	/**
	 * Creates a dynamic reference map used to reference seasons cells.  Key is season name, value
	 * is the Excel sheet/cell reference.  Example =Seasons!$A$2.
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
