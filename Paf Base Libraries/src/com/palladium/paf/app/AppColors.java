/*
 *	File: @(#)AppColors.java 	Package: com.palladium.paf.app 	Project: Paf Base Libraries
 *	Created: Jun 19, 2007  		By: jmilliron
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
package com.palladium.paf.app;

import com.palladium.paf.PafBaseConstants;

/**
 * Application colors
 *
 * @version	1.00
 * @author javaj
 *
 */
public class AppColors {

	private String nonPlannableProtectedColor;
	private String forwardPlannableProtectedColor;
	private String protectedColor;
	private String systemLockColor;
	private String userLockColor;
	private String noteColor;
	
	/**
	 * Constructor for App Colors.  Sets up the default colors.
	 *
	 */
	public AppColors() {
		
		initColors();
	}
	
	/**
	 * 
	 * Initilizes the default colors
	 *
	 */
	public void initColors() {

		this.nonPlannableProtectedColor = PafBaseConstants.COLOR_PROTECTED_NON_PLANNABLE;
		this.forwardPlannableProtectedColor = PafBaseConstants.COLOR_PROTECTED_FORWARD_PLANNABLE;
		this.protectedColor = PafBaseConstants.COLOR_PROTECTED;
		this.systemLockColor = PafBaseConstants.COLOR_SYSTEM_LOCK;
		this.userLockColor = PafBaseConstants.COLOR_USER_LOCK;
		this.noteColor = PafBaseConstants.COLOR_NOTE;
		
	}

	/**
	 * @return the forwardPlannableProtectedColor
	 */
	public String getForwardPlannableProtectedColor() {
		return forwardPlannableProtectedColor;
	}
	/**
	 * @param forwardPlannableProtectedColor the forwardPlannableProtectedColor to set
	 */
	public void setForwardPlannableProtectedColor(
			String forwardPlannableProtectedColor) {
		this.forwardPlannableProtectedColor = forwardPlannableProtectedColor;
	}
	/**
	 * @return the nonPlannableProtectedColor
	 */
	public String getNonPlannableProtectedColor() {
		return nonPlannableProtectedColor;
	}
	/**
	 * @param nonPlannableProtectedColor the nonPlannableProtectedColor to set
	 */
	public void setNonPlannableProtectedColor(String nonPlannableProtectedColor) {
		this.nonPlannableProtectedColor = nonPlannableProtectedColor;
	}
	/**
	 * @return the protectedColor
	 */
	public String getProtectedColor() {
		return protectedColor;
	}
	/**
	 * @param protectedColor the protectedColor to set
	 */
	public void setProtectedColor(String protectedColor) {
		this.protectedColor = protectedColor;
	}
	/**
	 * @return the systemLockColor
	 */
	public String getSystemLockColor() {
		return systemLockColor;
	}
	/**
	 * @param systemLockColor the systemLockColor to set
	 */
	public void setSystemLockColor(String systemLockColor) {
		this.systemLockColor = systemLockColor;
	}
	/**
	 * @return the userLockColor
	 */
	public String getUserLockColor() {
		return userLockColor;
	}
	/**
	 * @param userLockColor the userLockColor to set
	 */
	public void setUserLockColor(String userLockColor) {
		this.userLockColor = userLockColor;
	}

	/**
	 * @return the noteColor
	 */
	public String getNoteColor() {
		return noteColor;
	}

	/**
	 * @param noteColor the noteColor to set
	 */
	public void setNoteColor(String noteColor) {
		this.noteColor = noteColor;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((forwardPlannableProtectedColor == null) ? 0
						: forwardPlannableProtectedColor.hashCode());
		result = prime
				* result
				+ ((nonPlannableProtectedColor == null) ? 0
						: nonPlannableProtectedColor.hashCode());
		result = prime * result
				+ ((noteColor == null) ? 0 : noteColor.hashCode());
		result = prime * result
				+ ((protectedColor == null) ? 0 : protectedColor.hashCode());
		result = prime * result
				+ ((systemLockColor == null) ? 0 : systemLockColor.hashCode());
		result = prime * result
				+ ((userLockColor == null) ? 0 : userLockColor.hashCode());
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
		AppColors other = (AppColors) obj;
		if (forwardPlannableProtectedColor == null) {
			if (other.forwardPlannableProtectedColor != null)
				return false;
		} else if (!forwardPlannableProtectedColor
				.equals(other.forwardPlannableProtectedColor))
			return false;
		if (nonPlannableProtectedColor == null) {
			if (other.nonPlannableProtectedColor != null)
				return false;
		} else if (!nonPlannableProtectedColor
				.equals(other.nonPlannableProtectedColor))
			return false;
		if (noteColor == null) {
			if (other.noteColor != null)
				return false;
		} else if (!noteColor.equals(other.noteColor))
			return false;
		if (protectedColor == null) {
			if (other.protectedColor != null)
				return false;
		} else if (!protectedColor.equals(other.protectedColor))
			return false;
		if (systemLockColor == null) {
			if (other.systemLockColor != null)
				return false;
		} else if (!systemLockColor.equals(other.systemLockColor))
			return false;
		if (userLockColor == null) {
			if (other.userLockColor != null)
				return false;
		} else if (!userLockColor.equals(other.userLockColor))
			return false;
		return true;
	}
	
	
}
