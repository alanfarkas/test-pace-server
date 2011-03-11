/*
 *	File: @(#)ViewsExcelElementItem.java 	Package: com.pace.base.project.excel.elements 	Project: Paf Base Libraries
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
import java.util.Map;

import org.apache.poi.ss.usermodel.Workbook;

import com.pace.base.PafException;
import com.pace.base.app.PafUserSecurity;
import com.pace.base.project.*;
import com.pace.base.project.excel.IExcelDynamicReferenceElementItem;
import com.pace.base.project.excel.PafExcelInput;
import com.pace.base.project.excel.PafExcelRow;
import com.pace.base.project.excel.PafExcelValueObject;
import com.pace.base.project.utils.PafExcelUtil;
import com.pace.base.view.PafUserSelection;
import com.pace.base.view.PafView;
import com.pace.base.view.PafViewHeader;
import com.pace.base.view.PafViewSection;

/**
 * Reads/writes views from/to an Excel 2007 workbook.
 *
 * @author jmilliron
 * @version	1.00
 *
 */
public class ViewsExcelElementItem<T extends List<PafView>> extends PafExcelElementItem<T> implements IExcelDynamicReferenceElementItem {

	/**
	 * Creates an excel element item. Mainly used for reading views.
	 * 
	 * @param workbook workbook used for read/write
	 */
	public ViewsExcelElementItem(Workbook workbook) {
		super(workbook);
	}
	
	/**
	 * Creates an excel element item. Mainly used for writing views.
	 * 
	 * @param workbook workbook used for read/write
	 * @param isCellReferencingEnabled true if cell referencing is enabled
	 */	
	public ViewsExcelElementItem(Workbook workbook,
			boolean isCellReferencingEnabled) {
		super(workbook, isCellReferencingEnabled);
		
	}

	@Override
	protected void createHeaderListMapEntries() {

		getHeaderListMap().put(getSheetName(), Arrays.asList("view name", "view section name", "description", "page orientation", "pages tall (int)", "pages wide (int)"));
												

	}

	@Override
	public ProjectElementId getProjectElementId() {
		return ProjectElementId.Views;
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
		
		List<PafView> viewList = new ArrayList<PafView>();
				
		PafView view = null;
		
		for ( PafExcelRow row : excelRowList ) {
		
			view = new PafView();
			
			for ( Integer rowIndex : row.getRowItemOrderedIndexes()) {
			
				List<PafExcelValueObject> rowItemList = row.getRowItem(rowIndex);
				
				PafExcelValueObject firstValueObject = rowItemList.get(0);
			
				try {
				
					switch (rowIndex) {
					
						//name
						case 0:											
						
							view.setName(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true));
							break;
						
						//view section name
						case 1:						
													
							String viewSectionName = PafExcelUtil.getString(getProjectElementId(), firstValueObject);
							
							if ( viewSectionName != null ) {
							
								view.setViewSectionNames(new String[] {viewSectionName});
								
							}
							
							break;
							
						//desc
						case 2:											
						
							if ( firstValueObject.isBlank()) {
								//TODO: HAD TO SET TO "" so equals will not fail on view.  Look further into fixing this
								view.setDesc("");
								
							} else {
							
								view.setDesc(PafExcelUtil.getString(getProjectElementId(), firstValueObject));
								
							}
							
							break;
							
						//page orientation
						case 3:
							
							view.setPageOrientation(PafExcelUtil.getString(getProjectElementId(), firstValueObject, false, ExcelPaceProjectConstants.VALID_PAGE_ORIENTATION_LIST));
							break;
							
						//pages tall
						case 4:
							
							view.setPagesTall(PafExcelUtil.getInteger(getProjectElementId(), firstValueObject));
							break;
							
						//pages wide
						case 5:
							
							view.setPagesWide(PafExcelUtil.getInteger(getProjectElementId(), firstValueObject));
							break;							
						}			
					
					
					} catch (ExcelProjectDataErrorException epdee) {
						
						addProjectDataErrorToList(epdee.getProjectDataError());
						
					}
			
			
			}
			
			//add default empty arrays
			view.setHeaders(new PafViewHeader[0]);
			view.setUserSelections(new PafUserSelection[0]);
			
		
			viewList.add(view);
		
		}
		
		return (T) viewList;
		
	}

	@Override
	protected void writeExcelSheet(T t) throws PaceProjectWriteException, PafException {
		
		Map<String, String> viewSectionDynamicRefMap = null;
		
		//if cell referencing is enabled, read in versions
		if ( isCellReferencingEnabled() ) {			
			
			IExcelDynamicReferenceElementItem viewSetionElementItem = new ViewSectionsExcelElementItem<List<PafViewSection>>(getWorkbook());
			viewSectionDynamicRefMap = viewSetionElementItem.getDynamicReferenceMap();
			
		}
		
		PafExcelInput input = new PafExcelInput.Builder(getWorkbook(), getSheetName(), getHeaderListMap().get(getSheetName()).size())
			.endOfSheetIdnt(ExcelPaceProjectConstants.END_OF_SHEET_IDENT)
			.build();

		List<PafView> list = t;
		
		List<PafExcelRow> excelRowList = new ArrayList<PafExcelRow>();
	
		//create and add header to list
		excelRowList.add(PafExcelUtil.createHeaderRow(getHeaderListMap().get(getSheetName())));
		
		if ( list != null ) {

			for ( PafView view : list ) {
				
				PafExcelRow excelRow = new PafExcelRow();
				
				//name
				excelRow.addRowItem(0, PafExcelValueObject.createFromString(view.getName()));
	
				//view section name
				if ( view.getViewSectionNames() != null && view.getViewSectionNames().length == 1) {
				
					String viewSectionName = view.getViewSectionNames()[0];
					
					if ( isCellReferencingEnabled() && viewSectionDynamicRefMap != null && viewSectionDynamicRefMap.containsKey(viewSectionName)) {
						
						excelRow.addRowItem(1, PafExcelValueObject.createFromFormula(viewSectionDynamicRefMap.get(viewSectionName)));
						
					} else {
						
						excelRow.addRowItem(1, PafExcelValueObject.createFromString(viewSectionName));		
						
					}
					
					
				}
				
				//description
				excelRow.addRowItem(2, PafExcelValueObject.createFromString(view.getDesc()));
				
				//page orientation
				excelRow.addRowItem(3, PafExcelValueObject.createFromString(view.getPageOrientation()));
				
				//pages tall
				excelRow.addRowItem(4, PafExcelValueObject.createFromInteger(view.getPagesTall()));
				
				//pages wide
				excelRow.addRowItem(5, PafExcelValueObject.createFromInteger(view.getPagesWide()));
				
				excelRowList.add(excelRow);			
				
			}
					
			
		}		
			
		PafExcelUtil.writeExcelSheet(input, excelRowList);
		
	}

	/**
	 * Creates a dynamic reference map used to reference view cells.  Key is view name, value
	 * is the Excel sheet/cell reference.  Example =Views!$A$2.
	 */
	public Map<String, String> getDynamicReferenceMap() {

		Map<String, String> dynamicRefMap = null;
		
		PafExcelInput input = new PafExcelInput.Builder(this.getWorkbook(), this.getSheetName(), 1)
			.headerListMap(this.getHeaderListMap())
			.excludeHeaderRows(true)
			.excludeEmptyRows(true)
			.multiDataRow(false)
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
