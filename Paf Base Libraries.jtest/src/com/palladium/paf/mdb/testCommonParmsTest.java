/*
 * testCommonParmsTest.java
 * Created by Jtest on 9/19/06 5:50:36 PM.
 * Updated by Jtest on 10/18/06 8:01:24 PM, 4 test cases added, 4 test cases removed.
 * Updated by Jtest on 11/9/06 3:01:58 AM, 4 test cases added, 4 test cases removed.
 */

package com.palladium.paf.mdb;

import java.util.Properties;
import java.util.Set;
import java.util.Map;
import com.palladium.paf.PafException;
import jtest.Stubs;
import java.lang.reflect.Member;
import com.palladium.paf.mdb.testCommonParms;

/**
 * testCommonParmsTest is a unit test class for class testCommonParms.
 * @see com.palladium.paf.mdb.testCommonParms
 * @author Parasoft Jtest 8.0
 */
public class testCommonParmsTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public testCommonParmsTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: static getActiveVersions()
	 * @throws Throwable Tests may throw any Throwable
	 * @see testCommonParms#getActiveVersions()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetActiveVersions1() throws Throwable {
		// jtest_tested_method
		String[] RETVAL = testCommonParms.getActiveVersions();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(2, RETVAL.length); // jtest_unverified
		assertEquals("WP", RETVAL[0]); // jtest_unverified
		assertEquals("WF", RETVAL[1]); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static getConnectionProps()
	 * @throws Throwable Tests may throw any Throwable
	 * @see testCommonParms#getConnectionProps()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetConnectionProps1() throws Throwable {
		// jtest_tested_method
		Properties RETVAL = testCommonParms.getConnectionProps();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(
			"{EDSURL=tcpip://localhost:5001, EDSDOMAIN=Essbase, DATABASE=Titan, USER=system, SERVER=localhost, APPLICATION=Titan, PASSWORD=password}",
			RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static getCurrentYear()
	 * @throws Throwable Tests may throw any Throwable
	 * @see testCommonParms#getCurrentYear()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetCurrentYear1() throws Throwable {
		// jtest_tested_method
		String RETVAL = testCommonParms.getCurrentYear();
		assertEquals("FY2006", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static getEmptyMemberFilters()
	 * @throws Throwable Tests may throw any Throwable
	 * @see testCommonParms#getEmptyMemberFilters()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetEmptyMemberFilters1() throws Throwable {
		// jtest_tested_method
		Map RETVAL = testCommonParms.getEmptyMemberFilters();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("{Time=[Feb, Mar, Apr], Measures=[]}", RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static getFcstVersion()
	 * @throws Throwable Tests may throw any Throwable
	 * @see testCommonParms#getFcstVersion()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetFcstVersion1() throws Throwable {
		// jtest_tested_method
		String RETVAL = testCommonParms.getFcstVersion();
		assertEquals("WF", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static getLockedPeriods()
	 * @throws Throwable Tests may throw any Throwable
	 * @see testCommonParms#getLockedPeriods()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLockedPeriods1() throws Throwable {
		// jtest_tested_method
		Set RETVAL = testCommonParms.getLockedPeriods();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("[WK03, Feb, WK01, WK04, WK02, WK05]", RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static getMemberFilters()
	 * @throws Throwable Tests may throw any Throwable
	 * @see testCommonParms#getMemberFilters()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberFilters1() throws Throwable {
		// jtest_tested_method
		Map RETVAL = testCommonParms.getMemberFilters();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(
			"{Time=[Feb, Mar, Apr], Measures=[SLS_DLR, MD_DLR]}",
			RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static getNextYear()
	 * @throws Throwable Tests may throw any Throwable
	 * @see testCommonParms#getNextYear()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetNextYear1() throws Throwable {
		// jtest_tested_method
		String RETVAL = testCommonParms.getNextYear();
		assertEquals("FY2007", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static getPafMemberParent()
	 * @throws Throwable Tests may throw any Throwable
	 * @see testCommonParms#getPafMemberParent()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPafMemberParent1() throws Throwable {
		// jtest_tested_method
		PafMember RETVAL = testCommonParms.getPafMemberParent();

		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:110)
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
		// at com.palladium.paf.mdb.testCommonParms.getPafMemberParent(testCommonParms.java:315)
		// Caused by: java.lang.NullPointerException
		// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
		// jtest_unverified
	}

	/**
	 * Test for method: static getPafMemberParent()
	 * @throws Throwable Tests may throw any Throwable
	 * @see testCommonParms#getPafMemberParent()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPafMemberParent2() throws Throwable {
		// jtest_tested_method
		PafMember RETVAL = testCommonParms.getPafMemberParent();

		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.testCommonParms.getPafMemberParent(testCommonParms.java:315)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetPafMemberParent2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetPafMemberParent2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafMemberTree.class)) {
			argument_types = new Class[] { PafMember.class, String[].class };
			if (Stubs.matches(method, argument_types)) {
				throw new PafException();
				// at com.palladium.paf.mdb.testCommonParms.getPafMemberParent(testCommonParms.java:315)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static getPafMemberParent()
	 * @throws Throwable Tests may throw any Throwable
	 * @see testCommonParms#getPafMemberParent()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPafMemberParent3() throws Throwable {
		// jtest_tested_method
		PafMember RETVAL = testCommonParms.getPafMemberParent();
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.testCommonParms.getPafMemberParent(testCommonParms.java:321)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetPafMemberParent3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetPafMemberParent3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafMemberTree.class)) {
			argument_types = new Class[] { PafMember.class };
			if (Stubs.matches(method, "addToLvlTree", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
				// at com.palladium.paf.mdb.testCommonParms.getPafMemberParent(testCommonParms.java:315)
			}
			argument_types = new Class[] { PafMember.class };
			if (Stubs.matches(method, "addToGenTree", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
				// at com.palladium.paf.mdb.testCommonParms.getPafMemberParent(testCommonParms.java:315)
			}
			argument_types = new Class[] { String.class, PafMember.class };
			if (Stubs.matches(method, "addChild", argument_types)) {
				throw new PafException();
				// at com.palladium.paf.mdb.testCommonParms.getPafMemberParent(testCommonParms.java:321)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static getPafMemberParent()
	 * @throws Throwable Tests may throw any Throwable
	 * @see testCommonParms#getPafMemberParent()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPafMemberParent4() throws Throwable {
		// jtest_tested_method
		PafMember RETVAL = testCommonParms.getPafMemberParent();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("Parent", RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetPafMemberParent4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetPafMemberParent4(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafMemberTree.class)) {
			argument_types = new Class[] { PafMember.class, String[].class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(PafMemberTree.class);
				// at com.palladium.paf.mdb.testCommonParms.getPafMemberParent(testCommonParms.java:315)
			}
			argument_types = new Class[] { String.class, PafMember.class };
			if (Stubs.matches(method, "addChild", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.testCommonParms.getPafMemberParent(testCommonParms.java:321)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static getPafMemberTree(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see testCommonParms#getPafMemberTree(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPafMemberTree1() throws Throwable {
		// jtest_tested_method
		PafMemberTree RETVAL = testCommonParms.getPafMemberTree((String) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.mdb.testCommonParms.getPafMemberTree(Ljava/lang/String;)Lcom/palladium/paf/mdb/PafMemberTree;>
		// at com.palladium.paf.mdb.testCommonParms.getPafMemberTree(testCommonParms.java:344)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetPafMemberTree1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetPafMemberTree1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafMemberTree.class)) {
			argument_types = new Class[] { PafMember.class, String[].class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(PafMemberTree.class);
				// at com.palladium.paf.mdb.testCommonParms.getPafMemberTree(testCommonParms.java:342)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static getPafMemberTree(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see testCommonParms#getPafMemberTree(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPafMemberTree2() throws Throwable {
		// jtest_tested_method
		PafMemberTree RETVAL = testCommonParms.getPafMemberTree("time");
		assertNotNull(RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetPafMemberTree2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetPafMemberTree2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafMemberTree.class)) {
			argument_types = new Class[] { PafMember.class, String[].class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(PafMemberTree.class);
				// at com.palladium.paf.mdb.testCommonParms.getPafMemberTree(testCommonParms.java:342)
			}
			argument_types = new Class[] { String.class, PafMember.class };
			if (Stubs.matches(method, "addChild", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.testCommonParms.getPafMemberTree(testCommonParms.java:350)
				// 
				// at com.palladium.paf.mdb.testCommonParms.getPafMemberTree(testCommonParms.java:356)
				// 
				// at com.palladium.paf.mdb.testCommonParms.getPafMemberTree(testCommonParms.java:364)
				// 
				// at com.palladium.paf.mdb.testCommonParms.getPafMemberTree(testCommonParms.java:370)
				// 
				// at com.palladium.paf.mdb.testCommonParms.getPafMemberTree(testCommonParms.java:379)
				// 
				// at com.palladium.paf.mdb.testCommonParms.getPafMemberTree(testCommonParms.java:385)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static getPlanVersion()
	 * @throws Throwable Tests may throw any Throwable
	 * @see testCommonParms#getPlanVersion()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPlanVersion1() throws Throwable {
		// jtest_tested_method
		String RETVAL = testCommonParms.getPlanVersion();
		assertEquals("WP", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static getSampleMdxSelect()
	 * @throws Throwable Tests may throw any Throwable
	 * @see testCommonParms#getSampleMdxSelect()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetSampleMdxSelect1() throws Throwable {
		// jtest_tested_method
		String RETVAL = testCommonParms.getSampleMdxSelect();
		assertEquals(
			"SELECT  Descendants(S01) ON AXIS(0),  {[SLS_DLR], [MDTTL_DLR], [RECRTL_DLR], [BOPRTL_DLR], [EOPRTL_DLR], [FWOS]}  ON AXIS(1),  Descendants(DIV01) ON AXIS(2),  {[ClassChn]}  ON AXIS(3),  {[WP], [LY], [WAP], [WF], [OP], [WF_vs_LY], [WAF], [WP_vs_LY], [WP_vs_LY_%], [WP_vs_OP]}  ON AXIS(4),  {[FY2006]}  ON AXIS(5),  Descendants ( [Location] )  ON AXIS(6) ",
			RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static main(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see testCommonParms#main(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testMain1() throws Throwable {
		String[] var1 = new String[] {};
		// jtest_tested_method
		testCommonParms.main(var1);
		assertNotNull(testCommonParms.getActiveVersions()); // jtest_unverified
		assertEquals(2, testCommonParms.getActiveVersions().length); // jtest_unverified
		assertEquals("WP", testCommonParms.getActiveVersions()[0]); // jtest_unverified
		assertEquals("WF", testCommonParms.getActiveVersions()[1]); // jtest_unverified
		assertNotNull(testCommonParms.getConnectionProps()); // jtest_unverified
		assertEquals(
			"{EDSURL=tcpip://localhost:5001, EDSDOMAIN=Essbase, DATABASE=Titan, USER=system, SERVER=localhost, APPLICATION=Titan, PASSWORD=password}",
			testCommonParms.getConnectionProps().toString()); // jtest_unverified
		assertEquals("FY2006", testCommonParms.getCurrentYear()); // jtest_unverified
		assertNotNull(testCommonParms.getEmptyMemberFilters()); // jtest_unverified
		assertEquals("{Time=[Feb, Mar, Apr], Measures=[]}", testCommonParms
			.getEmptyMemberFilters().toString()); // jtest_unverified
		assertEquals("WF", testCommonParms.getFcstVersion()); // jtest_unverified
		assertNotNull(testCommonParms.getLockedPeriods()); // jtest_unverified
		assertEquals("[WK03, Feb, WK01, WK04, WK02, WK05]", testCommonParms
			.getLockedPeriods().toString()); // jtest_unverified
		assertNotNull(testCommonParms.getMemberFilters()); // jtest_unverified
		assertEquals(
			"{Time=[Feb, Mar, Apr], Measures=[SLS_DLR, MD_DLR]}",
			testCommonParms.getMemberFilters().toString()); // jtest_unverified
		assertEquals("FY2007", testCommonParms.getNextYear()); // jtest_unverified
		assertEquals("WP", testCommonParms.getPlanVersion()); // jtest_unverified
		assertEquals(
			"SELECT  Descendants(S01) ON AXIS(0),  {[SLS_DLR], [MDTTL_DLR], [RECRTL_DLR], [BOPRTL_DLR], [EOPRTL_DLR], [FWOS]}  ON AXIS(1),  Descendants(DIV01) ON AXIS(2),  {[ClassChn]}  ON AXIS(3),  {[WP], [LY], [WAP], [WF], [OP], [WF_vs_LY], [WAF], [WP_vs_LY], [WP_vs_LY_%], [WP_vs_OP]}  ON AXIS(4),  {[FY2006]}  ON AXIS(5),  Descendants ( [Location] )  ON AXIS(6) ",
			testCommonParms.getSampleMdxSelect()); // jtest_unverified
		assertNotNull(testCommonParms.getTimeTree()); // jtest_unverified
		assertEquals(
			"\nQ1\n\tFeb\n\t\tWK01\n\t\tWK02\n\t\tWK03\n\t\tWK04\n\tMar\n\t\tWK05\n\t\tWK06\n\t\tWK07\n\t\tWK08\n\tApr\n\t\tWK09\n\t\tWK10\n\t\tWK11\n\t\tWK12\n\t\tWK13\n",
			testCommonParms.getTimeTree().toString()); // jtest_unverified
		assertNotNull(testCommonParms.getAppDef()); // jtest_unverified
		assertEquals("FY2006", testCommonParms.getAppDef().getCurrentYear()); // jtest_unverified
		assertNotNull(testCommonParms.getAppDef().getMdbDef()); // jtest_unverified
		assertEquals("Time", testCommonParms.getAppDef().getMdbDef()
			.getTimeDim()); // jtest_unverified
		assertEquals("Measures", testCommonParms.getAppDef().getMdbDef()
			.getMeasureDim()); // jtest_unverified
		assertEquals("Years", testCommonParms.getAppDef().getMdbDef()
			.getYearDim()); // jtest_unverified
		assertNotNull(testCommonParms.getAppDef().getMdbDef().getHierDims()); // jtest_unverified
		assertEquals(
			3,
			testCommonParms.getAppDef().getMdbDef().getHierDims().length); // jtest_unverified
		assertEquals("Product", testCommonParms.getAppDef().getMdbDef()
			.getHierDims()[0]); // jtest_unverified
		assertEquals("Location", testCommonParms.getAppDef().getMdbDef()
			.getHierDims()[1]); // jtest_unverified
		assertEquals("Years", testCommonParms.getAppDef().getMdbDef()
			.getHierDims()[2]); // jtest_unverified
		assertEquals("PlanType", testCommonParms.getAppDef().getMdbDef()
			.getPlanTypeDim()); // jtest_unverified
		assertEquals("Version", testCommonParms.getAppDef().getMdbDef()
			.getVersionDim()); // jtest_unverified
		assertEquals(8, testCommonParms.getAppDef().getMdbDef().getDimCount()); // jtest_unverified
		assertEquals("Titan", testCommonParms.getAppDef().getMdbDef()
			.getDataSourceId()); // jtest_unverified
		assertNotNull(testCommonParms.getAppDef().getSeasonList()); // jtest_unverified
		assertNotNull(testCommonParms.getAppDef().getSeasonList().getSeasons()); // jtest_unverified
		assertEquals("Titan", testCommonParms.getAppDef().getAppId()); // jtest_unverified
		assertNotNull(testCommonParms.getAppDef().getPlanCycles()); // jtest_unverified
		assertEquals(2, testCommonParms.getAppDef().getPlanCycles().length); // jtest_unverified
		assertEquals("WK05", testCommonParms.getAppDef().getLastPeriod()); // jtest_unverified
		assertNotNull(testCommonParms.getAppDef().getMeasures()); // jtest_unverified
		assertNotNull(testCommonParms.getAppDef().getVersions()); // jtest_unverified
		assertNotNull(testCommonParms.getMeasureDefs()); // jtest_unverified
		assertEquals(5, testCommonParms.getMeasureDefs().length); // jtest_unverified
		assertNotNull(testCommonParms.getMeasureDefs()[0]); // jtest_unverified
		assertEquals("SLS_DLR", testCommonParms.getMeasureDefs()[0].getName()); // jtest_unverified
		assertEquals(null, testCommonParms.getMeasureDefs()[0]
			.getNumericFormatName()); // jtest_unverified
		assertEquals(null, testCommonParms.getMeasureDefs()[0].getPlannable()); // jtest_unverified
		assertNotNull(testCommonParms.getMeasureDefs()[1]); // jtest_unverified
		assertEquals("MDTTL_DLR", testCommonParms.getMeasureDefs()[1].getName()); // jtest_unverified
		assertEquals(null, testCommonParms.getMeasureDefs()[1]
			.getNumericFormatName()); // jtest_unverified
		assertEquals(null, testCommonParms.getMeasureDefs()[1].getPlannable()); // jtest_unverified
		assertNotNull(testCommonParms.getMeasureDefs()[2]); // jtest_unverified
		assertEquals("RECRTL_DLR", testCommonParms.getMeasureDefs()[2]
			.getName()); // jtest_unverified
		assertEquals(null, testCommonParms.getMeasureDefs()[2]
			.getNumericFormatName()); // jtest_unverified
		assertEquals(null, testCommonParms.getMeasureDefs()[2].getPlannable()); // jtest_unverified
		assertNotNull(testCommonParms.getMeasureDefs()[4]); // jtest_unverified
		assertEquals("EOPRTL_DLR", testCommonParms.getMeasureDefs()[4]
			.getName()); // jtest_unverified
		assertEquals(null, testCommonParms.getMeasureDefs()[4]
			.getNumericFormatName()); // jtest_unverified
		assertEquals(null, testCommonParms.getMeasureDefs()[4].getPlannable()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.mdb.testCommonParmsTest
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
			testCommonParmsTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.mdb.testCommonParms",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return testCommonParms.class;
	}

			}

// JTEST_CURRENT_ID=-1602956858.