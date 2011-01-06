/*
 * PafPlannerRoleTest.java
 * Created by Jtest on 9/19/06 5:27:43 PM.
 */

package com.palladium.paf.app;

import com.palladium.paf.app.PafPlannerRole;

/**
 * PafPlannerRoleTest is a unit test class for class PafPlannerRole.
 * @see com.palladium.paf.app.PafPlannerRole
 * @author Parasoft Jtest 8.0
 */
public class PafPlannerRoleTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafPlannerRoleTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getPlanType()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafPlannerRole#getPlanType()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPlanType1() throws Throwable {
		PafPlannerRole THIS = new PafPlannerRole();
		// jtest_tested_method
		String RETVAL = THIS.getPlanType();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPlanVersion()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafPlannerRole#getPlanVersion()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPlanVersion1() throws Throwable {
		PafPlannerRole THIS = new PafPlannerRole();
		// jtest_tested_method
		String RETVAL = THIS.getPlanVersion();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getRoleDesc()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafPlannerRole#getRoleDesc()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRoleDesc1() throws Throwable {
		PafPlannerRole THIS = new PafPlannerRole();
		// jtest_tested_method
		String RETVAL = THIS.getRoleDesc();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getRoleDesc()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafPlannerRole#getRoleDesc()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRoleDesc2() throws Throwable {
		PafPlannerRole THIS = new PafPlannerRole();
		THIS.setRoleDesc("");
		THIS.setRoleName("");
		THIS.setPlanType("");
		THIS.setPlanVersion("");
		String[] var1 = new String[] {};
		THIS.setSeasonIds(var1);
		// jtest_tested_method
		String RETVAL = THIS.getRoleDesc();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getRoleName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafPlannerRole#getRoleName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRoleName1() throws Throwable {
		PafPlannerRole THIS = new PafPlannerRole();
		// jtest_tested_method
		String RETVAL = THIS.getRoleName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getSeasonIds()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafPlannerRole#getSeasonIds()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetSeasonIds1() throws Throwable {
		PafPlannerRole THIS = new PafPlannerRole();
		// jtest_tested_method
		String[] RETVAL = THIS.getSeasonIds();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafPlannerRole()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafPlannerRole#PafPlannerRole()
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafPlannerRole1() throws Throwable {
		// jtest_tested_method
		PafPlannerRole THIS = new PafPlannerRole();
		assertEquals(null, THIS.getPlanType()); // jtest_unverified
		assertEquals(null, THIS.getPlanVersion()); // jtest_unverified
		assertEquals(null, THIS.getRoleDesc()); // jtest_unverified
		assertEquals(null, THIS.getRoleName()); // jtest_unverified
		assertEquals(null, THIS.getSeasonIds()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setPlanType(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafPlannerRole#setPlanType(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetPlanType1() throws Throwable {
		PafPlannerRole THIS = new PafPlannerRole();
		// jtest_tested_method
		THIS.setPlanType("");
		assertEquals("", THIS.getPlanType()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setPlanVersion(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafPlannerRole#setPlanVersion(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetPlanVersion1() throws Throwable {
		PafPlannerRole THIS = new PafPlannerRole();
		// jtest_tested_method
		THIS.setPlanVersion("");
		assertEquals("", THIS.getPlanVersion()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setRoleDesc(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafPlannerRole#setRoleDesc(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetRoleDesc1() throws Throwable {
		PafPlannerRole THIS = new PafPlannerRole();
		// jtest_tested_method
		THIS.setRoleDesc("");
		assertEquals("", THIS.getRoleDesc()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setRoleName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafPlannerRole#setRoleName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetRoleName1() throws Throwable {
		PafPlannerRole THIS = new PafPlannerRole();
		// jtest_tested_method
		THIS.setRoleName("");
		assertEquals("", THIS.getRoleName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setSeasonIds(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafPlannerRole#setSeasonIds(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetSeasonIds1() throws Throwable {
		PafPlannerRole THIS = new PafPlannerRole();
		String[] var1 = new String[] {};
		// jtest_tested_method
		THIS.setSeasonIds(var1);
		assertSame(var1, THIS.getSeasonIds()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.app.PafPlannerRoleTest
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
			PafPlannerRoleTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.app.PafPlannerRole",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafPlannerRole.class;
	}

}

// JTEST_CURRENT_ID=-1990942456.