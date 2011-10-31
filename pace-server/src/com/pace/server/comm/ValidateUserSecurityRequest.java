/*
 *	File: @(#)ValidateUserSecurityRequest.java 		Package: com.pace.base.server.comm 		Project: pace-server
 *	Created: 10/31/2011  							By: AFarkas
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2011 A&M Software, LLC. All rights reserved.
 *
 *	This software is the confidential and proprietary information of Palladium Group, Inc.
 *	("Confidential Information"). You shall not disclose such Confidential Information and 
 * 	should use it only in accordance with the terms of the license agreement you entered into
 *	with A&M Software, LLC.
 *
 *
 *
	Date			Author			Version			Changes
	xx/xx/xx		xxxxxxxx		x.xx			..............
 * 
 */
package com.pace.server.comm;

import com.pace.base.app.PafDimSpec;
import com.pace.base.comm.PafRequest;

/**
 * Essbase Server Request
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class ValidateUserSecurityRequest extends PafRequest {
	
	private PafDimSpec[] securitySpecs = null;

	/**
	 * @return the securitySpecs
	 */
	public PafDimSpec[] getSecuritySpecs() {
		return securitySpecs;
	}

	/**
	 * @param securitySpecs the securitySpecs to set
	 */
	public void setSecuritySpecs(PafDimSpec[] securitySpecs) {
		this.securitySpecs = securitySpecs;
	}


}
