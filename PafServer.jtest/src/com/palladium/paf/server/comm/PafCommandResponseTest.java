/*
 * PafCommandResponseTest.java
 * Created by Jtest on 9/19/06 5:03:55 PM.
 */

package com.palladium.paf.server.comm;

import com.palladium.paf.server.comm.PafCommandResponse;

/**
 * PafCommandResponseTest is a unit test class for class PafCommandResponse.
 * @see com.palladium.paf.server.comm.PafCommandResponse
 * @author Parasoft Jtest 8.0
 */
public class PafCommandResponseTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public PafCommandResponseTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }

    /**
     * Test for method: getErrorCode()
     * @throws Throwable Tests may throw any Throwable
     * @see PafCommandResponse#getErrorCode()
     * @author Parasoft Jtest 8.0
     */
    public void testGetErrorCode1() throws Throwable {
        PafCommandResponse THIS = new PafCommandResponse();
        // jtest_tested_method
        long RETVAL = THIS.getErrorCode();
        assertEquals(0L, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: getErrorCode()
     * @throws Throwable Tests may throw any Throwable
     * @see PafCommandResponse#getErrorCode()
     * @author Parasoft Jtest 8.0
     */
    public void testGetErrorCode3() throws Throwable {
        PafCommandResponse THIS = new PafCommandResponse();
        THIS.setErrorCode(7L);
        THIS.setMessage("");
        THIS.setSuccessful(true);
        // jtest_tested_method
        long RETVAL = THIS.getErrorCode();
        assertEquals(7L, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: getMessage()
     * @throws Throwable Tests may throw any Throwable
     * @see PafCommandResponse#getMessage()
     * @author Parasoft Jtest 8.0
     */
    public void testGetMessage1() throws Throwable {
        PafCommandResponse THIS = new PafCommandResponse();
        // jtest_tested_method
        String RETVAL = THIS.getMessage();
        assertEquals(null, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: isSuccessful()
     * @throws Throwable Tests may throw any Throwable
     * @see PafCommandResponse#isSuccessful()
     * @author Parasoft Jtest 8.0
     */
    public void testIsSuccessful1() throws Throwable {
        PafCommandResponse THIS = new PafCommandResponse();
        // jtest_tested_method
        boolean RETVAL = THIS.isSuccessful();
        assertEquals(false, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: setErrorCode(long)
     * @throws Throwable Tests may throw any Throwable
     * @see PafCommandResponse#setErrorCode(long)
     * @author Parasoft Jtest 8.0
     */
    public void testSetErrorCode1() throws Throwable {
        PafCommandResponse THIS = new PafCommandResponse();
        // jtest_tested_method
        THIS.setErrorCode(7L);
        assertEquals(7L, THIS.getErrorCode()); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: setMessage(java.lang.String)
     * @throws Throwable Tests may throw any Throwable
     * @see PafCommandResponse#setMessage(java.lang.String)
     * @author Parasoft Jtest 8.0
     */
    public void testSetMessage1() throws Throwable {
        PafCommandResponse THIS = new PafCommandResponse();
        // jtest_tested_method
        THIS.setMessage("");
        assertEquals("", THIS.getMessage()); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: setSuccessful(boolean)
     * @throws Throwable Tests may throw any Throwable
     * @see PafCommandResponse#setSuccessful(boolean)
     * @author Parasoft Jtest 8.0
     */
    public void testSetSuccessful1() throws Throwable {
        PafCommandResponse THIS = new PafCommandResponse();
        // jtest_tested_method
        THIS.setSuccessful(true);
        assertEquals(true, THIS.isSuccessful()); // jtest_unverified
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
     * Usage: java com.palladium.paf.server.comm.PafCommandResponseTest
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
            PafCommandResponseTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.server.comm.PafCommandResponse",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return PafCommandResponse.class;
    }

}

// JTEST_CURRENT_ID=-1243414630.