/*
 *	File: @(#)MemberTagInformation.java 	Package: com.palladium.paf.db.membertags 	Project: Paf Base Libraries
 *	Created: Dec 3, 2007  		By: Alan
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
 * Member Tag Information
 *
 * @version	1.00
 * @author afarkas
 *
 */
public class MemberTagInformation {
	
	private String appName;
	private int appMemberTagCount;
	private String[] memberTagNames;
	private int[] memberTagCounts;
	
	public MemberTagInformation(){}
	
	/**
	 * @param appName Application name
	 */
	public MemberTagInformation(String appName) {

		this.appName = appName;
	}

	/**
	 * @param appName Application name
	 * @param appMemberTagCount Application member tag count
	 */
	public MemberTagInformation(String appName, int appMemberTagCount){
		
		this.appName = appName;
		this.appMemberTagCount = appMemberTagCount;
	}
	
	/**
	 * @param appName Application name
	 * @param appMemberTagCount Application member tag count
	 * @param memberTagNames Member tag names
	 * @param memberTagCounts Member tag counts
	 */
	public MemberTagInformation(String appName, int appMemberTagCount, String[] memberTagNames, int[] memberTagCounts) {

		this.appName = appName;
		this.appMemberTagCount = appMemberTagCount;
		this.memberTagNames = memberTagNames;
		this.memberTagCounts = memberTagCounts;
	}

	/**
	 * @return the appName
	 */
	public String getAppName() {
		return appName;
	}
	/**
	 * @param appName the appName to set
	 */
	public void setAppName(String appId) {
		this.appName = appId;
	}
	/**
	 * @return the appMemberTagCount
	 */
	public int getAppMemberTagCount() {
		return appMemberTagCount;
	}
	/**
	 * @param appMemberTagCount the appMemberTagCount to set
	 */
	public void setAppMemberTagCount(int appMemberTagCount) {
		this.appMemberTagCount = appMemberTagCount;
	}
	/**
	 * @return the memberTagCounts
	 */
	public int[] getMemberTagCounts() {
		return memberTagCounts;
	}
	/**
	 * @param memberTagCount the memberTagCounts to set
	 */
	public void setMemberTagCounts(int[] memberTagCounts) {
		this.memberTagCounts = memberTagCounts;
	}
	/**
	 * @return the memberTagNames
	 */
	public String[] getMemberTagNames() {
		return memberTagNames;
	}
	/**
	 * @param memberTagName the memberTagNames to set
	 */
	public void setMemberTagNames(String[] memberTagNames) {
		this.memberTagNames = memberTagNames;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object o) {
		
		// Check if comparison object is valid
		if (o == null)
			return false;
		if (!(o instanceof MemberTagInformation))
			return false;

		MemberTagInformation mtInfo = (MemberTagInformation) o;
				
		// Compare app name
		if (!this.getAppName().equals(mtInfo.getAppName())) {
			return false;
		}

		// Compare app member tag count
		if (this.getAppMemberTagCount() != mtInfo.getAppMemberTagCount()) {
			return false;
		}
		
		// Compare member tag names
		if (!Arrays.deepEquals(this.getMemberTagNames(), mtInfo.getMemberTagNames())) {
			return false;
		}

		// Compare member tag counts
		if (!Arrays.equals(this.getMemberTagCounts(), mtInfo.getMemberTagCounts())) {
			return false;
		}


		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		int hash = 17;
		
		if (appName != null) {
			hash = 37 * hash + appName.hashCode();
		}
		
		hash = 37 * hash + appMemberTagCount;
		
		if (memberTagNames != null) {
			for (int i = 0; i < memberTagNames.length; i++) {
				hash = 37 * hash + memberTagNames[i].hashCode();				
			}
		}
		
		if (memberTagCounts != null) {
			for (int i = 0; i < memberTagCounts.length; i++) {
				hash = 37 * hash + memberTagCounts[i];				
			}
		}
		
		return hash;
	}

}
