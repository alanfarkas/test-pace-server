/*
 * EvaluateViewRequestTest.java
 * Created by Jtest on 9/19/06 5:57:09 PM.
 */

package com.palladium.paf.comm;

import com.palladium.paf.data.PafDataSlice;
import com.palladium.paf.comm.EvaluateViewRequest;

/**
 * EvaluateViewRequestTest is a unit test class for class EvaluateViewRequest.
 * @see com.palladium.paf.comm.EvaluateViewRequest
 * @author Parasoft Jtest 8.0
 */
public class EvaluateViewRequestTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public EvaluateViewRequestTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getChangedCells()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvaluateViewRequest#getChangedCells()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetChangedCells1() throws Throwable {
		EvaluateViewRequest THIS = new EvaluateViewRequest();
		// jtest_tested_method
		SimpleCoordList RETVAL = THIS.getChangedCells();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDataSlice()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvaluateViewRequest#getDataSlice()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataSlice1() throws Throwable {
		EvaluateViewRequest THIS = new EvaluateViewRequest();
		// jtest_tested_method
		PafDataSlice RETVAL = THIS.getDataSlice();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getLockedCells()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvaluateViewRequest#getLockedCells()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLockedCells1() throws Throwable {
		EvaluateViewRequest THIS = new EvaluateViewRequest();
		// jtest_tested_method
		SimpleCoordList RETVAL = THIS.getLockedCells();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getMeasureSetKey()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvaluateViewRequest#getMeasureSetKey()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMeasureSetKey1() throws Throwable {
		EvaluateViewRequest THIS = new EvaluateViewRequest();
		// jtest_tested_method
		int RETVAL = THIS.getMeasureSetKey();
		assertEquals(0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getProtectedCells()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvaluateViewRequest#getProtectedCells()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetProtectedCells1() throws Throwable {
		EvaluateViewRequest THIS = new EvaluateViewRequest();
		// jtest_tested_method
		SimpleCoordList RETVAL = THIS.getProtectedCells();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getProtectedFormulas()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvaluateViewRequest#getProtectedFormulas()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetProtectedFormulas1() throws Throwable {
		EvaluateViewRequest THIS = new EvaluateViewRequest();
		// jtest_tested_method
		String[] RETVAL = THIS.getProtectedFormulas();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getProtectedFormulas()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvaluateViewRequest#getProtectedFormulas()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetProtectedFormulas2() throws Throwable {
		EvaluateViewRequest THIS = new EvaluateViewRequest();
		SimpleCoordList t1 = new SimpleCoordList();
		PafDataSlice t2 = new PafDataSlice((double[]) null, 0);
		SimpleCoordList t3 = new SimpleCoordList();
		SimpleCoordList t4 = new SimpleCoordList();
		String[] var1 = new String[] {};
		THIS.setProtectedFormulas(var1);
		THIS.setChangedCells(t1);
		THIS.setDataSlice(t2);
		String[] var2 = new String[] {};
		t3.setAxis(var2);
		String[] var3 = new String[] {};
		t3.setCoordinates(var3);
		THIS.setLockedCells(t3);
		THIS.setProtectedCells(t4);
		THIS.setMeasureSetKey(0);
		THIS.setViewName("");
		THIS.setRuleSetName("");
		// jtest_tested_method
		String[] RETVAL = THIS.getProtectedFormulas();
		assertEquals(var1, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getRuleSetName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvaluateViewRequest#getRuleSetName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRuleSetName1() throws Throwable {
		EvaluateViewRequest THIS = new EvaluateViewRequest();
		// jtest_tested_method
		String RETVAL = THIS.getRuleSetName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getViewName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvaluateViewRequest#getViewName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetViewName1() throws Throwable {
		EvaluateViewRequest THIS = new EvaluateViewRequest();
		// jtest_tested_method
		String RETVAL = THIS.getViewName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setChangedCells(com.palladium.paf.comm.SimpleCoordList)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvaluateViewRequest#setChangedCells(com.palladium.paf.comm.SimpleCoordList)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetChangedCells1() throws Throwable {
		EvaluateViewRequest THIS = new EvaluateViewRequest();
		SimpleCoordList t1 = new SimpleCoordList();
		String[] var1 = new String[] {};
		t1.setAxis(var1);
		String[] var2 = new String[] {};
		t1.setCoordinates(var2);
		// jtest_tested_method
		THIS.setChangedCells(t1);
		assertEquals(t1, THIS.getChangedCells()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setDataSlice(com.palladium.paf.data.PafDataSlice)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvaluateViewRequest#setDataSlice(com.palladium.paf.data.PafDataSlice)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDataSlice1() throws Throwable {
		EvaluateViewRequest THIS = new EvaluateViewRequest();
		PafDataSlice t1 = new PafDataSlice();
		t1.setColumnCount(7);
		double[] var1 = new double[] {};
		t1.setData(var1);
		t1.setCompressedData("");
		t1.setCompressed(true);
		// jtest_tested_method
		THIS.setDataSlice(t1);
		assertEquals(t1, THIS.getDataSlice()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setLockedCells(com.palladium.paf.comm.SimpleCoordList)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvaluateViewRequest#setLockedCells(com.palladium.paf.comm.SimpleCoordList)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetLockedCells1() throws Throwable {
		EvaluateViewRequest THIS = new EvaluateViewRequest();
		SimpleCoordList t1 = new SimpleCoordList();
		String[] var1 = new String[] {};
		t1.setAxis(var1);
		String[] var2 = new String[] {};
		t1.setCoordinates(var2);
		// jtest_tested_method
		THIS.setLockedCells(t1);
		assertEquals(t1, THIS.getLockedCells()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setMeasureSetKey(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvaluateViewRequest#setMeasureSetKey(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetMeasureSetKey1() throws Throwable {
		EvaluateViewRequest THIS = new EvaluateViewRequest();
		// jtest_tested_method
		THIS.setMeasureSetKey(7);
		assertEquals(7, THIS.getMeasureSetKey()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setProtectedCells(com.palladium.paf.comm.SimpleCoordList)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvaluateViewRequest#setProtectedCells(com.palladium.paf.comm.SimpleCoordList)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetProtectedCells1() throws Throwable {
		EvaluateViewRequest THIS = new EvaluateViewRequest();
		SimpleCoordList t1 = new SimpleCoordList();
		String[] var1 = new String[] {};
		t1.setAxis(var1);
		String[] var2 = new String[] {};
		t1.setCoordinates(var2);
		// jtest_tested_method
		THIS.setProtectedCells(t1);
		assertEquals(t1, THIS.getProtectedCells()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setProtectedFormulas(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvaluateViewRequest#setProtectedFormulas(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetProtectedFormulas1() throws Throwable {
		EvaluateViewRequest THIS = new EvaluateViewRequest();
		String[] var1 = new String[] {};
		// jtest_tested_method
		THIS.setProtectedFormulas(var1);
		assertSame(var1, THIS.getProtectedFormulas()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setRuleSetName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvaluateViewRequest#setRuleSetName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetRuleSetName1() throws Throwable {
		EvaluateViewRequest THIS = new EvaluateViewRequest();
		// jtest_tested_method
		THIS.setRuleSetName("");
		assertEquals("", THIS.getRuleSetName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setViewName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvaluateViewRequest#setViewName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetViewName1() throws Throwable {
		EvaluateViewRequest THIS = new EvaluateViewRequest();
		// jtest_tested_method
		THIS.setViewName("");
		assertEquals("", THIS.getViewName()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.comm.EvaluateViewRequestTest
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
			EvaluateViewRequestTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.comm.EvaluateViewRequest",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return EvaluateViewRequest.class;
	}

}

// JTEST_CURRENT_ID=-453824024.