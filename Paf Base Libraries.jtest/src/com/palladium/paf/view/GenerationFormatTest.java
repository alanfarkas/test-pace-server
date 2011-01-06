/*
 * GenerationFormatTest.java
 * Created by Jtest on 9/19/06 5:57:39 PM.
 * Updated by Jtest on 10/18/06 7:20:12 PM, 4 test cases added, 4 test cases removed.
 */

package com.palladium.paf.view;

import java.util.Iterator;
import java.util.Set;
import java.lang.reflect.Member;
import jtest.Stubs;
import java.util.Map;
import com.palladium.paf.view.GenerationFormat;

/**
 * GenerationFormatTest is a unit test class for class GenerationFormat.
 * @see com.palladium.paf.view.GenerationFormat
 * @author Parasoft Jtest 8.0
 */
public class GenerationFormatTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public GenerationFormatTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: addDimension(com.palladium.paf.view.Dimension)
	 * @throws Throwable Tests may throw any Throwable
	 * @see GenerationFormat#addDimension(com.palladium.paf.view.Dimension)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddDimension1() throws Throwable {
		GenerationFormat THIS = new GenerationFormat();
		// jtest_tested_method
		THIS.addDimension((Dimension) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.view.GenerationFormat.addDimension(Lcom/palladium/paf/view/Dimension;)V>
		// at com.palladium.paf.view.GenerationFormat.addDimension(GenerationFormat.java:33)
		// jtest_unverified
	}

	/**
	 * Test for method: addDimension(com.palladium.paf.view.Dimension)
	 * @throws Throwable Tests may throw any Throwable
	 * @see GenerationFormat#addDimension(com.palladium.paf.view.Dimension)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddDimension2() throws Throwable {
		GenerationFormat THIS = new GenerationFormat();
		Dimension t1 = new Dimension();
		// jtest_tested_method
		THIS.addDimension(t1);
		assertEquals(null, THIS.getName()); // jtest_unverified
		assertNotNull(THIS.getDimensions()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: GenerationFormat()
	 * @throws Throwable Tests may throw any Throwable
	 * @see GenerationFormat#GenerationFormat()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGenerationFormat1() throws Throwable {
		// jtest_tested_method
		GenerationFormat THIS = new GenerationFormat();
		assertEquals(null, THIS.getName()); // jtest_unverified
		assertNotNull(THIS.getDimensions()); // jtest_unverified
		assertEquals("{}", THIS.getDimensions().toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDimension(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see GenerationFormat#getDimension(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDimension1() throws Throwable {
		GenerationFormat THIS = new GenerationFormat();
		// jtest_tested_method
		Dimension RETVAL = THIS.getDimension((String) null);
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDimension(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see GenerationFormat#getDimension(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDimension3() throws Throwable {
		GenerationFormat THIS = new GenerationFormat();
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setDimensions(var1);
		THIS.setName("");
		// jtest_tested_method
		Dimension RETVAL = THIS.getDimension("0");
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDimension3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDimension3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "keySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.view.GenerationFormat.getDimension(GenerationFormat.java:19)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.view.GenerationFormat.getDimension(GenerationFormat.java:19)
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
					// at com.palladium.paf.view.GenerationFormat.getDimension(GenerationFormat.java:19)
					case 2 :
						return Boolean.FALSE;
					// at com.palladium.paf.view.GenerationFormat.getDimension(GenerationFormat.java:19)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return "";
				// at com.palladium.paf.view.GenerationFormat.getDimension(GenerationFormat.java:19)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDimension(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see GenerationFormat#getDimension(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDimension4() throws Throwable {
		GenerationFormat THIS = new GenerationFormat();
		_f0 = new Object();
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setDimensions(var1);
		THIS.setName("");
		// jtest_tested_method
		Dimension RETVAL = THIS.getDimension((String) null);
		// ClassCastException thrown
		// at com.palladium.paf.view.GenerationFormat.getDimension(GenerationFormat.java:19)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDimension4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDimension4(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "keySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.view.GenerationFormat.getDimension(GenerationFormat.java:19)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.view.GenerationFormat.getDimension(GenerationFormat.java:19)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.view.GenerationFormat.getDimension(GenerationFormat.java:19)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return _f0;
				// at com.palladium.paf.view.GenerationFormat.getDimension(GenerationFormat.java:19)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDimension(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see GenerationFormat#getDimension(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDimension6() throws Throwable {
		GenerationFormat THIS = new GenerationFormat();
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setDimensions(var1);
		THIS.setName("");
		// jtest_tested_method
		Dimension RETVAL = THIS.getDimension("");
		// ClassCastException thrown
		// at com.palladium.paf.view.GenerationFormat.getDimension(GenerationFormat.java:23)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDimension6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDimension6(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "keySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.view.GenerationFormat.getDimension(GenerationFormat.java:19)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.view.GenerationFormat.getDimension(GenerationFormat.java:23)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.view.GenerationFormat.getDimension(GenerationFormat.java:19)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.view.GenerationFormat.getDimension(GenerationFormat.java:19)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return "";
				// at com.palladium.paf.view.GenerationFormat.getDimension(GenerationFormat.java:19)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDimensions()
	 * @throws Throwable Tests may throw any Throwable
	 * @see GenerationFormat#getDimensions()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDimensions1() throws Throwable {
		GenerationFormat THIS = new GenerationFormat();
		// jtest_tested_method
		Map RETVAL = THIS.getDimensions();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("{}", RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see GenerationFormat#getName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetName1() throws Throwable {
		GenerationFormat THIS = new GenerationFormat();
		// jtest_tested_method
		String RETVAL = THIS.getName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: removeDimension(com.palladium.paf.view.Dimension)
	 * @throws Throwable Tests may throw any Throwable
	 * @see GenerationFormat#removeDimension(com.palladium.paf.view.Dimension)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRemoveDimension1() throws Throwable {
		GenerationFormat THIS = new GenerationFormat();
		// jtest_tested_method
		THIS.removeDimension((Dimension) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.view.GenerationFormat.removeDimension(Lcom/palladium/paf/view/Dimension;)V>
		// at com.palladium.paf.view.GenerationFormat.removeDimension(GenerationFormat.java:37)
		// jtest_unverified
	}

	/**
	 * Test for method: removeDimension(com.palladium.paf.view.Dimension)
	 * @throws Throwable Tests may throw any Throwable
	 * @see GenerationFormat#removeDimension(com.palladium.paf.view.Dimension)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRemoveDimension2() throws Throwable {
		GenerationFormat THIS = new GenerationFormat();
		Dimension t1 = new Dimension();
		// jtest_tested_method
		THIS.removeDimension(t1);
		assertEquals(null, THIS.getName()); // jtest_unverified
		assertNotNull(THIS.getDimensions()); // jtest_unverified
		assertEquals("{}", THIS.getDimensions().toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setDimensions(java.util.Map)
	 * @throws Throwable Tests may throw any Throwable
	 * @see GenerationFormat#setDimensions(java.util.Map)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDimensions1() throws Throwable {
		GenerationFormat THIS = new GenerationFormat();
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		// jtest_tested_method
		THIS.setDimensions(var1);
		assertEquals(var1, THIS.getDimensions()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see GenerationFormat#setName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetName1() throws Throwable {
		GenerationFormat THIS = new GenerationFormat();
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
	 * Usage: java com.palladium.paf.view.GenerationFormatTest
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
			GenerationFormatTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.view.GenerationFormat",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return GenerationFormat.class;
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
private Object _f0;
}

// JTEST_CURRENT_ID=-880611941.