/*
 * LogUtilTest.java
 * Created by Jtest on 9/19/06 5:33:03 PM.
 * Updated by Jtest on 10/18/06 7:46:22 PM, 1 test case added.
 */

package com.palladium.utility;

import com.palladium.utility.LogUtil;

/**
 * LogUtilTest is a unit test class for class LogUtil.
 * @see com.palladium.utility.LogUtil
 * @author Parasoft Jtest 8.0
 */
public class LogUtilTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public LogUtilTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: static timedStep(java.lang.String,long)
	 * @throws Throwable Tests may throw any Throwable
	 * @see LogUtil#timedStep(java.lang.String,long)
	 * @author Parasoft Jtest 8.0
	 */
	public void testTimedStep1() throws Throwable {
		// jtest_tested_method
		String RETVAL = LogUtil.timedStep((String) null, 0L);
		assertEquals("null completed in 1158705186360 ms", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static timedStep(java.lang.String,long)
	 * @throws Throwable Tests may throw any Throwable
	 * @see LogUtil#timedStep(java.lang.String,long)
	 * @author Parasoft Jtest 8.0
	 */
	public void testTimedStep3() throws Throwable {
		// jtest_tested_method
		String RETVAL = LogUtil.timedStep("", 7L);
		assertEquals(" completed in 1161218782278 ms", RETVAL); // jtest_unverified
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
	 * Usage: java com.palladium.utility.LogUtilTest
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
			LogUtilTest.class,
			// fully qualified name of the tested class
			"com.palladium.utility.LogUtil",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return LogUtil.class;
	}

}

// JTEST_CURRENT_ID=1277458456.