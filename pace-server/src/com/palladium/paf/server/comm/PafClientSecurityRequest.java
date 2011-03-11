/*
 *	File: @(#)PafClientSecurityRequest.java 	Package: com.pace.base.server.comm 	Project: PafServer
 *	Created: Nov 2, 2006  		By: jmilliron
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

import com.pace.base.app.PafUserDef;
import com.pace.base.comm.PafRequest;

/**
 * Class_description_goes_here
 *
 * @author jmilliron
 *
 */
public class PafClientSecurityRequest extends PafRequest {

	private PafUserDef pafUserDef;

	public PafUserDef getPafUserDef() {
		return pafUserDef;
	}

	public void setPafUserDef(PafUserDef pafUserDef) {
		this.pafUserDef = pafUserDef;
	}
	
}
