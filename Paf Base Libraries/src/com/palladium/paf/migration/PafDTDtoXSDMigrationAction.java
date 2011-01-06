/**
 * 
 */
package com.palladium.paf.migration;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;

import com.palladium.paf.PafBaseConstants;
import com.palladium.paf.PafException;
import com.palladium.paf.project.InvalidPaceProjectInputException;
import com.palladium.paf.project.PaceProjectCreationException;
import com.palladium.paf.project.XMLPaceProject;
import com.palladium.utility.FileUtils;
import com.palladium.utility.PafXStream;

/**
 * Reads in all the project files and :
 * 
 * 	1. Removes all the dtd references
 *  2. Addes the xsd to header if xsd exists * 
 * 
 * @author javaj
 *
 */
public class PafDTDtoXSDMigrationAction extends MigrationAction {

	private static Logger logger = Logger.getLogger(PafDTDtoXSDMigrationAction.class);
		
	private static final String DTD_HEADER_IDENT = "<!DOCTYPE";
	
	private String confDirectory = null;
	
	/**
	 * 
	 * Creates a PafDTDtoXSDMigrationAction and sets the conf dir location
	 * 
	 * @param confDirectory
	 */
	public PafDTDtoXSDMigrationAction(XMLPaceProject xmlPaceProject) {
		
		this.xmlPaceProject = xmlPaceProject;
		
		if ( this.xmlPaceProject != null) {
			
			confDirectory = this.xmlPaceProject.getProjectInput();
			
		}
		
	}
	
	/* (non-Javadoc)
	 * @see com.palladium.paf.migration.IMigrationAction#getActionName()
	 */
	public String getActionName() {
		
		return "Remove DTD references from xml files and add XSD if exists.";
		
	}

	/* (non-Javadoc)
	 * @see com.palladium.paf.migration.IMigrationAction#getStatus()
	 */
	public MigrationActionStatus getStatus() {
		
		if ( this.confDirectory != null ) {			
			
			File confDir = new File(this.confDirectory);
			
			if ( confDir.exists() && confDir.isDirectory()) {
				
				// conf\..\paf_project.xml
				File projectFile = new File(confDir.getAbsoluteFile() + File.separator + ".." + File.separator + PafBaseConstants.FN_Project);
				
				if ( projectFile.isFile()) {
					
					if ( doesProjectFileNeedMigration(projectFile)) {
						return MigrationActionStatus.NotStarted;
					}		
				}
				
				File[] confDirChildren = confDir.listFiles();
				
				if ( confDirChildren != null ) {
					
					for (File confDirChild : confDirChildren ) {
						
						//if dir and not svn hidden dir
						if ( confDirChild.isDirectory() && isValidProjectFileOrDir(confDirChild) ) {
																			
							//if one of the project files in a project dir need migration
							if ( doesProjectDirNeedMigration(confDirChild) ) {
								return MigrationActionStatus.NotStarted;
							}	
							
						//if file and if file name ends in .xml
						} else if ( confDirChild.isFile() && isValidProjectFileOrDir(confDirChild)) { 
	
							//if one of the project files need migration
							if ( doesProjectFileNeedMigration(confDirChild)) {
								return MigrationActionStatus.NotStarted;
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

	private boolean doesProjectDirNeedMigration(File confDirChild) {
		
		boolean needsMigration = false;
		
		if ( confDirChild.isDirectory()) {
			
			File[] childrenFiles = confDirChild.listFiles();
			
			if ( childrenFiles != null ) {
				
				for (File childFile : childrenFiles) {
					
					if ( childFile.isFile() && isValidProjectFileOrDir(childFile) ) {
						
						if ( doesProjectFileNeedMigration(childFile) ) {
							
							needsMigration = true;
							logger.info("Project at " + confDirectory + " needs migration.");
							break;
						}
						
					}
					
				}
				
			}
			
		}	
		
		return needsMigration;
		
	}

	private boolean doesProjectFileNeedMigration(File fileToMigrate) {
		
		boolean needsMigration = false;
		
		if ( fileToMigrate.isFile() ) {
		
			try {
				
				List<String> firstLineInFile = FileUtils.readFile(fileToMigrate, 1);
										
				if ( firstLineInFile != null && firstLineInFile.size() == 1) {
				
					for ( String line : firstLineInFile ) {
						
						//if line doesn't start with DTD doctype
						if ( line.startsWith(DTD_HEADER_IDENT) ) {
							
							needsMigration = true;
							
							logger.info("File " + fileToMigrate.toString() + " needs migration.  Has DTD reference.");
							
						} else {
							
							String xsdUpdateCompare = PafXStream.addXSDHeader(line);
							
							//if strings are not equal after addXSDHeader, then needs migration
							if ( ! xsdUpdateCompare.equals(line) ) {
								needsMigration = true;
								logger.info("File " + fileToMigrate.toString() + " needs migration.  Doesn't have XSD reference.");
							}
							
						} 
					}
				}
				
			} catch (PafException e) {
				logger.info(e.getMessage());
				e.printStackTrace();
			}
			
		}
		
		return needsMigration;
	}

	/* (non-Javadoc)
	 * @see com.palladium.paf.migration.IMigrationAction#run()
	 */
	public void run() {

		if ( getStatus().equals(MigrationActionStatus.NotStarted)) {

			File[] filesToMigrate = getProjectFilesToMigrate();
				
			if ( filesToMigrate != null ) {
				
				for (File fileToMigrate : filesToMigrate) {
				
					try {
						
						List<String> fullFileContents = FileUtils.readFile(fileToMigrate);
						
						List<String> updatedFileContents = new ArrayList<String>();
						
						if ( fullFileContents != null ) {
						
							for (String fileLine : fullFileContents) {
							
								if ( fileLine != null ) {
									
									if ( fileLine.startsWith(DTD_HEADER_IDENT)) {										
										
										int startNdx = fileLine.indexOf(DTD_HEADER_IDENT);
										int endNdx = fileLine.indexOf(">");
										
										//fileLine = fileLine.replaceAll(DTD_HEADER_IDENT + "*\\>", "");
										String updatedStr = fileLine.substring(0, startNdx);
										
										updatedStr += fileLine.substring(endNdx + 1);
																				
										if ( updatedStr.trim().length() > 0 ) {
											
											updatedFileContents.add(updatedStr);
											
										} else {
											
											continue;
										}
																				
									} else {
										
										String tryToUpdateStr = PafXStream.addXSDHeader(fileLine);
										
										updatedFileContents.add(tryToUpdateStr);
										
									}
									
								}
																
															
							}
													
						}				
						
						FileUtils.writeFile(fileToMigrate, updatedFileContents);
						
					} catch (PafException e) {
						logger.info(e.getMessage());
					}		
					
					
				}		
				
			}
			
		}

	}

	private File[] getProjectFilesToMigrate() {
		
		Set<File> filesToMigrateSet = new HashSet<File>();
		
		File confDir = new File(this.confDirectory);
		
		if ( confDir.exists() && confDir.isDirectory()) {
		
			// conf\..\paf_project.xml
			File projectFile = new File(confDir.getAbsoluteFile() + File.separator + ".." + File.separator + PafBaseConstants.FN_Project);
			
			if (projectFile.isFile() && doesProjectFileNeedMigration(projectFile) ) {
				filesToMigrateSet.add(projectFile);
			}
			
			File[] confDirChildren = confDir.listFiles();
			
			if ( confDirChildren != null ) {
									
				for (File childFile : confDirChildren ) {						
				
					if ( childFile.isFile() && isValidProjectFileOrDir(childFile) && doesProjectFileNeedMigration(childFile) ) {						
						
						filesToMigrateSet.add(childFile);
						
					} else if (childFile.isDirectory() && isValidProjectFileOrDir(childFile) && doesProjectDirNeedMigration(childFile)) {
						
						for (File dirFile : childFile.listFiles() ) {
							
							if ( dirFile.isFile() && isValidProjectFileOrDir(dirFile) && doesProjectFileNeedMigration(dirFile) ) {
							
								filesToMigrateSet.add(dirFile);
							}
						}
						
					}				
					
				}
			}
			
		}
		
		if ( filesToMigrateSet.size() > 0 ) {
			
			for (File fileToMigrate : filesToMigrateSet ) {
				
				logger.info("File '" + fileToMigrate.getName() + "' needs to be migrated.");
				
			}
			
			return filesToMigrateSet.toArray(new File[0]);
		} else {
			return null;
		}
			
			
	}

	private boolean isValidProjectFileOrDir(File childFile) {

		if ( childFile != null) {
			
			if ( childFile.isFile() && childFile.toString().endsWith(PafBaseConstants.XML_EXT) ) {
				return true;
			} else if ( childFile.isDirectory() && ! childFile.toString().endsWith(PafBaseConstants.SVN_HIDDEN_DIR_NAME) ) {
				return true;
			}
			
		}
		
		return false;
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
		
		PafDTDtoXSDMigrationAction migAction = new PafDTDtoXSDMigrationAction(pp);
		
		migAction.run();
		
	}
}
