/*
 *	File: @(#)PafDataSliceCacheParms.java 	Package: com.pace.base.mdb 	Project: Paf Base Libraries
 *	Created: Feb 6, 2007  					By: AFarkas
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

import com.pace.base.app.UnitOfWork;
import com.pace.base.view.PafMVS;

/**
 * Data slice cache parms
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class PafDataSliceCacheParms {

	private UnitOfWork sliceCacheSpec = null;
	private PafMVS pafMVS = null;
	private PafDataCache uowCache = null;
	
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
	 * @return the sliceCacheSpec
	 */
	public UnitOfWork geDatatSliceCacheSpec() {
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
	public void setUowCache(PafDataCache uowCache) {
		this.uowCache = uowCache;
	}

}
