/*
 *	File: @(#)EsbConnParms.java 	Package: com.palladium.paf.mdb.essbase 	Project: Essbase Provider
 *	Created: Aug 13, 2005  			By: Alan Farkas
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

import com.palladium.paf.PafBaseConstants;
import com.palladium.paf.PafException;


/**
 * Essbase connection parameters
 *
 * @version	x.xx
 * @author Alan Farkas
 *
 */
public class EsbConnParms {

	private EsbConnType esbConnType = null;
	private String esbServer = null;
	private String esbUser = null;
	private String esbPswd = null;
	private String esbApp = null;
	private String esbDb = null;
	private static Logger logger = Logger.getLogger(EsbConnParms.class);

	/**
	 * @param esbConnAlias Essbase connection alias name
	 * @throws PafException
	 */
	public EsbConnParms(String esbConnAlias) throws PafException {

		// Lookup connection alias name and fill in the associated parameters
		logger.debug("Creating instance of EsbConnParms");
		EsbConnAliasEntry esbConnAliasEntry = new EsbConnAliasEntry(esbConnAlias);
		setEsbConnType(esbConnAliasEntry.getEsbConnType());
		setEsbServer(esbConnAliasEntry.getEsbServer());
		setEsbUser(esbConnAliasEntry.getEsbUser());
		setEsbPswd(esbConnAliasEntry.getEsbPswd());
		setEsbApp(esbConnAliasEntry.getEsbApp());
		setEsbDb(esbConnAliasEntry.getEsbDb());

	}

	/**
	 * @param connectionProps Essbase connection property object
	 */
	public EsbConnParms(Properties connectionProps) {

		// Lookup connection alias name and fill in the associated parameters
		logger.debug("Creating instance of EsbConnParms");
		setEsbConnType(EsbConnType.PAF_CONN_ESB_CUBE);
		setEsbServer(connectionProps.getProperty(PafBaseConstants.CONN_PROPERTY_ESB_SERVER));
		setEsbUser(connectionProps.getProperty(PafBaseConstants.CONN_PROPERTY_ESB_USER));
		setEsbPswd(connectionProps.getProperty(PafBaseConstants.CONN_PROPERTY_ESB_PSWD));
		setEsbApp(connectionProps.getProperty(PafBaseConstants.CONN_PROPERTY_ESB_APP));
		setEsbDb(connectionProps.getProperty(PafBaseConstants.CONN_PROPERTY_ESB_DB));

	}
	/**
	 *	Returns the Essbase application name
	 *
	 * @return Returns the Essbase application name.
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
	 * @param esbConnType The Essbase connection type.
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
	 *	Sets the Essbase server name
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
