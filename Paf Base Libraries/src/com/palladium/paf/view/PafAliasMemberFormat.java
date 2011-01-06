/*
 *	File: @(#)PafALIASMemberFormat.java 	Package: com.palladium.paf.view 	Project: Paf Base Libraries
 *	Created: Jun 20, 2007  		By: jmilliron
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
package com.palladium.paf.view;

/**
 * The alias member format.
 *
 * @author jmilliron
 * @version	1.00
 */
public class PafAliasMemberFormat implements Cloneable {

	//Display alias name only
	public static final int ALIAS_ONLY = 2;

	//Display alias name then member name
	public static final int ALIAS_MEMBER = 4;

	//Display member name then alias name
	public static final int MEMBER_ALIAS = 8;

	//Display member name only
	public static final int MEMBER_ONLY = 16;
	
	public static final String ALIAS_ONLY_STR = "Alias";

	public static final String ALIAS_MEMBER_STR = "Alias - Member";

	public static final String MEMBER_ALIAS_STR = "Member - Alias";

	public static final String MEMBER_ONLY_STR = "Member";
	
	//alias member format
	private int aliasMemberFormat;
		
	/**
	 * Used only for webservices purposes
	 *
	 */
	public PafAliasMemberFormat() {
	
	}
	
	/**
	 * 
	 * @param aliasMemberFormat the alias member format
	 */
	public PafAliasMemberFormat(int aliasMemberFormat) {
		this.aliasMemberFormat = aliasMemberFormat;
	}
	
	/**
	 * 
	 * Checks to see if the format passed in is a valid format
	 *
	 * @param format format to validate
	 * @return	true if format is valid.
	 */
	private boolean isFormat(int format) {
		
		return ((aliasMemberFormat & format) > 0 )? true : false;
	}

	/**
	 * @return the aliasMemberFormat
	 */
	public int getAliasMemberFormat() {
		return aliasMemberFormat;
	}

	/**
	 * @param aliasMemberFormat the aliasMemberFormat to set
	 */
	public void setAliasMemberFormat(int aliasMemberFormat) {
		this.aliasMemberFormat = aliasMemberFormat;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
		
	}
	
	/** 
	 * Checks to see if alias member format is only an alias.
	 *
	 * @return true/false if alias member format is an alias only.
	 */
	public boolean isAliasOnly() {
		return isFormat(ALIAS_ONLY);
	}
	
	/** 
	 * Checks to see if alias member format is only an member.
	 *
	 * @return true/false if alias member format is an member only.
	 */
	public boolean isMemberOnly() {
		return isFormat(MEMBER_ONLY);
	}
	
	/** 
	 * Checks to see if alias member format is an alias then member.
	 *
	 * @return true/false if alias member format is an alias then member.
	 */
	public boolean isAliasMember() {
		return isFormat(ALIAS_MEMBER);
	}
	
	/** 
	 * Checks to see if alias member format is a member then alias.
	 *
	 * @return true/false if alias member format is a member then alias.
	 */
	public boolean isMemberAlias() {
		return isFormat(MEMBER_ALIAS);
	}
	
	/**
	 * 
	 * Gets the alias member format int from teh alias member format name.
	 *
	 * @param aliasMemberFormatName Name used to get alias format name
	 * @return the alias member format value
	 */
	public static int getAliasMemberFormatFromStr(String aliasMemberFormatName) {
		
		//if null, throw exception
		if ( aliasMemberFormatName == null ) {
			throw new IllegalArgumentException("Alias Member Format Name can not be null.");
		}
				
		if ( aliasMemberFormatName.equals(ALIAS_ONLY_STR)) {
			return ALIAS_ONLY;
		} else if ( aliasMemberFormatName.equals(ALIAS_MEMBER_STR)) {
			return ALIAS_MEMBER;
		} else if ( aliasMemberFormatName.equals(MEMBER_ALIAS_STR)) {
			return MEMBER_ALIAS;
		} else if ( aliasMemberFormatName.equals(MEMBER_ONLY_STR)) {
			return	MEMBER_ONLY;
		} else {
			
			//not found..throw exception
			throw new IllegalArgumentException("Invalid Alias Member Format Name.");
		}		
		
	}
	
	/**
	 * 
	 * Returns the alias member format names
	 *
	 * @return alias member format names
	 */
	public static String[] getAliasMemberFormatNames() {
		return new String[] { ALIAS_ONLY_STR, ALIAS_MEMBER_STR, MEMBER_ALIAS_STR, MEMBER_ONLY_STR };
	}
}
