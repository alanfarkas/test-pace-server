/*
 *	File: @(#)PafPlannerConfigMigrationAction.java 	Package: com.pace.base.migration 	Project: Paf Base Libraries
 *	Created: May 18, 2007  		By: jmilliron
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
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;

import com.pace.base.PafBaseConstants;
import com.pace.base.comm.PafPlannerConfig;
import com.pace.base.project.ProjectElementId;
import com.pace.base.project.ProjectSaveException;
import com.pace.base.project.XMLPaceProject;
import com.pace.base.utility.FileFilterUtility;
import com.pace.base.utility.FileUtils;

/**
 *  Copies the default eval enabled value into DefaultEvalEnabledWorkingVersion and
 *  MdbSaveWorkingVersionOnUowLoad then sets default eval enabled to null.
 *
 * @version	1.00
 * @author jmilliron
 *
 */
public class PafPlannerConfigMigrationAction extends MigrationAction {

	private static Logger logger = Logger
	.getLogger(PafPlannerConfigMigrationAction.class);
	
	private static Set<String> filterSet = new HashSet<String>();
	
	private String confDirectory;
	
	static {
		
		//filters to remove from file
		filterSet.add("<defaultEvalEnabled>false</defaultEvalEnabled>");
		filterSet.add("<defaultEvalEnabled>true</defaultEvalEnabled>");
	}
	
	/**
	 * Constructor - creates instance of PafSecurityMigrationAction
	 * 
	 * @param serverHomeDir
	 *            Home directory of the server.
	 */
	public PafPlannerConfigMigrationAction(XMLPaceProject xmlPaceProject) {

		this.xmlPaceProject = xmlPaceProject;
		
		if ( this.xmlPaceProject != null) {
			
			confDirectory = this.xmlPaceProject.getProjectInput();
			
		}

	}

	
	/* (non-Javadoc)
	 * @see com.pace.base.migration.IMigrationAction#getActionName()
	 */
	public String getActionName() {
		
		return "Remove defaultEvalEnabled tag from PafPlannerConfig file";
	}

	/* (non-Javadoc)
	 * @see com.pace.base.migration.IMigrationAction#getStatus()
	 */
	public MigrationActionStatus getStatus() {

		MigrationActionStatus status = MigrationActionStatus.NotStarted;
		
		//if server home directory location is specified
		if (confDirectory != null) {
			
			File pafPlannerconfigXmlFile = getInputFile();
			
			if ( pafPlannerconfigXmlFile != null ) {
			
				try {
					if ( ! FileFilterUtility.doFiltersExistsInFile(pafPlannerconfigXmlFile, filterSet) ) {
						status = MigrationActionStatus.Completed;
					}
				} catch (FileNotFoundException e) {
					logger.debug("File " + pafPlannerconfigXmlFile.toString() + " couldn't be found.");
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
			File pafPlannerconfigXmlFile = getInputFile();
			
			//if is file not null and exists
			if ( pafPlannerconfigXmlFile != null  && pafPlannerconfigXmlFile.exists() ) {

				//try to backup orig file
				try {
					
					File backupFile = new File(pafPlannerconfigXmlFile.toString() + PafBaseConstants.BAK_EXT);
					
					FileUtils.copy(pafPlannerconfigXmlFile, backupFile);
					
					//backupFile.
				} catch (IOException e1) {
					logger.error("Couldn't backup file " + pafPlannerconfigXmlFile.toString() + ". Error: " + e1.getMessage());
				}
				
				boolean currentUpgradeProject = this.xmlPaceProject.isUpgradeProject();
				
				//turn off current upgrade project flag, but save current value for later reset
				this.xmlPaceProject.setUpgradeProject(false);
												
				List<PafPlannerConfig> plannerConfigList = xmlPaceProject.getRoleConfigurations();
				
				//put project update flag back to initial value
				this.xmlPaceProject.setUpgradeProject(currentUpgradeProject);
				
				//if planner configs exists
				if ( plannerConfigList.size() > 0 ) {
					
					//loop over all planner configs, get the isDefaultEvalEnabled property and set the
					//DefaultEvalEnabledWorkingVersion and MdbSaveWorkingVersionOnUowLoad props with it.
					//Next, null out the original defaultEvalEnabled property
					for ( PafPlannerConfig pafPlannerConfig : plannerConfigList ) {
						
						if ( pafPlannerConfig != null && pafPlannerConfig.getDefaultEvalEnabled() != null ) {
							
							boolean isDefaultEvalEnabled = pafPlannerConfig.getDefaultEvalEnabled();
							
							pafPlannerConfig.setDefaultEvalEnabledWorkingVersion(isDefaultEvalEnabled);
							pafPlannerConfig.setMdbSaveWorkingVersionOnUowLoad(isDefaultEvalEnabled);
							pafPlannerConfig.setDefaultEvalEnabled(null);
						}
						
					}
					
					xmlPaceProject.setRoleConfigurations(plannerConfigList);
					
					try {
						xmlPaceProject.save(ProjectElementId.RoleConfigs);
						
					} catch (ProjectSaveException e1) {
						
						logger.error(e1.getMessage());
						
						if ( logger.isDebugEnabled() ) {
							e1.printStackTrace();
						}
						
						throw new RuntimeException(e1.getMessage());
						
					}

					try {
						
						//apply filters to file
						FileFilterUtility.removeFiltersFromFile(pafPlannerconfigXmlFile, filterSet);
						
					} catch (FileNotFoundException e) {
						
						logger.error("File " + pafPlannerconfigXmlFile + " could not be found.  Could not apply filters.");
						
					}
					
				}
			
			
			}
			
		}		

	}
	
	/**
	 * 
	 * Gets the input file
	 *
	 * @return Input file
	 */
	private File getInputFile () {
		
		//if conf dir is null, return null
		if ( confDirectory == null ) {
			return null;
		}
		
		// get file reference to paf_rules.xml file
		return new File(confDirectory + File.separator
				+ PafBaseConstants.FN_PlannerConfigs);
	}

}
