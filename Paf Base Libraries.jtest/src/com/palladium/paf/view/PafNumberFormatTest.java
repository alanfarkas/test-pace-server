/*
 * PafNumberFormatTest.java
 * Created by Jtest on 9/19/06 5:33:57 PM.
 */

package com.palladium.paf.view;

import com.palladium.paf.view.PafNumberFormat;

/**
 * PafNumberFormatTest is a unit test class for class PafNumberFormat.
 * @see com.palladium.paf.view.PafNumberFormat
 * @author Parasoft Jtest 8.0
 */
public class PafNumberFormatTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafNumberFormatTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: clone()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafNumberFormat#clone()
	 * @author Parasoft Jtest 8.0
	 */
	public void testClone1() throws Throwable {
		PafNumberFormat THIS = new PafNumberFormat((String) null, (String) null);
		// jtest_tested_method
		Object RETVAL = THIS.clone();
		assertTrue(RETVAL instanceof PafNumberFormat); // jtest_unverified
		assertEquals("Name: null, Pattern: null, Default: false", RETVAL
			.toString()); // jtest_unverified
		assertEquals("Name: null, Pattern: null, Default: false", THIS
			.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafNumberFormat#getName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetName1() throws Throwable {
		PafNumberFormat THIS = new PafNumberFormat((String) null, (String) null);
		// jtest_tested_method
		String RETVAL = THIS.getName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafNumberFormat#getName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetName2() throws Throwable {
		PafNumberFormat THIS = new PafNumberFormat((String) null, (String) null);
		THIS.setName("");
		THIS.setPattern("");
		THIS.setDefaultFormat(false);
		// jtest_tested_method
		String RETVAL = THIS.getName();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPattern()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafNumberFormat#getPattern()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPattern1() throws Throwable {
		PafNumberFormat THIS = new PafNumberFormat((String) null, (String) null);
		// jtest_tested_method
		String RETVAL = THIS.getPattern();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPattern()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafNumberFormat#getPattern()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPattern2() throws Throwable {
		PafNumberFormat THIS = new PafNumberFormat("", "");
		THIS.setName("");
		THIS.setPattern("");
		THIS.setDefaultFormat(true);
		// jtest_tested_method
		String RETVAL = THIS.getPattern();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isDefaultFormat()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafNumberFormat#isDefaultFormat()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsDefaultFormat1() throws Throwable {
		PafNumberFormat THIS = new PafNumberFormat((String) null, (String) null);
		// jtest_tested_method
		boolean RETVAL = THIS.isDefaultFormat();
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isDefaultFormat()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafNumberFormat#isDefaultFormat()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsDefaultFormat2() throws Throwable {
		PafNumberFormat THIS = new PafNumberFormat("", "");
		THIS.setName("");
		THIS.setPattern("");
		THIS.setDefaultFormat(true);
		// jtest_tested_method
		boolean RETVAL = THIS.isDefaultFormat();
		assertEquals(true, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafNumberFormat(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafNumberFormat#PafNumberFormat(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafNumberFormat1() throws Throwable {
		// jtest_tested_method
		PafNumberFormat THIS = new PafNumberFormat((String) null, (String) null);
		assertEquals("Name: null, Pattern: null, Default: false", THIS
			.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafNumberFormat()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafNumberFormat#PafNumberFormat()
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafNumberFormat3() throws Throwable {
		// jtest_tested_method
		PafNumberFormat THIS = new PafNumberFormat();
		assertEquals("Name: null, Pattern: null, Default: false", THIS
			.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setDefaultFormat(boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafNumberFormat#setDefaultFormat(boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDefaultFormat1() throws Throwable {
		PafNumberFormat THIS = new PafNumberFormat("", "");
		THIS.setName("");
		THIS.setPattern("");
		THIS.setDefaultFormat(true);
		// jtest_tested_method
		THIS.setDefaultFormat(true);
		assertEquals(true, THIS.isDefaultFormat()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafNumberFormat#setName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetName1() throws Throwable {
		PafNumberFormat THIS = new PafNumberFormat("", "");
		THIS.setName("");
		THIS.setPattern("");
		THIS.setDefaultFormat(true);
		// jtest_tested_method
		THIS.setName("");
		assertEquals("", THIS.getName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setPattern(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafNumberFormat#setPattern(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetPattern1() throws Throwable {
		PafNumberFormat THIS = new PafNumberFormat("", "");
		THIS.setName("");
		THIS.setPattern("");
		THIS.setDefaultFormat(true);
		// jtest_tested_method
		THIS.setPattern("");
		assertEquals("", THIS.getPattern()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: toString()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafNumberFormat#toString()
	 * @author Parasoft Jtest 8.0
	 */
	public void testToString1() throws Throwable {
		PafNumberFormat THIS = new PafNumberFormat((String) null, (String) null);
		// jtest_tested_method
		String RETVAL = THIS.toString();
		assertEquals("Name: null, Pattern: null, Default: false", RETVAL); // jtest_unverified
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
	 * Usage: java com.palladium.paf.view.PafNumberFormatTest
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
			PafNumberFormatTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.view.PafNumberFormat",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafNumberFormat.class;
	}

}

// JTEST_CURRENT_ID=-1175566595.