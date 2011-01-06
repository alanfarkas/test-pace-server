/*
 * PageTupleTest.java
 * Created by Jtest on 9/19/06 6:04:37 PM.
 */

package com.palladium.paf.view;

import com.palladium.paf.view.PageTuple;

/**
 * PageTupleTest is a unit test class for class PageTuple.
 * @see com.palladium.paf.view.PageTuple
 * @author Parasoft Jtest 8.0
 */
public class PageTupleTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PageTupleTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getAxis()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PageTuple#getAxis()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAxis2() throws Throwable {
		PageTuple THIS = new PageTuple();
		// jtest_tested_method
		String RETVAL = THIS.getAxis();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getAxis()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PageTuple#getAxis()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAxis3() throws Throwable {
		PageTuple THIS = new PageTuple((String) null, (String) null);
		THIS.setAxis("");
		THIS.setMember("");
		// jtest_tested_method
		String RETVAL = THIS.getAxis();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getMember()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PageTuple#getMember()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMember1() throws Throwable {
		PageTuple THIS = new PageTuple((String) null, (String) null);
		// jtest_tested_method
		String RETVAL = THIS.getMember();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getMember()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PageTuple#getMember()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMember2() throws Throwable {
		PageTuple THIS = new PageTuple("", "");
		THIS.setAxis("");
		THIS.setMember("");
		// jtest_tested_method
		String RETVAL = THIS.getMember();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PageTuple(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PageTuple#PageTuple(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPageTuple1() throws Throwable {
		// jtest_tested_method
		PageTuple THIS = new PageTuple((String) null, (String) null);
		assertEquals("PageTuple=> Axis: null, Member: null", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setAxis(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PageTuple#setAxis(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetAxis1() throws Throwable {
		PageTuple THIS = new PageTuple("", "");
		// jtest_tested_method
		THIS.setAxis("");
		assertEquals("", THIS.getAxis()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setMember(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PageTuple#setMember(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetMember1() throws Throwable {
		PageTuple THIS = new PageTuple("", "");
		// jtest_tested_method
		THIS.setMember("");
		assertEquals("", THIS.getMember()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: toString()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PageTuple#toString()
	 * @author Parasoft Jtest 8.0
	 */
	public void testToString1() throws Throwable {
		PageTuple THIS = new PageTuple((String) null, (String) null);
		// jtest_tested_method
		String RETVAL = THIS.toString();
		assertEquals("PageTuple=> Axis: null, Member: null", RETVAL); // jtest_unverified
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
	 * Usage: java com.palladium.paf.view.PageTupleTest
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
			PageTupleTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.view.PageTuple",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PageTuple.class;
	}

}

// JTEST_CURRENT_ID=-258267583.