/*
 * PafPlanSessionRequestTest.java
 * Created by Jtest on 9/19/06 4:59:02 PM.
 * Updated by Jtest on 11/9/06 12:51:02 AM.
 */

package com.palladium.paf.server.comm;

import com.palladium.paf.server.comm.PafPlanSessionRequest;

/**
 * PafPlanSessionRequestTest is a unit test class for class PafPlanSessionRequest.
 * @see com.palladium.paf.server.comm.PafPlanSessionRequest
 * @author Parasoft Jtest 8.0
 */
public class PafPlanSessionRequestTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public PafPlanSessionRequestTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }

	/**
	 * Test for method: getSeasonId()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafPlanSessionRequest#getSeasonId()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetSeasonId1() throws Throwable {
		PafPlanSessionRequest THIS = new PafPlanSessionRequest();
		// jtest_tested_method
		String RETVAL = THIS.getSeasonId();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getSelectedRole()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafPlanSessionRequest#getSelectedRole()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetSelectedRole1() throws Throwable {
		PafPlanSessionRequest THIS = new PafPlanSessionRequest();
		// jtest_tested_method
		String RETVAL = THIS.getSelectedRole();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getSelectedRole()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafPlanSessionRequest#getSelectedRole()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetSelectedRole2() throws Throwable {
		PafPlanSessionRequest THIS = new PafPlanSessionRequest();
		THIS.setSelectedRole("");
		THIS.setSeasonId("");
		// jtest_tested_method
		String RETVAL = THIS.getSelectedRole();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafPlanSessionRequest()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafPlanSessionRequest#PafPlanSessionRequest()
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafPlanSessionRequest1() throws Throwable {
		// jtest_tested_method
		PafPlanSessionRequest THIS = new PafPlanSessionRequest();
		assertEquals(null, THIS.getSeasonId()); // jtest_unverified
		assertEquals(null, THIS.getSelectedRole()); // jtest_unverified
		assertEquals(null, THIS.getClientId()); // jtest_unverified
		assertEquals(null, THIS.getSessionToken()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setSeasonId(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafPlanSessionRequest#setSeasonId(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetSeasonId1() throws Throwable {
		PafPlanSessionRequest THIS = new PafPlanSessionRequest();
		// jtest_tested_method
		THIS.setSeasonId("");
		assertEquals("", THIS.getSeasonId()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setSelectedRole(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafPlanSessionRequest#setSelectedRole(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetSelectedRole1() throws Throwable {
		PafPlanSessionRequest THIS = new PafPlanSessionRequest();
		// jtest_tested_method
		THIS.setSelectedRole("");
		assertEquals("", THIS.getSelectedRole()); // jtest_unverified
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
     * Usage: java com.palladium.paf.server.comm.PafPlanSessionRequestTest
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
            PafPlanSessionRequestTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.server.comm.PafPlanSessionRequest",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return PafPlanSessionRequest.class;
    }

}

// JTEST_CURRENT_ID=760111600.