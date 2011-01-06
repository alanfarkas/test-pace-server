/*
 * PafBaseConstantsTest.java
 * Created by Jtest on 9/19/06 5:50:02 PM.
 * Updated by Jtest on 10/18/06 8:00:55 PM.
 */

package com.palladium.paf;

import com.palladium.paf.PafBaseConstants;

/**
 * PafBaseConstantsTest is a unit test class for class PafBaseConstants.
 * @see com.palladium.paf.PafBaseConstants
 * @author Parasoft Jtest 8.0
 */
public class PafBaseConstantsTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafBaseConstantsTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for loading class: PafBaseConstants
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafBaseConstants1() throws Throwable {
		Class.forName(PafBaseConstants.class.getName());
		assertNotNull(PafBaseConstants.AppLocal); // jtest_unverified
		assertEquals("en", PafBaseConstants.AppLocal.toString()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.PafBaseConstantsTest
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
			PafBaseConstantsTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.PafBaseConstants",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafBaseConstants.class;
	}

}

// JTEST_CURRENT_ID=1447764316.