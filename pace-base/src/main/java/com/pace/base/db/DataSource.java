/*
 *	File: @(#)DataSource.java 	Package: com.pace.base.db 	Project: Paf Base Libraries
 *	Created: Jul 18, 2007  		By: jmilliron
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
package com.pace.base.db;

/**
 * Class_description_goes_here
 *
 * @author jmilliron
 * @version	1.00
 *
 */
public class DataSource {

	private int id = -1;
	
	private String name;

	/**
	 * 
	 *
	 */
	public DataSource() {
		
	}
	
	/**
	 * 
	 * @param name
	 */
	public DataSource(String name) {
		this.name = name;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
