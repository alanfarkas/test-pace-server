/*
 *	File: @(#)ProjectSaveException.java 	Package: com.pace.base.project 	Project: Paf Base Libraries
 *	Created: Aug 4, 2009  		By: jmilliron
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2007 Palladium Group, Inc. All rights reserved.
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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class_description_goes_here
 *
 * @author jmilliron
 * @version	x.xx
 *
 */
public class ProjectSaveException extends Exception {
	
	//TTN 1832- refine AC framework when exporting error occurs
	//Added to display non-blocking errors when exporting a pace project  
	private Map<ProjectElementId, List<ProjectDataError>> projectSaveErrorMap = null;
	//TTN 1832- refine AC framework when exporting error occurs
	//Added this field used for flagging blocking or non-blocking errors when exporting a pace project  
	private boolean fatalError = false;
	
	public boolean isFatalError() {
		return fatalError;
	}

	public void setFatalError(boolean fatalError) {
		this.fatalError = fatalError;
	}

	public ProjectSaveException(
			Map<ProjectElementId, List<ProjectDataError>> projectExportErrorMap) {
		
		super();
		
		if ( projectExportErrorMap != null ) {
			
			this.projectSaveErrorMap = new HashMap<ProjectElementId, List<ProjectDataError>>();
			this.projectSaveErrorMap.putAll(projectExportErrorMap);
			
		}
		
	}
	
	public ProjectSaveException(
			Map<ProjectElementId, List<ProjectDataError>> projectExportErrorMap, boolean fatalError) {
		
		this(projectExportErrorMap);
		
		setFatalError(fatalError);
	}
	
	/**
	 * @param message
	 */
	public ProjectSaveException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the projectCreationErrorMap
	 */
	public Map<ProjectElementId, List<ProjectDataError>> getProjectSaveErrorMap() {
		return projectSaveErrorMap;
	}
}
