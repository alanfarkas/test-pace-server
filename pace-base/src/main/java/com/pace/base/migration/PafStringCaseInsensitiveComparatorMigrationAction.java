/*
 *	File: @(#)PafStringCaseInsensitiveComparatorMigrationAction.java 	Package: com.pace.base.migration 	Project: Paf Base Libraries
 * 
 */
package com.pace.base.migration;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;

import com.pace.base.PafBaseConstants;
import com.pace.base.PafException;
import com.pace.base.project.InvalidPaceProjectInputException;
import com.pace.base.project.PaceProjectCreationException;
import com.pace.base.project.XMLPaceProject;
import com.pace.base.utility.FileUtils;

/**
 * Upgrades all the "<comparator class="java.lang.String-CaseInsensitiveComparator"/>" strings in the xml
 * due to the changes in xstream 1.3
 * 
 * @author themoosman
 *
 */
public class PafStringCaseInsensitiveComparatorMigrationAction extends MigrationAction {

	private static final Logger logger = Logger.getLogger(PafStringCaseInsensitiveComparatorMigrationAction.class);
		
	private static final String SEARCH_FOR = "<comparator class=\"java.lang.String-CaseInsensitiveComparator\"/>";

	private static final String REPLACE_WITH = "<comparator class=\"java.lang.String$CaseInsensitiveComparator\"/>";
	
	private String confDirectory = null;
	
	private String[] filesToConvert = null;
	
	/**
	 * 
	 * Creates a PafStringCaseInsensitiveComparatorMigrationAction and sets the conf dir location
	 * 
	 * @param confDirectory
	 */
	public PafStringCaseInsensitiveComparatorMigrationAction(XMLPaceProject xmlPaceProject) {
		

	}
	
	public PafStringCaseInsensitiveComparatorMigrationAction(String[] filesToConvert, String confDir) {
		this.filesToConvert = filesToConvert;
		this.confDirectory = confDir;
	}
	/* (non-Javadoc)
	 * @see com.pace.base.migration.IMigrationAction#getActionName()
	 */
	public String getActionName() {
		
		return "Replace old style XStream java.lang.String-CaseInsensitiveComparator strings";	
	}

	/* (non-Javadoc)
	 * @see com.pace.base.migration.IMigrationAction#getStatus()
	 */
	public MigrationActionStatus getStatus() {
		
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


	/* (non-Javadoc)
	 * @see com.pace.base.migration.IMigrationAction#run()
	 */
	public void run() {

		if (getStatus().equals(MigrationActionStatus.Completed)) {
			return;
		}
		
		
		//get input file
		File inputFile = new File(confDirectory + File.separator + PafBaseConstants.FN_HierarchyFormats);
					
		if ( inputFile != null && inputFile.isFile() && inputFile.canRead() ) {
			
			//try to backup orig file
			try {
				FileUtils.copy(inputFile, new File(inputFile.toString() + PafBaseConstants.BAK_EXT));
			} catch (IOException e1) {
				logger.error("Couldn't backup file " + inputFile.toString() + ". Error: " + e1.getMessage());
			} 
					
		}
		
			
		if ( filesToConvert != null ) {
			
			//for (File fileToMigrate : filesToMigrate) {
			for (String file : filesToConvert ) {
					
					File confDirChild = new File(confDirectory + File.separator + file);
			
				try {
					
					
					int pos = 0;
					try {
						pos = FileUtils.findLineNumber(confDirChild, SEARCH_FOR);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					
					List<String> fullFileContents = null;//FileUtils.readFile(file);
					
					//List<String> updatedFileContents = new ArrayList<String>();
					
					if ( pos > 0 ) {
						
						fullFileContents = FileUtils.readFile(confDirChild);
					
						String fileLine = fullFileContents.get(pos);

						if ( fileLine.contains(SEARCH_FOR)) {										

							String updatedStr = fileLine.replace(SEARCH_FOR, REPLACE_WITH);
							
							if ( updatedStr.trim().length() > 0 ) {
								
								//updatedFileContents.add(updatedStr);
								
								fullFileContents.set(pos, updatedStr);
								
							} else {
								
								continue;
							}
																	
						}
												
					}				
					logger.info("Upgrading: " + SEARCH_FOR + " with " + REPLACE_WITH + " in file: " + confDirChild);
					FileUtils.writeFile(confDirChild, fullFileContents);
					
				} catch (PafException e) {
					logger.info(e.getMessage());
				}		
				
				
			}		
			
		}

	}
	
	public static void main(String[] args) {
		
		XMLPaceProject pp = null;
		
		try {
			pp = new XMLPaceProject("C:\\proj_wrksp\\install_stage\\Admin Console\\conf\\Sample Project\\conf", false);
		} catch (InvalidPaceProjectInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PaceProjectCreationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		PafStringCaseInsensitiveComparatorMigrationAction migAction = new PafStringCaseInsensitiveComparatorMigrationAction(null, "C:\\proj_wrksp\\install_stage\\Admin Console\\conf\\Sample Project\\conf");
		
		migAction.run();
		
	}
}
