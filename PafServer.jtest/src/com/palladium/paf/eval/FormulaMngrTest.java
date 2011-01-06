/*
 * FormulaMngrTest.java
 * Created by Jtest on 9/19/06 6:15:49 PM.
 * Updated by Jtest on 10/18/06 4:52:39 PM, 1 test case added, 1 test case removed.
 */

package com.palladium.paf.eval;

import com.palladium.paf.rules.Formula;
import com.palladium.paf.eval.FormulaMngr;

/**
 * FormulaMngrTest is a unit test class for class FormulaMngr.
 * @see com.palladium.paf.eval.FormulaMngr
 * @author Parasoft Jtest 8.0
 */
public class FormulaMngrTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public FormulaMngrTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }

	/**
	 * Test for method: FormulaMngr(com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see FormulaMngr#FormulaMngr(com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFormulaMngr1() throws Throwable {
		// jtest_tested_method
		FormulaMngr THIS = new FormulaMngr((IFormulaEvalEngine) null);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: processFormulas(com.palladium.paf.rules.Formula[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see FormulaMngr#processFormulas(com.palladium.paf.rules.Formula[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testProcessFormulas1() throws Throwable {
		FormulaMngr THIS = new FormulaMngr((IFormulaEvalEngine) null);
		// jtest_tested_method
		double[] RETVAL = THIS.processFormulas((Formula[]) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.eval.FormulaMngr.processFormulas([Lcom/palladium/paf/rules/Formula;)[D>
		// at com.palladium.paf.eval.FormulaMngr.processFormulas(FormulaMngr.java:38)
		// jtest_unverified
	}

	/**
	 * Test for method: processFormulas(com.palladium.paf.rules.Formula[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see FormulaMngr#processFormulas(com.palladium.paf.rules.Formula[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testProcessFormulas2() throws Throwable {
		FormulaMngr THIS = new FormulaMngr((IFormulaEvalEngine) null);
		Formula[] var1 = new Formula[] {};
		// jtest_tested_method
		double[] RETVAL = THIS.processFormulas(var1);
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0, RETVAL.length); // jtest_unverified
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
     * Usage: java com.palladium.paf.eval.FormulaMngrTest
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
            FormulaMngrTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.eval.FormulaMngr",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return FormulaMngr.class;
    }

}

// JTEST_CURRENT_ID=1118769201.