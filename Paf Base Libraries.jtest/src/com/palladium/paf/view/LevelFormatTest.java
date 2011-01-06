/*
 * LevelFormatTest.java
 * Created by Jtest on 9/19/06 5:49:57 PM.
 */

package com.palladium.paf.view;

import com.palladium.paf.view.LevelFormat;

/**
 * LevelFormatTest is a unit test class for class LevelFormat.
 * @see com.palladium.paf.view.LevelFormat
 * @author Parasoft Jtest 8.0
 */
public class LevelFormatTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public LevelFormatTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getFormatName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see LevelFormat#getFormatName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetFormatName2() throws Throwable {
		LevelFormat THIS = new LevelFormat();
		// jtest_tested_method
		String RETVAL = THIS.getFormatName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getFormatName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see LevelFormat#getFormatName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetFormatName3() throws Throwable {
		LevelFormat THIS = new LevelFormat((Integer) null, (String) null);
		Integer t1 = new Integer("0");
		THIS.setFormatName("");
		THIS.setLevel(t1);
		// jtest_tested_method
		String RETVAL = THIS.getFormatName();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getLevel()
	 * @throws Throwable Tests may throw any Throwable
	 * @see LevelFormat#getLevel()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLevel1() throws Throwable {
		LevelFormat THIS = new LevelFormat((Integer) null, (String) null);
		// jtest_tested_method
		Integer RETVAL = THIS.getLevel();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getLevel()
	 * @throws Throwable Tests may throw any Throwable
	 * @see LevelFormat#getLevel()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLevel2() throws Throwable {
		Integer t0 = new Integer("0");
		LevelFormat THIS = new LevelFormat(t0, "");
		Integer t2 = new Integer("0");
		THIS.setFormatName("");
		THIS.setLevel(t2);
		// jtest_tested_method
		Integer RETVAL = THIS.getLevel();
		assertEquals(t0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: LevelFormat(java.lang.Integer,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see LevelFormat#LevelFormat(java.lang.Integer,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testLevelFormat1() throws Throwable {
		// jtest_tested_method
		LevelFormat THIS = new LevelFormat((Integer) null, (String) null);
		assertEquals(null, THIS.getFormatName()); // jtest_unverified
		assertEquals(null, THIS.getLevel()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: LevelFormat(java.lang.Integer,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see LevelFormat#LevelFormat(java.lang.Integer,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testLevelFormat2() throws Throwable {
		Integer t0 = new Integer(7);
		// jtest_tested_method
		LevelFormat THIS = new LevelFormat(t0, "");
		assertEquals("", THIS.getFormatName()); // jtest_unverified
		assertEquals(t0, THIS.getLevel()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setFormatName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see LevelFormat#setFormatName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetFormatName1() throws Throwable {
		Integer t0 = new Integer("0");
		LevelFormat THIS = new LevelFormat(t0, "");
		// jtest_tested_method
		THIS.setFormatName("");
		assertEquals("", THIS.getFormatName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setLevel(java.lang.Integer)
	 * @throws Throwable Tests may throw any Throwable
	 * @see LevelFormat#setLevel(java.lang.Integer)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetLevel1() throws Throwable {
		Integer t0 = new Integer("0");
		LevelFormat THIS = new LevelFormat(t0, "");
		Integer t2 = new Integer("0");
		// jtest_tested_method
		THIS.setLevel(t2);
		assertEquals(t0, THIS.getLevel()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.view.LevelFormatTest
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
			LevelFormatTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.view.LevelFormat",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return LevelFormat.class;
	}

}

// JTEST_CURRENT_ID=-1274158409.