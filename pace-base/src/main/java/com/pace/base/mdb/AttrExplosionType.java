/*
 *	File: @(#)AttrExplosionType.java 	Package: com.pace.base.mdb 	Project: pace-base
 *	Created: Dec 18, 2012  				By: Alan Farkas
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2012 Alvarez and Marsal Software, LLC. All rights reserved.
 *
 *	This software is the confidential and proprietary information of A&M Software, LLC.
 *	("Confidential Information"). You shall not disclose such Confidential Information and 
 * 	should use it only in accordance with the terms of the license agreement you entered into
 *	with A&M Software, LLC.
 *
 *
 *
 Date			Author			Version			Changes
 xx/xx/xx		xxxxxxxx		x.xx			..............
 * 
 */
package com.pace.base.mdb;

/**
 * Attribute intersection explosion type
 *
 */
public enum AttrExplosionType {
	floorOnly,				// Just floor members
	allDescendants,			// All descendants
	filteredDescendants		// Only include members whose base member descendants are all included as well
}
