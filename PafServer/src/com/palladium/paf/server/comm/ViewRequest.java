/*
 *	File: @(#)ViewRequest.java 	Package: com.palladium.paf.server.comm 	Project: PafServer
 *	Created: Sep 13, 2005  		By: JWatkins
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
import com.palladium.paf.view.PafUserSelection;
import com.palladium.paf.comm.IPafViewRequest;


/**
 * Holds paramters necessary for retrieving a view request
 *
 * @version	x.xx
 * @author JWatkins
 *
 */
public class ViewRequest extends PafRequest implements IPafViewRequest{
    private String viewName;
    private PafUserSelection[] userSelections;
    private boolean isCompressResponse = false;
    private boolean rowsSuppressed;
    private boolean columnsSuppressed;

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    /**
     * @return Returns the userSelections.
     */
    public PafUserSelection[] getUserSelections() {
        return userSelections;
    }

    /**
     * @param userSelections The userSelections to set.
     */
    public void setUserSelections(PafUserSelection[] userSelections) {
        this.userSelections = userSelections;
    }
    
	public boolean isCompressResponse() {
		return isCompressResponse;
	}

	public void setCompressResponse(boolean isCompressResponse) {
		this.isCompressResponse = isCompressResponse;
	}

	public void setRowsSuppressed(boolean rowsSuppressed) {
		this.rowsSuppressed = rowsSuppressed;
	}

	public boolean getRowsSuppressed() {
		return rowsSuppressed;
	}

	public void setColumnsSuppressed(boolean columnsSuppressed) {
		this.columnsSuppressed = columnsSuppressed;
	}

	public boolean getColumnsSuppressed() {
		return columnsSuppressed;
	}
}
