/*
 * PafAdminConsoleViewTest.java
 * Created by Jtest on 9/19/06 5:31:33 PM.
 * Updated by Jtest on 10/18/06 7:28:07 PM, 5 test cases added, 5 test cases removed.
 */

package com.palladium.paf.ui;

import com.palladium.paf.data.ExpOperation;
import jtest.Stubs;
import java.lang.reflect.Member;
import com.palladium.paf.view.PafViewHeader;
import com.palladium.paf.view.PafUserSelection;
import com.palladium.paf.view.PafViewSection;
import java.util.ArrayList;
import java.util.Set;
import com.palladium.paf.view.PafView;
import com.palladium.paf.ui.PafAdminConsoleView;

/**
 * PafAdminConsoleViewTest is a unit test class for class PafAdminConsoleView.
 * @see com.palladium.paf.ui.PafAdminConsoleView
 * @author Parasoft Jtest 8.0
 */
public class PafAdminConsoleViewTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafAdminConsoleViewTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: addUserSelection(com.palladium.paf.view.PafUserSelection)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleView#addUserSelection(com.palladium.paf.view.PafUserSelection)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddUserSelection1() throws Throwable {
		PafAdminConsoleView THIS = new PafAdminConsoleView((PafView) null);
		// jtest_tested_method
		THIS.addUserSelection((PafUserSelection) null);
		// NullPointerException thrown
		// at com.palladium.paf.ui.PafAdminConsoleView.addUserSelection(PafAdminConsoleView.java:282)
		// jtest_unverified
	}

	/**
	 * Test for method: clone()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleView#clone()
	 * @author Parasoft Jtest 8.0
	 */
	public void testClone1() throws Throwable {
		PafAdminConsoleView THIS = new PafAdminConsoleView((PafView) null);
		// jtest_tested_method
		Object RETVAL = THIS.clone();
		// NullPointerException thrown
		// at com.palladium.paf.ui.PafAdminConsoleView.getHeaders(PafAdminConsoleView.java:130)
		// at com.palladium.paf.ui.PafAdminConsoleView.clone(PafAdminConsoleView.java:245)
		// jtest_unverified
	}

	/**
	 * Test for method: getName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleView#getName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetName1() throws Throwable {
		PafAdminConsoleView THIS = new PafAdminConsoleView((PafView) null);
		// jtest_tested_method
		String RETVAL = THIS.getName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPageOrientation()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleView#getPageOrientation()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPageOrientation1() throws Throwable {
		PafAdminConsoleView THIS = new PafAdminConsoleView((PafView) null);
		// jtest_tested_method
		String RETVAL = THIS.getPageOrientation();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPagesTall()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleView#getPagesTall()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPagesTall1() throws Throwable {
		PafAdminConsoleView THIS = new PafAdminConsoleView((PafView) null);
		// jtest_tested_method
		Integer RETVAL = THIS.getPagesTall();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPagesWide()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleView#getPagesWide()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPagesWide1() throws Throwable {
		PafAdminConsoleView THIS = new PafAdminConsoleView((PafView) null);
		// jtest_tested_method
		Integer RETVAL = THIS.getPagesWide();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getUserSelections()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleView#getUserSelections()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetUserSelections1() throws Throwable {
		PafAdminConsoleView THIS = new PafAdminConsoleView((PafView) null);
		// jtest_tested_method
		ArrayList RETVAL = THIS.getUserSelections();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getViewSectionNames()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleView#getViewSectionNames()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetViewSectionNames1() throws Throwable {
		PafAdminConsoleView THIS = new PafAdminConsoleView((PafView) null);
		// jtest_tested_method
		Set RETVAL = THIS.getViewSectionNames();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getViewSections()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleView#getViewSections()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetViewSections1() throws Throwable {
		PafAdminConsoleView THIS = new PafAdminConsoleView((PafView) null);
		// jtest_tested_method
		PafViewSection[] RETVAL = THIS.getViewSections();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafAdminConsoleView()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleView#PafAdminConsoleView()
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafAdminConsoleView1() throws Throwable {
		// jtest_tested_method
		PafAdminConsoleView THIS = new PafAdminConsoleView();
		assertEquals(
			"View Name: null\nDesc: null\nBackGround Color: null\n\t************************************\n\t*Headers:\n\t************************************\n\n\t************************************\n\t*View Sections:\n\t************************************\n\t*User Selections:\n\t************************************\n\t************************************\n\t*Page Orientation: null\n\t*Pages Tall: null\n\t*Pages Wide: null\n\t************************************\n",
			THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafAdminConsoleView(com.palladium.paf.view.PafView)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleView#PafAdminConsoleView(com.palladium.paf.view.PafView)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafAdminConsoleView2() throws Throwable {
		// jtest_tested_method
		PafAdminConsoleView THIS = new PafAdminConsoleView((PafView) null);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafAdminConsoleView(com.palladium.paf.view.PafView)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleView#PafAdminConsoleView(com.palladium.paf.view.PafView)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafAdminConsoleView4() throws Throwable {
		PafView t0 = new PafView();
		Integer t1 = new Integer(0);
		Integer t2 = new Integer("0");
		t0.setDesc("");
		PafViewHeader[] var1 = new PafViewHeader[] {};
		t0.setHeaders(var1);
		t0.setName("");
		PafViewSection[] var2 = new PafViewSection[] {};
		t0.setViewSections(var2);
		t0.setBackGroundColor("");
		PafUserSelection[] var3 = new PafUserSelection[] {};
		t0.setUserSelections(var3);
		String[] var4 = new String[] {};
		t0.setViewSectionNames(var4);
		t0.setPageOrientation("");
		t0.setPagesTall(t1);
		t0.setPagesWide(t2);
		// jtest_tested_method
		PafAdminConsoleView THIS = new PafAdminConsoleView(t0);
		assertEquals(
			"View Name: null\nDesc: null\nBackGround Color: null\n\t************************************\n\t*Headers:\n\t************************************\n\n\t************************************\n\t*View Sections:\n\t************************************\n\t*User Selections:\n\t************************************\n\t************************************\n\t*Page Orientation: null\n\t*Pages Tall: null\n\t*Pages Wide: null\n\t************************************\n",
			THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafAdminConsoleView4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafAdminConsoleView4(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getViewSectionNames", argument_types)) {
				return new String[0];
				// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:53)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getHeaders", argument_types)) {
				return null;
				// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:54)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getName", argument_types)) {
				return null;
				// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:55)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDesc", argument_types)) {
				return null;
				// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:56)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getBackGroundColor", argument_types)) {
				return null;
				// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:57)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getUserSelections", argument_types)) {
				return null;
				// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPageOrientation", argument_types)) {
				return null;
				// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:60)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPagesTall", argument_types)) {
				return null;
				// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:61)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPagesWide", argument_types)) {
				return null;
				// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:62)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafAdminConsoleView(com.palladium.paf.view.PafView)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleView#PafAdminConsoleView(com.palladium.paf.view.PafView)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafAdminConsoleView5() throws Throwable {
		PafView t0 = new PafView();
		Integer t1 = new Integer(0);
		Integer t2 = new Integer("0");
		t0.setDesc("");
		PafViewHeader[] var1 = new PafViewHeader[] {};
		t0.setHeaders(var1);
		t0.setName("");
		PafViewSection[] var2 = new PafViewSection[] {};
		t0.setViewSections(var2);
		t0.setBackGroundColor("");
		PafUserSelection[] var3 = new PafUserSelection[] {};
		t0.setUserSelections(var3);
		String[] var4 = new String[] { null };
		t0.setViewSectionNames(var4);
		t0.setPageOrientation("");
		t0.setPagesTall(t1);
		t0.setPagesWide(t2);
		// jtest_tested_method
		PafAdminConsoleView THIS = new PafAdminConsoleView(t0);
		assertEquals(
			"View Name: \nDesc: \nBackGround Color: \n\t************************************\n\t*Headers:\n\t************************************\n\n\t************************************\n\t*View Sections:\n\t*\tnull\n\t************************************\n\t*User Selections:\n\t************************************\n\t************************************\n\t*Page Orientation: \n\t*Pages Tall: 0\n\t*Pages Wide: 0\n\t************************************\n",
			THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafAdminConsoleView(com.palladium.paf.view.PafView)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleView#PafAdminConsoleView(com.palladium.paf.view.PafView)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafAdminConsoleView7() throws Throwable {
		PafView t0 = new PafView();
		// jtest_tested_method
		PafAdminConsoleView THIS = new PafAdminConsoleView(t0);
		// NullPointerException thrown
		// at com.palladium.paf.ui.PafAdminConsoleView.setViewSections(PafAdminConsoleView.java:177)
		// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:53)
		// jtest_unverified
	}

	/**
	 * Test for method: PafAdminConsoleView(com.palladium.paf.view.PafView)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleView#PafAdminConsoleView(com.palladium.paf.view.PafView)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafAdminConsoleView10() throws Throwable {
		PafView t0 = new PafView();
		Integer t1 = new Integer(0);
		Integer t2 = new Integer("0");
		t0.setDesc("");
		PafViewHeader[] var1 = new PafViewHeader[] { null };
		t0.setHeaders(var1);
		t0.setName("");
		PafViewSection[] var2 = new PafViewSection[] {};
		t0.setViewSections(var2);
		t0.setBackGroundColor("");
		PafUserSelection[] var3 = new PafUserSelection[] { null };
		t0.setUserSelections(var3);
		String[] var4 = new String[] { null, "", null };
		t0.setViewSectionNames(var4);
		t0.setPageOrientation("");
		t0.setPagesTall(t1);
		t0.setPagesWide(t2);
		// jtest_tested_method
		PafAdminConsoleView THIS = new PafAdminConsoleView(t0);
		// NullPointerException thrown
		// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:67)
		// jtest_unverified
	}

	/**
	 * Test for method: PafAdminConsoleView(com.palladium.paf.view.PafView)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleView#PafAdminConsoleView(com.palladium.paf.view.PafView)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafAdminConsoleView11() throws Throwable {
		PafView t0 = new PafView();
		Integer t1 = new Integer(0);
		Integer t2 = new Integer("0");
		ExpOperation var1 = (ExpOperation) Stubs
			.makeStubObject(ExpOperation.class);
		_f0 = new PafUserSelection(var1);
		t0.setDesc("");
		PafViewHeader[] var2 = new PafViewHeader[] {};
		t0.setHeaders(var2);
		t0.setName("");
		PafViewSection[] var3 = new PafViewSection[] {};
		t0.setViewSections(var3);
		t0.setBackGroundColor("");
		PafUserSelection[] var4 = new PafUserSelection[] {};
		t0.setUserSelections(var4);
		String[] var5 = new String[] {};
		t0.setViewSectionNames(var5);
		t0.setPageOrientation("");
		t0.setPagesTall(t1);
		t0.setPagesWide(t2);
		// jtest_tested_method
		PafAdminConsoleView THIS = new PafAdminConsoleView(t0);
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.view.PafUserSelection.<init>(PafUserSelection.java:44)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafAdminConsoleView11.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafAdminConsoleView11(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getViewSectionNames", argument_types)) {
				return new String[] { null, "", null, null };
				// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:53)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getHeaders", argument_types)) {
				return new PafViewHeader[2];
				// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:54)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getName", argument_types)) {
				return null;
				// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:55)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDesc", argument_types)) {
				return null;
				// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:56)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getBackGroundColor", argument_types)) {
				return null;
				// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:57)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getUserSelections", argument_types)) {
				return new PafUserSelection[] { _f0 };
				// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPageOrientation", argument_types)) {
				return null;
				// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:60)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPagesTall", argument_types)) {
				return null;
				// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:61)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPagesWide", argument_types)) {
				return null;
				// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:62)
			}
		}
		if (Stubs.matches(method, ExpOperation.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getParms", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.data.ExpOperation.getParms()");
				switch (index) {
					case 1 :
					case 2 :
						return new String[1];
					// at com.palladium.paf.view.PafUserSelection.<init>(PafUserSelection.java:43)
					// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:67)
					case 3 :
					case 4 :
						return new String[2];
					// at com.palladium.paf.view.PafUserSelection.<init>(PafUserSelection.java:44)
					// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:67)
					case 5 :
					case 6 :
						return new String[] { null, null, "0" };
					// at com.palladium.paf.view.PafUserSelection.<init>(PafUserSelection.java:45)
					// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:67)
					case 7 :
					case 8 :
						return new String[4];
					// at com.palladium.paf.view.PafUserSelection.<init>(PafUserSelection.java:46)
					// at com.palladium.paf.ui.PafAdminConsoleView.<init>(PafAdminConsoleView.java:67)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: setPageOrientation(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleView#setPageOrientation(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetPageOrientation1() throws Throwable {
		PafAdminConsoleView THIS = new PafAdminConsoleView((PafView) null);
		// jtest_tested_method
		THIS.setPageOrientation((String) null);
		assertEquals(null, THIS.getPageOrientation()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setPagesTall(java.lang.Integer)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleView#setPagesTall(java.lang.Integer)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetPagesTall1() throws Throwable {
		PafAdminConsoleView THIS = new PafAdminConsoleView((PafView) null);
		// jtest_tested_method
		THIS.setPagesTall((Integer) null);
		assertEquals(null, THIS.getPagesTall()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setPagesWide(java.lang.Integer)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleView#setPagesWide(java.lang.Integer)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetPagesWide1() throws Throwable {
		PafAdminConsoleView THIS = new PafAdminConsoleView((PafView) null);
		// jtest_tested_method
		THIS.setPagesWide((Integer) null);
		assertEquals(null, THIS.getPagesWide()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setUserSelections(java.util.ArrayList)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleView#setUserSelections(java.util.ArrayList)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetUserSelections1() throws Throwable {
		PafAdminConsoleView THIS = new PafAdminConsoleView((PafView) null);
		// jtest_tested_method
		THIS.setUserSelections((ArrayList) null);
		assertEquals(null, THIS.getUserSelections()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setViewSectionNames(java.util.Set)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAdminConsoleView#setViewSectionNames(java.util.Set)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetViewSectionNames1() throws Throwable {
		PafAdminConsoleView THIS = new PafAdminConsoleView((PafView) null);
		// jtest_tested_method
		THIS.setViewSectionNames((Set) null);
		assertEquals(null, THIS.getViewSectionNames()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.ui.PafAdminConsoleViewTest
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
			PafAdminConsoleViewTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.ui.PafAdminConsoleView",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafAdminConsoleView.class;
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
private PafUserSelection _f0;
}

// JTEST_CURRENT_ID=867815103.