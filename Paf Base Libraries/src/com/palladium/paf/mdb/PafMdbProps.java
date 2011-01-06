/*
 *	File: @(#)PafMdbProps.java 	Package: com.palladium.paf.mdb 	Project: Paf Base Libraries
 *	Created: Nov 28, 2006  		By: AFarkas
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
//import org.apache.log4j.Logger;


/**
 * Basic Multidimensional Database Properties
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class PafMdbProps {
	
	// basic properties
	private String[] aliasTables = null;
	private String[] attributeDims = null;
	private String[] baseDims = null;
	private String[] cachedAttributeDims = null;
	
	// base dimension lookup - Because of wsdl restrictions,  hash map is broken out into separate arrays 
	private String[] baseDimLookupKeys;		
	private String[] baseDimLookupValues;
	
	// logger
	//private static Logger logger = Logger.getLogger(PafMdbProps.class);

	/**
	 * @return Returns the aliasTables.
	 */
	public String[] getAliasTables() {
		return aliasTables;
	}
	/**
	 * @param aliasTables The aliasTables to set.
	 */
	public void setAliasTables(String[] aliasTables) {
		this.aliasTables = aliasTables;
	}
	/**
	 * @return Returns the attributeDims.
	 */
	public String[] getAttributeDims() {
		return attributeDims;
	}
	/**
	 * @param attributeDims The attributeDims to set.
	 */
	public void setAttributeDims(String[] attributeDims) {
		this.attributeDims = attributeDims;
	}
	/**
	 * @return Returns the baseDims.
	 */
	public String[] getBaseDims() {
		return baseDims;
	}
	/**
	 * @param baseDims The baseDims to set.
	 */
	public void setBaseDims(String[] baseDims) {
		this.baseDims = baseDims;
	}
	/**
	 * @return the baseDimLookupKeys
	 */
	public String[] getBaseDimLookupKeys() {
		return baseDimLookupKeys;
	}
	/**
	 * @param baseDimLookupKeys the baseDimLookupKeys to set
	 */
	public void setBaseDimLookupKeys(String[] baseDimLookupKeys) {
		this.baseDimLookupKeys = baseDimLookupKeys;
	}
	/**
	 * @return the baseDimLookupValues
	 */
	public String[] getBaseDimLookupValues() {
		return baseDimLookupValues;
	}
	/**
	 * @param baseDimLookupValues the baseDimLookupValues to set
	 */
	public void setBaseDimLookupValues(String[] baseDimLookupValues) {
		this.baseDimLookupValues = baseDimLookupValues;
	}
	
	/**
	 * Gets the cached dimensions.
	 * @return An array of cached dimensions.
	 */
	public String[] getCachedAttributeDims() {
		return cachedAttributeDims;
	}
	
	/**
	 * Sets the attributes that are currently cached.
	 * @param cachedAttributeDims Array of cached dims.
	 */
	public void setCachedAttributeDims(String[] cachedAttributeDims) {
		this.cachedAttributeDims = cachedAttributeDims;
	}

	
	/**
	 * Return a map that provides a lookup of attribute dimension to base dimension
	 * 
	 * @param attributeDim Attribute dimension name
	 * 
	 * @return Base dimension lookup
	 * 
	 */
	public String getAssociatedBaseDim(String attributeDim) {

		// Look for specified attribute dimension
		if (getBaseDimLookupKeys() != null) {
			for (int i = 0; i < getBaseDimLookupKeys().length; i++) {
				if (attributeDim.equalsIgnoreCase(getBaseDimLookupKeys()[i])) {
					// Return associated base dimension
					return getBaseDimLookupValues()[i];
				}
			}
		}
		
		// Dimension not found, throw exception		
		String errMsg = "Unable to get associated Base Dimension for Attribute Dimension: [" + attributeDim + "] - Dimension was not found";
//		logger.error(errMsg);
		IllegalArgumentException iae = new IllegalArgumentException(errMsg);    
		throw iae; 

	}
}
