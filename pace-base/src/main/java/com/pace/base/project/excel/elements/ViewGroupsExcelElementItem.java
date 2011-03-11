/*
 *	File: @(#)ViewGroupsExcelElementItem.java 	Package: com.pace.base.project.excel.elements 	Project: Paf Base Libraries
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
import com.pace.base.view.PafView;
import com.pace.base.view.PafViewGroup;
import com.pace.base.view.PafViewGroupItem;

/**
 * Reads/writes view groups from/to an Excel 2007 workbook.
 *
 * @author jmilliron
 * @version	1.00
 *
 */
public class ViewGroupsExcelElementItem<T extends Map<String, PafViewGroup>> extends PafExcelElementItem<T> implements IExcelDynamicReferenceElementItem {

	/**
	 * Creates an excel element item. Mainly used for reading views.
	 * 
	 * @param workbook workbook used for read/write
	 */
	public ViewGroupsExcelElementItem(Workbook workbook) {
		super(workbook);
	}
	
	/**
	 * Creates an excel element item. Mainly used for writing views.
	 * 
	 * @param workbook workbook used for read/write
	 * @param isCellReferencingEnabled true if cell referencing is enabled
	 */	
	public ViewGroupsExcelElementItem(Workbook workbook,
			boolean isCellReferencingEnabled) {
		super(workbook, isCellReferencingEnabled);
	}
	
	@Override
	protected void createHeaderListMapEntries() {

		getHeaderListMap().put(getSheetName(), Arrays.asList("view group name", "description", "view name / view group name"));		
		
	}

	@Override
	public ProjectElementId getProjectElementId() {
		
		return ProjectElementId.ViewGroups;
		
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

		Map<String, PafViewGroup> viewGroupMap = new HashMap<String, PafViewGroup>();

		PafViewGroup mapEntry = null;

		for (PafExcelRow row : excelRowList) {

			mapEntry = new PafViewGroup();

			String viewGroupName = null;
			
			List<PafExcelValueObject> viewViewGroupList = null;
			
			for (Integer rowIndex : row.getRowItemOrderedIndexes()) {

				List<PafExcelValueObject> rowItemList = row
						.getRowItem(rowIndex);

				PafExcelValueObject firstValueObject = rowItemList.get(0);

				try {
				
					switch (rowIndex) {
	
					// view group name
					case 0:
	
						viewGroupName = PafExcelUtil.getString(getProjectElementId(), firstValueObject, true);
						
						break;
	
					// description
					case 1:
						
						mapEntry.setDesc(PafExcelUtil.getString(getProjectElementId(), firstValueObject));
						
						break;
						
					//view name / view group name
					case 2:
						
						//add the view / view group excel objects to view view group list so can process on case 3 (is view group)
						viewViewGroupList = new ArrayList<PafExcelValueObject>(rowItemList);						
						
						List<PafViewGroupItem> viewGroupItemList = new ArrayList<PafViewGroupItem>();
						
						PafViewGroupItem viewGroupItem = null;
						
						for (int i = 0; i < viewViewGroupList.size(); i++ ) {
							
							//if view view group item is not blank
							if ( ! viewViewGroupList.get(i).isBlank() ) {
							
								viewGroupItem = new PafViewGroupItem();
								viewGroupItem.setName(PafExcelUtil.getString(getProjectElementId(), viewViewGroupList.get(i)));
																
								viewGroupItemList.add(viewGroupItem);
								
							}
													
						}
						
						
						if ( viewGroupItemList.size() > 0 ) {
							
							mapEntry.setPafViewGroupItems(viewGroupItemList.toArray(new PafViewGroupItem[0]));
							
						}
										
						break;
						
						
					}

				} catch (ExcelProjectDataErrorException epdee) {
					
					addProjectDataErrorToList(epdee.getProjectDataError());
					
				}
				
			}							
		

			// if required vars are there, add to map
			if ( viewGroupName != null ) {

				mapEntry.setName(viewGroupName);
				
				viewGroupMap.put(viewGroupName, mapEntry);

			}

		}
		
		List<PafViewGroupItem> viewGroupItemList = null;
		
		//set is view group attribute if view group items are view groups
		for ( PafViewGroup viewGroup : viewGroupMap.values() ) {			
			
			viewGroupItemList = new ArrayList<PafViewGroupItem>();
			
			PafViewGroupItem[] pafViewGroupItems = viewGroup.getPafViewGroupItems();
			
			if ( pafViewGroupItems != null && pafViewGroupItems.length > 0 ) {
											
				for (PafViewGroupItem viewGroupItem : pafViewGroupItems ) {
					
					String viewGroupItemName = viewGroupItem.getName();
					
					//if view group map contains key, set as view group
					if ( viewGroupMap.containsKey(viewGroupItemName)) {
						
						viewGroupItem.setViewGroup(true);
						
					}
					
					viewGroupItemList.add(viewGroupItem);
					
				}				
				
			}
			
			//if view gorup items exist in list, convert list to array for view group
			if ( viewGroupItemList.size() > 0 ) {
				
				viewGroup.setPafViewGroupItems(viewGroupItemList.toArray(new PafViewGroupItem[0]));
				
			}
								
		}

		return (T) viewGroupMap;
		
	}

	@Override
	protected void writeExcelSheet(T t) throws PaceProjectWriteException, PafException {

		Map<String, String> viewDynamicRefMap = null;
		
		Map<String, String> viewGroupDynamicRefMap = null;
		
		//if cell referencing is enabled, read in versions
		if ( isCellReferencingEnabled() ) {			
			
			IExcelDynamicReferenceElementItem viewSetionElementItem = new ViewsExcelElementItem<List<PafView>>(getWorkbook());
			viewDynamicRefMap = viewSetionElementItem.getDynamicReferenceMap();
			
			ViewGroupsExcelElementItem<Map<String, PafViewGroup>> viewGroupsElementItem = new ViewGroupsExcelElementItem<Map<String, PafViewGroup>>(getWorkbook());
			
			//1st write out model in order to get correct references
			viewGroupsElementItem.write(t);
			
			//2nd read in dynamic ref map
			viewGroupDynamicRefMap = viewGroupsElementItem.getDynamicReferenceMap();
			
		}		
		
		PafExcelInput input = new PafExcelInput.Builder(getWorkbook(), getSheetName(), getHeaderListMap().get(getSheetName()).size())
			.endOfSheetIdnt(ExcelPaceProjectConstants.END_OF_SHEET_IDENT)
			.build();
	
	
		Map<String, PafViewGroup> map = t;
		
		List<PafExcelRow> excelRowList = new ArrayList<PafExcelRow>();
	
		//create and add header to list
		excelRowList.add(PafExcelUtil.createHeaderRow(getHeaderListMap().get(getSheetName())));
		
		if ( map != null ) {
			
			for ( String viewGroupName : map.keySet() ) {
				
				PafViewGroup viewGroup = map.get(viewGroupName);
				
				PafExcelRow excelRow = new PafExcelRow();
				
				//name
				excelRow.addRowItem(0, PafExcelValueObject.createFromString(viewGroup.getName()));
				
				//description
				excelRow.addRowItem(1, PafExcelValueObject.createFromString(viewGroup.getDesc()));
				
				if ( viewGroup.getPafViewGroupItems() != null ) {
					
					for ( PafViewGroupItem viewGroupItem : viewGroup.getPafViewGroupItems() ) {
						
						String viewOrViewGroupName = viewGroupItem.getName();
						
						if ( isCellReferencingEnabled() && ((viewDynamicRefMap != null && viewDynamicRefMap.containsKey(viewOrViewGroupName))
								|| viewGroupDynamicRefMap != null && viewGroupDynamicRefMap.containsKey(viewOrViewGroupName))) {
							
							if ( viewDynamicRefMap.containsKey(viewOrViewGroupName)) {
								
								excelRow.addRowItem(2, PafExcelValueObject.createFromFormula(viewDynamicRefMap.get(viewOrViewGroupName)));
								
							} else if ( viewGroupDynamicRefMap.containsKey(viewOrViewGroupName) ) {
								
								excelRow.addRowItem(2, PafExcelValueObject.createFromFormula(viewGroupDynamicRefMap.get(viewOrViewGroupName)));
								
							}
							
							
						} else {
							
							excelRow.addRowItem(2, PafExcelValueObject.createFromString(viewOrViewGroupName));
						}
						
					}
					
				}			
								
				excelRowList.add(excelRow);			
				
			}
			
		}
					
		PafExcelUtil.writeExcelSheet(input, excelRowList);		
		
	}

	/**
	 * Creates a dynamic reference map used to reference view group cells.  Key is view group name, value
	 * is the Excel sheet/cell reference.  Example =ViewGroups!$A$2.
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
