/*
 * PafViewRequestTest.java
 * Created by Jtest on 9/19/06 4:58:32 PM.
 * Updated by Jtest on 11/9/06 12:50:48 AM.
 */

package com.palladium.paf.server.comm;

import com.palladium.paf.server.comm.PafViewRequest;

/**
 * PafViewRequestTest is a unit test class for class PafViewRequest.
 * @see com.palladium.paf.server.comm.PafViewRequest
 * @author Parasoft Jtest 8.0
 */
public class PafViewRequestTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public PafViewRequestTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }

	/**
	 * Test for method: getViewName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewRequest#getViewName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetViewName1() throws Throwable {
		PafViewRequest THIS = new PafViewRequest();
		// jtest_tested_method
		String RETVAL = THIS.getViewName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getViewName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewRequest#getViewName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetViewName2() throws Throwable {
		PafViewRequest THIS = new PafViewRequest();
		THIS.setViewName("");
		// jtest_tested_method
		String RETVAL = THIS.getViewName();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setViewName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewRequest#setViewName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetViewName1() throws Throwable {
		PafViewRequest THIS = new PafViewRequest();
		// jtest_tested_method
		THIS.setViewName("");
		assertEquals("", THIS.getViewName()); // jtest_unverified
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
     * Usage: java com.palladium.paf.server.comm.PafViewRequestTest
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
            PafViewRequestTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.server.comm.PafViewRequest",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return PafViewRequest.class;
    }

}

// JTEST_CURRENT_ID=-598458570.