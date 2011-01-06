/*
 * InvalidUserNameExceptionTest.java
 * Created by Jtest on 9/19/06 5:49:50 PM.
 */

package com.palladium.paf;

import com.palladium.paf.InvalidUserNameException;

/**
 * InvalidUserNameExceptionTest is a unit test class for class InvalidUserNameException.
 * @see com.palladium.paf.InvalidUserNameException
 * @author Parasoft Jtest 8.0
 */
public class InvalidUserNameExceptionTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public InvalidUserNameExceptionTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: InvalidUserNameException()
	 * @throws Throwable Tests may throw any Throwable
	 * @see InvalidUserNameException#InvalidUserNameException()
	 * @author Parasoft Jtest 8.0
	 */
	public void testInvalidUserNameException1() throws Throwable {
		// jtest_tested_method
		InvalidUserNameException THIS = new InvalidUserNameException();
		assertEquals("com.palladium.paf.InvalidUserNameException", THIS
			.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: InvalidUserNameException(java.lang.String,com.palladium.paf.PafErrSeverity,java.lang.Throwable)
	 * @throws Throwable Tests may throw any Throwable
	 * @see InvalidUserNameException#InvalidUserNameException(java.lang.String,com.palladium.paf.PafErrSeverity,java.lang.Throwable)
	 * @author Parasoft Jtest 8.0
	 */
	public void testInvalidUserNameException2() throws Throwable {
		// jtest_tested_method
		InvalidUserNameException THIS = new InvalidUserNameException(
			(String) null,
			(PafErrSeverity) null,
			(Throwable) null);
		assertEquals("com.palladium.paf.InvalidUserNameException", THIS
			.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: InvalidUserNameException(java.lang.Throwable)
	 * @throws Throwable Tests may throw any Throwable
	 * @see InvalidUserNameException#InvalidUserNameException(java.lang.Throwable)
	 * @author Parasoft Jtest 8.0
	 */
	public void testInvalidUserNameException4() throws Throwable {
		// jtest_tested_method
		InvalidUserNameException THIS = new InvalidUserNameException(
			(Throwable) null);
		assertEquals("com.palladium.paf.InvalidUserNameException", THIS
			.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: InvalidUserNameException(java.lang.String,com.palladium.paf.PafErrSeverity)
	 * @throws Throwable Tests may throw any Throwable
	 * @see InvalidUserNameException#InvalidUserNameException(java.lang.String,com.palladium.paf.PafErrSeverity)
	 * @author Parasoft Jtest 8.0
	 */
	public void testInvalidUserNameException6() throws Throwable {
		// jtest_tested_method
		InvalidUserNameException THIS = new InvalidUserNameException(
			(String) null,
			(PafErrSeverity) null);
		assertEquals("com.palladium.paf.InvalidUserNameException", THIS
			.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: InvalidUserNameException(java.lang.String,java.lang.Throwable)
	 * @throws Throwable Tests may throw any Throwable
	 * @see InvalidUserNameException#InvalidUserNameException(java.lang.String,java.lang.Throwable)
	 * @author Parasoft Jtest 8.0
	 */
	public void testInvalidUserNameException8() throws Throwable {
		// jtest_tested_method
		InvalidUserNameException THIS = new InvalidUserNameException(
			(String) null,
			(Throwable) null);
		assertEquals("com.palladium.paf.InvalidUserNameException", THIS
			.toString()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.InvalidUserNameExceptionTest
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
			InvalidUserNameExceptionTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.InvalidUserNameException",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return InvalidUserNameException.class;
	}

}

// JTEST_CURRENT_ID=-600674994.