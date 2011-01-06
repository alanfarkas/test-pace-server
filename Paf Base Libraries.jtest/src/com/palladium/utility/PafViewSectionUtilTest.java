/*
 * PafViewSectionUtilTest.java
 * Created by Jtest on 9/19/06 5:56:09 PM.
 * Updated by Jtest on 10/18/06 7:31:16 PM, 4 test cases added, 4 test cases removed.
 * Updated by Jtest on 11/9/06 3:25:45 AM, 4 test cases added, 4 test cases removed.
 */

package com.palladium.utility;

import jtest.Stubs;
import java.lang.reflect.Member;
import com.palladium.paf.view.LockedCell;
import com.palladium.paf.view.PafViewHeader;
import com.palladium.paf.view.PageTuple;
import com.palladium.paf.view.ViewTuple;
import com.palladium.paf.data.PafDataSlice;
import com.palladium.paf.view.PafViewSection;
import com.palladium.paf.view.PafAxis;
import com.palladium.utility.PafViewSectionUtil;

/**
 * PafViewSectionUtilTest is a unit test class for class PafViewSectionUtil.
 * @see com.palladium.utility.PafViewSectionUtil
 * @author Parasoft Jtest 8.0
 */
public class PafViewSectionUtilTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafViewSectionUtilTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: static getDimensionAxis(com.palladium.paf.view.PafViewSection,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUtil#getDimensionAxis(com.palladium.paf.view.PafViewSection,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDimensionAxis3() throws Throwable {
		PafViewSection t0 = new PafViewSection();
		// jtest_tested_method
		PafAxis RETVAL = PafViewSectionUtil.getDimensionAxis(t0, "");
		// NullPointerException thrown
		// at com.palladium.utility.PafViewSectionUtil.getDimensionAxis(PafViewSectionUtil.java:75)
		// jtest_unverified
	}

	/**
	 * Test for method: static getDimensionAxis(com.palladium.paf.view.PafViewSection,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUtil#getDimensionAxis(com.palladium.paf.view.PafViewSection,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDimensionAxis4() throws Throwable {
		PafViewSection t0 = new PafViewSection();
		PafDataSlice t1 = new PafDataSlice();
		Integer t2 = new Integer(0);
		Integer t3 = new Integer("0");
		t0.setDescription("");
		t0.setName("");
		ViewTuple[] var1 = new ViewTuple[] {};
		t0.setColTuples(var1);
		ViewTuple[] var2 = new ViewTuple[] {};
		t0.setRowTuples(var2);
		t0.setPafDataSlice(t1);
		t0.setDataAlias("");
		t0.setManaged(false);
		t0.setPrimaryFormattingAxis(0);
		t0.setReadOnly(false);
		String[] var3 = new String[] {};
		t0.setColAxisDims(var3);
		PageTuple[] var4 = new PageTuple[] {};
		t0.setPageTuples(var4);
		String[] var5 = new String[] {};
		t0.setRowAxisDims(var5);
		t0.setLeftOffset(0);
		t0.setTopOffset(0);
		PafViewHeader[] var6 = new PafViewHeader[] {};
		t0.setPafViewHeaders(var6);
		LockedCell[] var7 = new LockedCell[] {};
		t0.setForwardPlannableLockedCell(var7);
		LockedCell[] var8 = new LockedCell[] {};
		t0.setNotPlannableLockedCells(var8);
		t0.setGenerationFormatName("");
		t0.setColumnWidth(t2);
		t0.setRowHeight(t3);
		// jtest_tested_method
		PafAxis RETVAL = PafViewSectionUtil.getDimensionAxis(t0, "");
		// NullPointerException thrown
		// at com.palladium.utility.PafViewSectionUtil.getDimensionAxis(PafViewSectionUtil.java:92)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDimensionAxis4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDimensionAxis4(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafViewSection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getColAxisDims", argument_types)) {
				return new String[0];
				// at com.palladium.utility.PafViewSectionUtil.getDimensionAxis(PafViewSectionUtil.java:75)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowAxisDims", argument_types)) {
				return null;
				// at com.palladium.utility.PafViewSectionUtil.getDimensionAxis(PafViewSectionUtil.java:92)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static getDimensionAxis(com.palladium.paf.view.PafViewSection,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUtil#getDimensionAxis(com.palladium.paf.view.PafViewSection,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDimensionAxis6() throws Throwable {
		PafViewSection t0 = new PafViewSection();
		PafDataSlice t1 = new PafDataSlice();
		Integer t2 = new Integer(0);
		Integer t3 = new Integer("0");
		PageTuple t4 = new PageTuple((String) null, (String) null);
		t0.setDescription("");
		t0.setName("");
		ViewTuple[] var1 = new ViewTuple[] {};
		t0.setColTuples(var1);
		ViewTuple[] var2 = new ViewTuple[] {};
		t0.setRowTuples(var2);
		t1.setColumnCount(0);
		double[] var3 = new double[] {};
		t1.setData(var3);
		t1.setCompressedData("");
		t1.setCompressed(false);
		t0.setPafDataSlice(t1);
		t0.setDataAlias("");
		t0.setManaged(false);
		t0.setPrimaryFormattingAxis(0);
		t0.setReadOnly(false);
		String[] var4 = new String[] {};
		t0.setColAxisDims(var4);
		PageTuple[] var5 = new PageTuple[] { t4 };
		t0.setPageTuples(var5);
		String[] var6 = new String[] {};
		t0.setRowAxisDims(var6);
		t0.setLeftOffset(0);
		t0.setTopOffset(0);
		PafViewHeader[] var7 = new PafViewHeader[] {};
		t0.setPafViewHeaders(var7);
		LockedCell[] var8 = new LockedCell[] {};
		t0.setForwardPlannableLockedCell(var8);
		LockedCell[] var9 = new LockedCell[] {};
		t0.setNotPlannableLockedCells(var9);
		t0.setGenerationFormatName("");
		t0.setColumnWidth(t2);
		t0.setRowHeight(t3);
		// jtest_tested_method
		PafAxis RETVAL = PafViewSectionUtil.getDimensionAxis(t0, "");
		// NullPointerException thrown
		// at com.palladium.utility.PafViewSectionUtil.getDimensionAxis(PafViewSectionUtil.java:62)
		// jtest_unverified
	}

	/**
	 * Test for method: static getDimensionAxis(com.palladium.paf.view.PafViewSection,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUtil#getDimensionAxis(com.palladium.paf.view.PafViewSection,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDimensionAxis8() throws Throwable {
		PafViewSection t0 = new PafViewSection();
		PafDataSlice t1 = new PafDataSlice();
		Integer t2 = new Integer(0);
		Integer t3 = new Integer("0");
		PageTuple t4 = new PageTuple();
		t0.setDescription("");
		t0.setName("");
		ViewTuple[] var1 = new ViewTuple[] {};
		t0.setColTuples(var1);
		ViewTuple[] var2 = new ViewTuple[] {};
		t0.setRowTuples(var2);
		t1.setColumnCount(0);
		double[] var3 = new double[] {};
		t1.setData(var3);
		t1.setCompressedData("");
		t1.setCompressed(false);
		t0.setPafDataSlice(t1);
		t0.setDataAlias("");
		t0.setManaged(false);
		t0.setPrimaryFormattingAxis(0);
		t0.setReadOnly(false);
		String[] var4 = new String[] {};
		t0.setColAxisDims(var4);
		PageTuple[] var5 = new PageTuple[] { t4 };
		t0.setPageTuples(var5);
		String[] var6 = new String[] {};
		t0.setRowAxisDims(var6);
		t0.setLeftOffset(0);
		t0.setTopOffset(0);
		PafViewHeader[] var7 = new PafViewHeader[] {};
		t0.setPafViewHeaders(var7);
		LockedCell[] var8 = new LockedCell[] {};
		t0.setForwardPlannableLockedCell(var8);
		LockedCell[] var9 = new LockedCell[] {};
		t0.setNotPlannableLockedCells(var9);
		t0.setGenerationFormatName("");
		t0.setColumnWidth(t2);
		t0.setRowHeight(t3);
		// jtest_tested_method
		PafAxis RETVAL = PafViewSectionUtil.getDimensionAxis(t0, "");
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(2, RETVAL.getValue()); // jtest_unverified
		assertEquals(2, RETVAL.getPageAxis()); // jtest_unverified
		assertEquals(1, RETVAL.getColAxis()); // jtest_unverified
		assertEquals(0, RETVAL.getRowAxis()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDimensionAxis8.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDimensionAxis8(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PageTuple.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxis", argument_types)) {
				return "";
				// at com.palladium.utility.PafViewSectionUtil.getDimensionAxis(PafViewSectionUtil.java:62)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static getDimensionAxis(com.palladium.paf.view.PafViewSection,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUtil#getDimensionAxis(com.palladium.paf.view.PafViewSection,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDimensionAxis11() throws Throwable {
		PafViewSection t0 = new PafViewSection();
		PafDataSlice t1 = new PafDataSlice((double[]) null, 0);
		Integer t2 = new Integer(0);
		Integer t3 = new Integer("0");
		PageTuple t4 = new PageTuple();
		PageTuple t5 = new PageTuple((String) null, (String) null);
		t0.setDescription("");
		t0.setName("");
		ViewTuple[] var1 = new ViewTuple[] {};
		t0.setColTuples(var1);
		ViewTuple[] var2 = new ViewTuple[] {};
		t0.setRowTuples(var2);
		t1.setColumnCount(0);
		double[] var3 = new double[] {};
		t1.setData(var3);
		t1.setCompressedData("");
		t1.setCompressed(false);
		t0.setPafDataSlice(t1);
		t0.setDataAlias("");
		t0.setManaged(false);
		t0.setPrimaryFormattingAxis(0);
		t0.setReadOnly(false);
		String[] var4 = new String[] {};
		t0.setColAxisDims(var4);
		PageTuple[] var5 = new PageTuple[] { t4, t5 };
		t0.setPageTuples(var5);
		String[] var6 = new String[] {};
		t0.setRowAxisDims(var6);
		t0.setLeftOffset(0);
		t0.setTopOffset(0);
		PafViewHeader[] var7 = new PafViewHeader[] {};
		t0.setPafViewHeaders(var7);
		LockedCell[] var8 = new LockedCell[] {};
		t0.setForwardPlannableLockedCell(var8);
		LockedCell[] var9 = new LockedCell[] {};
		t0.setNotPlannableLockedCells(var9);
		t0.setGenerationFormatName("");
		t0.setColumnWidth(t2);
		t0.setRowHeight(t3);
		t4.setAxis("");
		t4.setMember("");
		// jtest_tested_method
		PafAxis RETVAL = PafViewSectionUtil.getDimensionAxis(t0, "0");
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDimensionAxis11.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDimensionAxis11(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PageTuple.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxis", argument_types)) {
				return "";
				// at com.palladium.utility.PafViewSectionUtil.getDimensionAxis(PafViewSectionUtil.java:62)
			}
		}
		if (Stubs.matches(method, PafViewSection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getColAxisDims", argument_types)) {
				return new String[] { "" };
				// at com.palladium.utility.PafViewSectionUtil.getDimensionAxis(PafViewSectionUtil.java:75)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowAxisDims", argument_types)) {
				return new String[0];
				// at com.palladium.utility.PafViewSectionUtil.getDimensionAxis(PafViewSectionUtil.java:92)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static getDimensionAxis(com.palladium.paf.view.PafViewSection,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUtil#getDimensionAxis(com.palladium.paf.view.PafViewSection,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDimensionAxis12() throws Throwable {
		PafViewSection t0 = new PafViewSection();
		PafDataSlice t1 = new PafDataSlice((double[]) null, 0);
		Integer t2 = new Integer(0);
		Integer t3 = new Integer("0");
		PageTuple t4 = new PageTuple();
		PageTuple t5 = new PageTuple((String) null, (String) null);
		PageTuple t6 = new PageTuple();
		t0.setDescription("");
		t0.setName("");
		ViewTuple[] var1 = new ViewTuple[] {};
		t0.setColTuples(var1);
		ViewTuple[] var2 = new ViewTuple[] {};
		t0.setRowTuples(var2);
		t1.setColumnCount(0);
		double[] var3 = new double[] {};
		t1.setData(var3);
		t1.setCompressedData("");
		t1.setCompressed(false);
		t0.setPafDataSlice(t1);
		t0.setDataAlias("");
		t0.setManaged(false);
		t0.setPrimaryFormattingAxis(0);
		t0.setReadOnly(false);
		String[] var4 = new String[] { "0" };
		t0.setColAxisDims(var4);
		PageTuple[] var5 = new PageTuple[] { t4, t5, t6 };
		t0.setPageTuples(var5);
		String[] var6 = new String[] {};
		t0.setRowAxisDims(var6);
		t0.setLeftOffset(0);
		t0.setTopOffset(0);
		PafViewHeader[] var7 = new PafViewHeader[] {};
		t0.setPafViewHeaders(var7);
		LockedCell[] var8 = new LockedCell[] {};
		t0.setForwardPlannableLockedCell(var8);
		LockedCell[] var9 = new LockedCell[] {};
		t0.setNotPlannableLockedCells(var9);
		t0.setGenerationFormatName("");
		t0.setColumnWidth(t2);
		t0.setRowHeight(t3);
		t4.setAxis("");
		t4.setMember("");
		// jtest_tested_method
		PafAxis RETVAL = PafViewSectionUtil.getDimensionAxis(t0, "0");
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(1, RETVAL.getValue()); // jtest_unverified
		assertEquals(2, RETVAL.getPageAxis()); // jtest_unverified
		assertEquals(1, RETVAL.getColAxis()); // jtest_unverified
		assertEquals(0, RETVAL.getRowAxis()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDimensionAxis12.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDimensionAxis12(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PageTuple.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxis", argument_types)) {
				return "";
				// at com.palladium.utility.PafViewSectionUtil.getDimensionAxis(PafViewSectionUtil.java:62)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}
	/**
	 * Test for method: static getDimensionAxis(com.palladium.paf.view.PafViewSection,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUtil#getDimensionAxis(com.palladium.paf.view.PafViewSection,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDimensionAxis13() throws Throwable {
		PafViewSection t0 = new PafViewSection();
		PafDataSlice t1 = new PafDataSlice();
		Integer t2 = new Integer(0);
		Integer t3 = new Integer("0");
		PageTuple t4 = new PageTuple((String) null, (String) null);
		t0.setDescription("");
		t0.setName("");
		ViewTuple[] var1 = new ViewTuple[] {};
		t0.setColTuples(var1);
		ViewTuple[] var2 = new ViewTuple[] {};
		t0.setRowTuples(var2);
		t0.setPafDataSlice(t1);
		t0.setDataAlias("");
		t0.setManaged(false);
		t0.setPrimaryFormattingAxis(0);
		t0.setReadOnly(false);
		String[] var3 = new String[] { null };
		t0.setColAxisDims(var3);
		PageTuple[] var4 = new PageTuple[] { t4 };
		t0.setPageTuples(var4);
		String[] var5 = new String[] {};
		t0.setRowAxisDims(var5);
		t0.setLeftOffset(0);
		t0.setTopOffset(0);
		PafViewHeader[] var6 = new PafViewHeader[] {};
		t0.setPafViewHeaders(var6);
		LockedCell[] var7 = new LockedCell[] {};
		t0.setForwardPlannableLockedCell(var7);
		LockedCell[] var8 = new LockedCell[] {};
		t0.setNotPlannableLockedCells(var8);
		t0.setGenerationFormatName("");
		t0.setColumnWidth(t2);
		t0.setRowHeight(t3);
		t4.setAxis("");
		t4.setMember("");
		// jtest_tested_method
		PafAxis RETVAL = PafViewSectionUtil.getDimensionAxis(t0, "0");
		// NullPointerException thrown
		// at com.palladium.utility.PafViewSectionUtil.getDimensionAxis(PafViewSectionUtil.java:78)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDimensionAxis13.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDimensionAxis13(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PageTuple.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxis", argument_types)) {
				return "";
				// at com.palladium.utility.PafViewSectionUtil.getDimensionAxis(PafViewSectionUtil.java:62)
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
	 * Usage: java com.palladium.utility.PafViewSectionUtilTest
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
			PafViewSectionUtilTest.class,
			// fully qualified name of the tested class
			"com.palladium.utility.PafViewSectionUtil",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafViewSectionUtil.class;
	}

			}

// JTEST_CURRENT_ID=1655517779.