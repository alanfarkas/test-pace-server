/*
 *	File: @(#)InvalidPaceProjectException.java 	Package: com.pace.base.project 	Project: Paf Base Libraries
 *	Created: Jul 30, 2009  		By: jmilliron
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
package com.pace.base.project;

/**
 * Class_description_goes_here
 *
 * @author jmilliron
 * @version	x.xx
 *
 */
public class InvalidPaceProjectInputException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8227573616451259486L;

	public InvalidPaceProjectInputException(String errorMessage) {

		super(errorMessage);
		
	}

}
