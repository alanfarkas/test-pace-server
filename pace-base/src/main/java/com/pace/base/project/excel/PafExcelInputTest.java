/*
 *	File: @(#)PafExcelInputTest.java 	Package: com.pace.base.project.excel 	Project: Paf Base Libraries
 *	Created: Sep 1, 2009  		By: jmilliron
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2007 Palladium Group, Inc. All rights reserved.
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
package com.pace.base.project.excel;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Workbook;

import junit.framework.TestCase;

import com.pace.base.PafBaseConstants;
import com.pace.base.PafException;
import com.pace.base.project.utils.PafExcelUtil;

/**
 * Class_description_goes_here
 *
 * @author jmilliron
 * @version	x.xx
 *
 */
public class PafExcelInputTest extends TestCase {
		
	String sheetId = "testSheet1";
	
	String workbookDirName = "test_workbook";  // TTN-1556 (Changed to folder name)
	
	String workbookName = "test workbook";
	
	int colLimit = 21;
	
	int rowLimit = 222;
	
	int startColumn = 0;
	
	String endOfSheetIdnt = "EOS";	
	
	String key1 = "key1";
	
	String key2 = "key2";
	
	List<String> value1 = new ArrayList<String>(Arrays.asList(new String[] { "one", "two", "three" }));
	
	List<String> value2 = new ArrayList<String>(Arrays.asList(new String[] { "five", "six" }));
	
	Map<String, List<String>> headerListMap = new HashMap<String, List<String>>();
	
	{		
	
		headerListMap.put(key1, value1);
		headerListMap.put(key2, value2);		
		
	}
	
	String fullWorkbookNameExcel2007 = workbookDirName + File.separator + workbookName + PafBaseConstants.XLSX_EXT;
	String fullWorkbookNameExcel2007WithMacros = workbookDirName + File.separator + workbookName + PafBaseConstants.XLSM_EXT;
	
	PafExcelInput inputWorkbookExcel2007 = null;
	PafExcelInput inputWorkbookExcel2007withMacros = null;
	PafExcelInput inputWorkbookDirAndName = null;
	
	Workbook workbookExcel2007 = null;
	Workbook workbookExcel2007withMacros = null;
	
	private static final String TEST_FILES = "." + File.separator + "test_files" + File.separator;
	
	private static final String TEST_FILES_PROJECT_TEMPLATE = "project-template";
	
	private static final String TEST_FILES_PROJECT_TEMPLATE_XLSX = TEST_FILES + TEST_FILES_PROJECT_TEMPLATE + PafBaseConstants.XLSX_EXT;
	private static final String TEST_FILES_PROJECT_TEMPLATE_XLSM = TEST_FILES + TEST_FILES_PROJECT_TEMPLATE + PafBaseConstants.XLSM_EXT;
	
	
	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		
		// Create workbook directory (TTN-1556)
		File workbookDir = new File(workbookDirName);	
		if ( ! workbookDir.exists() ) {	
			assertTrue(workbookDir.mkdir());
		}
		
		inputWorkbookExcel2007 = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).build();
		inputWorkbookExcel2007withMacros = new PafExcelInput.Builder(fullWorkbookNameExcel2007WithMacros, sheetId, 1).build();
		inputWorkbookDirAndName = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, 1).build();
		 	
		try {
			workbookExcel2007 = PafExcelUtil.readWorkbook(TEST_FILES_PROJECT_TEMPLATE_XLSX);
			workbookExcel2007withMacros = PafExcelUtil.readWorkbook(TEST_FILES_PROJECT_TEMPLATE_XLSM);
		} catch (PafException e) {
			fail(e.getMessage());
		}
		
		assertNotNull(workbookExcel2007);
	 
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
		
		inputWorkbookExcel2007 = null;
		inputWorkbookExcel2007withMacros = null;
		inputWorkbookDirAndName = null;
		workbookExcel2007 = null;
		workbookExcel2007withMacros = null;
	}

	public void testExcelPaceInputFullWorkbook() {
		
		inputWorkbookExcel2007 = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).build();
		
		assertNotNull(inputWorkbookExcel2007);
		assertEquals(workbookDirName, inputWorkbookExcel2007.getWorkbookDirectory());
		assertEquals(workbookName, inputWorkbookExcel2007.getWorkbookName());
		assertEquals(fullWorkbookNameExcel2007, inputWorkbookExcel2007.getFullWorkbookName());
		assertEquals(sheetId, inputWorkbookExcel2007.getSheetId());
		assertEquals(1, inputWorkbookExcel2007.getColumnLimit());
		
		inputWorkbookExcel2007withMacros = new PafExcelInput.Builder(fullWorkbookNameExcel2007WithMacros, sheetId, 1).build();
		
		assertNotNull(inputWorkbookExcel2007withMacros);
		assertEquals(workbookDirName, inputWorkbookExcel2007withMacros.getWorkbookDirectory());
		assertEquals(workbookName, inputWorkbookExcel2007withMacros.getWorkbookName());
		assertEquals(fullWorkbookNameExcel2007WithMacros, inputWorkbookExcel2007withMacros.getFullWorkbookName());
		assertEquals(sheetId, inputWorkbookExcel2007withMacros.getSheetId());
		assertEquals(1, inputWorkbookExcel2007withMacros.getColumnLimit());
		
		
	}
	
	public void testExcelPaceInputWorkbook() {
		
		inputWorkbookExcel2007 = new PafExcelInput.Builder(workbookExcel2007, sheetId, 1).build();
		
		assertNotNull(inputWorkbookExcel2007);
		assertEquals(workbookExcel2007, inputWorkbookExcel2007.getWorkbook());
		assertEquals(sheetId, inputWorkbookExcel2007.getSheetId());
		assertEquals(1, inputWorkbookExcel2007.getColumnLimit());
		assertEquals(PafExcelWorkbookType.Excel2007, inputWorkbookExcel2007.getWorkbookType());
		
		inputWorkbookExcel2007withMacros = new PafExcelInput.Builder(workbookExcel2007withMacros, sheetId, 1).build();
		
		assertNotNull(inputWorkbookExcel2007withMacros);
		assertEquals(workbookExcel2007withMacros, inputWorkbookExcel2007withMacros.getWorkbook());
		assertEquals(sheetId, inputWorkbookExcel2007withMacros.getSheetId());
		assertEquals(1, inputWorkbookExcel2007withMacros.getColumnLimit());
		//should still be excel 2007 by default because building from a workkbook
		assertEquals(PafExcelWorkbookType.Excel2007, inputWorkbookExcel2007withMacros.getWorkbookType());
		
	}
	
	/**
	 * Test method for {@link com.pace.base.project.excel.PafExcelInput#getHeaderListMap()}.
	 */
	public void testGetHeaderListMap() {

		assertNotNull(inputWorkbookExcel2007.getHeaderListMap());
		assertEquals(0, inputWorkbookExcel2007.getHeaderListMap().size());
		
		assertNotNull(inputWorkbookDirAndName.getHeaderListMap());
		assertEquals(0, inputWorkbookDirAndName.getHeaderListMap().size());		
		
		PafExcelInput input = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).headerListMap(null).build();
		
		assertNotNull(input.getHeaderListMap());
		assertEquals(0, input.getHeaderListMap().size());
		
		input = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).headerListMap(headerListMap).build();
		
		assertNotSame(headerListMap, input.getHeaderListMap());
		assertEquals(headerListMap.size(), input.getHeaderListMap().size());
		assertTrue(input.getHeaderListMap().containsKey(key1));
		assertTrue(input.getHeaderListMap().containsKey(key2));
		assertTrue(input.getHeaderListMap().containsValue(value1));
		assertTrue(input.getHeaderListMap().containsValue(value2));		
		
	}

	/**
	 * Test method for {@link com.pace.base.project.excel.PafExcelInput#getFullWorkbookName()}.
	 */
	public void testGetFullWorkbookName() {
		
		assertNotNull(inputWorkbookExcel2007.getFullWorkbookName());
		assertEquals(fullWorkbookNameExcel2007, inputWorkbookExcel2007.getFullWorkbookName());
		assertNotNull(inputWorkbookDirAndName.getFullWorkbookName());
		assertEquals(fullWorkbookNameExcel2007, inputWorkbookDirAndName.getFullWorkbookName());
		
	}
	
	/**
	 * Test method for {@link com.pace.base.project.excel.PafExcelInput#getWorkbookDirectory()}.
	 */
	public void testGetWorkbookDirectory() {
				
		PafExcelInput input = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, 1).build();
		
		assertEquals(workbookDirName, input.getWorkbookDirectory());
		
	}

	/**
	 * Test method for {@link com.pace.base.project.excel.PafExcelInput#getWorkbookName()}.
	 */
	public void testGetWorkbookName() {
		
		PafExcelInput input = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, 1).build();
		
		assertEquals(workbookName, input.getWorkbookName());
		
	}
	
	/**
	 * Test method for {@link com.pace.base.project.excel.PafExcelInput#getSheetId()}.
	 */
	public void testGetSheetId() {

		PafExcelInput input = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).build();
		
		assertEquals(sheetId, input.getSheetId());
		
		input = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, 1).build();
		
		assertEquals(sheetId, input.getSheetId());
		
		input = new PafExcelInput.Builder(workbookExcel2007, sheetId, 1).build();
		
		assertEquals(sheetId, input.getSheetId());
	}

	/**
	 * Test method for {@link com.pace.base.project.excel.PafExcelInput#getColumnLimit()}.
	 */
	public void testGetColumnLimit() {
		
		PafExcelInput input = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).build();
		
		assertEquals(1, input.getColumnLimit());
		
		input = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, 1).build();
		
		assertEquals(1, input.getColumnLimit());
		
		input = new PafExcelInput.Builder(workbookExcel2007, sheetId, 1).build();
		
		assertEquals(1, input.getColumnLimit());
		
		input = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, colLimit).build();
		
		assertEquals(colLimit, input.getColumnLimit());
		
		input = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, colLimit).build();
		
		assertEquals(colLimit, input.getColumnLimit());
		
		input = new PafExcelInput.Builder(workbookExcel2007, sheetId, colLimit).build();
		
		assertEquals(colLimit, input.getColumnLimit());
	}

	/**
	 * Test method for {@link com.pace.base.project.excel.PafExcelInput#getRowLimit()}.
	 */
	public void testGetRowLimit() {

		PafExcelInput input = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).build();
		
		assertEquals(0, input.getRowLimit());
		
		input = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, 1).build();
		
		assertEquals(0, input.getRowLimit());
		
		input = new PafExcelInput.Builder(workbookExcel2007, sheetId, 1).build();
		
		assertEquals(0, input.getRowLimit());
		
		input = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).rowLimit(rowLimit).build();
		
		assertEquals(rowLimit, input.getRowLimit());
		
		input = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, 1).rowLimit(rowLimit).build();
		
		assertEquals(rowLimit, input.getRowLimit());
		
		input = new PafExcelInput.Builder(workbookExcel2007, sheetId, 1).rowLimit(rowLimit).build();
		
		assertEquals(rowLimit, input.getRowLimit());
		
	}

	/**
	 * Test method for {@link com.pace.base.project.excel.PafExcelInput#getEndOfSheetIdnt()}.
	 */
	public void testGetEndOfSheetIdnt() {
		
		PafExcelInput input = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).build();
		
		assertNull(input.getEndOfSheetIdnt());
		
		input = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, 1).build();
		
		assertNull(input.getEndOfSheetIdnt());
		
		input = new PafExcelInput.Builder(workbookExcel2007, sheetId, 1).build();
		
		assertNull(input.getEndOfSheetIdnt());
		
		input = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).endOfSheetIdnt(endOfSheetIdnt).build();
		
		assertNotNull(input.getEndOfSheetIdnt());
		assertEquals(endOfSheetIdnt, input.getEndOfSheetIdnt());
		
		input = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, 1).endOfSheetIdnt(endOfSheetIdnt).build();
		
		assertNotNull(input.getEndOfSheetIdnt());
		assertEquals(endOfSheetIdnt, input.getEndOfSheetIdnt());
		
		input = new PafExcelInput.Builder(workbookExcel2007, sheetId, 1).endOfSheetIdnt(endOfSheetIdnt).build();
		
		assertNotNull(input.getEndOfSheetIdnt());
		assertEquals(endOfSheetIdnt, input.getEndOfSheetIdnt());
		
	}

	/**
	 * Test method for {@link com.pace.base.project.excel.PafExcelInput#isExcludeHeaderRows()}.
	 */
	public void testIsExcludeHeaderRows() {
		
		PafExcelInput input = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).build();
		
		assertFalse(input.isExcludeHeaderRows());
		
		input = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, 1).build();
		
		assertFalse(input.isExcludeHeaderRows());
		
		input = new PafExcelInput.Builder(workbookExcel2007, sheetId, 1).build();
		
		assertFalse(input.isExcludeHeaderRows());
		
		input = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).excludeHeaderRows(false).build();
		
		assertFalse(input.isExcludeHeaderRows());
		
		input = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).excludeHeaderRows(true).build();
		
		assertTrue(input.isExcludeHeaderRows());
		
		input = new PafExcelInput.Builder(workbookExcel2007, sheetId, 1).excludeHeaderRows(false).build();
		
		assertFalse(input.isExcludeHeaderRows());
		
		input = new PafExcelInput.Builder(workbookExcel2007, sheetId, 1).excludeHeaderRows(true).build();
		
		assertTrue(input.isExcludeHeaderRows());
		
		input = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, 1).excludeHeaderRows(false).build();
		
		assertFalse(input.isExcludeHeaderRows());
		
		input = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, 1).excludeHeaderRows(true).build();
		
		assertTrue(input.isExcludeHeaderRows());
	}

	/**
	 * Test method for {@link com.pace.base.project.excel.PafExcelInput#isExcludeEmptyRows()}.
	 */
	public void testIsExcludeEmptyRows() {
		
		PafExcelInput input = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).build();
		
		assertFalse(input.isExcludeEmptyRows());
		
		input = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, 1).build();
		
		assertFalse(input.isExcludeEmptyRows());
		
		input = new PafExcelInput.Builder(workbookExcel2007, sheetId, 1).build();
		
		assertFalse(input.isExcludeEmptyRows());
		
		input = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).excludeEmptyRows(false).build();
		
		assertFalse(input.isExcludeEmptyRows());
		
		input = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).excludeEmptyRows(true).build();
		
		assertTrue(input.isExcludeEmptyRows());
		
		input = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, 1).excludeEmptyRows(false).build();
		
		assertFalse(input.isExcludeEmptyRows());
		
		input = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, 1).excludeEmptyRows(true).build();
		
		assertTrue(input.isExcludeEmptyRows());
		
		input = new PafExcelInput.Builder(workbookExcel2007, sheetId, 1).excludeEmptyRows(false).build();
		
		assertFalse(input.isExcludeEmptyRows());
		
		input = new PafExcelInput.Builder(workbookExcel2007, sheetId, 1).excludeEmptyRows(true).build();
		
		assertTrue(input.isExcludeEmptyRows());
	

	}

	/**
	 * Test method for {@link com.pace.base.project.excel.PafExcelInput#isExcludeDataRows()}.
	 */
	public void testIsExcludeDataRows() {
	
		PafExcelInput input = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).build();
		
		assertFalse(input.isExcludeDataRows());
		
		input = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, 1).build();
		
		assertFalse(input.isExcludeDataRows());

		input = new PafExcelInput.Builder(workbookExcel2007, sheetId, 1).build();
		
		assertFalse(input.isExcludeDataRows());
		
		input = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).excludeDataRows(false).build();
		
		assertFalse(input.isExcludeDataRows());
		
		input = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).excludeDataRows(true).build();
		
		assertTrue(input.isExcludeDataRows());
		
		input = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, 1).excludeDataRows(false).build();
		
		assertFalse(input.isExcludeDataRows());
		
		input = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, 1).excludeDataRows(true).build();
		
		assertTrue(input.isExcludeDataRows());
		
		input = new PafExcelInput.Builder(workbookExcel2007, sheetId, 1).excludeDataRows(false).build();
		
		assertFalse(input.isExcludeDataRows());
		
		input = new PafExcelInput.Builder(workbookExcel2007, sheetId, 1).excludeDataRows(true).build();
		
		assertTrue(input.isExcludeDataRows());
	}

	/**
	 * Test method for {@link com.pace.base.project.excel.PafExcelInput#isEnableCellReferencing()}.
	 */
	public void testIsEnableCellReferencing() {
		
		PafExcelInput input = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).build();
		
		assertFalse(input.isEnableCellReferencing());
		
		input = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, 1).build();
		
		assertFalse(input.isEnableCellReferencing());
		
		input = new PafExcelInput.Builder(workbookExcel2007, sheetId, 1).build();
		
		assertFalse(input.isEnableCellReferencing());
		
		input = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).enableCellReferencing(false).build();
		
		assertFalse(input.isEnableCellReferencing());
		
		input = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).enableCellReferencing(true).build();
		
		assertTrue(input.isEnableCellReferencing());
		
		input = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, 1).enableCellReferencing(false).build();
		
		assertFalse(input.isEnableCellReferencing());
		
		input = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, 1).enableCellReferencing(true).build();
		
		assertTrue(input.isEnableCellReferencing());
		
		input = new PafExcelInput.Builder(workbookExcel2007, sheetId, 1).enableCellReferencing(false).build();
		
		assertFalse(input.isEnableCellReferencing());
		
		input = new PafExcelInput.Builder(workbookExcel2007, sheetId, 1).enableCellReferencing(true).build();
		
		assertTrue(input.isEnableCellReferencing());
		
	}

	/**
	 * Test method for {@link com.pace.base.project.excel.PafExcelInput#isMultiDataRow()}.
	 */
	public void testIsMultiDataRow() {

		PafExcelInput input = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).build();
		
		assertFalse(input.isMultiDataRow());
		
		input = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, 1).build();
		
		assertFalse(input.isMultiDataRow());
		
		input = new PafExcelInput.Builder(workbookExcel2007, sheetId, 1).build();
		
		assertFalse(input.isMultiDataRow());
		
		input = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).multiDataRow(false).build();
		
		assertFalse(input.isMultiDataRow());
		
		input = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).multiDataRow(true).build();
		
		assertTrue(input.isMultiDataRow());
		
		input = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, 1).multiDataRow(false).build();
		
		assertFalse(input.isMultiDataRow());
		
		input = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, 1).multiDataRow(true).build();
		
		assertTrue(input.isMultiDataRow());
		
		input = new PafExcelInput.Builder(workbookExcel2007, sheetId, 1).multiDataRow(false).build();
		
		assertFalse(input.isMultiDataRow());
		
		input = new PafExcelInput.Builder(workbookExcel2007, sheetId, 1).multiDataRow(true).build();
		
		assertTrue(input.isMultiDataRow());
	}

	/**
	 * Test method for {@link com.pace.base.project.excel.PafExcelInput#getStartDataReadColumnIndex()}.
	 */
	public void testGetStartDataReadColumnIndex() {
		
		PafExcelInput input = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).build();
		
		assertNull(input.getStartDataReadColumnIndex());
		
		input = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, 1).build();
		
		assertNull(input.getStartDataReadColumnIndex());
		
		input = new PafExcelInput.Builder(workbookExcel2007, sheetId, 1).build();
		
		assertNull(input.getStartDataReadColumnIndex());
		
		input = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).startDataReadColumnIndex(startColumn).build();
		
		assertEquals(Integer.valueOf(startColumn), input.getStartDataReadColumnIndex());
		
		input = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, 1).startDataReadColumnIndex(startColumn).build();
		
		assertEquals(Integer.valueOf(startColumn), input.getStartDataReadColumnIndex());
		
		input = new PafExcelInput.Builder(workbookExcel2007, sheetId, 1).startDataReadColumnIndex(startColumn).build();
		
		assertEquals(Integer.valueOf(startColumn), input.getStartDataReadColumnIndex());
		
		startColumn = 22;
		
		input = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).startDataReadColumnIndex(startColumn).build();
		
		assertEquals(Integer.valueOf(startColumn), input.getStartDataReadColumnIndex());
		
		input = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, 1).startDataReadColumnIndex(startColumn).build();
		
		assertEquals(Integer.valueOf(startColumn), input.getStartDataReadColumnIndex());
		
		input = new PafExcelInput.Builder(workbookExcel2007, sheetId, 1).startDataReadColumnIndex(startColumn).build();
		
		assertEquals(Integer.valueOf(startColumn), input.getStartDataReadColumnIndex());
	}

	/**
	 * Test method for {@link com.pace.base.project.excel.PafExcelInput#isSheetRequired()}.
	 */
	public void testIsSheetRequired() {
		
		PafExcelInput input = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).build();
		
		assertFalse(input.isSheetRequired());
		
		input = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, 1).build();
		
		assertFalse(input.isSheetRequired());
		
		input = new PafExcelInput.Builder(workbookExcel2007, sheetId, 1).build();
		
		assertFalse(input.isSheetRequired());
		
		input = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).sheetRequired(false).build();
		
		assertFalse(input.isSheetRequired());
		
		input = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).sheetRequired(true).build();
		
		assertTrue(input.isSheetRequired());
		
		input = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, 1).sheetRequired(false).build();
		
		assertFalse(input.isSheetRequired());
		
		input = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, 1).sheetRequired(true).build();
		
		assertTrue(input.isSheetRequired());
		
		input = new PafExcelInput.Builder(workbookExcel2007, sheetId, 1).sheetRequired(false).build();
		
		assertFalse(input.isSheetRequired());
		
		input = new PafExcelInput.Builder(workbookExcel2007, sheetId, 1).sheetRequired(true).build();
		
		assertTrue(input.isSheetRequired());
		
	}

	/**
	 * Test method for {@link com.pace.base.project.excel.PafExcelInput#isExcludeDefaultValuesOnWrite()}.
	 */
	public void testIsExcludeDefaultValuesOnWrite() {

		PafExcelInput input = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).build();
		
		assertFalse(input.isExcludeDefaultValuesOnWrite());
		
		input = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, 1).build();
		
		assertFalse(input.isExcludeDefaultValuesOnWrite());
		
		input = new PafExcelInput.Builder(workbookExcel2007, sheetId, 1).build();
		
		assertFalse(input.isExcludeDefaultValuesOnWrite());
		
		input = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).excludeDefaultValuesOnWrite(false).build();
		
		assertFalse(input.isExcludeDefaultValuesOnWrite());
		
		input = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).excludeDefaultValuesOnWrite(true).build();
		
		assertTrue(input.isExcludeDefaultValuesOnWrite());
		
		input = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, 1).excludeDefaultValuesOnWrite(false).build();
		
		assertFalse(input.isExcludeDefaultValuesOnWrite());
		
		input = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, 1).excludeDefaultValuesOnWrite(true).build();
		
		assertTrue(input.isExcludeDefaultValuesOnWrite());
		
		input = new PafExcelInput.Builder(workbookExcel2007, sheetId, 1).excludeDefaultValuesOnWrite(false).build();
		
		assertFalse(input.isExcludeDefaultValuesOnWrite());
		
		input = new PafExcelInput.Builder(workbookExcel2007, sheetId, 1).excludeDefaultValuesOnWrite(true).build();
		
		assertTrue(input.isExcludeDefaultValuesOnWrite());
	}
	
	/**
	 * Test method for {@link com.pace.base.project.excel.PafExcelInput#isAutoSizeColumns()}.
	 */
	public void testIsAutoSizeColumns() {

		PafExcelInput input = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).build();
		
		assertTrue(input.isAutoSizeColumns());
		
		input = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, 1).build();
		
		assertTrue(input.isAutoSizeColumns());
		
		input = new PafExcelInput.Builder(workbookExcel2007, sheetId, 1).build();
		
		assertTrue(input.isAutoSizeColumns());
		
		input = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).autoSizeColumns(false).build();
		
		assertFalse(input.isAutoSizeColumns());
		
		input = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).autoSizeColumns(true).build();
		
		assertTrue(input.isAutoSizeColumns());
		
		input = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, 1).autoSizeColumns(false).build();
		
		assertFalse(input.isAutoSizeColumns());
		
		input = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, 1).autoSizeColumns(true).build();
		
		assertTrue(input.isAutoSizeColumns());
		
		input = new PafExcelInput.Builder(workbookExcel2007, sheetId, 1).autoSizeColumns(false).build();
		
		assertFalse(input.isAutoSizeColumns());
		
		input = new PafExcelInput.Builder(workbookExcel2007, sheetId, 1).autoSizeColumns(true).build();
		
		assertTrue(input.isAutoSizeColumns());
	}
	
	/**
	 * Test method for {@link com.pace.base.project.excel.PafExcelInput#isAutoWriteToFileSystem()}.
	 */
	public void testIsAutoWriteToFileSystem() {

		PafExcelInput input = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).build();
		
		assertFalse(input.isAutoWriteToFileSystem());
		
		input = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, 1).build();
		
		assertFalse(input.isAutoWriteToFileSystem());
		
		input = new PafExcelInput.Builder(workbookExcel2007, sheetId, 1).build();
		
		assertFalse(input.isAutoWriteToFileSystem());
		
		input = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).autoWriteToFileSystem(false).build();
		
		assertFalse(input.isAutoWriteToFileSystem());	
		
		input = new PafExcelInput.Builder(fullWorkbookNameExcel2007, sheetId, 1).autoWriteToFileSystem(true).build();
		
		assertTrue(input.isAutoWriteToFileSystem());
		
		input = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, 1).autoWriteToFileSystem(false).build();
		
		assertFalse(input.isAutoWriteToFileSystem());
		
		input = new PafExcelInput.Builder(workbookDirName, workbookName, sheetId, 1).autoWriteToFileSystem(true).build();
		
		assertTrue(input.isAutoWriteToFileSystem());
		
		input = new PafExcelInput.Builder(workbookExcel2007, sheetId, 1).autoWriteToFileSystem(false).build();
		
		assertFalse(input.isAutoWriteToFileSystem());	
		
		input = new PafExcelInput.Builder(workbookExcel2007, sheetId, 1).autoWriteToFileSystem(true).build();
		
		assertTrue(input.isAutoWriteToFileSystem());
		
	}
	
}
