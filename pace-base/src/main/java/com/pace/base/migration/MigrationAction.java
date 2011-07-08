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

import java.io.File;

import com.pace.base.PafBaseConstants;
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

	/**
	 * Gets the input file (the xml file) from the conf directory.
	 * Pace Project must not be null and initialized.
	 * @param xmlFileName
	 * @return
	 */
	protected File getInputFile(String xmlFileName) {
		
		if(xmlPaceProject == null || xmlPaceProject.getProjectInput()== null){
			return null;
		}
		
		String confDirectory = xmlPaceProject.getProjectInput();		
		
		//if conf dir is null, return null
		if ( confDirectory == null ) {
			return null;
		}
		
		// get file reference to paf_rules.xml file
		return new File(confDirectory + File.separator + xmlFileName);
	}
	
	/**
	 * Tests a file to see if it is a valid  xml file, and a non .svn file.
	 * @param childFile
	 * @return
	 */
	protected boolean isValidProjectFileOrDir(File childFile) {

		if ( childFile != null) {
			
			if ( childFile.isFile() && childFile.toString().endsWith(PafBaseConstants.XML_EXT) ) {
				return true;
			} else if ( childFile.isDirectory() && ! childFile.toString().endsWith(PafBaseConstants.SVN_HIDDEN_DIR_NAME) ) {
				return true;
			}
		}
		
		return false;
	}

	
	
}
