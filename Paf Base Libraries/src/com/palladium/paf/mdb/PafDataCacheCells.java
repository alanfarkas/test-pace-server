/*
 *	File: @(#)PafDataCacheCells.java 	Package: com.palladium.paf.mdb 	Project: Essbase Provider
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

import java.util.ArrayList;
import java.util.List;

//import org.apache.log4j.Logger;

/**
 * List of PafDataCacheCells
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class PafDataCacheCells {

	List<PafDataCacheCell> cells = new ArrayList<PafDataCacheCell>();
//	private static Logger logger = Logger.getLogger(PafDataCacheCells.class);
	
	
	PafDataCacheCells () {}

	/**
	 *	Add cell to list of cells
	 *
	 * @param cellIndex
	 * @param cellValue
	 */
	public void add(int[] cellIndex, double cellValue) {
		PafDataCacheCell cell = new PafDataCacheCell(cellIndex, cellValue);
		cells.add(cell);
	}
		
	/**
	 * @return Returns the cells.
	 */
	public List<PafDataCacheCell> getCells() {
		return cells;
	}
	
}

