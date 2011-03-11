/*
 *	File: @(#)CustomCommandResult.java 	Package: com.pace.base 	Project: Paf Base Libraries
 *	Created: May 1, 2006  		By: JWatkins
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
package com.pace.base;

/**
 * Holds the results of the execution of a custom command.
 *
 * @version	x.xx
 * @author JWatkins
 *
 */
public class CustomCommandResult {
    String returnMessage;

    /**
     * @return Returns the returnMessage.
     */
    public String getReturnMessage() {
        return returnMessage;
    }

    /**
     * @param returnMessage The returnMessage to set.
     */
    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }

}
