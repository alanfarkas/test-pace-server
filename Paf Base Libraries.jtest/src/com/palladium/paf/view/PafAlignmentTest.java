/*
 * PafAlignmentTest.java
 * Created by Jtest on 9/19/06 5:59:33 PM.
 */

package com.palladium.paf.view;

import com.palladium.paf.view.PafAlignment;

/**
 * PafAlignmentTest is a unit test class for class PafAlignment.
 * @see com.palladium.paf.view.PafAlignment
 * @author Parasoft Jtest 8.0
 */
public class PafAlignmentTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafAlignmentTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: clone()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAlignment#clone()
	 * @author Parasoft Jtest 8.0
	 */
	public void testClone1() throws Throwable {
		PafAlignment THIS = new PafAlignment();
		// jtest_tested_method
		Object RETVAL = THIS.clone();
		assertTrue(RETVAL instanceof PafAlignment); // jtest_unverified
		assertEquals("Left", ((PafAlignment) RETVAL).getValue()); // jtest_unverified
		assertEquals("Left", THIS.getValue()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getValue()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAlignment#getValue()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetValue1() throws Throwable {
		PafAlignment THIS = new PafAlignment();
		// jtest_tested_method
		String RETVAL = THIS.getValue();
		assertEquals("Left", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafAlignment()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAlignment#PafAlignment()
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafAlignment1() throws Throwable {
		// jtest_tested_method
		PafAlignment THIS = new PafAlignment();
		assertEquals("Left", THIS.getValue()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setValue(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAlignment#setValue(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetValue1() throws Throwable {
		PafAlignment THIS = new PafAlignment();
		// jtest_tested_method
		THIS.setValue((String) null);
		assertEquals(null, THIS.getValue()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setValue(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAlignment#setValue(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetValue2() throws Throwable {
		PafAlignment THIS = new PafAlignment();
		// jtest_tested_method
		THIS.setValue("");
		assertEquals("", THIS.getValue()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.view.PafAlignmentTest
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
			PafAlignmentTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.view.PafAlignment",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafAlignment.class;
	}

}

// JTEST_CURRENT_ID=-1601490711.