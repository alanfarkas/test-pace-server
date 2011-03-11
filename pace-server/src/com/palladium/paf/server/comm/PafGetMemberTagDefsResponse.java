/*
 *	File: @(#)PafGetMemberTagDefsResponse.java 		Package: com.pace.base.server.comm 	Project: PafServer
 *	Created: Nov 30, 2007  			By: AFarkas
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
package com.palladium.paf.server.comm;

import com.pace.base.db.membertags.MemberTagDef;

/**
 * Sends back an array of member tag definitions
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class PafGetMemberTagDefsResponse {
	
	private MemberTagDef[] memberTagDefs;

	public PafGetMemberTagDefsResponse(){}
	
	/**
	 * @return the memberTagDefs
	 */
	public MemberTagDef[] getMemberTagDefs() {
		return memberTagDefs;
	}

	/**
	 * @param memberTagDefs the memberTagDefs to set
	 */
	public void setMemberTagDefs(MemberTagDef[] memberTagDefs) {
		this.memberTagDefs = memberTagDefs;
	}

}
