/*
 *	File: @(#)PafMVS.java 		Package: com.pace.base.view		Project: PafServer
 *	Created: Mar 20, 2006  		By: AFarkas
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
 *	05/24/06		AFarkas			x.xx			Moved from com.pace.base.server (PafServer)
 * 
 */
package com.pace.base.view;

import com.pace.base.app.UnitOfWork;
import com.pace.base.mdb.PafDataCache;
import com.pace.base.mdb.PafDataSliceParms;

/**
 * "Materialized View Section" - Container to hold attributes of unique view and view section combinations
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class PafMVS {

	private PafView view = null;
	private PafViewSection viewSection = null;
	private PafDataCache dataCache = null;
	private PafDataSliceParms dataSliceParms = null;
	private boolean isInitializedForAttrEval = false;
	
	/**
	 * @param view Paf View object
	 * @param viewSection A Paf View Section belonging to the view
	 */
	public PafMVS(PafView view, PafViewSection viewSection) {
		this.view = view;
		this.viewSection = viewSection;
	}
	
	/**
	 *	Returns key of PafMVS instance
	 *
	 * @return key of PafMVS instance
	 */
	public String getKey() {
		return generateKey(view, viewSection);
	}
	
	/**
	 *	Generate a key for this PafMVS Instance
	 *
	 * @param view Paf View object
	 * @param viewSection A Paf View Section belonging to the view
	 * @return Key for this PafMVS Instance
	 */
	public static String generateKey(PafView view, PafViewSection viewSection) {
		return view.getName() + "." + viewSection.getName();		
	}

	/**
	 * @return Returns the dataSliceParms.
	 */
	public PafDataSliceParms getDataSliceParms() {
		return dataSliceParms;
	}

	/**
	 * @param dataSliceParms The dataSliceParms to set.
	 */
	public void setDataSliceParms(PafDataSliceParms dataSliceParms) {
		this.dataSliceParms = dataSliceParms;
	}

	/**
	 * @return the dataCache
	 */
	public PafDataCache getDataCache() {
		return dataCache;
	}
	/**
	 * @param dataCache the dataCache to set
	 */
	public void setDataCache(PafDataCache dataCache) {
		this.dataCache = dataCache;
	}

	/**
	 * @param isInitializedForAttrEval the isInitializedForAttrEval to set
	 */
	public void setInitializedForAttrEval(boolean isInitializedForAttrEval) {
		this.isInitializedForAttrEval = isInitializedForAttrEval;
	}

	/**
	 * @return the isInitializedForAttrEval
	 */
	public boolean isInitializedForAttrEval() {
		return isInitializedForAttrEval;
	}

	/**
	 * @return Returns the view.
	 */
	public PafView getView() {
		return view;
	}

	/**
	 * @param view The view to set.
	 */
	public void setView(PafView view) {
		this.view = view;
	}

	/**
	 * @return Returns the viewSection.
	 */
	public PafViewSection getViewSection() {
		return viewSection;
	}

	/**
	 * @param viewSection The viewSection to set.
	 */
	public void setViewSection(PafViewSection viewSection) {
		this.viewSection = viewSection;
	}


}

