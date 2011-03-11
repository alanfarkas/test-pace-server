/*
 *	File: @(#)PafSecurityGroup.java 	Package: com.pace.base.app 	Project: Paf Base Libraries
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

import com.pace.base.ui.PafServer;

/**
 * Contains a group name and domain name.
 *
 * @version	x.xx
 * @author Jason
 *
 */
public class PafSecurityGroup  implements Comparable<PafSecurityGroup> {

	//name of security group
	private String groupName;
	
	/**
	 * Creates a Security Group
	 *
	 */
	public PafSecurityGroup() {
		
	}
	
	public int compareTo(PafSecurityGroup group) {
				
		int outcome = 0;
		
		if ( group.getGroupName() != null && this.getGroupName() != null) {
			outcome = this.getGroupName().compareTo(group.getGroupName());			
		}
		
		return outcome;
	}

	/**
	 * @return the groupName
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * @param groupName the groupName to set
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
		
	
}
