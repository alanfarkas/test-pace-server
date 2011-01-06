/*
 * PafServerTest.java
 * Created by Jtest on 9/19/06 5:36:28 PM.
 */

package com.palladium.paf.ui;

import com.palladium.paf.ui.PafServer;

/**
 * PafServerTest is a unit test class for class PafServer.
 * @see com.palladium.paf.ui.PafServer
 * @author Parasoft Jtest 8.0
 */
public class PafServerTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafServerTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: compareTo(java.lang.Object)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafServer#compareTo(java.lang.Object)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCompareTo1() throws Throwable {
		PafServer THIS = new PafServer(
			(String) null,
			(String) null,
			(Integer) null,
			(String) null,
			false);
		// jtest_tested_method
		int RETVAL = THIS.compareTo("");
		// ClassCastException thrown
		// at com.palladium.paf.ui.PafServer.compareTo(PafServer.java:58)
		// jtest_unverified
	}

	/**
	 * Test for method: compareTo(java.lang.Object)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafServer#compareTo(java.lang.Object)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCompareTo2() throws Throwable {
		PafServer THIS = new PafServer(
			(String) null,
			(String) null,
			(Integer) null,
			(String) null,
			false);
		// jtest_tested_method
		int RETVAL = THIS.compareTo((Object) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.ui.PafServer.compareTo(Ljava/lang/Object;)I>
		// at com.palladium.paf.ui.PafServer.compareTo(PafServer.java:62)
		// jtest_unverified
	}

	/**
	 * Test for method: compareTo(java.lang.Object)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafServer#compareTo(java.lang.Object)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCompareTo3() throws Throwable {
		PafServer THIS = new PafServer(
			(String) null,
			(String) null,
			(Integer) null,
			(String) null,
			false);
		Integer t1 = new Integer("0");
		PafServer t2 = new PafServer(
			(String) null,
			(String) null,
			(Integer) null,
			(String) null,
			false);
		THIS.setHomeDirectory("");
		THIS.setName("");
		THIS.setPort(t1);
		THIS.setHost("");
		THIS.setDefaultServer(false);
		THIS.setWebappName("");
		THIS.setWsdlServiceName("");
		// jtest_tested_method
		int RETVAL = THIS.compareTo(t2);
		assertEquals(0, RETVAL); // jtest_unverified
		assertEquals("", THIS.getName()); // jtest_unverified
		assertEquals("", THIS.getHost()); // jtest_unverified
		assertEquals(t1, THIS.getPort()); // jtest_unverified
		assertEquals("http://:0//", THIS.getCompleteWSDLService()); // jtest_unverified
		assertEquals("", THIS.getHomeDirectory()); // jtest_unverified
		assertEquals("", THIS.getWebappName()); // jtest_unverified
		assertEquals("", THIS.getWsdlServiceName()); // jtest_unverified
		assertEquals(false, THIS.isDefaultServer()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: compareTo(java.lang.Object)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafServer#compareTo(java.lang.Object)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCompareTo5() throws Throwable {
		Integer t0 = new Integer("0");
		PafServer THIS = new PafServer("", "", t0, "", true);
		Integer t2 = new Integer(7);
		Integer t4 = new Integer("0");
		PafServer t3 = new PafServer("", "", t4, "", true);
		THIS.setHomeDirectory("");
		THIS.setName("");
		THIS.setPort(t2);
		THIS.setHost("");
		THIS.setDefaultServer(true);
		THIS.setWebappName("");
		THIS.setWsdlServiceName("");
		// jtest_tested_method
		int RETVAL = THIS.compareTo(t3);
		assertEquals(0, RETVAL); // jtest_unverified
		assertEquals("", THIS.getName()); // jtest_unverified
		assertEquals("", THIS.getHost()); // jtest_unverified
		assertEquals(t2, THIS.getPort()); // jtest_unverified
		assertEquals("http://:7//", THIS.getCompleteWSDLService()); // jtest_unverified
		assertEquals("", THIS.getHomeDirectory()); // jtest_unverified
		assertEquals("", THIS.getWebappName()); // jtest_unverified
		assertEquals("", THIS.getWsdlServiceName()); // jtest_unverified
		assertEquals(true, THIS.isDefaultServer()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getCompleteWSDLService()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafServer#getCompleteWSDLService()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetCompleteWSDLService1() throws Throwable {
		PafServer THIS = new PafServer(
			(String) null,
			(String) null,
			(Integer) null,
			(String) null,
			false);
		// jtest_tested_method
		String RETVAL = THIS.getCompleteWSDLService();
		assertEquals("http://null:null/null/null", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getHomeDirectory()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafServer#getHomeDirectory()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetHomeDirectory1() throws Throwable {
		PafServer THIS = new PafServer(
			(String) null,
			(String) null,
			(Integer) null,
			(String) null,
			false);
		// jtest_tested_method
		String RETVAL = THIS.getHomeDirectory();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getHomeDirectory()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafServer#getHomeDirectory()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetHomeDirectory2() throws Throwable {
		PafServer THIS = new PafServer(
			(String) null,
			(String) null,
			(Integer) null,
			(String) null,
			false);
		Integer t1 = new Integer(0);
		THIS.setHomeDirectory("");
		THIS.setName("");
		THIS.setPort(t1);
		THIS.setHost("");
		THIS.setDefaultServer(false);
		THIS.setWebappName("");
		THIS.setWsdlServiceName("");
		// jtest_tested_method
		String RETVAL = THIS.getHomeDirectory();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getHost()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafServer#getHost()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetHost1() throws Throwable {
		PafServer THIS = new PafServer(
			(String) null,
			(String) null,
			(Integer) null,
			(String) null,
			false);
		// jtest_tested_method
		String RETVAL = THIS.getHost();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getHost()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafServer#getHost()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetHost2() throws Throwable {
		Integer t0 = new Integer("0");
		PafServer THIS = new PafServer("", "", t0, "", true);
		// jtest_tested_method
		String RETVAL = THIS.getHost();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafServer#getName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetName1() throws Throwable {
		PafServer THIS = new PafServer(
			(String) null,
			(String) null,
			(Integer) null,
			(String) null,
			false);
		// jtest_tested_method
		String RETVAL = THIS.getName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafServer#getName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetName2() throws Throwable {
		Integer t0 = new Integer(7);
		PafServer THIS = new PafServer("", "", t0, "", true);
		Integer t2 = new Integer("0");
		THIS.setHomeDirectory("");
		THIS.setName("");
		THIS.setPort(t2);
		THIS.setHost("");
		THIS.setDefaultServer(true);
		THIS.setWebappName("");
		THIS.setWsdlServiceName("");
		// jtest_tested_method
		String RETVAL = THIS.getName();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPort()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafServer#getPort()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPort1() throws Throwable {
		PafServer THIS = new PafServer(
			(String) null,
			(String) null,
			(Integer) null,
			(String) null,
			false);
		// jtest_tested_method
		Integer RETVAL = THIS.getPort();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPort()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafServer#getPort()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPort2() throws Throwable {
		Integer t0 = new Integer(7);
		PafServer THIS = new PafServer("", "", t0, "", true);
		// jtest_tested_method
		Integer RETVAL = THIS.getPort();
		assertEquals(t0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getWebappName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafServer#getWebappName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetWebappName1() throws Throwable {
		PafServer THIS = new PafServer(
			(String) null,
			(String) null,
			(Integer) null,
			(String) null,
			false);
		// jtest_tested_method
		String RETVAL = THIS.getWebappName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getWsdlServiceName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafServer#getWsdlServiceName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetWsdlServiceName1() throws Throwable {
		PafServer THIS = new PafServer(
			(String) null,
			(String) null,
			(Integer) null,
			(String) null,
			false);
		// jtest_tested_method
		String RETVAL = THIS.getWsdlServiceName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isDefaultServer()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafServer#isDefaultServer()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsDefaultServer1() throws Throwable {
		PafServer THIS = new PafServer(
			(String) null,
			(String) null,
			(Integer) null,
			(String) null,
			false);
		// jtest_tested_method
		boolean RETVAL = THIS.isDefaultServer();
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isDefaultServer()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafServer#isDefaultServer()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsDefaultServer2() throws Throwable {
		Integer t0 = new Integer("0");
		PafServer THIS = new PafServer("", "", t0, "", true);
		// jtest_tested_method
		boolean RETVAL = THIS.isDefaultServer();
		assertEquals(true, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafServer(java.lang.String,java.lang.String,java.lang.Integer,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafServer#PafServer(java.lang.String,java.lang.String,java.lang.Integer,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafServer1() throws Throwable {
		// jtest_tested_method
		PafServer THIS = new PafServer(
			(String) null,
			(String) null,
			(Integer) null,
			(String) null);
		assertEquals(null, THIS.getName()); // jtest_unverified
		assertEquals(null, THIS.getHost()); // jtest_unverified
		assertEquals(null, THIS.getPort()); // jtest_unverified
		assertEquals("http://null:null/null/null", THIS
			.getCompleteWSDLService()); // jtest_unverified
		assertEquals(null, THIS.getHomeDirectory()); // jtest_unverified
		assertEquals(null, THIS.getWebappName()); // jtest_unverified
		assertEquals(null, THIS.getWsdlServiceName()); // jtest_unverified
		assertEquals(false, THIS.isDefaultServer()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafServer(java.lang.String,java.lang.String,java.lang.Integer,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafServer#PafServer(java.lang.String,java.lang.String,java.lang.Integer,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafServer2() throws Throwable {
		Integer t0 = new Integer(7);
		// jtest_tested_method
		PafServer THIS = new PafServer("", "", t0, "");
		assertEquals("", THIS.getName()); // jtest_unverified
		assertEquals("", THIS.getHost()); // jtest_unverified
		assertEquals(t0, THIS.getPort()); // jtest_unverified
		assertEquals("http://:7/null/null", THIS.getCompleteWSDLService()); // jtest_unverified
		assertEquals("", THIS.getHomeDirectory()); // jtest_unverified
		assertEquals(null, THIS.getWebappName()); // jtest_unverified
		assertEquals(null, THIS.getWsdlServiceName()); // jtest_unverified
		assertEquals(false, THIS.isDefaultServer()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafServer()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafServer#PafServer()
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafServer3() throws Throwable {
		// jtest_tested_method
		PafServer THIS = new PafServer();
		assertEquals(null, THIS.getName()); // jtest_unverified
		assertEquals(null, THIS.getHost()); // jtest_unverified
		assertEquals(null, THIS.getPort()); // jtest_unverified
		assertEquals("http://null:null/null/null", THIS
			.getCompleteWSDLService()); // jtest_unverified
		assertEquals(null, THIS.getHomeDirectory()); // jtest_unverified
		assertEquals(null, THIS.getWebappName()); // jtest_unverified
		assertEquals(null, THIS.getWsdlServiceName()); // jtest_unverified
		assertEquals(false, THIS.isDefaultServer()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafServer(java.lang.String,java.lang.String,java.lang.Integer,java.lang.String,boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafServer#PafServer(java.lang.String,java.lang.String,java.lang.Integer,java.lang.String,boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafServer4() throws Throwable {
		Integer t0 = new Integer("0");
		// jtest_tested_method
		PafServer THIS = new PafServer("", "", t0, "", true);
		assertEquals("", THIS.getName()); // jtest_unverified
		assertEquals("", THIS.getHost()); // jtest_unverified
		assertEquals(t0, THIS.getPort()); // jtest_unverified
		assertEquals("http://:0/null/null", THIS.getCompleteWSDLService()); // jtest_unverified
		assertEquals("", THIS.getHomeDirectory()); // jtest_unverified
		assertEquals(null, THIS.getWebappName()); // jtest_unverified
		assertEquals(null, THIS.getWsdlServiceName()); // jtest_unverified
		assertEquals(true, THIS.isDefaultServer()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setDefaultServer(boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafServer#setDefaultServer(boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDefaultServer1() throws Throwable {
		Integer t0 = new Integer(7);
		PafServer THIS = new PafServer("", "", t0, "", true);
		Integer t2 = new Integer("0");
		THIS.setHomeDirectory("");
		THIS.setName("");
		THIS.setPort(t2);
		THIS.setHost("");
		THIS.setDefaultServer(true);
		THIS.setWebappName("");
		THIS.setWsdlServiceName("");
		// jtest_tested_method
		THIS.setDefaultServer(true);
		assertEquals(true, THIS.isDefaultServer()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setHomeDirectory(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafServer#setHomeDirectory(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetHomeDirectory1() throws Throwable {
		Integer t0 = new Integer("0");
		PafServer THIS = new PafServer("", "", t0, "", true);
		// jtest_tested_method
		THIS.setHomeDirectory("");
		assertEquals("", THIS.getHomeDirectory()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setHost(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafServer#setHost(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetHost1() throws Throwable {
		Integer t0 = new Integer(7);
		PafServer THIS = new PafServer("", "", t0, "", true);
		Integer t2 = new Integer("0");
		THIS.setHomeDirectory("");
		THIS.setName("");
		THIS.setPort(t2);
		THIS.setHost("");
		THIS.setDefaultServer(true);
		THIS.setWebappName("");
		THIS.setWsdlServiceName("");
		// jtest_tested_method
		THIS.setHost("");
		assertEquals("", THIS.getHost()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafServer#setName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetName1() throws Throwable {
		Integer t0 = new Integer(7);
		PafServer THIS = new PafServer("", "", t0, "", true);
		// jtest_tested_method
		THIS.setName("");
		assertEquals("", THIS.getName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setPort(java.lang.Integer)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafServer#setPort(java.lang.Integer)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetPort1() throws Throwable {
		Integer t0 = new Integer(7);
		PafServer THIS = new PafServer("", "", t0, "", true);
		Integer t2 = new Integer(7);
		// jtest_tested_method
		THIS.setPort(t2);
		assertEquals(t0, THIS.getPort()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setWebappName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafServer#setWebappName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetWebappName1() throws Throwable {
		Integer t0 = new Integer(7);
		PafServer THIS = new PafServer("", "", t0, "", true);
		Integer t2 = new Integer("0");
		THIS.setHomeDirectory("");
		THIS.setName("");
		THIS.setPort(t2);
		THIS.setHost("");
		THIS.setDefaultServer(true);
		THIS.setWebappName("");
		THIS.setWsdlServiceName("");
		// jtest_tested_method
		THIS.setWebappName("");
		assertEquals("", THIS.getWebappName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setWsdlServiceName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafServer#setWsdlServiceName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetWsdlServiceName1() throws Throwable {
		Integer t0 = new Integer(7);
		PafServer THIS = new PafServer("", "", t0, "", true);
		Integer t2 = new Integer("0");
		THIS.setHomeDirectory("");
		THIS.setName("");
		THIS.setPort(t2);
		THIS.setHost("");
		THIS.setDefaultServer(true);
		THIS.setWebappName("");
		THIS.setWsdlServiceName("");
		// jtest_tested_method
		THIS.setWsdlServiceName("");
		assertEquals("", THIS.getWsdlServiceName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Used to set up the test. This method is called by JUnit before each of
	 * the tests are executed.
	 * @see junit.framework.TestCase#setUp()
	 * @author Parasoft Jtest 8.0
	 */
	public void setUp() throws Exception {
		super.setUp();
		/*
		 * Add any necessary initialization code here (e.g., open a socket).
		 * Call Repository.putTemporary() to provide initialized instances of
		 * objects to be used when testing.
		 */
		// jtest.Repository.putTemporary("name", object);
	}

	/**
	 * Used to clean up after the test. This method is called by JUnit after
	 * each of the tests have been completed.
	 * @see junit.framework.TestCase#tearDown()
	 * @author Parasoft Jtest 8.0
	 */
	public void tearDown() throws Exception {
		super.tearDown();
		/*
		 * Add any necessary cleanup code here (e.g., close a socket).
		 */
	}

	/**
	 * Utility main method.  Runs the test cases defined in this test class.
	 * 
	 * Usage: java com.palladium.paf.ui.PafServerTest
	 * @param args command line arguments are not needed
	 * @author Parasoft Jtest 8.0
	 */
	public static void main(String[] args) {
		// junit.textui.TestRunner will print the test results to stdout.
		junit.textui.TestRunner.run(suite());
	}

	/**
	 * Create a test suite for running the tests in this class.
	 * IndependentTestSuite will run each test case in a separate classloader.
	 * @return a test suite to run all of the tests in this class
	 * @author Parasoft Jtest 8.0
	 */
	public static junit.framework.Test suite() {
		return new jtest.IndependentTestSuite(
		// this class
			PafServerTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.ui.PafServer",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafServer.class;
	}

}

// JTEST_CURRENT_ID=-1595867068.