/*
 * ExpOperationTest.java
 * Created by Jtest on 9/19/06 6:11:10 PM.
 * Updated by Jtest on 10/18/06 8:06:48 PM, 2 test cases added, 2 test cases removed.
 * Updated by Jtest on 11/9/06 3:07:40 AM, 2 test cases added, 2 test cases removed.
 */

package com.palladium.paf.data;

import com.palladium.paf.data.ExpOperation;

/**
 * ExpOperationTest is a unit test class for class ExpOperation.
 * @see com.palladium.paf.data.ExpOperation
 * @author Parasoft Jtest 8.0
 */
public class ExpOperationTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public ExpOperationTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: ExpOperation(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ExpOperation#ExpOperation(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExpOperation1() throws Throwable {
		// jtest_tested_method
		ExpOperation THIS = new ExpOperation((String) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.data.ExpOperation.<init>(Ljava/lang/String;)V>
		// at com.palladium.paf.data.ExpOperation.<init>(ExpOperation.java:34)
		// jtest_unverified
	}

	/**
	 * Test for method: ExpOperation(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ExpOperation#ExpOperation(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExpOperation2() throws Throwable {
		// jtest_tested_method
		ExpOperation THIS = new ExpOperation("");
		// IllegalArgumentException thrown
		// at com.palladium.paf.data.ExpOperation.<init>(ExpOperation.java:35)
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
	 * Usage: java com.palladium.paf.data.ExpOperationTest
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
			ExpOperationTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.data.ExpOperation",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return ExpOperation.class;
	}

}

// JTEST_CURRENT_ID=14345929.