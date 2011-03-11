/*
 *	File: @(#)PafImportMemberTagRequest.java 	Package: com.pace.base.server.comm 	Project: PafServer
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
package com.palladium.paf.server.comm;

import com.pace.base.comm.PafRequest;
import com.pace.base.db.membertags.SimpleMemberTagData;

/**
 * Defines the collection of member tags to be imported 
 *
 * @version	x.xx
 * @author Alan
 *
 */
public class PafImportMemberTagRequest extends PafRequest {
	
	private SimpleMemberTagData[] memberTagData;

	/**
	 * @return the memberTagData
	 */
	public SimpleMemberTagData[] getMemberTagData() {
		return memberTagData;
	}

	/**
	 * @param memberTagData the memberTagData to set
	 */
	public void setMemberTagData(SimpleMemberTagData[] memberTagData) {
		this.memberTagData = memberTagData;
	}
}
