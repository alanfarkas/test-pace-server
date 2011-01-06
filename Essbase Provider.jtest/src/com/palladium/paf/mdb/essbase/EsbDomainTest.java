/*
 * EsbDomainTest.java
 * Created by Jtest on 9/19/06 4:51:22 PM.
 * Updated by Jtest on 10/18/06 6:42:10 PM, 1 test case added, 1 test case removed.
 * Updated by Jtest on 11/9/06 2:19:39 AM, 1 test case added, 1 test case removed.
 */

package com.palladium.paf.mdb.essbase;

import com.essbase.api.base.EssException;
import com.essbase.api.session.Essbase;
import jtest.Stubs;
import java.lang.reflect.Member;
import com.essbase.api.domain.IEssDomain;
import com.palladium.paf.mdb.essbase.EsbDomain;

/**
 * EsbDomainTest is a unit test class for class EsbDomain.
 * @see com.palladium.paf.mdb.essbase.EsbDomain
 * @author Parasoft Jtest 8.0
 */
public class EsbDomainTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public EsbDomainTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}
	/**
	 * Test for method: disconnect()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbDomain#disconnect()
	 * @author Parasoft Jtest 8.0
	 */
	public void testDisconnect2() throws Throwable {
		EsbDomain THIS = new EsbDomain(
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		// jtest_tested_method
		THIS.disconnect();
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testDisconnect2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsDisconnect2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isSignedOn", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.mdb.essbase.EsbDomain.disconnect(EsbDomain.java:71)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: disconnect()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbDomain#disconnect()
	 * @author Parasoft Jtest 8.0
	 */
	public void testDisconnect3() throws Throwable {
		EsbDomain THIS = new EsbDomain(
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		// jtest_tested_method
		THIS.disconnect();
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testDisconnect3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsDisconnect3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isSignedOn", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.essbase.EsbDomain.disconnect(EsbDomain.java:71)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "signOff", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbDomain.disconnect(EsbDomain.java:72)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbDomain(java.lang.String,java.lang.String,java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbDomain#EsbDomain(java.lang.String,java.lang.String,java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbDomain1() throws Throwable {
		// jtest_tested_method
		EsbDomain THIS = new EsbDomain(
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:60)
		// Caused by: com.essbase.api.base.EssException: Cannot sign on user. Invalid sign on attempt.
		// at com.essbase.api.session.Essbase.signOn_internal(Essbase.java:337)
		// at com.essbase.api.session.Essbase.signOn(Essbase.java:307)
		// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
		// jtest_unverified
	}

	/**
	 * Test for method: EsbDomain(java.lang.String,java.lang.String,java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbDomain#EsbDomain(java.lang.String,java.lang.String,java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbDomain3() throws Throwable {
		// jtest_tested_method
		EsbDomain THIS = new EsbDomain(
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbDomain3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbDomain3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getEssDomain()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbDomain#getEssDomain()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetEssDomain1() throws Throwable {
		EsbDomain THIS = new EsbDomain(
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		// jtest_tested_method
		IEssDomain RETVAL = THIS.getEssDomain();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("0", RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetEssDomain1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetEssDomain1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
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
	 * Usage: java com.palladium.paf.mdb.essbase.EsbDomainTest
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
			EsbDomainTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.mdb.essbase.EsbDomain",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return EsbDomain.class;
	}

			}

// JTEST_CURRENT_ID=-912009270.