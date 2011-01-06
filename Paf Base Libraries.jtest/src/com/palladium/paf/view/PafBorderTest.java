/*
 * PafBorderTest.java
 * Created by Jtest on 9/19/06 5:23:27 PM.
 */

package com.palladium.paf.view;

import com.palladium.paf.view.PafBorder;

/**
 * PafBorderTest is a unit test class for class PafBorder.
 * @see com.palladium.paf.view.PafBorder
 * @author Parasoft Jtest 8.0
 */
public class PafBorderTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafBorderTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: clone()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafBorder#clone()
	 * @author Parasoft Jtest 8.0
	 */
	public void testClone1() throws Throwable {
		PafBorder THIS = new PafBorder();
		// jtest_tested_method
		Object RETVAL = THIS.clone();
		assertTrue(RETVAL instanceof PafBorder); // jtest_unverified
		assertEquals(0, ((PafBorder) RETVAL).getBorder()); // jtest_unverified
		assertEquals(false, ((PafBorder) RETVAL).isAll()); // jtest_unverified
		assertEquals(false, ((PafBorder) RETVAL).isBottom()); // jtest_unverified
		assertEquals(false, ((PafBorder) RETVAL).isLeft()); // jtest_unverified
		assertEquals(false, ((PafBorder) RETVAL).isRight()); // jtest_unverified
		assertEquals(false, ((PafBorder) RETVAL).isTop()); // jtest_unverified
		assertEquals(0, THIS.getBorder()); // jtest_unverified
		assertEquals(false, THIS.isAll()); // jtest_unverified
		assertEquals(false, THIS.isBottom()); // jtest_unverified
		assertEquals(false, THIS.isLeft()); // jtest_unverified
		assertEquals(false, THIS.isRight()); // jtest_unverified
		assertEquals(false, THIS.isTop()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: clone()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafBorder#clone()
	 * @author Parasoft Jtest 8.0
	 */
	public void testClone2() throws Throwable {
		PafBorder THIS = new PafBorder();
		THIS.setBorder(7);
		// jtest_tested_method
		Object RETVAL = THIS.clone();
		assertTrue(RETVAL instanceof PafBorder); // jtest_unverified
		assertEquals(7, ((PafBorder) RETVAL).getBorder()); // jtest_unverified
		assertEquals(false, ((PafBorder) RETVAL).isAll()); // jtest_unverified
		assertEquals(false, ((PafBorder) RETVAL).isBottom()); // jtest_unverified
		assertEquals(true, ((PafBorder) RETVAL).isLeft()); // jtest_unverified
		assertEquals(true, ((PafBorder) RETVAL).isRight()); // jtest_unverified
		assertEquals(false, ((PafBorder) RETVAL).isTop()); // jtest_unverified
		assertEquals(7, THIS.getBorder()); // jtest_unverified
		assertEquals(false, THIS.isAll()); // jtest_unverified
		assertEquals(false, THIS.isBottom()); // jtest_unverified
		assertEquals(true, THIS.isLeft()); // jtest_unverified
		assertEquals(true, THIS.isRight()); // jtest_unverified
		assertEquals(false, THIS.isTop()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getBorder()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafBorder#getBorder()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetBorder1() throws Throwable {
		PafBorder THIS = new PafBorder();
		// jtest_tested_method
		int RETVAL = THIS.getBorder();
		assertEquals(0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getBorder()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafBorder#getBorder()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetBorder2() throws Throwable {
		PafBorder THIS = new PafBorder();
		THIS.setBorder(7);
		// jtest_tested_method
		int RETVAL = THIS.getBorder();
		assertEquals(7, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isAll()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafBorder#isAll()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsAll1() throws Throwable {
		PafBorder THIS = new PafBorder();
		// jtest_tested_method
		boolean RETVAL = THIS.isAll();
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isBottom()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafBorder#isBottom()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsBottom1() throws Throwable {
		PafBorder THIS = new PafBorder();
		// jtest_tested_method
		boolean RETVAL = THIS.isBottom();
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isLeft()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafBorder#isLeft()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsLeft1() throws Throwable {
		PafBorder THIS = new PafBorder();
		// jtest_tested_method
		boolean RETVAL = THIS.isLeft();
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isLeft()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafBorder#isLeft()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsLeft2() throws Throwable {
		PafBorder THIS = new PafBorder();
		THIS.setBorder(7);
		// jtest_tested_method
		boolean RETVAL = THIS.isLeft();
		assertEquals(true, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isRight()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafBorder#isRight()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsRight1() throws Throwable {
		PafBorder THIS = new PafBorder();
		// jtest_tested_method
		boolean RETVAL = THIS.isRight();
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isRight()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafBorder#isRight()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsRight2() throws Throwable {
		PafBorder THIS = new PafBorder();
		THIS.setBorder(7);
		// jtest_tested_method
		boolean RETVAL = THIS.isRight();
		assertEquals(true, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isTop()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafBorder#isTop()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsTop1() throws Throwable {
		PafBorder THIS = new PafBorder();
		// jtest_tested_method
		boolean RETVAL = THIS.isTop();
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafBorder(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafBorder#PafBorder(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafBorder1() throws Throwable {
		// jtest_tested_method
		PafBorder THIS = new PafBorder(0);
		assertEquals(0, THIS.getBorder()); // jtest_unverified
		assertEquals(false, THIS.isAll()); // jtest_unverified
		assertEquals(false, THIS.isBottom()); // jtest_unverified
		assertEquals(false, THIS.isLeft()); // jtest_unverified
		assertEquals(false, THIS.isRight()); // jtest_unverified
		assertEquals(false, THIS.isTop()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafBorder(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafBorder#PafBorder(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafBorder2() throws Throwable {
		// jtest_tested_method
		PafBorder THIS = new PafBorder(7);
		assertEquals(7, THIS.getBorder()); // jtest_unverified
		assertEquals(false, THIS.isAll()); // jtest_unverified
		assertEquals(false, THIS.isBottom()); // jtest_unverified
		assertEquals(true, THIS.isLeft()); // jtest_unverified
		assertEquals(true, THIS.isRight()); // jtest_unverified
		assertEquals(false, THIS.isTop()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafBorder()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafBorder#PafBorder()
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafBorder3() throws Throwable {
		// jtest_tested_method
		PafBorder THIS = new PafBorder();
		assertEquals(0, THIS.getBorder()); // jtest_unverified
		assertEquals(false, THIS.isAll()); // jtest_unverified
		assertEquals(false, THIS.isBottom()); // jtest_unverified
		assertEquals(false, THIS.isLeft()); // jtest_unverified
		assertEquals(false, THIS.isRight()); // jtest_unverified
		assertEquals(false, THIS.isTop()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setBorder(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafBorder#setBorder(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetBorder1() throws Throwable {
		PafBorder THIS = new PafBorder(7);
		// jtest_tested_method
		THIS.setBorder(7);
		assertEquals(7, THIS.getBorder()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.view.PafBorderTest
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
			PafBorderTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.view.PafBorder",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafBorder.class;
	}

}

// JTEST_CURRENT_ID=840408613.