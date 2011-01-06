/*
 *	File: @(#)PafViewsSeperationMigrationAction.java 	Package: com.palladium.paf.migration 	Project: Paf Base Libraries
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
package com.palladium.paf.migration;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import com.palladium.paf.PafBaseConstants;
import com.palladium.paf.PafConfigFileNotFoundException;
import com.palladium.paf.PafErrHandler;
import com.palladium.paf.project.ProjectElementId;
import com.palladium.paf.project.ProjectSaveException;
import com.palladium.paf.project.XMLPaceProject;
import com.palladium.paf.view.PafView;
import com.palladium.utility.PafXStream;

/**
 * This class is used to split the paf_views.xml file into a new directory and
 * individual xml files.
 * 
 * @author jmilliron
 * @version 1.00
 * 
 */
public class PafViewsSeparationMigrationAction extends MigrationAction {

	private static Logger logger = Logger
			.getLogger(PafViewsSeparationMigrationAction.class);

	private String confDirectory;
	
	
	/**
	 * Constructor - creates instance of PafViewsSeperationMigrationAction
	 * 
	 * @param serverHomeDir
	 *            Home directory of the server.
	 */
	public PafViewsSeparationMigrationAction(XMLPaceProject xmlPaceProject) {

		// set server home directory location
		this.xmlPaceProject = xmlPaceProject;
		
		if ( this.xmlPaceProject != null ) {
			
			confDirectory = this.xmlPaceProject.getProjectInput();
			
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.palladium.paf.migration.interfaces.IMigrationAction#getActionName()
	 */
	public String getActionName() {
		return "Separate " + PafBaseConstants.FN_ViewsMetaData;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.palladium.paf.migration.interfaces.IMigrationAction#getStatus()
	 */
	public MigrationActionStatus getStatus() {

		// set defaul status to not started
		MigrationActionStatus status = MigrationActionStatus.NotStarted;

		// if server home directory location is specified
		if (confDirectory != null) {

			// get file reference to paf_views.xml file
			File pafViewsXmlFile = new File(confDirectory + File.separator
					+ PafBaseConstants.FN_ViewsMetaData);

			// if the file does not exist
			if ( ! pafViewsXmlFile.exists() ) {

				/*
				 * //create a file reference to the backup file File
				 * pafViewsXmlBackupFile = new File(confDirectory +
				 * File.separator + PafBaseConstants.FN_ViewsMetaData +
				 * PafBaseConstants.BAK_EXT);
				 */

				// create a file to the new views folder
				File newPafViewDir = new File(confDirectory + File.separator
						+ PafBaseConstants.DN_ViewsFldr);

				// if the new paf views directory already exist and is a
				// directory and if the backup file exist, set as completed
				if (newPafViewDir.exists() && newPafViewDir.isDirectory()) {

					status = MigrationActionStatus.Completed;

				}

			}
		}

		return status;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.palladium.paf.migration.interfaces.IMigrationAction#run()
	 */
	public void run() {

		if (getStatus().equals(MigrationActionStatus.NotStarted) && confDirectory != null ) {

			PafView[] pafViews = null;

			// get ref to paf_views.xml file
			String pafViewsXml = confDirectory + File.separator
					+ PafBaseConstants.FN_ViewsMetaData;

			// try to import the paf views.xml file
			try {
				pafViews = (PafView[]) PafXStream
						.importObjectFromXml(pafViewsXml);

			} catch (PafConfigFileNotFoundException ex) {
				PafErrHandler.handleException(ex);
			}

			// if views exist
			if (pafViews != null) {

				List<PafView> pafViewList = Arrays.asList(pafViews);
				
				xmlPaceProject.setViews(pafViewList);
				
				try {
					
					xmlPaceProject.save(ProjectElementId.Views);
					
				} catch (ProjectSaveException e) {
					
					logger.error(e.getMessage());
					
					throw new RuntimeException(e.getMessage());
				}
				

				// get ref to old paf_views.xml
				File pafViewsXmlFile = new File(pafViewsXml);

				// rename file with a .bak on end.
				if (pafViewsXmlFile.exists()) {

					File newPafViewXmlFile = new File(pafViewsXmlFile
							+ PafBaseConstants.BAK_EXT);

					logger.info("Renaming file " + pafViewsXmlFile + " to "
							+ newPafViewXmlFile);

					boolean fileRenamed = pafViewsXmlFile.renameTo(newPafViewXmlFile);
					
					if ( ! fileRenamed ) {
						
						logger.error("File " + pafViewsXmlFile.toString() + " could not be renamed.");
						
					}

				}

			}
		}

	}

}
