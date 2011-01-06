/*
 * PafSimpleAttributesTest.java
 * Created by Jtest on 9/19/06 6:22:26 PM.
 */

package com.palladium.paf.data;

import com.palladium.paf.data.PafSimpleAttributes;

/**
 * PafSimpleAttributesTest is a unit test class for class PafSimpleAttributes.
 * @see com.palladium.paf.data.PafSimpleAttributes
 * @author Parasoft Jtest 8.0
 */
public class PafSimpleAttributesTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public PafSimpleAttributesTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }

    /**
     * Test for method: getKeys()
     * @throws Throwable Tests may throw any Throwable
     * @see PafSimpleAttributes#getKeys()
     * @author Parasoft Jtest 8.0
     */
    public void testGetKeys1() throws Throwable {
        PafSimpleAttributes THIS = new PafSimpleAttributes();
        // jtest_tested_method
        String[] RETVAL = THIS.getKeys();
        assertEquals(null, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: getKeys()
     * @throws Throwable Tests may throw any Throwable
     * @see PafSimpleAttributes#getKeys()
     * @author Parasoft Jtest 8.0
     */
    public void testGetKeys2() throws Throwable {
        PafSimpleAttributes THIS = new PafSimpleAttributes();
        String[] var1 = new String[] {};
        THIS.setKeys(var1);
        String[] var2 = new String[] {};
        THIS.setValues(var2);
        // jtest_tested_method
        String[] RETVAL = THIS.getKeys();
        assertEquals(var1, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: getValues()
     * @throws Throwable Tests may throw any Throwable
     * @see PafSimpleAttributes#getValues()
     * @author Parasoft Jtest 8.0
     */
    public void testGetValues1() throws Throwable {
        PafSimpleAttributes THIS = new PafSimpleAttributes();
        // jtest_tested_method
        String[] RETVAL = THIS.getValues();
        assertEquals(null, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: setKeys(java.lang.String[])
     * @throws Throwable Tests may throw any Throwable
     * @see PafSimpleAttributes#setKeys(java.lang.String[])
     * @author Parasoft Jtest 8.0
     */
    public void testSetKeys1() throws Throwable {
        PafSimpleAttributes THIS = new PafSimpleAttributes();
        String[] var1 = new String[] {};
        // jtest_tested_method
        THIS.setKeys(var1);
        assertSame(var1, THIS.getKeys()); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: setValues(java.lang.String[])
     * @throws Throwable Tests may throw any Throwable
     * @see PafSimpleAttributes#setValues(java.lang.String[])
     * @author Parasoft Jtest 8.0
     */
    public void testSetValues1() throws Throwable {
        PafSimpleAttributes THIS = new PafSimpleAttributes();
        String[] var1 = new String[] {};
        // jtest_tested_method
        THIS.setValues(var1);
        assertSame(var1, THIS.getValues()); // jtest_unverified
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
     * Usage: java com.palladium.paf.data.PafSimpleAttributesTest
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
            PafSimpleAttributesTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.data.PafSimpleAttributes",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return PafSimpleAttributes.class;
    }

}

// JTEST_CURRENT_ID=-1931250177.