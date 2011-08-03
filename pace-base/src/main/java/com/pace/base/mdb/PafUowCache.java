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

import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;

import com.pace.base.PafBaseConstants;
import com.pace.base.app.PafApplicationDef;
import com.pace.base.app.UnitOfWork;
import com.pace.base.state.PafClientState;
import com.pace.base.utility.LogUtil;
import com.pace.base.view.PafMVS;

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class PafUowCache extends PafDataCache {

	private static Logger logger = Logger.getLogger(PafUowCache.class);
	private static Logger performanceLogger = Logger.getLogger(PafBaseConstants.PERFORMANCE_LOGGER_DC);

	/**
	 * Convenience constructor for testing purposes
	 * 
	 * @param clientState Client State
	 */
	public PafUowCache(PafClientState clientState) {
		this(clientState, new String[0], new HashSet<String>());
	}
	
	/**
	 * @param clientState Client State
	 * @param attributeDims Attribute dimension names 
	 * @param lockedPeriods Set of locked periods
	 */
	public PafUowCache(PafClientState clientState, String[] attributeDims, Set<String> lockedPeriods) {

		int axisCount = 0;
		int[] axisSizes = null;
		String[][] memberArray = null;
		String[] planVersion = new String[]{clientState.getPlanningVersion().getName()};
		long createStartTime = System.currentTimeMillis();
		PafApplicationDef appDef = clientState.getApp();
		UnitOfWork expandedUowSpec = clientState.getUnitOfWork();
		String[] uowDims = expandedUowSpec.getDimensions();

//TODO Pull in UOWTrees and add as DC parameter
//TODO Add baseDims as a parm and use it to set global baseDims var

		logger.debug("Creating instance of PafUowCache");
		
		// Parse out the dimensional info in the unit of work specification
		// and generate needed data structures including an array containing 
		// the list of members for each dimension axis.
		axisCount = uowDims.length;
		axisSizes = new int[axisCount];
		memberArray = new String[axisCount][];
		for (int axis = 0; axis < axisCount; axis++) {
			String[] members = expandedUowSpec.getDimMembers(uowDims[axis]);
			memberArray[axis] = members;
			axisSizes[axis] = members.length;
		}

		// Set instance variables
		setAppDef(appDef);
		setPlanVersions(planVersion);
		setLockedPeriods(lockedPeriods);
		setAxisCount(axisCount);
		setAxisSizes(axisSizes);
		setAllDimensions(uowDims);
		setCoreDimensions(uowDims);
		setAttributeDims(attributeDims);
		setMemberArray(memberArray);

		// Initialize data cache
		initDataCache();  // combine constructor logic with this
		String logMsg = LogUtil.timedStep("Data Cache creation", createStartTime);
		performanceLogger.info(logMsg);
		
	}

	/**
	 * @param cacheParms parameters required for constructing the data cache
	 */
	public PafUowCache(PafUowCacheParms cacheParms) {
		
		long createStartTime = System.currentTimeMillis();
		logger.info("Creating instance of PafUowCache");
				
		// Set instance variables
		setAppDef(cacheParms.getAppDef());
		setPlanVersions(cacheParms.getActiveVersions());
		setLockedPeriods(cacheParms.getLockedPeriods());
		setAxisCount(cacheParms.getAxisCount());
		setAxisSizes(cacheParms.getAxisSize());
		setAllDimensions(cacheParms.getDimensions());
		setMemberArray(cacheParms.getMemberArray());

		// Validate object parameters
		validateUowCacheParms();
		
		// Initialize uow cache
		initDataCache();
		String logMsg = LogUtil.timedStep("Data Cache creation", createStartTime);
		performanceLogger.debug(logMsg);
		
	}
	
	/**
	 *	Validate PafUowCache constructor parameters
	 *
	 */
	private void validateUowCacheParms() {
		
		logger.debug("Validating PafUowCache parameters");

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
		if (getPlanVersions() == null) {
			// Throw Illegal Argument Exception
			String errMsg = "PafUowCache parms error - null activeVersions";
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
		
		
		// Validate "allDimensions"
		logger.debug("Validating [allDimensions]");
		validateArray(getAllDimensions(), "allDimensions");
		
		// Validate "memberArray"
//		logger.debug("Validating [memberArray]");
//		validateArray(getMemberArray(), "memberArray");
//		for (int i = 0; i < getAxisCount(); i++) {
//			if (getMemberArray()[i].length != getAxisSizes()[i]) {
//				// Number of axis members in memberArray for don't match axis size 
//				// throw Illegal Argument Exception
//				String errMsg = "PafUowCache parms error - number of members in memberArray for axis [" + i + "] does not match axis size";
//				logger.error(errMsg);
//				IllegalArgumentException iae = new IllegalArgumentException(errMsg);    
//				throw iae; 
//			}	
//		}
	}
	

	/**
	 * @return the pafMVS (null for PafUowCache)
	 */
	public PafMVS getPafMVS() {
		return null;
	}




}
