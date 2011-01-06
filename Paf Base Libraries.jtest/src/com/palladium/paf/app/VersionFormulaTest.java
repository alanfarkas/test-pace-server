/*
 * VersionFormulaTest.java
 * Created by Jtest on 9/19/06 5:24:03 PM.
 */

package com.palladium.paf.app;

import com.palladium.paf.app.VersionFormula;

/**
 * VersionFormulaTest is a unit test class for class VersionFormula.
 * @see com.palladium.paf.app.VersionFormula
 * @author Parasoft Jtest 8.0
 */
public class VersionFormulaTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public VersionFormulaTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getBaseVersion()
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionFormula#getBaseVersion()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetBaseVersion2() throws Throwable {
		VersionFormula THIS = new VersionFormula();
		// jtest_tested_method
		String RETVAL = THIS.getBaseVersion();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getBaseVersion()
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionFormula#getBaseVersion()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetBaseVersion3() throws Throwable {
		VersionFormula THIS = new VersionFormula(
			(String) null,
			(String) null,
			(VersionVarianceType) null);
		VersionVarianceType t1 = VersionVarianceType.valueOf("SimpleVariance");
		THIS.setBaseVersion("");
		THIS.setCompareVersion("");
		THIS.setVarianceType(t1);
		// jtest_tested_method
		String RETVAL = THIS.getBaseVersion();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getCompareVersion()
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionFormula#getCompareVersion()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetCompareVersion1() throws Throwable {
		VersionFormula THIS = new VersionFormula(
			(String) null,
			(String) null,
			(VersionVarianceType) null);
		// jtest_tested_method
		String RETVAL = THIS.getCompareVersion();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getCompareVersion()
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionFormula#getCompareVersion()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetCompareVersion2() throws Throwable {
		VersionVarianceType t0 = VersionVarianceType.valueOf("SimpleVariance");
		VersionFormula THIS = new VersionFormula("", "", t0);
		VersionVarianceType t2 = VersionVarianceType.valueOf("SimpleVariance");
		THIS.setBaseVersion("");
		THIS.setCompareVersion("");
		THIS.setVarianceType(t2);
		// jtest_tested_method
		String RETVAL = THIS.getCompareVersion();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getVarianceType()
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionFormula#getVarianceType()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetVarianceType1() throws Throwable {
		VersionFormula THIS = new VersionFormula(
			(String) null,
			(String) null,
			(VersionVarianceType) null);
		// jtest_tested_method
		VersionVarianceType RETVAL = THIS.getVarianceType();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getVarianceType()
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionFormula#getVarianceType()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetVarianceType2() throws Throwable {
		VersionVarianceType t0 = VersionVarianceType.valueOf("SimpleVariance");
		VersionFormula THIS = new VersionFormula("", "", t0);
		VersionVarianceType t2 = VersionVarianceType.valueOf("SimpleVariance");
		THIS.setBaseVersion("");
		THIS.setCompareVersion("");
		THIS.setVarianceType(t2);
		// jtest_tested_method
		VersionVarianceType RETVAL = THIS.getVarianceType();
		assertEquals(t0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setBaseVersion(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionFormula#setBaseVersion(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetBaseVersion1() throws Throwable {
		VersionVarianceType t0 = VersionVarianceType.valueOf("SimpleVariance");
		VersionFormula THIS = new VersionFormula("", "", t0);
		// jtest_tested_method
		THIS.setBaseVersion("");
		assertEquals("", THIS.getBaseVersion()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setCompareVersion(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionFormula#setCompareVersion(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetCompareVersion1() throws Throwable {
		VersionVarianceType t0 = VersionVarianceType.valueOf("SimpleVariance");
		VersionFormula THIS = new VersionFormula("", "", t0);
		// jtest_tested_method
		THIS.setCompareVersion("");
		assertEquals("", THIS.getCompareVersion()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setVarianceType(com.palladium.paf.app.VersionVarianceType)
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionFormula#setVarianceType(com.palladium.paf.app.VersionVarianceType)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetVarianceType1() throws Throwable {
		VersionVarianceType t0 = VersionVarianceType.valueOf("SimpleVariance");
		VersionFormula THIS = new VersionFormula("", "", t0);
		VersionVarianceType t2 = VersionVarianceType.valueOf("SimpleVariance");
		VersionVarianceType t3 = VersionVarianceType.valueOf("SimpleVariance");
		THIS.setBaseVersion("");
		THIS.setCompareVersion("");
		THIS.setVarianceType(t2);
		// jtest_tested_method
		THIS.setVarianceType(t3);
		assertEquals(t0, THIS.getVarianceType()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: VersionFormula(java.lang.String,java.lang.String,com.palladium.paf.app.VersionVarianceType)
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionFormula#VersionFormula(java.lang.String,java.lang.String,com.palladium.paf.app.VersionVarianceType)
	 * @author Parasoft Jtest 8.0
	 */
	public void testVersionFormula1() throws Throwable {
		// jtest_tested_method
		VersionFormula THIS = new VersionFormula(
			(String) null,
			(String) null,
			(VersionVarianceType) null);
		assertEquals(null, THIS.getBaseVersion()); // jtest_unverified
		assertEquals(null, THIS.getCompareVersion()); // jtest_unverified
		assertEquals(null, THIS.getVarianceType()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: VersionFormula(java.lang.String,java.lang.String,com.palladium.paf.app.VersionVarianceType)
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionFormula#VersionFormula(java.lang.String,java.lang.String,com.palladium.paf.app.VersionVarianceType)
	 * @author Parasoft Jtest 8.0
	 */
	public void testVersionFormula2() throws Throwable {
		VersionVarianceType t0 = VersionVarianceType.valueOf("SimpleVariance");
		// jtest_tested_method
		VersionFormula THIS = new VersionFormula("", "", t0);
		assertEquals("", THIS.getBaseVersion()); // jtest_unverified
		assertEquals("", THIS.getCompareVersion()); // jtest_unverified
		assertEquals(t0, THIS.getVarianceType()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.app.VersionFormulaTest
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
			VersionFormulaTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.app.VersionFormula",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return VersionFormula.class;
	}

}

// JTEST_CURRENT_ID=1452839608.