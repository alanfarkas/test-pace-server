/*
 * PafDataCacheCellTest.java
 * Created by Jtest on 9/19/06 5:58:28 PM.
 */

package com.palladium.paf.mdb;

import com.palladium.paf.mdb.PafDataCacheCell;

/**
 * PafDataCacheCellTest is a unit test class for class PafDataCacheCell.
 * @see com.palladium.paf.mdb.PafDataCacheCell
 * @author Parasoft Jtest 8.0
 */
public class PafDataCacheCellTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafDataCacheCellTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getCellIndex()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCell#getCellIndex()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetCellIndex1() throws Throwable {
		PafDataCacheCell THIS = new PafDataCacheCell((int[]) null, 0.0);
		// jtest_tested_method
		int[] RETVAL = THIS.getCellIndex();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getCellIndex()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCell#getCellIndex()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetCellIndex2() throws Throwable {
		PafDataCacheCell THIS = new PafDataCacheCell((int[]) null, 0.0);
		int[] var1 = new int[] {};
		THIS.setCellIndex(var1);
		THIS.setCellValue(0.0);
		// jtest_tested_method
		int[] RETVAL = THIS.getCellIndex();
		assertEquals(var1, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getCellValue()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCell#getCellValue()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetCellValue1() throws Throwable {
		PafDataCacheCell THIS = new PafDataCacheCell((int[]) null, 0.0);
		// jtest_tested_method
		double RETVAL = THIS.getCellValue();
		assertEquals(0.0, RETVAL, 0.0); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getCellValue()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCell#getCellValue()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetCellValue2() throws Throwable {
		int[] var1 = new int[] {};
		PafDataCacheCell THIS = new PafDataCacheCell(var1, 7.0);
		// jtest_tested_method
		double RETVAL = THIS.getCellValue();
		assertEquals(7.0, RETVAL, 0.0); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafDataCacheCell(int[],double)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCell#PafDataCacheCell(int[],double)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCacheCell1() throws Throwable {
		// jtest_tested_method
		PafDataCacheCell THIS = new PafDataCacheCell((int[]) null, 0.0);
		assertEquals(null, THIS.getCellIndex()); // jtest_unverified
		assertEquals(0.0, THIS.getCellValue(), 0.0); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafDataCacheCell(int[],double)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCell#PafDataCacheCell(int[],double)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCacheCell2() throws Throwable {
		int[] var1 = new int[] {};
		// jtest_tested_method
		PafDataCacheCell THIS = new PafDataCacheCell(var1, 7.0);
		assertSame(var1, THIS.getCellIndex()); // jtest_unverified
		assertEquals(7.0, THIS.getCellValue(), 0.0); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setCellIndex(int[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCell#setCellIndex(int[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetCellIndex1() throws Throwable {
		int[] var1 = new int[] {};
		PafDataCacheCell THIS = new PafDataCacheCell(var1, 7.0);
		int[] var2 = new int[] {};
		// jtest_tested_method
		THIS.setCellIndex(var2);
		assertSame(var2, THIS.getCellIndex()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setCellValue(double)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCell#setCellValue(double)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetCellValue1() throws Throwable {
		int[] var1 = new int[] {};
		PafDataCacheCell THIS = new PafDataCacheCell(var1, 7.0);
		// jtest_tested_method
		THIS.setCellValue(7.0);
		assertEquals(7.0, THIS.getCellValue(), 0.0); // jtest_unverified
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
	 * Usage: java com.palladium.paf.mdb.PafDataCacheCellTest
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
			PafDataCacheCellTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.mdb.PafDataCacheCell",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafDataCacheCell.class;
	}

}

// JTEST_CURRENT_ID=-1215896739.