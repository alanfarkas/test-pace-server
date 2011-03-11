/*
 *	File: @(#)DynamicMembersExcelElementItem.java 	Package: com.pace.base.project.excel.elements 	Project: Paf Base Libraries
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

import com.pace.base.PafBaseConstants;
import com.pace.base.PafException;
import com.pace.base.app.DynamicMemberDef;
import com.pace.base.app.PafApplicationDef;
import com.pace.base.project.*;
import com.pace.base.project.excel.IExcelDynamicReferenceElementItem;
import com.pace.base.project.excel.PafExcelInput;
import com.pace.base.project.excel.PafExcelRow;
import com.pace.base.project.excel.PafExcelValueObject;
import com.pace.base.project.utils.PafExcelUtil;

/**
 * Reads/writes dynamic members from/to an Excel 2007 workbook.
 *
 * @author jmilliron
 * @version	1.00
 *
 */
public class DynamicMembersExcelElementItem<T extends List<DynamicMemberDef>> extends PafExcelElementItem<T> implements IExcelDynamicReferenceElementItem {

	/**
	 * Creates an excel element item. Mainly used for reading dynamic members.
	 * 
	 * @param workbook workbook used for read/write
	 */
	public DynamicMembersExcelElementItem(Workbook workbook) {
		super(workbook);
	}
	
	/**
	 * Creates an excel element item. Mainly used for writing dynamic members.
	 * 
	 * @param workbook workbook used for read/write
	 * @param isCellReferencingEnabled true if cell referencing is enabled
	 */
	public DynamicMembersExcelElementItem(Workbook workbook,
			boolean isCellReferencingEnabled) {
		super(workbook, isCellReferencingEnabled);		
	}

	@Override
	protected void createHeaderListMapEntries() {

		getHeaderListMap().put(getSheetName(), Arrays.asList("dimension", "member"));
		
	}

	@Override
	public ProjectElementId getProjectElementId() {
		return ProjectElementId.DynamicMembers;
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
		
		List<DynamicMemberDef> dynamicMembersList = new ArrayList<DynamicMemberDef>();
				
		DynamicMemberDef dynamicMemberDef = null;
		
		for ( PafExcelRow row : excelRowList ) {
		
			dynamicMemberDef = new DynamicMemberDef();
			
			for ( Integer rowIndex : row.getRowItemOrderedIndexes()) {
			
				List<PafExcelValueObject> rowItemList = row.getRowItem(rowIndex);
				
				PafExcelValueObject firstValueObject = rowItemList.get(0);
			
				try {
				
					switch (rowIndex) {
					
						//dimension
						case 0:											
						
							dynamicMemberDef.setDimension(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true));
							break;
						
						//members
						case 1:						
						
								
							List<String> memberList = new ArrayList<String>();
							
							for ( PafExcelValueObject memberExcelValueObject : rowItemList ) {							
								
								String member = PafExcelUtil.getString(getProjectElementId(), memberExcelValueObject, true);
								
								if ( member != null && member.contains(PafBaseConstants.PLAN_VERSION)) {
								
									memberList.add(member);
									
								} else {
									
									throw new ExcelProjectDataErrorException(
											ProjectDataError.createRequiredValueProjectDataError(getProjectElementId(), memberExcelValueObject, "Dynamic member must include '" + PafBaseConstants.PLAN_VERSION + "' within the member"));
									
								}														
								
							}
							
							if ( memberList.size() > 0 ) {
								
								dynamicMemberDef.setMemberSpecs(memberList.toArray(new String[0]));
								
							}
							
							break;
											
						}
					
					} catch (ExcelProjectDataErrorException epdee) {
						
						addProjectDataErrorToList(epdee.getProjectDataError());
						
					}
			
			
			}
		
		dynamicMembersList.add(dynamicMemberDef);
		
		}
		
		return (T) dynamicMembersList;
		
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
	
	
		List<DynamicMemberDef> list = t;
		
		List<PafExcelRow> excelRowList = new ArrayList<PafExcelRow>();
	
		//create and add header to list
		excelRowList.add(PafExcelUtil.createHeaderRow(getHeaderListMap().get(getSheetName())));
		
		if ( list != null ) {
			
			for ( DynamicMemberDef dynamicMemberDef : list ) {
				
				PafExcelRow excelRow = new PafExcelRow();

				excelRow.addRowItem(0, PafExcelValueObject.createFromFormulaReferenceMap(dynamicMemberDef.getDimension(), dimensionRefMap));
	
				if ( dynamicMemberDef.getMemberSpecs() != null ) {
					
					for (String memberSpec : dynamicMemberDef.getMemberSpecs()) {

						excelRow.addRowItem(1, PafExcelValueObject.createFromString(memberSpec));		
						
					}
					
				}
				
				excelRowList.add(excelRow);			
				
			}
			
		}		
			
		PafExcelUtil.writeExcelSheet(input, excelRowList);
		
		
	}

	/**
	 * Creates a dynamic reference map used to reference dynamic members cells.  Key is dimension name, value
	 * is the Excel sheet/cell reference.  Example =DynamicMembers!$A$2.
	 */
	public Map<String, String> getDynamicReferenceMap() {

		Map<String, String> dynamicRefMap = null;
		
		PafExcelInput versionInput = new PafExcelInput.Builder(this.getWorkbook(), this.getSheetName(), 2)
			.headerListMap(this.getHeaderListMap())
			.excludeHeaderRows(true)
			.excludeEmptyRows(true)
			.multiDataRow(true)
			.startDataReadColumnIndex(1)
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
