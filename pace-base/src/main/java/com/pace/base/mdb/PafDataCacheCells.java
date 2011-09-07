/*
 *	File: @(#)PafDataCacheCells.java 	Package: com.pace.base.mdb 	Project: Essbase Provider
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

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.pace.base.data.Intersection;

//import org.apache.log4j.Logger;

/**
 * List of PafDataCacheCells
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class PafDataCacheCells {

	private List<PafDataCacheCell> cells = new ArrayList<PafDataCacheCell>();
//	private static Logger logger = Logger.getLogger(PafDataCacheCells.class);
	
	
	PafDataCacheCells () {}

	/**
	 *	Add cell to list of cells
	 *
	 * @param cellIntersection
	 * @param cellValue
	 */
	public void add(Intersection cellIntersection, double cellValue) {
		PafDataCacheCell cell = new PafDataCacheCell(cellIntersection, cellValue);
		cells.add(cell);
	}
		
	/**
	 * @return Returns the cells.
	 */
	public List<PafDataCacheCell> getCells() {
		return cells;
	}
	
	
	/**
	 * 
	 * Return the set of changed cell intersections
	 * 
	 * @return List<Intersection>
	 */
	public Set<Intersection> getCellIntersections() {
		
		Set<Intersection> intersections = new HashSet<Intersection>();
		for (PafDataCacheCell cell : cells) {
			intersections.add(cell.getCellIntersection());
		}
		return intersections;		
	}
}

