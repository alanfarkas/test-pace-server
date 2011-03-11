/*
 *	File: @(#)PafImportAttrResponse.java 	Package: com.pace.base.server.comm 	Project: PafServer
 *	Created: Nov 11, 2006  		By: AFarkas
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
 * Used to send back response information from an attribute import process.
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class PafImportAttrResponse {

	private boolean isSuccess = false;
	
    String[] importErrors = null;

    public PafImportAttrResponse() {}

    /**
     * @return Returns the mdbProps.
     */
    public String[] importErrors() {
        return importErrors;
    }

    /**
     * @param importErrors Import errors
     */
    public void setImportErrors(String[] importErrors) {
        this.importErrors = importErrors;
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
