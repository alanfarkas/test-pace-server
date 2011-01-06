/*
 * ViewTupleTest.java
 * Created by Jtest on 9/19/06 5:28:44 PM.
 * Updated by Jtest on 10/18/06 7:45:47 PM, 13 test cases added, 13 test cases removed.
 */

package com.palladium.paf.view;

import com.palladium.paf.view.ViewTuple;

/**
 * ViewTupleTest is a unit test class for class ViewTuple.
 * @see com.palladium.paf.view.ViewTuple
 * @author Parasoft Jtest 8.0
 */
public class ViewTupleTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public ViewTupleTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: clone()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#clone()
	 * @author Parasoft Jtest 8.0
	 */
	public void testClone1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer("0");
		PafBorder t2 = new PafBorder(0);
		Boolean t3 = new Boolean(false);
		Boolean t4 = new Boolean(false);
		PafNumberFormat t5 = new PafNumberFormat((String) null, (String) null);
		Short t6 = new Short((short) -32768);
		Boolean t7 = new Boolean((String) null);
		Boolean t8 = new Boolean(false);
		Boolean t9 = new Boolean(false);
		PafStyle t10 = new PafStyle();
		PafStyle t11 = new PafStyle();
		Integer t12 = new Integer("0");
		PafAlignment t13 = new PafAlignment();
		Boolean t14 = new Boolean(false);
		Boolean t15 = new Boolean((String) null);
		Boolean t16 = new Boolean(false);
		Boolean t17 = new Boolean(false);
		Boolean t18 = new Boolean(false);
		PafBorder t19 = new PafBorder(0);
		Integer t20 = new Integer("0");
		Integer t21 = new Integer(0);
		THIS.setAxis(t1);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		t5.setName("");
		t5.setPattern("");
		t5.setDefaultFormat(false);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		t11.setSize(t12);
		t11.setAlignment(t13);
		t11.setBgFillColor("");
		t11.setFontColor("");
		t11.setFontName("");
		t11.setName("");
		t11.setBold(t14);
		t11.setDoubleUnderline(t15);
		t11.setItalics(t16);
		t11.setStrikeOut(t17);
		t11.setUnderline(t18);
		THIS.setHeaderStyle(t11);
		THIS.setNumberFormatOverrideLabel("");
		t19.setBorder(0);
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		Object RETVAL = THIS.clone();
		assertTrue(RETVAL instanceof ViewTuple); // jtest_unverified
		assertEquals(t1, ((ViewTuple) RETVAL).getAxis()); // jtest_unverified
		assertNotNull(((ViewTuple) RETVAL).getBorder()); // jtest_unverified
		assertEquals(0, ((ViewTuple) RETVAL).getBorder().getBorder()); // jtest_unverified
		assertEquals(false, ((ViewTuple) RETVAL).getBorder().isLeft()); // jtest_unverified
		assertEquals(false, ((ViewTuple) RETVAL).getBorder().isRight()); // jtest_unverified
		assertEquals(false, ((ViewTuple) RETVAL).getBorder().isTop()); // jtest_unverified
		assertEquals(false, ((ViewTuple) RETVAL).getBorder().isBottom()); // jtest_unverified
		assertEquals(false, ((ViewTuple) RETVAL).getBorder().isAll()); // jtest_unverified
		assertEquals(t1, ((ViewTuple) RETVAL).getColumnWidth()); // jtest_unverified
		assertEquals("", ((ViewTuple) RETVAL).getDataGlobalStyleName()); // jtest_unverified
		assertNotNull(((ViewTuple) RETVAL).getDataStyle()); // jtest_unverified
		assertEquals(null, ((ViewTuple) RETVAL).getDataStyle().getName()); // jtest_unverified
		assertEquals(null, ((ViewTuple) RETVAL).getDataStyle().getSize()); // jtest_unverified
		assertEquals(null, ((ViewTuple) RETVAL).getDataStyle().getAlignment()); // jtest_unverified
		assertEquals(null, ((ViewTuple) RETVAL).getDataStyle().getBgFillColor()); // jtest_unverified
		assertEquals(null, ((ViewTuple) RETVAL).getDataStyle().getFontColor()); // jtest_unverified
		assertEquals(null, ((ViewTuple) RETVAL).getDataStyle().getFontName()); // jtest_unverified
		assertEquals(null, ((ViewTuple) RETVAL).getDataStyle().getBold()); // jtest_unverified
		assertEquals(t3, ((ViewTuple) RETVAL).getDataStyle()
			.getDoubleUnderline()); // jtest_unverified
		assertEquals(var3, ((ViewTuple) RETVAL).getDerivedHeaderGroupNo()); // jtest_unverified
		assertEquals(t3, ((ViewTuple) RETVAL).getDrillable()); // jtest_unverified
		assertEquals(t3, ((ViewTuple) RETVAL).getExpanded()); // jtest_unverified
		assertEquals(t1, THIS.getAxis()); // jtest_unverified
		assertEquals(t2, THIS.getBorder()); // jtest_unverified
		assertEquals(t1, THIS.getColumnWidth()); // jtest_unverified
		assertEquals("", THIS.getDataGlobalStyleName()); // jtest_unverified
		assertEquals(t10, THIS.getDataStyle()); // jtest_unverified
		assertEquals(var3, THIS.getDerivedHeaderGroupNo()); // jtest_unverified
		assertEquals(t3, THIS.getDrillable()); // jtest_unverified
		assertEquals(t3, THIS.getExpanded()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: clone()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#clone()
	 * @author Parasoft Jtest 8.0
	 */
	public void testClone3() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer(7);
		PafBorder t2 = new PafBorder();
		Boolean t3 = new Boolean("");
		Boolean t4 = new Boolean(true);
		PafNumberFormat t5 = new PafNumberFormat();
		Short t6 = new Short("0");
		Boolean t7 = new Boolean(true);
		Boolean t8 = new Boolean(true);
		Boolean t9 = new Boolean("");
		PafStyle t10 = new PafStyle();
		Integer t11 = new Integer("0");
		PafAlignment t12 = new PafAlignment();
		Boolean t13 = new Boolean(true);
		Boolean t14 = new Boolean(true);
		Boolean t15 = new Boolean(true);
		Boolean t16 = new Boolean("");
		Boolean t17 = new Boolean(true);
		PafStyle t18 = new PafStyle();
		PafBorder t19 = new PafBorder(7);
		Integer t20 = new Integer("0");
		Integer t21 = new Integer("0");
		THIS.setAxis(t1);
		t2.setBorder(7);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		t10.setSize(t11);
		t12.setValue("");
		t10.setAlignment(t12);
		t10.setBgFillColor("");
		t10.setFontColor("");
		t10.setFontName("");
		t10.setName("");
		t10.setBold(t13);
		t10.setDoubleUnderline(t14);
		t10.setItalics(t15);
		t10.setStrikeOut(t16);
		t10.setUnderline(t17);
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		THIS.setHeaderStyle(t18);
		THIS.setNumberFormatOverrideLabel("");
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		Object RETVAL = THIS.clone();
		assertTrue(RETVAL instanceof ViewTuple); // jtest_unverified
		assertEquals(t1, ((ViewTuple) RETVAL).getAxis()); // jtest_unverified
		assertNotNull(((ViewTuple) RETVAL).getBorder()); // jtest_unverified
		assertEquals(7, ((ViewTuple) RETVAL).getBorder().getBorder()); // jtest_unverified
		assertEquals(true, ((ViewTuple) RETVAL).getBorder().isLeft()); // jtest_unverified
		assertEquals(true, ((ViewTuple) RETVAL).getBorder().isRight()); // jtest_unverified
		assertEquals(false, ((ViewTuple) RETVAL).getBorder().isTop()); // jtest_unverified
		assertEquals(false, ((ViewTuple) RETVAL).getBorder().isBottom()); // jtest_unverified
		assertEquals(false, ((ViewTuple) RETVAL).getBorder().isAll()); // jtest_unverified
		assertEquals(t11, ((ViewTuple) RETVAL).getColumnWidth()); // jtest_unverified
		assertEquals("", ((ViewTuple) RETVAL).getDataGlobalStyleName()); // jtest_unverified
		assertNotNull(((ViewTuple) RETVAL).getDataStyle()); // jtest_unverified
		assertEquals("", ((ViewTuple) RETVAL).getDataStyle().getName()); // jtest_unverified
		assertEquals(t11, ((ViewTuple) RETVAL).getDataStyle().getSize()); // jtest_unverified
		assertNotNull(((ViewTuple) RETVAL).getDataStyle().getAlignment()); // jtest_unverified
		assertEquals("", ((ViewTuple) RETVAL).getDataStyle().getAlignment()
			.getValue()); // jtest_unverified
		assertEquals("", ((ViewTuple) RETVAL).getDataStyle().getBgFillColor()); // jtest_unverified
		assertEquals("", ((ViewTuple) RETVAL).getDataStyle().getFontColor()); // jtest_unverified
		assertEquals("", ((ViewTuple) RETVAL).getDataStyle().getFontName()); // jtest_unverified
		assertEquals(t4, ((ViewTuple) RETVAL).getDataStyle().getBold()); // jtest_unverified
		assertEquals(t4, ((ViewTuple) RETVAL).getDataStyle()
			.getDoubleUnderline()); // jtest_unverified
		assertEquals(var3, ((ViewTuple) RETVAL).getDerivedHeaderGroupNo()); // jtest_unverified
		assertEquals(t3, ((ViewTuple) RETVAL).getDrillable()); // jtest_unverified
		assertEquals(t4, ((ViewTuple) RETVAL).getExpanded()); // jtest_unverified
		assertEquals(t1, THIS.getAxis()); // jtest_unverified
		assertEquals(t2, THIS.getBorder()); // jtest_unverified
		assertEquals(t11, THIS.getColumnWidth()); // jtest_unverified
		assertEquals("", THIS.getDataGlobalStyleName()); // jtest_unverified
		assertEquals(t10, THIS.getDataStyle()); // jtest_unverified
		assertEquals(var3, THIS.getDerivedHeaderGroupNo()); // jtest_unverified
		assertEquals(t3, THIS.getDrillable()); // jtest_unverified
		assertEquals(t4, THIS.getExpanded()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: clone()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#clone()
	 * @author Parasoft Jtest 8.0
	 */
	public void testClone4() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		// jtest_tested_method
		Object RETVAL = THIS.clone();
		// NullPointerException thrown
		// at com.palladium.paf.view.ViewTuple.clone(ViewTuple.java:155)
		// jtest_unverified
	}

	/**
	 * Test for method: clone()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#clone()
	 * @author Parasoft Jtest 8.0
	 */
	public void testClone5() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer("0");
		PafBorder t2 = new PafBorder();
		Boolean t3 = new Boolean((String) null);
		Boolean t4 = new Boolean((String) null);
		PafNumberFormat t5 = new PafNumberFormat((String) null, (String) null);
		Short t6 = new Short((short) -32768);
		Boolean t7 = new Boolean(false);
		Boolean t8 = new Boolean(false);
		Boolean t9 = new Boolean((String) null);
		PafStyle t10 = new PafStyle();
		PafStyle t11 = new PafStyle();
		Integer t12 = new Integer("0");
		PafAlignment t13 = new PafAlignment();
		Boolean t14 = new Boolean((String) null);
		Boolean t15 = new Boolean(false);
		Boolean t16 = new Boolean(false);
		Boolean t17 = new Boolean((String) null);
		Boolean t18 = new Boolean((String) null);
		PafBorder t19 = new PafBorder();
		Integer t20 = new Integer(0);
		Integer t21 = new Integer("0");
		THIS.setAxis(t1);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		t11.setSize(t12);
		t11.setAlignment(t13);
		t11.setBgFillColor("");
		t11.setFontColor("");
		t11.setFontName("");
		t11.setName("");
		t11.setBold(t14);
		t11.setDoubleUnderline(t15);
		t11.setItalics(t16);
		t11.setStrikeOut(t17);
		t11.setUnderline(t18);
		THIS.setHeaderStyle(t11);
		THIS.setNumberFormatOverrideLabel("");
		t19.setBorder(0);
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		ViewTuple RETVAL = THIS.clone();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(t1, RETVAL.getAxis()); // jtest_unverified
		assertNotNull(RETVAL.getBorder()); // jtest_unverified
		assertEquals(0, RETVAL.getBorder().getBorder()); // jtest_unverified
		assertEquals(false, RETVAL.getBorder().isLeft()); // jtest_unverified
		assertEquals(false, RETVAL.getBorder().isRight()); // jtest_unverified
		assertEquals(false, RETVAL.getBorder().isTop()); // jtest_unverified
		assertEquals(false, RETVAL.getBorder().isBottom()); // jtest_unverified
		assertEquals(false, RETVAL.getBorder().isAll()); // jtest_unverified
		assertEquals(t1, RETVAL.getColumnWidth()); // jtest_unverified
		assertEquals("", RETVAL.getDataGlobalStyleName()); // jtest_unverified
		assertNotNull(RETVAL.getDataStyle()); // jtest_unverified
		assertEquals(null, RETVAL.getDataStyle().getName()); // jtest_unverified
		assertEquals(null, RETVAL.getDataStyle().getSize()); // jtest_unverified
		assertEquals(null, RETVAL.getDataStyle().getAlignment()); // jtest_unverified
		assertEquals(null, RETVAL.getDataStyle().getBgFillColor()); // jtest_unverified
		assertEquals(null, RETVAL.getDataStyle().getFontColor()); // jtest_unverified
		assertEquals(null, RETVAL.getDataStyle().getFontName()); // jtest_unverified
		assertEquals(null, RETVAL.getDataStyle().getBold()); // jtest_unverified
		assertEquals(t3, RETVAL.getDataStyle().getDoubleUnderline()); // jtest_unverified
		assertEquals(var3, RETVAL.getDerivedHeaderGroupNo()); // jtest_unverified
		assertEquals(t3, RETVAL.getDrillable()); // jtest_unverified
		assertEquals(t3, RETVAL.getExpanded()); // jtest_unverified
		assertEquals(t1, THIS.getAxis()); // jtest_unverified
		assertEquals(t2, THIS.getBorder()); // jtest_unverified
		assertEquals(t1, THIS.getColumnWidth()); // jtest_unverified
		assertEquals("", THIS.getDataGlobalStyleName()); // jtest_unverified
		assertEquals(t10, THIS.getDataStyle()); // jtest_unverified
		assertEquals(var3, THIS.getDerivedHeaderGroupNo()); // jtest_unverified
		assertEquals(t3, THIS.getDrillable()); // jtest_unverified
		assertEquals(t3, THIS.getExpanded()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getAxis()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getAxis()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAxis1() throws Throwable {
		ViewTuple THIS = new ViewTuple((Integer) null, (String[]) null);
		// jtest_tested_method
		Integer RETVAL = THIS.getAxis();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getAxis()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getAxis()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAxis2() throws Throwable {
		ViewTuple THIS = new ViewTuple((Integer) null, (String[]) null);
		Integer t1 = new Integer("0");
		PafBorder t2 = new PafBorder(0);
		Boolean t3 = new Boolean(false);
		Boolean t4 = new Boolean((String) null);
		PafNumberFormat t5 = new PafNumberFormat((String) null, (String) null);
		Short t6 = new Short((short) -32768);
		Boolean t7 = new Boolean(false);
		Boolean t8 = new Boolean((String) null);
		Boolean t9 = new Boolean((String) null);
		PafStyle t10 = new PafStyle();
		PafStyle t11 = new PafStyle();
		Integer t12 = new Integer(0);
		PafAlignment t13 = new PafAlignment();
		Boolean t14 = new Boolean(false);
		Boolean t15 = new Boolean(false);
		Boolean t16 = new Boolean((String) null);
		Boolean t17 = new Boolean((String) null);
		Boolean t18 = new Boolean(false);
		PafBorder t19 = new PafBorder();
		Integer t20 = new Integer("0");
		Integer t21 = new Integer("0");
		THIS.setAxis(t1);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		t11.setSize(t12);
		t11.setAlignment(t13);
		t11.setBgFillColor("");
		t11.setFontColor("");
		t11.setFontName("");
		t11.setName("");
		t11.setBold(t14);
		t11.setDoubleUnderline(t15);
		t11.setItalics(t16);
		t11.setStrikeOut(t17);
		t11.setUnderline(t18);
		THIS.setHeaderStyle(t11);
		THIS.setNumberFormatOverrideLabel("");
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		Integer RETVAL = THIS.getAxis();
		assertEquals(t1, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getBorder()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getBorder()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetBorder1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		// jtest_tested_method
		PafBorder RETVAL = THIS.getBorder();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getBorder()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getBorder()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetBorder2() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer(7);
		PafBorder t2 = new PafBorder(7);
		Boolean t3 = new Boolean(true);
		Boolean t4 = new Boolean("");
		PafNumberFormat t5 = new PafNumberFormat();
		Short t6 = new Short("0");
		Boolean t7 = new Boolean("");
		Boolean t8 = new Boolean(true);
		Boolean t9 = new Boolean(true);
		PafStyle t10 = new PafStyle();
		Integer t11 = new Integer("0");
		PafAlignment t12 = new PafAlignment();
		Boolean t13 = new Boolean("");
		Boolean t14 = new Boolean("");
		Boolean t15 = new Boolean(true);
		Boolean t16 = new Boolean(true);
		Boolean t17 = new Boolean("");
		PafStyle t18 = new PafStyle();
		PafBorder t19 = new PafBorder();
		Integer t20 = new Integer("0");
		Integer t21 = new Integer("0");
		THIS.setAxis(t1);
		t2.setBorder(7);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		t10.setSize(t11);
		t12.setValue("");
		t10.setAlignment(t12);
		t10.setBgFillColor("");
		t10.setFontColor("");
		t10.setFontName("");
		t10.setName("");
		t10.setBold(t13);
		t10.setDoubleUnderline(t14);
		t10.setItalics(t15);
		t10.setStrikeOut(t16);
		t10.setUnderline(t17);
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		THIS.setHeaderStyle(t18);
		THIS.setNumberFormatOverrideLabel("");
		t19.setBorder(7);
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		PafBorder RETVAL = THIS.getBorder();
		assertEquals(t2, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getColumnWidth()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getColumnWidth()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetColumnWidth1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		// jtest_tested_method
		Integer RETVAL = THIS.getColumnWidth();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getColumnWidth()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getColumnWidth()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetColumnWidth2() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer(7);
		PafBorder t2 = new PafBorder();
		Boolean t3 = new Boolean(true);
		Boolean t4 = new Boolean("");
		PafNumberFormat t5 = new PafNumberFormat("", "");
		Short t6 = new Short((short) 7);
		Boolean t7 = new Boolean("");
		Boolean t8 = new Boolean(true);
		Boolean t9 = new Boolean(true);
		PafStyle t10 = new PafStyle();
		Integer t11 = new Integer("0");
		PafAlignment t12 = new PafAlignment();
		Boolean t13 = new Boolean("");
		Boolean t14 = new Boolean(true);
		Boolean t15 = new Boolean("");
		Boolean t16 = new Boolean("");
		Boolean t17 = new Boolean(true);
		PafStyle t18 = new PafStyle();
		PafBorder t19 = new PafBorder(7);
		Integer t20 = new Integer("0");
		Integer t21 = new Integer("0");
		THIS.setAxis(t1);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		t5.setName("");
		t5.setPattern("");
		t5.setDefaultFormat(true);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		t10.setSize(t11);
		t12.setValue("");
		t10.setAlignment(t12);
		t10.setBgFillColor("");
		t10.setFontColor("");
		t10.setFontName("");
		t10.setName("");
		t10.setBold(t13);
		t10.setDoubleUnderline(t14);
		t10.setItalics(t15);
		t10.setStrikeOut(t16);
		t10.setUnderline(t17);
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		THIS.setHeaderStyle(t18);
		THIS.setNumberFormatOverrideLabel("");
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		Integer RETVAL = THIS.getColumnWidth();
		assertEquals(t11, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDataGlobalStyleName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getDataGlobalStyleName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataGlobalStyleName1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		// jtest_tested_method
		String RETVAL = THIS.getDataGlobalStyleName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDataGlobalStyleName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getDataGlobalStyleName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataGlobalStyleName2() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer(7);
		PafBorder t2 = new PafBorder();
		Boolean t3 = new Boolean("");
		Boolean t4 = new Boolean("");
		PafNumberFormat t5 = new PafNumberFormat("", "");
		Short t6 = new Short((short) 7);
		Boolean t7 = new Boolean(true);
		Boolean t8 = new Boolean("");
		Boolean t9 = new Boolean("");
		PafStyle t10 = new PafStyle();
		Integer t11 = new Integer("0");
		PafAlignment t12 = new PafAlignment();
		Boolean t13 = new Boolean("");
		Boolean t14 = new Boolean(true);
		Boolean t15 = new Boolean("");
		Boolean t16 = new Boolean("");
		Boolean t17 = new Boolean("");
		PafStyle t18 = new PafStyle();
		PafBorder t19 = new PafBorder();
		Integer t20 = new Integer("0");
		Integer t21 = new Integer("0");
		THIS.setAxis(t1);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		t5.setName("");
		t5.setPattern("");
		t5.setDefaultFormat(true);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		t10.setSize(t11);
		t12.setValue("");
		t10.setAlignment(t12);
		t10.setBgFillColor("");
		t10.setFontColor("");
		t10.setFontName("");
		t10.setName("");
		t10.setBold(t13);
		t10.setDoubleUnderline(t14);
		t10.setItalics(t15);
		t10.setStrikeOut(t16);
		t10.setUnderline(t17);
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		THIS.setHeaderStyle(t18);
		THIS.setNumberFormatOverrideLabel("");
		t19.setBorder(7);
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		String RETVAL = THIS.getDataGlobalStyleName();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDataStyle()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getDataStyle()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataStyle1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		// jtest_tested_method
		PafStyle RETVAL = THIS.getDataStyle();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDataStyle()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getDataStyle()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataStyle2() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer(7);
		PafBorder t2 = new PafBorder();
		Boolean t3 = new Boolean(true);
		Boolean t4 = new Boolean("");
		PafNumberFormat t5 = new PafNumberFormat("", "");
		Short t6 = new Short((short) 7);
		Boolean t7 = new Boolean(true);
		Boolean t8 = new Boolean("");
		Boolean t9 = new Boolean("");
		PafStyle t10 = new PafStyle();
		Integer t11 = new Integer("0");
		PafAlignment t12 = new PafAlignment();
		Boolean t13 = new Boolean(true);
		Boolean t14 = new Boolean(true);
		Boolean t15 = new Boolean("");
		Boolean t16 = new Boolean("");
		Boolean t17 = new Boolean(true);
		PafStyle t18 = new PafStyle();
		PafBorder t19 = new PafBorder();
		Integer t20 = new Integer("0");
		Integer t21 = new Integer("0");
		THIS.setAxis(t1);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		t5.setName("");
		t5.setPattern("");
		t5.setDefaultFormat(true);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		t10.setSize(t11);
		t12.setValue("");
		t10.setAlignment(t12);
		t10.setBgFillColor("");
		t10.setFontColor("");
		t10.setFontName("");
		t10.setName("");
		t10.setBold(t13);
		t10.setDoubleUnderline(t14);
		t10.setItalics(t15);
		t10.setStrikeOut(t16);
		t10.setUnderline(t17);
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		THIS.setHeaderStyle(t18);
		THIS.setNumberFormatOverrideLabel("");
		t19.setBorder(7);
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		PafStyle RETVAL = THIS.getDataStyle();
		assertEquals(t10, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDerivedHeaderGroupNo()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getDerivedHeaderGroupNo()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDerivedHeaderGroupNo1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		// jtest_tested_method
		Integer[] RETVAL = THIS.getDerivedHeaderGroupNo();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDerivedHeaderGroupNo()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getDerivedHeaderGroupNo()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDerivedHeaderGroupNo2() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer("0");
		PafBorder t2 = new PafBorder(7);
		Boolean t3 = new Boolean(true);
		Boolean t4 = new Boolean(true);
		PafNumberFormat t5 = new PafNumberFormat("", "");
		Short t6 = new Short((short) 7);
		Boolean t7 = new Boolean("");
		Boolean t8 = new Boolean(true);
		Boolean t9 = new Boolean(true);
		PafStyle t10 = new PafStyle();
		Integer t11 = new Integer("0");
		PafAlignment t12 = new PafAlignment();
		Boolean t13 = new Boolean(true);
		Boolean t14 = new Boolean("");
		Boolean t15 = new Boolean(true);
		Boolean t16 = new Boolean(true);
		Boolean t17 = new Boolean(true);
		PafStyle t18 = new PafStyle();
		PafBorder t19 = new PafBorder(7);
		Integer t20 = new Integer("0");
		Integer t21 = new Integer(7);
		THIS.setAxis(t1);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		t5.setName("");
		t5.setPattern("");
		t5.setDefaultFormat(true);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		t10.setSize(t11);
		t12.setValue("");
		t10.setAlignment(t12);
		t10.setBgFillColor("");
		t10.setFontColor("");
		t10.setFontName("");
		t10.setName("");
		t10.setBold(t13);
		t10.setDoubleUnderline(t14);
		t10.setItalics(t15);
		t10.setStrikeOut(t16);
		t10.setUnderline(t17);
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		THIS.setHeaderStyle(t18);
		THIS.setNumberFormatOverrideLabel("");
		t19.setBorder(7);
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		Integer[] RETVAL = THIS.getDerivedHeaderGroupNo();
		assertEquals(var3, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDerivedHeaderGroupNo(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getDerivedHeaderGroupNo(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDerivedHeaderGroupNo5() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		// jtest_tested_method
		Integer RETVAL = THIS.getDerivedHeaderGroupNo(0);
		// IllegalArgumentException thrown
		// at com.palladium.paf.view.ViewTuple.getDerivedHeaderGroupNo(ViewTuple.java:352)
		// jtest_unverified
	}

	/**
	 * Test for method: getDerivedHeaderGroupNo(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getDerivedHeaderGroupNo(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDerivedHeaderGroupNo7() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer("0");
		PafBorder t2 = new PafBorder();
		Boolean t3 = new Boolean((String) null);
		Boolean t4 = new Boolean(false);
		PafNumberFormat t5 = new PafNumberFormat();
		Short t6 = new Short("0");
		Boolean t7 = new Boolean(false);
		Boolean t8 = new Boolean(false);
		Boolean t9 = new Boolean((String) null);
		PafStyle t10 = new PafStyle();
		PafStyle t11 = new PafStyle();
		Integer t12 = new Integer("0");
		PafAlignment t13 = new PafAlignment();
		Boolean t14 = new Boolean(false);
		Boolean t15 = new Boolean(false);
		Boolean t16 = new Boolean(false);
		Boolean t17 = new Boolean((String) null);
		Boolean t18 = new Boolean(false);
		PafBorder t19 = new PafBorder(0);
		Integer t20 = new Integer("0");
		Integer t21 = new Integer(0);
		THIS.setAxis(t1);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		t5.setName("");
		t5.setPattern("");
		t5.setDefaultFormat(false);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		t11.setSize(t12);
		t11.setAlignment(t13);
		t11.setBgFillColor("");
		t11.setFontColor("");
		t11.setFontName("");
		t11.setName("");
		t11.setBold(t14);
		t11.setDoubleUnderline(t15);
		t11.setItalics(t16);
		t11.setStrikeOut(t17);
		t11.setUnderline(t18);
		THIS.setHeaderStyle(t11);
		THIS.setNumberFormatOverrideLabel("");
		t19.setBorder(0);
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		Integer RETVAL = THIS.getDerivedHeaderGroupNo(0);
		// IllegalArgumentException thrown
		// at com.palladium.paf.view.ViewTuple.getDerivedHeaderGroupNo(ViewTuple.java:352)
		// jtest_unverified
	}

	/**
	 * Test for method: getDerivedHeaderGroupNo(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getDerivedHeaderGroupNo(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDerivedHeaderGroupNo8() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer("0");
		PafBorder t2 = new PafBorder(0);
		Boolean t3 = new Boolean(false);
		Boolean t4 = new Boolean(false);
		PafNumberFormat t5 = new PafNumberFormat((String) null, (String) null);
		Short t6 = new Short((short) -32768);
		Boolean t7 = new Boolean(false);
		Boolean t8 = new Boolean(false);
		Boolean t9 = new Boolean((String) null);
		PafStyle t10 = new PafStyle();
		PafStyle t11 = new PafStyle();
		Integer t12 = new Integer("0");
		PafAlignment t13 = new PafAlignment();
		Boolean t14 = new Boolean(false);
		Boolean t15 = new Boolean(false);
		Boolean t16 = new Boolean(false);
		Boolean t17 = new Boolean((String) null);
		Boolean t18 = new Boolean(false);
		PafBorder t19 = new PafBorder(0);
		Integer t20 = new Integer("0");
		Integer t21 = new Integer("0");
		THIS.setAxis(t1);
		t2.setBorder(0);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		t5.setName("");
		t5.setPattern("");
		t5.setDefaultFormat(false);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		t11.setSize(t12);
		t11.setAlignment(t13);
		t11.setBgFillColor("");
		t11.setFontColor("");
		t11.setFontName("");
		t11.setName("");
		t11.setBold(t14);
		t11.setDoubleUnderline(t15);
		t11.setItalics(t16);
		t11.setStrikeOut(t17);
		t11.setUnderline(t18);
		THIS.setHeaderStyle(t11);
		THIS.setNumberFormatOverrideLabel("");
		t19.setBorder(0);
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		Integer RETVAL = THIS.getDerivedHeaderGroupNo(-1);
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.view.ViewTuple.getDerivedHeaderGroupNo(ViewTuple.java:355)
		// jtest_unverified
	}

	/**
	 * Test for method: getDrillable()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getDrillable()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDrillable1() throws Throwable {
		ViewTuple THIS = new ViewTuple((Integer) null, (String[]) null);
		// jtest_tested_method
		Boolean RETVAL = THIS.getDrillable();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDrillable()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getDrillable()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDrillable2() throws Throwable {
		Integer t0 = new Integer("0");
		String[] var1 = new String[] {};
		ViewTuple THIS = new ViewTuple(t0, var1);
		Integer t2 = new Integer("0");
		PafBorder t3 = new PafBorder(7);
		Boolean t4 = new Boolean("");
		Boolean t5 = new Boolean(true);
		PafNumberFormat t6 = new PafNumberFormat("", "");
		Short t7 = new Short((short) 7);
		Boolean t8 = new Boolean(true);
		Boolean t9 = new Boolean("");
		Boolean t10 = new Boolean("");
		PafStyle t11 = new PafStyle();
		Integer t12 = new Integer(7);
		PafAlignment t13 = new PafAlignment();
		Boolean t14 = new Boolean(true);
		Boolean t15 = new Boolean(true);
		Boolean t16 = new Boolean("");
		Boolean t17 = new Boolean("");
		Boolean t18 = new Boolean(true);
		PafStyle t19 = new PafStyle();
		PafBorder t20 = new PafBorder(7);
		Integer t21 = new Integer("0");
		Integer t22 = new Integer("0");
		THIS.setAxis(t2);
		t3.setBorder(7);
		THIS.setBorder(t3);
		THIS.setDrillable(t4);
		THIS.setExpanded(t5);
		String[] var2 = new String[] {};
		THIS.setMemberDefs(var2);
		t6.setName("");
		t6.setPattern("");
		t6.setDefaultFormat(true);
		THIS.setNumberFormat(t6);
		THIS.setOrder(t7);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t8);
		THIS.setPlannable(t9);
		THIS.setVisible(t10);
		THIS.setDataGlobalStyleName("");
		t11.setSize(t12);
		t13.setValue("");
		t11.setAlignment(t13);
		t11.setBgFillColor("");
		t11.setFontColor("");
		t11.setFontName("");
		t11.setName("");
		t11.setBold(t14);
		t11.setDoubleUnderline(t15);
		t11.setItalics(t16);
		t11.setStrikeOut(t17);
		t11.setUnderline(t18);
		THIS.setDataStyle(t11);
		THIS.setHeaderGlobalStyleName("");
		THIS.setHeaderStyle(t19);
		THIS.setNumberFormatOverrideLabel("");
		THIS.setHeaderBorder(t20);
		THIS.setColumnWidth(t21);
		THIS.setRowHeight(t22);
		Integer[] var3 = new Integer[] {};
		THIS.setSymetricGroupNo(var3);
		Integer[] var4 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var4);
		// jtest_tested_method
		Boolean RETVAL = THIS.getDrillable();
		assertEquals(t4, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getExpanded()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getExpanded()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetExpanded1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		// jtest_tested_method
		Boolean RETVAL = THIS.getExpanded();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getExpanded()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getExpanded()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetExpanded2() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer(7);
		PafBorder t2 = new PafBorder();
		Boolean t3 = new Boolean("");
		Boolean t4 = new Boolean("");
		PafNumberFormat t5 = new PafNumberFormat("", "");
		Short t6 = new Short((short) 7);
		Boolean t7 = new Boolean(true);
		Boolean t8 = new Boolean(true);
		Boolean t9 = new Boolean("");
		PafStyle t10 = new PafStyle();
		Integer t11 = new Integer(7);
		PafAlignment t12 = new PafAlignment();
		Boolean t13 = new Boolean("");
		Boolean t14 = new Boolean(true);
		Boolean t15 = new Boolean(true);
		Boolean t16 = new Boolean("");
		Boolean t17 = new Boolean("");
		PafStyle t18 = new PafStyle();
		PafBorder t19 = new PafBorder();
		Integer t20 = new Integer("0");
		Integer t21 = new Integer("0");
		THIS.setAxis(t1);
		t2.setBorder(7);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		t10.setSize(t11);
		t12.setValue("");
		t10.setAlignment(t12);
		t10.setBgFillColor("");
		t10.setFontColor("");
		t10.setFontName("");
		t10.setName("");
		t10.setBold(t13);
		t10.setDoubleUnderline(t14);
		t10.setItalics(t15);
		t10.setStrikeOut(t16);
		t10.setUnderline(t17);
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		THIS.setHeaderStyle(t18);
		THIS.setNumberFormatOverrideLabel("");
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		Boolean RETVAL = THIS.getExpanded();
		assertEquals(t3, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getHeaderBorder()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getHeaderBorder()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetHeaderBorder1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		// jtest_tested_method
		PafBorder RETVAL = THIS.getHeaderBorder();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getHeaderBorder()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getHeaderBorder()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetHeaderBorder2() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer(7);
		PafBorder t2 = new PafBorder();
		Boolean t3 = new Boolean("");
		Boolean t4 = new Boolean("");
		PafNumberFormat t5 = new PafNumberFormat("", "");
		Short t6 = new Short((short) 7);
		Boolean t7 = new Boolean("");
		Boolean t8 = new Boolean(true);
		Boolean t9 = new Boolean(true);
		PafStyle t10 = new PafStyle();
		Integer t11 = new Integer("0");
		PafAlignment t12 = new PafAlignment();
		Boolean t13 = new Boolean("");
		Boolean t14 = new Boolean("");
		Boolean t15 = new Boolean(true);
		Boolean t16 = new Boolean(true);
		Boolean t17 = new Boolean("");
		PafStyle t18 = new PafStyle();
		PafBorder t19 = new PafBorder();
		Integer t20 = new Integer("0");
		Integer t21 = new Integer("0");
		THIS.setAxis(t1);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		t5.setName("");
		t5.setPattern("");
		t5.setDefaultFormat(true);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		t10.setSize(t11);
		t12.setValue("");
		t10.setAlignment(t12);
		t10.setBgFillColor("");
		t10.setFontColor("");
		t10.setFontName("");
		t10.setName("");
		t10.setBold(t13);
		t10.setDoubleUnderline(t14);
		t10.setItalics(t15);
		t10.setStrikeOut(t16);
		t10.setUnderline(t17);
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		THIS.setHeaderStyle(t18);
		THIS.setNumberFormatOverrideLabel("");
		t19.setBorder(7);
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		PafBorder RETVAL = THIS.getHeaderBorder();
		assertEquals(t19, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getHeaderGlobalStyleName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getHeaderGlobalStyleName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetHeaderGlobalStyleName1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		// jtest_tested_method
		String RETVAL = THIS.getHeaderGlobalStyleName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getHeaderGlobalStyleName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getHeaderGlobalStyleName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetHeaderGlobalStyleName2() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer(7);
		PafBorder t2 = new PafBorder();
		Boolean t3 = new Boolean("");
		Boolean t4 = new Boolean(true);
		PafNumberFormat t5 = new PafNumberFormat("", "");
		Short t6 = new Short((short) 7);
		Boolean t7 = new Boolean(true);
		Boolean t8 = new Boolean("");
		Boolean t9 = new Boolean("");
		PafStyle t10 = new PafStyle();
		Integer t11 = new Integer("0");
		PafAlignment t12 = new PafAlignment();
		Boolean t13 = new Boolean(true);
		Boolean t14 = new Boolean(true);
		Boolean t15 = new Boolean("");
		Boolean t16 = new Boolean("");
		Boolean t17 = new Boolean("");
		PafStyle t18 = new PafStyle();
		PafBorder t19 = new PafBorder();
		Integer t20 = new Integer("0");
		Integer t21 = new Integer("0");
		THIS.setAxis(t1);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		t5.setName("");
		t5.setPattern("");
		t5.setDefaultFormat(true);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		t10.setSize(t11);
		t12.setValue("");
		t10.setAlignment(t12);
		t10.setBgFillColor("");
		t10.setFontColor("");
		t10.setFontName("");
		t10.setName("");
		t10.setBold(t13);
		t10.setDoubleUnderline(t14);
		t10.setItalics(t15);
		t10.setStrikeOut(t16);
		t10.setUnderline(t17);
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		THIS.setHeaderStyle(t18);
		THIS.setNumberFormatOverrideLabel("");
		t19.setBorder(7);
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		String RETVAL = THIS.getHeaderGlobalStyleName();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getHeaderStyle()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getHeaderStyle()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetHeaderStyle1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		// jtest_tested_method
		PafStyle RETVAL = THIS.getHeaderStyle();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getHeaderStyle()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getHeaderStyle()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetHeaderStyle2() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer(7);
		PafBorder t2 = new PafBorder();
		Boolean t3 = new Boolean(true);
		Boolean t4 = new Boolean("");
		PafNumberFormat t5 = new PafNumberFormat("", "");
		Short t6 = new Short((short) 7);
		Boolean t7 = new Boolean("");
		Boolean t8 = new Boolean(true);
		Boolean t9 = new Boolean(true);
		PafStyle t10 = new PafStyle();
		Integer t11 = new Integer("0");
		PafAlignment t12 = new PafAlignment();
		Boolean t13 = new Boolean("");
		Boolean t14 = new Boolean("");
		Boolean t15 = new Boolean(true);
		Boolean t16 = new Boolean(true);
		Boolean t17 = new Boolean("");
		PafStyle t18 = new PafStyle();
		PafBorder t19 = new PafBorder();
		Integer t20 = new Integer("0");
		Integer t21 = new Integer("0");
		THIS.setAxis(t1);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		t5.setName("");
		t5.setPattern("");
		t5.setDefaultFormat(true);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		t10.setSize(t11);
		t12.setValue("");
		t10.setAlignment(t12);
		t10.setBgFillColor("");
		t10.setFontColor("");
		t10.setFontName("");
		t10.setName("");
		t10.setBold(t13);
		t10.setDoubleUnderline(t14);
		t10.setItalics(t15);
		t10.setStrikeOut(t16);
		t10.setUnderline(t17);
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		THIS.setHeaderStyle(t18);
		THIS.setNumberFormatOverrideLabel("");
		t19.setBorder(7);
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		PafStyle RETVAL = THIS.getHeaderStyle();
		assertEquals(t18, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getMemberDefs()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getMemberDefs()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberDefs1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		// jtest_tested_method
		String[] RETVAL = THIS.getMemberDefs();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getMemberDefs()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getMemberDefs()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberDefs2() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer("0");
		PafBorder t2 = new PafBorder();
		Boolean t3 = new Boolean("");
		Boolean t4 = new Boolean(true);
		PafNumberFormat t5 = new PafNumberFormat();
		Short t6 = new Short("0");
		Boolean t7 = new Boolean(true);
		Boolean t8 = new Boolean("");
		Boolean t9 = new Boolean("");
		PafStyle t10 = new PafStyle();
		Integer t11 = new Integer(7);
		PafAlignment t12 = new PafAlignment();
		Boolean t13 = new Boolean(true);
		Boolean t14 = new Boolean(true);
		Boolean t15 = new Boolean("");
		Boolean t16 = new Boolean("");
		Boolean t17 = new Boolean(true);
		PafStyle t18 = new PafStyle();
		PafBorder t19 = new PafBorder();
		Integer t20 = new Integer("0");
		Integer t21 = new Integer("0");
		THIS.setAxis(t1);
		t2.setBorder(7);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		t10.setSize(t11);
		t12.setValue("");
		t10.setAlignment(t12);
		t10.setBgFillColor("");
		t10.setFontColor("");
		t10.setFontName("");
		t10.setName("");
		t10.setBold(t13);
		t10.setDoubleUnderline(t14);
		t10.setItalics(t15);
		t10.setStrikeOut(t16);
		t10.setUnderline(t17);
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		THIS.setHeaderStyle(t18);
		THIS.setNumberFormatOverrideLabel("");
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		String[] RETVAL = THIS.getMemberDefs();
		assertEquals(var1, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getNumberFormat()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getNumberFormat()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetNumberFormat1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		// jtest_tested_method
		PafNumberFormat RETVAL = THIS.getNumberFormat();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getNumberFormat()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getNumberFormat()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetNumberFormat2() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer("0");
		PafBorder t2 = new PafBorder();
		Boolean t3 = new Boolean("");
		Boolean t4 = new Boolean(true);
		PafNumberFormat t5 = new PafNumberFormat("", "");
		Short t6 = new Short((short) 7);
		Boolean t7 = new Boolean(true);
		Boolean t8 = new Boolean("");
		Boolean t9 = new Boolean("");
		PafStyle t10 = new PafStyle();
		Integer t11 = new Integer("0");
		PafAlignment t12 = new PafAlignment();
		Boolean t13 = new Boolean(true);
		Boolean t14 = new Boolean(true);
		Boolean t15 = new Boolean("");
		Boolean t16 = new Boolean("");
		Boolean t17 = new Boolean(true);
		PafStyle t18 = new PafStyle();
		PafBorder t19 = new PafBorder();
		Integer t20 = new Integer(7);
		Integer t21 = new Integer("0");
		THIS.setAxis(t1);
		t2.setBorder(7);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		t10.setSize(t11);
		t12.setValue("");
		t10.setAlignment(t12);
		t10.setBgFillColor("");
		t10.setFontColor("");
		t10.setFontName("");
		t10.setName("");
		t10.setBold(t13);
		t10.setDoubleUnderline(t14);
		t10.setItalics(t15);
		t10.setStrikeOut(t16);
		t10.setUnderline(t17);
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		THIS.setHeaderStyle(t18);
		THIS.setNumberFormatOverrideLabel("");
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		PafNumberFormat RETVAL = THIS.getNumberFormat();
		assertEquals(t5, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getNumberFormatOverrideLabel()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getNumberFormatOverrideLabel()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetNumberFormatOverrideLabel1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		// jtest_tested_method
		String RETVAL = THIS.getNumberFormatOverrideLabel();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getNumberFormatOverrideLabel()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getNumberFormatOverrideLabel()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetNumberFormatOverrideLabel2() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer(7);
		PafBorder t2 = new PafBorder();
		Boolean t3 = new Boolean("");
		Boolean t4 = new Boolean(true);
		PafNumberFormat t5 = new PafNumberFormat("", "");
		Short t6 = new Short((short) 7);
		Boolean t7 = new Boolean(true);
		Boolean t8 = new Boolean("");
		Boolean t9 = new Boolean("");
		PafStyle t10 = new PafStyle();
		Integer t11 = new Integer("0");
		PafAlignment t12 = new PafAlignment();
		Boolean t13 = new Boolean(true);
		Boolean t14 = new Boolean(true);
		Boolean t15 = new Boolean("");
		Boolean t16 = new Boolean("");
		Boolean t17 = new Boolean(true);
		PafStyle t18 = new PafStyle();
		PafBorder t19 = new PafBorder();
		Integer t20 = new Integer("0");
		Integer t21 = new Integer("0");
		THIS.setAxis(t1);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		t5.setName("");
		t5.setPattern("");
		t5.setDefaultFormat(true);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		t10.setSize(t11);
		t12.setValue("");
		t10.setAlignment(t12);
		t10.setBgFillColor("");
		t10.setFontColor("");
		t10.setFontName("");
		t10.setName("");
		t10.setBold(t13);
		t10.setDoubleUnderline(t14);
		t10.setItalics(t15);
		t10.setStrikeOut(t16);
		t10.setUnderline(t17);
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		THIS.setHeaderStyle(t18);
		THIS.setNumberFormatOverrideLabel("");
		t19.setBorder(7);
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		String RETVAL = THIS.getNumberFormatOverrideLabel();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getOrder()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getOrder()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetOrder1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		// jtest_tested_method
		Short RETVAL = THIS.getOrder();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getOrder()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getOrder()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetOrder2() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer("0");
		PafBorder t2 = new PafBorder();
		Boolean t3 = new Boolean("");
		Boolean t4 = new Boolean(true);
		PafNumberFormat t5 = new PafNumberFormat("", "");
		Short t6 = new Short("0");
		Boolean t7 = new Boolean(true);
		Boolean t8 = new Boolean("");
		Boolean t9 = new Boolean("");
		PafStyle t10 = new PafStyle();
		Integer t11 = new Integer(7);
		PafAlignment t12 = new PafAlignment();
		Boolean t13 = new Boolean(true);
		Boolean t14 = new Boolean(true);
		Boolean t15 = new Boolean("");
		Boolean t16 = new Boolean("");
		Boolean t17 = new Boolean(true);
		PafStyle t18 = new PafStyle();
		PafBorder t19 = new PafBorder();
		Integer t20 = new Integer("0");
		Integer t21 = new Integer("0");
		THIS.setAxis(t1);
		t2.setBorder(7);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		t5.setName("");
		t5.setPattern("");
		t5.setDefaultFormat(true);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		t10.setSize(t11);
		t12.setValue("");
		t10.setAlignment(t12);
		t10.setBgFillColor("");
		t10.setFontColor("");
		t10.setFontName("");
		t10.setName("");
		t10.setBold(t13);
		t10.setDoubleUnderline(t14);
		t10.setItalics(t15);
		t10.setStrikeOut(t16);
		t10.setUnderline(t17);
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		THIS.setHeaderStyle(t18);
		THIS.setNumberFormatOverrideLabel("");
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		Short RETVAL = THIS.getOrder();
		assertEquals(t6, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getOverrideLabel()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getOverrideLabel()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetOverrideLabel1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		// jtest_tested_method
		String RETVAL = THIS.getOverrideLabel();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getOverrideLabel()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getOverrideLabel()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetOverrideLabel2() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer("0");
		PafBorder t2 = new PafBorder();
		Boolean t3 = new Boolean("");
		Boolean t4 = new Boolean(true);
		PafNumberFormat t5 = new PafNumberFormat();
		Short t6 = new Short("0");
		Boolean t7 = new Boolean(true);
		Boolean t8 = new Boolean("");
		Boolean t9 = new Boolean("");
		PafStyle t10 = new PafStyle();
		Integer t11 = new Integer("0");
		PafAlignment t12 = new PafAlignment();
		Boolean t13 = new Boolean(true);
		Boolean t14 = new Boolean(true);
		Boolean t15 = new Boolean("");
		Boolean t16 = new Boolean("");
		Boolean t17 = new Boolean(true);
		PafStyle t18 = new PafStyle();
		PafBorder t19 = new PafBorder();
		Integer t20 = new Integer(7);
		Integer t21 = new Integer("0");
		THIS.setAxis(t1);
		t2.setBorder(7);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		t10.setSize(t11);
		t12.setValue("");
		t10.setAlignment(t12);
		t10.setBgFillColor("");
		t10.setFontColor("");
		t10.setFontName("");
		t10.setName("");
		t10.setBold(t13);
		t10.setDoubleUnderline(t14);
		t10.setItalics(t15);
		t10.setStrikeOut(t16);
		t10.setUnderline(t17);
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		THIS.setHeaderStyle(t18);
		THIS.setNumberFormatOverrideLabel("");
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		String RETVAL = THIS.getOverrideLabel();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getParentFirst()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getParentFirst()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetParentFirst1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		// jtest_tested_method
		Boolean RETVAL = THIS.getParentFirst();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getParentFirst()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getParentFirst()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetParentFirst2() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer("0");
		PafBorder t2 = new PafBorder();
		Boolean t3 = new Boolean("");
		Boolean t4 = new Boolean(true);
		PafNumberFormat t5 = new PafNumberFormat("", "");
		Short t6 = new Short((short) 7);
		Boolean t7 = new Boolean(true);
		Boolean t8 = new Boolean("");
		Boolean t9 = new Boolean("");
		PafStyle t10 = new PafStyle();
		Integer t11 = new Integer(7);
		PafAlignment t12 = new PafAlignment();
		Boolean t13 = new Boolean(true);
		Boolean t14 = new Boolean(true);
		Boolean t15 = new Boolean("");
		Boolean t16 = new Boolean("");
		Boolean t17 = new Boolean(true);
		PafStyle t18 = new PafStyle();
		PafBorder t19 = new PafBorder();
		Integer t20 = new Integer("0");
		Integer t21 = new Integer("0");
		THIS.setAxis(t1);
		t2.setBorder(7);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		t5.setName("");
		t5.setPattern("");
		t5.setDefaultFormat(true);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		t10.setSize(t11);
		t12.setValue("");
		t10.setAlignment(t12);
		t10.setBgFillColor("");
		t10.setFontColor("");
		t10.setFontName("");
		t10.setName("");
		t10.setBold(t13);
		t10.setDoubleUnderline(t14);
		t10.setItalics(t15);
		t10.setStrikeOut(t16);
		t10.setUnderline(t17);
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		THIS.setHeaderStyle(t18);
		THIS.setNumberFormatOverrideLabel("");
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		Boolean RETVAL = THIS.getParentFirst();
		assertEquals(t4, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPlannable()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getPlannable()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPlannable1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		// jtest_tested_method
		Boolean RETVAL = THIS.getPlannable();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPlannable()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getPlannable()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPlannable2() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer("0");
		PafBorder t2 = new PafBorder();
		Boolean t3 = new Boolean(true);
		Boolean t4 = new Boolean(true);
		PafNumberFormat t5 = new PafNumberFormat();
		Short t6 = new Short("0");
		Boolean t7 = new Boolean("");
		Boolean t8 = new Boolean("");
		Boolean t9 = new Boolean(true);
		PafStyle t10 = new PafStyle();
		Integer t11 = new Integer(7);
		PafAlignment t12 = new PafAlignment();
		Boolean t13 = new Boolean(true);
		Boolean t14 = new Boolean("");
		Boolean t15 = new Boolean("");
		Boolean t16 = new Boolean(true);
		Boolean t17 = new Boolean(true);
		PafStyle t18 = new PafStyle();
		PafBorder t19 = new PafBorder();
		Integer t20 = new Integer("0");
		Integer t21 = new Integer("0");
		THIS.setAxis(t1);
		t2.setBorder(7);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		t10.setSize(t11);
		t12.setValue("");
		t10.setAlignment(t12);
		t10.setBgFillColor("");
		t10.setFontColor("");
		t10.setFontName("");
		t10.setName("");
		t10.setBold(t13);
		t10.setDoubleUnderline(t14);
		t10.setItalics(t15);
		t10.setStrikeOut(t16);
		t10.setUnderline(t17);
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		THIS.setHeaderStyle(t18);
		THIS.setNumberFormatOverrideLabel("");
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		Boolean RETVAL = THIS.getPlannable();
		assertEquals(t7, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getRowHeight()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getRowHeight()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRowHeight1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		// jtest_tested_method
		Integer RETVAL = THIS.getRowHeight();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getRowHeight()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getRowHeight()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRowHeight2() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer("0");
		PafBorder t2 = new PafBorder();
		Boolean t3 = new Boolean("");
		Boolean t4 = new Boolean(true);
		PafNumberFormat t5 = new PafNumberFormat("", "");
		Short t6 = new Short((short) 7);
		Boolean t7 = new Boolean(true);
		Boolean t8 = new Boolean("");
		Boolean t9 = new Boolean("");
		PafStyle t10 = new PafStyle();
		Integer t11 = new Integer("0");
		PafAlignment t12 = new PafAlignment();
		Boolean t13 = new Boolean(true);
		Boolean t14 = new Boolean(true);
		Boolean t15 = new Boolean("");
		Boolean t16 = new Boolean("");
		Boolean t17 = new Boolean(true);
		PafStyle t18 = new PafStyle();
		PafBorder t19 = new PafBorder();
		Integer t20 = new Integer("0");
		Integer t21 = new Integer("0");
		THIS.setAxis(t1);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		t5.setName("");
		t5.setPattern("");
		t5.setDefaultFormat(true);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		t10.setSize(t11);
		t12.setValue("");
		t10.setAlignment(t12);
		t10.setBgFillColor("");
		t10.setFontColor("");
		t10.setFontName("");
		t10.setName("");
		t10.setBold(t13);
		t10.setDoubleUnderline(t14);
		t10.setItalics(t15);
		t10.setStrikeOut(t16);
		t10.setUnderline(t17);
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		THIS.setHeaderStyle(t18);
		THIS.setNumberFormatOverrideLabel("");
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		Integer RETVAL = THIS.getRowHeight();
		assertEquals(t1, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getSymetricGroupNo(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getSymetricGroupNo(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetSymetricGroupNo1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		// jtest_tested_method
		Integer RETVAL = THIS.getSymetricGroupNo(0);
		// IllegalArgumentException thrown
		// at com.palladium.paf.view.ViewTuple.getSymetricGroupNo(ViewTuple.java:295)
		// jtest_unverified
	}

	/**
	 * Test for method: getSymetricGroupNo(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getSymetricGroupNo(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetSymetricGroupNo3() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer("0");
		PafBorder t2 = new PafBorder(0);
		Boolean t3 = new Boolean((String) null);
		Boolean t4 = new Boolean(false);
		PafNumberFormat t5 = new PafNumberFormat((String) null, (String) null);
		Short t6 = new Short((short) -32768);
		Boolean t7 = new Boolean(false);
		Boolean t8 = new Boolean((String) null);
		Boolean t9 = new Boolean((String) null);
		PafStyle t10 = new PafStyle();
		PafStyle t11 = new PafStyle();
		Integer t12 = new Integer("0");
		PafAlignment t13 = new PafAlignment();
		Boolean t14 = new Boolean(false);
		Boolean t15 = new Boolean((String) null);
		Boolean t16 = new Boolean(false);
		Boolean t17 = new Boolean(false);
		Boolean t18 = new Boolean((String) null);
		PafBorder t19 = new PafBorder();
		Integer t20 = new Integer("0");
		Integer t21 = new Integer(0);
		THIS.setAxis(t1);
		t2.setBorder(0);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		t5.setName("");
		t5.setPattern("");
		t5.setDefaultFormat(false);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		t11.setSize(t12);
		t11.setAlignment(t13);
		t11.setBgFillColor("");
		t11.setFontColor("");
		t11.setFontName("");
		t11.setName("");
		t11.setBold(t14);
		t11.setDoubleUnderline(t15);
		t11.setItalics(t16);
		t11.setStrikeOut(t17);
		t11.setUnderline(t18);
		THIS.setHeaderStyle(t11);
		THIS.setNumberFormatOverrideLabel("");
		t19.setBorder(0);
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		Integer RETVAL = THIS.getSymetricGroupNo(0);
		// IllegalArgumentException thrown
		// at com.palladium.paf.view.ViewTuple.getSymetricGroupNo(ViewTuple.java:295)
		// jtest_unverified
	}

	/**
	 * Test for method: getSymetricGroupNo(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getSymetricGroupNo(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetSymetricGroupNo4() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer("0");
		PafBorder t2 = new PafBorder(0);
		Boolean t3 = new Boolean(false);
		Boolean t4 = new Boolean(false);
		PafNumberFormat t5 = new PafNumberFormat((String) null, (String) null);
		Short t6 = new Short((short) -32768);
		Boolean t7 = new Boolean(false);
		Boolean t8 = new Boolean(false);
		Boolean t9 = new Boolean((String) null);
		PafStyle t10 = new PafStyle();
		PafStyle t11 = new PafStyle();
		Integer t12 = new Integer("0");
		PafAlignment t13 = new PafAlignment();
		Boolean t14 = new Boolean(false);
		Boolean t15 = new Boolean(false);
		Boolean t16 = new Boolean(false);
		Boolean t17 = new Boolean((String) null);
		Boolean t18 = new Boolean(false);
		PafBorder t19 = new PafBorder(0);
		Integer t20 = new Integer("0");
		Integer t21 = new Integer("0");
		THIS.setAxis(t1);
		t2.setBorder(0);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		t5.setName("");
		t5.setPattern("");
		t5.setDefaultFormat(false);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		t11.setSize(t12);
		t11.setAlignment(t13);
		t11.setBgFillColor("");
		t11.setFontColor("");
		t11.setFontName("");
		t11.setName("");
		t11.setBold(t14);
		t11.setDoubleUnderline(t15);
		t11.setItalics(t16);
		t11.setStrikeOut(t17);
		t11.setUnderline(t18);
		THIS.setHeaderStyle(t11);
		THIS.setNumberFormatOverrideLabel("");
		t19.setBorder(0);
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		Integer RETVAL = THIS.getSymetricGroupNo(-1);
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.view.ViewTuple.getSymetricGroupNo(ViewTuple.java:298)
		// jtest_unverified
	}

	/**
	 * Test for method: getSymetricGroupNo()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getSymetricGroupNo()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetSymetricGroupNo13() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		// jtest_tested_method
		Integer[] RETVAL = THIS.getSymetricGroupNo();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getSymetricGroupNo()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getSymetricGroupNo()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetSymetricGroupNo14() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer("0");
		PafBorder t2 = new PafBorder();
		Boolean t3 = new Boolean(true);
		Boolean t4 = new Boolean("");
		PafNumberFormat t5 = new PafNumberFormat("", "");
		Short t6 = new Short((short) 7);
		Boolean t7 = new Boolean("");
		Boolean t8 = new Boolean(true);
		Boolean t9 = new Boolean(true);
		PafStyle t10 = new PafStyle();
		Integer t11 = new Integer("0");
		PafAlignment t12 = new PafAlignment();
		Boolean t13 = new Boolean("");
		Boolean t14 = new Boolean("");
		Boolean t15 = new Boolean(true);
		Boolean t16 = new Boolean(true);
		Boolean t17 = new Boolean("");
		PafStyle t18 = new PafStyle();
		PafBorder t19 = new PafBorder();
		Integer t20 = new Integer("0");
		Integer t21 = new Integer(7);
		THIS.setAxis(t1);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		t5.setName("");
		t5.setPattern("");
		t5.setDefaultFormat(true);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		t10.setSize(t11);
		t12.setValue("");
		t10.setAlignment(t12);
		t10.setBgFillColor("");
		t10.setFontColor("");
		t10.setFontName("");
		t10.setName("");
		t10.setBold(t13);
		t10.setDoubleUnderline(t14);
		t10.setItalics(t15);
		t10.setStrikeOut(t16);
		t10.setUnderline(t17);
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		THIS.setHeaderStyle(t18);
		THIS.setNumberFormatOverrideLabel("");
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		Integer[] RETVAL = THIS.getSymetricGroupNo();
		assertEquals(var2, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getVisible()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getVisible()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetVisible1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		// jtest_tested_method
		Boolean RETVAL = THIS.getVisible();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getVisible()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#getVisible()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetVisible2() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer(7);
		PafBorder t2 = new PafBorder();
		Boolean t3 = new Boolean(true);
		Boolean t4 = new Boolean("");
		PafNumberFormat t5 = new PafNumberFormat("", "");
		Short t6 = new Short((short) 7);
		Boolean t7 = new Boolean("");
		Boolean t8 = new Boolean(true);
		Boolean t9 = new Boolean(true);
		PafStyle t10 = new PafStyle();
		Integer t11 = new Integer(7);
		PafAlignment t12 = new PafAlignment();
		Boolean t13 = new Boolean("");
		Boolean t14 = new Boolean("");
		Boolean t15 = new Boolean(true);
		Boolean t16 = new Boolean(true);
		Boolean t17 = new Boolean("");
		PafStyle t18 = new PafStyle();
		PafBorder t19 = new PafBorder();
		Integer t20 = new Integer("0");
		Integer t21 = new Integer("0");
		THIS.setAxis(t1);
		t2.setBorder(7);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		t5.setName("");
		t5.setPattern("");
		t5.setDefaultFormat(true);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		t10.setSize(t11);
		t12.setValue("");
		t10.setAlignment(t12);
		t10.setBgFillColor("");
		t10.setFontColor("");
		t10.setFontName("");
		t10.setName("");
		t10.setBold(t13);
		t10.setDoubleUnderline(t14);
		t10.setItalics(t15);
		t10.setStrikeOut(t16);
		t10.setUnderline(t17);
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		THIS.setHeaderStyle(t18);
		THIS.setNumberFormatOverrideLabel("");
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		Boolean RETVAL = THIS.getVisible();
		assertEquals(t3, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setAxis(java.lang.Integer)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#setAxis(java.lang.Integer)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetAxis1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer(7);
		PafBorder t2 = new PafBorder();
		Boolean t3 = new Boolean("");
		Boolean t4 = new Boolean(true);
		PafNumberFormat t5 = new PafNumberFormat();
		Short t6 = new Short("0");
		Boolean t7 = new Boolean(true);
		Boolean t8 = new Boolean("");
		Boolean t9 = new Boolean("");
		PafStyle t10 = new PafStyle();
		PafStyle t11 = new PafStyle();
		Integer t12 = new Integer("0");
		PafAlignment t13 = new PafAlignment();
		Boolean t14 = new Boolean(true);
		Boolean t15 = new Boolean(true);
		Boolean t16 = new Boolean("");
		Boolean t17 = new Boolean("");
		Boolean t18 = new Boolean(true);
		PafBorder t19 = new PafBorder(7);
		Integer t20 = new Integer("0");
		Integer t21 = new Integer("0");
		Integer t22 = new Integer(7);
		THIS.setAxis(t1);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		t11.setSize(t12);
		t11.setAlignment(t13);
		t11.setBgFillColor("");
		t11.setFontColor("");
		t11.setFontName("");
		t11.setName("");
		t11.setBold(t14);
		t11.setDoubleUnderline(t15);
		t11.setItalics(t16);
		t11.setStrikeOut(t17);
		t11.setUnderline(t18);
		THIS.setHeaderStyle(t11);
		THIS.setNumberFormatOverrideLabel("");
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		THIS.setAxis(t22);
		assertEquals(t1, THIS.getAxis()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setBorder(com.palladium.paf.view.PafBorder)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#setBorder(com.palladium.paf.view.PafBorder)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetBorder1() throws Throwable {
		Integer t0 = new Integer("0");
		String[] var1 = new String[] {};
		ViewTuple THIS = new ViewTuple(t0, var1);
		Integer t2 = new Integer("0");
		PafBorder t3 = new PafBorder(7);
		Boolean t4 = new Boolean(true);
		Boolean t5 = new Boolean("");
		PafNumberFormat t6 = new PafNumberFormat();
		Short t7 = new Short("0");
		Boolean t8 = new Boolean("");
		Boolean t9 = new Boolean(true);
		Boolean t10 = new Boolean(true);
		PafStyle t11 = new PafStyle();
		PafStyle t12 = new PafStyle();
		Integer t13 = new Integer("0");
		PafAlignment t14 = new PafAlignment();
		Boolean t15 = new Boolean("");
		Boolean t16 = new Boolean("");
		Boolean t17 = new Boolean(true);
		Boolean t18 = new Boolean(true);
		Boolean t19 = new Boolean("");
		PafBorder t20 = new PafBorder();
		Integer t21 = new Integer("0");
		Integer t22 = new Integer(7);
		PafBorder t23 = new PafBorder();
		THIS.setAxis(t2);
		THIS.setBorder(t3);
		THIS.setDrillable(t4);
		THIS.setExpanded(t5);
		String[] var2 = new String[] {};
		THIS.setMemberDefs(var2);
		THIS.setNumberFormat(t6);
		THIS.setOrder(t7);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t8);
		THIS.setPlannable(t9);
		THIS.setVisible(t10);
		THIS.setDataGlobalStyleName("");
		THIS.setDataStyle(t11);
		THIS.setHeaderGlobalStyleName("");
		t12.setSize(t13);
		t12.setAlignment(t14);
		t12.setBgFillColor("");
		t12.setFontColor("");
		t12.setFontName("");
		t12.setName("");
		t12.setBold(t15);
		t12.setDoubleUnderline(t16);
		t12.setItalics(t17);
		t12.setStrikeOut(t18);
		t12.setUnderline(t19);
		THIS.setHeaderStyle(t12);
		THIS.setNumberFormatOverrideLabel("");
		THIS.setHeaderBorder(t20);
		THIS.setColumnWidth(t21);
		THIS.setRowHeight(t22);
		Integer[] var3 = new Integer[] {};
		THIS.setSymetricGroupNo(var3);
		Integer[] var4 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var4);
		// jtest_tested_method
		THIS.setBorder(t23);
		assertEquals(t23, THIS.getBorder()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setColumnWidth(java.lang.Integer)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#setColumnWidth(java.lang.Integer)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetColumnWidth1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer(7);
		PafBorder t2 = new PafBorder();
		Boolean t3 = new Boolean(true);
		Boolean t4 = new Boolean("");
		PafNumberFormat t5 = new PafNumberFormat("", "");
		Short t6 = new Short((short) 7);
		Boolean t7 = new Boolean("");
		Boolean t8 = new Boolean(true);
		Boolean t9 = new Boolean(true);
		PafStyle t10 = new PafStyle();
		Integer t11 = new Integer("0");
		PafAlignment t12 = new PafAlignment();
		Boolean t13 = new Boolean("");
		Boolean t14 = new Boolean("");
		Boolean t15 = new Boolean(true);
		Boolean t16 = new Boolean(true);
		Boolean t17 = new Boolean("");
		PafStyle t18 = new PafStyle();
		PafBorder t19 = new PafBorder();
		Integer t20 = new Integer("0");
		Integer t21 = new Integer("0");
		Integer t22 = new Integer(7);
		THIS.setAxis(t1);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		t5.setName("");
		t5.setPattern("");
		t5.setDefaultFormat(true);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		t10.setSize(t11);
		t12.setValue("");
		t10.setAlignment(t12);
		t10.setBgFillColor("");
		t10.setFontColor("");
		t10.setFontName("");
		t10.setName("");
		t10.setBold(t13);
		t10.setDoubleUnderline(t14);
		t10.setItalics(t15);
		t10.setStrikeOut(t16);
		t10.setUnderline(t17);
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		THIS.setHeaderStyle(t18);
		THIS.setNumberFormatOverrideLabel("");
		t19.setBorder(7);
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		THIS.setColumnWidth(t22);
		assertEquals(t1, THIS.getColumnWidth()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setDataGlobalStyleName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#setDataGlobalStyleName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDataGlobalStyleName1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer(7);
		PafBorder t2 = new PafBorder(7);
		Boolean t3 = new Boolean("");
		Boolean t4 = new Boolean(true);
		PafNumberFormat t5 = new PafNumberFormat("", "");
		Short t6 = new Short((short) 7);
		Boolean t7 = new Boolean(true);
		Boolean t8 = new Boolean("");
		Boolean t9 = new Boolean("");
		PafStyle t10 = new PafStyle();
		Integer t11 = new Integer("0");
		PafAlignment t12 = new PafAlignment();
		Boolean t13 = new Boolean(true);
		Boolean t14 = new Boolean(true);
		Boolean t15 = new Boolean("");
		Boolean t16 = new Boolean("");
		Boolean t17 = new Boolean(true);
		PafStyle t18 = new PafStyle();
		PafBorder t19 = new PafBorder();
		Integer t20 = new Integer("0");
		Integer t21 = new Integer("0");
		THIS.setAxis(t1);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		t5.setName("");
		t5.setPattern("");
		t5.setDefaultFormat(true);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		t10.setSize(t11);
		t12.setValue("");
		t10.setAlignment(t12);
		t10.setBgFillColor("");
		t10.setFontColor("");
		t10.setFontName("");
		t10.setName("");
		t10.setBold(t13);
		t10.setDoubleUnderline(t14);
		t10.setItalics(t15);
		t10.setStrikeOut(t16);
		t10.setUnderline(t17);
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		THIS.setHeaderStyle(t18);
		THIS.setNumberFormatOverrideLabel("");
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		THIS.setDataGlobalStyleName("");
		assertEquals("", THIS.getDataGlobalStyleName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setDataStyle(com.palladium.paf.view.PafStyle)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#setDataStyle(com.palladium.paf.view.PafStyle)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDataStyle1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer(7);
		PafBorder t2 = new PafBorder(7);
		Boolean t3 = new Boolean(true);
		Boolean t4 = new Boolean("");
		PafNumberFormat t5 = new PafNumberFormat();
		Short t6 = new Short("0");
		Boolean t7 = new Boolean("");
		Boolean t8 = new Boolean(true);
		Boolean t9 = new Boolean(true);
		PafStyle t10 = new PafStyle();
		Integer t11 = new Integer("0");
		PafAlignment t12 = new PafAlignment();
		Boolean t13 = new Boolean("");
		Boolean t14 = new Boolean("");
		Boolean t15 = new Boolean(true);
		Boolean t16 = new Boolean(true);
		Boolean t17 = new Boolean("");
		PafStyle t18 = new PafStyle();
		PafBorder t19 = new PafBorder();
		Integer t20 = new Integer("0");
		Integer t21 = new Integer("0");
		PafStyle t22 = new PafStyle();
		THIS.setAxis(t1);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		t5.setName("");
		t5.setPattern("");
		t5.setDefaultFormat(true);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		t10.setSize(t11);
		t12.setValue("");
		t10.setAlignment(t12);
		t10.setBgFillColor("");
		t10.setFontColor("");
		t10.setFontName("");
		t10.setName("");
		t10.setBold(t13);
		t10.setDoubleUnderline(t14);
		t10.setItalics(t15);
		t10.setStrikeOut(t16);
		t10.setUnderline(t17);
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		THIS.setHeaderStyle(t18);
		THIS.setNumberFormatOverrideLabel("");
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		THIS.setDataStyle(t22);
		assertEquals(t22, THIS.getDataStyle()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setDerivedHeaderGroupNo(java.lang.Integer[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#setDerivedHeaderGroupNo(java.lang.Integer[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDerivedHeaderGroupNo1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer(7);
		PafBorder t2 = new PafBorder();
		Boolean t3 = new Boolean("");
		Boolean t4 = new Boolean(true);
		PafNumberFormat t5 = new PafNumberFormat();
		Short t6 = new Short("0");
		Boolean t7 = new Boolean(true);
		Boolean t8 = new Boolean(true);
		Boolean t9 = new Boolean("");
		PafStyle t10 = new PafStyle();
		Integer t11 = new Integer("0");
		PafAlignment t12 = new PafAlignment();
		Boolean t13 = new Boolean(true);
		Boolean t14 = new Boolean(true);
		Boolean t15 = new Boolean(true);
		Boolean t16 = new Boolean("");
		Boolean t17 = new Boolean(true);
		PafStyle t18 = new PafStyle();
		PafBorder t19 = new PafBorder(7);
		Integer t20 = new Integer("0");
		Integer t21 = new Integer("0");
		THIS.setAxis(t1);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		t5.setName("");
		t5.setPattern("");
		t5.setDefaultFormat(true);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		t10.setSize(t11);
		t12.setValue("");
		t10.setAlignment(t12);
		t10.setBgFillColor("");
		t10.setFontColor("");
		t10.setFontName("");
		t10.setName("");
		t10.setBold(t13);
		t10.setDoubleUnderline(t14);
		t10.setItalics(t15);
		t10.setStrikeOut(t16);
		t10.setUnderline(t17);
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		THIS.setHeaderStyle(t18);
		THIS.setNumberFormatOverrideLabel("");
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		Integer[] var4 = new Integer[] {};
		// jtest_tested_method
		THIS.setDerivedHeaderGroupNo(var4);
		assertSame(var4, THIS.getDerivedHeaderGroupNo()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setDerivedHeaderGroupNo(int,java.lang.Integer)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#setDerivedHeaderGroupNo(int,java.lang.Integer)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDerivedHeaderGroupNo3() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer(0);
		PafBorder t2 = new PafBorder(0);
		Boolean t3 = new Boolean(false);
		Boolean t4 = new Boolean(false);
		PafNumberFormat t5 = new PafNumberFormat((String) null, (String) null);
		Short t6 = new Short((short) -32768);
		Boolean t7 = new Boolean((String) null);
		Boolean t8 = new Boolean(false);
		Boolean t9 = new Boolean(false);
		PafStyle t10 = new PafStyle();
		PafStyle t11 = new PafStyle();
		Integer t12 = new Integer("0");
		PafAlignment t13 = new PafAlignment();
		Boolean t14 = new Boolean(false);
		Boolean t15 = new Boolean((String) null);
		Boolean t16 = new Boolean(false);
		Boolean t17 = new Boolean(false);
		Boolean t18 = new Boolean(false);
		PafBorder t19 = new PafBorder(0);
		Integer t20 = new Integer("0");
		Integer t21 = new Integer("0");
		THIS.setAxis(t1);
		t2.setBorder(0);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		t5.setName("");
		t5.setPattern("");
		t5.setDefaultFormat(false);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		t11.setSize(t12);
		t11.setAlignment(t13);
		t11.setBgFillColor("");
		t11.setFontColor("");
		t11.setFontName("");
		t11.setName("");
		t11.setBold(t14);
		t11.setDoubleUnderline(t15);
		t11.setItalics(t16);
		t11.setStrikeOut(t17);
		t11.setUnderline(t18);
		THIS.setHeaderStyle(t11);
		THIS.setNumberFormatOverrideLabel("");
		t19.setBorder(0);
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		THIS.setDerivedHeaderGroupNo(0, (Integer) null);
		// IllegalArgumentException thrown
		// at com.palladium.paf.view.ViewTuple.setDerivedHeaderGroupNo(ViewTuple.java:381)
		// jtest_unverified
	}

	/**
	 * Test for method: setDerivedHeaderGroupNo(int,java.lang.Integer)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#setDerivedHeaderGroupNo(int,java.lang.Integer)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDerivedHeaderGroupNo4() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer("0");
		PafBorder t2 = new PafBorder(0);
		Boolean t3 = new Boolean(false);
		Boolean t4 = new Boolean(false);
		PafNumberFormat t5 = new PafNumberFormat((String) null, (String) null);
		Short t6 = new Short((short) -32768);
		Boolean t7 = new Boolean(false);
		Boolean t8 = new Boolean(false);
		Boolean t9 = new Boolean((String) null);
		PafStyle t10 = new PafStyle();
		PafStyle t11 = new PafStyle();
		Integer t12 = new Integer("0");
		PafAlignment t13 = new PafAlignment();
		Boolean t14 = new Boolean(false);
		Boolean t15 = new Boolean(false);
		Boolean t16 = new Boolean(false);
		Boolean t17 = new Boolean((String) null);
		Boolean t18 = new Boolean(false);
		PafBorder t19 = new PafBorder(0);
		Integer t20 = new Integer("0");
		Integer t21 = new Integer("0");
		THIS.setAxis(t1);
		t2.setBorder(0);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		t5.setName("");
		t5.setPattern("");
		t5.setDefaultFormat(false);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		t11.setSize(t12);
		t11.setAlignment(t13);
		t11.setBgFillColor("");
		t11.setFontColor("");
		t11.setFontName("");
		t11.setName("");
		t11.setBold(t14);
		t11.setDoubleUnderline(t15);
		t11.setItalics(t16);
		t11.setStrikeOut(t17);
		t11.setUnderline(t18);
		THIS.setHeaderStyle(t11);
		THIS.setNumberFormatOverrideLabel("");
		t19.setBorder(0);
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		THIS.setDerivedHeaderGroupNo(-1, (Integer) null);
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.view.ViewTuple.setDerivedHeaderGroupNo(ViewTuple.java:383)
		// jtest_unverified
	}

	/**
	 * Test for method: setDerivedHeaderGroupNo(int,java.lang.Integer)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#setDerivedHeaderGroupNo(int,java.lang.Integer)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDerivedHeaderGroupNo9() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		// jtest_tested_method
		THIS.setDerivedHeaderGroupNo(0, (Integer) null);
		// IllegalArgumentException thrown
		// at com.palladium.paf.view.ViewTuple.setDerivedHeaderGroupNo(ViewTuple.java:381)
		// jtest_unverified
	}

	/**
	 * Test for method: setDrillable(java.lang.Boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#setDrillable(java.lang.Boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDrillable1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer("0");
		PafBorder t2 = new PafBorder(7);
		Boolean t3 = new Boolean("");
		Boolean t4 = new Boolean(true);
		PafNumberFormat t5 = new PafNumberFormat("", "");
		Short t6 = new Short((short) 7);
		Boolean t7 = new Boolean(true);
		Boolean t8 = new Boolean("");
		Boolean t9 = new Boolean("");
		PafStyle t10 = new PafStyle();
		PafStyle t11 = new PafStyle();
		Integer t12 = new Integer(7);
		PafAlignment t13 = new PafAlignment();
		Boolean t14 = new Boolean(true);
		Boolean t15 = new Boolean(true);
		Boolean t16 = new Boolean("");
		Boolean t17 = new Boolean("");
		Boolean t18 = new Boolean(true);
		PafBorder t19 = new PafBorder(7);
		Integer t20 = new Integer("0");
		Integer t21 = new Integer("0");
		Boolean t22 = new Boolean(true);
		THIS.setAxis(t1);
		t2.setBorder(7);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		t11.setSize(t12);
		t11.setAlignment(t13);
		t11.setBgFillColor("");
		t11.setFontColor("");
		t11.setFontName("");
		t11.setName("");
		t11.setBold(t14);
		t11.setDoubleUnderline(t15);
		t11.setItalics(t16);
		t11.setStrikeOut(t17);
		t11.setUnderline(t18);
		THIS.setHeaderStyle(t11);
		THIS.setNumberFormatOverrideLabel("");
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		THIS.setDrillable(t22);
		assertEquals(t4, THIS.getDrillable()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setExpanded(java.lang.Boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#setExpanded(java.lang.Boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetExpanded1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Boolean t1 = new Boolean("");
		// jtest_tested_method
		THIS.setExpanded(t1);
		assertEquals(t1, THIS.getExpanded()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setHeaderBorder(com.palladium.paf.view.PafBorder)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#setHeaderBorder(com.palladium.paf.view.PafBorder)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetHeaderBorder1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer("0");
		PafBorder t2 = new PafBorder(7);
		Boolean t3 = new Boolean("");
		Boolean t4 = new Boolean(true);
		PafNumberFormat t5 = new PafNumberFormat();
		Short t6 = new Short("0");
		Boolean t7 = new Boolean(true);
		Boolean t8 = new Boolean("");
		Boolean t9 = new Boolean("");
		PafStyle t10 = new PafStyle();
		Integer t11 = new Integer(7);
		PafAlignment t12 = new PafAlignment();
		Boolean t13 = new Boolean(true);
		Boolean t14 = new Boolean(true);
		Boolean t15 = new Boolean("");
		Boolean t16 = new Boolean("");
		Boolean t17 = new Boolean(true);
		PafStyle t18 = new PafStyle();
		PafBorder t19 = new PafBorder();
		Integer t20 = new Integer("0");
		Integer t21 = new Integer(7);
		PafBorder t22 = new PafBorder();
		THIS.setAxis(t1);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		t5.setName("");
		t5.setPattern("");
		t5.setDefaultFormat(true);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		t10.setSize(t11);
		t12.setValue("");
		t10.setAlignment(t12);
		t10.setBgFillColor("");
		t10.setFontColor("");
		t10.setFontName("");
		t10.setName("");
		t10.setBold(t13);
		t10.setDoubleUnderline(t14);
		t10.setItalics(t15);
		t10.setStrikeOut(t16);
		t10.setUnderline(t17);
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		THIS.setHeaderStyle(t18);
		THIS.setNumberFormatOverrideLabel("");
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		t22.setBorder(7);
		// jtest_tested_method
		THIS.setHeaderBorder(t22);
		assertEquals(t22, THIS.getHeaderBorder()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setHeaderGlobalStyleName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#setHeaderGlobalStyleName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetHeaderGlobalStyleName1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer(7);
		PafBorder t2 = new PafBorder(7);
		Boolean t3 = new Boolean("");
		Boolean t4 = new Boolean(true);
		PafNumberFormat t5 = new PafNumberFormat("", "");
		Short t6 = new Short((short) 7);
		Boolean t7 = new Boolean(true);
		Boolean t8 = new Boolean("");
		Boolean t9 = new Boolean("");
		PafStyle t10 = new PafStyle();
		Integer t11 = new Integer("0");
		PafAlignment t12 = new PafAlignment();
		Boolean t13 = new Boolean(true);
		Boolean t14 = new Boolean(true);
		Boolean t15 = new Boolean("");
		Boolean t16 = new Boolean("");
		Boolean t17 = new Boolean(true);
		PafStyle t18 = new PafStyle();
		PafBorder t19 = new PafBorder();
		Integer t20 = new Integer("0");
		Integer t21 = new Integer("0");
		THIS.setAxis(t1);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		t5.setName("");
		t5.setPattern("");
		t5.setDefaultFormat(true);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		t10.setSize(t11);
		t12.setValue("");
		t10.setAlignment(t12);
		t10.setBgFillColor("");
		t10.setFontColor("");
		t10.setFontName("");
		t10.setName("");
		t10.setBold(t13);
		t10.setDoubleUnderline(t14);
		t10.setItalics(t15);
		t10.setStrikeOut(t16);
		t10.setUnderline(t17);
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		THIS.setHeaderStyle(t18);
		THIS.setNumberFormatOverrideLabel("");
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		THIS.setHeaderGlobalStyleName("");
		assertEquals("", THIS.getHeaderGlobalStyleName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setHeaderStyle(com.palladium.paf.view.PafStyle)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#setHeaderStyle(com.palladium.paf.view.PafStyle)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetHeaderStyle1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer("0");
		PafBorder t2 = new PafBorder(7);
		Boolean t3 = new Boolean("");
		Boolean t4 = new Boolean(true);
		PafNumberFormat t5 = new PafNumberFormat();
		Short t6 = new Short("0");
		Boolean t7 = new Boolean(true);
		Boolean t8 = new Boolean("");
		Boolean t9 = new Boolean(true);
		PafStyle t10 = new PafStyle();
		Integer t11 = new Integer(7);
		PafAlignment t12 = new PafAlignment();
		Boolean t13 = new Boolean("");
		Boolean t14 = new Boolean("");
		Boolean t15 = new Boolean(true);
		Boolean t16 = new Boolean(true);
		Boolean t17 = new Boolean("");
		PafStyle t18 = new PafStyle();
		PafBorder t19 = new PafBorder();
		Integer t20 = new Integer("0");
		Integer t21 = new Integer("0");
		PafStyle t22 = new PafStyle();
		THIS.setAxis(t1);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		t5.setName("");
		t5.setPattern("");
		t5.setDefaultFormat(true);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		t10.setSize(t11);
		t12.setValue("");
		t10.setAlignment(t12);
		t10.setBgFillColor("");
		t10.setFontColor("");
		t10.setFontName("");
		t10.setName("");
		t10.setBold(t13);
		t10.setDoubleUnderline(t14);
		t10.setItalics(t15);
		t10.setStrikeOut(t16);
		t10.setUnderline(t17);
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		THIS.setHeaderStyle(t18);
		THIS.setNumberFormatOverrideLabel("");
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		THIS.setHeaderStyle(t22);
		assertEquals(t22, THIS.getHeaderStyle()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setMemberDefs(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#setMemberDefs(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetMemberDefs1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer("0");
		PafBorder t2 = new PafBorder(7);
		Boolean t3 = new Boolean(true);
		Boolean t4 = new Boolean("");
		PafNumberFormat t5 = new PafNumberFormat("", "");
		Short t6 = new Short((short) 7);
		Boolean t7 = new Boolean("");
		Boolean t8 = new Boolean(true);
		Boolean t9 = new Boolean(true);
		PafStyle t10 = new PafStyle();
		Integer t11 = new Integer(7);
		PafAlignment t12 = new PafAlignment();
		Boolean t13 = new Boolean("");
		Boolean t14 = new Boolean("");
		Boolean t15 = new Boolean(true);
		Boolean t16 = new Boolean(true);
		Boolean t17 = new Boolean("");
		PafStyle t18 = new PafStyle();
		PafBorder t19 = new PafBorder(7);
		Integer t20 = new Integer("0");
		Integer t21 = new Integer("0");
		THIS.setAxis(t1);
		t2.setBorder(7);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		t10.setSize(t11);
		t12.setValue("");
		t10.setAlignment(t12);
		t10.setBgFillColor("");
		t10.setFontColor("");
		t10.setFontName("");
		t10.setName("");
		t10.setBold(t13);
		t10.setDoubleUnderline(t14);
		t10.setItalics(t15);
		t10.setStrikeOut(t16);
		t10.setUnderline(t17);
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		THIS.setHeaderStyle(t18);
		THIS.setNumberFormatOverrideLabel("");
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		String[] var4 = new String[] {};
		// jtest_tested_method
		THIS.setMemberDefs(var4);
		assertSame(var4, THIS.getMemberDefs()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setNumberFormat(com.palladium.paf.view.PafNumberFormat)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#setNumberFormat(com.palladium.paf.view.PafNumberFormat)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetNumberFormat1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer("0");
		PafBorder t2 = new PafBorder(7);
		Boolean t3 = new Boolean(true);
		Boolean t4 = new Boolean("");
		PafNumberFormat t5 = new PafNumberFormat();
		Short t6 = new Short("0");
		Boolean t7 = new Boolean("");
		Boolean t8 = new Boolean(true);
		Boolean t9 = new Boolean(true);
		PafStyle t10 = new PafStyle();
		Integer t11 = new Integer(7);
		PafAlignment t12 = new PafAlignment();
		Boolean t13 = new Boolean("");
		Boolean t14 = new Boolean("");
		Boolean t15 = new Boolean(true);
		Boolean t16 = new Boolean(true);
		Boolean t17 = new Boolean("");
		PafStyle t18 = new PafStyle();
		PafBorder t19 = new PafBorder(7);
		Integer t20 = new Integer("0");
		Integer t21 = new Integer("0");
		PafNumberFormat t22 = new PafNumberFormat("", "");
		THIS.setAxis(t1);
		t2.setBorder(7);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		t10.setSize(t11);
		t12.setValue("");
		t10.setAlignment(t12);
		t10.setBgFillColor("");
		t10.setFontColor("");
		t10.setFontName("");
		t10.setName("");
		t10.setBold(t13);
		t10.setDoubleUnderline(t14);
		t10.setItalics(t15);
		t10.setStrikeOut(t16);
		t10.setUnderline(t17);
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		THIS.setHeaderStyle(t18);
		THIS.setNumberFormatOverrideLabel("");
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		THIS.setNumberFormat(t22);
		assertEquals(t22, THIS.getNumberFormat()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setNumberFormatOverrideLabel(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#setNumberFormatOverrideLabel(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetNumberFormatOverrideLabel1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer("0");
		PafBorder t2 = new PafBorder(7);
		Boolean t3 = new Boolean(true);
		Boolean t4 = new Boolean("");
		PafNumberFormat t5 = new PafNumberFormat("", "");
		Short t6 = new Short((short) 7);
		Boolean t7 = new Boolean("");
		Boolean t8 = new Boolean(true);
		Boolean t9 = new Boolean(true);
		PafStyle t10 = new PafStyle();
		Integer t11 = new Integer(7);
		PafAlignment t12 = new PafAlignment();
		Boolean t13 = new Boolean("");
		Boolean t14 = new Boolean("");
		Boolean t15 = new Boolean(true);
		Boolean t16 = new Boolean(true);
		Boolean t17 = new Boolean("");
		PafStyle t18 = new PafStyle();
		PafBorder t19 = new PafBorder();
		Integer t20 = new Integer("0");
		Integer t21 = new Integer("0");
		THIS.setAxis(t1);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		t5.setName("");
		t5.setPattern("");
		t5.setDefaultFormat(true);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		t10.setSize(t11);
		t12.setValue("");
		t10.setAlignment(t12);
		t10.setBgFillColor("");
		t10.setFontColor("");
		t10.setFontName("");
		t10.setName("");
		t10.setBold(t13);
		t10.setDoubleUnderline(t14);
		t10.setItalics(t15);
		t10.setStrikeOut(t16);
		t10.setUnderline(t17);
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		THIS.setHeaderStyle(t18);
		THIS.setNumberFormatOverrideLabel("");
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		THIS.setNumberFormatOverrideLabel("");
		assertEquals("", THIS.getNumberFormatOverrideLabel()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setOrder(java.lang.Short)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#setOrder(java.lang.Short)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetOrder1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer(7);
		PafBorder t2 = new PafBorder(7);
		Boolean t3 = new Boolean(true);
		Boolean t4 = new Boolean("");
		PafNumberFormat t5 = new PafNumberFormat("", "");
		Short t6 = new Short((short) 7);
		Boolean t7 = new Boolean("");
		Boolean t8 = new Boolean(true);
		Boolean t9 = new Boolean(true);
		PafStyle t10 = new PafStyle();
		Integer t11 = new Integer(7);
		PafAlignment t12 = new PafAlignment();
		Boolean t13 = new Boolean("");
		Boolean t14 = new Boolean("");
		Boolean t15 = new Boolean(true);
		Boolean t16 = new Boolean(true);
		Boolean t17 = new Boolean("");
		PafStyle t18 = new PafStyle();
		PafBorder t19 = new PafBorder(7);
		Integer t20 = new Integer("0");
		Integer t21 = new Integer("0");
		Short t22 = new Short((short) 7);
		THIS.setAxis(t1);
		t2.setBorder(7);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		t10.setSize(t11);
		t12.setValue("");
		t10.setAlignment(t12);
		t10.setBgFillColor("");
		t10.setFontColor("");
		t10.setFontName("");
		t10.setName("");
		t10.setBold(t13);
		t10.setDoubleUnderline(t14);
		t10.setItalics(t15);
		t10.setStrikeOut(t16);
		t10.setUnderline(t17);
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		THIS.setHeaderStyle(t18);
		THIS.setNumberFormatOverrideLabel("");
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		THIS.setOrder(t22);
		assertEquals(t6, THIS.getOrder()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setOverrideLabel(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#setOverrideLabel(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetOverrideLabel1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer("0");
		PafBorder t2 = new PafBorder(7);
		Boolean t3 = new Boolean(true);
		Boolean t4 = new Boolean("");
		PafNumberFormat t5 = new PafNumberFormat("", "");
		Short t6 = new Short((short) 7);
		Boolean t7 = new Boolean("");
		Boolean t8 = new Boolean(true);
		Boolean t9 = new Boolean(true);
		PafStyle t10 = new PafStyle();
		Integer t11 = new Integer(7);
		PafAlignment t12 = new PafAlignment();
		Boolean t13 = new Boolean("");
		Boolean t14 = new Boolean("");
		Boolean t15 = new Boolean(true);
		Boolean t16 = new Boolean(true);
		Boolean t17 = new Boolean("");
		PafStyle t18 = new PafStyle();
		PafBorder t19 = new PafBorder(7);
		Integer t20 = new Integer("0");
		Integer t21 = new Integer("0");
		THIS.setAxis(t1);
		t2.setBorder(7);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		t10.setSize(t11);
		t12.setValue("");
		t10.setAlignment(t12);
		t10.setBgFillColor("");
		t10.setFontColor("");
		t10.setFontName("");
		t10.setName("");
		t10.setBold(t13);
		t10.setDoubleUnderline(t14);
		t10.setItalics(t15);
		t10.setStrikeOut(t16);
		t10.setUnderline(t17);
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		THIS.setHeaderStyle(t18);
		THIS.setNumberFormatOverrideLabel("");
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		THIS.setOverrideLabel("");
		assertEquals("", THIS.getOverrideLabel()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setParentFirst(java.lang.Boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#setParentFirst(java.lang.Boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetParentFirst1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer("0");
		PafBorder t2 = new PafBorder(7);
		Boolean t3 = new Boolean(true);
		Boolean t4 = new Boolean("");
		PafNumberFormat t5 = new PafNumberFormat("", "");
		Short t6 = new Short((short) 7);
		Boolean t7 = new Boolean("");
		Boolean t8 = new Boolean(true);
		Boolean t9 = new Boolean(true);
		PafStyle t10 = new PafStyle();
		Integer t11 = new Integer("0");
		PafAlignment t12 = new PafAlignment();
		Boolean t13 = new Boolean("");
		Boolean t14 = new Boolean("");
		Boolean t15 = new Boolean(true);
		Boolean t16 = new Boolean(true);
		Boolean t17 = new Boolean("");
		PafStyle t18 = new PafStyle();
		PafBorder t19 = new PafBorder(7);
		Integer t20 = new Integer(7);
		Integer t21 = new Integer("0");
		Boolean t22 = new Boolean("");
		THIS.setAxis(t1);
		t2.setBorder(7);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		t10.setSize(t11);
		t12.setValue("");
		t10.setAlignment(t12);
		t10.setBgFillColor("");
		t10.setFontColor("");
		t10.setFontName("");
		t10.setName("");
		t10.setBold(t13);
		t10.setDoubleUnderline(t14);
		t10.setItalics(t15);
		t10.setStrikeOut(t16);
		t10.setUnderline(t17);
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		THIS.setHeaderStyle(t18);
		THIS.setNumberFormatOverrideLabel("");
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		THIS.setParentFirst(t22);
		assertEquals(t4, THIS.getParentFirst()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setPlannable(java.lang.Boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#setPlannable(java.lang.Boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetPlannable1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer("0");
		PafBorder t2 = new PafBorder(7);
		Boolean t3 = new Boolean("");
		Boolean t4 = new Boolean("");
		PafNumberFormat t5 = new PafNumberFormat("", "");
		Short t6 = new Short((short) 7);
		Boolean t7 = new Boolean(true);
		Boolean t8 = new Boolean(true);
		Boolean t9 = new Boolean("");
		PafStyle t10 = new PafStyle();
		Integer t11 = new Integer(7);
		PafAlignment t12 = new PafAlignment();
		Boolean t13 = new Boolean("");
		Boolean t14 = new Boolean(true);
		Boolean t15 = new Boolean(true);
		Boolean t16 = new Boolean("");
		Boolean t17 = new Boolean("");
		PafStyle t18 = new PafStyle();
		PafBorder t19 = new PafBorder(7);
		Integer t20 = new Integer("0");
		Integer t21 = new Integer("0");
		Boolean t22 = new Boolean(true);
		THIS.setAxis(t1);
		t2.setBorder(7);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		t10.setSize(t11);
		t12.setValue("");
		t10.setAlignment(t12);
		t10.setBgFillColor("");
		t10.setFontColor("");
		t10.setFontName("");
		t10.setName("");
		t10.setBold(t13);
		t10.setDoubleUnderline(t14);
		t10.setItalics(t15);
		t10.setStrikeOut(t16);
		t10.setUnderline(t17);
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		THIS.setHeaderStyle(t18);
		THIS.setNumberFormatOverrideLabel("");
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		THIS.setPlannable(t22);
		assertEquals(t7, THIS.getPlannable()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setRowHeight(java.lang.Integer)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#setRowHeight(java.lang.Integer)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetRowHeight1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer("0");
		PafBorder t2 = new PafBorder(7);
		Boolean t3 = new Boolean(true);
		Boolean t4 = new Boolean("");
		PafNumberFormat t5 = new PafNumberFormat();
		Short t6 = new Short("0");
		Boolean t7 = new Boolean("");
		Boolean t8 = new Boolean("");
		Boolean t9 = new Boolean("");
		PafStyle t10 = new PafStyle();
		Integer t11 = new Integer("0");
		PafAlignment t12 = new PafAlignment();
		Boolean t13 = new Boolean(true);
		Boolean t14 = new Boolean(true);
		Boolean t15 = new Boolean("");
		Boolean t16 = new Boolean("");
		Boolean t17 = new Boolean(true);
		PafStyle t18 = new PafStyle();
		PafBorder t19 = new PafBorder(7);
		Integer t20 = new Integer("0");
		Integer t21 = new Integer(7);
		Integer t22 = new Integer("0");
		THIS.setAxis(t1);
		t2.setBorder(7);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		t10.setSize(t11);
		t12.setValue("");
		t10.setAlignment(t12);
		t10.setBgFillColor("");
		t10.setFontColor("");
		t10.setFontName("");
		t10.setName("");
		t10.setBold(t13);
		t10.setDoubleUnderline(t14);
		t10.setItalics(t15);
		t10.setStrikeOut(t16);
		t10.setUnderline(t17);
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		THIS.setHeaderStyle(t18);
		THIS.setNumberFormatOverrideLabel("");
		t19.setBorder(7);
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		THIS.setRowHeight(t22);
		assertEquals(t1, THIS.getRowHeight()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setSymetricGroupNo(java.lang.Integer[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#setSymetricGroupNo(java.lang.Integer[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetSymetricGroupNo1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer(7);
		PafBorder t2 = new PafBorder();
		Boolean t3 = new Boolean("");
		Boolean t4 = new Boolean(true);
		PafNumberFormat t5 = new PafNumberFormat();
		Short t6 = new Short("0");
		Boolean t7 = new Boolean(true);
		Boolean t8 = new Boolean(true);
		Boolean t9 = new Boolean("");
		PafStyle t10 = new PafStyle();
		Integer t11 = new Integer("0");
		PafAlignment t12 = new PafAlignment();
		Boolean t13 = new Boolean(true);
		Boolean t14 = new Boolean(true);
		Boolean t15 = new Boolean(true);
		Boolean t16 = new Boolean("");
		Boolean t17 = new Boolean(true);
		PafStyle t18 = new PafStyle();
		PafBorder t19 = new PafBorder(7);
		Integer t20 = new Integer("0");
		Integer t21 = new Integer("0");
		THIS.setAxis(t1);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		t5.setName("");
		t5.setPattern("");
		t5.setDefaultFormat(true);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		t10.setSize(t11);
		t12.setValue("");
		t10.setAlignment(t12);
		t10.setBgFillColor("");
		t10.setFontColor("");
		t10.setFontName("");
		t10.setName("");
		t10.setBold(t13);
		t10.setDoubleUnderline(t14);
		t10.setItalics(t15);
		t10.setStrikeOut(t16);
		t10.setUnderline(t17);
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		THIS.setHeaderStyle(t18);
		THIS.setNumberFormatOverrideLabel("");
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		Integer[] var4 = new Integer[] {};
		// jtest_tested_method
		THIS.setSymetricGroupNo(var4);
		assertSame(var4, THIS.getSymetricGroupNo()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setSymetricGroupNo(int,java.lang.Integer)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#setSymetricGroupNo(int,java.lang.Integer)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetSymetricGroupNo3() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer(0);
		PafBorder t2 = new PafBorder(0);
		Boolean t3 = new Boolean(false);
		Boolean t4 = new Boolean(false);
		PafNumberFormat t5 = new PafNumberFormat((String) null, (String) null);
		Short t6 = new Short((short) -32768);
		Boolean t7 = new Boolean((String) null);
		Boolean t8 = new Boolean(false);
		Boolean t9 = new Boolean(false);
		PafStyle t10 = new PafStyle();
		PafStyle t11 = new PafStyle();
		Integer t12 = new Integer("0");
		PafAlignment t13 = new PafAlignment();
		Boolean t14 = new Boolean(false);
		Boolean t15 = new Boolean((String) null);
		Boolean t16 = new Boolean(false);
		Boolean t17 = new Boolean(false);
		Boolean t18 = new Boolean(false);
		PafBorder t19 = new PafBorder(0);
		Integer t20 = new Integer("0");
		Integer t21 = new Integer("0");
		THIS.setAxis(t1);
		t2.setBorder(0);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		t5.setName("");
		t5.setPattern("");
		t5.setDefaultFormat(false);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		t11.setSize(t12);
		t11.setAlignment(t13);
		t11.setBgFillColor("");
		t11.setFontColor("");
		t11.setFontName("");
		t11.setName("");
		t11.setBold(t14);
		t11.setDoubleUnderline(t15);
		t11.setItalics(t16);
		t11.setStrikeOut(t17);
		t11.setUnderline(t18);
		THIS.setHeaderStyle(t11);
		THIS.setNumberFormatOverrideLabel("");
		t19.setBorder(0);
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		THIS.setSymetricGroupNo(0, (Integer) null);
		// IllegalArgumentException thrown
		// at com.palladium.paf.view.ViewTuple.setSymetricGroupNo(ViewTuple.java:324)
		// jtest_unverified
	}

	/**
	 * Test for method: setSymetricGroupNo(int,java.lang.Integer)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#setSymetricGroupNo(int,java.lang.Integer)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetSymetricGroupNo4() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer("0");
		PafBorder t2 = new PafBorder(0);
		Boolean t3 = new Boolean(false);
		Boolean t4 = new Boolean(false);
		PafNumberFormat t5 = new PafNumberFormat((String) null, (String) null);
		Short t6 = new Short((short) -32768);
		Boolean t7 = new Boolean(false);
		Boolean t8 = new Boolean(false);
		Boolean t9 = new Boolean((String) null);
		PafStyle t10 = new PafStyle();
		PafStyle t11 = new PafStyle();
		Integer t12 = new Integer("0");
		PafAlignment t13 = new PafAlignment();
		Boolean t14 = new Boolean(false);
		Boolean t15 = new Boolean(false);
		Boolean t16 = new Boolean(false);
		Boolean t17 = new Boolean((String) null);
		Boolean t18 = new Boolean(false);
		PafBorder t19 = new PafBorder(0);
		Integer t20 = new Integer("0");
		Integer t21 = new Integer("0");
		THIS.setAxis(t1);
		t2.setBorder(0);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		t5.setName("");
		t5.setPattern("");
		t5.setDefaultFormat(false);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		t11.setSize(t12);
		t11.setAlignment(t13);
		t11.setBgFillColor("");
		t11.setFontColor("");
		t11.setFontName("");
		t11.setName("");
		t11.setBold(t14);
		t11.setDoubleUnderline(t15);
		t11.setItalics(t16);
		t11.setStrikeOut(t17);
		t11.setUnderline(t18);
		THIS.setHeaderStyle(t11);
		THIS.setNumberFormatOverrideLabel("");
		t19.setBorder(0);
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		THIS.setSymetricGroupNo(-1, (Integer) null);
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.view.ViewTuple.setSymetricGroupNo(ViewTuple.java:326)
		// jtest_unverified
	}

	/**
	 * Test for method: setSymetricGroupNo(int,java.lang.Integer)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#setSymetricGroupNo(int,java.lang.Integer)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetSymetricGroupNo9() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		// jtest_tested_method
		THIS.setSymetricGroupNo(0, (Integer) null);
		// IllegalArgumentException thrown
		// at com.palladium.paf.view.ViewTuple.setSymetricGroupNo(ViewTuple.java:324)
		// jtest_unverified
	}

	/**
	 * Test for method: setVisible(java.lang.Boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#setVisible(java.lang.Boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetVisible1() throws Throwable {
		ViewTuple THIS = new ViewTuple();
		Integer t1 = new Integer("0");
		PafBorder t2 = new PafBorder(7);
		Boolean t3 = new Boolean("");
		Boolean t4 = new Boolean(true);
		PafNumberFormat t5 = new PafNumberFormat("", "");
		Short t6 = new Short((short) 7);
		Boolean t7 = new Boolean(true);
		Boolean t8 = new Boolean("");
		Boolean t9 = new Boolean("");
		PafStyle t10 = new PafStyle();
		Integer t11 = new Integer("0");
		PafAlignment t12 = new PafAlignment();
		Boolean t13 = new Boolean(true);
		Boolean t14 = new Boolean(true);
		Boolean t15 = new Boolean("");
		Boolean t16 = new Boolean("");
		Boolean t17 = new Boolean(true);
		PafStyle t18 = new PafStyle();
		PafBorder t19 = new PafBorder(7);
		Integer t20 = new Integer(7);
		Integer t21 = new Integer("0");
		Boolean t22 = new Boolean(true);
		THIS.setAxis(t1);
		t2.setBorder(7);
		THIS.setBorder(t2);
		THIS.setDrillable(t3);
		THIS.setExpanded(t4);
		String[] var1 = new String[] {};
		THIS.setMemberDefs(var1);
		THIS.setNumberFormat(t5);
		THIS.setOrder(t6);
		THIS.setOverrideLabel("");
		THIS.setParentFirst(t7);
		THIS.setPlannable(t8);
		THIS.setVisible(t9);
		THIS.setDataGlobalStyleName("");
		t10.setSize(t11);
		t12.setValue("");
		t10.setAlignment(t12);
		t10.setBgFillColor("");
		t10.setFontColor("");
		t10.setFontName("");
		t10.setName("");
		t10.setBold(t13);
		t10.setDoubleUnderline(t14);
		t10.setItalics(t15);
		t10.setStrikeOut(t16);
		t10.setUnderline(t17);
		THIS.setDataStyle(t10);
		THIS.setHeaderGlobalStyleName("");
		THIS.setHeaderStyle(t18);
		THIS.setNumberFormatOverrideLabel("");
		THIS.setHeaderBorder(t19);
		THIS.setColumnWidth(t20);
		THIS.setRowHeight(t21);
		Integer[] var2 = new Integer[] {};
		THIS.setSymetricGroupNo(var2);
		Integer[] var3 = new Integer[] {};
		THIS.setDerivedHeaderGroupNo(var3);
		// jtest_tested_method
		THIS.setVisible(t22);
		assertEquals(t4, THIS.getVisible()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: ViewTuple(java.lang.Integer,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#ViewTuple(java.lang.Integer,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testViewTuple1() throws Throwable {
		// jtest_tested_method
		ViewTuple THIS = new ViewTuple((Integer) null, (String[]) null);
		assertEquals(null, THIS.getAxis()); // jtest_unverified
		assertEquals(null, THIS.getBorder()); // jtest_unverified
		assertEquals(null, THIS.getColumnWidth()); // jtest_unverified
		assertEquals(null, THIS.getDataGlobalStyleName()); // jtest_unverified
		assertEquals(null, THIS.getDataStyle()); // jtest_unverified
		assertEquals(null, THIS.getDerivedHeaderGroupNo()); // jtest_unverified
		assertEquals(null, THIS.getDrillable()); // jtest_unverified
		assertEquals(null, THIS.getExpanded()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: ViewTuple(java.lang.Integer,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#ViewTuple(java.lang.Integer,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testViewTuple2() throws Throwable {
		Integer t0 = new Integer(7);
		String[] var1 = new String[] {};
		// jtest_tested_method
		ViewTuple THIS = new ViewTuple(t0, var1);
		assertEquals(t0, THIS.getAxis()); // jtest_unverified
		assertEquals(null, THIS.getBorder()); // jtest_unverified
		assertEquals(null, THIS.getColumnWidth()); // jtest_unverified
		assertEquals(null, THIS.getDataGlobalStyleName()); // jtest_unverified
		assertEquals(null, THIS.getDataStyle()); // jtest_unverified
		assertEquals(null, THIS.getDerivedHeaderGroupNo()); // jtest_unverified
		assertEquals(null, THIS.getDrillable()); // jtest_unverified
		assertEquals(null, THIS.getExpanded()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: ViewTuple()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ViewTuple#ViewTuple()
	 * @author Parasoft Jtest 8.0
	 */
	public void testViewTuple3() throws Throwable {
		// jtest_tested_method
		ViewTuple THIS = new ViewTuple();
		assertEquals(null, THIS.getAxis()); // jtest_unverified
		assertEquals(null, THIS.getBorder()); // jtest_unverified
		assertEquals(null, THIS.getColumnWidth()); // jtest_unverified
		assertEquals(null, THIS.getDataGlobalStyleName()); // jtest_unverified
		assertEquals(null, THIS.getDataStyle()); // jtest_unverified
		assertEquals(null, THIS.getDerivedHeaderGroupNo()); // jtest_unverified
		assertEquals(null, THIS.getDrillable()); // jtest_unverified
		assertEquals(null, THIS.getExpanded()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.view.ViewTupleTest
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
			ViewTupleTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.view.ViewTuple",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return ViewTuple.class;
	}

}

// JTEST_CURRENT_ID=157491049.