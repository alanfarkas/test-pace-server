/*
 * EsbOutlineUpdateTest.java
 * Created by Jtest on 9/19/06 5:01:39 PM.
 */

package com.palladium.paf.mdb.essbase;

import com.palladium.paf.mdb.essbase.EsbOutlineUpdate;

/**
 * EsbOutlineUpdateTest is a unit test class for class EsbOutlineUpdate.
 * @see com.palladium.paf.mdb.essbase.EsbOutlineUpdate
 * @author Parasoft Jtest 8.0
 */
public class EsbOutlineUpdateTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public EsbOutlineUpdateTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: CloseOutline()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbOutlineUpdate#CloseOutline()
	 * @author Parasoft Jtest 8.0
	 */
	public void testCloseOutline1() throws Throwable {
		EsbOutlineUpdate THIS = new EsbOutlineUpdate();
		// jtest_tested_method
		THIS.CloseOutline();
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: EsbOutlineUpdate()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbOutlineUpdate#EsbOutlineUpdate()
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbOutlineUpdate1() throws Throwable {
		// jtest_tested_method
		EsbOutlineUpdate THIS = new EsbOutlineUpdate();
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: OpenOutline()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbOutlineUpdate#OpenOutline()
	 * @author Parasoft Jtest 8.0
	 */
	public void testOpenOutline1() throws Throwable {
		EsbOutlineUpdate THIS = new EsbOutlineUpdate();
		// jtest_tested_method
		THIS.OpenOutline();
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: SaveOutline()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbOutlineUpdate#SaveOutline()
	 * @author Parasoft Jtest 8.0
	 */
	public void testSaveOutline1() throws Throwable {
		EsbOutlineUpdate THIS = new EsbOutlineUpdate();
		// jtest_tested_method
		THIS.SaveOutline();
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: UpdateDimension()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbOutlineUpdate#UpdateDimension()
	 * @author Parasoft Jtest 8.0
	 */
	public void testUpdateDimension1() throws Throwable {
		EsbOutlineUpdate THIS = new EsbOutlineUpdate();
		// jtest_tested_method
		THIS.UpdateDimension();
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: VerifyOutline()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbOutlineUpdate#VerifyOutline()
	 * @author Parasoft Jtest 8.0
	 */
	public void testVerifyOutline1() throws Throwable {
		EsbOutlineUpdate THIS = new EsbOutlineUpdate();
		// jtest_tested_method
		THIS.VerifyOutline();
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
	 * Usage: java com.palladium.paf.mdb.essbase.EsbOutlineUpdateTest
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
			EsbOutlineUpdateTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.mdb.essbase.EsbOutlineUpdate",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return EsbOutlineUpdate.class;
	}

}

// JTEST_CURRENT_ID=-1503535432.