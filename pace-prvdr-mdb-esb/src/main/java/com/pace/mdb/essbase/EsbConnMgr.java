/*
 *	File: @(#)EsbConnMgr.java 	Package: com.pace.base.mdb.essbase 	Project: Essbase Provider
 *	Created: Aug 11, 2005  		By: Alan Farkas
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

import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

import org.apache.log4j.Logger;

import com.pace.base.PafException;
import com.pace.base.mdb.IPafConnection;
import com.pace.base.utility.PropertyLoader;


/**
 * Manages multiple connections to the Essbase back-end
 *
 * @version	x.xx
 * @author Alan Farkas
 *
 */
public class EsbConnMgr {
	
		private EsbDomain esbDomain = null;
		private HashMap<String, IPafConnection> esbConnList = null;
		private static Logger logger = Logger.getLogger("EsbConnMgr");

	/**
	 * @throws PafException 
	 */
	public EsbConnMgr() throws PafException {
		
		String esbDomainName = "[Not Initialized]";
		String esbDomainUrl = "[Not Initialized]";
		String esbDomainUser = "[Not Initialized]";
		String esbDomainPswd = "[Not Initialized]";
		
		// Initialize connection list object
		esbConnList = new HashMap<String, IPafConnection>();
		
		// Read EDS connection information from property file
		Properties installProps = PropertyLoader.loadProperties("Install");
		esbDomainName = installProps.getProperty("EDSDomain");
		esbDomainUrl = installProps.getProperty("EDSUrl");
		esbDomainUser = installProps.getProperty("EDSUser");
		esbDomainPswd = installProps.getProperty("EDSPswd");
		
		// Connect to EDS & create new EsbDomain object
		esbDomain = new EsbDomain(esbDomainName, esbDomainUrl, esbDomainUser, esbDomainPswd);
			
	}

	/**
	 * @param connectionProps Connection property string
	 * @throws PafException 
	 */
	public EsbConnMgr(Properties connectionProps) throws PafException {
		String esbDomainName = "[Not Initialized]";
		String esbDomainUrl = "[Not Initialized]";
		String esbDomainUser = "[Not Initialized]";
		String esbDomainPswd = "[Not Initialized]";
		
		// Initialize connection list object
		esbConnList = new HashMap<String, IPafConnection>();
		
		// Read EDS connection information from connection property string
		esbDomainName = connectionProps.getProperty("EDSDOMAIN");
		esbDomainUrl = connectionProps.getProperty("EDSURL");
		esbDomainUser = connectionProps.getProperty("USER");
		esbDomainPswd = connectionProps.getProperty("PASSWORD");
		
		// Connect to EDS & create new EsbDomain object
		esbDomain = new EsbDomain(esbDomainName, esbDomainUrl, esbDomainUser, esbDomainPswd);
		
	}

	/**
	 *	Return Essbase domain
	 *
	 * @return Essbase domain object (type EsbDomain)
	 */
	public EsbDomain getEsbDomain() {
		return esbDomain;
	}
		
	/**
	 *	Generate and return an Essbase connection
	 *
	 * @param connectionProps Connection property string
	 * 
	 * @return IPafConnection Connection object
	 * @throws PafException 
	 */
	public IPafConnection getConnection(Properties connectionProps) throws PafException {
		
		String errMsg = "Error in Essbase connection manager - ";
		IPafConnection pafConnection = null;
		
		// Check for matching connection - if one exists, then return it
		String esbServer =  connectionProps.getProperty("SERVER");
		if (esbServer == null) {
			errMsg += "Unable to resolve the [SERVER] property";
			logger.error(errMsg);
			throw new IllegalArgumentException(errMsg);
		}
		String esbApp =  connectionProps.getProperty("APPLICATION");
		if (esbApp == null) {
			errMsg += "Unable to resolve the [APPLICATION] property";
			logger.error(errMsg);
			throw new IllegalArgumentException(errMsg);
		}
		String esbDb =  connectionProps.getProperty("DATABASE");
		if (esbDb == null) {
			errMsg += "Unable to resolve the [DATABASE] property";
			logger.error(errMsg);
			throw new IllegalArgumentException(errMsg);
		}
		String connectionKey = esbServer + "/" + esbApp + "/" + esbDb;
		
		if (esbConnList != null && esbConnList.containsKey(connectionKey)) {
			pafConnection = this.esbConnList.get(connectionKey);
		} else { 
			// Else - generate connection for specified connection property string
			pafConnection  = new EsbCubeConn(esbDomain, connectionProps);
			esbConnList.put(connectionKey, pafConnection);
		}
		return pafConnection;
	}

	/**
	 *	Disconnect specified connection
	 *
	 * @param PafConnection
	 */
	public void disconnect(IPafConnection PafConnection) {
		return;
	}

	/**
	 *	Clean-up any open connections
	 *
	 * @throws PafException 
	 */
	public void cleanup() throws PafException {
		
		String name = null;
		
		// Clean-up all the Essbase server connections
		if (esbConnList!= null) {
			Set<String> connectionKeys = esbConnList.keySet();
			for (String connectionKey : connectionKeys) {
				IPafConnection pafConnection = esbConnList.get(connectionKey);
				name = pafConnection.getClass().getSimpleName();
				if (name.equals("EsbServerConn")) {
					EsbServerConn esbServerConn = (EsbServerConn) pafConnection;
					esbServerConn.disconnect();
				} else if (name.equals("EsbCubeConn")) {
					EsbCubeConn esbCubeConn = (EsbCubeConn) pafConnection;
					esbCubeConn.disconnect();
				}
				esbConnList.remove(connectionKey);
			}
		}

		// Next clean-up the EsbDomain connection
		if (esbDomain != null) {
			esbDomain.disconnect();
			esbDomain = null;
		}
	}

	/**
	 * Override "finalize" method
	 * 
	 * @see java.lang.Object#finalize()
	 */
	public void finalize() throws Throwable {
		
		// Clean-up any open connections
		cleanup();
		
		// Finally call the superclass finalize method
		super.finalize();
	}


}
