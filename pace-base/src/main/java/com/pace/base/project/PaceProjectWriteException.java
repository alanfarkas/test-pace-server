/*
 *	File: @(#)PaceProjectWriteException.java 	Package: com.pace.base.project 	Project: Paf Base Libraries
 *	Created: Jan 18, 2010  		By: jmilliron
 *	Version: 1.00
 *
 * 	Copyright (c) 2005-2010 Palladium Group, Inc. All rights reserved.
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
 * Thrown when can not write to a pace project
 *
 * @author jmilliron
 * @version	1.00
 *
 */
public class PaceProjectWriteException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6783319632740855461L;
	
	boolean isFatel = false;
	
	/**
	 * @param message
	 */
	public PaceProjectWriteException(String message) {
		this(message, false);
	}
	
	/**
	 * @param message
	 */
	public PaceProjectWriteException(String message, boolean isFatel) {
		super(message);
		this.isFatel = isFatel;
	}
	
	/**
	 * @return the isFatel
	 */
	public boolean isFatel() {
		return isFatel;
	}
	
	
	
}
