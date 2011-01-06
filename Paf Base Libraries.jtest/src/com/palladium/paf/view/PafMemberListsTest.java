/*
 * PafMemberListsTest.java
 * Created by Jtest on 9/19/06 5:51:08 PM.
 */

package com.palladium.paf.view;

import com.palladium.paf.view.PafMemberLists;

/**
 * PafMemberListsTest is a unit test class for class PafMemberLists.
 * @see com.palladium.paf.view.PafMemberLists
 * @author Parasoft Jtest 8.0
 */
public class PafMemberListsTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafMemberListsTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getDimensionName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberLists#getDimensionName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDimensionName1() throws Throwable {
		PafMemberLists THIS = new PafMemberLists();
		// jtest_tested_method
		String RETVAL = THIS.getDimensionName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDimensionName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberLists#getDimensionName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDimensionName2() throws Throwable {
		PafMemberLists THIS = new PafMemberLists();
		THIS.setDimensionName("");
		String[] var1 = new String[] {};
		THIS.setMemberList(var1);
		THIS.setMemberName("");
		// jtest_tested_method
		String RETVAL = THIS.getDimensionName();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getMemberList()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberLists#getMemberList()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberList1() throws Throwable {
		PafMemberLists THIS = new PafMemberLists();
		// jtest_tested_method
		String[] RETVAL = THIS.getMemberList();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getMemberName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberLists#getMemberName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberName1() throws Throwable {
		PafMemberLists THIS = new PafMemberLists();
		// jtest_tested_method
		String RETVAL = THIS.getMemberName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setDimensionName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberLists#setDimensionName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDimensionName1() throws Throwable {
		PafMemberLists THIS = new PafMemberLists();
		// jtest_tested_method
		THIS.setDimensionName("");
		assertEquals("", THIS.getDimensionName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setMemberList(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberLists#setMemberList(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetMemberList1() throws Throwable {
		PafMemberLists THIS = new PafMemberLists();
		String[] var1 = new String[] {};
		// jtest_tested_method
		THIS.setMemberList(var1);
		assertSame(var1, THIS.getMemberList()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setMemberName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberLists#setMemberName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetMemberName1() throws Throwable {
		PafMemberLists THIS = new PafMemberLists();
		// jtest_tested_method
		THIS.setMemberName("");
		assertEquals("", THIS.getMemberName()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.view.PafMemberListsTest
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
			PafMemberListsTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.view.PafMemberLists",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafMemberLists.class;
	}

}

// JTEST_CURRENT_ID=873776036.