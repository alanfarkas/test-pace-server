/*
 * ServerSettingsTest.java
 * Created by Jtest on 9/19/06 11:38:49 AM.
 */

package com.palladium.paf.server;

import com.palladium.paf.server.ServerSettings;

/**
 * ServerSettingsTest is a unit test class for class ServerSettings.
 * @see com.palladium.paf.server.ServerSettings
 * @author Parasoft Jtest 8.0
 */
public class ServerSettingsTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public ServerSettingsTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }

    /**
     * Test for method: getCalcScriptTimeout()
     * @throws Throwable Tests may throw any Throwable
     * @see ServerSettings#getCalcScriptTimeout()
     * @author Parasoft Jtest 8.0
     */
    public void testGetCalcScriptTimeout1() throws Throwable {
        ServerSettings THIS = new ServerSettings();
        // jtest_tested_method
        String RETVAL = THIS.getCalcScriptTimeout();
        assertEquals(null, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: getPafSecurityBootupPassword()
     * @throws Throwable Tests may throw any Throwable
     * @see ServerSettings#getPafSecurityBootupPassword()
     * @author Parasoft Jtest 8.0
     */
    public void testGetPafSecurityBootupPassword1() throws Throwable {
        ServerSettings THIS = new ServerSettings();
        // jtest_tested_method
        String RETVAL = THIS.getPafSecurityBootupPassword();
        assertEquals(null, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: getPafSecurityPassword()
     * @throws Throwable Tests may throw any Throwable
     * @see ServerSettings#getPafSecurityPassword()
     * @author Parasoft Jtest 8.0
     */
    public void testGetPafSecurityPassword1() throws Throwable {
        ServerSettings THIS = new ServerSettings();
        // jtest_tested_method
        String RETVAL = THIS.getPafSecurityPassword();
        assertEquals(null, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: getPafSecurityUser()
     * @throws Throwable Tests may throw any Throwable
     * @see ServerSettings#getPafSecurityUser()
     * @author Parasoft Jtest 8.0
     */
    public void testGetPafSecurityUser1() throws Throwable {
        ServerSettings THIS = new ServerSettings();
        // jtest_tested_method
        String RETVAL = THIS.getPafSecurityUser();
        assertEquals(null, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: getPafServerHome()
     * @throws Throwable Tests may throw any Throwable
     * @see ServerSettings#getPafServerHome()
     * @author Parasoft Jtest 8.0
     */
    public void testGetPafServerHome1() throws Throwable {
        ServerSettings THIS = new ServerSettings();
        // jtest_tested_method
        String RETVAL = THIS.getPafServerHome();
        assertEquals("C:\\Program Files\\Palladium\\PafServer", RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: isChangedCellLogging()
     * @throws Throwable Tests may throw any Throwable
     * @see ServerSettings#isChangedCellLogging()
     * @author Parasoft Jtest 8.0
     */
    public void testIsChangedCellLogging1() throws Throwable {
        ServerSettings THIS = new ServerSettings();
        // jtest_tested_method
        boolean RETVAL = THIS.isChangedCellLogging();
        assertEquals(false, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: isClearOutlineCache()
     * @throws Throwable Tests may throw any Throwable
     * @see ServerSettings#isClearOutlineCache()
     * @author Parasoft Jtest 8.0
     */
    public void testIsClearOutlineCache1() throws Throwable {
        ServerSettings THIS = new ServerSettings();
        // jtest_tested_method
        boolean RETVAL = THIS.isClearOutlineCache();
        assertEquals(false, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: isClearOutlineCache()
     * @throws Throwable Tests may throw any Throwable
     * @see ServerSettings#isClearOutlineCache()
     * @author Parasoft Jtest 8.0
     */
    public void testIsClearOutlineCache3() throws Throwable {
        ServerSettings THIS = new ServerSettings();
        THIS.setClearOutlineCache(true);
        THIS.setDebugMode(true);
        THIS.setEvaluationStepLogging(true);
        THIS.setPafSecurityBootupPassword("");
        THIS.setPafSecurityPassword("");
        THIS.setPafSecurityUser("");
        THIS.setCalcScriptTimeout("");
        THIS.setChangedCellLogging(true);
        // jtest_tested_method
        boolean RETVAL = THIS.isClearOutlineCache();
        assertEquals(true, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: isDebugMode()
     * @throws Throwable Tests may throw any Throwable
     * @see ServerSettings#isDebugMode()
     * @author Parasoft Jtest 8.0
     */
    public void testIsDebugMode1() throws Throwable {
        ServerSettings THIS = new ServerSettings();
        // jtest_tested_method
        boolean RETVAL = THIS.isDebugMode();
        assertEquals(true, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: isEvaluationStepLogging()
     * @throws Throwable Tests may throw any Throwable
     * @see ServerSettings#isEvaluationStepLogging()
     * @author Parasoft Jtest 8.0
     */
    public void testIsEvaluationStepLogging1() throws Throwable {
        ServerSettings THIS = new ServerSettings();
        // jtest_tested_method
        boolean RETVAL = THIS.isEvaluationStepLogging();
        assertEquals(false, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: ServerSettings()
     * @throws Throwable Tests may throw any Throwable
     * @see ServerSettings#ServerSettings()
     * @author Parasoft Jtest 8.0
     */
    public void testServerSettings1() throws Throwable {
        // jtest_tested_method
        ServerSettings THIS = new ServerSettings();
        assertEquals(null, THIS.getCalcScriptTimeout()); // jtest_unverified
        assertEquals(null, THIS.getPafSecurityBootupPassword()); // jtest_unverified
        assertEquals(null, THIS.getPafSecurityPassword()); // jtest_unverified
        assertEquals(null, THIS.getPafSecurityUser()); // jtest_unverified
        assertEquals("C:\\Program Files\\Palladium\\PafServer", THIS.getPafServerHome()); // jtest_unverified
        assertEquals(false, THIS.isChangedCellLogging()); // jtest_unverified
        assertEquals(false, THIS.isClearOutlineCache()); // jtest_unverified
        assertEquals(true, THIS.isDebugMode()); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: setCalcScriptTimeout(java.lang.String)
     * @throws Throwable Tests may throw any Throwable
     * @see ServerSettings#setCalcScriptTimeout(java.lang.String)
     * @author Parasoft Jtest 8.0
     */
    public void testSetCalcScriptTimeout1() throws Throwable {
        ServerSettings THIS = new ServerSettings();
        // jtest_tested_method
        THIS.setCalcScriptTimeout("");
        assertEquals("", THIS.getCalcScriptTimeout()); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: setChangedCellLogging(boolean)
     * @throws Throwable Tests may throw any Throwable
     * @see ServerSettings#setChangedCellLogging(boolean)
     * @author Parasoft Jtest 8.0
     */
    public void testSetChangedCellLogging1() throws Throwable {
        ServerSettings THIS = new ServerSettings();
        // jtest_tested_method
        THIS.setChangedCellLogging(true);
        assertEquals(true, THIS.isChangedCellLogging()); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: setClearOutlineCache(boolean)
     * @throws Throwable Tests may throw any Throwable
     * @see ServerSettings#setClearOutlineCache(boolean)
     * @author Parasoft Jtest 8.0
     */
    public void testSetClearOutlineCache1() throws Throwable {
        ServerSettings THIS = new ServerSettings();
        // jtest_tested_method
        THIS.setClearOutlineCache(true);
        assertEquals(true, THIS.isClearOutlineCache()); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: setDebugMode(boolean)
     * @throws Throwable Tests may throw any Throwable
     * @see ServerSettings#setDebugMode(boolean)
     * @author Parasoft Jtest 8.0
     */
    public void testSetDebugMode1() throws Throwable {
        ServerSettings THIS = new ServerSettings();
        // jtest_tested_method
        THIS.setDebugMode(true);
        assertEquals(true, THIS.isDebugMode()); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: setEvaluationStepLogging(boolean)
     * @throws Throwable Tests may throw any Throwable
     * @see ServerSettings#setEvaluationStepLogging(boolean)
     * @author Parasoft Jtest 8.0
     */
    public void testSetEvaluationStepLogging1() throws Throwable {
        ServerSettings THIS = new ServerSettings();
        // jtest_tested_method
        THIS.setEvaluationStepLogging(true);
        assertEquals(true, THIS.isEvaluationStepLogging()); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: setPafSecurityBootupPassword(java.lang.String)
     * @throws Throwable Tests may throw any Throwable
     * @see ServerSettings#setPafSecurityBootupPassword(java.lang.String)
     * @author Parasoft Jtest 8.0
     */
    public void testSetPafSecurityBootupPassword1() throws Throwable {
        ServerSettings THIS = new ServerSettings();
        // jtest_tested_method
        THIS.setPafSecurityBootupPassword("");
        assertEquals("", THIS.getPafSecurityBootupPassword()); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: setPafSecurityPassword(java.lang.String)
     * @throws Throwable Tests may throw any Throwable
     * @see ServerSettings#setPafSecurityPassword(java.lang.String)
     * @author Parasoft Jtest 8.0
     */
    public void testSetPafSecurityPassword1() throws Throwable {
        ServerSettings THIS = new ServerSettings();
        // jtest_tested_method
        THIS.setPafSecurityPassword("");
        assertEquals("", THIS.getPafSecurityPassword()); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: setPafSecurityUser(java.lang.String)
     * @throws Throwable Tests may throw any Throwable
     * @see ServerSettings#setPafSecurityUser(java.lang.String)
     * @author Parasoft Jtest 8.0
     */
    public void testSetPafSecurityUser1() throws Throwable {
        ServerSettings THIS = new ServerSettings();
        // jtest_tested_method
        THIS.setPafSecurityUser("");
        assertEquals("", THIS.getPafSecurityUser()); // jtest_unverified
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
     * Usage: java com.palladium.paf.server.ServerSettingsTest
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
            ServerSettingsTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.server.ServerSettings",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return ServerSettings.class;
    }

}

// JTEST_CURRENT_ID=-622747357.