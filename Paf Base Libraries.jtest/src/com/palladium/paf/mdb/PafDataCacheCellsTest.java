/*
 * PafDataCacheCellsTest.java
 * Created by Jtest on 9/19/06 5:23:48 PM.
 */

package com.palladium.paf.mdb;

import java.util.List;
import com.palladium.paf.mdb.PafDataCacheCells;

/**
 * PafDataCacheCellsTest is a unit test class for class PafDataCacheCells.
 * @see com.palladium.paf.mdb.PafDataCacheCells
 * @author Parasoft Jtest 8.0
 */
public class PafDataCacheCellsTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafDataCacheCellsTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: add(int[],double)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCells#add(int[],double)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAdd1() throws Throwable {
		PafDataCacheCells THIS = new PafDataCacheCells();
		// jtest_tested_method
		THIS.add((int[]) null, 0.0);
		assertNotNull(THIS.getCells()); // jtest_unverified
		assertEquals(1, THIS.getCells().size()); // jtest_unverified
		assertTrue(THIS.getCells().get(0) instanceof PafDataCacheCell); // jtest_unverified
		assertEquals(null, ((com.palladium.paf.mdb.PafDataCacheCell) THIS
			.getCells().get(0)).getCellIndex()); // jtest_unverified
		assertEquals(0.0, ((com.palladium.paf.mdb.PafDataCacheCell) THIS
			.getCells().get(0)).getCellValue(), 0.0); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: add(int[],double)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCells#add(int[],double)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAdd2() throws Throwable {
		PafDataCacheCells THIS = new PafDataCacheCells();
		int[] var1 = new int[] {};
		// jtest_tested_method
		THIS.add(var1, 7.0);
		assertNotNull(THIS.getCells()); // jtest_unverified
		assertEquals(1, THIS.getCells().size()); // jtest_unverified
		assertTrue(THIS.getCells().get(0) instanceof PafDataCacheCell); // jtest_unverified
		assertEquals(7.0, ((com.palladium.paf.mdb.PafDataCacheCell) THIS
			.getCells().get(0)).getCellValue(), 0.0); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getCells()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCells#getCells()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetCells1() throws Throwable {
		PafDataCacheCells THIS = new PafDataCacheCells();
		// jtest_tested_method
		List RETVAL = THIS.getCells();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0, RETVAL.size()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafDataCacheCells()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCells#PafDataCacheCells()
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCacheCells1() throws Throwable {
		// jtest_tested_method
		PafDataCacheCells THIS = new PafDataCacheCells();
		assertNotNull(THIS.getCells()); // jtest_unverified
		assertEquals(0, THIS.getCells().size()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.mdb.PafDataCacheCellsTest
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
			PafDataCacheCellsTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.mdb.PafDataCacheCells",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafDataCacheCells.class;
	}

}

// JTEST_CURRENT_ID=1555072968.