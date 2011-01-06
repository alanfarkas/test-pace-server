/*
 *	File: @(#)ExcelProjectDataErrorException.java 	Package: com.palladium.paf.project 	Project: Paf Base Libraries
 *	Created: Jan 7, 2010  		By: jmilliron
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
package com.palladium.paf.project;

/**
 * Class_description_goes_here
 *
 * @author jmilliron
 * @version	x.xx
 *
 */
public class ExcelProjectDataErrorException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7202820804798604650L;
	
	
	private ProjectDataError excelProjectDataError;
	
	public ExcelProjectDataErrorException(ProjectDataError excelProjectDataError) {
		this.excelProjectDataError = excelProjectDataError;
	}

	/**
	 * @return the excelProjectDataError
	 */
	public ProjectDataError getProjectDataError() {
		return excelProjectDataError;
	}
	
}
