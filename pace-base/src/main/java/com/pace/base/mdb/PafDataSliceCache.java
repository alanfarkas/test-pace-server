/*
 *	File: @(#)PafViewCache.java 	Package: com.pace.base.mdb 	Project: Paf Base Libraries
 *	Created: Jan 3, 2007  			By: AFarkas
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.pace.base.PafException;
import com.pace.base.app.UnitOfWork;
import com.pace.base.data.Intersection;
import com.pace.base.view.PafMVS;

/**
 * Container of data slice specific calculations (e.g. attribute or version calcs)
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class PafDataSliceCache extends PafDataCache {

	private UnitOfWork sliceCacheSpec = null;
	private PafMVS pafMVS = null;
	private PafDataCache uowCache = null;
	private Boolean hasAttributes = null;
	private String[] attributeDims = null;

	// Lazy-loaded collection of component base member names, indexed by base member intersection
	private Map<Intersection, List<String>> componentBaseMemberMap = new HashMap<Intersection, List<String>>();

	private static Logger logger = Logger.getLogger(PafDataSliceCache.class);


	/**
	 * @param sliceCacheParms Data slice cache parms
	 * @throws PafException 
	 */
	public PafDataSliceCache(PafDataSliceCacheParms sliceCacheParms) throws PafException {

		logger.info("Creating instance of PafDataSliceCache");

		// Validate the data slice cache parms
		//TODO Complete validateDataSliceCacheParms
		validateDataSliceCacheParms(sliceCacheParms);

		// Set instance variables
		setDataSliceCacheSpec(sliceCacheParms.geDatatSliceCacheSpec());
		setPafMVS(sliceCacheParms.getPafMVS());
		setUowCache(sliceCacheParms.getUowCache());
		setHasAttributes(sliceCacheParms.getPafMVS().getViewSection().hasAttributes());
		setAttributeDims(sliceCacheParms.getPafMVS().getViewSection().getAttributeDims());
		setAppDef(uowCache.getAppDef());
		setActiveVersions(uowCache.getActiveVersions());
		setLockedPeriods(uowCache.getLockedPeriods());
		setAllDimensions(sliceCacheParms.geDatatSliceCacheSpec().getDimensions());
		setAxisCount(getAllDimensions().length);

		// Create memberArray and axisSizes array
		String[][] members = new String[getAxisCount()][];
		int[] axisSizes = new int[getAxisCount()];
		for (int i = 0; i < getAxisCount(); i++) {
			String dimension = getAllDimensions()[i];
			members[i] = sliceCacheParms.geDatatSliceCacheSpec().getDimMembers(dimension);
			axisSizes[i] = members[i].length;
		}
		setMemberArray(members);
		setAxisSizes(axisSizes);

		// Initialize data slice cache
		initDataCache();
		if (!hasAttributes) {
			initNonAttributeIntersections();
		}
	}


	/**
	 *	Validate the daa slice cache parameters
	 *
	 * @param sliceCacheParms Data slice cache parameters
	 *
	 */
	private void validateDataSliceCacheParms(PafDataSliceCacheParms sliceCacheParms) {

		// Check for null paf mvs
		if (sliceCacheParms.getPafMVS() == null) {
			String errMsg = "Data slice cache initialization error - pafMVS is null.";
			logger.error(errMsg);
			throw new IllegalArgumentException(errMsg);
		}

		// Check for null slice parms
		if (sliceCacheParms.getPafMVS().getDataSliceParms() == null) {
			String errMsg = "Data slice cache initialization error - sliceParms is null.";
			logger.error(errMsg);
			throw new IllegalArgumentException(errMsg);
		}

		// Check for null uow cache
		if (sliceCacheParms.getUowCache() == null) {
			String errMsg = "Data slice cache initialization error - uowCache is null.";
			logger.error(errMsg);
			throw new IllegalArgumentException(errMsg);
		}

	}

	/**
	 *	Indicates if underlying view section contains attributes
	 *
	 * @param hasAttributes
	 */
	private void setHasAttributes(Boolean hasAttributes) {
		this.hasAttributes = hasAttributes;	
	}

	/**
	 *	Initialize non-attribute intersections directly from the UOW cache
	 *
	 * @throws PafException 
	 */
	private void initNonAttributeIntersections() throws PafException {

		// Load base version intersections from uow cache
		logger.info("Loading base intersections from uow cache....");
		Map<String, List<String>> memberFilter = new HashMap<String, List<String>>();
		memberFilter.put(getVersionDim(), getBaseVersions());
		loadCacheCells(getUowCache(), memberFilter);
	}

	/**
	 *	Return the number of columns in the data slice cache
	 *
	 * @return Returns the number of columns in the data slice cache.
	 */
	public int getColumnCount() {

		int columnCount = 0;		
		columnCount = getAxisSizes()[0];

		return columnCount;
	}


	/**
	 * @return the sliceCacheSpec
	 */
	public UnitOfWork getDataSliceCacheSpec() {
		return sliceCacheSpec;
	}
	/**
	 * @param sliceCacheSpec the sliceCacheSpec to set
	 */
	public void setDataSliceCacheSpec(UnitOfWork sliceCacheSpec) {
		this.sliceCacheSpec = sliceCacheSpec;
	}

	/**
	 * @return the uowCache
	 */
	public PafDataCache getUowCache() {
		return uowCache;
	}
	/**
	 * @param uowCache the uowCache to set
	 */
	private void setUowCache(PafDataCache uowCache) {
		this.uowCache = uowCache;
	}


	/**
	 * @return the pafMVS
	 */
	public PafMVS getPafMVS() {
		return pafMVS;
	}
	/**
	 * @param pafMVS the pafMVS to set
	 */
	public void setPafMVS(PafMVS pafMVS) {
		this.pafMVS = pafMVS;
	}


	/**
	 * @return the hasAttributes
	 */
	public Boolean hasAttributes() {
		return hasAttributes;
	}


	/**
	 * @return the attributeDims
	 */
	public String[] getAttributeDims() {
		return attributeDims;
	}


	/**
	 * @param strings the attributeDims to set
	 */
	private void setAttributeDims(String[] strings) {
		this.attributeDims = strings;
	}



	/**
	 * @return the componentBaseMemberMap
	 */
	public Map<Intersection, List<String>> getComponentBaseMemberMap() {
		return componentBaseMemberMap;
	}

	/**
	 *	Get component base members for the specified intersection
	 *
	 * @param baseMemberIs Base member intersection
	 * @return List<String>
	 */
	public List<String> getComponentBaseMembers(Intersection baseMemberIs) {

		List<String> componentMembers = null;
		if (componentBaseMemberMap.containsKey(baseMemberIs)) {
			componentMembers = componentBaseMemberMap.get(baseMemberIs);
		} else {
			componentMembers = new ArrayList<String>();
		}
		return componentMembers;
	}


	/**
	 *	Add component members for the specified base member intersection
	 *
	 * @param baseMemberIs Base member intersection
	 * @param componentMembers Component base members
	 */
	public void addComponentBaseMembers(Intersection baseMemberIs, List<String> componentMembers) {

		// Add new collection
		componentBaseMemberMap.put(baseMemberIs, componentMembers);

	}



}
