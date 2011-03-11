/*
 *	File: @(#)PafClearImportedAttrResponse.java 	Package: com.pace.base.server.comm 	Project: PafServer
 *	Created: Dec 14, 2006  		By: kmoos
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
 * Used to send back response information from an clear attribute import process.
 *
 * @version	x.xx
 * @author kmoos
 *
 */

public class PafClearImportedAttrResponse {
	
	private boolean isSuccess = false;
	
    String[] errors = null;

    public PafClearImportedAttrResponse() {}

    /**
     * @return Returns the errors.
     */
    public String[] Errors() {
        return errors;
    }

    /**
     * @param errors errors
     */
    public void setErrors(String[] errors) {
        this.errors = errors;
    }

	/**
	 * @return Returns the isSuccess.
	 */
	public boolean isSuccess() {
		return isSuccess;
	}

	/**
	 * @param isSuccess The isSuccess to set.
	 */
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
}
