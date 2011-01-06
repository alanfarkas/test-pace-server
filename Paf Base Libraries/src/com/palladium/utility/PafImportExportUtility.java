/*
 *	File: @(#)PafImportExportUtility.java 	Package: com.palladium.utility 	Project: Paf Base Libraries
 *	Created: Jan 8, 2007  		By: jmilliron
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
package com.palladium.utility;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.palladium.paf.PafBaseConstants;
import com.palladium.paf.PafConfigFileNotFoundException;
import com.palladium.paf.PafErrHandler;
import com.palladium.paf.PafErrSeverity;
import com.palladium.paf.app.DynamicMemberDef;
import com.palladium.paf.comm.PafPlannerConfig;
import com.palladium.paf.db.membertags.MemberTagDef;
import com.palladium.paf.rules.RuleSet;
import com.palladium.paf.view.PafStyle;
import com.palladium.paf.view.PafView;
import com.palladium.paf.view.PafViewGroup;
import com.palladium.paf.view.PafViewSection;
import com.thoughtworks.xstream.XStream;

/**
 * Class_description_goes_here
 * 
 * @author jmilliron
 * @version 1.00
 * 
 */
public class PafImportExportUtility {

	private static Logger logger = Logger
			.getLogger(PafImportExportUtility.class);

	/**
	 * 
	 *	Import views from the file system using PafXStream
	 *
	 * @param confDir	conf dicectory
	 * @param autoConvertView flag to auto convert views 
	 * @return an array of paf views
	 *//*
	public static PafView[] importViews(String confDir,
			boolean autoConvertView) {

		// create empty list
		List<PafView> pafViews = new ArrayList<PafView>();

		// if auto convert project is true, auto convert using this action
		if (autoConvertView) {

			MigrationAction migrationAction = new PafViewsSeparationMigrationAction(
					confDir);

			if (migrationAction.getStatus().equals(
					MigrationActionStatus.NotStarted)) {

				migrationAction.run();

			}

		}

		// get ref to conf directory
		File confDirectory = new File(confDir);

		// if conf dir exists
		if (confDirectory != null && confDirectory.exists()
				&& confDirectory.isDirectory()) {

			// get ref to data folder
			File pafViewsDirectory = new File(confDir + File.separator
					+ PafBaseConstants.DN_ViewsFldr);

			// if data folder exists
			if (pafViewsDirectory != null && pafViewsDirectory.exists()
					&& pafViewsDirectory.isDirectory()) {

				// for each data file in data folder
				for (File pafViewFile : pafViewsDirectory.listFiles()) {

					//if a file and ends with xml
					if ( pafViewFile.isFile() && pafViewFile.toString().endsWith(PafBaseConstants.XML_EXT)) {
					
						try {
	
							// import model
							PafView pafView = (PafView) PafXStream
									.importObjectFromXml(pafViewFile
											.getAbsolutePath());
	
							// add model to list
							pafViews.add(pafView);
	
						} catch (PafConfigFileNotFoundException e) {
	
							logger.warn(pafViewFile + " file was not found.");
	
						}
						
					}

				}

			}

		} else {

			// do something

		}

		// if size is 0, return null
		if (pafViews.size() == 0) {

			return null;

		}

		// convert to array and return
		return pafViews.toArray(new PafView[0]);

	}*/

	/**
	 * 
	 *	Imports view sections
	 *
	 * @param confDir	conf directory
	 * @param autoConvertViewSections 	flag to auto convert view sections
	 * @return imported view sections as array
	 */
	/*public static PafViewSection[] importViewSections(String confDir,
			boolean autoConvertViewSections) {

		// create empty list
		List<PafViewSection> pafViewSections = new ArrayList<PafViewSection>();

		// if auto convert project is true, auto convert using this action
		if (autoConvertViewSections) {

			//1st split view sections
			MigrationAction migrationAction = new PafViewSectionsSeparationMigrationAction(
					confDir);

			if (migrationAction.getStatus().equals(
					MigrationActionStatus.NotStarted)) {

				migrationAction.run();

			}
			
			//2nd copy border value to dataBorder
			MigrationAction pafViwSectionsBorderMigrationAction = new PafViewSectionBorderMigration(confDir);
			
			if (pafViwSectionsBorderMigrationAction.getStatus().equals(MigrationActionStatus.NotStarted)) {
				
				pafViwSectionsBorderMigrationAction.run();
				
			}

		}

		// get ref to conf directory
		File confDirectory = new File(confDir);

		// if conf dir exists
		if (confDirectory != null && confDirectory.exists()
				&& confDirectory.isDirectory()) {

			// get ref to data folder
			File pafViewsDirectory = new File(confDir + File.separator
					+ PafBaseConstants.DN_ViewSectionsFldr);

			// if data folder exists
			if (pafViewsDirectory != null && pafViewsDirectory.exists()
					&& pafViewsDirectory.isDirectory()) {

				// for each data file in data folder
				for (File dataFile : pafViewsDirectory.listFiles()) {

					//if a file and ends with xml
					if ( dataFile.isFile() && dataFile.toString().endsWith(PafBaseConstants.XML_EXT)) {
					
						try {
	
							// import model
							PafViewSection pafViewSection = (PafViewSection) PafXStream
									.importObjectFromXml(dataFile.getAbsolutePath());
						
							// add model to list
							pafViewSections.add(pafViewSection);
	
						} catch (PafConfigFileNotFoundException e) {
	
							logger.warn(dataFile + " file was not found.");
	
						}
						
					}

				}

			}

		} else {

			// do something

		}

		// if size is 0, return null
		if (pafViewSections.size() == 0) {

			return null;

		}

		// convert to array and return
		return pafViewSections.toArray(new PafViewSection[0]);

	}
*/
	/**
	 * 
	 *	Imports rule sets
	 *
	 * @param confDir
	 * @param autoConvertRuleSets
	 * @return
	 */
	/*public static List<RuleSet> importRuleSets(String confDir,
			boolean autoConvertRuleSets) {

		// create empty list
		List<RuleSet> pafRuleSets = new ArrayList<RuleSet>();

		// if auto convert project is true, auto convert using this action
		if (autoConvertRuleSets) {

			MigrationAction migrationAction = new PafRuleSetsSeparationMigrationAction(
					confDir);

			if (migrationAction.getStatus().equals(
					MigrationActionStatus.NotStarted)) {

				migrationAction.run();

			}

		}

		// get ref to conf directory
		File confDirectory = new File(confDir);

		// if conf dir exists
		if (confDirectory != null && confDirectory.exists()
				&& confDirectory.isDirectory()) {

			// get ref to data folder
			File pafRuleSetsDirectory = new File(confDir + File.separator
					+ PafBaseConstants.DN_RuleSetsFldr);

			// if data folder exists
			if (pafRuleSetsDirectory != null && pafRuleSetsDirectory.exists()
					&& pafRuleSetsDirectory.isDirectory()) {

				// for each data file in data folder
				for (File pafRuleSetFile : pafRuleSetsDirectory.listFiles()) {
					
					//if a file and ends with xml
					if ( pafRuleSetFile.isFile() && pafRuleSetFile.toString().endsWith(PafBaseConstants.XML_EXT)) {
					
						try {
	
							// import model
							RuleSet pafRuleSet = (RuleSet) PafXStream
									.importObjectFromXml(pafRuleSetFile
											.getAbsolutePath());
							
							//if ruleset is not null
							if ( pafRuleSet != null ) {
								
								// add model to list
								pafRuleSets.add(pafRuleSet);
								
							}
	
						} catch (PafConfigFileNotFoundException e) {
	
							logger.warn(pafRuleSetFile + " file was not found.");
	
						}
						
					}

				}

			}

		} else {

			// do something

		}

		// if size is 0, return null
		if (pafRuleSets.size() == 0) {

			return null;

		}

		// convert to array and return
		// return pafRuleSets.toArray(new PafViewSection[0]);
		return pafRuleSets;
	}
*/
	/**
	 * 
	 * Method_description_goes_here
	 * 
	 * @param confDir
	 * @param autoConvertProject
	 * @return
	 */
	//@SuppressWarnings("unchecked")
	/*public static Map<String, PafViewGroup> importViewGroups(String confDir,
			boolean autoConvertProject) {

		Map<String, PafViewGroup> viewGroupsMap = null;

		if (autoConvertProject) {

			MigrationAction migrationAction = new PafViewGroupsMigrationAction(
					confDir);

			if (migrationAction.getStatus().equals(
					MigrationActionStatus.NotStarted)) {

				migrationAction.run();

			}

		}

		// get ref to conf directory
		File confDirectory = new File(confDir);

		// if conf dir exists
		if (confDirectory != null && confDirectory.exists()
				&& confDirectory.isDirectory()) {

			// get ref to data folder
			File pafViewGroupsFile = new File(confDir + File.separator
					+ PafBaseConstants.FN_ViewGroups);

			// if data folder exists
			if (pafViewGroupsFile != null && pafViewGroupsFile.exists()
					&& pafViewGroupsFile.isFile()) {

				try {

					// import model
					viewGroupsMap = (HashMap<String, PafViewGroup>) PafXStream
							.importObjectFromXml(pafViewGroupsFile
									.getAbsolutePath());

				} catch (PafConfigFileNotFoundException e) {

					logger.warn(pafViewGroupsFile.getAbsolutePath() + " file was not found.");

				}

			}

		}

		//if still null, create empty hash map
		if (viewGroupsMap == null) {
			
			viewGroupsMap = new HashMap<String, PafViewGroup>();
			
		}

		return viewGroupsMap;
	}
*/
	
	/**
	 * 
	 * Imports the Paf Planner Configs
	 * 
	 * @param confDir
	 * @param autoConvertProject
	 * @return
	 */
	/*public static PafPlannerConfig[] importPlannerConfigs(String confDir,
			boolean autoConvertProject) {

		PafPlannerConfig[] plannerConfigAr = null;

		if (autoConvertProject) {

			//create new migration action
			MigrationAction migrationAction = new PafPlannerConfigMigrationAction(
					confDir);

			//if status is not started, run action
			if (migrationAction.getStatus().equals(
					MigrationActionStatus.NotStarted)) {

				migrationAction.run();

			}

		}

		// get ref to conf directory
		File confDirectory = new File(confDir);

		// if conf dir exists
		if (confDirectory != null && confDirectory.exists()
				&& confDirectory.isDirectory()) {

			// get ref to data folder
			File pafPlannerConfigsFile = new File(confDir + File.separator
					+ PafBaseConstants.FN_PlannerConfigs);

			// if data folder exists
			if (pafPlannerConfigsFile != null && pafPlannerConfigsFile.exists()
					&& pafPlannerConfigsFile.isFile()) {

				try {

					// import model
					plannerConfigAr = (PafPlannerConfig[]) PafXStream
							.importObjectFromXml(pafPlannerConfigsFile
									.getAbsolutePath());

				} catch (PafConfigFileNotFoundException e) {

					PafErrHandler.handleException(e);

				}

			}

		}

		return plannerConfigAr;
	}
*/
	/**
	 * 
	 *	Imports Hierarchy formts.  If autoConvertProject flag is true, will try to convert generation 
	 *	formats to hierarchy formats if not already converted.
	 *
	 * @param confDir				conf directory
	 * @param autoConvertProject	flag to determine if project should autoconvert formats
	 * @return						Map of hierarchy formats.
	 */
	/*@SuppressWarnings("unchecked")
	public static Map<String, HierarchyFormat> importHierarchyFormats(String confDir,
			boolean autoConvertProject) {
		
		//create hierarchy format map
		Map<String, HierarchyFormat> hierarchyFormatMap = null;
		
		//if auto convert project, try to convert gen formats to hier formats
		if ( autoConvertProject ) {

			//run converstion action
			new PafGenerationToHierarchyMigration(confDir).run();
			
		}
		
		try {
			
			//import hierarchy formats
			hierarchyFormatMap = (Map<String, HierarchyFormat>) PafXStream.importObjectFromXml(confDir 
					+ PafBaseConstants.FN_HierarchyFormats);
			
			//if didn't blow up, log success
			logger.info("Successfully imported Hierarchy Formats file");
			
		} catch (PafConfigFileNotFoundException ex) {
			
			//handle if file not found
			PafErrHandler.handleException(ex);
			
		}
		
		//if map is empty, create new tree map
		if ( hierarchyFormatMap == null ) {
			hierarchyFormatMap = new TreeMap<String, HierarchyFormat>(String.CASE_INSENSITIVE_ORDER);
		}
		
		//return hierarchy format map
		return hierarchyFormatMap;
	}*/
	
	/**
	 * 
	 *  Imports the user security file
	 *
	 * @param confDir				conf directory
	 * @param autoConvertProject	flag to determine if project should autoconvert formats
	 * @return						Array of paf security users
	 */
	/*public static PafUserSecurity[]  importUserSecurity(String confDir,
			boolean autoConvertProject) {
		
		PafUserSecurity[] users = null;
		
		//if auto convert project
		if ( autoConvertProject) {
			
			//run security migration
			new PafSecurityMigrationAction(confDir).run();
			
		}
		
		//try to import the users
		try {
			users = (PafUserSecurity[]) PafXStream
					.importObjectFromXml(confDir
							+ PafBaseConstants.FN_SecurityMetaData);
		} catch (PafConfigFileNotFoundException ex) {
			PafErrHandler.handleException(ex);
		}
		
		return users;
		
	}
*/
	/**
	 * 
	 *  Imports the paf apps
	 *
	 * @param confDir				conf directory
	 * @param autoConvertProject	flag to determine if project should autoconvert applications
	 * @return						Array of paf applications
	 */
	/*public static PafApplicationDef[]  importApplications(String confDir,
			boolean autoConvertProject) {
				
		return importApplications(confDir, autoConvertProject, null);
		
	}*/
	
	/**
	 * 
	 *  Imports the paf apps
	 *
	 * @param confDir				conf directory
	 * @param autoConvertProject	flag to determine if project should autoconvert applications
	 * @param attributeDimensions	array of attribute dimension names
	 * @return						Array of paf applications
	 */
	/*public static PafApplicationDef[]  importApplications(String confDir,
			boolean autoConvertProject, String[] attributeDimensions) {
				
		//if auto convert project
		if ( autoConvertProject) {
			
			//run migration
			PafAppsMigrationAction migrationAction = new PafAppsMigrationAction(confDir);
			
			if ( attributeDimensions != null && attributeDimensions.length > 0 ) {
			
				migrationAction.setAttributeDimensionNames(attributeDimensions);
				
			}			
			
			migrationAction.run();
			
		}
		
		PafApplicationDef[] pafApps = null; 
		
		File confDirectory = new File(confDir);
		
//		 if conf dir exists
		if (confDirectory != null && confDirectory.exists()
				&& confDirectory.isDirectory()) {
			
			
			//try to import applications
			try {
				pafApps = (PafApplicationDef[]) PafXStream
						.importObjectFromXml(confDir
								+ PafBaseConstants.FN_ApplicationMetaData);
			} catch (PafConfigFileNotFoundException ex) {
				PafErrHandler.handleException(ex);
			}
			
		}
		return pafApps;
		
	}*/

	/**
	 * 
	 *  Imports the global styles file
	 *
	 * @param confDir				conf directory
	 * @param autoConvertProject	flag to determine if project should autoconvert formats
	 * @return						map of paf styles
	 */
	//@SuppressWarnings("unchecked")
	/*public static Map<String, PafStyle>  importGlobalStyles(String confDir,
			boolean autoConvertProject) {
		
		Map<String, PafStyle> globalStylesMap = null;
		
		//if auto convert project
		if ( autoConvertProject) {
			
			//run global Styles migration action
			new PafGlobalStylesMigrationAction(confDir).run();
			
		}
		
		File confDirectory = new File(confDir);
		
//		 if conf dir exists
		if (confDirectory != null && confDirectory.exists()
				&& confDirectory.isDirectory()) {
		
			//try to import the styles
			try {
				globalStylesMap = (Map<String, PafStyle>) PafXStream
						.importObjectFromXml(confDir + File.separator
								+ PafBaseConstants.FN_GlobalStyleMetaData);
			} catch (PafConfigFileNotFoundException ex) {
				PafErrHandler.handleException(ex);
			}
			
		}
		return globalStylesMap;
		
	}*/
	
	/**
	 * 
	 *  Imports dynamic members
	 *
	 * @param confDir				conf directory
	 * @param autoConvertProject	flag to determine if project should autoconvert dynamic members
	 * @return						Array of Dynamic Members
	 */
	/*public static DynamicMemberDef[]  importDynamicMembers(String confDir,
			boolean autoConvertProject) {
		
		 DynamicMemberDef[] dynamicMembers = null;
		 
		 if ( autoConvertProject ) {
			 new PafDynamicMembersMigrationAction(confDir).run();
		 }
		 
		 
		 File confDirectory = new File(confDir);
			
		 //if conf dir exists
		if (confDirectory != null && confDirectory.exists()
				&& confDirectory.isDirectory()) {
			
			//try to import the styles
			try {
				dynamicMembers = (DynamicMemberDef[]) PafXStream
						.importObjectFromXml(confDir + File.separator
								+ PafBaseConstants.FN_DynamicMembers);
			} catch (PafConfigFileNotFoundException ex) {
				PafErrHandler.handleException(ex);
			}			
			
		}		 
		 
		return dynamicMembers;
				
	}*/
		
	/**
	 *  Imports member tags
	 *
	 * @param confDir conf directory
	 * @param autoConvertProject flag to determine if project should auto convert member tags
	 * 
	 * @return Array of member tags
	 */
	public static MemberTagDef[]  importMemberTags(String confDir, boolean autoConvertProject) {

		MemberTagDef[] memberTags = null;

		File confDirectory = new File(confDir);

		//if conf dir exists
		if (confDirectory != null && confDirectory.exists() && confDirectory.isDirectory()) {

			//try to import the member tags
			Class type = MemberTagDef[].class;
			String location = confDir + File.separator + PafBaseConstants.FN_MemberTagMetaData;
			try {
				logger.info("Importing " + type.getSimpleName() + " from " + location);
				memberTags = (MemberTagDef[]) PafXStream.importObjectFromXml(location);
				logger.info("Successfully imported " + type.getSimpleName());
				
			} catch (PafConfigFileNotFoundException ex) {
				
				PafErrHandler.handleException(ex, PafErrSeverity.Warning);
				
			} 
		}		 

		return memberTags;

	}


	
	
	
	
	/**
	 * Exports views.
	 * @param pafViews Views to export.
	 * @param confDir conf directory
	 * @param deleteAllFiles true to delete all view files, false to just delete the view files
	 * that are going to be exported.
	 */
	public static void exportViews(PafView[] pafViews, String confDir, boolean deleteAllFiles) {

		if (pafViews != null) {

			//views directory
			File pafViewsDirectory = new File(confDir + File.separator
					+ PafBaseConstants.DN_ViewsFldr);

			//if the dir doesn't exists, then make the directory, otherwise recursivly delete all files in dir
			if (!pafViewsDirectory.exists()) {

				pafViewsDirectory.mkdir();

			} else {

				if(deleteAllFiles){
					FileUtils.deleteFilesInDir(pafViewsDirectory, false);
				} 
			}

			//if view dir exists and is a directory
			if (pafViewsDirectory.exists() && pafViewsDirectory.isDirectory()) {

				// loop over views and write each out to its own filename
				for (PafView pafView : pafViews) {

					// generated file name off of view name
					String generatedFileName = MigrateServerUtil
							.generateFileName(pafView.getName())
							+ PafBaseConstants.XML_EXT;
					
					logger.info("Creating file " + generatedFileName);
										
					//we are not deleting all files so just delete the selected files...
					if(!deleteAllFiles){
						FileUtils.deleteFilesInDir(pafViewsDirectory, new String[] {generatedFileName});
					}
					
					// write to disk
					PafXStream.exportObjectToXml(pafView, pafViewsDirectory
							.toString()
							+ File.separator + generatedFileName);

				}

			}

		}

	}


	/**
	 * Exports View Sections
	 * @param pafViewSections View Sections to export.
	 * @param confDir conf directory
	 * @param deleteAllFiles true to delete all view section files, false to just delete the 
	 * view section files that are going to be exported.
	 */
	public static void exportViewSections(PafViewSection[] pafViewSections,
			String confDir, boolean deleteAllFiles) {

		if (pafViewSections != null) {

			//view section dir
			File pafViewSectionsDirectory = new File(confDir + File.separator
					+ PafBaseConstants.DN_ViewSectionsFldr);

			//if the dir doesn't exists, create dir, otherwise delete all files in dir
			if (!pafViewSectionsDirectory.exists()) {

				pafViewSectionsDirectory.mkdir();

			} else {
				if(deleteAllFiles){
					FileUtils.deleteFilesInDir(pafViewSectionsDirectory, false);
				}

			}

			if (pafViewSectionsDirectory.exists()
					&& pafViewSectionsDirectory.isDirectory()) {

				// loop over view sections and write each out to its own
				// filename
				for (PafViewSection pafViewSection : pafViewSections) {

					// generated file name off of view name
					String generatedFileName = MigrateServerUtil
							.generateFileName(pafViewSection.getName())
							+ PafBaseConstants.XML_EXT;

					logger.info("Creating file " + generatedFileName);

					PafXStream.setMode(XStream.NO_REFERENCES);
					
					//we are not deleting all files so just delete the selected files...
					if(!deleteAllFiles){
						FileUtils.deleteFilesInDir(pafViewSectionsDirectory, 
								new String[] {generatedFileName});
					}
					
					// write to disk
					PafXStream.exportObjectToXml(pafViewSection,
							pafViewSectionsDirectory.toString()
									+ File.separator + generatedFileName);

				}

			}

		}

	}
	
	/**
	 * Deletes all view section files.
	 * @param pafViewSections Paf view sections to delete.
	 * @param confDir Paf view section conf directory.
	 */
	public static void deleteViewSections(String[] pafViewSections,
			String confDir){
		
		if (pafViewSections != null) {
			
			//view section dir
			File pafViewSectionsDirectory = new File(confDir + File.separator
					+ PafBaseConstants.DN_ViewSectionsFldr);
			
			deleteFiles(pafViewSections, pafViewSectionsDirectory);
			
		}

	}
	
	/**
	 * Deletes all view section files.
	 * @param pafViewSections Paf view sections to delete.
	 * @param confDir Paf view section conf directory.
	 */
	public static void deleteViews(String[] pafViews, String confDir){
		
		if (pafViews != null) {
			
			//view dir
			File pafViewSectionsDirectory = new File(confDir + File.separator
					+ PafBaseConstants.DN_ViewsFldr);
			
			deleteFiles(pafViews, pafViewSectionsDirectory);
			
		}

	}
	
	/**
	 * Deletes an array of files.
	 * @param filesToDel Array of files to delete.
	 * @param directory Directory that contains the files.
	 */
	private static void deleteFiles(String[] filesToDel, File directory){
		
		if (filesToDel != null) {
			
			if (directory.exists()
					&& directory.isDirectory()) {
				// loop over view sections and write each out to its own
				// filename
				for (String file : filesToDel) {
					
					// generated file name off of view name
					String generatedFileName = MigrateServerUtil
							.generateFileName(file)
							+ PafBaseConstants.XML_EXT;

					//we are not deleting all files so just delete the selected files...
					FileUtils.deleteFilesInDir(directory, 
							new String[] {generatedFileName});
				}
				
			}
			
		}
		
	}

	
	/**
	 * 
	 *	exports rule sets
	 *
	 * @param ruleSets
	 * @param confDir
	 */
	public static void exportRuleSets(List<RuleSet> ruleSets, String confDir) {

		if (ruleSets != null) {

			File pafRuleSetsDirectory = new File(confDir + File.separator
					+ PafBaseConstants.DN_RuleSetsFldr);

			if (!pafRuleSetsDirectory.exists()) {

				pafRuleSetsDirectory.mkdir();

			} else {

				FileUtils.deleteFilesInDir(pafRuleSetsDirectory, false);

			}

			if (pafRuleSetsDirectory.exists()
					&& pafRuleSetsDirectory.isDirectory()) {

				// loop over view sections and write each out to its own
				// filename
				for (RuleSet ruleSet : ruleSets) {

					// generated file name off of view name
					String generatedFileName = MigrateServerUtil
							.generateFileName(ruleSet.getName())
							+ PafBaseConstants.XML_EXT;

					logger.info("Creating file " + generatedFileName);

					PafXStream.setMode(XStream.NO_REFERENCES);
					
					// write to disk
					PafXStream.exportObjectToXml(ruleSet, pafRuleSetsDirectory
							.toString()
							+ File.separator + generatedFileName);

				}

			}

		}

	}

	/**
	 * 
	 *	Exports view Groups
	 *
	 * @param pafViewGroups
	 * @param confDir
	 */
	public static void exportViewGroups(Map<String, PafViewGroup> pafViewGroups, String confDir) {
		
			PafXStream.exportObjectToXml(pafViewGroups, confDir + File.separator + PafBaseConstants.FN_ViewGroups);

	}
	
	/**
	 * 
	 *	Exports paf planner configs
	 *
	 * @param pafViewGroups
	 * @param confDir
	 */
	public static void exportPlannerConfigs(PafPlannerConfig[] pafPlannerConfigs, String confDir) {
				
		PafXStream.exportObjectToXml(pafPlannerConfigs, confDir + File.separator + PafBaseConstants.FN_PlannerConfigs);

	}
	
	/**
	 * 
	 *	Exports Global Styles
	 *
	 * @param globalStylesMap	global style map, key = name of global style, value = pafStyle
	 * @param confDir
	 */
	public static void exportGlobalStyles(Map<String, PafStyle> globalStylesMap, String confDir) {
		
		PafXStream.exportObjectToXml(globalStylesMap, confDir + File.separator + PafBaseConstants.FN_GlobalStyleMetaData);

	}
	
	/**
	 * 
	 *	Exports Dynamic Members
	 *
	 * @param dynamicMembers	Array of dynamic members
	 * @param confDir
	 */
	public static void exportDynamicMembers(DynamicMemberDef[] dynamicMembers, String confDir) {
				
		PafXStream.exportObjectToXml(dynamicMembers, confDir + File.separator + PafBaseConstants.FN_DynamicMembers);

	}
		

	public static void main(String[] args) {
		
		
		/*List<RuleSet> ruleSets = PafImportExportUtility.importRuleSets("c:\\tmp\\carl\\rule_xmls", true);
		
		for ( RuleSet rs : ruleSets ) {
			
			for ( RuleGroup rg : rs.getRuleGroups() ) {
			
				for ( Rule r : rg.getRules()) {
					
					System.out.println(rs.getName() + ": " + r.getBaseAllocateMeasure());
					System.out.println(rs.getName() + ": " + r.getFormula().getExpression());
					
				}
				
			}
			
		}*/
		
		
		
	}
	
}
