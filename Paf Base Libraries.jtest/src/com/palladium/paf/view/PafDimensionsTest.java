/*
 * PafDimensionsTest.java
 * Created by Jtest on 9/19/06 5:58:21 PM.
 */

package com.palladium.paf.view;

import com.palladium.paf.view.PafDimensions;

/**
 * PafDimensionsTest is a unit test class for class PafDimensions.
 * @see com.palladium.paf.view.PafDimensions
 * @author Parasoft Jtest 8.0
 */
public class PafDimensionsTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafDimensionsTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getDimensionName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDimensions#getDimensionName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDimensionName1() throws Throwable {
		PafDimensions THIS = new PafDimensions();
		// jtest_tested_method
		String RETVAL = THIS.getDimensionName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDimensionName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDimensions#getDimensionName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDimensionName2() throws Throwable {
		PafDimensions THIS = new PafDimensions();
		PafDimType t1 = PafDimType.valueOf("TIME");
		THIS.setDimensionName("");
		THIS.setDimensionType(t1);
		String[] var1 = new String[] {};
		THIS.setMembers(var1);
		// jtest_tested_method
		String RETVAL = THIS.getDimensionName();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDimensionType()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDimensions#getDimensionType()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDimensionType1() throws Throwable {
		PafDimensions THIS = new PafDimensions();
		// jtest_tested_method
		PafDimType RETVAL = THIS.getDimensionType();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getMembers()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDimensions#getMembers()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMembers1() throws Throwable {
		PafDimensions THIS = new PafDimensions();
		// jtest_tested_method
		String[] RETVAL = THIS.getMembers();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setDimensionName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDimensions#setDimensionName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDimensionName1() throws Throwable {
		PafDimensions THIS = new PafDimensions();
		// jtest_tested_method
		THIS.setDimensionName("");
		assertEquals("", THIS.getDimensionName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setDimensionType(com.palladium.paf.view.PafDimType)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDimensions#setDimensionType(com.palladium.paf.view.PafDimType)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDimensionType1() throws Throwable {
		PafDimensions THIS = new PafDimensions();
		PafDimType t1 = PafDimType.valueOf("TIME");
		// jtest_tested_method
		THIS.setDimensionType(t1);
		assertEquals(t1, THIS.getDimensionType()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setMembers(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDimensions#setMembers(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetMembers1() throws Throwable {
		PafDimensions THIS = new PafDimensions();
		String[] var1 = new String[] {};
		// jtest_tested_method
		THIS.setMembers(var1);
		assertSame(var1, THIS.getMembers()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.view.PafDimensionsTest
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
			PafDimensionsTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.view.PafDimensions",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafDimensions.class;
	}

}

// JTEST_CURRENT_ID=-935032196.