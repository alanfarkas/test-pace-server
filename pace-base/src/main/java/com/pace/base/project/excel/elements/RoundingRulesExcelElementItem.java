/*
 *	File: @(#)RoundingRulesExcelElementItem.java 	Package: com.pace.base.project.excel.elements 	Project: Paf Base Libraries
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
import com.pace.base.project.*;
import com.pace.base.project.excel.IExcelDynamicReferenceElementItem;
import com.pace.base.project.excel.PafExcelInput;
import com.pace.base.project.excel.PafExcelRow;
import com.pace.base.project.excel.PafExcelValueObject;
import com.pace.base.project.utils.PafExcelUtil;
import com.pace.base.rules.MemberSet;
import com.pace.base.rules.RoundingRule;

/**
 * Reads/writes custom functions from/to an Excel 2007 workbook.
 *
 * @author jmilliron
 * @version	1.00
 *
 */
public class RoundingRulesExcelElementItem<T extends List<RoundingRule>> extends PafExcelElementItem<T> {

	/**
	 * Creates an excel element item.
	 * 
	 * @param workbook workbook used for read/write
	 */
	public RoundingRulesExcelElementItem(Workbook workbook) {
		super(workbook);
	}

	/**
	 * Creates an excel element item. Mainly used for writing rounding rules.
	 * 
	 * @param workbook workbook used for read/write
	 * @param isCellReferencingEnabled true if cell referencing is enabled
	 */
	public RoundingRulesExcelElementItem(Workbook workbook,
			boolean isCellReferencingEnabled) {
		super(workbook, isCellReferencingEnabled);
	
	}
	
	@Override
	protected void createHeaderListMapEntries() {

		getHeaderListMap().put(getSheetName(), Arrays.asList("name", "digits", "dimension", "member"));
		
	}

	@Override
	public ProjectElementId getProjectElementId() {
		return ProjectElementId.RoundingRules;
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
		
		List<RoundingRule> roundingRuleList = new ArrayList<RoundingRule>();
				
		RoundingRule rr = null;
		
		for ( PafExcelRow row : excelRowList ) {
		
			rr = new RoundingRule();
			
			for ( Integer rowIndex : row.getRowItemOrderedIndexes()) {
			
				List<PafExcelValueObject> rowItemList = row.getRowItem(rowIndex);
				
				PafExcelValueObject firstValueObject = rowItemList.get(0);
			
				try {
				
					switch (rowIndex) {
					
						//name ( function )
						case 0:											
						
							rr.setRoundingFunction(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true));
							break;
						
						//digets
						case 1:						
													
							rr.setDigits(PafExcelUtil.getInteger(getProjectElementId(), firstValueObject, true));	
							break;
							
						//dimension names
						case 2:											
						
							String[] dimensionAr = PafExcelUtil.getStringAr(getProjectElementId(), rowItemList, true);
							
							if ( dimensionAr != null ) {
								
								List<MemberSet> memberSetList = new ArrayList<MemberSet>();
								
								for (String dimension : dimensionAr ) {
									
									MemberSet ms = new MemberSet();
									ms.setDimension(dimension);									
									memberSetList.add(ms);
									
								}
								
								if ( memberSetList.size() > 0 ) {
									
									rr.setMemberList(memberSetList);
									
								}
								
							}
							
							break;
						
						//member
						case 3:						
							
							String[] memberAr = PafExcelUtil.getStringAr(getProjectElementId(), rowItemList, true);
							
							if ( memberAr != null ) {
																							
								List<MemberSet> memberSetList = rr.getMemberList();
								
								//if the size of the member ar read and the member set list do not match, throw error
								if ( memberAr.length != memberSetList.size()) {
									
									throw new ExcelProjectDataErrorException(new ProjectDataError(getProjectElementId(),
											getHeaderListMap().get(getSheetName()).get(2) + " and " + getHeaderListMap().get(getSheetName()).get(3) + " columns.",
											"The number of items in each do not match.  Ensure both columns have same number of row values."));
									
								}
								
								for (int i = 0; i < memberSetList.size(); i++ ) {
									
									MemberSet ms = memberSetList.get(i);
									ms.setMember(memberAr[i]);
									
								}
								
								if ( memberSetList.size() > 0 ) {
									
									rr.setMemberList(memberSetList);
									
								}
								
							}
								
							break;
							
					
						}			
					
					
					} catch (ExcelProjectDataErrorException epdee) {
						
						addProjectDataErrorToList(epdee.getProjectDataError());
						
					}
			
			
			}
		
		roundingRuleList.add(rr);
		
		}
		
		return (T) roundingRuleList;
		
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
		
		List<RoundingRule> roundingRuleList = t;
		
		List<PafExcelRow> excelRowList = new ArrayList<PafExcelRow>();
	
		//create and add header to list
		excelRowList.add(PafExcelUtil.createHeaderRow(getHeaderListMap().get(getSheetName())));
		
		if ( roundingRuleList != null ) {
			
			for ( RoundingRule roundingRule : roundingRuleList ) {
				
				PafExcelRow excelRow = new PafExcelRow();
												
				//class name
				excelRow.addRowItem(0, PafExcelValueObject.createFromString(roundingRule.getRoundingFunction()));
				
				//digits
				excelRow.addRowItem(1, PafExcelValueObject.createFromInteger(roundingRule.getDigits()));
				
				List<MemberSet> memberSetList = roundingRule.getMemberList();
				
				for (MemberSet memberSet : memberSetList ) {
				
					if ( memberSet != null ) {
						
						//dimension name
						excelRow.addRowItem(2, PafExcelValueObject.createFromFormulaReferenceMap(memberSet.getDimension(), dimensionRefMap));
						
						//member name
						excelRow.addRowItem(3, PafExcelValueObject.createFromString(memberSet.getMember()));
					
					}
				}
				
				
				excelRowList.add(excelRow);			
				
			}
			
		}	
			
		PafExcelUtil.writeExcelSheet(input, excelRowList);
		
	}
}
