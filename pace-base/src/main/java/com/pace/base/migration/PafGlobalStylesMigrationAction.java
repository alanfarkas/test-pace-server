/*
 *	File: @(#)PafGlobalStylesMigrationAction.java 	Package: com.pace.base.migration 	Project: Paf Base Libraries
 *	Created: Sept 7, 2007  		By: jmilliron
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
import java.util.Map;
import java.util.TreeMap;

import org.apache.log4j.Logger;

import com.pace.base.PafBaseConstants;
import com.pace.base.project.ProjectElementId;
import com.pace.base.project.ProjectSaveException;
import com.pace.base.project.XMLPaceProject;
import com.pace.base.utility.FileUtils;
import com.pace.base.view.PafStyle;

/**
 * This class is used to convert the bgFillColor name to the hex value.
 * 
 * @author jmilliron
 * @version 1.00
 * 
 */
public class PafGlobalStylesMigrationAction extends MigrationAction {

	private static Logger logger = Logger
			.getLogger(PafGlobalStylesMigrationAction.class);

	/**
	 * Constructor - creates instance of PafGlobalStylesMigration
	 * 
	 * @param paceProject
	 *            pace project to upgrade
	 */
	public PafGlobalStylesMigrationAction(XMLPaceProject xmlPaceProject) {

		this.xmlPaceProject = xmlPaceProject;

	}

	/*
	 * (non-Javadoc)
	 * @see com.pace.base.migration.IMigrationAction#getActionName()
	 */
	public String getActionName() {

		return "Convert Global Styles bgFillColor name value to bgHexFillColor hex value.";
	}
		
	/*
	 * (non-Javadoc)
	 * @see com.pace.base.migration.IMigrationAction#getStatus()
	 */	
	public MigrationActionStatus getStatus() {

		// if server home directory location is specified
		if (xmlPaceProject != null) {		
			
			//get global style map
			Map<String, PafStyle> globalStylesMap = getGlobalStylesMap();
			
			//if map not null
			if ( globalStylesMap != null ) {				
				
				//loop through styles, see if any fill color are not null
				for (PafStyle pafStyle : globalStylesMap.values()) {
					
					//if fill color is not null, migration hasn't started yet
					if ( pafStyle.getBgFillColor() != null ) {
						return MigrationActionStatus.NotStarted;
					} else if ( pafStyle.getFontColor() != null ) {
						return MigrationActionStatus.NotStarted;
					}
					
				}
				
				//get this far, it's completed
				return MigrationActionStatus.Completed;
				
			}
				
				
		} 

		return MigrationActionStatus.NotStarted;
	}

	/*
	 * (non-Javadoc)
	 * @see com.pace.base.migration.IMigrationAction#run()
	 */
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
			
			Map<String, PafStyle> globalStylesMap = getGlobalStylesMap();
			
			if ( globalStylesMap != null ) {				
				
				//key color name, value = hex
				Map<String, String> excelColorMap = getExcelColorMap();
				
				for (PafStyle pafStyle : globalStylesMap.values()) {
					
					//get fill color
					String fillColor = pafStyle.getBgFillColor();
					
					//if not null
					if ( fillColor != null ) {
						
						//if excel color map contains the fill color
						if ( excelColorMap.containsKey(fillColor)) {
							
							//get hex value using name
							String hexValue = excelColorMap.get(fillColor);
						
							//set hex value
							pafStyle.setBgHexFillColor(hexValue);
							
							//set original value to null
							pafStyle.setBgFillColor(null);
							
						} else {
							
							pafStyle.setBgFillColor(null);
						}
						
					}
					
					String fontColor = pafStyle.getFontColor();
					
					//if not null
					if ( fontColor != null ) {

						//if excel color map contains the font color name						
						if ( excelColorMap.containsKey(fontColor)) {
							
							//get hex value
							String hexValue = excelColorMap.get(fontColor);
							
							//set font hex color value
							pafStyle.setFontHexColor(hexValue);
							
							//set original value to null
							pafStyle.setFontColor(null);
							
						}else {
							
							pafStyle.setFontColor(null);
						}
						
					}
					
				}

				//export updated global styles
				xmlPaceProject.setGlobalStyles(globalStylesMap);
				try {
					xmlPaceProject.save(ProjectElementId.GlobalStyles);
				} catch (ProjectSaveException e) {
					throw new RuntimeException(e.getMessage());
				}
			} 

		}
	}

		
	/**
	 * 
	 *  Uses values from the orignal excel xml file. Key is the 
	 *  excel color name, value is the hex equivlant.
	 *
	 * @return map of excel colors
	 */
	protected static Map<String, String> getExcelColorMap() {
		
		Map<String, String> map = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);
		
		map.put("MediumTurquoise", "33CCCC");
		map.put("Black", "000000");
		map.put("MediumBlue", "0000FF");
		map.put("SteelBlue", "666699");
		map.put("Lime", "00FF00");
		map.put("Brown", "993300");
		map.put("Cyan", "00FFFF");
		map.put("Olive", "808000");
		map.put("Gold", "FFCC00");
		map.put("Silver", "C0C0C0");
		map.put("DarkGray", "969696");
		map.put("DimGray", "808080");
		map.put("DarkSlateGray", "333333");
		map.put("Green", "008000");
		map.put("DarkSlateBlue", "333399");
		map.put("LightCyan", "CCFFFF");
		map.put("Magenta", "FF00FF");
		map.put("Olive", "333300");
		map.put("Orange", "FF6600");
		map.put("LightBlue", "99CCFF");
		map.put("Pink", "FF00FF");
		map.put("Plum", "993399");
		map.put("Red", "FF0000");
		map.put("HotPink", "FF99CC");
		map.put("SeaGreen", "339966");
		map.put("SkyBlue", "00CCFF");
		map.put("Tan", "FFCC99");
		map.put("Teal", "008080");
		map.put("Purple", "800080");
		map.put("White", "FFFFFF");
		map.put("Yellow", "FFFF00");
		
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
	
	private Map<String, PafStyle> getGlobalStylesMap() {
		
		Map<String, PafStyle> map = null;
		
		if ( xmlPaceProject != null ) {
			
			boolean currentUpgradeProject = this.xmlPaceProject.isUpgradeProject();
			
			//turn off current upgrad project flag, but save current value for later reset
			this.xmlPaceProject.setUpgradeProject(false);
			
			map =  xmlPaceProject.getGlobalStyles();
			
			//put project update flag back to initial value
			this.xmlPaceProject.setUpgradeProject(currentUpgradeProject);
			
			if ( map.size() == 0 ) {
				
				map = null;
				
			}
		}
		
		return map;
	}
}
