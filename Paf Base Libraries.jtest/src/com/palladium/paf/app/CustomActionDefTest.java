/*
 * CustomActionDefTest.java
 * Created by Jtest on 9/19/06 5:27:50 PM.
 */

package com.palladium.paf.app;

import com.palladium.paf.app.CustomActionDef;

/**
 * CustomActionDefTest is a unit test class for class CustomActionDef.
 * @see com.palladium.paf.app.CustomActionDef
 * @author Parasoft Jtest 8.0
 */
public class CustomActionDefTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public CustomActionDefTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getActionClassName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see CustomActionDef#getActionClassName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetActionClassName1() throws Throwable {
		CustomActionDef THIS = new CustomActionDef();
		// jtest_tested_method
		String RETVAL = THIS.getActionClassName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getActionClassName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see CustomActionDef#getActionClassName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetActionClassName2() throws Throwable {
		CustomActionDef THIS = new CustomActionDef();
		THIS.setActionClassName("");
		String[] var1 = new String[] {};
		THIS.setActionNamedParameters(var1);
		// jtest_tested_method
		String RETVAL = THIS.getActionClassName();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getActionNamedParameters()
	 * @throws Throwable Tests may throw any Throwable
	 * @see CustomActionDef#getActionNamedParameters()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetActionNamedParameters1() throws Throwable {
		CustomActionDef THIS = new CustomActionDef();
		// jtest_tested_method
		String[] RETVAL = THIS.getActionNamedParameters();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setActionClassName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see CustomActionDef#setActionClassName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetActionClassName1() throws Throwable {
		CustomActionDef THIS = new CustomActionDef();
		// jtest_tested_method
		THIS.setActionClassName("");
		assertEquals("", THIS.getActionClassName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setActionNamedParameters(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see CustomActionDef#setActionNamedParameters(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetActionNamedParameters1() throws Throwable {
		CustomActionDef THIS = new CustomActionDef();
		String[] var1 = new String[] {};
		// jtest_tested_method
		THIS.setActionNamedParameters(var1);
		assertSame(var1, THIS.getActionNamedParameters()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.app.CustomActionDefTest
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
			CustomActionDefTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.app.CustomActionDef",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return CustomActionDef.class;
	}

}

// JTEST_CURRENT_ID=227060156.