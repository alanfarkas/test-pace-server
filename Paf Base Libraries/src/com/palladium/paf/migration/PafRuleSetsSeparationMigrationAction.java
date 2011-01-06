/*
 *	File: @(#)PafRuleSetsSeperationMigrationAction.java 	Package: com.palladium.paf.migration 	Project: Paf Base Libraries
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
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

import com.palladium.paf.PafBaseConstants;
import com.palladium.paf.PafConfigFileNotFoundException;
import com.palladium.paf.PafErrHandler;
import com.palladium.paf.project.ProjectElementId;
import com.palladium.paf.project.ProjectSaveException;
import com.palladium.paf.project.XMLPaceProject;
import com.palladium.paf.rules.RuleSet;
import com.palladium.utility.FileFilterUtility;
import com.palladium.utility.MigrateServerUtil;
import com.palladium.utility.PafXStream;

/**
 * This class is used to split the paf_rules.xml file into a new directory and
 * individual xml files.
 * 
 * @author jmilliron
 * @version 1.00
 * 
 */
public class PafRuleSetsSeparationMigrationAction extends MigrationAction {

	private static Logger logger = Logger
			.getLogger(PafRuleSetsSeparationMigrationAction.class);
	
	private static Set<String> filterSet = new HashSet<String>();
	
	private String confDirectory;
	
	static {
	
		//formula
		filterSet.add("<resultFunction>false</resultFunction>");
		filterSet.add("<isParsed>false</isParsed>");

		//rule
		filterSet.add("<key>0</key>");
		filterSet.add("<skipAllocation>false</skipAllocation>");
		filterSet.add("<lockAllocation>false</lockAllocation>");
		filterSet.add("<skipAggregation>false</skipAggregation>");
		filterSet.add("<lockSystemEvaluationResult>false</lockSystemEvaluationResult>");
		filterSet.add("<lockUserEvaluationResult>true</lockUserEvaluationResult>");
		filterSet.add("<evalLockedIntersections>false</evalLockedIntersections>");
		filterSet.add("<lockAllPriorTime>false</lockAllPriorTime>");
		filterSet.add("<calcAllPeriods>false</calcAllPeriods>");
		filterSet.add("<initialTBFirstAllocation>false</initialTBFirstAllocation>");
		
		//rule group
		filterSet.add("<performInitialAllocation>true</performInitialAllocation>");
		filterSet.add("<perpetual>false</perpetual>");
		filterSet.add("<delayedPerpetual>false</delayedPerpetual>");
		filterSet.add("<perpetualAllocation>false</perpetualAllocation>");
		filterSet.add("<skipProtProc>false</skipProtProc>");
		
	}
		
	/**
	 * Constructor - creates instance of PafRuleSetsSeperationMigrationAction
	 * 
	 * @param serverHomeDir
	 *            Home directory of the server.
	 */
	public PafRuleSetsSeparationMigrationAction(XMLPaceProject xmlPaceProject) {

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
		return "Separate " + PafBaseConstants.FN_RuleSetMetaData;
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

			// get file reference to paf_rules.xml file
			File pafRuleSetsXmlFile = new File(confDirectory + File.separator
					+ PafBaseConstants.FN_RuleSetMetaData);

			// if the file does not exist
			if (!pafRuleSetsXmlFile.exists()) {

				// create a file to the new rule sets folder
				File newPafRuleSetsDir = new File(confDirectory
						+ File.separator + PafBaseConstants.DN_RuleSetsFldr);

				// if the new paf rule sets directory already exist and is a
				// directory and if the backup file exist, set as completed
				if (newPafRuleSetsDir.exists()
						&& newPafRuleSetsDir.isDirectory()) {

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

		if (getStatus().equals(MigrationActionStatus.NotStarted)) {

			List<RuleSet> ruleSets = null;

			// get ref to paf_rules.xml file
			String pafRuleSetsXml = confDirectory + File.separator
					+ PafBaseConstants.FN_RuleSetMetaData;

			// try to import the paf rule sets.xml file
			try {
				ruleSets = (List<RuleSet>) PafXStream
						.importObjectFromXml(pafRuleSetsXml);

			} catch (PafConfigFileNotFoundException ex) {
				PafErrHandler.handleException(ex);
			}

			// if rule sets exist
			if (ruleSets != null) {

				// get ref to new paf_rules directory and create if doesn't
				// exist
				File newPafRuleSetsDir = new File(confDirectory
						+ File.separator + PafBaseConstants.DN_RuleSetsFldr);

				if (newPafRuleSetsDir != null && !newPafRuleSetsDir.exists()) {

					logger.info("Creating directory "
							+ newPafRuleSetsDir.toString());

					boolean dirCreated = newPafRuleSetsDir.mkdir();
					
					if ( ! dirCreated ) {
						
						logger.error("Directory " + newPafRuleSetsDir.toString() + " could not be created.");
						
					}

				}

				// if new directory exist
				if (newPafRuleSetsDir.exists()
						&& newPafRuleSetsDir.isDirectory()) {

					List<String> generatedFileNameWithDirList = new ArrayList<String>();
					
					Map<String, RuleSet> ruleSetMap = new HashMap<String, RuleSet>();
					
					// loop over rule sets and write each out to its own
					// filename
					for (RuleSet ruleSet : ruleSets) {

						// generated file name off of rule set name
						String generatedFileName = MigrateServerUtil
								.generateFileName(ruleSet.getName())
								+ PafBaseConstants.XML_EXT;

						//logger.info("Creating file " + generatedFileName);

						String generatedFileNameWithDir = newPafRuleSetsDir.toString()+ File.separator + generatedFileName;
						
						generatedFileNameWithDirList.add(generatedFileNameWithDir);
						
						ruleSetMap.put(ruleSet.getName(), ruleSet);
						
						// write to disk
						//PafXStream.exportObjectToXml(ruleSet, generatedFileNameWithDir);
																		
					}
					
					if ( ruleSetMap.size() > 0 ) {
					
						xmlPaceProject.setRuleSets(ruleSetMap);
						
						try {
							xmlPaceProject.save(ProjectElementId.RuleSets);
						} catch (ProjectSaveException e1) {
							
							logger.error(e1.getMessage());
							throw new RuntimeException(e1.getMessage());
							
						}				
					
						for ( String generatedFileNameWithDir : generatedFileNameWithDirList ) {
							
							try {
								FileFilterUtility.removeFiltersFromFile(generatedFileNameWithDir, filterSet);
							} catch (FileNotFoundException e) {
								
								logger.warn("Couldn't apply filters to file " + generatedFileNameWithDir + " because file was not found.");
								
							}
							
						}
						
					}

				}

				// get ref to old paf_rules.xml
				File pafRuleSetsXmlFile = new File(pafRuleSetsXml);

				// rename file with a .bak on end.
				if (pafRuleSetsXmlFile.exists()) {

					File newPafRuleSetsXmlFile = new File(pafRuleSetsXmlFile
							+ PafBaseConstants.BAK_EXT);

					logger.info("Renaming file " + pafRuleSetsXmlFile + " to "
							+ newPafRuleSetsXmlFile);

					boolean fileRenamed = pafRuleSetsXmlFile.renameTo(newPafRuleSetsXmlFile);
					
					if ( ! fileRenamed ) {
						
						logger.error("File " + pafRuleSetsXmlFile.toString() + " could not be renamed.");
						
					}
					
				}

			}

		}
	}

	public static Set<String> getFilterSet() {
		
		Set<String> newFilterSet = new HashSet<String>();
		
		if ( filterSet != null ) {
		
			newFilterSet.addAll(filterSet);
			
		}
				
		return newFilterSet;
		
	}
}
