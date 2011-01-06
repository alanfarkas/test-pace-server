/*
 * UnitOfWorkTest.java
 * Created by Jtest on 9/19/06 5:48:57 PM.
 * Updated by Jtest on 10/18/06 8:12:45 PM, 6 test cases added, 6 test cases removed.
 * Updated by Jtest on 11/9/06 3:18:59 AM, 6 test cases added, 6 test cases removed.
 */

package com.palladium.paf.app;

import com.palladium.paf.data.PafMemberList;
import com.palladium.paf.data.PafSimpleUow;
import com.palladium.paf.app.UnitOfWork;

/**
 * UnitOfWorkTest is a unit test class for class UnitOfWork.
 * @see com.palladium.paf.app.UnitOfWork
 * @author Parasoft Jtest 8.0
 */
public class UnitOfWorkTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public UnitOfWorkTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: UnitOfWork(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see UnitOfWork#UnitOfWork(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testUnitOfWork1() throws Throwable {
		// jtest_tested_method
		UnitOfWork THIS = new UnitOfWork((String[]) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.app.UnitOfWork.<init>([Ljava/lang/String;)V>
		// at com.palladium.paf.app.UnitOfWork.<init>(UnitOfWork.java:52)
		// jtest_unverified
	}

	/**
	 * Test for method: UnitOfWork(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see UnitOfWork#UnitOfWork(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testUnitOfWork2() throws Throwable {
		String[] var1 = new String[] {};
		// jtest_tested_method
		UnitOfWork THIS = new UnitOfWork(var1);
		assertEquals("UOW: ", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: UnitOfWork(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see UnitOfWork#UnitOfWork(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testUnitOfWork3() throws Throwable {
		String[] var1 = new String[] { null };
		// jtest_tested_method
		UnitOfWork THIS = new UnitOfWork(var1);
		assertEquals(null, var1[0]); // jtest_unverified
		assertEquals("UOW: null : ", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: UnitOfWork(java.lang.String[],java.lang.String[][])
	 * @throws Throwable Tests may throw any Throwable
	 * @see UnitOfWork#UnitOfWork(java.lang.String[],java.lang.String[][])
	 * @author Parasoft Jtest 8.0
	 */
	public void testUnitOfWork6() throws Throwable {
		// jtest_tested_method
		UnitOfWork THIS = new UnitOfWork((String[]) null, (String[][]) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.app.UnitOfWork.<init>([Ljava/lang/String;[[Ljava/lang/String;)V>
		// at com.palladium.paf.app.UnitOfWork.<init>(UnitOfWork.java:59)
		// jtest_unverified
	}

	/**
	 * Test for method: UnitOfWork(java.lang.String[],java.lang.String[][])
	 * @throws Throwable Tests may throw any Throwable
	 * @see UnitOfWork#UnitOfWork(java.lang.String[],java.lang.String[][])
	 * @author Parasoft Jtest 8.0
	 */
	public void testUnitOfWork8() throws Throwable {
		String[] var1 = new String[] {};
		String[][] var2 = new String[][] { {} };
		// jtest_tested_method
		UnitOfWork THIS = new UnitOfWork(var1, var2);
		assertNotNull(var2[0]); // jtest_unverified
		assertEquals(0, var2[0].length); // jtest_unverified
		assertEquals("UOW: ", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: UnitOfWork(java.lang.String[],java.lang.String[][])
	 * @throws Throwable Tests may throw any Throwable
	 * @see UnitOfWork#UnitOfWork(java.lang.String[],java.lang.String[][])
	 * @author Parasoft Jtest 8.0
	 */
	public void testUnitOfWork9() throws Throwable {
		String[] var1 = new String[] {};
		String[][] var2 = new String[][] {};
		// jtest_tested_method
		UnitOfWork THIS = new UnitOfWork(var1, var2);
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.app.UnitOfWork.<init>(UnitOfWork.java:59)
		// jtest_unverified
	}

	/**
	 * Test for method: UnitOfWork(java.lang.String[],java.lang.String[][])
	 * @throws Throwable Tests may throw any Throwable
	 * @see UnitOfWork#UnitOfWork(java.lang.String[],java.lang.String[][])
	 * @author Parasoft Jtest 8.0
	 */
	public void testUnitOfWork10() throws Throwable {
		String[] var1 = new String[] { null };
		String[][] var2 = new String[][] { { null } };
		// jtest_tested_method
		UnitOfWork THIS = new UnitOfWork(var1, var2);
		assertEquals(null, var1[0]); // jtest_unverified
		assertNotNull(var2[0]); // jtest_unverified
		assertEquals(1, var2[0].length); // jtest_unverified
		assertEquals(null, var2[0][0]); // jtest_unverified
		assertEquals("UOW: null : ", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: UnitOfWork(java.lang.String[],java.lang.String[][])
	 * @throws Throwable Tests may throw any Throwable
	 * @see UnitOfWork#UnitOfWork(java.lang.String[],java.lang.String[][])
	 * @author Parasoft Jtest 8.0
	 */
	public void testUnitOfWork13() throws Throwable {
		String[] var1 = new String[] { null };
		String[][] var2 = new String[][] { {} };
		// jtest_tested_method
		UnitOfWork THIS = new UnitOfWork(var1, var2);
		// IllegalArgumentException thrown
		// at com.palladium.paf.app.UnitOfWork.<init>(UnitOfWork.java:60)
		// jtest_unverified
	}

	/**
	 * Test for method: UnitOfWork(java.lang.String[],java.lang.String[][])
	 * @throws Throwable Tests may throw any Throwable
	 * @see UnitOfWork#UnitOfWork(java.lang.String[],java.lang.String[][])
	 * @author Parasoft Jtest 8.0
	 */
	public void testUnitOfWork15() throws Throwable {
		String[] var1 = new String[] { "", null };
		String[][] var2 = new String[][] { { null, null } };
		// jtest_tested_method
		UnitOfWork THIS = new UnitOfWork(var1, var2);
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.app.UnitOfWork.<init>(UnitOfWork.java:65)
		// jtest_unverified
	}

	/**
	 * Test for method: UnitOfWork(com.palladium.paf.data.PafSimpleUow)
	 * @throws Throwable Tests may throw any Throwable
	 * @see UnitOfWork#UnitOfWork(com.palladium.paf.data.PafSimpleUow)
	 * @author Parasoft Jtest 8.0
	 */
	public void testUnitOfWork16() throws Throwable {
		// jtest_tested_method
		UnitOfWork THIS = new UnitOfWork((PafSimpleUow) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.app.UnitOfWork.<init>(Lcom/palladium/paf/data/PafSimpleUow;)V>
		// at com.palladium.paf.app.UnitOfWork.<init>(UnitOfWork.java:41)
		// jtest_unverified
	}

	/**
	 * Test for method: UnitOfWork(com.palladium.paf.data.PafSimpleUow)
	 * @throws Throwable Tests may throw any Throwable
	 * @see UnitOfWork#UnitOfWork(com.palladium.paf.data.PafSimpleUow)
	 * @author Parasoft Jtest 8.0
	 */
	public void testUnitOfWork17() throws Throwable {
		PafSimpleUow t0 = new PafSimpleUow();
		PafMemberList t1 = new PafMemberList();
		PafMemberList[] var1 = new PafMemberList[] { t1 };
		t0.setPafMemberEntries(var1);
		// jtest_tested_method
		UnitOfWork THIS = new UnitOfWork(t0);
		assertEquals("UOW: null : ", THIS.toString()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.app.UnitOfWorkTest
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
			UnitOfWorkTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.app.UnitOfWork",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return UnitOfWork.class;
	}

						}

// JTEST_CURRENT_ID=95346796.