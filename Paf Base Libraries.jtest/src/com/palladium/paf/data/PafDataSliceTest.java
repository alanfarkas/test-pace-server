/*
 * PafDataSliceTest.java
 * Created by Jtest on 9/19/06 5:50:17 PM.
 * Updated by Jtest on 10/18/06 8:13:54 PM, 5 test cases added, 5 test cases removed.
 */

package com.palladium.paf.data;

import com.palladium.paf.data.PafDataSlice;

/**
 * PafDataSliceTest is a unit test class for class PafDataSlice.
 * @see com.palladium.paf.data.PafDataSlice
 * @author Parasoft Jtest 8.0
 */
public class PafDataSliceTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafDataSliceTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: compressData()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataSlice#compressData()
	 * @author Parasoft Jtest 8.0
	 */
	public void testCompressData1() throws Throwable {
		PafDataSlice THIS = new PafDataSlice((double[]) null, 0);
		// jtest_tested_method
		THIS.compressData();
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.data.PafDataSlice.<init>([DI)V>
		// at com.palladium.paf.data.PafDataSlice.compressData(PafDataSlice.java:151)
		// jtest_unverified
	}

	/**
	 * Test for method: compressData()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataSlice#compressData()
	 * @author Parasoft Jtest 8.0
	 */
	public void testCompressData3() throws Throwable {
		PafDataSlice THIS = new PafDataSlice((double[]) null, 0);
		THIS.setColumnCount(0);
		double[] var1 = new double[] { 0.0 };
		THIS.setData(var1);
		THIS.setCompressedData("");
		THIS.setCompressed(false);
		// jtest_tested_method
		THIS.compressData();
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: compressData()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataSlice#compressData()
	 * @author Parasoft Jtest 8.0
	 */
	public void testCompressData5() throws Throwable {
		double[] var1 = new double[] {};
		PafDataSlice THIS = new PafDataSlice(var1, 7);
		// jtest_tested_method
		THIS.compressData();
		assertEquals("\n", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getColumnCount()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataSlice#getColumnCount()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetColumnCount1() throws Throwable {
		PafDataSlice THIS = new PafDataSlice((double[]) null, 0);
		// jtest_tested_method
		int RETVAL = THIS.getColumnCount();
		assertEquals(0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getColumnCount()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataSlice#getColumnCount()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetColumnCount3() throws Throwable {
		double[] var1 = new double[] {};
		PafDataSlice THIS = new PafDataSlice(var1, 7);
		// jtest_tested_method
		int RETVAL = THIS.getColumnCount();
		assertEquals(7, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getCompressedData()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataSlice#getCompressedData()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetCompressedData1() throws Throwable {
		PafDataSlice THIS = new PafDataSlice((double[]) null, 0);
		// jtest_tested_method
		String RETVAL = THIS.getCompressedData();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getCompressedData()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataSlice#getCompressedData()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetCompressedData2() throws Throwable {
		double[] var1 = new double[] {};
		PafDataSlice THIS = new PafDataSlice(var1, 7);
		THIS.setColumnCount(7);
		double[] var2 = new double[] {};
		THIS.setData(var2);
		THIS.setCompressedData("");
		THIS.setCompressed(true);
		// jtest_tested_method
		String RETVAL = THIS.getCompressedData();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getData()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataSlice#getData()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetData1() throws Throwable {
		PafDataSlice THIS = new PafDataSlice((double[]) null, 0);
		// jtest_tested_method
		double[] RETVAL = THIS.getData();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getData()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataSlice#getData()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetData2() throws Throwable {
		double[] var1 = new double[] {};
		PafDataSlice THIS = new PafDataSlice(var1, 7);
		THIS.setColumnCount(7);
		double[] var2 = new double[] {};
		THIS.setData(var2);
		THIS.setCompressedData("");
		THIS.setCompressed(true);
		// jtest_tested_method
		double[] RETVAL = THIS.getData();
		assertEquals(var2, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getRowCount()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataSlice#getRowCount()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRowCount1() throws Throwable {
		PafDataSlice THIS = new PafDataSlice((double[]) null, 0);
		// jtest_tested_method
		int RETVAL = THIS.getRowCount();
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.data.PafDataSlice.<init>([DI)V>
		// at com.palladium.paf.data.PafDataSlice.getRowCount(PafDataSlice.java:101)
		// jtest_unverified
	}

	/**
	 * Test for method: getRowCount()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataSlice#getRowCount()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRowCount2() throws Throwable {
		double[] var1 = new double[] {};
		PafDataSlice THIS = new PafDataSlice(var1, 0);
		// jtest_tested_method
		int RETVAL = THIS.getRowCount();
		// ArithmeticException thrown
		// at com.palladium.paf.data.PafDataSlice.getRowCount(PafDataSlice.java:101)
		// jtest_unverified
	}

	/**
	 * Test for method: getRowCount()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataSlice#getRowCount()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRowCount3() throws Throwable {
		PafDataSlice THIS = new PafDataSlice((double[]) null, 0);
		THIS.setColumnCount(1);
		double[] var1 = new double[] {};
		THIS.setData(var1);
		THIS.setCompressedData("");
		THIS.setCompressed(false);
		// jtest_tested_method
		int RETVAL = THIS.getRowCount();
		assertEquals(0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isCompressed()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataSlice#isCompressed()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsCompressed1() throws Throwable {
		double[] var1 = new double[] {};
		PafDataSlice THIS = new PafDataSlice(var1, 7);
		THIS.setColumnCount(7);
		double[] var2 = new double[] {};
		THIS.setData(var2);
		THIS.setCompressedData("");
		THIS.setCompressed(true);
		// jtest_tested_method
		boolean RETVAL = THIS.isCompressed();
		assertEquals(true, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafDataSlice(double[],int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataSlice#PafDataSlice(double[],int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataSlice1() throws Throwable {
		// jtest_tested_method
		PafDataSlice THIS = new PafDataSlice((double[]) null, 0);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafDataSlice(double[],int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataSlice#PafDataSlice(double[],int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataSlice2() throws Throwable {
		double[] var1 = new double[] {};
		// jtest_tested_method
		PafDataSlice THIS = new PafDataSlice(var1, 7);
		assertEquals("\n", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafDataSlice()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataSlice#PafDataSlice()
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataSlice3() throws Throwable {
		// jtest_tested_method
		PafDataSlice THIS = new PafDataSlice();
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setColumnCount(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataSlice#setColumnCount(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetColumnCount1() throws Throwable {
		double[] var1 = new double[] {};
		PafDataSlice THIS = new PafDataSlice(var1, 7);
		THIS.setColumnCount(7);
		double[] var2 = new double[] {};
		THIS.setData(var2);
		THIS.setCompressedData("");
		THIS.setCompressed(true);
		// jtest_tested_method
		THIS.setColumnCount(7);
		assertEquals(7, THIS.getColumnCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setCompressed(boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataSlice#setCompressed(boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetCompressed1() throws Throwable {
		PafDataSlice THIS = new PafDataSlice();
		// jtest_tested_method
		THIS.setCompressed(true);
		assertEquals(true, THIS.isCompressed()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setCompressedData(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataSlice#setCompressedData(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetCompressedData1() throws Throwable {
		double[] var1 = new double[] {};
		PafDataSlice THIS = new PafDataSlice(var1, 7);
		THIS.setColumnCount(7);
		double[] var2 = new double[] {};
		THIS.setData(var2);
		THIS.setCompressedData("");
		THIS.setCompressed(true);
		// jtest_tested_method
		THIS.setCompressedData("");
		assertEquals("", THIS.getCompressedData()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setData(double[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataSlice#setData(double[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetData1() throws Throwable {
		double[] var1 = new double[] {};
		PafDataSlice THIS = new PafDataSlice(var1, 7);
		THIS.setColumnCount(7);
		double[] var2 = new double[] {};
		THIS.setData(var2);
		THIS.setCompressedData("");
		THIS.setCompressed(true);
		double[] var3 = new double[] {};
		// jtest_tested_method
		THIS.setData(var3);
		assertSame(var3, THIS.getData()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: toString()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataSlice#toString()
	 * @author Parasoft Jtest 8.0
	 */
	public void testToString1() throws Throwable {
		double[] var1 = new double[] {};
		PafDataSlice THIS = new PafDataSlice(var1, 1);
		// jtest_tested_method
		String RETVAL = THIS.toString();
		assertEquals("\n", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: toString()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataSlice#toString()
	 * @author Parasoft Jtest 8.0
	 */
	public void testToString3() throws Throwable {
		PafDataSlice THIS = new PafDataSlice();
		// jtest_tested_method
		String RETVAL = THIS.toString();
		// NullPointerException thrown
		// at com.palladium.paf.data.PafDataSlice.getRowCount(PafDataSlice.java:101)
		// at com.palladium.paf.data.PafDataSlice.toString(PafDataSlice.java:113)
		// jtest_unverified
	}

	/**
	 * Test for method: umcompressData()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataSlice#umcompressData()
	 * @author Parasoft Jtest 8.0
	 */
	public void testUmcompressData2() throws Throwable {
		PafDataSlice THIS = new PafDataSlice((double[]) null, 0);
		THIS.setColumnCount(0);
		double[] var1 = new double[] {};
		THIS.setData(var1);
		THIS.setCompressedData("");
		THIS.setCompressed(true);
		// jtest_tested_method
		THIS.umcompressData();
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: umcompressData()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataSlice#umcompressData()
	 * @author Parasoft Jtest 8.0
	 */
	public void testUmcompressData4() throws Throwable {
		PafDataSlice THIS = new PafDataSlice((double[]) null, 0);
		THIS.setColumnCount(0);
		double[] var1 = new double[] {};
		THIS.setData(var1);
		THIS.setCompressedData("00");
		THIS.setCompressed(true);
		// jtest_tested_method
		THIS.umcompressData();
		// StringIndexOutOfBoundsException thrown
		// at java.lang.String.substring(String.java:1765)
		// at com.palladium.paf.data.PafDataSlice.umcompressData(PafDataSlice.java:186)
		// jtest_unverified
	}

	/**
	 * Test for method: umcompressData()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataSlice#umcompressData()
	 * @author Parasoft Jtest 8.0
	 */
	public void testUmcompressData5() throws Throwable {
		double[] var1 = new double[] {};
		PafDataSlice THIS = new PafDataSlice(var1, 7);
		// jtest_tested_method
		THIS.umcompressData();
		assertEquals("\n", THIS.toString()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.data.PafDataSliceTest
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
			PafDataSliceTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.data.PafDataSlice",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafDataSlice.class;
	}

}

// JTEST_CURRENT_ID=-1021499682.