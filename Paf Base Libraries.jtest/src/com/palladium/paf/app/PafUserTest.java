/*
 * PafUserTest.java
 * Created by Jtest on 9/19/06 5:50:25 PM.
 */

package com.palladium.paf.app;

import jtest.Stubs;
import java.util.LinkedHashMap;
import com.palladium.paf.app.PafUser;

/**
 * PafUserTest is a unit test class for class PafUser.
 * @see com.palladium.paf.app.PafUser
 * @author Parasoft Jtest 8.0
 */
public class PafUserTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafUserTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getAdmin()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafUser#getAdmin()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAdmin1() throws Throwable {
		PafUser THIS = new PafUser();
		// jtest_tested_method
		Boolean RETVAL = THIS.getAdmin();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getRoleFilters()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafUser#getRoleFilters()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRoleFilters1() throws Throwable {
		PafUser THIS = new PafUser();
		// jtest_tested_method
		LinkedHashMap RETVAL = THIS.getRoleFilters();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("{}", RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getRoleFilters()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafUser#getRoleFilters()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRoleFilters2() throws Throwable {
		PafUser THIS = new PafUser();
		Boolean t1 = new Boolean(false);
		LinkedHashMap var1 = (LinkedHashMap) Stubs
			.makeStubObject(LinkedHashMap.class);
		THIS.setRoleFilters(var1);
		THIS.setUserName("");
		THIS.setAdmin(t1);
		// jtest_tested_method
		LinkedHashMap RETVAL = THIS.getRoleFilters();
		assertSame(var1, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getRoleNames()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafUser#getRoleNames()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRoleNames1() throws Throwable {
		PafUser THIS = new PafUser();
		// jtest_tested_method
		String[] RETVAL = THIS.getRoleNames();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0, RETVAL.length); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getUserName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafUser#getUserName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetUserName1() throws Throwable {
		PafUser THIS = new PafUser();
		// jtest_tested_method
		String RETVAL = THIS.getUserName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafUser()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafUser#PafUser()
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafUser1() throws Throwable {
		// jtest_tested_method
		PafUser THIS = new PafUser();
		assertEquals(null, THIS.getAdmin()); // jtest_unverified
		assertNotNull(THIS.getRoleFilters()); // jtest_unverified
		assertEquals("{}", THIS.getRoleFilters().toString()); // jtest_unverified
		assertNotNull(THIS.getRoleNames()); // jtest_unverified
		assertEquals(0, THIS.getRoleNames().length); // jtest_unverified
		assertEquals(null, THIS.getUserName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setAdmin(java.lang.Boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafUser#setAdmin(java.lang.Boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetAdmin1() throws Throwable {
		PafUser THIS = new PafUser();
		Boolean t1 = new Boolean(true);
		// jtest_tested_method
		THIS.setAdmin(t1);
		assertEquals(t1, THIS.getAdmin()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setRoleFilters(java.util.LinkedHashMap)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafUser#setRoleFilters(java.util.LinkedHashMap)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetRoleFilters1() throws Throwable {
		PafUser THIS = new PafUser();
		LinkedHashMap var1 = (LinkedHashMap) Stubs
			.makeStubObject(LinkedHashMap.class);
		// jtest_tested_method
		THIS.setRoleFilters(var1);
		assertSame(var1, THIS.getRoleFilters()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setUserName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafUser#setUserName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetUserName1() throws Throwable {
		PafUser THIS = new PafUser();
		// jtest_tested_method
		THIS.setUserName("");
		assertEquals("", THIS.getUserName()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.app.PafUserTest
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
			PafUserTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.app.PafUser",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafUser.class;
	}

}

// JTEST_CURRENT_ID=-653212286.