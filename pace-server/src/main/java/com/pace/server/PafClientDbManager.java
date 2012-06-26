/*
 *	File: @(#)PafClientDbManager.java 		Package: com.pace.base.server 	Project: PafServer
 *	Created: Dec 27, 2007  			By: afarkas
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2007 Palladium Group, Inc. All rights reserved.
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
package com.pace.server;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.pace.base.PafErrSeverity;
import com.pace.base.PafException;
import com.pace.base.comm.SessionFactoryType;
import com.pace.base.db.Application;
import com.pace.base.db.DataSource;
import com.pace.base.db.Dimension;

/**
 * Client database manager superclass
 *
 * @version	1.00
 * @author afarkas
 *
 */
public abstract class PafClientDbManager {

	// used to override the default hibernate server session (mainly for unit testing)
	private static Session _session = null;

	//use single session or multi session when getSession() is called
	private static boolean singleSession = false;
	
	//instance of session factory
	private static SessionFactory sessionFactory = null;
	
	// static logger
    private static Logger logger = Logger.getLogger(PafClientDbManager.class);
    

	/**
	 * 
	 * Returns the current hibernate session.
	 *
	 * @return Current hibernate session
	 * @throws PafException 
	 */
	public static Session getSession() throws PafException {	

		// If single session, set session using client cache, otherwise open new session
		if ( isSingleSession() ) {			
			if ( _session == null ) {				
				_session = PafMetaData.currentPafClientCacheDBSession();				
			}
		} else {

			// If session factory exists, open new session
			logger.debug("Opening new hibernate session...");
			if ( getSessionFactory() != null ) {
				_session = getSessionFactory().openSession();
			} else {
				String errMsg = "Couldn't get an instance of the client cache db session factory";				
				logger.error(errMsg);
				throw new PafException(errMsg, PafErrSeverity.Error);
			}
		}
		
		return _session;
	}

	/**
	 * @param _session the session to set
	 */
	protected static void setSession(Session _session) {
		PafClientDbManager._session = _session;
	}

	/**
	 * @return the singleSession
	 */
	public static boolean isSingleSession() {
		return singleSession;
	}
	/**
	 * @param singleSession the singleSession to set
	 */
	public static void setSingleSession(boolean singleSession) {
		PafClientDbManager.singleSession = singleSession;
	}
	
	/**
	 * @return the sessionFactory
	 */
	public static SessionFactory getSessionFactory() {
		
		// If first time, get new session factory
		if ( sessionFactory == null ) {			
			sessionFactory = HibernateUtil.getSessionFactory(SessionFactoryType.PafClientCacheDB);	
		}
		
		return sessionFactory;
	}
	
	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	public static void setSessionFactory(SessionFactory sessionFactory) {
		PafClientDbManager.sessionFactory = sessionFactory;
	}
	
	/**
	 *  Generates a key based using a base key, then replaces invalid
	 *  characters with _
	 * 
	 * @param key base key to use for generation
	 * @return returns a modified key
	 */
	public static String generateKey(String key) {
		
		key = key.replace(' ', '_');
		key = key.replace('-', '_');
		key = key.replace('%', '_');
		key = key.replace('.', '_');
		
		return key;
	}

	/**
	 * 
	 *  Returns all applications.
	 *
	 * @param s Session to use
	 * @return	List of all applications
	 */
	@SuppressWarnings("unchecked")
	public static List<Application> getApplications(Session s) {	
	
		List<Application> applications = s.createQuery("from Application").list();
		
		// Return empty arraylist if no items were returned
		if (applications != null) {
			return applications;
		} else {
			return new ArrayList<Application>();
		}
	}
	
	/**
	 * 
	 *  Returns all application names.
	 *
	 * @param s Session to use
	 * @return	List of all application names
	 */
	@SuppressWarnings("unchecked")
	public static List<String> getAppNames(Session s) {	
		
		List<String> appNames = s.createQuery("select name from Application").list();
		
		// Return empty arraylist if no items were returned
		if (appNames != null) {
			return appNames;
		} else {
			return new ArrayList<String>();
		}
	}
	
	/**
	 * 
	 *  Returns a map<application name, application>.
	 *
	 * @param s Session to use
	 * @return map of application names and apps
	 */
	public static Map<String, Application> getApplicationMap(Session s) {
		
		logger.debug("DEBUG - Start getApplicationMap(Session) - " + new Date());
		
		Map<String, Application> ApplicationMap = new HashMap<String, Application>();
		
		//get list of apps
		List<Application> ApplicationList = getApplications(s);
		
		if ( ApplicationList != null ) {
		
			//loop over apps and add to map
			for (Application Application : ApplicationList ) {
				
				ApplicationMap.put(Application.getName(), Application);
				
			}
			
		}		
		
		logger.debug("DEBUG - End getApplicationMap(Session) - " + new Date());
		
		return ApplicationMap;
		
	}
	
	/**
	 * 
	 *  Returns all dimensions.
	 *
	 * @param s Session to use
	 * @return	List of all dimensions
	 */
	@SuppressWarnings("unchecked")
	public static List<Dimension> getDimensions(Session s) {	

		List<Dimension> dimensions = s.createQuery("from Dimension").list();
		
		// Return empty arraylist if no items were returned
		if (dimensions != null) {
			return dimensions;
		} else {
			return new ArrayList<Dimension>();
		}
	}
	
	/**
	 * 
	 *  Returns a map<dim name, dimension>.
	 *
	 * @param s Session to use
	 * @return map of dim names and dimensions
	 */
	public static Map<String, Dimension> getDimensionMap(Session s) {
		
		logger.debug("DEBUG - Start getDimensionMap(Session) - " + new Date());
		
		Map<String, Dimension> dimensionMap = new HashMap<String, Dimension>();
		
		//get list of dimensions
		List<Dimension> dimensionList = getDimensions(s);
		
		//if not null
		if ( dimensionList != null ) {
		
			//loop though dimension list
			for (Dimension dimension : dimensionList ) {
				
				//put into map
				dimensionMap.put(dimension.getName(), dimension);
				
			}
			
		}		
		
		logger.debug("DEBUG - End getDimensionMap(Session) - " + new Date());
		
		return dimensionMap;
		
	}
	
	/**
	 * 
	 *  Returns all data sources.
	 *
	 * @param s Session to use
	 * @return	List of all data sources
	 */
	@SuppressWarnings("unchecked")
	public static List<DataSource> getDataSources(Session s) {	
		 				
		List<DataSource> dataSources = s.createQuery("from DataSource").list();
		
		// Return empty arraylist if no items were returned
		if (dataSources != null) {
			return dataSources;
		} else {
			return new ArrayList<DataSource>();
		}
	}
	
	/**
	 * 
	 *  Returns a map<data source name, data source>.
	 *
	 * @param s Session to use
	 * @return map of data source names and data sources
	 */
	public static Map<String, DataSource> getDataSourceMap(Session s) {
	
		logger.debug("DEBUG - Start getDataSourceMap(Session) - " + new Date());
		
		Map<String, DataSource> DataSourceMap = new HashMap<String, DataSource>();
		
		//get list of data sources
		List<DataSource> DataSourceList = getDataSources(s);
		
		if ( DataSourceList != null ) {
		
			//loop over data source list and add to map
			for (DataSource DataSource : DataSourceList ) {
				
				DataSourceMap.put(DataSource.getName(), DataSource);
				
			}
			
		}		
		
		logger.debug("DEBUG - End getDataSourceMap(Session) - " + new Date());
		
		return DataSourceMap;
		
	}
	
	/**
	 * 
	 * Trys to close the session if multi and open
	 * 
	 * @param session session to close
	 */
	protected static void tryToCloseSession(Session session) {

		if ( session != null && ! isSingleSession() && session.isOpen() ) {
			
			logger.debug("Closing hibernate session");
			
			session.close();
			
		}
		
	}
	
	/**
	 * 
	 * Terminate a hibernate session
	 * 
	 * @param session session to terminate
	 */
	protected static void terminateSession(Session session) {
		
		// Close session
		tryToCloseSession(session);

		// Flush session if session is not null and session 
		// is still open (single session = true)
		if ( session != null && session.isOpen() ) {		
			session.flush();			
		}		
	}
	
}
