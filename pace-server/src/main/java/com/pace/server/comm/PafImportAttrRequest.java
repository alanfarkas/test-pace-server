/*
 *	File: @(#)PafImportAttrRequest.java 	Package: com.pace.base.server.comm 	Project: PafServer
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
package com.pace.server.comm;

import com.pace.base.comm.PafRequest;

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class PafImportAttrRequest extends PafRequest {
	
	String[] importDimensions = null;

	/**
	 * @return Returns the importDimensions.
	 */
	public String[] getImportDimensions() {
		return importDimensions;
	}

	/**
	 * @param importDimensions The importDimensions to set.
	 */
	public void setImportDimensions(String[] importDimensions) {
		this.importDimensions = importDimensions;
	}

}
