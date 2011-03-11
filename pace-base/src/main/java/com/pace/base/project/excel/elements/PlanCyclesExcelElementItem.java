/*
 *	File: @(#)PlanCyclesExcelElementItem.java 	Package: com.pace.base.project.excel.elements 	Project: Paf Base Libraries
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
import com.pace.base.app.VersionDef;
import com.pace.base.project.*;
import com.pace.base.project.excel.IExcelDynamicReferenceElementItem;
import com.pace.base.project.excel.PafExcelInput;
import com.pace.base.project.excel.PafExcelRow;
import com.pace.base.project.excel.PafExcelValueObject;
import com.pace.base.project.utils.PafExcelUtil;

/**
 * Reads/writes plan cycles from/to an Excel 2007 workbook.
 *
 * @author jmilliron
 * @version	1.00
 *
 */
public class PlanCyclesExcelElementItem<T extends List<PlanCycle>> extends PafExcelElementItem<T> implements IExcelDynamicReferenceElementItem {
	
	/**
	 * Creates an excel element item.
	 * 
	 * @param workbook workbook used for read/write
	 */
	public PlanCyclesExcelElementItem(Workbook workbook) {
		super(workbook);
	}
	
	/**
	 * 
	 * Creates a plan cycle excel element id.
	 * 
	 * @param workbook workbook used for read/write
	 * @param isCellReferencingEnabled when true, replaces versions with cell references on version tabs
	 */
	public PlanCyclesExcelElementItem(Workbook workbook, boolean isCellReferencingEnabled) {
		super(workbook, isCellReferencingEnabled);
	}

	@Override
	protected void createHeaderListMapEntries() {

		getHeaderListMap().put(getSheetName(), Arrays.asList("name", "version"));
		
	}

	@Override
	public ProjectElementId getProjectElementId() {
		return ProjectElementId.PlanCycles;
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
		
		List<PlanCycle> planCycleList = new ArrayList<PlanCycle>();
				
		PlanCycle planCycle = null;
		
		for ( PafExcelRow row : excelRowList ) {
		
			planCycle = new PlanCycle();
			
			for ( Integer rowIndex : row.getRowItemOrderedIndexes()) {
			
				List<PafExcelValueObject> rowItemList = row.getRowItem(rowIndex);
				
				PafExcelValueObject firstValueObject = rowItemList.get(0);
			
				try {
				
					switch (rowIndex) {
					
						//dimension
						case 0:											
						
							planCycle.setLabel(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true));
							break;
						
						//members
						case 1:						
													
							planCycle.setVersion(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true));	
							break;
											
						}
					
					} catch (ExcelProjectDataErrorException epdee) {
						
						addProjectDataErrorToList(epdee.getProjectDataError());
						
					}
			
			
			}
		
		planCycleList.add(planCycle);
		
		}
		
		return (T) planCycleList;
		
	}

	@Override
	protected void writeExcelSheet(T t) throws PaceProjectWriteException, PafException {
	
		Map<String, String> versionNameReferenceMap = null;
		
		//if cell referencing is enabled, read in versions
		if ( isCellReferencingEnabled() ) {
			
			IExcelDynamicReferenceElementItem versionExcelElementItem = new VersionsExcelElementItem<List<VersionDef>>(getWorkbook());
			
			versionNameReferenceMap = versionExcelElementItem.getDynamicReferenceMap();
		
		}
		
		//plan cycle input
		PafExcelInput input = new PafExcelInput.Builder(getWorkbook(), getSheetName(), getHeaderListMap().get(getSheetName()).size())
			.endOfSheetIdnt(ExcelPaceProjectConstants.END_OF_SHEET_IDENT)
			.build();
		
		
		List<PlanCycle> planCycleList = t;
		
		List<PafExcelRow> excelRowList = new ArrayList<PafExcelRow>();

		//create and add header to list
		excelRowList.add(PafExcelUtil.createHeaderRow(getHeaderListMap().get(getSheetName())));
		
		if ( planCycleList != null ) {
			
			for ( PlanCycle pc : planCycleList ) {
				
				PafExcelRow excelRow = new PafExcelRow();
				
				//dimension
				excelRow.addRowItem(0, PafExcelValueObject.createFromString(pc.getLabel()));
				
				String versionName = pc.getVersion();
				
				//if referencing enabled and key exists in map, use dynamic reference
				if ( isCellReferencingEnabled() && versionNameReferenceMap != null && versionNameReferenceMap.containsKey(versionName) ) {
					
					excelRow.addRowItem(1, PafExcelValueObject.createFromFormula(versionNameReferenceMap.get(versionName)));
					
				//version name
				} else {

					excelRow.addRowItem(1, PafExcelValueObject.createFromString(versionName));
					
				}
				
				excelRowList.add(excelRow);			
				
			}
			
		}	
			
		PafExcelUtil.writeExcelSheet(input, excelRowList);
		
	}

	/**
	 * Creates a dynamic reference map used to reference plan cycle cells.  Key is plan cycle name, value
	 * is the Excel sheet/cell reference.  Example =PlanCycles!$A$2.
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
