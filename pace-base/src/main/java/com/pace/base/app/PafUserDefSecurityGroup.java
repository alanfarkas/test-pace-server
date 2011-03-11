/*
 *	File: @(#)PafUserDefSecurityGroup.java 	Package: com.pace.base.app 	Project: Paf Base Libraries
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
public class PafUserDefSecurityGroup extends PafSecurityGroup {

	//array of user definitions
	private PafUserDef[] pafUserDefs;
	
	public PafUserDefSecurityGroup() {
		
	}

	/**
	 * @return the pafUserDefs
	 */
	public PafUserDef[] getPafUserDefs() {
		return pafUserDefs;
	}

	/**
	 * @param pafUserDefs the pafUserDefs to set
	 */
	public void setPafUserDefs(PafUserDef[] pafUserDefs) {
		this.pafUserDefs = pafUserDefs;
	}
	
	
	
}
