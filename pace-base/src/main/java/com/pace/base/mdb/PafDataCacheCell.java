/*
 *	File: @(#)PafDataCacheCell.java 	Package: com.pace.base.mdb 	Project: Paf Base Libraries
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
package com.pace.base.mdb;

import com.pace.base.data.Intersection;

/**
 * Representation of a data cache cell used to track changes
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class PafDataCacheCell {
	
	Intersection cellIntersection = null;
	double cellValue = 0;

	/**
	 * @param cellIntersection Data cache cell intersection
	 * @param cellValue Data cache cell value
	 */
	public PafDataCacheCell(Intersection cellIntersection, double cellValue) {
		this.cellIntersection = cellIntersection;
		this.cellValue = cellValue;	
	}

	/**
	 * @return Returns the cellIntersection.
	 */
	public Intersection getCellIntersection() {
		return cellIntersection;
	}

	/**
	 * @param cellIntersection The cellIntersection to set.
	 */
	public void setCellIntersection(Intersection cellIntersection) {
		this.cellIntersection = cellIntersection;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		if (cellIntersection != null) {
			return cellIntersection.toString() + " - " + cellValue;
		} else {
			return "[not initialized]";
		}
	}

}
