/*
 *	File: @(#)PafCellNoteManagerTest.java 	Package: com.palladium.paf.server 	Project: PafServer
 *	Created: Jul 23, 2007  		By: jmilliron
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
package com.palladium.paf.server;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.palladium.paf.PafBaseConstants;
import com.palladium.paf.PafException;
import com.palladium.paf.db.Application;
import com.palladium.paf.db.DataSource;
import com.palladium.paf.db.Dimension;
import com.palladium.paf.db.cellnotes.CellNote;
import com.palladium.paf.db.cellnotes.CellNoteMapping;
import com.palladium.paf.db.cellnotes.CellNotesInformation;

/**
 * JUnit test case for Cell Note Manager.
 *
 * @version	x.xx
 * @author javaj
 *
 */
public class PafCellNoteManagerTest extends TestCase {

	private static final Logger logger = Logger.getLogger(PafCellNoteManagerTest.class);
	
	private static boolean failAll = false;
	
	private static SessionFactory sessionFactory;
	
	public static final ThreadLocal session = new ThreadLocal();
	
	private static final String APP_ID = "TitanCopy";
	
	private static final String DATA_SOURCE_ID = "Titan";
	
	private PafCellNoteManager cellNoteManager = null; 
	
	private List<CellNote> cellNoteList = null;
	
	private static final String DIM_PRODUCT = "Product";
			
	private static final String DIM_LOCATION = "Location";
	
	private static final String DIM_MEASURES = "Measures";
	
	private static final String DIM_VERSION = "Version";
	
	private static final String DIM_YEARS = "Years";	
	
	private static final String[] currentDims = new String[] { DIM_PRODUCT, DIM_LOCATION, DIM_MEASURES, DIM_VERSION,  DIM_YEARS };
	
	static {
		
		try {
			
			File currentDir = new File(".");
			
			logger.info("Current Dir: " + currentDir.getAbsoluteFile().getParent().toString());
			logger.info("PaceHome Before: " + System.getProperty(PafBaseConstants.PACE_SERVER_HOME_ENV));
			
			System.setProperty(PafBaseConstants.PACE_SERVER_HOME_ENV, "c:\\proj_wrksp\\eclipse\\PafServer\\");
			
			// Override PaceHome property with PaceHome environment variable, if it is set (for automated unit tests).
			String paceHome = System.getenv(PafBaseConstants.PACE_SERVER_HOME_ENV);
			if (paceHome != null) {
				System.setProperty(PafBaseConstants.PACE_SERVER_HOME_ENV, paceHome);
			}
			
			logger.info("PaceHome After: " + System.getProperty(PafBaseConstants.PACE_SERVER_HOME_ENV));
			
			// Create the SessionFacotry from hibernate.cfg.xml
			Configuration conf = new Configuration().configure(PafBaseConstants.HIBERNATE_PAF_CLIENT_CACHE_DB_CONFIG_FL_JUNIT);
//			Configuration conf = new Configuration().configure("junit-memberTag-hibernate.cfg.xml");
											
			//derby
			//conf.setProperty("hibernate.connection.driver_class", "org.apache.derby.jdbc.EmbeddedDriver");
			conf.setProperty("hibernate.connection.url", "jdbc:derby:" + System.getProperty(PafBaseConstants.PACE_SERVER_HOME_ENV) +PafBaseConstants.PAF_CLIENT_CACHE_DB);
			
			//sql server 2005 express
			//conf.setProperty("hibernate.connection.driver_class", "com.microsoft.sqlserver.jdbc.SQLServerDriver");
			//conf.setProperty("hibernate.connection.url", "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=pafclientcache;integratedSecurity=true;SelectMethod=cursor");
			//conf.setProperty("hibernate.dialect", "org.hibernate.dialect.SQLServerDialect");
									
			sessionFactory = conf.buildSessionFactory();

		} catch (Throwable ex) {
			ex.printStackTrace();
		}
	}
	
	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		
		super.setUp();
			
		//single session
		//cellNoteManager = PafCellNoteManager.getInstance(currentSession());
		//PafCellNoteManager.setSingleSession(true);

		//multi session
		cellNoteManager = PafCellNoteManager.getInstance();
		PafCellNoteManager.setSessionFactory(this.sessionFactory);
				
		cellNoteList = createLocalCellNotes(10);
		
		if ( cellNoteList == null || cellNoteList.size() < 1 ) {
			fail("Didn't initialize cell note list");
		}
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
		
		cellNoteList = null;
		cellNoteManager = null;
	}
	
	/*
	public void testCreateMeSomeCellNotes() {
		
		cellNoteManager.deleteCellNotes(APP_ID, DATA_SOURCE_ID);
		List<CellNote> cellNoteList = createLocalCellNotes(4000);
		assertNotNull(cellNoteList);
		try {
			cellNoteManager.saveCellNotes(cellNoteList.toArray(new CellNote[0]));
		} catch (PafException e) {
			fail(e.getMessage());
		}
	}
	*/

	
	/**
	 * Test method for {@link com.palladium.paf.server.PafCellNoteManager#getCellNotes(java.lang.String, java.lang.String, java.util.Map)}.
	 */
	public void testGetCellNotesByDimensionStringStringMapOfStringSetOfString() {

		if ( failAll ) {
			fail("Not tested yet");
		}


		try {

			//	delete all cell notes for app and datasource
			cellNoteManager.deleteCellNotes(APP_ID, DATA_SOURCE_ID);
			//cellNoteManager.deleteCellNotes();

			//cellNoteList = createLocalCellNotes(10000);
			cellNoteList = createLocalCellNotes(1000);		

			CellNote[] nullCellNoteArray = cellNoteManager.getCellNotes(APP_ID, DATA_SOURCE_ID); 

			//no cell notes should exists
			assertNull(nullCellNoteArray);

			CellNote[] cellNoteAr = cellNoteList.toArray(new CellNote[0]);

			//test save
			try {
				cellNoteManager.saveCellNotes(cellNoteAr);
			} catch (PafException e) {
				fail(e.getMessage());
			}

			Map<String, Set<String>> dimensionMembersMap = new HashMap<String, Set<String>>();

			dimensionMembersMap.put(DIM_PRODUCT, new HashSet<String>(Arrays.asList(new String[] { "Div09" })));
			dimensionMembersMap.put(DIM_MEASURES, new HashSet<String>(Arrays.asList(new String[] { "SLS_DLR", "SLS_AUR" })));
			dimensionMembersMap.put(DIM_VERSION, new HashSet<String>(Arrays.asList(new String[] { "WP" })));
			dimensionMembersMap.put(DIM_LOCATION, new HashSet<String>(Arrays.asList(new String[] { "Store3", "Store4", "Store6", "Store99", "StoreTotal" })));
			dimensionMembersMap.put(DIM_YEARS, new HashSet<String>(Arrays.asList(new String[] { "FY2006" })));

			cellNoteManager.setCurrentDimensions(dimensionMembersMap.keySet().toArray(new String[0]));

			CellNote[] filteredCellNotes1 = cellNoteManager.getCellNotesByDimension(APP_ID, DATA_SOURCE_ID, DIM_YEARS, dimensionMembersMap);

			assertNotNull(filteredCellNotes1);
			assertEquals(filteredCellNotes1.length, 4);

			String tmpApp = "NewApp";
			String tmpDataSource = "NewDataSource";

			//List<CellNote> diffAppDSCellNotes = createLocalCellNotes(tmpApp, tmpDataSource, 2500);
			List<CellNote> diffAppDSCellNotes = createLocalCellNotes(tmpApp, tmpDataSource, 250);

			CellNote[] diffAppDSCellNotesAr = diffAppDSCellNotes.toArray(new CellNote[0]);
			//test save
			cellNoteManager.saveCellNotes(diffAppDSCellNotesAr);

			CellNote[] filteredCellNotes2 = cellNoteManager.getCellNotesByDimension(tmpApp, tmpDataSource, DIM_YEARS, dimensionMembersMap);

			assertNotNull(filteredCellNotes2);

		} catch (PafException e) {
			fail(e.getMessage());
		}


	}
	
	/**
	 * Test method for {@link com.palladium.paf.server.PafCellNoteManager#getCellNotes(java.lang.String, java.lang.String, java.util.Map)}.
	 */
	public void testGetCellNotesStringStringMapOfStringSetOfString() {

		if ( failAll ) {
			fail("Not tested yet");
		}

		cellNoteList = createLocalCellNotes(500);


		try {


			//delete all cell notes for app and datasource
			cellNoteManager.deleteCellNotes(APP_ID, DATA_SOURCE_ID);
			//cellNoteManager.deleteCellNotes();



			//no cell notes should exists
			assertNull(cellNoteManager.getCellNotes(APP_ID, DATA_SOURCE_ID));

			CellNote[] cellNoteAr = cellNoteList.toArray(new CellNote[0]);

			//test save
			cellNoteManager.saveCellNotes(cellNoteAr);

			Map<String, Set<String>> dimensionMembersMap = new HashMap<String, Set<String>>();

			dimensionMembersMap.put(DIM_PRODUCT, new HashSet<String>(Arrays.asList(new String[] { "Div09" })));
			dimensionMembersMap.put(DIM_MEASURES, new HashSet<String>(Arrays.asList(new String[] { "SLS_DLR", "SLS_AUR" })));
			dimensionMembersMap.put(DIM_VERSION, new HashSet<String>(Arrays.asList(new String[] { "WP" })));
			dimensionMembersMap.put(DIM_LOCATION, new HashSet<String>(Arrays.asList(new String[] { "Store3", "Store4", "Store6", "Store99", "StoreTotal" })));
			dimensionMembersMap.put(DIM_YEARS, new HashSet<String>(Arrays.asList(new String[] { "FY2006" })));

			cellNoteManager.setCurrentDimensions(dimensionMembersMap.keySet().toArray(new String[0]));

			CellNote[] filteredCellNotes1 = cellNoteManager.getCellNotes(APP_ID, DATA_SOURCE_ID, dimensionMembersMap);

			assertNotNull(filteredCellNotes1);
			assertEquals(filteredCellNotes1.length, 4);

			String tmpApp = "NewApp";
			String tmpDataSource = "NewDataSource";

			List<CellNote> diffAppDSCellNotes = createLocalCellNotes(tmpApp, tmpDataSource, 500);

			CellNote[] diffAppDSCellNotesAr = diffAppDSCellNotes.toArray(new CellNote[0]);
			//test save
			try {
				cellNoteManager.saveCellNotes(diffAppDSCellNotesAr);
			} catch (PafException e) {
				fail(e.getMessage());
			}

			CellNote[] filteredCellNotes2 = cellNoteManager.getCellNotes(tmpApp, tmpDataSource, dimensionMembersMap);

			assertNotNull(filteredCellNotes2);

		} catch (PafException e) {
			fail(e.getMessage());
		}


	}

	/**
	 * Test method for {@link com.palladium.paf.server.PafCellNoteManager#saveCellNotes(com.palladium.paf.db.cellnotes.CellNote[])}.
	 */
	public void testSaveCellNotes() {
		
		if ( failAll ) {
			fail("Not tested yet");
		}
		
		try {

			//delete all cell notes for app and datasource
			cellNoteManager.deleteCellNotes(APP_ID, DATA_SOURCE_ID);

			//no cell notes should exists
			assertNull(cellNoteManager.getCellNotes(APP_ID, DATA_SOURCE_ID));

			CellNote[] cellNoteAr = cellNoteList.toArray(new CellNote[0]);

			/*
		System.out.println("1st array -> ");
		for (int i = 0; i < cellNoteAr.length; i++) {
			System.out.println(cellNoteAr[i].getKey());
		}
			 */

			//test save
			cellNoteManager.saveCellNotes(cellNoteAr);

			CellNote[] cellNoteAr2 = cellNoteManager.getCellNotes(APP_ID, DATA_SOURCE_ID);

			assertEquals(cellNoteAr.length, cellNoteAr2.length);

			/*
		System.out.println("1st array -> ");
		for (int i = 0; i < cellNoteAr.length; i++) {
			System.out.println(cellNoteAr[i].getKey());
		}


		System.out.println("2st array -> ");

		for (int i = 0; i < cellNoteAr2.length; i++) {
			System.out.println(cellNoteAr2[i].getKey());
		}
			 */

			for (int i = 0; i < cellNoteAr.length; i++) {

				assertEquals(cellNoteAr[i], cellNoteAr2[i]);

			}

			//test update
			for (CellNote cellNote : cellNoteAr) {

				cellNote.setText("Test Cell Note Update");
				cellNote.setCreator("Jason Milliron");

			}

			cellNoteManager.saveCellNotes(cellNoteAr);

			cellNoteAr2 = cellNoteManager.getCellNotes(APP_ID, DATA_SOURCE_ID);

			for (int i = 0; i < cellNoteAr2.length; i++) {

				assertEquals(cellNoteAr2[i].getText(), "Test Cell Note Update");
				assertEquals(cellNoteAr2[i].getCreator(), "Jason Milliron");

			}	

		} catch (PafException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}

	/**
	 * Test method for {@link com.palladium.paf.server.PafCellNoteManager#deleteCellNotes()}.
	 */
	public void testDeleteCellNotes() {

		if ( failAll ) {
			fail("Not tested yet");
		}

		try {

			//clear everything
			cellNoteManager.deleteCellNotes();

			//get cell note array
			CellNote[] cellNoteAr = cellNoteList.toArray(new CellNote[0]);

			//save cell notes
			cellNoteManager.saveCellNotes(cellNoteAr);

			assertNotNull(cellNoteManager.getCellNotes(APP_ID, DATA_SOURCE_ID));
			assertEquals(cellNoteManager.getCellNotes(APP_ID, DATA_SOURCE_ID).length, cellNoteAr.length);

			cellNoteManager.deleteCellNotes();

			assertNull(cellNoteManager.getCellNotes(APP_ID, DATA_SOURCE_ID));

		} catch (PafException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail(e.getMessage());
		}

		Session s = currentSession();
	
		try  {
			
			/*
			List<Application> applications = s.createQuery("from Application").list();
			
			assertEquals(applications.size(), 0);
			*/
			
			List<DataSource> dataSources = s.createQuery("from DataSource").list();
			
			assertEquals(dataSources.size(), 0);
			
			/*
			List<Dimension> dimensions =  s.createQuery("from Dimension").list();
						
			assertEquals(dimensions.size(), 0);
			*/
			
			List<CellNote> cellNotes =  s.createQuery("from CellNote").list();
			
			assertEquals(cellNotes.size(), 0);
			
			List<CellNoteMapping> cellNoteMapping =  s.createQuery("from CellNoteMapping").list();
			
			assertEquals(cellNoteMapping.size(), 0);
			
		} catch (RuntimeException re) {
			
			fail(re.getMessage());
			
		} 
		
	
	}

	/**
	 * Test method for {@link com.palladium.paf.server.PafCellNoteManager#deleteCellNotes(com.palladium.paf.db.cellnotes.CellNote[])}.
	 */
	public void testDeleteCellNotesCellNoteArray() {
		
		if ( failAll ) {
			fail("Not tested yet");
		}
		
		try {
		
			//clear everything
			cellNoteManager.deleteCellNotes();
			
			//get cell note array
			CellNote[] cellNoteAr = cellNoteList.toArray(new CellNote[0]);
			
			//save cell notes
			cellNoteManager.saveCellNotes(cellNoteAr);
			
			assertNotNull(cellNoteManager.getCellNotes(APP_ID, DATA_SOURCE_ID));
			assertEquals(cellNoteManager.getCellNotes(APP_ID, DATA_SOURCE_ID).length, cellNoteAr.length);
			
			cellNoteManager.deleteCellNotes(cellNoteAr);
			
			assertNull(cellNoteManager.getCellNotes(APP_ID, DATA_SOURCE_ID));
				
	//		get cell note array
			CellNote[] cellNoteAr2 = createLocalCellNotes(10).toArray(new CellNote[0]);
			
			//save cell notes
			cellNoteManager.saveCellNotes(cellNoteAr2);
			
			CellNote[] cellNotesToDelete = new CellNote[] { cellNoteAr2[3], cellNoteAr2[4] };
			
			cellNoteManager.deleteCellNotes(cellNotesToDelete);
			
			CellNote[] cellNoteAr3 = cellNoteManager.getCellNotes(APP_ID, DATA_SOURCE_ID);
			
			assertNotNull(cellNoteAr3);
			assertEquals(cellNoteAr3.length, cellNoteAr2.length - 2);
			
			for (CellNote cellNote : cellNoteAr3) {
				
				if ( cellNote == cellNotesToDelete[0] || cellNote == cellNotesToDelete[1]) {
					fail("Cell note wasn't deleted");
				}
				
			}
		
		} catch (PafException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
			
	}

		
	/**
	 * Test method for {@link com.palladium.paf.server.PafCellNoteManager#setCurrentDimensions(java.lang.String[])}.
	 */
	public void testSetCurrentDimensions() {
		
		if ( failAll ) {
			fail("Not tested yet");
		}
		
		try  {

			cellNoteManager.deleteCellNotes();

			List<String> currentDims = new ArrayList(Arrays.asList(new String[] {DIM_PRODUCT, DIM_MEASURES, DIM_VERSION, DIM_LOCATION} ));

			cellNoteManager.setCurrentDimensions(currentDims.toArray(new String[0]));

			Session s = currentSession();

			List<Dimension> dimensions = s.createQuery("from Dimension").list();

			assertNotNull(dimensions);

			//assertEquals(currentDims.size(), dimensions.size());

			for (Dimension dimension : dimensions ) {

				if ( currentDims.contains(dimension.getName())) {

					assertEquals(dimension.isEnabled(), true);

				} else {

					assertEquals(dimension.isEnabled(), false);
				}


			}

			s.flush();
			s.clear();

			currentDims.remove(DIM_VERSION);

			currentDims.add("TestDimension");

			cellNoteManager.setCurrentDimensions(currentDims.toArray(new String[0]));

			dimensions = s.createQuery("from Dimension").list();

			assertNotNull(dimensions);

			for (Dimension dimension : dimensions ) {				

				if ( dimension.getName().equals(DIM_VERSION) ) {

					assertEquals(dimension.isEnabled(), false);

				} else if ( currentDims.contains(dimension.getName())) {

					assertEquals(dimension.isEnabled(), true);					

				} else {

					assertEquals(dimension.isEnabled(), false);
				}

			}

		} catch (RuntimeException re) {
			//do nothing
		} catch (PafException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Test method for {@link com.palladium.paf.server.PafCellNoteManager#getCellNotes(java.lang.String, java.lang.String)}.
	 */
	public void testGetCellNotesStringString() {

		if ( failAll ) {
			fail("Not tested yet");
		}

		try {

			//delete all cell notes for app and datasource
			cellNoteManager.deleteCellNotes(APP_ID, DATA_SOURCE_ID);

			//no cell notes should exist
			assertNull(cellNoteManager.getCellNotes(APP_ID, DATA_SOURCE_ID));

			CellNote[] cellNoteAr = cellNoteList.toArray(new CellNote[0]);

			//test save
			cellNoteManager.saveCellNotes(cellNoteAr);

			CellNote[] cellNoteAr2 = cellNoteManager.getCellNotes(APP_ID, DATA_SOURCE_ID);

			assertEquals(cellNoteAr.length, cellNoteAr2.length);

			for (int i = 0; i < cellNoteAr.length; i++) {

				assertEquals(cellNoteAr[i], cellNoteAr2[i]);

			}		

		} catch (PafException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Test method for {@link com.palladium.paf.server.PafCellNoteManager#deleteCellNotes(java.lang.String, java.lang.String)}.
	 */
	public void testDeleteCellNotesStringString() {

		if ( failAll ) {
			fail("Not tested yet");
		}

		CellNote[] cellNoteAr = cellNoteList.toArray(new CellNote[0]);

		try {

			cellNoteManager.deleteCellNotes(APP_ID, DATA_SOURCE_ID);

			//no cell notes should exists
			assertNull(cellNoteManager.getCellNotes(APP_ID, DATA_SOURCE_ID));

			cellNoteManager.saveCellNotes(cellNoteAr);

			assertNotNull(cellNoteManager.getCellNotes(APP_ID, DATA_SOURCE_ID));

			assertEquals(cellNoteAr.length, cellNoteManager.getCellNotes(APP_ID, DATA_SOURCE_ID).length);

		} catch (PafException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void testCellSimulation1() {
		
		if ( failAll ) {
			fail("Not tested yet");
		}
		
		try {
			
			cellNoteManager.deleteCellNotes();
			
			cellNoteManager.setCurrentDimensions(new String[] {DIM_PRODUCT, DIM_MEASURES, DIM_VERSION, DIM_LOCATION} );
			
			CellNote[] cellNoteAr = cellNoteList.toArray(new CellNote[0]);
			
			cellNoteManager.saveCellNotes(cellNoteAr);
			
			Map<String, Set<String>> dimensionMembersMap = new HashMap<String, Set<String>>();
			dimensionMembersMap.put(DIM_PRODUCT, new HashSet<String>(Arrays.asList(new String[] { "Div09" })));
			dimensionMembersMap.put(DIM_MEASURES, new HashSet<String>(Arrays.asList(new String[] { "SLS_DLR", "SLS_AUR" })));
			dimensionMembersMap.put(DIM_VERSION, new HashSet<String>(Arrays.asList(new String[] { "WP" })));
			dimensionMembersMap.put(DIM_LOCATION, new HashSet<String>(Arrays.asList(new String[] { "Store3", "Store4", "Store6"})));
	
			CellNote[] userCellNotes1 = cellNoteManager.getCellNotes(APP_ID, DATA_SOURCE_ID, dimensionMembersMap);
	
			assertNotNull(userCellNotes1);
			assertEquals(userCellNotes1.length, 3);
			
			Map<String, Set<String>> dimensionMembersMap2 = new HashMap<String, Set<String>>();
			dimensionMembersMap2.put(DIM_PRODUCT, new HashSet<String>(Arrays.asList(new String[] { "Div09" })));
			dimensionMembersMap2.put(DIM_MEASURES, new HashSet<String>(Arrays.asList(new String[] { "SLS_AUR" })));
			dimensionMembersMap2.put(DIM_VERSION, new HashSet<String>(Arrays.asList(new String[] { "WP" })));
			dimensionMembersMap2.put(DIM_LOCATION, new HashSet<String>(Arrays.asList(new String[] { "Store4" })));
			
			CellNote[] userCellNotes2 = cellNoteManager.getCellNotes(APP_ID, DATA_SOURCE_ID, dimensionMembersMap2);
			
			assertNotNull(userCellNotes2);
			assertEquals(userCellNotes2.length, 1);
			
			CellNote cellNoteToDelete = null;
			
			for (CellNote cellNote : userCellNotes1 ) {
				
				if ( userCellNotes2[0].equals(cellNote) ) {
					
					cellNoteToDelete = cellNote;
					break;
					
				}
				
			}
			
			assertNotNull(cellNoteToDelete);
			
			cellNoteManager.deleteCellNotes(new CellNote[] { cellNoteToDelete} );
					
			userCellNotes2[0].setText("Test Update of deleted cell note");
			
			cellNoteManager.saveCellNotes(userCellNotes2);
			
		} catch (PafException e) {
			
			fail(e.getMessage());
			
		}
		
				
	}

	public void testCellSimulation2() {
		
		if ( failAll ) {
			fail("Not tested yet");
		}
		
		try {

			cellNoteManager.deleteCellNotes();

			cellNoteManager.setCurrentDimensions(new String[] {DIM_PRODUCT, DIM_MEASURES, DIM_VERSION, DIM_LOCATION, DIM_YEARS} );

			CellNote[] cellNoteAr = cellNoteList.toArray(new CellNote[0]);

			cellNoteManager.saveCellNotes(cellNoteAr);
			Map<String, Set<String>> dimensionMembersMap = new HashMap<String, Set<String>>();
			dimensionMembersMap.put(DIM_PRODUCT, new HashSet<String>(Arrays.asList(new String[] { "Div09" })));
			dimensionMembersMap.put(DIM_MEASURES, new HashSet<String>(Arrays.asList(new String[] { "SLS_DLR", "SLS_AUR" })));
			dimensionMembersMap.put(DIM_VERSION, new HashSet<String>(Arrays.asList(new String[] { "WP" })));
			dimensionMembersMap.put(DIM_LOCATION, new HashSet<String>(Arrays.asList(new String[] { "Store3", "Store4", "Store6"})));
			dimensionMembersMap.put(DIM_YEARS, new HashSet<String>(Arrays.asList(new String[] { "FY2006" })));

			CellNote[] userCellNotes1 = cellNoteManager.getCellNotesByDimension(APP_ID, DATA_SOURCE_ID, DIM_YEARS, dimensionMembersMap);

			assertNotNull(userCellNotes1);
			assertEquals(userCellNotes1.length, 3);

			Map<String, Set<String>> dimensionMembersMap2 = new HashMap<String, Set<String>>();
			dimensionMembersMap2.put(DIM_PRODUCT, new HashSet<String>(Arrays.asList(new String[] { "Div09" })));
			dimensionMembersMap2.put(DIM_MEASURES, new HashSet<String>(Arrays.asList(new String[] { "SLS_AUR" })));
			dimensionMembersMap2.put(DIM_VERSION, new HashSet<String>(Arrays.asList(new String[] { "WP" })));
			dimensionMembersMap2.put(DIM_LOCATION, new HashSet<String>(Arrays.asList(new String[] { "Store4" })));
			dimensionMembersMap2.put(DIM_YEARS, new HashSet<String>(Arrays.asList(new String[] { "FY2006" })));

			CellNote[] userCellNotes2 = cellNoteManager.getCellNotesByDimension(APP_ID, DATA_SOURCE_ID, DIM_YEARS, dimensionMembersMap2);

			assertNotNull(userCellNotes2);
			assertEquals(userCellNotes2.length, 1);

			CellNote cellNoteToUpdate = null;

			for (CellNote cellNote : userCellNotes1 ) {

				if ( userCellNotes2[0].equals(cellNote) ) {

					cellNoteToUpdate = cellNote;
					break;

				}

			}

			assertNotNull(cellNoteToUpdate);

			cellNoteToUpdate.setText("Update 1");

			cellNoteManager.saveCellNotes(new CellNote[] { cellNoteToUpdate });

			CellNote[] userCellNotes3 = cellNoteManager.getCellNotesByDimension(APP_ID, DATA_SOURCE_ID, DIM_YEARS, dimensionMembersMap2);

			assertNotNull(userCellNotes3);
			assertEquals(userCellNotes3.length, 1);
			assertEquals(userCellNotes3[0].getText(), "Update 1");

			userCellNotes2[0].setText("Update 2");

			cellNoteManager.saveCellNotes(new CellNote[] { userCellNotes2[0] });

			CellNote[] userCellNotes4 = cellNoteManager.getCellNotesByDimension(APP_ID, DATA_SOURCE_ID, DIM_YEARS, dimensionMembersMap2);

			assertNotNull(userCellNotes4);
			assertEquals(userCellNotes4.length, 1);
			assertEquals(userCellNotes4[0].getText(), "Update 2");

		} catch (PafException e) {
			fail(e.getMessage());
		}


	}
	
	public void testCellSimulation3() {
		
		if ( failAll ) {
			fail("Not tested yet");
		}
		
		try {
			
			cellNoteManager.deleteCellNotes();
			
			cellNoteManager.setCurrentDimensions(new String[] {DIM_PRODUCT, DIM_MEASURES, DIM_VERSION, DIM_LOCATION} );
			
			CellNote[] cellNoteAr = cellNoteList.toArray(new CellNote[0]);
			
			cellNoteManager.processCellNotes(cellNoteAr, null);
			
			Map<String, Set<String>> dimensionMembersMap = new HashMap<String, Set<String>>();
			dimensionMembersMap.put(DIM_PRODUCT, new HashSet<String>(Arrays.asList(new String[] { "Div09" })));
			dimensionMembersMap.put(DIM_MEASURES, new HashSet<String>(Arrays.asList(new String[] { "SLS_DLR", "SLS_AUR" })));
			dimensionMembersMap.put(DIM_VERSION, new HashSet<String>(Arrays.asList(new String[] { "WP" })));
			dimensionMembersMap.put(DIM_LOCATION, new HashSet<String>(Arrays.asList(new String[] { "Store3", "Store4", "Store6"})));
	
			CellNote[] userCellNotes1 = cellNoteManager.getCellNotes(APP_ID, DATA_SOURCE_ID, dimensionMembersMap);
	
			assertNotNull(userCellNotes1);
			assertEquals(userCellNotes1.length, 3);
			
			Map<String, Set<String>> dimensionMembersMap2 = new HashMap<String, Set<String>>();
			dimensionMembersMap2.put(DIM_PRODUCT, new HashSet<String>(Arrays.asList(new String[] { "Div09" })));
			dimensionMembersMap2.put(DIM_MEASURES, new HashSet<String>(Arrays.asList(new String[] { "SLS_AUR" })));
			dimensionMembersMap2.put(DIM_VERSION, new HashSet<String>(Arrays.asList(new String[] { "WP" })));
			dimensionMembersMap2.put(DIM_LOCATION, new HashSet<String>(Arrays.asList(new String[] { "Store4" })));
			
			CellNote[] userCellNotes2 = cellNoteManager.getCellNotes(APP_ID, DATA_SOURCE_ID, dimensionMembersMap2);
			
			assertNotNull(userCellNotes2);
			assertEquals(userCellNotes2.length, 1);
			
			CellNote cellNoteToDelete = null;
			
			for (CellNote cellNote : userCellNotes1 ) {
				
				if ( userCellNotes2[0].equals(cellNote) ) {
					
					cellNoteToDelete = cellNote;
					break;
					
				}
				
			}
			
			assertNotNull(cellNoteToDelete);
			
			cellNoteManager.deleteCellNotes(new CellNote[] { cellNoteToDelete} );
					
			userCellNotes2[0].setText("Test Update of deleted cell note");
			
			cellNoteManager.processCellNotes(userCellNotes2, null);
			
		} catch (PafException e) {
			
			fail(e.getMessage());
			
		}
		
				
	}
	
	public void testCellSimulation4() {
		
		if ( failAll ) {
			fail("Not tested yet");
		}
		
		try {
			
			cellNoteManager.deleteCellNotes();
			
			cellNoteManager.setCurrentDimensions(new String[] {DIM_PRODUCT, DIM_MEASURES, DIM_VERSION, DIM_LOCATION} );
			
			CellNote[] cellNoteAr = cellNoteList.toArray(new CellNote[0]);
			
			cellNoteManager.processCellNotes(cellNoteAr, null);
			
			Map<String, Set<String>> dimensionMembersMap = new HashMap<String, Set<String>>();
			dimensionMembersMap.put(DIM_PRODUCT, new HashSet<String>(Arrays.asList(new String[] { "Div09" })));
			dimensionMembersMap.put(DIM_MEASURES, new HashSet<String>(Arrays.asList(new String[] { "SLS_DLR", "SLS_AUR" })));
			dimensionMembersMap.put(DIM_VERSION, new HashSet<String>(Arrays.asList(new String[] { "WP" })));
			dimensionMembersMap.put(DIM_LOCATION, new HashSet<String>(Arrays.asList(new String[] { "Store3", "Store4", "Store6"})));
	
			CellNote[] userCellNotes1 = cellNoteManager.getCellNotes(APP_ID, DATA_SOURCE_ID, dimensionMembersMap);
	
			assertNotNull(userCellNotes1);
			assertEquals(userCellNotes1.length, 3);
			
			cellNoteManager.processCellNotes(null, userCellNotes1);
			
			userCellNotes1 = cellNoteManager.getCellNotes(APP_ID, DATA_SOURCE_ID, dimensionMembersMap);
			
			assertNull(userCellNotes1);
			
			cellNoteManager.processCellNotes(cellNoteAr, null);
	
			userCellNotes1 = cellNoteManager.getCellNotes(APP_ID, DATA_SOURCE_ID, dimensionMembersMap);
			
			assertNotNull(userCellNotes1);
			assertEquals(userCellNotes1.length, 3);
						
		} catch (PafException e) {
			
			fail(e.getMessage());
			
		}
		
				
	}


	
	@SuppressWarnings( { "unchecked", "unchecked" })
	public static Session currentSession() throws HibernateException {
		
		/*
		if ( createNew ) {
			
			Session s = (Session) session.get();
			
			if (s != null ) {
				s.close();
			}
							
			session.set(null);
			//sessionFactory.close();
		}
		*/
		
		Session s = (Session) session.get();
		
		// open a new session, if this thread has none yet
		if (s == null) {
			s = sessionFactory.openSession();
			session.set(s);
		}
		return s;
	}
	

	private List<CellNote> createLocalCellNotes(int numberOfCellNotesToCreate) { 
		return createLocalCellNotes(APP_ID, DATA_SOURCE_ID, numberOfCellNotesToCreate);
	}
	
	private List<CellNote> createLocalCellNotes(String appId, String dataSourceId, int numberOfCellNotesToCreate) {		
		
		Application application = new Application(appId);
		
		DataSource dataSource = new DataSource(dataSourceId);
					
		Map<String, Dimension> dimensionNameMap = new TreeMap<String, Dimension>(String.CASE_INSENSITIVE_ORDER); 
		
		List<CellNote> cellNoteList = new ArrayList<CellNote>();
		
		for (int i = 1; i <= numberOfCellNotesToCreate; i++ ) {
		
			CellNote cellNote = new CellNote();
			
			cellNote.setApplication(application);
			cellNote.setDataSource(dataSource);
			cellNote.setText("Cell Note " + i);
			cellNote.setCreator("JavaJ");
			cellNote.setLastUpdated(new Date());		
			
			Set<CellNoteMapping> mappings = new HashSet<CellNoteMapping>();
						
			if ( dimensionNameMap.get(DIM_PRODUCT) == null ) {
				
				dimensionNameMap.put(DIM_PRODUCT, new Dimension(DIM_PRODUCT, true));
			}
			
			if ( dimensionNameMap.get(DIM_MEASURES) == null ) {
				
				dimensionNameMap.put(DIM_MEASURES, new Dimension(DIM_MEASURES, true));
			}
			
			if ( dimensionNameMap.get(DIM_VERSION) == null ) {
				
				dimensionNameMap.put(DIM_VERSION, new Dimension(DIM_VERSION, true));
			}
			
			if ( dimensionNameMap.get(DIM_LOCATION) == null ) {
				
				dimensionNameMap.put(DIM_LOCATION, new Dimension(DIM_LOCATION, true));
			}
			
			if ( dimensionNameMap.get(DIM_YEARS) == null ) {
				
				dimensionNameMap.put(DIM_YEARS, new Dimension(DIM_YEARS, true));
			}

			mappings.add(new CellNoteMapping(dimensionNameMap.get(DIM_PRODUCT), "Div09", cellNote));
			
			if ( i % 2 == 0 ) {
			
				mappings.add(new CellNoteMapping(dimensionNameMap.get(DIM_MEASURES), "SLS_AUR", cellNote));
				
			} else {
				
				mappings.add(new CellNoteMapping(dimensionNameMap.get(DIM_MEASURES), "SLS_DLR", cellNote));
			}
			
			mappings.add(new CellNoteMapping(dimensionNameMap.get(DIM_VERSION), "WP", cellNote));
			
			mappings.add(new CellNoteMapping(dimensionNameMap.get(DIM_LOCATION), "Store" + i, cellNote));
			
			mappings.add(new CellNoteMapping(dimensionNameMap.get(DIM_YEARS), "FY2006", cellNote));
			
			cellNote.setCellNoteMappingSet(mappings);
			
			cellNoteList.add(cellNote);

		}
		
		return cellNoteList;
		
		
	}

	/**
	 * 
	 * 1st deletes a note
	 * 2nd updates same note and then adds again
	 *
	 */
	public void testDeleteThenUpdateOnSameCellNote() {
		
		if ( failAll ) {
			fail("Not tested yet");
		}
		
		try {
		
			cellNoteManager.setCurrentDimensions(currentDims);
			
			//clear everything
			cellNoteManager.deleteCellNotes();
			
			//get cell note array
			CellNote[] cellNoteAr = cellNoteList.toArray(new CellNote[0]);
			
			//save cell notes
			
			cellNoteManager.saveCellNotes(cellNoteAr);
					
			assertNotNull(cellNoteManager.getCellNotes(APP_ID, DATA_SOURCE_ID));
			assertEquals(cellNoteManager.getCellNotes(APP_ID, DATA_SOURCE_ID).length, cellNoteAr.length);
			
			Map<String, Set<String>> dimensionMembersMap = new HashMap<String, Set<String>>();
			dimensionMembersMap.put(DIM_PRODUCT, new HashSet<String>(Arrays.asList(new String[] { "Div09" })));
			dimensionMembersMap.put(DIM_MEASURES, new HashSet<String>(Arrays.asList(new String[] { "SLS_DLR"})));
			dimensionMembersMap.put(DIM_VERSION, new HashSet<String>(Arrays.asList(new String[] { "WP" })));
			dimensionMembersMap.put(DIM_LOCATION, new HashSet<String>(Arrays.asList(new String[] { "Store3"})));
			dimensionMembersMap.put(DIM_YEARS, new HashSet<String>(Arrays.asList(new String[] { "FY2006" })));

			CellNote[] userCellNotes1 = cellNoteManager.getCellNotesByDimension(APP_ID, DATA_SOURCE_ID, DIM_YEARS, dimensionMembersMap);
			
			assertNotNull(userCellNotes1);
			assertEquals(userCellNotes1.length, 1);
			
			CellNote cellNoteToDeleteThenUpdate = userCellNotes1[0];
			
			String oldCellNoteText = cellNoteToDeleteThenUpdate.getText();
			
			cellNoteManager.deleteCellNotes(new CellNote[] { cellNoteToDeleteThenUpdate } );
									
			String newCellNoteText = "Updated Deleted Cell Note";
			
			cellNoteToDeleteThenUpdate.setText(newCellNoteText);
			
			cellNoteManager.saveCellNotes(new CellNote[] { cellNoteToDeleteThenUpdate } );	
			
			CellNote[] userCellNotes2 = cellNoteManager.getCellNotesByDimension(APP_ID, DATA_SOURCE_ID, DIM_YEARS, dimensionMembersMap);
			
			assertNotNull(userCellNotes2);
			assertEquals(userCellNotes2.length, 1);
			
			CellNote cellNoteToDeleteThenUpdate2 = userCellNotes2[0];
			
			assertEquals(cellNoteToDeleteThenUpdate, cellNoteToDeleteThenUpdate2);	
			
			assertNotSame(cellNoteToDeleteThenUpdate.getText(), oldCellNoteText);
			assertNotSame(cellNoteToDeleteThenUpdate2.getText(), oldCellNoteText);
			
			assertEquals(cellNoteToDeleteThenUpdate.getText(), newCellNoteText);
			assertEquals(cellNoteToDeleteThenUpdate2.getText(), newCellNoteText);			
			
		} catch (PafException e) {
			fail(e.getMessage());
		}
		
			
	}

	/**
	 * 
	 * This test case trys to insert a cell note with the same dim/member properties.
	 *
	 */
	public void testDupInsertsSameDimMembers() {

		if ( failAll ) {
			fail("Not tested yet");
		}

		try {
			// clear everything
			cellNoteManager.deleteCellNotes();

			//get cell note array
			CellNote[] cellNoteAr = cellNoteList.toArray(new CellNote[0]);

			CellNote cellNote1 = cellNoteAr[0];

			cellNoteManager.saveCellNotes(new CellNote[] { cellNote1 } );

			CellNote cellNote2 = cellNoteAr[1];		

			assertNotSame(cellNote1.getKey(), cellNote2.getKey());

			cellNote2.setCellNoteMappingSet(new HashSet<CellNoteMapping>(cellNote1.getCellNoteMappingSet()));

			assertEquals(cellNote1.getKey(), cellNote2.getKey());	

			String updatedText = "test 2";

			cellNote2.setText(updatedText);

			cellNoteManager.saveCellNotes(new CellNote[] { cellNote2 } );



			CellNote[] allCellNotes = cellNoteManager.getCellNotes(cellNote1.getApplication().getName(), cellNote1.getDataSource().getName());

			assertEquals(allCellNotes.length, 1);

			assertEquals(allCellNotes[0].getText(), updatedText);

		} catch (PafException e) {

			fail(e.getMessage());
		}
	}


	
	public void testGetCellNotesInformation() {
		
		if ( failAll ) {
			fail("Not tested yet");
		}

		try {

			//	clear everything
			cellNoteManager.deleteCellNotes();

			cellNoteList = createLocalCellNotes(20);

			//get cell note array
			CellNote[] cellNoteAr = cellNoteList.toArray(new CellNote[0]);

			//save cell notes

			cellNoteManager.saveCellNotes(cellNoteAr);

			String tmpApp = "NewApp";
			String tmpDataSource = "NewDataSource";

			List<CellNote> diffAppDSCellNotes = createLocalCellNotes(tmpApp, tmpDataSource, 30);

			CellNote[] diffAppDSCellNotesAr = diffAppDSCellNotes.toArray(new CellNote[0]);
			//test save
			cellNoteManager.saveCellNotes(diffAppDSCellNotesAr);

			CellNotesInformation[] cellNotesInfoAr = cellNoteManager.getCellNotesInformation();

			assertNotNull(cellNotesInfoAr);
			assertEquals(cellNotesInfoAr.length, 2);

		} catch (PafException e) {
			fail(e.getMessage());
		}

	}
	
	
	
	
}

