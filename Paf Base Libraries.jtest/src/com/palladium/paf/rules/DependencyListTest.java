/*
 * DependencyListTest.java
 * Created by Jtest on 9/19/06 5:56:27 PM.
 */

package com.palladium.paf.rules;

import com.palladium.paf.rules.DependencyList;

/**
 * DependencyListTest is a unit test class for class DependencyList.
 * @see com.palladium.paf.rules.DependencyList
 * @author Parasoft Jtest 8.0
 */
public class DependencyListTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public DependencyListTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getDependancies()
	 * @throws Throwable Tests may throw any Throwable
	 * @see DependencyList#getDependancies()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDependancies1() throws Throwable {
		DependencyList THIS = new DependencyList();
		// jtest_tested_method
		String[] RETVAL = THIS.getDependancies();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDependancies()
	 * @throws Throwable Tests may throw any Throwable
	 * @see DependencyList#getDependancies()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDependancies2() throws Throwable {
		DependencyList THIS = new DependencyList();
		String[] var1 = new String[] {};
		THIS.setDependancies(var1);
		THIS.setDependantTerm("");
		// jtest_tested_method
		String[] RETVAL = THIS.getDependancies();
		assertEquals(var1, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDependantTerm()
	 * @throws Throwable Tests may throw any Throwable
	 * @see DependencyList#getDependantTerm()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDependantTerm1() throws Throwable {
		DependencyList THIS = new DependencyList();
		// jtest_tested_method
		String RETVAL = THIS.getDependantTerm();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setDependancies(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see DependencyList#setDependancies(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDependancies1() throws Throwable {
		DependencyList THIS = new DependencyList();
		String[] var1 = new String[] {};
		// jtest_tested_method
		THIS.setDependancies(var1);
		assertSame(var1, THIS.getDependancies()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setDependantTerm(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see DependencyList#setDependantTerm(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDependantTerm1() throws Throwable {
		DependencyList THIS = new DependencyList();
		// jtest_tested_method
		THIS.setDependantTerm("");
		assertEquals("", THIS.getDependantTerm()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.rules.DependencyListTest
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
			DependencyListTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.rules.DependencyList",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return DependencyList.class;
	}

}

// JTEST_CURRENT_ID=-616194174.