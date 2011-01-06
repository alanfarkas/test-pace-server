/*
 * FileUtilityTest.java
 * Created by Jtest on 9/19/06 4:51:03 PM.
 * Updated by Jtest on 10/18/06 9:05:58 AM, 3 test cases added, 3 test cases removed.
 * Updated by Jtest on 11/8/06 6:19:11 PM, 3 test cases added, 3 test cases removed.
 */

package com.palladium.paf.utils;

import java.io.File;
import jtest.Stubs;
import java.lang.reflect.Member;
import com.palladium.paf.utils.FileUtility;

/**
 * FileUtilityTest is a unit test class for class FileUtility.
 * @see com.palladium.paf.utils.FileUtility
 * @author Parasoft Jtest 8.0
 */
public class FileUtilityTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public FileUtilityTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: static verifyFileStatus(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see FileUtility#verifyFileStatus(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testVerifyFileStatus1() throws Throwable {
		// jtest_tested_method
		FileUtility.verifyFileStatus((String) null);
		// NullPointerException thrown, originator is possible setup problem
		// at java.io.File.<init>
		// at com.palladium.paf.utils.FileUtility.verifyFileStatus(FileUtility.java:43)
		// jtest_unverified
	}

	/**
	 * Test for method: static verifyFileStatus(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see FileUtility#verifyFileStatus(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testVerifyFileStatus2() throws Throwable {
		// jtest_tested_method
		FileUtility.verifyFileStatus((String) null);
		// jtest.RuntimeExitCalled thrown
		// at com.palladium.paf.utils.FileUtility.verifyFileStatus(FileUtility.java:49)
		// jtest_unverified
	}

	/**
	 * Stubs method for testVerifyFileStatus2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsVerifyFileStatus2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, File.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(File.class);
				// at com.palladium.paf.utils.FileUtility.verifyFileStatus(FileUtility.java:43)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "exists", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.utils.FileUtility.verifyFileStatus(FileUtility.java:46)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static verifyFileStatus(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see FileUtility#verifyFileStatus(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testVerifyFileStatus3() throws Throwable {
		// jtest_tested_method
		FileUtility.verifyFileStatus((String) null);
		// jtest.RuntimeExitCalled thrown
		// at com.palladium.paf.utils.FileUtility.verifyFileStatus(FileUtility.java:57)
		// jtest_unverified
	}

	/**
	 * Stubs method for testVerifyFileStatus3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsVerifyFileStatus3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, File.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(File.class);
				// at com.palladium.paf.utils.FileUtility.verifyFileStatus(FileUtility.java:43)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "exists", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.utils.FileUtility.verifyFileStatus(FileUtility.java:46)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "canRead", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.utils.FileUtility.verifyFileStatus(FileUtility.java:54)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static verifyFileStatus(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see FileUtility#verifyFileStatus(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testVerifyFileStatus4() throws Throwable {
		// jtest_tested_method
		FileUtility.verifyFileStatus((String) null);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testVerifyFileStatus4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsVerifyFileStatus4(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, File.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(File.class);
				// at com.palladium.paf.utils.FileUtility.verifyFileStatus(FileUtility.java:43)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "exists", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.utils.FileUtility.verifyFileStatus(FileUtility.java:46)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "canRead", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.utils.FileUtility.verifyFileStatus(FileUtility.java:54)
			}
		}
		return Stubs.NO_STUB_GENERATED;
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
	 * Usage: java com.palladium.paf.utils.FileUtilityTest
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
			FileUtilityTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.utils.FileUtility",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return FileUtility.class;
	}

			}

// JTEST_CURRENT_ID=-2126387543.