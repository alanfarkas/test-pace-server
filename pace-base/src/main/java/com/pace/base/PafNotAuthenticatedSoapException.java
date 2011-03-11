/*
 *  File: @(#)PafNotAuthenticatedSoapException.java   Package: com.pace.base   Project: Paf Base Libraries
 *  Created: Nov 29, 2006        By: javaj
 *  Version: 1.00
 *
 *  Copyright (c) 2005-2006 Palladium Group, Inc. All rights reserved.
 *
 *  This software is the confidential and proprietary information of Palladium Group, Inc.
 *  ("Confidential Information"). You shall not disclose such Confidential Information and 
 *  should use it only in accordance with the terms of the license agreement you entered into
 *  with Palladium Group, Inc.
 *
 *
 *
 Date            Author          Version         Changes
 xx/xx/xx        xxxxxxxx        x.xx            ..............
 * 
 */
package com.pace.base;

/**
 * 
 * Thrown when a user is not authorized.
 * 
 * @author javaj
 * @version 1.0
 * 
 */
public class PafNotAuthenticatedSoapException extends Exception { //PafSoapException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6608741350330176780L;

	/**
	 * Constructor. 
	 */
	public PafNotAuthenticatedSoapException() {
	}
	
	/**
	 * Constructor.  A PafException is used to create this exception
	 * 
	 * @param exception
	 */
	public PafNotAuthenticatedSoapException(PafException exception) {
		super(exception);
	}

}
