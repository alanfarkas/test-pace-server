/*
 * PafSoapExceptionTest.java
 * Created by Jtest on 9/19/06 5:57:00 PM.
 * Updated by Jtest on 10/18/06 7:19:40 PM, 1 test case added, 1 test case removed.
 * Updated by Jtest on 11/9/06 3:02:21 AM, 1 test case added, 1 test case removed.
 */

package com.palladium.paf;

import jtest.Stubs;
import com.palladium.paf.state.IPafClientState;
import com.palladium.paf.PafSoapException;

/**
 * PafSoapExceptionTest is a unit test class for class PafSoapException.
 * @see com.palladium.paf.PafSoapException
 * @author Parasoft Jtest 8.0
 */
public class PafSoapExceptionTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafSoapExceptionTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getMessage()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSoapException#getMessage()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMessage1() throws Throwable {
		PafException t0 = new PafException(
			(String) null,
			(Throwable) null,
			(PafErrSeverity) null);
		PafSoapException THIS = new PafSoapException(t0);
		// jtest_tested_method
		String RETVAL = THIS.getMessage();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getMessageDetail()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSoapException#getMessageDetail()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMessageDetail1() throws Throwable {
		PafException t0 = new PafException(
			(String) null,
			(Throwable) null,
			(PafErrSeverity) null);
		PafSoapException THIS = new PafSoapException(t0);
		// jtest_tested_method
		String[] RETVAL = THIS.getMessageDetail();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0, RETVAL.length); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafSoapException(com.palladium.paf.PafException)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSoapException#PafSoapException(com.palladium.paf.PafException)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafSoapException1() throws Throwable {
		// jtest_tested_method
		PafSoapException THIS = new PafSoapException((PafException) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.PafSoapException.<init>(Lcom/palladium/paf/PafException;)V>
		// jtest_unverified
	}

	/**
	 * Test for method: PafSoapException(com.palladium.paf.PafException)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSoapException#PafSoapException(com.palladium.paf.PafException)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafSoapException2() throws Throwable {
		PafErrSeverity t0 = PafErrSeverity.valueOf("Debug");
		Throwable t1 = new Throwable((String) null, (Throwable) null);
		Throwable t2 = new Throwable("", t1);
		PafException t3 = new PafException("", t0, t2);
		// jtest_tested_method
		PafSoapException THIS = new PafSoapException(t3);
		assertEquals("com.palladium.paf.PafSoapException: ", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setMessage(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSoapException#setMessage(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetMessage1() throws Throwable {
		PafSoapException THIS = new PafSoapException();
		// jtest_tested_method
		THIS.setMessage((String) null);
		assertEquals(null, THIS.getMessage()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setMessageDetail(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSoapException#setMessageDetail(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetMessageDetail1() throws Throwable {
		Throwable t0 = new Throwable((String) null, (Throwable) null);
		Throwable t1 = new Throwable("", t0);
		IPafClientState var1 = (IPafClientState) Stubs
			.makeStubObject(IPafClientState.class);
		PafException t2 = new PafException("", t1, var1);
		PafErrSeverity t3 = PafErrSeverity.valueOf("Debug");
		PafSoapException THIS = new PafSoapException(t2);
		t2.setSeverity(t3);
		IPafClientState var2 = (IPafClientState) Stubs
			.makeStubObject(IPafClientState.class);
		t2.setClientState(var2);
		String[] var3 = new String[] {};
		// jtest_tested_method
		THIS.setMessageDetail(var3);
		assertSame(var3, THIS.getMessageDetail()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.PafSoapExceptionTest
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
			PafSoapExceptionTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.PafSoapException",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafSoapException.class;
	}

			}

// JTEST_CURRENT_ID=-1597224865.