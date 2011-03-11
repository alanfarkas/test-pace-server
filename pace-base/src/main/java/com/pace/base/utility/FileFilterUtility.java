/*
 *	File: @(#)FileUtils.java 	Package: com.pace.base.utility 	Project: Paf Base Libraries
 *	Created: Feb 22, 2007  		By: Jason Milliron
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
package com.pace.base.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;

import org.apache.log4j.Logger;

import com.pace.base.PafBaseConstants;


/**
 * @author JavaJ
 *
 */
public class FileFilterUtility {
	
	private static Logger logger = Logger.getLogger(FileFilterUtility.class);
	
	/**
	 * 
	 *  Removes filter set from file
	 *
	 * @param fullFilePathAndName  file to apply filters too
	 * @param filterSet				 filter set of items to remove
	 * @throws FileNotFoundException
	 */
	public static void removeFiltersFromFile(File fullFilePathAndName, Set<String> filterSet) throws FileNotFoundException {
		
		removeFiltersFromFile(fullFilePathAndName.getAbsolutePath(), filterSet);
		
	}
	
	/**
	 * 
	 *  Removes filter set from file
	 *
	 * @param fullFilePathAndName  file to apply filters too
	 * @param filterSet				 filter set of items to remove
	 * @throws FileNotFoundException
	 */
	public static void removeFiltersFromFile(String fullFilePathAndName, Set<String> filterSet) throws FileNotFoundException {
		
		if ( fullFilePathAndName == null || filterSet == null ) {
			throw new NullPointerException();
		}
		
		File fullFilePathAndNameFile = new File(fullFilePathAndName);
		
		if ( ! fullFilePathAndNameFile.exists() || ! fullFilePathAndNameFile.isFile()) {
			
			throw new FileNotFoundException(fullFilePathAndName);
			
		} 
		
		File tmpFile = new File(fullFilePathAndName + "." + Math.random() + PafBaseConstants.XML_EXT);
		
		BufferedReader br = new BufferedReader(new FileReader(fullFilePathAndNameFile));
		
		
//		 line to hold current line of buffered reader
		String thisLine = null;

		BufferedWriter bw = null;
		
		// while more lines in buffered reader exist
		try {
		
			bw = new BufferedWriter(new FileWriter(tmpFile));
			
			while ((thisLine = br.readLine()) != null) {

				String trimmedLine = thisLine.trim();
				
				if ( trimmedLine.length() > 0 && filterSet.contains(trimmedLine)) {
					logger.debug("Disguarding line: " + trimmedLine);
				} else {
					bw.write(thisLine);
					bw.newLine();
				}

			}
			
		} catch (IOException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		} finally {
			
			if ( br != null ) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				br = null;
			}
			
			if ( bw != null) {
				try {
					bw.close();
					bw = null;
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		File origFileBackupFile = new File(fullFilePathAndName + PafBaseConstants.BAK_EXT);
		
		//if alrady exists, delete
		if ( origFileBackupFile.exists()) {
			origFileBackupFile.delete();
		}
		
		fullFilePathAndNameFile.renameTo(origFileBackupFile);
		
		File newFile = new File(fullFilePathAndName);
		
		tmpFile.renameTo(newFile);
		
		if ( newFile.exists()) {
			
			logger.info("Success");			
			//origFileBackupFile.delete();
			
		} else {
			 
		}
		
	}

	/**
	 * 
	 *  Method_description_goes_here
	 *
	 * @param pafSecurityXmlFile
	 * @param filterSet
	 * @return
	 * @throws FileNotFoundException
	 */
	public static boolean doFiltersExistsInFile(File pafSecurityXmlFile, Set<String> filterSet) throws FileNotFoundException {
		
		return doFiltersExistsInFile(pafSecurityXmlFile.getAbsolutePath(), filterSet);

	}
	
	/**
	 * 
	 *  Method_description_goes_here
	 *
	 * @param fullFilePathAndName
	 * @param filterSet
	 * @return
	 * @throws FileNotFoundException
	 */
	public static boolean doFiltersExistsInFile(String fullFilePathAndName, Set<String> filterSet) throws FileNotFoundException {
		
		if ( fullFilePathAndName == null || filterSet == null ) {
			throw new NullPointerException();
		}
		
		File fullFilePathAndNameFile = new File(fullFilePathAndName);
		
		if ( ! fullFilePathAndNameFile.exists() || ! fullFilePathAndNameFile.isFile()) {
			
			throw new FileNotFoundException(fullFilePathAndName);
			
		} 
						
		BufferedReader br = new BufferedReader(new FileReader(fullFilePathAndNameFile));
				
		//line to hold current line of buffered reader
		String thisLine = null;
	
		// while more lines in buffered reader exist
		try {

			while ((thisLine = br.readLine()) != null) {

				String trimmedLine = thisLine.trim();
				
				if ( trimmedLine.length() > 0 && filterSet.contains(trimmedLine)) {
					logger.debug("Filter found: " + trimmedLine);
					return true;
				} 

			}
			
		} catch (IOException e) {

			logger.error(e.getMessage());
			e.printStackTrace();
		} finally {
			
			if ( br != null ) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				br = null;
			}
			
			
		}
		
		return false;
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		//List<RuleSet> ruleSets = PafImportExportUtility.importRuleSets("C:\\Program Files\\Palladium\\PafServer\\conf\\", true);
		
		//logger.info(ruleSets);
		
		
		/*
		try {
			
			File ruleSetDir = new File("C:\\Program Files\\Palladium\\PafServer\\conf\\paf_rule_sets\\");
			
			if ( ruleSetDir.exists() && ruleSetDir.isDirectory()) {
				
				for (File file : ruleSetDir.listFiles()) {
					
					if ( file.isFile() && file.toString().endsWith(PafBaseConstants.XML_EXT)) {
			
						FileFilterUtility.applyFiltersToFile(file.toString());
						
					}
					
				}
				
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		*/
		
		/*
		try {
			RuleSet ruleSet = (RuleSet) PafXStream.importObjectFromXml("C:\\Program Files\\Palladium\\PafServer\\conf\\paf_rule_sets\\receiptreact.xml");
			
			logger.info(ruleSet.getRuleGroups()[0].getRules()[0].getKey());
		} catch (PafConfigFileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
	}

}
