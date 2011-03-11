/*
 *	File: @(#)EsbClassLoader.java 	Package: com.pace.base.server 	Project: PafServer
 *	Created: Mar 4, 2010  			By: AFarkas
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-20010 Palladium Group, Inc. All rights reserved.
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
package com.palladium.paf.server;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

import org.apache.log4j.Logger;

import com.pace.base.PafBaseConstants;
import com.pace.base.PafException;
import com.pace.base.mdb.IMdbClassLoader;
import com.pace.base.mdb.IMdbData;
import com.pace.base.mdb.IMdbMetaData;
import com.pace.base.utility.ClassPathHacker;
import com.pace.mdb.essbase.EsbData;
import com.pace.mdb.essbase.EsbMetaData;

/**
 * Load the necessary Essbase Provider classes
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class EsbClassLoader implements IMdbClassLoader {


	private Properties connectionProps = null;
	private String mdbApiVersion = null;
	private final static String VER_PROP = "HPSAPIVER";
	private final static String DEFAULT_ESB_API_VER = "11.1";
	private final static Set<String>  VALID_ESB_API_VERS = 
		new HashSet<String>(Arrays.asList(new String[] {"7.1.3", "9.2.0", "9.3.0", "11.1"}));
	private static Logger logger = Logger.getLogger(EsbClassLoader.class);
	
	/**
	 * Default constructor
	 * 
	 * @param connectionProps
	 */
	public EsbClassLoader(Properties connectionProps) {
		this.connectionProps = connectionProps;
	}

	/**
	 *  Load Essbase provider classes
	 *  
	 * @throws IOException 
	 *  
	 */
	public void load() throws IOException {
		
		// Get the mdb api version
		String esbAPIVer = getMdbApiVersion();
		logger.info("Loading Essbase api version: [" + esbAPIVer + "] class libraries.");

		// Form the essbase drivers path, which falls underneath 
		// the PafServer.war directory.
		String mdbDriverPath = ClassPathHacker.getClassPath() + ".." + File.separator 
				+ ".."  + File.separator + PafBaseConstants.DN_MdbDriverFldr;
		String esbDriverPath = mdbDriverPath + File.separator +  "essbase" + File.separator
				+ esbAPIVer + File.separator;

		// Get the list of jar files in the essbase drivers directory
		File redistDir = new File(esbDriverPath);
		FilenameFilter filter = new FilenameFilter() {
		    public boolean accept(File dir, String name) {
		        return name.endsWith(".jar");
		    }
		};
		File[] redistFiles = redistDir.listFiles(filter);
		
		// DISABLE DYNAMIC CLASS LOADING FOR NOW. ANT SCRIPTS NEED TO BE MODIFIED BEFORE THIS CODE CAN BE FULLY IMPLEMENTED
		//if (0==0) return; 
				
		// Add each essbase driver jar file to class path
		if (redistFiles != null && redistFiles.length > 0) {
			for (File redistFile : redistFiles) {
				logger.info(" -- Loading redist file [" + redistFile + "].");
				ClassPathHacker.addFile(redistFile);
			}
		} else {
			logger.warn("No Essbase driver files found!!!");
		}
		
	}

	/**
	 * @return the mdbVersion
	 */
	public String getMdbApiVersion() {

		// Lazy load mdbApiVersion
		if (mdbApiVersion == null) {
			String esbVerProp = connectionProps.getProperty(VER_PROP);
			if (esbVerProp != null && VALID_ESB_API_VERS.contains(esbVerProp)) {
				mdbApiVersion = esbVerProp;
			} else {
				mdbApiVersion = DEFAULT_ESB_API_VER;
				logger.warn("The connection property [" + VER_PROP + "] could not be found or is invalid. Using the default value of: ["
						+ mdbApiVersion + "].");
			}
		}
		
		return mdbApiVersion;
	}

	/** 
	 * @return the metaDataProvider()
	 * @throws PafException 
	 */
	public IMdbMetaData getMetaDataProvider() throws PafException {
		return new EsbMetaData(connectionProps);
	}

	/** 
	 * @return the metaDataProvider()
	 * @throws PafException 
	 */
	public IMdbData getMdbDataProvider() throws PafException {
		return new EsbData(connectionProps);
	}

}
