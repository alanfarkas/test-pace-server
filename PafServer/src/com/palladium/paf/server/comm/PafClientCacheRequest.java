/*
 *	File: @(#)ClientCacheRequest.java 	Package: com.palladium.paf.server.comm 	Project: PafServer
 *	Created: Aug 25, 2005  		By: JWatkins
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

import com.palladium.paf.comm.PafRequest;
import com.palladium.paf.data.PafSimpleUow;




/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author JWatkins
 *
 */
public class PafClientCacheRequest extends PafRequest {

	PafSimpleUow pafSimpleUow;

	public PafSimpleUow getPafSimpleUow() {
		return pafSimpleUow;
	}

	public void setPafSimpleUow(PafSimpleUow pafSimpleUow) {
		this.pafSimpleUow = pafSimpleUow;
	}
}
