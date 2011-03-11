/*
 *	File: @(#)PafSimpleBaseMember.java 	Package: com.pace.base.mdb 		Project: Essbase Provider
 *	Created: Aug 25, 2005  			By: JWatkins
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
 * 
 */
package com.pace.base.mdb;

/**
 * Simple version of PafBaseMember
 *
 * @version	x.xx
 * @author Alan Farkas
 *
 */
public class PafSimpleBaseMember extends PafSimpleDimMember {
	
    /**
	 * @param key Member name
	 */
	public PafSimpleBaseMember(String key) {
	
		// Set PafBaseMember key
		setKey(key);
	}

	public PafSimpleBaseMember() {
        
    }
    
}
