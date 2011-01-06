/*
 *	File: @(#)PafUowCacheParms.java 	Package: com.palladium.paf.mdb.essbase 	Project: Essbase Provider
 *	Created: Sep 7, 2005  				By: Alan Farkas
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

import java.util.Set;

import org.apache.log4j.Logger;

import com.palladium.paf.app.PafApplicationDef;

/**
 * Parameter object for PafUowCache
 *
 * @version	x.xx
 * @author Alan Farkas
 *
 */
public class PafUowCacheParms {

	private PafApplicationDef appDef = null;
	private Set lockedPeriods = null;
	private boolean[] isSlicerAxis = null;
	private int axisCount = 0;
	private int[] axisSize = null;
	private int[] dimCountByAxis = null;
	private String mdxQuery = null;
	private String[] dimensions = null;
	private String[][] memberArray = null;
	private String[] activeVersions;
	private static Logger logger = Logger.getLogger(PafUowCacheParms.class);

    public PafUowCacheParms() {
        logger.debug("Creating instance of PafUowCacheParms");
    }
    
	/**
	 * @return Returns the axisCount.
	 */
	public int getAxisCount() {
		return axisCount;
	}
	/**
	 * @param axisCount The axisCount to set.
	 */
	public void setAxisCount(int axisCount) {
		this.axisCount = axisCount;
	}
	
	/**
	 * @return Returns the axisSize.
	 */
	public int[] getAxisSize() {
		return axisSize;
	}
	/**
	 * @param axisSize The axisSize to set.
	 */
	public void setAxisSize(int[] axisSize) {
		this.axisSize = axisSize;
	}

	
	/**
	 * @return Returns the dimCountByAxis.
	 */
	public int[] getDimCountByAxis() {
		return dimCountByAxis;
	}
	/**
	 * @param dimCountByAxis The dimCountByAxis to set.
	 */
	public void setDimCountByAxis(int[] dimCountByAxis) {
		this.dimCountByAxis = dimCountByAxis;
	}
	
	/**
	 * @return Returns the dimensions.
	 */
	public String[] getDimensions() {
		return dimensions;
	}
	/**
	 * @param dimensions The dimensions to set.
	 */
	public void setDimensions(String[] dimensions) {
		this.dimensions = dimensions;
	}
	
	/**
	 * @return Returns the isSlicerAxis.
	 */
	public boolean[] getIsSlicerAxis() {
		return isSlicerAxis;
	}
	/**
	 * @param isSlicerAxis The isSlicerAxis to set.
	 */
	public void setIsSlicerAxis(boolean[] isSlicerAxis) {
		this.isSlicerAxis = isSlicerAxis;
	}
	
	/**
	 * @return Returns the mdx query.
	 */
	public String getMdxQuery() {
		return mdxQuery;
	}
	/**
	 * @param mdxQuery The mdx query to set.
	 */
	public void setMdxQuery(String mdxQuery) {
		this.mdxQuery = mdxQuery;
	}
	
	/**
	 * @return Returns the member array.
	 */
	public String[][] getMemberArray() {
		return memberArray;
	}
	/**
	 * @param memberArray The member array to set.
	 */
	public void setMemberArray(String[][] memberArray) {
		this.memberArray = memberArray;
	}

	/**
	 * @return Returns the locked periods.
	 */
	public Set getLockedPeriods() {
		return lockedPeriods;
	}
	/**
	 * @param lockedPeriods The locked periods to set.
	 */
	public void setLockedPeriods(Set lockedPeriods) {
		this.lockedPeriods = lockedPeriods;
	}

	/**
	 * @return Returns the Paf Application Definition.
	 */
	public PafApplicationDef getAppDef() {
		return appDef;
	}
	/**
	 * @param appDef The Paf Application Definition to set.
	 */
	public void setAppDef(PafApplicationDef appDef) {
		this.appDef = appDef;
	}

	/**
	 * @return Returns the active versions.
	 */
	public String[] getActiveVersions() {
		return activeVersions;
	}
	/**
	 * @param activeVersions The active versions to set.
	 */
	public void setActiveVersion(String[] activeVersions) {
		this.activeVersions = activeVersions;		
	}

}
