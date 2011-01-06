/*
 *	File: @(#)PafFormat.java 	Package: com.palladium.paf.view 	Project: Paf Base Libraries
 *	Created: Feb 20, 2007  		By: jmilliron
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2006 Palladium Group, Inc. All rights reserved.
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
package com.palladium.paf.view;

/**
 * Paf format.
 *
 * @author jmilliron
 * @version	1.00
 *
 */
public class PafFormat {

	//format name
	private String formatName;

	/**
	 * Creates instance of PafFormat
	 *
	 */
	public PafFormat() {		
	}
	
	/**
	 * Creates a PafFormat
	 * 
	 * @param formatName
	 */
	public PafFormat(String formatName) {
		this.formatName = formatName;
	}
	
	/**
	 * 
	 * @return format name
	 */
	public String getFormatName() {
		return formatName;
	}

	/**
	 * Set's a format name.
	 * 
	 * @param formatName set the format name
	 */
	public void setFormatName(String formatName) {
		this.formatName = formatName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((formatName == null) ? 0 : formatName.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PafFormat other = (PafFormat) obj;
		if (formatName == null) {
			if (other.formatName != null)
				return false;
		} else if (!formatName.equals(other.formatName))
			return false;
		return true;
	}

	
}
