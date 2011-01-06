/*
 * NumericMemberFormatTest.java
 * Created by Jtest on 9/19/06 5:27:33 PM.
 */

package com.palladium.paf.view;

import com.palladium.paf.view.NumericMemberFormat;

/**
 * NumericMemberFormatTest is a unit test class for class NumericMemberFormat.
 * @see com.palladium.paf.view.NumericMemberFormat
 * @author Parasoft Jtest 8.0
 */
public class NumericMemberFormatTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public NumericMemberFormatTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getDimensionName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see NumericMemberFormat#getDimensionName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDimensionName1() throws Throwable {
		NumericMemberFormat THIS = new NumericMemberFormat();
		// jtest_tested_method
		String RETVAL = THIS.getDimensionName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getMemberName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see NumericMemberFormat#getMemberName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberName1() throws Throwable {
		NumericMemberFormat THIS = new NumericMemberFormat();
		// jtest_tested_method
		String RETVAL = THIS.getMemberName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getMemberName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see NumericMemberFormat#getMemberName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberName2() throws Throwable {
		NumericMemberFormat THIS = new NumericMemberFormat();
		PafNumberFormat t1 = new PafNumberFormat((String) null, (String) null);
		THIS.setMemberName("");
		THIS.setNumberFormat(t1);
		THIS.setDimensionName("");
		// jtest_tested_method
		String RETVAL = THIS.getMemberName();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getNumberFormat()
	 * @throws Throwable Tests may throw any Throwable
	 * @see NumericMemberFormat#getNumberFormat()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetNumberFormat1() throws Throwable {
		NumericMemberFormat THIS = new NumericMemberFormat();
		// jtest_tested_method
		PafNumberFormat RETVAL = THIS.getNumberFormat();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setDimensionName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see NumericMemberFormat#setDimensionName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDimensionName1() throws Throwable {
		NumericMemberFormat THIS = new NumericMemberFormat();
		// jtest_tested_method
		THIS.setDimensionName("");
		assertEquals("", THIS.getDimensionName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setMemberName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see NumericMemberFormat#setMemberName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetMemberName1() throws Throwable {
		NumericMemberFormat THIS = new NumericMemberFormat();
		// jtest_tested_method
		THIS.setMemberName("");
		assertEquals("", THIS.getMemberName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setNumberFormat(com.palladium.paf.view.PafNumberFormat)
	 * @throws Throwable Tests may throw any Throwable
	 * @see NumericMemberFormat#setNumberFormat(com.palladium.paf.view.PafNumberFormat)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetNumberFormat1() throws Throwable {
		NumericMemberFormat THIS = new NumericMemberFormat();
		PafNumberFormat t1 = new PafNumberFormat("", "");
		// jtest_tested_method
		THIS.setNumberFormat(t1);
		assertEquals(t1, THIS.getNumberFormat()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.view.NumericMemberFormatTest
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
			NumericMemberFormatTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.view.NumericMemberFormat",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return NumericMemberFormat.class;
	}

}

// JTEST_CURRENT_ID=-1816033351.