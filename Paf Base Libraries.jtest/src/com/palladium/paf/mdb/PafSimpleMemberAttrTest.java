/*
 * PafSimpleMemberAttrTest.java
 * Created by Jtest on 9/19/06 5:46:23 PM.
 */

package com.palladium.paf.mdb;

import com.palladium.paf.mdb.PafSimpleMemberAttr;

/**
 * PafSimpleMemberAttrTest is a unit test class for class PafSimpleMemberAttr.
 * @see com.palladium.paf.mdb.PafSimpleMemberAttr
 * @author Parasoft Jtest 8.0
 */
public class PafSimpleMemberAttrTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafSimpleMemberAttrTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getAliasKeys()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMemberAttr#getAliasKeys()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAliasKeys1() throws Throwable {
		PafSimpleMemberAttr THIS = new PafSimpleMemberAttr();
		// jtest_tested_method
		String[] RETVAL = THIS.getAliasKeys();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getAliasValues()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMemberAttr#getAliasValues()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAliasValues1() throws Throwable {
		PafSimpleMemberAttr THIS = new PafSimpleMemberAttr();
		// jtest_tested_method
		String[] RETVAL = THIS.getAliasValues();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getAssociatedAttributes()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMemberAttr#getAssociatedAttributes()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAssociatedAttributes1() throws Throwable {
		PafSimpleMemberAttr THIS = new PafSimpleMemberAttr();
		// jtest_tested_method
		String[] RETVAL = THIS.getAssociatedAttributes();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getConsolidationType()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMemberAttr#getConsolidationType()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetConsolidationType1() throws Throwable {
		PafSimpleMemberAttr THIS = new PafSimpleMemberAttr();
		// jtest_tested_method
		int RETVAL = THIS.getConsolidationType();
		assertEquals(0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDescription()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMemberAttr#getDescription()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDescription1() throws Throwable {
		PafSimpleMemberAttr THIS = new PafSimpleMemberAttr();
		// jtest_tested_method
		String RETVAL = THIS.getDescription();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getFormula()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMemberAttr#getFormula()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetFormula1() throws Throwable {
		PafSimpleMemberAttr THIS = new PafSimpleMemberAttr();
		// jtest_tested_method
		String RETVAL = THIS.getFormula();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getGenerationNumber()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMemberAttr#getGenerationNumber()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetGenerationNumber1() throws Throwable {
		PafSimpleMemberAttr THIS = new PafSimpleMemberAttr();
		// jtest_tested_method
		int RETVAL = THIS.getGenerationNumber();
		assertEquals(0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getId()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMemberAttr#getId()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetId1() throws Throwable {
		PafSimpleMemberAttr THIS = new PafSimpleMemberAttr();
		// jtest_tested_method
		long RETVAL = THIS.getId();
		assertEquals(0L, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getId()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMemberAttr#getId()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetId3() throws Throwable {
		PafSimpleMemberAttr THIS = new PafSimpleMemberAttr();
		THIS.setId(7L);
		String[] var1 = new String[] {};
		THIS.setAliasKeys(var1);
		String[] var2 = new String[] {};
		THIS.setAliasValues(var2);
		String[] var3 = new String[] {};
		THIS.setAssociatedAttributes(var3);
		THIS.setConsolidationType(7);
		THIS.setDescription("");
		THIS.setFormula("");
		THIS.setGenerationNumber(7);
		THIS.setLastFormula("");
		THIS.setLevelNumber(7);
		THIS.setShareOption(7);
		String[] var4 = new String[] {};
		THIS.setUDAs(var4);
		// jtest_tested_method
		long RETVAL = THIS.getId();
		assertEquals(7L, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getLastFormula()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMemberAttr#getLastFormula()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLastFormula1() throws Throwable {
		PafSimpleMemberAttr THIS = new PafSimpleMemberAttr();
		// jtest_tested_method
		String RETVAL = THIS.getLastFormula();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getLevelNumber()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMemberAttr#getLevelNumber()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLevelNumber1() throws Throwable {
		PafSimpleMemberAttr THIS = new PafSimpleMemberAttr();
		// jtest_tested_method
		int RETVAL = THIS.getLevelNumber();
		assertEquals(0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getShareOption()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMemberAttr#getShareOption()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetShareOption1() throws Throwable {
		PafSimpleMemberAttr THIS = new PafSimpleMemberAttr();
		// jtest_tested_method
		int RETVAL = THIS.getShareOption();
		assertEquals(0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getUDAs()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMemberAttr#getUDAs()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetUDAs1() throws Throwable {
		PafSimpleMemberAttr THIS = new PafSimpleMemberAttr();
		// jtest_tested_method
		String[] RETVAL = THIS.getUDAs();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafSimpleMemberAttr()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMemberAttr#PafSimpleMemberAttr()
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafSimpleMemberAttr1() throws Throwable {
		// jtest_tested_method
		PafSimpleMemberAttr THIS = new PafSimpleMemberAttr();
		assertEquals(0L, THIS.getId()); // jtest_unverified
		assertEquals(null, THIS.getAliasKeys()); // jtest_unverified
		assertEquals(null, THIS.getAliasValues()); // jtest_unverified
		assertEquals(null, THIS.getAssociatedAttributes()); // jtest_unverified
		assertEquals(0, THIS.getConsolidationType()); // jtest_unverified
		assertEquals("", THIS.getDescription()); // jtest_unverified
		assertEquals("", THIS.getFormula()); // jtest_unverified
		assertEquals(0, THIS.getGenerationNumber()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setAliasKeys(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMemberAttr#setAliasKeys(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetAliasKeys1() throws Throwable {
		PafSimpleMemberAttr THIS = new PafSimpleMemberAttr();
		String[] var1 = new String[] {};
		// jtest_tested_method
		THIS.setAliasKeys(var1);
		assertSame(var1, THIS.getAliasKeys()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setAliasValues(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMemberAttr#setAliasValues(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetAliasValues1() throws Throwable {
		PafSimpleMemberAttr THIS = new PafSimpleMemberAttr();
		String[] var1 = new String[] {};
		// jtest_tested_method
		THIS.setAliasValues(var1);
		assertSame(var1, THIS.getAliasValues()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setAssociatedAttributes(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMemberAttr#setAssociatedAttributes(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetAssociatedAttributes1() throws Throwable {
		PafSimpleMemberAttr THIS = new PafSimpleMemberAttr();
		String[] var1 = new String[] {};
		// jtest_tested_method
		THIS.setAssociatedAttributes(var1);
		assertSame(var1, THIS.getAssociatedAttributes()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setConsolidationType(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMemberAttr#setConsolidationType(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetConsolidationType1() throws Throwable {
		PafSimpleMemberAttr THIS = new PafSimpleMemberAttr();
		// jtest_tested_method
		THIS.setConsolidationType(7);
		assertEquals(7, THIS.getConsolidationType()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setDescription(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMemberAttr#setDescription(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDescription1() throws Throwable {
		PafSimpleMemberAttr THIS = new PafSimpleMemberAttr();
		// jtest_tested_method
		THIS.setDescription("");
		assertEquals("", THIS.getDescription()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setFormula(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMemberAttr#setFormula(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetFormula1() throws Throwable {
		PafSimpleMemberAttr THIS = new PafSimpleMemberAttr();
		// jtest_tested_method
		THIS.setFormula("");
		assertEquals("", THIS.getFormula()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setGenerationNumber(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMemberAttr#setGenerationNumber(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetGenerationNumber1() throws Throwable {
		PafSimpleMemberAttr THIS = new PafSimpleMemberAttr();
		// jtest_tested_method
		THIS.setGenerationNumber(7);
		assertEquals(7, THIS.getGenerationNumber()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setId(long)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMemberAttr#setId(long)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetId1() throws Throwable {
		PafSimpleMemberAttr THIS = new PafSimpleMemberAttr();
		// jtest_tested_method
		THIS.setId(7L);
		assertEquals(7L, THIS.getId()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setLastFormula(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMemberAttr#setLastFormula(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetLastFormula1() throws Throwable {
		PafSimpleMemberAttr THIS = new PafSimpleMemberAttr();
		// jtest_tested_method
		THIS.setLastFormula("");
		assertEquals("", THIS.getLastFormula()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setLevelNumber(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMemberAttr#setLevelNumber(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetLevelNumber1() throws Throwable {
		PafSimpleMemberAttr THIS = new PafSimpleMemberAttr();
		// jtest_tested_method
		THIS.setLevelNumber(7);
		assertEquals(7, THIS.getLevelNumber()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setShareOption(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMemberAttr#setShareOption(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetShareOption1() throws Throwable {
		PafSimpleMemberAttr THIS = new PafSimpleMemberAttr();
		// jtest_tested_method
		THIS.setShareOption(7);
		assertEquals(7, THIS.getShareOption()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setUDAs(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSimpleMemberAttr#setUDAs(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetUDAs1() throws Throwable {
		PafSimpleMemberAttr THIS = new PafSimpleMemberAttr();
		String[] var1 = new String[] {};
		// jtest_tested_method
		THIS.setUDAs(var1);
		assertSame(var1, THIS.getUDAs()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.mdb.PafSimpleMemberAttrTest
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
			PafSimpleMemberAttrTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.mdb.PafSimpleMemberAttr",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafSimpleMemberAttr.class;
	}

}

// JTEST_CURRENT_ID=1110547825.