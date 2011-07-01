/*
 *	File: @(#)PafGlobalStylesClassNameMigrationAction 	Package: com.pace.base.migration 	Project: Paf Base Libraries
 * 
 */
package com.pace.base.migration;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.pace.base.PafBaseConstants;
import com.pace.base.project.PaceProjectReadException;
import com.pace.base.project.PafXStreamElementItem;
import com.pace.base.project.ProjectElementId;
import com.pace.base.project.ProjectSaveException;
import com.pace.base.project.XMLPaceProject;
import com.pace.base.utility.FileUtils;
import com.pace.base.view.PafStyle;

public class PafGlobalStylesClassNameMigrationAction extends MigrationAction {

	
	private static Logger logger = Logger
	.getLogger(PafGlobalStylesClassNameMigrationAction.class);

	
	
	public PafGlobalStylesClassNameMigrationAction(XMLPaceProject xmlPaceProject) {
		this.xmlPaceProject = xmlPaceProject;
	}

	@Override
	public String getActionName() {
		return "Convert Global Styles com.palladium.paf.view.PafStyle name value to PafStyle.";
	}

	@Override
	public MigrationActionStatus getStatus()  {
		
		// if server home directory location is specified
		if (xmlPaceProject != null) {		
			
			//get global style map
			Map<String, Object> globalStylesMap = null;
			try {
				globalStylesMap = getGlobalStylesObjectMap();
			} catch (PaceProjectReadException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//if map not null
			if ( globalStylesMap != null ) {				
				
				//loop through styles, see if any fill color are not null
				for (Object pafStyle : globalStylesMap.values()) {
					
					//if fill color is not null, migration hasn't started yet
					if ( pafStyle instanceof com.palladium.paf.view.PafStyle ) {
						return MigrationActionStatus.NotStarted;
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
		
		//if not already completed
		if (getStatus().equals(MigrationActionStatus.NotStarted)) {

			//get input file
			File inputFile = getInputFile();
						
			if ( inputFile != null && inputFile.isFile() && inputFile.canRead() ) {
				
				//try to backup orig file
				try {
					FileUtils.copy(inputFile, new File(inputFile.toString() + PafBaseConstants.BAK_EXT));
				} catch (IOException e1) {
					logger.error("Couldn't backup file " + inputFile.toString() + ". Error: " + e1.getMessage());
				} 
						
			}
		}
		
		Map<String, com.palladium.paf.view.PafStyle> map = null;
		try {
			map = getGlobalStylesMap();
		} catch (PaceProjectReadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//create a new Dictionary with the new style PafStyle
		Map<String, PafStyle> mapToSet = new HashMap<String, PafStyle>();
		
		//iterate thru the old style map and convert the PafStyle.
		for(Map.Entry<String, com.palladium.paf.view.PafStyle> e : map.entrySet())
		{
			mapToSet.put(e.getKey(), e.getValue().convert());
		}
		
		//export updated global styles
		xmlPaceProject.setGlobalStyles(mapToSet);
		try {
			xmlPaceProject.save(ProjectElementId.GlobalStyles);
		} catch (ProjectSaveException e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	
	private Map<String, com.palladium.paf.view.PafStyle> getGlobalStylesMap() throws PaceProjectReadException {
		
		Map<String, com.palladium.paf.view.PafStyle> map = null;

		PafXStreamElementItem<Map<String, com.palladium.paf.view.PafStyle>> pafXStreamElementItem = new PafXStreamElementItem<Map<String, com.palladium.paf.view.PafStyle>>(xmlPaceProject.getProjectInput() + PafBaseConstants.FN_GlobalStyleMetaData);
		
		map = pafXStreamElementItem.read();
		
		return map;
	}
	
	private Map<String, Object> getGlobalStylesObjectMap() throws PaceProjectReadException {
		
		Map<String, Object> map = null;

		PafXStreamElementItem<Map<String, Object>> pafXStreamElementItem = new PafXStreamElementItem<Map<String, Object>>(xmlPaceProject.getProjectInput() + PafBaseConstants.FN_GlobalStyleMetaData);
		
		
		map = pafXStreamElementItem.read();
		
		return map;
	}
	
	/**
	 * 
	 * Gets the input file
	 *
	 * @return Input file
	 */
	private File getInputFile () {
		
		String confDirectory = xmlPaceProject.getProjectInput();		
		
		//if conf dir is null, return null
		if ( confDirectory == null ) {
			return null;
		}
		
		// get file reference to paf_rules.xml file
		return new File(confDirectory + File.separator
				+ PafBaseConstants.FN_GlobalStyleMetaData);
	}
}
