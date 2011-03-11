/*
 *	File: @(#)PafExcelValueObject.java 	Package: com.pace.base.project.excel 	Project: Paf Base Libraries
 *	Created: Sep 2, 2009  		By: jmilliron
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

import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.pace.base.utility.CollectionsUtil;

/**
 * Class_description_goes_here
 *
 * @author jmilliron
 * @version	x.xx
 *
 */
public class PafExcelValueObject {
	
	private PafExcelValueObjectType type;
	
	private Object value;
	
	private String formulaValue;
	
	private String cellAddress;
	
	private boolean boldItem;
	
	private PafExcelValueObject() {
		
	}
	
	/**
	 * 
	 *  Method_description_goes_here
	 *
	 * @param cell
	 * @return
	 * @throws NullPointerException cell cannot be null.
	 */
	public static PafExcelValueObject createFromCell(Workbook wb, Cell cell) {
		
		if ( cell == null ) {
			
			throw new NullPointerException("cell cannot be null.");
			
		}
		
		PafExcelValueObject evo = new PafExcelValueObject();
		
		switch ( cell.getCellType() ) {
		
			case Cell.CELL_TYPE_BLANK:
				
				evo.type = PafExcelValueObjectType.Blank;
				
				break;
				
			case Cell.CELL_TYPE_BOOLEAN:
				
				evo.value = cell.getBooleanCellValue();
				
				evo.type = PafExcelValueObjectType.Boolean;
												
				break;
				
			case Cell.CELL_TYPE_ERROR:
			
				evo.type = PafExcelValueObjectType.Error;
				
				break;
				
			case Cell.CELL_TYPE_FORMULA:
				
				if ( wb instanceof XSSFWorkbook ) {
				
					FormulaEvaluator evaluator = new XSSFFormulaEvaluator((XSSFWorkbook) wb);
					
					CellValue cellValue = evaluator.evaluate(cell);
				
					switch (cellValue.getCellType()) {
					    case Cell.CELL_TYPE_BOOLEAN:
					    	
					    	evo.formulaValue = Boolean.valueOf(cellValue.getBooleanValue()).toString();
					    	break;
					    	
					    case Cell.CELL_TYPE_NUMERIC:
					        
					    	evo.formulaValue = Double.valueOf(cellValue.getNumberValue()).toString();					    	
					        break;
					        
					    case Cell.CELL_TYPE_STRING:
					    	
					    	evo.formulaValue = cellValue.getStringValue();
					        break;
					        
					    case Cell.CELL_TYPE_BLANK:
					        
					    	evo.formulaValue = "";
					    	break;					        
					        
					    case Cell.CELL_TYPE_ERROR:
					        break;

					    // CELL_TYPE_FORMULA will never happen
					    case Cell.CELL_TYPE_FORMULA: 
					        break;
					}			
					
				}
				
				evo.value = cell.getCellFormula();
				evo.type = PafExcelValueObjectType.Formula;
				
				break;
				
			case Cell.CELL_TYPE_NUMERIC:
				
				evo.value = cell.getNumericCellValue();
				
				evo.type = PafExcelValueObjectType.Numeric;
				
				break;
				
			case Cell.CELL_TYPE_STRING:
				
				evo.value = cell.getStringCellValue();
				
				evo.type = PafExcelValueObjectType.String;
				
				break;
				
		}
		
		if ( cell != null && cell instanceof XSSFCell ) {
			
			evo.cellAddress = ((XSSFCell) cell).getReference();
			
		}		
		
		return evo;
		
	}
	
	public static PafExcelValueObject createFromBoolean(Boolean bool) {
						
		PafExcelValueObject evo = new PafExcelValueObject();
		
		evo.value = bool;
		
		evo.type = PafExcelValueObjectType.Boolean;
		
		return evo;
		
	}
	
	public static PafExcelValueObject createFromInteger(Integer intValue) {
		
		PafExcelValueObject evo = new PafExcelValueObject();
		
		evo.value = intValue;
		
		evo.type = PafExcelValueObjectType.Integer;
		
		return evo;
		
	}
	
	public static PafExcelValueObject createFromDouble(Double doubleValue) {
		
		PafExcelValueObject evo = new PafExcelValueObject();
		
		evo.value = doubleValue;
		
		evo.type = PafExcelValueObjectType.Double;
		
		return evo;
		
	}
	
	public static PafExcelValueObject createBlank() {
		
		PafExcelValueObject evo = new PafExcelValueObject();
		
		evo.type = PafExcelValueObjectType.Blank;
		
		return evo;
		
	}
	
	public static PafExcelValueObject createFromFormulaReferenceMap(String elementToResolve, Map<String, String> dynamicRefMap) {
		
		PafExcelValueObject pafExcelValueObject = null;
		
		if ( elementToResolve != null ) {
		
			String mapValue = CollectionsUtil.getMapValueOrReturnKey(elementToResolve, dynamicRefMap);
		
			if ( mapValue == null || mapValue.equals(elementToResolve) ) {
											
				pafExcelValueObject = PafExcelValueObject.createFromString(mapValue);
					
			} else {
				
				pafExcelValueObject = PafExcelValueObject.createFromFormula(mapValue);
				
			}
			
		} else {
			
			pafExcelValueObject = PafExcelValueObject.createBlank();
			
		}
		
		return pafExcelValueObject;
		
	}
	
	/**
	 * Creates a string excel value object.  if str value is null, creates a blank
	 * 
	 * @param strValue string used to create string excel value object
	 * @return new excel value object
	 */
	public static PafExcelValueObject createFromString(String strValue) {
		
		PafExcelValueObject evo = new PafExcelValueObject();
		
		//might be blank
		if ( strValue == null || (strValue != null && strValue.trim().equals(""))) {
			
			evo = PafExcelValueObject.createBlank();
			
		} else {
			
			evo.value = strValue;
			
			evo.type = PafExcelValueObjectType.String;	
			
		}
				
		return evo;
		
	}
	
	/**
	 * Creates a formula excel value object.  if formula is null, creates a blank
	 * 
	 * @param strValue string used to create string excel value object
	 * @return new excel value object
	 */
	public static PafExcelValueObject createFromFormula(String formula) {
		
		PafExcelValueObject evo = new PafExcelValueObject();
		
		//might be blank
		if ( formula == null || (formula != null && formula.trim().equals(""))) {
			
			evo = PafExcelValueObject.createBlank();
			
		} else {
		
			evo.value = formula;
			
			evo.type = PafExcelValueObjectType.Formula;
			
		}
		return evo;
		
	}
	
	public boolean isType(PafExcelValueObjectType type) {
		
		boolean isType = false;
		
		if ( type != null && this.type.equals(type) ) {
			
			isType = true;
			
		}
		
		return isType;
		
	}
	
	public boolean isBoolean() {
		
		return isType(PafExcelValueObjectType.Boolean);
		
	}
		
	public boolean isNumeric() {
		
		return isType(PafExcelValueObjectType.Numeric) || isDouble() || isInteger();
		
	}
	
	public boolean isDouble() {
		
		return isType(PafExcelValueObjectType.Double);
		
	}
	
	public boolean isInteger() {
		
		return isType(PafExcelValueObjectType.Integer);
		
	}
	
	public boolean isString() {
		
		return isType(PafExcelValueObjectType.String);
		
	}
	
	public boolean isFormula() {
		
		return isType(PafExcelValueObjectType.Formula);
		
	}
	
	public boolean isBlank() {
		
		return isType(PafExcelValueObjectType.Blank);
		
	}

	public Boolean getBoolean() {
		
		if ( value != null && type != null 
				&& isType(PafExcelValueObjectType.Boolean) && value instanceof Boolean ) {
			
			return (Boolean) value;
			
		}
		
		return null;
	}
	
	public Double getDouble() {
		
		if ( value != null && type != null 
				&&  (isType(PafExcelValueObjectType.Double) || isType(PafExcelValueObjectType.Numeric)) 
				&& value instanceof Double ) {
			
			return (Double) value;
			
		}
		
		return null;
	}
	
	public Integer getInteger() {
		
		if ( value != null && type != null 
				&&  (isType(PafExcelValueObjectType.Integer) || isType(PafExcelValueObjectType.Double) || isType(PafExcelValueObjectType.Numeric)) 
				&& (value instanceof Double || value instanceof Integer ) ) {
			
			if ( value instanceof Double ) {
				
				return ((Double) value).intValue();
				
			} else if ( value instanceof Integer) {
				
				return (Integer) value;
				
			}
								
		}
		
		return null;
	}
		
	public String getString() {
		
		if ( value != null && type != null 
				&& isType(PafExcelValueObjectType.String) && value instanceof String ) {
			
			return (String) value;
			
		}
		
		return null;
	}
	
	public String getFormula() {
		
		if ( value != null && type != null 
				&& isType(PafExcelValueObjectType.Formula) && value instanceof String ) {
			
			return (String) value;
			
		}
		
		return null;
	}
			
	/**
	 * @return the type
	 */
	public PafExcelValueObjectType getType() {
		return type;
	}


	/**
	 * @return the formulaValue
	 */
	public String getFormulaValue() {
		
		if ( formulaValue != null && type != null 
				&& isType(PafExcelValueObjectType.Formula) && formulaValue instanceof String ) {
			
			return (String) formulaValue;
			
		}
		
		return null;
		
	}


	public String getValueAsString() {
		
		String returnValue = null;
		
		if ( type != null ) {
		
			switch ( type )	 {
			
			case Blank:	
			case Error:
				returnValue = "";
				break;
				
			case Boolean:
				returnValue = (getBoolean() == null) ? null : getBoolean().toString();
				break;
				
			case Double:
			case Numeric:
				returnValue = (getDouble() == null) ? null : getDouble().toString();
				break;
				
			case Integer:
				returnValue = (getInteger() == null) ? null : getInteger().toString();
				break;
				
			case Formula:
				//return formula value instead of formula itself
				returnValue = getFormulaValue();
				
				//if there isn't a formula value, return formula
				if ( returnValue == null ) {
					
					returnValue = getFormula();
					
				}
				
				break;
				
			case String:
				returnValue = getString();
				break;		
			
			}
			
		}		
		
		return returnValue;
		
	}
	
	/**
	 * @return the cellAddress
	 */
	public String getCellAddress() {
		return cellAddress;
	}
	
	/**
	 * Returns the cell reference from the sheet. XSSF only supports getting the cell reference.
	 * 
	 * @param hardReference if true, will make address use a hard reference.  e.g. $A$2.
	 * @return the cell reference A2.
	 */
	public String getCellAddress(boolean hardReference) {
		
		String newCellAddress = null;
		
		if ( cellAddress != null ) {
			
			newCellAddress = getCellAddress();
			
			if ( hardReference && newCellAddress.matches("^[A-Z]+\\d+$")) {				
				
				newCellAddress = newCellAddress.replaceAll("^[A-Z]+", "\\$$0");
				newCellAddress = newCellAddress.replaceAll("\\d+$", "\\$$0");
			
			} 			
			
		}
		
		return newCellAddress;
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		String strValue = getValueAsString();
				
		return (strValue == null) ? super.toString() : strValue;
	}

	/**
	 * @param boldItem the boldItem to set
	 */
	public void setBoldItem(boolean boldItem) {
		this.boldItem = boldItem;
	}

	/**
	 * @return the boldItem
	 */
	public boolean isBoldItem() {
		return boldItem;
	}
	
	

}
