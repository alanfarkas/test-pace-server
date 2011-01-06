/*
 *	File: @(#)PafClientInit.java 	Package: com.palladium.paf.comm 	Project: Paf Base Libraries
 *	Created: Aug 25, 2005  			By: JWatkins
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
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author JWatkins
 *
 */
public class ClientInitRequest {
    String ipAddress;
    String clientType;
    String clientVersion;
    String clientLanguage;
    
    public String getClientType() {
        return clientType;
    }
    public void setClientType(String clientType) {
        this.clientType = clientType;
    }
    public String getClientVersion() {
        return clientVersion;
    }
    public void setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
    }
    public String getIpAddress() {
        return ipAddress;
    }
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    
    public String toString() {
        return "Client Address: " + ipAddress + "\nClient Type: " + clientType + "\nClient Version: " + clientVersion;
    }
    /**
     * @return Returns the clientLanguage.
     */
    public String getClientLanguage() {
        return clientLanguage;
    }
    /**
     * @param clientLanguage The clientLanguage to set.
     */
    public void setClientLanguage(String clientLanguage) {
        this.clientLanguage = clientLanguage;
    }

}
