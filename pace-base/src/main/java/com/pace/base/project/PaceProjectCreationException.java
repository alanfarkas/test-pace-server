/*
 *	File: @(#)PaceProjectCreationException.java 	Package: com.pace.base.project.alt 	Project: Paf Base Libraries
 *	Created: Jul 22, 2009  		By: jmilliron
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
public class PaceProjectCreationException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8890566629348003719L;
	
	
	private Map<ProjectElementId, List<ProjectDataError>> projectCreationErrorMap = null;
	
	public PaceProjectCreationException(
			Map<ProjectElementId, List<ProjectDataError>> projectCreationErrorMap) {
		
		super();
		
		if ( projectCreationErrorMap != null ) {
			
			this.projectCreationErrorMap = new HashMap<ProjectElementId, List<ProjectDataError>>();
			this.projectCreationErrorMap.putAll(projectCreationErrorMap);
			
		}
		
	}
	
	public PaceProjectCreationException(String message) {
		
		super(message);
		
	}

	/**
	 * @return the projectCreationErrorMap
	 */
	public Map<ProjectElementId, List<ProjectDataError>> getProjectCreationErrorMap() {
		return projectCreationErrorMap;
	}

}
