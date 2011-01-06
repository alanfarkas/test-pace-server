/*
 * SeasonTest.java
 * Created by Jtest on 9/19/06 5:27:04 PM.
 */

package com.palladium.paf.app;

import com.palladium.paf.app.Season;

/**
 * SeasonTest is a unit test class for class Season.
 * @see com.palladium.paf.app.Season
 * @author Parasoft Jtest 8.0
 */
public class SeasonTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public SeasonTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getId()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Season#getId()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetId1() throws Throwable {
		Season THIS = new Season();
		// jtest_tested_method
		String RETVAL = THIS.getId();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getOtherDims()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Season#getOtherDims()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetOtherDims1() throws Throwable {
		Season THIS = new Season();
		// jtest_tested_method
		PafDimSpec[] RETVAL = THIS.getOtherDims();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPlanCycle()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Season#getPlanCycle()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPlanCycle1() throws Throwable {
		Season THIS = new Season();
		// jtest_tested_method
		String RETVAL = THIS.getPlanCycle();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getTimePeriod()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Season#getTimePeriod()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetTimePeriod1() throws Throwable {
		Season THIS = new Season();
		// jtest_tested_method
		String RETVAL = THIS.getTimePeriod();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getYear()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Season#getYear()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetYear1() throws Throwable {
		Season THIS = new Season();
		// jtest_tested_method
		String RETVAL = THIS.getYear();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isOpen()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Season#isOpen()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsOpen1() throws Throwable {
		Season THIS = new Season();
		// jtest_tested_method
		boolean RETVAL = THIS.isOpen();
		assertEquals(true, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isOpen()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Season#isOpen()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsOpen2() throws Throwable {
		Season THIS = new Season();
		THIS.setOpen(false);
		PafDimSpec[] var1 = new PafDimSpec[] {};
		THIS.setOtherDims(var1);
		THIS.setYear("");
		THIS.setId("");
		THIS.setTimePeriod("");
		THIS.setPlanCycle("");
		// jtest_tested_method
		boolean RETVAL = THIS.isOpen();
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: Season()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Season#Season()
	 * @author Parasoft Jtest 8.0
	 */
	public void testSeason1() throws Throwable {
		// jtest_tested_method
		Season THIS = new Season();
		assertEquals(null, THIS.getId()); // jtest_unverified
		assertEquals(true, THIS.isOpen()); // jtest_unverified
		assertEquals(null, THIS.getYear()); // jtest_unverified
		assertEquals(null, THIS.getOtherDims()); // jtest_unverified
		assertEquals(null, THIS.getPlanCycle()); // jtest_unverified
		assertEquals(null, THIS.getTimePeriod()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setId(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Season#setId(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetId1() throws Throwable {
		Season THIS = new Season();
		// jtest_tested_method
		THIS.setId("");
		assertEquals("", THIS.getId()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setOpen(boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Season#setOpen(boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetOpen1() throws Throwable {
		Season THIS = new Season();
		// jtest_tested_method
		THIS.setOpen(true);
		assertEquals(true, THIS.isOpen()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setOtherDims(com.palladium.paf.app.PafDimSpec[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see Season#setOtherDims(com.palladium.paf.app.PafDimSpec[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetOtherDims1() throws Throwable {
		Season THIS = new Season();
		PafDimSpec[] var1 = new PafDimSpec[] {};
		// jtest_tested_method
		THIS.setOtherDims(var1);
		assertSame(var1, THIS.getOtherDims()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setPlanCycle(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Season#setPlanCycle(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetPlanCycle1() throws Throwable {
		Season THIS = new Season();
		// jtest_tested_method
		THIS.setPlanCycle("");
		assertEquals("", THIS.getPlanCycle()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setTimePeriod(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Season#setTimePeriod(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetTimePeriod1() throws Throwable {
		Season THIS = new Season();
		// jtest_tested_method
		THIS.setTimePeriod("");
		assertEquals("", THIS.getTimePeriod()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setYear(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Season#setYear(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetYear1() throws Throwable {
		Season THIS = new Season();
		// jtest_tested_method
		THIS.setYear("");
		assertEquals("", THIS.getYear()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.app.SeasonTest
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
			SeasonTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.app.Season",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return Season.class;
	}

}

// JTEST_CURRENT_ID=-1370194915.