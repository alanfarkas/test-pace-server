/*
 *	File: @(#)PafSimpleUow.java 	Package: com.pace.base.data 	Project: Paf Base Libraries
 *	Created: Sep 2, 2005  			By: JWatkins
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
 *	05/24/06		AFarkas			x.xx			Moved from com.pace.base.data (PafServer)
 * 
 */
package com.pace.base.data;

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author jim
 *
 */
public class PafSimpleUow {
	private PafMemberList pafMemberEntries[];

	public PafMemberList[] getPafMemberEntries() {
		return pafMemberEntries;
	}

	public void setPafMemberEntries(PafMemberList[] pafMemberEntries) {
		this.pafMemberEntries = pafMemberEntries;
	}
}
