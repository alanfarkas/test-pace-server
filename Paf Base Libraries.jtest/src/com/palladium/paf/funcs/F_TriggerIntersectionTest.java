/*
 * F_TriggerIntersectionTest.java
 * Created by Jtest on 9/19/06 5:36:00 PM.
 * Updated by Jtest on 10/18/06 7:47:10 PM, 7 test cases added, 7 test cases removed.
 * Updated by Jtest on 11/9/06 2:50:03 AM, 7 test cases added, 7 test cases removed.
 */

package com.palladium.paf.funcs;

import java.util.List;
import java.lang.reflect.Member;
import com.palladium.paf.data.IPafDataCache;
import com.palladium.paf.data.Intersection;
import jtest.Stubs;
import com.palladium.paf.state.IPafEvalState;
import java.util.Set;
import com.palladium.paf.funcs.F_TriggerIntersection;

/**
 * F_TriggerIntersectionTest is a unit test class for class F_TriggerIntersection.
 * @see com.palladium.paf.funcs.F_TriggerIntersection
 * @author Parasoft Jtest 8.0
 */
public class F_TriggerIntersectionTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public F_TriggerIntersectionTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: calculate(com.palladium.paf.data.Intersection,com.palladium.paf.data.IPafDataCache,com.palladium.paf.state.IPafEvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see F_TriggerIntersection#calculate(com.palladium.paf.data.Intersection,com.palladium.paf.data.IPafDataCache,com.palladium.paf.state.IPafEvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalculate1() throws Throwable {
		F_TriggerIntersection THIS = new F_TriggerIntersection();
		// jtest_tested_method
		double RETVAL = THIS.calculate(
			(Intersection) null,
			(IPafDataCache) null,
			(IPafEvalState) null);
		// NullPointerException thrown, originator is arg 3 to <Method com.palladium.paf.funcs.F_TriggerIntersection.calculate(Lcom/palladium/paf/data/Intersection;Lcom/palladium/paf/data/IPafDataCache;Lcom/palladium/paf/state/IPafEvalState;)D>
		// at com.palladium.paf.funcs.F_TriggerIntersection.calculate(F_TriggerIntersection.java:51)
		// jtest_unverified
	}

	/**
	 * Test for method: calculate(com.palladium.paf.data.Intersection,com.palladium.paf.data.IPafDataCache,com.palladium.paf.state.IPafEvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see F_TriggerIntersection#calculate(com.palladium.paf.data.Intersection,com.palladium.paf.data.IPafDataCache,com.palladium.paf.state.IPafEvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalculate2() throws Throwable {
		F_TriggerIntersection THIS = new F_TriggerIntersection();
		IPafEvalState var1 = (IPafEvalState) Stubs
			.makeStubObject(IPafEvalState.class);
		// jtest_tested_method
		double RETVAL = THIS.calculate(
			(Intersection) null,
			(IPafDataCache) null,
			var1);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.funcs.F_TriggerIntersection.calculate(Lcom/palladium/paf/data/Intersection;Lcom/palladium/paf/data/IPafDataCache;Lcom/palladium/paf/state/IPafEvalState;)D>
		// at com.palladium.paf.funcs.F_TriggerIntersection.calculate(F_TriggerIntersection.java:53)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalculate2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalculate2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, IPafEvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return null;
				// at com.palladium.paf.funcs.F_TriggerIntersection.calculate(F_TriggerIntersection.java:51)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: calculate(com.palladium.paf.data.Intersection,com.palladium.paf.data.IPafDataCache,com.palladium.paf.state.IPafEvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see F_TriggerIntersection#calculate(com.palladium.paf.data.Intersection,com.palladium.paf.data.IPafDataCache,com.palladium.paf.state.IPafEvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalculate3() throws Throwable {
		F_TriggerIntersection THIS = new F_TriggerIntersection();
		Intersection t1 = new Intersection((String[]) null, (String[]) null);
		IPafEvalState var1 = (IPafEvalState) Stubs
			.makeStubObject(IPafEvalState.class);
		// jtest_tested_method
		double RETVAL = THIS.calculate(t1, (IPafDataCache) null, var1);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.data.Intersection.<init>([Ljava/lang/String;[Ljava/lang/String;)V>
		// at com.palladium.paf.data.Intersection.clone(Intersection.java:127)
		// at com.palladium.paf.funcs.F_TriggerIntersection.calculate(F_TriggerIntersection.java:53)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalculate3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalculate3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, IPafEvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return null;
				// at com.palladium.paf.funcs.F_TriggerIntersection.calculate(F_TriggerIntersection.java:51)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: calculate(com.palladium.paf.data.Intersection,com.palladium.paf.data.IPafDataCache,com.palladium.paf.state.IPafEvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see F_TriggerIntersection#calculate(com.palladium.paf.data.Intersection,com.palladium.paf.data.IPafDataCache,com.palladium.paf.state.IPafEvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalculate5() throws Throwable {
		F_TriggerIntersection THIS = new F_TriggerIntersection();
		String[] var1 = new String[] { null };
		Intersection t1 = Intersection.createIntersection(
			var1,
			(List) null,
			(List) null,
			(List) null);
		IPafEvalState var2 = (IPafEvalState) Stubs
			.makeStubObject(IPafEvalState.class);
		// jtest_tested_method
		double RETVAL = THIS.calculate(t1, (IPafDataCache) null, var2);
		// NullPointerException thrown
		// at com.palladium.paf.data.Intersection.hashCode(Intersection.java:107)
		// at java.util.HashMap.hash(HashMap.java:264)
		// at java.util.WeakHashMap.getEntry(WeakHashMap.java:370)
		// at java.util.WeakHashMap.containsKey(WeakHashMap.java:361)
		// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:144)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalculate5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalculate5(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, IPafEvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return null;
				// at com.palladium.paf.funcs.F_TriggerIntersection.calculate(F_TriggerIntersection.java:51)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: calculate(com.palladium.paf.data.Intersection,com.palladium.paf.data.IPafDataCache,com.palladium.paf.state.IPafEvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see F_TriggerIntersection#calculate(com.palladium.paf.data.Intersection,com.palladium.paf.data.IPafDataCache,com.palladium.paf.state.IPafEvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalculate6() throws Throwable {
		F_TriggerIntersection THIS = new F_TriggerIntersection();
		String[] var1 = new String[] { null, null };
		Intersection t1 = new Intersection(var1);
		IPafEvalState var2 = (IPafEvalState) Stubs
			.makeStubObject(IPafEvalState.class);
		// jtest_tested_method
		double RETVAL = THIS.calculate(t1, (IPafDataCache) null, var2);
		// NullPointerException thrown
		// at com.palladium.paf.data.Intersection.hashCode(Intersection.java:107)
		// at java.util.HashMap.hash(HashMap.java:264)
		// at java.util.WeakHashMap.getEntry(WeakHashMap.java:370)
		// at java.util.WeakHashMap.containsKey(WeakHashMap.java:361)
		// at com.palladium.paf.funcs.F_TriggerIntersection.calculate(F_TriggerIntersection.java:53)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalculate6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalculate6(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, IPafEvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return null;
				// at com.palladium.paf.funcs.F_TriggerIntersection.calculate(F_TriggerIntersection.java:51)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: calculate(com.palladium.paf.data.Intersection,com.palladium.paf.data.IPafDataCache,com.palladium.paf.state.IPafEvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see F_TriggerIntersection#calculate(com.palladium.paf.data.Intersection,com.palladium.paf.data.IPafDataCache,com.palladium.paf.state.IPafEvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalculate13() throws Throwable {
		F_TriggerIntersection THIS = new F_TriggerIntersection();
		Intersection t1 = new Intersection((String[]) null, (String[]) null);
		String[] var1 = new String[] { null };
		t1.setCoordinates(var1);
		String[] var2 = new String[] {};
		t1.setDimensions(var2);
		IPafEvalState var3 = (IPafEvalState) Stubs
			.makeStubObject(IPafEvalState.class);
		// jtest_tested_method
		double RETVAL = THIS.calculate(t1, (IPafDataCache) null, var3);

		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.data.Intersection.clone(Intersection.java:132)
		// at com.palladium.paf.funcs.F_TriggerIntersection.calculate(F_TriggerIntersection.java:53)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalculate13.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalculate13(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, IPafEvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return null;
				// at com.palladium.paf.funcs.F_TriggerIntersection.calculate(F_TriggerIntersection.java:51)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: calculate(com.palladium.paf.data.Intersection,com.palladium.paf.data.IPafDataCache,com.palladium.paf.state.IPafEvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see F_TriggerIntersection#calculate(com.palladium.paf.data.Intersection,com.palladium.paf.data.IPafDataCache,com.palladium.paf.state.IPafEvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalculate14() throws Throwable {
		F_TriggerIntersection THIS = new F_TriggerIntersection();
		Intersection t1 = new Intersection((String[]) null, (String[]) null);
		String[] var1 = new String[] {};
		_f1 = Intersection.createIntersection(
			var1,
			(List) null,
			(List) null,
			(List) null);
		IPafEvalState var2 = (IPafEvalState) Stubs
			.makeStubObject(IPafEvalState.class);
		// jtest_tested_method
		double RETVAL = THIS.calculate(t1, (IPafDataCache) null, var2);
		// NullPointerException thrown
		// at com.palladium.paf.funcs.F_TriggerIntersection.calculate(F_TriggerIntersection.java:56)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalculate14.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalculate14(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, IPafEvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return null;
				// at com.palladium.paf.funcs.F_TriggerIntersection.calculate(F_TriggerIntersection.java:51)
			}
		}
		if (Stubs.matches(method, Intersection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "clone", argument_types)) {
				return _f1;
				// at com.palladium.paf.funcs.F_TriggerIntersection.calculate(F_TriggerIntersection.java:53)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDirtyIntersections(com.palladium.paf.state.IPafEvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see F_TriggerIntersection#getDirtyIntersections(com.palladium.paf.state.IPafEvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDirtyIntersections1() throws Throwable {
		F_TriggerIntersection THIS = new F_TriggerIntersection();
		// jtest_tested_method
		Set RETVAL = THIS.getDirtyIntersections((IPafEvalState) null);
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("[]", RETVAL.toString()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.funcs.F_TriggerIntersectionTest
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
			F_TriggerIntersectionTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.funcs.F_TriggerIntersection",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return F_TriggerIntersection.class;
	}

			/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private com.palladium.paf.data.Intersection _f1;
				}

// JTEST_CURRENT_ID=1324422042.