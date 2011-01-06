/*
 * EsbSecurityTest.java
 * Created by Jtest on 9/19/06 4:55:41 PM.
 */

package com.palladium.paf.mdb.essbase;

import com.palladium.paf.mdb.essbase.EsbSecurity;

/**
 * EsbSecurityTest is a unit test class for class EsbSecurity.
 * @see com.palladium.paf.mdb.essbase.EsbSecurity
 * @author Parasoft Jtest 8.0
 */
public class EsbSecurityTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public EsbSecurityTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: EsbSecurity()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbSecurity#EsbSecurity()
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbSecurity1() throws Throwable {
		// jtest_tested_method
		EsbSecurity THIS = new EsbSecurity();
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: Login()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbSecurity#Login()
	 * @author Parasoft Jtest 8.0
	 */
	public void testLogin1() throws Throwable {
		EsbSecurity THIS = new EsbSecurity();
		// jtest_tested_method
		THIS.Login();
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: Logout()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbSecurity#Logout()
	 * @author Parasoft Jtest 8.0
	 */
	public void testLogout1() throws Throwable {
		EsbSecurity THIS = new EsbSecurity();
		// jtest_tested_method
		THIS.Logout();
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: UpdateSecurity()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbSecurity#UpdateSecurity()
	 * @author Parasoft Jtest 8.0
	 */
	public void testUpdateSecurity1() throws Throwable {
		EsbSecurity THIS = new EsbSecurity();
		// jtest_tested_method
		THIS.UpdateSecurity();
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
	 * Usage: java com.palladium.paf.mdb.essbase.EsbSecurityTest
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
			EsbSecurityTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.mdb.essbase.EsbSecurity",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return EsbSecurity.class;
	}

}

// JTEST_CURRENT_ID=-1139763598.