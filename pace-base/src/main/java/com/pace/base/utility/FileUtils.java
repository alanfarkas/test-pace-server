/*
 *	File: @(#)FileUtils.java 	Package: com.pace.base.utility 	Project: Paf Base Libraries
 *	Created: Feb 21, 2006  		By: Jason Milliron
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

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.pace.base.PafErrSeverity;
import com.pace.base.PafException;

/**
 * A file utility class with helper methods.
 * 
 * @version x.xx
 * @author jmilliron
 * 
 */
public class FileUtils {

	private static final Logger logger = Logger.getLogger(FileUtils.class);
	
	/**
	 * Copys a source file to a destination file
	 * 
	 * @param source
	 *            Source file to be copied
	 * @param dest
	 *            Destination of source file.
	 * @throws IOException
	 */
	public static void copy(File source, File dest) throws IOException {

		// get in stream
		InputStream in = new FileInputStream(source);

		// get out stream
		OutputStream out = new FileOutputStream(dest);

		try {
			// Transfer bytes from in to out
			byte[] buf = new byte[1024];
			int len;
			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}

			// finally, if something blows up, close in and out files.
		} finally {

			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}

	}

	public static boolean copyDirectory(File sourceDir, File destDir,
			boolean deepCopy) {

		if (sourceDir == null || !sourceDir.isDirectory()) {
			return false;
		}

		if (!destDir.exists()) {

			destDir.mkdir();

		}

		File[] filesToCopy = null;

		if (deepCopy) {

			ArrayList<File> allFiles = findFiles(sourceDir);

			filesToCopy = allFiles.toArray(new File[0]);

		} else {

			filesToCopy = sourceDir.listFiles();

		}

		for (File sourceFile : filesToCopy) {

			System.out.println(sourceFile.getName());

		}

		return true;
	}

	public static ArrayList<File> findFiles(File startFile) {

		ArrayList<File> foundFiles = new ArrayList<File>();

		if (startFile.isDirectory()) {

			for (File file : startFile.listFiles()) {

				if (file.isDirectory()) {
					foundFiles.add(file);
					foundFiles.addAll(findFiles(file));

				} else {
					foundFiles.add(file);
				}

			}

		} else {

			foundFiles.add(startFile);

		}

		return foundFiles;
	}

	public static void deleteFilesInDir(File directoryToDelete,
			boolean deleteDirectories) {

		if (directoryToDelete != null && directoryToDelete.isDirectory()) {

			for (File resource : directoryToDelete.listFiles()) {

				if (deleteDirectories && resource.isDirectory()) {

					deleteFilesInDir(resource, deleteDirectories);

					resource.delete();

				} else {

					resource.delete();
				}

			}

		}

	}
	
	/**
	 * Deletes a file
	 * @param file string representation of a file.
	 */
	public static void deleteFile(String file) {

		if (file != null) {
			
			File fileToDelete = new File(file);
			
			if(fileToDelete != null && fileToDelete.isFile()){

				fileToDelete.delete();
				
				logger.info("Deleted file: " + file);

			}

		}

	}
	
	
	/**
	 * Deletes an array of files.
	 * @param directory Directory that contains the files.
	 * @param filesToDelete Array files to delete.
	 * @exception PafException thrown if file is not a valid file or (FileNotFoundException or IOException are thrown)
	 */
	public static void deleteFilesInDir(File directory,
			String[] filesToDelete) {
		
		if (directory != null && directory.isDirectory() && 
				filesToDelete != null && filesToDelete.length > 0) {

			for (String fileName : filesToDelete) {

				StringBuilder sb = new StringBuilder();
				sb.append(directory.getPath());
				sb.append(File.separator);
				sb.append(fileName);
				
				File file = new File(sb.toString());
				
				boolean fileDeleted = file.delete(); 
				
				if ( ! fileDeleted ) {
					
					logger.error("File '" + file.getAbsolutePath() + "' could not be deleted.");
					
				}

			}

		}

	}
	
	/**
	 * 
	 * Reads in a file.  If numberOfLines is not null, only reads in the 1st to number 
	 * passed in.
	 * 
	 * @param inputFile	File to read
	 * @param numberOfLinesToRead number of lines from beginning to read
	 * @return Each line read in
	 * @exception NullPointerException thrown if file is null
	 * @exception PafException thrown if file is not a valid file or (FileNotFoundException or IOException are thrown)
	 */
	public static List<String> readFile(File inputFile) throws PafException {
		
		return FileUtils.readFile(inputFile, null);
		
	}

	/**
	 * 
	 * Reads in a file.  If numberOfLines is not null, only reads in the 1st to number 
	 * passed in.
	 * 
	 * @param inputFile	File to read
	 * @param numberOfLinesToRead number of lines from beginning to read
	 * @return Each line read in
	 * @exception NullPointerException thrown if file is null
	 * @exception PafException thrown if file is not a valid file or (FileNotFoundException or IOException are thrown)
	 */
	public static List<String> readFile(File inputFile, Integer numberOfLinesToRead) throws PafException {
		
		if ( inputFile == null ) {
			throw new NullPointerException("File was null");
		}
		
		if ( !inputFile.isFile() ) {
			throw new PafException("File passed in is not a valid file", PafErrSeverity.Error);
		}
		
		List<String> readLines = new ArrayList<String>();
		
		BufferedReader bufferedReader = null;
	      
		try {
	            	  
	          //Construct the BufferedReader object
	          bufferedReader = new BufferedReader(new FileReader(inputFile));
	          
	          String line = null;
	          
	          int i = 0;
	          
	          while ((line = bufferedReader.readLine()) != null) {

	        	  if ( numberOfLinesToRead != null && i++ == numberOfLinesToRead) {
	        		  break;
	        	  }
	        	  
	        	  readLines.add(line);
	        	  
	          }
	          
	      } catch (FileNotFoundException ex) {
	    	  
	          throw new PafException(ex);
	          
	      } catch (IOException ex) {
	    	  
	    	  throw new PafException(ex);
	          
	      } finally {
	    	  
	          //Close the BufferedReader
	          try {
	        	  
	              if (bufferedReader != null)
	            	  
	                  bufferedReader.close();
	              
	          } catch (IOException ex) {
	        	  
	              ex.printStackTrace();
	          }
	      }
		
		
		return readLines;
	}
	
	public static void writeFile(File outputFile, List<String> outputList) throws PafException {
		
		if ( outputFile == null ) {
			throw new NullPointerException("File was null");
		}
		
		if ( !outputFile.isFile() ) {
			throw new PafException("File passed in is not a valid file", PafErrSeverity.Error);
		}
		
		BufferedWriter bufferedWriter = null;
        
        try {
            
            //Construct the BufferedWriter object
            bufferedWriter = new BufferedWriter(new FileWriter(outputFile));
            
            if ( outputList != null) {
	            
            	for (String output : outputList ) {
	            
	            	//Start writing to the output stream
	                bufferedWriter.write(output);
	                bufferedWriter.newLine();
	                
	            }
	            
            }
            
        } catch (FileNotFoundException ex) {
            throw new PafException(ex);
        } catch (IOException ex) {
        	throw new PafException(ex);
        } finally {
            //Close the BufferedWriter
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.flush();
                    bufferedWriter.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
		
		
	}
	
//	/**
//	 * 
//	 *  Creates a new temporary directory in the temp directory specified by "java.io.tmpdir"
//	 *  The name of the directory is dynamically created based of of the date.
//	 *
//	 * @return a file instance of the temp directory created
//	 */
//	public static File createSystemTempDirectory() {
//		File systemTempDir = new File(System.getProperty("java.io.tmpdir"));
//		return createTempDirectory(systemTempDir);
//	}
	
	/**
	 * 
	 *  Creates a new directory.  The name of the directory is 
	 *  dynamically created based of of the date.
	 *
	 * @return a file instance of the temp directory created
	 */
	public static File createTempDirectory(File parentDir) {
		
		//if parent dir is not null, check to see if exists.  If not, create
		if ( parentDir != null ) {
			
			if ( ! parentDir.exists() ) {
			
				parentDir.mkdir();
				
				if ( ! parentDir.exists() ) {
					
					logger.warn("Could not create directory '" + parentDir.toString() + "'. Current directory will be used instead.");
					
				}
				
			}			
		}
		
		Random rand = new Random();
		int randomInt = 1 + rand.nextInt(Integer.MAX_VALUE);
		String dynamicDirName = new Long((new Date()).getTime()).toString();
		
		dynamicDirName = "pace-" + randomInt + dynamicDirName;
		
		File tempDirectory = null;
		
		if ( parentDir != null && parentDir.exists() ) {
			
			tempDirectory = new File(parentDir, dynamicDirName);
			
		} else {
			
			tempDirectory = new File(dynamicDirName);
			
		}
		
		logger.info("About to create temp directory '" + tempDirectory.toString() + "'");
		
		if ( ! tempDirectory.exists()) {
			
			tempDirectory.mkdir();
			
			if ( ! tempDirectory.exists() ) {
				
				logger.warn("Failed to create temp directory '" + tempDirectory.toString() + "'");
				
			}
			
		}
		
		return tempDirectory;
		
	}
	
	/**
	 * 
	 *  Creates a new temp file.  The name of the directory is 
	 *  dynamically created based of of the date.
	 *
	 * @return a file instance of the temp file created
	 */
	public static String createTempFile(String extension) {
		File systemTempDir = getSystemTempDirectory();
		return createTempFile(systemTempDir, extension);
		
	}
	
	/**
	 * 
	 *  Creates a new directory.  The name of the directory is 
	 *  dynamically created based of of the date.
	 *
	 * @return a file instance of the temp directory created
	 */
	public static String createTempFile(File parentDir, String extension) {
		
		//if parent dir is not null, check to see if exists.  If not, create
		if ( parentDir != null ) {
			
			if ( ! parentDir.exists() ) {
			
				parentDir.mkdir();
				
				if ( ! parentDir.exists() ) {
					
					logger.warn("Could not create directory '" + parentDir.toString() + "'. Current directory will be used instead.");
					
				}
				
			}			
		}
		
		Random rand = new Random();
		int randomInt = 1 + rand.nextInt();
		String dynamicFileName = new Long((new Date()).getTime()).toString();
		
		dynamicFileName = parentDir + File.separator + randomInt + dynamicFileName + extension;
		
		logger.info("returning temp file: '" + dynamicFileName + "'");
		
		return dynamicFileName;
	}
	
	/**
	 *  Gets the temporary directory specified by "java.io.tmpdir"
	 *
	 * @return a file instance
	 */
	public static File getSystemTempDirectory() {
		File systemTempDir = new File(System.getProperty("java.io.tmpdir"));
		return systemTempDir;
		
	}

	/**
	 *  Creates a new temporary directory in the temp directory specified by "java.io.tmpdir"
	 *  The name of the directory is dynamically created based of of the date.
	 *
	 * @return a file instance of the temp directory created
	 */
	public static File createTempDirectory() {
		File systemTempDir = getSystemTempDirectory();
		return createTempDirectory(systemTempDir);
		
	}
	
	/**
	 * 
	 * Deletes all contents in given directory.
	 *
	 * @param directoryToDelete directory to delete
	 */
	public static void deleteDirectory(File directoryToDelete) {
		
		logger.info("About to delete directory " + directoryToDelete.toString());
		
		deleteFilesInDir(directoryToDelete, true);
		
		boolean successfulDeletion = directoryToDelete.delete();
		
		if ( ! successfulDeletion || directoryToDelete.exists()) {
			
			logger.warn("Failed to delete directory '" + directoryToDelete.toString() + "'");
			
		} else {
			
			logger.info("Successfully deleted directory '" + directoryToDelete.toString() + "'");
		}
		
	}
	
	/**
	 * 
	 * Checks to see if OS has a file lock on the file.
	 *
	 * @param file file to check if system has lock on file
	 * @return true if file is locked
	 */
	public static boolean isFileLocked(File file) {
		
		boolean isFileLocked = false;
		
		if ( file != null && file.isFile() ) {
		
			try {
				
				FileChannel channel = new RandomAccessFile(file, "rw").getChannel();
			
				try {
					
					FileLock fl = channel.tryLock();
					
					if ( fl == null ) {
												
						isFileLocked = true;
						
					} else {
						
						//release tmp lock
						fl.release();
						
					}
					
				} catch (OverlappingFileLockException e ) {

					isFileLocked = true;
					
				}
			
				channel.close();
			
			} catch (FileNotFoundException e) {
				logger.warn(e.getMessage());
				isFileLocked = true;
			} catch (IOException e) {
				logger.error(e.getMessage());
				isFileLocked = true;
			}
		
			logger.info("File " + file.toString() + " is locked? " + isFileLocked);
		}	
		
		return isFileLocked;
		
	}
	
	/**
	 * Searches a file for an occurrence of a phrase.
	 * @param file file to search
	 * @param phrase phrase to search for
	 * @return the line number the first result
	 * @throws IOException
	 */
	public static int findLineNumber(File file, String phrase) throws IOException {
		List<Integer> lineNums = findLineNumbers(file, phrase);
		if(lineNums == null || lineNums.size() == 0){
			return -1;
		}
		return lineNums.get(0);
	}
	
	/**
	 * Searches a file for an occurrence of a phrase.
	 * @param file file to search
	 * @param phrase phrase to search for
	 * @return a list of line numbers.
	 * @throws IOException
	 */
	public static List<Integer> findLineNumbers(File file, String phrase) throws IOException {
		Scanner fileScanner = new Scanner(file);
		List<Integer> lineNums = new ArrayList<Integer>();
		int lineID = 0;
		try {
			while(fileScanner.hasNextLine()){
				String line = fileScanner.nextLine();
				if(line.contains(phrase)){
					lineNums.add(lineID);
				}
				lineID++;
			}
			return lineNums;
		} catch(Exception e){
			return null;
		} finally {
			fileScanner.close();
		}
	}
}
