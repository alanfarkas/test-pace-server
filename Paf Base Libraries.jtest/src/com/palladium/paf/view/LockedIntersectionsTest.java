/*
 * LockedIntersectionsTest.java
 * Created by Jtest on 9/19/06 5:33:43 PM.
 */

package com.palladium.paf.view;

import com.palladium.paf.view.LockedIntersections;

/**
 * LockedIntersectionsTest is a unit test class for class LockedIntersections.
 * @see com.palladium.paf.view.LockedIntersections
 * @author Parasoft Jtest 8.0
 */
public class LockedIntersectionsTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public LockedIntersectionsTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getColIndexs()
	 * @throws Throwable Tests may throw any Throwable
	 * @see LockedIntersections#getColIndexs()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetColIndexs1() throws Throwable {
		LockedIntersections THIS = new LockedIntersections();
		// jtest_tested_method
		int[] RETVAL = THIS.getColIndexs();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getColIndexs()
	 * @throws Throwable Tests may throw any Throwable
	 * @see LockedIntersections#getColIndexs()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetColIndexs2() throws Throwable {
		LockedIntersections THIS = new LockedIntersections();
		int[] var1 = new int[] {};
		THIS.setColIndexs(var1);
		int[] var2 = new int[] {};
		THIS.setRowIndexs(var2);
		// jtest_tested_method
		int[] RETVAL = THIS.getColIndexs();
		assertEquals(var1, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getRowIndexs()
	 * @throws Throwable Tests may throw any Throwable
	 * @see LockedIntersections#getRowIndexs()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRowIndexs1() throws Throwable {
		LockedIntersections THIS = new LockedIntersections();
		// jtest_tested_method
		int[] RETVAL = THIS.getRowIndexs();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: LockedIntersections()
	 * @throws Throwable Tests may throw any Throwable
	 * @see LockedIntersections#LockedIntersections()
	 * @author Parasoft Jtest 8.0
	 */
	public void testLockedIntersections1() throws Throwable {
		// jtest_tested_method
		LockedIntersections THIS = new LockedIntersections();
		assertEquals(null, THIS.getColIndexs()); // jtest_unverified
		assertEquals(null, THIS.getRowIndexs()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setColIndexs(int[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see LockedIntersections#setColIndexs(int[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetColIndexs1() throws Throwable {
		LockedIntersections THIS = new LockedIntersections();
		int[] var1 = new int[] {};
		// jtest_tested_method
		THIS.setColIndexs(var1);
		assertSame(var1, THIS.getColIndexs()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setRowIndexs(int[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see LockedIntersections#setRowIndexs(int[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetRowIndexs1() throws Throwable {
		LockedIntersections THIS = new LockedIntersections();
		int[] var1 = new int[] {};
		// jtest_tested_method
		THIS.setRowIndexs(var1);
		assertSame(var1, THIS.getRowIndexs()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.view.LockedIntersectionsTest
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
			LockedIntersectionsTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.view.LockedIntersections",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return LockedIntersections.class;
	}

}

// JTEST_CURRENT_ID=-567574260.