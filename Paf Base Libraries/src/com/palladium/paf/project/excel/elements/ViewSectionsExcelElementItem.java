/*
 *	File: @(#)ViewSectionsExcelElementItem.java 	Package: com.palladium.paf.project.excel.elements 	Project: Paf Base Libraries
 *	Created: Jan 12, 2010  		By: jmilliron
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Workbook;

import com.palladium.paf.PafException;
import com.palladium.paf.project.ExcelPaceProjectConstants;
import com.palladium.paf.project.ExcelProjectDataErrorException;
import com.palladium.paf.project.PaceProjectReadException;
import com.palladium.paf.project.PaceProjectWriteException;
import com.palladium.paf.project.ProjectDataError;
import com.palladium.paf.project.ProjectElementId;
import com.palladium.paf.project.excel.IExcelDynamicReferenceElementItem;
import com.palladium.paf.project.excel.PafExcelInput;
import com.palladium.paf.project.excel.PafExcelRow;
import com.palladium.paf.project.excel.PafExcelValueObject;
import com.palladium.paf.project.utils.PafExcelUtil;
import com.palladium.paf.view.PafViewSection;
import com.palladium.utility.PafXStream;

/**
 * Reads/writes view sections from/to an Excel 2007 workbook.
 *
 * @author jmilliron
 * @version	1.00
 *
 */
public class ViewSectionsExcelElementItem<T extends List<PafViewSection>> extends PafExcelElementItem<T> implements IExcelDynamicReferenceElementItem {
	
	/**
	 * Creates an excel element item. Mainly used for reading view sections.
	 * 
	 * @param workbook workbook used for read/write
	 */
	public ViewSectionsExcelElementItem(Workbook workbook) {
		super(workbook);
	}
	
	/**
	 * Creates an excel element item. Mainly used for writing view sections.
	 * 
	 * @param workbook workbook used for read/write
	 * @param isCellReferencingEnabled true if cell referencing is enabled
	 */
	public ViewSectionsExcelElementItem(Workbook workbook,
			boolean isCellReferencingEnabled) {
		super(workbook, isCellReferencingEnabled);		
	}

	@Override
	protected void createHeaderListMapEntries() {

		getHeaderListMap().put(getSheetName(), Arrays.asList("name"));												

	}

	@Override
	public ProjectElementId getProjectElementId() {
		return ProjectElementId.ViewSections;
	}

	@SuppressWarnings("unchecked")
	@Override
	protected T readExcelSheet() throws PaceProjectReadException, PafException {
		
		List<String> dynamicHeaderList = getHeaderListFromSheet();
		
		if ( dynamicHeaderList == null || dynamicHeaderList.size() == 0 ) {
						
			String errorMessage = "Sheet header was not found.  The header row should start with '" + getHeaderListMap().get(getSheetName()).get(0) + "' and then contain one or more '" + ExcelPaceProjectConstants.EXCEL_VIEW_SECTION_DYNAMIC_HEADER_ID + "?' where the ? is a number starting at 1";
			
			addProjectDataErrorToList(new ProjectDataError(getProjectElementId(), getSheetName(), errorMessage));

			throw new PaceProjectReadException(getSheetName(), errorMessage);
			
		}
		
		
		Map<String, List<String>> headerMap = new HashMap<String, List<String>>();
		
		//add name to 1st item in list
		dynamicHeaderList.add(0, getHeaderListMap().get(getSheetName()).get(0));
		
		headerMap.put(getSheetName(), dynamicHeaderList);		
		
		PafExcelInput input = new PafExcelInput.Builder(getWorkbook(), getSheetName(), dynamicHeaderList.size())
			.headerListMap(headerMap)
			.excludeHeaderRows(true)
			.excludeEmptyRows(true)
			.sheetRequired(true)
			.endOfSheetIdnt(ExcelPaceProjectConstants.END_OF_SHEET_IDENT)
			.build();

		List<PafExcelRow> excelRowList = PafExcelUtil.readExcelSheet(input);
		
		List<PafViewSection> viewSectionList = new ArrayList<PafViewSection>();
				
		PafViewSection viewSection = null;
		
		for ( PafExcelRow row : excelRowList ) {
		
			viewSection = null;
			
			StringBuilder xmlStrBuilder = new StringBuilder();
			
			String viewSectionName = null;
			
			for ( Integer rowIndex : row.getRowItemOrderedIndexes()) {
			
				List<PafExcelValueObject> rowItemList = row.getRowItem(rowIndex);
				
				PafExcelValueObject firstValueObject = rowItemList.get(0);
			
				try {
				
					//name
					if ( rowIndex == 0 ) {
					
						//ensure the view name exists
						viewSectionName = PafExcelUtil.getString(getProjectElementId(), firstValueObject, true);
						
					} else {
						
						if ( firstValueObject.isString() ) {
							
							xmlStrBuilder.append(PafExcelUtil.getString(getProjectElementId(), firstValueObject));
							
						} else {
							
							break;
						}
						
						String viewSectionXml = xmlStrBuilder.toString();
						
						//if builder starts with <ViewSection> and ends with </ViewSection>, we have complete xml
						if ( viewSectionXml.startsWith("<" + PafXStream.VIEW_SECTION_DEF + ">" ) &&
								viewSectionXml.endsWith("</" + PafXStream.VIEW_SECTION_DEF + ">") ) {
							
							try {
								
								viewSection = (PafViewSection) PafXStream.getXStream().fromXML(viewSectionXml);
								
								viewSectionList.add(viewSection);
								
							} catch (RuntimeException re) {
								
								logger.error(re.getMessage());
								
								throw new ExcelProjectDataErrorException(new ProjectDataError(getProjectElementId(), viewSectionName, "There was a problem reading the view section.  Please ensure all view section xml is present."));
								
							}
							
							
						}
						
					}
					
				} catch (ExcelProjectDataErrorException epdee) {
					
					addProjectDataErrorToList(epdee.getProjectDataError());
					
				}
			
			
			}
		
	}
	
	return (T) viewSectionList;
		
	}

	private List<String> getHeaderListFromSheet() throws PafException {

		List<String> headerList = new ArrayList<String>();
		
		PafExcelInput input = new PafExcelInput.Builder(getWorkbook(), getSheetName(), 256)
			.excludeEmptyRows(true)
			.rowLimit(1)
			.endOfSheetIdnt(ExcelPaceProjectConstants.END_OF_SHEET_IDENT)
			.build();		
		
		List<PafExcelRow> excelRowList = PafExcelUtil.readExcelSheet(input);
		
		String headerStartItem = getHeaderListMap().get(getSheetName()).get(0);
		
		boolean isHeaderRow = false;
		
		//find header row
		ROW:
		for ( PafExcelRow row : excelRowList ) {			
			
			for ( Integer rowIndex : row.getRowItemOrderedIndexes()) {
			
				List<PafExcelValueObject> rowItemList = row.getRowItem(rowIndex);
				
				PafExcelValueObject firstValueObject = rowItemList.get(0);
			
				try {
				
					String firstItem = PafExcelUtil.getString(getProjectElementId(), firstValueObject);
							
					//name
					if ( rowIndex == 0 ) {
																		
						//header row should only contain 1 row item
						if ( rowItemList.size() == 1 ) {
																				
							if ( firstItem != null && headerStartItem != null && firstItem.equalsIgnoreCase(headerStartItem)) {
								
								isHeaderRow = true;
															
							}							
							
						}
						
					//dynamic header
					} else {
						
						if ( isHeaderRow ) {							
							
							if ( firstValueObject.isString()) {
																							
								if ( firstItem != null && firstItem.startsWith(ExcelPaceProjectConstants.EXCEL_VIEW_SECTION_DYNAMIC_HEADER_ID) ) {
									
									headerList.add(firstItem);
									
								}
								
							} else {
							
								break ROW;
								
							}
							
							
						} else {
							
							continue ROW;
							
						}
						
					}
					
				} catch (ExcelProjectDataErrorException epdee) {
					
					addProjectDataErrorToList(epdee.getProjectDataError());
					
				}
					
						
			}
		
				
		}
		
		return headerList;
	}

	@Override
	protected void writeExcelSheet(T t) throws PaceProjectWriteException, PafException {
			
		PafExcelInput input = new PafExcelInput.Builder(getWorkbook(), getSheetName(), getHeaderListMap().get(getSheetName()).size())
			.autoSizeColumns(false)
			.endOfSheetIdnt(ExcelPaceProjectConstants.END_OF_SHEET_IDENT)
			.build();


		List<PafViewSection> list = t;
		
		List<PafExcelRow> excelRowList = new ArrayList<PafExcelRow>();
	
		//create and add header to list
		excelRowList.add(PafExcelUtil.createHeaderRow(getHeaderListMap().get(getSheetName())));
		
		if ( list != null ) {

			int maxNumberOfColumns = 0;
			
			for ( PafViewSection viewSection : list ) {
				
				PafExcelRow excelRow = new PafExcelRow();
				
				//name
				excelRow.addRowItem(0, PafExcelValueObject.createFromString(viewSection.getName()));
	
				//convert view section object to xml string
				String viewSectionXml = PafXStream.getXStream().toXML(viewSection);
			
				if ( viewSectionXml != null ) {
										
					//length of view section xml
					int viewSectionXmlLength = viewSectionXml.length();
					
					//get number of cells required.  view section length / max excel cell size
					int numberOfCellsRequired = (viewSectionXmlLength / ExcelPaceProjectConstants.EXCEL_MAX_CELL_LIMIT) + 1;
					
					//calc max number of columns, used for creating dynamic header
					if ( maxNumberOfColumns < numberOfCellsRequired ) {
						
						maxNumberOfColumns = numberOfCellsRequired;
						
					}
					
					//loop over number of cells required and add parsed xml string
					for (int i = 0; i < numberOfCellsRequired; i++) {
						
						//min for substring
						int min = i * ExcelPaceProjectConstants.EXCEL_MAX_CELL_LIMIT;
						
						//max for substring
						int max = (i+1) * ExcelPaceProjectConstants.EXCEL_MAX_CELL_LIMIT;
						
						//if last cell, calc new max
						if ( i == numberOfCellsRequired - 1 ) {
							
							max = viewSectionXmlLength;
							
						}
						
						//parse string and create row item
						excelRow.addRowItem(i+1, PafExcelValueObject.createFromString(viewSectionXml.substring(min, max)));
						
					}
					
				}				
				
				excelRowList.add(excelRow);			
				
			}
			
			//update dynamic header row with dynamic headers: xml1, xml2, etc 
			if ( maxNumberOfColumns > 0 ) {
				
				//get header row
				PafExcelRow headerRow = excelRowList.get(0);
				
				//if header row
				if ( headerRow.isHeader()) {
					
					for (int i = 1; i <= maxNumberOfColumns; i++ ) {							

						//add dynamic header
						headerRow.addRowItem(i, PafExcelValueObject.createFromString(ExcelPaceProjectConstants.EXCEL_VIEW_SECTION_DYNAMIC_HEADER_ID + i));							
						
					}
					
					//remove from list
					excelRowList.remove(0);
					
					//add updated headerRow to list
					excelRowList.add(0, headerRow);
				}
				
			}
			
		}		
			
		PafExcelUtil.writeExcelSheet(input, excelRowList);
		
	}

	/**
	 * Creates a dynamic reference map used to reference view sections cells.  Key is view section name, value
	 * is the Excel sheet/cell reference.  Example =ViewSections!$A$2.
	 */
	public Map<String, String> getDynamicReferenceMap() {

		Map<String, String> dynamicRefMap = null;
		
		PafExcelInput versionInput = new PafExcelInput.Builder(this.getWorkbook(), this.getSheetName(), 1)
			.headerListMap(this.getHeaderListMap())
			.excludeHeaderRows(true)
			.excludeEmptyRows(true)
			.multiDataRow(false)
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
