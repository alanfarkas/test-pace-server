/**
 * 
 */
package com.palladium.paf.project.utils;

/**
 * @author JavaJ
 *
 */
public class PaceProjectError {

	private String projectId;
	
	private String location;
	
	private String errorMessage;
	
	public PaceProjectError(String projectId, String location, String errorMessage) {
		
		//TODO: validation of arguments
		
		this.projectId = projectId;
		this.location = location;
		this.errorMessage = errorMessage;
				
	}

	

	/**
	 * @return the projectId
	 */
	public String getProjectId() {
		return projectId;
	}



	/**
	 * @param projectId the projectId to set
	 */
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}



	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}



	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}



	/**
	 * @param errorMessage the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}



	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}
	
	
	
	
	
}
