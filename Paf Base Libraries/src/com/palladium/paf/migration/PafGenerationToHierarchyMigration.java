/*
 *	File: @(#)PafGenerationToHierarchyMigration.java 	Package: com.palladium.paf.migration 	Project: Paf Base Libraries
 *	Created: Feb 15, 2007  		By: jmilliron
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
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.palladium.paf.PafBaseConstants;
import com.palladium.paf.PafConfigFileNotFoundException;
import com.palladium.paf.project.ProjectElementId;
import com.palladium.paf.project.ProjectSaveException;
import com.palladium.paf.project.XMLPaceProject;
import com.palladium.paf.view.PafViewSection;
import com.palladium.utility.PafXStream;

/**
 * This class is used to convert the GenerationFormat tag to HiearchyFormat tag.
 * 
 * @author jmilliron
 * @version 1.00
 * 
 */
public class PafGenerationToHierarchyMigration extends MigrationAction {

	private static Logger logger = Logger
			.getLogger(PafGenerationToHierarchyMigration.class);

	private String confDirectory = null;
		
	/**
	 * Constructor - Creates instance of PafViewSectionBorderMigration
	 */
	public PafGenerationToHierarchyMigration() {
	}

	/**
	 * Constructor - creates instance of PafViewSectionBorderMigration
	 * 
	 * @param paceProject
	 *            Current pace project
	 */
	public PafGenerationToHierarchyMigration(XMLPaceProject xmlPaceProject) {

		// set pace project
		this.xmlPaceProject = xmlPaceProject;
		
		if ( this.xmlPaceProject != null) {
			
			confDirectory = this.xmlPaceProject.getProjectInput();
									
		}

	}

	/*
	 * (non-Javadoc)
	 * @see com.palladium.paf.migration.IMigrationAction#getActionName()
	 */
	public String getActionName() {

		return "Convert Generation Formats to Hierarchy Formats";
	}

	/*
	 * (non-Javadoc)
	 * @see com.palladium.paf.migration.IMigrationAction#getStatus()
	 */	
	public MigrationActionStatus getStatus() {

		// if server home directory location is specified
		if (confDirectory != null) {

			//get new file name
			File hierarchyFile = new File(confDirectory + File.separator + PafBaseConstants.FN_HierarchyFormats);
			
			//if new file name exists, then step has already completed.
			if ( hierarchyFile.exists() && hierarchyFile.isFile()) {
				return MigrationActionStatus.Completed;
			}
			
		} 

		return MigrationActionStatus.NotStarted;
	}

	/*
	 * (non-Javadoc)
	 * @see com.palladium.paf.migration.IMigrationAction#run()
	 */
	public void run() {

		//if not already completed
		if (getStatus().equals(MigrationActionStatus.NotStarted)) {

			boolean currentUpgradeProject = this.xmlPaceProject.isUpgradeProject();
			
			//turn off current upgrad project flag, but save current value for later reset
			this.xmlPaceProject.setUpgradeProject(true);
			
			migratePafGenerationFile();
			migratePafViewSections();
			
			//put project update flag back to initial value
			this.xmlPaceProject.setUpgradeProject(currentUpgradeProject);
			
		}
	}

	private void migratePafViewSections() {		
				
		List<PafViewSection> pafViewSectionList = xmlPaceProject.getViewSections();
		
		if (  pafViewSectionList.size() > 0 ) {
			
			for ( PafViewSection pafViewSection : pafViewSectionList) {
				
				if ( pafViewSection != null ) {
					
					String genFormatName = pafViewSection.getGenerationFormatName();
					
					String hierFormatName = pafViewSection.getHierarchyFormatName();
					
					if ( genFormatName != null && hierFormatName == null ) {
						
						pafViewSection.setHierarchyFormatName(genFormatName);						
						pafViewSection.setGenerationFormatName(null);
						
					}
					
				}
				
			}
			
			//PafImportExportUtility.exportViewSections(pafViewSections, confDirectory, true);
			xmlPaceProject.setViewSections(pafViewSectionList);
			
			try {
				xmlPaceProject.save(ProjectElementId.ViewSections);
			} catch (ProjectSaveException e) {
				throw new RuntimeException(e.getMessage());
			}
			
			
		}
		
		
		
		
		
	}

	private void migratePafGenerationFile() {
		
//		old file
		File oldGenerationFile = new File(confDirectory + File.separator + PafBaseConstants.FN_GenerationFormats);
		
		//get new file name
		File hierarchyFile = new File(confDirectory + File.separator + PafBaseConstants.FN_HierarchyFormats);
		
		//if old file exists and is a file
		if ( oldGenerationFile.exists() && oldGenerationFile.isFile()) {				
			
			try {
				
				//read in old gen format style
				Map	formats = (Map) PafXStream.importObjectFromXml(oldGenerationFile.toString());
				
				//export to new file
				//PafXStream.exportObjectToXml(formats, hierarchyFile.toString());
				xmlPaceProject.setHierarchyFormats(formats);
				
				try {
					xmlPaceProject.save(ProjectElementId.HierarchyFormats);
				} catch (ProjectSaveException e) {
					throw new RuntimeException(e.getMessage());
				}
				
				//renamed file (orig with bak ext)
				File renamedFile = new File(oldGenerationFile.toString() + PafBaseConstants.BAK_EXT);
				
				//rename old file
				boolean isRenamed = oldGenerationFile.renameTo(renamedFile);
				
				//if hiearchy file exists and the rename file exists, log success
				if ( isRenamed && hierarchyFile.exists() && renamedFile.exists()) {
					logger.info("File " + oldGenerationFile + " was successfully converted and backed up to " + renamedFile + ".");
				} else {
					logger.error("File " + oldGenerationFile + " was NOT successfully converted and backed up to " + renamedFile + ".");
				}
				
			} catch (PafConfigFileNotFoundException ex) {
				//already checked
			}
			
		}
		

		
	}

}
