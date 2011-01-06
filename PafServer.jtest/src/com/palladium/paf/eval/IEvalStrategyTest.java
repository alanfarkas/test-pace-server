/*
 * IEvalStrategyTest.java
 * Created by Jtest on 9/19/06 6:24:04 PM.
 */

package com.palladium.paf.eval;

import com.palladium.paf.eval.IEvalStrategy;

/**
 * IEvalStrategyTest is a unit test class for class IEvalStrategy.
 * @see com.palladium.paf.eval.IEvalStrategy
 * @author Parasoft Jtest 8.0
 */
public class IEvalStrategyTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public IEvalStrategyTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }

    /**
     * Test for loading class: IEvalStrategy
     * @author Parasoft Jtest 8.0
     */
    public void testIEvalStrategy1() throws Throwable {
        Class.forName(IEvalStrategy.class.getName());
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
     * Usage: java com.palladium.paf.eval.IEvalStrategyTest
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
            IEvalStrategyTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.eval.IEvalStrategy",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return IEvalStrategy.class;
    }

}

// JTEST_CURRENT_ID=-2065711496.