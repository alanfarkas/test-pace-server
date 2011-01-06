/*
 *	File: @(#)MemberTagCommentEntry.java 	Package: com.palladium.paf.db.membertags 	Project: Paf Base Libraries
 *	Created: Mar 26, 2008  					By: AFarkas
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
 * Member Tag Comment Entry
 *
 * @version	1.00
 * @author AFarkas
 *
 */
public class MemberTagCommentEntry {
	
	String name;
	boolean isVisible;
	
	/**
	 * No-arg constructor required for soap layer
	 */
	public MemberTagCommentEntry() {}
	
	/**
	 * @param name Member tag comment name
	 */
	public MemberTagCommentEntry(String name) {
		
		this.name = name;
	}

	/**
	 * @param name Member tag comment name
	 * @param isVisible Member tag visibility behavior on view
	 */
	public MemberTagCommentEntry(String name, boolean isVisible) {
		
		this.name = name;
		this.isVisible = isVisible;
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

	/**
	 * @return the isVisible
	 */
	public boolean isVisible() {
		return isVisible;
	}

	/**
	 * @param isVisible the isVisible to set
	 */
	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}

}
