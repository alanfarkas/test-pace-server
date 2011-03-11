/*
 *	File: @(#)CustomMenuDef.java 	Package: com.pace.base.comm 	Project: Paf Base Libraries
 *	Created: Apr 28, 2006  		By: jmilliron
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
package com.pace.base.comm;

import java.util.Arrays;

import com.pace.base.app.CustomActionDef;

/**
 * Custom Menu Def is the java beans used to populate the menu groups on the front end
 * 
 * @version x.xx
 * @author jmilliron
 * 
 */
public class CustomMenuDef {

	private String key;
	private String caption;
	private Integer faceID;
	private boolean beginGroup;
	private boolean enableButton;

	private CustomActionDef[] customActionDefs;
    
	private String[] userPrompts;
	private boolean autoSaveUow;	
	private boolean autoRefreshUow;
	private String[] autoRefreshVersionFilter;
	private String confirmationMessage;
	private String terminationMessage;
	private String[] viewFilter;
	

	/**
	 * @return Returns the beginGroup.
	 */
	public boolean isBeginGroup() {
		return beginGroup;
	}

	/**
	 * @param beginGroup
	 *            The beginGroup to set.
	 */
	public void setBeginGroup(boolean beginGroup) {
		this.beginGroup = beginGroup;
	}

	/**
	 * @return Returns the caption.
	 */
	public String getCaption() {
		return caption;
	}

	/**
	 * @param caption
	 *            The caption to set.
	 */
	public void setCaption(String caption) {
		this.caption = caption;
	}

	/**
	 * @return Returns the enableButton.
	 */
	public boolean isEnableButton() {
		return enableButton;
	}

	/**
	 * @param enableButton
	 *            The enableButton to set.
	 */
	public void setEnableButton(boolean enableButton) {
		this.enableButton = enableButton;
	}

	/**
	 * @return Returns the faceID.
	 */
	public Integer getFaceID() {
		return faceID;
	}

	/**
	 * @param faceID
	 *            The faceID to set.
	 */
	public void setFaceID(Integer faceID) {
		this.faceID = faceID;
	}

	/**
	 * @return Returns the key.
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param key
	 *            The key to set.
	 */
	public void setKey(String key) {
		this.key = key;
	}
	
	/**
	 * @return Returns the userPrompts.
	 */
	public String[] getUserPrompts() {
		return userPrompts;
	}

	/**
	 * @param userPrompts
	 *            The userPrompts to set.
	 */
	public void setUserPrompts(String[] userPrompts) {
		this.userPrompts = userPrompts;
	}

	/**
	 * @return Returns the confirmationMessage.
	 */
	public String getConfirmationMessage() {
		return confirmationMessage;
	}

	/**
	 * @param confirmationMessage The confirmationMessage to set.
	 */
	public void setConfirmationMessage(String confirmationMessage) {
		this.confirmationMessage = confirmationMessage;
	}

	/**
	 * @return Returns the terminationMessage.
	 */
	public String getTerminationMessage() {
		return terminationMessage;
	}

	/**
	 * @param terminationMessage The terminationMessage to set.
	 */
	public void setTerminationMessage(String terminationMessage) {
		this.terminationMessage = terminationMessage;
	}

	/**
	 * @return Returns the viewFilter.
	 */
	public String[] getViewFilter() {
		return viewFilter;
	}

	/**
	 * @param viewFilter The viewFilter to set.
	 */
	public void setViewFilter(String[] viewFilter) {
		this.viewFilter = viewFilter;
	}

    /**
     * @return Returns the customActionDefs.
     */
    public CustomActionDef[] getCustomActionDefs() {
        return customActionDefs;
    }

    /**
     * @param customActionDefs The customActionDefs to set.
     */
    public void setCustomActionDefs(CustomActionDef[] customActionDefs) {
        this.customActionDefs = customActionDefs;
    }

	public boolean isAutoRefreshUow() {
		return autoRefreshUow;
	}

	public void setAutoRefreshUow(boolean autoRefreshUow) {
		this.autoRefreshUow = autoRefreshUow;
	}

	/**
	 * @return the autoRefreshVersionFilter
	 */
	public String[] getAutoRefreshVersionFilter() {
		return autoRefreshVersionFilter;
	}

	/**
	 * @param autoRefreshVersionFilter the autoRefreshVersionFilter to set
	 */
	public void setAutoRefreshVersionFilter(String[] autoRefreshVersionFilter) {
		this.autoRefreshVersionFilter = autoRefreshVersionFilter;
	}

	public boolean isAutoSaveUow() {
		return autoSaveUow;
	}

	public void setAutoSaveUow(boolean autoSaveUow) {
		this.autoSaveUow = autoSaveUow;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (autoRefreshUow ? 1231 : 1237);
		result = prime * result + (autoSaveUow ? 1231 : 1237);
		result = prime * result + (beginGroup ? 1231 : 1237);
		result = prime * result + ((caption == null) ? 0 : caption.hashCode());
		result = prime
				* result
				+ ((confirmationMessage == null) ? 0 : confirmationMessage
						.hashCode());
		result = prime * result + Arrays.hashCode(customActionDefs);
		result = prime * result + (enableButton ? 1231 : 1237);
		result = prime * result + ((faceID == null) ? 0 : faceID.hashCode());
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime
				* result
				+ ((terminationMessage == null) ? 0 : terminationMessage
						.hashCode());
		result = prime * result + Arrays.hashCode(userPrompts);
		result = prime * result + Arrays.hashCode(viewFilter);
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomMenuDef other = (CustomMenuDef) obj;
		if (autoRefreshUow != other.autoRefreshUow)
			return false;
		if (autoSaveUow != other.autoSaveUow)
			return false;
		if (beginGroup != other.beginGroup)
			return false;
		if (caption == null) {
			if (other.caption != null)
				return false;
		} else if (!caption.equals(other.caption))
			return false;
		if (confirmationMessage == null) {
			if (other.confirmationMessage != null)
				return false;
		} else if (!confirmationMessage.equals(other.confirmationMessage))
			return false;
		if (!Arrays.equals(customActionDefs, other.customActionDefs))
			return false;
		if (enableButton != other.enableButton)
			return false;
		if (faceID == null) {
			if (other.faceID != null)
				return false;
		} else if (!faceID.equals(other.faceID))
			return false;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		if (terminationMessage == null) {
			if (other.terminationMessage != null)
				return false;
		} else if (!terminationMessage.equals(other.terminationMessage))
			return false;
		if (!Arrays.equals(userPrompts, other.userPrompts))
			return false;
		if (!Arrays.equals(viewFilter, other.viewFilter))
			return false;
		return true;
	}

	

}
