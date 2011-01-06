/*
 * PropertyLoaderTest.java
 * Created by Jtest on 9/19/06 6:00:09 PM.
 * Updated by Jtest on 10/18/06 8:02:09 PM, 3 test cases added, 3 test cases removed.
 * Updated by Jtest on 11/9/06 3:03:33 AM, 3 test cases added, 3 test cases removed.
 */

package com.palladium.utility;

import java.util.Properties;
import com.palladium.utility.PropertyLoader;

/**
 * PropertyLoaderTest is a unit test class for class PropertyLoader.
 * @see com.palladium.utility.PropertyLoader
 * @author Parasoft Jtest 8.0
 */
public class PropertyLoaderTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PropertyLoaderTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: static loadProperties(java.lang.String,java.lang.ClassLoader)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PropertyLoader#loadProperties(java.lang.String,java.lang.ClassLoader)
	 * @author Parasoft Jtest 8.0
	 */
	public void testLoadProperties1() throws Throwable {
		// jtest_tested_method
		Properties RETVAL = PropertyLoader.loadProperties(
			(String) null,
			(ClassLoader) null);
		// IllegalArgumentException thrown
		// at com.palladium.utility.PropertyLoader.loadProperties(PropertyLoader.java:59)
		// jtest_unverified
	}

	/**
	 * Test for method: static loadProperties(java.lang.String,java.lang.ClassLoader)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PropertyLoader#loadProperties(java.lang.String,java.lang.ClassLoader)
	 * @author Parasoft Jtest 8.0
	 */
	public void testLoadProperties2() throws Throwable {
		// jtest_tested_method
		Properties RETVAL = PropertyLoader.loadProperties(
			"0",
			(ClassLoader) null);
		// IllegalArgumentException thrown
		// at com.palladium.utility.PropertyLoader.loadProperties(PropertyLoader.java:119)
		// jtest_unverified
	}

	/**
	 * Test for method: static loadProperties(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PropertyLoader#loadProperties(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testLoadProperties5() throws Throwable {
		// jtest_tested_method
		Properties RETVAL = PropertyLoader.loadProperties("/");
		// IllegalArgumentException thrown
		// at com.palladium.utility.PropertyLoader.loadProperties(PropertyLoader.java:119)
		// at com.palladium.utility.PropertyLoader.loadProperties(PropertyLoader.java:136)
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
	 * Usage: java com.palladium.utility.PropertyLoaderTest
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
			PropertyLoaderTest.class,
			// fully qualified name of the tested class
			"com.palladium.utility.PropertyLoader",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PropertyLoader.class;
	}

}

// JTEST_CURRENT_ID=-62831150.