/*
 * PafSimpleMemberTest.java
 * Created by Jtest on 9/19/06 5:45:31 PM.
 */

package com.palladium.paf.mdb;

import com.palladium.paf.mdb.PafSimpleMember;

/**
 * PafSimpleMemberTest is a unit test class for class PafSimpleMember.
 * @see com.palladium.paf.mdb.PafSimpleMember
 * @author Parasoft Jtest 8.0
 */
public class PafSimpleMemberTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafSimpleMemberTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getChildKeys()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMember#getChildKeys()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetChildKeys1() throws Throwable {
		PafSimpleMember THIS = new PafSimpleMember((String) null);
		// jtest_tested_method
		String[] RETVAL = THIS.getChildKeys();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0, RETVAL.length); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getChildKeys()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMember#getChildKeys()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetChildKeys2() throws Throwable {
		PafSimpleMember THIS = new PafSimpleMember((String) null);
		PafSimpleMemberAttr t1 = new PafSimpleMemberAttr();
		THIS.setKey("");
		THIS.setPafSimpleMemberAttr(t1);
		THIS.setParentKey("");
		String[] var1 = new String[] {};
		THIS.setChildKeys(var1);
		// jtest_tested_method
		String[] RETVAL = THIS.getChildKeys();
		assertEquals(var1, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getKey()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMember#getKey()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetKey1() throws Throwable {
		PafSimpleMember THIS = new PafSimpleMember((String) null);
		// jtest_tested_method
		String RETVAL = THIS.getKey();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getKey()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMember#getKey()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetKey2() throws Throwable {
		PafSimpleMember THIS = new PafSimpleMember((String) null);
		PafSimpleMemberAttr t1 = new PafSimpleMemberAttr();
		THIS.setKey("");
		THIS.setPafSimpleMemberAttr(t1);
		THIS.setParentKey("");
		String[] var1 = new String[] {};
		THIS.setChildKeys(var1);
		// jtest_tested_method
		String RETVAL = THIS.getKey();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPafSimpleMemberAttr()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMember#getPafSimpleMemberAttr()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPafSimpleMemberAttr1() throws Throwable {
		PafSimpleMember THIS = new PafSimpleMember((String) null);
		// jtest_tested_method
		PafSimpleMemberAttr RETVAL = THIS.getPafSimpleMemberAttr();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPafSimpleMemberAttr()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMember#getPafSimpleMemberAttr()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPafSimpleMemberAttr2() throws Throwable {
		PafSimpleMember THIS = new PafSimpleMember("");
		PafSimpleMemberAttr t1 = new PafSimpleMemberAttr();
		THIS.setKey("");
		t1.setId(7L);
		String[] var1 = new String[] {};
		t1.setAliasKeys(var1);
		String[] var2 = new String[] {};
		t1.setAliasValues(var2);
		String[] var3 = new String[] {};
		t1.setAssociatedAttributes(var3);
		t1.setConsolidationType(7);
		t1.setDescription("");
		t1.setFormula("");
		t1.setGenerationNumber(7);
		t1.setLastFormula("");
		t1.setLevelNumber(7);
		t1.setShareOption(7);
		String[] var4 = new String[] {};
		t1.setUDAs(var4);
		THIS.setPafSimpleMemberAttr(t1);
		THIS.setParentKey("");
		String[] var5 = new String[] {};
		THIS.setChildKeys(var5);
		// jtest_tested_method
		PafSimpleMemberAttr RETVAL = THIS.getPafSimpleMemberAttr();
		assertEquals(t1, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getParentKey()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMember#getParentKey()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetParentKey1() throws Throwable {
		PafSimpleMember THIS = new PafSimpleMember((String) null);
		// jtest_tested_method
		String RETVAL = THIS.getParentKey();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getParentKey()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMember#getParentKey()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetParentKey2() throws Throwable {
		PafSimpleMember THIS = new PafSimpleMember("");
		PafSimpleMemberAttr t1 = new PafSimpleMemberAttr();
		THIS.setKey("");
		t1.setId(7L);
		String[] var1 = new String[] {};
		t1.setAliasKeys(var1);
		String[] var2 = new String[] {};
		t1.setAliasValues(var2);
		String[] var3 = new String[] {};
		t1.setAssociatedAttributes(var3);
		t1.setConsolidationType(7);
		t1.setDescription("");
		t1.setFormula("");
		t1.setGenerationNumber(7);
		t1.setLastFormula("");
		t1.setLevelNumber(7);
		t1.setShareOption(7);
		String[] var4 = new String[] {};
		t1.setUDAs(var4);
		THIS.setPafSimpleMemberAttr(t1);
		THIS.setParentKey("");
		String[] var5 = new String[] {};
		THIS.setChildKeys(var5);
		// jtest_tested_method
		String RETVAL = THIS.getParentKey();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafSimpleMember()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMember#PafSimpleMember()
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafSimpleMember1() throws Throwable {
		// jtest_tested_method
		PafSimpleMember THIS = new PafSimpleMember();
		assertEquals(null, THIS.getKey()); // jtest_unverified
		assertNotNull(THIS.getChildKeys()); // jtest_unverified
		assertEquals(0, THIS.getChildKeys().length); // jtest_unverified
		assertEquals(null, THIS.getPafSimpleMemberAttr()); // jtest_unverified
		assertEquals(null, THIS.getParentKey()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafSimpleMember(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMember#PafSimpleMember(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafSimpleMember2() throws Throwable {
		// jtest_tested_method
		PafSimpleMember THIS = new PafSimpleMember((String) null);
		assertEquals(null, THIS.getKey()); // jtest_unverified
		assertNotNull(THIS.getChildKeys()); // jtest_unverified
		assertEquals(0, THIS.getChildKeys().length); // jtest_unverified
		assertEquals(null, THIS.getPafSimpleMemberAttr()); // jtest_unverified
		assertEquals(null, THIS.getParentKey()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafSimpleMember(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMember#PafSimpleMember(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafSimpleMember3() throws Throwable {
		// jtest_tested_method
		PafSimpleMember THIS = new PafSimpleMember("");
		assertEquals("", THIS.getKey()); // jtest_unverified
		assertNotNull(THIS.getChildKeys()); // jtest_unverified
		assertEquals(0, THIS.getChildKeys().length); // jtest_unverified
		assertEquals(null, THIS.getPafSimpleMemberAttr()); // jtest_unverified
		assertEquals(null, THIS.getParentKey()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setChildKeys(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMember#setChildKeys(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetChildKeys1() throws Throwable {
		PafSimpleMember THIS = new PafSimpleMember("");
		PafSimpleMemberAttr t1 = new PafSimpleMemberAttr();
		THIS.setKey("");
		t1.setId(7L);
		String[] var1 = new String[] {};
		t1.setAliasKeys(var1);
		String[] var2 = new String[] {};
		t1.setAliasValues(var2);
		String[] var3 = new String[] {};
		t1.setAssociatedAttributes(var3);
		t1.setConsolidationType(7);
		t1.setDescription("");
		t1.setFormula("");
		t1.setGenerationNumber(7);
		t1.setLastFormula("");
		t1.setLevelNumber(7);
		t1.setShareOption(7);
		String[] var4 = new String[] {};
		t1.setUDAs(var4);
		THIS.setPafSimpleMemberAttr(t1);
		THIS.setParentKey("");
		String[] var5 = new String[] {};
		THIS.setChildKeys(var5);
		String[] var6 = new String[] {};
		// jtest_tested_method
		THIS.setChildKeys(var6);
		assertSame(var6, THIS.getChildKeys()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setKey(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMember#setKey(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetKey1() throws Throwable {
		PafSimpleMember THIS = new PafSimpleMember("");
		// jtest_tested_method
		THIS.setKey("");
		assertEquals("", THIS.getKey()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setPafSimpleMemberAttr(com.palladium.paf.mdb.PafSimpleMemberAttr)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMember#setPafSimpleMemberAttr(com.palladium.paf.mdb.PafSimpleMemberAttr)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetPafSimpleMemberAttr1() throws Throwable {
		PafSimpleMember THIS = new PafSimpleMember("");
		PafSimpleMemberAttr t1 = new PafSimpleMemberAttr();
		// jtest_tested_method
		THIS.setPafSimpleMemberAttr(t1);
		assertEquals(t1, THIS.getPafSimpleMemberAttr()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setParentKey(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMember#setParentKey(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetParentKey1() throws Throwable {
		PafSimpleMember THIS = new PafSimpleMember("");
		PafSimpleMemberAttr t1 = new PafSimpleMemberAttr();
		THIS.setKey("");
		t1.setId(7L);
		String[] var1 = new String[] {};
		t1.setAliasKeys(var1);
		String[] var2 = new String[] {};
		t1.setAliasValues(var2);
		String[] var3 = new String[] {};
		t1.setAssociatedAttributes(var3);
		t1.setConsolidationType(7);
		t1.setDescription("");
		t1.setFormula("");
		t1.setGenerationNumber(7);
		t1.setLastFormula("");
		t1.setLevelNumber(7);
		t1.setShareOption(7);
		String[] var4 = new String[] {};
		t1.setUDAs(var4);
		THIS.setPafSimpleMemberAttr(t1);
		THIS.setParentKey("");
		String[] var5 = new String[] {};
		THIS.setChildKeys(var5);
		// jtest_tested_method
		THIS.setParentKey("");
		assertEquals("", THIS.getParentKey()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.mdb.PafSimpleMemberTest
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
			PafSimpleMemberTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.mdb.PafSimpleMember",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafSimpleMember.class;
	}

}

// JTEST_CURRENT_ID=-820135432.