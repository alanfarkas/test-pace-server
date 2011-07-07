/*
 *	File: @(#)CustomMenuDefActionClassNameMigrationAction.java
 * 	Package: com.pace.base.migration 	
 *  Project: Paf Base Libraries
 *  Created: July 07, 2011  		
 *  By: themoosman
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2011 A&M Software, Inc. All rights reserved.
 *
 *	This software is the confidential and proprietary information of Palladium Group, Inc.
 *	("Confidential Information"). You shall not disclose such Confidential Information and 
 * 	should use it only in accordance with the terms of the license agreement you entered into
 *	with A&M Software, Inc.
 */
package com.pace.base.migration;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import com.pace.base.PafBaseConstants;
import com.pace.base.app.CustomActionDef;
import com.pace.base.comm.CustomMenuDef;
import com.pace.base.project.PaceProjectReadException;
import com.pace.base.project.PafXStreamElementItem;
import com.pace.base.project.ProjectElementId;
import com.pace.base.project.ProjectSaveException;
import com.pace.base.project.XMLPaceProject;
import com.pace.base.utility.FileUtils;

/**
 * Updates the CustomFunctionDef class name from any version of pace from 1.0 - 2.8.1.1 to the current
 * version.
 **/
public class CustomMenuDefActionClassNameMigrationAction extends MigrationAction {
	
	private static Logger logger = Logger.getLogger(CustomMenuDefActionClassNameMigrationAction.class);

	private static final String SEARCH_NS_1 = "com.palladium.paf.cc";

	private static final String REPLACE_NS_1 = "com.pace.ext.cmds";
	
	
	public CustomMenuDefActionClassNameMigrationAction(XMLPaceProject xmlPaceProject) {
		this.xmlPaceProject = xmlPaceProject;
	}

	@Override
	public String getActionName() {
		return "Convert CustomMenuDef action class name to new namespace pattern..";
	}

	@Override
	public MigrationActionStatus getStatus()  {
		
		// if server home directory location is specified
		if (xmlPaceProject != null) {		
			
			List<CustomMenuDef> customMenus = null;
			try {
				customMenus = readCustomMenus();
			} catch (PaceProjectReadException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			//if map not null
			if ( customMenus != null ) {				
				
				//loop through styles, see if any fill color are not null
				for (CustomMenuDef customMenu : customMenus) {
					if(customMenu.getCustomActionDefs() != null){
						for(CustomActionDef actionDef : customMenu.getCustomActionDefs()){
							if ( actionDef.getActionClassName().contains(SEARCH_NS_1) ) {
								return MigrationActionStatus.NotStarted;
							} 
						}
					}
				}
				//get this far, it's completed
				return MigrationActionStatus.Completed;
			}	
		} 

		return MigrationActionStatus.NotStarted;
	}

	@Override
	public void run() {
		
		if (getStatus().equals(MigrationActionStatus.Completed)) {
			return;
		}
		
		
		//get input file
		File inputFile = getInputFile(PafBaseConstants.FN_CustomMenus);
					
		if ( inputFile != null && inputFile.isFile() && inputFile.canRead() ) {
			
			//try to backup orig file
			try {
				FileUtils.copy(inputFile, new File(inputFile.toString() + PafBaseConstants.BAK_EXT));
			} catch (IOException e1) {
				logger.error("Couldn't backup file " + inputFile.toString() + ". Error: " + e1.getMessage());
			} 
					
		}
		
		List<CustomMenuDef> customMenus = null;
		try {
			customMenus = readCustomMenus();
		} catch (PaceProjectReadException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//create a new Dictionary with the new style PafStyle
		List<CustomMenuDef> customMenusToSet = new ArrayList<CustomMenuDef>();
		
		//iterate thru the old style map and convert the PafStyle.
		for (CustomMenuDef customMenu : customMenus) {
			if(customMenu.getCustomActionDefs() != null){
				for(CustomActionDef actionDef : customMenu.getCustomActionDefs()){
					String s = null;
					if ( actionDef.getActionClassName().contains(SEARCH_NS_1) ) {
						s = actionDef.getActionClassName().replace(SEARCH_NS_1, REPLACE_NS_1);
						logger.info("Converting CustomMenuDef action className: '" + actionDef.getActionClassName() +  "' to '" + s + "'");
						actionDef.setActionClassName(s);
					} 
				}
			}
			
			customMenusToSet.add(customMenu);
		}
		
		//export updated global styles
		xmlPaceProject.setCustomMenus(customMenusToSet);
		try {
			xmlPaceProject.save(ProjectElementId.CustomMenus);
		} catch (ProjectSaveException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	
	private List<CustomMenuDef> readCustomMenus() throws PaceProjectReadException {
		
		PafXStreamElementItem<CustomMenuDef[]> pafXStreamElementItem = new PafXStreamElementItem<CustomMenuDef[]>(xmlPaceProject.getProjectInput() + PafBaseConstants.FN_CustomMenus);
		
		CustomMenuDef[] objectAr = pafXStreamElementItem.read();
			
		return Arrays.asList(objectAr);
		
	}
}
