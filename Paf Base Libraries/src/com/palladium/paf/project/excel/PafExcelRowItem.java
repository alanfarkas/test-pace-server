/**
 * 
 */
package com.palladium.paf.project.excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;

/**
 * @author jmilliron
 *
 */
public class PafExcelRowItem {
	
	//XSSF/HSSF cell
	private Cell cell;	
	
	public PafExcelRowItem() {
		
	}
	
	public PafExcelRowItem(Cell cell) {
		
		this.cell = cell;
		
	}
	
	/**
	 * @return the cell
	 */
	public Cell getCell() {
		return cell;
	}

	/**
	 * @param cell the cell to set
	 */
	public void setCell(Cell cell) {
		this.cell = cell;
	}

	public boolean isNumeric() {
						
		if ( cell != null && cell.getCellType() == Cell.CELL_TYPE_NUMERIC ) {
		
			return true;
			
		}			
		
		return false;
	}
		
	public boolean isString() {
		
		if ( cell != null && cell.getCellType() == Cell.CELL_TYPE_STRING) {
			
			return true;
			
		}				
		
		return false;
	}
	
	public boolean isFormula() {
		
		if ( cell != null && cell.getCellType() == Cell.CELL_TYPE_FORMULA) {
			
			return true;
			
		}	
		
		return false;
	}
	
	public boolean isBoolean() {
		
		if ( cell != null && cell.getCellType() == Cell.CELL_TYPE_BOOLEAN) {
			
			return true;
			
		}	
		
		return false;
	}
	
	public boolean isBlank() {
		
		if ( cell == null ||  (cell != null && cell.getCellType() == Cell.CELL_TYPE_BLANK) ) {
			
			return true;
			
		}	
		
		return false;
	}
	
	public boolean isError() {
		
		if ( cell != null && cell.getCellType() == Cell.CELL_TYPE_ERROR) {
			
			return true;
			
		}	
		
		return false;
	}
	
	public Integer getInteger() {
		
		Integer intVal = null;
		
		if ( isNumeric() ) {			
	
			intVal = (int) cell.getNumericCellValue();
			
		}
		
		
		return intVal;
	}
	
	public Double getDouble() {
		
		Double doubleVal = null;
		
		if ( isNumeric() ) {
			
			doubleVal = new Double(cell.getNumericCellValue());
			
		}
		
		return doubleVal;
	}
	
	public String getString() {
		
		String strVal = null;		
		
		if ( isString() ) {
					
			strVal = cell.getStringCellValue();
			
		} 
		
		return strVal;
	}
	
	
	public String getError() {
		
		String errVal = null;		
		
		if ( isError() ) {
					
			errVal = getValueAsString();
			
		} 
		
		return errVal;
	}
	
	public String getValueAsString() {
		
		String strVal = null;		
		
		if ( isString() ||  isFormula() || isError() ) {
					
			strVal = cell.getStringCellValue();
			
		} else if ( isBlank() ) {
			
			strVal = getBlank();
			
		} else if ( isNumeric() ) {
			
			double numericValue = cell.getNumericCellValue();
			
			strVal = Double.toString(numericValue);
			
			if ( strVal.endsWith(".0") ) {
				
				strVal = strVal.substring(0, strVal.length() - 2);
				
			}		
			
		} else if ( isBoolean() ) {
			
			strVal = getBoolean().toString();
			
		}
		
		return strVal;
	}
	
	public Boolean getBoolean() {
		
		Boolean boolVal = null;
		
		if ( isBoolean() ) {
			
			boolVal = cell.getBooleanCellValue();
			
		}
		
		
		return boolVal;
	}
	
	public String getFormula() {
		
		String strVal = null;
		
		if ( isFormula() ) {
			
			strVal = cell.getCellFormula();
			
		}
						
		return strVal;
	}
	
	public String getBlank() {
			
		String blankVal = null;
		
		if ( isBlank() ) {
			
			blankVal = "";
			
		}
		
		return blankVal;
		
	}
	
	public String getFormulaValue() {
		
		String value = null;
		
		if ( isFormula() ) {
			
			value = getValueAsString();
			
		}		
		
		return value;
	}
	
	/**
	 * Returns the cell reference from the sheet. XSSF only supports getting the cell reference.
	 * 
	 * @return the cell reference A2.
	 */
	public String getCellAddress() {
		
		if ( cell != null && cell instanceof XSSFCell ) {
			
			return ((XSSFCell) cell).getReference();
			
		}
		
		return null;
		
	}
	
	/**
	 * Returns the cell reference from the sheet. XSSF only supports getting the cell reference.
	 * 
	 * @param hardReference if true, will make address use a hard reference.  e.g. $A$2.
	 * @return the cell reference A2.
	 */
	public String getCellAddress(boolean hardReference) {
		
		String cellAddress = null;
		
		if ( cell != null && cell instanceof XSSFCell ) {
			
			cellAddress = getCellAddress();
			
			if ( cellAddress != null && hardReference && cellAddress.matches("^[A-Z]+\\d+$")) {
				
				
				cellAddress = cellAddress.replaceAll("^[A-Z]+", "\\$$0");
				cellAddress = cellAddress.replaceAll("\\d+$", "\\$$0");
			
			} 			
			
		}
		
		return cellAddress;
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		
		sb.append("\nCell: " + cell);

		if ( isBoolean() ) {
			
			sb.append("\n\tBoolean: " + getBoolean());
			
		} else if ( isNumeric() ) {
			
			sb.append("\n\tNumeric (Integer): " + getInteger());
			sb.append("\n\tNumeric (Double): " + getDouble());
									
		} else if ( isString() ) {
							
			sb.append("\n\tString: " + getString());
			
		} else if ( isFormula() ) {
			
			sb.append("\n\tFormula: " + getFormula());
			sb.append("\n\tFormula Value: " + getFormulaValue());
		}
		
		return sb.toString();
	}

	
}
