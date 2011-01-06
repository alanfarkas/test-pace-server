/*
 * PafRGBTest.java
 * Created by Jtest on 9/19/06 6:12:20 PM.
 * Updated by Jtest on 10/18/06 8:07:21 PM, 5 test cases added, 5 test cases removed.
 */

package com.palladium.paf.misc;

import com.palladium.paf.misc.PafRGB;

/**
 * PafRGBTest is a unit test class for class PafRGB.
 * @see com.palladium.paf.misc.PafRGB
 * @author Parasoft Jtest 8.0
 */
public class PafRGBTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafRGBTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getBlue()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafRGB#getBlue()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetBlue1() throws Throwable {
		PafRGB THIS = new PafRGB(0, 0, 0);
		// jtest_tested_method
		int RETVAL = THIS.getBlue();
		assertEquals(0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getBlue()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafRGB#getBlue()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetBlue3() throws Throwable {
		PafRGB THIS = new PafRGB(7, 7, 7);
		// jtest_tested_method
		int RETVAL = THIS.getBlue();
		assertEquals(7, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getGreen()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafRGB#getGreen()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetGreen1() throws Throwable {
		PafRGB THIS = new PafRGB(0, 0, 0);
		// jtest_tested_method
		int RETVAL = THIS.getGreen();
		assertEquals(0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getGreen()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafRGB#getGreen()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetGreen2() throws Throwable {
		PafRGB THIS = new PafRGB(7, 7, 7);
		THIS.setBlue(7);
		THIS.setGreen(7);
		THIS.setRed(7);
		// jtest_tested_method
		int RETVAL = THIS.getGreen();
		assertEquals(7, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getHexValue()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafRGB#getHexValue()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetHexValue1() throws Throwable {
		PafRGB THIS = new PafRGB(0, 0, 0);
		// jtest_tested_method
		String RETVAL = THIS.getHexValue();
		assertEquals("#000000", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getRed()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafRGB#getRed()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRed1() throws Throwable {
		PafRGB THIS = new PafRGB(0, 0, 0);
		// jtest_tested_method
		int RETVAL = THIS.getRed();
		assertEquals(0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getRed()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafRGB#getRed()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRed2() throws Throwable {
		PafRGB THIS = new PafRGB(7, 7, 7);
		THIS.setBlue(7);
		THIS.setGreen(7);
		THIS.setRed(7);
		// jtest_tested_method
		int RETVAL = THIS.getRed();
		assertEquals(7, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static hexStringToRGB(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafRGB#hexStringToRGB(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testHexStringToRGB1() throws Throwable {
		// jtest_tested_method
		PafRGB RETVAL = PafRGB.hexStringToRGB((String) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.misc.PafRGB.hexStringToRGB(Ljava/lang/String;)Lcom/palladium/paf/misc/PafRGB;>
		// at com.palladium.paf.misc.PafRGB.hexStringToRGB(PafRGB.java:93)
		// jtest_unverified
	}

	/**
	 * Test for method: static hexStringToRGB(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafRGB#hexStringToRGB(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testHexStringToRGB2() throws Throwable {
		// jtest_tested_method
		PafRGB RETVAL = PafRGB.hexStringToRGB("");
		// StringIndexOutOfBoundsException thrown
		// at java.lang.String.substring(String.java:1765)
		// at com.palladium.paf.misc.PafRGB.hexStringToRGB(PafRGB.java:93)
		// jtest_unverified
	}

	/**
	 * Test for method: PafRGB(int,int,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafRGB#PafRGB(int,int,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafRGB1() throws Throwable {
		// jtest_tested_method
		PafRGB THIS = new PafRGB(0, 0, 0);
		assertEquals("PafRGB {0, 0, 0}", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafRGB(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafRGB#PafRGB(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafRGB4() throws Throwable {
		// jtest_tested_method
		PafRGB THIS = new PafRGB("\000");
		assertEquals("PafRGB {0, 0, 0}", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafRGB(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafRGB#PafRGB(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafRGB5() throws Throwable {
		// jtest_tested_method
		PafRGB THIS = new PafRGB((String) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.misc.PafRGB.<init>(Ljava/lang/String;)V>
		// at com.palladium.paf.misc.PafRGB.<init>(PafRGB.java:21)
		// jtest_unverified
	}

	/**
	 * Test for method: PafRGB(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafRGB#PafRGB(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafRGB7() throws Throwable {
		// jtest_tested_method
		PafRGB THIS = new PafRGB("#");
		// StringIndexOutOfBoundsException thrown
		// at java.lang.String.substring(String.java:1765)
		// at com.palladium.paf.misc.PafRGB.hexStringToRGB(PafRGB.java:93)
		// at com.palladium.paf.misc.PafRGB.<init>(PafRGB.java:22)
		// jtest_unverified
	}

	/**
	 * Test for method: static rgbToHexString(com.palladium.paf.misc.PafRGB)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafRGB#rgbToHexString(com.palladium.paf.misc.PafRGB)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRgbToHexString1() throws Throwable {
		// jtest_tested_method
		String RETVAL = PafRGB.rgbToHexString((PafRGB) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.misc.PafRGB.rgbToHexString(Lcom/palladium/paf/misc/PafRGB;)Ljava/lang/String;>
		// at com.palladium.paf.misc.PafRGB.rgbToHexString(PafRGB.java:72)
		// jtest_unverified
	}

	/**
	 * Test for method: static rgbToHexString(com.palladium.paf.misc.PafRGB)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafRGB#rgbToHexString(com.palladium.paf.misc.PafRGB)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRgbToHexString2() throws Throwable {
		PafRGB t0 = new PafRGB("\000");
		// jtest_tested_method
		String RETVAL = PafRGB.rgbToHexString(t0);
		assertEquals("#000000", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setBlue(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafRGB#setBlue(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetBlue1() throws Throwable {
		PafRGB THIS = new PafRGB(7, 7, 7);
		THIS.setBlue(7);
		THIS.setGreen(7);
		THIS.setRed(7);
		// jtest_tested_method
		THIS.setBlue(7);
		assertEquals(7, THIS.getBlue()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setGreen(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafRGB#setGreen(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetGreen1() throws Throwable {
		PafRGB THIS = new PafRGB(7, 7, 7);
		THIS.setBlue(7);
		THIS.setGreen(7);
		THIS.setRed(7);
		// jtest_tested_method
		THIS.setGreen(7);
		assertEquals(7, THIS.getGreen()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setRed(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafRGB#setRed(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetRed1() throws Throwable {
		PafRGB THIS = new PafRGB(7, 7, 7);
		THIS.setBlue(7);
		THIS.setGreen(7);
		THIS.setRed(7);
		// jtest_tested_method
		THIS.setRed(7);
		assertEquals(7, THIS.getRed()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: toString()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafRGB#toString()
	 * @author Parasoft Jtest 8.0
	 */
	public void testToString1() throws Throwable {
		PafRGB THIS = new PafRGB(0, 0, 0);
		// jtest_tested_method
		String RETVAL = THIS.toString();
		assertEquals("PafRGB {0, 0, 0}", RETVAL); // jtest_unverified
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
	 * Usage: java com.palladium.paf.misc.PafRGBTest
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
			PafRGBTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.misc.PafRGB",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafRGB.class;
	}

}

// JTEST_CURRENT_ID=610479298.