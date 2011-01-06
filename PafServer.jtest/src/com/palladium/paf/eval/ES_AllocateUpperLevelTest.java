/*
 * ES_AllocateUpperLevelTest.java
 * Created by Jtest on 9/19/06 5:23:52 PM.
 * Updated by Jtest on 10/18/06 12:10:57 PM, 1 test case added.
 * Updated by Jtest on 11/8/06 10:51:22 PM, 1 test case added, 1 test case removed.
 */

package com.palladium.paf.eval;

import com.palladium.utility.TimeBalance;
import com.palladium.paf.data.Intersection;
import com.palladium.paf.rules.Rule;
import com.palladium.paf.server.PafDataService;
import com.palladium.paf.app.PafApplicationDef;
import jtest.Stubs;
import java.lang.reflect.Member;
import com.palladium.paf.mdb.PafDataCache;
import com.palladium.paf.state.EvalState;
import com.palladium.paf.eval.ES_AllocateUpperLevel;

/**
 * ES_AllocateUpperLevelTest is a unit test class for class ES_AllocateUpperLevel.
 * @see com.palladium.paf.eval.ES_AllocateUpperLevel
 * @author Parasoft Jtest 8.0
 */
public class ES_AllocateUpperLevelTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public ES_AllocateUpperLevelTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }

	/**
	 * Test for method: allocateChange(com.palladium.paf.data.Intersection,com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.utility.TimeBalance)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_AllocateUpperLevel#allocateChange(com.palladium.paf.data.Intersection,com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.utility.TimeBalance)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAllocateChange1() throws Throwable {
		ES_AllocateUpperLevel THIS = new ES_AllocateUpperLevel();
		// jtest_tested_method
		PafDataCache RETVAL = THIS.allocateChange(
			(Intersection) null,
			(EvalState) null,
			(PafDataCache) null,
			(TimeBalance) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.eval.ES_AllocateUpperLevel.allocateChange(Lcom/palladium/paf/data/Intersection;Lcom/palladium/paf/state/EvalState;Lcom/palladium/paf/mdb/PafDataCache;Lcom/palladium/utility/TimeBalance;)Lcom/palladium/paf/mdb/PafDataCache;>
		// at com.palladium.paf.eval.ES_AllocateUpperLevel.allocateChange(ES_AllocateUpperLevel.java:169)
		// jtest_unverified
	}

	/**
	 * Stubs method for testAllocateChange1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAllocateChange1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "loadApplications", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
				// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
				// at com.palladium.paf.eval.ES_AllocateBase.<init>(ES_AllocateBase.java:58)
				// at com.palladium.paf.eval.ES_AllocateUpperLevel.<init>(ES_AllocateUpperLevel.java:57)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for loading class: ES_AllocateUpperLevel
	 * @author Parasoft Jtest 8.0
	 */
	public void testES_AllocateUpperLevel1() throws Throwable {
		Class.forName(ES_AllocateUpperLevel.class.getName());
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
     * Usage: java com.palladium.paf.eval.ES_AllocateUpperLevelTest
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
            ES_AllocateUpperLevelTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.eval.ES_AllocateUpperLevel",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return ES_AllocateUpperLevel.class;
    }

								}

// JTEST_CURRENT_ID=533130926.