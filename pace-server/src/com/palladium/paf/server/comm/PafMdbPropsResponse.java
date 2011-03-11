/*
 *	File: @(#)PafMdbPropsResponse.java 	Package: com.pace.base.server.comm 	Project: PafServer
 *	Created: Nov 28, 2006  		By: AFarkas
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

import com.pace.base.mdb.PafMdbProps;

/**
 * Used to send back response information from a MDB properties request.
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class PafMdbPropsResponse {

	private boolean isSuccess = false;
	
	PafMdbProps mdbProps = null;
	
	public PafMdbPropsResponse() {}
	
	/**
	 * @param mdbProps The mdbProps to set.
	 */
	public void setMdbProps(PafMdbProps mdbProps) {
		this.mdbProps = mdbProps;
	}
	
	/**
	 * @return Returns the mdbProps.
	 */
	public PafMdbProps getMdbProps() {
		return mdbProps;
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
