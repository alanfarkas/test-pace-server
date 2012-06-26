/*
 *	File: @(#)PafResponse.java 	Package: com.pace.base.server.comm 	Project: pace-server
 *	Created: Oct 31, 2011  		By: Alan Farkas
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2011 A&M Software, LLC. All rights reserved.
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
package com.pace.server.comm;

import com.pace.base.comm.PafSuccessResponse;

/**
 * Sends back success/failure response
 *
 * @version	x.xx
 * @author Alan Farkas
 *
 */
public class ValidationResponse extends PafSuccessResponse {

	private String[] validationErrors = null;

	/**
	 * @return the validationErrors
	 */
	public String[] getValidationErrors() {
		return validationErrors;
	}

	/**
	 * @param validationErrors the validationErrors to set
	 */
	public void setValidationErrors(String[] validationErrors) {
		this.validationErrors = validationErrors;
	}
}
