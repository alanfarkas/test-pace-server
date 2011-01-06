/*
 *	File: @(#)PafViewGroupItem.java 	Package: com.palladium.paf.view 	Project: Paf Base Libraries
 *	Created: Jan 25, 2007  		By: jmilliron
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
package com.palladium.paf.view;

/**
 * Class_description_goes_here
 * 
 * @author jmilliron
 * @version x.xx
 * 
 */
public class PafViewGroupItem {

	private String name;

	private boolean viewGroup;

	public PafViewGroupItem() {

	}

	public PafViewGroupItem(String name, boolean viewGroup) {
		this.name = name;
		this.viewGroup = viewGroup;
	}

	/**
	 * @return Returns the name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            The name to set.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return Returns the viewGroup.
	 */
	public boolean isViewGroup() {
		return viewGroup;
	}

	/**
	 * @param viewGroup
	 *            The viewGroup to set.
	 */
	public void setViewGroup(boolean viewGroup) {
		this.viewGroup = viewGroup;
	}

	/**
	 * @return Returns the viewGroup.
	 */
	public boolean isView() {
		return !viewGroup;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (viewGroup ? 1231 : 1237);
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
		PafViewGroupItem other = (PafViewGroupItem) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (viewGroup != other.viewGroup)
			return false;
		return true;
	}
	
	
}
