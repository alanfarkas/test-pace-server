/*
 *	File: @(#)PafPlanSessionRequest.java 	Package: com.palladium.paf.server.comm 	Project: PafServer
 *	Created: Nov 2, 2005  		By: JWatkins
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
public class PafPlanSessionRequest extends PafRequest {
    private String selectedRole = null;
    private String seasonId = null;
    private boolean isInvalidIntersectionSuppressionSelected = false;
    private boolean isCompressResponse = false;

    /**
     * @return Returns the selectedRole.
     */
    public String getSelectedRole() {
        return selectedRole;
    }

    /**
     * @param selectedRole The selectedRole to set.
     */
    public void setSelectedRole(String selectedRole) {
        this.selectedRole = selectedRole;
    }

    /**
     * @return Returns the seasonId.
     */
    public String getSeasonId() {
        return seasonId;
    }

    /**
     * @param seasonId The seasonId to set.
     */
    public void setSeasonId(String seasonId) {
        this.seasonId = seasonId;
    }

    public void setIsInvalidIntersectionSuppressionSelected(boolean isInvalidIntersectionSuppressionSelected) {
		this.isInvalidIntersectionSuppressionSelected = isInvalidIntersectionSuppressionSelected;
	}
    /**
     * @return Returns whether or not Invalid Intersection Suppression is selected.
     */
	public boolean getIsInvalidIntersectionSuppressionSelected() {
		return isInvalidIntersectionSuppressionSelected;
	}

	public boolean isCompressResponse() {
		return isCompressResponse;
	}

	public void setCompressResponse(boolean isCompressResponse) {
		this.isCompressResponse = isCompressResponse;
	}
}
