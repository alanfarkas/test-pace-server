/*
 *	File: @(#)MemberTagCommentPosition.java 		Package: com.palladium.paf.db.membertags 	Project: Paf Base Libraries
 *	Created: Jan 23, 2008  			By: AFarkas
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
package com.palladium.paf.db.membertags;

/**
 * Defines the position of a member tag comment within a view tuple.
 * This information is needed by the client.
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class MemberTagCommentPosition {
	
	private String name;
	private String axis;
	
	
	/**
	 * No-arg constructor required for soap layer
	 */
	public MemberTagCommentPosition() {
		
	}
	
	/**
	 * @param name Member tag comment name
	 * @param axis View tuple dimension that comment is attached to
	 */
	public MemberTagCommentPosition(String name, String axis) {
		this.name = name;
		this.axis = axis;
	}
	
	/**
	 * @return the axis
	 */
	public String getAxis() {
		return axis;
	}
	/**
	 * @param axis the axis to set
	 */
	public void setAxis(String axis) {
		this.axis = axis;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
