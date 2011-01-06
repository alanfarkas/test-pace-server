/*
 * PafServerAckTest.java
 * Created by Jtest on 9/19/06 6:23:57 PM.
 */

package com.palladium.paf.server.comm;

import com.palladium.paf.server.comm.PafServerAck;

/**
 * PafServerAckTest is a unit test class for class PafServerAck.
 * @see com.palladium.paf.server.comm.PafServerAck
 * @author Parasoft Jtest 8.0
 */
public class PafServerAckTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public PafServerAckTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }

    /**
     * Test for method: getClientId()
     * @throws Throwable Tests may throw any Throwable
     * @see PafServerAck#getClientId()
     * @author Parasoft Jtest 8.0
     */
    public void testGetClientId2() throws Throwable {
        PafServerAck THIS = new PafServerAck();
        // jtest_tested_method
        String RETVAL = THIS.getClientId();
        assertEquals(null, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: getClientId()
     * @throws Throwable Tests may throw any Throwable
     * @see PafServerAck#getClientId()
     * @author Parasoft Jtest 8.0
     */
    public void testGetClientId3() throws Throwable {
        PafServerAck THIS = new PafServerAck((String) null, (String) null, (String) null);
        THIS.setClientId("");
        THIS.setPlatform("");
        THIS.setServerVersion("");
        // jtest_tested_method
        String RETVAL = THIS.getClientId();
        assertEquals("", RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: getPlatform()
     * @throws Throwable Tests may throw any Throwable
     * @see PafServerAck#getPlatform()
     * @author Parasoft Jtest 8.0
     */
    public void testGetPlatform1() throws Throwable {
        PafServerAck THIS = new PafServerAck((String) null, (String) null, (String) null);
        // jtest_tested_method
        String RETVAL = THIS.getPlatform();
        assertEquals(null, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: getPlatform()
     * @throws Throwable Tests may throw any Throwable
     * @see PafServerAck#getPlatform()
     * @author Parasoft Jtest 8.0
     */
    public void testGetPlatform2() throws Throwable {
        PafServerAck THIS = new PafServerAck("", "", "");
        THIS.setClientId("");
        THIS.setPlatform("");
        THIS.setServerVersion("");
        // jtest_tested_method
        String RETVAL = THIS.getPlatform();
        assertEquals("", RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: getServerVersion()
     * @throws Throwable Tests may throw any Throwable
     * @see PafServerAck#getServerVersion()
     * @author Parasoft Jtest 8.0
     */
    public void testGetServerVersion1() throws Throwable {
        PafServerAck THIS = new PafServerAck((String) null, (String) null, (String) null);
        // jtest_tested_method
        String RETVAL = THIS.getServerVersion();
        assertEquals(null, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: getServerVersion()
     * @throws Throwable Tests may throw any Throwable
     * @see PafServerAck#getServerVersion()
     * @author Parasoft Jtest 8.0
     */
    public void testGetServerVersion2() throws Throwable {
        PafServerAck THIS = new PafServerAck("", "", "");
        THIS.setClientId("");
        THIS.setPlatform("");
        THIS.setServerVersion("");
        // jtest_tested_method
        String RETVAL = THIS.getServerVersion();
        assertEquals("", RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: PafServerAck(java.lang.String,java.lang.String,java.lang.String)
     * @throws Throwable Tests may throw any Throwable
     * @see PafServerAck#PafServerAck(java.lang.String,java.lang.String,java.lang.String)
     * @author Parasoft Jtest 8.0
     */
    public void testPafServerAck1() throws Throwable {
        // jtest_tested_method
        PafServerAck THIS = new PafServerAck((String) null, (String) null, (String) null);
        assertEquals(null, THIS.getClientId()); // jtest_unverified
        assertEquals(null, THIS.getPlatform()); // jtest_unverified
        assertEquals(null, THIS.getServerVersion()); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: PafServerAck(java.lang.String,java.lang.String,java.lang.String)
     * @throws Throwable Tests may throw any Throwable
     * @see PafServerAck#PafServerAck(java.lang.String,java.lang.String,java.lang.String)
     * @author Parasoft Jtest 8.0
     */
    public void testPafServerAck2() throws Throwable {
        // jtest_tested_method
        PafServerAck THIS = new PafServerAck("", "", "");
        assertEquals("", THIS.getClientId()); // jtest_unverified
        assertEquals("", THIS.getPlatform()); // jtest_unverified
        assertEquals("", THIS.getServerVersion()); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: setClientId(java.lang.String)
     * @throws Throwable Tests may throw any Throwable
     * @see PafServerAck#setClientId(java.lang.String)
     * @author Parasoft Jtest 8.0
     */
    public void testSetClientId1() throws Throwable {
        PafServerAck THIS = new PafServerAck("", "", "");
        // jtest_tested_method
        THIS.setClientId("");
        assertEquals("", THIS.getClientId()); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: setPlatform(java.lang.String)
     * @throws Throwable Tests may throw any Throwable
     * @see PafServerAck#setPlatform(java.lang.String)
     * @author Parasoft Jtest 8.0
     */
    public void testSetPlatform1() throws Throwable {
        PafServerAck THIS = new PafServerAck("", "", "");
        // jtest_tested_method
        THIS.setPlatform("");
        assertEquals("", THIS.getPlatform()); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: setServerVersion(java.lang.String)
     * @throws Throwable Tests may throw any Throwable
     * @see PafServerAck#setServerVersion(java.lang.String)
     * @author Parasoft Jtest 8.0
     */
    public void testSetServerVersion1() throws Throwable {
        PafServerAck THIS = new PafServerAck("", "", "");
        THIS.setClientId("");
        THIS.setPlatform("");
        THIS.setServerVersion("");
        // jtest_tested_method
        THIS.setServerVersion("");
        assertEquals("", THIS.getServerVersion()); // jtest_unverified
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
     * Usage: java com.palladium.paf.server.comm.PafServerAckTest
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
            PafServerAckTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.server.comm.PafServerAck",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return PafServerAck.class;
    }

}

// JTEST_CURRENT_ID=607890838.