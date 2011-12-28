/*
 *	File: @(#)ServerSettings.java 	Package: com.pace.base.server 	Project: PafServer
 *	Created: Oct 24, 2005  		By: JWatkins
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
package com.pace.base.server;

import java.io.File;

import com.pace.base.AuthMode;
import com.pace.base.PafBaseConstants;

/**
 * Server Settings
 *
 * @version	x.xx
 * @author JWatkins
 *
 */
public class ServerSettings {
	
    private boolean debugMode = false;
    private boolean evaluationStepLogging = false;
    private boolean changedCellLogging = false;    
    private boolean clearOutlineCache = false;
    private boolean autoLoadAttributes = false;
    private String pafSecurityUser;
    private String pafSecurityPassword;
    private String pafSecurityBootupPassword;
    private String calcScriptTimeout;
    private Boolean enableServerPasswordReset;
    private Boolean enableClientPasswordReset;
    private String smtpMailHost;
    private String smtpUserEmailAccount;
    private Integer minPasswordLength;
    private Integer maxPasswordLength; 
    private boolean autoConvertProject;
    private boolean enableRounding;
    private boolean clearCellNotes;
    private boolean clearAllCellNotes;
    private transient PafLDAPSettings ldapSettings = new PafLDAPSettings();
    private String authMode = AuthMode.nativeMode.toString();
    private String clientUpdateUrl;
    private String clientMinVersion;
    
    
    private String pafServerHome = ".." + File.separator + ".." + File.separator;
          
    /**
     * @return Returns the clearOutlineCache.
     */
    public boolean isClearOutlineCache() {
        return clearOutlineCache;
    }
    /**
     * @param clearOutlineCache The clearOutlineCache to set.
     */
    public void setClearOutlineCache(boolean clearOutlineCache) {
        this.clearOutlineCache = clearOutlineCache;
    }
    /**
     * @return Returns the debugMode.
     */
    public boolean isDebugMode() {
        return debugMode;
    }
    /**
     * @param debugMode The debugMode to set.
     */
    public void setDebugMode(boolean debugMode) {
        this.debugMode = debugMode;
    }
    /**
     * @return Returns the pafServerHome.
     */
    public String getPafServerHome() {
//        return System.getenv(PafServerConstants.SERVER_HOME_ENV);
//    	  return "C:\\Program Files\\Palladium\\PafServer\\";
        return pafServerHome;
    }

	public boolean isEvaluationStepLogging() {
		return evaluationStepLogging;
	}
	public void setEvaluationStepLogging(boolean evaluationStepLogging) {
		this.evaluationStepLogging = evaluationStepLogging;
	}
	public String getPafSecurityBootupPassword() {
		return pafSecurityBootupPassword;
	}
	public void setPafSecurityBootupPassword(String pafSecurityBootupPassword) {
		this.pafSecurityBootupPassword = pafSecurityBootupPassword;
	}
	public String getPafSecurityPassword() {
		return pafSecurityPassword;
	}
	public void setPafSecurityPassword(String pafSecurityPassword) {
		this.pafSecurityPassword = pafSecurityPassword;
	}
	public String getPafSecurityUser() {
		return pafSecurityUser;
	}
	public void setPafSecurityUser(String pafSecurityUser) {
		this.pafSecurityUser = pafSecurityUser;
	}
    /**
     * @return Returns the calcScriptTimeout.
     */
    public String getCalcScriptTimeout() {
        return calcScriptTimeout;
    }
    /**
     * @param calcScriptTimeout The calcScriptTimeout to set.
     */
    public void setCalcScriptTimeout(String calcScriptTimeout) {
        this.calcScriptTimeout = calcScriptTimeout;
    }
    /**
     * @return Returns the changedCellLogging.
     */
    public boolean isChangedCellLogging() {
        return changedCellLogging;
    }
    /**
     * @param changedCellLogging The changedCellLogging to set.
     */
    public void setChangedCellLogging(boolean changedCellLogging) {
        this.changedCellLogging = changedCellLogging;
    }
	/**
	 * @return the smtpMailHost
	 */
	public String getSmtpMailHost() {
		return smtpMailHost;
	}
	/**
	 * @param smtpMailHost the smtpMailHost to set
	 */
	public void setSmtpMailHost(String smtpMailHost) {
		this.smtpMailHost = smtpMailHost;
	}
	/**
	 * @return the smtpUserEmailAccount
	 */
	public String getSmtpUserEmailAccount() {
		return smtpUserEmailAccount;
	}
	/**
	 * @param smtpUserEmailAccount the smtpUserEmailAccount to set
	 */
	public void setSmtpUserEmailAccount(String smtpUserEmailAccount) {
		this.smtpUserEmailAccount = smtpUserEmailAccount;
	}
	/**
	 * @return Returns the enableClientPasswordReset.
	 */
	public Boolean getEnableClientPasswordReset() {
		return enableClientPasswordReset;
	}
	/**
	 * @param enableClientPasswordReset The enableClientPasswordReset to set.
	 */
	public void setEnableClientPasswordReset(Boolean enableClientPasswordReset) {
		this.enableClientPasswordReset = enableClientPasswordReset;
	}
	/**
	 * @return Returns the enableServerPasswordReset.
	 */
	public Boolean getEnableServerPasswordReset() {
		return enableServerPasswordReset;
	}
	/**
	 * @param enableServerPasswordReset The enableServerPasswordReset to set.
	 */
	public void setEnableServerPasswordReset(Boolean enableServerPasswordReset) {
		this.enableServerPasswordReset = enableServerPasswordReset;
	}
	/**
	 * @return Returns the maxPasswordLength.
	 */
	public Integer getMaxPasswordLength() {
				
		//if max pass is null or greater than the max size of db field, set to default
		if ( maxPasswordLength == null || maxPasswordLength > PafBaseConstants.DATABASE_PASSWORD_MAX_LENGTH) {
		
			return PafBaseConstants.DEFAULT_PASSWORD_MAX_LENGTH;
			
		}		
		
		return maxPasswordLength;
	}
	/**
	 * @param maxPasswordLength The maxPasswordLength to set.
	 */
	public void setMaxPasswordLength(Integer maxPasswordLength) {
		this.maxPasswordLength = maxPasswordLength;
	}
	/**
	 * @return Returns the minPasswordLength.
	 */
	public Integer getMinPasswordLength() {
		
		//if null or less than 0, set default
		if ( minPasswordLength == null || minPasswordLength < 0 ) {
			
			return PafBaseConstants.DEFAULT_PASSWORD_MIN_LENGTH;
			
		}	
		
		return minPasswordLength;
	}
	/**
	 * @param minPasswordLength The minPasswordLength to set.
	 */
	public void setMinPasswordLength(Integer minPasswordLength) {
		this.minPasswordLength = minPasswordLength;
	}
	public String getPathToServerConfDir() {
		return pafServerHome + File.separator + PafBaseConstants.DN_ConfFldr + File.separator;
	}

    /**
     * @param pafServerHome the pafServerHome to set
     */
    public void setPafServerHome(String pafServerHome) {
        this.pafServerHome = pafServerHome;
    }
	/**
	 * @return Returns the autoConvertProject.
	 */
	public boolean isAutoConvertProject() {
		return autoConvertProject;
	}
	/**
	 * @param autoConvertProject The autoConvertProject to set.
	 */
	public void setAutoConvertProject(boolean autoConvertProject) {
		this.autoConvertProject = autoConvertProject;
	}
public void setEnableRounding(boolean enableRounding) {
		this.enableRounding = enableRounding;
	}
	public boolean isEnableRounding() {
		return enableRounding;
	}
	//	/**
//	 * @return Returns the enableRounding.
//	 */
//	public boolean isEnableRounding() {
//		return enableRounding;
//	}
//	/**
//	 * @param enableRounding The enableRounding to set.
//	 */
//	public void setEnableRounding(boolean enableRounding) {
//		this.enableRounding = enableRounding;
//	}
	public boolean isAutoLoadAttributes() {
		return autoLoadAttributes;
	}
	public void setAutoLoadAttributes(boolean autoLoadAttributes) {
		this.autoLoadAttributes = autoLoadAttributes;
	}
	/**
	 * @return the clearAllCellNotes
	 */
	public boolean isClearAllCellNotes() {
		return clearAllCellNotes;
	}
	/**
	 * @return the clearCellNotes
	 */
	public boolean isClearCellNotes() {
		return clearCellNotes;
	}
	/**
	 * @param clearAllCellNotes the clearAllCellNotes to set
	 */
	public void setClearAllCellNotes(boolean clearAllCellNotes) {
		this.clearAllCellNotes = clearAllCellNotes;
	}
	/**
	 * @param clearCellNotes the clearCellNotes to set
	 */
	public void setClearCellNotes(boolean clearCellNotes) {
		this.clearCellNotes = clearCellNotes;
	}
	
	public PafLDAPSettings getLdapSettings() {
		return ldapSettings;
	}
	public void setLdapSettings(PafLDAPSettings ldapSettings) {
		this.ldapSettings = ldapSettings;
	}
	
	public void setAuthMode(String authMode) {
		
		if(authMode.equalsIgnoreCase(AuthMode.mixedMode.toString()) || 
			authMode.equalsIgnoreCase(AuthMode.nativeMode.toString())){
			this.authMode = authMode;
		}
		else{
			this.authMode = AuthMode.nativeMode.toString();
		}
		
	}
	
	public String getAuthMode() {
		return authMode;
	}
	
	
	public AuthMode getAuthModeAsEnum() {
		
		AuthMode authModeEnum = PafBaseConstants.DEFAULT_AUTH_MODE;
		
		if ( authMode != null) {
			
			if(authMode.equalsIgnoreCase(AuthMode.nativeMode.toString())){
				authModeEnum = AuthMode.nativeMode;
			}else if(authMode.equalsIgnoreCase(AuthMode.mixedMode.toString())){
				authModeEnum = AuthMode.mixedMode;
			}	
		}
		
		return authModeEnum;
	}
	
	public String getClientUpdateUrl() {
		return clientUpdateUrl;
	}
	public void setClientUpdateUrl(String clientUpdateUrl) {
		this.clientUpdateUrl = clientUpdateUrl;
	}
	public String getClientMinVersion() {
		return clientMinVersion;
	}
	public void setClientMinVersion(String clientMinVersion) {
		this.clientMinVersion = clientMinVersion;
	}

	  	
}
