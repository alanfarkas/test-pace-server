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
import com.essbase.api.dataquery.IEssCubeView;
import com.essbase.api.dataquery.IEssMdDataSet;
import com.essbase.api.dataquery.IEssOpMdxQuery;
import com.essbase.api.domain.IEssDomain;
import com.pace.base.PafErrSeverity;
import com.pace.base.PafException;


/**
 * Essbase cube view wrapper
 *
 * @version	x.xx
 * @author Alan Farkas
 *
 */
public class EsbCubeView   {
	
	private String esbServer = null; 
	private String esbApp = null; 
	private String esbDb = null;
	private EsbConnMgr esbConnMgr = null;
	private IEssCubeView essCubeView = null;
	private IEssDomain essDomain = null;
    private static Logger logger = Logger.getLogger(EsbCubeView.class);


	/**
	 * @param cubeViewName Essbase cube view name
	 * @param esbConnPool Essbase connection pool name
	 * @param connPerOp Indicates if a connection should be created per operation
	 * @throws PafException
	 */
	public EsbCubeView(String cubeViewName, String esbConnPool,  boolean connPerOp) throws PafException {
		
		logger.info("Creating instance of EsbCubeView");
		try {
			// Get an Essbase domain connection
			esbConnMgr = new EsbConnMgr();
			essDomain = esbConnMgr.getEsbDomain().getEssDomain();
			
			// Get a cube view
			essCubeView = essDomain.openCubeView(cubeViewName, esbConnPool, connPerOp);

		} catch (EssException esx) {
			// throw Paf Exception
			String errMsg = "Essbase Exception: " + esx.getMessage();
            logger.error(errMsg);
			PafException pfe = new PafException(errMsg, PafErrSeverity.Error, esx);	
			throw pfe;
		}

	}


	/**
	 * @param cubeViewName Essbase cube view name
	 * @param connectionProps Essbase connection property string
	 * @throws PafException
	 */
	public EsbCubeView (String cubeViewName, Properties connectionProps) throws PafException {
		// Open cube view in read-only mode, using default options
		this (cubeViewName, connectionProps, false, false, false, true);
	}

	/**
	 * @param cubeViewName Essbase cube view name
	 * @param connectionProps Essbase connection property string
	 * @param readOnly True indicates that the cube view should be opened in read only mode
	 * @throws PafException
	 */
	public EsbCubeView (String cubeViewName, Properties connectionProps, boolean readOnly) throws PafException {
		// Open cube view using default options
		this (cubeViewName, connectionProps, false, false, false, readOnly);
	}

	/**
	 * @param cubeViewName Essbase cube view name
	 * @param connectionProps Essbase connection property string
	 * @param useConnPool True, if a connection pool should be used
	 * @param connPerOp True indicates that a new connection should be opened per operation
	 * @param useCluster True indicates that a cluster pool should be used
	 * @param readOnly True indicates that the cube view should be opened in read only mode
	 * @throws PafException
	 */
	public EsbCubeView (String cubeViewName, Properties connectionProps, boolean useConnPool, boolean connPerOp, boolean useCluster, boolean readOnly) throws PafException {

		logger.debug("Creating instance of EsbCubeView");
		try {
			// Get connection parameters for specified connection property string 
			esbServer = connectionProps.getProperty("SERVER");
			esbApp = connectionProps.getProperty("APPLICATION");
			esbDb = connectionProps.getProperty("DATABASE");

			// Get an Essbase domain connection
			esbConnMgr = new EsbConnMgr(connectionProps);
			essDomain = esbConnMgr.getEsbDomain().getEssDomain();

			// Get a cube view
			essCubeView = essDomain.openCubeView(cubeViewName, esbServer, esbApp, esbDb, useConnPool, connPerOp, useCluster, readOnly);

		} catch (EssException esx) {
			// throw Paf Exception
			String errMsg = "Essbase Exception: " + esx.getMessage();
			logger.error(errMsg);
			PafException pfe = new PafException(errMsg, PafErrSeverity.Error, esx);	
			throw pfe;
		}
	}


	/**
	 * @param cubeViewName Essbase cube view name
	 * @param esbConnMgr Essbase connection manager instance
	 * @param readOnly True indicates that the cube view should be opened in read only mode
	 * @throws PafException
	 */
	public EsbCubeView (String cubeViewName, EsbConnMgr esbConnMgr, Properties connectionProps, boolean readOnly) throws PafException {

		logger.info("Creating instance of EsbCubeView");
		try {
			// Get connection parameters for specified connection property string 
			esbServer = connectionProps.getProperty("SERVER");
			esbApp = connectionProps.getProperty("APPLICATION");
			esbDb = connectionProps.getProperty("DATABASE");

			// Get an Essbase domain connection
			essDomain = esbConnMgr.getEsbDomain().getEssDomain();

			// Get a cube view
			essCubeView = essDomain.openCubeView(cubeViewName, esbServer, esbApp, esbDb, false, false, false, readOnly);

		} catch (EssException esx) {
			// throw Paf Exception
			String errMsg = "Essbase Exception: " + esx.getMessage();
			logger.error(errMsg);
			PafException pfe = new PafException(errMsg, PafErrSeverity.Error, esx);	
			throw pfe;
		}
	}

	/**
	 *	Run mdx query out to result set. This is a convenience method that in-turn
	 *	calls runMdxQuery (mdxQuery, dataLess, needCellAttributes) with both the
	 *	"dataLess" and "needCellAttributes" parameters set to false.
	 *
	 * @param mdxQuery
	 * @param essNetTimeOut Essbase network timeout (in milliseconds)
	 * 
	 * @return Essbase MdDataSet object
	 * @throws EssException 
	 */
	public IEssMdDataSet runMdxQuery(String mdxQuery, int essNetTimeOut) throws EssException {

		return runMdxQuery(mdxQuery, false, false, essNetTimeOut);
	}

	/**
	 *	Run mdx query out to result set
	 *
	 * @param mdxQuery Mdx query string
	 * @param dataLess If true, then no data will be returned
	 * @param needCellAttributes Indicates if cell attributes are required
	 * @param essNetTimeOut Essbase network timeout (in milliseconds)
	 * 
	 * @return Essbase MdDataSet object
	 * @throws EssException 
	 */
	public IEssMdDataSet runMdxQuery(String mdxQuery, boolean dataLess, boolean needCellAttributes, int essNetTimeOut) throws EssException {
		
		IEssMdDataSet essMdDataSet = null;
		IEssOpMdxQuery essOpMdxQuery = null;

		// Setup mdx query 
		essOpMdxQuery = EsbUtility.essCreateIEssOpMdxQuery(essCubeView, essNetTimeOut);
		EsbUtility.essSetQuery(essOpMdxQuery, dataLess, mdxQuery, needCellAttributes,
				IEssOpMdxQuery.EEssMemberIdentifierType.NAME, essNetTimeOut);

		// Run mdx query out to result set
		EsbUtility.essPerformOperation(essCubeView, essOpMdxQuery, essNetTimeOut);
		essMdDataSet = EsbUtility.essGetMdDataSet(essCubeView, essNetTimeOut);

		return essMdDataSet;
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
	 * @return Returns the essCubeView.
	 */
	public IEssCubeView getEssCubeView() {
		return essCubeView;
	}


	/**
	 * Disconnection and clean-up process
	 * 
	 * @throws PafException 
	 */
	public void disconnect() throws PafException {
		
		try {
			if (essCubeView != null) {
				essCubeView.close();
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
