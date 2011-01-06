/*
 *	File: @(#)MemberTagDef.java 		Package: com.palladium.paf.db.membertags 	Project: Paf Base Libraries
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
package com.palladium.paf.db.membertags;

import java.util.Arrays;

/**
 * Member tag definition
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class MemberTagDef {

	private String name;
	private MemberTagType type;
	private String label;
	private String[] dims;
	private boolean isEditable;
	private boolean isCommentVisible;


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
	public boolean isCommentVisible() {
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
	public MemberTagType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(MemberTagType type) {
		this.type = type;
	}


	/**
	 * Added to ease debugging
	 */
	@Override
	public String toString() {

		StringBuffer strBuff = new StringBuffer("Member Tag:\n");
	
		strBuff.append("\tName: " + this.name + "\n");
		strBuff.append("\tType: " + ((this.type == null) ? null : this.type.toString()) + "\n");
		strBuff.append("\tLabel: " + this.label + "\n");
		strBuff.append("\tDimensions:\n");
		
		if ( dims != null ) {
			
			for (String dim : dims ) {
					
				strBuff.append("\t\t" + dim + "\n");
				
			}	
			
		}
		
		strBuff.append("\tIs Editable: " + this.isEditable + "\n");
		strBuff.append("\tIs Comment Visible: " + this.isCommentVisible + "\n");
		
		return strBuff.toString();
	
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(dims);
		result = prime * result + (isCommentVisible ? 1231 : 1237);
		result = prime * result + (isEditable ? 1231 : 1237);
		result = prime * result + ((label == null) ? 0 : label.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberTagDef other = (MemberTagDef) obj;
		if (!Arrays.equals(dims, other.dims))
			return false;
		if (isCommentVisible != other.isCommentVisible)
			return false;
		if (isEditable != other.isEditable)
			return false;
		if (label == null) {
			if (other.label != null)
				return false;
		} else if (!label.equals(other.label))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	
	
}
