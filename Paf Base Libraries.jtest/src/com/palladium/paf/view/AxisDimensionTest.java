/*
 * AxisDimensionTest.java
 * Created by Jtest on 9/19/06 5:47:27 PM.
 */

package com.palladium.paf.view;

import com.palladium.paf.view.AxisDimension;

/**
 * AxisDimensionTest is a unit test class for class AxisDimension.
 * @see com.palladium.paf.view.AxisDimension
 * @author Parasoft Jtest 8.0
 */
public class AxisDimensionTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public AxisDimensionTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getAxis()
	 * @throws Throwable Tests may throw any Throwable
	 * @see AxisDimension#getAxis()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAxis1() throws Throwable {
		AxisDimension THIS = new AxisDimension();
		// jtest_tested_method
		PafAxis RETVAL = THIS.getAxis();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getAxis()
	 * @throws Throwable Tests may throw any Throwable
	 * @see AxisDimension#getAxis()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAxis2() throws Throwable {
		AxisDimension THIS = new AxisDimension();
		PafAxis t1 = new PafAxis(0);
		THIS.setAxis(t1);
		THIS.setDimension("");
		THIS.setOrder(0);
		// jtest_tested_method
		PafAxis RETVAL = THIS.getAxis();
		assertEquals(t1, RETVAL); // jtest_unverified
		assertEquals(2, t1.getPageAxis()); // jtest_unverified
		assertEquals(1, t1.getColAxis()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDimension()
	 * @throws Throwable Tests may throw any Throwable
	 * @see AxisDimension#getDimension()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDimension1() throws Throwable {
		AxisDimension THIS = new AxisDimension();
		// jtest_tested_method
		String RETVAL = THIS.getDimension();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getOrder()
	 * @throws Throwable Tests may throw any Throwable
	 * @see AxisDimension#getOrder()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetOrder1() throws Throwable {
		AxisDimension THIS = new AxisDimension();
		// jtest_tested_method
		int RETVAL = THIS.getOrder();
		assertEquals(0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setAxis(com.palladium.paf.view.PafAxis)
	 * @throws Throwable Tests may throw any Throwable
	 * @see AxisDimension#setAxis(com.palladium.paf.view.PafAxis)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetAxis1() throws Throwable {
		AxisDimension THIS = new AxisDimension();
		PafAxis t1 = new PafAxis(7);
		// jtest_tested_method
		THIS.setAxis(t1);
		assertEquals(t1, THIS.getAxis()); // jtest_unverified
		assertEquals(2, t1.getPageAxis()); // jtest_unverified
		assertEquals(1, t1.getColAxis()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setDimension(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see AxisDimension#setDimension(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDimension1() throws Throwable {
		AxisDimension THIS = new AxisDimension();
		// jtest_tested_method
		THIS.setDimension("");
		assertEquals("", THIS.getDimension()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setOrder(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see AxisDimension#setOrder(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetOrder1() throws Throwable {
		AxisDimension THIS = new AxisDimension();
		// jtest_tested_method
		THIS.setOrder(7);
		assertEquals(7, THIS.getOrder()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.view.AxisDimensionTest
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
			AxisDimensionTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.view.AxisDimension",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return AxisDimension.class;
	}

}

// JTEST_CURRENT_ID=-1856611105.