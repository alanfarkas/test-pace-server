/*
 * SeasonListTest.java
 * Created by Jtest on 9/19/06 5:28:13 PM.
 * Updated by Jtest on 10/18/06 7:25:16 PM, 2 test cases added, 2 test cases removed.
 * Updated by Jtest on 11/9/06 3:11:58 AM, 2 test cases added, 2 test cases removed.
 */

package com.palladium.paf.app;

import java.util.Collection;
import java.util.AbstractCollection;
import java.lang.reflect.Member;
import jtest.Stubs;
import java.util.Set;
import com.palladium.paf.app.SeasonList;

/**
 * SeasonListTest is a unit test class for class SeasonList.
 * @see com.palladium.paf.app.SeasonList
 * @author Parasoft Jtest 8.0
 */
public class SeasonListTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public SeasonListTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: addSeason(com.palladium.paf.app.Season)
	 * @throws Throwable Tests may throw any Throwable
	 * @see SeasonList#addSeason(com.palladium.paf.app.Season)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddSeason1() throws Throwable {
		SeasonList THIS = new SeasonList();
		// jtest_tested_method
		THIS.addSeason((Season) null);
		assertNotNull(THIS.getSeasons()); // jtest_unverified
		assertEquals("[null]", THIS.getSeasons().toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getSeasonById(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see SeasonList#getSeasonById(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetSeasonById1() throws Throwable {
		SeasonList THIS = new SeasonList();
		// jtest_tested_method
		Season RETVAL = THIS.getSeasonById((String) null);
		// IllegalArgumentException thrown
		// at com.palladium.paf.app.SeasonList.getSeasonById(SeasonList.java:52)
		// jtest_unverified
	}

	/**
	 * Test for method: getSeasons()
	 * @throws Throwable Tests may throw any Throwable
	 * @see SeasonList#getSeasons()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetSeasons1() throws Throwable {
		SeasonList THIS = new SeasonList();
		// jtest_tested_method
		Set RETVAL = THIS.getSeasons();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("[]", RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: SeasonList()
	 * @throws Throwable Tests may throw any Throwable
	 * @see SeasonList#SeasonList()
	 * @author Parasoft Jtest 8.0
	 */
	public void testSeasonList1() throws Throwable {
		// jtest_tested_method
		SeasonList THIS = new SeasonList();
		assertNotNull(THIS.getSeasons()); // jtest_unverified
		assertEquals("[]", THIS.getSeasons().toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setSeasons(java.util.Set)
	 * @throws Throwable Tests may throw any Throwable
	 * @see SeasonList#setSeasons(java.util.Set)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetSeasons1() throws Throwable {
		SeasonList THIS = new SeasonList();
		// jtest_tested_method
		THIS.setSeasons((Set) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.app.SeasonList.setSeasons(Ljava/util/Set;)V>
		// at java.util.AbstractCollection.addAll
		// at com.palladium.paf.app.SeasonList.setSeasons(SeasonList.java:45)
		// jtest_unverified
	}

	/**
	 * Test for method: setSeasons(java.util.Set)
	 * @throws Throwable Tests may throw any Throwable
	 * @see SeasonList#setSeasons(java.util.Set)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetSeasons2() throws Throwable {
		SeasonList THIS = new SeasonList();
		Set var1 = (Set) Stubs.makeStubObject(Set.class);
		// jtest_tested_method
		THIS.setSeasons(var1);
		assertNotNull(THIS.getSeasons()); // jtest_unverified
		assertEquals("[]", THIS.getSeasons().toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testSetSeasons2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSetSeasons2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, AbstractCollection.class)) {
			argument_types = new Class[] { Collection.class };
			if (Stubs.matches(method, "addAll", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.app.SeasonList.setSeasons(SeasonList.java:45)
			}
		}
		return Stubs.NO_STUB_GENERATED;
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
	 * Usage: java com.palladium.paf.app.SeasonListTest
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
			SeasonListTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.app.SeasonList",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return SeasonList.class;
	}

									}

// JTEST_CURRENT_ID=-1616852554.