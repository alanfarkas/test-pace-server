/*
 *	File: @(#)PafViewRequest.java 	Package: com.palladium.paf.server.comm 	Project: PafServer
 *	Created: Feb 13, 2006  		By: JWatkins
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

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author JWatkins
 *
 */
public class PafViewRequest extends PafRequest {
    private String viewName;

    /**
     * @return Returns the viewName.
     */
    public String getViewName() {
        return viewName;
    }

    /**
     * @param viewName The viewName to set.
     */
    public void setViewName(String viewName) {
        this.viewName = viewName;
    }
    
    
}
