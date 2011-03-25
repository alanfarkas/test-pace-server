/*
 *	File: @(#)MigrateServerUtil.java 	Package: com.pace.base.utility 	Project: Paf Base Libraries
 *	Created: Jan 4, 2007  		By: jmilliron
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
package com.pace.base.utility;

import com.pace.base.migration.*;
import com.pace.base.project.InvalidPaceProjectInputException;
import com.pace.base.project.PaceProjectCreationException;
import com.pace.base.project.XMLPaceProject;

/**
 * Migration Utility that will migrate one version of the conf directory to the next.
 *
 * @author jmilliron
 * @version	1.00
 *
 */
public class MigrateServerUtil {

	/**
	 * 
	 *	Calls all the migration actions needed to be ran for migration.
	 *
	 * @param pafServerHome Server home directory
	 */
	public static void MigrateServer(String pafServerHome) {
				
		//if server home is not null and something is present in string
		if ( pafServerHome != null && pafServerHome.trim().length() > 0) {
			
			//get server migration actioins
			MigrationAction[] migrationActions = getMigrationActions(pafServerHome);
			
			//if actions exists
			if ( migrationActions != null ) {
			
				//for each migration, if not started, run
				for (MigrationAction migrationAction : migrationActions) {
				
					if ( migrationAction.getStatus().equals(MigrationActionStatus.NotStarted)) {
					
						migrationAction.run();
						
					}					
				}		
				
			}			
			
		}		
		
	}
	
	/**
	 * 
	 *	Creates the migration actions.
	 *
	 * @param pafServerHome Server home directory.
	 * @return An array of migration actions.
	 */
	private static MigrationAction[] getMigrationActions(String pafServerHome) {
		
		XMLPaceProject xmlPaceProject = null;
		try {
			xmlPaceProject = new XMLPaceProject(pafServerHome, true);
		} catch (InvalidPaceProjectInputException e) {
			e.printStackTrace();
		} catch (PaceProjectCreationException e) {
			e.printStackTrace();
		}
		
		return new MigrationAction[] { new PafViewsSeparationMigrationAction(xmlPaceProject),
				new PafViewSectionsSeparationMigrationAction(xmlPaceProject),
				new PafRuleSetsSeparationMigrationAction(xmlPaceProject)};		
		
	}
	
	/**
	 * 
	 *	Generates a file named based off of the string passed in.
	 *
	 * @param origFileName string to use to generated file name
	 * @return generated file name
	 */
	public static String generateFileName(String origFileName) {
		
		// Replace all characters that invalidate the file name by a space
		
		origFileName = origFileName.replaceAll("\\p{Cntrl}"," ").replaceAll("[\\<\\>\\\\:\\*\\?\"\\/\\|]", " ");
		
		// Trim file name 
		String generatedFileName = origFileName.trim(); /* TTN-1153 - removed lower case conversion logic */
		
		//consolidate spaces and then replace with _
		generatedFileName = generatedFileName.replaceAll("[ ]+", "_");
	
		//return new filename
		return generatedFileName;
		
	}
	
}
