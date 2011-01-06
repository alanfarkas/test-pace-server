/*
 * DependencySetTest.java
 * Created by Jtest on 9/19/06 5:33:50 PM.
 */

package com.palladium.paf.rules;

import com.palladium.paf.rules.DependencySet;

/**
 * DependencySetTest is a unit test class for class DependencySet.
 * @see com.palladium.paf.rules.DependencySet
 * @author Parasoft Jtest 8.0
 */
public class DependencySetTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public DependencySetTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getDependencyGroup()
	 * @throws Throwable Tests may throw any Throwable
	 * @see DependencySet#getDependencyGroup()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDependencyGroup1() throws Throwable {
		DependencySet THIS = new DependencySet();
		// jtest_tested_method
		DependencyGroup RETVAL = THIS.getDependencyGroup();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDependencyGroup()
	 * @throws Throwable Tests may throw any Throwable
	 * @see DependencySet#getDependencyGroup()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDependencyGroup2() throws Throwable {
		DependencySet THIS = new DependencySet();
		DependencyGroup t1 = new DependencyGroup();
		THIS.setDependencyGroup(t1);
		// jtest_tested_method
		DependencyGroup RETVAL = THIS.getDependencyGroup();
		assertEquals(t1, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setDependencyGroup(com.palladium.paf.rules.DependencyGroup)
	 * @throws Throwable Tests may throw any Throwable
	 * @see DependencySet#setDependencyGroup(com.palladium.paf.rules.DependencyGroup)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDependencyGroup1() throws Throwable {
		DependencySet THIS = new DependencySet();
		DependencyGroup t1 = new DependencyGroup();
		// jtest_tested_method
		THIS.setDependencyGroup(t1);
		assertEquals(t1, THIS.getDependencyGroup()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.rules.DependencySetTest
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
			DependencySetTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.rules.DependencySet",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return DependencySet.class;
	}

}

// JTEST_CURRENT_ID=647668201.