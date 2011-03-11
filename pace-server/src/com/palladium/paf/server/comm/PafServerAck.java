/*
 *	File: @(#)PafServerAck.java 	Package: com.pace.base.server.comm 	Project: PafServer
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

import com.pace.base.AuthMode;

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author JWatkins
 *
 */
public class PafServerAck {
    
	private String serverVersion;
    private String platform;
    private String clientId;
    private String applicationId;
    private String dataSourceId;
    private boolean serverPasswordResetEnabled;
    private boolean clientPasswordResetEnabled;
    private int minPassowordLength;
    private int maxPassowordLength;
    private AuthMode authMode;
    private boolean clientUpgradeRequired = false;
    private String clientUpgradeUrl;
    
	/**
	 * @return Returns the clientPasswordResetEnabled.
	 */
	public boolean isClientPasswordResetEnabled() {
		return clientPasswordResetEnabled;
	}

	/**
	 * @param clientPasswordResetEnabled The clientPasswordResetEnabled to set.
	 */
	public void setClientPasswordResetEnabled(boolean clientPasswordResetEnabled) {
		this.clientPasswordResetEnabled = clientPasswordResetEnabled;
	}

	/**
	 * @return Returns the serverPasswordResetEnabled.
	 */
	public boolean isServerPasswordResetEnabled() {
		return serverPasswordResetEnabled;
	}

	/**
	 * @param serverPasswordResetEnabled The serverPasswordResetEnabled to set.
	 */
	public void setServerPasswordResetEnabled(boolean serverPasswordResetEnabled) {
		this.serverPasswordResetEnabled = serverPasswordResetEnabled;
	}

	public PafServerAck() {}
    
    public PafServerAck(String clientId, String platform, String serverVersion) {
        super();

        this.clientId = clientId;
        this.platform = platform;
        this.serverVersion = serverVersion;
    }
    
    public PafServerAck(String clientId, String platform, String serverVersion, String applicationId, String dataSourceId) {
    	
    	this(clientId, platform, serverVersion);
    	this.applicationId = applicationId;
    	this.dataSourceId = dataSourceId;
    	
    }
    public String getClientId() {
        return clientId;
    }
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
    public String getPlatform() {
        return platform;
    }
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    public String getServerVersion() {
        return serverVersion;
    }
    public void setServerVersion(String serverVersion) {
        this.serverVersion = serverVersion;
    }

    public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getDataSourceId() {
		return dataSourceId;
	}

	public void setDataSourceId(String dataSourceId) {
		this.dataSourceId = dataSourceId;
	}

	/**
	 * @return Returns the maxPassowordLength.
	 */
	public int getMaxPassowordLength() {
		return maxPassowordLength;
	}

	/**
	 * @param maxPassowordLength The maxPassowordLength to set.
	 */
	public void setMaxPassowordLength(int maxPassowordLength) {
		this.maxPassowordLength = maxPassowordLength;
	}

	/**
	 * @return Returns the minPassowordLength.
	 */
	public int getMinPassowordLength() {
		return minPassowordLength;
	}

	/**
	 * @param minPassowordLength The minPassowordLength to set.
	 */
	public void setMinPassowordLength(int minPassowordLength) {
		this.minPassowordLength = minPassowordLength;
	}

	public boolean isClientUpgradeRequired() {
		return clientUpgradeRequired;
	}

	public void setClientUpgradeRequired(boolean clientUpgradeRequired) {
		this.clientUpgradeRequired = clientUpgradeRequired;
	}

	public String getClientUpgradeUrl() {
		return clientUpgradeUrl;
	}

	public void setClientUpgradeUrl(String clientUpgradeUrl) {
		this.clientUpgradeUrl = clientUpgradeUrl;
	}

	/**
	 * @return the authMode
	 */
	public AuthMode getAuthMode() {
		return authMode;
	}

	/**
	 * @param authMode the authMode to set
	 */
	public void setAuthMode(AuthMode authMode) {
		this.authMode = authMode;
	}


	
}
