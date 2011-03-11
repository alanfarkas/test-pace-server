/*
 *	File: @(#)EsbUtility.java 		Package: com.pace.base.mdb.essbase 	Project: Essbase Provider
 *	Created: May 10, 2006  		By: AFarkas
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
package com.pace.mdb.essbase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
import org.apache.log4j.Logger;

import com.essbase.api.base.EssException;
import com.essbase.api.base.IEssBaseObject;
import com.essbase.api.base.IEssIterator;
import com.essbase.api.dataquery.IEssCubeView;
import com.essbase.api.dataquery.IEssMdDataSet;
import com.essbase.api.dataquery.IEssOpMdxQuery;
import com.essbase.api.dataquery.IEssOpMdxQuery.EEssMemberIdentifierType;
import com.essbase.api.datasource.IEssCube;
import com.essbase.api.datasource.IEssOlapFileObject;
import com.essbase.api.datasource.IEssOlapServer;
import com.essbase.api.metadata.IEssCubeOutline;
import com.essbase.api.metadata.IEssMember;
import com.essbase.api.metadata.IEssMemberSelection;
import com.essbase.api.metadata.IEssMember.EEssConsolidationType;
import com.essbase.api.metadata.IEssMember.EEssShareOption;
import com.pace.base.PafBaseConstants;
import com.pace.base.state.IPafClientState;
import com.pace.base.utility.StringUtils;

/**
 * Essbase utility functions
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public abstract class EsbUtility {

	private static final int ESS_FILE_OJBECT_NAME_MAX_LEN = PafBaseConstants.ESS_FILE_OJBECT_NAME_MAX_LEN;
	private static final String ESS_CALC_SCRIPT_SUFFIX = PafBaseConstants.ESS_CALC_SCRIPT_SUFFIX;
	private static final String ESS_REPORT_SCRIPT_SUFFIX = PafBaseConstants.ESS_REPORT_SCRIPT_SUFFIX;
	private static final String ESS_TEMP_FILE_PREFIX = PafBaseConstants.ESS_TEMP_FILE_PREFIX;
//	private static final String ESS_TEMP_FILE_PATH = PafBaseConstants.FN_DataTransferPath;
	private static final String ESS_TEXT_FILE_SUFFIX = PafBaseConstants.ESS_TEXT_FILE_SUFFIX;
	private static final String LINE_TERM = PafBaseConstants.LINE_TERM;
	private final static Logger logger = Logger.getLogger(EsbUtility.class);

//	/**
//	 *	Copy Essbase calc script to temp file
//	 *
//	 * @param olapServer Essbase olap server
//	 * @param cube Essbase cube
//	 * @param calcScript Name of Essbase calc script 
//	 * 
//	 * @return File object
//	 * @throws IOException 
//	 * @throws EssException 
//	 */
//	public static File copyCalcScriptToFile(IEssOlapServer olapServer, IEssCube cube, String calcScript) throws IOException, EssException {
//		return copyServerObjectToFile(olapServer, cube, calcScript, IEssOlapFileObject.TYPE_CALCSCRIPT, ESS_CALC_SCRIPT_SUFFIX, null);
//	}
	
	/**
	 *	Copy Essbase calc script to temp file
	 *
	 * @param olapServer Essbase olap server
	 * @param cube Essbase cube
	 * @param calcScript Name of Essbase calc script 
	 * @param tempFilePath Temp file path
	 * 
	 * @return File object
	 * @throws IOException 
	 * @throws EssException 
	 */
	public static File copyCalcScriptToFile(IEssOlapServer olapServer, IEssCube cube, String calcScript, String tempFilePath) throws IOException, EssException {
		return copyServerObjectToFile(olapServer, cube, calcScript, IEssOlapFileObject.TYPE_CALCSCRIPT, ESS_CALC_SCRIPT_SUFFIX, tempFilePath);
	}
	

//	/**
//	 *	Copy Essbase report script to temp file
//	 *
//	 * @param olapServer Essbase olap server
//	 * @param cube Essbase cube
//	 * @param reportScript Name of Essbase report script 
//	 * 
//	 * @return File object
//	 * @throws IOException 
//	 * @throws EssException 
//	 */
//	public static File copyReportScriptToFile(IEssOlapServer olapServer, IEssCube cube, String calcScript) throws IOException, EssException {
//		return copyServerObjectToFile(olapServer, cube, calcScript, IEssOlapFileObject.TYPE_REPORT, ESS_REPORT_SCRIPT_SUFFIX, null);
//	}
	
	/**
	 *	Copy Essbase report script to temp file
	 *
	 * @param olapServer Essbase olap server
	 * @param cube Essbase cube
	 * @param reportScript Name of Essbase report script 
	 * @param tempFilePath Temp file path
	 * 
	 * @return File object
	 * @throws IOException 
	 * @throws EssException 
	 */
	public static File copyReportScriptToFile(IEssOlapServer olapServer, IEssCube cube, String calcScript, String tempFilePath) throws IOException, EssException {
		return copyServerObjectToFile(olapServer, cube, calcScript, IEssOlapFileObject.TYPE_REPORT, ESS_REPORT_SCRIPT_SUFFIX, tempFilePath);
	}
	

	/**
	 *	Copy Essbase server object to temp file
	 *
	 * @param olapServer Essbase olap server
	 * @param cube Essbase cube
	 * @param objectName Name of server object
	 * @param objectType Server object type
	 * @param fileSuffix Temp file suffix
	 * @param tempFilePath Temp file path
	 * 
	 * @return File object
	 * @throws IOException
	 * @throws EssException 
	 */
	public static File copyServerObjectToFile(IEssOlapServer olapServer, IEssCube cube, String objectName, int objectType, String fileSuffix, String tempFilePath) throws IOException, EssException {
		
		// Create temporary file. If the temporary file directory does not exist, create it.
		File fileObject = new File(tempFilePath); 
		fileObject.mkdir();
		if (!fileObject.exists()) {
			StringBuffer errMsg = new StringBuffer("Can't copy Essbase object to temporary file, the required file path does not exist and could not be created [");
			errMsg.append(fileObject.getAbsolutePath());
			errMsg.append("]. Essbase process aborted.");
			logger.error(errMsg);
			throw new IOException(errMsg.toString());			
		}
		File esbFile = File.createTempFile(ESS_TEMP_FILE_PREFIX, fileSuffix, fileObject);
		String esbFileName = esbFile.getPath();
		esbFile.deleteOnExit();
	
		// Copy Essbase server object to file
		try {
			// Essbase 11 compliance - it was necessary to modify the API call below, by calling the
			// copyOlapFileObjectToSever method on the Olap Server object instead of the Cube object.
			// A change in API functionality caused API to look for the file on the HPS server, instead
			// of the local client machine.
			olapServer.copyOlapFileObjectFromServer(cube.getApplicationName(), cube.getName(), objectType, objectName, esbFileName, false);
		} catch (EssException esx) {
			throw esx;
		}
		
		// Return essbae file
		return esbFile;
	}
	

	/**
	 *	Copy calc script file to Essbase server using the file name as the 
	 *  server object name.
	 *
	 * @param olapServer Essbase olap server
	 * @param cube Essbase cube
	 * @param calcScriptFile Calc script file
	 * 
	 * @return Name of created Essbase calc script
	 * @throws EssException 
	 */
	public static String copyCalcScriptToServer(IEssOlapServer olapServer, IEssCube cube, File calcScriptFile) throws EssException {
		return copyCalcScriptToServer(olapServer, cube, calcScriptFile, null);
	}

	/**
	 *	Copy calc script file to Essbase server using the specified calc script name
	 *
	 * @param olapServer Essbase olap server
	 * @param cube Essbase cube
	 * @param calcScriptFile Calc script file
	 * @param calcScriptName Name to use for Essbase calc script
	 * 
	 * @return Name of created Essbase calc script
	 * @throws EssException 
	 */
	public static String copyCalcScriptToServer(IEssOlapServer olapServer, IEssCube cube, File calcScriptFile, String calcScriptName) throws EssException {
		return copyFileObjectToServer(olapServer, cube, calcScriptFile, IEssOlapFileObject.TYPE_CALCSCRIPT, calcScriptName, ESS_CALC_SCRIPT_SUFFIX.length());
	}
	

	/**
	 *	Copy report script file to Essbase server using the file name as the
	 *  server object name.
	 *
	 * @param olapServer Essbase olap server
	 * @param cube Essbase cube
	 * @param reportScriptFile Report script file
	 * 
	 * @return Name of created Essbase calc script
	 * @throws EssException 
	 */
	public static String copyReportScriptToServer(IEssOlapServer olapServer, IEssCube cube, File reportScriptFile) throws EssException {
		return copyReportScriptToServer(olapServer, cube, reportScriptFile, null);
	}

	/**
	 *	Copy report script file to Essbase server using the specified report script name
	 *
	 * @param olapServer Essbase olap server
	 * @param cube Essbase cube
	 * @param reportScriptFile Report script file
	 * @param reportScriptName Name to use for Essbase report script
	 * 
	 * @return Name of created Essbase calc script
	 * @throws EssException 
	 */
	public static String copyReportScriptToServer(IEssOlapServer olapServer, IEssCube cube, File reportScriptFile, String reportScriptName) throws EssException {
		return copyFileObjectToServer(olapServer, cube, reportScriptFile, IEssOlapFileObject.TYPE_REPORT, reportScriptName, ESS_REPORT_SCRIPT_SUFFIX.length());
	}


	/**
	 *	Copy text file to Essbase server
	 *
	 * @param olapServer Essbase olap server
	 * @param cube Essbase cube
	 * @param textFile Text file (usually data load file)
	 * 
	 * @return Name of created Essbase text object
	 * @throws EssException 
	 */
	public static String copyTextFileToServer(IEssOlapServer olapServer, IEssCube cube, File textFile) throws EssException {
		return copyTextFileToServer(olapServer, cube, textFile, null);
	}

	/**
	 *	Copy text file to Essbase server using the specified object name
	 *
	 * @param olapServer Essbase olap server
	 * @param cube Essbase cube
	 * @param textFile Text file
	 * @param objectName Name to use for text object
	 * 
	 * @return Name of created Essbase text object
	 * @throws EssException 
	 */
	public static String copyTextFileToServer(IEssOlapServer olapServer, IEssCube cube, File textFile, String objectName) throws EssException {
		return copyFileObjectToServer(olapServer, cube, textFile, IEssOlapFileObject.TYPE_TEXT, objectName, ESS_TEXT_FILE_SUFFIX.length());
	}
	
	/**
	 *	Copy file object to Essbase server
	 *
	 * @param olapServer Essbase olap server
	 * @param cube Essbase cube
	 * @param esbFile Essbase object file
	 * @param objectType Essbase object type
	 * @param objectName Essbase object name
	 * @param fileExtLength Length of file name extension 
	 * 
	 * @return Name of created Essbase server object
	 * @throws EssException 
	 */
	public static String copyFileObjectToServer(IEssOlapServer olapServer, IEssCube cube, File esbFile, int objectType, String objectName, int fileExtLength) throws EssException {

		// If no object name is supplied, then derive object name from name by removing file suffix.
		// If necessary, truncate the name further to adhere to Essbase object name constraints.
		if (objectName == null) {
			objectName = esbFile.getName().substring(0, esbFile.getName().length() - fileExtLength);	
			if (objectName.length() > ESS_FILE_OJBECT_NAME_MAX_LEN) {
				objectName = objectName.substring(0, ESS_FILE_OJBECT_NAME_MAX_LEN);
			}
		}

		// Copy Essbase file object to server.
		try {
			// Essbase 11 compliance - it was necessary to modify the API call below, by calling the
			// copyOlapFileObjectToSever method on the Olap Server object instead of the Cube object.
			// A change in API functionality caused API to look for the file on the HPS server, instead
			// of the local client machine.
			olapServer.copyOlapFileObjectToServer(cube.getApplicationName(), cube.getName(), objectType, objectName, esbFile.getPath(), false);
		} catch (EssException esx) {
			throw esx;
		}

		// Return essbase object name
		return objectName;
	}

	
	/**
	 *	Resolve all the token values on the specified tokenized Essbase script
	 *
	 * @param tokenizedScript Tokenized Essbase script file
	 * @param tokenCatalog Collection of client state token key/value pairs
	 * @param tempFilePath Location where temporary calc script will be created
	 * 
	 * @return Resolved calc script file
	 * 
	 * @throws IllegalArgumentException 
	 * @throws IOException 
	 */
	public static File resolveEssbaseScriptTokens(File tokenizedScript, Properties tokenCatalog, String tempFilePath) throws IllegalArgumentException, IOException {

		String scriptName = tokenizedScript.getName();
		String errMsg = "Error encountered resolving tokens on Essbase script [" + scriptName + "] - ";
		String scriptNameSuffix = "";

		File resolvedScript = null;
		FileReader scriptReader = null;
		FileWriter scriptWriter = null;

		// Check for null tokens
    	if (tokenCatalog == null || tokenCatalog.isEmpty()) {
    		errMsg += " Token catalog is null or empty";
    		logger.error(errMsg);
    		throw (new IllegalArgumentException(errMsg));
    	}
    	
		// Create temporary output file for resolved script. 
		File fileObject = new File(tempFilePath);
		int pos = scriptName.indexOf(".");
		if (pos > 0) {
			scriptNameSuffix = scriptName.substring(pos);
		}
		resolvedScript = File.createTempFile(ESS_TEMP_FILE_PREFIX, scriptNameSuffix, fileObject);
		
		// Open tokenized script for input and resolved script for output
	    scriptReader = new FileReader(tokenizedScript.getPath());
		scriptWriter = new FileWriter(resolvedScript.getPath());
    
		// Resolve the tokens on each tokenized script line and write out to the resolved script file
	    boolean eof = false;
	    BufferedReader inputBuffer = new BufferedReader(scriptReader);
	    while (!eof) {
	    	// Read next line
	    	String line = inputBuffer.readLine();

    		// Exit loop upon EOF
	    	if (line == null) {
	    		eof = true;
	    		continue;
	    	} 
	    	
	    	// Replace all tokens on line (ignoring case)
	    	for (Enumeration <?> enumerator = tokenCatalog.propertyNames(); enumerator.hasMoreElements();) {
	    		String key = (String) enumerator.nextElement();
	    		String value = tokenCatalog.getProperty(key).toUpperCase();
	    		if (value != null) {
	    			line = StringUtils.replaceAllIgnoreCase(line, key, value);
	    		}
	    	}
	    	
	    	// Write out line to resolved calc script
			scriptWriter.append(line + LINE_TERM);
	    }
	     
	    // Close all files
	    inputBuffer.close();
	    scriptReader.close();
	    scriptWriter.close();
		
	    // Return Essbase script with fully resolve tokens
	    return resolvedScript;
	}

	/**
	 *	Delete calc script from Essbase server
	 *
	 * @param cube Essbase cube
	 * @param calcScript Name of Essbase calc script
	 */
	public static void deleteServerCalcScript(IEssCube cube, String calcScript) {
		deleteServerObject(cube, calcScript, IEssOlapFileObject.TYPE_CALCSCRIPT);		
	}

	/**
	 *	Delete text file from Essbase server
	 *
	 * @param cube Essbase cube
	 * @param textFileName Name of Essbase text file
	 */
	public static void deleteServerTextFile(IEssCube cube, String textFileName) {
		deleteServerObject(cube, textFileName, IEssOlapFileObject.TYPE_TEXT);		
	}

	/**
	 *	Delete object from Essbase server
	 *
	 * @param cube Essbase cube
	 * @param objectName Name of Essbase server object
	 * @param objectType Server object type
	 */
	public static void deleteServerObject(IEssCube cube, String objectName, int objectType) {

		try {
			cube.unlockOlapFileObject(objectType, objectName);
		} catch (EssException esx) {
			// Unable to unlock data file - log warning message
			String errMsg = esx.getMessage();
			logger.warn(errMsg);
		} finally {
			try {
				cube.deleteOlapFileObject(objectType, objectName);	
			} catch (EssException esx) {
				// Unable to delete data file - log warning message
				String errMsg = esx.getMessage();
				logger.warn(errMsg);
			}
		}
	}

	/**
	 *  Close Essbase member selection object
	 *
	 * @param mbrSel Essbase member selection object
	 * @param essNetTimeOut Essbase network timeout (in milliseconds)
	 * 
	 * @throws EssException 
	 */
	public static void essCloseMemberSelection(IEssMemberSelection mbrSel, int essNetTimeOut) throws EssException {

		boolean exit = false, isConnectErr = false;
        long startTime = System.currentTimeMillis();
        long maxTime = essNetTimeOut;
        long elapsedTime = 0;
        do {
        	try {
        		mbrSel.close();
        		exit = true;
        	} catch (EssException esx) {
        		// Check for Essbase connection issue
        		if (esx.getNativeCode() == PafBaseConstants.ESS_CONNECT_TIMEOUT_ERR) {
        			isConnectErr = true;
        			elapsedTime = System.currentTimeMillis() - startTime;
        			if (elapsedTime > maxTime) {
        				String errMsg = "Essbase time out - waited " + elapsedTime + "ms for an Essbase connection";
        				logger.error(errMsg);
        				throw esx;
        			}
        		} else {
        			throw esx;
        		}
        	}
        } while (!exit);	
		
		// Display appropriate message if connection error encountered
		if (isConnectErr) {
			String errMsg = "Waited " + elapsedTime + "ms for an Essbase connection";
			logger.warn(errMsg);
		}

	}

	/**
	 *  Close essbase cube outline
	 *
	 * @param essCubeOutline Essbase cube outline
	 * 
	 * @param essNetTimeOut Essbase network timeout (in milliseconds)
	 * @throws EssException 
	 */
	public static void essCloseOutline(IEssCubeOutline essCubeOutline, int essNetTimeOut) throws EssException {

		boolean exit = false, isConnectErr = false;
        long startTime = System.currentTimeMillis();
        long maxTime = essNetTimeOut;
        long elapsedTime = 0;
        do {
        	try {
        		essCubeOutline.close();
        		exit = true;
        	} catch (EssException esx) {
        		// Check for Essbase connection issue
        		if (esx.getNativeCode() == PafBaseConstants.ESS_CONNECT_TIMEOUT_ERR) {
        			isConnectErr = true;
        			elapsedTime = System.currentTimeMillis() - startTime;
        			if (elapsedTime > maxTime) {
        				String errMsg = "Essbase time out - waited " + elapsedTime + "ms for an Essbase connection";
        				logger.error(errMsg);
        				throw esx;
        			}
        		} else {
        			throw esx;
        		}
        	}
        } while (!exit);	
		
		// Display appropriate message if connection error encountered
		if (isConnectErr) {
			String errMsg = "Waited " + elapsedTime + "ms for an Essbase connection";
			logger.warn(errMsg);
		}

	}

	/**
	 *  Find member in Essbase outline
	 *
	 * @param essCubeOutline Essbase outline
	 * @param branch Branch to seek
	 * @param essNetTimeOut Essbase network timeout (in milliseconds)
	 * 
	 * @return Essbase member
	 * @throws EssException 
	 */
	public static IEssMember essFindOtlMember(IEssCubeOutline essCubeOutline, String branch, int essNetTimeOut) throws EssException {

		IEssMember essMember = null;
		boolean exit = false, isConnectErr = false;
        long startTime = System.currentTimeMillis();
        long maxTime = essNetTimeOut;
        long elapsedTime = 0;
        do {
        	try {
        		essMember = essCubeOutline.findMember(branch);
        		exit = true;
        	} catch (EssException esx) {
        		// Check for Essbase connection issue
        		if (esx.getNativeCode() == PafBaseConstants.ESS_CONNECT_TIMEOUT_ERR) {
        			isConnectErr = true;
        			elapsedTime = System.currentTimeMillis() - startTime;
        			if (elapsedTime > maxTime) {
        				String errMsg = "Essbase time out - waited " + elapsedTime + "ms for an Essbase connection";
        				logger.error(errMsg);
        				throw esx;
        			}
        		} else {
        			throw esx;
        		}
        	}
        } while (!exit);	
		
		// Display appropriate message if connection error encountered
		if (isConnectErr) {
			String errMsg = "Waited " + elapsedTime + "ms for an Essbase connection";
			logger.warn(errMsg);
		}

		// Return Essbase member
		return essMember;
	}

	/**
	 *  Return Essbase alias table names
	 *  
	 * @param essCubeOutline Essbase cube outline
	 * @param essNetTimeOut Essbase network timeout (in milliseconds)
	 * 
	 * @return String[]
	 * @throws EssException 
	 */
	public static String[] essGetAliasTableNames(IEssCubeOutline essCubeOutline, int essNetTimeOut) throws EssException {

		String[] tableNames = null;
		boolean exit = false, isConnectErr = false;
        long startTime = System.currentTimeMillis();
        long maxTime = essNetTimeOut;
        long elapsedTime = 0;
        do {
        	try {
        		tableNames = essCubeOutline.getAliasTableNames();
        		exit = true;
        	} catch (EssException esx) {
        		// Check for Essbase connection issue
        		if (esx.getNativeCode() == PafBaseConstants.ESS_CONNECT_TIMEOUT_ERR) {
        			isConnectErr = true;
        			elapsedTime = System.currentTimeMillis() - startTime;
        			if (elapsedTime > maxTime) {
        				String errMsg = "Essbase time out - waited " + elapsedTime + "ms for an Essbase connection";
        				logger.error(errMsg);
        				throw esx;
        			}
        		} else {
        			throw esx;
        		}
        	}
        } while (!exit);	
		
		// Display appropriate message if connection error encountered
		if (isConnectErr) {
			String errMsg = "Waited " + elapsedTime + "ms for an Essbase connection";
			logger.warn(errMsg);
		}

		// Return alias table names
		return tableNames;
	}

	/**
	 *  Get indexed object from Essbase iterator
	 *
	 * @param iterator Essbase iterator
	 * @param i Iterator index
	 * @param essNetTimeOut Essbase network timeout (in milliseconds)
	 * 
	 * @return IEssbaseObject
	 * @throws EssException 
	 */
	public static IEssBaseObject essGetAt(IEssIterator iterator, int i, int essNetTimeOut) throws EssException {

		IEssBaseObject essObject = null;
		boolean exit = false, isConnectErr = false;
        long startTime = System.currentTimeMillis();
        long maxTime = essNetTimeOut;
        long elapsedTime = 0;
        do {
        	try {
        		essObject = iterator.getAt(i);
        		exit = true;
        	} catch (EssException esx) {
        		// Check for Essbase connection issue
        		if (esx.getNativeCode() == PafBaseConstants.ESS_CONNECT_TIMEOUT_ERR) {
        			isConnectErr = true;
        			elapsedTime = System.currentTimeMillis() - startTime;
        			if (elapsedTime > maxTime) {
        				String errMsg = "Essbase time out - waited " + elapsedTime + "ms for an Essbase connection";
        				logger.error(errMsg);
        				throw esx;
        			}
        		} else {
        			throw esx;
        		}
        	}
        } while (!exit);	
		
		// Display appropriate message if connection error encountered
		if (isConnectErr) {
			String errMsg = "Waited " + elapsedTime + "ms for an Essbase connection";
			logger.warn(errMsg);
		}

		// Return Essbase object
		return essObject;
	}

	/**
	 *  Get children of specified Essbase member
	 *
	 * @param essMember Essbase member object
	 * @param essNetTimeOut 
	 * 
	 * @return IEssIterator
	 * @throws EssException 
	 */
	public static IEssIterator essGetChildMembers(IEssMember essMember, int essNetTimeOut) throws EssException {
		return essGetChildMembers(essMember, false, essNetTimeOut);
	}
	
	/**
	 *  Get children of specified Essbase member
	 *
	 * @param essMember Essbase member object
	 * @param withAllProps If true, all properties are member properties are returned
	 * @param essNetTimeOut Essbase network timeout (in milliseconds)
	 * 
	 * @return IEssIterator
	 * @throws EssException 
	 */
	public static IEssIterator essGetChildMembers(IEssMember essMember, boolean withAllProps, int essNetTimeOut) throws EssException {

		IEssIterator childMembers = null;
		boolean exit = false, isConnectErr = false;
        long startTime = System.currentTimeMillis();
        long maxTime = essNetTimeOut;
        long elapsedTime = 0;
        do {
        	try {
        		childMembers = essMember.getChildMembers(withAllProps);
        		exit = true;
        	} catch (EssException esx) {
        		// Check for Essbase connection issue
        		if (esx.getNativeCode() == PafBaseConstants.ESS_CONNECT_TIMEOUT_ERR) {
        			isConnectErr = true;
        			elapsedTime = System.currentTimeMillis() - startTime;
        			if (elapsedTime > maxTime) {
        				String errMsg = "Essbase time out - waited " + elapsedTime + "ms for an Essbase connection";
        				logger.error(errMsg);
        				throw esx;
        			}
        		} else {
        			throw esx;
        		}
        	}
        } while (!exit);	
		
		// Display appropriate message if connection error encountered
		if (isConnectErr) {
			String errMsg = "Waited " + elapsedTime + "ms for an Essbase connection";
			logger.warn(errMsg);
		}

		// Return children
		return childMembers;
		
	}

	/**
	 *  Return essbase member consolidation type
	 *  
	 * @param essMember Essbase member object
	 * @param essNetTimeOut Essbase network timeout (in milliseconds)
	 *
	 * @return EEssConsolidationType
	 * @throws EssException 
	 */
	public static EEssConsolidationType essGetConsolidationType(IEssMember essMember, int essNetTimeOut) throws EssException {
		
		EEssConsolidationType consolType = null;
		boolean exit = false, isConnectErr = false;
        long startTime = System.currentTimeMillis();
        long maxTime = essNetTimeOut;
        long elapsedTime = 0;
        do {
        	try {
        		consolType = essMember.getConsolidationType();
        		exit = true;
        	} catch (EssException esx) {
        		// Check for Essbase connection issue
        		if (esx.getNativeCode() == PafBaseConstants.ESS_CONNECT_TIMEOUT_ERR) {
        			isConnectErr = true;
        			elapsedTime = System.currentTimeMillis() - startTime;
        			if (elapsedTime > maxTime) {
        				String errMsg = "Essbase time out - waited " + elapsedTime + "ms for an Essbase connection";
        				logger.error(errMsg);
        				throw esx;
        			}
        		} else {
        			throw esx;
        		}
        	}
        } while (!exit);	
		
		// Display appropriate message if connection error encountered
		if (isConnectErr) {
			String errMsg = "Waited " + elapsedTime + "ms for an Essbase connection";
			logger.warn(errMsg);
		}

		// Return consolidation type
		return consolType;
	}

	/**
	 *  Create Essbase Mdx Query in Cube View
	 *
	 * @param essCubeView Essbase cube view object
	 * @param essNetTimeOut Essbase network timeout (in milliseconds)
	 * 
	 * @return Essbase mdx query object
	 * @throws EssException 
	 */
	public static IEssOpMdxQuery essCreateIEssOpMdxQuery(IEssCubeView essCubeView, int essNetTimeOut) throws EssException {
		
		IEssOpMdxQuery mdxQuery = null;
		boolean exit = false, isConnectErr = false;
        long startTime = System.currentTimeMillis();
        long maxTime = essNetTimeOut;
        long elapsedTime = 0;
        do {
        	try {
        		mdxQuery = essCubeView.createIEssOpMdxQuery();
        		exit = true;
        	} catch (EssException esx) {
        		// Check for Essbase connection issue
        		if (esx.getNativeCode() == PafBaseConstants.ESS_CONNECT_TIMEOUT_ERR) {
        			isConnectErr = true;
        			elapsedTime = System.currentTimeMillis() - startTime;
        			if (elapsedTime > maxTime) {
        				String errMsg = "Essbase time out - waited " + elapsedTime + "ms for an Essbase connection";
        				logger.error(errMsg);
        				throw esx;
        			}
        		} else {
        			throw esx;
        		}
        	}
        } while (!exit);	
		
		// Display appropriate message if connection error encountered
		if (isConnectErr) {
			String errMsg = "Waited " + elapsedTime + "ms for an Essbase connection";
			logger.warn(errMsg);
		}

		// Return cube outline
		return mdxQuery;
	}

	/**
	 *  Execute Essbase member query
	 *
	 * @param mbrSelQry Essbase member selection query
	 * @param fieldSelectionSpec Member properties to return in query
	 * @param mbrSelectionSpec Members to return
	 * @param essNetTimeOut Essbase network timeout (in milliseconds)
	 * 
	 * @throws EssException 
	 */
	public static void essExecuteQuery(IEssMemberSelection mbrSelQry, String fieldSelectionSpec, String mbrSelectionSpec, int essNetTimeOut) throws EssException {

		boolean exit = false, isConnectErr = false;
        long startTime = System.currentTimeMillis();
        long maxTime = essNetTimeOut;
        long elapsedTime = 0;
        do {
        	try {
    			mbrSelQry.executeQuery(fieldSelectionSpec, mbrSelectionSpec);
        		exit = true;
        	} catch (EssException esx) {
        		// Check for Essbase connection issue
        		if (esx.getNativeCode() == PafBaseConstants.ESS_CONNECT_TIMEOUT_ERR) {
        			isConnectErr = true;
        			elapsedTime = System.currentTimeMillis() - startTime;
        			if (elapsedTime > maxTime) {
        				String errMsg = "Essbase time out - waited " + elapsedTime + "ms for an Essbase connection";
        				logger.error(errMsg);
        				throw esx;
        			}
        		} else {
        			throw esx;
        		}
        	}
        } while (!exit);	
		
		// Display appropriate message if connection error encountered
		if (isConnectErr) {
			String errMsg = "Waited " + elapsedTime + "ms for an Essbase connection";
			logger.warn(errMsg);
		}

	}

	/**
	 *  Execute Essbase member query
	 *
	 * @param essCubeOutline Essbase Cube
	 * @param fieldSelectionSpec Member properties to return in query
	 * @param mbrSelectionSpec Members to return
	 * @param essNetTimeOut Essbase network timeout (in milliseconds)
	 * 
	 * @return IEssIterator
	 * @throws EssException 
	 */
	public static IEssIterator essExecuteQuery(IEssCubeOutline essCubeOutline, String fieldSelectionSpec, String mbrSelectionSpec, int essNetTimeOut) throws EssException {

		IEssIterator members = null;
		boolean exit = false, isConnectErr = false;
        long startTime = System.currentTimeMillis();
        long maxTime = essNetTimeOut;
        long elapsedTime = 0;
        do {
        	try {
    			members = essCubeOutline.executeQuery(fieldSelectionSpec, mbrSelectionSpec);
        		exit = true;
        	} catch (EssException esx) {
        		// Check for Essbase connection issue
        		if (esx.getNativeCode() == PafBaseConstants.ESS_CONNECT_TIMEOUT_ERR) {
        			isConnectErr = true;
        			elapsedTime = System.currentTimeMillis() - startTime;
        			if (elapsedTime > maxTime) {
        				String errMsg = "Essbase time out - waited " + elapsedTime + "ms for an Essbase connection";
        				logger.error(errMsg);
        				throw esx;
        			}
        		} else {
        			throw esx;
        		}
        	}
        } while (!exit);	
		
		// Display appropriate message if connection error encountered
		if (isConnectErr) {
			String errMsg = "Waited " + elapsedTime + "ms for an Essbase connection";
			logger.warn(errMsg);
		}

		// Return query results
		return members;
	}

	/**
	 *  Return Essbase member generation number
	 *  
	 * @param essMember Essbase member object
	 * @param essNetTimeOut Essbase network timeout (in milliseconds)
	 *
	 * @return Essbase member generation
	 * @throws EssException 
	 */
	public static int essGetGenerationNumber(IEssMember essMember, int essNetTimeOut) throws EssException {

		int genNumber = 0;
		boolean exit = false, isConnectErr = false;
        long startTime = System.currentTimeMillis();
        long maxTime = essNetTimeOut;
        long elapsedTime = 0;
        do {
        	try {
        		genNumber = essMember.getGenerationNumber();
        		exit = true;
        	} catch (EssException esx) {
        		// Check for Essbase connection issue
        		if (esx.getNativeCode() == PafBaseConstants.ESS_CONNECT_TIMEOUT_ERR) {
        			isConnectErr = true;
        			elapsedTime = System.currentTimeMillis() - startTime;
        			if (elapsedTime > maxTime) {
        				String errMsg = "Essbase time out - waited " + elapsedTime + "ms for an Essbase connection";
        				logger.error(errMsg);
        				throw esx;
        			}
        		} else {
        			throw esx;
        		}
        	}
        } while (!exit);	
		
		// Display appropriate message if connection error encountered
		if (isConnectErr) {
			String errMsg = "Waited " + elapsedTime + "ms for an Essbase connection";
			logger.warn(errMsg);
		}

		// Return generation number
		return genNumber;
	}

	/**
	 *  Return Essbase member level
	 *
	 * @param essMember Essbase member object
	 * @param essNetTimeOut Essbase network timeout (in milliseconds)
	 * 
	 * @return Member level
	 * @throws EssException 
	 */
	public static int essGetLevelNumber(IEssMember essMember, int essNetTimeOut) throws EssException {

		int levelNumber = 0;
		boolean exit = false, isConnectErr = false;
        long startTime = System.currentTimeMillis();
        long maxTime = essNetTimeOut;
        long elapsedTime = 0;
        do {
        	try {
        		levelNumber = essMember.getLevelNumber();
        		exit = true;
        	} catch (EssException esx) {
        		// Check for Essbase connection issue
        		if (esx.getNativeCode() == PafBaseConstants.ESS_CONNECT_TIMEOUT_ERR) {
        			isConnectErr = true;
        			elapsedTime = System.currentTimeMillis() - startTime;
        			if (elapsedTime > maxTime) {
        				String errMsg = "Essbase time out - waited " + elapsedTime + "ms for an Essbase connection";
        				logger.error(errMsg);
        				throw esx;
        			}
        		} else {
        			throw esx;
        		}
        	}
        } while (!exit);	
		
		// Display appropriate message if connection error encountered
		if (isConnectErr) {
			String errMsg = "Waited " + elapsedTime + "ms for an Essbase connection";
			logger.warn(errMsg);
		}

		// Return level number
		return levelNumber;
	}

	/**
	 *  Get multi-dimensional data set from Essbase cube view
	 *
	 * @param essCubeView Essbase cube view object
	 * @param essNetTimeOut Essbase network timeout (in milliseconds)
	 * 
	 * @return IEssMdDataSet
	 * @throws EssException 
	 */
	public static IEssMdDataSet essGetMdDataSet(IEssCubeView essCubeView, int essNetTimeOut) throws EssException {

		IEssMdDataSet essMdDataSet = null;
		boolean exit = false, isConnectErr = false;
        long startTime = System.currentTimeMillis();
        long maxTime = essNetTimeOut;
        long elapsedTime = 0;
        do {
        	try {
        		essMdDataSet = essCubeView.getMdDataSet();
        		exit = true;
        	} catch (EssException esx) {
        		// Check for Essbase connection issue
        		if (esx.getNativeCode() == PafBaseConstants.ESS_CONNECT_TIMEOUT_ERR) {
        			isConnectErr = true;
        			elapsedTime = System.currentTimeMillis() - startTime;
        			if (elapsedTime > maxTime) {
        				String errMsg = "Essbase time out - waited " + elapsedTime + "ms for an Essbase connection";
        				logger.error(errMsg);
        				throw esx;
        			}
        		} else {
        			throw esx;
        		}
        	}
        } while (!exit);	
		
		// Display appropriate message if connection error encountered
		if (isConnectErr) {
			String errMsg = "Waited " + elapsedTime + "ms for an Essbase connection";
			logger.warn(errMsg);
		}

		// Return md data set
		return essMdDataSet;
	}

	/**
	 *  Get Essbase member alias
	 *
	 * @param essMember Essbase member object
	 * @param aliasTable Essbase alias table name
	 * @param essNetTimeOut Essbase network timeout (in milliseconds)
	 * 
	 * @return Member alias
	 * @throws EssException 
	 */
	public static String essGetMemberAlias(IEssMember essMember, String aliasTable, int essNetTimeOut) throws EssException {
		
		String memberAlias = null;
		boolean exit = false, isConnectErr = false;
        long startTime = System.currentTimeMillis();
        long maxTime = essNetTimeOut;
        long elapsedTime = 0;
        do {
        	try {
        		memberAlias = essMember.getAlias(aliasTable);
        		exit = true;
        	} catch (EssException esx) {
        		// Check for Essbase connection issue
        		if (esx.getNativeCode() == PafBaseConstants.ESS_CONNECT_TIMEOUT_ERR)  {
        			isConnectErr = true;
        			elapsedTime = System.currentTimeMillis() - startTime;
        			if (elapsedTime > maxTime) {
        				String errMsg = "Essbase time out - waited " + elapsedTime + "ms for an Essbase connection";
        				logger.error(errMsg);
        				throw esx;
        			}
        		} else {
        			throw esx;
        		}
        	}
        } while (!exit);	
		
		// Display appropriate message if connection error encountered
		if (isConnectErr) {
			String errMsg = "Waited " + elapsedTime + "ms for an Essbase connection";
			logger.warn(errMsg);
		}

		// Return member alias
		return memberAlias;
	}

	/**
	 *  Get essbase member name
	 *  
	 * @param essMember Essbase member object
	 * @param essNetTimeOut Essbase network timeout (in milliseconds)
	 * 
	 * @return Member name
	 * @throws EssException 
	 */
	public static String essGetMemberName(IEssMember essMember, int essNetTimeOut) throws EssException {
		
		String memberName = null;
		boolean exit = false, isConnectErr = false;
        long startTime = System.currentTimeMillis();
        long maxTime = essNetTimeOut;
        long elapsedTime = 0;
        do {
        	try {
        		memberName = essMember.getName();
        		exit = true;
        	} catch (EssException esx) {
        		// Check for Essbase connection issue
        		if (esx.getNativeCode() == PafBaseConstants.ESS_CONNECT_TIMEOUT_ERR) {
        			isConnectErr = true;
        			elapsedTime = System.currentTimeMillis() - startTime;
        			if (elapsedTime > maxTime) {
        				String errMsg = "Essbase time out - waited " + elapsedTime + "ms for an Essbase connection";
        				logger.error(errMsg);
        				throw esx;
        			}
        		} else {
        			throw esx;
        		}
        	}
        } while (!exit);	
		
		// Display appropriate message if connection error encountered
		if (isConnectErr) {
			String errMsg = "Waited " + elapsedTime + "ms for an Essbase connection";
			logger.warn(errMsg);
		}

		// Return member alias
		return memberName;
	}

	/**
	 *  Return Essbase member number
	 *  
	 * @param essMember Essbase member object
	 * @param essNetTimeOut Essbase network timeout (in milliseconds)
	 *
	 * @return Essbase member number
	 * @throws EssException 
	 */
	public static int essGetMemberNumber(IEssMember essMember, int essNetTimeOut) throws EssException {

		int mbrNumber = 0;
		boolean exit = false, isConnectErr = false;
        long startTime = System.currentTimeMillis();
        long maxTime = essNetTimeOut;
        long elapsedTime = 0;
        do {
        	try {
        		mbrNumber = essMember.getMemberNumber();
        		exit = true;
        	} catch (EssException esx) {
        		// Check for Essbase connection issue
        		if (esx.getNativeCode() == PafBaseConstants.ESS_CONNECT_TIMEOUT_ERR) {
        			isConnectErr = true;
        			elapsedTime = System.currentTimeMillis() - startTime;
        			if (elapsedTime > maxTime) {
        				String errMsg = "Essbase time out - waited " + elapsedTime + "ms for an Essbase connection";
        				logger.error(errMsg);
        				throw esx;
        			}
        		} else {
        			throw esx;
        		}
        	}
        } while (!exit);	
		
		// Display appropriate message if connection error encountered
		if (isConnectErr) {
			String errMsg = "Waited " + elapsedTime + "ms for an Essbase connection";
			logger.warn(errMsg);
		}

		// Return generation number
		return mbrNumber;
	}

	/**
	 *  Get essbase member parent
	 *  
	 * @param essMember Essbase member object
	 * @param essNetTimeOut Essbase network timeout (in milliseconds)
	 * 
	 * @return Member name
	 * @throws EssException 
	 */
	public static String essGetParentMemberName(IEssMember essMember, int essNetTimeOut) throws EssException {
		
		String parentMemberName = null;
		boolean exit = false, isConnectErr = false;
        long startTime = System.currentTimeMillis();
        long maxTime = essNetTimeOut;
        long elapsedTime = 0;
        do {
        	try {
        		parentMemberName = essMember.getParentMemberName();
        		exit = true;
        	} catch (EssException esx) {
        		// Check for Essbase connection issue
        		if (esx.getNativeCode() == PafBaseConstants.ESS_CONNECT_TIMEOUT_ERR) {
        			isConnectErr = true;
        			elapsedTime = System.currentTimeMillis() - startTime;
        			if (elapsedTime > maxTime) {
        				String errMsg = "Essbase time out - waited " + elapsedTime + "ms for an Essbase connection";
        				logger.error(errMsg);
        				throw esx;
        			}
        		} else {
        			throw esx;
        		}
        	}
        } while (!exit);	
		
		// Display appropriate message if connection error encountered
		if (isConnectErr) {
			String errMsg = "Waited " + elapsedTime + "ms for an Essbase connection";
			logger.warn(errMsg);
		}

		// Return member alias
		return parentMemberName;
	}

	/**
	 *  Get Essbase share option
	 *
	 * @param essMember Essbase member object
	 * @param essNetTimeOut Essbase network timeout (in milliseconds)
	 * 
	 * @return Essbase member share option
	 * @throws EssException 
	 */
	public static EEssShareOption essGetShareOption(IEssMember essMember, int essNetTimeOut) throws EssException {

		EEssShareOption shareOption = null;
		boolean exit = false, isConnectErr = false;
        long startTime = System.currentTimeMillis();
        long maxTime = essNetTimeOut;
        long elapsedTime = 0;
        do {
        	try {
        		shareOption = essMember.getShareOption();
        		exit = true;
        	} catch (EssException esx) {
        		// Check for Essbase connection issue
        		if (esx.getNativeCode() == PafBaseConstants.ESS_CONNECT_TIMEOUT_ERR) {
        			isConnectErr = true;
        			elapsedTime = System.currentTimeMillis() - startTime;
        			if (elapsedTime > maxTime) {
        				String errMsg = "Essbase time out - waited " + elapsedTime + "ms for an Essbase connection";
        				logger.error(errMsg);
        				throw esx;
        			}
        		} else {
        			throw esx;
        		}
        	}
        } while (!exit);	
		
		// Display appropriate message if connection error encountered
		if (isConnectErr) {
			String errMsg = "Waited " + elapsedTime + "ms for an Essbase connection";
			logger.warn(errMsg);
		}

		// Return share option
		return shareOption;
	}

	/**
	 *  Open Essbase member selection query
	 *
	 * @param essCube Essbase Cube
	 * @param mbrSelName Member selection name
	 * @param essNetTimeOut Essbase network timeout (in milliseconds)
	 * 
	 * @return IEssMemberSelection
	 * @throws EssException 
	 */
	public static IEssMemberSelection essOpenMemberSelection(IEssCube essCube, String mbrSelName, int essNetTimeOut) throws EssException {

		IEssMemberSelection mbrSelQry = null;
		boolean exit = false, isConnectErr = false;
        long startTime = System.currentTimeMillis();
        long maxTime = essNetTimeOut;
        long elapsedTime = 0;
        do {
        	try {
        		mbrSelQry = essCube.openMemberSelection(mbrSelName);
        		exit = true;
        	} catch (EssException esx) {
        		// Check for Essbase connection issue
        		if (esx.getNativeCode() == PafBaseConstants.ESS_CONNECT_TIMEOUT_ERR) {
        			isConnectErr = true;
        			elapsedTime = System.currentTimeMillis() - startTime;
        			if (elapsedTime > maxTime) {
        				String errMsg = "Essbase time out - waited " + elapsedTime + "ms for an Essbase connection";
        				logger.error(errMsg);
        				throw esx;
        			}
        		} else {
        			throw esx;
        		}
        	}
        } while (!exit);	
		
		// Display appropriate message if connection error encountered
		if (isConnectErr) {
			String errMsg = "Waited " + elapsedTime + "ms for an Essbase connection";
			logger.warn(errMsg);
		}

		// Return member selection
		return mbrSelQry;
	}

	/**
	 *  Open Essbase cube outline in read-only mode
	 *  
	 * @param essCube Essbase cube object
	 * @param essNetTimeOut Essbase network timeout (in milliseconds)
	 *
	 * @return IEssCubeOutline
	 * @throws EssException 
	 */
	public static IEssCubeOutline essOpenOutline(IEssCube essCube, int essNetTimeOut) throws EssException {

		IEssCubeOutline cubeOtl = null;
		boolean exit = false, isConnectErr = false;
        long startTime = System.currentTimeMillis();
        long maxTime = essNetTimeOut;
        long elapsedTime = 0;
        do {
        	try {
        		cubeOtl = essCube.openOutline();
        		exit = true;
        	} catch (EssException esx) {
        		// Check for Essbase connection issue
        		if (esx.getNativeCode() == PafBaseConstants.ESS_CONNECT_TIMEOUT_ERR) {
        			isConnectErr = true;
        			elapsedTime = System.currentTimeMillis() - startTime;
        			if (elapsedTime > maxTime) {
        				String errMsg = "Essbase time out - waited " + elapsedTime + "ms for an Essbase connection";
        				logger.error(errMsg);
        				throw esx;
        			}
        		} else {
        			throw esx;
        		}
        	}
        } while (!exit);	
		
		// Display appropriate message if connection error encountered
		if (isConnectErr) {
			String errMsg = "Waited " + elapsedTime + "ms for an Essbase connection";
			logger.warn(errMsg);
		}

		// Return cube outline
		return cubeOtl;
	}

	/**
	 *  Perform Essbase cube view operation of running mdx query
	 *
	 * @param essCubeView Essbase cube view object
	 * @param essOpMdxQuery Mdx query object
	 * @param essNetTimeOut Essbase network timeout (in milliseconds)
	 * 
	 * @throws EssException 
	 */
	public static void essPerformOperation(IEssCubeView essCubeView, IEssOpMdxQuery essOpMdxQuery, int essNetTimeOut) throws EssException {

		boolean exit = false, isConnectErr = false;
        long startTime = System.currentTimeMillis();
        long maxTime = essNetTimeOut;
        long elapsedTime = 0;
        do {
        	try {
        		essCubeView.performOperation(essOpMdxQuery);
         		exit = true;
        	} catch (EssException esx) {
        		// Check for Essbase connection issue
        		if (esx.getNativeCode() == PafBaseConstants.ESS_CONNECT_TIMEOUT_ERR) {
        			isConnectErr = true;
        			elapsedTime = System.currentTimeMillis() - startTime;
        			if (elapsedTime > maxTime) {
        				String errMsg = "Essbase time out - waited " + elapsedTime + "ms for an Essbase connection";
        				logger.error(errMsg);
        				throw esx;
        			}
        		} else {
        			throw esx;
        		}
        	}
        } while (!exit);	
		
		// Display appropriate message if connection error encountered
		if (isConnectErr) {
			String errMsg = "Waited " + elapsedTime + "ms for an Essbase connection";
			logger.warn(errMsg);
		}
		
	}

	/**
	 *  Set mdx query object in cube view
	 *
	 * @param essOpMdxQuery Essbase mdx query object
	 * @param dataLess Indicates if query returns no data
	 * @param mdxQuery Mdx query string
	 * @param needCellAttributes Indicates if cell attributes are needed
	 * @param id Query id type
	 * @param essNetTimeOut Essbase network timeout (in milliseconds)
	 * 
	 * @throws EssException 
	 */
	public static void essSetQuery(IEssOpMdxQuery essOpMdxQuery, boolean dataLess, String mdxQuery, boolean needCellAttributes, EEssMemberIdentifierType name, int essNetTimeOut) throws EssException {
		
		boolean exit = false, isConnectErr = false;
        long startTime = System.currentTimeMillis();
        long maxTime = essNetTimeOut;
        long elapsedTime = 0;
        do {
        	try {
        		essOpMdxQuery.setQuery(dataLess, mdxQuery, needCellAttributes,IEssOpMdxQuery.EEssMemberIdentifierType.NAME);
        		exit = true;
        	} catch (EssException esx) {
        		// Check for Essbase connection issue
        		if (esx.getNativeCode() == PafBaseConstants.ESS_CONNECT_TIMEOUT_ERR) {
        			isConnectErr = true;
        			elapsedTime = System.currentTimeMillis() - startTime;
        			if (elapsedTime > maxTime) {
        				String errMsg = "Essbase time out - waited " + elapsedTime + "ms for an Essbase connection";
        				logger.error(errMsg);
        				throw esx;
        			}
        		} else {
        			throw esx;
        		}
        	}
        } while (!exit);	
		
		// Display appropriate message if connection error encountered
		if (isConnectErr) {
			String errMsg = "Waited " + elapsedTime + "ms for an Essbase connection";
			logger.warn(errMsg);
		}
		
	}

//	/**
//	 *  Return Essbase time-out setting (milliseconds)
//	 *
//	 * @return long
//	 */
//	private static long getEssNetTimeOut() {
//		return 180000;
//	}

}
	