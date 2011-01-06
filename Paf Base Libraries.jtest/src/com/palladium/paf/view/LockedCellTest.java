/*
 * LockedCellTest.java
 * Created by Jtest on 9/19/06 5:26:26 PM.
 */

package com.palladium.paf.view;

import com.palladium.paf.view.LockedCell;

/**
 * LockedCellTest is a unit test class for class LockedCell.
 * @see com.palladium.paf.view.LockedCell
 * @author Parasoft Jtest 8.0
 */
public class LockedCellTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public LockedCellTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: compareTo(java.lang.Object)
	 * @throws Throwable Tests may throw any Throwable
	 * @see LockedCell#compareTo(java.lang.Object)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCompareTo1() throws Throwable {
		LockedCell THIS = new LockedCell(0, 0);
		// jtest_tested_method
		int RETVAL = THIS.compareTo("");
		// ClassCastException thrown
		// at com.palladium.paf.view.LockedCell.compareTo(LockedCell.java:46)
		// jtest_unverified
	}

	/**
	 * Test for method: compareTo(java.lang.Object)
	 * @throws Throwable Tests may throw any Throwable
	 * @see LockedCell#compareTo(java.lang.Object)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCompareTo2() throws Throwable {
		LockedCell THIS = new LockedCell(0, 0);
		// jtest_tested_method
		int RETVAL = THIS.compareTo((Object) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.view.LockedCell.compareTo(Ljava/lang/Object;)I>
		// at com.palladium.paf.view.LockedCell.compareTo(LockedCell.java:48)
		// jtest_unverified
	}

	/**
	 * Test for method: compareTo(java.lang.Object)
	 * @throws Throwable Tests may throw any Throwable
	 * @see LockedCell#compareTo(java.lang.Object)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCompareTo3() throws Throwable {
		LockedCell THIS = new LockedCell(0, 0);
		LockedCell t1 = new LockedCell(0, 0);
		THIS.setColIndex(0);
		THIS.setRowIndex(0);
		// jtest_tested_method
		int RETVAL = THIS.compareTo(t1);
		assertEquals(0, RETVAL); // jtest_unverified
		assertEquals("Row Index: 0, Column Index: 0", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: compareTo(java.lang.Object)
	 * @throws Throwable Tests may throw any Throwable
	 * @see LockedCell#compareTo(java.lang.Object)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCompareTo4() throws Throwable {
		LockedCell THIS = new LockedCell(0, 0);
		LockedCell t1 = new LockedCell(0, 0);
		THIS.setColIndex(0);
		THIS.setRowIndex(-1);
		// jtest_tested_method
		int RETVAL = THIS.compareTo(t1);
		assertEquals(-1, RETVAL); // jtest_unverified
		assertEquals("Row Index: -1, Column Index: 0", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: compareTo(java.lang.Object)
	 * @throws Throwable Tests may throw any Throwable
	 * @see LockedCell#compareTo(java.lang.Object)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCompareTo5() throws Throwable {
		LockedCell THIS = new LockedCell(0, 0);
		LockedCell t1 = new LockedCell(0, 0);
		THIS.setColIndex(0);
		THIS.setRowIndex(1);
		// jtest_tested_method
		int RETVAL = THIS.compareTo(t1);
		assertEquals(1, RETVAL); // jtest_unverified
		assertEquals("Row Index: 1, Column Index: 0", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: compareTo(java.lang.Object)
	 * @throws Throwable Tests may throw any Throwable
	 * @see LockedCell#compareTo(java.lang.Object)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCompareTo6() throws Throwable {
		LockedCell THIS = new LockedCell(0, -1);
		LockedCell t1 = new LockedCell(0, 0);
		t1.setColIndex(0);
		t1.setRowIndex(0);
		// jtest_tested_method
		int RETVAL = THIS.compareTo(t1);
		assertEquals(-1, RETVAL); // jtest_unverified
		assertEquals("Row Index: 0, Column Index: -1", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: compareTo(java.lang.Object)
	 * @throws Throwable Tests may throw any Throwable
	 * @see LockedCell#compareTo(java.lang.Object)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCompareTo7() throws Throwable {
		LockedCell THIS = new LockedCell(0, 1);
		LockedCell t1 = new LockedCell(0, 0);
		t1.setColIndex(0);
		t1.setRowIndex(0);
		// jtest_tested_method
		int RETVAL = THIS.compareTo(t1);
		assertEquals(1, RETVAL); // jtest_unverified
		assertEquals("Row Index: 0, Column Index: 1", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getColIndex()
	 * @throws Throwable Tests may throw any Throwable
	 * @see LockedCell#getColIndex()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetColIndex1() throws Throwable {
		LockedCell THIS = new LockedCell(0, 0);
		// jtest_tested_method
		int RETVAL = THIS.getColIndex();
		assertEquals(0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getColIndex()
	 * @throws Throwable Tests may throw any Throwable
	 * @see LockedCell#getColIndex()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetColIndex2() throws Throwable {
		LockedCell THIS = new LockedCell(7, 7);
		THIS.setColIndex(7);
		THIS.setRowIndex(7);
		// jtest_tested_method
		int RETVAL = THIS.getColIndex();
		assertEquals(7, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getRowIndex()
	 * @throws Throwable Tests may throw any Throwable
	 * @see LockedCell#getRowIndex()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRowIndex1() throws Throwable {
		LockedCell THIS = new LockedCell(0, 0);
		// jtest_tested_method
		int RETVAL = THIS.getRowIndex();
		assertEquals(0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getRowIndex()
	 * @throws Throwable Tests may throw any Throwable
	 * @see LockedCell#getRowIndex()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRowIndex2() throws Throwable {
		LockedCell THIS = new LockedCell(7, 7);
		THIS.setColIndex(7);
		THIS.setRowIndex(7);
		// jtest_tested_method
		int RETVAL = THIS.getRowIndex();
		assertEquals(7, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: LockedCell()
	 * @throws Throwable Tests may throw any Throwable
	 * @see LockedCell#LockedCell()
	 * @author Parasoft Jtest 8.0
	 */
	public void testLockedCell1() throws Throwable {
		// jtest_tested_method
		LockedCell THIS = new LockedCell();
		assertEquals("Row Index: 0, Column Index: 0", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: LockedCell(int,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see LockedCell#LockedCell(int,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testLockedCell2() throws Throwable {
		// jtest_tested_method
		LockedCell THIS = new LockedCell(0, 0);
		assertEquals("Row Index: 0, Column Index: 0", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setColIndex(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see LockedCell#setColIndex(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetColIndex1() throws Throwable {
		LockedCell THIS = new LockedCell(0, 0);
		// jtest_tested_method
		THIS.setColIndex(0);
		assertEquals(0, THIS.getColIndex()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setColIndex(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see LockedCell#setColIndex(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetColIndex3() throws Throwable {
		LockedCell THIS = new LockedCell(7, 7);
		// jtest_tested_method
		THIS.setColIndex(7);
		assertEquals(7, THIS.getColIndex()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setRowIndex(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see LockedCell#setRowIndex(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetRowIndex1() throws Throwable {
		LockedCell THIS = new LockedCell(7, 7);
		THIS.setColIndex(7);
		THIS.setRowIndex(7);
		// jtest_tested_method
		THIS.setRowIndex(7);
		assertEquals(7, THIS.getRowIndex()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: toString()
	 * @throws Throwable Tests may throw any Throwable
	 * @see LockedCell#toString()
	 * @author Parasoft Jtest 8.0
	 */
	public void testToString1() throws Throwable {
		LockedCell THIS = new LockedCell(0, 0);
		// jtest_tested_method
		String RETVAL = THIS.toString();
		assertEquals("Row Index: 0, Column Index: 0", RETVAL); // jtest_unverified
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
	 * Usage: java com.palladium.paf.view.LockedCellTest
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
			LockedCellTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.view.LockedCell",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return LockedCell.class;
	}

}

// JTEST_CURRENT_ID=-471021186.