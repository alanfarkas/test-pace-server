/*
 *	File: @(#)SimpleMemberTagCoordSet.java 		Package: com.pace.base.db.membertags 	Project: Paf Base Libraries
 *	Created: Feb 7, 2008  			By: AFarkas
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
package com.pace.base.db.membertags;

import com.pace.base.comm.SimpleCoordList;

/**
 * Defines a set of member tag coordinates suitable for the soap layer
 *
 * @version	1.00
 * @author AFarkas
 *
 */
public class SimpleMemberTagCoordSet {

	private MemberTagId memberTagId;
	private SimpleCoordList simpleCoordList;

/**
 * Default constructor
 */
public SimpleMemberTagCoordSet() {}

/**
 * @param memberTagId Member tag id
 * @param simpleCoordList Member tag intersection coordinates
 */
public SimpleMemberTagCoordSet(MemberTagId memberTagId, SimpleCoordList simpleCoordList) {
	
	this.memberTagId = memberTagId;
	this.simpleCoordList = simpleCoordList;
}


/**
 * @return the memberTagId
 */
public MemberTagId getMemberTagId() {
	return memberTagId;
}

/**
 * @param memberTagId the memberTagId to set
 */
public void setMemberTagId(MemberTagId memberTagId) {
	this.memberTagId = memberTagId;
}

/**
 * @return the simpleCoordList
 */
public SimpleCoordList getSimpleCoordList() {
	return simpleCoordList;
}

/**
 * @param simpleCoordList the simpleCoordList to set
 */
public void setSimpleCoordList(SimpleCoordList simpleCoordList) {
	this.simpleCoordList = simpleCoordList;
}
	

}
