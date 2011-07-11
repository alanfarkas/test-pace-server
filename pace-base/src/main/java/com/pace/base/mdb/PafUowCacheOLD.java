/*
 *	File: @(#)PafUowCache.java 		Package: com.pace.base.mdb 	Project: Paf Base Libraries
 *	Created: Jan 29, 2007  			By: AFarkas
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2007 Palladium Group, Inc. All rights reserved.
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

import org.apache.log4j.Logger;

import com.pace.base.view.PafMVS;

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class PafUowCacheOLD extends PafDataCache {

	private boolean[] isSlicerAxis = null;	// Expected to be false
	private int[] dimCountByAxis = null;
	private String mdxQuery = null;
	private static Logger logger = Logger.getLogger(PafUowCacheOLD.class);

	/**
	 * @param cacheParms parameters required for constructing the data cache
	 */
	public PafUowCacheOLD(PafUowCacheParms cacheParms) {
		
		logger.info("Creating instance of PafUowCache");
				
		// Set instance variables
		setAppDef(cacheParms.getAppDef());
		setActiveVersions(cacheParms.getActiveVersions());
		setLockedPeriods(cacheParms.getLockedPeriods());
		setAxisCount(cacheParms.getAxisCount());
		setAxisSizes(cacheParms.getAxisSize());
		setDimCountByAxis(cacheParms.getDimCountByAxis());
		setAllDimensions(cacheParms.getDimensions());
		setIsSlicerAxis(cacheParms.getIsSlicerAxis());
		setMemberArray(cacheParms.getMemberArray());
		setMdxQuery(cacheParms.getMdxQuery());

		// Validate object parameters
		validateUowCacheParms();
		
		// Initialize uow cache
		initDataCache();
		
	}
	
	/**
	 *	Validate PafUowCache constructor parameters
	 *
	 */
	private void validateUowCacheParms() {
		
		logger.info("Validating PafUowCache parameters");

		// Validate "appDef"
		logger.debug("Validating [appDef]");
		if (getAppDef() == null) {
			// Throw Illegal Argument Exception
			String errMsg = "PafUowCache parms error - null Application Defintion object";
			logger.error(errMsg);
			IllegalArgumentException iae = new IllegalArgumentException(errMsg);    
			throw iae; 
		}
		
		// Validate "lockedPeriods"
		logger.debug("Validating [lockedPeriods]");
		if (getLockedPeriods() == null) {
			// Throw Illegal Argument Exception
			String errMsg = "PafUowCache parms error - null Locked Periods set";
			logger.error(errMsg);
			IllegalArgumentException iae = new IllegalArgumentException(errMsg);    
			throw iae; 
		}
		
		// Validate "activeVersions"
		//TODO Change name of "activeVersions" to "planningVersions"
		logger.debug("Validating [activeVersions]");
		if (getActiveVersions() == null) {
			// Throw Illegal Argument Exception
			String errMsg = "PafUowCache parms error - null activeVersions";
			logger.error(errMsg);
			IllegalArgumentException iae = new IllegalArgumentException(errMsg);    
			throw iae; 
		}
		
		// Validate "mdxQuery"
		if (getMdxQuery() == null || getMdxQuery() == "") {
			// mdxQuery is null or blank
			String errMsg = "PafUowCache parms error - mdxQuery is blank or null ***";
			logger.error(errMsg);
			IllegalArgumentException iae = new IllegalArgumentException(errMsg);    
			throw iae; 
		}	
		
		// Validate "axisCount"
		logger.debug("Validating [axisCount]");
		if (getAxisCount() < 1) {
			// Invalid axisCount value - throw Illegal Argument Exception
			
			String errMsg = "PafUowCache parms error - axisCount must be greater than 0";
			logger.error(errMsg);
			IllegalArgumentException iae = new IllegalArgumentException(errMsg);    
			throw iae; 
		}
		
		// Validate "axisSize"
		logger.debug("Validating [axisSize]");
		validateArray(getAxisSizes(), "axisSize");
		int axisProduct = 1;
		for (int i = 0; i < getAxisCount(); i++) {
			axisProduct = axisProduct * getAxisSizes()[i]; 
		}
		
		// Validate "isSlicerAxis"
		logger.debug("Validating [isSlicerAxis]");
		validateArray(isSlicerAxis, "isSlicerAxis");
		
		// Validate "dimCountByAxis"
		logger.debug("Validating [dimCountByAxis]");
		validateArray(getDimCountByAxis(), "dimCountByAxis");
		for (int i = 0; i < getAxisCount(); i++) {
			if (getDimCountByAxis()[i] > 1) {
				// Axis has more than one dimension
				String errMsg = "PafUowCache parms error - axis [" + i + "] has more than one dimension (possible issue with Mdx query syntax)";
				logger.error(errMsg);
				IllegalArgumentException iae = new IllegalArgumentException(errMsg);    
				throw iae; 
			}	
		}
		
		// Validate "allDimensions"
		logger.debug("Validating [allDimensions]");
		validateArray(getAllDimensions(), "allDimensions");
		
		// Validate "memberArray"
		logger.debug("Validating [memberArray]");
		validateArray(getMemberArray(), "memberArray");
		for (int i = 0; i < getAxisCount(); i++) {
			if (getMemberArray()[i].length != getAxisSizes()[i]) {
				// Number of axis members in memberArray for don't match axis size 
				// throw Illegal Argument Exception
				String errMsg = "PafUowCache parms error - number of members in memberArray for axis [" + i + "] does not match axis size";
				logger.error(errMsg);
				IllegalArgumentException iae = new IllegalArgumentException(errMsg);    
				throw iae; 
			}	
		}
	}
	
	/**
	 *	Return the number of columns in the uow cache
	 *
 	 * @return Returns the number of columns in the uow cache.
	 */
	public int getColumnCount() {
		
		int columnCount = 0;
		
		if (isSlicerAxis[0]) {
			columnCount = getAxisSizes()[1];
		} else {
			columnCount = getAxisSizes()[0];
		}
		return columnCount;
	}

	/**
	 * @return the dimCountByAxis
	 */
	private int[] getDimCountByAxis() {
		return dimCountByAxis;
	}
	/**
	 * @param dimCountByAxis the dimCountByAxis to set
	 */
	private void setDimCountByAxis(int[] dimCountByAxis) {
		this.dimCountByAxis = dimCountByAxis;
	}

	/**
	 *	Return the isSlicerAxis array
	 *
 	 * @return Returns the isSlicerAxis array.
	 */
	public boolean[] getIsSlicerAxis() {
		return isSlicerAxis;
	}
	/**
	 *	Update the isSlicerAxis array
	 *
 	 * @param isSlicerAxis A boolean array that inidicates whether or not an axis is a slicer axis
	 */
	private void setIsSlicerAxis(boolean[] isSlicerAxis) {
		this.isSlicerAxis = isSlicerAxis;
	}


	/**
	 *	Return the Mdx query string that was used to build the data cache
	 *
 	 * @return Returns the Mdx query string that was used to build the data cache.
	 */
	public String getMdxQuery() {
		return mdxQuery;
	}
	/**
	 *	Update the Mdx query that was used to build the data cache
	 *
 	 * @param mdxQuery The Mdx query that was used to build the data cache
	 */
	private void setMdxQuery(String mdxQuery) {
		this.mdxQuery = mdxQuery;
	}

	/**
	 * @return the pafMVS (null for PafUowCache)
	 */
	public PafMVS getPafMVS() {
		return null;
	}




}
