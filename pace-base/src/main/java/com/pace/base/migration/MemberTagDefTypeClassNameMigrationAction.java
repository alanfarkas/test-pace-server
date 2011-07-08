/*
 *	File: @(#)CustomFunctionDefClassNameMigrationAction.java
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
import java.util.List;

import org.apache.log4j.Logger;

import com.pace.base.PafBaseConstants;
import com.pace.base.PafException;
import com.pace.base.project.XMLPaceProject;
import com.pace.base.utility.FileUtils;

/**
 * Updates the CustomFunctionDef class name from any version of pace from 1.0 - 2.8.1.1 to the current
 * version.
 **/
public class MemberTagDefTypeClassNameMigrationAction extends MigrationAction {
	
	private static Logger logger = Logger.getLogger(MemberTagDefTypeClassNameMigrationAction.class);

	private static final String SEARCH_FOR = " class=\"com.palladium.paf.db.membertags.MemberTagType\"";

	private static final String REPLACE_WITH = "";
	
	private String confDirectory = null;
	
	private String[] filesToConvert = null;
	
	
	public MemberTagDefTypeClassNameMigrationAction(XMLPaceProject xmlPaceProject) {
	}
	
	public MemberTagDefTypeClassNameMigrationAction(String[] filesToConvert, String confDir) {
		this.filesToConvert = filesToConvert;
		this.confDirectory = confDir;
	}

	@Override
	public String getActionName() {
		return "Convert CustomFunctionDef class name to new namespace pattern..";
	}

	@Override
	public MigrationActionStatus getStatus()  {
		
		if ( this.confDirectory != null ) {			
			
			File confDir = new File(this.confDirectory);
			
			if ( confDir.exists() && confDir.isDirectory()) {
				
				if ( confDirectory != null ) {
					
					//for (File confDirChild : confDirChildren ) {
					for (String file : filesToConvert ) {
						
						File confDirChild = new File(confDirectory + File.separator + file);
						
						if ( confDirChild.isFile() && isValidProjectFileOrDir(confDirChild)) { 
	
							//if one of the project files need migration
							try {
								if ( FileUtils.findLineNumber(confDirChild, SEARCH_FOR) > 0) {
									return MigrationActionStatus.NotStarted;
								}
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}											
						
						}					
							
					}
					
				}
				
				//if hasn't returned by now, is complete
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
		File inputFile = new File(confDirectory + File.separator + PafBaseConstants.FN_MemberTagMetaData);
					
		if ( inputFile != null && inputFile.isFile() && inputFile.canRead() ) {
			
			//try to backup orig file
			try {
				FileUtils.copy(inputFile, new File(inputFile.toString() + PafBaseConstants.BAK_EXT));
			} catch (IOException e1) {
				logger.error("Couldn't backup file " + inputFile.toString() + ". Error: " + e1.getMessage());
			} 
					
		}
		
			
		if ( filesToConvert != null ) {
			
			for (String file : filesToConvert ) {
					
					File confDirChild = new File(confDirectory + File.separator + file);
			
				try {
					
					
					List<Integer> lines = null;
					try {
						lines = FileUtils.findLineNumbers(confDirChild, SEARCH_FOR);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					List<String> fullFileContents = null;
					fullFileContents = FileUtils.readFile(confDirChild);
					for(int line : lines){
						String fileLine = fullFileContents.get(line);
						
						if ( fileLine.contains(SEARCH_FOR)) {										

							String updatedStr = fileLine.replace(SEARCH_FOR, REPLACE_WITH);
							
							if ( updatedStr.trim().length() > 0 ) {
								logger.info("Upgrading: " + SEARCH_FOR + " with '" + REPLACE_WITH + "' in file: " + confDirChild);
								fullFileContents.set(line, updatedStr);
								
							} else {
								
								continue;
							}
																	
						}
					}
			
					FileUtils.writeFile(confDirChild, fullFileContents);
					
				} catch (PafException e) {
					logger.info(e.getMessage());
				}		
				
			}		
		}
	}
}
