/*
 *	File: @(#)MemberTagType.java 		Package: com.palladium.paf.db.membertags 	Project: Paf Base Libraries
 *	Created: Nov 29, 2007  				By: AFarkas
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

/**
 * Member tag type
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public enum MemberTagType {
	
	TEXT {public String getCode() {return "TX";}}, 
	FORMULA {public String getCode() {return "FO";}},
	HYPERLINK {public String getCode() {return "HY";}};

	/**
	 *	Return corresponding text mnemonic 
	 */
	public abstract String getCode();
	
	
	/**
	 *  Decode member tag type code
	 *
	 * @param code Member tag type code 
	 * @return MemberTagType
	 */
	static public MemberTagType deCode(String code) {
		for (MemberTagType tagType:MemberTagType.values()) {
			if (tagType.getCode().equalsIgnoreCase(code)) {
				return tagType;
			}
		}
		
		// Invalid code
		String errMsg = "Unable to decode invalid MemberTagType code of: " + code;
		throw new IllegalArgumentException(errMsg);
	}

}
