/*
 *	File: @(#)PafViewGroupsMigrationAction.java 	Package: com.pace.base.migration 	Project: Paf Base Libraries
 *	Created: Jan 25, 2007  		By: jmilliron
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
package com.pace.base.migration;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.pace.base.PafBaseConstants;
import com.pace.base.PafConfigFileNotFoundException;
import com.pace.base.comm.PafViewTreeItem;
import com.pace.base.project.ProjectElementId;
import com.pace.base.project.ProjectSaveException;
import com.pace.base.project.XMLPaceProject;
import com.pace.base.utility.FileUtils;
import com.pace.base.utility.PafXStream;
import com.pace.base.view.PafViewGroup;
import com.pace.base.view.PafViewGroupItem;

/**
 * Class_description_goes_here
 *
 * @author jmilliron
 * @version	x.xx
 *
 */
public class PafViewGroupsMigrationAction extends MigrationAction {

	private static Logger logger = Logger.getLogger(PafViewGroupsMigrationAction.class);
	
	private String confDirectory = null;
	
	public PafViewGroupsMigrationAction(XMLPaceProject xmlPaceProject) {
		
		this.xmlPaceProject = xmlPaceProject;
		
		if ( this.xmlPaceProject != null ) {
			
			confDirectory = this.xmlPaceProject.getProjectInput();
			
		}
	}
	
	/* (non-Javadoc)
	 * @see com.pace.base.migration.IMigrationAction#getActionName()
	 */
	public String getActionName() {
		return "Convert " + PafBaseConstants.FN_ViewGroups;
	}

	/* (non-Javadoc)
	 * @see com.pace.base.migration.IMigrationAction#getStatus()
	 */
	public MigrationActionStatus getStatus() {
		
		//set defaul status to not started
		MigrationActionStatus status = MigrationActionStatus.NotStarted;
		
		//if server home directory location is specified
		if ( confDirectory != null) {
						
			//get file reference to paf_view_grups.xml file
			File pafViewGroupsFile = new File(confDirectory + File.separator + PafBaseConstants.FN_ViewGroups);
			
			//if the file exits
			if ( pafViewGroupsFile.exists() ) {
			
				try {
					
					//try to import the object from the file.
					Object object = PafXStream.importObjectFromXml(pafViewGroupsFile.toString());
					
					//cast into a hash map
					Map map = (HashMap) object;
					
					//if map exist and the map size is greater than 0
					if ( map != null && map.size() > 0 ) {
						
						//get the object value from map
						Object objectValue = map.get(map.keySet().toArray()[0]);
						
						//if instance of a pafViewgroup, then the migration has already been completed.
						if ( objectValue instanceof PafViewGroup ) {
							
							status = MigrationActionStatus.Completed;
							
						}
						
					} else if ( map != null && map.size() == 0 ) {
						
						status = MigrationActionStatus.Completed;
						
					}
					
				} catch (PafConfigFileNotFoundException e) {
					//do nothing
				}
				
			} else {
				
				//status = MigrationActionStatus.Completed;
				
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
			
			//get old model
			Map<String, PafViewTreeItem> oldModel = new HashMap<String, PafViewTreeItem>();

			//create new empty model			
			Map<String, PafViewGroup> viewGroupMap = new HashMap<String, PafViewGroup>();
			
			File pafViewGroupsFile = new File(confDirectory + File.separator + PafBaseConstants.FN_ViewGroups);
									
			if ( pafViewGroupsFile != null && pafViewGroupsFile.exists() ){
				
				//try to backup orig file
				try {
					FileUtils.copy(pafViewGroupsFile, new File(pafViewGroupsFile.toString() + PafBaseConstants.BAK_EXT));
				} catch (IOException e1) {
					logger.error("Couldn't backup file " + pafViewGroupsFile.toString() + ". Error: " + e1.getMessage());
				} 
			
				//import model
				try {
					
					oldModel = (HashMap<String, PafViewTreeItem>) PafXStream.importObjectFromXml(pafViewGroupsFile.toString());
					
				} catch (PafConfigFileNotFoundException e) {
					
				} 
							
				//if old model exists and has elements in map
				if ( oldModel != null && oldModel.size() > 0) {
					
					//loop through first level of keys and create new model elements
					for ( String key : oldModel.keySet()) {
						
						//old model item
						PafViewTreeItem pafViewTreeItem = (PafViewTreeItem) oldModel.get(key);
						
						//new model item
						PafViewGroup pafViewGroup = new PafViewGroup(pafViewTreeItem.getLabel(), pafViewTreeItem.getDesc());
						
						//old model item's children
						PafViewTreeItem[] children = pafViewTreeItem.getItems();
						
						//new model item's children
						PafViewGroupItem[] viewGroupItems = null;
						
						//if children are present in old model, create new model children elements
						if ( children != null && children.length > 0) {
							
							viewGroupItems = new PafViewGroupItem[children.length]; 
							
							int ndx = 0;
							
							for (PafViewTreeItem child : children ) {
								
								viewGroupItems[ndx++] = new PafViewGroupItem(child.getLabel(), child.isGroup());
								
							}
							
						}
						
						//set the children on new model
						pafViewGroup.setPafViewGroupItems(viewGroupItems);
						
						//if the map key doesn't equal value key, fix
						//TTN-702
						if ( ! key.equals(pafViewGroup.getName())) {
							
							logger.warn("View Group '" + key +"' doesn't match object name '" + pafViewGroup.getName() +"'.  Setting name to view group name.");
							
							pafViewGroup.setName(key);
							
						}
						
						//add to new model map
						viewGroupMap.put(key, pafViewGroup);					
						
					}
					
				}		
				
				//Export to file system
				PafXStream.exportObjectToXml(viewGroupMap, pafViewGroupsFile.toString());
				
				xmlPaceProject.setViewGroups(viewGroupMap);
				
				try {
					xmlPaceProject.save(ProjectElementId.ViewGroups);
				} catch (ProjectSaveException e) {
					
					logger.error(e.getMessage());
					throw new RuntimeException(e.getMessage());
					
				}
				
			}
		}

	}
	

}
