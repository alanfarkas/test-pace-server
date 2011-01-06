/*
 * PafViewSectionUITest.java
 * Created by Jtest on 9/19/06 5:29:15 PM.
 * Updated by Jtest on 10/18/06 7:15:40 PM, 27 test cases added, 27 test cases removed.
 * Updated by Jtest on 11/9/06 2:47:04 AM, 27 test cases added, 27 test cases removed.
 */

package com.palladium.paf.ui;

import java.util.List;
import java.util.ArrayList;
import jtest.Stubs;
import java.lang.reflect.Member;
import com.palladium.paf.view.LockedCell;
import com.palladium.paf.view.PageTuple;
import com.palladium.paf.view.ViewTuple;
import com.palladium.paf.data.PafDataSlice;
import com.palladium.paf.view.PafViewHeader;
import com.palladium.paf.view.PafViewSection;
import com.palladium.paf.ui.PafViewSectionUI;

/**
 * PafViewSectionUITest is a unit test class for class PafViewSectionUI.
 * @see com.palladium.paf.ui.PafViewSectionUI
 * @author Parasoft Jtest 8.0
 */
public class PafViewSectionUITest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafViewSectionUITest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: addHeader(com.palladium.paf.view.PafViewHeader)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#addHeader(com.palladium.paf.view.PafViewHeader)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddHeader1() throws Throwable {
		PafViewSection t1 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t1);
		// jtest_tested_method
		THIS.addHeader((PafViewHeader) null);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: convertArToCommaDelimitedStr(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#convertArToCommaDelimitedStr(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testConvertArToCommaDelimitedStr2() throws Throwable {
		PafViewSectionUI THIS = new PafViewSectionUI((PafViewSection) null);
		String[] var1 = new String[] {};
		// jtest_tested_method
		String RETVAL = THIS.convertArToCommaDelimitedStr(var1);
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: convertArToCommaDelimitedStr(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#convertArToCommaDelimitedStr(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testConvertArToCommaDelimitedStr3() throws Throwable {
		PafViewSectionUI THIS = new PafViewSectionUI((PafViewSection) null);
		String[] var1 = new String[] { null };
		// jtest_tested_method
		String RETVAL = THIS.convertArToCommaDelimitedStr(var1);
		assertEquals(null, var1[0]); // jtest_unverified
		assertEquals("null ", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: convertArToCommaDelimitedStr(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#convertArToCommaDelimitedStr(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testConvertArToCommaDelimitedStr4() throws Throwable {
		PafViewSection t0 = new PafViewSection();
		PafDataSlice t1 = new PafDataSlice();
		Integer t2 = new Integer(7);
		Integer t3 = new Integer("0");
		PafViewSectionUI THIS = new PafViewSectionUI(t0);
		t0.setDescription("");
		t0.setName("");
		ViewTuple[] var1 = new ViewTuple[] {};
		t0.setColTuples(var1);
		ViewTuple[] var2 = new ViewTuple[] {};
		t0.setRowTuples(var2);
		t0.setPafDataSlice(t1);
		t0.setDataAlias("");
		t0.setManaged(true);
		t0.setPrimaryFormattingAxis(7);
		t0.setReadOnly(true);
		String[] var3 = new String[] {};
		t0.setColAxisDims(var3);
		PageTuple[] var4 = new PageTuple[] {};
		t0.setPageTuples(var4);
		String[] var5 = new String[] {};
		t0.setRowAxisDims(var5);
		t0.setLeftOffset(7);
		t0.setTopOffset(7);
		PafViewHeader[] var6 = new PafViewHeader[] {};
		t0.setPafViewHeaders(var6);
		LockedCell[] var7 = new LockedCell[] {};
		t0.setForwardPlannableLockedCell(var7);
		LockedCell[] var8 = new LockedCell[] {};
		t0.setNotPlannableLockedCells(var8);
		t0.setGenerationFormatName("");
		t0.setColumnWidth(t2);
		t0.setRowHeight(t3);
		String[] var9 = new String[] { null, null, null, null, null };
		// jtest_tested_method
		String RETVAL = THIS.convertArToCommaDelimitedStr(var9);
		assertEquals(null, var9[0]); // jtest_unverified
		assertEquals(null, var9[1]); // jtest_unverified
		assertEquals(null, var9[2]); // jtest_unverified
		assertEquals(null, var9[4]); // jtest_unverified
		assertEquals("null, null, null, null, null ", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: deleteHeader(com.palladium.paf.view.PafViewHeader)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#deleteHeader(com.palladium.paf.view.PafViewHeader)
	 * @author Parasoft Jtest 8.0
	 */
	public void testDeleteHeader1() throws Throwable {
		PafViewSection t1 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t1);
		// jtest_tested_method
		THIS.deleteHeader((PafViewHeader) null);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: deleteHeader(com.palladium.paf.view.PafViewHeader)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#deleteHeader(com.palladium.paf.view.PafViewHeader)
	 * @author Parasoft Jtest 8.0
	 */
	public void testDeleteHeader3() throws Throwable {
		PafViewSectionUI THIS = new PafViewSectionUI((PafViewSection) null);
		PafViewSection t1 = new PafViewSection();
		PafDataSlice t2 = new PafDataSlice((double[]) null, 0);
		Integer t3 = new Integer("0");
		Integer t4 = new Integer(0);
		t1.setDescription("");
		t1.setName("");
		ViewTuple[] var1 = new ViewTuple[] {};
		t1.setColTuples(var1);
		ViewTuple[] var2 = new ViewTuple[] {};
		t1.setRowTuples(var2);
		t1.setPafDataSlice(t2);
		t1.setDataAlias("");
		t1.setManaged(false);
		t1.setPrimaryFormattingAxis(0);
		t1.setReadOnly(false);
		String[] var3 = new String[] {};
		t1.setColAxisDims(var3);
		PageTuple[] var4 = new PageTuple[] {};
		t1.setPageTuples(var4);
		String[] var5 = new String[] {};
		t1.setRowAxisDims(var5);
		t1.setLeftOffset(0);
		t1.setTopOffset(0);
		PafViewHeader[] var6 = new PafViewHeader[] {};
		t1.setPafViewHeaders(var6);
		LockedCell[] var7 = new LockedCell[] {};
		t1.setForwardPlannableLockedCell(var7);
		LockedCell[] var8 = new LockedCell[] {};
		t1.setNotPlannableLockedCells(var8);
		t1.setGenerationFormatName("");
		t1.setColumnWidth(t3);
		t1.setRowHeight(t4);
		THIS.setPafViewSection(t1);
		// jtest_tested_method
		THIS.deleteHeader((PafViewHeader) null);
		// ClassCastException thrown
		// at com.palladium.paf.ui.PafViewSectionUI.setViewSectionHeaders(PafViewSectionUI.java:69)
		// at com.palladium.paf.ui.PafViewSectionUI.deleteHeader(PafViewSectionUI.java:51)
		// jtest_unverified
	}

	/**
	 * Stubs method for testDeleteHeader3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsDeleteHeader3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ArrayList.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "contains", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.ui.PafViewSectionUI.deleteHeader(PafViewSectionUI.java:47)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "remove", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.ui.PafViewSectionUI.deleteHeader(PafViewSectionUI.java:48)
			}
			argument_types = new Class[] { Object[].class };
			if (Stubs.matches(method, "toArray", argument_types)) {
				return new Object[0];
				// at com.palladium.paf.ui.PafViewSectionUI.setViewSectionHeaders(PafViewSectionUI.java:69)
				// at com.palladium.paf.ui.PafViewSectionUI.deleteHeader(PafViewSectionUI.java:51)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getColAxisDims()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#getColAxisDims()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetColAxisDims1() throws Throwable {
		PafViewSectionUI THIS = new PafViewSectionUI((PafViewSection) null);
		// jtest_tested_method
		String[] RETVAL = THIS.getColAxisDims();
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.ui.PafViewSectionUI.<init>(Lcom/palladium/paf/view/PafViewSection;)V>
		// at com.palladium.paf.ui.PafViewSectionUI.getColAxisDims(PafViewSectionUI.java:115)
		// jtest_unverified
	}

	/**
	 * Test for method: getColAxisDims()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#getColAxisDims()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetColAxisDims2() throws Throwable {
		PafViewSection t1 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t1);
		// jtest_tested_method
		String[] RETVAL = THIS.getColAxisDims();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDataAlias()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#getDataAlias()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataAlias1() throws Throwable {
		PafViewSectionUI THIS = new PafViewSectionUI((PafViewSection) null);
		// jtest_tested_method
		String RETVAL = THIS.getDataAlias();
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.ui.PafViewSectionUI.<init>(Lcom/palladium/paf/view/PafViewSection;)V>
		// at com.palladium.paf.ui.PafViewSectionUI.getDataAlias(PafViewSectionUI.java:139)
		// jtest_unverified
	}

	/**
	 * Test for method: getDataAlias()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#getDataAlias()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataAlias2() throws Throwable {
		PafViewSection t1 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t1);
		// jtest_tested_method
		String RETVAL = THIS.getDataAlias();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDescription()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#getDescription()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDescription1() throws Throwable {
		PafViewSectionUI THIS = new PafViewSectionUI((PafViewSection) null);
		// jtest_tested_method
		String RETVAL = THIS.getDescription();
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.ui.PafViewSectionUI.<init>(Lcom/palladium/paf/view/PafViewSection;)V>
		// at com.palladium.paf.ui.PafViewSectionUI.getDescription(PafViewSectionUI.java:147)
		// jtest_unverified
	}

	/**
	 * Test for method: getDescription()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#getDescription()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDescription2() throws Throwable {
		PafViewSection t1 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t1);
		// jtest_tested_method
		String RETVAL = THIS.getDescription();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getGenerationFormatName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#getGenerationFormatName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetGenerationFormatName1() throws Throwable {
		PafViewSectionUI THIS = new PafViewSectionUI((PafViewSection) null);
		// jtest_tested_method
		String RETVAL = THIS.getGenerationFormatName();
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.ui.PafViewSectionUI.<init>(Lcom/palladium/paf/view/PafViewSection;)V>
		// at com.palladium.paf.ui.PafViewSectionUI.getGenerationFormatName(PafViewSectionUI.java:216)
		// jtest_unverified
	}

	/**
	 * Test for method: getGenerationFormatName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#getGenerationFormatName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetGenerationFormatName2() throws Throwable {
		PafViewSection t1 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t1);
		// jtest_tested_method
		String RETVAL = THIS.getGenerationFormatName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getHeader(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#getHeader(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetHeader1() throws Throwable {
		PafViewSection t1 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t1);
		// jtest_tested_method
		PafViewHeader RETVAL = THIS.getHeader(0);
		// IndexOutOfBoundsException thrown
		// at java.util.ArrayList.RangeCheck(ArrayList.java:547)
		// at java.util.ArrayList.get(ArrayList.java:322)
		// at com.palladium.paf.ui.PafViewSectionUI.getHeader(PafViewSectionUI.java:80)
		// jtest_unverified
	}

	/**
	 * Test for method: getHeader(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#getHeader(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetHeader2() throws Throwable {
		PafViewSection t1 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t1);
		// jtest_tested_method
		PafViewHeader RETVAL = THIS.getHeader(-1);

		// ArrayIndexOutOfBoundsException thrown
		// at java.util.ArrayList.get(ArrayList.java:324)
		// at com.palladium.paf.ui.PafViewSectionUI.getHeader(PafViewSectionUI.java:80)
		// jtest_unverified
	}

	/**
	 * Test for method: getHeader(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#getHeader(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetHeader3() throws Throwable {
		PafViewSectionUI THIS = new PafViewSectionUI((PafViewSection) null);
		PafViewSection t1 = new PafViewSection();
		PafDataSlice t2 = new PafDataSlice((double[]) null, 0);
		Integer t3 = new Integer("0");
		Integer t4 = new Integer(0);
		t1.setDescription("");
		t1.setName("");
		ViewTuple[] var1 = new ViewTuple[] {};
		t1.setColTuples(var1);
		ViewTuple[] var2 = new ViewTuple[] {};
		t1.setRowTuples(var2);
		t1.setPafDataSlice(t2);
		t1.setDataAlias("");
		t1.setManaged(false);
		t1.setPrimaryFormattingAxis(0);
		t1.setReadOnly(false);
		String[] var3 = new String[] {};
		t1.setColAxisDims(var3);
		PageTuple[] var4 = new PageTuple[] {};
		t1.setPageTuples(var4);
		String[] var5 = new String[] {};
		t1.setRowAxisDims(var5);
		t1.setLeftOffset(0);
		t1.setTopOffset(0);
		PafViewHeader[] var6 = new PafViewHeader[] {};
		t1.setPafViewHeaders(var6);
		LockedCell[] var7 = new LockedCell[] {};
		t1.setForwardPlannableLockedCell(var7);
		LockedCell[] var8 = new LockedCell[] {};
		t1.setNotPlannableLockedCells(var8);
		t1.setGenerationFormatName("");
		t1.setColumnWidth(t3);
		t1.setRowHeight(t4);
		THIS.setPafViewSection(t1);
		// jtest_tested_method
		PafViewHeader RETVAL = THIS.getHeader(1);
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetHeader3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetHeader3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ArrayList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.ui.PafViewSectionUI.getHeader(PafViewSectionUI.java:79)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getHeader(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#getHeader(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetHeader5() throws Throwable {
		PafViewSectionUI THIS = new PafViewSectionUI((PafViewSection) null);
		PafViewSection t1 = new PafViewSection();
		PafDataSlice t2 = new PafDataSlice((double[]) null, 0);
		Integer t3 = new Integer(0);
		Integer t4 = new Integer("0");
		t1.setDescription("");
		t1.setName("");
		ViewTuple[] var1 = new ViewTuple[] {};
		t1.setColTuples(var1);
		ViewTuple[] var2 = new ViewTuple[] {};
		t1.setRowTuples(var2);
		t1.setPafDataSlice(t2);
		t1.setDataAlias("");
		t1.setManaged(false);
		t1.setPrimaryFormattingAxis(0);
		t1.setReadOnly(false);
		String[] var3 = new String[] {};
		t1.setColAxisDims(var3);
		PageTuple[] var4 = new PageTuple[] {};
		t1.setPageTuples(var4);
		String[] var5 = new String[] {};
		t1.setRowAxisDims(var5);
		t1.setLeftOffset(0);
		t1.setTopOffset(0);
		PafViewHeader[] var6 = new PafViewHeader[] {};
		t1.setPafViewHeaders(var6);
		LockedCell[] var7 = new LockedCell[] {};
		t1.setForwardPlannableLockedCell(var7);
		LockedCell[] var8 = new LockedCell[] {};
		t1.setNotPlannableLockedCells(var8);
		t1.setGenerationFormatName("");
		t1.setColumnWidth(t3);
		t1.setRowHeight(t4);
		THIS.setPafViewSection(t1);
		// jtest_tested_method
		PafViewHeader RETVAL = THIS.getHeader(0);
		// ClassCastException thrown
		// at com.palladium.paf.ui.PafViewSectionUI.getHeader(PafViewSectionUI.java:80)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetHeader5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetHeader5(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ArrayList.class)) {
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.ui.PafViewSectionUI.getHeader(PafViewSectionUI.java:80)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getHeader(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#getHeader(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetHeader6() throws Throwable {
		PafViewSectionUI THIS = new PafViewSectionUI((PafViewSection) null);
		PafViewSection t1 = new PafViewSection();
		PafDataSlice t2 = new PafDataSlice((double[]) null, 0);
		Integer t3 = new Integer("0");
		Integer t4 = new Integer(0);
		_f0 = new PafViewHeader((String) null, (String) null);
		t1.setDescription("");
		t1.setName("");
		ViewTuple[] var1 = new ViewTuple[] {};
		t1.setColTuples(var1);
		ViewTuple[] var2 = new ViewTuple[] {};
		t1.setRowTuples(var2);
		t1.setPafDataSlice(t2);
		t1.setDataAlias("");
		t1.setManaged(false);
		t1.setPrimaryFormattingAxis(0);
		t1.setReadOnly(false);
		String[] var3 = new String[] {};
		t1.setColAxisDims(var3);
		PageTuple[] var4 = new PageTuple[] {};
		t1.setPageTuples(var4);
		String[] var5 = new String[] {};
		t1.setRowAxisDims(var5);
		t1.setLeftOffset(0);
		t1.setTopOffset(0);
		PafViewHeader[] var6 = new PafViewHeader[] {};
		t1.setPafViewHeaders(var6);
		LockedCell[] var7 = new LockedCell[] {};
		t1.setForwardPlannableLockedCell(var7);
		LockedCell[] var8 = new LockedCell[] {};
		t1.setNotPlannableLockedCells(var8);
		t1.setGenerationFormatName("");
		t1.setColumnWidth(t3);
		t1.setRowHeight(t4);
		THIS.setPafViewSection(t1);
		// jtest_tested_method
		PafViewHeader RETVAL = THIS.getHeader(0);
		assertEquals(_f0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetHeader6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetHeader6(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ArrayList.class)) {
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f0;
				// at com.palladium.paf.ui.PafViewSectionUI.getHeader(PafViewSectionUI.java:80)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getHeaderList()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#getHeaderList()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetHeaderList1() throws Throwable {
		PafViewSectionUI THIS = new PafViewSectionUI((PafViewSection) null);
		// jtest_tested_method
		List RETVAL = THIS.getHeaderList();
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.ui.PafViewSectionUI.<init>(Lcom/palladium/paf/view/PafViewSection;)V>
		// at com.palladium.paf.ui.PafViewSectionUI.getHeaderList(PafViewSectionUI.java:20)
		// jtest_unverified
	}

	/**
	 * Test for method: getHeaderList()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#getHeaderList()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetHeaderList2() throws Throwable {
		PafViewSection t1 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t1);
		// jtest_tested_method
		List RETVAL = THIS.getHeaderList();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0, RETVAL.size()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getHeaderList()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#getHeaderList()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetHeaderList5() throws Throwable {
		PafViewSection t1 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t1);
		PafDataSlice t2 = new PafDataSlice((double[]) null, 0);
		Integer t3 = new Integer(0);
		Integer t4 = new Integer("0");
		t1.setDescription("");
		t1.setName("");
		ViewTuple[] var1 = new ViewTuple[] {};
		t1.setColTuples(var1);
		ViewTuple[] var2 = new ViewTuple[] {};
		t1.setRowTuples(var2);
		t1.setPafDataSlice(t2);
		t1.setDataAlias("");
		t1.setManaged(false);
		t1.setPrimaryFormattingAxis(0);
		t1.setReadOnly(false);
		String[] var3 = new String[] {};
		t1.setColAxisDims(var3);
		PageTuple[] var4 = new PageTuple[] {};
		t1.setPageTuples(var4);
		String[] var5 = new String[] {};
		t1.setRowAxisDims(var5);
		t1.setLeftOffset(0);
		t1.setTopOffset(0);
		PafViewHeader[] var6 = new PafViewHeader[] {};
		t1.setPafViewHeaders(var6);
		LockedCell[] var7 = new LockedCell[] {};
		t1.setForwardPlannableLockedCell(var7);
		LockedCell[] var8 = new LockedCell[] {};
		t1.setNotPlannableLockedCells(var8);
		t1.setGenerationFormatName("");
		t1.setColumnWidth(t3);
		t1.setRowHeight(t4);
		// jtest_tested_method
		List RETVAL = THIS.getHeaderList();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("[null]", RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetHeaderList5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetHeaderList5(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafViewSection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafViewHeaders", argument_types)) {
				return new PafViewHeader[1];
				// at com.palladium.paf.ui.PafViewSectionUI.getHeaderList(PafViewSectionUI.java:20)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getHeaders()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#getHeaders()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetHeaders1() throws Throwable {
		PafViewSectionUI THIS = new PafViewSectionUI((PafViewSection) null);
		// jtest_tested_method
		PafViewHeader[] RETVAL = THIS.getHeaders();
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.ui.PafViewSectionUI.<init>(Lcom/palladium/paf/view/PafViewSection;)V>
		// at com.palladium.paf.ui.PafViewSectionUI.getHeaders(PafViewSectionUI.java:87)
		// jtest_unverified
	}

	/**
	 * Test for method: getHeaders()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#getHeaders()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetHeaders2() throws Throwable {
		PafViewSection t1 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t1);
		// jtest_tested_method
		PafViewHeader[] RETVAL = THIS.getHeaders();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#getName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetName1() throws Throwable {
		PafViewSectionUI THIS = new PafViewSectionUI((PafViewSection) null);
		// jtest_tested_method
		String RETVAL = THIS.getName();
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.ui.PafViewSectionUI.<init>(Lcom/palladium/paf/view/PafViewSection;)V>
		// at com.palladium.paf.ui.PafViewSectionUI.getName(PafViewSectionUI.java:155)
		// jtest_unverified
	}

	/**
	 * Test for method: getName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#getName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetName2() throws Throwable {
		PafViewSection t1 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t1);
		// jtest_tested_method
		String RETVAL = THIS.getName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPafViewSection()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#getPafViewSection()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPafViewSection1() throws Throwable {
		PafViewSectionUI THIS = new PafViewSectionUI((PafViewSection) null);
		// jtest_tested_method
		PafViewSection RETVAL = THIS.getPafViewSection();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPafViewSection()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#getPafViewSection()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPafViewSection2() throws Throwable {
		PafViewSection t0 = new PafViewSection();
		double[] var1 = new double[] {};
		PafDataSlice t1 = new PafDataSlice(var1, 7);
		Integer t2 = new Integer("0");
		Integer t3 = new Integer(7);
		PafViewSectionUI THIS = new PafViewSectionUI(t0);
		t0.setDescription("");
		t0.setName("");
		ViewTuple[] var2 = new ViewTuple[] {};
		t0.setColTuples(var2);
		ViewTuple[] var3 = new ViewTuple[] {};
		t0.setRowTuples(var3);
		t0.setPafDataSlice(t1);
		t0.setDataAlias("");
		t0.setManaged(true);
		t0.setPrimaryFormattingAxis(7);
		t0.setReadOnly(true);
		String[] var4 = new String[] {};
		t0.setColAxisDims(var4);
		PageTuple[] var5 = new PageTuple[] {};
		t0.setPageTuples(var5);
		String[] var6 = new String[] {};
		t0.setRowAxisDims(var6);
		t0.setLeftOffset(7);
		t0.setTopOffset(7);
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
		PafViewSection RETVAL = THIS.getPafViewSection();
		assertEquals(t0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPageAxisDims()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#getPageAxisDims()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPageAxisDims1() throws Throwable {
		PafViewSectionUI THIS = new PafViewSectionUI((PafViewSection) null);
		// jtest_tested_method
		String[] RETVAL = THIS.getPageAxisDims();
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.ui.PafViewSectionUI.<init>(Lcom/palladium/paf/view/PafViewSection;)V>
		// at com.palladium.paf.ui.PafViewSectionUI.getPageAxisDims(PafViewSectionUI.java:98)
		// jtest_unverified
	}

	/**
	 * Test for method: getPageAxisDims()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#getPageAxisDims()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPageAxisDims2() throws Throwable {
		PafViewSection t1 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t1);
		// jtest_tested_method
		String[] RETVAL = THIS.getPageAxisDims();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0, RETVAL.length); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPageAxisDims()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#getPageAxisDims()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPageAxisDims5() throws Throwable {
		PafViewSection t1 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t1);
		PafDataSlice t2 = new PafDataSlice();
		Integer t3 = new Integer(0);
		Integer t4 = new Integer("0");
		PageTuple t5 = new PageTuple((String) null, (String) null);
		t1.setDescription("");
		t1.setName("");
		ViewTuple[] var1 = new ViewTuple[] {};
		t1.setColTuples(var1);
		ViewTuple[] var2 = new ViewTuple[] {};
		t1.setRowTuples(var2);
		t2.setColumnCount(0);
		double[] var3 = new double[] {};
		t2.setData(var3);
		t2.setCompressedData("");
		t2.setCompressed(false);
		t1.setPafDataSlice(t2);
		t1.setDataAlias("");
		t1.setManaged(false);
		t1.setPrimaryFormattingAxis(0);
		t1.setReadOnly(false);
		String[] var4 = new String[] {};
		t1.setColAxisDims(var4);
		PageTuple[] var5 = new PageTuple[] { t5 };
		t1.setPageTuples(var5);
		String[] var6 = new String[] {};
		t1.setRowAxisDims(var6);
		t1.setLeftOffset(0);
		t1.setTopOffset(0);
		PafViewHeader[] var7 = new PafViewHeader[] {};
		t1.setPafViewHeaders(var7);
		LockedCell[] var8 = new LockedCell[] {};
		t1.setForwardPlannableLockedCell(var8);
		LockedCell[] var9 = new LockedCell[] {};
		t1.setNotPlannableLockedCells(var9);
		t1.setGenerationFormatName("");
		t1.setColumnWidth(t3);
		t1.setRowHeight(t4);
		// jtest_tested_method
		String[] RETVAL = THIS.getPageAxisDims();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(1, RETVAL.length); // jtest_unverified
		assertEquals(null, RETVAL[0]); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPageAxisDims()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#getPageAxisDims()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPageAxisDims6() throws Throwable {
		PafViewSection t1 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t1);
		PafDataSlice t2 = new PafDataSlice();
		Integer t3 = new Integer(0);
		Integer t4 = new Integer("0");
		t1.setDescription("");
		t1.setName("");
		ViewTuple[] var1 = new ViewTuple[] {};
		t1.setColTuples(var1);
		ViewTuple[] var2 = new ViewTuple[] {};
		t1.setRowTuples(var2);
		t1.setPafDataSlice(t2);
		t1.setDataAlias("");
		t1.setManaged(false);
		t1.setPrimaryFormattingAxis(0);
		t1.setReadOnly(false);
		String[] var3 = new String[] {};
		t1.setColAxisDims(var3);
		PageTuple[] var4 = new PageTuple[] { null };
		t1.setPageTuples(var4);
		String[] var5 = new String[] {};
		t1.setRowAxisDims(var5);
		t1.setLeftOffset(0);
		t1.setTopOffset(0);
		PafViewHeader[] var6 = new PafViewHeader[] {};
		t1.setPafViewHeaders(var6);
		LockedCell[] var7 = new LockedCell[] {};
		t1.setForwardPlannableLockedCell(var7);
		LockedCell[] var8 = new LockedCell[] {};
		t1.setNotPlannableLockedCells(var8);
		t1.setGenerationFormatName("");
		t1.setColumnWidth(t3);
		t1.setRowHeight(t4);
		// jtest_tested_method
		String[] RETVAL = THIS.getPageAxisDims();
		// NullPointerException thrown
		// at com.palladium.paf.ui.PafViewSectionUI.getPageAxisDims(PafViewSectionUI.java:103)
		// jtest_unverified
	}

	/**
	 * Test for method: getPrimaryFormattingAxis()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#getPrimaryFormattingAxis()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPrimaryFormattingAxis1() throws Throwable {
		PafViewSectionUI THIS = new PafViewSectionUI((PafViewSection) null);
		// jtest_tested_method
		int RETVAL = THIS.getPrimaryFormattingAxis();
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.ui.PafViewSectionUI.<init>(Lcom/palladium/paf/view/PafViewSection;)V>
		// at com.palladium.paf.ui.PafViewSectionUI.getPrimaryFormattingAxis(PafViewSectionUI.java:163)
		// jtest_unverified
	}

	/**
	 * Test for method: getPrimaryFormattingAxis()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#getPrimaryFormattingAxis()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPrimaryFormattingAxis2() throws Throwable {
		PafViewSection t1 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t1);
		// jtest_tested_method
		int RETVAL = THIS.getPrimaryFormattingAxis();
		assertEquals(0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getRowAxisDims()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#getRowAxisDims()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRowAxisDims1() throws Throwable {
		PafViewSectionUI THIS = new PafViewSectionUI((PafViewSection) null);
		// jtest_tested_method
		String[] RETVAL = THIS.getRowAxisDims();
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.ui.PafViewSectionUI.<init>(Lcom/palladium/paf/view/PafViewSection;)V>
		// at com.palladium.paf.ui.PafViewSectionUI.getRowAxisDims(PafViewSectionUI.java:111)
		// jtest_unverified
	}

	/**
	 * Test for method: getRowAxisDims()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#getRowAxisDims()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRowAxisDims2() throws Throwable {
		PafViewSection t1 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t1);
		// jtest_tested_method
		String[] RETVAL = THIS.getRowAxisDims();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isReadOnly()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#isReadOnly()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsReadOnly1() throws Throwable {
		PafViewSectionUI THIS = new PafViewSectionUI((PafViewSection) null);
		// jtest_tested_method
		boolean RETVAL = THIS.isReadOnly();
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.ui.PafViewSectionUI.<init>(Lcom/palladium/paf/view/PafViewSection;)V>
		// at com.palladium.paf.ui.PafViewSectionUI.isReadOnly(PafViewSectionUI.java:171)
		// jtest_unverified
	}

	/**
	 * Test for method: isReadOnly()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#isReadOnly()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsReadOnly2() throws Throwable {
		PafViewSection t1 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t1);
		// jtest_tested_method
		boolean RETVAL = THIS.isReadOnly();
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafViewSectionUI(com.palladium.paf.view.PafViewSection)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#PafViewSectionUI(com.palladium.paf.view.PafViewSection)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafViewSectionUI1() throws Throwable {
		// jtest_tested_method
		PafViewSectionUI THIS = new PafViewSectionUI((PafViewSection) null);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setColAxisDims(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#setColAxisDims(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetColAxisDims1() throws Throwable {
		PafViewSectionUI THIS = new PafViewSectionUI((PafViewSection) null);
		// jtest_tested_method
		THIS.setColAxisDims((String[]) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.ui.PafViewSectionUI.<init>(Lcom/palladium/paf/view/PafViewSection;)V>
		// at com.palladium.paf.ui.PafViewSectionUI.setColAxisDims(PafViewSectionUI.java:208)
		// jtest_unverified
	}

	/**
	 * Test for method: setColAxisDims(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#setColAxisDims(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetColAxisDims2() throws Throwable {
		PafViewSection t1 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t1);
		// jtest_tested_method
		THIS.setColAxisDims((String[]) null);
		assertEquals(null, THIS.getColAxisDims()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setColAxisDims(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#setColAxisDims(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetColAxisDims3() throws Throwable {
		PafViewSection t0 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t0);
		String[] var1 = new String[] {};
		// jtest_tested_method
		THIS.setColAxisDims(var1);
		assertSame(var1, THIS.getColAxisDims()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setDataAlias(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#setDataAlias(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDataAlias1() throws Throwable {
		PafViewSectionUI THIS = new PafViewSectionUI((PafViewSection) null);
		// jtest_tested_method
		THIS.setDataAlias((String) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.ui.PafViewSectionUI.<init>(Lcom/palladium/paf/view/PafViewSection;)V>
		// at com.palladium.paf.ui.PafViewSectionUI.setDataAlias(PafViewSectionUI.java:143)
		// jtest_unverified
	}

	/**
	 * Test for method: setDataAlias(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#setDataAlias(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDataAlias2() throws Throwable {
		PafViewSection t1 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t1);
		// jtest_tested_method
		THIS.setDataAlias((String) null);
		assertEquals(null, THIS.getDataAlias()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setDataAlias(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#setDataAlias(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDataAlias3() throws Throwable {
		PafViewSection t0 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t0);
		// jtest_tested_method
		THIS.setDataAlias("");
		assertEquals("", THIS.getDataAlias()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setDescription(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#setDescription(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDescription1() throws Throwable {
		PafViewSectionUI THIS = new PafViewSectionUI((PafViewSection) null);
		// jtest_tested_method
		THIS.setDescription((String) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.ui.PafViewSectionUI.<init>(Lcom/palladium/paf/view/PafViewSection;)V>
		// at com.palladium.paf.ui.PafViewSectionUI.setDescription(PafViewSectionUI.java:151)
		// jtest_unverified
	}

	/**
	 * Test for method: setDescription(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#setDescription(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDescription2() throws Throwable {
		PafViewSection t1 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t1);
		// jtest_tested_method
		THIS.setDescription((String) null);
		assertEquals(null, THIS.getDescription()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setDescription(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#setDescription(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDescription3() throws Throwable {
		PafViewSection t0 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t0);
		// jtest_tested_method
		THIS.setDescription("");
		assertEquals("", THIS.getDescription()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setGenerationFormatName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#setGenerationFormatName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetGenerationFormatName1() throws Throwable {
		PafViewSectionUI THIS = new PafViewSectionUI((PafViewSection) null);
		// jtest_tested_method
		THIS.setGenerationFormatName((String) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.ui.PafViewSectionUI.<init>(Lcom/palladium/paf/view/PafViewSection;)V>
		// at com.palladium.paf.ui.PafViewSectionUI.setGenerationFormatName(PafViewSectionUI.java:212)
		// jtest_unverified
	}

	/**
	 * Test for method: setGenerationFormatName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#setGenerationFormatName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetGenerationFormatName2() throws Throwable {
		PafViewSection t1 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t1);
		// jtest_tested_method
		THIS.setGenerationFormatName((String) null);
		assertEquals(null, THIS.getGenerationFormatName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setGenerationFormatName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#setGenerationFormatName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetGenerationFormatName3() throws Throwable {
		PafViewSection t0 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t0);
		// jtest_tested_method
		THIS.setGenerationFormatName("");
		assertEquals("", THIS.getGenerationFormatName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setHeaders(com.palladium.paf.view.PafViewHeader[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#setHeaders(com.palladium.paf.view.PafViewHeader[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetHeaders1() throws Throwable {
		PafViewSectionUI THIS = new PafViewSectionUI((PafViewSection) null);
		// jtest_tested_method
		THIS.setHeaders((PafViewHeader[]) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.ui.PafViewSectionUI.<init>(Lcom/palladium/paf/view/PafViewSection;)V>
		// at com.palladium.paf.ui.PafViewSectionUI.setHeaders(PafViewSectionUI.java:91)
		// jtest_unverified
	}

	/**
	 * Test for method: setHeaders(com.palladium.paf.view.PafViewHeader[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#setHeaders(com.palladium.paf.view.PafViewHeader[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetHeaders2() throws Throwable {
		PafViewSection t1 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t1);
		// jtest_tested_method
		THIS.setHeaders((PafViewHeader[]) null);
		assertEquals(null, THIS.getHeaders()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setHeaders(com.palladium.paf.view.PafViewHeader[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#setHeaders(com.palladium.paf.view.PafViewHeader[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetHeaders3() throws Throwable {
		PafViewSection t0 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t0);
		PafViewHeader[] var1 = new PafViewHeader[] {};
		// jtest_tested_method
		THIS.setHeaders(var1);
		assertSame(var1, THIS.getHeaders()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#setName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetName1() throws Throwable {
		PafViewSectionUI THIS = new PafViewSectionUI((PafViewSection) null);
		// jtest_tested_method
		THIS.setName((String) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.ui.PafViewSectionUI.<init>(Lcom/palladium/paf/view/PafViewSection;)V>
		// at com.palladium.paf.ui.PafViewSectionUI.setName(PafViewSectionUI.java:159)
		// jtest_unverified
	}

	/**
	 * Test for method: setName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#setName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetName2() throws Throwable {
		PafViewSection t1 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t1);
		// jtest_tested_method
		THIS.setName((String) null);
		assertEquals(null, THIS.getName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#setName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetName3() throws Throwable {
		PafViewSection t0 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t0);
		// jtest_tested_method
		THIS.setName("");
		assertEquals("", THIS.getName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setPafViewSection(com.palladium.paf.view.PafViewSection)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#setPafViewSection(com.palladium.paf.view.PafViewSection)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetPafViewSection1() throws Throwable {
		PafViewSection t0 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t0);
		PafViewSection t2 = new PafViewSection();
		// jtest_tested_method
		THIS.setPafViewSection(t2);
		assertEquals(t2, THIS.getPafViewSection()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setPageAxisDims(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#setPageAxisDims(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetPageAxisDims1() throws Throwable {
		PafViewSectionUI THIS = new PafViewSectionUI((PafViewSection) null);
		// jtest_tested_method
		THIS.setPageAxisDims((String[]) null);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setPageAxisDims(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#setPageAxisDims(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetPageAxisDims3() throws Throwable {
		PafViewSection t1 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t1);
		PafDataSlice t2 = new PafDataSlice();
		Integer t3 = new Integer("0");
		Integer t4 = new Integer(0);
		t1.setDescription("");
		t1.setName("");
		ViewTuple[] var1 = new ViewTuple[] {};
		t1.setColTuples(var1);
		ViewTuple[] var2 = new ViewTuple[] {};
		t1.setRowTuples(var2);
		t1.setPafDataSlice(t2);
		t1.setDataAlias("");
		t1.setManaged(false);
		t1.setPrimaryFormattingAxis(0);
		t1.setReadOnly(false);
		String[] var3 = new String[] {};
		t1.setColAxisDims(var3);
		PageTuple[] var4 = new PageTuple[] {};
		t1.setPageTuples(var4);
		String[] var5 = new String[] {};
		t1.setRowAxisDims(var5);
		t1.setLeftOffset(0);
		t1.setTopOffset(0);
		PafViewHeader[] var6 = new PafViewHeader[] {};
		t1.setPafViewHeaders(var6);
		LockedCell[] var7 = new LockedCell[] {};
		t1.setForwardPlannableLockedCell(var7);
		LockedCell[] var8 = new LockedCell[] {};
		t1.setNotPlannableLockedCells(var8);
		t1.setGenerationFormatName("");
		t1.setColumnWidth(t3);
		t1.setRowHeight(t4);
		String[] var9 = new String[] { null };
		// jtest_tested_method
		THIS.setPageAxisDims(var9);
		assertEquals(null, var9[0]); // jtest_unverified
		assertNotNull(THIS.getPageAxisDims()); // jtest_unverified
		assertEquals(1, THIS.getPageAxisDims().length); // jtest_unverified
		assertEquals(null, THIS.getPageAxisDims()[0]); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setPageAxisDims(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#setPageAxisDims(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetPageAxisDims4() throws Throwable {
		PafViewSection t0 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t0);
		String[] var1 = new String[] { null, null, null, null, null, null,
				null, null, null };
		// jtest_tested_method
		THIS.setPageAxisDims(var1);
		assertEquals(null, var1[0]); // jtest_unverified
		assertEquals(null, var1[1]); // jtest_unverified
		assertEquals(null, var1[2]); // jtest_unverified
		assertEquals(null, var1[8]); // jtest_unverified
		assertNotNull(THIS.getPageAxisDims()); // jtest_unverified
		assertEquals(9, THIS.getPageAxisDims().length); // jtest_unverified
		assertEquals(null, THIS.getPageAxisDims()[0]); // jtest_unverified
		assertEquals(null, THIS.getPageAxisDims()[1]); // jtest_unverified
		assertEquals(null, THIS.getPageAxisDims()[2]); // jtest_unverified
		assertEquals(null, THIS.getPageAxisDims()[8]); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setPageAxisDims(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#setPageAxisDims(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetPageAxisDims5() throws Throwable {
		PafViewSectionUI THIS = new PafViewSectionUI((PafViewSection) null);
		String[] var1 = new String[] {};
		// jtest_tested_method
		THIS.setPageAxisDims(var1);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.ui.PafViewSectionUI.<init>(Lcom/palladium/paf/view/PafViewSection;)V>
		// at com.palladium.paf.ui.PafViewSectionUI.setPageAxisDims(PafViewSectionUI.java:197)
		// jtest_unverified
	}

	/**
	 * Test for method: setPrimaryFormattingAxis(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#setPrimaryFormattingAxis(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetPrimaryFormattingAxis1() throws Throwable {
		PafViewSectionUI THIS = new PafViewSectionUI((PafViewSection) null);
		// jtest_tested_method
		THIS.setPrimaryFormattingAxis(0);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.ui.PafViewSectionUI.<init>(Lcom/palladium/paf/view/PafViewSection;)V>
		// at com.palladium.paf.ui.PafViewSectionUI.setPrimaryFormattingAxis(PafViewSectionUI.java:167)
		// jtest_unverified
	}

	/**
	 * Test for method: setPrimaryFormattingAxis(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#setPrimaryFormattingAxis(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetPrimaryFormattingAxis2() throws Throwable {
		PafViewSection t1 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t1);
		// jtest_tested_method
		THIS.setPrimaryFormattingAxis(0);
		assertEquals(0, THIS.getPrimaryFormattingAxis()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setPrimaryFormattingAxis(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#setPrimaryFormattingAxis(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetPrimaryFormattingAxis3() throws Throwable {
		PafViewSection t0 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t0);
		// jtest_tested_method
		THIS.setPrimaryFormattingAxis(7);
		assertEquals(7, THIS.getPrimaryFormattingAxis()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setReadOnly(boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#setReadOnly(boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetReadOnly1() throws Throwable {
		PafViewSectionUI THIS = new PafViewSectionUI((PafViewSection) null);
		// jtest_tested_method
		THIS.setReadOnly(false);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.ui.PafViewSectionUI.<init>(Lcom/palladium/paf/view/PafViewSection;)V>
		// at com.palladium.paf.ui.PafViewSectionUI.setReadOnly(PafViewSectionUI.java:175)
		// jtest_unverified
	}

	/**
	 * Test for method: setReadOnly(boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#setReadOnly(boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetReadOnly2() throws Throwable {
		PafViewSection t1 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t1);
		// jtest_tested_method
		THIS.setReadOnly(false);
		assertEquals(false, THIS.isReadOnly()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setReadOnly(boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#setReadOnly(boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetReadOnly3() throws Throwable {
		PafViewSection t0 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t0);
		// jtest_tested_method
		THIS.setReadOnly(true);
		assertEquals(true, THIS.isReadOnly()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setRowAxisDims(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#setRowAxisDims(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetRowAxisDims1() throws Throwable {
		PafViewSectionUI THIS = new PafViewSectionUI((PafViewSection) null);
		// jtest_tested_method
		THIS.setRowAxisDims((String[]) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.ui.PafViewSectionUI.<init>(Lcom/palladium/paf/view/PafViewSection;)V>
		// at com.palladium.paf.ui.PafViewSectionUI.setRowAxisDims(PafViewSectionUI.java:204)
		// jtest_unverified
	}

	/**
	 * Test for method: setRowAxisDims(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#setRowAxisDims(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetRowAxisDims2() throws Throwable {
		PafViewSection t1 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t1);
		// jtest_tested_method
		THIS.setRowAxisDims((String[]) null);
		assertEquals(null, THIS.getRowAxisDims()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setRowAxisDims(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#setRowAxisDims(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetRowAxisDims3() throws Throwable {
		PafViewSection t0 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t0);
		String[] var1 = new String[] {};
		// jtest_tested_method
		THIS.setRowAxisDims(var1);
		assertSame(var1, THIS.getRowAxisDims()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: updateHeader(com.palladium.paf.view.PafViewHeader)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#updateHeader(com.palladium.paf.view.PafViewHeader)
	 * @author Parasoft Jtest 8.0
	 */
	public void testUpdateHeader1() throws Throwable {
		PafViewSection t1 = new PafViewSection();
		PafViewSectionUI THIS = new PafViewSectionUI(t1);
		// jtest_tested_method
		THIS.updateHeader((PafViewHeader) null);
		// No exception thrown
		// jtest_unverified
	}
	/**
	 * Test for method: updateHeader(com.palladium.paf.view.PafViewHeader)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewSectionUI#updateHeader(com.palladium.paf.view.PafViewHeader)
	 * @author Parasoft Jtest 8.0
	 */
	public void testUpdateHeader3() throws Throwable {
		PafViewSectionUI THIS = new PafViewSectionUI((PafViewSection) null);
		PafViewSection t1 = new PafViewSection();
		PafDataSlice t2 = new PafDataSlice((double[]) null, 0);
		Integer t3 = new Integer(0);
		Integer t4 = new Integer("0");
		t1.setDescription("");
		t1.setName("");
		ViewTuple[] var1 = new ViewTuple[] {};
		t1.setColTuples(var1);
		ViewTuple[] var2 = new ViewTuple[] {};
		t1.setRowTuples(var2);
		t2.setColumnCount(0);
		double[] var3 = new double[] {};
		t2.setData(var3);
		t2.setCompressedData("");
		t2.setCompressed(false);
		t1.setPafDataSlice(t2);
		t1.setDataAlias("");
		t1.setManaged(false);
		t1.setPrimaryFormattingAxis(0);
		t1.setReadOnly(false);
		String[] var4 = new String[] {};
		t1.setColAxisDims(var4);
		PageTuple[] var5 = new PageTuple[] {};
		t1.setPageTuples(var5);
		String[] var6 = new String[] {};
		t1.setRowAxisDims(var6);
		t1.setLeftOffset(0);
		t1.setTopOffset(0);
		PafViewHeader[] var7 = new PafViewHeader[] {};
		t1.setPafViewHeaders(var7);
		LockedCell[] var8 = new LockedCell[] {};
		t1.setForwardPlannableLockedCell(var8);
		LockedCell[] var9 = new LockedCell[] {};
		t1.setNotPlannableLockedCells(var9);
		t1.setGenerationFormatName("");
		t1.setColumnWidth(t3);
		t1.setRowHeight(t4);
		THIS.setPafViewSection(t1);
		// jtest_tested_method
		THIS.updateHeader((PafViewHeader) null);
		// ClassCastException thrown
		// at com.palladium.paf.ui.PafViewSectionUI.setViewSectionHeaders(PafViewSectionUI.java:69)
		// at com.palladium.paf.ui.PafViewSectionUI.updateHeader(PafViewSectionUI.java:63)
		// jtest_unverified
	}

	/**
	 * Stubs method for testUpdateHeader3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsUpdateHeader3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ArrayList.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "contains", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.ui.PafViewSectionUI.updateHeader(PafViewSectionUI.java:59)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "add", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.ui.PafViewSectionUI.updateHeader(PafViewSectionUI.java:60)
			}
			argument_types = new Class[] { Object[].class };
			if (Stubs.matches(method, "toArray", argument_types)) {
				return new Object[0];
				// at com.palladium.paf.ui.PafViewSectionUI.setViewSectionHeaders(PafViewSectionUI.java:69)
				// at com.palladium.paf.ui.PafViewSectionUI.updateHeader(PafViewSectionUI.java:63)
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
	 * Usage: java com.palladium.paf.ui.PafViewSectionUITest
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
			PafViewSectionUITest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.ui.PafViewSectionUI",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafViewSectionUI.class;
	}

		/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafViewHeader _f0;
		}

// JTEST_CURRENT_ID=-29580715.