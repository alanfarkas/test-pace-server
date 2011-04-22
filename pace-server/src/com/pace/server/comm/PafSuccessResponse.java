/*
 *	File: @(#)PafResponse.java 	Package: com.pace.base.server.comm 	Project: PafServer
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
package com.pace.server.comm;

/**
 * Sends back success/failure response
 *
 * @version	x.xx
 * @author Alan
 *
 */
public class PafSuccessResponse {

	private boolean isSuccess = false;
	

	/**
	 * @param Default constructor
	 */
	public PafSuccessResponse() {}
	
	/**
	 * @param isSuccess
	 */
	public PafSuccessResponse(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	
	/**
	 * @return the isSuccess
	 */
	public boolean isSuccess() {
		return isSuccess;
	}
	/**
	 * @param isSuccess the isSuccess to set
	 */
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
}
