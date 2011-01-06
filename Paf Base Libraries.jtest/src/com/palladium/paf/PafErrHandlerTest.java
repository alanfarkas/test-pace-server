/*
 * PafErrHandlerTest.java
 * Created by Jtest on 9/19/06 5:46:52 PM.
 * Updated by Jtest on 10/18/06 7:30:17 PM, 3 test cases added, 3 test cases removed.
 * Updated by Jtest on 11/9/06 3:17:05 AM, 3 test cases added, 3 test cases removed.
 */

package com.palladium.paf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import jtest.Stubs;
import java.lang.reflect.Member;
import com.palladium.paf.state.IPafClientState;
import com.palladium.paf.PafErrHandler;

/**
 * PafErrHandlerTest is a unit test class for class PafErrHandler.
 * @see com.palladium.paf.PafErrHandler
 * @author Parasoft Jtest 8.0
 */
public class PafErrHandlerTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafErrHandlerTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}
	/**
	 * Test for method: static handleException(java.lang.String,com.palladium.paf.PafErrSeverity,java.lang.Exception,com.palladium.paf.state.IPafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafErrHandler#handleException(java.lang.String,com.palladium.paf.PafErrSeverity,java.lang.Exception,com.palladium.paf.state.IPafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testHandleException1() throws Throwable {
		PafErrSeverity t0 = PafErrSeverity.valueOf("Debug");
		// jtest_tested_method
		PafErrHandler.handleException(
			(String) null,
			t0,
			(Exception) null,
			(IPafClientState) null);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testHandleException1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsHandleException1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ArrayList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.PafErrHandler.addMessageDetail(PafErrHandler.java:85)
				// at com.palladium.paf.PafErrHandler.handleException(PafErrHandler.java:46)
				// at com.palladium.paf.PafErrHandler.handleException(PafErrHandler.java:107)
			}
		}
		if (Stubs.matches(method, AbstractList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.PafErrHandler.addMessageDetail(PafErrHandler.java:87)
				// at com.palladium.paf.PafErrHandler.handleException(PafErrHandler.java:46)
				// at com.palladium.paf.PafErrHandler.handleException(PafErrHandler.java:107)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.PafErrHandler.addMessageDetail(PafErrHandler.java:87)
				// at com.palladium.paf.PafErrHandler.handleException(PafErrHandler.java:46)
				// at com.palladium.paf.PafErrHandler.handleException(PafErrHandler.java:107)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static handleException(com.palladium.paf.PafException)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafErrHandler#handleException(com.palladium.paf.PafException)
	 * @author Parasoft Jtest 8.0
	 */
	public void testHandleException4() throws Throwable {
		// jtest_tested_method
		PafErrHandler.handleException((PafException) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.PafErrHandler.handleException(Lcom/palladium/paf/PafException;)V>
		// at com.palladium.paf.PafErrHandler.addMessageMain(PafErrHandler.java:98)
		// at com.palladium.paf.PafErrHandler.handleException(PafErrHandler.java:45)
		// jtest_unverified
	}

	/**
	 * Test for method: static handleException(com.palladium.paf.PafException)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafErrHandler#handleException(com.palladium.paf.PafException)
	 * @author Parasoft Jtest 8.0
	 */
	public void testHandleException5() throws Throwable {
		PafException t0 = new PafException(
			(String) null,
			(PafErrSeverity) null,
			(Throwable) null);
		// jtest_tested_method
		PafErrHandler.handleException(t0);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.PafException.<init>(Ljava/lang/String;Lcom/palladium/paf/PafErrSeverity;Ljava/lang/Throwable;)V>
		// at com.palladium.paf.PafErrHandler.handleException(PafErrHandler.java:51)
		// jtest_unverified
	}

	/**
	 * Stubs method for testHandleException5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsHandleException5(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ArrayList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.PafErrHandler.addMessageDetail(PafErrHandler.java:85)
				// at com.palladium.paf.PafErrHandler.handleException(PafErrHandler.java:46)
			}
		}
		if (Stubs.matches(method, AbstractList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.PafErrHandler.addMessageDetail(PafErrHandler.java:87)
				// at com.palladium.paf.PafErrHandler.handleException(PafErrHandler.java:46)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.PafErrHandler.addMessageDetail(PafErrHandler.java:87)
				// at com.palladium.paf.PafErrHandler.handleException(PafErrHandler.java:46)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static handleException(com.palladium.paf.PafException)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafErrHandler#handleException(com.palladium.paf.PafException)
	 * @author Parasoft Jtest 8.0
	 */
	public void testHandleException6() throws Throwable {
		PafException t0 = new PafException(
			(String) null,
			(PafErrSeverity) null,
			(Throwable) null);
		PafErrSeverity t1 = PafErrSeverity.valueOf("Debug");
		t0.setSeverity(t1);
		IPafClientState var1 = (IPafClientState) Stubs
			.makeStubObject(IPafClientState.class);
		t0.setClientState(var1);
		// jtest_tested_method
		PafErrHandler.handleException(t0);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testHandleException6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsHandleException6(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ArrayList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.PafErrHandler.addMessageDetail(PafErrHandler.java:85)
				// at com.palladium.paf.PafErrHandler.handleException(PafErrHandler.java:46)
			}
		}
		if (Stubs.matches(method, AbstractList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.PafErrHandler.addMessageDetail(PafErrHandler.java:87)
				// at com.palladium.paf.PafErrHandler.handleException(PafErrHandler.java:46)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.PafErrHandler.addMessageDetail(PafErrHandler.java:87)
				// at com.palladium.paf.PafErrHandler.handleException(PafErrHandler.java:46)
			}
		}
		if (Stubs.matches(method, IPafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getUserName", argument_types)) {
				return null;
				// at com.palladium.paf.PafErrHandler.addClientState(PafErrHandler.java:76)
				// at com.palladium.paf.PafErrHandler.handleException(PafErrHandler.java:47)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientId", argument_types)) {
				return null;
				// at com.palladium.paf.PafErrHandler.addClientState(PafErrHandler.java:77)
				// at com.palladium.paf.PafErrHandler.handleException(PafErrHandler.java:47)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientIpAddress", argument_types)) {
				return null;
				// at com.palladium.paf.PafErrHandler.addClientState(PafErrHandler.java:78)
				// at com.palladium.paf.PafErrHandler.handleException(PafErrHandler.java:47)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static handleException(java.lang.Exception,com.palladium.paf.PafErrSeverity)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafErrHandler#handleException(java.lang.Exception,com.palladium.paf.PafErrSeverity)
	 * @author Parasoft Jtest 8.0
	 */
	public void testHandleException8() throws Throwable {
		// jtest_tested_method
		PafErrHandler.handleException((Exception) null, (PafErrSeverity) null);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static handleException(java.lang.Exception,com.palladium.paf.PafErrSeverity)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafErrHandler#handleException(java.lang.Exception,com.palladium.paf.PafErrSeverity)
	 * @author Parasoft Jtest 8.0
	 */
	public void testHandleException11() throws Throwable {
		// jtest_tested_method
		PafErrHandler.handleException((Exception) null, (PafErrSeverity) null);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testHandleException11.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsHandleException11(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ArrayList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.PafErrHandler.addMessageDetail(PafErrHandler.java:85)
				// at com.palladium.paf.PafErrHandler.handleException(PafErrHandler.java:46)
				// at com.palladium.paf.PafErrHandler.handleException(PafErrHandler.java:34)
			}
		}
		if (Stubs.matches(method, AbstractList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.PafErrHandler.addMessageDetail(PafErrHandler.java:87)
				// at com.palladium.paf.PafErrHandler.handleException(PafErrHandler.java:46)
				// at com.palladium.paf.PafErrHandler.handleException(PafErrHandler.java:34)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Iterator.hasNext()");
				switch (index) {
					case 1 :
						return Boolean.TRUE;
					// at com.palladium.paf.PafErrHandler.addMessageDetail(PafErrHandler.java:87)
					// at com.palladium.paf.PafErrHandler.handleException(PafErrHandler.java:46)
					// at com.palladium.paf.PafErrHandler.handleException(PafErrHandler.java:34)
					case 2 :
						return Boolean.FALSE;
					// at com.palladium.paf.PafErrHandler.addMessageDetail(PafErrHandler.java:87)
					// at com.palladium.paf.PafErrHandler.handleException(PafErrHandler.java:46)
					// at com.palladium.paf.PafErrHandler.handleException(PafErrHandler.java:34)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return "";
				// at com.palladium.paf.PafErrHandler.addMessageDetail(PafErrHandler.java:87)
				// at com.palladium.paf.PafErrHandler.handleException(PafErrHandler.java:46)
				// at com.palladium.paf.PafErrHandler.handleException(PafErrHandler.java:34)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static handleException(java.lang.Exception,com.palladium.paf.PafErrSeverity)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafErrHandler#handleException(java.lang.Exception,com.palladium.paf.PafErrSeverity)
	 * @author Parasoft Jtest 8.0
	 */
	public void testHandleException14() throws Throwable {
		_f0 = new Object();
		// jtest_tested_method
		PafErrHandler.handleException((Exception) null, (PafErrSeverity) null);
		// ClassCastException thrown
		// at com.palladium.paf.PafErrHandler.addMessageDetail(PafErrHandler.java:87)
		// at com.palladium.paf.PafErrHandler.handleException(PafErrHandler.java:46)
		// at com.palladium.paf.PafErrHandler.handleException(PafErrHandler.java:34)
		// jtest_unverified
	}

	/**
	 * Stubs method for testHandleException14.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsHandleException14(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ArrayList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.PafErrHandler.addMessageDetail(PafErrHandler.java:85)
				// at com.palladium.paf.PafErrHandler.handleException(PafErrHandler.java:46)
				// at com.palladium.paf.PafErrHandler.handleException(PafErrHandler.java:34)
			}
		}
		if (Stubs.matches(method, AbstractList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.PafErrHandler.addMessageDetail(PafErrHandler.java:87)
				// at com.palladium.paf.PafErrHandler.handleException(PafErrHandler.java:46)
				// at com.palladium.paf.PafErrHandler.handleException(PafErrHandler.java:34)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.PafErrHandler.addMessageDetail(PafErrHandler.java:87)
				// at com.palladium.paf.PafErrHandler.handleException(PafErrHandler.java:46)
				// at com.palladium.paf.PafErrHandler.handleException(PafErrHandler.java:34)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return _f0;
				// at com.palladium.paf.PafErrHandler.addMessageDetail(PafErrHandler.java:87)
				// at com.palladium.paf.PafErrHandler.handleException(PafErrHandler.java:46)
				// at com.palladium.paf.PafErrHandler.handleException(PafErrHandler.java:34)
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
		_stubs_iteration = new jtest.StubIterationCounter();
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
	 * Usage: java com.palladium.paf.PafErrHandlerTest
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
			PafErrHandlerTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.PafErrHandler",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafErrHandler.class;
	}

	/**
	 * Used to keep track of how many times a stubbed method has been called.
	 * @author Parasoft Jtest 8.0
	 */
private jtest.StubIterationCounter _stubs_iteration;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Object _f0;
}

// JTEST_CURRENT_ID=911395664.