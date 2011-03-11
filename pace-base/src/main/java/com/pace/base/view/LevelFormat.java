/*
 *	File: @(#)LevelGenParamUtil.java 	Package: com.pace.base.view 	Project: Paf Base Libraries
 *	Created: Feb 13, 2005  		By: JavaJ
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
public class LevelFormat extends PafFormat {
	
	private Integer level;
	
	/**
	 * Empty Constructor
	 *
	 */
    public LevelFormat() {}
    
    /**
     * Creates a Level Format.  A level format includes a level number and formatName.
     * 
     * @param level
     * @param formatName
     */
	public LevelFormat(Integer level, String formatName)  {
		
		super(formatName);
		this.level = level;		
		
	}

	/**
	 * 
	 * @return level
	 */
	public Integer getLevel() {
		return level;
	}

	/**
	 * Set's level. 
	 * 
	 * @param level
	 */
	public void setLevel(Integer level) {
		this.level = level;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((level == null) ? 0 : level.hashCode());
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
		LevelFormat other = (LevelFormat) obj;
		if (level == null) {
			if (other.level != null)
				return false;
		} else if (!level.equals(other.level))
			return false;
		return true;
	}
	
	

}
