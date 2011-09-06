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

import com.pace.base.PafException;
import com.pace.base.app.PafApplicationDef;
import com.pace.base.app.PafDimSpec;
import com.pace.base.app.UnitOfWork;
import com.pace.base.state.PafClientState;

/**
 * Provides access to the mid-tier data layer
 *
 * @version	x.xx
 * @author Alan Farkas
 *
 */

public interface IMdbData {


	/** 
	 *	Refresh the data cache with mdb data for the specified versions. Each 
	 *	specified version will be completely cleared and reloaded for across
	 *	all unit of work intersections.
	 *
	 *  No data will be refreshed if the version filter is empty.
	 *  
	 * @param dataCache Data cache
	 * @param mdbDataSpec Specifies the intersections to retrieve for each version
	 * @param versionFilter List of versions to refresh
	 * 	  
	 * @return List of updated versions
	 * @throws PafException 
	 */ 
	public abstract List<String> refreshDataCache(PafDataCache dataCache, Map<String, Map<Integer, List<String>>> mdbDataSpec, List<String> versionFilter) throws PafException;


	/** 
	 *	Update the data cache with mdb data for the specified versions. For 
	 * 	performance reasons, existing data blocks will be not be updated.
	 * 
	 *  Any versions that need to be completely refreshed should be cleared before 
	 *  calling this method.
	 *
	 *
	 *  No data will be refreshed if the version filter is empty.
	 *  
	 * @param dataCache Data cache
	 * @param expandedUow Expanded unit of work specification
	 * @param versionFilter List of versions to refresh
	 * 	  
	 * @return List of updated versions
	 * @throws PafException 
	 */ 
	public abstract List<String> updateDataCache(PafDataCache dataCache, UnitOfWork expandedUow, List<String> versionFilter) throws PafException;
	

	/** 
	 *	Update the data cache with mdb data for the intersections specified, by version.
	 * 	For performance reasons, existing data blocks will not be updated.
	 * 
	 *  Any versions that need to be completely refreshed should be cleared before 
	 *  calling this method.
	 *
	 *  No data will be loaded if the data specification is empty.
	 *  
	 * @param dataCache Data cache
	 * @param mdbDataSpec Specifies the intersections to retrieve for each version
	 * 
	 * @return List of updated versions
	 * @throws PafException 
	 */
    public abstract List<String> updateDataCache(PafDataCache dataCache, Map<String, Map<Integer, List<String>>> mdbDataSpec) throws PafException;

	
	/**
     *	Send data back to Essbase
     *
	 * @param dataCache Data cache - Updated data and associated meta-data
     * @param clientState Client State Object
     * 
	 * @throws PafException
     */
    public abstract void sendData(PafDataCache dataCache, PafClientState clientState) throws PafException;
    
    
    /**
     *	Get Filtered meta-data from Essbase
     *
	 * @param expandedUow Fully expanded unit of work
	 * @param appDef Paf Application Definition
	 * @throws PafException
     */
    public abstract PafDimSpec[] getFilteredMetadata(Map<Integer, List<String>> expandedUOW, PafApplicationDef appDef) throws PafException;


}
