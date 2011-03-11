/*
 *	File: @(#)MigrationAction.java 	Package: com.pace.base.migration 	Project: Paf Base Libraries
 *	Created: Jan 2, 2007  		By: jmilliron
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
package com.pace.base.migration;

import com.pace.base.project.XMLPaceProject;

/**
 * Migration Action
 *
 * @author jmilliron
 * @version	1.00
 *
 */
public abstract class MigrationAction implements IMigrationAction {
	
	protected XMLPaceProject xmlPaceProject = null;
	
	/**
	 * @return the paceProject
	 */
	public XMLPaceProject getXMLPaceProject() {
		return xmlPaceProject;
	}

	/**
	 * @param paceProject the paceProject to set
	 */
	public void setXMLPaceProject(XMLPaceProject xmlPaceProject) {
		this.xmlPaceProject = xmlPaceProject;
	}


	
}
