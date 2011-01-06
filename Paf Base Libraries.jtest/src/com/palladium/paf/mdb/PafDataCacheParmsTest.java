/*
 * PafDataCacheParmsTest.java
 * Created by Jtest on 9/19/06 5:26:15 PM.
 */

package com.palladium.paf.mdb;

import com.palladium.paf.app.PafApplicationDef;
import jtest.Stubs;
import java.util.Set;
import com.palladium.paf.mdb.PafDataCacheParms;

/**
 * PafDataCacheParmsTest is a unit test class for class PafDataCacheParms.
 * @see com.palladium.paf.mdb.PafDataCacheParms
 * @author Parasoft Jtest 8.0
 */
public class PafDataCacheParmsTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafDataCacheParmsTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getActiveVersions()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheParms#getActiveVersions()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetActiveVersions1() throws Throwable {
		PafDataCacheParms THIS = new PafDataCacheParms();
		// jtest_tested_method
		String[] RETVAL = THIS.getActiveVersions();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getAppDef()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheParms#getAppDef()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAppDef1() throws Throwable {
		PafDataCacheParms THIS = new PafDataCacheParms();
		// jtest_tested_method
		PafApplicationDef RETVAL = THIS.getAppDef();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getAxisCount()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheParms#getAxisCount()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAxisCount1() throws Throwable {
		PafDataCacheParms THIS = new PafDataCacheParms();
		// jtest_tested_method
		int RETVAL = THIS.getAxisCount();
		assertEquals(0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getAxisCount()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheParms#getAxisCount()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAxisCount3() throws Throwable {
		PafDataCacheParms THIS = new PafDataCacheParms();
		PafApplicationDef t1 = new PafApplicationDef();
		THIS.setAxisCount(7);
		int[] var1 = new int[] {};
		THIS.setAxisSize(var1);
		int[] var2 = new int[] {};
		THIS.setDimCountByAxis(var2);
		String[] var3 = new String[] {};
		THIS.setDimensions(var3);
		boolean[] var4 = new boolean[] {};
		THIS.setIsSlicerAxis(var4);
		THIS.setMdxQuery("");
		String[][] var5 = new String[][] {};
		THIS.setMemberArray(var5);
		Set var6 = (Set) Stubs.makeStubObject(Set.class);
		THIS.setLockedPeriods(var6);
		THIS.setAppDef(t1);
		String[] var7 = new String[] {};
		THIS.setActiveVersion(var7);
		// jtest_tested_method
		int RETVAL = THIS.getAxisCount();
		assertEquals(7, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getAxisSize()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheParms#getAxisSize()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAxisSize1() throws Throwable {
		PafDataCacheParms THIS = new PafDataCacheParms();
		// jtest_tested_method
		int[] RETVAL = THIS.getAxisSize();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDimCountByAxis()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheParms#getDimCountByAxis()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDimCountByAxis1() throws Throwable {
		PafDataCacheParms THIS = new PafDataCacheParms();
		// jtest_tested_method
		int[] RETVAL = THIS.getDimCountByAxis();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDimensions()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheParms#getDimensions()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDimensions1() throws Throwable {
		PafDataCacheParms THIS = new PafDataCacheParms();
		// jtest_tested_method
		String[] RETVAL = THIS.getDimensions();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getIsSlicerAxis()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheParms#getIsSlicerAxis()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetIsSlicerAxis1() throws Throwable {
		PafDataCacheParms THIS = new PafDataCacheParms();
		// jtest_tested_method
		boolean[] RETVAL = THIS.getIsSlicerAxis();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getLockedPeriods()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheParms#getLockedPeriods()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLockedPeriods1() throws Throwable {
		PafDataCacheParms THIS = new PafDataCacheParms();
		// jtest_tested_method
		Set RETVAL = THIS.getLockedPeriods();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getMdxQuery()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheParms#getMdxQuery()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMdxQuery1() throws Throwable {
		PafDataCacheParms THIS = new PafDataCacheParms();
		// jtest_tested_method
		String RETVAL = THIS.getMdxQuery();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getMemberArray()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheParms#getMemberArray()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberArray1() throws Throwable {
		PafDataCacheParms THIS = new PafDataCacheParms();
		// jtest_tested_method
		String[][] RETVAL = THIS.getMemberArray();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafDataCacheParms()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheParms#PafDataCacheParms()
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCacheParms1() throws Throwable {
		// jtest_tested_method
		PafDataCacheParms THIS = new PafDataCacheParms();
		assertEquals(null, THIS.getActiveVersions()); // jtest_unverified
		assertEquals(null, THIS.getAppDef()); // jtest_unverified
		assertEquals(0, THIS.getAxisCount()); // jtest_unverified
		assertEquals(null, THIS.getAxisSize()); // jtest_unverified
		assertEquals(null, THIS.getDimCountByAxis()); // jtest_unverified
		assertEquals(null, THIS.getDimensions()); // jtest_unverified
		assertEquals(null, THIS.getIsSlicerAxis()); // jtest_unverified
		assertEquals(null, THIS.getLockedPeriods()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setActiveVersion(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheParms#setActiveVersion(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetActiveVersion1() throws Throwable {
		PafDataCacheParms THIS = new PafDataCacheParms();
		String[] var1 = new String[] {};
		// jtest_tested_method
		THIS.setActiveVersion(var1);
		assertSame(var1, THIS.getActiveVersions()); // jtest_unverified
		assertEquals(null, THIS.getAppDef()); // jtest_unverified
		assertEquals(0, THIS.getAxisCount()); // jtest_unverified
		assertEquals(null, THIS.getAxisSize()); // jtest_unverified
		assertEquals(null, THIS.getDimCountByAxis()); // jtest_unverified
		assertEquals(null, THIS.getDimensions()); // jtest_unverified
		assertEquals(null, THIS.getIsSlicerAxis()); // jtest_unverified
		assertEquals(null, THIS.getLockedPeriods()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setAppDef(com.palladium.paf.app.PafApplicationDef)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheParms#setAppDef(com.palladium.paf.app.PafApplicationDef)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetAppDef1() throws Throwable {
		PafDataCacheParms THIS = new PafDataCacheParms();
		PafApplicationDef t1 = new PafApplicationDef();
		// jtest_tested_method
		THIS.setAppDef(t1);
		assertEquals(t1, THIS.getAppDef()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setAxisCount(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheParms#setAxisCount(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetAxisCount1() throws Throwable {
		PafDataCacheParms THIS = new PafDataCacheParms();
		// jtest_tested_method
		THIS.setAxisCount(7);
		assertEquals(7, THIS.getAxisCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setAxisSize(int[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheParms#setAxisSize(int[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetAxisSize1() throws Throwable {
		PafDataCacheParms THIS = new PafDataCacheParms();
		int[] var1 = new int[] {};
		// jtest_tested_method
		THIS.setAxisSize(var1);
		assertSame(var1, THIS.getAxisSize()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setDimCountByAxis(int[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheParms#setDimCountByAxis(int[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDimCountByAxis1() throws Throwable {
		PafDataCacheParms THIS = new PafDataCacheParms();
		int[] var1 = new int[] {};
		// jtest_tested_method
		THIS.setDimCountByAxis(var1);
		assertSame(var1, THIS.getDimCountByAxis()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setDimensions(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheParms#setDimensions(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDimensions1() throws Throwable {
		PafDataCacheParms THIS = new PafDataCacheParms();
		String[] var1 = new String[] {};
		// jtest_tested_method
		THIS.setDimensions(var1);
		assertSame(var1, THIS.getDimensions()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setIsSlicerAxis(boolean[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheParms#setIsSlicerAxis(boolean[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetIsSlicerAxis1() throws Throwable {
		PafDataCacheParms THIS = new PafDataCacheParms();
		boolean[] var1 = new boolean[] {};
		// jtest_tested_method
		THIS.setIsSlicerAxis(var1);
		assertSame(var1, THIS.getIsSlicerAxis()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setLockedPeriods(java.util.Set)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheParms#setLockedPeriods(java.util.Set)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetLockedPeriods1() throws Throwable {
		PafDataCacheParms THIS = new PafDataCacheParms();
		Set var1 = (Set) Stubs.makeStubObject(Set.class);
		// jtest_tested_method
		THIS.setLockedPeriods(var1);
		assertEquals(var1, THIS.getLockedPeriods()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setMdxQuery(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheParms#setMdxQuery(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetMdxQuery1() throws Throwable {
		PafDataCacheParms THIS = new PafDataCacheParms();
		// jtest_tested_method
		THIS.setMdxQuery("");
		assertEquals("", THIS.getMdxQuery()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setMemberArray(java.lang.String[][])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheParms#setMemberArray(java.lang.String[][])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetMemberArray1() throws Throwable {
		PafDataCacheParms THIS = new PafDataCacheParms();
		String[][] var1 = new String[][] {};
		// jtest_tested_method
		THIS.setMemberArray(var1);
		assertSame(var1, THIS.getMemberArray()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.mdb.PafDataCacheParmsTest
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
			PafDataCacheParmsTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.mdb.PafDataCacheParms",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafDataCacheParms.class;
	}

}

// JTEST_CURRENT_ID=-1440470654.