/*
 * PafSimpleTreeTest.java
 * Created by Jtest on 9/19/06 5:23:40 PM.
 */

package com.palladium.paf.mdb;

import com.palladium.paf.mdb.PafSimpleTree;

/**
 * PafSimpleTreeTest is a unit test class for class PafSimpleTree.
 * @see com.palladium.paf.mdb.PafSimpleTree
 * @author Parasoft Jtest 8.0
 */
public class PafSimpleTreeTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafSimpleTreeTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getAliasTableNames()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleTree#getAliasTableNames()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAliasTableNames1() throws Throwable {
		PafSimpleTree THIS = new PafSimpleTree((String) null, (String[]) null);
		// jtest_tested_method
		String[] RETVAL = THIS.getAliasTableNames();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getAliasTableNames()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleTree#getAliasTableNames()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAliasTableNames2() throws Throwable {
		String[] var1 = new String[] {};
		PafSimpleTree THIS = new PafSimpleTree("", var1);
		THIS.setId("");
		String[] var2 = new String[] {};
		THIS.setMemberKeys(var2);
		PafSimpleMember[] var3 = new PafSimpleMember[] {};
		THIS.setMemberObjects(var3);
		String[] var4 = new String[] {};
		THIS.setTraversedMembers(var4);
		THIS.setRootKey("");
		String[] var5 = new String[] {};
		THIS.setAliasTableNames(var5);
		// jtest_tested_method
		String[] RETVAL = THIS.getAliasTableNames();
		assertEquals(var5, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getId()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleTree#getId()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetId1() throws Throwable {
		PafSimpleTree THIS = new PafSimpleTree((String) null, (String[]) null);
		// jtest_tested_method
		String RETVAL = THIS.getId();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getId()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleTree#getId()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetId2() throws Throwable {
		PafSimpleTree THIS = new PafSimpleTree((String) null, (String[]) null);
		THIS.setId("");
		String[] var1 = new String[] {};
		THIS.setMemberKeys(var1);
		PafSimpleMember[] var2 = new PafSimpleMember[] {};
		THIS.setMemberObjects(var2);
		String[] var3 = new String[] {};
		THIS.setTraversedMembers(var3);
		THIS.setRootKey("");
		String[] var4 = new String[] {};
		THIS.setAliasTableNames(var4);
		// jtest_tested_method
		String RETVAL = THIS.getId();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getMemberKeys()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleTree#getMemberKeys()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberKeys1() throws Throwable {
		PafSimpleTree THIS = new PafSimpleTree((String) null, (String[]) null);
		// jtest_tested_method
		String[] RETVAL = THIS.getMemberKeys();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getMemberKeys()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleTree#getMemberKeys()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberKeys2() throws Throwable {
		String[] var1 = new String[] {};
		PafSimpleTree THIS = new PafSimpleTree("", var1);
		THIS.setId("");
		String[] var2 = new String[] {};
		THIS.setMemberKeys(var2);
		PafSimpleMember[] var3 = new PafSimpleMember[] {};
		THIS.setMemberObjects(var3);
		String[] var4 = new String[] {};
		THIS.setTraversedMembers(var4);
		THIS.setRootKey("");
		String[] var5 = new String[] {};
		THIS.setAliasTableNames(var5);
		// jtest_tested_method
		String[] RETVAL = THIS.getMemberKeys();
		assertEquals(var2, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getMemberObjects()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleTree#getMemberObjects()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberObjects1() throws Throwable {
		PafSimpleTree THIS = new PafSimpleTree((String) null, (String[]) null);
		// jtest_tested_method
		PafSimpleMember[] RETVAL = THIS.getMemberObjects();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getMemberObjects()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleTree#getMemberObjects()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberObjects2() throws Throwable {
		String[] var1 = new String[] {};
		PafSimpleTree THIS = new PafSimpleTree("", var1);
		THIS.setId("");
		String[] var2 = new String[] {};
		THIS.setMemberKeys(var2);
		PafSimpleMember[] var3 = new PafSimpleMember[] {};
		THIS.setMemberObjects(var3);
		String[] var4 = new String[] {};
		THIS.setTraversedMembers(var4);
		THIS.setRootKey("");
		String[] var5 = new String[] {};
		THIS.setAliasTableNames(var5);
		// jtest_tested_method
		PafSimpleMember[] RETVAL = THIS.getMemberObjects();
		assertEquals(var3, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getRootKey()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleTree#getRootKey()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRootKey1() throws Throwable {
		PafSimpleTree THIS = new PafSimpleTree((String) null, (String[]) null);
		// jtest_tested_method
		String RETVAL = THIS.getRootKey();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getRootKey()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleTree#getRootKey()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRootKey2() throws Throwable {
		String[] var1 = new String[] {};
		PafSimpleTree THIS = new PafSimpleTree("", var1);
		THIS.setId("");
		String[] var2 = new String[] {};
		THIS.setMemberKeys(var2);
		PafSimpleMember[] var3 = new PafSimpleMember[] {};
		THIS.setMemberObjects(var3);
		String[] var4 = new String[] {};
		THIS.setTraversedMembers(var4);
		THIS.setRootKey("");
		String[] var5 = new String[] {};
		THIS.setAliasTableNames(var5);
		// jtest_tested_method
		String RETVAL = THIS.getRootKey();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getTraversedMembers()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleTree#getTraversedMembers()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetTraversedMembers1() throws Throwable {
		PafSimpleTree THIS = new PafSimpleTree((String) null, (String[]) null);
		// jtest_tested_method
		String[] RETVAL = THIS.getTraversedMembers();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getTraversedMembers()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleTree#getTraversedMembers()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetTraversedMembers2() throws Throwable {
		String[] var1 = new String[] {};
		PafSimpleTree THIS = new PafSimpleTree("", var1);
		THIS.setId("");
		String[] var2 = new String[] {};
		THIS.setMemberKeys(var2);
		PafSimpleMember[] var3 = new PafSimpleMember[] {};
		THIS.setMemberObjects(var3);
		String[] var4 = new String[] {};
		THIS.setTraversedMembers(var4);
		THIS.setRootKey("");
		String[] var5 = new String[] {};
		THIS.setAliasTableNames(var5);
		// jtest_tested_method
		String[] RETVAL = THIS.getTraversedMembers();
		assertEquals(var4, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafSimpleTree()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleTree#PafSimpleTree()
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafSimpleTree1() throws Throwable {
		// jtest_tested_method
		PafSimpleTree THIS = new PafSimpleTree();
		assertEquals(null, THIS.getId()); // jtest_unverified
		assertEquals(null, THIS.getAliasTableNames()); // jtest_unverified
		assertEquals(null, THIS.getMemberKeys()); // jtest_unverified
		assertEquals(null, THIS.getMemberObjects()); // jtest_unverified
		assertEquals(null, THIS.getRootKey()); // jtest_unverified
		assertEquals(null, THIS.getTraversedMembers()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafSimpleTree(java.lang.String,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleTree#PafSimpleTree(java.lang.String,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafSimpleTree2() throws Throwable {
		// jtest_tested_method
		PafSimpleTree THIS = new PafSimpleTree((String) null, (String[]) null);
		assertEquals(null, THIS.getId()); // jtest_unverified
		assertEquals(null, THIS.getAliasTableNames()); // jtest_unverified
		assertEquals(null, THIS.getMemberKeys()); // jtest_unverified
		assertEquals(null, THIS.getMemberObjects()); // jtest_unverified
		assertEquals(null, THIS.getRootKey()); // jtest_unverified
		assertEquals(null, THIS.getTraversedMembers()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafSimpleTree(java.lang.String,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleTree#PafSimpleTree(java.lang.String,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafSimpleTree3() throws Throwable {
		String[] var1 = new String[] {};
		// jtest_tested_method
		PafSimpleTree THIS = new PafSimpleTree("", var1);
		assertEquals("", THIS.getId()); // jtest_unverified
		assertSame(var1, THIS.getAliasTableNames()); // jtest_unverified
		assertEquals(null, THIS.getMemberKeys()); // jtest_unverified
		assertEquals(null, THIS.getMemberObjects()); // jtest_unverified
		assertEquals("", THIS.getRootKey()); // jtest_unverified
		assertEquals(null, THIS.getTraversedMembers()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setAliasTableNames(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleTree#setAliasTableNames(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetAliasTableNames1() throws Throwable {
		String[] var1 = new String[] {};
		PafSimpleTree THIS = new PafSimpleTree("", var1);
		THIS.setId("");
		String[] var2 = new String[] {};
		THIS.setMemberKeys(var2);
		PafSimpleMember[] var3 = new PafSimpleMember[] {};
		THIS.setMemberObjects(var3);
		String[] var4 = new String[] {};
		THIS.setTraversedMembers(var4);
		THIS.setRootKey("");
		String[] var5 = new String[] {};
		THIS.setAliasTableNames(var5);
		String[] var6 = new String[] {};
		// jtest_tested_method
		THIS.setAliasTableNames(var6);
		assertSame(var6, THIS.getAliasTableNames()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setId(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleTree#setId(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetId1() throws Throwable {
		String[] var1 = new String[] {};
		PafSimpleTree THIS = new PafSimpleTree("", var1);
		THIS.setId("");
		String[] var2 = new String[] {};
		THIS.setMemberKeys(var2);
		PafSimpleMember[] var3 = new PafSimpleMember[] {};
		THIS.setMemberObjects(var3);
		String[] var4 = new String[] {};
		THIS.setTraversedMembers(var4);
		THIS.setRootKey("");
		String[] var5 = new String[] {};
		THIS.setAliasTableNames(var5);
		// jtest_tested_method
		THIS.setId("");
		assertEquals("", THIS.getId()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setMemberKeys(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleTree#setMemberKeys(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetMemberKeys1() throws Throwable {
		String[] var1 = new String[] {};
		PafSimpleTree THIS = new PafSimpleTree("", var1);
		THIS.setId("");
		String[] var2 = new String[] {};
		THIS.setMemberKeys(var2);
		PafSimpleMember[] var3 = new PafSimpleMember[] {};
		THIS.setMemberObjects(var3);
		String[] var4 = new String[] {};
		THIS.setTraversedMembers(var4);
		THIS.setRootKey("");
		String[] var5 = new String[] {};
		THIS.setAliasTableNames(var5);
		String[] var6 = new String[] {};
		// jtest_tested_method
		THIS.setMemberKeys(var6);
		assertSame(var6, THIS.getMemberKeys()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setMemberObjects(com.palladium.paf.mdb.PafSimpleMember[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleTree#setMemberObjects(com.palladium.paf.mdb.PafSimpleMember[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetMemberObjects1() throws Throwable {
		String[] var1 = new String[] {};
		PafSimpleTree THIS = new PafSimpleTree("", var1);
		THIS.setId("");
		String[] var2 = new String[] {};
		THIS.setMemberKeys(var2);
		PafSimpleMember[] var3 = new PafSimpleMember[] {};
		THIS.setMemberObjects(var3);
		String[] var4 = new String[] {};
		THIS.setTraversedMembers(var4);
		THIS.setRootKey("");
		String[] var5 = new String[] {};
		THIS.setAliasTableNames(var5);
		PafSimpleMember[] var6 = new PafSimpleMember[] {};
		// jtest_tested_method
		THIS.setMemberObjects(var6);
		assertSame(var6, THIS.getMemberObjects()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setRootKey(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleTree#setRootKey(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetRootKey1() throws Throwable {
		String[] var1 = new String[] {};
		PafSimpleTree THIS = new PafSimpleTree("", var1);
		THIS.setId("");
		String[] var2 = new String[] {};
		THIS.setMemberKeys(var2);
		PafSimpleMember[] var3 = new PafSimpleMember[] {};
		THIS.setMemberObjects(var3);
		String[] var4 = new String[] {};
		THIS.setTraversedMembers(var4);
		THIS.setRootKey("");
		String[] var5 = new String[] {};
		THIS.setAliasTableNames(var5);
		// jtest_tested_method
		THIS.setRootKey("");
		assertEquals("", THIS.getRootKey()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setTraversedMembers(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleTree#setTraversedMembers(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetTraversedMembers1() throws Throwable {
		String[] var1 = new String[] {};
		PafSimpleTree THIS = new PafSimpleTree("", var1);
		THIS.setId("");
		String[] var2 = new String[] {};
		THIS.setMemberKeys(var2);
		PafSimpleMember[] var3 = new PafSimpleMember[] {};
		THIS.setMemberObjects(var3);
		String[] var4 = new String[] {};
		THIS.setTraversedMembers(var4);
		THIS.setRootKey("");
		String[] var5 = new String[] {};
		THIS.setAliasTableNames(var5);
		String[] var6 = new String[] {};
		// jtest_tested_method
		THIS.setTraversedMembers(var6);
		assertSame(var6, THIS.getTraversedMembers()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.mdb.PafSimpleTreeTest
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
			PafSimpleTreeTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.mdb.PafSimpleTree",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafSimpleTree.class;
	}

}

// JTEST_CURRENT_ID=-1694788955.