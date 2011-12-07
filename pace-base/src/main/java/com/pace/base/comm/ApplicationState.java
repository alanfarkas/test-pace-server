/*
 *  File: ApplicationState.java  Package: com.pace.base.comm  Project: pace-base
 *  Created: Oct 11, 2011     By: Jim Watkins
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

import com.pace.base.RunningState;

public class ApplicationState {
	private String applicationId;
	private RunningState currentRunState;
	private List<Exception> exceptions = new ArrayList<Exception>();
	
	public ApplicationState() {} // required by SOAP Layer
	
	public ApplicationState(String appId) {
		applicationId = appId;
		currentRunState= RunningState.STOPPED;
	}

	/**
	 * @return the applicationId
	 */
	public String getApplicationId() {
		return applicationId;
	}
	
	public void setApplicationId(String appId) {
		this.applicationId = appId;
	}
		

	/**
	 * @return the currentState
	 */
	public RunningState getCurrentRunState() {
		return currentRunState;
	}

	/**
	 * @param currentState the currentState to set
	 */
	public void setCurrentRunState(RunningState currentState) {
		this.currentRunState = currentState;
	}
	
	public void clearExceptions() {
		exceptions.clear();
	}
	
	public void addException(Exception ex) {
		exceptions.add(ex);
	}
	
	public List<Exception> getExceptions() {
		return exceptions;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ApplicationState [applicationId=" + applicationId
				+ ", currentRunState=" + currentRunState + ", exceptions="
				+ exceptions + "]";
	}
	
	
	
}
