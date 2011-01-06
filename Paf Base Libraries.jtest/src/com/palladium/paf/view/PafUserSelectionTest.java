/*
 * PafUserSelectionTest.java
 * Created by Jtest on 9/19/06 6:12:08 PM.
 */

package com.palladium.paf.view;

import java.lang.reflect.Member;
import jtest.Stubs;
import com.palladium.paf.data.ExpOperation;
import com.palladium.paf.view.PafUserSelection;

/**
 * PafUserSelectionTest is a unit test class for class PafUserSelection.
 * @see com.palladium.paf.view.PafUserSelection
 * @author Parasoft Jtest 8.0
 */
public class PafUserSelectionTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafUserSelectionTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}
	/**
	 * Test for method: clone()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafUserSelection#clone()
	 * @author Parasoft Jtest 8.0
	 */
	public void testClone1() throws Throwable {
		ExpOperation var1 = (ExpOperation) Stubs
			.makeStubObject(ExpOperation.class);
		PafUserSelection THIS = new PafUserSelection(var1);
		// jtest_tested_method
		Object RETVAL = THIS.clone();
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.view.PafUserSelection.<init>(PafUserSelection.java:44)
		// jtest_unverified
	}

	/**
	 * Stubs method for testClone1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsClone1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ExpOperation.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getParms", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.data.ExpOperation.getParms()");
				switch (index) {
					case 1 :
					case 2 :
						return new String[1];
					// at com.palladium.paf.view.PafUserSelection.<init>(PafUserSelection.java:43)
					case 3 :
					case 4 :
						return new String[2];
					// at com.palladium.paf.view.PafUserSelection.<init>(PafUserSelection.java:44)
					case 5 :
					case 6 :
						return new String[] { null, null, "0" };
					// at com.palladium.paf.view.PafUserSelection.<init>(PafUserSelection.java:45)
					case 7 :
					case 8 :
						return new String[4];
					// at com.palladium.paf.view.PafUserSelection.<init>(PafUserSelection.java:46)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDimension()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafUserSelection#getDimension()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDimension1() throws Throwable {
		PafUserSelection THIS = new PafUserSelection();
		// jtest_tested_method
		String RETVAL = THIS.getDimension();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getValues()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafUserSelection#getValues()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetValues2() throws Throwable {
		PafUserSelection THIS = new PafUserSelection();
		// jtest_tested_method
		String[] RETVAL = THIS.getValues();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isMultiples()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafUserSelection#isMultiples()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsMultiples1() throws Throwable {
		PafUserSelection THIS = new PafUserSelection();
		// jtest_tested_method
		boolean RETVAL = THIS.isMultiples();
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isMultiples()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafUserSelection#isMultiples()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsMultiples2() throws Throwable {
		PafUserSelection THIS = new PafUserSelection();
		PafAxis t1 = new PafAxis(7);
		String[] var1 = new String[] {};
		THIS.setValues(var1);
		THIS.setDimension("");
		THIS.setId("");
		THIS.setMultiples(true);
		THIS.setPromptString("");
		THIS.setPafAxis(t1);
		// jtest_tested_method
		boolean RETVAL = THIS.isMultiples();
		assertEquals(true, RETVAL); // jtest_unverified
		assertEquals(2, t1.getPageAxis()); // jtest_unverified
		assertEquals(1, t1.getColAxis()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafUserSelection(com.palladium.paf.data.ExpOperation)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafUserSelection#PafUserSelection(com.palladium.paf.data.ExpOperation)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafUserSelection1() throws Throwable {
		// jtest_tested_method
		PafUserSelection THIS = new PafUserSelection((ExpOperation) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.view.PafUserSelection.<init>(Lcom/palladium/paf/data/ExpOperation;)V>
		// at com.palladium.paf.view.PafUserSelection.<init>(PafUserSelection.java:43)
		// jtest_unverified
	}

	/**
	 * Test for method: PafUserSelection(com.palladium.paf.data.ExpOperation)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafUserSelection#PafUserSelection(com.palladium.paf.data.ExpOperation)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafUserSelection3() throws Throwable {
		ExpOperation var1 = (ExpOperation) Stubs
			.makeStubObject(ExpOperation.class);
		// jtest_tested_method
		PafUserSelection THIS = new PafUserSelection(var1);
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.view.PafUserSelection.<init>(PafUserSelection.java:43)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafUserSelection3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafUserSelection3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ExpOperation.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getParms", argument_types)) {
				return new String[0];
				// at com.palladium.paf.view.PafUserSelection.<init>(PafUserSelection.java:43)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: setId(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafUserSelection#setId(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetId1() throws Throwable {
		PafUserSelection THIS = new PafUserSelection();
		PafAxis t1 = new PafAxis(7);
		String[] var1 = new String[] {};
		THIS.setValues(var1);
		THIS.setDimension("");
		THIS.setId("");
		THIS.setMultiples(true);
		THIS.setPromptString("");
		THIS.setPafAxis(t1);
		// jtest_tested_method
		THIS.setId("");
		assertEquals("", THIS.getId()); // jtest_unverified
		assertEquals(2, t1.getPageAxis()); // jtest_unverified
		assertEquals(1, t1.getColAxis()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setValues(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafUserSelection#setValues(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetValues1() throws Throwable {
		PafUserSelection THIS = new PafUserSelection();
		PafAxis t1 = new PafAxis();
		String[] var1 = new String[] {};
		THIS.setValues(var1);
		THIS.setDimension("");
		THIS.setId("");
		THIS.setMultiples(true);
		THIS.setPromptString("");
		THIS.setPafAxis(t1);
		String[] var2 = new String[] {};
		// jtest_tested_method
		THIS.setValues(var2);
		assertSame(var2, THIS.getValues()); // jtest_unverified
		assertEquals(2, t1.getPageAxis()); // jtest_unverified
		assertEquals(1, t1.getColAxis()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.view.PafUserSelectionTest
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
			PafUserSelectionTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.view.PafUserSelection",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafUserSelection.class;
	}

	/**
	 * Used to keep track of how many times a stubbed method has been called.
	 * @author Parasoft Jtest 8.0
	 */
private jtest.StubIterationCounter _stubs_iteration;
}

// JTEST_CURRENT_ID=1268892539.