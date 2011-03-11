/*
 *	File: @(#)GenFormat.java 	Package: com.pace.base.view 	Project: Paf Base Libraries
 *	Created: Feb 16, 2006  		By: JavaJ
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
package com.pace.base.view;

/**
 * 
 * Used for Generation Formatting.
 * 
 * @author JavaJ
 * 
 */
public class GenFormat extends PafFormat {

	private Integer generation;

	/**
	 * Empty Constructor
	 * 
	 */
	public GenFormat() {
	}

	/**
	 * Creates a Level Format. A level format includes a level number and
	 * formatName.
	 * 
	 * @param level
	 * @param formatName
	 */
	public GenFormat(Integer generation, String formatName) {

		super(formatName);
		this.generation = generation;		

	}

	/**
	 * @return the generation
	 */
	public Integer getGeneration() {
		return generation;
	}

	/**
	 * @param generation
	 *            the generation to set
	 */
	public void setGeneration(Integer generation) {
		this.generation = generation;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((generation == null) ? 0 : generation.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		GenFormat other = (GenFormat) obj;
		if (generation == null) {
			if (other.generation != null)
				return false;
		} else if (!generation.equals(other.generation))
			return false;
		return true;
	}
	
}
