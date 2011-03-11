/*
 *	File: @(#)PafViewTreeItem.java 	Package: com.pace.base.comm 	Project: Paf Base Libraries
 *	Created: Apr 28, 2006  		By: jmilliron
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
package com.pace.base.comm;

import java.util.ArrayList;
import java.util.List;

import com.pace.base.app.AliasMapping;
import com.pace.base.app.SuppressZeroSettings;
import com.pace.base.view.PafUserSelection;

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author jmilliron
 *
 */
public class PafViewTreeItem implements Cloneable {
	
	private String label = "";

	private String desc = "";

	private boolean group;

	private PafUserSelection[] userSelections;

	private PafViewTreeItem[] items;
	
	private AliasMapping[] aliasMappings;
	
	private SuppressZeroSettings[] suppressZeroSettings;

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
	 * @return Returns the group.
	 */
	public boolean isGroup() {
		return group;
	}

	/**
	 * @param group The group to set.
	 */
	public void setGroup(boolean group) {
		this.group = group;
	}

	/**
	 * @return Returns the items.
	 */
	public PafViewTreeItem[] getItems() {
		return items;
	}

	/**
	 * @param items The items to set.
	 */
	public void setItems(PafViewTreeItem[] items) {
		this.items = items;
	}

	/**
	 * @return Returns the label.
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param label The label to set.
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * @return Returns the userSelections.
	 */
	public PafUserSelection[] getUserSelections() {
		return userSelections;
	}

	/**
	 * @param userSelections The userSelections to set.
	 */
	public void setUserSelections(PafUserSelection[] userSelections) {
		this.userSelections = userSelections;
	}

	/**
	 * @return Returns a string.
	 */
	public String toString() {
		
		StringBuffer strBuff = new StringBuffer();
		
		strBuff.append("View: " + label + "\n");
		strBuff.append("Desc: " + desc + "\n");
		strBuff.append("Group: " + group + "\n");
		
		if ( items != null ) {
			for ( PafViewTreeItem item : items ) {
				strBuff.append("\t" + item);
			}
		}
		
		return strBuff.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		PafViewTreeItem clonedObject = null;
		
		clonedObject = (PafViewTreeItem) super.clone(); 
		
		if ( this.items != null && this.items.length > 0 ) {
			
			List<PafViewTreeItem> itemList = new ArrayList<PafViewTreeItem>();
			
			for (PafViewTreeItem item : this.items) {
				
				itemList.add((PafViewTreeItem) item.clone());
				
			}			
			
			clonedObject.setItems(itemList.toArray(new PafViewTreeItem[0]));
			
		}
		
		return clonedObject;
	}

	/**
	 * @return the aliasMappings
	 */
	public AliasMapping[] getAliasMappings() {
		return aliasMappings;
	}

	/**
	 * @param aliasMappings the aliasMappings to set
	 */
	public void setAliasMappings(AliasMapping[] aliasMappings) {
		this.aliasMappings = aliasMappings;
	}

	public void setSuppressZeroSettings(SuppressZeroSettings[] suppressZeroSettings) {
		this.suppressZeroSettings = suppressZeroSettings;
	}

	public SuppressZeroSettings[] getSuppressZeroSettings() {
		return suppressZeroSettings;
	}

	


}
