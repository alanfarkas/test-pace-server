/*
 * MemberTreeSetTest.java
 * Created by Jtest on 9/19/06 5:57:19 PM.
 */

package com.palladium.paf.data;

import com.palladium.paf.mdb.PafMemberTree;
import java.util.Set;
import java.util.Collection;
import com.palladium.paf.data.MemberTreeSet;

/**
 * MemberTreeSetTest is a unit test class for class MemberTreeSet.
 * @see com.palladium.paf.data.MemberTreeSet
 * @author Parasoft Jtest 8.0
 */
public class MemberTreeSetTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public MemberTreeSetTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: addTree(java.lang.String,com.palladium.paf.mdb.PafMemberTree)
	 * @throws Throwable Tests may throw any Throwable
	 * @see MemberTreeSet#addTree(java.lang.String,com.palladium.paf.mdb.PafMemberTree)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddTree1() throws Throwable {
		MemberTreeSet THIS = new MemberTreeSet();
		// jtest_tested_method
		THIS.addTree((String) null, (PafMemberTree) null);
		assertNotNull(THIS.getTreeDimensions()); // jtest_unverified
		assertEquals("[null]", THIS.getTreeDimensions().toString()); // jtest_unverified
		assertNotNull(THIS.getTrees()); // jtest_unverified
		assertEquals("[null]", THIS.getTrees().toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getTree(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see MemberTreeSet#getTree(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetTree1() throws Throwable {
		MemberTreeSet THIS = new MemberTreeSet();
		// jtest_tested_method
		PafMemberTree RETVAL = THIS.getTree((String) null);
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getTreeDimensions()
	 * @throws Throwable Tests may throw any Throwable
	 * @see MemberTreeSet#getTreeDimensions()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetTreeDimensions1() throws Throwable {
		MemberTreeSet THIS = new MemberTreeSet();
		// jtest_tested_method
		Set RETVAL = THIS.getTreeDimensions();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("[]", RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getTrees()
	 * @throws Throwable Tests may throw any Throwable
	 * @see MemberTreeSet#getTrees()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetTrees1() throws Throwable {
		MemberTreeSet THIS = new MemberTreeSet();
		// jtest_tested_method
		Collection RETVAL = THIS.getTrees();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("[]", RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: MemberTreeSet()
	 * @throws Throwable Tests may throw any Throwable
	 * @see MemberTreeSet#MemberTreeSet()
	 * @author Parasoft Jtest 8.0
	 */
	public void testMemberTreeSet1() throws Throwable {
		// jtest_tested_method
		MemberTreeSet THIS = new MemberTreeSet();
		assertNotNull(THIS.getTreeDimensions()); // jtest_unverified
		assertEquals("[]", THIS.getTreeDimensions().toString()); // jtest_unverified
		assertNotNull(THIS.getTrees()); // jtest_unverified
		assertEquals("[]", THIS.getTrees().toString()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.data.MemberTreeSetTest
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
			MemberTreeSetTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.data.MemberTreeSet",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return MemberTreeSet.class;
	}

}

// JTEST_CURRENT_ID=865868535.