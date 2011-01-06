/*
 * DimensionTest.java
 * Created by Jtest on 9/19/06 6:11:18 PM.
 * Updated by Jtest on 10/18/06 7:43:06 PM, 3 test cases added, 3 test cases removed.
 */

package com.palladium.paf.view;

import java.util.Iterator;
import java.lang.reflect.Member;
import java.util.Set;
import jtest.Stubs;
import java.util.Map;
import com.palladium.paf.view.Dimension;

/**
 * DimensionTest is a unit test class for class Dimension.
 * @see com.palladium.paf.view.Dimension
 * @author Parasoft Jtest 8.0
 */
public class DimensionTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public DimensionTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: addLevelFormat(com.palladium.paf.view.LevelFormat)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Dimension#addLevelFormat(com.palladium.paf.view.LevelFormat)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddLevelFormat1() throws Throwable {
		Dimension THIS = new Dimension();
		// jtest_tested_method
		THIS.addLevelFormat((LevelFormat) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.view.Dimension.addLevelFormat(Lcom/palladium/paf/view/LevelFormat;)V>
		// at com.palladium.paf.view.Dimension.addLevelFormat(Dimension.java:59)
		// jtest_unverified
	}

	/**
	 * Test for method: addLevelFormat(com.palladium.paf.view.LevelFormat)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Dimension#addLevelFormat(com.palladium.paf.view.LevelFormat)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddLevelFormat2() throws Throwable {
		Dimension THIS = new Dimension();
		LevelFormat t1 = new LevelFormat((Integer) null, (String) null);
		// jtest_tested_method
		THIS.addLevelFormat(t1);
		assertEquals(null, THIS.getName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: Dimension()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Dimension#Dimension()
	 * @author Parasoft Jtest 8.0
	 */
	public void testDimension1() throws Throwable {
		// jtest_tested_method
		Dimension THIS = new Dimension();
		assertEquals(null, THIS.getName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getLevelFormat(java.lang.Integer)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Dimension#getLevelFormat(java.lang.Integer)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLevelFormat2() throws Throwable {
		Dimension THIS = new Dimension();
		Integer t1 = new Integer(0);
		// jtest_tested_method
		LevelFormat RETVAL = THIS.getLevelFormat(t1);
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getLevelFormat(java.lang.Integer)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Dimension#getLevelFormat(java.lang.Integer)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLevelFormat7() throws Throwable {
		Dimension THIS = new Dimension();
		Integer t1 = new Integer(0);
		_f0 = new Integer("0");
		THIS.setName("");
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setLevelFormats(var1);
		// jtest_tested_method
		LevelFormat RETVAL = THIS.getLevelFormat(t1);
		// ClassCastException thrown
		// at com.palladium.paf.view.Dimension.getLevelFormat(Dimension.java:30)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetLevelFormat7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetLevelFormat7(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "keySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.view.Dimension.getLevelFormat(Dimension.java:28)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.view.Dimension.getLevelFormat(Dimension.java:30)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.view.Dimension.getLevelFormat(Dimension.java:28)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.view.Dimension.getLevelFormat(Dimension.java:28)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return _f0;
				// at com.palladium.paf.view.Dimension.getLevelFormat(Dimension.java:28)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getLevelFormatName(java.lang.Integer)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Dimension#getLevelFormatName(java.lang.Integer)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLevelFormatName1() throws Throwable {
		Dimension THIS = new Dimension();
		// jtest_tested_method
		String RETVAL = THIS.getLevelFormatName((Integer) null);
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetLevelFormatName1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetLevelFormatName1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.view.Dimension.getLevelFormatName(Dimension.java:45)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getLevelFormatName(java.lang.Integer)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Dimension#getLevelFormatName(java.lang.Integer)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLevelFormatName3() throws Throwable {
		Dimension THIS = new Dimension();
		_f0 = new Integer(0);
		THIS.setName("");
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setLevelFormats(var1);
		// jtest_tested_method
		String RETVAL = THIS.getLevelFormatName((Integer) null);
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetLevelFormatName3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetLevelFormatName3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "keySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.view.Dimension.getLevelFormatName(Dimension.java:45)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.view.Dimension.getLevelFormatName(Dimension.java:45)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Iterator.hasNext()");
				switch (index) {
					case 1 :
						return Boolean.TRUE;
					// at com.palladium.paf.view.Dimension.getLevelFormatName(Dimension.java:45)
					case 2 :
						return Boolean.FALSE;
					// at com.palladium.paf.view.Dimension.getLevelFormatName(Dimension.java:45)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return _f0;
				// at com.palladium.paf.view.Dimension.getLevelFormatName(Dimension.java:45)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getLevelFormats()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Dimension#getLevelFormats()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLevelFormats1() throws Throwable {
		Dimension THIS = new Dimension();
		// jtest_tested_method
		Set RETVAL = THIS.getLevelFormats();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("[]", RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Dimension#getName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetName1() throws Throwable {
		Dimension THIS = new Dimension();
		// jtest_tested_method
		String RETVAL = THIS.getName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Dimension#getName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetName2() throws Throwable {
		Dimension THIS = new Dimension();
		THIS.setName("");
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setLevelFormats(var1);
		// jtest_tested_method
		String RETVAL = THIS.getName();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getNumberOfLevelFormats()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Dimension#getNumberOfLevelFormats()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetNumberOfLevelFormats1() throws Throwable {
		Dimension THIS = new Dimension();
		// jtest_tested_method
		int RETVAL = THIS.getNumberOfLevelFormats();
		assertEquals(0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: removeLevelFormat(com.palladium.paf.view.LevelFormat)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Dimension#removeLevelFormat(com.palladium.paf.view.LevelFormat)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRemoveLevelFormat1() throws Throwable {
		Dimension THIS = new Dimension();
		// jtest_tested_method
		THIS.removeLevelFormat((LevelFormat) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.view.Dimension.removeLevelFormat(Lcom/palladium/paf/view/LevelFormat;)V>
		// at com.palladium.paf.view.Dimension.removeLevelFormat(Dimension.java:65)
		// jtest_unverified
	}

	/**
	 * Test for method: removeLevelFormat(com.palladium.paf.view.LevelFormat)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Dimension#removeLevelFormat(com.palladium.paf.view.LevelFormat)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRemoveLevelFormat2() throws Throwable {
		Dimension THIS = new Dimension();
		LevelFormat t1 = new LevelFormat();
		// jtest_tested_method
		THIS.removeLevelFormat(t1);
		assertEquals(null, THIS.getName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setLevelFormats(java.util.Map)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Dimension#setLevelFormats(java.util.Map)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetLevelFormats1() throws Throwable {
		Dimension THIS = new Dimension();
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		// jtest_tested_method
		THIS.setLevelFormats(var1);
		assertEquals(null, THIS.getLevelFormats()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Dimension#setName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetName1() throws Throwable {
		Dimension THIS = new Dimension();
		// jtest_tested_method
		THIS.setName("");
		assertEquals("", THIS.getName()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.view.DimensionTest
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
			DimensionTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.view.Dimension",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return Dimension.class;
	}

	/**
	 * Used to keep track of how many times a stubbed method has been called.
	 * @author Parasoft Jtest 8.0
	 */
private jtest.StubIterationCounter _stubs_iteration;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Integer _f0;
}

// JTEST_CURRENT_ID=57608395.