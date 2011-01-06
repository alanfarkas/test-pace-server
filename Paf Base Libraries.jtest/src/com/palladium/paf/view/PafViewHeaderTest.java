/*
 * PafViewHeaderTest.java
 * Created by Jtest on 9/19/06 5:32:44 PM.
 */

package com.palladium.paf.view;

import com.palladium.paf.view.PafViewHeader;

/**
 * PafViewHeaderTest is a unit test class for class PafViewHeader.
 * @see com.palladium.paf.view.PafViewHeader
 * @author Parasoft Jtest 8.0
 */
public class PafViewHeaderTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafViewHeaderTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: clone()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewHeader#clone()
	 * @author Parasoft Jtest 8.0
	 */
	public void testClone1() throws Throwable {
		PafViewHeader THIS = new PafViewHeader();
		// jtest_tested_method
		Object RETVAL = THIS.clone();
		assertTrue(RETVAL instanceof PafViewHeader); // jtest_unverified
		assertEquals("null|null", RETVAL.toString()); // jtest_unverified
		assertEquals("null|null", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getGlobalStyleName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewHeader#getGlobalStyleName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetGlobalStyleName1() throws Throwable {
		PafViewHeader THIS = new PafViewHeader();
		// jtest_tested_method
		String RETVAL = THIS.getGlobalStyleName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getLabel()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewHeader#getLabel()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLabel1() throws Throwable {
		PafViewHeader THIS = new PafViewHeader((String) null, (String) null);
		// jtest_tested_method
		String RETVAL = THIS.getLabel();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getLabel()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewHeader#getLabel()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLabel3() throws Throwable {
		PafViewHeader THIS = new PafViewHeader((String) null, (String) null);
		THIS.setLabel("");
		THIS.setGlobalStyleName("");
		// jtest_tested_method
		String RETVAL = THIS.getLabel();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafViewHeader(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewHeader#PafViewHeader(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafViewHeader1() throws Throwable {
		// jtest_tested_method
		PafViewHeader THIS = new PafViewHeader((String) null);
		assertEquals("null|null", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafViewHeader(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewHeader#PafViewHeader(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafViewHeader3() throws Throwable {
		// jtest_tested_method
		PafViewHeader THIS = new PafViewHeader((String) null, (String) null);
		assertEquals("null|null", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setGlobalStyleName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewHeader#setGlobalStyleName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetGlobalStyleName1() throws Throwable {
		PafViewHeader THIS = new PafViewHeader("", "");
		THIS.setLabel("");
		THIS.setGlobalStyleName("");
		// jtest_tested_method
		THIS.setGlobalStyleName("");
		assertEquals("", THIS.getGlobalStyleName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setLabel(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewHeader#setLabel(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetLabel1() throws Throwable {
		PafViewHeader THIS = new PafViewHeader("", "");
		// jtest_tested_method
		THIS.setLabel("");
		assertEquals("", THIS.getLabel()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: toString()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewHeader#toString()
	 * @author Parasoft Jtest 8.0
	 */
	public void testToString1() throws Throwable {
		PafViewHeader THIS = new PafViewHeader((String) null, (String) null);
		// jtest_tested_method
		String RETVAL = THIS.toString();
		assertEquals("null|null", RETVAL); // jtest_unverified
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
	 * Usage: java com.palladium.paf.view.PafViewHeaderTest
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
			PafViewHeaderTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.view.PafViewHeader",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafViewHeader.class;
	}

}

// JTEST_CURRENT_ID=5882416.