/*
 *	File: @(#)PafFilteredMbrTagRequest.java 		Package: com.palladium.paf.server.comm 	Project: PafServer
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

import com.palladium.paf.comm.PafRequest;

/**
 * Filtered Member Tag Request
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class PafFilteredMbrTagRequest extends PafRequest {
	
	private PafMbrTagFilter[] memberTagFilters = new PafMbrTagFilter[0];

 	/**
 	 * default constructor
 	 */
 	public PafFilteredMbrTagRequest() {}
 	
 	/**
 	 * @param memberTagFilters Array of application / member tag filters
 	 */
 	public PafFilteredMbrTagRequest(PafMbrTagFilter[] memberTagFilters) {
 		this.memberTagFilters = memberTagFilters;
 	}
 	
	/**
	 * @return the memberTagFilters
	 */
	public PafMbrTagFilter[] getMemberTagFilters() {
		return memberTagFilters;
	}

	/**
	 * @param memberTagFilters the memberTagFilters to set
	 */
	public void setMemberTagFilters(PafMbrTagFilter[] memberTagFilters) {
		this.memberTagFilters = memberTagFilters;
	}
	
}
