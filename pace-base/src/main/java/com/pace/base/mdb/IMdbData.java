/*
 *	File: @(#)IMdbData.java 	Package: com.pace.base.mdb 		Project: Paf Base Libraries
 *	Created: Jul 3, 2005  		By: Alan Farkas
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2010 Palladium Group, Inc. All rights reserved.
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

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.pace.base.PafException;
import com.pace.base.app.PafApplicationDef;
import com.pace.base.app.PafDimSpec;
import com.pace.base.state.PafClientState;

/**
 * Provides access to the mid-tier data layer
 *
 * @version	x.xx
 * @author Alan Farkas
 *
 */
/**
 * @author ADG
 *
 */
/**
 * @author ADG
 *
 */
public interface IMdbData {

	/** 
	 *	Return a populated Uow Cache based on the supplied Uow specification
	 *	and Application Definition. This method is a convience method
	 *  for getUowCache(expandedUow, appDef, activeVersions, lockedPeriods), 
	 *  where the "lockedPeriods" parameter is set to null.
	 *
	 * @param expandedUow Fully expanded unit of work
	 * @param appDef Paf Application Definition
	 * @param activeVersions Array containing the active planning versions
	 * 
	 * @return PafUowCache - Result set and corresponding meta-data
	 * @throws PafException
	 */
	public PafUowCache getUowCache(Map<Integer, List<String>> expandedUow, PafApplicationDef appDef, String[] activeVersions) throws PafException;		
	
	/** 
	 *	Return a populated Uow Cache based on the supplied Uow specification
	 *	and Application Definition. 
	 *
	 * @param expandedUow Fully expanded unit of work
	 * @param appDef Paf Application Definition
	 * @param activeVersions Array containing the active planning versions
	 * @param lockedPeriods List of locked reporting periods
	 * 
	 * @return PafUowCache - Result set and corresponding meta-data
	 * @throws PafException
	 */
	public PafUowCache getUowCache(Map<Integer, List<String>> expandedUow, PafApplicationDef appDef, String[] activeVersions, Set<String> lockedPeriods) throws PafException;
	//TODO Change name of "activeVersions" to "planningVersions"

    /**
     *	Send data back to Essbase
     *
	 * @param pafUowCache PafUowCache Object - Updated data and associated meta-data
     * @param clientState Client State Object
     * 
	 * @throws PafException
     */
    public abstract void sendData(PafUowCache pafUowCache, PafClientState clientState) throws PafException;
    
    /**
     *	Get Filtered meta-data from Essbase
     *
	 * @param expandedUow Fully expanded unit of work
	 * @param appDef Paf Application Definition
	 * @throws PafException
     */
    public PafDimSpec[] getFilteredMetadata(Map<Integer, List<String>> expandedUOW, PafApplicationDef appDef) throws PafException;

	/** 
	 *	Refresh the specified uow cache from the mdb for the specified version filter.
	 *  If the version filter is empty, then all uow cache versions will be refreshed.
	 *
	 * @param uowCache Uow cache
	 * @param expandedUow Expanded uow definition
	 * @param versionFilter List of versions to refresh
	 * 
	 * @return List of refreshed versions
	 * @throws PafException 
	 */
    public List<String> refreshDataCache(PafUowCache uowCache, Map<Integer, List<String>> expandedUow, List<String> versionFilter) throws PafException;

}
