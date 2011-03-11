/*
 *	File: @(#)PafSimpleAttributeMemberProps.java 		Package: com.pace.base.mdb 	Project: Paf Base Libraries
 *	Created: Nov 21, 2006  		By: AFarkas
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

/**
 * A simple version of the PafAttributeMemberProps object
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class PafSimpleAttributeMemberProps extends PafSimpleDimMemberProps {

	private String[] baseMembers = null;


	/**
	 * @return the baseMembers
	 */
	public String[] getBaseMembers() {
		return baseMembers;
	}

	/**
	 * @param baseMembers the baseMembers to set
	 */
	public void setBaseMembers(String[] baseMembers) {
		this.baseMembers = baseMembers;
	}

}
