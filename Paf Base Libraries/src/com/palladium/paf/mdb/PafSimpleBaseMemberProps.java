/*
 *	File: @(#)PafSimpleBaseMemberProps.java 	Package: com.palladium.paf.data 	Project: PafServer
 *	Created: Aug 25, 2005  		By: JWatkins
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
 * A simple version of the PafBaseMemberProps object
 *
 * @version	x.xx
 * @author Alan Farkas
 *
 */
public class PafSimpleBaseMemberProps extends PafSimpleDimMemberProps {
	
	private String[] associatedAttrKeys = null;	
	private String[] associatedAttrValues = null;	
	private String memberDescription = null;
	private String memberFormula = null;
	private String lastMemberFormula = null;
	
	private int shareOption;
	public static final int SHARE_OPTION_STORE_DATA = 0; 
	public static final int SHARE_OPTION_NEVER_SHARE = 1; 
	public static final int SHARE_OPTION_LABEL_ONLY = 2; 
	public static final int SHARE_OPTION_SHARED_MEMBER = 3; 
	public static final int SHARE_OPTION_DYNAMIC_CALC_AND_STORE = 4; 
	public static final int SHARE_OPTION_DYNAMIC_CALC = 5; 
	
	private String[] UDAs = null;
	
	
	/**
	 * @return the associatedAttrKeys
	 */
	public String[] getAssociatedAttrKeys() {
		return associatedAttrKeys;
	}
	/**
	 * @param associatedAttrKeys the associatedAttrKeys to set
	 */
	public void setAssociatedAttrKeys(String[] associatedAttrKeys) {
		this.associatedAttrKeys = associatedAttrKeys;
	}

	/**
	 * @return the associatedAttrValues
	 */
	public String[] getAssociatedAttrValues() {
		return associatedAttrValues;
	}
	/**
	 * @param associatedAttrValues the associatedAttrValues to set
	 */
	public void setAssociatedAttrValues(String[] associatedAttrValues) {
		this.associatedAttrValues = associatedAttrValues;
	}
	
	/**
	 * Return the member description
	 *
	 * @return Returns the member description
	 */
	public String getDescription() {

		String description = null;
		
		if (memberDescription != null) {
			description = memberDescription;
		} else {
			description =  "";
		}
		return description;
	}
	/**
	 * Set the member description
	 *
	 * @param description The member description to set
	 */
	public void setDescription(String description) {
		this.memberDescription = description;
	}
	
	/**
	 * Return the member formula
	 *
	 * @return Returns the member formula.
	 */
	public String getFormula() {

		String formula = null;
		
		if (memberFormula != null) {
			formula = memberFormula;
		} else {
			formula = "";
		}
		return formula;
	}
	/**
	 * Set the member formula
	 *
	 * @param formula The member formula to set
	 */
	public void setFormula(String formula) {
		this.memberFormula = formula;
	}
	
	/**
	 * Return the last member formula
	 *
	 * @return Returns the last member formula
	 */
	public String getLastFormula() {
		
		String formula = null;
		
		if (lastMemberFormula != null) {
			formula = lastMemberFormula;
		} else {
			formula = "";
		}
		return formula;
	}
	/**
	 *	Set the last member formula
	 *
	 * @param lastFormula The last member formula used to evaluate this member
	 */
	public void setLastFormula(String lastFormula) {
		this.lastMemberFormula = lastFormula;
	}
	
	/**
	 * Return the member share option
	 *
	 * @return Returns the member share option
	 */
	public int getShareOption() {
		return shareOption;
	}
	/**
	 * Set the member share option
	 *
	 * @param shareOption The member share option to set
	 */	
	public void setShareOption(int shareOption) {
		this.shareOption = shareOption;
	}
	
	/**
	 * Return the member UDAs
	 *
	 * @return Returns the member UDAs.
	 */
	public String[] getUDAs() {
		return UDAs;
	}
	/**
	 * Set the member UDAs
	 *
	 * @param uDAs The member UDAs to set.
	 */
	public void setUDAs(String[] uDAs) {
		this.UDAs = uDAs;
	}
	
}
