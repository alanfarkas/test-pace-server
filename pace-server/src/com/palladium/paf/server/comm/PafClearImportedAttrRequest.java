/*
 *	File: @(#)PafClearImportedAttrRequest.java 	Package: com.pace.base.server.comm 	Project: PafServer
 *	Created: Dec 14, 2006  		By: kmoos
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
package com.palladium.paf.server.comm;

/**
 * Clear imported attributes response
 *
 * @version	x.xx
 * @author kmoos
 *
 */

import com.pace.base.comm.PafRequest;

public class PafClearImportedAttrRequest extends PafRequest {

	private boolean clearAllDimensions;
	private String[] dimensionsToClear = null;
	
	/**
	 * Gets the clear all dimensions flag.
	 * @return true if all dimensions will be cleared, 
	 * 	false if only certain dimensions will be cleared.
	 */
	public boolean isClearAllDimensions() {
		return clearAllDimensions;
	}
	
	/**
	 * Set to true to clear all dimension in the cache.  If false, then
	 * only the dimensions set will be cleared. 
	 * @param clearAllDimensions
	 */
	public void setClearAllDimensions(boolean clearAllDimensions) {
		this.clearAllDimensions = clearAllDimensions;
	}
	
	/**
	 * Gets the array of dimensions to clear.  If clearAllDimensions is true, then
	 * the property is ignored.
	 * @return an array of dimension names.
	 */
	public String[] getDimensionsToClear() {
		return dimensionsToClear;
	}
	
	/**
	 * Sets the array of dimensions to clear. If clearAllDimensions is true, then
	 * the property is ignored.
	 * @param dimensionsToClear The array of dimensions to clear.
	 */
	public void setDimensionsToClear(String[] dimensionsToClear) {
		this.dimensionsToClear = dimensionsToClear;
	}
}