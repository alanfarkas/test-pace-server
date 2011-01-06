/*
 *	File: @(#)PafAuthResponse.java 	Package: com.palladium.paf.server.comm 	Project: PafServer
 *	Created: Oct 13, 2005  		By: JWatkins
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

import com.palladium.paf.PafSecurityToken;
import com.palladium.paf.app.PafPlannerRole;
import com.palladium.paf.app.PafWorkSpec;
import com.palladium.paf.app.AppSettings;
import com.palladium.paf.comm.PafPlannerConfig;

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author JWatkins
 *
 */
public class PafAuthResponse {
	
    private PafSecurityToken securityToken;
    private PafWorkSpec workSpec;
    private PafPlannerRole[] plannerRoles;
    private PafPlannerConfig[] plannerConfigs;
    private AppSettings appSettings;
    private AttributeDimInfo[] attrDimInfo;

    //db admin flag
    private boolean admin;
    
    //change password
    private boolean changePassword;

    /**
     * @return Returns the securityToken.
     */
    public PafSecurityToken getSecurityToken() {
        return securityToken;
    }
    /**
     * @param securityToken The securityToken to set.
     */
    public void setSecurityToken(PafSecurityToken securityToken) {
        this.securityToken = securityToken;
    }
    /**
     * @return Returns the workSpec.
     */
    public PafWorkSpec getWorkSpec() {
        return workSpec;
    }
    /**
     * @param workSpec The workSpec to set.
     */
    public void setWorkSpec(PafWorkSpec workSpec) {
        this.workSpec = workSpec;
    }
    /**
     * @return Returns the plannerRoles.
     */
    public PafPlannerRole[] getPlannerRoles() {
        return plannerRoles;
    }
    /**
     * @param plannerRoles The plannerRoles to set.
     */
    public void setPlannerRoles(PafPlannerRole[] plannerRoles) {
        this.plannerRoles = plannerRoles;
    }
	/**
	 * @return the admin
	 */
	public boolean getAdmin() {
		return admin;
	}
	/**
	 * @param admin the admin to set
	 */
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	/**
	 * @return Returns the changePassword.
	 */
	public boolean getChangePassword() {
		return changePassword;
	}
	/**
	 * @param changePassword The changePassword to set.
	 */
	public void setChangePassword(boolean changePassword) {
		this.changePassword = changePassword;
	}
	/**
	 * @return an array of PafPlannerConfigs available to the user.
	 */
	public PafPlannerConfig[] getPlannerConfigs() {
		return this.plannerConfigs;
	}
	/**
	 * @param an array of role names available to the user.
	 */
	public void setPlannerConfigs(PafPlannerConfig[] plannerConfigs){
		this.plannerConfigs = plannerConfigs;
	}
	/**
	 * @return The application specific settings.
	 */
	public AppSettings getAppSettings(){
		return this.appSettings;
	}
	
	/**
	 * @param The application specific settings.
	 */
	public void setAppSettings(AppSettings appSettings){
		this.appSettings = appSettings;
	}
	/**
	 * @return the attrDimInfo
	 */
	public AttributeDimInfo[] getAttrDimInfo() {
		return attrDimInfo;
	}
	/**
	 * @param attrDimInfo the attrDimInfo to set
	 */
	public void setAttrDimInfo(AttributeDimInfo[] attrDimInfo) {
		this.attrDimInfo = attrDimInfo;
	}
	
}
