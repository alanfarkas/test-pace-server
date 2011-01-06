/*
 * ParsedFunctionTest.java
 * Created by Jtest on 9/19/06 5:47:07 PM.
 * Updated by Jtest on 10/18/06 8:10:41 PM, 3 test cases added, 3 test cases removed.
 * Updated by Jtest on 11/9/06 3:17:18 AM, 3 test cases added, 3 test cases removed.
 */

package com.palladium.paf.funcs;

import com.palladium.paf.data.IPafDataCache;
import com.palladium.paf.data.Intersection;
import jtest.Stubs;
import java.lang.reflect.Member;
import com.palladium.paf.state.IPafEvalState;
import java.util.Set;
import com.palladium.paf.funcs.ParsedFunction;

/**
 * ParsedFunctionTest is a unit test class for class ParsedFunction.
 * @see com.palladium.paf.funcs.ParsedFunction
 * @author Parasoft Jtest 8.0
 */
public class ParsedFunctionTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public ParsedFunctionTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}
	/**
	 * Test for method: calculate(com.palladium.paf.data.Intersection,com.palladium.paf.data.IPafDataCache,com.palladium.paf.state.IPafEvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ParsedFunction#calculate(com.palladium.paf.data.Intersection,com.palladium.paf.data.IPafDataCache,com.palladium.paf.state.IPafEvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalculate1() throws Throwable {
		ParsedFunction THIS = new ParsedFunction((String) null);
		// jtest_tested_method
		double RETVAL = THIS.calculate(
			(Intersection) null,
			(IPafDataCache) null,
			(IPafEvalState) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.funcs.ParsedFunction.calculate(ParsedFunction.java:48)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalculate1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalculate1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, AbstractFunction.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "parseParameters", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.funcs.ParsedFunction.<init>(ParsedFunction.java:39)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDirtyIntersections(com.palladium.paf.state.IPafEvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ParsedFunction#getDirtyIntersections(com.palladium.paf.state.IPafEvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDirtyIntersections1() throws Throwable {
		ParsedFunction THIS = new ParsedFunction((String) null);
		// jtest_tested_method
		Set RETVAL = THIS.getDirtyIntersections((IPafEvalState) null);
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDirtyIntersections1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDirtyIntersections1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, AbstractFunction.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "parseParameters", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.funcs.ParsedFunction.<init>(ParsedFunction.java:39)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: ParsedFunction(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ParsedFunction#ParsedFunction(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testParsedFunction1() throws Throwable {
		// jtest_tested_method
		ParsedFunction THIS = new ParsedFunction((String) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.funcs.ParsedFunction.<init>(Ljava/lang/String;)V>
		// at com.palladium.paf.funcs.AbstractFunction.parseParameters(AbstractFunction.java:38)
		// at com.palladium.paf.funcs.ParsedFunction.<init>(ParsedFunction.java:39)
		// jtest_unverified
	}

	/**
	 * Test for method: ParsedFunction(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ParsedFunction#ParsedFunction(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testParsedFunction2() throws Throwable {
		// jtest_tested_method
		ParsedFunction THIS = new ParsedFunction("");

		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.funcs.AbstractFunction.parseParameters(AbstractFunction.java:44)
		// at com.palladium.paf.funcs.ParsedFunction.<init>(ParsedFunction.java:39)
		// jtest_unverified
	}

	/**
	 * Test for method: ParsedFunction(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ParsedFunction#ParsedFunction(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testParsedFunction3() throws Throwable {
		// jtest_tested_method
		ParsedFunction THIS = new ParsedFunction((String) null);
		assertEquals(null, THIS.getOpCode()); // jtest_unverified
		assertEquals(null, THIS.getMeasureName()); // jtest_unverified
		assertEquals(null, THIS.getParms()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testParsedFunction3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsParsedFunction3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, AbstractFunction.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "parseParameters", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.funcs.ParsedFunction.<init>(ParsedFunction.java:39)
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
	 * Usage: java com.palladium.paf.funcs.ParsedFunctionTest
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
			ParsedFunctionTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.funcs.ParsedFunction",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return ParsedFunction.class;
	}

			}

// JTEST_CURRENT_ID=2054213555.