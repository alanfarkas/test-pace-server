/*
 *	File: @(#)EsbConnAliasEntry.java 	Package: com.palladium.paf.mdb.essbase 	Project: Essbase Provider
 *	Created: Aug 13, 2005  				By: Alan Farkas
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
package com.palladium.paf.mdb.essbase;

import java.util.Properties;

import org.apache.log4j.Logger;

import com.palladium.paf.PafErrSeverity;
import com.palladium.paf.PafException;
import com.palladium.utility.PropertyLoader;

/**
 * This class defines an Essbase connection alias entry
 *
 * @version	x.xx
 * @author Alan Farkas
 *
 */
public class EsbConnAliasEntry {

	private String esbConnAlias = "[NOT INITIALIZED]";
	private EsbConnType esbConnType = null;
	private String esbServer = "[NOT INITIALIZED]";
	private String esbUser = "[NOT INITIALIZED]";
	private String esbPswd = "[NOT INITIALIZED]";
	private String esbApp = "[NOT INITIALIZED]";
	private String esbDb = "[NOT INITIALIZED]";
	private static Logger logger = Logger.getLogger(EsbConnAliasEntry.class);

	/**
	 * @param esbConnAlias Essbase connection alias string
	 * @throws PafException 
	 */
	public EsbConnAliasEntry(String esbConnAlias) throws PafException {
		
		logger.debug("Creating instance of EsbConnAliasEntry");
		try {
			// Look for connection alias entry in property file           
            Properties installProps = PropertyLoader.loadProperties("Install");
			setEsbConnAlias(esbConnAlias);
			if (esbConnAlias == "TitanServer") {
				setEsbConnType(EsbConnType.PAF_CONN_ESB_SERVER);
			}
			else {
				setEsbConnType(EsbConnType.PAF_CONN_ESB_CUBE);
			}
			setEsbServer(installProps.getProperty(esbConnAlias + "EsbServer"));
			setEsbUser(installProps.getProperty(esbConnAlias + "EsbUser"));
			setEsbPswd(installProps.getProperty(esbConnAlias + "EsbPswd"));
			setEsbApp(installProps.getProperty(esbConnAlias + "EsbApp"));
			setEsbDb(installProps.getProperty(esbConnAlias + "EsbDb"));
			
		} catch (Exception ex) {
			// throw Paf Exception
			String errMsg = "Java Exception: " + ex.getMessage();
			logger.error(errMsg);
			PafException pfe = new PafException(errMsg, PafErrSeverity.Error, ex);	
			throw pfe;
		}
	}

	/**
	 *	Returns the Essbase application name
	 *
	 * @return Returns the Esbase application name
	 */
	public String getEsbApp() {
		return esbApp;
	}

	/**
	 *	Sets the Essbase application name
	 *
	 * @param esbApp The Essbase application name.
	 */
	protected void setEsbApp(String esbApp) {
		this.esbApp = esbApp;
	}

	/**
	 *	Returns the Essbase connection alias
	 *
	 * @return Returns the Essbase connection alias.
	 */
	public String getEsbConnAlias() {
		return esbConnAlias;
	}

	/**
	 *	Sets the Essbase connection alias
	 *
	 * @param esbConnAlias The Essbase connection alias.
	 */
	protected void setEsbConnAlias(String esbConnAlias) {
		this.esbConnAlias = esbConnAlias;
	}

	/**
	 *	Returns the Essbase connection type
	 *
	 * @return Returns the Essbase connection type.
	 */
	public EsbConnType getEsbConnType() {
		return esbConnType;
	}

	/**
	 *	Sets the Essbase connection type
	 *
	 * @param esbConnType Essbase connection type.
	 */
	protected void setEsbConnType(EsbConnType esbConnType) {
		this.esbConnType = esbConnType;
	}

	/**
	 *	Returns the Essbase database name
	 *
	 * @return Returns the Essbase database name.
	 */
	public String getEsbDb() {
		return esbDb;
	}

	/**
	 *	Sets the Essbase database name
	 *
	 * @param esbDb The Essbase database name.
	 */
	protected void setEsbDb(String esbDb) {
		this.esbDb = esbDb;
	}

	/**
	 *	Returns the Essbase login password
	 *
	 * @return Returns the Essbase login password.
	 */
	public String getEsbPswd() {
		return esbPswd;
	}

	/**
	 *	Sets the Essbase login password
	 *
	 * @param esbPswd The Essbase login password.
	 */
	protected void setEsbPswd(String esbPswd) {
		this.esbPswd = esbPswd;
	}

	/**
	 *	Returns the Essbase server name
	 *
	 * @return Returns the Essbase server name.
	 */
	public String getEsbServer() {
		return esbServer;
	}

	/**
	 *	Returns the Essbase server name
	 *
	 * @param esbServer The Essbase server name.
	 */
	protected void setEsbServer(String esbServer) {
		this.esbServer = esbServer;
	}

	/**
	 *	Returns the Essbase login ID
	 *
	 * @return Returns the Essbase login ID.
	 */
	public String getEsbUser() {
		return esbUser;
	}

	/**
	 *	Sets the Essbase login ID
	 *
	 * @param esbUser The Essbase login ID.
	 */
	protected void setEsbUser(String esbUser) {
		this.esbUser = esbUser;
	}

}
