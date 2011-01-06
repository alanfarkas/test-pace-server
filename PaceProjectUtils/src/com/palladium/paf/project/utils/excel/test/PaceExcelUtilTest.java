/**
 * 
 */
package com.palladium.paf.project.utils.excel.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.palladium.paf.PafException;
import com.palladium.paf.project.utils.excel.PaceExcelInput;
import com.palladium.paf.project.utils.excel.PaceExcelUtil;
import com.palladium.paf.project.utils.excel.PaceExcelRow;
import com.palladium.paf.project.utils.excel.PaceExcelRowItem;

/**
 * @author jmilliron
 *
 */
public class PaceExcelUtilTest extends TestCase {

	private static final String TST_WORKBOOK_XLSX = "tst-workbook.xlsx";
	
	private PaceExcelInput input1 = null;
			
	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		
		 input1 = new PaceExcelInput("test", "test_workbook", "test_sheet", 4, new ArrayList<String>());
		 		 
		 
		
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Test method for {@link com.palladium.paf.project.utils.excel.PaceExcelUtil#readExcelSheet(com.palladium.paf.project.utils.excel.PaceExcelInput)}.
	 */
	public void testReadExcelSheet1() {
							
		try {
									
			List<PaceExcelRow> paceRows = PaceExcelUtil.readExcelSheet(input1);
			
			assertNotNull(paceRows);
			assertEquals(paceRows.size(), 1);
			
			PaceExcelRow paceRow = paceRows.get(0);
			
			assertNotNull(paceRow);
			
			assertEquals(4, paceRow.getPaceRowItems().size() );
			
			for ( int i = 0; i <  paceRow.getPaceRowItems().size(); i++) {
				
				PaceExcelRowItem item = paceRow.getPaceRowItems().get(i);
				
				switch (i) {
				
				case 0:
					
					assertEquals(item.isNumeric(), true);
					assertEquals(item.isString(), false);
					assertEquals(item.isFormula(), false);
					assertEquals(item.isBoolean(), false);
					assertEquals(item.isBlank(), false);
					
					assertEquals(item.getInteger(), new Integer(1));		
					
					break;
				case 1:
					
					assertEquals(item.isNumeric(), true);
					assertEquals(item.isString(), false);
					assertEquals(item.isFormula(), false);
					assertEquals(item.isBoolean(), false);
					assertEquals(item.isBlank(), false);
					
					assertEquals(item.getDouble(), new Double(1.2));
					
					break;
				case 2:
					
					assertEquals(item.isNumeric(), false);
					assertEquals(item.isString(), true);
					assertEquals(item.isFormula(), false);
					assertEquals(item.isBoolean(), false);
					assertEquals(item.isBlank(), false);
					
					assertEquals(item.getString(), "This is a string");
					
					break;
				case 3:
					
					assertEquals(item.isNumeric(), false);
					assertEquals(item.isString(), false);
					assertEquals(item.isFormula(), false);
					assertEquals(item.isBoolean(), true);
					assertEquals(item.isBlank(), false);
					
					assertEquals(item.getBoolean(), Boolean.TRUE);
					
					break;
				default:
					fail("Invalid item");
				
				}
				
			}
				
			
		} catch (PafException e) {
	
			fail("Should not throw exception: " + e.getMessage());
			
		}
		
	}

	/**
	 * Test method for {@link com.palladium.paf.project.utils.excel.PaceExcelUtil#readExcelSheet(com.palladium.paf.project.utils.excel.PaceExcelInput)}.
	 */
	public void testReadExcelSheet2() {
		
		try {
			
			PaceExcelInput input2 = new PaceExcelInput("test", "selfridges", "PlanType", 1, Arrays.asList("plan type"));
			
			List<PaceExcelRow> paceRows = PaceExcelUtil.readExcelSheet(input2);
			
			assertEquals(2, paceRows.size());
			
			PaceExcelRow paceRow1 = paceRows.get(0);
			
			assertEquals(true, paceRow1.isHeader());
			
			PaceExcelRow paceRow2 = paceRows.get(1);
			
			assertEquals(false, paceRow2.isHeader());
			
			input2 = new PaceExcelInput("test", "selfridges", "PlanCycles", 2, Arrays.asList("label", "version"), "eos");
			
			paceRows = PaceExcelUtil.readExcelSheet(input2);
			
			for (PaceExcelRow paceRow : paceRows) {
				
				if ( paceRow.isHeader()) {
					
					System.out.println("Header: " + paceRow.toString());
					
				} else {
					
					System.out.println("Data: " + paceRow.toString());
					
				}
				
			}
		
		} catch (Exception e) {
			
			fail("Should not throw exception: " + e.getMessage());
			
		} 
		
	}
	
	/**
	 * Test method for {@link com.palladium.paf.project.utils.excel.PaceExcelUtil#readExcelSheet(com.palladium.paf.project.utils.excel.PaceExcelInput)}.
	 */
	public void testReadExcelSheet3() {
		
		try {
			
			List<String> header1 = new ArrayList<String>(Arrays.asList("header1", "header2", "header3", "header4"));
			List<String> header2 = new ArrayList<String>(Arrays.asList("", "header5", "header6", "header7", "header8"));
			List<String> header3 = new ArrayList<String>(Arrays.asList("", "", "header9", "header10"));
			List<String> header4 = new ArrayList<String>(Arrays.asList("", "header11", "38"));
			
			Map<String, List<String>> headerMap = new HashMap<String, List<String>>();
			headerMap.put("one", header1);
			headerMap.put("two", header2);
			headerMap.put("three", header3);
			headerMap.put("four", header4);
			
			PaceExcelInput input2 = new PaceExcelInput("test", "multiHeader", "Sheet1", 5, headerMap, "eos");
			
			List<PaceExcelRow> paceRows = PaceExcelUtil.readExcelSheet(input2);
			
			assertEquals(9, paceRows.size());
			assertEquals(Boolean.TRUE, new Boolean(paceRows.get(0).isHeader()));
			assertEquals(Boolean.FALSE, new Boolean(paceRows.get(1).isHeader()));
			assertEquals(Boolean.TRUE, new Boolean(paceRows.get(2).isHeader()));
			assertEquals(Boolean.FALSE, new Boolean(paceRows.get(3).isHeader()));
			assertEquals(Boolean.FALSE, new Boolean(paceRows.get(4).isHeader()));
			assertEquals(Boolean.TRUE, new Boolean(paceRows.get(5).isHeader()));
			assertEquals(Boolean.FALSE, new Boolean(paceRows.get(6).isHeader()));
			assertEquals(Boolean.TRUE, new Boolean(paceRows.get(7).isHeader()));
			assertEquals(Boolean.FALSE, new Boolean(paceRows.get(8).isHeader()));
						
			PaceExcelRow rowTwo = paceRows.get(1);			
			
			assertEquals(Boolean.TRUE, new Boolean(rowTwo.getPaceRowItems().get(0).isString()));
			assertEquals("a", rowTwo.getPaceRowItems().get(0).getString());
			
			assertEquals(Boolean.TRUE, new Boolean(rowTwo.getPaceRowItems().get(1).isNumeric()));
			assertEquals(new Integer(34), rowTwo.getPaceRowItems().get(1).getInteger());
			
			assertEquals(Boolean.TRUE, new Boolean(rowTwo.getPaceRowItems().get(2).isString()));
			assertEquals("b", rowTwo.getPaceRowItems().get(2).getString());

			assertEquals(Boolean.TRUE, new Boolean(rowTwo.getPaceRowItems().get(3).isNumeric()));
			assertEquals(new Integer(33), rowTwo.getPaceRowItems().get(3).getInteger());
			
			PaceExcelRow rowFour = paceRows.get(3);	
			
			assertEquals(Boolean.TRUE, new Boolean(rowFour.getPaceRowItems().get(0).isBlank()));
			assertEquals("", rowFour.getPaceRowItems().get(0).getValueAsString());
			assertEquals("", rowFour.getPaceRowItems().get(0).getBlank());
			
			assertEquals(Boolean.TRUE, new Boolean(rowFour.getPaceRowItems().get(1).isString()));
			assertEquals("a", rowFour.getPaceRowItems().get(1).getString());		
			
			assertEquals(Boolean.TRUE, new Boolean(rowFour.getPaceRowItems().get(2).isString()));
			assertEquals("b", rowFour.getPaceRowItems().get(2).getString());		
			
			assertEquals(Boolean.TRUE, new Boolean(rowFour.getPaceRowItems().get(3).isString()));
			assertEquals("c", rowFour.getPaceRowItems().get(3).getString());		
			
			assertEquals(Boolean.TRUE, new Boolean(rowFour.getPaceRowItems().get(4).isString()));
			assertEquals("d", rowFour.getPaceRowItems().get(4).getString());		
			
			PaceExcelRow rowSeven = paceRows.get(6);
			
			assertEquals(Boolean.TRUE, new Boolean(rowSeven.getPaceRowItems().get(0).isBlank()));
			assertEquals("", rowSeven.getPaceRowItems().get(0).getValueAsString());
			assertEquals("", rowSeven.getPaceRowItems().get(0).getBlank());
			
			assertEquals(Boolean.TRUE, new Boolean(rowSeven.getPaceRowItems().get(1).isBlank()));
			assertEquals("", rowSeven.getPaceRowItems().get(1).getValueAsString());
			assertEquals("", rowSeven.getPaceRowItems().get(1).getBlank());
			
			assertEquals(Boolean.TRUE, new Boolean(rowSeven.getPaceRowItems().get(2).isNumeric()));
			assertEquals(new Integer(33), rowSeven.getPaceRowItems().get(2).getInteger());
			
			assertEquals(Boolean.TRUE, new Boolean(rowSeven.getPaceRowItems().get(3).isNumeric()));
			assertEquals(new Double(84.48), rowSeven.getPaceRowItems().get(3).getDouble());
			
			PaceExcelRow rowEightHeader = paceRows.get(7);
			
			assertEquals(Boolean.TRUE, new Boolean(rowEightHeader.getPaceRowItems().get(0).isBlank()));
			assertEquals(Boolean.FALSE, new Boolean(rowEightHeader.getPaceRowItems().get(0).isString()));
			assertEquals(Boolean.TRUE, new Boolean(rowEightHeader.getPaceRowItems().get(0).isBlank()));
			
			assertEquals(Boolean.TRUE, new Boolean(rowEightHeader.getPaceRowItems().get(2).isNumeric()));
			assertEquals(new Integer(38), rowEightHeader.getPaceRowItems().get(2).getInteger());
			assertEquals("38", rowEightHeader.getPaceRowItems().get(2).getValueAsString());
			
			assertEquals(Boolean.TRUE, new Boolean(rowEightHeader.getPaceRowItems().get(3).isNumeric()));
			assertEquals(new Double(89.88), rowEightHeader.getPaceRowItems().get(3).getDouble());
			assertEquals("89.88", rowEightHeader.getPaceRowItems().get(3).getValueAsString());
			
		} catch (Exception e) {
			
			fail("Should not throw exception: " + e.getMessage());
			
		} 
	}
	
	public void testReadExcelSheet4() {
		
		File tstFile = new File(TST_WORKBOOK_XLSX);
		
		if ( tstFile.exists() && tstFile.isFile()) {
			
			tstFile.delete();
			
		}
		
		Workbook wbToReadFrom = new XSSFWorkbook();

		CreationHelper createHelper = wbToReadFrom.getCreationHelper();
		
		String SHEET_NAME = "TEST_SHEET_1";
		
		Sheet sheet = wbToReadFrom.createSheet(SHEET_NAME);

		// Create a row and put some cells in it. Rows are 0 based.
		Row row = sheet.createRow((short) 0);
		// Create a cell and put a value in it.
		Cell cell = row.createCell(0);
		cell.setCellValue(1);

		// Or do it on one line.
		row.createCell(1).setCellValue(1.2);
		String TEST_STRING = "This is a string";
		row.createCell(2).setCellValue(
				createHelper.createRichTextString(TEST_STRING));
		row.createCell(3).setCellValue(true);

		/*// Write the output to a file
		FileOutputStream fileOut;
		try {
			fileOut = new FileOutputStream(TST_WORKBOOK_XLSX);
			wbToReadFrom.write(fileOut);
			fileOut.close();
		} catch (FileNotFoundException e1) {

			fail(e1.getMessage());
			
		} catch (IOException e) {
			
			fail(e.getMessage());
			
		}*/
		
		List<String> emptyList = new ArrayList<String>();
		
		PaceExcelInput input = new PaceExcelInput(wbToReadFrom, SHEET_NAME, 4, emptyList);
						
		try {
			List<PaceExcelRow> paceRows = PaceExcelUtil.readExcelSheet(input);
			
			assertNotNull(paceRows);
			assertEquals(1, paceRows.size());
			
			PaceExcelRow rowOne = paceRows.get(0);
			
			assertEquals(4, rowOne.getPaceRowItems().size());
			assertEquals(new Integer(1), rowOne.getPaceRowItems().get(0).getInteger());
			assertEquals(1.2, rowOne.getPaceRowItems().get(1).getDouble());
			assertEquals(TEST_STRING, rowOne.getPaceRowItems().get(2).getString());
			assertEquals(Boolean.TRUE, new Boolean(rowOne.getPaceRowItems().get(3).getBoolean()));
			
		} catch (PafException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		
		
	}
	
	/**
	 * Test method for {@link com.palladium.paf.project.utils.excel.PaceExcelUtil#writeExcelSheet(com.palladium.paf.project.utils.excel.PaceExcelInput, java.util.List)}.
	 */
	public void testWriteExcelSheet() {
		fail("Not yet implemented");
	}

}
