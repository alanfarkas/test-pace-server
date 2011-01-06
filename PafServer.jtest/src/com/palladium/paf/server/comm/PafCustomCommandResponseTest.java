/*
 * PafCustomCommandResponseTest.java
 * Created by Jtest on 9/19/06 6:05:08 PM.
 */

package com.palladium.paf.server.comm;

import com.palladium.paf.CustomCommandResult;
import com.palladium.paf.server.comm.PafCustomCommandResponse;

/**
 * PafCustomCommandResponseTest is a unit test class for class PafCustomCommandResponse.
 * @see com.palladium.paf.server.comm.PafCustomCommandResponse
 * @author Parasoft Jtest 8.0
 */
public class PafCustomCommandResponseTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public PafCustomCommandResponseTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }

    /**
     * Test for method: getCommandResults()
     * @throws Throwable Tests may throw any Throwable
     * @see PafCustomCommandResponse#getCommandResults()
     * @author Parasoft Jtest 8.0
     */
    public void testGetCommandResults1() throws Throwable {
        PafCustomCommandResponse THIS = new PafCustomCommandResponse();
        // jtest_tested_method
        CustomCommandResult[] RETVAL = THIS.getCommandResults();
        assertEquals(null, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: getCommandResults()
     * @throws Throwable Tests may throw any Throwable
     * @see PafCustomCommandResponse#getCommandResults()
     * @author Parasoft Jtest 8.0
     */
    public void testGetCommandResults2() throws Throwable {
        PafCustomCommandResponse THIS = new PafCustomCommandResponse();
        CustomCommandResult[] var1 = new CustomCommandResult[] {};
        THIS.setCommandResults(var1);
        // jtest_tested_method
        CustomCommandResult[] RETVAL = THIS.getCommandResults();
        assertEquals(var1, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: PafCustomCommandResponse()
     * @throws Throwable Tests may throw any Throwable
     * @see PafCustomCommandResponse#PafCustomCommandResponse()
     * @author Parasoft Jtest 8.0
     */
    public void testPafCustomCommandResponse1() throws Throwable {
        // jtest_tested_method
        PafCustomCommandResponse THIS = new PafCustomCommandResponse();
        assertEquals(null, THIS.getCommandResults()); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: setCommandResults(com.palladium.paf.CustomCommandResult[])
     * @throws Throwable Tests may throw any Throwable
     * @see PafCustomCommandResponse#setCommandResults(com.palladium.paf.CustomCommandResult[])
     * @author Parasoft Jtest 8.0
     */
    public void testSetCommandResults1() throws Throwable {
        PafCustomCommandResponse THIS = new PafCustomCommandResponse();
        CustomCommandResult[] var1 = new CustomCommandResult[] {};
        // jtest_tested_method
        THIS.setCommandResults(var1);
        assertSame(var1, THIS.getCommandResults()); // jtest_unverified
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
     * Usage: java com.palladium.paf.server.comm.PafCustomCommandResponseTest
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
            PafCustomCommandResponseTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.server.comm.PafCustomCommandResponse",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return PafCustomCommandResponse.class;
    }

}

// JTEST_CURRENT_ID=1067207185.