/**
 * 
 */
package com.palladium.paf.project.utils.excel.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import com.palladium.paf.project.utils.excel.PaceExcelInput;

/**
 * @author jmilliron
 *
 */
public class PaceExcelInputTest extends TestCase {

	String workbookDir = "C:\\test\\";
	String workbookName = "workbook";
	String sheetName = "sheet1";
	int numberOfCols = 5;
	
	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		
		
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Test method for {@link com.palladium.paf.project.utils.excel.PaceExcelInput#PaceExcelInput(java.lang.String, java.lang.String, java.lang.String, int, java.util.List)}.
	 */
	public void testPaceExcelInputStringStringStringIntListOfString() {

		PaceExcelInput input = null;
		
		try {
			
			input = new PaceExcelInput(null, workbookName, sheetName, numberOfCols, new ArrayList<String>());	
			
			fail("workbook dir can't be null");
			
		} catch (Exception e ) {			
			
			if ( ! (e instanceof IllegalArgumentException) ) {
				fail ("Unexpected exception occured");
			}
			
		}
		
		try {
			
			input = new PaceExcelInput(workbookDir, null, sheetName, numberOfCols, new ArrayList<String>());	
			
			fail("workbook name can't be null");
			
		} catch (Exception e ) {			
			
			if ( ! (e instanceof IllegalArgumentException) ) {
				fail ("Unexpected exception occured");
			}
			
		}
		
		try {
			
			input = new PaceExcelInput(workbookDir, workbookName, null, numberOfCols, new ArrayList<String>());	
			
			fail("workbook sheet can't be null");
			
		} catch (Exception e ) {			
			
			if ( ! (e instanceof IllegalArgumentException) ) {
				fail ("Unexpected exception occured");
			}
			
		}
		
		try {
			
			input = new PaceExcelInput(workbookDir, workbookName, sheetName, 0, new ArrayList<String>());	
			
			fail("workbook number of columns can't be less than 1");
			
		} catch (Exception e ) {			
			
			if ( ! (e instanceof IllegalArgumentException) ) {
				fail ("Unexpected exception occured");
			}
			
		}
				
		input = new PaceExcelInput(workbookDir, workbookName, sheetName, numberOfCols, new ArrayList<String>());
		
		assertEquals(0, input.getHeaderListMap().size());
		
		String one = "one";
		
		input = new PaceExcelInput(workbookDir, workbookName, sheetName, numberOfCols, new ArrayList<String>(Arrays.asList(one)));
		
		assertEquals(1, input.getHeaderListMap().size());
		assertEquals(Boolean.TRUE, new Boolean(input.getHeaderListMap().keySet().contains(sheetName)));
		assertEquals(1, input.getHeaderListMap().get(sheetName).size());
		assertEquals(one, input.getHeaderListMap().get(sheetName).get(0));
				
		assertEquals(workbookDir, input.getWorkbookDirectory());
		assertEquals(workbookName, input.getWorkbookName());
		assertEquals(sheetName, input.getSheetName());		
		assertEquals(workbookDir + workbookName + PaceExcelInput.XLSX_EXT, input.getFullWorkbookName());		
		assertEquals(numberOfCols, input.getNumberOfColumns());
		
		String two = "two";
		
		input = new PaceExcelInput(workbookDir, workbookName, sheetName, numberOfCols, new ArrayList<String>(Arrays.asList(one, two)));
		
		assertEquals(1, input.getHeaderListMap().size());
		assertEquals(Boolean.TRUE, new Boolean(input.getHeaderListMap().keySet().contains(sheetName)));
		assertEquals(2, input.getHeaderListMap().get(sheetName).size());
		assertEquals(one, input.getHeaderListMap().get(sheetName).get(0));
		assertEquals(two, input.getHeaderListMap().get(sheetName).get(1));
		
		assertEquals(workbookDir, input.getWorkbookDirectory());
		assertEquals(workbookName, input.getWorkbookName());
		assertEquals(sheetName, input.getSheetName());		
		assertEquals(workbookDir + workbookName + PaceExcelInput.XLSX_EXT, input.getFullWorkbookName());		
		assertEquals(numberOfCols, input.getNumberOfColumns());
		
	}

	/**
	 * Test method for {@link com.palladium.paf.project.utils.excel.PaceExcelInput#PaceExcelInput(java.lang.String, java.lang.String, java.lang.String, int, java.util.List, java.lang.String)}.
	 */
	public void testPaceExcelInputStringStringStringIntListOfStringString() {
		
		String one = "one";
		String two = "two";
		
		PaceExcelInput input = new PaceExcelInput(workbookDir, workbookName, sheetName, numberOfCols, new ArrayList<String>(Arrays.asList(one, two)), null);
		
		assertEquals(1, input.getHeaderListMap().size());
		assertEquals(Boolean.TRUE, new Boolean(input.getHeaderListMap().keySet().contains(sheetName)));
		assertEquals(2, input.getHeaderListMap().get(sheetName).size());
		assertEquals(one, input.getHeaderListMap().get(sheetName).get(0));
		assertEquals(two, input.getHeaderListMap().get(sheetName).get(1));
		
		assertEquals(workbookDir, input.getWorkbookDirectory());
		assertEquals(workbookName, input.getWorkbookName());
		assertEquals(sheetName, input.getSheetName());		
		assertEquals(workbookDir + workbookName + PaceExcelInput.XLSX_EXT, input.getFullWorkbookName());		
		assertEquals(numberOfCols, input.getNumberOfColumns());
		
		assertEquals(null, input.getEndOfSheetFlag());
		
		input = new PaceExcelInput(workbookDir, workbookName, sheetName, numberOfCols, new ArrayList<String>(Arrays.asList(one, two)), one);
		assertEquals(one, input.getEndOfSheetFlag());
		
		input = new PaceExcelInput(workbookDir, workbookName, sheetName, numberOfCols, new ArrayList<String>(Arrays.asList(one, two)), two);
		assertEquals(two, input.getEndOfSheetFlag());
		
	}

	/**
	 * Test method for {@link com.palladium.paf.project.utils.excel.PaceExcelInput#PaceExcelInput(java.lang.String, java.lang.String, java.lang.String, int, java.util.Map)}.
	 */
	public void testPaceExcelInputStringStringStringIntMapOfStringListOfString() {

		PaceExcelInput input = null;
		
		Map<String, List<String>> mapOfHeaderList = new HashMap<String, List<String>>();
		
		try {
			
			input = new PaceExcelInput(null, workbookName, sheetName, numberOfCols, mapOfHeaderList);	
			
			fail("workbook dir can't be null");
			
		} catch (Exception e ) {			
			
			if ( ! (e instanceof IllegalArgumentException) ) {
				fail ("Unexpected exception occured");
			}
			
		}
		
		try {
			
			input = new PaceExcelInput(workbookDir, null, sheetName, numberOfCols, mapOfHeaderList);	
			
			fail("workbook name can't be null");
			
		} catch (Exception e ) {			
			
			if ( ! (e instanceof IllegalArgumentException) ) {
				fail ("Unexpected exception occured");
			}
			
		}
		
		try {
			
			input = new PaceExcelInput(workbookDir, workbookName, null, numberOfCols, mapOfHeaderList);	
			
			fail("workbook sheet can't be null");
			
		} catch (Exception e ) {			
			
			if ( ! (e instanceof IllegalArgumentException) ) {
				fail ("Unexpected exception occured");
			}
			
		}
		
		try {
			
			input = new PaceExcelInput(workbookDir, workbookName, sheetName, 0, mapOfHeaderList);	
			
			fail("workbook number of columns can't be less than 1");
			
		} catch (Exception e ) {			
			
			if ( ! (e instanceof IllegalArgumentException) ) {
				fail ("Unexpected exception occured");
			}
			
		}
				
		input = new PaceExcelInput(workbookDir, workbookName, sheetName, numberOfCols, mapOfHeaderList);
		
		assertEquals(0, input.getHeaderListMap().size());
		
		String one = "one";
		
		mapOfHeaderList.put(sheetName, new ArrayList<String>(Arrays.asList(one)));
		
		input = new PaceExcelInput(workbookDir, workbookName, sheetName, numberOfCols, mapOfHeaderList);
		
		assertEquals(1, input.getHeaderListMap().size());
		assertEquals(Boolean.TRUE, new Boolean(input.getHeaderListMap().keySet().contains(sheetName)));
		assertEquals(1, input.getHeaderListMap().get(sheetName).size());
		assertEquals(one, input.getHeaderListMap().get(sheetName).get(0));
				
		assertEquals(workbookDir, input.getWorkbookDirectory());
		assertEquals(workbookName, input.getWorkbookName());
		assertEquals(sheetName, input.getSheetName());		
		assertEquals(workbookDir + workbookName + PaceExcelInput.XLSX_EXT, input.getFullWorkbookName());		
		assertEquals(numberOfCols, input.getNumberOfColumns());
		
		String two = "two";
		
		mapOfHeaderList.put(sheetName, new ArrayList<String>(Arrays.asList(one, two)));
		
		input = new PaceExcelInput(workbookDir, workbookName, sheetName, numberOfCols, mapOfHeaderList);
		
		assertEquals(1, input.getHeaderListMap().size());
		assertEquals(Boolean.TRUE, new Boolean(input.getHeaderListMap().keySet().contains(sheetName)));
		assertEquals(2, input.getHeaderListMap().get(sheetName).size());
		assertEquals(one, input.getHeaderListMap().get(sheetName).get(0));
		assertEquals(two, input.getHeaderListMap().get(sheetName).get(1));
		
		assertEquals(workbookDir, input.getWorkbookDirectory());
		assertEquals(workbookName, input.getWorkbookName());
		assertEquals(sheetName, input.getSheetName());		
		assertEquals(workbookDir + workbookName + PaceExcelInput.XLSX_EXT, input.getFullWorkbookName());		
		assertEquals(numberOfCols, input.getNumberOfColumns());
		
		mapOfHeaderList.clear();
		mapOfHeaderList.put(one, new ArrayList<String>(Arrays.asList(one, two)));
		mapOfHeaderList.put(two, new ArrayList<String>(Arrays.asList(two, one)));
		
		input = new PaceExcelInput(workbookDir, workbookName, sheetName, numberOfCols, mapOfHeaderList);
		
		assertEquals(2, input.getHeaderListMap().size());
		assertEquals(Boolean.FALSE, new Boolean(input.getHeaderListMap().keySet().contains(sheetName)));
		assertEquals(Boolean.TRUE, new Boolean(input.getHeaderListMap().keySet().contains(one)));
		assertEquals(Boolean.TRUE, new Boolean(input.getHeaderListMap().keySet().contains(two)));
		
		assertEquals(2, input.getHeaderListMap().get(one).size());
		assertEquals(one, input.getHeaderListMap().get(one).get(0));
		assertEquals(two, input.getHeaderListMap().get(one).get(1));
		
		assertEquals(2, input.getHeaderListMap().get(two).size());
		assertEquals(two, input.getHeaderListMap().get(two).get(0));
		assertEquals(one, input.getHeaderListMap().get(two).get(1));
		
		assertEquals(workbookDir, input.getWorkbookDirectory());
		assertEquals(workbookName, input.getWorkbookName());
		assertEquals(sheetName, input.getSheetName());		
		assertEquals(workbookDir + workbookName + PaceExcelInput.XLSX_EXT, input.getFullWorkbookName());		
		assertEquals(numberOfCols, input.getNumberOfColumns());
	}

	/**
	 * Test method for {@link com.palladium.paf.project.utils.excel.PaceExcelInput#PaceExcelInput(java.lang.String, java.lang.String, java.lang.String, int, java.util.Map, java.lang.String)}.
	 */
	public void testPaceExcelInputStringStringStringIntMapOfStringListOfStringString() {
	
		String one = "one";
		String two = "two";
		
		Map<String, List<String>> mapOfHeaderList = new HashMap<String, List<String>>();
		
		PaceExcelInput input = new PaceExcelInput(workbookDir, workbookName, sheetName, numberOfCols, mapOfHeaderList, null);
	
		assertEquals(null, input.getEndOfSheetFlag());
		
		input = new PaceExcelInput(workbookDir, workbookName, sheetName, numberOfCols, mapOfHeaderList, one);
		assertEquals(one, input.getEndOfSheetFlag());
		
		input = new PaceExcelInput(workbookDir, workbookName, sheetName, numberOfCols, mapOfHeaderList, two);
		assertEquals(two, input.getEndOfSheetFlag());
	}

	/**
	 * Test method for {@link com.palladium.paf.project.utils.excel.PaceExcelInput#getFullWorkbookName()}.
	 */
	public void testGetFullWorkbookName() {

		Map<String, List<String>> mapOfHeaderList = new HashMap<String, List<String>>();
		
		PaceExcelInput input = new PaceExcelInput(workbookDir, workbookName, sheetName, numberOfCols, mapOfHeaderList);
				
		assertEquals(workbookDir + workbookName + PaceExcelInput.XLSX_EXT, input.getFullWorkbookName());
	}

	/**
	 * Test method for {@link com.palladium.paf.project.utils.excel.PaceExcelInput#getHeaderListMap()}.
	 */
	public void testGetHeaderListMap() {
		
				
		PaceExcelInput input = new PaceExcelInput(workbookDir, workbookName, sheetName, numberOfCols, new ArrayList<String>());
		
		assertNotNull(input.getHeaderListMap());
		assertEquals(0, input.getHeaderListMap().size());
		
		input = new PaceExcelInput(workbookDir, workbookName, sheetName, numberOfCols, new HashMap<String, List<String>>());

		assertNotNull(input.getHeaderListMap());
		assertEquals(0, input.getHeaderListMap().size());
						
	}

	/**
	 * Test method for {@link com.palladium.paf.project.utils.excel.PaceExcelInput#setHeaderListMap(java.util.Map)}.
	 */
	public void testSetHeaderListMap() {

		PaceExcelInput input = new PaceExcelInput(workbookDir, workbookName, sheetName, numberOfCols, new HashMap<String, List<String>>());

		assertNotNull(input.getHeaderListMap());
		assertEquals(0, input.getHeaderListMap().size());
		
		input.setHeaderListMap(null);

		assertNotNull(input.getHeaderListMap());
		assertEquals(0, input.getHeaderListMap().size());
		
		String one = "one";
		String two = "two";
		
		Map<String, List<String>> mapOfHeaderList = new HashMap<String, List<String>>();
		
		mapOfHeaderList.put(one, Arrays.asList(one, two, one));
		mapOfHeaderList.put(two, Arrays.asList(two, one));
		
		input.setHeaderListMap(mapOfHeaderList);
		
		assertNotNull(input.getHeaderListMap());
		assertEquals(2, input.getHeaderListMap().size());
		
		for (String key : mapOfHeaderList.keySet()) {
			
			List<String> headerList = mapOfHeaderList.get(key);
			
			assertNotNull(headerList);
			assertEquals(Boolean.TRUE, new Boolean(input.getHeaderListMap().containsKey(key)));
			assertEquals(headerList.size(), input.getHeaderListMap().get(key).size());
			
			for (int i = 0; i < headerList.size(); i++) {
				
				assertEquals(headerList.get(i), input.getHeaderListMap().get(key).get(i));
				
			}
			
			
		}
		
	}

	/**
	 * Test method for {@link com.palladium.paf.project.utils.excel.PaceExcelInput#getNumberOfColumns()}.
	 */
	public void testGetNumberOfColumns() {
		
		PaceExcelInput input = new PaceExcelInput(workbookDir, workbookName, sheetName, numberOfCols, new HashMap<String, List<String>>());
		
		assertEquals(numberOfCols, input.getNumberOfColumns());
		
		input.setNumberOfColumns(4);
		
		assertEquals(4, input.getNumberOfColumns());
				
	}

	/**
	 * Test method for {@link com.palladium.paf.project.utils.excel.PaceExcelInput#setNumberOfColumns(int)}.
	 */
	public void testSetNumberOfColumns() {
		
		PaceExcelInput input = new PaceExcelInput(workbookDir, workbookName, sheetName, numberOfCols, new HashMap<String, List<String>>());
				
		input.setNumberOfColumns(4);
		
		assertEquals(4, input.getNumberOfColumns());
		
		try {
			
			input.setNumberOfColumns(0);
						
			fail("Can't be 0 or below");
		} catch (Exception e) {		
			
			
		}
		
		try {
			
			input.setNumberOfColumns(-1);
						
			fail("Can't be 0 or below");
		} catch (Exception e) {			
			
			
		}
	}

}
