/*
 * PafExceptionTest.java
 * Created by Jtest on 9/19/06 5:57:49 PM.
 */

package com.palladium.paf;

import jtest.Stubs;
import com.palladium.paf.state.IPafClientState;
import com.palladium.paf.PafException;

/**
 * PafExceptionTest is a unit test class for class PafException.
 * @see com.palladium.paf.PafException
 * @author Parasoft Jtest 8.0
 */
public class PafExceptionTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafExceptionTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: addMessageDetail(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafException#addMessageDetail(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddMessageDetail1() throws Throwable {
		PafException THIS = new PafException(
			(String) null,
			(PafErrSeverity) null,
			(Throwable) null);
		// jtest_tested_method
		THIS.addMessageDetail((String) null);
		assertEquals("com.palladium.paf.PafException", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getClientState()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafException#getClientState()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetClientState1() throws Throwable {
		PafException THIS = new PafException(
			(String) null,
			(Throwable) null,
			(PafErrSeverity) null);
		// jtest_tested_method
		IPafClientState RETVAL = THIS.getClientState();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getClientState()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafException#getClientState()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetClientState2() throws Throwable {
		Throwable t0 = new Throwable("");
		PafException THIS = new PafException(t0);
		PafErrSeverity t2 = PafErrSeverity.valueOf("Debug");
		THIS.setSeverity(t2);
		IPafClientState var1 = (IPafClientState) Stubs
			.makeStubObject(IPafClientState.class);
		THIS.setClientState(var1);
		// jtest_tested_method
		IPafClientState RETVAL = THIS.getClientState();
		assertEquals(var1, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPafSoapException()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafException#getPafSoapException()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPafSoapException1() throws Throwable {
		PafException THIS = new PafException((Throwable) null);
		// jtest_tested_method
		PafSoapException RETVAL = THIS.getPafSoapException();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("com.palladium.paf.PafSoapException", RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getSeverity()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafException#getSeverity()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetSeverity1() throws Throwable {
		PafException THIS = new PafException(
			(String) null,
			(PafErrSeverity) null,
			(Throwable) null);
		// jtest_tested_method
		PafErrSeverity RETVAL = THIS.getSeverity();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getSeverity()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafException#getSeverity()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetSeverity2() throws Throwable {
		PafException THIS = new PafException(
			(String) null,
			(PafErrSeverity) null,
			(Throwable) null);
		PafErrSeverity t1 = PafErrSeverity.valueOf("Debug");
		THIS.setSeverity(t1);
		IPafClientState var1 = (IPafClientState) Stubs
			.makeStubObject(IPafClientState.class);
		THIS.setClientState(var1);
		// jtest_tested_method
		PafErrSeverity RETVAL = THIS.getSeverity();
		assertEquals(t1, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafException(java.lang.String,java.lang.Throwable,com.palladium.paf.state.IPafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafException#PafException(java.lang.String,java.lang.Throwable,com.palladium.paf.state.IPafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafException1() throws Throwable {
		// jtest_tested_method
		PafException THIS = new PafException(
			(String) null,
			(Throwable) null,
			(IPafClientState) null);
		assertEquals("com.palladium.paf.PafException", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafException(java.lang.Throwable)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafException#PafException(java.lang.Throwable)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafException3() throws Throwable {
		// jtest_tested_method
		PafException THIS = new PafException((Throwable) null);
		assertEquals("com.palladium.paf.PafException", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafException(java.lang.String,com.palladium.paf.PafErrSeverity)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafException#PafException(java.lang.String,com.palladium.paf.PafErrSeverity)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafException5() throws Throwable {
		// jtest_tested_method
		PafException THIS = new PafException(
			(String) null,
			(PafErrSeverity) null);
		assertEquals("com.palladium.paf.PafException", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafException(java.lang.String,java.lang.Throwable,com.palladium.paf.PafErrSeverity)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafException#PafException(java.lang.String,java.lang.Throwable,com.palladium.paf.PafErrSeverity)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafException7() throws Throwable {
		// jtest_tested_method
		PafException THIS = new PafException(
			(String) null,
			(Throwable) null,
			(PafErrSeverity) null);
		assertEquals("com.palladium.paf.PafException", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafException()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafException#PafException()
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafException9() throws Throwable {
		// jtest_tested_method
		PafException THIS = new PafException();
		assertEquals("com.palladium.paf.PafException", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafException(java.lang.String,com.palladium.paf.PafErrSeverity,java.lang.Throwable)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafException#PafException(java.lang.String,com.palladium.paf.PafErrSeverity,java.lang.Throwable)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafException10() throws Throwable {
		// jtest_tested_method
		PafException THIS = new PafException(
			(String) null,
			(PafErrSeverity) null,
			(Throwable) null);
		assertEquals("com.palladium.paf.PafException", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setClientState(com.palladium.paf.state.IPafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafException#setClientState(com.palladium.paf.state.IPafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetClientState1() throws Throwable {
		Throwable t0 = new Throwable("");
		PafException THIS = new PafException(t0);
		PafErrSeverity t2 = PafErrSeverity.valueOf("Debug");
		THIS.setSeverity(t2);
		IPafClientState var1 = (IPafClientState) Stubs
			.makeStubObject(IPafClientState.class);
		THIS.setClientState(var1);
		IPafClientState var2 = (IPafClientState) Stubs
			.makeStubObject(IPafClientState.class);
		// jtest_tested_method
		THIS.setClientState(var2);
		assertEquals(var2, THIS.getClientState()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setSeverity(com.palladium.paf.PafErrSeverity)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafException#setSeverity(com.palladium.paf.PafErrSeverity)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetSeverity1() throws Throwable {
		Throwable t0 = new Throwable();
		IPafClientState var1 = (IPafClientState) Stubs
			.makeStubObject(IPafClientState.class);
		PafException THIS = new PafException("", t0, var1);
		PafErrSeverity t2 = PafErrSeverity.valueOf("Debug");
		PafErrSeverity t3 = PafErrSeverity.valueOf("Debug");
		THIS.setSeverity(t2);
		IPafClientState var2 = (IPafClientState) Stubs
			.makeStubObject(IPafClientState.class);
		THIS.setClientState(var2);
		// jtest_tested_method
		THIS.setSeverity(t3);
		assertEquals(t2, THIS.getSeverity()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.PafExceptionTest
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
			PafExceptionTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.PafException",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafException.class;
	}

}

// JTEST_CURRENT_ID=-1537155065.