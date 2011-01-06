/*
 * PafAuthResponseTest.java
 * Created by Jtest on 9/19/06 5:02:17 PM.
 */

package com.palladium.paf.server.comm;

import com.palladium.paf.app.PafPlannerRole;
import com.palladium.paf.PafSecurityToken;
import com.palladium.paf.app.PafWorkSpec;
import com.palladium.paf.server.comm.PafAuthResponse;

/**
 * PafAuthResponseTest is a unit test class for class PafAuthResponse.
 * @see com.palladium.paf.server.comm.PafAuthResponse
 * @author Parasoft Jtest 8.0
 */
public class PafAuthResponseTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public PafAuthResponseTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }

    /**
     * Test for method: getPlannerRoles()
     * @throws Throwable Tests may throw any Throwable
     * @see PafAuthResponse#getPlannerRoles()
     * @author Parasoft Jtest 8.0
     */
    public void testGetPlannerRoles1() throws Throwable {
        PafAuthResponse THIS = new PafAuthResponse();
        // jtest_tested_method
        PafPlannerRole[] RETVAL = THIS.getPlannerRoles();
        assertEquals(null, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: getSecurityToken()
     * @throws Throwable Tests may throw any Throwable
     * @see PafAuthResponse#getSecurityToken()
     * @author Parasoft Jtest 8.0
     */
    public void testGetSecurityToken1() throws Throwable {
        PafAuthResponse THIS = new PafAuthResponse();
        // jtest_tested_method
        PafSecurityToken RETVAL = THIS.getSecurityToken();
        assertEquals(null, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: getSecurityToken()
     * @throws Throwable Tests may throw any Throwable
     * @see PafAuthResponse#getSecurityToken()
     * @author Parasoft Jtest 8.0
     */
    public void testGetSecurityToken2() throws Throwable {
        PafAuthResponse THIS = new PafAuthResponse();
        PafSecurityToken t1 = new PafSecurityToken((String) null, (String) null, false);
        PafWorkSpec t2 = new PafWorkSpec();
        THIS.setSecurityToken(t1);
        THIS.setWorkSpec(t2);
        PafPlannerRole[] var1 = new PafPlannerRole[] {};
        THIS.setPlannerRoles(var1);
        // jtest_tested_method
        PafSecurityToken RETVAL = THIS.getSecurityToken();
        assertEquals(t1, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: getWorkSpec()
     * @throws Throwable Tests may throw any Throwable
     * @see PafAuthResponse#getWorkSpec()
     * @author Parasoft Jtest 8.0
     */
    public void testGetWorkSpec1() throws Throwable {
        PafAuthResponse THIS = new PafAuthResponse();
        // jtest_tested_method
        PafWorkSpec RETVAL = THIS.getWorkSpec();
        assertEquals(null, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: setPlannerRoles(com.palladium.paf.app.PafPlannerRole[])
     * @throws Throwable Tests may throw any Throwable
     * @see PafAuthResponse#setPlannerRoles(com.palladium.paf.app.PafPlannerRole[])
     * @author Parasoft Jtest 8.0
     */
    public void testSetPlannerRoles1() throws Throwable {
        PafAuthResponse THIS = new PafAuthResponse();
        PafPlannerRole[] var1 = new PafPlannerRole[] {};
        // jtest_tested_method
        THIS.setPlannerRoles(var1);
        assertSame(var1, THIS.getPlannerRoles()); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: setSecurityToken(com.palladium.paf.PafSecurityToken)
     * @throws Throwable Tests may throw any Throwable
     * @see PafAuthResponse#setSecurityToken(com.palladium.paf.PafSecurityToken)
     * @author Parasoft Jtest 8.0
     */
    public void testSetSecurityToken1() throws Throwable {
        PafAuthResponse THIS = new PafAuthResponse();
        PafSecurityToken t1 = new PafSecurityToken("", "", true);
        // jtest_tested_method
        THIS.setSecurityToken(t1);
        assertEquals(t1, THIS.getSecurityToken()); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: setWorkSpec(com.palladium.paf.app.PafWorkSpec)
     * @throws Throwable Tests may throw any Throwable
     * @see PafAuthResponse#setWorkSpec(com.palladium.paf.app.PafWorkSpec)
     * @author Parasoft Jtest 8.0
     */
    public void testSetWorkSpec1() throws Throwable {
        PafAuthResponse THIS = new PafAuthResponse();
        PafWorkSpec t1 = new PafWorkSpec();
        // jtest_tested_method
        THIS.setWorkSpec(t1);
        assertEquals(t1, THIS.getWorkSpec()); // jtest_unverified
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
     * Usage: java com.palladium.paf.server.comm.PafAuthResponseTest
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
            PafAuthResponseTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.server.comm.PafAuthResponse",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return PafAuthResponse.class;
    }

}

// JTEST_CURRENT_ID=1624926262.