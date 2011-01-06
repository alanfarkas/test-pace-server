/*
 * PafPlannerConfigTest.java
 * Created by Jtest on 9/19/06 5:36:10 PM.
 * Updated by Jtest on 11/9/06 2:50:11 AM, 2 test cases added.
 */

package com.palladium.paf.comm;

import com.palladium.paf.comm.PafPlannerConfig;

/**
 * PafPlannerConfigTest is a unit test class for class PafPlannerConfig.
 * @see com.palladium.paf.comm.PafPlannerConfig
 * @author Parasoft Jtest 8.0
 */
public class PafPlannerConfigTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafPlannerConfigTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getCycle()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafPlannerConfig#getCycle()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetCycle1() throws Throwable {
		PafPlannerConfig THIS = new PafPlannerConfig();
		// jtest_tested_method
		String RETVAL = THIS.getCycle();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getCycle()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafPlannerConfig#getCycle()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetCycle2() throws Throwable {
		PafPlannerConfig THIS = new PafPlannerConfig();
		THIS.setCycle("");
		String[] var1 = new String[] {};
		THIS.setMenuItemNames(var1);
		THIS.setRole("");
		String[] var2 = new String[] {};
		THIS.setViewTreeItemNames(var2);
		THIS.setDefaultEvalEnabled(false);
		THIS.setDefaultRulesetName("");
		String[] var3 = new String[] {};
		THIS.setRuleSetNames(var3);
		// jtest_tested_method
		String RETVAL = THIS.getCycle();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDefaultRulesetName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafPlannerConfig#getDefaultRulesetName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDefaultRulesetName1() throws Throwable {
		PafPlannerConfig THIS = new PafPlannerConfig();
		// jtest_tested_method
		String RETVAL = THIS.getDefaultRulesetName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getMenuItemNames()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafPlannerConfig#getMenuItemNames()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMenuItemNames1() throws Throwable {
		PafPlannerConfig THIS = new PafPlannerConfig();
		// jtest_tested_method
		String[] RETVAL = THIS.getMenuItemNames();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getRole()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafPlannerConfig#getRole()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRole1() throws Throwable {
		PafPlannerConfig THIS = new PafPlannerConfig();
		// jtest_tested_method
		String RETVAL = THIS.getRole();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getRuleSetNames()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafPlannerConfig#getRuleSetNames()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRuleSetNames1() throws Throwable {
		PafPlannerConfig THIS = new PafPlannerConfig();
		// jtest_tested_method
		String[] RETVAL = THIS.getRuleSetNames();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getVersionFilter()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafPlannerConfig#getVersionFilter()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetVersionFilter1() throws Throwable {
		PafPlannerConfig THIS = new PafPlannerConfig();
		// jtest_tested_method
		String[] RETVAL = THIS.getVersionFilter();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getViewTreeItemNames()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafPlannerConfig#getViewTreeItemNames()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetViewTreeItemNames1() throws Throwable {
		PafPlannerConfig THIS = new PafPlannerConfig();
		// jtest_tested_method
		String[] RETVAL = THIS.getViewTreeItemNames();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isDefaultEvalEnabled()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafPlannerConfig#isDefaultEvalEnabled()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsDefaultEvalEnabled1() throws Throwable {
		PafPlannerConfig THIS = new PafPlannerConfig();
		// jtest_tested_method
		boolean RETVAL = THIS.isDefaultEvalEnabled();
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setCycle(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafPlannerConfig#setCycle(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetCycle1() throws Throwable {
		PafPlannerConfig THIS = new PafPlannerConfig();
		// jtest_tested_method
		THIS.setCycle("");
		assertEquals("", THIS.getCycle()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setDefaultEvalEnabled(boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafPlannerConfig#setDefaultEvalEnabled(boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDefaultEvalEnabled1() throws Throwable {
		PafPlannerConfig THIS = new PafPlannerConfig();
		// jtest_tested_method
		THIS.setDefaultEvalEnabled(true);
		assertEquals(true, THIS.isDefaultEvalEnabled()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setDefaultRulesetName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafPlannerConfig#setDefaultRulesetName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDefaultRulesetName1() throws Throwable {
		PafPlannerConfig THIS = new PafPlannerConfig();
		// jtest_tested_method
		THIS.setDefaultRulesetName("");
		assertEquals("", THIS.getDefaultRulesetName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setMenuItemNames(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafPlannerConfig#setMenuItemNames(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetMenuItemNames1() throws Throwable {
		PafPlannerConfig THIS = new PafPlannerConfig();
		String[] var1 = new String[] {};
		// jtest_tested_method
		THIS.setMenuItemNames(var1);
		assertSame(var1, THIS.getMenuItemNames()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setRole(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafPlannerConfig#setRole(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetRole1() throws Throwable {
		PafPlannerConfig THIS = new PafPlannerConfig();
		// jtest_tested_method
		THIS.setRole("");
		assertEquals("", THIS.getRole()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setRuleSetNames(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafPlannerConfig#setRuleSetNames(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetRuleSetNames1() throws Throwable {
		PafPlannerConfig THIS = new PafPlannerConfig();
		String[] var1 = new String[] {};
		// jtest_tested_method
		THIS.setRuleSetNames(var1);
		assertSame(var1, THIS.getRuleSetNames()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setVersionFilter(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafPlannerConfig#setVersionFilter(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetVersionFilter1() throws Throwable {
		PafPlannerConfig THIS = new PafPlannerConfig();
		String[] var1 = new String[] {};
		// jtest_tested_method
		THIS.setVersionFilter(var1);
		assertSame(var1, THIS.getVersionFilter()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setViewTreeItemNames(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafPlannerConfig#setViewTreeItemNames(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetViewTreeItemNames1() throws Throwable {
		PafPlannerConfig THIS = new PafPlannerConfig();
		String[] var1 = new String[] {};
		// jtest_tested_method
		THIS.setViewTreeItemNames(var1);
		assertSame(var1, THIS.getViewTreeItemNames()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.comm.PafPlannerConfigTest
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
			PafPlannerConfigTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.comm.PafPlannerConfig",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafPlannerConfig.class;
	}

}

// JTEST_CURRENT_ID=-2121493187.