/*
 * PafSimpleMemberTest.java
 * Created by Jtest on 9/19/06 5:25:59 PM.
 */

package com.palladium.paf.data;

import com.palladium.paf.data.PafSimpleMember;

/**
 * PafSimpleMemberTest is a unit test class for class PafSimpleMember.
 * @see com.palladium.paf.data.PafSimpleMember
 * @author Parasoft Jtest 8.0
 */
public class PafSimpleMemberTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public PafSimpleMemberTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }

    /**
     * Test for method: getAttributes()
     * @throws Throwable Tests may throw any Throwable
     * @see PafSimpleMember#getAttributes()
     * @author Parasoft Jtest 8.0
     */
    public void testGetAttributes1() throws Throwable {
        PafSimpleMember THIS = new PafSimpleMember();
        // jtest_tested_method
        PafSimpleAttributes RETVAL = THIS.getAttributes();
        assertEquals(null, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: getAttributes()
     * @throws Throwable Tests may throw any Throwable
     * @see PafSimpleMember#getAttributes()
     * @author Parasoft Jtest 8.0
     */
    public void testGetAttributes2() throws Throwable {
        PafSimpleMember THIS = new PafSimpleMember();
        PafSimpleAttributes t1 = new PafSimpleAttributes();
        THIS.setAttributes(t1);
        PafSimpleMember[] var1 = new PafSimpleMember[] {};
        THIS.setChildren(var1);
        THIS.setMemberName("");
        // jtest_tested_method
        PafSimpleAttributes RETVAL = THIS.getAttributes();
        assertEquals(t1, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: getChildren()
     * @throws Throwable Tests may throw any Throwable
     * @see PafSimpleMember#getChildren()
     * @author Parasoft Jtest 8.0
     */
    public void testGetChildren1() throws Throwable {
        PafSimpleMember THIS = new PafSimpleMember();
        // jtest_tested_method
        PafSimpleMember[] RETVAL = THIS.getChildren();
        assertEquals(null, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: getMemberName()
     * @throws Throwable Tests may throw any Throwable
     * @see PafSimpleMember#getMemberName()
     * @author Parasoft Jtest 8.0
     */
    public void testGetMemberName1() throws Throwable {
        PafSimpleMember THIS = new PafSimpleMember();
        // jtest_tested_method
        String RETVAL = THIS.getMemberName();
        assertEquals(null, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: setAttributes(com.palladium.paf.data.PafSimpleAttributes)
     * @throws Throwable Tests may throw any Throwable
     * @see PafSimpleMember#setAttributes(com.palladium.paf.data.PafSimpleAttributes)
     * @author Parasoft Jtest 8.0
     */
    public void testSetAttributes1() throws Throwable {
        PafSimpleMember THIS = new PafSimpleMember();
        PafSimpleAttributes t1 = new PafSimpleAttributes();
        // jtest_tested_method
        THIS.setAttributes(t1);
        assertEquals(t1, THIS.getAttributes()); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: setChildren(com.palladium.paf.data.PafSimpleMember[])
     * @throws Throwable Tests may throw any Throwable
     * @see PafSimpleMember#setChildren(com.palladium.paf.data.PafSimpleMember[])
     * @author Parasoft Jtest 8.0
     */
    public void testSetChildren1() throws Throwable {
        PafSimpleMember THIS = new PafSimpleMember();
        PafSimpleMember[] var1 = new PafSimpleMember[] {};
        // jtest_tested_method
        THIS.setChildren(var1);
        assertSame(var1, THIS.getChildren()); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: setMemberName(java.lang.String)
     * @throws Throwable Tests may throw any Throwable
     * @see PafSimpleMember#setMemberName(java.lang.String)
     * @author Parasoft Jtest 8.0
     */
    public void testSetMemberName1() throws Throwable {
        PafSimpleMember THIS = new PafSimpleMember();
        // jtest_tested_method
        THIS.setMemberName("");
        assertEquals("", THIS.getMemberName()); // jtest_unverified
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
     * Usage: java com.palladium.paf.data.PafSimpleMemberTest
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
            PafSimpleMemberTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.data.PafSimpleMember",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return PafSimpleMember.class;
    }

}

// JTEST_CURRENT_ID=-467499402.