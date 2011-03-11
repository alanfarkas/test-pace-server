/*
 *	File: @(#)EsbCubeView.java 		Package: com.pace.base.mdb.essbase 		Project: Essbase Provider
 *	Created: Aug 14, 2005  			By: Alan Farkas
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

import java.util.Properties;

import org.apache.log4j.Logger;

import com.essbase.api.base.EssException;
import com.essbase.api.datasource.IEssCube;
import com.essbase.api.datasource.IEssOlapServer;
import com.essbase.api.domain.IEssDomain;
import com.pace.base.PafBaseConstants;
import com.pace.base.PafErrSeverity;
import com.pace.base.PafException;


/**
 * Essbase cube view wrapper
 *
 * @version	x.xx
 * @author Alan Farkas
 *
 */
public class EsbCube   {
	
	private String esbServer = null; 
	private String esbApp = null; 
	private String esbDb = null;
	private EsbConnMgr esbConnMgr = null;
	private IEssCube essCube = null;
	private IEssDomain essDomain = null;
	private IEssOlapServer olapServer = null;
    private static Logger logger = Logger.getLogger(EsbCube.class);


	/**
	 * @param esbConnAlias Essbase connection alias
	 * @throws PafException
	 */
	public EsbCube (String esbConnAlias) throws PafException {
			
		logger.info("Creating instance of EsbCube");
		try {
			// Get connection parameters for specified connection alias 
			EsbConnParms esbConnParms = new EsbConnParms(esbConnAlias);
			esbServer = esbConnParms.getEsbServer();
			esbApp = esbConnParms.getEsbApp();
			esbDb = esbConnParms.getEsbDb();
			
			// Get an Essbase domain connection
			esbConnMgr = new EsbConnMgr();
			essDomain = esbConnMgr.getEsbDomain().getEssDomain();
			
			// Open connection to olap server
			olapServer = essDomain.getOlapServer(esbServer);
			olapServer.connect();

			// Get cube
			essCube = olapServer.getApplication(esbApp).getCube(esbDb);

		} catch (EssException esx) {
			// throw Paf Exception
			String errMsg = "Essbase Exception: " + esx.getMessage();
            logger.error(errMsg);
			PafException pfe = new PafException(errMsg, PafErrSeverity.Error, esx);	
			throw pfe;
		} catch (Exception ex) {
			// throw Paf Exception
			String errMsg = "Java Exception: " + ex.getMessage();
            logger.error(errMsg);
			PafException pfe = new PafException(errMsg, PafErrSeverity.Error, ex);	
			throw pfe;
		}

	}
	
	/**
	 * @param connectionProps Essbase connection property collection
	 * @throws PafException
	 */
	public EsbCube (Properties connectionProps) throws PafException {
		
		logger.info("Creating instance of EsbCube");
		try {
			// Get connection parameters for specified connection alias 
			esbServer = connectionProps.getProperty(PafBaseConstants.CONN_PROPERTY_ESB_SERVER);
			esbApp = connectionProps.getProperty(PafBaseConstants.CONN_PROPERTY_ESB_APP);
			esbDb = connectionProps.getProperty(PafBaseConstants.CONN_PROPERTY_ESB_DB);
			
			// Get an Essbase domain connection
			esbConnMgr = new EsbConnMgr(connectionProps);
			essDomain = esbConnMgr.getEsbDomain().getEssDomain();
			
			// Open connection to olap server
			olapServer = essDomain.getOlapServer(esbServer);
			olapServer.connect();
			
			// Get cube
			essCube = olapServer.getApplication(esbApp).getCube(esbDb);
			
		} catch (EssException esx) {
			// throw Paf Exception
			String errMsg = "Essbase Exception: " + esx.getMessage();
			logger.error(errMsg);
			PafException pfe = new PafException(errMsg, PafErrSeverity.Error, esx);	
			throw pfe;
		} catch (Exception ex) {
			// throw Paf Exception
			String errMsg = "Java Exception: " + ex.getMessage();
			logger.error(errMsg);
			PafException pfe = new PafException(errMsg, PafErrSeverity.Error, ex);	
			throw pfe;
		}
	}
	
	
	/**
	 * @return Returns the esbApp.
	 */
	public String getEsbApp() {
		return esbApp;
	}

	/**
	 * @return Returns the esbDb.
	 */
	public String getEsbDb() {
		return esbDb;
	}

	/**
	 * @return Returns the esbServer.
	 */
	public String getEsbServer() {
		return esbServer;
	}

	/**
	 * @return Returns the essCube.
	 */
	public IEssCube getEssCube() {
		return essCube;
	}

	/**
	 * @return Returns the olapServer.
	 */
	public IEssOlapServer getOlapServer() {
		return olapServer;
	}

	/**
	 * Disconnection and clean-up process
	 * 
	 * @throws PafException 
	 */
	public void disconnect() throws PafException {
		
		try {
			if (olapServer != null) {
				olapServer.disconnect();
			}
		} catch (EssException esx) {
			// throw Paf Exception
			String errMsg = "Essbase Exception: " + esx.getMessage();
            logger.error(errMsg);
			PafException pfe = new PafException(errMsg, PafErrSeverity.Error, esx);	
			throw pfe;
		} catch (Exception ex) {
			// throw Paf Exception
			String errMsg = "Java Exception: " + ex.getMessage();
            logger.error(errMsg);
			PafException pfe = new PafException(errMsg, PafErrSeverity.Error, ex);	
			throw pfe;
		} finally {
			try {
				if (esbConnMgr != null) {
					esbConnMgr.cleanup();
				}
			} catch (PafException pfe) {
				// throw Paf Exception
				throw pfe;
			}
		}
	}

	
	
}
