/*
 * PafAdminConsoleViewTestTest.java
 * Created by Jtest on 9/19/06 5:58:54 PM.
 */

package com.palladium.paf.ui;

import com.palladium.paf.view.ViewTuple;
import java.util.Iterator;
import java.util.Set;
import com.palladium.paf.view.PafViewHeader;
import com.palladium.paf.view.PafUserSelection;
import com.palladium.paf.data.ExpOperation;
import java.util.ArrayList;
import com.palladium.paf.view.PafView;
import jtest.mocks.java.util.ArrayListMock;
import junit.framework.Assert;
import jtest.Stubs;
import java.lang.reflect.Member;
import com.palladium.paf.ui.PafAdminConsoleViewTest;

/**
 * PafAdminConsoleViewTestTest is a unit test class for class PafAdminConsoleViewTest.
 * @see com.palladium.paf.ui.PafAdminConsoleViewTest
 * @author Parasoft Jtest 8.0
 */
public class PafAdminConsoleViewTestTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafAdminConsoleViewTestTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}
	/**
	 * Test for method: getTestedClass()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleViewTest#getTestedClass()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetTestedClass1() throws Throwable {
		PafAdminConsoleViewTest THIS = new PafAdminConsoleViewTest(
			(String) null);
		// jtest_tested_method
		Class RETVAL = THIS.getTestedClass();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("class com.palladium.paf.ui.PafAdminConsoleView", RETVAL
			.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafAdminConsoleViewTest(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleViewTest#PafAdminConsoleViewTest(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafAdminConsoleViewTest1() throws Throwable {
		// jtest_tested_method
		PafAdminConsoleViewTest THIS = new PafAdminConsoleViewTest(
			(String) null);
		assertEquals("null(com.palladium.paf.ui.PafAdminConsoleViewTest)", THIS
			.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setUp()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleViewTest#setUp()
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetUp1() throws Throwable {
		PafAdminConsoleViewTest THIS = new PafAdminConsoleViewTest("");
		// jtest_tested_method
		THIS.setUp();
		assertEquals("(com.palladium.paf.ui.PafAdminConsoleViewTest)", THIS
			.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: stubsPafAdminConsoleView4(java.lang.reflect.Member,java.lang.Object,java.lang.Object[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleViewTest#stubsPafAdminConsoleView4(java.lang.reflect.Member,java.lang.Object,java.lang.Object[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testStubsPafAdminConsoleView41() throws Throwable {
		PafAdminConsoleViewTest THIS = new PafAdminConsoleViewTest(
			(String) null);
		// jtest_tested_method
		Object RETVAL = THIS.stubsPafAdminConsoleView4(
			(Member) null,
			(Object) null,
			(Object[]) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.ui.PafAdminConsoleViewTest.stubsPafAdminConsoleView4(Ljava/lang/reflect/Member;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;>
		// at jtest.Stubs.matches
		// at com.palladium.paf.ui.PafAdminConsoleViewTest.stubsPafAdminConsoleView4(PafAdminConsoleViewTest.java:268)
		// jtest_unverified
	}

	/**
	 * Test for method: stubsPafAdminConsoleView4(java.lang.reflect.Member,java.lang.Object,java.lang.Object[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleViewTest#stubsPafAdminConsoleView4(java.lang.reflect.Member,java.lang.Object,java.lang.Object[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testStubsPafAdminConsoleView42() throws Throwable {
		PafAdminConsoleViewTest THIS = new PafAdminConsoleViewTest("");
		Object t1 = new Object();
		Member var1 = (Member) Stubs.makeStubObject(Member.class);
		Object[] var2 = new Object[] {};
		// jtest_tested_method
		Object RETVAL = THIS.stubsPafAdminConsoleView4(var1, t1, var2);
		assertTrue(RETVAL instanceof jtest.NoStubGenerated); // jtest_unverified
		assertEquals("(com.palladium.paf.ui.PafAdminConsoleViewTest)", THIS
			.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: stubsPafAdminConsoleView7(java.lang.reflect.Member,java.lang.Object,java.lang.Object[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleViewTest#stubsPafAdminConsoleView7(java.lang.reflect.Member,java.lang.Object,java.lang.Object[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testStubsPafAdminConsoleView71() throws Throwable {
		PafAdminConsoleViewTest THIS = new PafAdminConsoleViewTest(
			(String) null);
		// jtest_tested_method
		Object RETVAL = THIS.stubsPafAdminConsoleView7(
			(Member) null,
			(Object) null,
			(Object[]) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.ui.PafAdminConsoleViewTest.stubsPafAdminConsoleView7(Ljava/lang/reflect/Member;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;>
		// at jtest.Stubs.matches
		// at com.palladium.paf.ui.PafAdminConsoleViewTest.stubsPafAdminConsoleView7(PafAdminConsoleViewTest.java:431)
		// jtest_unverified
	}

	/**
	 * Test for method: stubsPafAdminConsoleView7(java.lang.reflect.Member,java.lang.Object,java.lang.Object[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleViewTest#stubsPafAdminConsoleView7(java.lang.reflect.Member,java.lang.Object,java.lang.Object[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testStubsPafAdminConsoleView72() throws Throwable {
		PafAdminConsoleViewTest THIS = new PafAdminConsoleViewTest("");
		Member var1 = (Member) Stubs.makeStubObject(Member.class);
		ViewTuple[] var2 = new ViewTuple[] {
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class) };
		Object[] var3 = new Object[] {};
		// jtest_tested_method
		Object RETVAL = THIS.stubsPafAdminConsoleView7(var1, var2, var3);
		assertNotNull(var2[0]); // jtest_unverified
		assertEquals(null, var2[0].getAxis()); // jtest_unverified
		assertEquals(null, var2[0].getBorder()); // jtest_unverified
		assertEquals(null, var2[0].getDrillable()); // jtest_unverified
		assertEquals(null, var2[0].getExpanded()); // jtest_unverified
		assertEquals(null, var2[0].getMemberDefs()); // jtest_unverified
		assertEquals(null, var2[0].getNumberFormat()); // jtest_unverified
		assertEquals(null, var2[0].getOrder()); // jtest_unverified
		assertEquals(null, var2[0].getOverrideLabel()); // jtest_unverified
		assertNotNull(var2[1]); // jtest_unverified
		assertEquals(null, var2[1].getAxis()); // jtest_unverified
		assertEquals(null, var2[1].getBorder()); // jtest_unverified
		assertEquals(null, var2[1].getDrillable()); // jtest_unverified
		assertEquals(null, var2[1].getExpanded()); // jtest_unverified
		assertEquals(null, var2[1].getMemberDefs()); // jtest_unverified
		assertEquals(null, var2[1].getNumberFormat()); // jtest_unverified
		assertEquals(null, var2[1].getOrder()); // jtest_unverified
		assertEquals(null, var2[1].getOverrideLabel()); // jtest_unverified
		assertNotNull(var2[2]); // jtest_unverified
		assertEquals(null, var2[2].getAxis()); // jtest_unverified
		assertEquals(null, var2[2].getBorder()); // jtest_unverified
		assertEquals(null, var2[2].getDrillable()); // jtest_unverified
		assertEquals(null, var2[2].getExpanded()); // jtest_unverified
		assertEquals(null, var2[2].getMemberDefs()); // jtest_unverified
		assertEquals(null, var2[2].getNumberFormat()); // jtest_unverified
		assertEquals(null, var2[2].getOrder()); // jtest_unverified
		assertEquals(null, var2[2].getOverrideLabel()); // jtest_unverified
		assertTrue(RETVAL instanceof jtest.NoStubGenerated); // jtest_unverified
		assertEquals("(com.palladium.paf.ui.PafAdminConsoleViewTest)", THIS
			.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: tearDown()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleViewTest#tearDown()
	 * @author Parasoft Jtest 8.0
	 */
	public void testTearDown1() throws Throwable {
		PafAdminConsoleViewTest THIS = new PafAdminConsoleViewTest(
			(String) null);
		// jtest_tested_method
		THIS.tearDown();
		assertEquals("null(com.palladium.paf.ui.PafAdminConsoleViewTest)", THIS
			.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: testAddUserSelection1()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleViewTest#testAddUserSelection1()
	 * @author Parasoft Jtest 8.0
	 */
	public void testTestAddUserSelection11() throws Throwable {
		PafAdminConsoleViewTest THIS = new PafAdminConsoleViewTest(
			(String) null);
		// jtest_tested_method
		THIS.testAddUserSelection1();
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.ui.PafAdminConsoleView.addUserSelection(PafAdminConsoleView.java:282)
		// at com.palladium.paf.ui.PafAdminConsoleViewTest.testAddUserSelection1(PafAdminConsoleViewTest.java:48)
		// jtest_unverified
	}

	/**
	 * Test for method: testClone1()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleViewTest#testClone1()
	 * @author Parasoft Jtest 8.0
	 */
	public void testTestClone11() throws Throwable {
		PafAdminConsoleViewTest THIS = new PafAdminConsoleViewTest(
			(String) null);
		// jtest_tested_method
		THIS.testClone1();
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.ui.PafAdminConsoleView.getHeaders(PafAdminConsoleView.java:130)
		// at com.palladium.paf.ui.PafAdminConsoleView.clone(PafAdminConsoleView.java:245)
		// at com.palladium.paf.ui.PafAdminConsoleViewTest.testClone1(PafAdminConsoleViewTest.java:63)
		// jtest_unverified
	}

	/**
	 * Test for method: testClone1()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleViewTest#testClone1()
	 * @author Parasoft Jtest 8.0
	 */
	public void testTestClone12() throws Throwable {
		PafAdminConsoleViewTest THIS = new PafAdminConsoleViewTest(
			(String) null);
		THIS.setUp();
		// jtest_tested_method
		THIS.testClone1();
		// NullPointerException thrown
		// at com.palladium.paf.ui.PafAdminConsoleView.clone(PafAdminConsoleView.java:255)
		// at com.palladium.paf.ui.PafAdminConsoleViewTest.testClone1(PafAdminConsoleViewTest.java:63)
		// jtest_unverified
	}

	/**
	 * Stubs method for testTestClone12.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsTestClone12(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAdminConsoleView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getHeaders", argument_types)) {
				return new PafViewHeader[0];
				// at com.palladium.paf.ui.PafAdminConsoleView.clone(PafAdminConsoleView.java:245)
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testClone1(PafAdminConsoleViewTest.java:63)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getViewSectionNames", argument_types)) {
				return null;
				// at com.palladium.paf.ui.PafAdminConsoleView.clone(PafAdminConsoleView.java:255)
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testClone1(PafAdminConsoleViewTest.java:63)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: testClone1()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleViewTest#testClone1()
	 * @author Parasoft Jtest 8.0
	 */
	public void testTestClone14() throws Throwable {
		PafAdminConsoleViewTest THIS = new PafAdminConsoleViewTest(
			(String) null);
		// jtest_tested_method
		THIS.testClone1();
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.ui.PafAdminConsoleView.clone(PafAdminConsoleView.java:249)
		// at com.palladium.paf.ui.PafAdminConsoleViewTest.testClone1(PafAdminConsoleViewTest.java:63)
		// jtest_unverified
	}

	/**
	 * Stubs method for testTestClone14.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsTestClone14(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAdminConsoleView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getHeaders", argument_types)) {
				return new PafViewHeader[1];
				// at com.palladium.paf.ui.PafAdminConsoleView.clone(PafAdminConsoleView.java:245)
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testClone1(PafAdminConsoleViewTest.java:63)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: testClone1()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleViewTest#testClone1()
	 * @author Parasoft Jtest 8.0
	 */
	public void testTestClone15() throws Throwable {
		PafAdminConsoleViewTest THIS = new PafAdminConsoleViewTest(
			(String) null);
		// jtest_tested_method
		THIS.testClone1();

		// CloneNotSupportedException thrown
		// at com.palladium.paf.ui.PafAdminConsoleView.clone(PafAdminConsoleView.java:237)
		// at com.palladium.paf.ui.PafAdminConsoleViewTest.testClone1(PafAdminConsoleViewTest.java:63)
		// jtest_unverified
	}

	/**
	 * Stubs method for testTestClone15.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsTestClone15(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAdminConsoleView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "clone", argument_types)) {
				throw new CloneNotSupportedException();
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testClone1(PafAdminConsoleViewTest.java:63)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: testClone1()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleViewTest#testClone1()
	 * @author Parasoft Jtest 8.0
	 */
	public void testTestClone16() throws Throwable {
		PafAdminConsoleViewTest THIS = new PafAdminConsoleViewTest(
			(String) null);
		_f2 = new Object();
		// jtest_tested_method
		THIS.testClone1();
		// ClassCastException thrown
		// at com.palladium.paf.ui.PafAdminConsoleView.clone(PafAdminConsoleView.java:237)
		// at com.palladium.paf.ui.PafAdminConsoleViewTest.testClone1(PafAdminConsoleViewTest.java:63)
		// jtest_unverified
	}

	/**
	 * Stubs method for testTestClone16.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsTestClone16(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAdminConsoleView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "clone", argument_types)) {
				return _f2;
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testClone1(PafAdminConsoleViewTest.java:63)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: testClone1()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleViewTest#testClone1()
	 * @author Parasoft Jtest 8.0
	 */
	public void testTestClone17() throws Throwable {
		PafAdminConsoleViewTest THIS = new PafAdminConsoleViewTest(
			(String) null);
		_f3 = new PafViewHeader((String) null, (String) null);
		_f4 = new PafViewHeader();
		_f2 = new Object();
		// jtest_tested_method
		THIS.testClone1();

		// ClassCastException thrown
		// at com.palladium.paf.ui.PafAdminConsoleView.clone(PafAdminConsoleView.java:255)
		// at com.palladium.paf.ui.PafAdminConsoleViewTest.testClone1(PafAdminConsoleViewTest.java:63)
		// jtest_unverified
	}

	/**
	 * Stubs method for testTestClone17.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsTestClone17(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAdminConsoleView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getHeaders", argument_types)) {
				return new PafViewHeader[] { _f3, _f4 };
				// at com.palladium.paf.ui.PafAdminConsoleView.clone(PafAdminConsoleView.java:245)
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testClone1(PafAdminConsoleViewTest.java:63)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getViewSectionNames", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.ui.PafAdminConsoleView.clone(PafAdminConsoleView.java:255)
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testClone1(PafAdminConsoleViewTest.java:63)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.ui.PafAdminConsoleView.clone(PafAdminConsoleView.java:255)
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testClone1(PafAdminConsoleViewTest.java:63)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.ui.PafAdminConsoleView.clone(PafAdminConsoleView.java:255)
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testClone1(PafAdminConsoleViewTest.java:63)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return _f2;
				// at com.palladium.paf.ui.PafAdminConsoleView.clone(PafAdminConsoleView.java:255)
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testClone1(PafAdminConsoleViewTest.java:63)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: testGetName1()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleViewTest#testGetName1()
	 * @author Parasoft Jtest 8.0
	 */
	public void testTestGetName11() throws Throwable {
		PafAdminConsoleViewTest THIS = new PafAdminConsoleViewTest(
			(String) null);
		// jtest_tested_method
		THIS.testGetName1();
		assertEquals("null(com.palladium.paf.ui.PafAdminConsoleViewTest)", THIS
			.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: testGetPageOrientation1()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleViewTest#testGetPageOrientation1()
	 * @author Parasoft Jtest 8.0
	 */
	public void testTestGetPageOrientation11() throws Throwable {
		PafAdminConsoleViewTest THIS = new PafAdminConsoleViewTest(
			(String) null);
		// jtest_tested_method
		THIS.testGetPageOrientation1();
		assertEquals("null(com.palladium.paf.ui.PafAdminConsoleViewTest)", THIS
			.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testTestGetPageOrientation11.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsTestGetPageOrientation11(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Assert.class)) {
			argument_types = new Class[] { String.class, String.class };
			if (Stubs.matches(method, "assertEquals", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testGetPageOrientation1(PafAdminConsoleViewTest.java:95)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: testGetPagesTall1()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleViewTest#testGetPagesTall1()
	 * @author Parasoft Jtest 8.0
	 */
	public void testTestGetPagesTall11() throws Throwable {
		PafAdminConsoleViewTest THIS = new PafAdminConsoleViewTest(
			(String) null);
		// jtest_tested_method
		THIS.testGetPagesTall1();
		assertEquals("null(com.palladium.paf.ui.PafAdminConsoleViewTest)", THIS
			.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: testGetPagesWide1()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleViewTest#testGetPagesWide1()
	 * @author Parasoft Jtest 8.0
	 */
	public void testTestGetPagesWide11() throws Throwable {
		PafAdminConsoleViewTest THIS = new PafAdminConsoleViewTest(
			(String) null);
		// jtest_tested_method
		THIS.testGetPagesWide1();
		assertEquals("null(com.palladium.paf.ui.PafAdminConsoleViewTest)", THIS
			.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testTestGetPagesWide11.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsTestGetPagesWide11(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Assert.class)) {
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "assertEquals", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testGetPagesWide1(PafAdminConsoleViewTest.java:125)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: testGetUserSelections1()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleViewTest#testGetUserSelections1()
	 * @author Parasoft Jtest 8.0
	 */
	public void testTestGetUserSelections11() throws Throwable {
		PafAdminConsoleViewTest THIS = new PafAdminConsoleViewTest(
			(String) null);
		// jtest_tested_method
		THIS.testGetUserSelections1();
		assertEquals("null(com.palladium.paf.ui.PafAdminConsoleViewTest)", THIS
			.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: testGetUserSelections1()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleViewTest#testGetUserSelections1()
	 * @author Parasoft Jtest 8.0
	 */
	public void testTestGetUserSelections13() throws Throwable {
		PafAdminConsoleViewTest THIS = new PafAdminConsoleViewTest(
			(String) null);
		Object[] var1 = new Object[] { null };
		_f0 = new ArrayListMock(var1);
		// jtest_tested_method
		THIS.testGetUserSelections1();
		assertEquals("null(com.palladium.paf.ui.PafAdminConsoleViewTest)", THIS
			.toString()); // jtest_unverified
		assertEquals("[null]", _f0.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testTestGetUserSelections13.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsTestGetUserSelections13(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAdminConsoleView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getUserSelections", argument_types)) {
				return _f0;
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testGetUserSelections1(PafAdminConsoleViewTest.java:139)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: testGetViewSectionNames1()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleViewTest#testGetViewSectionNames1()
	 * @author Parasoft Jtest 8.0
	 */
	public void testTestGetViewSectionNames11() throws Throwable {
		PafAdminConsoleViewTest THIS = new PafAdminConsoleViewTest(
			(String) null);
		// jtest_tested_method
		THIS.testGetViewSectionNames1();
		assertEquals("null(com.palladium.paf.ui.PafAdminConsoleViewTest)", THIS
			.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testTestGetViewSectionNames11.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsTestGetViewSectionNames11(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Assert.class)) {
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "assertEquals", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testGetViewSectionNames1(PafAdminConsoleViewTest.java:155)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: testGetViewSections1()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleViewTest#testGetViewSections1()
	 * @author Parasoft Jtest 8.0
	 */
	public void testTestGetViewSections11() throws Throwable {
		PafAdminConsoleViewTest THIS = new PafAdminConsoleViewTest(
			(String) null);
		// jtest_tested_method
		THIS.testGetViewSections1();
		assertEquals("null(com.palladium.paf.ui.PafAdminConsoleViewTest)", THIS
			.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testTestGetViewSections11.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsTestGetViewSections11(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Assert.class)) {
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "assertEquals", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testGetViewSections1(PafAdminConsoleViewTest.java:170)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: testPafAdminConsoleView1()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleViewTest#testPafAdminConsoleView1()
	 * @author Parasoft Jtest 8.0
	 */
	public void testTestPafAdminConsoleView11() throws Throwable {
		PafAdminConsoleViewTest THIS = new PafAdminConsoleViewTest(
			(String) null);
		// jtest_tested_method
		THIS.testPafAdminConsoleView1();
		assertEquals("null(com.palladium.paf.ui.PafAdminConsoleViewTest)", THIS
			.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testTestPafAdminConsoleView11.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsTestPafAdminConsoleView11(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAdminConsoleView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPageOrientation", argument_types)) {
				return null;
				// at com.palladium.paf.ui.PafAdminConsoleView.toString(PafAdminConsoleView.java:227)
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testPafAdminConsoleView1(PafAdminConsoleViewTest.java:186)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPagesTall", argument_types)) {
				return null;
				// at com.palladium.paf.ui.PafAdminConsoleView.toString(PafAdminConsoleView.java:228)
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testPafAdminConsoleView1(PafAdminConsoleViewTest.java:186)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPagesWide", argument_types)) {
				return null;
				// at com.palladium.paf.ui.PafAdminConsoleView.toString(PafAdminConsoleView.java:229)
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testPafAdminConsoleView1(PafAdminConsoleViewTest.java:186)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: testPafAdminConsoleView2()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleViewTest#testPafAdminConsoleView2()
	 * @author Parasoft Jtest 8.0
	 */
	public void testTestPafAdminConsoleView21() throws Throwable {
		PafAdminConsoleViewTest THIS = new PafAdminConsoleViewTest(
			(String) null);
		// jtest_tested_method
		THIS.testPafAdminConsoleView2();
		assertEquals("null(com.palladium.paf.ui.PafAdminConsoleViewTest)", THIS
			.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: testPafAdminConsoleView3()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleViewTest#testPafAdminConsoleView3()
	 * @author Parasoft Jtest 8.0
	 */
	public void testTestPafAdminConsoleView31() throws Throwable {
		PafAdminConsoleViewTest THIS = new PafAdminConsoleViewTest(
			(String) null);
		// jtest_tested_method
		THIS.testPafAdminConsoleView3();
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.ui.PafAdminConsoleView.setViewSections(PafAdminConsoleView.java:177)
		// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:53)
		// at com.palladium.paf.ui.PafAdminConsoleViewTest.testPafAdminConsoleView3(PafAdminConsoleViewTest.java:213)
		// jtest_unverified
	}

	/**
	 * Test for method: testPafAdminConsoleView3()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleViewTest#testPafAdminConsoleView3()
	 * @author Parasoft Jtest 8.0
	 */
	public void testTestPafAdminConsoleView32() throws Throwable {
		PafAdminConsoleViewTest THIS = new PafAdminConsoleViewTest(
			(String) null);
		THIS.setUp();
		// jtest_tested_method
		THIS.testPafAdminConsoleView3();
		assertEquals("null(com.palladium.paf.ui.PafAdminConsoleViewTest)", THIS
			.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testTestPafAdminConsoleView32.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsTestPafAdminConsoleView32(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAdminConsoleView.class)) {
			argument_types = new Class[] { String[].class };
			if (Stubs.matches(method, "setViewSections", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:53)
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testPafAdminConsoleView3(PafAdminConsoleViewTest.java:213)
			}
			argument_types = new Class[] { PafViewHeader[].class };
			if (Stubs.matches(method, "setHeaders", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:54)
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testPafAdminConsoleView3(PafAdminConsoleViewTest.java:213)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "setName", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:55)
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testPafAdminConsoleView3(PafAdminConsoleViewTest.java:213)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "setDesc", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:56)
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testPafAdminConsoleView3(PafAdminConsoleViewTest.java:213)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "setBackGroundColor", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:57)
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testPafAdminConsoleView3(PafAdminConsoleViewTest.java:213)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: testPafAdminConsoleView4()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleViewTest#testPafAdminConsoleView4()
	 * @author Parasoft Jtest 8.0
	 */
	public void testTestPafAdminConsoleView41() throws Throwable {
		PafAdminConsoleViewTest THIS = new PafAdminConsoleViewTest(
			(String) null);
		// jtest_tested_method
		THIS.testPafAdminConsoleView4();
		assertEquals("null(com.palladium.paf.ui.PafAdminConsoleViewTest)", THIS
			.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testTestPafAdminConsoleView41.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsTestPafAdminConsoleView41(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAdminConsoleView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPageOrientation", argument_types)) {
				return null;
				// at com.palladium.paf.ui.PafAdminConsoleView.toString(PafAdminConsoleView.java:227)
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testPafAdminConsoleView4(PafAdminConsoleViewTest.java:248)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPagesTall", argument_types)) {
				return null;
				// at com.palladium.paf.ui.PafAdminConsoleView.toString(PafAdminConsoleView.java:228)
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testPafAdminConsoleView4(PafAdminConsoleViewTest.java:248)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPagesWide", argument_types)) {
				return null;
				// at com.palladium.paf.ui.PafAdminConsoleView.toString(PafAdminConsoleView.java:229)
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testPafAdminConsoleView4(PafAdminConsoleViewTest.java:248)
			}
		}
		if (Stubs.matches(method, Assert.class)) {
			argument_types = new Class[] { String.class, String.class };
			if (Stubs.matches(method, "assertEquals", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testPafAdminConsoleView4(PafAdminConsoleViewTest.java:246)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: testPafAdminConsoleView5()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleViewTest#testPafAdminConsoleView5()
	 * @author Parasoft Jtest 8.0
	 */
	public void testTestPafAdminConsoleView51() throws Throwable {
		PafAdminConsoleViewTest THIS = new PafAdminConsoleViewTest(
			(String) null);
		// jtest_tested_method
		THIS.testPafAdminConsoleView5();
		// NullPointerException thrown
		// at com.palladium.paf.ui.PafAdminConsoleView.toString(PafAdminConsoleView.java:210)
		// at com.palladium.paf.ui.PafAdminConsoleViewTest.testPafAdminConsoleView5(PafAdminConsoleViewTest.java:346)
		// jtest_unverified
	}

	/**
	 * Stubs method for testTestPafAdminConsoleView51.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsTestPafAdminConsoleView51(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAdminConsoleView.class)) {
			argument_types = new Class[] { String[].class };
			if (Stubs.matches(method, "setViewSections", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:53)
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testPafAdminConsoleView5(PafAdminConsoleViewTest.java:343)
			}
			argument_types = new Class[] { PafViewHeader[].class };
			if (Stubs.matches(method, "setHeaders", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:54)
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testPafAdminConsoleView5(PafAdminConsoleViewTest.java:343)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "setName", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:55)
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testPafAdminConsoleView5(PafAdminConsoleViewTest.java:343)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "setDesc", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:56)
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testPafAdminConsoleView5(PafAdminConsoleViewTest.java:343)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "setBackGroundColor", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:57)
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testPafAdminConsoleView5(PafAdminConsoleViewTest.java:343)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "toString", argument_types)) {
				return null;
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testPafAdminConsoleView5(PafAdminConsoleViewTest.java:346)
			}
		}
		if (Stubs.matches(method, Assert.class)) {
			argument_types = new Class[] { String.class, String.class };
			if (Stubs.matches(method, "assertEquals", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testPafAdminConsoleView5(PafAdminConsoleViewTest.java:344)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: testPafAdminConsoleView5()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleViewTest#testPafAdminConsoleView5()
	 * @author Parasoft Jtest 8.0
	 */
	public void testTestPafAdminConsoleView52() throws Throwable {
		PafAdminConsoleViewTest THIS = new PafAdminConsoleViewTest("");
		// jtest_tested_method
		THIS.testPafAdminConsoleView5();
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testTestPafAdminConsoleView52.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsTestPafAdminConsoleView52(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAdminConsoleView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPagesTall", argument_types)) {
				return null;
				// at com.palladium.paf.ui.PafAdminConsoleView.toString(PafAdminConsoleView.java:228)
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testPafAdminConsoleView5(PafAdminConsoleViewTest.java:346)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPagesWide", argument_types)) {
				return null;
				// at com.palladium.paf.ui.PafAdminConsoleView.toString(PafAdminConsoleView.java:229)
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testPafAdminConsoleView5(PafAdminConsoleViewTest.java:346)
			}
		}
		if (Stubs.matches(method, Assert.class)) {
			argument_types = new Class[] { String.class, String.class };
			if (Stubs.matches(method, "assertEquals", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testPafAdminConsoleView5(PafAdminConsoleViewTest.java:344)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: testPafAdminConsoleView6()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleViewTest#testPafAdminConsoleView6()
	 * @author Parasoft Jtest 8.0
	 */
	public void testTestPafAdminConsoleView61() throws Throwable {
		PafAdminConsoleViewTest THIS = new PafAdminConsoleViewTest(
			(String) null);
		// jtest_tested_method
		THIS.testPafAdminConsoleView6();
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:67)
		// at com.palladium.paf.ui.PafAdminConsoleViewTest.testPafAdminConsoleView6(PafAdminConsoleViewTest.java:376)
		// jtest_unverified
	}

	/**
	 * Stubs method for testTestPafAdminConsoleView61.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsTestPafAdminConsoleView61(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAdminConsoleView.class)) {
			argument_types = new Class[] { String[].class };
			if (Stubs.matches(method, "setViewSections", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:53)
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testPafAdminConsoleView6(PafAdminConsoleViewTest.java:376)
			}
			argument_types = new Class[] { PafViewHeader[].class };
			if (Stubs.matches(method, "setHeaders", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:54)
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testPafAdminConsoleView6(PafAdminConsoleViewTest.java:376)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "setName", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:55)
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testPafAdminConsoleView6(PafAdminConsoleViewTest.java:376)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "setDesc", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:56)
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testPafAdminConsoleView6(PafAdminConsoleViewTest.java:376)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "setBackGroundColor", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:57)
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testPafAdminConsoleView6(PafAdminConsoleViewTest.java:376)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: testPafAdminConsoleView7()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleViewTest#testPafAdminConsoleView7()
	 * @author Parasoft Jtest 8.0
	 */
	public void testTestPafAdminConsoleView71() throws Throwable {
		PafAdminConsoleViewTest THIS = new PafAdminConsoleViewTest(
			(String) null);
		// jtest_tested_method
		THIS.testPafAdminConsoleView7();
		// NullPointerException thrown
		// at com.palladium.paf.ui.PafAdminConsoleViewTest.stubsPafAdminConsoleView7(PafAdminConsoleViewTest.java:482)
		// at com.palladium.paf.view.PafUserSelection.<init>(PafUserSelection.java:43)
		// at com.palladium.paf.ui.PafAdminConsoleViewTest.testPafAdminConsoleView7(PafAdminConsoleViewTest.java:394)
		// jtest_unverified
	}

	/**
	 * Stubs method for testTestPafAdminConsoleView71.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsTestPafAdminConsoleView71(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ExpOperation.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getParms", argument_types)) {
				return null;
				// at com.palladium.paf.view.PafUserSelection.<init>(PafUserSelection.java:43)
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testPafAdminConsoleView7(PafAdminConsoleViewTest.java:394)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: testPafAdminConsoleView7()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleViewTest#testPafAdminConsoleView7()
	 * @author Parasoft Jtest 8.0
	 */
	public void testTestPafAdminConsoleView73() throws Throwable {
		PafAdminConsoleViewTest THIS = new PafAdminConsoleViewTest(
			(String) null);
		THIS.setUp();
		// jtest_tested_method
		THIS.testPafAdminConsoleView7();
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.view.PafUserSelection.<init>(PafUserSelection.java:44)
		// at com.palladium.paf.ui.PafAdminConsoleViewTest.testPafAdminConsoleView7(PafAdminConsoleViewTest.java:394)
		// jtest_unverified
	}

	/**
	 * Stubs method for testTestPafAdminConsoleView73.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsTestPafAdminConsoleView73(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafUserSelection.class)) {
			argument_types = new Class[] { ExpOperation.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(PafUserSelection.class);
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testPafAdminConsoleView7(PafAdminConsoleViewTest.java:394)
			}
		}
		if (Stubs.matches(method, PafAdminConsoleView.class)) {
			argument_types = new Class[] { String[].class };
			if (Stubs.matches(method, "setViewSections", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:53)
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testPafAdminConsoleView7(PafAdminConsoleViewTest.java:410)
			}
			argument_types = new Class[] { PafViewHeader[].class };
			if (Stubs.matches(method, "setHeaders", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:54)
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testPafAdminConsoleView7(PafAdminConsoleViewTest.java:410)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "setName", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:55)
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testPafAdminConsoleView7(PafAdminConsoleViewTest.java:410)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "setDesc", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:56)
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testPafAdminConsoleView7(PafAdminConsoleViewTest.java:410)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "setBackGroundColor", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:57)
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testPafAdminConsoleView7(PafAdminConsoleViewTest.java:410)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: testSetPageOrientation1()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleViewTest#testSetPageOrientation1()
	 * @author Parasoft Jtest 8.0
	 */
	public void testTestSetPageOrientation11() throws Throwable {
		PafAdminConsoleViewTest THIS = new PafAdminConsoleViewTest(
			(String) null);
		// jtest_tested_method
		THIS.testSetPageOrientation1();
		assertEquals("null(com.palladium.paf.ui.PafAdminConsoleViewTest)", THIS
			.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testTestSetPageOrientation11.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsTestSetPageOrientation11(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAdminConsoleView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPageOrientation", argument_types)) {
				return "";
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testSetPageOrientation1(PafAdminConsoleViewTest.java:522)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: testSetPagesTall1()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleViewTest#testSetPagesTall1()
	 * @author Parasoft Jtest 8.0
	 */
	public void testTestSetPagesTall11() throws Throwable {
		PafAdminConsoleViewTest THIS = new PafAdminConsoleViewTest(
			(String) null);
		_f1 = new Integer("0");
		// jtest_tested_method
		THIS.testSetPagesTall1();
		assertEquals("null(com.palladium.paf.ui.PafAdminConsoleViewTest)", THIS
			.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testTestSetPagesTall11.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsTestSetPagesTall11(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAdminConsoleView.class)) {
			argument_types = new Class[] { PafView.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(PafAdminConsoleView.class);
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testSetPagesTall1(PafAdminConsoleViewTest.java:534)
			}
			argument_types = new Class[] { Integer.class };
			if (Stubs.matches(method, "setPagesTall", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testSetPagesTall1(PafAdminConsoleViewTest.java:536)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPagesTall", argument_types)) {
				return _f1;
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testSetPagesTall1(PafAdminConsoleViewTest.java:537)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: testSetPagesWide1()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleViewTest#testSetPagesWide1()
	 * @author Parasoft Jtest 8.0
	 */
	public void testTestSetPagesWide11() throws Throwable {
		PafAdminConsoleViewTest THIS = new PafAdminConsoleViewTest(
			(String) null);
		// jtest_tested_method
		THIS.testSetPagesWide1();
		assertEquals("null(com.palladium.paf.ui.PafAdminConsoleViewTest)", THIS
			.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testTestSetPagesWide11.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsTestSetPagesWide11(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Assert.class)) {
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "assertEquals", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testSetPagesWide1(PafAdminConsoleViewTest.java:552)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: testSetUserSelections1()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleViewTest#testSetUserSelections1()
	 * @author Parasoft Jtest 8.0
	 */
	public void testTestSetUserSelections11() throws Throwable {
		PafAdminConsoleViewTest THIS = new PafAdminConsoleViewTest(
			(String) null);
		// jtest_tested_method
		THIS.testSetUserSelections1();
		assertEquals("null(com.palladium.paf.ui.PafAdminConsoleViewTest)", THIS
			.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: testSetUserSelections1()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleViewTest#testSetUserSelections1()
	 * @author Parasoft Jtest 8.0
	 */
	public void testTestSetUserSelections12() throws Throwable {
		PafAdminConsoleViewTest THIS = new PafAdminConsoleViewTest("");
		Object[] var1 = new Object[] { null };
		_f0 = new ArrayListMock(var1);
		// jtest_tested_method
		THIS.testSetUserSelections1();
		assertEquals("(com.palladium.paf.ui.PafAdminConsoleViewTest)", THIS
			.toString()); // jtest_unverified
		assertEquals("[null]", _f0.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testTestSetUserSelections12.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsTestSetUserSelections12(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAdminConsoleView.class)) {
			argument_types = new Class[] { PafView.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(PafAdminConsoleView.class);
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testSetUserSelections1(PafAdminConsoleViewTest.java:564)
			}
			argument_types = new Class[] { ArrayList.class };
			if (Stubs.matches(method, "setUserSelections", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testSetUserSelections1(PafAdminConsoleViewTest.java:566)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getUserSelections", argument_types)) {
				return _f0;
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testSetUserSelections1(PafAdminConsoleViewTest.java:567)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: testSetViewSectionNames1()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleViewTest#testSetViewSectionNames1()
	 * @author Parasoft Jtest 8.0
	 */
	public void testTestSetViewSectionNames11() throws Throwable {
		PafAdminConsoleViewTest THIS = new PafAdminConsoleViewTest(
			(String) null);
		// jtest_tested_method
		THIS.testSetViewSectionNames1();
		assertEquals("null(com.palladium.paf.ui.PafAdminConsoleViewTest)", THIS
			.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testTestSetViewSectionNames11.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsTestSetViewSectionNames11(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Assert.class)) {
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "assertEquals", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.ui.PafAdminConsoleViewTest.testSetViewSectionNames1(PafAdminConsoleViewTest.java:582)
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
	 * Usage: java com.palladium.paf.ui.PafAdminConsoleViewTestTest
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
			PafAdminConsoleViewTestTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.ui.PafAdminConsoleViewTest",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafAdminConsoleViewTest.class;
	}

		/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private ArrayListMock _f0;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Integer _f1;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Object _f2;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafViewHeader _f3;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafViewHeader _f4;
}

// JTEST_CURRENT_ID=-241652665.