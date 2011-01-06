/*
 * RuleSetTest.java
 * Created by Jtest on 9/19/06 5:59:23 PM.
 * Updated by Jtest on 10/18/06 7:33:26 PM, 1 test case added, 1 test case removed.
 * Updated by Jtest on 11/9/06 3:27:45 AM, 1 test case added, 1 test case removed.
 */

package com.palladium.paf.rules;

import com.palladium.paf.rules.RuleSet;

/**
 * RuleSetTest is a unit test class for class RuleSet.
 * @see com.palladium.paf.rules.RuleSet
 * @author Parasoft Jtest 8.0
 */
public class RuleSetTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public RuleSetTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: clone()
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleSet#clone()
	 * @author Parasoft Jtest 8.0
	 */
	public void testClone1() throws Throwable {
		RuleSet THIS = new RuleSet();
		// jtest_tested_method
		Object RETVAL = THIS.clone();
		assertTrue(RETVAL instanceof RuleSet); // jtest_unverified
		assertEquals("", RETVAL.toString()); // jtest_unverified
		assertEquals("", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDimension()
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleSet#getDimension()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDimension1() throws Throwable {
		RuleSet THIS = new RuleSet();
		// jtest_tested_method
		String RETVAL = THIS.getDimension();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDimension()
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleSet#getDimension()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDimension2() throws Throwable {
		RuleSet THIS = new RuleSet();
		THIS.setDimension("");
		THIS.setType(0);
		THIS.setName("");
		String[] var1 = new String[] {};
		THIS.setMeasureList(var1);
		// jtest_tested_method
		String RETVAL = THIS.getDimension();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getMeasureList()
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleSet#getMeasureList()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMeasureList1() throws Throwable {
		RuleSet THIS = new RuleSet();
		// jtest_tested_method
		String[] RETVAL = THIS.getMeasureList();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleSet#getName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetName1() throws Throwable {
		RuleSet THIS = new RuleSet();
		// jtest_tested_method
		String RETVAL = THIS.getName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getRuleGroups()
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleSet#getRuleGroups()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRuleGroups1() throws Throwable {
		RuleSet THIS = new RuleSet();
		// jtest_tested_method
		RuleGroup[] RETVAL = THIS.getRuleGroups();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0, RETVAL.length); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getType()
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleSet#getType()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetType1() throws Throwable {
		RuleSet THIS = new RuleSet();
		// jtest_tested_method
		int RETVAL = THIS.getType();
		assertEquals(0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: removeRuleGroup(com.palladium.paf.rules.RuleGroup)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleSet#removeRuleGroup(com.palladium.paf.rules.RuleGroup)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRemoveRuleGroup1() throws Throwable {
		RuleSet THIS = new RuleSet();
		// jtest_tested_method
		THIS.removeRuleGroup((RuleGroup) null);
		assertEquals("", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: RuleSet()
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleSet#RuleSet()
	 * @author Parasoft Jtest 8.0
	 */
	public void testRuleSet1() throws Throwable {
		// jtest_tested_method
		RuleSet THIS = new RuleSet();
		assertEquals("", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setDimension(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleSet#setDimension(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDimension1() throws Throwable {
		RuleSet THIS = new RuleSet();
		// jtest_tested_method
		THIS.setDimension("");
		assertEquals("", THIS.getDimension()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setMeasureList(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleSet#setMeasureList(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetMeasureList1() throws Throwable {
		RuleSet THIS = new RuleSet();
		String[] var1 = new String[] {};
		// jtest_tested_method
		THIS.setMeasureList(var1);
		assertSame(var1, THIS.getMeasureList()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleSet#setName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetName1() throws Throwable {
		RuleSet THIS = new RuleSet();
		// jtest_tested_method
		THIS.setName("");
		assertEquals("", THIS.getName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setRuleGroups(com.palladium.paf.rules.RuleGroup[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleSet#setRuleGroups(com.palladium.paf.rules.RuleGroup[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetRuleGroups1() throws Throwable {
		RuleSet THIS = new RuleSet();
		// jtest_tested_method
		THIS.setRuleGroups((RuleGroup[]) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.rules.RuleSet.setRuleGroups([Lcom/palladium/paf/rules/RuleGroup;)V>
		// at com.palladium.paf.rules.RuleSet.setRuleGroups(RuleSet.java:32)
		// jtest_unverified
	}

	/**
	 * Test for method: setRuleGroups(com.palladium.paf.rules.RuleGroup[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleSet#setRuleGroups(com.palladium.paf.rules.RuleGroup[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetRuleGroups2() throws Throwable {
		RuleSet THIS = new RuleSet();
		RuleGroup[] var1 = new RuleGroup[] {};
		// jtest_tested_method
		THIS.setRuleGroups(var1);
		assertNotNull(THIS.getRuleGroups()); // jtest_unverified
		assertEquals(0, THIS.getRuleGroups().length); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setRuleGroups(com.palladium.paf.rules.RuleGroup[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleSet#setRuleGroups(com.palladium.paf.rules.RuleGroup[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetRuleGroups3() throws Throwable {
		RuleSet THIS = new RuleSet();
		THIS.setDimension("");
		THIS.setType(0);
		THIS.setName("");
		String[] var1 = new String[] {};
		THIS.setMeasureList(var1);
		RuleGroup[] var2 = new RuleGroup[] { null };
		// jtest_tested_method
		THIS.setRuleGroups(var2);
		assertEquals(null, var2[0]); // jtest_unverified
		assertNotNull(THIS.getRuleGroups()); // jtest_unverified
		assertEquals(1, THIS.getRuleGroups().length); // jtest_unverified
		assertEquals(null, THIS.getRuleGroups()[0]); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setType(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleSet#setType(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetType1() throws Throwable {
		RuleSet THIS = new RuleSet();
		// jtest_tested_method
		THIS.setType(7);
		assertEquals(7, THIS.getType()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: toString()
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleSet#toString()
	 * @author Parasoft Jtest 8.0
	 */
	public void testToString1() throws Throwable {
		RuleSet THIS = new RuleSet();
		// jtest_tested_method
		String RETVAL = THIS.toString();
		assertEquals("", RETVAL); // jtest_unverified
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
	 * Usage: java com.palladium.paf.rules.RuleSetTest
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
			RuleSetTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.rules.RuleSet",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return RuleSet.class;
	}

																										}

// JTEST_CURRENT_ID=-670425169.