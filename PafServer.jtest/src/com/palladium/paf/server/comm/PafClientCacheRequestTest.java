/*
 * PafClientCacheRequestTest.java
 * Created by Jtest on 9/19/06 6:23:32 PM.
 * Updated by Jtest on 11/8/06 10:52:05 PM.
 */

package com.palladium.paf.server.comm;

import com.palladium.paf.data.PafSimpleUow;
import com.palladium.paf.server.comm.PafClientCacheRequest;

/**
 * PafClientCacheRequestTest is a unit test class for class PafClientCacheRequest.
 * @see com.palladium.paf.server.comm.PafClientCacheRequest
 * @author Parasoft Jtest 8.0
 */
public class PafClientCacheRequestTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public PafClientCacheRequestTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }

	/**
	 * Test for method: getPafSimpleUow()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientCacheRequest#getPafSimpleUow()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPafSimpleUow1() throws Throwable {
		PafClientCacheRequest THIS = new PafClientCacheRequest();
		// jtest_tested_method
		PafSimpleUow RETVAL = THIS.getPafSimpleUow();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPafSimpleUow()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientCacheRequest#getPafSimpleUow()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPafSimpleUow2() throws Throwable {
		PafClientCacheRequest THIS = new PafClientCacheRequest();
		PafSimpleUow t1 = new PafSimpleUow();
		THIS.setPafSimpleUow(t1);
		// jtest_tested_method
		PafSimpleUow RETVAL = THIS.getPafSimpleUow();
		assertEquals(t1, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setPafSimpleUow(com.palladium.paf.data.PafSimpleUow)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientCacheRequest#setPafSimpleUow(com.palladium.paf.data.PafSimpleUow)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetPafSimpleUow1() throws Throwable {
		PafClientCacheRequest THIS = new PafClientCacheRequest();
		PafSimpleUow t1 = new PafSimpleUow();
		// jtest_tested_method
		THIS.setPafSimpleUow(t1);
		assertEquals(t1, THIS.getPafSimpleUow()); // jtest_unverified
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
     * Usage: java com.palladium.paf.server.comm.PafClientCacheRequestTest
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
            PafClientCacheRequestTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.server.comm.PafClientCacheRequest",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return PafClientCacheRequest.class;
    }

}

// JTEST_CURRENT_ID=487056324.