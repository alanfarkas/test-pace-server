/*
 *	File: @(#)PafViewGroup.java 	Package: com.pace.base.view 	Project: Paf Base Libraries
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
package com.pace.base.view;

import java.util.Arrays;

/**
 * Class_description_goes_here
 *
 * @author jmilliron
 * @version	x.xx
 *
 */
public class PafViewGroup implements Cloneable {

	private String name;
	
	private String desc;
	
	private PafViewGroupItem[] pafViewGroupItems;

	
	public PafViewGroup() {
		
	}
	
	public PafViewGroup(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}
	
	public PafViewGroup(String name, String desc, PafViewGroupItem[] pafViewGroupItems) {
		this(name, desc);
		this.pafViewGroupItems = pafViewGroupItems;
	}
	
	/**
	 * @return Returns the desc.
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * @param desc The desc to set.
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * @return Returns the name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name The name to set.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return Returns the pafViewGroupItems.
	 */
	public PafViewGroupItem[] getPafViewGroupItems() {
		return pafViewGroupItems;
	}

	/**
	 * @param pafViewGroupItems The pafViewGroupItems to set.
	 */
	public void setPafViewGroupItems(PafViewGroupItem[] pafViewGroupItems) {
		this.pafViewGroupItems = pafViewGroupItems;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
			
		return super.clone();
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((desc == null) ? 0 : desc.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Arrays.hashCode(pafViewGroupItems);
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
		PafViewGroup other = (PafViewGroup) obj;
		if (desc == null) {
			if (other.desc != null)
				return false;
		} else if (!desc.equals(other.desc))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (!Arrays.equals(pafViewGroupItems, other.pafViewGroupItems))
			return false;
		return true;
	}
	
	
}
