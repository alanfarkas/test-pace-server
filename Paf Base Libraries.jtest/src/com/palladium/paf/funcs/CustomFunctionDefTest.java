/*
 * CustomFunctionDefTest.java
 * Created by Jtest on 9/19/06 5:37:07 PM.
 */

package com.palladium.paf.funcs;

import com.palladium.paf.funcs.CustomFunctionDef;

/**
 * CustomFunctionDefTest is a unit test class for class CustomFunctionDef.
 * @see com.palladium.paf.funcs.CustomFunctionDef
 * @author Parasoft Jtest 8.0
 */
public class CustomFunctionDefTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public CustomFunctionDefTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getClassName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see CustomFunctionDef#getClassName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetClassName1() throws Throwable {
		CustomFunctionDef THIS = new CustomFunctionDef();
		// jtest_tested_method
		String RETVAL = THIS.getClassName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getClassName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see CustomFunctionDef#getClassName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetClassName2() throws Throwable {
		CustomFunctionDef THIS = new CustomFunctionDef();
		THIS.setClassName("");
		THIS.setFunctionName("");
		// jtest_tested_method
		String RETVAL = THIS.getClassName();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getFunctionName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see CustomFunctionDef#getFunctionName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetFunctionName1() throws Throwable {
		CustomFunctionDef THIS = new CustomFunctionDef();
		// jtest_tested_method
		String RETVAL = THIS.getFunctionName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setClassName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see CustomFunctionDef#setClassName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetClassName1() throws Throwable {
		CustomFunctionDef THIS = new CustomFunctionDef();
		// jtest_tested_method
		THIS.setClassName("");
		assertEquals("", THIS.getClassName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setFunctionName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see CustomFunctionDef#setFunctionName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetFunctionName1() throws Throwable {
		CustomFunctionDef THIS = new CustomFunctionDef();
		// jtest_tested_method
		THIS.setFunctionName("");
		assertEquals("", THIS.getFunctionName()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.funcs.CustomFunctionDefTest
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
			CustomFunctionDefTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.funcs.CustomFunctionDef",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return CustomFunctionDef.class;
	}

}

// JTEST_CURRENT_ID=614209934.