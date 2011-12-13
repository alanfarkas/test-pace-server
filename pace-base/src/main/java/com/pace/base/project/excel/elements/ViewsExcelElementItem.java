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
import com.pace.base.ViewPrintState;
import com.pace.base.project.ExcelPaceProjectConstants;
import com.pace.base.project.ExcelProjectDataErrorException;
import com.pace.base.project.PaceProjectReadException;
import com.pace.base.project.PaceProjectWriteException;
import com.pace.base.project.ProjectDataError;
import com.pace.base.project.ProjectElementId;
import com.pace.base.project.excel.IExcelDynamicReferenceElementItem;
import com.pace.base.project.excel.PafExcelInput;
import com.pace.base.project.excel.PafExcelRow;
import com.pace.base.project.excel.PafExcelValueObject;
import com.pace.base.project.utils.PafExcelUtil;
import com.pace.base.ui.PrintStyle;
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

		getHeaderListMap().put(getSheetName(), Arrays.asList("view name", "view section name", "description", "Print Style GUID", "Print Style Name","Default Print Style?",
				"Portait", "Landscape",  "Adjust To", "% Normal Size", "Fit To", "Page(s) Wide", "Page(s) Tall", "Paper Size", "First Page Number",//Page Tab
				"Header Margin","Top Margin","Left Margin","Right Margin","Bottom Margin","Footer Margin","Center Horizontally","Center Vertically",//Margins Tab
				"Header", "Footer","Different odd and even pages","Different first page","Scale with document","Align with page margins",//Header/Footer Tab
				"Entire View","User Selection", "User Selected Print Area", "Rows to repeat at top","Columns to repeat at left","Gridlines","Black and white","Draft quality","Row and column headings","Comments","Cell errors as","Down, then Over", "Over, then Down", "Print State", "Global Print Style GUID"));
												

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
			PrintStyle printStyle = new PrintStyle(); 
			
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
							
						//TODO
						//set Print Settings 
							//"GUID"
						case 3:											
							printStyle.setGUID(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true));
							break;
					
						//"Name" (Print Style Name)
						case 4:											
							printStyle.setName(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true));
							break;
						
						//"Default Print Style?" 
						case 5:											
							printStyle.setDefaultStyle(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject, true));
							break;
						
						//"Portrait"
						case 6:
							printStyle.setPortrait(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject, true));
							break;
							
						//"Landscape"
						case 7:
							printStyle.setLandscape(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject, true));
							if( ( printStyle.getPortrait() && printStyle.getLandscape() ) || ( ! printStyle.getPortrait() && ! printStyle.getLandscape() ) ) {
								addProjectDataErrorToList(ProjectDataError.createInvalidValueProjectDataError(getProjectElementId(), firstValueObject));
							}
							break;
							
						//"Adjust To"
						case 8:
							printStyle.setAdjustTo(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject, true));
							break;
							
						//"% Normal Size"
						case 9:
							printStyle.setPercentNormalSize(PafExcelUtil.getInteger(getProjectElementId(), firstValueObject, true));
							break;
							
						//"FitTo"
						case 10:
							printStyle.setFitTo(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject, true));
							if( ( printStyle.getAdjustTo() && printStyle.getFitTo() ) || ( ! printStyle.getAdjustTo() && ! printStyle.getFitTo() ) ) {
								addProjectDataErrorToList(ProjectDataError.createInvalidValueProjectDataError(getProjectElementId(), firstValueObject));
							}
							break;
							
						//"Page(s) Wide"
						case 11:
							printStyle.setPageWide(PafExcelUtil.getInteger(getProjectElementId(), firstValueObject, true));
							break;
							
						//"Page(s) Tall"
						case 12:
							printStyle.setPageTall(PafExcelUtil.getInteger(getProjectElementId(), firstValueObject, true));
							break;
							
						//"Paper Size"
						case 13:
							printStyle.setPaperSize(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true));
							break;

						//"First Page Number",
						case 14:
							printStyle.setFirstPageNumber(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true));
							break;
							
						//"Header"
						case 15:
							printStyle.setHeader(new Float(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true)));
							break;
							
						//"Top"
						case 16:
							printStyle.setTop(new Float(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true)));
							break;
							
						//"Left"
						case 17:
							printStyle.setLeft(new Float(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true)));
							break;
							
						//"Right"
						case 18:
							printStyle.setRight(new Float(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true)));
							break;
							
						//"Bottom"
						case 19:
							printStyle.setBottom(new Float(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true)));
							break;
							
						//"Footer"
						case 20:
							printStyle.setFooter(new Float(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true)));
							break;
							
						//"Center Horizontally"
						case 21:
							printStyle.setCenterHorizontally(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject, true));
							break;
							
						//"Center Vertically"
						case 22:
							printStyle.setCenterVertically(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject, true));
							break;
							
						//"Header Text"
						case 23:
							printStyle.setHeaderText(PafExcelUtil.getString(getProjectElementId(), firstValueObject));
							break;
							
						//"Footer Text"
						case 24:
							printStyle.setFooterText(PafExcelUtil.getString(getProjectElementId(), firstValueObject));
							break;
						
						//"Different odd and even pages"
						case 25:
							printStyle.setDiffOddAndEvenPages(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject, true));
							break;
							
						//"Different first page"
						case 26:
							printStyle.setDiffFirstPage(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject, true));
							break;
							
						//"Scale with document"
						case 27:
							printStyle.setScaleWithDocument(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject, true));
							break;
							
						//"Align with page margins"
						case 28:
							printStyle.setAlignWithPageMargin(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject, true));
							break;
							
						//"Entire Sheet":
						case 29:
							printStyle.setEntireView(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject, true));
							break;
							
						//"User Selection?":
						case 30:
							printStyle.setUserSelection(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject, true));
							if( ( printStyle.getEntireView() && printStyle.getUserSelection() ) || ( ! printStyle.getEntireView() && ! printStyle.getUserSelection()) ) {
								addProjectDataErrorToList(ProjectDataError.createInvalidValueProjectDataError(getProjectElementId(), firstValueObject));
							}
							break;
							
						//"User Selected Print area":
						case 31:
							printStyle.setUserSelectionText(PafExcelUtil.getString(getProjectElementId(), firstValueObject));
							break;
							
						//"Rows to repeat at top"	
						case 32:
							printStyle.setRowsToRepeatAtTop(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true));
							break;
						
						//"Columns to repeat at left"
						case 33:
							printStyle.setColsToRepeatAtLeft(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true));
							break;
						
						//"Gridlines"
						case 34:
							printStyle.setGridlines(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject, true));
							break;
						
						//"Black and white"
						case 35:
							printStyle.setBlackAndWhite(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject, true));
							break;
							
						//"Draft quality"
						case 36:
							printStyle.setDraftQuality(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject, true));
							break;
							
						//"Row and column headings"
						case 37:
							printStyle.setRowAndColHeadings(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject, true));
							break;
							
						//"Comments"
						case 38:
							printStyle.setComment(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true));
							break;
							
						//"Cell errors as",
						case 39:
							printStyle.setCellErrorsAs(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true));
							break;
							
						//"Down, then Over"
						case 40:
							printStyle.setDownThenOver(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject, true));
							break;
			
						//"Over, then Down"
						case 41:
							printStyle.setOverThenDown(PafExcelUtil.getBoolean(getProjectElementId(), firstValueObject, true));
							break;
							
						//"Print State"
						case 42:
							view.setViewPrintState(ViewPrintState.valueOf(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true)));
							if( ( printStyle.getDownThenOver() && printStyle.getOverThenDown()) || ( ! printStyle.getDownThenOver() && ! printStyle.getOverThenDown() ) ) {
								addProjectDataErrorToList(ProjectDataError.createInvalidValueProjectDataError(getProjectElementId(), firstValueObject));
							}
							break;
			
						//"Global Print Style GUID"
						case 43:
							view.setGlobalPrintStyleGUID(PafExcelUtil.getString(getProjectElementId(), firstValueObject, false));
							break;
							
						default:
							break;
						}			
					
					
					} catch (ExcelProjectDataErrorException epdee) {
						
						addProjectDataErrorToList(epdee.getProjectDataError());
						
					}
			
			
			}
			view.setPrintStyle(printStyle);
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
				
				PrintStyle printStyle = view.getPrintStyle();
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
				
				//GUID
				excelRow.addRowItem(3, PafExcelValueObject.createFromString(printStyle.getGUID()));
	
				//name
				excelRow.addRowItem(4, PafExcelValueObject.createFromString(printStyle.getName()));
				
				//Default Print Style?
				excelRow.addRowItem(5, PafExcelValueObject.createFromBoolean(printStyle.getDefaultStyle()));
				
				//Portrait?
				excelRow.addRowItem(6, PafExcelValueObject.createFromBoolean(printStyle.getPortrait()));
								
				//Landscape?
				excelRow.addRowItem(7, PafExcelValueObject.createFromBoolean(printStyle.getLandscape()));
				
				//Adjust To
				excelRow.addRowItem(8, PafExcelValueObject.createFromBoolean(printStyle.getAdjustTo()));
				
				//"% Normal Size"
				excelRow.addRowItem(9, PafExcelValueObject.createFromInteger(printStyle.getPercentNormalSize()));
								
				//Fit To
				excelRow.addRowItem(10, PafExcelValueObject.createFromBoolean(printStyle.getFitTo()));
				
				//"page Wide"
				excelRow.addRowItem(11, PafExcelValueObject.createFromInteger(printStyle.getPageWide()));
	
				//"Page Tall"
				excelRow.addRowItem(12, PafExcelValueObject.createFromInteger(printStyle.getPageTall()));
				
				//"Paper Size"
				excelRow.addRowItem(13, PafExcelValueObject.createFromString(printStyle.getPaperSize()));
			
				//"First Page Number",
				excelRow.addRowItem(14, PafExcelValueObject.createFromString(printStyle.getFirstPageNumber()));
			
				//"Header"
				excelRow.addRowItem(15, PafExcelValueObject.createFromString(printStyle.getHeader().toString()));
			
				//"Top"
				excelRow.addRowItem(16, PafExcelValueObject.createFromString(printStyle.getTop().toString()));
			
				//"Left"
				excelRow.addRowItem(17, PafExcelValueObject.createFromString(printStyle.getLeft().toString()));
			
				//"Right"
				excelRow.addRowItem(18, PafExcelValueObject.createFromString(printStyle.getRight().toString()));
			
				//"Bottom"
				excelRow.addRowItem(19, PafExcelValueObject.createFromString(printStyle.getBottom().toString()));
			
				//"Footer"
				excelRow.addRowItem(20, PafExcelValueObject.createFromString(printStyle.getFooter().toString()));
			
				//"Center Horizontally"
				excelRow.addRowItem(21, PafExcelValueObject.createFromBoolean(printStyle.getCenterHorizontally()));
			
				//"Center Vertically"
				excelRow.addRowItem(22, PafExcelValueObject.createFromBoolean(printStyle.getCenterVertically()));
			
				//"Header Text"
				excelRow.addRowItem(23, PafExcelValueObject.createFromString(printStyle.getHeaderText()));
			
				//"Footer Text"
				excelRow.addRowItem(24, PafExcelValueObject.createFromString(printStyle.getFooterText()));
			
				//"Different odd and even pages"
				excelRow.addRowItem(25, PafExcelValueObject.createFromBoolean(printStyle.getDiffOddAndEvenPages()));
			
				//"Different first page"
				excelRow.addRowItem(26, PafExcelValueObject.createFromBoolean(printStyle.getDiffFirstPage()));
			
				//"Scale with document"
				excelRow.addRowItem(27, PafExcelValueObject.createFromBoolean(printStyle.getScaleWithDocument()));
			
				//"Align with page margins"
				excelRow.addRowItem(28, PafExcelValueObject.createFromBoolean(printStyle.getAlignWithPageMargin()));
			
				//"Entire Sheet"
				excelRow.addRowItem(29, PafExcelValueObject.createFromBoolean(printStyle.getEntireView()));
			
				//"User Selection?"
				excelRow.addRowItem(30, PafExcelValueObject.createFromBoolean(printStyle.getUserSelection()));
			
				//"User Selected Print area"
				excelRow.addRowItem(31, PafExcelValueObject.createFromString(printStyle.getUserSelectionText()));
			
				//"Rows to repeat at top"
				excelRow.addRowItem(32, PafExcelValueObject.createFromString(printStyle.getRowsToRepeatAtTop()));
			
				//"Columns to repeat at left"
				excelRow.addRowItem(33, PafExcelValueObject.createFromString(printStyle.getColsToRepeatAtLeft()));
			
				//"Gridlines"
				excelRow.addRowItem(34, PafExcelValueObject.createFromBoolean(printStyle.getGridlines()));
			
				//"Black and white"
				excelRow.addRowItem(35, PafExcelValueObject.createFromBoolean(printStyle.getBlackAndWhite()));
			
				//"Draft quality"
				excelRow.addRowItem(36, PafExcelValueObject.createFromBoolean(printStyle.getDraftQuality()));
			
				//"Row and column headings"
				excelRow.addRowItem(37, PafExcelValueObject.createFromBoolean(printStyle.getRowAndColHeadings()));
			
				//"Comments"
				excelRow.addRowItem(38, PafExcelValueObject.createFromString(printStyle.getComment()));
			
				//"Cell errors as"
				excelRow.addRowItem(39, PafExcelValueObject.createFromString(printStyle.getCellErrorsAs()));
			
				//"Down, then Over"
				excelRow.addRowItem(40, PafExcelValueObject.createFromBoolean(printStyle.getDownThenOver()));
			
				//"Over, then Down"
				excelRow.addRowItem(41, PafExcelValueObject.createFromBoolean(printStyle.getOverThenDown()));
				
				//"Print State"
				excelRow.addRowItem(42, PafExcelValueObject.createFromString(view.getViewPrintState().toString()));
				
				//"Global Print Style GUID"
				excelRow.addRowItem(43, PafExcelValueObject.createFromString(view.getGlobalPrintStyleGUID()));
				
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
