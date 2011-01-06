/*
 * JFormulaEvalEngineTest.java
 * Created by Jtest on 9/19/06 6:04:45 PM.
 * Updated by Jtest on 10/18/06 6:21:36 PM, 3 test cases added, 3 test cases removed.
 * Updated by Jtest on 11/9/06 12:50:36 AM, 3 test cases added, 3 test cases removed.
 */

package com.palladium.paf.eval;

import com.japisoft.formula.Formula;
import jtest.Stubs;
import java.lang.reflect.Member;
import com.palladium.paf.eval.JFormulaEvalEngine;

/**
 * JFormulaEvalEngineTest is a unit test class for class JFormulaEvalEngine.
 * @see com.palladium.paf.eval.JFormulaEvalEngine
 * @author Parasoft Jtest 8.0
 */
public class JFormulaEvalEngineTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public JFormulaEvalEngineTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }

	/**
	 * Test for method: Evaluate(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see JFormulaEvalEngine#Evaluate(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEvaluate1() throws Throwable {
		JFormulaEvalEngine THIS = new JFormulaEvalEngine();
		// jtest_tested_method
		double RETVAL = THIS.Evaluate((String) null);

		// com.japisoft.formula.FormulaException thrown
		// at com.japisoft.formula.Formula.setExpression(SourceFile:300)
		// at com.palladium.paf.eval.JFormulaEvalEngine.Evaluate(JFormulaEvalEngine.java:41)
		// jtest_unverified
	}

	/**
	 * Test for method: Evaluate(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see JFormulaEvalEngine#Evaluate(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEvaluate2() throws Throwable {
		JFormulaEvalEngine THIS = new JFormulaEvalEngine();
		// jtest_tested_method
		double RETVAL = THIS.Evaluate("");

		// RuntimeException thrown
		// at com.japisoft.formula.Variant.<init>(SourceFile:41)
		// at com.japisoft.formula.Formula.evaluate(SourceFile:377)
		// at com.palladium.paf.eval.JFormulaEvalEngine.Evaluate(JFormulaEvalEngine.java:44)
		// jtest_unverified
	}

	/**
	 * Test for method: Evaluate(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see JFormulaEvalEngine#Evaluate(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEvaluate3() throws Throwable {
		JFormulaEvalEngine THIS = new JFormulaEvalEngine();
		// jtest_tested_method
		double RETVAL = THIS.Evaluate((String) null);
		// NullPointerException thrown
		// at com.palladium.paf.eval.JFormulaEvalEngine.Evaluate(JFormulaEvalEngine.java:44)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEvaluate3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEvaluate3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Formula.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "setExpression", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.eval.JFormulaEvalEngine.Evaluate(JFormulaEvalEngine.java:41)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "evaluate", argument_types)) {
				return null;
				// at com.palladium.paf.eval.JFormulaEvalEngine.Evaluate(JFormulaEvalEngine.java:44)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: JFormulaEvalEngine()
	 * @throws Throwable Tests may throw any Throwable
	 * @see JFormulaEvalEngine#JFormulaEvalEngine()
	 * @author Parasoft Jtest 8.0
	 */
	public void testJFormulaEvalEngine1() throws Throwable {
		// jtest_tested_method
		JFormulaEvalEngine THIS = new JFormulaEvalEngine();
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
     * Usage: java com.palladium.paf.eval.JFormulaEvalEngineTest
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
            JFormulaEvalEngineTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.eval.JFormulaEvalEngine",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return JFormulaEvalEngine.class;
    }

    		}

// JTEST_CURRENT_ID=-393116823.