/*
 *	File: @(#)PafGetMemberTagInfoResponse.java 	Package: com.pace.base.server.comm 	Project: PafServer
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
package com.pace.server.comm;

import com.pace.base.db.membertags.MemberTagInformation;

/**
 * Sends back member tag counts
 *
 * @version	x.xx
 * @author Alan
 *
 */
public class PafGetMemberTagInfoResponse {
	
	private int totalMemberTagCount;
	private MemberTagInformation[] memberTagInformation;
	
	public PafGetMemberTagInfoResponse() {}
	
	/**
	 * @param totalMemberTagCount Total member tag intersection count
	 * @param memberTagInformation Member tag information by application
	 */
	public PafGetMemberTagInfoResponse(int totalMemberTagCount, MemberTagInformation[] memberTagInformation) {
		
		this.totalMemberTagCount = totalMemberTagCount;
		this.memberTagInformation = memberTagInformation;
	}

	/**
	 * @return the memberTagInformation
	 */
	public MemberTagInformation[] getMemberTagInfo() {
		return memberTagInformation;
	}
	/**
	 * @param memberTagInformation the memberTagInformation to set
	 */
	public void setMemberTagInfo(MemberTagInformation[] memberTagInfo) {
		this.memberTagInformation = memberTagInfo;
	}
	/**
	 * @return the totalCount
	 */
	public int getTotalMemberTagCount() {
		return totalMemberTagCount;
	}
	/**
	 * @param totalCount the totalCount to set
	 */
	public void setTotalMemberTagCount(int totalCount) {
		this.totalMemberTagCount = totalCount;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object o) {
		
		int appCount = 0;
		MemberTagInformation[] mtInfoArray1 = null, mtInfoArray2 = null;

		// Check if comparison object is valid
		if (o == null)
			return false;
		if (!(o instanceof PafGetMemberTagInfoResponse))
			return false;

		PafGetMemberTagInfoResponse response = (PafGetMemberTagInfoResponse) o;

		// Compare total member tag count
		if (this.getTotalMemberTagCount() != response.getTotalMemberTagCount()) {
			return false;
		}

		// Compare app count
		mtInfoArray1 = this.getMemberTagInfo();
		mtInfoArray2 = response.getMemberTagInfo();
		if (mtInfoArray1.length == mtInfoArray2.length) {
			appCount = mtInfoArray1.length;
		} else {
			return false;
		}

		// Compare each app's member tag information
		for (int appInx = 0; appInx < appCount; appInx++) {		
			if (!mtInfoArray1[appInx].equals(mtInfoArray2[appInx])) {
				return false;
			}	
		}
		
		return true;
	}

}
