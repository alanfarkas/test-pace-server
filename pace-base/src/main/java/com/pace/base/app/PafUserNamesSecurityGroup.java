/*
 *	File: @(#)PafUserNamesSecurityGroup.java 	Package: com.pace.base.app 	Project: Paf Base Libraries
 *	Created: Nov 28, 2007  		By: Jason
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
package com.pace.base.app;


/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author Jason
 *
 */
public class PafUserNamesSecurityGroup extends PafSecurityGroup{
	
	//array of user names
	private String[] userNames;
 	private String[] displayNames;
		
	/**
	 * 
	 */
	public PafUserNamesSecurityGroup() {
	
	}
		
	
	/**
	 * @return the userNames
	 */
	public String[] getUserNames() {
		return userNames;
	}

	/**
	 * @param userNames the userNames to set
	 */
	public void setUserNames(String[] userNames) {
		this.userNames = userNames;
	}

	public void setDisplayNames(String[] displayNames) {
		this.displayNames = displayNames;
	}

	public String[] getDisplayNames() {
		return displayNames;
	}
	
}
