/*
 * PafConnectionPropsTest.java
 * Created by Jtest on 9/19/06 5:26:35 PM.
 */

package com.palladium.paf.mdb;

import java.util.Properties;
import com.palladium.paf.mdb.PafConnectionProps;

/**
 * PafConnectionPropsTest is a unit test class for class PafConnectionProps.
 * @see com.palladium.paf.mdb.PafConnectionProps
 * @author Parasoft Jtest 8.0
 */
public class PafConnectionPropsTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafConnectionPropsTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getDataServiceProvider()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafConnectionProps#getDataServiceProvider()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataServiceProvider1() throws Throwable {
		PafConnectionProps THIS = new PafConnectionProps();
		// jtest_tested_method
		String RETVAL = THIS.getDataServiceProvider();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getMetaDataServiceProvider()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafConnectionProps#getMetaDataServiceProvider()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMetaDataServiceProvider1() throws Throwable {
		PafConnectionProps THIS = new PafConnectionProps();
		// jtest_tested_method
		String RETVAL = THIS.getMetaDataServiceProvider();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getProperties()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafConnectionProps#getProperties()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetProperties1() throws Throwable {
		PafConnectionProps THIS = new PafConnectionProps();
		// jtest_tested_method
		Properties RETVAL = THIS.getProperties();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafConnectionProps()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafConnectionProps#PafConnectionProps()
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafConnectionProps1() throws Throwable {
		// jtest_tested_method
		PafConnectionProps THIS = new PafConnectionProps();
		assertEquals(null, THIS.getProperties()); // jtest_unverified
		assertEquals(null, THIS.getDataServiceProvider()); // jtest_unverified
		assertEquals(null, THIS.getMetaDataServiceProvider()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setConnectionString(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafConnectionProps#setConnectionString(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetConnectionString1() throws Throwable {
		PafConnectionProps THIS = new PafConnectionProps();
		// jtest_tested_method
		THIS.setConnectionString((String) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.mdb.PafConnectionProps.setConnectionString(Ljava/lang/String;)V>
		// at com.palladium.paf.mdb.PafConnectionProps.parseConnString(PafConnectionProps.java:27)
		// at com.palladium.paf.mdb.PafConnectionProps.setConnectionString(PafConnectionProps.java:18)
		// jtest_unverified
	}

	/**
	 * Test for method: setConnectionString(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafConnectionProps#setConnectionString(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetConnectionString2() throws Throwable {
		PafConnectionProps THIS = new PafConnectionProps();
		// jtest_tested_method
		THIS.setConnectionString("");
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafConnectionProps.parseConnString(PafConnectionProps.java:31)
		// at com.palladium.paf.mdb.PafConnectionProps.setConnectionString(PafConnectionProps.java:18)
		// jtest_unverified
	}

	/**
	 * Test for method: setDataServiceProvider(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafConnectionProps#setDataServiceProvider(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDataServiceProvider1() throws Throwable {
		PafConnectionProps THIS = new PafConnectionProps();
		// jtest_tested_method
		THIS.setDataServiceProvider("");
		assertEquals("", THIS.getDataServiceProvider()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setMetaDataServiceProvider(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafConnectionProps#setMetaDataServiceProvider(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetMetaDataServiceProvider1() throws Throwable {
		PafConnectionProps THIS = new PafConnectionProps();
		// jtest_tested_method
		THIS.setMetaDataServiceProvider("");
		assertEquals("", THIS.getMetaDataServiceProvider()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.mdb.PafConnectionPropsTest
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
			PafConnectionPropsTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.mdb.PafConnectionProps",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafConnectionProps.class;
	}

}

// JTEST_CURRENT_ID=1451841290.