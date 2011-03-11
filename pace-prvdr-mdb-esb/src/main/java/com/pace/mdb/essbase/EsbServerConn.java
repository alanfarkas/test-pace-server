/*
 *	File: @(#)EsbServerConn.java 	Package: com.pace.base.mdb.essbase 	Project: AF-Essbase Provider
 *	Created: Aug 10, 2005  			By: Alan Farkas
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

import org.apache.log4j.Logger;

import com.essbase.api.base.EssException;
import com.essbase.api.datasource.IEssOlapServer;
import com.essbase.api.domain.IEssDomain;
import com.pace.base.PafErrSeverity;
import com.pace.base.PafException;
import com.pace.base.mdb.IPafConnection;

/**
 * Essbase server connection wrapper
 *
 * @version	x.xx
 * @author Alan Farkas
 *
 */
public class EsbServerConn implements IPafConnection {
	
	private EsbDomain esbDomain = null;
	private IEssOlapServer essOlapServer = null;
	private static Logger logger = Logger.getLogger("EsbServerConn");
	
	/**
	 * @param esbDomain Essbase domain object
	 * @param esbConnParms Essbase connection parameters
	 * @throws PafException 
	 */
	public EsbServerConn(EsbDomain esbDomain, EsbConnParms esbConnParms) throws PafException {
		
		String esbServer = null;
				
		logger.debug("Creating instance of EsbServerConn");
		
		// Get a connection to the Essbase domain
		this.esbDomain = esbDomain;		
		IEssDomain essDomain = esbDomain.getEssDomain();
       
		// Open connection with Essbase server using any available connection pool
		esbServer = esbConnParms.getEsbServer();
        try {
			essOlapServer = essDomain.getOlapServer(esbServer);
		    essOlapServer.connect(true, false);
		} catch (EssException esx) {
			// throw Paf Exception
			String errMsg = "Essbase Exception: " + esx.getMessage();
			logger.error(errMsg);
			PafException pfe = new PafException(errMsg, PafErrSeverity.Error, esx);	
			throw pfe;
		}
 	}

	
	/**
	 *	Disconnect from Essbase server
	 *
	 * @throws PafException
	 */
	protected void disconnect() throws PafException {

        try {
			if (essOlapServer != null && essOlapServer.isConnected())
                essOlapServer.disconnect();
			// Disconnect from domain
			/*if (essbase!= null && (essbase.isSignedOn() == true))
				essbase.signOff(); */
		} catch (EssException esx) {
			// throw Paf Exception
			String errMsg = "Essbase Exception: " + esx.getMessage();
			logger.error(errMsg);
			PafException pfe = new PafException(errMsg, PafErrSeverity.Error, esx);	
			throw pfe;
		} finally {
			// Clean-up unneeded objects
			essOlapServer = null;
			//essDomain = null;
			//essbase = null;
		}
	}

	/**
	 *	Returns the Essbase domain object
	 *
	 * @return Returns the Essbase domain object.
	 */
	public EsbDomain getEsbDomain() {
		return esbDomain;
	}
	
	/**
	 *	Sets the Essbase domain object
	 *
	 * @param esbDomain The Essbase domain object to set.
	 */
	protected void setEsbDomain(EsbDomain esbDomain) {
		this.esbDomain = esbDomain;
	}
	
	/**
	 *	Returns the Essbase olap server object
	 *
	 * @return Returns the Essbase olap server object.
	 */
	public IEssOlapServer getEssOlapServer() {
		return essOlapServer;
	}
	
	/**
	 *	Sets the Essbase olap server object
	 *
	 * @param essOlapServer The Essbase olap server object to set.
	 */
	protected void setEssOlapServer(IEssOlapServer essOlapServer) {
		this.essOlapServer = essOlapServer;
	}
	
}
