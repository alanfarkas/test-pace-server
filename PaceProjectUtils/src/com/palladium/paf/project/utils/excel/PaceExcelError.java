/**
 * 
 */
package com.palladium.paf.project.utils.excel;

/**
 * @author JavaJ
 *
 */
public class PaceExcelError {

	private String sheetName;
	
	private String cellAddress;
	
	private String errorMessage;
	
	public PaceExcelError(String sheetName, String cellAddress, String errorMessage) {
		
		//TODO: validation of arguments
		
		this.sheetName = sheetName;
		this.cellAddress = cellAddress;
		this.errorMessage = errorMessage;
				
	}

	/**
	 * @return the sheetName
	 */
	public String getSheetName() {
		return sheetName;
	}

	/**
	 * @return the cellAddress
	 */
	public String getCellAddress() {
		return cellAddress;
	}

	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}
	
	
	
	
	
}
