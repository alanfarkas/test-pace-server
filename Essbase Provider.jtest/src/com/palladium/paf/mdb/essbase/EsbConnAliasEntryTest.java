/*
 * EsbConnAliasEntryTest.java
 * Created by Jtest on 9/19/06 4:59:00 PM.
 */

package com.palladium.paf.mdb.essbase;

import jtest.Repository;
import com.palladium.paf.mdb.essbase.EsbConnAliasEntry;

/**
 * EsbConnAliasEntryTest is a unit test class for class EsbConnAliasEntry.
 * @see com.palladium.paf.mdb.essbase.EsbConnAliasEntry
 * @author Parasoft Jtest 8.0
 */
public class EsbConnAliasEntryTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public EsbConnAliasEntryTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: EsbConnAliasEntry(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnAliasEntry#EsbConnAliasEntry(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbConnAliasEntry1() throws Throwable {
		// jtest_tested_method
		EsbConnAliasEntry THIS = new EsbConnAliasEntry("0");
		assertEquals(null, THIS.getEsbApp()); // jtest_unverified
		assertEquals("0", THIS.getEsbConnAlias()); // jtest_unverified
		assertNotNull(THIS.getEsbConnType()); // jtest_unverified
		assertEquals("PAF_CONN_ESB_CUBE", THIS.getEsbConnType().toString()); // jtest_unverified
		assertEquals(null, THIS.getEsbDb()); // jtest_unverified
		assertEquals(null, THIS.getEsbPswd()); // jtest_unverified
		assertEquals(null, THIS.getEsbServer()); // jtest_unverified
		assertEquals(null, THIS.getEsbUser()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: EsbConnAliasEntry(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnAliasEntry#EsbConnAliasEntry(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbConnAliasEntry2() throws Throwable {
		// jtest_tested_method
		EsbConnAliasEntry THIS = new EsbConnAliasEntry("TitanServer");
		assertEquals(null, THIS.getEsbApp()); // jtest_unverified
		assertEquals("TitanServer", THIS.getEsbConnAlias()); // jtest_unverified
		assertNotNull(THIS.getEsbConnType()); // jtest_unverified
		assertEquals("PAF_CONN_ESB_SERVER", THIS.getEsbConnType().toString()); // jtest_unverified
		assertEquals(null, THIS.getEsbDb()); // jtest_unverified
		assertEquals("password", THIS.getEsbPswd()); // jtest_unverified
		assertEquals("localhost", THIS.getEsbServer()); // jtest_unverified
		assertEquals("system", THIS.getEsbUser()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getEsbApp()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnAliasEntry#getEsbApp()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetEsbApp1() throws Throwable {
		EsbConnAliasEntry THIS = (EsbConnAliasEntry) Repository.getObject(
			EsbConnAliasEntry.class,
			"EsbConnAliasEntry");
		// jtest_tested_method
		String RETVAL = THIS.getEsbApp();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getEsbConnAlias()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnAliasEntry#getEsbConnAlias()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetEsbConnAlias1() throws Throwable {
		EsbConnAliasEntry THIS = (EsbConnAliasEntry) Repository.getObject(
			EsbConnAliasEntry.class,
			"EsbConnAliasEntry");
		// jtest_tested_method
		String RETVAL = THIS.getEsbConnAlias();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getEsbConnType()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnAliasEntry#getEsbConnType()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetEsbConnType1() throws Throwable {
		EsbConnAliasEntry THIS = (EsbConnAliasEntry) Repository.getObject(
			EsbConnAliasEntry.class,
			"EsbConnAliasEntry");
		// jtest_tested_method
		EsbConnType RETVAL = THIS.getEsbConnType();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("PAF_CONN_ESB_CUBE", RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getEsbDb()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnAliasEntry#getEsbDb()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetEsbDb1() throws Throwable {
		EsbConnAliasEntry THIS = (EsbConnAliasEntry) Repository.getObject(
			EsbConnAliasEntry.class,
			"EsbConnAliasEntry");
		// jtest_tested_method
		String RETVAL = THIS.getEsbDb();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getEsbPswd()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnAliasEntry#getEsbPswd()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetEsbPswd1() throws Throwable {
		EsbConnAliasEntry THIS = (EsbConnAliasEntry) Repository.getObject(
			EsbConnAliasEntry.class,
			"EsbConnAliasEntry");
		// jtest_tested_method
		String RETVAL = THIS.getEsbPswd();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getEsbServer()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnAliasEntry#getEsbServer()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetEsbServer1() throws Throwable {
		EsbConnAliasEntry THIS = (EsbConnAliasEntry) Repository.getObject(
			EsbConnAliasEntry.class,
			"EsbConnAliasEntry");
		// jtest_tested_method
		String RETVAL = THIS.getEsbServer();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getEsbUser()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnAliasEntry#getEsbUser()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetEsbUser1() throws Throwable {
		EsbConnAliasEntry THIS = (EsbConnAliasEntry) Repository.getObject(
			EsbConnAliasEntry.class,
			"EsbConnAliasEntry");
		// jtest_tested_method
		String RETVAL = THIS.getEsbUser();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setEsbApp(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnAliasEntry#setEsbApp(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetEsbApp1() throws Throwable {
		EsbConnAliasEntry THIS = (EsbConnAliasEntry) Repository.getObject(
			EsbConnAliasEntry.class,
			"EsbConnAliasEntry");
		// jtest_tested_method
		THIS.setEsbApp("");
		assertEquals("", THIS.getEsbApp()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setEsbConnAlias(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnAliasEntry#setEsbConnAlias(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetEsbConnAlias1() throws Throwable {
		EsbConnAliasEntry THIS = (EsbConnAliasEntry) Repository.getObject(
			EsbConnAliasEntry.class,
			"EsbConnAliasEntry");
		// jtest_tested_method
		THIS.setEsbConnAlias("");
		assertEquals("", THIS.getEsbConnAlias()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setEsbConnType(com.palladium.paf.mdb.essbase.EsbConnType)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnAliasEntry#setEsbConnType(com.palladium.paf.mdb.essbase.EsbConnType)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetEsbConnType1() throws Throwable {
		EsbConnType t1 = EsbConnType.valueOf("PAF_CONN_ESB_SERVER");
		EsbConnAliasEntry THIS = (EsbConnAliasEntry) Repository.getObject(
			EsbConnAliasEntry.class,
			"EsbConnAliasEntry");
		// jtest_tested_method
		THIS.setEsbConnType(t1);
		assertEquals(t1, THIS.getEsbConnType()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setEsbDb(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnAliasEntry#setEsbDb(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetEsbDb1() throws Throwable {
		EsbConnAliasEntry THIS = (EsbConnAliasEntry) Repository.getObject(
			EsbConnAliasEntry.class,
			"EsbConnAliasEntry");
		// jtest_tested_method
		THIS.setEsbDb("");
		assertEquals("", THIS.getEsbDb()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setEsbPswd(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnAliasEntry#setEsbPswd(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetEsbPswd1() throws Throwable {
		EsbConnAliasEntry THIS = (EsbConnAliasEntry) Repository.getObject(
			EsbConnAliasEntry.class,
			"EsbConnAliasEntry");
		// jtest_tested_method
		THIS.setEsbPswd("");
		assertEquals("", THIS.getEsbPswd()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setEsbServer(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnAliasEntry#setEsbServer(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetEsbServer1() throws Throwable {
		EsbConnAliasEntry THIS = (EsbConnAliasEntry) Repository.getObject(
			EsbConnAliasEntry.class,
			"EsbConnAliasEntry");
		// jtest_tested_method
		THIS.setEsbServer("");
		assertEquals("", THIS.getEsbServer()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setEsbUser(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnAliasEntry#setEsbUser(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetEsbUser1() throws Throwable {
		EsbConnAliasEntry THIS = (EsbConnAliasEntry) Repository.getObject(
			EsbConnAliasEntry.class,
			"EsbConnAliasEntry");
		// jtest_tested_method
		THIS.setEsbUser("");
		assertEquals("", THIS.getEsbUser()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.mdb.essbase.EsbConnAliasEntryTest
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
			EsbConnAliasEntryTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.mdb.essbase.EsbConnAliasEntry",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return EsbConnAliasEntry.class;
	}

}

// JTEST_CURRENT_ID=990936280.