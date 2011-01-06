/*
 * PafRequestTest.java
 * Created by Jtest on 9/19/06 6:00:16 PM.
 */

package com.palladium.paf.comm;

import com.palladium.paf.comm.PafRequest;

/**
 * PafRequestTest is a unit test class for class PafRequest.
 * @see com.palladium.paf.comm.PafRequest
 * @author Parasoft Jtest 8.0
 */
public class PafRequestTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafRequestTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getClientId()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafRequest#getClientId()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetClientId1() throws Throwable {
		PafRequest THIS = new PafRequest();
		// jtest_tested_method
		String RETVAL = THIS.getClientId();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getClientId()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafRequest#getClientId()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetClientId2() throws Throwable {
		PafRequest THIS = new PafRequest();
		THIS.setClientId("");
		THIS.setSessionToken("");
		// jtest_tested_method
		String RETVAL = THIS.getClientId();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getSessionToken()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafRequest#getSessionToken()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetSessionToken1() throws Throwable {
		PafRequest THIS = new PafRequest();
		// jtest_tested_method
		String RETVAL = THIS.getSessionToken();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setClientId(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafRequest#setClientId(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetClientId1() throws Throwable {
		PafRequest THIS = new PafRequest();
		// jtest_tested_method
		THIS.setClientId("");
		assertEquals("", THIS.getClientId()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setSessionToken(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafRequest#setSessionToken(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetSessionToken1() throws Throwable {
		PafRequest THIS = new PafRequest();
		// jtest_tested_method
		THIS.setSessionToken("");
		assertEquals("", THIS.getSessionToken()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.comm.PafRequestTest
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
			PafRequestTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.comm.PafRequest",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafRequest.class;
	}

}

// JTEST_CURRENT_ID=-1297709010.