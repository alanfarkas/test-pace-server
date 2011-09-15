/**
 * Data Cache Block
 */
package com.pace.base.mdb;

import sun.security.util.BitArray;

/**
 * @author Alan Farkas
 *
 */
public class DataBlock {
	double[][] cellValues = null; 			// Cell value array - [Measure][Time]
	BitArray[][] cellProperties = null;		// Cell property array - [Measure][Time]	
	

	public DataBlock(int rows, int cols) {
		cellValues = new double[rows][cols];
		cellProperties = new BitArray[rows][cols];
	}

	
	/**
	 * Get the value of a data cache cell
	 * 
	 * @param cellAddress - Data cache cell address
	 * @return Cell value
	 */
	public double getCellValue(DataCacheCellAddress cellAddress) {
		return 	cellValues[cellAddress.getCoordX()][cellAddress.getCoordY()];	
	}

	/**
	 * Set the value of a data cache cell
	 * 
	 * @param cellAddress - Data cache cell address
	 * @param value - Value to set
	 */
	public void setCellValue(DataCacheCellAddress cellAddress, double value) {	
		cellValues[cellAddress.getCoordX()][cellAddress.getCoordY()] = value;	
	}

	/*
	 *	Represent the DataCache as a 2-dimensional array of data cells
	 *
	 * @see java.lang.Object#toString()
	 */
	public String toString() {

		int rowCount = cellValues.length;
		int colCount = cellValues[0].length;
		StringBuffer stringBuffer = new StringBuffer("\n");	
		String format = "%#11.2f\t";

		for (int rowIndex = 0; rowIndex < rowCount; rowIndex++ ) {
			for (int colIndex = 0; colIndex < colCount; colIndex++ ) {
				stringBuffer.append(String.format(format, cellValues[rowIndex][colIndex]));
			}
			stringBuffer.append("\n");
		}
		return stringBuffer.toString();
	}

}
