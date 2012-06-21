/*
 *	File: @(#)PafSecurityMigrationStep.java 	Package: com.pace.base.migration 	Project: Paf Base Libraries
 *	Created: Apr 23, 2007  		By: jmilliron
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
package com.pace.base.migration;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;

import com.pace.base.PafBaseConstants;
import com.pace.base.project.XMLPaceProject;
import com.pace.base.utility.FileFilterUtility;
import com.pace.base.utility.FileUtils;

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author ihuang
 *
 */
public class PafVersionMigrationAction extends MigrationAction {

	private static Logger logger = Logger
	.getLogger(PafSecurityMigrationAction.class);
	
	private static Set<String> filterSet = new HashSet<String>();
	
	private String confDirectory;
	
	static {
		
		//filters to remove from file
		filterSet.add("<isSelectable>false</isSelectable>");
		filterSet.add("<isSelectable>true</isSelectable>");
	}
	
	/**
	 * Constructor - creates instance of PafSecurityMigrationAction
	 * 
	 * @param serverHomeDir
	 *            Home directory of the server.
	 */
	public PafVersionMigrationAction(XMLPaceProject xmlPaceProject) {

		this.xmlPaceProject = xmlPaceProject;
		
		if ( this.xmlPaceProject != null ) {
			
			confDirectory = this.xmlPaceProject.getProjectInput();
			
		}

	}

	
	/* (non-Javadoc)
	 * @see com.pace.base.migration.IMigrationAction#getActionName()
	 */
	public String getActionName() {
		
		return "Remove isSelectable tag from version file";
	}

	/* (non-Javadoc)
	 * @see com.pace.base.migration.IMigrationAction#getStatus()
	 */
	public MigrationActionStatus getStatus() {

		MigrationActionStatus status = MigrationActionStatus.NotStarted;
		
//		 if server home directory location is specified
		if (confDirectory != null) {
			
			File pafVersionXmlFile = getInputFile(PafBaseConstants.FN_VersionMetaData);
			
			if ( pafVersionXmlFile != null ) {
			
				try {
					if ( ! FileFilterUtility.doFiltersExistsInFile(pafVersionXmlFile, filterSet) ) {
						status = MigrationActionStatus.Completed;
					}
				} catch (FileNotFoundException e) {
					logger.debug("File " + pafVersionXmlFile.toString() + " couldn't be found.");
					//status = MigrationActionStatus.Failed;
				}
				
			}
		}
		
		return status;
		
	}

	/* (non-Javadoc)
	 * @see com.pace.base.migration.IMigrationAction#run()
	 */
	public void run() {
		
		//if not started
		if ( getStatus().equals(MigrationActionStatus.NotStarted)) {
		
			//get input file
			File pafVersionXmlFile = getInputFile(PafBaseConstants.FN_VersionMetaData);
			
			//if is file not null and exists
			if ( pafVersionXmlFile != null  && pafVersionXmlFile.exists() ) {
				
				//try to backup orig file
				try {
					FileUtils.copy(pafVersionXmlFile, new File(pafVersionXmlFile.toString() + PafBaseConstants.BAK_EXT));
				} catch (IOException e1) {
					logger.error("Couldn't backup file " + pafVersionXmlFile.toString() + ". Error: " + e1.getMessage());
				}
				
				try {
					FileFilterUtility.removeFiltersFromFile(pafVersionXmlFile, filterSet);
				} catch (FileNotFoundException e) {
				}
				
			}
			
		}		

	}

}
