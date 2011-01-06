/*
 *	File: @(#)PafSimpleDimMember.java 		Package: com.palladium.paf.mdb 	Project: Paf Base Libraries
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
package com.palladium.paf.mdb;

/**
 * Simple version of PafDimMember
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class PafSimpleDimMember {

	private String key;
	private String parentKey = null;
	private String[] childKeys = null;
	private PafSimpleDimMemberProps pafSimpleDimMemberProps = null;


	/**
	 *	Return the PafSimpleDimMember key (member name)
	 *
	 * @return the PafSimpleDimMember key (member name)
	 */
	public String getKey() {
		return key;
	}
	/**
	 *	Set the PafSimpleDimMember key (member name)
	 *
	 * @param key The PafSimpleDimMember key (member name)
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 *	Return the PafSimpleDimMember parent key (member name)
	 *
	 * @return the PafSimpleDimMember parent key (member name)
	 */
	public String getParentKey() {
		return parentKey;
	}
	/**
	 *	Set the PafSimpleDimMember parent key (member name)
	 *
	 * @param parentKey The PafSimpleDimMember parent key (member name)
	 */
	public void setParentKey(String parentKey) {
		this.parentKey = parentKey;
	}

	/**
	 *	Return the array of PafSimpleDimMember child keys 
	 *
	 * @return Returns the of PafSimpleDimMember child keys
	 */
	public String[] getChildKeys() {

		String[] keys = null;

		// If no childKeys are found, return empty array of members
		if (childKeys == null) {
			keys = new String[0];
		} else {
			// Else, return pointer to childKeys
			keys = childKeys;
		}
		return keys;
	}
	/**
	 *	Set the array of PafSimpleDimMember child keys
	 *
	 * @param childKeys The array of PafSimpleDimMember child keys to set
	 */
	public void setChildKeys(String[] childKeys) {
		this.childKeys = childKeys;
	}
	/**
	 * @return the pafSimpleDimMemberProps
	 */
	public PafSimpleDimMemberProps getPafSimpleDimMemberProps() {
		return pafSimpleDimMemberProps;
	}
	/**
	 * @param pafSimpleDimMemberProps the pafSimpleDimMemberProps to set
	 */
	public void setPafSimpleDimMemberProps(
			PafSimpleDimMemberProps pafSimpleDimMemberProps) {
		this.pafSimpleDimMemberProps = pafSimpleDimMemberProps;
	}

    /*
     *	Return the member key
     *
     * @see java.lang.Object#toString()
     */
    public String toString() {
    	return key;
     }
    
}
