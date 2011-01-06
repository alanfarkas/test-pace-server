/*
 *	File: @(#)PafDynamicMembersMigrationAction.java 	Package: com.palladium.paf.migration 	Project: Paf Base Libraries
 *	Created: Sept 11, 2007  		By: jmilliron
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
package com.palladium.paf.migration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.apache.log4j.Logger;

import com.palladium.paf.PafBaseConstants;
import com.palladium.paf.app.DynamicMemberDef;
import com.palladium.paf.app.PafApplicationDef;
import com.palladium.paf.project.ProjectElementId;
import com.palladium.paf.project.ProjectSaveException;
import com.palladium.paf.project.XMLPaceProject;

/**
 * If paf_dynamic_members.xml file doesn't exist or @PLAN_VERSION isn't in the 
 * xml file, it will ad it
 *
 * @author jmilliron
 * @version	1.00
 *  */
public class PafDynamicMembersMigrationAction extends MigrationAction {

	private static Logger logger = Logger.getLogger(PafDynamicMembersMigrationAction.class);
			
	private PafApplicationDef pafApp = null;
	
	/**
	 * Constructor - creates instance of PafSecurityMigrationAction
	 * 
	 * @param serverHomeDir
	 *            Home directory of the server.
	 */
	public PafDynamicMembersMigrationAction(XMLPaceProject xmlPaceProject) {

		this.xmlPaceProject = xmlPaceProject;
				
		if ( this.xmlPaceProject != null ) {
		
			boolean currentUpgradeProject = this.xmlPaceProject.isUpgradeProject();
			
			//turn off current upgrad project flag, but save current value for later reset
			this.xmlPaceProject.setUpgradeProject(false);
						
			List<PafApplicationDef> pafAppList = this.xmlPaceProject.getApplicationDefinitions();
			
			if ( pafAppList.size() == 1 ) {
				
				pafApp = pafAppList.get(0);
				
			}
					
			this.xmlPaceProject.setUpgradeProject(currentUpgradeProject);
		}
	}

	
	/* (non-Javadoc)
	 * @see com.palladium.paf.migration.IMigrationAction#getActionName()
	 */
	public String getActionName() {
		
		return "Update Dynamic Members with " + PafBaseConstants.PLAN_VERSION + " tag.";
	}

	/* (non-Javadoc)
	 * @see com.palladium.paf.migration.IMigrationAction#getStatus()
	 */
	public MigrationActionStatus getStatus() {
		
		
		//if server home directory location is specified
		if (xmlPaceProject != null) {

			//if pafapp is null, fail
			if ( pafApp == null ) {
				
				logger.error("Can not migrate dynamic members because the Paf Application Def is null.");
				
				//return failed if could not read in paf apps.				
				return MigrationActionStatus.Failed;
				
			} else if ( pafApp.getMdbDef() == null ) {
								
				logger.error("Can not migrate dynamic members because the Paf Application Def's MDB Def is null.");
				
				//return failed if could not read in paf apps.				
				return MigrationActionStatus.Failed;
			}
			
			DynamicMemberDef[] dynmaicMemberDefs = getDynamicMemberDefs();			
			
			if ( dynmaicMemberDefs == null ) {
				
				return MigrationActionStatus.NotStarted;
				
			}			
										
			//ver version dimension name
			String versionDimension = pafApp.getMdbDef().getVersionDim();			
				
			boolean versionEntryCompleted = false;
			
			//loop keys and look for version dimension key
			for (DynamicMemberDef dynamicMemberDef : dynmaicMemberDefs ) {
													
				//if key is version dim key
				if ( dynamicMemberDef.getDimension().equalsIgnoreCase(versionDimension) ) {						
						
						//loop the member spects, look for plan version tag.  If found, return completed.
						for (String memberSpec : dynamicMemberDef.getMemberSpecs() ) {
							
							if ( memberSpec.equals(PafBaseConstants.PLAN_VERSION) ) {
								
								versionEntryCompleted = true;
								
							}
							
						}
						
						
				} else {
					
					//loop the member spects and find any dynamic member defs that have a 
					//member spec with @PLAN_VERSION tag yet dynamic member def dim wasn't
					//version from paf apps.
					for (String memberSpec : dynamicMemberDef.getMemberSpecs() ) {
						
						if ( memberSpec.contains(PafBaseConstants.PLAN_VERSION) ) {
							
							return MigrationActionStatus.NotStarted;
							
						}
						
					}
					
				}
							
			}
			
			//if version entry exists and another old version entry doesn't
			if ( versionEntryCompleted ) {
				
				return MigrationActionStatus.Completed;
				
			}
			
		
		}
		
		return MigrationActionStatus.NotStarted;
		
	}

	private DynamicMemberDef[] getDynamicMemberDefs() {
		
		DynamicMemberDef[] dynamicMemberDefAr = null;
		
		boolean currentUpgradeProject = this.xmlPaceProject.isUpgradeProject();
		
		//turn off current upgrade project flag, but save current value for later reset
		this.xmlPaceProject.setUpgradeProject(false);
						
		List<DynamicMemberDef> dynamicMemberDefList = xmlPaceProject.getDynamicMembers();
		
		//put project update flag back to initial value
		this.xmlPaceProject.setUpgradeProject(currentUpgradeProject);
		
		if ( dynamicMemberDefList.size() > 0 ) {
			
			dynamicMemberDefAr = dynamicMemberDefList.toArray(new DynamicMemberDef[0]);
			
		}
		
		return dynamicMemberDefAr;
	}
	
	/* (non-Javadoc)
	 * @see com.palladium.paf.migration.IMigrationAction#run()
	 */
	public void run() {
		
		//if not started
		if ( getStatus().equals(MigrationActionStatus.NotStarted)) {
		
			//import dynamic members
			DynamicMemberDef[] dynmaicMemberDefs = getDynamicMemberDefs();
			
			//get version dimension
			String versionDimension = pafApp.getMdbDef().getVersionDim();
			
			//create empty list to hold dynamic member definitons
			Map<String, DynamicMemberDef> dynamicMemberDefMap = new HashMap<String, DynamicMemberDef>();
			
			//if null, means no dynamic members exist, so create the default and add to list.
			if ( dynmaicMemberDefs == null ) {
				
				dynamicMemberDefMap.put(versionDimension, new DynamicMemberDef(versionDimension, new String[] { PafBaseConstants.PLAN_VERSION }));
				
			//else, loop through dynamic members and see if @PLAN_VERSION is in the member specs.  If not, add.
			} else {
		
				for (DynamicMemberDef dynamicMemberDef : dynmaicMemberDefs ) {
										
					if ( ! dynamicMemberDef.getDimension().equalsIgnoreCase(versionDimension)) {
						
						//biz rule is that @PLAN_VERSION must be in dynamic member for version.
						//if @PLAN_VERSION is in member but dim is not version from paf apps, update dim.
						
						for (String memberSpecs : dynamicMemberDef.getMemberSpecs()) {
							
							//if member spec contains the plan version
							if ( memberSpecs.contains(PafBaseConstants.PLAN_VERSION) ) {
								
								dynamicMemberDef.setDimension(versionDimension);
								
								break;
								
							}
							
						}
						
					}
					
					//if map already contains dynamic member, then merge the member specs
					if ( dynamicMemberDefMap.containsKey(dynamicMemberDef.getDimension())) {
						
						DynamicMemberDef existingDynamicMemberDef = dynamicMemberDefMap.get(dynamicMemberDef.getDimension());
						
						Set<String> existingMemberSpecsSet = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
						
						if ( existingDynamicMemberDef != null && existingDynamicMemberDef.getMemberSpecs() != null ) {
							
							existingMemberSpecsSet.addAll(Arrays.asList(existingDynamicMemberDef.getMemberSpecs()));
							
						}
						
						if ( dynamicMemberDef.getMemberSpecs() != null ) {
							
							existingMemberSpecsSet.addAll(Arrays.asList(dynamicMemberDef.getMemberSpecs()));
							
						}
					
						if ( existingMemberSpecsSet.size() == 0 ) {
							
							dynamicMemberDef.setMemberSpecs(null);
							
						} else {
						
							dynamicMemberDef.setMemberSpecs(existingMemberSpecsSet.toArray(new String[0]));
							
						}												
						
					}
										
					dynamicMemberDefMap.put(dynamicMemberDef.getDimension(), dynamicMemberDef);
				}
								
			}			
			
			DynamicMemberDef versionMemberDef = dynamicMemberDefMap.get(versionDimension);
			
			//add @PLAN_VERSION if not in member spec
			if ( versionMemberDef != null ) {
				
				boolean isPlanVersionFound = false;
				
				List<String> memberSpecList = new ArrayList<String>();
				
				//loop
				for (String memberSpec : versionMemberDef.getMemberSpecs() ) {
					
					//if plan version is found, set flag to true
					if ( memberSpec.equals(PafBaseConstants.PLAN_VERSION)) {
					
						isPlanVersionFound = true;									
						
					}	
					
					//add member spec to member spec list
					memberSpecList.add(memberSpec);
				}
				
				//if plan version was not found, add to list
				if ( ! isPlanVersionFound ) {
					
					//add 1st in list
					memberSpecList.add(0, PafBaseConstants.PLAN_VERSION);
					
				}
								
				//set member specs on the dynamic member def
				versionMemberDef.setMemberSpecs(memberSpecList.toArray(new String[0]));
				
				dynamicMemberDefMap.put(versionDimension, versionMemberDef);
				
			}
			
			
			//export the dynamic member defs
			//PafImportExportUtility.exportDynamicMembers(dynamicMemberDefMap.values().toArray(new DynamicMemberDef[0]), confDirectory);
			
			xmlPaceProject.setDynamicMembers(new ArrayList<DynamicMemberDef>(dynamicMemberDefMap.values()));
			
			try {
				xmlPaceProject.save(ProjectElementId.DynamicMembers);
			} catch (ProjectSaveException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}		

	}
	
}
