/*
 *	File: @(#)PafSimpleMemberTagDef.java 		Package: com.pace.base.server.comm 	Project: PafServer
 *	Created: Nov 29, 2007  			By: AFarkas
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

import com.pace.base.db.membertags.MemberTagDef;


/**
 * Simple member tag definition suitable for soap layer
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class PafSimpleMemberTagDef {

	String name;
	String type;	/* "TX" = TEXT, "FO" = FORMULA, "HY" = HYPERLINK */
	String label;
	String[] dims;
	boolean isEditable;
	boolean isCommentVisible;

	public PafSimpleMemberTagDef() {}
	
	/**
	 * @param memberTagDef Member tag definition
	 */
	public PafSimpleMemberTagDef(MemberTagDef memberTagDef) {
		
		this.name = memberTagDef.getName();
		this.type = memberTagDef.getType().getCode();
		this.label = memberTagDef.getLabel();
		this.dims = memberTagDef.getDims();
		this.isEditable = memberTagDef.isEditable();
		this.isCommentVisible = memberTagDef.isCommentVisible();	
	}

	/**
	 * @return the dims
	 */
	public String[] getDims() {
		return dims;
	}

	/**
	 * @param dims the dims to set
	 */
	public void setDims(String[] dims) {
		this.dims = dims;
	}

	/**
	 * @return the isCommentVisible
	 */
	public boolean  isCommentVisible() {
		return isCommentVisible;
	}

	/**
	 * @param isCommentVisible the isCommentVisible to set
	 */
	public void setCommentVisible(boolean isCommentVisible) {
		this.isCommentVisible = isCommentVisible;
	}

	/**
	 * @return the isEditable
	 */
	public boolean isEditable() {
		return isEditable;
	}

	/**
	 * @param isEditable the isEditable to set
	 */
	public void setEditable(boolean isEditable) {
		this.isEditable = isEditable;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
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
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
}
