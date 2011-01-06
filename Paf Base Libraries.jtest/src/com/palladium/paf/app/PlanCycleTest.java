/*
 * PlanCycleTest.java
 * Created by Jtest on 9/19/06 5:56:01 PM.
 */

package com.palladium.paf.app;

import com.palladium.paf.app.PlanCycle;

/**
 * PlanCycleTest is a unit test class for class PlanCycle.
 * @see com.palladium.paf.app.PlanCycle
 * @author Parasoft Jtest 8.0
 */
public class PlanCycleTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PlanCycleTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getLabel()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PlanCycle#getLabel()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLabel2() throws Throwable {
		PlanCycle THIS = new PlanCycle();
		// jtest_tested_method
		String RETVAL = THIS.getLabel();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getLabel()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PlanCycle#getLabel()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLabel3() throws Throwable {
		PlanCycle THIS = new PlanCycle((String) null, (String) null);
		THIS.setLabel("");
		THIS.setVersion("");
		// jtest_tested_method
		String RETVAL = THIS.getLabel();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getVersion()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PlanCycle#getVersion()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetVersion1() throws Throwable {
		PlanCycle THIS = new PlanCycle((String) null, (String) null);
		// jtest_tested_method
		String RETVAL = THIS.getVersion();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getVersion()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PlanCycle#getVersion()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetVersion2() throws Throwable {
		PlanCycle THIS = new PlanCycle("", "");
		THIS.setLabel("");
		THIS.setVersion("");
		// jtest_tested_method
		String RETVAL = THIS.getVersion();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PlanCycle(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PlanCycle#PlanCycle(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPlanCycle1() throws Throwable {
		// jtest_tested_method
		PlanCycle THIS = new PlanCycle((String) null, (String) null);
		assertEquals(null, THIS.getVersion()); // jtest_unverified
		assertEquals(null, THIS.getLabel()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PlanCycle(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PlanCycle#PlanCycle(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPlanCycle2() throws Throwable {
		// jtest_tested_method
		PlanCycle THIS = new PlanCycle("", "");
		assertEquals("", THIS.getVersion()); // jtest_unverified
		assertEquals("", THIS.getLabel()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setLabel(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PlanCycle#setLabel(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetLabel1() throws Throwable {
		PlanCycle THIS = new PlanCycle("", "");
		// jtest_tested_method
		THIS.setLabel("");
		assertEquals("", THIS.getLabel()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setVersion(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PlanCycle#setVersion(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetVersion1() throws Throwable {
		PlanCycle THIS = new PlanCycle("", "");
		// jtest_tested_method
		THIS.setVersion("");
		assertEquals("", THIS.getVersion()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.app.PlanCycleTest
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
			PlanCycleTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.app.PlanCycle",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PlanCycle.class;
	}

}

// JTEST_CURRENT_ID=1207952204.