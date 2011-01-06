/*
 *	File: @(#)PafUpdateDatacacheRequest.java 	Package: com.palladium.paf.server.comm 		Project: PafServer
 *	Created: August 13, 2009  					By: AFarkas
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2009 Palladium Group, Inc. All rights reserved.
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
 * Update datacache request
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class PafUpdateDatacacheRequest extends PafRequest {

    private String[] versionFilter;
	private String viewName;

	/**
	 * @param versionFilter the versionFilter to set
	 */
	public void setVersionFilter(String[] versionFilter) {
		this.versionFilter = versionFilter;
	}

	/**
	 * @return the versionFilter
	 */
	public String[] getVersionFilter() {
		return versionFilter;
	}
    
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
