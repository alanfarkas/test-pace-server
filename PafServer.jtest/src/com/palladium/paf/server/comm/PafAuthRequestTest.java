/*
 * PafAuthRequestTest.java
 * Created by Jtest on 9/19/06 5:24:16 PM.
 * Updated by Jtest on 11/9/06 1:09:15 AM.
 */

package com.palladium.paf.server.comm;

import com.palladium.paf.server.comm.PafAuthRequest;

/**
 * PafAuthRequestTest is a unit test class for class PafAuthRequest.
 * @see com.palladium.paf.server.comm.PafAuthRequest
 * @author Parasoft Jtest 8.0
 */
public class PafAuthRequestTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public PafAuthRequestTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }

	/**
	 * Test for method: getPasswordHash()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAuthRequest#getPasswordHash()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPasswordHash2() throws Throwable {
		PafAuthRequest THIS = new PafAuthRequest();
		// jtest_tested_method
		String RETVAL = THIS.getPasswordHash();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPasswordHash()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAuthRequest#getPasswordHash()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPasswordHash3() throws Throwable {
		PafAuthRequest THIS = new PafAuthRequest((String) null, (String) null);
		THIS.setPasswordHash("");
		THIS.setUsername("");
		// jtest_tested_method
		String RETVAL = THIS.getPasswordHash();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getUsername()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAuthRequest#getUsername()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetUsername1() throws Throwable {
		PafAuthRequest THIS = new PafAuthRequest((String) null, (String) null);
		// jtest_tested_method
		String RETVAL = THIS.getUsername();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getUsername()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAuthRequest#getUsername()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetUsername2() throws Throwable {
		PafAuthRequest THIS = new PafAuthRequest("", "");
		THIS.setPasswordHash("");
		THIS.setUsername("");
		// jtest_tested_method
		String RETVAL = THIS.getUsername();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafAuthRequest(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAuthRequest#PafAuthRequest(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafAuthRequest1() throws Throwable {
		// jtest_tested_method
		PafAuthRequest THIS = new PafAuthRequest((String) null, (String) null);
		assertEquals(null, THIS.getPasswordHash()); // jtest_unverified
		assertEquals(null, THIS.getUsername()); // jtest_unverified
		assertEquals(null, THIS.getClientId()); // jtest_unverified
		assertEquals(null, THIS.getSessionToken()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafAuthRequest(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAuthRequest#PafAuthRequest(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafAuthRequest2() throws Throwable {
		// jtest_tested_method
		PafAuthRequest THIS = new PafAuthRequest("", "");
		assertEquals("", THIS.getPasswordHash()); // jtest_unverified
		assertEquals("", THIS.getUsername()); // jtest_unverified
		assertEquals(null, THIS.getClientId()); // jtest_unverified
		assertEquals(null, THIS.getSessionToken()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setPasswordHash(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAuthRequest#setPasswordHash(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetPasswordHash1() throws Throwable {
		PafAuthRequest THIS = new PafAuthRequest("", "");
		// jtest_tested_method
		THIS.setPasswordHash("");
		assertEquals("", THIS.getPasswordHash()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setUsername(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAuthRequest#setUsername(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetUsername1() throws Throwable {
		PafAuthRequest THIS = new PafAuthRequest("", "");
		// jtest_tested_method
		THIS.setUsername("");
		assertEquals("", THIS.getUsername()); // jtest_unverified
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
     * Usage: java com.palladium.paf.server.comm.PafAuthRequestTest
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
            PafAuthRequestTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.server.comm.PafAuthRequest",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return PafAuthRequest.class;
    }

}

// JTEST_CURRENT_ID=-2073625494.