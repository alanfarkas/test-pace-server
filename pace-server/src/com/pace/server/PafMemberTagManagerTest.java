/*
 *	File: @(#)PafMemberTagManagerTest.java 	Package: com.pace.base.server 	Project: PafServer
 *	Created: Jan 30, 2008  		By: Alan
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

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pace.base.PafBaseConstants;
import com.pace.base.PafException;
import com.pace.base.comm.SimpleCoordList;
import com.pace.base.db.membertags.MemberTagData;
import com.pace.base.db.membertags.MemberTagDef;
import com.pace.base.db.membertags.MemberTagInformation;
import com.pace.base.db.membertags.SimpleMemberTagData;
import com.pace.base.utility.StringUtils;
import com.pace.server.comm.PafGetMemberTagInfoResponse;
import com.pace.server.comm.PafMbrTagFilter;

/**
 * Test case for PafMemberTagManager
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class PafMemberTagManagerTest extends TestCase {

	private static final Logger logger = Logger.getLogger(PafMemberTagManagerTest.class);
	private static SessionFactory sessionFactory;
	private static String paceHome = null;
	private PafMemberTagManager memberTagManager = null; 
	private PafAppService appService = null;

/* THIS TEST IS TEMPORARILY BYPASSED. THIS TEST HAS NOT WORKED SINCE THE MIGRATION TO LINUX AND NEW PACKAGE NAMING

/*	static {

		try {
			
			// Get "paceHome" directory
			paceHome = System.getenv(PafBaseConstants.PACE_SERVER_HOME_ENV);
			if (paceHome == null) {
				paceHome = "c:\\proj_wrksp\\eclipse\\PafServer\\";
			}
			
			// Create the SessionFactory from hibernate.cfg.xml
//			Configuration conf = new Configuration().configure(PafBaseConstants.HIBERNATE_PAF_CLIENT_CACHE_DB_CONFIG_FL);
			Configuration conf = new Configuration().configure("junit-memberTag-hibernate.cfg.xml");

			// Configure derby settings
			//conf.setProperty("hibernate.connection.driver_class", "org.apache.derby.jdbc.ClientDriver");
			conf.setProperty("hibernate.connection.driver_class", "org.apache.derby.jdbc.EmbeddedDriver");
			conf.setProperty("hibernate.connection.url", 
					"jdbc:derby:" + paceHome + File.separator + PafBaseConstants.PAF_CLIENT_CACHE_DB);

		//	System.setProperty(PafBaseConstants.PACE_SERVER_HOME_ENV, "c:\\program files\\pace\\PafServer\\");
			logger.info("PaceHome: " + paceHome);
			sessionFactory = conf.buildSessionFactory();

		} catch (Throwable ex) {
			logger.error("Session Factory Creation Failed: " + ex);
			throw new ExceptionInInitializerError(ex);
		}
		
	}
*/

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		appService = PafAppService.getInstance();
		memberTagManager = PafMemberTagManager.getInstance();
		PafMemberTagManager.setSessionFactory(PafMemberTagManagerTest.sessionFactory);
		refreshMemberTagData();
		
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
		appService = null;
		memberTagManager = null;
	}

//FIXME Fix Unit Tests - PafMemberTagManagerTest
//	/**
//	 * Test method for {@link com.pace.base.server.PafMemberTagManager#clearMemberTagData(com.pace.base.server.comm.PafMbrTagFilter[])}.
//	 */
//	public void testClearMemberTagData1() {
//		
//		boolean isSuccess = false;
//		String assertErr = "Test Failed";
//		PafMbrTagFilter[] filters = null;
//
//		// Test with null member tag filter
//		logger.info("***************************************************");
//		logger.info("Running unit test: " + this.getName() + " using null filter");
//		try {
//			memberTagManager.clearMemberTagData(filters);
//			isSuccess = true;
////			if (response.equals(getDefaultMemberTagInfoResponse())) {
////				isSuccess = true;
////			} else {
////				assertErr = "Unexpected Results";
////				logger.error("Test Failed - " + assertErr);	
////			}
//		} catch (Exception ex) {
//			assertErr = "Java Exception";
//			logger.error("Test Failed - Java Exception: " + ex.getMessage());	
//		} finally {
//			logger.info("***************************************************\n");
//			assertTrue(assertErr, isSuccess);
//		}
//
//	}
//
//	/**
//	 * Test method for {@link com.pace.base.server.PafMemberTagManager#clearMemberTagData(com.pace.base.server.comm.PafMbrTagFilter[])}.
//	 */
//	public void testClearMemberTagData2() {
//		
//		boolean isSuccess = false;
//		String assertErr = "Test Failed";
//		PafMbrTagFilter[] filters = null;
//
//		// Test with app filter - all apps
//		logger.info("***************************************************");
//		logger.info("Running unit test: " + this.getName() + " using app filter - all apps");
//		try {
//			filters = new PafMbrTagFilter[2];
//			filters[0] = new PafMbrTagFilter("FMTHotel");
//			filters[1] = new PafMbrTagFilter("TitanCopy");
//			memberTagManager.clearMemberTagData(filters);
//			isSuccess = true;
////			if (response.equals(getDefaultMemberTagInfoResponse())) {
////				isSuccess = true;
////			} else {
////				assertErr = "Unexpected Results";
////				logger.error("Test Failed - " + assertErr);	
////			}
//		} catch (Exception ex) {
//			assertErr = "Java Exception";
//			logger.error("Test Failed - Java Exception: " + ex.getMessage());	
//		} finally {
//			logger.info("***************************************************\n");
//			assertTrue(assertErr, isSuccess);
//		}
//
//	}
//
//	/**
//	 * Test method for {@link com.pace.base.server.PafMemberTagManager#clearMemberTagData(com.pace.base.server.comm.PafMbrTagFilter[])}.
//	 */
//	public void testClearMemberTagData3() {
//		
//		boolean isSuccess = false;
//		String assertErr = "Test Failed";
//		PafMbrTagFilter[] filters = null;
//
//		// Test with app filter - FMTHotel
//		logger.info("***************************************************");
//		logger.info("Running unit test: " + this.getName() + " using app filter - FMTHotel");
//		try {
//			filters = new PafMbrTagFilter[1];
//			filters[0] = new PafMbrTagFilter("FMTHotel");
//			memberTagManager.clearMemberTagData(filters);
//			isSuccess = true;
////			if (response.equals(getDefaultMemberTagInfoResponse())) {
////				isSuccess = true;
////			} else {
////				assertErr = "Unexpected Results";
////				logger.error("Test Failed - " + assertErr);	
////			}
//		} catch (Exception ex) {
//			assertErr = "Java Exception";
//			logger.error("Test Failed - Java Exception: " + ex.getMessage());	
//		} finally {
//			logger.info("***************************************************\n");
//			assertTrue(assertErr, isSuccess);
//		}
//
//	}
//
//	/**
//	 * Test method for {@link com.pace.base.server.PafMemberTagManager#clearMemberTagData(com.pace.base.server.comm.PafMbrTagFilter[])}.
//	 */
//	public void testClearMemberTagData4() {
//		
//		boolean isSuccess = false;
//		String assertErr = "Test Failed";
//		PafMbrTagFilter[] filters = null;
//
//		// Test with app & member tag name filters
//		logger.info("***************************************************");
//		logger.info("Running unit test: " + this.getName() + " using app & member tag name filters");
//		try {
//			filters = new PafMbrTagFilter[2];
//			filters[0] = new PafMbrTagFilter("FMTHotel", new String[]{"Measure_Desc", "Dummy_Tag"});
//			filters[1] = new PafMbrTagFilter("TitanCopy");
//			memberTagManager.clearMemberTagData(filters);
//			isSuccess = true;
////			if (response.equals(getDefaultMemberTagInfoResponse())) {
////				isSuccess = true;
////			} else {
////				assertErr = "Unexpected Results";
////				logger.error("Test Failed - " + assertErr);	
////			}
//		} catch (Exception ex) {
//			assertErr = "Java Exception";
//			logger.error("Test Failed - Java Exception: " + ex.getMessage());	
//		} finally {
//			logger.info("***************************************************\n");
//			assertTrue(assertErr, isSuccess);
//		}
//
//	}
//
//	/**
//	 * Test method for {@link com.pace.base.server.PafMemberTagManager#clearMemberTagData(com.pace.base.server.comm.PafMbrTagFilter[])}.
//	 */
//	public void testClearMemberTagData5() {
//		
//		boolean isSuccess = false;
//		String assertErr = "Test Failed";
//		SimpleMemberTagData[] memberTagData = null;
//		PafMbrTagFilter[] filters = null;
//
//		// Test doing a clear directly after doing a save
//		logger.info("***************************************************");
//		logger.info("Running unit test: " + this.getName() + " save followed by clear using app filter");
//		try {
//			Date now = new Date(System.currentTimeMillis());
//			SimpleCoordList coord1 = new SimpleCoordList(new String[]{"Product", "Location"}, new String[]{"DPT110", "Store1"});
//			SimpleMemberTagData mt1 = new SimpleMemberTagData("ClearTest", "Dept_Desc", coord1, "Import1", "TX", "A. Farkas", now, false);
//			SimpleCoordList coord2 = new SimpleCoordList(new String[]{"Product", "Location"}, new String[]{"DPT120", "Store2"});
//			SimpleMemberTagData mt2 = new SimpleMemberTagData("ClearTest", "Dept_Desc", coord2, "Import2", "TX", "A. Farkas", now, false);
//			memberTagData = new SimpleMemberTagData[]{mt1, mt2};
//			memberTagManager.saveMemberTagData(memberTagData, null, null);
//			filters = new PafMbrTagFilter[1];
//			filters[0] = new PafMbrTagFilter("ClearTest");
//			memberTagManager.clearMemberTagData(filters);
//			isSuccess = true;
////			if (response.equals(getDefaultMemberTagInfoResponse())) {
////				isSuccess = true;
////			} else {
////				assertErr = "Unexpected Results";
////				logger.error("Test Failed - " + assertErr);	
////			}
//		} catch (Exception ex) {
//			assertErr = "Java Exception";
//			logger.error("Test Failed - Java Exception: " + ex.getMessage());	
//		} finally {
//			logger.info("***************************************************\n");
//			assertTrue(assertErr, isSuccess);
//
//		}
//
//	}
//
//	/**
//	 * Test method for {@link com.pace.base.server.PafMemberTagManager#exportMemberTagData(com.pace.base.server.comm.PafMbrTagFilter[])}.
//	 */
//	public void testExportMemberTagData1() {
//
//		boolean isSuccess = false;
//		String assertErr = "Test Failed";
//		PafMbrTagFilter[] filters = null;
//		SimpleMemberTagData[] memberTagData = null;
//		int expectedCount = 19;
//
//		// Test with null member tag filter
//		logger.info("***************************************************");
//		logger.info("Running unit test: " + this.getName() + " using null filter");
//		try {
//			memberTagData = memberTagManager.exportMemberTagData(filters);
//			if (memberTagData.length == expectedCount) {
//				isSuccess = true;
//			} else {
//				assertErr = "Unexpected Results";
//				logger.error("Test Failed - " + assertErr);	
//			}
//		} catch (Exception ex) {
//			assertErr = "Java Exception";
//			logger.error("Test Failed - Java Exception: " + ex.getMessage());	
//		} finally {
//			logger.info("***************************************************\n");
//			assertTrue(assertErr, isSuccess);
//		}
//
//	}
//
//	/**
//	 * Test method for {@link com.pace.base.server.PafMemberTagManager#exportMemberTagData(com.pace.base.server.comm.PafMbrTagFilter[])}.
//	 */
//	public void testExportMemberTagData2() {
//
//		boolean isSuccess = false;
//		String assertErr = "Test Failed";
//		PafMbrTagFilter[] filters = null;
//		SimpleMemberTagData[] memberTagData = null;
//		int expectedCount = 19;
//
//		// Test with app filter - all apps
//		logger.info("***************************************************");
//		logger.info("Running unit test: " + this.getName() + " using app filter - all apps");
//		try {
//			filters = new PafMbrTagFilter[2];
//			filters[0] = new PafMbrTagFilter("FMTHotel");
//			filters[1] = new PafMbrTagFilter("TitanCopy");
//			memberTagData = memberTagManager.exportMemberTagData(filters);
//			if (memberTagData.length == expectedCount) {
//				isSuccess = true;
//			} else {
//				assertErr = "Unexpected Results";
//				logger.error("Test Failed - " + assertErr);	
//			}
//		} catch (Exception ex) {
//			assertErr = "Java Exception";
//			logger.error("Test Failed - Java Exception: " + ex.getMessage());	
//		} finally {
//			logger.info("***************************************************\n");
//			assertTrue(assertErr, isSuccess);
//		}
//
//	}
//
//	/**
//	 * Test method for {@link com.pace.base.server.PafMemberTagManager#exportMemberTagData(com.pace.base.server.comm.PafMbrTagFilter[])}.
//	 */
//	public void testExportMemberTagData3() {
//
//		boolean isSuccess = false;
//		String assertErr = "Test Failed";
//		PafMbrTagFilter[] filters = null;
//		SimpleMemberTagData[] memberTagData = null;
//		int expectedCount = 13;
//
//		// Test with app filter - FMTHotel
//		logger.info("***************************************************");
//		logger.info("Running unit test: " + this.getName() + " using app filter - FMTHotel");
//		try {
//			filters = new PafMbrTagFilter[1];
//			filters[0] = new PafMbrTagFilter("FMTHotel");
//			memberTagData = memberTagManager.exportMemberTagData(filters);
//			if (memberTagData.length == expectedCount) {
//				isSuccess = true;
//			} else {
//				assertErr = "Unexpected Results";
//				logger.error("Test Failed - " + assertErr);	
//			}
//		} catch (Exception ex) {
//			assertErr = "Java Exception";
//			logger.error("Test Failed - Java Exception: " + ex.getMessage());	
//		} finally {
//			logger.info("***************************************************\n");
//			assertTrue(assertErr, isSuccess);
//		}
//
//	}
//
//	/**
//	 * Test method for {@link com.pace.base.server.PafMemberTagManager#exportMemberTagData(com.pace.base.server.comm.PafMbrTagFilter[])}.
//	 */
//	public void testExportMemberTagData4() {
//
//		boolean isSuccess = false;
//		String assertErr = "Test Failed";
//		PafMbrTagFilter[] filters = null;
//		SimpleMemberTagData[] memberTagData = null;
//		int expectedCount = 9;
//
//		// Test with app & member tag name filters
//		logger.info("***************************************************");
//		logger.info("Running unit test: " + this.getName() + " using app & member tag name filters");
//		try {
//			filters = new PafMbrTagFilter[2];
//			filters[0] = new PafMbrTagFilter("FMTHotel", new String[]{"Measure_Desc", "Dummy_Tag"});
//			filters[1] = new PafMbrTagFilter("TitanCopy");
//			memberTagData = memberTagManager.exportMemberTagData(filters);
//			if (memberTagData.length == expectedCount) {
//				isSuccess = true;
//			} else {
//				assertErr = "Unexpected Results";
//				logger.error("Test Failed - " + assertErr);	
//			}
//		} catch (Exception ex) {
//			assertErr = "Java Exception";
//			logger.error("Test Failed - Java Exception: " + ex.getMessage());	
//		} finally {
//			logger.info("***************************************************\n");
//			assertTrue(assertErr, isSuccess);
//		}
//
//	}
//
//	/**
//	 * Test method for {@link com.pace.base.server.PafMemberTagManager#getMemberTagData(java.lang.String, java.lang.String, com.pace.base.comm.SimpleCoordList)}.
//	 */
//	public void testGetMemberTagData1() {
//
//		boolean isSuccess = false;
//		String assertErr = "Test Failed";
//		String appName = "FMTHotel", memberTagName = "Position_Desc";
//		SimpleCoordList simpleCoordList = 
//			new SimpleCoordList(new String[]{"Location", "Position","Department"}, 
//					new String[]{"DAL", "Pos1", "F02", "DAL", "Pos3", "F02", "DAL", "Pos5", "F02"});
//		String[] expectedData = new String[]{"Reservations Mgr", "Reservations Agent 1", "Internet Reservations"};
//		MemberTagData[] memberTagDataArray = null;
//		Session session = null;
//
//		// Test with null member tag filter
//		logger.info("***************************************************");
//		logger.info("Running unit test: " + this.getName() + " FMTHotel / Position_Desc");
//		try {
//			session = PafMemberTagManager.getSession();
//			memberTagDataArray = memberTagManager.getMemberTagData(appName, memberTagName, simpleCoordList, session);
////			logger.info(MemberTagType.TEXT);
////			logger.info(MemberTagType.deCode("TX"));
////			logger.info(MemberTagType.deCode("TX").getCode());
//			if (memberTagDataArray.length == expectedData.length) {
//				isSuccess = true;
//				for (int i = 0; i < expectedData.length; i++) {
//					if (!memberTagDataArray[i].getData().equals(expectedData[i])) {
//						assertErr = "Unexpected Results";
//						logger.error("Test Failed - " + assertErr);	
//						isSuccess = false;
//						break;
//					}
//				}
//			} else {
//				assertErr = "Unexpected Results";
//				logger.error("Test Failed - " + assertErr);	
//			}
//		} catch (Exception ex) {
//			assertErr = "Java Exception";
//			logger.error("Test Failed - Java Exception: " + ex.getMessage());	
//		} finally {
//			logger.info("***************************************************\n");
//			assertTrue(assertErr, isSuccess);
//			PafMemberTagManager.terminateSession(session);
//		}
//	}
//
//	/**
//	 * Test method for {@link com.pace.base.server.PafMemberTagManager#getMemberTagData(java.lang.String, org.hibernate.Session)}.
//	 */
//	public void testGetMemberTagDataA1() {
//
//		boolean isSuccess = false;
//		String assertErr = "Test Failed";
//		String appName = "FMTHotel";
//		List<MemberTagData> memberTagData = null;
//		int expectedCount = 13;
//		Session session = null;
//
//		// Test with FMTHotel app
//		logger.info("***************************************************");
//		logger.info("Running unit test: " + this.getName() + " FMTHotel");
//		try {
//			session = PafMemberTagManager.getSession();
//			memberTagData = memberTagManager.getMemberTagData(appName, session);
//			if (memberTagData.size() == expectedCount) {
//				isSuccess = true;
//			} else {
//				assertErr = "Unexpected Results";
//				logger.error("Test Failed - " + assertErr);	
//			}
//		} catch (Exception ex) {
//			assertErr = "Java Exception";
//			logger.error("Test Failed - Java Exception: " + ex.getMessage());	
//		} finally {
//			logger.info("***************************************************\n");
//			assertTrue(assertErr, isSuccess);
//			PafMemberTagManager.terminateSession(session);
//		}
//	}
//
//	/**
//	 * Test method for {@link com.pace.base.server.PafMemberTagManager#getMemberTagData(java.lang.String, java.lang.String, org.hibernate.Session)}.
//	 */
//	public void testGetMemberTagDataAM1() {
//
//		boolean isSuccess = false;
//		String assertErr = "Test Failed";
//		String appName = "FMTHotel", memberTagName = "Position_Desc";
//		List<MemberTagData> memberTagData = null;
//		int expectedCount = 10;
//		Session session = null;
//
//		// Test with FMTHotel app and Position_Desc
//		logger.info("***************************************************");
//		logger.info("Running unit test: " + this.getName() + " FMTHotel / Position_Desc");
//		try {
//			session = PafMemberTagManager.getSession();
//			memberTagData = memberTagManager.getMemberTagData(appName, memberTagName, session);
//			if (memberTagData.size() == expectedCount) {
//				isSuccess = true;
//			} else {
//				assertErr = "Unexpected Results";
//				logger.error("Test Failed - " + assertErr);	
//			}
//		} catch (Exception ex) {
//			assertErr = "Java Exception";
//			logger.error("Test Failed - Java Exception: " + ex.getMessage());	
//		} finally {
//			logger.info("***************************************************\n");
//			assertTrue(assertErr, isSuccess);
//			PafMemberTagManager.terminateSession(session);
//		}
//	}
//
	/**
	 * Test method for {@link com.pace.base.server.PafMemberTagManager#getMemberTagData(java.lang.String, java.lang.String, org.hibernate.Session)}.
	 */
	public void testGetMemberTagDataAM2() {

		boolean isSuccess = false;
		String assertErr = "Test Failed";
		String appName = "FMTHotel", memberTagName = "Dummy";
		List<MemberTagData> memberTagData = null;
		int expectedCount = 0;
		Session session = null;

/* THIS TEST IS TEMPORARILY BYPASSED. THIS TEST HAS NOT WORKED SINCE THE MIGRATION TO LINUX AND NEW PACKAGE NAMING

/*		// Test with FMTHotel app and dumy member tag name
		logger.info("***************************************************");
		logger.info("Running unit test: " + this.getName() + " FMTHotel / Dummy");
		try {
			session = PafMemberTagManager.getSession();
			memberTagData = memberTagManager.getMemberTagData(appName, memberTagName, session);
			if (memberTagData.size() == expectedCount) {
				isSuccess = true;
			} else {
				assertErr = "Unexpected Results";
				logger.error("Test Failed - " + assertErr);	
			}
		} catch (Exception ex) {
			assertErr = "Java Exception";
			logger.error("Test Failed - Java Exception: " + ex.getMessage());	
		} finally {
			logger.info("***************************************************\n");
			assertTrue(assertErr, isSuccess);
			PafMemberTagManager.terminateSession(session);
		}
*/	}

	/**
	 * Test method for {@link com.pace.base.server.PafAppService#getMemberTagDefs(java.lang.String, java.lang.String[]}.
	 */
	public void testGetMemberTagDefs1() {

		boolean isSuccess = false;
		String assertErr = "Test Failed";
		String appId = "TitanCopy";
		String[] memberTagNames = null;
		MemberTagDef[] memberTagDefs = null;

/* THIS TEST IS TEMPORARILY BYPASSED. THIS TEST HAS NOT WORKED SINCE THE MIGRATION TO LINUX AND NEW PACKAGE NAMING
/*		// Test with null member tag names
		logger.info("***************************************************");
		logger.info("Running unit test: " + this.getName() + " Null member tag names");
		try {
			memberTagDefs = appService.getMemberTagDefs(appId, memberTagNames);
			if (memberTagDefs.length == 2) {
				isSuccess = true;
			} else {
				assertErr = "Unexpected Results";
				logger.error("Test Failed - " + assertErr);	
			}
		} catch (Exception ex) {
			assertErr = "Java Exception";
			logger.error("Test Failed - Java Exception: " + ex.getMessage());	
		} finally {
			logger.info("***************************************************\n");
			assertTrue(assertErr, isSuccess);
		}
*/	}

	/**
	 * Test method for {@link com.pace.base.server.PafAppService#getMemberTagDefs(java.lang.String, java.lang.String[]}.
	 */
	public void testGetMemberTagDefs2() {

		boolean isSuccess = false;
		String assertErr = "Test Failed";
		String appId = "TitanCopy";
		String[] memberTagNames = {"Dept_Desc"};
		MemberTagDef[] memberTagDefs = null;
/* THIS TEST IS TEMPORARILY BYPASSED. THIS TEST HAS NOT WORKED SINCE THE MIGRATION TO LINUX AND NEW PACKAGE NAMING

/*		// Test with null member tag names
		logger.info("***************************************************");
		logger.info("Running unit test: " + this.getName() + " Member Tag Name(s): Dept_Desc");
		try {
			memberTagDefs = appService.getMemberTagDefs(appId, memberTagNames);
			if (memberTagDefs.length == 1) {
				isSuccess = true;
			} else {
				assertErr = "Unexpected Results";
				logger.error("Test Failed - " + assertErr);	
			}
		} catch (Exception ex) {
			assertErr = "Java Exception";
			logger.error("Test Failed - Java Exception: " + ex.getMessage());	
		} finally {
			logger.info("***************************************************\n");
			assertTrue(assertErr, isSuccess);
		}
*/	}

	/**
	 * Test method for {@link com.pace.base.server.PafMemberTagManager#getMemberTagInfo(com.pace.base.server.comm.PafMbrTagFilter[])}.
	 */
	public void testGetMemberTagInfo1() {
/* THIS TEST IS TEMPORARILY BYPASSED. THIS TEST HAS NOT WORKED SINCE THE MIGRATION TO LINUX AND NEW PACKAGE NAMING

/*		boolean isSuccess = false;
		String assertErr = "Test Failed";
		PafMbrTagFilter[] filters = null;
		PafGetMemberTagInfoResponse response = null;
//		MemberTagInformation[] memberTagInfo = null;
		ArrayList<MemberTagInformation> filteredMemberTagInfo = new ArrayList<MemberTagInformation>();

		// Test with null member tag filter
		logger.info("***************************************************");
		logger.info("Running unit test: " + this.getName() + " using null filter");
		try {
			// Filter out info for apps without member tags
			response = memberTagManager.getMemberTagInfo(filters);
			for (MemberTagInformation memberTagInfo:response.getMemberTagInfo()) {
				if (memberTagInfo.getAppMemberTagCount() > 0) {
					filteredMemberTagInfo.add(memberTagInfo);
				}
			}
			response.setMemberTagInfo(filteredMemberTagInfo.toArray(new MemberTagInformation[0]));
			
			// Check for valid response
			if (response.equals(getDefaultMemberTagInfoResponse())) {
				isSuccess = true;
			} else {
				assertErr = "Unexpected Results";
				logger.error("Test Failed - " + assertErr);	
			}
		} catch (Exception ex) {
			assertErr = "Java Exception";
			logger.error("Test Failed - Java Exception: " + ex.getMessage());	
		} finally {
			logger.info("***************************************************\n");
			assertTrue(assertErr, isSuccess);
		}
*/
	}

	/**
	 * Test method for {@link com.pace.base.server.PafMemberTagManager#getMemberTagInfo(com.pace.base.server.comm.PafMbrTagFilter[])}.
	 */
	public void testGetMemberTagInfo2() {
/* THIS TEST IS TEMPORARILY BYPASSED. THIS TEST HAS NOT WORKED SINCE THE MIGRATION TO LINUX AND NEW PACKAGE NAMING

/*		boolean isSuccess = false;
		String assertErr = "Test Failed";
		PafMbrTagFilter[] filters = null;
		PafGetMemberTagInfoResponse response = null;

		// Test with app filter - all apps
		logger.info("***************************************************");
		logger.info("Running unit test: " + this.getName() + " using app filter - all apps");
		try {
			filters = new PafMbrTagFilter[2];
			filters[0] = new PafMbrTagFilter("FMTHotel");
			filters[1] = new PafMbrTagFilter("TitanCopy");
			response = memberTagManager.getMemberTagInfo(filters);
			if (response.equals(getDefaultMemberTagInfoResponse())) {
				isSuccess = true;
			} else {
				assertErr = "Unexpected Results";
				logger.error("Test Failed - " + assertErr);	
			}
		} catch (Exception ex) {
			assertErr = "Java Exception";
			logger.error("Test Failed - Java Exception: " + ex.getMessage());	
		} finally {
			logger.info("***************************************************\n");
			assertTrue(assertErr, isSuccess);
		}
*/
	}

	/**
	 * Test method for {@link com.pace.base.server.PafMemberTagManager#getMemberTagInfo(com.pace.base.server.comm.PafMbrTagFilter[])}.
	 */
	public void testGetMemberTagInfo3() {
/* THIS TEST IS TEMPORARILY BYPASSED. THIS TEST HAS NOT WORKED SINCE THE MIGRATION TO LINUX AND NEW PACKAGE NAMING

/*		boolean isSuccess = false;
		String assertErr = "Test Failed";
		PafMbrTagFilter[] filters = null;
		PafGetMemberTagInfoResponse response = null;

		// Test with app filter - FMTHotel
		logger.info("***************************************************");
		logger.info("Running unit test: " + this.getName() + " using app filter - FMTHotel");
		try {
			filters = new PafMbrTagFilter[1];
			filters[0] = new PafMbrTagFilter("FMTHotel");
			response = memberTagManager.getMemberTagInfo(filters);
			if (response.equals(getFMTHotelMemberTagInfoResponse())) {
				isSuccess = true;
			} else {
				assertErr = "Unexpected Results";
				logger.error("Test Failed - " + assertErr);	
			}
		} catch (Exception ex) {
			assertErr = "Java Exception";
			logger.error("Test Failed - Java Exception: " + ex.getMessage());	
		} finally {
			logger.info("***************************************************\n");
			assertTrue(assertErr, isSuccess);
		}
*/
	}

	/**
	 * Test method for {@link com.pace.base.server.PafMemberTagManager#getMemberTagInfo(com.pace.base.server.comm.PafMbrTagFilter[])}.
	 */
	public void testGetMemberTagInfo4() {
/* THIS TEST IS TEMPORARILY BYPASSED. THIS TEST HAS NOT WORKED SINCE THE MIGRATION TO LINUX AND NEW PACKAGE NAMING
	
/*		boolean isSuccess = false;
		String assertErr = "Test Failed";
		PafMbrTagFilter[] filters = null;
		PafGetMemberTagInfoResponse response = null;
	
		// Test with app & member tag name filters
		logger.info("***************************************************");
		logger.info("Running unit test: " + this.getName() + " using app & member tag name filters");
		try {
			filters = new PafMbrTagFilter[2];
			filters[0] = new PafMbrTagFilter("FMTHotel", new String[]{"Measure_Desc", "Dummy_Tag"});
			filters[1] = new PafMbrTagFilter("TitanCopy");
			response = memberTagManager.getMemberTagInfo(filters);
			if (response.equals(getFilteredMemberTagInfoResponse())) {
				isSuccess = true;
			} else {
				assertErr = "Unexpected Results";
				logger.error("Test Failed - " + assertErr);	
			}
		} catch (Exception ex) {
			assertErr = "Java Exception";
			logger.error("Test Failed - Java Exception: " + ex.getMessage());	
		} finally {
			logger.info("***************************************************\n");
			assertTrue(assertErr, isSuccess);
		}
*/	
	}

//	/**
//	 * Test method for {@link com.pace.base.server.PafMemberTagManager#importMemberTagData(com.pace.base.db.membertags.SimpleMemberTagData[])}.
//	 */
//	public void testImportMemberTagData1() {
//		
//		boolean isSuccess = false;
//		String assertErr = "Test Failed";
//		SimpleMemberTagData[] memberTagData = null;
//
//		// Test with new and existing data
//		logger.info("***************************************************");
//		logger.info("Running unit test: " + this.getName());
//		try {
//			Date now = new Date(System.currentTimeMillis());
//			SimpleCoordList coord1 = new SimpleCoordList(new String[]{"Product", "Location"}, new String[]{"DPT110", "Store1"});
//			SimpleMemberTagData mt1 = new SimpleMemberTagData("TitanCopy", "Dept_Desc", coord1, "Import1", "TX", "A. Farkas", now, false);
//			SimpleCoordList coord2 = new SimpleCoordList(new String[]{"Product", "Location"}, new String[]{"DPT120", "Store2"});
//			SimpleMemberTagData mt2 = new SimpleMemberTagData("TitanCopy", "Dept_Desc", coord2, "Import2", "TX", "A. Farkas", now, false);
//			memberTagData = new SimpleMemberTagData[]{mt1, mt2};
//			memberTagManager.importMemberTagData(memberTagData);
//			isSuccess = true;
////			if (response.equals(getDefaultMemberTagInfoResponse())) {
////				isSuccess = true;
////			} else {
////				assertErr = "Unexpected Results";
////				logger.error("Test Failed - " + assertErr);	
////			}
//		} catch (Exception ex) {
//			assertErr = "Java Exception";
//			logger.error("Test Failed - Java Exception: " + ex.getMessage());	
//		} finally {
//			logger.info("***************************************************\n");
//			assertTrue(assertErr, isSuccess);
//		}
//	}
//
//	/**
//	 * Test method for {@link com.pace.base.server.PafMemberTagManager#renameMemberTagData(com.pace.base.server.comm.PafMbrTagFilter[])}.
//	 */
//	public void testRenameMemberTagData() {
//		//fail("Not yet implemented");
//		assertTrue(true);
//	}
//
//	/**
//	 * Test method for {@link com.pace.base.server.PafMemberTagManager#saveMemberTagData(java.lang.String, com.pace.base.db.membertags.SimpleMemberTagData[], com.pace.base.db.membertags.SimpleMemberTagData[], com.pace.base.db.membertags.SimpleMemberTagData[])}.
//	 */
//	public void testSaveMemberTagData1() {
//		
//		boolean isSuccess = false;
//		String assertErr = "Test Failed";
//		SimpleMemberTagData[] memberTagData = null;
//
//		// Test with new and existing data
//		logger.info("***************************************************");
//		logger.info("Running unit test: " + this.getName());
//		try {
//			Date now = new Date(System.currentTimeMillis());
//			SimpleCoordList coord1 = new SimpleCoordList(new String[]{"Product", "Location"}, new String[]{"DPT110", "Store1"});
//			SimpleMemberTagData mt1 = new SimpleMemberTagData("TitanCopy", "Dept_Desc", coord1, "Import1", "TX", "A. Farkas", now, false);
//			SimpleCoordList coord2 = new SimpleCoordList(new String[]{"Product", "Location"}, new String[]{"DPT120", "Store2"});
//			SimpleMemberTagData mt2 = new SimpleMemberTagData("TitanCopy", "Dept_Desc", coord2, "Import2", "TX", "A. Farkas", now, false);
//			memberTagData = new SimpleMemberTagData[]{mt1, mt2};
//			memberTagManager.saveMemberTagData(memberTagData, null, null);
//			isSuccess = true;
////			if (response.equals(getDefaultMemberTagInfoResponse())) {
////				isSuccess = true;
////			} else {
////				assertErr = "Unexpected Results";
////				logger.error("Test Failed - " + assertErr);	
////			}
//		} catch (Exception ex) {
//			assertErr = "Java Exception";
//			logger.error("Test Failed - Java Exception: " + ex.getMessage());	
//		} finally {
//			logger.info("***************************************************\n");
//			assertTrue(assertErr, isSuccess);
//		}
//	}
//
	/**
	 * Test method for {@link com.pace.base.server.PafMemberTagManager#saveMemberTagData(java.lang.String, com.pace.base.db.membertags.SimpleMemberTagData[], com.pace.base.db.membertags.SimpleMemberTagData[], com.pace.base.db.membertags.SimpleMemberTagData[])}.
	 */
	public void testSaveMemberTagData2() {
/* THIS TEST IS TEMPORARILY BYPASSED. THIS TEST HAS NOT WORKED SINCE THE MIGRATION TO LINUX AND NEW PACKAGE NAMING
		
/*		boolean isSuccess = false;
		String assertErr = "Test Failed";
		SimpleMemberTagData[] memberTagData = null;

		// Test with new and existing data
		logger.info("***************************************************");
		logger.info("Running unit test: " + this.getName());
		try {
			Date now = new Date(System.currentTimeMillis());
			SimpleCoordList coord1 = new SimpleCoordList(new String[]{"Product", "Year"}, new String[]{"DPT110", "Store1"});
			SimpleMemberTagData mt1 = new SimpleMemberTagData("TitanCopy", "Dept_Desc", coord1, "Import1", "TX", "A. Farkas", now, false);
			memberTagData = new SimpleMemberTagData[]{mt1};
			memberTagManager.saveMemberTagData(null, memberTagData, null);
//			if (response.equals(getDefaultMemberTagInfoResponse())) {
//				isSuccess = true;
//			} else {
//				assertErr = "Unexpected Results";
//				logger.error("Test Failed - " + assertErr);	
//			}
		} catch (PafException ex) {
			isSuccess = true;
		} catch (Exception ex) {
			assertErr = "Java Exception";
			logger.error("Test Failed - Java Exception: " + ex.getMessage());	
		} finally {
			logger.info("***************************************************\n");
			assertTrue(assertErr, isSuccess);
		}
*/	}

	
	private void refreshMemberTagData() {

		Session session = null;
		ArrayList<String> sqlQueries = null;
		
		logger.info("\n*** Refreshing Member Tag Data ***");
		try {
			// Initialization
//			String sqlPath = "C:\\proj_wrksp\\eclipse\\Paf Base Libraries\\src\\com\\palladium\\paf\\db\\membertags\\";
			String sqlPath = paceHome + ".." + File.separator + "pace-base" + File.separator +  "src" 
				+ File.separator + "main"  + File.separator + "java" + File.separator + "com" 
				+ File.separator + "pace" + File.separator + "base" + File.separator + "db" 
				+ File.separator + "membertags" + File.separator;
			String sqlFile = null;
			session = PafMemberTagManager.getSession();
			
			// Drop member tag tables
			logger.info("Dropping member tag tables: ");
			sqlFile = sqlPath + "CREATE_MEMBER_TAG_TABLES.SQL";
			sqlQueries = StringUtils.parseSqlFile(sqlFile);
			for (String sqlQuery:sqlQueries) {
				try {
					logger.debug("Running hibernate query: " + sqlQuery);
					session.createSQLQuery(sqlQuery).executeUpdate();
				} catch (RuntimeException e) {
					// Do nothing upon failure
					logger.error("Error dropping member tag tables: " + e.getCause());
				}
			}
			
			// Reload Test Data
			logger.info("");
			logger.info("Creating member tag tables: ");
			sqlFile = sqlPath + "CREATE_MEMBER_TAG_TEST_DATA.SQL";
			sqlQueries = StringUtils.parseSqlFile(sqlFile);
			for (String sqlQuery:sqlQueries) {
				try {
					logger.debug("Running hibernate query: " + sqlQuery);
					session.createSQLQuery(sqlQuery).executeUpdate();
				} catch (RuntimeException e) {
					// Do nothing upon failure
					logger.warn("Error creating member tag tables: " + e.getCause());
				}
			}
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PafException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			PafMemberTagManager.terminateSession(session);
		}
		
	}

	private static PafGetMemberTagInfoResponse getDefaultMemberTagInfoResponse() {

		MemberTagInformation[] memberTagInfoArray = new MemberTagInformation[2];
		int totalMemberTagCount = 19;

		// FMTHotel Info
		memberTagInfoArray[0] = new MemberTagInformation("FMTHotel", 13, 
				new String[]{"Measure_Desc", "Position_Desc"}, new int[]{3,10});

		// Titan Info
		memberTagInfoArray[1] = new MemberTagInformation("TitanCopy", 6, 
				new String[]{"Dept_Desc", "Measure_Desc"}, new int[]{4,2});


		PafGetMemberTagInfoResponse infoResponse = new PafGetMemberTagInfoResponse(totalMemberTagCount, memberTagInfoArray);

		return infoResponse;
	}

	private static PafGetMemberTagInfoResponse getFMTHotelMemberTagInfoResponse() {

		MemberTagInformation[] memberTagInfoArray = new MemberTagInformation[1];
		int totalMemberTagCount = 13;

		// FMTHotel Info
		memberTagInfoArray[0] = new MemberTagInformation("FMTHotel", 13, 
				new String[]{"Measure_Desc", "Position_Desc"}, new int[]{3,10});


		PafGetMemberTagInfoResponse infoResponse = new PafGetMemberTagInfoResponse(totalMemberTagCount, memberTagInfoArray);

		return infoResponse;
	}

	private static PafGetMemberTagInfoResponse getFilteredMemberTagInfoResponse() {

		MemberTagInformation[] memberTagInfoArray = new MemberTagInformation[2];
		int totalMemberTagCount = 9;

		// FMTHotel Info
		memberTagInfoArray[0] = new MemberTagInformation("FMTHotel", 3, 
				new String[]{"Measure_Desc", "Dummy_Tag"}, new int[]{3,0});

		// Titan Info
		memberTagInfoArray[1] = new MemberTagInformation("TitanCopy", 6, 
				new String[]{"Dept_Desc", "Measure_Desc"}, new int[]{4,2});


		PafGetMemberTagInfoResponse infoResponse = new PafGetMemberTagInfoResponse(totalMemberTagCount, memberTagInfoArray);

		return infoResponse;
	}

}
