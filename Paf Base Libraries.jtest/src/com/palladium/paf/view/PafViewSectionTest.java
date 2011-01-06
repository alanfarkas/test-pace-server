/*
 * PafViewSectionTest.java
 * Created by Jtest on 9/19/06 5:56:39 PM.
 * Updated by Jtest on 10/18/06 7:31:49 PM, 4 test cases added, 3 test cases removed.
 * Updated by Jtest on 11/9/06 3:26:21 AM, 3 test cases added, 3 test cases removed.
 */

package com.palladium.paf.view;

import jtest.Stubs;
import java.lang.reflect.Member;
import com.palladium.paf.data.PafDataSlice;
import com.palladium.paf.view.PafViewSection;

/**
 * PafViewSectionTest is a unit test class for class PafViewSection.
 * @see com.palladium.paf.view.PafViewSection
 * @author Parasoft Jtest 8.0
 */
public class PafViewSectionTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafViewSectionTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: clone()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#clone()
	 * @author Parasoft Jtest 8.0
	 */
	public void testClone1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		// jtest_tested_method
		Object RETVAL = THIS.clone();
		assertTrue(RETVAL instanceof PafViewSection); // jtest_unverified
		assertEquals(
			"Name: null\nDesc: null\nread only: false\nPFA: 0\nHeaders: null\nPage Tuples:\nColumn Tuples:\nRow Tuples:",
			RETVAL.toString()); // jtest_unverified
		assertEquals(
			"Name: null\nDesc: null\nread only: false\nPFA: 0\nHeaders: null\nPage Tuples:\nColumn Tuples:\nRow Tuples:",
			THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getAxis(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#getAxis(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAxis2() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		PafDataSlice t1 = new PafDataSlice();
		Integer t2 = new Integer(0);
		Integer t3 = new Integer("0");
		THIS.setDescription("");
		THIS.setName("");
		ViewTuple[] var1 = new ViewTuple[] {};
		THIS.setColTuples(var1);
		ViewTuple[] var2 = new ViewTuple[] {};
		THIS.setRowTuples(var2);
		THIS.setPafDataSlice(t1);
		THIS.setDataAlias("");
		THIS.setManaged(false);
		THIS.setPrimaryFormattingAxis(0);
		THIS.setReadOnly(false);
		String[] var3 = new String[] {};
		THIS.setColAxisDims(var3);
		PageTuple[] var4 = new PageTuple[] {};
		THIS.setPageTuples(var4);
		String[] var5 = new String[] {};
		THIS.setRowAxisDims(var5);
		THIS.setLeftOffset(0);
		THIS.setTopOffset(0);
		PafViewHeader[] var6 = new PafViewHeader[] {};
		THIS.setPafViewHeaders(var6);
		LockedCell[] var7 = new LockedCell[] {};
		THIS.setForwardPlannableLockedCell(var7);
		LockedCell[] var8 = new LockedCell[] {};
		THIS.setNotPlannableLockedCells(var8);
		THIS.setGenerationFormatName("");
		THIS.setColumnWidth(t2);
		THIS.setRowHeight(t3);
		// jtest_tested_method
		PafAxis RETVAL = THIS.getAxis((String) null);
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getAxis(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#getAxis(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAxis5() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		PafDataSlice t1 = new PafDataSlice();
		Integer t2 = new Integer(0);
		Integer t3 = new Integer("0");
		PageTuple t4 = new PageTuple((String) null, (String) null);
		THIS.setDescription("");
		THIS.setName("");
		ViewTuple[] var1 = new ViewTuple[] {};
		THIS.setColTuples(var1);
		ViewTuple[] var2 = new ViewTuple[] {};
		THIS.setRowTuples(var2);
		t1.setColumnCount(0);
		double[] var3 = new double[] {};
		t1.setData(var3);
		t1.setCompressedData("");
		t1.setCompressed(false);
		THIS.setPafDataSlice(t1);
		THIS.setDataAlias("");
		THIS.setManaged(false);
		THIS.setPrimaryFormattingAxis(0);
		THIS.setReadOnly(false);
		String[] var4 = new String[] {};
		THIS.setColAxisDims(var4);
		PageTuple[] var5 = new PageTuple[] { t4 };
		THIS.setPageTuples(var5);
		String[] var6 = new String[] {};
		THIS.setRowAxisDims(var6);
		THIS.setLeftOffset(0);
		THIS.setTopOffset(0);
		PafViewHeader[] var7 = new PafViewHeader[] {};
		THIS.setPafViewHeaders(var7);
		LockedCell[] var8 = new LockedCell[] {};
		THIS.setForwardPlannableLockedCell(var8);
		LockedCell[] var9 = new LockedCell[] {};
		THIS.setNotPlannableLockedCells(var9);
		THIS.setGenerationFormatName("");
		THIS.setColumnWidth(t2);
		THIS.setRowHeight(t3);
		// jtest_tested_method
		PafAxis RETVAL = THIS.getAxis((String) null);
		// NullPointerException thrown
		// at com.palladium.paf.view.PafViewSection.getAxis(PafViewSection.java:205)
		// jtest_unverified
	}

	/**
	 * Test for method: getAxis(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#getAxis(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAxis7() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		PafDataSlice t1 = new PafDataSlice();
		Integer t2 = new Integer(0);
		Integer t3 = new Integer("0");
		PageTuple t4 = new PageTuple();
		THIS.setDescription("");
		THIS.setName("");
		ViewTuple[] var1 = new ViewTuple[] {};
		THIS.setColTuples(var1);
		ViewTuple[] var2 = new ViewTuple[] {};
		THIS.setRowTuples(var2);
		t1.setColumnCount(0);
		double[] var3 = new double[] {};
		t1.setData(var3);
		t1.setCompressedData("");
		t1.setCompressed(false);
		THIS.setPafDataSlice(t1);
		THIS.setDataAlias("");
		THIS.setManaged(false);
		THIS.setPrimaryFormattingAxis(0);
		THIS.setReadOnly(false);
		String[] var4 = new String[] { null };
		THIS.setColAxisDims(var4);
		PageTuple[] var5 = new PageTuple[] { t4 };
		THIS.setPageTuples(var5);
		String[] var6 = new String[] {};
		THIS.setRowAxisDims(var6);
		THIS.setLeftOffset(0);
		THIS.setTopOffset(0);
		PafViewHeader[] var7 = new PafViewHeader[] {};
		THIS.setPafViewHeaders(var7);
		LockedCell[] var8 = new LockedCell[] {};
		THIS.setForwardPlannableLockedCell(var8);
		LockedCell[] var9 = new LockedCell[] {};
		THIS.setNotPlannableLockedCells(var9);
		THIS.setGenerationFormatName("");
		THIS.setColumnWidth(t2);
		THIS.setRowHeight(t3);
		// jtest_tested_method
		PafAxis RETVAL = THIS.getAxis("0");
		// NullPointerException thrown
		// at com.palladium.paf.view.PafViewSection.getAxis(PafViewSection.java:214)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetAxis7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetAxis7(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PageTuple.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxis", argument_types)) {
				return "";
				// at com.palladium.paf.view.PafViewSection.getAxis(PafViewSection.java:205)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getAxis(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#getAxis(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAxis8() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		PafDataSlice t1 = new PafDataSlice();
		Integer t2 = new Integer(0);
		Integer t3 = new Integer("0");
		PageTuple t4 = new PageTuple((String) null, (String) null);
		THIS.setDescription("");
		THIS.setName("");
		ViewTuple[] var1 = new ViewTuple[] {};
		THIS.setColTuples(var1);
		ViewTuple[] var2 = new ViewTuple[] {};
		THIS.setRowTuples(var2);
		THIS.setPafDataSlice(t1);
		THIS.setDataAlias("");
		THIS.setManaged(false);
		THIS.setPrimaryFormattingAxis(0);
		THIS.setReadOnly(false);
		String[] var3 = new String[] {};
		THIS.setColAxisDims(var3);
		PageTuple[] var4 = new PageTuple[] { t4 };
		THIS.setPageTuples(var4);
		String[] var5 = new String[] {};
		THIS.setRowAxisDims(var5);
		THIS.setLeftOffset(0);
		THIS.setTopOffset(0);
		PafViewHeader[] var6 = new PafViewHeader[] {};
		THIS.setPafViewHeaders(var6);
		LockedCell[] var7 = new LockedCell[] {};
		THIS.setForwardPlannableLockedCell(var7);
		LockedCell[] var8 = new LockedCell[] {};
		THIS.setNotPlannableLockedCells(var8);
		THIS.setGenerationFormatName("");
		THIS.setColumnWidth(t2);
		THIS.setRowHeight(t3);
		t4.setAxis("");
		t4.setMember("");
		// jtest_tested_method
		PafAxis RETVAL = THIS.getAxis("");
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(2, RETVAL.getValue()); // jtest_unverified
		assertEquals(2, RETVAL.getPageAxis()); // jtest_unverified
		assertEquals(1, RETVAL.getColAxis()); // jtest_unverified
		assertEquals(0, RETVAL.getRowAxis()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetAxis8.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetAxis8(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PageTuple.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxis", argument_types)) {
				return "";
				// at com.palladium.paf.view.PafViewSection.getAxis(PafViewSection.java:205)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getAxis(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#getAxis(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAxis11() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		PafDataSlice t1 = new PafDataSlice();
		Integer t2 = new Integer(0);
		Integer t3 = new Integer("0");
		PageTuple t4 = new PageTuple((String) null, (String) null);
		PageTuple t5 = new PageTuple((String) null, (String) null);
		PageTuple t6 = new PageTuple((String) null, (String) null);
		THIS.setDescription("");
		THIS.setName("");
		ViewTuple[] var1 = new ViewTuple[] {};
		THIS.setColTuples(var1);
		ViewTuple[] var2 = new ViewTuple[] {};
		THIS.setRowTuples(var2);
		THIS.setPafDataSlice(t1);
		THIS.setDataAlias("");
		THIS.setManaged(false);
		THIS.setPrimaryFormattingAxis(0);
		THIS.setReadOnly(false);
		String[] var3 = new String[] { "0" };
		THIS.setColAxisDims(var3);
		PageTuple[] var4 = new PageTuple[] { t4, t5, t6 };
		THIS.setPageTuples(var4);
		String[] var5 = new String[] {};
		THIS.setRowAxisDims(var5);
		THIS.setLeftOffset(0);
		THIS.setTopOffset(0);
		PafViewHeader[] var6 = new PafViewHeader[] {};
		THIS.setPafViewHeaders(var6);
		LockedCell[] var7 = new LockedCell[] {};
		THIS.setForwardPlannableLockedCell(var7);
		LockedCell[] var8 = new LockedCell[] {};
		THIS.setNotPlannableLockedCells(var8);
		THIS.setGenerationFormatName("");
		THIS.setColumnWidth(t2);
		THIS.setRowHeight(t3);
		t4.setAxis("");
		t4.setMember("");
		t5.setAxis("");
		t5.setMember("");
		// jtest_tested_method
		PafAxis RETVAL = THIS.getAxis("0");
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(1, RETVAL.getValue()); // jtest_unverified
		assertEquals(2, RETVAL.getPageAxis()); // jtest_unverified
		assertEquals(1, RETVAL.getColAxis()); // jtest_unverified
		assertEquals(0, RETVAL.getRowAxis()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetAxis11.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetAxis11(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PageTuple.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxis", argument_types)) {
				return "";
				// at com.palladium.paf.view.PafViewSection.getAxis(PafViewSection.java:205)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getAxis(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#getAxis(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAxis12() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		PafDataSlice t1 = new PafDataSlice();
		Integer t2 = new Integer(0);
		Integer t3 = new Integer("0");
		PageTuple t4 = new PageTuple((String) null, (String) null);
		PageTuple t5 = new PageTuple();
		THIS.setDescription("");
		THIS.setName("");
		ViewTuple[] var1 = new ViewTuple[] {};
		THIS.setColTuples(var1);
		ViewTuple[] var2 = new ViewTuple[] {};
		THIS.setRowTuples(var2);
		THIS.setPafDataSlice(t1);
		THIS.setDataAlias("");
		THIS.setManaged(false);
		THIS.setPrimaryFormattingAxis(0);
		THIS.setReadOnly(false);
		String[] var3 = new String[] { "" };
		THIS.setColAxisDims(var3);
		PageTuple[] var4 = new PageTuple[] { t4, t5 };
		THIS.setPageTuples(var4);
		String[] var5 = new String[] { null };
		THIS.setRowAxisDims(var5);
		THIS.setLeftOffset(0);
		THIS.setTopOffset(0);
		PafViewHeader[] var6 = new PafViewHeader[] {};
		THIS.setPafViewHeaders(var6);
		LockedCell[] var7 = new LockedCell[] {};
		THIS.setForwardPlannableLockedCell(var7);
		LockedCell[] var8 = new LockedCell[] {};
		THIS.setNotPlannableLockedCells(var8);
		THIS.setGenerationFormatName("");
		THIS.setColumnWidth(t2);
		THIS.setRowHeight(t3);
		t4.setAxis("");
		t4.setMember("");
		t5.setAxis("");
		t5.setMember("");
		// jtest_tested_method
		PafAxis RETVAL = THIS.getAxis("0");
		// NullPointerException thrown
		// at com.palladium.paf.view.PafViewSection.getAxis(PafViewSection.java:223)
		// jtest_unverified
	}

	/**
	 * Test for method: getColAxisDims()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#getColAxisDims()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetColAxisDims1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		// jtest_tested_method
		String[] RETVAL = THIS.getColAxisDims();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getColTuples()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#getColTuples()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetColTuples1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		// jtest_tested_method
		ViewTuple[] RETVAL = THIS.getColTuples();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getColumnWidth()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#getColumnWidth()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetColumnWidth1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		// jtest_tested_method
		Integer RETVAL = THIS.getColumnWidth();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDataAlias()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#getDataAlias()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataAlias1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		// jtest_tested_method
		String RETVAL = THIS.getDataAlias();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDescription()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#getDescription()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDescription1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		// jtest_tested_method
		String RETVAL = THIS.getDescription();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDescription()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#getDescription()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDescription2() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		PafDataSlice t1 = new PafDataSlice((double[]) null, 0);
		Integer t2 = new Integer(0);
		Integer t3 = new Integer("0");
		THIS.setDescription("");
		THIS.setName("");
		ViewTuple[] var1 = new ViewTuple[] {};
		THIS.setColTuples(var1);
		ViewTuple[] var2 = new ViewTuple[] {};
		THIS.setRowTuples(var2);
		THIS.setPafDataSlice(t1);
		THIS.setDataAlias("");
		THIS.setManaged(false);
		THIS.setPrimaryFormattingAxis(0);
		THIS.setReadOnly(false);
		String[] var3 = new String[] {};
		THIS.setColAxisDims(var3);
		PageTuple[] var4 = new PageTuple[] {};
		THIS.setPageTuples(var4);
		String[] var5 = new String[] {};
		THIS.setRowAxisDims(var5);
		THIS.setLeftOffset(0);
		THIS.setTopOffset(0);
		PafViewHeader[] var6 = new PafViewHeader[] {};
		THIS.setPafViewHeaders(var6);
		LockedCell[] var7 = new LockedCell[] {};
		THIS.setForwardPlannableLockedCell(var7);
		LockedCell[] var8 = new LockedCell[] {};
		THIS.setNotPlannableLockedCells(var8);
		THIS.setGenerationFormatName("");
		THIS.setColumnWidth(t2);
		THIS.setRowHeight(t3);
		// jtest_tested_method
		String RETVAL = THIS.getDescription();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getForwardPlannableLockedCell()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#getForwardPlannableLockedCell()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetForwardPlannableLockedCell1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		// jtest_tested_method
		LockedCell[] RETVAL = THIS.getForwardPlannableLockedCell();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getGenerationFormatName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#getGenerationFormatName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetGenerationFormatName1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		// jtest_tested_method
		String RETVAL = THIS.getGenerationFormatName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getLeftOffset()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#getLeftOffset()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLeftOffset1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		// jtest_tested_method
		int RETVAL = THIS.getLeftOffset();
		assertEquals(0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#getName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetName1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		// jtest_tested_method
		String RETVAL = THIS.getName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getNotPlannableLockedCells()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#getNotPlannableLockedCells()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetNotPlannableLockedCells1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		// jtest_tested_method
		LockedCell[] RETVAL = THIS.getNotPlannableLockedCells();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPafDataSlice()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#getPafDataSlice()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPafDataSlice1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		// jtest_tested_method
		PafDataSlice RETVAL = THIS.getPafDataSlice();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPafViewHeaders()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#getPafViewHeaders()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPafViewHeaders1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		// jtest_tested_method
		PafViewHeader[] RETVAL = THIS.getPafViewHeaders();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPageTuples()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#getPageTuples()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPageTuples1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		// jtest_tested_method
		PageTuple[] RETVAL = THIS.getPageTuples();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPrimaryFormattingAxis()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#getPrimaryFormattingAxis()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPrimaryFormattingAxis1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		// jtest_tested_method
		int RETVAL = THIS.getPrimaryFormattingAxis();
		assertEquals(0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getRowAxisDims()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#getRowAxisDims()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRowAxisDims1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		// jtest_tested_method
		String[] RETVAL = THIS.getRowAxisDims();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getRowHeight()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#getRowHeight()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRowHeight1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		// jtest_tested_method
		Integer RETVAL = THIS.getRowHeight();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getRowTuples()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#getRowTuples()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRowTuples1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		// jtest_tested_method
		ViewTuple[] RETVAL = THIS.getRowTuples();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getTopOffset()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#getTopOffset()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetTopOffset1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		// jtest_tested_method
		int RETVAL = THIS.getTopOffset();
		assertEquals(0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isManaged()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#isManaged()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsManaged1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		// jtest_tested_method
		boolean RETVAL = THIS.isManaged();
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isReadOnly()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#isReadOnly()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsReadOnly1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		// jtest_tested_method
		boolean RETVAL = THIS.isReadOnly();
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafViewSection()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#PafViewSection()
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafViewSection1() throws Throwable {
		// jtest_tested_method
		PafViewSection THIS = new PafViewSection();
		assertEquals(
			"Name: null\nDesc: null\nread only: false\nPFA: 0\nHeaders: null\nPage Tuples:\nColumn Tuples:\nRow Tuples:",
			THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setColAxisDims(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#setColAxisDims(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetColAxisDims1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		String[] var1 = new String[] {};
		// jtest_tested_method
		THIS.setColAxisDims(var1);
		assertSame(var1, THIS.getColAxisDims()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setColTuples(com.palladium.paf.view.ViewTuple[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#setColTuples(com.palladium.paf.view.ViewTuple[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetColTuples1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		ViewTuple[] var1 = new ViewTuple[] {};
		// jtest_tested_method
		THIS.setColTuples(var1);
		assertSame(var1, THIS.getColTuples()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setColumnWidth(java.lang.Integer)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#setColumnWidth(java.lang.Integer)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetColumnWidth1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		Integer t1 = new Integer(7);
		// jtest_tested_method
		THIS.setColumnWidth(t1);
		assertEquals(t1, THIS.getColumnWidth()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setDataAlias(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#setDataAlias(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDataAlias1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		// jtest_tested_method
		THIS.setDataAlias("");
		assertEquals("", THIS.getDataAlias()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setDescription(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#setDescription(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDescription1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		// jtest_tested_method
		THIS.setDescription("");
		assertEquals("", THIS.getDescription()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setForwardPlannableLockedCell(com.palladium.paf.view.LockedCell[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#setForwardPlannableLockedCell(com.palladium.paf.view.LockedCell[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetForwardPlannableLockedCell1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		LockedCell[] var1 = new LockedCell[] {};
		// jtest_tested_method
		THIS.setForwardPlannableLockedCell(var1);
		assertSame(var1, THIS.getForwardPlannableLockedCell()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setGenerationFormatName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#setGenerationFormatName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetGenerationFormatName1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		// jtest_tested_method
		THIS.setGenerationFormatName("");
		assertEquals("", THIS.getGenerationFormatName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setLeftOffset(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#setLeftOffset(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetLeftOffset1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		// jtest_tested_method
		THIS.setLeftOffset(7);
		assertEquals(7, THIS.getLeftOffset()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setManaged(boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#setManaged(boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetManaged1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		// jtest_tested_method
		THIS.setManaged(true);
		assertEquals(true, THIS.isManaged()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#setName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetName1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		// jtest_tested_method
		THIS.setName("");
		assertEquals("", THIS.getName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setNotPlannableLockedCells(com.palladium.paf.view.LockedCell[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#setNotPlannableLockedCells(com.palladium.paf.view.LockedCell[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetNotPlannableLockedCells1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		LockedCell[] var1 = new LockedCell[] {};
		// jtest_tested_method
		THIS.setNotPlannableLockedCells(var1);
		assertSame(var1, THIS.getNotPlannableLockedCells()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setPafDataSlice(com.palladium.paf.data.PafDataSlice)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#setPafDataSlice(com.palladium.paf.data.PafDataSlice)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetPafDataSlice1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		PafDataSlice t1 = new PafDataSlice();
		t1.setColumnCount(7);
		double[] var1 = new double[] {};
		t1.setData(var1);
		t1.setCompressedData("");
		t1.setCompressed(true);
		// jtest_tested_method
		THIS.setPafDataSlice(t1);
		assertEquals(t1, THIS.getPafDataSlice()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setPafViewHeaders(com.palladium.paf.view.PafViewHeader[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#setPafViewHeaders(com.palladium.paf.view.PafViewHeader[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetPafViewHeaders1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		PafViewHeader[] var1 = new PafViewHeader[] {};
		// jtest_tested_method
		THIS.setPafViewHeaders(var1);
		assertSame(var1, THIS.getPafViewHeaders()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setPageTuples(com.palladium.paf.view.PageTuple[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#setPageTuples(com.palladium.paf.view.PageTuple[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetPageTuples1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		PageTuple[] var1 = new PageTuple[] {};
		// jtest_tested_method
		THIS.setPageTuples(var1);
		assertSame(var1, THIS.getPageTuples()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setPrimaryFormattingAxis(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#setPrimaryFormattingAxis(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetPrimaryFormattingAxis1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		// jtest_tested_method
		THIS.setPrimaryFormattingAxis(7);
		assertEquals(7, THIS.getPrimaryFormattingAxis()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setReadOnly(boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#setReadOnly(boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetReadOnly1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		// jtest_tested_method
		THIS.setReadOnly(true);
		assertEquals(true, THIS.isReadOnly()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setRowAxisDims(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#setRowAxisDims(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetRowAxisDims1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		String[] var1 = new String[] {};
		// jtest_tested_method
		THIS.setRowAxisDims(var1);
		assertSame(var1, THIS.getRowAxisDims()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setRowHeight(java.lang.Integer)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#setRowHeight(java.lang.Integer)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetRowHeight1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		Integer t1 = new Integer(7);
		// jtest_tested_method
		THIS.setRowHeight(t1);
		assertEquals(t1, THIS.getRowHeight()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setRowTuples(com.palladium.paf.view.ViewTuple[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#setRowTuples(com.palladium.paf.view.ViewTuple[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetRowTuples1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		ViewTuple[] var1 = new ViewTuple[] {};
		// jtest_tested_method
		THIS.setRowTuples(var1);
		assertSame(var1, THIS.getRowTuples()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setTopOffset(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#setTopOffset(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetTopOffset1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		// jtest_tested_method
		THIS.setTopOffset(7);
		assertEquals(7, THIS.getTopOffset()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: toString()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#toString()
	 * @author Parasoft Jtest 8.0
	 */
	public void testToString1() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		// jtest_tested_method
		String RETVAL = THIS.toString();
		assertEquals(
			"Name: null\nDesc: null\nread only: false\nPFA: 0\nHeaders: null\nPage Tuples:\nColumn Tuples:\nRow Tuples:",
			RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: toString()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSection#toString()
	 * @author Parasoft Jtest 8.0
	 */
	public void testToString3() throws Throwable {
		PafViewSection THIS = new PafViewSection();
		PafDataSlice t1 = new PafDataSlice();
		Integer t2 = new Integer(0);
		Integer t3 = new Integer("0");
		THIS.setDescription("");
		THIS.setName("");
		ViewTuple[] var1 = new ViewTuple[] { null };
		THIS.setColTuples(var1);
		ViewTuple[] var2 = new ViewTuple[] { null };
		THIS.setRowTuples(var2);
		THIS.setPafDataSlice(t1);
		THIS.setDataAlias("");
		THIS.setManaged(false);
		THIS.setPrimaryFormattingAxis(0);
		THIS.setReadOnly(false);
		String[] var3 = new String[] {};
		THIS.setColAxisDims(var3);
		PageTuple[] var4 = new PageTuple[] { null };
		THIS.setPageTuples(var4);
		String[] var5 = new String[] {};
		THIS.setRowAxisDims(var5);
		THIS.setLeftOffset(0);
		THIS.setTopOffset(0);
		PafViewHeader[] var6 = new PafViewHeader[] {};
		THIS.setPafViewHeaders(var6);
		LockedCell[] var7 = new LockedCell[] {};
		THIS.setForwardPlannableLockedCell(var7);
		LockedCell[] var8 = new LockedCell[] {};
		THIS.setNotPlannableLockedCells(var8);
		THIS.setGenerationFormatName("");
		THIS.setColumnWidth(t2);
		THIS.setRowHeight(t3);
		// jtest_tested_method
		String RETVAL = THIS.toString();
		assertEquals(
			"Name: \nDesc: \nread only: false\nPFA: 0\nHeaders: [Lcom.palladium.paf.view.PafViewHeader;@129b0e1\nPage Tuples:\n\tnull\nColumn Tuples:\n\tnull\nRow Tuples:\n\tnull",
			RETVAL); // jtest_unverified
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
	 * Usage: java com.palladium.paf.view.PafViewSectionTest
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
			PafViewSectionTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.view.PafViewSection",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafViewSection.class;
	}

			}

// JTEST_CURRENT_ID=-920240186.