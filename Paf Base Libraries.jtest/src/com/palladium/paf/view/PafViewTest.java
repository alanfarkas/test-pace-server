/*
 * PafViewTest.java
 * Created by Jtest on 9/19/06 5:56:19 PM.
 */

package com.palladium.paf.view;

import com.palladium.paf.view.PafView;

/**
 * PafViewTest is a unit test class for class PafView.
 * @see com.palladium.paf.view.PafView
 * @author Parasoft Jtest 8.0
 */
public class PafViewTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafViewTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getBackGroundColor()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafView#getBackGroundColor()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetBackGroundColor1() throws Throwable {
		PafView THIS = new PafView();
		// jtest_tested_method
		String RETVAL = THIS.getBackGroundColor();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDesc()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafView#getDesc()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDesc1() throws Throwable {
		PafView THIS = new PafView();
		// jtest_tested_method
		String RETVAL = THIS.getDesc();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDesc()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafView#getDesc()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDesc2() throws Throwable {
		PafView THIS = new PafView();
		Integer t1 = new Integer(0);
		Integer t2 = new Integer("0");
		THIS.setDesc("");
		PafViewHeader[] var1 = new PafViewHeader[] {};
		THIS.setHeaders(var1);
		THIS.setName("");
		PafViewSection[] var2 = new PafViewSection[] {};
		THIS.setViewSections(var2);
		THIS.setBackGroundColor("");
		PafUserSelection[] var3 = new PafUserSelection[] {};
		THIS.setUserSelections(var3);
		String[] var4 = new String[] {};
		THIS.setViewSectionNames(var4);
		THIS.setPageOrientation("");
		THIS.setPagesTall(t1);
		THIS.setPagesWide(t2);
		// jtest_tested_method
		String RETVAL = THIS.getDesc();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getHeaders()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafView#getHeaders()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetHeaders1() throws Throwable {
		PafView THIS = new PafView();
		// jtest_tested_method
		PafViewHeader[] RETVAL = THIS.getHeaders();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafView#getName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetName1() throws Throwable {
		PafView THIS = new PafView();
		// jtest_tested_method
		String RETVAL = THIS.getName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPageOrientation()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafView#getPageOrientation()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPageOrientation1() throws Throwable {
		PafView THIS = new PafView();
		// jtest_tested_method
		String RETVAL = THIS.getPageOrientation();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPagesTall()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafView#getPagesTall()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPagesTall1() throws Throwable {
		PafView THIS = new PafView();
		// jtest_tested_method
		Integer RETVAL = THIS.getPagesTall();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPagesWide()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafView#getPagesWide()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPagesWide1() throws Throwable {
		PafView THIS = new PafView();
		// jtest_tested_method
		Integer RETVAL = THIS.getPagesWide();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getUserSelections()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafView#getUserSelections()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetUserSelections1() throws Throwable {
		PafView THIS = new PafView();
		// jtest_tested_method
		PafUserSelection[] RETVAL = THIS.getUserSelections();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getViewSectionNames()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafView#getViewSectionNames()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetViewSectionNames1() throws Throwable {
		PafView THIS = new PafView();
		// jtest_tested_method
		String[] RETVAL = THIS.getViewSectionNames();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getViewSections()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafView#getViewSections()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetViewSections1() throws Throwable {
		PafView THIS = new PafView();
		// jtest_tested_method
		PafViewSection[] RETVAL = THIS.getViewSections();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setBackGroundColor(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafView#setBackGroundColor(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetBackGroundColor1() throws Throwable {
		PafView THIS = new PafView();
		// jtest_tested_method
		THIS.setBackGroundColor("");
		assertEquals("", THIS.getBackGroundColor()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setDesc(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafView#setDesc(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDesc1() throws Throwable {
		PafView THIS = new PafView();
		// jtest_tested_method
		THIS.setDesc("");
		assertEquals("", THIS.getDesc()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setHeaders(com.palladium.paf.view.PafViewHeader[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafView#setHeaders(com.palladium.paf.view.PafViewHeader[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetHeaders1() throws Throwable {
		PafView THIS = new PafView();
		PafViewHeader[] var1 = new PafViewHeader[] {};
		// jtest_tested_method
		THIS.setHeaders(var1);
		assertSame(var1, THIS.getHeaders()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafView#setName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetName1() throws Throwable {
		PafView THIS = new PafView();
		// jtest_tested_method
		THIS.setName("");
		assertEquals("", THIS.getName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setPageOrientation(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafView#setPageOrientation(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetPageOrientation1() throws Throwable {
		PafView THIS = new PafView();
		// jtest_tested_method
		THIS.setPageOrientation("");
		assertEquals("", THIS.getPageOrientation()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setPagesTall(java.lang.Integer)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafView#setPagesTall(java.lang.Integer)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetPagesTall1() throws Throwable {
		PafView THIS = new PafView();
		Integer t1 = new Integer(7);
		// jtest_tested_method
		THIS.setPagesTall(t1);
		assertEquals(t1, THIS.getPagesTall()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setPagesWide(java.lang.Integer)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafView#setPagesWide(java.lang.Integer)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetPagesWide1() throws Throwable {
		PafView THIS = new PafView();
		Integer t1 = new Integer(7);
		// jtest_tested_method
		THIS.setPagesWide(t1);
		assertEquals(t1, THIS.getPagesWide()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setUserSelections(com.palladium.paf.view.PafUserSelection[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafView#setUserSelections(com.palladium.paf.view.PafUserSelection[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetUserSelections1() throws Throwable {
		PafView THIS = new PafView();
		PafUserSelection[] var1 = new PafUserSelection[] {};
		// jtest_tested_method
		THIS.setUserSelections(var1);
		assertSame(var1, THIS.getUserSelections()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setViewSectionNames(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafView#setViewSectionNames(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetViewSectionNames1() throws Throwable {
		PafView THIS = new PafView();
		String[] var1 = new String[] {};
		// jtest_tested_method
		THIS.setViewSectionNames(var1);
		assertSame(var1, THIS.getViewSectionNames()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setViewSections(com.palladium.paf.view.PafViewSection[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafView#setViewSections(com.palladium.paf.view.PafViewSection[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetViewSections1() throws Throwable {
		PafView THIS = new PafView();
		PafViewSection[] var1 = new PafViewSection[] {};
		// jtest_tested_method
		THIS.setViewSections(var1);
		assertSame(var1, THIS.getViewSections()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.view.PafViewTest
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
			PafViewTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.view.PafView",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafView.class;
	}

}

// JTEST_CURRENT_ID=-1662429331.