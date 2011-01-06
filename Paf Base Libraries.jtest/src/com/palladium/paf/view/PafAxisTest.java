/*
 * PafAxisTest.java
 * Created by Jtest on 9/19/06 5:57:29 PM.
 */

package com.palladium.paf.view;

import com.palladium.paf.view.PafAxis;

/**
 * PafAxisTest is a unit test class for class PafAxis.
 * @see com.palladium.paf.view.PafAxis
 * @author Parasoft Jtest 8.0
 */
public class PafAxisTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafAxisTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getColAxis()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAxis#getColAxis()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetColAxis1() throws Throwable {
		PafAxis THIS = new PafAxis(0);
		// jtest_tested_method
		int RETVAL = THIS.getColAxis();
		assertEquals(1, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPageAxis()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAxis#getPageAxis()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPageAxis1() throws Throwable {
		PafAxis THIS = new PafAxis(0);
		// jtest_tested_method
		int RETVAL = THIS.getPageAxis();
		assertEquals(2, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getRowAxis()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAxis#getRowAxis()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRowAxis1() throws Throwable {
		PafAxis THIS = new PafAxis(0);
		// jtest_tested_method
		int RETVAL = THIS.getRowAxis();
		assertEquals(0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getValue()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAxis#getValue()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetValue1() throws Throwable {
		PafAxis THIS = new PafAxis(0);
		// jtest_tested_method
		int RETVAL = THIS.getValue();
		assertEquals(0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getValue()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAxis#getValue()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetValue3() throws Throwable {
		PafAxis THIS = new PafAxis(7);
		// jtest_tested_method
		int RETVAL = THIS.getValue();
		assertEquals(7, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafAxis(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAxis#PafAxis(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafAxis1() throws Throwable {
		// jtest_tested_method
		PafAxis THIS = new PafAxis(0);
		assertEquals(0, THIS.getValue()); // jtest_unverified
		assertEquals(1, THIS.getColAxis()); // jtest_unverified
		assertEquals(2, THIS.getPageAxis()); // jtest_unverified
		assertEquals(0, THIS.getRowAxis()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafAxis(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAxis#PafAxis(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafAxis2() throws Throwable {
		// jtest_tested_method
		PafAxis THIS = new PafAxis(7);
		assertEquals(7, THIS.getValue()); // jtest_unverified
		assertEquals(1, THIS.getColAxis()); // jtest_unverified
		assertEquals(2, THIS.getPageAxis()); // jtest_unverified
		assertEquals(0, THIS.getRowAxis()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafAxis()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAxis#PafAxis()
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafAxis3() throws Throwable {
		// jtest_tested_method
		PafAxis THIS = new PafAxis();
		assertEquals(0, THIS.getValue()); // jtest_unverified
		assertEquals(1, THIS.getColAxis()); // jtest_unverified
		assertEquals(2, THIS.getPageAxis()); // jtest_unverified
		assertEquals(0, THIS.getRowAxis()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setColAxis(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAxis#setColAxis(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetColAxis1() throws Throwable {
		PafAxis THIS = new PafAxis(0);
		// jtest_tested_method
		THIS.setColAxis(0);
		assertEquals(1, THIS.getColAxis()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setPageAxis(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAxis#setPageAxis(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetPageAxis1() throws Throwable {
		PafAxis THIS = new PafAxis(0);
		// jtest_tested_method
		THIS.setPageAxis(0);
		assertEquals(2, THIS.getPageAxis()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setRowAxis(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAxis#setRowAxis(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetRowAxis1() throws Throwable {
		PafAxis THIS = new PafAxis(0);
		// jtest_tested_method
		THIS.setRowAxis(0);
		assertEquals(0, THIS.getRowAxis()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setValue(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAxis#setValue(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetValue1() throws Throwable {
		PafAxis THIS = new PafAxis(7);
		THIS.setValue(7);
		// jtest_tested_method
		THIS.setValue(7);
		assertEquals(7, THIS.getValue()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.view.PafAxisTest
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
			PafAxisTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.view.PafAxis",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafAxis.class;
	}

}

// JTEST_CURRENT_ID=48156276.