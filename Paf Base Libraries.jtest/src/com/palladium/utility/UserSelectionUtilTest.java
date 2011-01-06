/*
 * UserSelectionUtilTest.java
 * Created by Jtest on 9/19/06 6:00:34 PM.
 * Updated by Jtest on 10/18/06 8:02:38 PM, 10 test cases added, 10 test cases removed.
 * Updated by Jtest on 11/9/06 3:04:02 AM, 10 test cases added, 10 test cases removed.
 */

package com.palladium.utility;

import com.palladium.paf.view.PafAlignment;
import com.palladium.paf.view.PafStyle;
import com.palladium.paf.view.PafNumberFormat;
import com.palladium.paf.view.PafBorder;
import jtest.Stubs;
import java.lang.reflect.Member;
import com.palladium.paf.view.LockedCell;
import com.palladium.paf.view.PafViewHeader;
import com.palladium.paf.view.PageTuple;
import com.palladium.paf.view.ViewTuple;
import com.palladium.paf.data.PafDataSlice;
import com.palladium.paf.view.PafViewSection;
import java.util.Set;
import com.palladium.utility.UserSelectionUtil;

/**
 * UserSelectionUtilTest is a unit test class for class UserSelectionUtil.
 * @see com.palladium.utility.UserSelectionUtil
 * @author Parasoft Jtest 8.0
 */
public class UserSelectionUtilTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public UserSelectionUtilTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: static findUserSelections(com.palladium.paf.view.PafViewSection)
	 * @throws Throwable Tests may throw any Throwable
	 * @see UserSelectionUtil#findUserSelections(com.palladium.paf.view.PafViewSection)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindUserSelections1() throws Throwable {
		// jtest_tested_method
		Set RETVAL = UserSelectionUtil
			.findUserSelections((PafViewSection) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.utility.UserSelectionUtil.findUserSelections(Lcom/palladium/paf/view/PafViewSection;)Ljava/util/Set;>
		// at com.palladium.utility.UserSelectionUtil.findUserSelections(UserSelectionUtil.java:18)
		// jtest_unverified
	}

	/**
	 * Test for method: static findUserSelections(com.palladium.paf.view.PafViewSection)
	 * @throws Throwable Tests may throw any Throwable
	 * @see UserSelectionUtil#findUserSelections(com.palladium.paf.view.PafViewSection)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindUserSelections2() throws Throwable {
		PafViewSection t0 = new PafViewSection();
		// jtest_tested_method
		Set RETVAL = UserSelectionUtil.findUserSelections(t0);
		// NullPointerException thrown
		// at com.palladium.utility.UserSelectionUtil.findUserSelections(UserSelectionUtil.java:22)
		// jtest_unverified
	}

	/**
	 * Test for method: static findUserSelections(com.palladium.paf.view.PafViewSection)
	 * @throws Throwable Tests may throw any Throwable
	 * @see UserSelectionUtil#findUserSelections(com.palladium.paf.view.PafViewSection)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindUserSelections3() throws Throwable {
		PafViewSection t0 = new PafViewSection();
		PafDataSlice t1 = new PafDataSlice((double[]) null, 0);
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
		Set RETVAL = UserSelectionUtil.findUserSelections(t0);
		// NullPointerException thrown
		// at com.palladium.utility.UserSelectionUtil.findUserSelections(UserSelectionUtil.java:30)
		// jtest_unverified
	}

	/**
	 * Stubs method for testFindUserSelections3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsFindUserSelections3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafViewSection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPageTuples", argument_types)) {
				return new PageTuple[0];
				// at com.palladium.utility.UserSelectionUtil.findUserSelections(UserSelectionUtil.java:18)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowTuples", argument_types)) {
				return null;
				// at com.palladium.utility.UserSelectionUtil.findUserSelections(UserSelectionUtil.java:19)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getColTuples", argument_types)) {
				return null;
				// at com.palladium.utility.UserSelectionUtil.findUserSelections(UserSelectionUtil.java:20)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static findUserSelections(com.palladium.paf.view.PafViewSection)
	 * @throws Throwable Tests may throw any Throwable
	 * @see UserSelectionUtil#findUserSelections(com.palladium.paf.view.PafViewSection)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindUserSelections5() throws Throwable {
		PafViewSection t0 = new PafViewSection();
		PafDataSlice t1 = new PafDataSlice();
		Integer t2 = new Integer(0);
		Integer t3 = new Integer("0");
		_f0 = new PageTuple((String) null, (String) null);
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
		Set RETVAL = UserSelectionUtil.findUserSelections(t0);
		// NullPointerException thrown
		// at com.palladium.utility.UserSelectionUtil.findUserSelections(UserSelectionUtil.java:24)
		// jtest_unverified
	}

	/**
	 * Stubs method for testFindUserSelections5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsFindUserSelections5(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafViewSection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPageTuples", argument_types)) {
				return new PageTuple[] { _f0 };
				// at com.palladium.utility.UserSelectionUtil.findUserSelections(UserSelectionUtil.java:18)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowTuples", argument_types)) {
				return null;
				// at com.palladium.utility.UserSelectionUtil.findUserSelections(UserSelectionUtil.java:19)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getColTuples", argument_types)) {
				return null;
				// at com.palladium.utility.UserSelectionUtil.findUserSelections(UserSelectionUtil.java:20)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static findUserSelections(com.palladium.paf.view.PafViewSection)
	 * @throws Throwable Tests may throw any Throwable
	 * @see UserSelectionUtil#findUserSelections(com.palladium.paf.view.PafViewSection)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindUserSelections7() throws Throwable {
		PafViewSection t0 = new PafViewSection();
		PafDataSlice t1 = new PafDataSlice();
		Integer t2 = new Integer(0);
		Integer t3 = new Integer("0");
		_f0 = new PageTuple();
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
		Set RETVAL = UserSelectionUtil.findUserSelections(t0);
		// NullPointerException thrown
		// at com.palladium.utility.UserSelectionUtil.findUserSelections(UserSelectionUtil.java:41)
		// jtest_unverified
	}

	/**
	 * Stubs method for testFindUserSelections7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsFindUserSelections7(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafViewSection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPageTuples", argument_types)) {
				return new PageTuple[] { _f0 };
				// at com.palladium.utility.UserSelectionUtil.findUserSelections(UserSelectionUtil.java:18)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowTuples", argument_types)) {
				return new ViewTuple[0];
				// at com.palladium.utility.UserSelectionUtil.findUserSelections(UserSelectionUtil.java:19)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getColTuples", argument_types)) {
				return null;
				// at com.palladium.utility.UserSelectionUtil.findUserSelections(UserSelectionUtil.java:20)
			}
		}
		if (Stubs.matches(method, PageTuple.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMember", argument_types)) {
				return "";
				// at com.palladium.utility.UserSelectionUtil.findUserSelections(UserSelectionUtil.java:24)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static findUserSelections(com.palladium.paf.view.PafViewSection)
	 * @throws Throwable Tests may throw any Throwable
	 * @see UserSelectionUtil#findUserSelections(com.palladium.paf.view.PafViewSection)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindUserSelections9() throws Throwable {
		PafViewSection t0 = new PafViewSection();
		PafDataSlice t1 = new PafDataSlice();
		Integer t2 = new Integer(0);
		Integer t3 = new Integer("0");
		_f0 = new PageTuple((String) null, (String) null);
		_f1 = new PageTuple();
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
		PageTuple[] var5 = new PageTuple[] {};
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
		_f1.setAxis("");
		_f1.setMember("");
		// jtest_tested_method
		Set RETVAL = UserSelectionUtil.findUserSelections(t0);
		// NullPointerException thrown
		// at com.palladium.utility.UserSelectionUtil.findUserSelections(UserSelectionUtil.java:32)
		// jtest_unverified
	}

	/**
	 * Stubs method for testFindUserSelections9.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsFindUserSelections9(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafViewSection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPageTuples", argument_types)) {
				return new PageTuple[] { _f0, _f1 };
				// at com.palladium.utility.UserSelectionUtil.findUserSelections(UserSelectionUtil.java:18)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowTuples", argument_types)) {
				return new ViewTuple[1];
				// at com.palladium.utility.UserSelectionUtil.findUserSelections(UserSelectionUtil.java:19)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getColTuples", argument_types)) {
				return null;
				// at com.palladium.utility.UserSelectionUtil.findUserSelections(UserSelectionUtil.java:20)
			}
		}
		if (Stubs.matches(method, PageTuple.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMember", argument_types)) {
				return "";
				// at com.palladium.utility.UserSelectionUtil.findUserSelections(UserSelectionUtil.java:24)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static findUserSelections(com.palladium.paf.view.PafViewSection)
	 * @throws Throwable Tests may throw any Throwable
	 * @see UserSelectionUtil#findUserSelections(com.palladium.paf.view.PafViewSection)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindUserSelections14() throws Throwable {
		PafViewSection t0 = new PafViewSection();
		PafDataSlice t1 = new PafDataSlice();
		Integer t2 = new Integer("0");
		Integer t3 = new Integer(0);
		_f0 = new PageTuple((String) null, (String) null);
		_f1 = new PageTuple((String) null, (String) null);
		_f2 = new PageTuple();
		_f4 = new PageTuple();
		_f5 = new PageTuple((String) null, (String) null);
		_f3 = new ViewTuple();
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
		_f1.setAxis("");
		_f1.setMember("");
		_f5.setAxis("");
		_f5.setMember("");
		// jtest_tested_method
		Set RETVAL = UserSelectionUtil.findUserSelections(t0);
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("[]", RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testFindUserSelections14.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsFindUserSelections14(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafViewSection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPageTuples", argument_types)) {
				return new PageTuple[] { _f0, _f1, _f2, _f4, _f5 };
				// at com.palladium.utility.UserSelectionUtil.findUserSelections(UserSelectionUtil.java:18)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowTuples", argument_types)) {
				return new ViewTuple[] { _f3 };
				// at com.palladium.utility.UserSelectionUtil.findUserSelections(UserSelectionUtil.java:19)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getColTuples", argument_types)) {
				return new ViewTuple[0];
				// at com.palladium.utility.UserSelectionUtil.findUserSelections(UserSelectionUtil.java:20)
			}
		}
		if (Stubs.matches(method, PageTuple.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMember", argument_types)) {
				return "";
				// at com.palladium.utility.UserSelectionUtil.findUserSelections(UserSelectionUtil.java:24)
			}
		}
		if (Stubs.matches(method, ViewTuple.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberDefs", argument_types)) {
				return new String[0];
				// at com.palladium.utility.UserSelectionUtil.findUserSelections(UserSelectionUtil.java:32)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static findUserSelections(com.palladium.paf.view.PafViewSection)
	 * @throws Throwable Tests may throw any Throwable
	 * @see UserSelectionUtil#findUserSelections(com.palladium.paf.view.PafViewSection)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindUserSelections17() throws Throwable {
		PafViewSection t0 = new PafViewSection();
		PafDataSlice t1 = new PafDataSlice();
		Integer t2 = new Integer(0);
		Integer t3 = new Integer("0");
		_f0 = new PageTuple();
		_f1 = new PageTuple((String) null, (String) null);
		_f2 = new PageTuple((String) null, (String) null);
		_f4 = new PageTuple();
		_f5 = new PageTuple();
		_f6 = new PageTuple((String) null, (String) null);
		_f7 = new PageTuple();
		_f3 = new ViewTuple((Integer) null, (String[]) null);
		Integer t12 = new Integer("0");
		PafBorder t13 = new PafBorder(0);
		Boolean t14 = new Boolean(false);
		Boolean t15 = new Boolean((String) null);
		PafNumberFormat t16 = new PafNumberFormat((String) null, (String) null);
		Short t17 = new Short((short) -32768);
		Boolean t18 = new Boolean(false);
		Boolean t19 = new Boolean((String) null);
		Boolean t20 = new Boolean((String) null);
		PafStyle t21 = new PafStyle();
		PafStyle t22 = new PafStyle();
		Integer t23 = new Integer(0);
		PafAlignment t24 = new PafAlignment();
		Boolean t25 = new Boolean(false);
		Boolean t26 = new Boolean(false);
		Boolean t27 = new Boolean((String) null);
		Boolean t28 = new Boolean((String) null);
		Boolean t29 = new Boolean(false);
		PafBorder t30 = new PafBorder();
		Integer t31 = new Integer(0);
		Integer t32 = new Integer("0");
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
		_f0.setAxis("");
		_f0.setMember("");
		_f1.setAxis("");
		_f1.setMember("");
		_f5.setAxis("");
		_f5.setMember("");
		_f3.setAxis(t12);
		_f3.setBorder(t13);
		_f3.setDrillable(t14);
		_f3.setExpanded(t15);
		String[] var9 = new String[] {};
		_f3.setMemberDefs(var9);
		_f3.setNumberFormat(t16);
		_f3.setOrder(t17);
		_f3.setOverrideLabel("");
		_f3.setParentFirst(t18);
		_f3.setPlannable(t19);
		_f3.setVisible(t20);
		_f3.setDataGlobalStyleName("");
		_f3.setDataStyle(t21);
		_f3.setHeaderGlobalStyleName("");
		t22.setSize(t23);
		t22.setAlignment(t24);
		t22.setBgFillColor("");
		t22.setFontColor("");
		t22.setFontName("");
		t22.setName("");
		t22.setBold(t25);
		t22.setDoubleUnderline(t26);
		t22.setItalics(t27);
		t22.setStrikeOut(t28);
		t22.setUnderline(t29);
		_f3.setHeaderStyle(t22);
		_f3.setNumberFormatOverrideLabel("");
		_f3.setHeaderBorder(t30);
		_f3.setColumnWidth(t31);
		_f3.setRowHeight(t32);
		Integer[] var10 = new Integer[] {};
		_f3.setSymetricGroupNo(var10);
		Integer[] var11 = new Integer[] {};
		_f3.setDerivedHeaderGroupNo(var11);
		// jtest_tested_method
		Set RETVAL = UserSelectionUtil.findUserSelections(t0);
		// NullPointerException thrown
		// at com.palladium.utility.UserSelectionUtil.findUserSelections(UserSelectionUtil.java:34)
		// jtest_unverified
	}

	/**
	 * Stubs method for testFindUserSelections17.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsFindUserSelections17(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafViewSection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPageTuples", argument_types)) {
				return new PageTuple[] { _f0, _f1, _f2, _f4, _f5, _f6, _f7 };
				// at com.palladium.utility.UserSelectionUtil.findUserSelections(UserSelectionUtil.java:18)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowTuples", argument_types)) {
				return new ViewTuple[] { _f3 };
				// at com.palladium.utility.UserSelectionUtil.findUserSelections(UserSelectionUtil.java:19)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getColTuples", argument_types)) {
				return null;
				// at com.palladium.utility.UserSelectionUtil.findUserSelections(UserSelectionUtil.java:20)
			}
		}
		if (Stubs.matches(method, PageTuple.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMember", argument_types)) {
				return "";
				// at com.palladium.utility.UserSelectionUtil.findUserSelections(UserSelectionUtil.java:24)
			}
		}
		if (Stubs.matches(method, ViewTuple.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberDefs", argument_types)) {
				return new String[1];
				// at com.palladium.utility.UserSelectionUtil.findUserSelections(UserSelectionUtil.java:32)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static findUserSelections(com.palladium.paf.view.PafViewSection)
	 * @throws Throwable Tests may throw any Throwable
	 * @see UserSelectionUtil#findUserSelections(com.palladium.paf.view.PafViewSection)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindUserSelections23() throws Throwable {
		PafViewSection t0 = new PafViewSection();
		PafDataSlice t1 = new PafDataSlice();
		Integer t2 = new Integer(0);
		Integer t3 = new Integer("0");
		_f3 = new ViewTuple();
		Integer t5 = new Integer("0");
		PafBorder t6 = new PafBorder();
		Boolean t7 = new Boolean(false);
		Boolean t8 = new Boolean((String) null);
		PafNumberFormat t9 = new PafNumberFormat((String) null, (String) null);
		Short t10 = new Short((short) -32768);
		Boolean t11 = new Boolean((String) null);
		Boolean t12 = new Boolean(false);
		Boolean t13 = new Boolean(false);
		PafStyle t14 = new PafStyle();
		PafStyle t15 = new PafStyle();
		Integer t16 = new Integer(0);
		PafAlignment t17 = new PafAlignment();
		Boolean t18 = new Boolean((String) null);
		Boolean t19 = new Boolean((String) null);
		Boolean t20 = new Boolean(false);
		Boolean t21 = new Boolean(false);
		Boolean t22 = new Boolean((String) null);
		PafBorder t23 = new PafBorder(0);
		Integer t24 = new Integer(0);
		Integer t25 = new Integer("0");
		_f9 = new ViewTuple((Integer) null, (String[]) null);
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
		_f3.setAxis(t5);
		_f3.setBorder(t6);
		_f3.setDrillable(t7);
		_f3.setExpanded(t8);
		String[] var9 = new String[] {};
		_f3.setMemberDefs(var9);
		_f3.setNumberFormat(t9);
		_f3.setOrder(t10);
		_f3.setOverrideLabel("");
		_f3.setParentFirst(t11);
		_f3.setPlannable(t12);
		_f3.setVisible(t13);
		_f3.setDataGlobalStyleName("");
		_f3.setDataStyle(t14);
		_f3.setHeaderGlobalStyleName("");
		t15.setSize(t16);
		t15.setAlignment(t17);
		t15.setBgFillColor("");
		t15.setFontColor("");
		t15.setFontName("");
		t15.setName("");
		t15.setBold(t18);
		t15.setDoubleUnderline(t19);
		t15.setItalics(t20);
		t15.setStrikeOut(t21);
		t15.setUnderline(t22);
		_f3.setHeaderStyle(t15);
		_f3.setNumberFormatOverrideLabel("");
		_f3.setHeaderBorder(t23);
		_f3.setColumnWidth(t24);
		_f3.setRowHeight(t25);
		Integer[] var10 = new Integer[] {};
		_f3.setSymetricGroupNo(var10);
		Integer[] var11 = new Integer[] {};
		_f3.setDerivedHeaderGroupNo(var11);
		// jtest_tested_method
		Set RETVAL = UserSelectionUtil.findUserSelections(t0);
		// NullPointerException thrown
		// at com.palladium.utility.UserSelectionUtil.findUserSelections(UserSelectionUtil.java:43)
		// jtest_unverified
	}

	/**
	 * Stubs method for testFindUserSelections23.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsFindUserSelections23(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafViewSection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPageTuples", argument_types)) {
				return new PageTuple[0];
				// at com.palladium.utility.UserSelectionUtil.findUserSelections(UserSelectionUtil.java:18)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowTuples", argument_types)) {
				return new ViewTuple[0];
				// at com.palladium.utility.UserSelectionUtil.findUserSelections(UserSelectionUtil.java:19)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getColTuples", argument_types)) {
				return new ViewTuple[] { _f3, _f9 };
				// at com.palladium.utility.UserSelectionUtil.findUserSelections(UserSelectionUtil.java:20)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static getUserSelectionMember(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see UserSelectionUtil#getUserSelectionMember(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetUserSelectionMember1() throws Throwable {
		// jtest_tested_method
		String RETVAL = UserSelectionUtil.getUserSelectionMember((String) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.utility.UserSelectionUtil.getUserSelectionMember(Ljava/lang/String;)Ljava/lang/String;>
		// at com.palladium.utility.UserSelectionUtil.getUserSelectionMember(UserSelectionUtil.java:57)
		// jtest_unverified
	}

	/**
	 * Test for method: static getUserSelectionMember(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see UserSelectionUtil#getUserSelectionMember(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetUserSelectionMember2() throws Throwable {
		// jtest_tested_method
		String RETVAL = UserSelectionUtil.getUserSelectionMember("");
		// StringIndexOutOfBoundsException thrown
		// at java.lang.String.substring(String.java:1768)
		// at com.palladium.utility.UserSelectionUtil.getUserSelectionMember(UserSelectionUtil.java:62)
		// jtest_unverified
	}

	/**
	 * Test for method: static main(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see UserSelectionUtil#main(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testMain1() throws Throwable {
		String[] var1 = new String[] {};
		// jtest_tested_method
		UserSelectionUtil.main(var1);
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
	 * Usage: java com.palladium.utility.UserSelectionUtilTest
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
			UserSelectionUtilTest.class,
			// fully qualified name of the tested class
			"com.palladium.utility.UserSelectionUtil",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return UserSelectionUtil.class;
	}

		/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PageTuple _f0;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PageTuple _f1;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PageTuple _f2;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private ViewTuple _f3;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PageTuple _f4;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PageTuple _f5;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PageTuple _f6;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PageTuple _f7;
		/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private ViewTuple _f9;
										}

// JTEST_CURRENT_ID=988819279.