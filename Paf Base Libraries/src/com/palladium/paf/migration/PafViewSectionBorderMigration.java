/*
 *	File: @(#)PafViewSectionBorderMigration.java 	Package: com.palladium.paf.migration 	Project: Paf Base Libraries
 *	Created: Feb 14, 2007  		By: jmilliron
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import com.palladium.paf.project.ProjectElementId;
import com.palladium.paf.project.ProjectSaveException;
import com.palladium.paf.project.XMLPaceProject;
import com.palladium.paf.view.PafBorder;
import com.palladium.paf.view.PafViewSection;
import com.palladium.paf.view.ViewTuple;

/**
 * This class is used to convert the ViewTuple border attribute to dataBorder.
 * 
 * @author jmilliron
 * @version 1.00
 * 
 */
public class PafViewSectionBorderMigration extends MigrationAction {

	private static Logger logger = Logger
			.getLogger(PafViewSectionBorderMigration.class);

	/**
	 * Constructor - creates instance of PafViewSectionBorderMigration
	 * 
	 * @param serverHomeDir
	 *            Home directory of the server.
	 */
	public PafViewSectionBorderMigration(XMLPaceProject xmlPaceProject) {
		
		this.xmlPaceProject = xmlPaceProject;

	}

	/*
	 * (non-Javadoc)
	 * @see com.palladium.paf.migration.IMigrationAction#getActionName()
	 */
	public String getActionName() {

		return "Convert View Sections border to dataBorder";
	}

	/*
	 * (non-Javadoc)
	 * @see com.palladium.paf.migration.IMigrationAction#getStatus()
	 */	
	public MigrationActionStatus getStatus() {

		// if server home directory location is specified
		if (xmlPaceProject != null) {

			boolean currentUpgradeProject = this.xmlPaceProject.isUpgradeProject();
			
			//turn off current upgrad project flag, but save current value for later reset
			this.xmlPaceProject.setUpgradeProject(false);
			
			new PafViewSectionsSeparationMigrationAction(xmlPaceProject).run();
			
			List<PafViewSection> pafViewSectionList = xmlPaceProject.getViewSections();

			this.xmlPaceProject.setUpgradeProject(currentUpgradeProject);
			
			// if the file does not exist
			if (pafViewSectionList != null) {

				//loop over view sections
				for (PafViewSection pafViewSection : pafViewSectionList) {
					
					List<ViewTuple> viewTupleList = new ArrayList<ViewTuple>();
					
					if ( pafViewSection.getRowTuples() != null ) {
						
						viewTupleList.addAll(Arrays.asList(pafViewSection.getRowTuples()));
						
					}
					
					if ( pafViewSection.getColTuples() != null ) {
						
						viewTupleList.addAll(Arrays.asList(pafViewSection.getColTuples()));
						
					}

					//loop over row tuples.  if older border exists and new one doesn't, return as not started
					for (ViewTuple viewTuple : viewTupleList) {

						PafBorder oldBorder = viewTuple.getBorder();
						PafBorder dataBorder = viewTuple.getDataBorder();

						if (oldBorder != null && dataBorder == null) {
							return MigrationActionStatus.NotStarted;
						}

					}

													
				}
				
				//return completed if didn't already return not started
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
			this.xmlPaceProject.setUpgradeProject(false);
			
			List<PafViewSection> pafViewSectionList = xmlPaceProject.getViewSections();

			this.xmlPaceProject.setUpgradeProject(currentUpgradeProject);
			
			// if the file does not exist
			if (pafViewSectionList != null) {

				//loop view sections
				for (PafViewSection pafViewSection : pafViewSectionList) {

					//get row tuples from view section										
					ViewTuple[] rowTuples = pafViewSection.getRowTuples();

					if (rowTuples != null) {

						//for each row tuple, set data border as old border then set old border to null
						for (ViewTuple viewTuple : rowTuples) {

							PafBorder oldBorder = viewTuple.getBorder();
							
							//if old border is not null, set to data border then null out
							if ( oldBorder != null ) {							
								viewTuple.setDataBorder(oldBorder);
								viewTuple.setBorder(null);
							}						
							
						}

					}

					//get col tuples from view section
					ViewTuple[] colTuples = pafViewSection.getColTuples();

					if (colTuples != null) {

						//for each row tuple, set data border as old border then set old border to null
						for (ViewTuple viewTuple : colTuples) {						
						
							PafBorder oldBorder = viewTuple.getBorder();
							
							//if old border is not null, set to data border then null out							
							if ( oldBorder != null ) {
								viewTuple.setDataBorder(oldBorder);
								viewTuple.setBorder(null);
							}
							
						}

					}

				}

				//turn off current upgrad project flag, but save current value for later reset
				this.xmlPaceProject.setUpgradeProject(true);
				
				//export updated view sections
				xmlPaceProject.setViewSections(pafViewSectionList);

				this.xmlPaceProject.setUpgradeProject(currentUpgradeProject);
				
				try {
					xmlPaceProject.save(ProjectElementId.ViewSections);
				} catch (ProjectSaveException e) {
					
					logger.error(e.getMessage());
					
					throw new RuntimeException(e.getMessage());
				}
				
			}
			
			
		}
	}

}
