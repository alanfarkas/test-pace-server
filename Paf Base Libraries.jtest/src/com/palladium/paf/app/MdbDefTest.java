/*
 * MdbDefTest.java
 * Created by Jtest on 9/19/06 5:47:16 PM.
 */

package com.palladium.paf.app;

import com.palladium.paf.app.MdbDef;

/**
 * MdbDefTest is a unit test class for class MdbDef.
 * @see com.palladium.paf.app.MdbDef
 * @author Parasoft Jtest 8.0
 */
public class MdbDefTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public MdbDefTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getAllDims()
	 * @throws Throwable Tests may throw any Throwable
	 * @see MdbDef#getAllDims()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAllDims1() throws Throwable {
		MdbDef THIS = new MdbDef();
		// jtest_tested_method
		String[] RETVAL = THIS.getAllDims();
		// NullPointerException thrown
		// at com.palladium.paf.app.MdbDef.getDimCount(MdbDef.java:118)
		// at com.palladium.paf.app.MdbDef.getAllDims(MdbDef.java:137)
		// jtest_unverified
	}

	/**
	 * Test for method: getAllDims()
	 * @throws Throwable Tests may throw any Throwable
	 * @see MdbDef#getAllDims()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAllDims2() throws Throwable {
		MdbDef THIS = new MdbDef();
		THIS.setYearDim("");
		String[] var1 = new String[] {};
		THIS.setHierDims(var1);
		THIS.setMeasureDim("");
		THIS.setPlanTypeDim("");
		THIS.setTimeDim("");
		THIS.setVersionDim("");
		THIS.setDataSourceId("");
		String[] var2 = new String[] {};
		THIS.setAxisPriority(var2);
		// jtest_tested_method
		String[] RETVAL = THIS.getAllDims();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(5, RETVAL.length); // jtest_unverified
		assertEquals("", RETVAL[0]); // jtest_unverified
		assertEquals("", RETVAL[1]); // jtest_unverified
		assertEquals("", RETVAL[2]); // jtest_unverified
		assertEquals("", RETVAL[4]); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getAllDims()
	 * @throws Throwable Tests may throw any Throwable
	 * @see MdbDef#getAllDims()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAllDims3() throws Throwable {
		MdbDef THIS = new MdbDef();
		THIS.setYearDim("");
		String[] var1 = new String[] { null };
		THIS.setHierDims(var1);
		THIS.setMeasureDim("");
		THIS.setPlanTypeDim("");
		THIS.setTimeDim("");
		THIS.setVersionDim("");
		THIS.setDataSourceId("");
		String[] var2 = new String[] {};
		THIS.setAxisPriority(var2);
		// jtest_tested_method
		String[] RETVAL = THIS.getAllDims();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(6, RETVAL.length); // jtest_unverified
		assertEquals("", RETVAL[0]); // jtest_unverified
		assertEquals("", RETVAL[1]); // jtest_unverified
		assertEquals("", RETVAL[2]); // jtest_unverified
		assertEquals(null, RETVAL[5]); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getAllDims()
	 * @throws Throwable Tests may throw any Throwable
	 * @see MdbDef#getAllDims()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAllDims4() throws Throwable {
		MdbDef THIS = new MdbDef();
		THIS.setYearDim("");
		String[] var1 = new String[] { null, null, null, null, null, null,
				null, null };
		THIS.setHierDims(var1);
		THIS.setMeasureDim("");
		THIS.setPlanTypeDim("");
		THIS.setTimeDim("");
		THIS.setVersionDim("");
		THIS.setDataSourceId("");
		String[] var2 = new String[] {};
		THIS.setAxisPriority(var2);
		// jtest_tested_method
		String[] RETVAL = THIS.getAllDims();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(13, RETVAL.length); // jtest_unverified
		assertEquals("", RETVAL[0]); // jtest_unverified
		assertEquals("", RETVAL[1]); // jtest_unverified
		assertEquals("", RETVAL[2]); // jtest_unverified
		assertEquals(null, RETVAL[12]); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getAxisPriority()
	 * @throws Throwable Tests may throw any Throwable
	 * @see MdbDef#getAxisPriority()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAxisPriority1() throws Throwable {
		MdbDef THIS = new MdbDef();
		// jtest_tested_method
		String[] RETVAL = THIS.getAxisPriority();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDataSourceId()
	 * @throws Throwable Tests may throw any Throwable
	 * @see MdbDef#getDataSourceId()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataSourceId1() throws Throwable {
		MdbDef THIS = new MdbDef();
		// jtest_tested_method
		String RETVAL = THIS.getDataSourceId();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDimCount()
	 * @throws Throwable Tests may throw any Throwable
	 * @see MdbDef#getDimCount()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDimCount1() throws Throwable {
		MdbDef THIS = new MdbDef();
		// jtest_tested_method
		int RETVAL = THIS.getDimCount();
		// NullPointerException thrown
		// at com.palladium.paf.app.MdbDef.getDimCount(MdbDef.java:118)
		// jtest_unverified
	}

	/**
	 * Test for method: getDimCount()
	 * @throws Throwable Tests may throw any Throwable
	 * @see MdbDef#getDimCount()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDimCount2() throws Throwable {
		MdbDef THIS = new MdbDef();
		THIS.setYearDim("");
		String[] var1 = new String[] {};
		THIS.setHierDims(var1);
		THIS.setMeasureDim("");
		THIS.setPlanTypeDim("");
		THIS.setTimeDim("");
		THIS.setVersionDim("");
		THIS.setDataSourceId("");
		String[] var2 = new String[] {};
		THIS.setAxisPriority(var2);
		// jtest_tested_method
		int RETVAL = THIS.getDimCount();
		assertEquals(5, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getHierDims()
	 * @throws Throwable Tests may throw any Throwable
	 * @see MdbDef#getHierDims()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetHierDims1() throws Throwable {
		MdbDef THIS = new MdbDef();
		// jtest_tested_method
		String[] RETVAL = THIS.getHierDims();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getMeasureDim()
	 * @throws Throwable Tests may throw any Throwable
	 * @see MdbDef#getMeasureDim()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMeasureDim1() throws Throwable {
		MdbDef THIS = new MdbDef();
		// jtest_tested_method
		String RETVAL = THIS.getMeasureDim();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPlanTypeDim()
	 * @throws Throwable Tests may throw any Throwable
	 * @see MdbDef#getPlanTypeDim()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPlanTypeDim1() throws Throwable {
		MdbDef THIS = new MdbDef();
		// jtest_tested_method
		String RETVAL = THIS.getPlanTypeDim();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getTimeDim()
	 * @throws Throwable Tests may throw any Throwable
	 * @see MdbDef#getTimeDim()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetTimeDim1() throws Throwable {
		MdbDef THIS = new MdbDef();
		// jtest_tested_method
		String RETVAL = THIS.getTimeDim();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getVersionDim()
	 * @throws Throwable Tests may throw any Throwable
	 * @see MdbDef#getVersionDim()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetVersionDim1() throws Throwable {
		MdbDef THIS = new MdbDef();
		// jtest_tested_method
		String RETVAL = THIS.getVersionDim();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getYearDim()
	 * @throws Throwable Tests may throw any Throwable
	 * @see MdbDef#getYearDim()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetYearDim1() throws Throwable {
		MdbDef THIS = new MdbDef();
		// jtest_tested_method
		String RETVAL = THIS.getYearDim();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getYearDim()
	 * @throws Throwable Tests may throw any Throwable
	 * @see MdbDef#getYearDim()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetYearDim2() throws Throwable {
		MdbDef THIS = new MdbDef();
		THIS.setYearDim("");
		String[] var1 = new String[] {};
		THIS.setHierDims(var1);
		THIS.setMeasureDim("");
		THIS.setPlanTypeDim("");
		THIS.setTimeDim("");
		THIS.setVersionDim("");
		THIS.setDataSourceId("");
		String[] var2 = new String[] {};
		THIS.setAxisPriority(var2);
		// jtest_tested_method
		String RETVAL = THIS.getYearDim();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setAxisPriority(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see MdbDef#setAxisPriority(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetAxisPriority1() throws Throwable {
		MdbDef THIS = new MdbDef();
		String[] var1 = new String[] {};
		// jtest_tested_method
		THIS.setAxisPriority(var1);
		assertSame(var1, THIS.getAxisPriority()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setDataSourceId(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see MdbDef#setDataSourceId(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDataSourceId1() throws Throwable {
		MdbDef THIS = new MdbDef();
		// jtest_tested_method
		THIS.setDataSourceId("");
		assertEquals("", THIS.getDataSourceId()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setHierDims(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see MdbDef#setHierDims(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetHierDims1() throws Throwable {
		MdbDef THIS = new MdbDef();
		String[] var1 = new String[] {};
		// jtest_tested_method
		THIS.setHierDims(var1);
		assertSame(var1, THIS.getHierDims()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setMeasureDim(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see MdbDef#setMeasureDim(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetMeasureDim1() throws Throwable {
		MdbDef THIS = new MdbDef();
		// jtest_tested_method
		THIS.setMeasureDim("");
		assertEquals("", THIS.getMeasureDim()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setPlanTypeDim(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see MdbDef#setPlanTypeDim(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetPlanTypeDim1() throws Throwable {
		MdbDef THIS = new MdbDef();
		// jtest_tested_method
		THIS.setPlanTypeDim("");
		assertEquals("", THIS.getPlanTypeDim()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setTimeDim(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see MdbDef#setTimeDim(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetTimeDim1() throws Throwable {
		MdbDef THIS = new MdbDef();
		// jtest_tested_method
		THIS.setTimeDim("");
		assertEquals("", THIS.getTimeDim()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setVersionDim(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see MdbDef#setVersionDim(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetVersionDim1() throws Throwable {
		MdbDef THIS = new MdbDef();
		// jtest_tested_method
		THIS.setVersionDim("");
		assertEquals("", THIS.getVersionDim()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setYearDim(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see MdbDef#setYearDim(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetYearDim1() throws Throwable {
		MdbDef THIS = new MdbDef();
		// jtest_tested_method
		THIS.setYearDim("");
		assertEquals("", THIS.getYearDim()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.app.MdbDefTest
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
			MdbDefTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.app.MdbDef",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return MdbDef.class;
	}

}

// JTEST_CURRENT_ID=-1037526450.