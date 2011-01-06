/*
 * CustomMenuDefTest.java
 * Created by Jtest on 9/19/06 6:11:36 PM.
 */

package com.palladium.paf.comm;

import com.palladium.paf.app.CustomActionDef;
import com.palladium.paf.comm.CustomMenuDef;

/**
 * CustomMenuDefTest is a unit test class for class CustomMenuDef.
 * @see com.palladium.paf.comm.CustomMenuDef
 * @author Parasoft Jtest 8.0
 */
public class CustomMenuDefTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public CustomMenuDefTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getCaption()
	 * @throws Throwable Tests may throw any Throwable
	 * @see CustomMenuDef#getCaption()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetCaption1() throws Throwable {
		CustomMenuDef THIS = new CustomMenuDef();
		// jtest_tested_method
		String RETVAL = THIS.getCaption();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getConfirmationMessage()
	 * @throws Throwable Tests may throw any Throwable
	 * @see CustomMenuDef#getConfirmationMessage()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetConfirmationMessage1() throws Throwable {
		CustomMenuDef THIS = new CustomMenuDef();
		// jtest_tested_method
		String RETVAL = THIS.getConfirmationMessage();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getCustomActionDefs()
	 * @throws Throwable Tests may throw any Throwable
	 * @see CustomMenuDef#getCustomActionDefs()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetCustomActionDefs1() throws Throwable {
		CustomMenuDef THIS = new CustomMenuDef();
		// jtest_tested_method
		CustomActionDef[] RETVAL = THIS.getCustomActionDefs();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getFaceID()
	 * @throws Throwable Tests may throw any Throwable
	 * @see CustomMenuDef#getFaceID()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetFaceID1() throws Throwable {
		CustomMenuDef THIS = new CustomMenuDef();
		// jtest_tested_method
		Integer RETVAL = THIS.getFaceID();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getKey()
	 * @throws Throwable Tests may throw any Throwable
	 * @see CustomMenuDef#getKey()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetKey1() throws Throwable {
		CustomMenuDef THIS = new CustomMenuDef();
		// jtest_tested_method
		String RETVAL = THIS.getKey();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getTerminationMessage()
	 * @throws Throwable Tests may throw any Throwable
	 * @see CustomMenuDef#getTerminationMessage()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetTerminationMessage1() throws Throwable {
		CustomMenuDef THIS = new CustomMenuDef();
		// jtest_tested_method
		String RETVAL = THIS.getTerminationMessage();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getUserPrompts()
	 * @throws Throwable Tests may throw any Throwable
	 * @see CustomMenuDef#getUserPrompts()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetUserPrompts1() throws Throwable {
		CustomMenuDef THIS = new CustomMenuDef();
		// jtest_tested_method
		String[] RETVAL = THIS.getUserPrompts();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getViewFilter()
	 * @throws Throwable Tests may throw any Throwable
	 * @see CustomMenuDef#getViewFilter()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetViewFilter1() throws Throwable {
		CustomMenuDef THIS = new CustomMenuDef();
		// jtest_tested_method
		String[] RETVAL = THIS.getViewFilter();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isBeginGroup()
	 * @throws Throwable Tests may throw any Throwable
	 * @see CustomMenuDef#isBeginGroup()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsBeginGroup1() throws Throwable {
		CustomMenuDef THIS = new CustomMenuDef();
		// jtest_tested_method
		boolean RETVAL = THIS.isBeginGroup();
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isBeginGroup()
	 * @throws Throwable Tests may throw any Throwable
	 * @see CustomMenuDef#isBeginGroup()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsBeginGroup3() throws Throwable {
		CustomMenuDef THIS = new CustomMenuDef();
		Integer t1 = new Integer(7);
		THIS.setBeginGroup(true);
		THIS.setCaption("");
		THIS.setEnableButton(true);
		THIS.setFaceID(t1);
		THIS.setKey("");
		String[] var1 = new String[] {};
		THIS.setUserPrompts(var1);
		THIS.setConfirmationMessage("");
		THIS.setTerminationMessage("");
		String[] var2 = new String[] {};
		THIS.setViewFilter(var2);
		CustomActionDef[] var3 = new CustomActionDef[] {};
		THIS.setCustomActionDefs(var3);
		// jtest_tested_method
		boolean RETVAL = THIS.isBeginGroup();
		assertEquals(true, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isEnableButton()
	 * @throws Throwable Tests may throw any Throwable
	 * @see CustomMenuDef#isEnableButton()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsEnableButton1() throws Throwable {
		CustomMenuDef THIS = new CustomMenuDef();
		// jtest_tested_method
		boolean RETVAL = THIS.isEnableButton();
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setBeginGroup(boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see CustomMenuDef#setBeginGroup(boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetBeginGroup1() throws Throwable {
		CustomMenuDef THIS = new CustomMenuDef();
		// jtest_tested_method
		THIS.setBeginGroup(true);
		assertEquals(true, THIS.isBeginGroup()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setCaption(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see CustomMenuDef#setCaption(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetCaption1() throws Throwable {
		CustomMenuDef THIS = new CustomMenuDef();
		// jtest_tested_method
		THIS.setCaption("");
		assertEquals("", THIS.getCaption()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setConfirmationMessage(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see CustomMenuDef#setConfirmationMessage(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetConfirmationMessage1() throws Throwable {
		CustomMenuDef THIS = new CustomMenuDef();
		// jtest_tested_method
		THIS.setConfirmationMessage("");
		assertEquals("", THIS.getConfirmationMessage()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setCustomActionDefs(com.palladium.paf.app.CustomActionDef[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see CustomMenuDef#setCustomActionDefs(com.palladium.paf.app.CustomActionDef[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetCustomActionDefs1() throws Throwable {
		CustomMenuDef THIS = new CustomMenuDef();
		CustomActionDef[] var1 = new CustomActionDef[] {};
		// jtest_tested_method
		THIS.setCustomActionDefs(var1);
		assertSame(var1, THIS.getCustomActionDefs()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setEnableButton(boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see CustomMenuDef#setEnableButton(boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetEnableButton1() throws Throwable {
		CustomMenuDef THIS = new CustomMenuDef();
		// jtest_tested_method
		THIS.setEnableButton(true);
		assertEquals(true, THIS.isEnableButton()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setFaceID(java.lang.Integer)
	 * @throws Throwable Tests may throw any Throwable
	 * @see CustomMenuDef#setFaceID(java.lang.Integer)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetFaceID1() throws Throwable {
		CustomMenuDef THIS = new CustomMenuDef();
		Integer t1 = new Integer(7);
		// jtest_tested_method
		THIS.setFaceID(t1);
		assertEquals(t1, THIS.getFaceID()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setKey(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see CustomMenuDef#setKey(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetKey1() throws Throwable {
		CustomMenuDef THIS = new CustomMenuDef();
		// jtest_tested_method
		THIS.setKey("");
		assertEquals("", THIS.getKey()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setTerminationMessage(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see CustomMenuDef#setTerminationMessage(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetTerminationMessage1() throws Throwable {
		CustomMenuDef THIS = new CustomMenuDef();
		// jtest_tested_method
		THIS.setTerminationMessage("");
		assertEquals("", THIS.getTerminationMessage()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setUserPrompts(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see CustomMenuDef#setUserPrompts(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetUserPrompts1() throws Throwable {
		CustomMenuDef THIS = new CustomMenuDef();
		String[] var1 = new String[] {};
		// jtest_tested_method
		THIS.setUserPrompts(var1);
		assertSame(var1, THIS.getUserPrompts()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setViewFilter(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see CustomMenuDef#setViewFilter(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetViewFilter1() throws Throwable {
		CustomMenuDef THIS = new CustomMenuDef();
		String[] var1 = new String[] {};
		// jtest_tested_method
		THIS.setViewFilter(var1);
		assertSame(var1, THIS.getViewFilter()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.comm.CustomMenuDefTest
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
			CustomMenuDefTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.comm.CustomMenuDef",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return CustomMenuDef.class;
	}

}

// JTEST_CURRENT_ID=554818606.