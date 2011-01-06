/*
 * PafIntersectionIteratorTest.java
 * Created by Jtest on 9/19/06 5:45:49 PM.
 * Updated by Jtest on 10/18/06 8:10:20 PM, 2 test cases added, 2 test cases removed.
 * Updated by Jtest on 11/9/06 3:16:46 AM, 2 test cases added, 2 test cases removed.
 */

package com.palladium.paf.mdb;

import java.lang.reflect.Member;
import jtest.Stubs;
import java.util.Map;
import com.palladium.paf.mdb.PafIntersectionIterator;

/**
 * PafIntersectionIteratorTest is a unit test class for class PafIntersectionIterator.
 * @see com.palladium.paf.mdb.PafIntersectionIterator
 * @author Parasoft Jtest 8.0
 */
public class PafIntersectionIteratorTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafIntersectionIteratorTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: atTop()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafIntersectionIterator#atTop()
	 * @author Parasoft Jtest 8.0
	 */
	public void testAtTop1() throws Throwable {
		int[] var1 = new int[] {};
		PafIntersectionIterator THIS = new PafIntersectionIterator(
			var1,
			(PafDataCache) null,
			(Map) null);
		// jtest_tested_method
		boolean RETVAL = THIS.atTop();
		assertEquals(true, RETVAL); // jtest_unverified
		assertEquals("{top of queue}", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getNext()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafIntersectionIterator#getNext()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetNext1() throws Throwable {
		int[] var1 = new int[] {};
		PafIntersectionIterator THIS = new PafIntersectionIterator(
			var1,
			(PafDataCache) null,
			(Map) null);
		// jtest_tested_method
		int[] RETVAL = THIS.getNext();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0, RETVAL.length); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: hasNext()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafIntersectionIterator#hasNext()
	 * @author Parasoft Jtest 8.0
	 */
	public void testHasNext1() throws Throwable {
		int[] var1 = new int[] {};
		PafIntersectionIterator THIS = new PafIntersectionIterator(
			var1,
			(PafDataCache) null,
			(Map) null);
		// jtest_tested_method
		boolean RETVAL = THIS.hasNext();
		assertEquals(true, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafIntersectionIterator(int[],com.palladium.paf.mdb.PafDataCache)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafIntersectionIterator#PafIntersectionIterator(int[],com.palladium.paf.mdb.PafDataCache)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafIntersectionIterator1() throws Throwable {
		// jtest_tested_method
		PafIntersectionIterator THIS = new PafIntersectionIterator(
			(int[]) null,
			(PafDataCache) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.mdb.PafIntersectionIterator.<init>([ILcom/palladium/paf/mdb/PafDataCache;)V>
		// at com.palladium.paf.mdb.PafIntersectionIterator.<init>(PafIntersectionIterator.java:67)
		// at com.palladium.paf.mdb.PafIntersectionIterator.<init>(PafIntersectionIterator.java:52)
		// jtest_unverified
	}

	/**
	 * Test for method: PafIntersectionIterator(int[],com.palladium.paf.mdb.PafDataCache)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafIntersectionIterator#PafIntersectionIterator(int[],com.palladium.paf.mdb.PafDataCache)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafIntersectionIterator2() throws Throwable {
		int[] var1 = new int[] {};
		// jtest_tested_method
		PafIntersectionIterator THIS = new PafIntersectionIterator(
			var1,
			(PafDataCache) null);
		assertEquals("{top of queue}", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafIntersectionIterator(int[],com.palladium.paf.mdb.PafDataCache)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafIntersectionIterator#PafIntersectionIterator(int[],com.palladium.paf.mdb.PafDataCache)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafIntersectionIterator4() throws Throwable {
		int[] var1 = new int[] { 0 };
		PafDataCache var2 = (PafDataCache) Stubs
			.makeStubObject(PafDataCache.class);
		// jtest_tested_method
		PafIntersectionIterator THIS = new PafIntersectionIterator(var1, var2);
		assertEquals(0, var1[0]); // jtest_unverified
		assertEquals("{top of queue}", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafIntersectionIterator4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafIntersectionIterator4(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCache.class)) {
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafIntersectionIterator.<init>(PafIntersectionIterator.java:76)
				// at com.palladium.paf.mdb.PafIntersectionIterator.<init>(PafIntersectionIterator.java:52)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafIntersectionIterator(int[],com.palladium.paf.mdb.PafDataCache)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafIntersectionIterator#PafIntersectionIterator(int[],com.palladium.paf.mdb.PafDataCache)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafIntersectionIterator5() throws Throwable {
		int[] var1 = new int[] { 0 };
		// jtest_tested_method
		PafIntersectionIterator THIS = new PafIntersectionIterator(
			var1,
			(PafDataCache) null);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.mdb.PafIntersectionIterator.<init>([ILcom/palladium/paf/mdb/PafDataCache;)V>
		// at com.palladium.paf.mdb.PafIntersectionIterator.<init>(PafIntersectionIterator.java:76)
		// at com.palladium.paf.mdb.PafIntersectionIterator.<init>(PafIntersectionIterator.java:52)
		// jtest_unverified
	}

	/**
	 * Test for method: PafIntersectionIterator(int[],com.palladium.paf.mdb.PafDataCache,java.util.Map)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafIntersectionIterator#PafIntersectionIterator(int[],com.palladium.paf.mdb.PafDataCache,java.util.Map)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafIntersectionIterator6() throws Throwable {
		int[] var1 = new int[] {};
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		// jtest_tested_method
		PafIntersectionIterator THIS = new PafIntersectionIterator(
			var1,
			(PafDataCache) null,
			var2);
		assertEquals("{top of queue}", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafIntersectionIterator6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafIntersectionIterator6(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafIntersectionIterator.<init>(PafIntersectionIterator.java:106)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: reset()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafIntersectionIterator#reset()
	 * @author Parasoft Jtest 8.0
	 */
	public void testReset1() throws Throwable {
		int[] var1 = new int[] {};
		PafIntersectionIterator THIS = new PafIntersectionIterator(
			var1,
			(PafDataCache) null,
			(Map) null);
		// jtest_tested_method
		THIS.reset();
		assertEquals("{top of queue}", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: toString()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafIntersectionIterator#toString()
	 * @author Parasoft Jtest 8.0
	 */
	public void testToString1() throws Throwable {
		int[] var1 = new int[] {};
		PafIntersectionIterator THIS = new PafIntersectionIterator(
			var1,
			(PafDataCache) null,
			(Map) null);
		// jtest_tested_method
		String RETVAL = THIS.toString();
		assertEquals("{top of queue}", RETVAL); // jtest_unverified
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
	 * Usage: java com.palladium.paf.mdb.PafIntersectionIteratorTest
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
			PafIntersectionIteratorTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.mdb.PafIntersectionIterator",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafIntersectionIterator.class;
	}

			}

// JTEST_CURRENT_ID=-334366004.