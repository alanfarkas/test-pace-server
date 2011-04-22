/*
 *	File: @(#)AttributeDimInfo.java 		Package: com.pace.base.server.comm 	Project: PafServer
 *	Created: Apr 27, 2007  			By: AFarkas
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
package com.pace.server.comm;

/**
 * Attribute dimension information
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class AttributeDimInfo {
	
	private String dimName;
	private String baseDimName;
	private int baseDimMappingLevel;
	
	/**
	 * @return the associated base dimension
	 */
	public String getBaseDimName() {
		return baseDimName;
	}
	/**
	 * @param baseDimension the associated base dimension to set
	 */
	public void setBaseDimName(String baseDimension) {
		this.baseDimName = baseDimension;
	}
	/**
	 * @return the baseDimensionMappingLevel
	 */
	public int getBaseDimMappingLevel() {
		return baseDimMappingLevel;
	}
	/**
	 * @param baseDimensionMappingLevel the baseDimensionMappingLevel to set
	 */
	public void setBaseDimMappingLevel(int baseDimensionMappingLevel) {
		this.baseDimMappingLevel = baseDimensionMappingLevel;
	}
	/**
	 * @return the dimName
	 */
	public String getDimName() {
		return dimName;
	}
	/**
	 * @param dimName the dimName to set
	 */
	public void setDimName(String dimName) {
		this.dimName = dimName;
	}
}
