/*
 *	File: @(#)PafDataCacheCellProps.java 		Package: com.pace.base.mdb 	Project: Paf Base Libraries
 *	Created: Nov 30, 2006  		By: AFarkas
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

/**
 * Data cache cell properties
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class PafDataCacheCellProps {
	
	Integer roundedDecimalPlaces = null;

	/**
	 * @return the roundedDecimalPlaces
	 */
	public Integer getRoundedDecimalPlaces() {
		return roundedDecimalPlaces;
	}

	/**
	 * @param roundedDecimalPlaces the roundedDecimalPlaces to set
	 */
	public void setRoundedDecimalPlaces(Integer roundedDecimalPlaces) {
		this.roundedDecimalPlaces = roundedDecimalPlaces;
	}
	
	/**
	 *	Inidicates if the cell is to be rounded
	 *
	 * @return True if cell if to be rounded
	 */
	public boolean isRounded() {
		
		if (getRoundedDecimalPlaces() != null) {
			return true;
		}
		
		return false;

	}

}
