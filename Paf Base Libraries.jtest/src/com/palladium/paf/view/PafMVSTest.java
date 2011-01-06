/*
 * PafMVSTest.java
 * Created by Jtest on 9/19/06 5:50:59 PM.
 */

package com.palladium.paf.view;

import com.palladium.paf.data.PafDataSlice;
import com.palladium.paf.mdb.PafDataSliceParms;
import com.palladium.paf.view.PafMVS;

/**
 * PafMVSTest is a unit test class for class PafMVS.
 * @see com.palladium.paf.view.PafMVS
 * @author Parasoft Jtest 8.0
 */
public class PafMVSTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafMVSTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: static generateKey(com.palladium.paf.view.PafView,com.palladium.paf.view.PafViewSection)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMVS#generateKey(com.palladium.paf.view.PafView,com.palladium.paf.view.PafViewSection)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGenerateKey1() throws Throwable {
		PafView t0 = new PafView();
		PafViewSection t1 = new PafViewSection();
		// jtest_tested_method
		String RETVAL = PafMVS.generateKey(t0, t1);
		assertEquals("null.null", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDataSliceParms()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMVS#getDataSliceParms()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataSliceParms1() throws Throwable {
		PafMVS THIS = new PafMVS((PafView) null, (PafViewSection) null);
		// jtest_tested_method
		PafDataSliceParms RETVAL = THIS.getDataSliceParms();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getKey()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMVS#getKey()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetKey2() throws Throwable {
		PafView t1 = new PafView();
		PafMVS THIS = new PafMVS(t1, (PafViewSection) null);
		// jtest_tested_method
		String RETVAL = THIS.getKey();
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.view.PafMVS.<init>(Lcom/palladium/paf/view/PafView;Lcom/palladium/paf/view/PafViewSection;)V>
		// at com.palladium.paf.view.PafMVS.generateKey(PafMVS.java:63)
		// at com.palladium.paf.view.PafMVS.getKey(PafMVS.java:52)
		// jtest_unverified
	}

	/**
	 * Test for method: getKey()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMVS#getKey()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetKey3() throws Throwable {
		PafMVS THIS = new PafMVS((PafView) null, (PafViewSection) null);
		PafDataSliceParms t1 = new PafDataSliceParms();
		PafView t2 = new PafView();
		PafViewSection t3 = new PafViewSection();
		THIS.setDataSliceParms(t1);
		THIS.setView(t2);
		THIS.setViewSection(t3);
		// jtest_tested_method
		String RETVAL = THIS.getKey();
		assertEquals("null.null", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getView()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMVS#getView()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetView1() throws Throwable {
		PafMVS THIS = new PafMVS((PafView) null, (PafViewSection) null);
		// jtest_tested_method
		PafView RETVAL = THIS.getView();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getView()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMVS#getView()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetView2() throws Throwable {
		PafView t0 = new PafView();
		Integer t1 = new Integer(7);
		Integer t2 = new Integer("0");
		PafViewSection t3 = new PafViewSection();
		double[] var1 = new double[] {};
		PafDataSlice t4 = new PafDataSlice(var1, 7);
		Integer t5 = new Integer("0");
		Integer t6 = new Integer(7);
		PafMVS THIS = new PafMVS(t0, t3);
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
		t3.setDescription("");
		t3.setName("");
		ViewTuple[] var6 = new ViewTuple[] {};
		t3.setColTuples(var6);
		ViewTuple[] var7 = new ViewTuple[] {};
		t3.setRowTuples(var7);
		t3.setPafDataSlice(t4);
		t3.setDataAlias("");
		t3.setManaged(true);
		t3.setPrimaryFormattingAxis(7);
		t3.setReadOnly(true);
		String[] var8 = new String[] {};
		t3.setColAxisDims(var8);
		PageTuple[] var9 = new PageTuple[] {};
		t3.setPageTuples(var9);
		String[] var10 = new String[] {};
		t3.setRowAxisDims(var10);
		t3.setLeftOffset(7);
		t3.setTopOffset(7);
		PafViewHeader[] var11 = new PafViewHeader[] {};
		t3.setPafViewHeaders(var11);
		LockedCell[] var12 = new LockedCell[] {};
		t3.setForwardPlannableLockedCell(var12);
		LockedCell[] var13 = new LockedCell[] {};
		t3.setNotPlannableLockedCells(var13);
		t3.setGenerationFormatName("");
		t3.setColumnWidth(t5);
		t3.setRowHeight(t6);
		// jtest_tested_method
		PafView RETVAL = THIS.getView();
		assertEquals(t0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getViewSection()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMVS#getViewSection()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetViewSection1() throws Throwable {
		PafMVS THIS = new PafMVS((PafView) null, (PafViewSection) null);
		// jtest_tested_method
		PafViewSection RETVAL = THIS.getViewSection();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getViewSection()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMVS#getViewSection()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetViewSection2() throws Throwable {
		PafView t0 = new PafView();
		Integer t1 = new Integer(7);
		Integer t2 = new Integer("0");
		PafViewSection t3 = new PafViewSection();
		double[] var1 = new double[] {};
		PafDataSlice t4 = new PafDataSlice(var1, 7);
		Integer t5 = new Integer("0");
		Integer t6 = new Integer(7);
		PafMVS THIS = new PafMVS(t0, t3);
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
		t3.setDescription("");
		t3.setName("");
		ViewTuple[] var6 = new ViewTuple[] {};
		t3.setColTuples(var6);
		ViewTuple[] var7 = new ViewTuple[] {};
		t3.setRowTuples(var7);
		t3.setPafDataSlice(t4);
		t3.setDataAlias("");
		t3.setManaged(true);
		t3.setPrimaryFormattingAxis(7);
		t3.setReadOnly(true);
		String[] var8 = new String[] {};
		t3.setColAxisDims(var8);
		PageTuple[] var9 = new PageTuple[] {};
		t3.setPageTuples(var9);
		String[] var10 = new String[] {};
		t3.setRowAxisDims(var10);
		t3.setLeftOffset(7);
		t3.setTopOffset(7);
		PafViewHeader[] var11 = new PafViewHeader[] {};
		t3.setPafViewHeaders(var11);
		LockedCell[] var12 = new LockedCell[] {};
		t3.setForwardPlannableLockedCell(var12);
		LockedCell[] var13 = new LockedCell[] {};
		t3.setNotPlannableLockedCells(var13);
		t3.setGenerationFormatName("");
		t3.setColumnWidth(t5);
		t3.setRowHeight(t6);
		// jtest_tested_method
		PafViewSection RETVAL = THIS.getViewSection();
		assertEquals(t3, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafMVS(com.palladium.paf.view.PafView,com.palladium.paf.view.PafViewSection)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMVS#PafMVS(com.palladium.paf.view.PafView,com.palladium.paf.view.PafViewSection)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafMVS1() throws Throwable {
		// jtest_tested_method
		PafMVS THIS = new PafMVS((PafView) null, (PafViewSection) null);
		assertEquals(null, THIS.getDataSliceParms()); // jtest_unverified
		assertEquals(null, THIS.getView()); // jtest_unverified
		assertEquals(null, THIS.getViewSection()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafMVS(com.palladium.paf.view.PafView,com.palladium.paf.view.PafViewSection)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMVS#PafMVS(com.palladium.paf.view.PafView,com.palladium.paf.view.PafViewSection)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafMVS2() throws Throwable {
		PafView t0 = new PafView();
		PafViewSection t1 = new PafViewSection();
		// jtest_tested_method
		PafMVS THIS = new PafMVS(t0, t1);
		assertEquals("null.null", THIS.getKey()); // jtest_unverified
		assertEquals(null, THIS.getDataSliceParms()); // jtest_unverified
		assertEquals(t0, THIS.getView()); // jtest_unverified
		assertEquals(t1, THIS.getViewSection()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setDataSliceParms(com.palladium.paf.mdb.PafDataSliceParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMVS#setDataSliceParms(com.palladium.paf.mdb.PafDataSliceParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDataSliceParms1() throws Throwable {
		PafView t0 = new PafView();
		PafViewSection t1 = new PafViewSection();
		PafMVS THIS = new PafMVS(t0, t1);
		PafDataSliceParms t3 = new PafDataSliceParms();
		// jtest_tested_method
		THIS.setDataSliceParms(t3);
		assertEquals(t3, THIS.getDataSliceParms()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setView(com.palladium.paf.view.PafView)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMVS#setView(com.palladium.paf.view.PafView)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetView1() throws Throwable {
		PafView t0 = new PafView();
		PafViewSection t1 = new PafViewSection();
		PafMVS THIS = new PafMVS(t0, t1);
		PafView t3 = new PafView();
		// jtest_tested_method
		THIS.setView(t3);
		assertEquals(t3, THIS.getView()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setViewSection(com.palladium.paf.view.PafViewSection)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMVS#setViewSection(com.palladium.paf.view.PafViewSection)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetViewSection1() throws Throwable {
		PafView t0 = new PafView();
		PafViewSection t1 = new PafViewSection();
		PafMVS THIS = new PafMVS(t0, t1);
		PafViewSection t3 = new PafViewSection();
		// jtest_tested_method
		THIS.setViewSection(t3);
		assertEquals(t3, THIS.getViewSection()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.view.PafMVSTest
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
			PafMVSTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.view.PafMVS",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafMVS.class;
	}

}

// JTEST_CURRENT_ID=-1106911321.