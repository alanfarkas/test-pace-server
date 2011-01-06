/*
 * PafDataSliceParmsTest.java
 * Created by Jtest on 9/19/06 5:32:37 PM.
 */

package com.palladium.paf.mdb;

import com.palladium.paf.mdb.PafDataSliceParms;

/**
 * PafDataSliceParmsTest is a unit test class for class PafDataSliceParms.
 * @see com.palladium.paf.mdb.PafDataSliceParms
 * @author Parasoft Jtest 8.0
 */
public class PafDataSliceParmsTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafDataSliceParmsTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getColDimensions()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataSliceParms#getColDimensions()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetColDimensions1() throws Throwable {
		PafDataSliceParms THIS = new PafDataSliceParms();
		// jtest_tested_method
		String[] RETVAL = THIS.getColDimensions();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getColDimensions()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataSliceParms#getColDimensions()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetColDimensions2() throws Throwable {
		PafDataSliceParms THIS = new PafDataSliceParms();
		String[] var1 = new String[] {};
		THIS.setColDimensions(var1);
		String[][] var2 = new String[][] {};
		THIS.setColTuples(var2);
		String[] var3 = new String[] {};
		THIS.setPageDimensions(var3);
		String[] var4 = new String[] {};
		THIS.setPageMembers(var4);
		String[] var5 = new String[] {};
		THIS.setRowDimensions(var5);
		String[][] var6 = new String[][] {};
		THIS.setRowTuples(var6);
		// jtest_tested_method
		String[] RETVAL = THIS.getColDimensions();
		assertEquals(var1, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getColTuples()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataSliceParms#getColTuples()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetColTuples1() throws Throwable {
		PafDataSliceParms THIS = new PafDataSliceParms();
		// jtest_tested_method
		String[][] RETVAL = THIS.getColTuples();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPageDimensions()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataSliceParms#getPageDimensions()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPageDimensions1() throws Throwable {
		PafDataSliceParms THIS = new PafDataSliceParms();
		// jtest_tested_method
		String[] RETVAL = THIS.getPageDimensions();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPageMembers()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataSliceParms#getPageMembers()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPageMembers1() throws Throwable {
		PafDataSliceParms THIS = new PafDataSliceParms();
		// jtest_tested_method
		String[] RETVAL = THIS.getPageMembers();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getRowDimensions()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataSliceParms#getRowDimensions()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRowDimensions1() throws Throwable {
		PafDataSliceParms THIS = new PafDataSliceParms();
		// jtest_tested_method
		String[] RETVAL = THIS.getRowDimensions();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getRowTuples()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataSliceParms#getRowTuples()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRowTuples1() throws Throwable {
		PafDataSliceParms THIS = new PafDataSliceParms();
		// jtest_tested_method
		String[][] RETVAL = THIS.getRowTuples();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafDataSliceParms()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataSliceParms#PafDataSliceParms()
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataSliceParms1() throws Throwable {
		// jtest_tested_method
		PafDataSliceParms THIS = new PafDataSliceParms();
		assertEquals(null, THIS.getColDimensions()); // jtest_unverified
		assertEquals(null, THIS.getColTuples()); // jtest_unverified
		assertEquals(null, THIS.getPageDimensions()); // jtest_unverified
		assertEquals(null, THIS.getPageMembers()); // jtest_unverified
		assertEquals(null, THIS.getRowDimensions()); // jtest_unverified
		assertEquals(null, THIS.getRowTuples()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setColDimensions(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataSliceParms#setColDimensions(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetColDimensions1() throws Throwable {
		PafDataSliceParms THIS = new PafDataSliceParms();
		String[] var1 = new String[] {};
		// jtest_tested_method
		THIS.setColDimensions(var1);
		assertSame(var1, THIS.getColDimensions()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setColTuples(java.lang.String[][])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataSliceParms#setColTuples(java.lang.String[][])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetColTuples1() throws Throwable {
		PafDataSliceParms THIS = new PafDataSliceParms();
		String[][] var1 = new String[][] {};
		// jtest_tested_method
		THIS.setColTuples(var1);
		assertSame(var1, THIS.getColTuples()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setPageDimensions(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataSliceParms#setPageDimensions(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetPageDimensions1() throws Throwable {
		PafDataSliceParms THIS = new PafDataSliceParms();
		String[] var1 = new String[] {};
		// jtest_tested_method
		THIS.setPageDimensions(var1);
		assertSame(var1, THIS.getPageDimensions()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setPageMembers(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataSliceParms#setPageMembers(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetPageMembers1() throws Throwable {
		PafDataSliceParms THIS = new PafDataSliceParms();
		String[] var1 = new String[] {};
		// jtest_tested_method
		THIS.setPageMembers(var1);
		assertSame(var1, THIS.getPageMembers()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setRowDimensions(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataSliceParms#setRowDimensions(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetRowDimensions1() throws Throwable {
		PafDataSliceParms THIS = new PafDataSliceParms();
		String[] var1 = new String[] {};
		// jtest_tested_method
		THIS.setRowDimensions(var1);
		assertSame(var1, THIS.getRowDimensions()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setRowTuples(java.lang.String[][])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataSliceParms#setRowTuples(java.lang.String[][])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetRowTuples1() throws Throwable {
		PafDataSliceParms THIS = new PafDataSliceParms();
		String[][] var1 = new String[][] {};
		// jtest_tested_method
		THIS.setRowTuples(var1);
		assertSame(var1, THIS.getRowTuples()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.mdb.PafDataSliceParmsTest
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
			PafDataSliceParmsTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.mdb.PafDataSliceParms",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafDataSliceParms.class;
	}

}

// JTEST_CURRENT_ID=2121604111.