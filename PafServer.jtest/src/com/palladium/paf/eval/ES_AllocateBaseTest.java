/*
 * ES_AllocateBaseTest.java
 * Created by Jtest on 9/19/06 10:13:22 AM.
 * Updated by Jtest on 10/18/06 4:33:00 PM, 7 test cases added, 6 test cases removed.
 * Updated by Jtest on 11/8/06 10:26:32 PM, 7 test cases removed.
 */

package com.palladium.paf.eval;

import com.palladium.paf.server.ServerSettings;
import org.hibernate.connection.DriverManagerConnectionProvider;
import com.palladium.paf.app.MdbDef;
import com.palladium.paf.app.PafApplicationDef;
import com.palladium.paf.rules.Rule;
import com.palladium.paf.server.PafDataService;
import com.palladium.paf.data.Intersection;
import java.util.Iterator;
import jtest.Stubs;
import java.lang.reflect.Member;
import jtest.mocks.java.util.ListMock;
import com.palladium.paf.mdb.PafDataCache;
import com.palladium.paf.state.EvalState;
import com.palladium.paf.eval.ES_AllocateBase;

/**
 * ES_AllocateBaseTest is a unit test class for class ES_AllocateBase.
 * @see com.palladium.paf.eval.ES_AllocateBase
 * @author Parasoft Jtest 8.0
 */
public class ES_AllocateBaseTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public ES_AllocateBaseTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }

	/**
	 * Test for method: allocateToTargets(java.util.List,double,double,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_AllocateBase#allocateToTargets(java.util.List,double,double,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAllocateToTargets20() throws Throwable {
		ES_AllocateBase THIS = new ES_AllocateBase() {
			public void performEvaluation(
				EvalState arg0,
				PafDataCache arg1,
				IFormulaEvalEngine arg2) {
			}
		};
		Object[] var1 = new Object[] {};
		ListMock t1 = new ListMock(var1);
		String[] var2 = new String[] {};
		_f0 = new Intersection((String[]) null, var2);
		PafDataCache var3 = (PafDataCache) Stubs
			.makeStubObject(PafDataCache.class);
		// jtest_tested_method
		THIS.allocateToTargets(t1, 0.0, 0.0, var3, (EvalState) null);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testAllocateToTargets20.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAllocateToTargets20(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(PafDataService.class);
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return _f0;
			}
		}
		if (Stubs.matches(method, PafDataCache.class)) {
			argument_types = new Class[] { String[].class };
			if (Stubs.matches(method, "getCellValue", argument_types)) {
				return new Double(0.000000);
			}
			argument_types = new Class[] { String[].class, Double.TYPE };
			if (Stubs.matches(method, "setCellValue", argument_types)) {
				return Stubs.VOID;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: ES_AllocateBase()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_AllocateBase#ES_AllocateBase()
	 * @author Parasoft Jtest 8.0
	 */
	public void testES_AllocateBase1() throws Throwable {
		// jtest_tested_method
		ES_AllocateBase THIS = new ES_AllocateBase() {
			public void performEvaluation(
				EvalState arg0,
				PafDataCache arg1,
				IFormulaEvalEngine arg2) {
			}
		};
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testES_AllocateBase1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsES_AllocateBase1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, DriverManagerConnectionProvider.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return null;
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
     * Usage: java com.palladium.paf.eval.ES_AllocateBaseTest
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
            ES_AllocateBaseTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.eval.ES_AllocateBase",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return ES_AllocateBase.class;
    }

        /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private Intersection _f0;
                                    												}

// JTEST_CURRENT_ID=-124354002.