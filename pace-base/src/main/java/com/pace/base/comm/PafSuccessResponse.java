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
package com.pace.base.comm;

import java.util.ArrayList;
import java.util.List;


/**
 * Sends back success/failure response
 *
 * @version	x.xx
 * @author Alan
 *
 */
public class PafSuccessResponse extends PafResponse {

	private boolean isSuccess = false;
	private List<Exception> exceptionList = new ArrayList<Exception>();
	

	public List<Exception> getExceptionList() {
		return exceptionList;
	}

	public void addException(Exception e) {
		this.exceptionList.add(e);
	}
	
	public void clearExceptions() {
		this.exceptionList.clear();
	}

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
