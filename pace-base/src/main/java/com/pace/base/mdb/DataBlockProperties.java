/**
 * Data block peoperties
 */
package com.pace.base.mdb;

import java.util.BitSet;

/**
 * @author Alan Farkas
 *
 */
public class DataBlockProperties {

	private BitSet[] cellPropertyArray = null;		// Collection of properties for all data block cells.
													//		- 	All properties corresponding to a single data
													//			block cell are grouped together.
	private int[] cellPropsBlockSize = new int[2];	// Indexing values for accessing specific cell property
	private boolean isDirty = false;
	private static int BITS_PER_ARRAY_MEMBER = 64;	// BitSet contains 64 bits

	/**
	 * Intialize DataBlockProperties to hold a set of properties
	 * for each data block cell
	 * 
	 * @param rowCount Data block rows
	 * @param colCount Data block columns
	 * @param cellPropsBitCount Number of property bits for a singe cell
	 */
	public DataBlockProperties(int rowCount, int colCount, int cellPropsBitCount) {
		
		// Initialize property indexing values
		this.cellPropsBlockSize[1] = cellPropsBitCount;
		this.cellPropsBlockSize[0] =  colCount * this.cellPropsBlockSize[1];
		
		// Create BitSet array large enough to hold a set of properties
		// for each data block cell
		int totalBits = rowCount * colCount * cellPropsBitCount;
		int arraySize = (totalBits + BITS_PER_ARRAY_MEMBER - 1) / BITS_PER_ARRAY_MEMBER;
		cellPropertyArray = new BitSet[arraySize];  // By default, all bits are set to false
		
	}

    /**
     * Return an index to the element within the cell property array, that corresponds
     * to the specified property bit index
     * 
     * @param propertyBitIndex Virtual index to a single property bit in the cell property array
     * @return Cell property array subscript
     */
    private int getPropArraySubscript(int propertyBitIndex) {
        return propertyBitIndex / BITS_PER_ARRAY_MEMBER;
    }

    /**
     * Return a bit position in a cell property array member, that corresponds
     * to the specified property bit index
     * 
     * @param propertyBitIndex Virtual index to a single property bit in the cell property array
     * @return Property string bit position
     */
    private int getBitIndex(int propertyBitIndex) {
        return propertyBitIndex % BITS_PER_ARRAY_MEMBER;
    }

    
	/**
	 * Generate a virtual index to the contiguous set of bits contained in the
	 * entire cell property array, for the specified cell address and
	 * property type.
	 * 
	 * @param cellAddress Cell address
	 * @param propertyType Cell property type
	 * 
	 * @return Property bit index
	 */
	private int generatePropertyBitIndex(DataCacheCellAddress cellAddress, CellPropertyType propertyType) {

		int propertyIndex = 0;
		int rowIndex = cellAddress.getCoordX();
		int colIndex = cellAddress.getCoordY();
		propertyIndex = (rowIndex * cellPropsBlockSize[0]) + (colIndex * cellPropsBlockSize[1]) + propertyType.getOffSet();

		return propertyIndex;
	}

	/**
	 * Get cell property for selected property type and cell address
	 * 
	 * @param propertyType Cell property type
	 * @param cellAddress Cell address
	 * 
	 * @return CellProperty
	 */
	public CellProperty getCellProperty(CellPropertyType propertyType, DataCacheCellAddress cellAddress) {
		
		CellProperty cellProperty = CellProperty.getCellPropertyFactory(propertyType);
		int propertyLength = propertyType.getBitCount();
		boolean propertyBits[] = new boolean[propertyLength];

		int propertyIndex = generatePropertyBitIndex(cellAddress, propertyType);			
		for (int offSet = 0; offSet < propertyLength; offSet++) {
			BitSet arrayElement = cellPropertyArray[getPropArraySubscript(propertyIndex + offSet)];
			propertyBits[offSet] = arrayElement.get(getBitIndex(propertyIndex + offSet));
		}
		cellProperty.setPropertyBits(propertyBits);
		return cellProperty;
	}

	/**
	 * Set cell property for selected cell address
	 * 
	 * @param cellAddress Cell address
	 * @param cellProperty Cell property
	 */
	public void setCellProperty(DataCacheCellAddress cellAddress, CellProperty cellProperty) {
		
		boolean propertyBits[] = cellProperty.getPropertyBits();
		int propertyStartIndex = generatePropertyBitIndex(cellAddress, cellProperty.getType());
		
		// Properties can be comprised of multiple bits and therefore could span 
		// more than one property array element
		int propertyIndex;
		for (int offSet = 0; offSet < propertyBits.length; offSet++) {
			propertyIndex = propertyStartIndex + offSet;
			int subscript = getPropArraySubscript(propertyIndex);
			BitSet arrayElement = cellPropertyArray[subscript];
			if (arrayElement == null) {
				arrayElement = new BitSet();
				cellPropertyArray[subscript] = arrayElement;
			}
			int bitIndex = getBitIndex(propertyIndex);
			arrayElement.set(bitIndex, propertyBits[offSet]);
		}
	}

	/**
	 * @return the isDirty
	 */
	public boolean isDirty() {
		return isDirty;
	}

	/**
	 * @param isDirty the isDirty to set
	 */
	public void setDirty(boolean isDirty) {
		this.isDirty = isDirty;
	}


}
