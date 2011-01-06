/*
 *	File: @(#)PafRequest.java 	Package: com.palladium.paf.comm 	Project: Paf Base Libraries
 *	Created: Sep 6, 2005  		By: JWatkins
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
 *	05/24/06		AFarkas			x.xx			Moved from com.palladium.paf.server.comm (PafServer)
 * 
 */
package com.palladium.paf.comm;

/**
 * Base class for holding information common to all client requests
 *
 * @version	x.xx
 * @author JWatkins
 *
 */
public class PafRequest {
    private String clientId;
    private String sessionToken;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

}
