/*
 * PafStyleTest.java
 * Created by Jtest on 9/19/06 5:50:48 PM.
 */

package com.palladium.paf.view;

import com.palladium.paf.view.PafStyle;

/**
 * PafStyleTest is a unit test class for class PafStyle.
 * @see com.palladium.paf.view.PafStyle
 * @author Parasoft Jtest 8.0
 */
public class PafStyleTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafStyleTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: clone()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafStyle#clone()
	 * @author Parasoft Jtest 8.0
	 */
	public void testClone1() throws Throwable {
		PafStyle THIS = new PafStyle();
		// jtest_tested_method
		Object RETVAL = THIS.clone();
		assertTrue(RETVAL instanceof PafStyle); // jtest_unverified
		assertEquals(null, ((PafStyle) RETVAL).getName()); // jtest_unverified
		assertEquals(null, ((PafStyle) RETVAL).getSize()); // jtest_unverified
		assertEquals(null, ((PafStyle) RETVAL).getAlignment()); // jtest_unverified
		assertEquals(null, ((PafStyle) RETVAL).getBgFillColor()); // jtest_unverified
		assertEquals(null, ((PafStyle) RETVAL).getBold()); // jtest_unverified
		assertNotNull(((PafStyle) RETVAL).getDoubleUnderline()); // jtest_unverified
		assertEquals("false", ((PafStyle) RETVAL).getDoubleUnderline()
			.toString()); // jtest_unverified
		assertEquals(null, ((PafStyle) RETVAL).getFontColor()); // jtest_unverified
		assertEquals(null, ((PafStyle) RETVAL).getFontName()); // jtest_unverified
		assertEquals(null, THIS.getName()); // jtest_unverified
		assertEquals(null, THIS.getSize()); // jtest_unverified
		assertEquals(null, THIS.getAlignment()); // jtest_unverified
		assertEquals(null, THIS.getBgFillColor()); // jtest_unverified
		assertEquals(null, THIS.getBold()); // jtest_unverified
		assertNotNull(THIS.getDoubleUnderline()); // jtest_unverified
		assertEquals("false", THIS.getDoubleUnderline().toString()); // jtest_unverified
		assertEquals(null, THIS.getFontColor()); // jtest_unverified
		assertEquals(null, THIS.getFontName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: clone()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafStyle#clone()
	 * @author Parasoft Jtest 8.0
	 */
	public void testClone2() throws Throwable {
		PafStyle THIS = new PafStyle();
		Integer t1 = new Integer(0);
		PafAlignment t2 = new PafAlignment();
		Boolean t3 = new Boolean((String) null);
		Boolean t4 = new Boolean((String) null);
		Boolean t5 = new Boolean(false);
		Boolean t6 = new Boolean((String) null);
		Boolean t7 = new Boolean(false);
		THIS.setSize(t1);
		THIS.setAlignment(t2);
		THIS.setBgFillColor("");
		THIS.setFontColor("");
		THIS.setFontName("");
		THIS.setName("");
		THIS.setBold(t3);
		THIS.setDoubleUnderline(t4);
		THIS.setItalics(t5);
		THIS.setStrikeOut(t6);
		THIS.setUnderline(t7);
		// jtest_tested_method
		Object RETVAL = THIS.clone();
		assertTrue(RETVAL instanceof PafStyle); // jtest_unverified
		assertEquals("", ((PafStyle) RETVAL).getName()); // jtest_unverified
		assertEquals(t1, ((PafStyle) RETVAL).getSize()); // jtest_unverified
		assertNotNull(((PafStyle) RETVAL).getAlignment()); // jtest_unverified
		assertEquals("Left", ((PafStyle) RETVAL).getAlignment().getValue()); // jtest_unverified
		assertEquals("", ((PafStyle) RETVAL).getBgFillColor()); // jtest_unverified
		assertEquals(t3, ((PafStyle) RETVAL).getBold()); // jtest_unverified
		assertEquals(t3, ((PafStyle) RETVAL).getDoubleUnderline()); // jtest_unverified
		assertEquals("", ((PafStyle) RETVAL).getFontColor()); // jtest_unverified
		assertEquals("", ((PafStyle) RETVAL).getFontName()); // jtest_unverified
		assertEquals("", THIS.getName()); // jtest_unverified
		assertEquals(t1, THIS.getSize()); // jtest_unverified
		assertEquals(t2, THIS.getAlignment()); // jtest_unverified
		assertEquals("", THIS.getBgFillColor()); // jtest_unverified
		assertEquals(t3, THIS.getBold()); // jtest_unverified
		assertEquals(t3, THIS.getDoubleUnderline()); // jtest_unverified
		assertEquals("", THIS.getFontColor()); // jtest_unverified
		assertEquals("", THIS.getFontName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getAlignment()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafStyle#getAlignment()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAlignment1() throws Throwable {
		PafStyle THIS = new PafStyle();
		// jtest_tested_method
		PafAlignment RETVAL = THIS.getAlignment();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getBgFillColor()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafStyle#getBgFillColor()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetBgFillColor1() throws Throwable {
		PafStyle THIS = new PafStyle();
		// jtest_tested_method
		String RETVAL = THIS.getBgFillColor();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getBold()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafStyle#getBold()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetBold1() throws Throwable {
		PafStyle THIS = new PafStyle();
		// jtest_tested_method
		Boolean RETVAL = THIS.getBold();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDoubleUnderline()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafStyle#getDoubleUnderline()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDoubleUnderline1() throws Throwable {
		PafStyle THIS = new PafStyle();
		// jtest_tested_method
		Boolean RETVAL = THIS.getDoubleUnderline();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("false", RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getFontColor()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafStyle#getFontColor()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetFontColor1() throws Throwable {
		PafStyle THIS = new PafStyle();
		// jtest_tested_method
		String RETVAL = THIS.getFontColor();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getFontName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafStyle#getFontName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetFontName1() throws Throwable {
		PafStyle THIS = new PafStyle();
		// jtest_tested_method
		String RETVAL = THIS.getFontName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getItalics()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafStyle#getItalics()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetItalics1() throws Throwable {
		PafStyle THIS = new PafStyle();
		// jtest_tested_method
		Boolean RETVAL = THIS.getItalics();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafStyle#getName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetName1() throws Throwable {
		PafStyle THIS = new PafStyle();
		// jtest_tested_method
		String RETVAL = THIS.getName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getSize()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafStyle#getSize()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetSize1() throws Throwable {
		PafStyle THIS = new PafStyle();
		// jtest_tested_method
		Integer RETVAL = THIS.getSize();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getSize()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafStyle#getSize()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetSize2() throws Throwable {
		PafStyle THIS = new PafStyle();
		Integer t1 = new Integer(0);
		PafAlignment t2 = new PafAlignment();
		Boolean t3 = new Boolean(false);
		Boolean t4 = new Boolean((String) null);
		Boolean t5 = new Boolean(false);
		Boolean t6 = new Boolean((String) null);
		Boolean t7 = new Boolean((String) null);
		THIS.setSize(t1);
		THIS.setAlignment(t2);
		THIS.setBgFillColor("");
		THIS.setFontColor("");
		THIS.setFontName("");
		THIS.setName("");
		THIS.setBold(t3);
		THIS.setDoubleUnderline(t4);
		THIS.setItalics(t5);
		THIS.setStrikeOut(t6);
		THIS.setUnderline(t7);
		// jtest_tested_method
		Integer RETVAL = THIS.getSize();
		assertEquals(t1, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getStrikeOut()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafStyle#getStrikeOut()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetStrikeOut1() throws Throwable {
		PafStyle THIS = new PafStyle();
		// jtest_tested_method
		Boolean RETVAL = THIS.getStrikeOut();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getUnderline()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafStyle#getUnderline()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetUnderline1() throws Throwable {
		PafStyle THIS = new PafStyle();
		// jtest_tested_method
		Boolean RETVAL = THIS.getUnderline();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafStyle()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafStyle#PafStyle()
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafStyle1() throws Throwable {
		// jtest_tested_method
		PafStyle THIS = new PafStyle();
		assertEquals(null, THIS.getName()); // jtest_unverified
		assertEquals(null, THIS.getSize()); // jtest_unverified
		assertEquals(null, THIS.getAlignment()); // jtest_unverified
		assertEquals(null, THIS.getBgFillColor()); // jtest_unverified
		assertEquals(null, THIS.getBold()); // jtest_unverified
		assertNotNull(THIS.getDoubleUnderline()); // jtest_unverified
		assertEquals("false", THIS.getDoubleUnderline().toString()); // jtest_unverified
		assertEquals(null, THIS.getFontColor()); // jtest_unverified
		assertEquals(null, THIS.getFontName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setAlignment(com.palladium.paf.view.PafAlignment)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafStyle#setAlignment(com.palladium.paf.view.PafAlignment)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetAlignment1() throws Throwable {
		PafStyle THIS = new PafStyle();
		PafAlignment t1 = new PafAlignment();
		// jtest_tested_method
		THIS.setAlignment(t1);
		assertEquals(t1, THIS.getAlignment()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setBgFillColor(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafStyle#setBgFillColor(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetBgFillColor1() throws Throwable {
		PafStyle THIS = new PafStyle();
		// jtest_tested_method
		THIS.setBgFillColor("");
		assertEquals("", THIS.getBgFillColor()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setBold(java.lang.Boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafStyle#setBold(java.lang.Boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetBold1() throws Throwable {
		PafStyle THIS = new PafStyle();
		Boolean t1 = new Boolean("");
		// jtest_tested_method
		THIS.setBold(t1);
		assertEquals(t1, THIS.getBold()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setDoubleUnderline(java.lang.Boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafStyle#setDoubleUnderline(java.lang.Boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDoubleUnderline1() throws Throwable {
		PafStyle THIS = new PafStyle();
		Boolean t1 = new Boolean(true);
		// jtest_tested_method
		THIS.setDoubleUnderline(t1);
		assertEquals(t1, THIS.getDoubleUnderline()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setFontColor(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafStyle#setFontColor(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetFontColor1() throws Throwable {
		PafStyle THIS = new PafStyle();
		// jtest_tested_method
		THIS.setFontColor("");
		assertEquals("", THIS.getFontColor()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setFontName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafStyle#setFontName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetFontName1() throws Throwable {
		PafStyle THIS = new PafStyle();
		// jtest_tested_method
		THIS.setFontName("");
		assertEquals("", THIS.getFontName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setItalics(java.lang.Boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafStyle#setItalics(java.lang.Boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetItalics1() throws Throwable {
		PafStyle THIS = new PafStyle();
		Boolean t1 = new Boolean("");
		// jtest_tested_method
		THIS.setItalics(t1);
		assertEquals(t1, THIS.getItalics()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafStyle#setName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetName1() throws Throwable {
		PafStyle THIS = new PafStyle();
		// jtest_tested_method
		THIS.setName("");
		assertEquals("", THIS.getName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setSize(java.lang.Integer)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafStyle#setSize(java.lang.Integer)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetSize1() throws Throwable {
		PafStyle THIS = new PafStyle();
		Integer t1 = new Integer(7);
		// jtest_tested_method
		THIS.setSize(t1);
		assertEquals(t1, THIS.getSize()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setStrikeOut(java.lang.Boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafStyle#setStrikeOut(java.lang.Boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetStrikeOut1() throws Throwable {
		PafStyle THIS = new PafStyle();
		Boolean t1 = new Boolean("");
		// jtest_tested_method
		THIS.setStrikeOut(t1);
		assertEquals(t1, THIS.getStrikeOut()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setUnderline(java.lang.Boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafStyle#setUnderline(java.lang.Boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetUnderline1() throws Throwable {
		PafStyle THIS = new PafStyle();
		Boolean t1 = new Boolean("");
		// jtest_tested_method
		THIS.setUnderline(t1);
		assertEquals(t1, THIS.getUnderline()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.view.PafStyleTest
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
			PafStyleTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.view.PafStyle",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafStyle.class;
	}

}

// JTEST_CURRENT_ID=800025931.