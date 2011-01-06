/*
 *	File: @(#)PafClientSecurityPasswordResetResponse.java 	Package: com.palladium.paf.server 	Project: PafServer
 *	Created: Dec 11, 2006  		By: jmilliron
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
package com.palladium.paf.server.comm;

/**
 * Returned after a password has been reset.
 *
 * @author jmilliron
 * @version	x.xx
 *
 */
public class PafClientSecurityPasswordResetResponse {

	private boolean successful;
	
	private String userName;
	
	private String userEmailAddress;
			
	private boolean invalidUserName;
	
	private boolean invalidEmailAddress;

	/**
	 * @return Returns the successful.
	 */
	public boolean isSuccessful() {
		return successful;
	}

	/**
	 * @param successful The successful to set.
	 */
	public void setSuccessful(boolean successful) {
		this.successful = successful;
	}

	/**
	 * @return Returns the userEmailAddress.
	 */
	public String getUserEmailAddress() {
		return userEmailAddress;
	}

	/**
	 * @param userEmailAddress The userEmailAddress to set.
	 */
	public void setUserEmailAddress(String userEmailAddress) {
		this.userEmailAddress = userEmailAddress;
	}

	/**
	 * @return Returns the userName.
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName The userName to set.
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return Returns the invalidEmailAddress.
	 */
	public boolean isInvalidEmailAddress() {
		return invalidEmailAddress;
	}

	/**
	 * @param invalidEmailAddress The invalidEmailAddress to set.
	 */
	public void setInvalidEmailAddress(boolean invalidEmailAddress) {
		this.invalidEmailAddress = invalidEmailAddress;
	}

	/**
	 * @return Returns the invalidUserName.
	 */
	public boolean isInvalidUserName() {
		return invalidUserName;
	}

	/**
	 * @param invalidUserName The invalidUserName to set.
	 */
	public void setInvalidUserName(boolean invalidUserName) {
		this.invalidUserName = invalidUserName;
	}
	
	
	
}
