/*
 * PafSecurityTokenTest.java
 * Created by Jtest on 9/19/06 5:32:52 PM.
 */

package com.palladium.paf;

import com.palladium.paf.PafSecurityToken;

/**
 * PafSecurityTokenTest is a unit test class for class PafSecurityToken.
 * @see com.palladium.paf.PafSecurityToken
 * @author Parasoft Jtest 8.0
 */
public class PafSecurityTokenTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafSecurityTokenTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getAdmin()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSecurityToken#getAdmin()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAdmin1() throws Throwable {
		PafSecurityToken THIS = new PafSecurityToken(
			(String) null,
			(String) null,
			false);
		// jtest_tested_method
		Boolean RETVAL = THIS.getAdmin();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getAdmin()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSecurityToken#getAdmin()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAdmin2() throws Throwable {
		PafSecurityToken THIS = new PafSecurityToken("", "", true);
		Boolean t1 = new Boolean("");
		THIS.setUserName("");
		THIS.setValid(true);
		THIS.setSessionToken("");
		THIS.setAdmin(t1);
		// jtest_tested_method
		Boolean RETVAL = THIS.getAdmin();
		assertEquals(t1, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getSessionToken()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSecurityToken#getSessionToken()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetSessionToken1() throws Throwable {
		PafSecurityToken THIS = new PafSecurityToken(
			(String) null,
			(String) null,
			false);
		// jtest_tested_method
		String RETVAL = THIS.getSessionToken();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getSessionToken()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSecurityToken#getSessionToken()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetSessionToken2() throws Throwable {
		PafSecurityToken THIS = new PafSecurityToken("", "", true);
		Boolean t1 = new Boolean("");
		THIS.setUserName("");
		THIS.setValid(true);
		THIS.setSessionToken("");
		THIS.setAdmin(t1);
		// jtest_tested_method
		String RETVAL = THIS.getSessionToken();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getUserName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSecurityToken#getUserName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetUserName2() throws Throwable {
		PafSecurityToken THIS = new PafSecurityToken();
		// jtest_tested_method
		String RETVAL = THIS.getUserName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getUserName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSecurityToken#getUserName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetUserName3() throws Throwable {
		PafSecurityToken THIS = new PafSecurityToken(
			(String) null,
			(String) null,
			false);
		Boolean t1 = new Boolean(false);
		THIS.setUserName("");
		THIS.setValid(false);
		THIS.setSessionToken("");
		THIS.setAdmin(t1);
		// jtest_tested_method
		String RETVAL = THIS.getUserName();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isValid()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSecurityToken#isValid()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsValid1() throws Throwable {
		PafSecurityToken THIS = new PafSecurityToken(
			(String) null,
			(String) null,
			false);
		// jtest_tested_method
		boolean RETVAL = THIS.isValid();
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isValid()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSecurityToken#isValid()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsValid2() throws Throwable {
		PafSecurityToken THIS = new PafSecurityToken("", "", true);
		Boolean t1 = new Boolean(true);
		THIS.setUserName("");
		THIS.setValid(true);
		THIS.setSessionToken("");
		THIS.setAdmin(t1);
		// jtest_tested_method
		boolean RETVAL = THIS.isValid();
		assertEquals(true, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafSecurityToken(java.lang.String,java.lang.String,boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSecurityToken#PafSecurityToken(java.lang.String,java.lang.String,boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafSecurityToken1() throws Throwable {
		// jtest_tested_method
		PafSecurityToken THIS = new PafSecurityToken(
			(String) null,
			(String) null,
			false);
		assertEquals(false, THIS.isValid()); // jtest_unverified
		assertEquals(null, THIS.getAdmin()); // jtest_unverified
		assertEquals(null, THIS.getSessionToken()); // jtest_unverified
		assertEquals(null, THIS.getUserName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafSecurityToken(java.lang.String,java.lang.String,boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSecurityToken#PafSecurityToken(java.lang.String,java.lang.String,boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafSecurityToken2() throws Throwable {
		// jtest_tested_method
		PafSecurityToken THIS = new PafSecurityToken("", "", true);
		assertEquals(true, THIS.isValid()); // jtest_unverified
		assertEquals(null, THIS.getAdmin()); // jtest_unverified
		assertEquals("", THIS.getSessionToken()); // jtest_unverified
		assertEquals("", THIS.getUserName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setAdmin(java.lang.Boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSecurityToken#setAdmin(java.lang.Boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetAdmin1() throws Throwable {
		PafSecurityToken THIS = new PafSecurityToken("", "", true);
		Boolean t1 = new Boolean(true);
		Boolean t2 = new Boolean(true);
		THIS.setUserName("");
		THIS.setValid(true);
		THIS.setSessionToken("");
		THIS.setAdmin(t1);
		// jtest_tested_method
		THIS.setAdmin(t2);
		assertEquals(t1, THIS.getAdmin()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setSessionToken(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSecurityToken#setSessionToken(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetSessionToken1() throws Throwable {
		PafSecurityToken THIS = new PafSecurityToken("", "", true);
		Boolean t1 = new Boolean("");
		THIS.setUserName("");
		THIS.setValid(true);
		THIS.setSessionToken("");
		THIS.setAdmin(t1);
		// jtest_tested_method
		THIS.setSessionToken("");
		assertEquals("", THIS.getSessionToken()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setUserName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSecurityToken#setUserName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetUserName1() throws Throwable {
		PafSecurityToken THIS = new PafSecurityToken("", "", true);
		// jtest_tested_method
		THIS.setUserName("");
		assertEquals("", THIS.getUserName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setValid(boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSecurityToken#setValid(boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetValid1() throws Throwable {
		PafSecurityToken THIS = new PafSecurityToken("", "", true);
		// jtest_tested_method
		THIS.setValid(true);
		assertEquals(true, THIS.isValid()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.PafSecurityTokenTest
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
			PafSecurityTokenTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.PafSecurityToken",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafSecurityToken.class;
	}

}

// JTEST_CURRENT_ID=763272598.