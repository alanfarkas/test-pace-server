/*
 *	File: @(#)ProjectCreationException.java 	Package: com.pace.base.project 	Project: Paf Base Libraries
 *	Created: Jul 21, 2009  		By: jmilliron
 *	Version: 1.00
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
package com.pace.base.project;

import java.util.List;

import com.pace.base.project.excel.PafExcelValueObject;

/**
 * @author JavaJ
 *
 */
public class ProjectDataError {

	private ProjectElementId projectElementId;
	
	private String errorSource;
	
	private String errorMessage;
	
	public ProjectDataError(ProjectElementId projectElementId, String errorMessage) {
	
		this.projectElementId = projectElementId;
		this.errorMessage = errorMessage;
		
	}
	
	public ProjectDataError(ProjectElementId projectElementId, PafExcelValueObject errorSourceValueObject, String errorMessage) {
		
		this(projectElementId, errorMessage);		
		
		if ( errorSourceValueObject != null ) {
			
			this.errorSource = errorSourceValueObject.getCellAddress();
			
		}
				
		
	}
	
	public ProjectDataError(ProjectElementId projectElementId, String errorSource, String errorMessage) {
		
		this(projectElementId, errorMessage);
		this.errorSource = errorSource;	
				
	}
	
	/**
	 * @return the projectElementId
	 */
	public ProjectElementId getProjectElementId() {
		return projectElementId;
	}

	/**
	 * @param projectElementId the projectElementId to set
	 */
	public void setProjectElementId(ProjectElementId projectElementId) {
		this.projectElementId = projectElementId;
	}

	/**
	 * @return the errorSource
	 */
	public String getErrorSource() {
		return errorSource;
	}

	/**
	 * @param errorSource the errorSource to set
	 */
	public void setErrorSource(String errorSource) {
		this.errorSource = errorSource;
	}

	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * @param errorMessage the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

public static ProjectDataError createRequiredProjectDataError(ProjectElementId projectElementId, PafExcelValueObject valueObject) {
		
		return new ProjectDataError(projectElementId, valueObject, ExcelPaceProjectConstants.REQUIRED);
		
	}
	
	public static ProjectDataError createInvalidNumberProjectDataError(ProjectElementId projectElementId, PafExcelValueObject valueObject) {
		
		return new ProjectDataError(projectElementId, valueObject, ExcelPaceProjectConstants.INVALID_NUMBER + valueObject.getValueAsString());
		
	}
	
	public static ProjectDataError createInvalidValueProjectDataError(ProjectElementId projectElementId, PafExcelValueObject valueObject) {
		
		return createInvalidValueProjectDataError(projectElementId, valueObject, null);
				
	}
	
	public static ProjectDataError createRequiredValueProjectDataError(ProjectElementId projectElementId, PafExcelValueObject valueObject, String errorMessage) {
		
		return new ProjectDataError(projectElementId, valueObject, errorMessage);
				
	}
	
	public static ProjectDataError createInvalidValueProjectDataError(ProjectElementId projectElementId, PafExcelValueObject valueObject, List<String> validValueList) {
		
		ProjectDataError invalidProjectDataError = null;
		
		if ( validValueList != null && validValueList.size() > 0 ) {
			
			invalidProjectDataError = new ProjectDataError(projectElementId, valueObject, ExcelPaceProjectConstants.INVALID_VALUE + valueObject.getValueAsString() + ExcelPaceProjectConstants.VAILD_OPTIONS_ARE + validValueList);
			
		} else {
		
			invalidProjectDataError = new ProjectDataError(projectElementId, valueObject, ExcelPaceProjectConstants.INVALID_VALUE + valueObject.getValueAsString());
			
		}
		
		return invalidProjectDataError;
		
	}

	public static ProjectDataError createMissingKeyProjectDataError(ProjectElementId projectElementId, PafExcelValueObject valueObject) {
		
		return new ProjectDataError(projectElementId, valueObject, ExcelPaceProjectConstants.MISSING_KEY);
		
	}
	
	public static ProjectDataError createMissingValueProjectDataError(ProjectElementId projectElementId, PafExcelValueObject valueObject) {
		
		return new ProjectDataError(projectElementId, valueObject, ExcelPaceProjectConstants.MISSING_VALUE);
		
	}

	public static ProjectDataError createBooleanProjectDataError(ProjectElementId projectElementId, PafExcelValueObject valueObject) {
		
		return createInvalidValueProjectDataError(projectElementId, valueObject, ExcelPaceProjectConstants.VALID_BOOLEAN_LIST);
		
	}	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder(super.toString() + ":");
		sb.append("\nProject element id: " + projectElementId);
		sb.append("\nProject error source: " + errorSource);
		sb.append("\nProject error message: " + errorMessage + "\n");
				
		return sb.toString();
	}
		
	
}
