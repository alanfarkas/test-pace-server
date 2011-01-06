/*
 *	File: @(#)PafDataCacheCell.java 	Package: com.palladium.paf.mdb 	Project: Paf Base Libraries
 *	Created: Feb 8, 2006  		By: AFarkas
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2006 Palladium Group, Inc. All rights reserved.
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
package com.palladium.paf.mdb;

/**
 * Representation of a data cache cell
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class PafDataCacheCell {
	
	int[] cellIndex = null;
	double cellValue = 0;

	/**
	 * @param cellIndex Data cache cell index
	 * @param cellValue Data cache cell value
	 */
	public PafDataCacheCell(int[] cellIndex, double cellValue) {
		this.cellIndex = cellIndex;
		this.cellValue = cellValue;	
	}

	/**
	 * @return Returns the cellIndex.
	 */
	public int[] getCellIndex() {
		return cellIndex;
	}

	/**
	 * @param cellIndex The cellIndex to set.
	 */
	public void setCellIndex(int[] cellIndex) {
		this.cellIndex = cellIndex;
	}

	/**
	 * @return Returns the cellValue.
	 */
	public double getCellValue() {
		return cellValue;
	}

	/**
	 * @param cellValue The cellValue to set.
	 */
	public void setCellValue(double cellValue) {
		this.cellValue = cellValue;
	}

}
