/*
 * PafWorkSpecTest.java
 * Created by Jtest on 9/19/06 5:59:12 PM.
 */

package com.palladium.paf.app;

import com.palladium.paf.app.PafWorkSpec;

/**
 * PafWorkSpecTest is a unit test class for class PafWorkSpec.
 * @see com.palladium.paf.app.PafWorkSpec
 * @author Parasoft Jtest 8.0
 */
public class PafWorkSpecTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafWorkSpecTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getDimSpec()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafWorkSpec#getDimSpec()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDimSpec1() throws Throwable {
		PafWorkSpec THIS = new PafWorkSpec();
		// jtest_tested_method
		PafDimSpec[] RETVAL = THIS.getDimSpec();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDimSpec()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafWorkSpec#getDimSpec()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDimSpec2() throws Throwable {
		PafWorkSpec THIS = new PafWorkSpec();
		PafDimSpec[] var1 = new PafDimSpec[] {};
		THIS.setDimSpec(var1);
		THIS.setName("");
		// jtest_tested_method
		PafDimSpec[] RETVAL = THIS.getDimSpec();
		assertEquals(var1, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafWorkSpec#getName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetName1() throws Throwable {
		PafWorkSpec THIS = new PafWorkSpec();
		// jtest_tested_method
		String RETVAL = THIS.getName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setDimSpec(com.palladium.paf.app.PafDimSpec[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafWorkSpec#setDimSpec(com.palladium.paf.app.PafDimSpec[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDimSpec1() throws Throwable {
		PafWorkSpec THIS = new PafWorkSpec();
		PafDimSpec[] var1 = new PafDimSpec[] {};
		// jtest_tested_method
		THIS.setDimSpec(var1);
		assertSame(var1, THIS.getDimSpec()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafWorkSpec#setName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetName1() throws Throwable {
		PafWorkSpec THIS = new PafWorkSpec();
		// jtest_tested_method
		THIS.setName("");
		assertEquals("", THIS.getName()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.app.PafWorkSpecTest
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
			PafWorkSpecTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.app.PafWorkSpec",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafWorkSpec.class;
	}

}

// JTEST_CURRENT_ID=-376566778.