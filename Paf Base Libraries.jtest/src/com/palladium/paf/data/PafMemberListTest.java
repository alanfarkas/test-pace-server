/*
 * PafMemberListTest.java
 * Created by Jtest on 9/19/06 5:57:57 PM.
 */

package com.palladium.paf.data;

import com.palladium.paf.data.PafMemberList;

/**
 * PafMemberListTest is a unit test class for class PafMemberList.
 * @see com.palladium.paf.data.PafMemberList
 * @author Parasoft Jtest 8.0
 */
public class PafMemberListTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafMemberListTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getDimName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberList#getDimName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDimName1() throws Throwable {
		PafMemberList THIS = new PafMemberList();
		// jtest_tested_method
		String RETVAL = THIS.getDimName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDimName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberList#getDimName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDimName2() throws Throwable {
		PafMemberList THIS = new PafMemberList();
		THIS.setDimName("");
		String[] var1 = new String[] {};
		THIS.setMemberNames(var1);
		// jtest_tested_method
		String RETVAL = THIS.getDimName();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getMemberNames()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberList#getMemberNames()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberNames1() throws Throwable {
		PafMemberList THIS = new PafMemberList();
		// jtest_tested_method
		String[] RETVAL = THIS.getMemberNames();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setDimName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberList#setDimName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDimName1() throws Throwable {
		PafMemberList THIS = new PafMemberList();
		// jtest_tested_method
		THIS.setDimName("");
		assertEquals("", THIS.getDimName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setMemberNames(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberList#setMemberNames(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetMemberNames1() throws Throwable {
		PafMemberList THIS = new PafMemberList();
		String[] var1 = new String[] {};
		// jtest_tested_method
		THIS.setMemberNames(var1);
		assertSame(var1, THIS.getMemberNames()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.data.PafMemberListTest
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
			PafMemberListTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.data.PafMemberList",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafMemberList.class;
	}

}

// JTEST_CURRENT_ID=-715358187.