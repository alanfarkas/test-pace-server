package com.palladium.paf.project.excel;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PafExcelValueObjectTest extends TestCase {
	
	public PafExcelValueObjectTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	private void helperTestAllType(PafExcelValueObject valueObject, PafExcelValueObjectType expectedType) {
		
		for (PafExcelValueObjectType type : PafExcelValueObjectType.values()) {
			
			if ( type.equals(expectedType)) {
		
				assertEquals(type, valueObject.getType());
				assertTrue(valueObject.isType(type));
				
			} else {
				
				assertNotSame(type, valueObject.getType());
				assertFalse(valueObject.isType(type));				
				
			}
			
			
		}
						
	}
	
	private void helperTestAllIs(PafExcelValueObject valueObject, PafExcelValueObjectType expectedType) {
		
		for (PafExcelValueObjectType type : PafExcelValueObjectType.values()) {
			
			switch (type) {
			case Boolean:
				if ( expectedType.equals(type)) {
					assertTrue(valueObject.isBoolean());
				} else {
					assertFalse(valueObject.isBoolean());
				}
				break;
			case Blank:
				if ( expectedType.equals(type)) {
					assertTrue(valueObject.isBlank());
				} else {
					assertFalse(valueObject.isBlank());
				}
				break;
			case Double:
				if ( expectedType.equals(type)) {
					assertTrue(valueObject.isDouble());
				} else {
					assertFalse(valueObject.isDouble());
				}
				break;
			case Integer:
				if ( expectedType.equals(type)) {
					assertTrue(valueObject.isInteger());
				} else {
					assertFalse(valueObject.isInteger());
				}
				break;				
				
			case Formula:
				
				if ( expectedType.equals(type)) {
					assertTrue(valueObject.isFormula());
				} else {
					assertFalse(valueObject.isFormula());
				}
				break;
				
			case String:
				
				if ( expectedType.equals(type)) {
					assertTrue(valueObject.isString());
				} else {
					assertFalse(valueObject.isString());
				}
				break;	
			case Numeric:
			case Error:
				break;
			
			default:
				fail("UNSUPPORTED IS TYPE");
			}
			
			if ( type.equals(expectedType)) {
		
				assertEquals(type, valueObject.getType());
				assertTrue(valueObject.isType(type));
				
			} else {
				
				assertNotSame(type, valueObject.getType());
				assertFalse(valueObject.isType(type));				
				
			}
			
			
		}
						
	}
	
	public void testCreateFromCell() {

		Workbook wb = new XSSFWorkbook();
		
		Sheet sheet = wb.createSheet();
		
		Row row = sheet.createRow(0);
		
		Cell cell = row.createCell(0, Cell.CELL_TYPE_STRING);
		
		PafExcelValueObject valueObject = PafExcelValueObject.createFromCell(wb, cell);
		
		assertNotNull(valueObject);
		helperTestAllType(valueObject, PafExcelValueObjectType.String);
		assertNotNull(valueObject.getString());
		assertEquals("", valueObject.getString());
		assertEquals("A1", valueObject.getCellAddress());
		
		String testStringValue = "TestStringValue";
		
		cell.setCellValue(testStringValue);
		
		valueObject = PafExcelValueObject.createFromCell(wb, cell);
		
		assertNotNull(valueObject);
		helperTestAllType(valueObject, PafExcelValueObjectType.String);
		assertNotNull(valueObject.getString());
		assertEquals(testStringValue, valueObject.getString());
		
		cell = row.createCell(1, Cell.CELL_TYPE_NUMERIC);
		
		valueObject = PafExcelValueObject.createFromCell(wb, cell);
		
		assertNotNull(valueObject);
		helperTestAllType(valueObject, PafExcelValueObjectType.Blank);
		assertEquals("B1", valueObject.getCellAddress());
	
		cell.setCellValue(29.34);
		
		valueObject = PafExcelValueObject.createFromCell(wb, cell);
		
		assertNotNull(valueObject);
		helperTestAllType(valueObject, PafExcelValueObjectType.Numeric);
		
		assertTrue(valueObject.isNumeric());
		
		cell = row.createCell(2, Cell.CELL_TYPE_BOOLEAN);
		
		valueObject = PafExcelValueObject.createFromCell(wb, cell);
		
		assertNotNull(valueObject);
		helperTestAllType(valueObject, PafExcelValueObjectType.Boolean);
		assertFalse(valueObject.getBoolean());
		
		cell.setCellValue(false);		
		valueObject = PafExcelValueObject.createFromCell(wb, cell);		
		helperTestAllType(valueObject, PafExcelValueObjectType.Boolean);
		assertFalse(valueObject.getBoolean());
		
		cell.setCellValue(true);		
		valueObject = PafExcelValueObject.createFromCell(wb, cell);		
		helperTestAllType(valueObject, PafExcelValueObjectType.Boolean);
		assertTrue(valueObject.getBoolean());
		assertEquals("C1", valueObject.getCellAddress());
		
		cell = row.createCell(3, Cell.CELL_TYPE_FORMULA);
		
		String formula = "B1";
		
		cell.setCellFormula(formula);
		//cell.setCellValue(23);
		valueObject = PafExcelValueObject.createFromCell(wb, cell);		
		helperTestAllType(valueObject, PafExcelValueObjectType.Formula);		
		assertEquals("29.34", valueObject.getFormulaValue());
		assertEquals(formula, valueObject.getFormula());
		assertEquals("D1", valueObject.getCellAddress());
		assertEquals("29.34", valueObject.getValueAsString());
		
	}

	public void testCreateFromBoolean() {

		PafExcelValueObject valueObject = PafExcelValueObject.createFromBoolean(null);
		
		assertNotNull(valueObject);
		helperTestAllType(valueObject, PafExcelValueObjectType.Boolean);
		assertNull(valueObject.getBoolean());
		assertNull(valueObject.getValueAsString());
		
		valueObject = PafExcelValueObject.createFromBoolean(false);
		
		assertNotNull(valueObject);
		helperTestAllType(valueObject, PafExcelValueObjectType.Boolean);
		assertNotNull(valueObject.getBoolean());
		assertFalse(valueObject.getBoolean());
		assertEquals(Boolean.FALSE.toString(), valueObject.getValueAsString());
		
		valueObject = PafExcelValueObject.createFromBoolean(true);
		
		assertNotNull(valueObject);
		helperTestAllType(valueObject, PafExcelValueObjectType.Boolean);
		assertNotNull(valueObject.getBoolean());
		assertTrue(valueObject.getBoolean());
		assertEquals(Boolean.TRUE.toString(), valueObject.getValueAsString());
		
	}

	public void testCreateFromInteger() {
		
		PafExcelValueObject valueObject = PafExcelValueObject.createFromInteger(null);
		
		assertNotNull(valueObject);
		helperTestAllType(valueObject, PafExcelValueObjectType.Integer);
		assertNull(valueObject.getInteger());
		assertNull(valueObject.getValueAsString());
		
		valueObject = PafExcelValueObject.createFromInteger(-1);
		
		assertNotNull(valueObject);
		helperTestAllType(valueObject, PafExcelValueObjectType.Integer);
		assertNotNull(valueObject.getInteger());
		assertEquals(Integer.valueOf(-1), valueObject.getInteger());
		assertEquals("-1", valueObject.getValueAsString());
		
		valueObject = PafExcelValueObject.createFromInteger(1);
		
		assertNotNull(valueObject);
		helperTestAllType(valueObject, PafExcelValueObjectType.Integer);
		assertNotNull(valueObject.getInteger());
		assertEquals(Integer.valueOf(1), valueObject.getInteger());
		assertEquals("1", valueObject.getValueAsString());
		
	}

	public void testCreateFromDouble() {
		
		PafExcelValueObject valueObject = PafExcelValueObject.createFromDouble(null);
		
		assertNotNull(valueObject);
		helperTestAllType(valueObject, PafExcelValueObjectType.Double);
		assertNull(valueObject.getDouble());
		assertNull(valueObject.getValueAsString());
		
		valueObject = PafExcelValueObject.createFromDouble(-1.123456);
		
		assertNotNull(valueObject);
		helperTestAllType(valueObject, PafExcelValueObjectType.Double);
		assertNotNull(valueObject.getDouble());
		assertEquals(Double.valueOf(-1.123456), valueObject.getDouble());
		assertEquals("-1.123456", valueObject.getValueAsString());
		
		valueObject = PafExcelValueObject.createFromDouble(1.654321);
		
		assertNotNull(valueObject);
		helperTestAllType(valueObject, PafExcelValueObjectType.Double);
		assertNotNull(valueObject.getDouble());
		assertEquals(Double.valueOf(1.654321), valueObject.getDouble());
		assertEquals("1.654321", valueObject.getValueAsString());
	}

	public void testCreateBlank() {
		
		PafExcelValueObject valueObject = PafExcelValueObject.createBlank();
		assertNotNull(valueObject);
		helperTestAllType(valueObject, PafExcelValueObjectType.Blank);
		assertEquals("", valueObject.getValueAsString());
		
	}

	public void testCreateFromString() {

		PafExcelValueObject valueObject = PafExcelValueObject.createFromString(null);
		
		assertNotNull(valueObject);
		helperTestAllType(valueObject, PafExcelValueObjectType.Blank);
		assertNull(valueObject.getString());
		assertNotNull(valueObject.getValueAsString());
		assertEquals("", valueObject.getValueAsString());
		
		String testStr = "Test String";
		
		valueObject = PafExcelValueObject.createFromString(testStr);
		
		assertNotNull(valueObject);
		helperTestAllType(valueObject, PafExcelValueObjectType.String);
		assertNotNull(valueObject.getString());
		assertEquals(testStr, valueObject.getString());
		assertEquals(testStr, valueObject.getValueAsString());
		
	}

	public void testCreateFromFormula() {
		
		PafExcelValueObject valueObject = PafExcelValueObject.createFromFormula(null);
		
		assertNotNull(valueObject);
		helperTestAllType(valueObject, PafExcelValueObjectType.Blank);
		assertNull(valueObject.getFormula());
		
		//returns a blank
		assertNotNull(valueObject.getValueAsString());
		
		String testFormula = "A1+B2";
		
		valueObject = PafExcelValueObject.createFromFormula(testFormula);
		
		assertNotNull(valueObject);
		helperTestAllType(valueObject, PafExcelValueObjectType.Formula);
		assertNotNull(valueObject.getFormula());
		assertEquals(testFormula, valueObject.getFormula());
		assertNotNull(valueObject.getValueAsString());
		assertEquals(testFormula, valueObject.getValueAsString());
	}

	public void testCreateFromFormulaReferenceMap() {
		
		PafExcelValueObject valueObject = PafExcelValueObject.createFromFormulaReferenceMap(null, null);
		assertNotNull(valueObject);
		helperTestAllType(valueObject, PafExcelValueObjectType.Blank);
		
		String element = "jason";
		valueObject = PafExcelValueObject.createFromFormulaReferenceMap(element, null);
		assertNotNull(valueObject);
		helperTestAllType(valueObject, PafExcelValueObjectType.String);
		
		Map<String, String> referenceMap = new HashMap<String, String>();
		valueObject = PafExcelValueObject.createFromFormulaReferenceMap(element, referenceMap);
		assertNotNull(valueObject);
		helperTestAllType(valueObject, PafExcelValueObjectType.String);
		
		referenceMap.put(element, null);		
		valueObject = PafExcelValueObject.createFromFormulaReferenceMap(element, referenceMap);
		assertNotNull(valueObject);
		helperTestAllType(valueObject, PafExcelValueObjectType.Blank);
		
		String reference = "formula";
		
		referenceMap.put(element, reference);		
		valueObject = PafExcelValueObject.createFromFormulaReferenceMap(element, referenceMap);
		assertNotNull(valueObject);
		helperTestAllType(valueObject, PafExcelValueObjectType.Formula);
		assertEquals(valueObject.getFormula(), reference);
		
	}
	
	public void testIsType() {
		
		//test with null or nothing
		PafExcelValueObject.createFromFormula(null).isType(PafExcelValueObjectType.Formula);
		PafExcelValueObject.createFromString(null).isType(PafExcelValueObjectType.String);
		PafExcelValueObject.createBlank().isType(PafExcelValueObjectType.Blank);
		PafExcelValueObject.createFromDouble(null).isType(PafExcelValueObjectType.Double);
		PafExcelValueObject.createFromInteger(null).isType(PafExcelValueObjectType.Integer);
		PafExcelValueObject.createFromBoolean(null).isType(PafExcelValueObjectType.Boolean);
		
		PafExcelValueObject.createFromFormula("A1+B2").isType(PafExcelValueObjectType.Formula);
		PafExcelValueObject.createFromString("Test String").isType(PafExcelValueObjectType.String);
		PafExcelValueObject.createFromDouble(343.33).isType(PafExcelValueObjectType.Double);
		PafExcelValueObject.createFromInteger(454).isType(PafExcelValueObjectType.Integer);
		PafExcelValueObject.createFromBoolean(Boolean.TRUE).isType(PafExcelValueObjectType.Boolean);
		PafExcelValueObject.createFromBoolean(Boolean.FALSE).isType(PafExcelValueObjectType.Boolean);
		
		
	}

	public void testIsBoolean() {

		helperTestAllIs(PafExcelValueObject.createFromBoolean(null), PafExcelValueObjectType.Boolean);
	
	}

	public void testIsDouble() {
		helperTestAllIs(PafExcelValueObject.createFromDouble(null), PafExcelValueObjectType.Double);
	}

	public void testIsInteger() {
		helperTestAllIs(PafExcelValueObject.createFromInteger(null), PafExcelValueObjectType.Integer);
	}

	public void testIsString() {
		helperTestAllIs(PafExcelValueObject.createFromString(null), PafExcelValueObjectType.Blank);
	}

	public void testIsFormula() {
		helperTestAllIs(PafExcelValueObject.createFromFormula(null), PafExcelValueObjectType.Blank);
	}
	
	public void testGetBoolean() {
		
		PafExcelValueObject valueObject = PafExcelValueObject.createFromBoolean(null);
		
		assertNull(valueObject.getBoolean());
		
		valueObject = PafExcelValueObject.createFromBoolean(false);
		
		assertNotNull(valueObject.getBoolean());
		assertFalse(valueObject.getBoolean());
		
		valueObject = PafExcelValueObject.createFromBoolean(true);
		
		assertNotNull(valueObject.getBoolean());
		assertTrue(valueObject.getBoolean());
	}

	public void testGetDouble() {
		
		PafExcelValueObject valueObject = PafExcelValueObject.createFromDouble(null);
		
		assertNull(valueObject.getDouble());
		
		valueObject = PafExcelValueObject.createFromDouble(12.11);
		
		assertNotNull(valueObject.getDouble());
		assertEquals(12.11, valueObject.getDouble());
		
		valueObject = PafExcelValueObject.createFromDouble(-12.11);
		
		assertNotNull(valueObject.getDouble());
		assertEquals(-12.11, valueObject.getDouble());
		
	}

	public void testGetInteger() {
		
		PafExcelValueObject valueObject = PafExcelValueObject.createFromInteger(null);
		
		assertNull(valueObject.getInteger());
		
		valueObject = PafExcelValueObject.createFromInteger(12);
		
		assertNotNull(valueObject.getInteger());
		assertEquals(Integer.valueOf(12), valueObject.getInteger());
		
		valueObject = PafExcelValueObject.createFromInteger(-12);
		
		assertNotNull(valueObject.getInteger());
		assertEquals(Integer.valueOf(-12), valueObject.getInteger());
		
	}

	public void testGetString() {
		
		PafExcelValueObject valueObject = PafExcelValueObject.createFromString(null);
		
		assertNull(valueObject.getString());
		
		String testString = "abc";
		
		valueObject = PafExcelValueObject.createFromString(testString);
		
		assertNotNull(valueObject.getString());
		assertEquals(testString, valueObject.getString());
				
	}

	public void testGetFormula() {
		
		PafExcelValueObject valueObject = PafExcelValueObject.createFromFormula(null);
		
		assertNull(valueObject.getFormula());
		
		String testFormula = "A1+B1";
		
		valueObject = PafExcelValueObject.createFromFormula(testFormula);
		
		assertNotNull(valueObject.getFormula());
		assertEquals(testFormula, valueObject.getFormula());
		
	}

	public void testGetType() {
		
		//test with null or nothing
		PafExcelValueObject.createFromFormula(null).getType().equals(PafExcelValueObjectType.Formula);
		PafExcelValueObject.createFromString(null).getType().equals(PafExcelValueObjectType.String);
		PafExcelValueObject.createBlank().getType().equals(PafExcelValueObjectType.Blank);
		PafExcelValueObject.createFromDouble(null).getType().equals(PafExcelValueObjectType.Double);
		PafExcelValueObject.createFromInteger(null).getType().equals(PafExcelValueObjectType.Integer);
		PafExcelValueObject.createFromBoolean(null).getType().equals(PafExcelValueObjectType.Boolean);
		
		PafExcelValueObject.createFromFormula("A1+B2").getType().equals(PafExcelValueObjectType.Formula);
		PafExcelValueObject.createFromString("Test String").getType().equals(PafExcelValueObjectType.String);
		PafExcelValueObject.createFromDouble(343.33).getType().equals(PafExcelValueObjectType.Double);
		PafExcelValueObject.createFromInteger(454).getType().equals(PafExcelValueObjectType.Integer);
		PafExcelValueObject.createFromBoolean(Boolean.TRUE).getType().equals(PafExcelValueObjectType.Boolean);
		PafExcelValueObject.createFromBoolean(Boolean.FALSE).getType().equals(PafExcelValueObjectType.Boolean);
		
	}

	public void testGetFormulaValue() {
		
		assertNull(PafExcelValueObject.createFromFormula(null).getFormulaValue());
		assertNull(PafExcelValueObject.createFromString(null).getFormulaValue());
		assertNull(PafExcelValueObject.createBlank().getFormulaValue());
		assertNull(PafExcelValueObject.createFromDouble(null).getFormulaValue());
		assertNull(PafExcelValueObject.createFromInteger(null).getFormulaValue());
		assertNull(PafExcelValueObject.createFromBoolean(null).getFormulaValue());
		
		assertNull(PafExcelValueObject.createFromFormula("A1+B2").getFormulaValue());
		assertNull(PafExcelValueObject.createFromString("string").getFormulaValue());
		assertNull(PafExcelValueObject.createFromDouble(25.33).getFormulaValue());
		assertNull(PafExcelValueObject.createFromInteger(112).getFormulaValue());
		assertNull(PafExcelValueObject.createFromBoolean(true).getFormulaValue());
		assertNull(PafExcelValueObject.createFromBoolean(false).getFormulaValue());
		
	}

	public void testGetValueAsString() {
		
		assertNotNull(PafExcelValueObject.createFromFormula(null).getValueAsString());
		assertNotNull(PafExcelValueObject.createFromString(null).getValueAsString());
		assertNotNull(PafExcelValueObject.createBlank().getValueAsString());
		assertNull(PafExcelValueObject.createFromDouble(null).getValueAsString());
		assertNull(PafExcelValueObject.createFromInteger(null).getValueAsString());
		assertNull(PafExcelValueObject.createFromBoolean(null).getValueAsString());
		
		assertNotNull(PafExcelValueObject.createFromFormula("A1+B2").getValueAsString());
		assertEquals("string", PafExcelValueObject.createFromString("string").getValueAsString());
		assertEquals("", PafExcelValueObject.createBlank().getValueAsString());
		assertEquals("12.55", PafExcelValueObject.createFromDouble(12.55).getValueAsString());
		assertEquals("33", PafExcelValueObject.createFromInteger(33).getValueAsString());
		assertEquals(Boolean.TRUE.toString(), PafExcelValueObject.createFromBoolean(true).getValueAsString());
		assertEquals(Boolean.FALSE.toString(), PafExcelValueObject.createFromBoolean(false).getValueAsString());
		
	}

	public void testGetCellAddress() {

		assertNull(PafExcelValueObject.createFromFormula(null).getCellAddress());
		assertNull(PafExcelValueObject.createFromString(null).getCellAddress());
		assertNull(PafExcelValueObject.createBlank().getCellAddress());
		assertNull(PafExcelValueObject.createFromDouble(null).getCellAddress());
		assertNull(PafExcelValueObject.createFromInteger(null).getCellAddress());
		assertNull(PafExcelValueObject.createFromBoolean(null).getCellAddress());
		
		assertNull(PafExcelValueObject.createFromFormula("A1+B2").getCellAddress());
		assertNull(PafExcelValueObject.createFromString("string").getCellAddress());
		assertNull(PafExcelValueObject.createFromDouble(25.33).getCellAddress());
		assertNull(PafExcelValueObject.createFromInteger(112).getCellAddress());
		assertNull(PafExcelValueObject.createFromBoolean(true).getCellAddress());
		assertNull(PafExcelValueObject.createFromBoolean(false).getCellAddress());
		
		Workbook wb = new XSSFWorkbook();
		
		Sheet sheet = wb.createSheet();
		
		Row row = sheet.createRow(0);
		
		Cell cell = row.createCell(0, Cell.CELL_TYPE_STRING);
		
		PafExcelValueObject valueObject = PafExcelValueObject.createFromCell(wb, cell);
		
		assertNotNull(valueObject);
		
		assertNotNull(valueObject.getCellAddress());
		
		assertEquals("A1", valueObject.getCellAddress());
		
		wb = new HSSFWorkbook();
		
		sheet = wb.createSheet();
		
		row = sheet.createRow(0);
		
		cell = row.createCell(0, Cell.CELL_TYPE_STRING);
		
		valueObject = null;
		
		try {
			
			valueObject = PafExcelValueObject.createFromCell(wb, cell);
			
			fail("Should have thrown a null pointer.");
			
		} catch (NullPointerException npe) {
						
		}
						
		assertNull(valueObject);
		
		
						
	}

	public void testGetCellAddressBoolean() {
		
		assertNull(PafExcelValueObject.createFromFormula(null).getCellAddress(false));
		assertNull(PafExcelValueObject.createFromString(null).getCellAddress(false));
		assertNull(PafExcelValueObject.createBlank().getCellAddress(false));
		assertNull(PafExcelValueObject.createFromDouble(null).getCellAddress(false));
		assertNull(PafExcelValueObject.createFromInteger(null).getCellAddress(false));
		assertNull(PafExcelValueObject.createFromBoolean(null).getCellAddress(false));
		
		assertNull(PafExcelValueObject.createFromFormula("A1+B2").getCellAddress(false));
		assertNull(PafExcelValueObject.createFromString("string").getCellAddress(false));
		assertNull(PafExcelValueObject.createFromDouble(25.33).getCellAddress(false));
		assertNull(PafExcelValueObject.createFromInteger(112).getCellAddress(false));
		assertNull(PafExcelValueObject.createFromBoolean(true).getCellAddress(false));
		assertNull(PafExcelValueObject.createFromBoolean(false).getCellAddress(false));
		
		assertNull(PafExcelValueObject.createFromFormula(null).getCellAddress(true));
		assertNull(PafExcelValueObject.createFromString(null).getCellAddress(true));
		assertNull(PafExcelValueObject.createBlank().getCellAddress(true));
		assertNull(PafExcelValueObject.createFromDouble(null).getCellAddress(true));
		assertNull(PafExcelValueObject.createFromInteger(null).getCellAddress(true));
		assertNull(PafExcelValueObject.createFromBoolean(null).getCellAddress(true));
		
		assertNull(PafExcelValueObject.createFromFormula("A1+B2").getCellAddress(true));
		assertNull(PafExcelValueObject.createFromString("string").getCellAddress(true));
		assertNull(PafExcelValueObject.createFromDouble(25.33).getCellAddress(true));
		assertNull(PafExcelValueObject.createFromInteger(112).getCellAddress(true));
		assertNull(PafExcelValueObject.createFromBoolean(true).getCellAddress(true));
		assertNull(PafExcelValueObject.createFromBoolean(false).getCellAddress(true));
		
		Workbook wb = new XSSFWorkbook();
		
		Sheet sheet = wb.createSheet();
		
		Row row = sheet.createRow(0);
		
		Cell cell = row.createCell(0, Cell.CELL_TYPE_STRING);
		
		PafExcelValueObject valueObject = PafExcelValueObject.createFromCell(wb, cell);
		
		assertNotNull(valueObject);
		
		assertNotNull(valueObject.getCellAddress(false));
		
		assertEquals("A1", valueObject.getCellAddress(false));
		
		assertNotNull(valueObject.getCellAddress(true));
		
		assertEquals("$A$1", valueObject.getCellAddress(true));
		
	}

}
