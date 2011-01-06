/*
 * SimpleCoordListTest.java
 * Created by Jtest on 9/19/06 5:28:00 PM.
 */

package com.palladium.paf.comm;

import com.palladium.paf.comm.SimpleCoordList;

/**
 * SimpleCoordListTest is a unit test class for class SimpleCoordList.
 * @see com.palladium.paf.comm.SimpleCoordList
 * @author Parasoft Jtest 8.0
 */
public class SimpleCoordListTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public SimpleCoordListTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getAxis()
	 * @throws Throwable Tests may throw any Throwable
	 * @see SimpleCoordList#getAxis()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAxis1() throws Throwable {
		SimpleCoordList THIS = new SimpleCoordList();
		// jtest_tested_method
		String[] RETVAL = THIS.getAxis();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getAxis()
	 * @throws Throwable Tests may throw any Throwable
	 * @see SimpleCoordList#getAxis()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAxis2() throws Throwable {
		SimpleCoordList THIS = new SimpleCoordList();
		String[] var1 = new String[] {};
		THIS.setAxis(var1);
		String[] var2 = new String[] {};
		THIS.setCoordinates(var2);
		// jtest_tested_method
		String[] RETVAL = THIS.getAxis();
		assertEquals(var1, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getCoordinates()
	 * @throws Throwable Tests may throw any Throwable
	 * @see SimpleCoordList#getCoordinates()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetCoordinates1() throws Throwable {
		SimpleCoordList THIS = new SimpleCoordList();
		// jtest_tested_method
		String[] RETVAL = THIS.getCoordinates();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setAxis(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see SimpleCoordList#setAxis(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetAxis1() throws Throwable {
		SimpleCoordList THIS = new SimpleCoordList();
		String[] var1 = new String[] {};
		// jtest_tested_method
		THIS.setAxis(var1);
		assertSame(var1, THIS.getAxis()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setCoordinates(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see SimpleCoordList#setCoordinates(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetCoordinates1() throws Throwable {
		SimpleCoordList THIS = new SimpleCoordList();
		String[] var1 = new String[] {};
		// jtest_tested_method
		THIS.setCoordinates(var1);
		assertSame(var1, THIS.getCoordinates()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.comm.SimpleCoordListTest
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
			SimpleCoordListTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.comm.SimpleCoordList",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return SimpleCoordList.class;
	}

}

// JTEST_CURRENT_ID=1212694659.