/*
 *	File: @(#)PafCustomCommandRequest.java 	Package: com.pace.base.server.comm 	Project: PafServer
 *	Created: May 4, 2006  		By: JWatkins
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
 * This class is used to execute a custom menu command. It indicates
 * the id of the menu command selected by the user, and any parameter
 * key/values pairs
 *
 * @version	x.xx
 * @author JWatkins
 *
 */
public class PafCustomCommandRequest extends PafRequest {

    String menuCommandKey;
    String[] parameterValues;
    String[] parameterKeys;
    /**
     * @return Returns the menuCommandId.
     */
    public String getMenuCommandKey() {
        return menuCommandKey;
    }
    /**
     * @param menuCommandKey The menuCommandKey to set.
     */
    public void setMenuCommandKey(String menuCommandKey) {
        this.menuCommandKey = menuCommandKey;
    }
    /**
     * @return Returns the parameterValues.
     */
    public String[] getParameterValues() {
        return parameterValues;
    }
    /**
     * @param parameterValues The parameterValues to set.
     */
    public void setParameterValues(String[] parameterValues) {
        this.parameterValues = parameterValues;
    }
    /**
     * @return Returns the parameterKeys.
     */
    public String[] getParameterKeys() {
        return parameterKeys;
    }
    /**
     * @param parameterKeys The parameterKeys to set.
     */
    public void setParameterKeys(String[] parameterKeys) {
        this.parameterKeys = parameterKeys;
    }
    
    
}
