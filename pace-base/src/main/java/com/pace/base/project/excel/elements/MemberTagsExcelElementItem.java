/*
 *	File: @(#)MemberTagsExcelElementItem.java 	Package: com.pace.base.project.excel.elements 	Project: Paf Base Libraries
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
import com.pace.base.app.PafApplicationDef;
import com.pace.base.db.membertags.MemberTagDef;
import com.pace.base.db.membertags.MemberTagType;
import com.pace.base.project.*;
import com.pace.base.project.excel.IExcelDynamicReferenceElementItem;
import com.pace.base.project.excel.PafExcelInput;
import com.pace.base.project.excel.PafExcelRow;
import com.pace.base.project.excel.PafExcelValueObject;
import com.pace.base.project.utils.PafExcelUtil;

/**
 * Reads/writes member tags from/to an Excel 2007 workbook.
 *
 * @author jmilliron
 * @version	1.00
 *
 */
public class MemberTagsExcelElementItem<T extends List<MemberTagDef>> extends PafExcelElementItem<T> {

	/**
	 * Creates an excel element item.
	 * 
	 * @param workbook workbook used for read/write
	 */
	public MemberTagsExcelElementItem(Workbook workbook) {
		super(workbook);		
	}
	
	/**
	 * Creates an excel element item. Mainly used for writing member tags.
	 * 
	 * @param workbook workbook used for read/write
	 * @param isCellReferencingEnabled true if cell referencing is enabled
	 */
	public MemberTagsExcelElementItem(Workbook workbook,
			boolean isCellReferencingEnabled) {
		super(workbook, isCellReferencingEnabled);
	
	}

	@Override
	protected void createHeaderListMapEntries() {

		getHeaderListMap().put(getSheetName(), Arrays.asList("name", "type", "label", "dimensions", "is editable", "is comment visible"));												

	}

	@Override
	public ProjectElementId getProjectElementId() {
		return ProjectElementId.MemberTags;
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
		
		List<MemberTagDef> memberTagDefList = new ArrayList<MemberTagDef>();
				
		MemberTagDef memberTagDef = null;
		
		for ( PafExcelRow row : excelRowList ) {
		
			memberTagDef = new MemberTagDef();
			
			for ( Integer rowIndex : row.getRowItemOrderedIndexes()) {
			
				List<PafExcelValueObject> rowItemList = row.getRowItem(rowIndex);
				
				PafExcelValueObject firstValueObject = rowItemList.get(0);
			
				try {
				
					switch (rowIndex) {
					
						//name
						case 0:											
						
							memberTagDef.setName(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true));
							break;
						
						//type
						case 1:						
							
							String memberTagType = PafExcelUtil.getString(getProjectElementId(), firstValueObject, true, ExcelPaceProjectConstants.VALID_MEMBER_TAG_TYPE_LIST);
							
							if ( memberTagType != null ) {
								
								//upper case member tag to match enum
								memberTagDef.setType(MemberTagType.valueOf(memberTagType.toUpperCase()));
								
							}
							
							break;
							
						//label
						case 2:											
						
							memberTagDef.setLabel(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true));
							break;
							
						//dimension name array
						case 3:
							
							memberTagDef.setDims(PafExcelUtil.getStringAr(getProjectElementId(), rowItemList, true));
							
							break;
							
						//is editable
						case 4:
								
							memberTagDef.setEditable(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject, true));
							break;
							
						//is comment visible
						case 5:
							
							memberTagDef.setCommentVisible(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject, true));
							break;							
						}			
					
					
					} catch (ExcelProjectDataErrorException epdee) {
						
						addProjectDataErrorToList(epdee.getProjectDataError());
						
					}
			
			
			}
		
		memberTagDefList.add(memberTagDef);
		
		}
		
		return (T) memberTagDefList;
		
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

		List<MemberTagDef> memberTagList = t;
		
		List<PafExcelRow> excelRowList = new ArrayList<PafExcelRow>();
	
		//create and add header to list
		excelRowList.add(PafExcelUtil.createHeaderRow(getHeaderListMap().get(getSheetName())));
		
		if ( memberTagList != null ) {
			
			for ( MemberTagDef memberTagDef : memberTagList ) {
				
				PafExcelRow excelRow = new PafExcelRow();
				
				//name
				excelRow.addRowItem(0, PafExcelValueObject.createFromString(memberTagDef.getName()));
				
				//type
				excelRow.addRowItem(1, PafExcelValueObject.createFromString(memberTagDef.getType().toString()));
								
				//label
				excelRow.addRowItem(2, PafExcelValueObject.createFromString(memberTagDef.getLabel()));				
				
				//dimensions
				if ( memberTagDef.getDims() != null ) {
				
					for (String dimensionName : memberTagDef.getDims() ) {
						
						excelRow.addRowItem(3, PafExcelValueObject.createFromFormulaReferenceMap(dimensionName, dimensionRefMap));
						
					}
				}
				
				//is editable
				excelRow.addRowItem(4, PafExcelValueObject.createFromBoolean(memberTagDef.isEditable()));
				
				//is comment visible
				excelRow.addRowItem(5, PafExcelValueObject.createFromBoolean(memberTagDef.isCommentVisible()));
				
				excelRowList.add(excelRow);			
				
			}
			
		}	
			
		PafExcelUtil.writeExcelSheet(input, excelRowList);
		
	}

	

}
