/*
 *  File: ApplicationStateResponse.java  Package: com.pace.base.comm  Project: pace-base
 *  Created: Oct 7, 2011     By: ${missing_property:author}
 *
 *  Copyright (c) 2011 Alvarez & Marsal Software, LLC. All rights reserved.
 *
 *  This software is the confidential and proprietary information of Alvarez & Marsal Software, LLC.
 *  ("Confidential Information"). You shall not disclose such Confidential Information and 
 *  should use it only in accordance with the terms of the license agreement you entered into
 *  with Alvarez & Marsal Software, LLC.
 * 
 */
package com.pace.base.comm;

import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class ApplicationStateResponse.
 */
public class ApplicationStateResponse extends PafResponse {
	
	/** The app states. */
	private List<ApplicationState> appStates = new ArrayList<ApplicationState>();

	/**
	 * Gets the app states.
	 *
	 * @return the appStates
	 */
	public List<ApplicationState> getAppStates() {
		return appStates;
	}

	/**
	 * Sets the app states.
	 *
	 * @param appStates the appStates to set
	 */
	public void setAppStates(List<ApplicationState> appStates) {
		this.appStates = appStates;
	}
	

}
