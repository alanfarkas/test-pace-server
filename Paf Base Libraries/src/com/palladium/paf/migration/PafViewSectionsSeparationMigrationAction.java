/*
 *	File: @(#)PafViewSectionsSeperationMigrationAction.java 	Package: com.palladium.paf.migration 	Project: Paf Base Libraries
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
import com.palladium.paf.view.PafViewSection;
import com.palladium.utility.PafXStream;

/**
 * Class_description_goes_here
 * 
 * @author jmilliron
 * @version x.xx
 * 
 */
public class PafViewSectionsSeparationMigrationAction extends MigrationAction {

	private static Logger logger = Logger
			.getLogger(PafViewSectionsSeparationMigrationAction.class);

	private String confDirectory;
	

	/**
	 * Constructor - creates instance of
	 * PafViewSectionsSeperationMigrationAction
	 * 
	 * @param serverHomeDir
	 *            Home directory of the server.
	 */
	public PafViewSectionsSeparationMigrationAction(XMLPaceProject xmlPaceProject) {
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
		return "Separate " + PafBaseConstants.FN_ViewSectionsMetaData;
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

			// get file reference to paf_view_sections.xml file
			File pafViewSectionsXmlFile = new File(confDirectory
					+ File.separator + PafBaseConstants.FN_ViewSectionsMetaData);

			// if the file does not exist
			if (!pafViewSectionsXmlFile.exists()) {

				/*
				 * //create a file reference to the backup file File
				 * pafViewSectionsXmlBackupFile = new File(confDirectory +
				 * File.separator + PafBaseConstants.FN_ViewSectionsMetaData +
				 * PafBaseConstants.BAK_EXT);
				 */

				// create a file to the new views folder
				File newPafViewSectionDir = new File(confDirectory
						+ File.separator + PafBaseConstants.DN_ViewSectionsFldr);

				// if the new paf views directory already exist and is a
				// directory and if the backup file exist, set as completed
				if (newPafViewSectionDir.exists()
						&& newPafViewSectionDir.isDirectory()) {

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

		if ( getStatus().equals(MigrationActionStatus.NotStarted) && confDirectory != null ) {

			PafViewSection[] pafViewSections = null;

			// get ref to paf_views.xml file
			String pafViewSectionsXml = confDirectory + File.separator
					+ PafBaseConstants.FN_ViewSectionsMetaData;

			// try to import the paf view_sections.xml file
			try {
				pafViewSections = (PafViewSection[]) PafXStream
						.importObjectFromXml(pafViewSectionsXml);
			} catch (PafConfigFileNotFoundException ex) {
				PafErrHandler.handleException(ex);
			}

			if (pafViewSections != null) {

				List<PafViewSection> viewSectionList = Arrays.asList(pafViewSections);
				
				xmlPaceProject.setViewSections(viewSectionList);
				
				try {
					
					xmlPaceProject.save(ProjectElementId.ViewSections);
					
				} catch (ProjectSaveException e) {
					
					logger.error(e.getMessage());
					
					throw new RuntimeException(e.getMessage());
				}
				

				// get ref to old paf_views.xml
				File pafViewSectionsXmlFile = new File(pafViewSectionsXml);

				// rename file with a .bak on end.
				if (pafViewSectionsXmlFile.exists()) {

					File newPafViewSectionXmlFile = new File(
							pafViewSectionsXmlFile + PafBaseConstants.BAK_EXT);

					logger.info("Renaming file " + pafViewSectionsXmlFile
							+ " to " + newPafViewSectionXmlFile);

					boolean fileRenamed = pafViewSectionsXmlFile.renameTo(newPafViewSectionXmlFile);

					if ( ! fileRenamed ) {
						
						logger.error("File " + pafViewSectionsXmlFile.toString() + " could not be renamed.");
						
					}
				}

			}
		}
	}

}
