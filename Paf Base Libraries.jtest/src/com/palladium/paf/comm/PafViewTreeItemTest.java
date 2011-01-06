/*
 * PafViewTreeItemTest.java
 * Created by Jtest on 9/19/06 5:50:09 PM.
 */

package com.palladium.paf.comm;

import com.palladium.paf.view.PafUserSelection;
import com.palladium.paf.comm.PafViewTreeItem;

/**
 * PafViewTreeItemTest is a unit test class for class PafViewTreeItem.
 * @see com.palladium.paf.comm.PafViewTreeItem
 * @author Parasoft Jtest 8.0
 */
public class PafViewTreeItemTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafViewTreeItemTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getDesc()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewTreeItem#getDesc()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDesc1() throws Throwable {
		PafViewTreeItem THIS = new PafViewTreeItem();
		// jtest_tested_method
		String RETVAL = THIS.getDesc();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getItems()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewTreeItem#getItems()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetItems1() throws Throwable {
		PafViewTreeItem THIS = new PafViewTreeItem();
		// jtest_tested_method
		PafViewTreeItem[] RETVAL = THIS.getItems();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getLabel()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewTreeItem#getLabel()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLabel1() throws Throwable {
		PafViewTreeItem THIS = new PafViewTreeItem();
		// jtest_tested_method
		String RETVAL = THIS.getLabel();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getUserSelections()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewTreeItem#getUserSelections()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetUserSelections1() throws Throwable {
		PafViewTreeItem THIS = new PafViewTreeItem();
		// jtest_tested_method
		PafUserSelection[] RETVAL = THIS.getUserSelections();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isGroup()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewTreeItem#isGroup()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsGroup1() throws Throwable {
		PafViewTreeItem THIS = new PafViewTreeItem();
		// jtest_tested_method
		boolean RETVAL = THIS.isGroup();
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafViewTreeItem()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewTreeItem#PafViewTreeItem()
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafViewTreeItem1() throws Throwable {
		// jtest_tested_method
		PafViewTreeItem THIS = new PafViewTreeItem();
		assertEquals("View: \nDesc: \nGroup: false\n", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setDesc(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewTreeItem#setDesc(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDesc1() throws Throwable {
		PafViewTreeItem THIS = new PafViewTreeItem();
		// jtest_tested_method
		THIS.setDesc("");
		assertEquals("", THIS.getDesc()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setGroup(boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewTreeItem#setGroup(boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetGroup1() throws Throwable {
		PafViewTreeItem THIS = new PafViewTreeItem();
		// jtest_tested_method
		THIS.setGroup(true);
		assertEquals(true, THIS.isGroup()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setItems(com.palladium.paf.comm.PafViewTreeItem[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewTreeItem#setItems(com.palladium.paf.comm.PafViewTreeItem[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetItems1() throws Throwable {
		PafViewTreeItem THIS = new PafViewTreeItem();
		PafViewTreeItem[] var1 = new PafViewTreeItem[] {};
		// jtest_tested_method
		THIS.setItems(var1);
		assertSame(var1, THIS.getItems()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setLabel(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewTreeItem#setLabel(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetLabel1() throws Throwable {
		PafViewTreeItem THIS = new PafViewTreeItem();
		// jtest_tested_method
		THIS.setLabel("");
		assertEquals("", THIS.getLabel()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setUserSelections(com.palladium.paf.view.PafUserSelection[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewTreeItem#setUserSelections(com.palladium.paf.view.PafUserSelection[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetUserSelections1() throws Throwable {
		PafViewTreeItem THIS = new PafViewTreeItem();
		PafUserSelection[] var1 = new PafUserSelection[] {};
		// jtest_tested_method
		THIS.setUserSelections(var1);
		assertSame(var1, THIS.getUserSelections()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: toString()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewTreeItem#toString()
	 * @author Parasoft Jtest 8.0
	 */
	public void testToString3() throws Throwable {
		PafViewTreeItem THIS = new PafViewTreeItem();
		THIS.setDesc("");
		THIS.setGroup(false);
		PafViewTreeItem[] var1 = new PafViewTreeItem[] { null };
		THIS.setItems(var1);
		THIS.setLabel("");
		PafUserSelection[] var2 = new PafUserSelection[] {};
		THIS.setUserSelections(var2);
		// jtest_tested_method
		String RETVAL = THIS.toString();
		assertEquals("View: \nDesc: \nGroup: false\n\tnull", RETVAL); // jtest_unverified
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
	 * Usage: java com.palladium.paf.comm.PafViewTreeItemTest
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
			PafViewTreeItemTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.comm.PafViewTreeItem",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafViewTreeItem.class;
	}

}

// JTEST_CURRENT_ID=-412565267.