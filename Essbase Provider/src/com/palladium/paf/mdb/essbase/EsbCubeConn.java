/*
 *	File: @(#)Class1.java 	Package: com.palladium.paf.mdb.essbase 	Project: AF-Essbase Provider
 *	Created: Aug 10, 2005  		By: Alan Farkas
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

import com.essbase.api.base.EssException;
import com.essbase.api.datasource.IEssCube;
import com.essbase.api.datasource.IEssOlapServer;
import com.essbase.api.domain.IEssDomain;
import com.palladium.paf.PafErrSeverity;
import com.palladium.paf.PafException;
import com.palladium.paf.mdb.IPafConnection;


/**
 * Essbase cube connection wrapper
 *
 * @version	x.xx
 * @author Alan Farkas
 *
 */
public class EsbCubeConn  implements IPafConnection {
	
	private EsbDomain esbDomain = null;
	private IEssOlapServer essOlapServer = null;
	private IEssCube essCube = null;
	private static Logger logger = Logger.getLogger(EsbCubeConn.class);
	

	/**
	 * @param esbDomain Essbase domain object
	 * @param props Essbase connection properties
	 * @throws PafException 
	 */
	public EsbCubeConn(EsbDomain esbDomain, Properties props) throws PafException {
		
		String esbApp = null;
		String esbDb = null;
		String esbServer = null;
		
		logger.debug("Creating instance of EsbCubeConn");

		// Get a connection to the Essbase domain
		this.esbDomain = esbDomain;		
		IEssDomain essDomain = esbDomain.getEssDomain();
       
		// Open connection with Essbase server using any available connection pool
		esbServer = props.getProperty("SERVER");
		esbApp = props.getProperty("APPLICATION");
		esbDb = props.getProperty("DATABASE");
        try {
			essOlapServer = essDomain.getOlapServer(esbServer);
		    essOlapServer.connect(true, false);
	        essCube = essOlapServer.getApplication(esbApp).getCube(esbDb);
		} catch (EssException esx) {
			// throw Paf Exception
			String errMsg = "Essbase Exception: " + esx.getMessage();
			logger.error(errMsg);
			PafException pfe = new PafException(errMsg, PafErrSeverity.Error, esx);	
			throw pfe;
		}
	}

	/**
	 *	Return the Essbase domain object
	 *
	 * @return Returns the Essbase domain object.
	 */
	public EsbDomain getEsbDomain() {
		return esbDomain;
	}

	/**
	 *	Return the Essbase cube instance
	 *
	 * @return Returns the Essbase cube instance.
	 */
	public IEssCube getEssCube() {
		return essCube;
	}	
	
	/**
	 *	Return the Essbase olap server instance
	 *
	 * @return Returns the olap server instance.
	 */
	public IEssOlapServer getEssOlapServer() {
		return essOlapServer;
	}

	
	/**
	 *	Disconnect from Essbase server
	 *
	 * @throws PafException
	 */
	protected void disconnect() throws PafException {
		
        try {
			if (essOlapServer != null && essOlapServer.isConnected()) {
				essCube = null;
                essOlapServer.disconnect();
			}
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
			essCube = null;
			essOlapServer = null;
			//essDomain = null;
			//essbase = null;
		}
	}
		
}
