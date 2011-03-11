/*
 *	File: @(#)Dimension.java 	Package: com.pace.base.db 	Project: Paf Base Libraries
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
 * Dimension which contains name, id and if dimension is enabled.
 *
 * @version	x.xx
 * @author jmilliron
 *
 */
public class Dimension {

	private int id = -1;
	
	private String name;
	
	private boolean enabled = false;
	
	/**
	 * Default constructor
	 *
	 */
	public Dimension() {
		
	}
	
	/**
	 * 
	 * Overloaded constructor
	 * 
	 * @param name Name of dimension
	 */
	public Dimension(String name) {
		this.name = name;
	}

	/**
	 * 
	 * Overloaded constructor
	 * 
	 * @param name Name of dimension
	 * @param isEnabled If dimension is enabled or not for queries
	 */
	public Dimension(String name, boolean isEnabled) {
		
		this.name = name;
		this.enabled = isEnabled;
		
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

	/**
	 * @return the enabled
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * @param enabled the enabled to set
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
}
