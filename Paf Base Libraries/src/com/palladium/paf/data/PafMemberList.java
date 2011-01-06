/*
 *	File: @(#)PafMemberList.java 	Package: com.palladium.paf.data 	Project: Paf Base Laptops
 *	Created: Sep 2, 2005  		By: jim
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
 *	05/24/06		AFarkas			x.xx			Moved from com.palladium.paf.data (PafServer)
 * 
 */
package com.palladium.paf.data;

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author jim
 *
 */
public class PafMemberList {
	String dimName;
	String memberNames[];
	public String getDimName() {
		return dimName;
	}
	public void setDimName(String dimName) {
		this.dimName = dimName;
	}
    public String[] getMemberNames() {
        return memberNames;
    }
    public void setMemberNames(String[] memberNames) {
        this.memberNames = memberNames;
    }

}
