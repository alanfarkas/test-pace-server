/*
 * PafDimSpecTest.java
 * Created by Jtest on 9/19/06 5:56:53 PM.
 */

package com.palladium.paf.app;

import com.palladium.paf.app.PafDimSpec;

/**
 * PafDimSpecTest is a unit test class for class PafDimSpec.
 * @see com.palladium.paf.app.PafDimSpec
 * @author Parasoft Jtest 8.0
 */
public class PafDimSpecTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafDimSpecTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getDimension()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDimSpec#getDimension()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDimension1() throws Throwable {
		PafDimSpec THIS = new PafDimSpec();
		// jtest_tested_method
		String RETVAL = THIS.getDimension();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDimension()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDimSpec#getDimension()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDimension2() throws Throwable {
		PafDimSpec THIS = new PafDimSpec();
		THIS.setDimension("");
		String[] var1 = new String[] {};
		THIS.setExpressionList(var1);
		THIS.setSelectable(false);
		// jtest_tested_method
		String RETVAL = THIS.getDimension();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getExpressionList()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDimSpec#getExpressionList()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetExpressionList1() throws Throwable {
		PafDimSpec THIS = new PafDimSpec();
		// jtest_tested_method
		String[] RETVAL = THIS.getExpressionList();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isSelectable()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDimSpec#isSelectable()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsSelectable1() throws Throwable {
		PafDimSpec THIS = new PafDimSpec();
		// jtest_tested_method
		boolean RETVAL = THIS.isSelectable();
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setDimension(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDimSpec#setDimension(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDimension1() throws Throwable {
		PafDimSpec THIS = new PafDimSpec();
		// jtest_tested_method
		THIS.setDimension("");
		assertEquals("", THIS.getDimension()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setExpressionList(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDimSpec#setExpressionList(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetExpressionList1() throws Throwable {
		PafDimSpec THIS = new PafDimSpec();
		String[] var1 = new String[] {};
		// jtest_tested_method
		THIS.setExpressionList(var1);
		assertSame(var1, THIS.getExpressionList()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setSelectable(boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDimSpec#setSelectable(boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetSelectable1() throws Throwable {
		PafDimSpec THIS = new PafDimSpec();
		// jtest_tested_method
		THIS.setSelectable(true);
		assertEquals(true, THIS.isSelectable()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.app.PafDimSpecTest
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
			PafDimSpecTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.app.PafDimSpec",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafDimSpec.class;
	}

}

// JTEST_CURRENT_ID=69247683.