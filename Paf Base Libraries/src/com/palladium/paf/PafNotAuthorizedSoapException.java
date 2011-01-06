/*
 *  File: @(#)PafNotAuthorizedSoapException.java   Package: com.palladium.paf   Project: Paf Base Libraries
 *  Created: Nov 28, 2006        By: javaj
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
package com.palladium.paf;

/**
 * 
 * Thrown when a user is not authorized.
 * 
 * @author javaj
 * @version 1.0
 * 
 */
public class PafNotAuthorizedSoapException extends Exception { //PafSoapException {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8662882229607628383L;

	/**
	 * Constructor. 
	 */
	public PafNotAuthorizedSoapException() {
	}
	
	/**
	 * Constructor.  A PafException is used to create this exception
	 * 
	 * @param exception
	 */
	public PafNotAuthorizedSoapException(PafException exception) {
		super(exception);
	}

}
