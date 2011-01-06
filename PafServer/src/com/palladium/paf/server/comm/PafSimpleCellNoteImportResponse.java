/*
 *	File: @(#)PafSimpleCellNoteImportResponse.java 	Package: com.palladium.paf.server.comm 	Project: PafServer
 *	Created: Aug 24, 2007  		By: jmilliron
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

/**
 * Import Simple Cell Notes Response 
 *
 * @version	x.xx
 * @author jmilliron
 *
 */
public class PafSimpleCellNoteImportResponse {

	boolean success = false;

	/**
	 * @return the success
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * @param success the success to set
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}
	
}
