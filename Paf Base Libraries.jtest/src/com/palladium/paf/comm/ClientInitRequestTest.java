/*
 * ClientInitRequestTest.java
 * Created by Jtest on 9/19/06 5:34:04 PM.
 */

package com.palladium.paf.comm;

import com.palladium.paf.comm.ClientInitRequest;

/**
 * ClientInitRequestTest is a unit test class for class ClientInitRequest.
 * @see com.palladium.paf.comm.ClientInitRequest
 * @author Parasoft Jtest 8.0
 */
public class ClientInitRequestTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public ClientInitRequestTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getClientLanguage()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ClientInitRequest#getClientLanguage()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetClientLanguage1() throws Throwable {
		ClientInitRequest THIS = new ClientInitRequest();
		// jtest_tested_method
		String RETVAL = THIS.getClientLanguage();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getClientType()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ClientInitRequest#getClientType()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetClientType1() throws Throwable {
		ClientInitRequest THIS = new ClientInitRequest();
		// jtest_tested_method
		String RETVAL = THIS.getClientType();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getClientType()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ClientInitRequest#getClientType()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetClientType2() throws Throwable {
		ClientInitRequest THIS = new ClientInitRequest();
		THIS.setClientType("");
		THIS.setClientVersion("");
		THIS.setIpAddress("");
		THIS.setClientLanguage("");
		// jtest_tested_method
		String RETVAL = THIS.getClientType();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getClientVersion()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ClientInitRequest#getClientVersion()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetClientVersion1() throws Throwable {
		ClientInitRequest THIS = new ClientInitRequest();
		// jtest_tested_method
		String RETVAL = THIS.getClientVersion();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getIpAddress()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ClientInitRequest#getIpAddress()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetIpAddress1() throws Throwable {
		ClientInitRequest THIS = new ClientInitRequest();
		// jtest_tested_method
		String RETVAL = THIS.getIpAddress();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setClientLanguage(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ClientInitRequest#setClientLanguage(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetClientLanguage1() throws Throwable {
		ClientInitRequest THIS = new ClientInitRequest();
		// jtest_tested_method
		THIS.setClientLanguage("");
		assertEquals("", THIS.getClientLanguage()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setClientType(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ClientInitRequest#setClientType(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetClientType1() throws Throwable {
		ClientInitRequest THIS = new ClientInitRequest();
		// jtest_tested_method
		THIS.setClientType("");
		assertEquals("", THIS.getClientType()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setClientVersion(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ClientInitRequest#setClientVersion(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetClientVersion1() throws Throwable {
		ClientInitRequest THIS = new ClientInitRequest();
		// jtest_tested_method
		THIS.setClientVersion("");
		assertEquals("", THIS.getClientVersion()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setIpAddress(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ClientInitRequest#setIpAddress(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetIpAddress1() throws Throwable {
		ClientInitRequest THIS = new ClientInitRequest();
		// jtest_tested_method
		THIS.setIpAddress("");
		assertEquals("", THIS.getIpAddress()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: toString()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ClientInitRequest#toString()
	 * @author Parasoft Jtest 8.0
	 */
	public void testToString1() throws Throwable {
		ClientInitRequest THIS = new ClientInitRequest();
		// jtest_tested_method
		String RETVAL = THIS.toString();
		assertEquals(
			"Client Address: null\nClient Type: null\nClient Version: null",
			RETVAL); // jtest_unverified
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
	 * Usage: java com.palladium.paf.comm.ClientInitRequestTest
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
			ClientInitRequestTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.comm.ClientInitRequest",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return ClientInitRequest.class;
	}

}

// JTEST_CURRENT_ID=1073541831.