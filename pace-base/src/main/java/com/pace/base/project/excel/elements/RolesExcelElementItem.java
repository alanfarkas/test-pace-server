/*
 *	File: @(#)RolesExcelElementItem.java 	Package: com.pace.base.project.excel.elements 	Project: Paf Base Libraries
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
import com.pace.base.app.PafPlannerRole;
import com.pace.base.app.Season;
import com.pace.base.project.*;
import com.pace.base.project.excel.IExcelDynamicReferenceElementItem;
import com.pace.base.project.excel.PafExcelInput;
import com.pace.base.project.excel.PafExcelRow;
import com.pace.base.project.excel.PafExcelValueObject;
import com.pace.base.project.utils.PafExcelUtil;

/**
 * Reads/writes roles from/to an Excel 2007 workbook.
 *
 * @author jmilliron
 * @version	1.00
 *
 */
public class RolesExcelElementItem<T extends List<PafPlannerRole>> extends PafExcelElementItem<T> implements IExcelDynamicReferenceElementItem  {

	/**
	 * Creates an excel element item. Mainly used for reading roles.
	 * 
	 * @param workbook workbook used for read/write
	 */
	public RolesExcelElementItem(Workbook workbook) {
		super(workbook);
	}
	
	/**
	 * Creates an excel element item. Mainly used for writing roles.
	 * 
	 * @param workbook workbook used for read/write
	 * @param isCellReferencingEnabled true if cell referencing is enabled
	 */
	public RolesExcelElementItem(Workbook workbook,
			boolean isCellReferencingEnabled) {
		super(workbook, isCellReferencingEnabled);

	}
	
	@Override
	protected void createHeaderListMapEntries() {

		getHeaderListMap().put(getSheetName(), Arrays.asList("name", "description", "plantype", "is read only", "seasons"));
		
	}

	@Override
	public ProjectElementId getProjectElementId() {
		return ProjectElementId.Roles;
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
		
		List<PafPlannerRole> roleList = new ArrayList<PafPlannerRole>();
				
		PafPlannerRole role = null;
		
		for ( PafExcelRow row : excelRowList ) {
		
			role = new PafPlannerRole();
			
			for ( Integer rowIndex : row.getRowItemOrderedIndexes()) {
			
				List<PafExcelValueObject> rowItemList = row.getRowItem(rowIndex);
				
				PafExcelValueObject firstValueObject = rowItemList.get(0);
			
				try {
				
					switch (rowIndex) {
					
						//name
						case 0:											
						
							role.setRoleName(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true));
							break;
						
						//description
						case 1:						
													
							role.setRoleDesc(PafExcelUtil.getString(getProjectElementId(), firstValueObject));	
							break;
							
						//plan type
						case 2:											
						
							role.setPlanType(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true));
							break;
						
						//is read only
						case 3:						
													
							role.setReadOnly(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject));	
							break;
							
						//season id array
						case 4:						
							
							List<String> seasonIdList = new ArrayList<String>();
							
							boolean seasonIdReadError = false;
							
							for ( PafExcelValueObject seasonIdExcelValueObject : rowItemList ) {
								
								//catch required season id and then try next row for next season id, this way trys to read all
								try {
									
									seasonIdList.add(PafExcelUtil.getString(getProjectElementId(), seasonIdExcelValueObject, true));
									
								} catch (ExcelProjectDataErrorException epdee) {
									
									addProjectDataErrorToList(epdee.getProjectDataError());
									
									seasonIdReadError = true;
									
								}
									
								
							}
							
							//if no season read error, add list to role
							if ( ! seasonIdReadError && seasonIdList.size() > 0 ) {
								
								role.setSeasonIds(seasonIdList.toArray(new String[0]));
								
							}
							
							break;		
							
						}			
					
					
					} catch (ExcelProjectDataErrorException epdee) {
						
						addProjectDataErrorToList(epdee.getProjectDataError());
						
					}
			
			
			}
		
		roleList.add(role);
		
		}
		
		return (T) roleList;
		
	}

	@Override
	protected void writeExcelSheet(T t) throws PaceProjectWriteException, PafException {
		
		Map<String, String> seasonReferenceMap = null;
		
		//if cell referencing is enabled, read in versions
		if ( isCellReferencingEnabled() ) {
			
			IExcelDynamicReferenceElementItem elementItem = new SeasonsExcelElementItem<List<Season>>(getWorkbook());
			
			seasonReferenceMap = elementItem.getDynamicReferenceMap();		
		
		}
		
		//plan cycle input
		PafExcelInput input = new PafExcelInput.Builder(getWorkbook(), getSheetName(), getHeaderListMap().get(getSheetName()).size())
			.endOfSheetIdnt(ExcelPaceProjectConstants.END_OF_SHEET_IDENT)
			.build();
		
		
		List<PafPlannerRole> roleList = t;
		
		List<PafExcelRow> excelRowList = new ArrayList<PafExcelRow>();

		//create and add header to list
		excelRowList.add(PafExcelUtil.createHeaderRow(getHeaderListMap().get(getSheetName())));
		
		if ( roleList != null ) {
			
			for ( PafPlannerRole role : roleList ) {
				
				PafExcelRow excelRow = new PafExcelRow();
				
				//role name
				excelRow.addRowItem(0, PafExcelValueObject.createFromString(role.getRoleName()));
				
				//role desc
				excelRow.addRowItem(1, PafExcelValueObject.createFromString(role.getRoleDesc()));
												
				//plan type
				excelRow.addRowItem(2, PafExcelValueObject.createFromString(role.getPlanType()));
				
				//is read only
				excelRow.addRowItem(3, PafExcelValueObject.createFromBoolean(role.isReadOnly()));
				
				//season ids
				String[] seasonIds = role.getSeasonIds();
				
				if ( seasonIds != null ) {
				
					for (String seasonId : seasonIds ) {
																	
						//if referencing enabled and key exists in map, use dynamic reference
						if ( isCellReferencingEnabled() && seasonReferenceMap != null && seasonReferenceMap.containsKey(seasonId) ) {
							
							excelRow.addRowItem(4, PafExcelValueObject.createFromFormula(seasonReferenceMap.get(seasonId)));
							
						//season id
						} else {
		
							excelRow.addRowItem(4, PafExcelValueObject.createFromString(seasonId));
							
						}
						
					}
					
				}
		
				
				excelRowList.add(excelRow);			
				
			}
			
		}
			
		PafExcelUtil.writeExcelSheet(input, excelRowList);
		
	}

	/**
	 * Creates a dynamic reference map used to reference roles cells.  Key is role name, value
	 * is the Excel sheet/cell reference.  Example =Roles!$A$2.
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
