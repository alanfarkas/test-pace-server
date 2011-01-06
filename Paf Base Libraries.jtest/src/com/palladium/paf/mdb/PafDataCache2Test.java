/*
 * PafDataCache2Test.java
 * Created by Jtest on 9/19/06 5:44:42 PM.
 * Updated by Jtest on 10/18/06 8:00:21 PM, 49 test cases added, 49 test cases removed.
 * Updated by Jtest on 11/9/06 3:00:32 AM, 49 test cases added, 49 test cases removed.
 */

package com.palladium.paf.mdb;

import com.palladium.paf.app.MeasureDef;
import com.palladium.paf.app.MeasureType;
import java.util.List;
import com.palladium.paf.app.VersionType;
import com.palladium.paf.app.VersionDef;
import com.palladium.paf.data.PafDataSlice;
import java.util.HashMap;
import java.util.Set;
import java.lang.reflect.Member;
import jtest.Stubs;
import java.util.Map;
import com.palladium.paf.app.PlanCycle;
import com.palladium.paf.app.MdbDef;
import com.palladium.paf.app.SeasonList;
import com.palladium.paf.app.PafApplicationDef;
import com.palladium.paf.mdb.PafDataCache2;

/**
 * PafDataCache2Test is a unit test class for class PafDataCache2.
 * @see com.palladium.paf.mdb.PafDataCache2
 * @author Parasoft Jtest 8.0
 */
public class PafDataCache2Test extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafDataCache2Test(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}
	/**
	 * Test for method: addChangedCell(int[],double)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#addChangedCell(int[],double)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddChangedCell1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t3.setYearDim("");
		String[] var2 = new String[] {};
		t3.setHierDims(var2);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var3 = new String[] {};
		t3.setAxisPriority(var3);
		_f0.setMdbDef(t3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		_f5.setYearDim("");
		String[] var8 = new String[] {};
		_f5.setHierDims(var8);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var9 = new String[] {};
		_f5.setAxisPriority(var9);
		THIS.setAxisCount(0);
		int[] var10 = new int[] {};
		THIS.setAxisSizes(var10);
		int[] var11 = new int[] {};
		THIS.setDimCountByAxis(var11);
		boolean[] var12 = new boolean[] {};
		THIS.setIsSlicerAxis(var12);
		THIS.setMdxQuery("");
		// jtest_tested_method
		THIS.addChangedCell((int[]) null, 0.0);
		assertEquals(5, _f5.getDimCount()); // jtest_unverified
		assertEquals(5, _f3.getDimCount()); // jtest_unverified
		assertEquals(5, t3.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testAddChangedCell1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAddChangedCell1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getActiveVersions()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getActiveVersions()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetActiveVersions1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t3.setYearDim("");
		String[] var2 = new String[] {};
		t3.setHierDims(var2);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var3 = new String[] {};
		t3.setAxisPriority(var3);
		_f0.setMdbDef(t3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		_f5.setYearDim("");
		String[] var8 = new String[] {};
		_f5.setHierDims(var8);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var9 = new String[] {};
		_f5.setAxisPriority(var9);
		THIS.setAxisCount(0);
		int[] var10 = new int[] {};
		THIS.setAxisSizes(var10);
		int[] var11 = new int[] {};
		THIS.setDimCountByAxis(var11);
		boolean[] var12 = new boolean[] {};
		THIS.setIsSlicerAxis(var12);
		THIS.setMdxQuery("");
		// jtest_tested_method
		String[] RETVAL = THIS.getActiveVersions();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0, RETVAL.length); // jtest_unverified
		assertEquals(5, t3.getDimCount()); // jtest_unverified
		assertEquals(5, _f3.getDimCount()); // jtest_unverified
		assertEquals(5, _f5.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetActiveVersions1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetActiveVersions1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getAxisCount()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getAxisCount()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAxisCount1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t3.setYearDim("");
		String[] var2 = new String[] {};
		t3.setHierDims(var2);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var3 = new String[] {};
		t3.setAxisPriority(var3);
		_f0.setMdbDef(t3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		_f5.setYearDim("");
		String[] var8 = new String[] {};
		_f5.setHierDims(var8);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var9 = new String[] {};
		_f5.setAxisPriority(var9);
		THIS.setAxisCount(0);
		int[] var10 = new int[] {};
		THIS.setAxisSizes(var10);
		int[] var11 = new int[] {};
		THIS.setDimCountByAxis(var11);
		boolean[] var12 = new boolean[] {};
		THIS.setIsSlicerAxis(var12);
		THIS.setMdxQuery("");
		// jtest_tested_method
		int RETVAL = THIS.getAxisCount();
		assertEquals(0, RETVAL); // jtest_unverified
		assertEquals(5, _f3.getDimCount()); // jtest_unverified
		assertEquals(5, _f5.getDimCount()); // jtest_unverified
		assertEquals(5, t3.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetAxisCount1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetAxisCount1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getAxisMembers(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getAxisMembers(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAxisMembers1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		_f0.setMdbDef(t3);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var3);
		_f2.setYearDim("");
		String[] var4 = new String[] {};
		_f2.setHierDims(var4);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var5 = new String[] {};
		_f2.setAxisPriority(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		// jtest_tested_method
		String[] RETVAL = THIS.getAxisMembers(1);
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.mdb.PafDataCache2.getAxisMembers(PafDataCache2.java:753)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetAxisMembers1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetAxisMembers1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getAxisSize(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getAxisSize(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAxisSize1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t3.setYearDim("");
		String[] var2 = new String[] {};
		t3.setHierDims(var2);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var3 = new String[] {};
		t3.setAxisPriority(var3);
		_f0.setMdbDef(t3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		_f5.setYearDim("");
		String[] var8 = new String[] {};
		_f5.setHierDims(var8);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var9 = new String[] {};
		_f5.setAxisPriority(var9);
		THIS.setAxisCount(1);
		int[] var10 = new int[] {};
		THIS.setAxisSizes(var10);
		int[] var11 = new int[] {};
		THIS.setDimCountByAxis(var11);
		boolean[] var12 = new boolean[] {};
		THIS.setIsSlicerAxis(var12);
		THIS.setMdxQuery("");
		// jtest_tested_method
		int RETVAL = THIS.getAxisSize(0);
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.mdb.PafDataCache2.getAxisSize(PafDataCache2.java:775)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetAxisSize1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetAxisSize1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getAxisSizes()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getAxisSizes()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAxisSizes1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		_f0.setMdbDef(t3);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var3);
		_f2.setYearDim("");
		String[] var4 = new String[] {};
		_f2.setHierDims(var4);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var5 = new String[] {};
		_f2.setAxisPriority(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		// jtest_tested_method
		int[] RETVAL = THIS.getAxisSizes();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(1, RETVAL.length); // jtest_unverified
		assertEquals(2, RETVAL[0]); // jtest_unverified
		assertEquals(5, _f3.getDimCount()); // jtest_unverified
		assertEquals(5, _f2.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetAxisSizes1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetAxisSizes1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getBlockSize()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getBlockSize()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetBlockSize1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		PafApplicationDef t1 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer(0);
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		t0.setAxisCount(0);
		int[] var1 = new int[] {};
		t0.setAxisSize(var1);
		int[] var2 = new int[] {};
		t0.setDimCountByAxis(var2);
		String[] var3 = new String[] {};
		t0.setDimensions(var3);
		boolean[] var4 = new boolean[] {};
		t0.setIsSlicerAxis(var4);
		t0.setMdxQuery("");
		String[][] var5 = new String[][] {};
		t0.setMemberArray(var5);
		Set var6 = (Set) Stubs.makeStubObject(Set.class);
		t0.setLockedPeriods(var6);
		t1.setSeasonList(t2);
		t1.setAppId("");
		PlanCycle[] var7 = new PlanCycle[] {};
		t1.setPlanCycles(var7);
		t1.setLastPeriod("");
		t1.setCurrentYear("");
		t3.setYearDim("");
		String[] var8 = new String[] {};
		t3.setHierDims(var8);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var9 = new String[] {};
		t3.setAxisPriority(var9);
		t1.setMdbDef(t3);
		Map var10 = (Map) Stubs.makeStubObject(Map.class);
		t1.setMeasures(var10);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		t1.setVersions(var11);
		t0.setAppDef(t1);
		String[] var12 = new String[] {};
		t0.setActiveVersion(var12);
		_f3.setYearDim("");
		String[] var13 = new String[] {};
		_f3.setHierDims(var13);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var14 = new String[] {};
		_f3.setAxisPriority(var14);
		_f5.setYearDim("");
		String[] var15 = new String[] {};
		_f5.setHierDims(var15);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var16 = new String[] {};
		_f5.setAxisPriority(var16);
		// jtest_tested_method
		int[] RETVAL = THIS.getBlockSize();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0, RETVAL.length); // jtest_unverified
		assertEquals(5, t3.getDimCount()); // jtest_unverified
		assertEquals(5, _f5.getDimCount()); // jtest_unverified
		assertEquals(5, _f3.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetBlockSize1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetBlockSize1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getCellCount()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getCellCount()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetCellCount1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		PafApplicationDef t1 = new PafApplicationDef();
		_f0 = new PafApplicationDef();
		SeasonList t3 = new SeasonList();
		MdbDef t4 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		t0.setAxisCount(7);
		int[] var1 = new int[] {};
		t0.setAxisSize(var1);
		int[] var2 = new int[] {};
		t0.setDimCountByAxis(var2);
		String[] var3 = new String[] {};
		t0.setDimensions(var3);
		boolean[] var4 = new boolean[] {};
		t0.setIsSlicerAxis(var4);
		t0.setMdxQuery("");
		String[][] var5 = new String[][] {};
		t0.setMemberArray(var5);
		Set var6 = (Set) Stubs.makeStubObject(Set.class);
		t0.setLockedPeriods(var6);
		t0.setAppDef(t1);
		String[] var7 = new String[] {};
		t0.setActiveVersion(var7);
		_f0.setSeasonList(t3);
		_f0.setAppId("");
		PlanCycle[] var8 = new PlanCycle[] {};
		_f0.setPlanCycles(var8);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t4.setYearDim("");
		String[] var9 = new String[] {};
		t4.setHierDims(var9);
		t4.setMeasureDim("");
		t4.setPlanTypeDim("");
		t4.setTimeDim("");
		t4.setVersionDim("");
		t4.setDataSourceId("");
		String[] var10 = new String[] {};
		t4.setAxisPriority(var10);
		_f0.setMdbDef(t4);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var11);
		Map var12 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var12);
		_f1.setYearDim("");
		String[] var13 = new String[] {};
		_f1.setHierDims(var13);
		_f1.setMeasureDim("");
		_f1.setPlanTypeDim("");
		_f1.setTimeDim("");
		_f1.setVersionDim("");
		_f1.setDataSourceId("");
		String[] var14 = new String[] {};
		_f1.setAxisPriority(var14);
		_f5.setYearDim("");
		String[] var15 = new String[] {};
		_f5.setHierDims(var15);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var16 = new String[] {};
		_f5.setAxisPriority(var16);
		// jtest_tested_method
		int RETVAL = THIS.getCellCount();
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:466)
		// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetCellCount1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetCellCount1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.MdbDef.getVersionDim()");
				switch (index) {
					case 1 :
						return null;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return "";
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getCellValue(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getCellValue(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetCellValue1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		PafApplicationDef t1 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer(0);
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		t0.setAxisCount(0);
		int[] var1 = new int[] {};
		t0.setAxisSize(var1);
		int[] var2 = new int[] {};
		t0.setDimCountByAxis(var2);
		String[] var3 = new String[] {};
		t0.setDimensions(var3);
		boolean[] var4 = new boolean[] {};
		t0.setIsSlicerAxis(var4);
		t0.setMdxQuery("");
		String[][] var5 = new String[][] {};
		t0.setMemberArray(var5);
		Set var6 = (Set) Stubs.makeStubObject(Set.class);
		t0.setLockedPeriods(var6);
		t1.setSeasonList(t2);
		t1.setAppId("");
		PlanCycle[] var7 = new PlanCycle[] {};
		t1.setPlanCycles(var7);
		t1.setLastPeriod("");
		t1.setCurrentYear("");
		t3.setYearDim("");
		String[] var8 = new String[] {};
		t3.setHierDims(var8);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var9 = new String[] {};
		t3.setAxisPriority(var9);
		t1.setMdbDef(t3);
		Map var10 = (Map) Stubs.makeStubObject(Map.class);
		t1.setMeasures(var10);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		t1.setVersions(var11);
		t0.setAppDef(t1);
		String[] var12 = new String[] {};
		t0.setActiveVersion(var12);
		_f3.setYearDim("");
		String[] var13 = new String[] {};
		_f3.setHierDims(var13);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var14 = new String[] {};
		_f3.setAxisPriority(var14);
		_f5.setYearDim("");
		String[] var15 = new String[] {};
		_f5.setHierDims(var15);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var16 = new String[] {};
		_f5.setAxisPriority(var16);
		String[] var17 = new String[] { null };
		// jtest_tested_method
		double RETVAL = THIS.getCellValue(var17);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.PafDataCache2.membersToIndex(PafDataCache2.java:1689)
		// at com.palladium.paf.mdb.PafDataCache2.getCellValue(PafDataCache2.java:827)
		// Caused by: java.lang.IllegalArgumentException: Paf Exception: Member combination to index conversion error - member corresponding to [] dimension (axis [0]) is null
		// at com.palladium.paf.mdb.PafDataCache2.membersToIndex(PafDataCache2.java:1679)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetCellValue1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetCellValue1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getCellValue(int[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getCellValue(int[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetCellValue2() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer(0);
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t3.setYearDim("");
		String[] var2 = new String[] {};
		t3.setHierDims(var2);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var3 = new String[] {};
		t3.setAxisPriority(var3);
		_f0.setMdbDef(t3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var5);
		_f2.setYearDim("");
		String[] var6 = new String[] {};
		_f2.setHierDims(var6);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var7 = new String[] {};
		_f2.setAxisPriority(var7);
		_f3.setYearDim("");
		String[] var8 = new String[] {};
		_f3.setHierDims(var8);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var9 = new String[] {};
		_f3.setAxisPriority(var9);
		// jtest_tested_method
		double RETVAL = THIS.getCellValue((int[]) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.PafDataCache2.getDataCellIndex(PafDataCache2.java:1751)
		// at com.palladium.paf.mdb.PafDataCache2.getCellValue(PafDataCache2.java:840)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetCellValue2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetCellValue2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getChangedCells()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getChangedCells()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetChangedCells1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t3.setYearDim("");
		String[] var2 = new String[] {};
		t3.setHierDims(var2);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var3 = new String[] {};
		t3.setAxisPriority(var3);
		_f0.setMdbDef(t3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		_f5.setYearDim("");
		String[] var8 = new String[] {};
		_f5.setHierDims(var8);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var9 = new String[] {};
		_f5.setAxisPriority(var9);
		THIS.setAxisCount(0);
		int[] var10 = new int[] {};
		THIS.setAxisSizes(var10);
		int[] var11 = new int[] {};
		THIS.setDimCountByAxis(var11);
		boolean[] var12 = new boolean[] {};
		THIS.setIsSlicerAxis(var12);
		THIS.setMdxQuery("");
		// jtest_tested_method
		List RETVAL = THIS.getChangedCells();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0, RETVAL.size()); // jtest_unverified
		assertEquals(5, t3.getDimCount()); // jtest_unverified
		assertEquals(5, _f5.getDimCount()); // jtest_unverified
		assertEquals(5, _f3.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetChangedCells1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetChangedCells1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getColumnCount()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getColumnCount()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetColumnCount1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t3.setYearDim("");
		String[] var2 = new String[] {};
		t3.setHierDims(var2);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var3 = new String[] {};
		t3.setAxisPriority(var3);
		_f0.setMdbDef(t3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		_f5.setYearDim("");
		String[] var8 = new String[] {};
		_f5.setHierDims(var8);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var9 = new String[] {};
		_f5.setAxisPriority(var9);
		THIS.setAxisCount(0);
		int[] var10 = new int[] {};
		THIS.setAxisSizes(var10);
		int[] var11 = new int[] {};
		THIS.setDimCountByAxis(var11);
		boolean[] var12 = new boolean[] {};
		THIS.setIsSlicerAxis(var12);
		THIS.setMdxQuery("");
		// jtest_tested_method
		int RETVAL = THIS.getColumnCount();
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.mdb.PafDataCache2.getColumnCount(PafDataCache2.java:925)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetColumnCount1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetColumnCount1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getCurrentYear()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getCurrentYear()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetCurrentYear1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t3.setYearDim("");
		String[] var2 = new String[] {};
		t3.setHierDims(var2);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var3 = new String[] {};
		t3.setAxisPriority(var3);
		_f0.setMdbDef(t3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var5);
		_f1.setYearDim("");
		String[] var6 = new String[] {};
		_f1.setHierDims(var6);
		_f1.setMeasureDim("");
		_f1.setPlanTypeDim("");
		_f1.setTimeDim("");
		_f1.setVersionDim("");
		_f1.setDataSourceId("");
		String[] var7 = new String[] {};
		_f1.setAxisPriority(var7);
		_f5.setYearDim("");
		String[] var8 = new String[] {};
		_f5.setHierDims(var8);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var9 = new String[] {};
		_f5.setAxisPriority(var9);
		// jtest_tested_method
		String RETVAL = THIS.getCurrentYear();
		assertEquals(null, RETVAL); // jtest_unverified
		assertEquals(5, _f5.getDimCount()); // jtest_unverified
		assertEquals(5, _f1.getDimCount()); // jtest_unverified
		assertEquals(5, t3.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetCurrentYear1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetCurrentYear1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentYear", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.getCurrentYear(PafDataCache2.java:1844)
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataCellIterator()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getDataCellIterator()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataCellIterator1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer(0);
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f2.setYearDim("");
		String[] var1 = new String[] {};
		_f2.setHierDims(var1);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var2 = new String[] {};
		_f2.setAxisPriority(var2);
		_f3.setYearDim("");
		String[] var3 = new String[] {};
		_f3.setHierDims(var3);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var4 = new String[] {};
		_f3.setAxisPriority(var4);
		THIS.setAxisCount(-1);
		int[] var5 = new int[] {};
		THIS.setAxisSizes(var5);
		int[] var6 = new int[] {};
		THIS.setDimCountByAxis(var6);
		boolean[] var7 = new boolean[] {};
		THIS.setIsSlicerAxis(var7);
		THIS.setMdxQuery("");
		// jtest_tested_method
		PafIntersectionIterator RETVAL = THIS.getDataCellIterator();
		// NegativeArraySizeException thrown
		// at com.palladium.paf.mdb.PafDataCache2.getDataCellIterator(PafDataCache2.java:530)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataCellIterator1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataCellIterator1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataCellIterator()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getDataCellIterator()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataCellIterator3() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer(0);
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f2.setYearDim("");
		String[] var1 = new String[] {};
		_f2.setHierDims(var1);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var2 = new String[] {};
		_f2.setAxisPriority(var2);
		_f5.setYearDim("");
		String[] var3 = new String[] {};
		_f5.setHierDims(var3);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var4 = new String[] {};
		_f5.setAxisPriority(var4);
		THIS.setAxisCount(1);
		int[] var5 = new int[] {};
		THIS.setAxisSizes(var5);
		int[] var6 = new int[] {};
		THIS.setDimCountByAxis(var6);
		boolean[] var7 = new boolean[] {};
		THIS.setIsSlicerAxis(var7);
		THIS.setMdxQuery("");
		// jtest_tested_method
		PafIntersectionIterator RETVAL = THIS.getDataCellIterator();
		assertEquals(null, RETVAL); // jtest_unverified
		assertEquals(5, _f5.getDimCount()); // jtest_unverified
		assertEquals(5, _f2.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataCellIterator3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataCellIterator3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataCells()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getDataCells()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataCells1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t3.setYearDim("");
		String[] var2 = new String[] {};
		t3.setHierDims(var2);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var3 = new String[] {};
		t3.setAxisPriority(var3);
		_f0.setMdbDef(t3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		_f5.setYearDim("");
		String[] var8 = new String[] {};
		_f5.setHierDims(var8);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var9 = new String[] {};
		_f5.setAxisPriority(var9);
		THIS.setAxisCount(0);
		int[] var10 = new int[] {};
		THIS.setAxisSizes(var10);
		int[] var11 = new int[] {};
		THIS.setDimCountByAxis(var11);
		boolean[] var12 = new boolean[] {};
		THIS.setIsSlicerAxis(var12);
		THIS.setMdxQuery("");
		// jtest_tested_method
		double[][][] RETVAL = THIS.getDataCells();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(2, RETVAL.length); // jtest_unverified
		assertNotNull(RETVAL[0]); // jtest_unverified
		assertEquals(2, RETVAL[0].length); // jtest_unverified
		assertNotNull(RETVAL[1]); // jtest_unverified
		assertEquals(2, RETVAL[1].length); // jtest_unverified
		assertEquals(5, t3.getDimCount()); // jtest_unverified
		assertEquals(5, _f5.getDimCount()); // jtest_unverified
		assertEquals(5, _f3.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataCells1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataCells1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataSlice(com.palladium.paf.mdb.PafDataSliceParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getDataSlice(com.palladium.paf.mdb.PafDataSliceParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataSlice1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t3.setYearDim("");
		String[] var2 = new String[] {};
		t3.setHierDims(var2);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var3 = new String[] {};
		t3.setAxisPriority(var3);
		_f0.setMdbDef(t3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		_f5.setYearDim("");
		String[] var8 = new String[] {};
		_f5.setHierDims(var8);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var9 = new String[] {};
		_f5.setAxisPriority(var9);
		THIS.setAxisCount(-1);
		int[] var10 = new int[] {};
		THIS.setAxisSizes(var10);
		int[] var11 = new int[] {};
		THIS.setDimCountByAxis(var11);
		boolean[] var12 = new boolean[] {};
		THIS.setIsSlicerAxis(var12);
		THIS.setMdxQuery("");
		// jtest_tested_method
		PafDataSlice RETVAL = THIS.getDataSlice((PafDataSliceParms) null);
		// NegativeArraySizeException thrown
		// at com.palladium.paf.mdb.PafDataCache2.getDataSlice(PafDataCache2.java:957)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataSlice1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataSlice1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDependentVersionDefs(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getDependentVersionDefs(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDependentVersionDefs1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f1.setYearDim("");
		String[] var1 = new String[] {};
		_f1.setHierDims(var1);
		_f1.setMeasureDim("");
		_f1.setPlanTypeDim("");
		_f1.setTimeDim("");
		_f1.setVersionDim("");
		_f1.setDataSourceId("");
		String[] var2 = new String[] {};
		_f1.setAxisPriority(var2);
		_f2.setYearDim("");
		String[] var3 = new String[] {};
		_f2.setHierDims(var3);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var4 = new String[] {};
		_f2.setAxisPriority(var4);
		THIS.setAxisCount(0);
		int[] var5 = new int[] {};
		THIS.setAxisSizes(var5);
		int[] var6 = new int[] {};
		THIS.setDimCountByAxis(var6);
		boolean[] var7 = new boolean[] {};
		THIS.setIsSlicerAxis(var7);
		THIS.setMdxQuery("");
		// jtest_tested_method
		Map RETVAL = THIS.getDependentVersionDefs((String[]) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.mdb.PafDataCache2.getDependentVersionDefs([Ljava/lang/String;)Ljava/util/Map;>
		// at com.palladium.paf.mdb.PafDataCache2.getDependentVersionDefs(PafDataCache2.java:582)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDependentVersionDefs1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDependentVersionDefs1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVarianceVersions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.getDependentVersionDefs(PafDataCache2.java:579)
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDimCountByAxis()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getDimCountByAxis()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDimCountByAxis1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t3.setYearDim("");
		String[] var2 = new String[] {};
		t3.setHierDims(var2);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var3 = new String[] {};
		t3.setAxisPriority(var3);
		_f0.setMdbDef(t3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		_f5.setYearDim("");
		String[] var8 = new String[] {};
		_f5.setHierDims(var8);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var9 = new String[] {};
		_f5.setAxisPriority(var9);
		THIS.setAxisCount(0);
		int[] var10 = new int[] {};
		THIS.setAxisSizes(var10);
		int[] var11 = new int[] {};
		THIS.setDimCountByAxis(var11);
		boolean[] var12 = new boolean[] {};
		THIS.setIsSlicerAxis(var12);
		THIS.setMdxQuery("");
		// jtest_tested_method
		int[] RETVAL = THIS.getDimCountByAxis();
		assertEquals(var11, RETVAL); // jtest_unverified
		assertEquals(5, _f3.getDimCount()); // jtest_unverified
		assertEquals(5, t3.getDimCount()); // jtest_unverified
		assertEquals(5, _f5.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDimCountByAxis1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDimCountByAxis1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDimIndexes(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getDimIndexes(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDimIndexes1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		_f0.setMdbDef(t3);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var3);
		_f2.setYearDim("");
		String[] var4 = new String[] {};
		_f2.setHierDims(var4);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var5 = new String[] {};
		_f2.setAxisPriority(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		// jtest_tested_method
		int[] RETVAL = THIS.getDimIndexes((String[]) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.mdb.PafDataCache2.getDimIndexes([Ljava/lang/String;)[I>
		// at com.palladium.paf.mdb.PafDataCache2.getDimIndexes(PafDataCache2.java:1528)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDimIndexes1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDimIndexes1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDimMember(int,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getDimMember(int,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDimMember1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t3.setYearDim("");
		String[] var2 = new String[] {};
		t3.setHierDims(var2);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var3 = new String[] {};
		t3.setAxisPriority(var3);
		_f0.setMdbDef(t3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		_f5.setYearDim("");
		String[] var8 = new String[] {};
		_f5.setHierDims(var8);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var9 = new String[] {};
		_f5.setAxisPriority(var9);
		THIS.setAxisCount(0);
		int[] var10 = new int[] {};
		THIS.setAxisSizes(var10);
		int[] var11 = new int[] {};
		THIS.setDimCountByAxis(var11);
		boolean[] var12 = new boolean[] {};
		THIS.setIsSlicerAxis(var12);
		THIS.setMdxQuery("");
		// jtest_tested_method
		String RETVAL = THIS.getDimMember(0, 2);
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.mdb.PafDataCache2.getDimMember(PafDataCache2.java:1544)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDimMember1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDimMember1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDimMembers(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getDimMembers(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDimMembers1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f8 = new Integer(0);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t3.setYearDim("");
		String[] var2 = new String[] {};
		t3.setHierDims(var2);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var3 = new String[] {};
		t3.setAxisPriority(var3);
		_f0.setMdbDef(t3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		_f5.setYearDim("");
		String[] var8 = new String[] {};
		_f5.setHierDims(var8);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var9 = new String[] {};
		_f5.setAxisPriority(var9);
		THIS.setAxisCount(0);
		int[] var10 = new int[] {};
		THIS.setAxisSizes(var10);
		int[] var11 = new int[] {};
		THIS.setDimCountByAxis(var11);
		boolean[] var12 = new boolean[] {};
		THIS.setIsSlicerAxis(var12);
		THIS.setMdxQuery("");
		// jtest_tested_method
		String[] RETVAL = THIS.getDimMembers((String) null);
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(2, RETVAL.length); // jtest_unverified
		assertEquals(null, RETVAL[0]); // jtest_unverified
		assertEquals("", RETVAL[1]); // jtest_unverified
		assertEquals(5, t3.getDimCount()); // jtest_unverified
		assertEquals(5, _f3.getDimCount()); // jtest_unverified
		assertEquals(5, _f5.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDimMembers1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDimMembers1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getDimMembers(PafDataCache2.java:1555)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					case 3 :
						return _f8;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getDimMembers(PafDataCache2.java:1555)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDimension(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getDimension(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDimension1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		_f0.setMdbDef(t3);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var3);
		_f2.setYearDim("");
		String[] var4 = new String[] {};
		_f2.setHierDims(var4);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var5 = new String[] {};
		_f2.setAxisPriority(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		// jtest_tested_method
		String RETVAL = THIS.getDimension(-1);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache2.getDimension(PafDataCache2.java:1503)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDimension1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDimension1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getForwardPlannablePeriods()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getForwardPlannablePeriods()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetForwardPlannablePeriods1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t3.setYearDim("");
		String[] var2 = new String[] {};
		t3.setHierDims(var2);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var3 = new String[] {};
		t3.setAxisPriority(var3);
		_f0.setMdbDef(t3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		_f5.setYearDim("");
		String[] var8 = new String[] {};
		_f5.setHierDims(var8);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var9 = new String[] {};
		_f5.setAxisPriority(var9);
		THIS.setAxisCount(0);
		int[] var10 = new int[] {};
		THIS.setAxisSizes(var10);
		int[] var11 = new int[] {};
		THIS.setDimCountByAxis(var11);
		boolean[] var12 = new boolean[] {};
		THIS.setIsSlicerAxis(var12);
		THIS.setMdxQuery("");
		// jtest_tested_method
		List RETVAL = THIS.getForwardPlannablePeriods();
		// NullPointerException thrown
		// at com.palladium.paf.mdb.PafDataCache2.getTimeDim(PafDataCache2.java:1339)
		// at com.palladium.paf.mdb.PafDataCache2.getForwardPlannablePeriods(PafDataCache2.java:634)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetForwardPlannablePeriods1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetForwardPlannablePeriods1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					case 5 :
						return null;
					// at com.palladium.paf.mdb.PafDataCache2.getTimeDim(PafDataCache2.java:1339)
					// at com.palladium.paf.mdb.PafDataCache2.getForwardPlannablePeriods(PafDataCache2.java:634)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getIsSlicerAxis()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getIsSlicerAxis()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetIsSlicerAxis1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t3.setYearDim("");
		String[] var2 = new String[] {};
		t3.setHierDims(var2);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var3 = new String[] {};
		t3.setAxisPriority(var3);
		_f0.setMdbDef(t3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		_f5.setYearDim("");
		String[] var8 = new String[] {};
		_f5.setHierDims(var8);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var9 = new String[] {};
		_f5.setAxisPriority(var9);
		THIS.setAxisCount(0);
		int[] var10 = new int[] {};
		THIS.setAxisSizes(var10);
		int[] var11 = new int[] {};
		THIS.setDimCountByAxis(var11);
		boolean[] var12 = new boolean[] {};
		THIS.setIsSlicerAxis(var12);
		THIS.setMdxQuery("");
		// jtest_tested_method
		boolean[] RETVAL = THIS.getIsSlicerAxis();
		assertEquals(var12, RETVAL); // jtest_unverified
		assertEquals(5, _f3.getDimCount()); // jtest_unverified
		assertEquals(5, t3.getDimCount()); // jtest_unverified
		assertEquals(5, _f5.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetIsSlicerAxis1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetIsSlicerAxis1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getLockedPeriods()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getLockedPeriods()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLockedPeriods1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		PafApplicationDef t1 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer(0);
		PafDataCache2 THIS = new PafDataCache2(t0);
		t0.setAxisCount(0);
		int[] var1 = new int[] {};
		t0.setAxisSize(var1);
		int[] var2 = new int[] {};
		t0.setDimCountByAxis(var2);
		String[] var3 = new String[] {};
		t0.setDimensions(var3);
		boolean[] var4 = new boolean[] {};
		t0.setIsSlicerAxis(var4);
		t0.setMdxQuery("");
		String[][] var5 = new String[][] {};
		t0.setMemberArray(var5);
		Set var6 = (Set) Stubs.makeStubObject(Set.class);
		t0.setLockedPeriods(var6);
		t1.setSeasonList(t2);
		t1.setAppId("");
		PlanCycle[] var7 = new PlanCycle[] {};
		t1.setPlanCycles(var7);
		t1.setLastPeriod("");
		t1.setCurrentYear("");
		t3.setYearDim("");
		String[] var8 = new String[] {};
		t3.setHierDims(var8);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var9 = new String[] {};
		t3.setAxisPriority(var9);
		t1.setMdbDef(t3);
		Map var10 = (Map) Stubs.makeStubObject(Map.class);
		t1.setMeasures(var10);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		t1.setVersions(var11);
		t0.setAppDef(t1);
		String[] var12 = new String[] {};
		t0.setActiveVersion(var12);
		_f3.setYearDim("");
		String[] var13 = new String[] {};
		_f3.setHierDims(var13);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var14 = new String[] {};
		_f3.setAxisPriority(var14);
		_f5.setYearDim("");
		String[] var15 = new String[] {};
		_f5.setHierDims(var15);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var16 = new String[] {};
		_f5.setAxisPriority(var16);
		// jtest_tested_method
		Set RETVAL = THIS.getLockedPeriods();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("0", RETVAL.toString()); // jtest_unverified
		assertEquals(5, t3.getDimCount()); // jtest_unverified
		assertEquals(5, _f3.getDimCount()); // jtest_unverified
		assertEquals(5, _f5.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetLockedPeriods1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetLockedPeriods1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMdxQuery()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getMdxQuery()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMdxQuery1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		_f0.setMdbDef(t3);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var3);
		_f2.setYearDim("");
		String[] var4 = new String[] {};
		_f2.setHierDims(var4);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var5 = new String[] {};
		_f2.setAxisPriority(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		// jtest_tested_method
		String RETVAL = THIS.getMdxQuery();
		assertEquals("0", RETVAL); // jtest_unverified
		assertEquals(5, _f2.getDimCount()); // jtest_unverified
		assertEquals(5, _f3.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMdxQuery1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMdxQuery1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMeasureAxis()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getMeasureAxis()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMeasureAxis1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f7 = new MdbDef();
		_f8 = new Integer("0");
		_f2.setYearDim("");
		String[] var1 = new String[] {};
		_f2.setHierDims(var1);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var2 = new String[] {};
		_f2.setAxisPriority(var2);
		_f3.setYearDim("");
		String[] var3 = new String[] {};
		_f3.setHierDims(var3);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var4 = new String[] {};
		_f3.setAxisPriority(var4);
		// jtest_tested_method
		int RETVAL = THIS.getMeasureAxis();
		assertEquals(0, RETVAL); // jtest_unverified
		assertEquals(5, _f2.getDimCount()); // jtest_unverified
		assertEquals(5, _f3.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMeasureAxis1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMeasureAxis1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					case 5 :
						return _f7;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					case 3 :
						return _f8;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMeasureDef(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getMeasureDef(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMeasureDef1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		PafApplicationDef t1 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer(0);
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		t0.setAxisCount(0);
		int[] var1 = new int[] {};
		t0.setAxisSize(var1);
		int[] var2 = new int[] {};
		t0.setDimCountByAxis(var2);
		String[] var3 = new String[] {};
		t0.setDimensions(var3);
		boolean[] var4 = new boolean[] {};
		t0.setIsSlicerAxis(var4);
		t0.setMdxQuery("");
		String[][] var5 = new String[][] {};
		t0.setMemberArray(var5);
		Set var6 = (Set) Stubs.makeStubObject(Set.class);
		t0.setLockedPeriods(var6);
		t1.setSeasonList(t2);
		t1.setAppId("");
		PlanCycle[] var7 = new PlanCycle[] {};
		t1.setPlanCycles(var7);
		t1.setLastPeriod("");
		t1.setCurrentYear("");
		t3.setYearDim("");
		String[] var8 = new String[] {};
		t3.setHierDims(var8);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var9 = new String[] {};
		t3.setAxisPriority(var9);
		t1.setMdbDef(t3);
		Map var10 = (Map) Stubs.makeStubObject(Map.class);
		t1.setMeasures(var10);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		t1.setVersions(var11);
		t0.setAppDef(t1);
		String[] var12 = new String[] {};
		t0.setActiveVersion(var12);
		_f3.setYearDim("");
		String[] var13 = new String[] {};
		_f3.setHierDims(var13);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var14 = new String[] {};
		_f3.setAxisPriority(var14);
		_f5.setYearDim("");
		String[] var15 = new String[] {};
		_f5.setHierDims(var15);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var16 = new String[] {};
		_f5.setAxisPriority(var16);
		// jtest_tested_method
		MeasureDef RETVAL = THIS.getMeasureDef((String) null);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache2.getMeasureDef(PafDataCache2.java:1270)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMeasureDef1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMeasureDef1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getMeasureDef", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureDef(PafDataCache2.java:1262)
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMeasureType(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getMeasureType(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMeasureType1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		_f0.setMdbDef(t3);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var3);
		_f2.setYearDim("");
		String[] var4 = new String[] {};
		_f2.setHierDims(var4);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var5 = new String[] {};
		_f2.setAxisPriority(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		// jtest_tested_method
		MeasureType RETVAL = THIS.getMeasureType((String) null);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache2.getMeasureDef(PafDataCache2.java:1270)
		// at com.palladium.paf.mdb.PafDataCache2.getMeasureType(PafDataCache2.java:1303)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMeasureType1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMeasureType1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getMeasureDef", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureDef(PafDataCache2.java:1262)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureType(PafDataCache2.java:1303)
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMemberArray()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getMemberArray()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberArray1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		PafApplicationDef t1 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer(0);
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		t0.setAxisCount(0);
		int[] var1 = new int[] {};
		t0.setAxisSize(var1);
		int[] var2 = new int[] {};
		t0.setDimCountByAxis(var2);
		String[] var3 = new String[] {};
		t0.setDimensions(var3);
		boolean[] var4 = new boolean[] {};
		t0.setIsSlicerAxis(var4);
		t0.setMdxQuery("");
		String[][] var5 = new String[][] {};
		t0.setMemberArray(var5);
		Set var6 = (Set) Stubs.makeStubObject(Set.class);
		t0.setLockedPeriods(var6);
		t1.setSeasonList(t2);
		t1.setAppId("");
		PlanCycle[] var7 = new PlanCycle[] {};
		t1.setPlanCycles(var7);
		t1.setLastPeriod("");
		t1.setCurrentYear("");
		t3.setYearDim("");
		String[] var8 = new String[] {};
		t3.setHierDims(var8);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var9 = new String[] {};
		t3.setAxisPriority(var9);
		t1.setMdbDef(t3);
		Map var10 = (Map) Stubs.makeStubObject(Map.class);
		t1.setMeasures(var10);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		t1.setVersions(var11);
		t0.setAppDef(t1);
		String[] var12 = new String[] {};
		t0.setActiveVersion(var12);
		_f3.setYearDim("");
		String[] var13 = new String[] {};
		_f3.setHierDims(var13);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var14 = new String[] {};
		_f3.setAxisPriority(var14);
		_f5.setYearDim("");
		String[] var15 = new String[] {};
		_f5.setHierDims(var15);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var16 = new String[] {};
		_f5.setAxisPriority(var16);
		// jtest_tested_method
		String[][] RETVAL = THIS.getMemberArray();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(1, RETVAL.length); // jtest_unverified
		assertNotNull(RETVAL[0]); // jtest_unverified
		assertEquals(2, RETVAL[0].length); // jtest_unverified
		assertEquals(null, RETVAL[0][0]); // jtest_unverified
		assertEquals("", RETVAL[0][1]); // jtest_unverified
		assertEquals(5, _f3.getDimCount()); // jtest_unverified
		assertEquals(5, t3.getDimCount()); // jtest_unverified
		assertEquals(5, _f5.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMemberArray1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMemberArray1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMemberIndex(java.lang.String,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getMemberIndex(java.lang.String,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberIndex1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t3.setYearDim("");
		String[] var2 = new String[] {};
		t3.setHierDims(var2);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var3 = new String[] {};
		t3.setAxisPriority(var3);
		_f0.setMdbDef(t3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		_f5.setYearDim("");
		String[] var8 = new String[] {};
		_f5.setHierDims(var8);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var9 = new String[] {};
		_f5.setAxisPriority(var9);
		THIS.setAxisCount(0);
		int[] var10 = new int[] {};
		THIS.setAxisSizes(var10);
		int[] var11 = new int[] {};
		THIS.setDimCountByAxis(var11);
		boolean[] var12 = new boolean[] {};
		THIS.setIsSlicerAxis(var12);
		THIS.setMdxQuery("");
		// jtest_tested_method
		int RETVAL = THIS.getMemberIndex((String) null, -1);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache2.getMemberIndex(PafDataCache2.java:1635)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMemberIndex1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMemberIndex1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getOpenPeriods(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getOpenPeriods(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetOpenPeriods2() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f7 = new MdbDef();
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t3.setYearDim("");
		String[] var2 = new String[] {};
		t3.setHierDims(var2);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var3 = new String[] {};
		t3.setAxisPriority(var3);
		_f0.setMdbDef(t3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		_f5.setYearDim("");
		String[] var8 = new String[] {};
		_f5.setHierDims(var8);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var9 = new String[] {};
		_f5.setAxisPriority(var9);
		THIS.setAxisCount(0);
		int[] var10 = new int[] {};
		THIS.setAxisSizes(var10);
		int[] var11 = new int[] {};
		THIS.setDimCountByAxis(var11);
		boolean[] var12 = new boolean[] {};
		THIS.setIsSlicerAxis(var12);
		THIS.setMdxQuery("");
		// jtest_tested_method
		List RETVAL = THIS.getOpenPeriods((String) null, (String) null);
		// ClassCastException thrown
		// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
		// at com.palladium.paf.mdb.PafDataCache2.getDimMembers(PafDataCache2.java:1555)
		// at com.palladium.paf.mdb.PafDataCache2.getOpenPeriods(PafDataCache2.java:669)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetOpenPeriods2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetOpenPeriods2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					case 5 :
						return _f7;
					// at com.palladium.paf.mdb.PafDataCache2.getTimeDim(PafDataCache2.java:1339)
					// at com.palladium.paf.mdb.PafDataCache2.getOpenPeriods(PafDataCache2.java:669)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentYear", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.getCurrentYear(PafDataCache2.java:1844)
				// at com.palladium.paf.mdb.PafDataCache2.getOpenPeriods(PafDataCache2.java:669)
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getDimMembers(PafDataCache2.java:1555)
				// at com.palladium.paf.mdb.PafDataCache2.getOpenPeriods(PafDataCache2.java:669)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					case 3 :
						return "";
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getDimMembers(PafDataCache2.java:1555)
					// at com.palladium.paf.mdb.PafDataCache2.getOpenPeriods(PafDataCache2.java:669)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getPlanTypeAxis()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getPlanTypeAxis()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPlanTypeAxis1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t3.setYearDim("");
		String[] var2 = new String[] {};
		t3.setHierDims(var2);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var3 = new String[] {};
		t3.setAxisPriority(var3);
		_f0.setMdbDef(t3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		_f5.setYearDim("");
		String[] var8 = new String[] {};
		_f5.setHierDims(var8);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var9 = new String[] {};
		_f5.setAxisPriority(var9);
		THIS.setAxisCount(0);
		int[] var10 = new int[] {};
		THIS.setAxisSizes(var10);
		int[] var11 = new int[] {};
		THIS.setDimCountByAxis(var11);
		boolean[] var12 = new boolean[] {};
		THIS.setIsSlicerAxis(var12);
		THIS.setMdxQuery("");
		// jtest_tested_method
		int RETVAL = THIS.getPlanTypeAxis();
		// NullPointerException thrown
		// at com.palladium.paf.mdb.PafDataCache2.getPlanTypeDim(PafDataCache2.java:1321)
		// at com.palladium.paf.mdb.PafDataCache2.getPlanTypeAxis(PafDataCache2.java:1312)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetPlanTypeAxis1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetPlanTypeAxis1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					case 5 :
						return null;
					// at com.palladium.paf.mdb.PafDataCache2.getPlanTypeDim(PafDataCache2.java:1321)
					// at com.palladium.paf.mdb.PafDataCache2.getPlanTypeAxis(PafDataCache2.java:1312)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getPlanTypeDim()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getPlanTypeDim()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPlanTypeDim1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f7 = new MdbDef();
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t3.setYearDim("");
		String[] var2 = new String[] {};
		t3.setHierDims(var2);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var3 = new String[] {};
		t3.setAxisPriority(var3);
		_f0.setMdbDef(t3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		_f5.setYearDim("");
		String[] var8 = new String[] {};
		_f5.setHierDims(var8);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var9 = new String[] {};
		_f5.setAxisPriority(var9);
		THIS.setAxisCount(0);
		int[] var10 = new int[] {};
		THIS.setAxisSizes(var10);
		int[] var11 = new int[] {};
		THIS.setDimCountByAxis(var11);
		boolean[] var12 = new boolean[] {};
		THIS.setIsSlicerAxis(var12);
		THIS.setMdxQuery("");
		// jtest_tested_method
		String RETVAL = THIS.getPlanTypeDim();
		assertEquals(null, RETVAL); // jtest_unverified
		assertEquals(5, t3.getDimCount()); // jtest_unverified
		assertEquals(5, _f3.getDimCount()); // jtest_unverified
		assertEquals(5, _f5.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetPlanTypeDim1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetPlanTypeDim1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					case 5 :
						return _f7;
					// at com.palladium.paf.mdb.PafDataCache2.getPlanTypeDim(PafDataCache2.java:1321)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getRowCount()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getRowCount()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRowCount1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t3.setYearDim("");
		String[] var2 = new String[] {};
		t3.setHierDims(var2);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var3 = new String[] {};
		t3.setAxisPriority(var3);
		_f0.setMdbDef(t3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		_f5.setYearDim("");
		String[] var8 = new String[] {};
		_f5.setHierDims(var8);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var9 = new String[] {};
		_f5.setAxisPriority(var9);
		THIS.setAxisCount(0);
		int[] var10 = new int[] {};
		THIS.setAxisSizes(var10);
		int[] var11 = new int[] {};
		THIS.setDimCountByAxis(var11);
		boolean[] var12 = new boolean[] { false };
		THIS.setIsSlicerAxis(var12);
		THIS.setMdxQuery("");
		// jtest_tested_method
		int RETVAL = THIS.getRowCount();
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.mdb.PafDataCache2.getColumnCount(PafDataCache2.java:928)
		// at com.palladium.paf.mdb.PafDataCache2.getRowCount(PafDataCache2.java:1613)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetRowCount1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetRowCount1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getTimeAxis()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getTimeAxis()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetTimeAxis1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f7 = new MdbDef();
		_f8 = new Integer(0);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t3.setYearDim("");
		String[] var2 = new String[] {};
		t3.setHierDims(var2);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var3 = new String[] {};
		t3.setAxisPriority(var3);
		_f0.setMdbDef(t3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		_f5.setYearDim("");
		String[] var8 = new String[] {};
		_f5.setHierDims(var8);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var9 = new String[] {};
		_f5.setAxisPriority(var9);
		THIS.setAxisCount(0);
		int[] var10 = new int[] {};
		THIS.setAxisSizes(var10);
		int[] var11 = new int[] {};
		THIS.setDimCountByAxis(var11);
		boolean[] var12 = new boolean[] {};
		THIS.setIsSlicerAxis(var12);
		THIS.setMdxQuery("");
		// jtest_tested_method
		int RETVAL = THIS.getTimeAxis();
		assertEquals(0, RETVAL); // jtest_unverified
		assertEquals(5, t3.getDimCount()); // jtest_unverified
		assertEquals(5, _f3.getDimCount()); // jtest_unverified
		assertEquals(5, _f5.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetTimeAxis1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetTimeAxis1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					case 5 :
						return _f7;
					// at com.palladium.paf.mdb.PafDataCache2.getTimeDim(PafDataCache2.java:1339)
					// at com.palladium.paf.mdb.PafDataCache2.getTimeAxis(PafDataCache2.java:1330)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getTimeAxis(PafDataCache2.java:1330)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					case 3 :
						return _f8;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getTimeAxis(PafDataCache2.java:1330)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getVersionDef(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getVersionDef(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetVersionDef1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		_f0.setMdbDef(t3);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var3);
		_f2.setYearDim("");
		String[] var4 = new String[] {};
		_f2.setHierDims(var4);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var5 = new String[] {};
		_f2.setAxisPriority(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		// jtest_tested_method
		VersionDef RETVAL = THIS.getVersionDef((String) null);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache2.getVersionDef(PafDataCache2.java:1368)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetVersionDef1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetVersionDef1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getVersionDef", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDef(PafDataCache2.java:1360)
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getVersionDef(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getVersionDef(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetVersionDef2() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer(0);
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f9 = new VersionDef((String) null, (VersionType) null);
		_f1.setYearDim("");
		String[] var1 = new String[] {};
		_f1.setHierDims(var1);
		_f1.setMeasureDim("");
		_f1.setPlanTypeDim("");
		_f1.setTimeDim("");
		_f1.setVersionDim("");
		_f1.setDataSourceId("");
		String[] var2 = new String[] {};
		_f1.setAxisPriority(var2);
		_f2.setYearDim("");
		String[] var3 = new String[] {};
		_f2.setHierDims(var3);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var4 = new String[] {};
		_f2.setAxisPriority(var4);
		THIS.setAxisCount(0);
		int[] var5 = new int[] {};
		THIS.setAxisSizes(var5);
		int[] var6 = new int[] {};
		THIS.setDimCountByAxis(var6);
		boolean[] var7 = new boolean[] {};
		THIS.setIsSlicerAxis(var7);
		THIS.setMdxQuery("");
		// jtest_tested_method
		VersionDef RETVAL = THIS.getVersionDef((String) null);
		assertEquals(_f9, RETVAL); // jtest_unverified
		assertEquals(5, _f1.getDimCount()); // jtest_unverified
		assertEquals(5, _f2.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetVersionDef2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetVersionDef2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getVersionDef", argument_types)) {
				return _f9;
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDef(PafDataCache2.java:1360)
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getVersionDefs()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getVersionDefs()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetVersionDefs1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t3.setYearDim("");
		String[] var2 = new String[] {};
		t3.setHierDims(var2);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var3 = new String[] {};
		t3.setAxisPriority(var3);
		_f0.setMdbDef(t3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		_f5.setYearDim("");
		String[] var8 = new String[] {};
		_f5.setHierDims(var8);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var9 = new String[] {};
		_f5.setAxisPriority(var9);
		THIS.setAxisCount(0);
		int[] var10 = new int[] {};
		THIS.setAxisSizes(var10);
		int[] var11 = new int[] {};
		THIS.setDimCountByAxis(var11);
		boolean[] var12 = new boolean[] {};
		THIS.setIsSlicerAxis(var12);
		THIS.setMdxQuery("");
		// jtest_tested_method
		Map RETVAL = THIS.getVersionDefs();
		assertEquals(null, RETVAL); // jtest_unverified
		assertEquals(5, t3.getDimCount()); // jtest_unverified
		assertEquals(5, _f5.getDimCount()); // jtest_unverified
		assertEquals(5, _f3.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetVersionDefs1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetVersionDefs1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDefs(PafDataCache2.java:1381)
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getVersionSize()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getVersionSize()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetVersionSize1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f7 = new MdbDef();
		_f8 = new Integer("0");
		_f2.setYearDim("");
		String[] var1 = new String[] {};
		_f2.setHierDims(var1);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var2 = new String[] {};
		_f2.setAxisPriority(var2);
		_f3.setYearDim("");
		String[] var3 = new String[] {};
		_f3.setHierDims(var3);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var4 = new String[] {};
		_f3.setAxisPriority(var4);
		// jtest_tested_method
		int RETVAL = THIS.getVersionSize();
		assertEquals(2, RETVAL); // jtest_unverified
		assertEquals(5, _f2.getDimCount()); // jtest_unverified
		assertEquals(5, _f3.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetVersionSize1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetVersionSize1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					case 5 :
						return _f7;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					case 3 :
						return _f8;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getVersions()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getVersions()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetVersions1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f7 = new MdbDef();
		_f8 = new Integer("0");
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		_f0.setMdbDef(t3);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var3);
		_f2.setYearDim("");
		String[] var4 = new String[] {};
		_f2.setHierDims(var4);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var5 = new String[] {};
		_f2.setAxisPriority(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		// jtest_tested_method
		String[] RETVAL = THIS.getVersions();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(2, RETVAL.length); // jtest_unverified
		assertEquals(null, RETVAL[0]); // jtest_unverified
		assertEquals("", RETVAL[1]); // jtest_unverified
		assertEquals(5, _f2.getDimCount()); // jtest_unverified
		assertEquals(5, _f3.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetVersions1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetVersions1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					case 5 :
						return _f7;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersions(PafDataCache2.java:1399)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersions(PafDataCache2.java:1399)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersions(PafDataCache2.java:1399)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					case 3 :
						return _f8;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersions(PafDataCache2.java:1399)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getVersionsByType(com.palladium.paf.app.VersionType)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getVersionsByType(com.palladium.paf.app.VersionType)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetVersionsByType1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f7 = new MdbDef();
		_f8 = new Integer(0);
		_f9 = new VersionDef((String) null, (VersionType) null);
		_f10 = new VersionDef();
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t3.setYearDim("");
		String[] var2 = new String[] {};
		t3.setHierDims(var2);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var3 = new String[] {};
		t3.setAxisPriority(var3);
		_f0.setMdbDef(t3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		_f5.setYearDim("");
		String[] var8 = new String[] {};
		_f5.setHierDims(var8);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var9 = new String[] {};
		_f5.setAxisPriority(var9);
		THIS.setAxisCount(0);
		int[] var10 = new int[] {};
		THIS.setAxisSizes(var10);
		int[] var11 = new int[] {};
		THIS.setDimCountByAxis(var11);
		boolean[] var12 = new boolean[] {};
		THIS.setIsSlicerAxis(var12);
		THIS.setMdxQuery("");
		// jtest_tested_method
		List RETVAL = THIS.getVersionsByType((VersionType) null);
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("[null, ]", RETVAL.toString()); // jtest_unverified
		assertEquals(5, _f5.getDimCount()); // jtest_unverified
		assertEquals(5, t3.getDimCount()); // jtest_unverified
		assertEquals(5, _f3.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetVersionsByType1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetVersionsByType1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					case 5 :
						return _f7;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersions(PafDataCache2.java:1399)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionsByType(PafDataCache2.java:1412)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getVersionDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getVersionDef(java.lang.String)");
				switch (index) {
					case 1 :
						return _f9;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDef(PafDataCache2.java:1360)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionType(PafDataCache2.java:1440)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionsByType(PafDataCache2.java:1416)
					case 2 :
						return _f10;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDef(PafDataCache2.java:1360)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionType(PafDataCache2.java:1440)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionsByType(PafDataCache2.java:1416)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersions(PafDataCache2.java:1399)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionsByType(PafDataCache2.java:1412)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersions(PafDataCache2.java:1399)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionsByType(PafDataCache2.java:1412)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					case 3 :
						return _f8;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersions(PafDataCache2.java:1399)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionsByType(PafDataCache2.java:1412)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getYearAxis()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getYearAxis()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetYearAxis1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t3.setYearDim("");
		String[] var2 = new String[] {};
		t3.setHierDims(var2);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var3 = new String[] {};
		t3.setAxisPriority(var3);
		_f0.setMdbDef(t3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		_f5.setYearDim("");
		String[] var8 = new String[] {};
		_f5.setHierDims(var8);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var9 = new String[] {};
		_f5.setAxisPriority(var9);
		THIS.setAxisCount(0);
		int[] var10 = new int[] {};
		THIS.setAxisSizes(var10);
		int[] var11 = new int[] {};
		THIS.setDimCountByAxis(var11);
		boolean[] var12 = new boolean[] {};
		THIS.setIsSlicerAxis(var12);
		THIS.setMdxQuery("");
		// jtest_tested_method
		int RETVAL = THIS.getYearAxis();
		// NullPointerException thrown
		// at com.palladium.paf.mdb.PafDataCache2.getYearDim(PafDataCache2.java:1458)
		// at com.palladium.paf.mdb.PafDataCache2.getYearAxis(PafDataCache2.java:1449)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetYearAxis1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetYearAxis1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					case 5 :
						return null;
					// at com.palladium.paf.mdb.PafDataCache2.getYearDim(PafDataCache2.java:1458)
					// at com.palladium.paf.mdb.PafDataCache2.getYearAxis(PafDataCache2.java:1449)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getYearDim()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getYearDim()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetYearDim1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f7 = new MdbDef();
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t3.setYearDim("");
		String[] var2 = new String[] {};
		t3.setHierDims(var2);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var3 = new String[] {};
		t3.setAxisPriority(var3);
		_f0.setMdbDef(t3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		_f5.setYearDim("");
		String[] var8 = new String[] {};
		_f5.setHierDims(var8);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var9 = new String[] {};
		_f5.setAxisPriority(var9);
		THIS.setAxisCount(0);
		int[] var10 = new int[] {};
		THIS.setAxisSizes(var10);
		int[] var11 = new int[] {};
		THIS.setDimCountByAxis(var11);
		boolean[] var12 = new boolean[] {};
		THIS.setIsSlicerAxis(var12);
		THIS.setMdxQuery("");
		// jtest_tested_method
		String RETVAL = THIS.getYearDim();
		assertEquals(null, RETVAL); // jtest_unverified
		assertEquals(5, _f3.getDimCount()); // jtest_unverified
		assertEquals(5, _f5.getDimCount()); // jtest_unverified
		assertEquals(5, t3.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetYearDim1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetYearDim1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					case 5 :
						return _f7;
					// at com.palladium.paf.mdb.PafDataCache2.getYearDim(PafDataCache2.java:1458)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getYearSize()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#getYearSize()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetYearSize1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f7 = new MdbDef();
		_f8 = new Integer(0);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t3.setYearDim("");
		String[] var2 = new String[] {};
		t3.setHierDims(var2);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var3 = new String[] {};
		t3.setAxisPriority(var3);
		_f0.setMdbDef(t3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		_f5.setYearDim("");
		String[] var8 = new String[] {};
		_f5.setHierDims(var8);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var9 = new String[] {};
		_f5.setAxisPriority(var9);
		THIS.setAxisCount(1);
		int[] var10 = new int[] { 0 };
		THIS.setAxisSizes(var10);
		int[] var11 = new int[] {};
		THIS.setDimCountByAxis(var11);
		boolean[] var12 = new boolean[] {};
		THIS.setIsSlicerAxis(var12);
		THIS.setMdxQuery("");
		// jtest_tested_method
		int RETVAL = THIS.getYearSize();
		assertEquals(0, RETVAL); // jtest_unverified
		assertEquals(5, _f3.getDimCount()); // jtest_unverified
		assertEquals(5, t3.getDimCount()); // jtest_unverified
		assertEquals(5, _f5.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetYearSize1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetYearSize1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					case 5 :
						return _f7;
					// at com.palladium.paf.mdb.PafDataCache2.getYearDim(PafDataCache2.java:1458)
					// at com.palladium.paf.mdb.PafDataCache2.getYearAxis(PafDataCache2.java:1449)
					// at com.palladium.paf.mdb.PafDataCache2.getYearSize(PafDataCache2.java:1467)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getYearAxis(PafDataCache2.java:1449)
				// at com.palladium.paf.mdb.PafDataCache2.getYearSize(PafDataCache2.java:1467)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					case 3 :
						return _f8;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getYearAxis(PafDataCache2.java:1449)
					// at com.palladium.paf.mdb.PafDataCache2.getYearSize(PafDataCache2.java:1467)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: hasLockedPeriods(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#hasLockedPeriods(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testHasLockedPeriods1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t3.setYearDim("");
		String[] var2 = new String[] {};
		t3.setHierDims(var2);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var3 = new String[] {};
		t3.setAxisPriority(var3);
		_f0.setMdbDef(t3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		_f5.setYearDim("");
		String[] var8 = new String[] {};
		_f5.setHierDims(var8);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var9 = new String[] {};
		_f5.setAxisPriority(var9);
		THIS.setAxisCount(0);
		int[] var10 = new int[] {};
		THIS.setAxisSizes(var10);
		int[] var11 = new int[] {};
		THIS.setDimCountByAxis(var11);
		boolean[] var12 = new boolean[] {};
		THIS.setIsSlicerAxis(var12);
		THIS.setMdxQuery("");
		// jtest_tested_method
		boolean RETVAL = THIS.hasLockedPeriods((String) null, (String) null);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache2.getVersionDef(PafDataCache2.java:1368)
		// at com.palladium.paf.mdb.PafDataCache2.getVersionType(PafDataCache2.java:1440)
		// at com.palladium.paf.mdb.PafDataCache2.hasLockedPeriods(PafDataCache2.java:610)
		// jtest_unverified
	}

	/**
	 * Stubs method for testHasLockedPeriods1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsHasLockedPeriods1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getVersionDef", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDef(PafDataCache2.java:1360)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionType(PafDataCache2.java:1440)
				// at com.palladium.paf.mdb.PafDataCache2.hasLockedPeriods(PafDataCache2.java:610)
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: indexToMembers(int[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#indexToMembers(int[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testIndexToMembers1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t3.setYearDim("");
		String[] var2 = new String[] {};
		t3.setHierDims(var2);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var3 = new String[] {};
		t3.setAxisPriority(var3);
		_f0.setMdbDef(t3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		_f5.setYearDim("");
		String[] var8 = new String[] {};
		_f5.setHierDims(var8);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var9 = new String[] {};
		_f5.setAxisPriority(var9);
		THIS.setAxisCount(1);
		int[] var10 = new int[] {};
		THIS.setAxisSizes(var10);
		int[] var11 = new int[] {};
		THIS.setDimCountByAxis(var11);
		boolean[] var12 = new boolean[] {};
		THIS.setIsSlicerAxis(var12);
		THIS.setMdxQuery("");
		int[] var13 = new int[] { 1 };
		// jtest_tested_method
		String[] RETVAL = THIS.indexToMembers(var13);
		assertEquals(1, var13[0]); // jtest_unverified
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(1, RETVAL.length); // jtest_unverified
		assertEquals("", RETVAL[0]); // jtest_unverified
		assertEquals(5, _f5.getDimCount()); // jtest_unverified
		assertEquals(5, _f3.getDimCount()); // jtest_unverified
		assertEquals(5, t3.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testIndexToMembers1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsIndexToMembers1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: initChangedCells()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#initChangedCells()
	 * @author Parasoft Jtest 8.0
	 */
	public void testInitChangedCells1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t3.setYearDim("");
		String[] var2 = new String[] {};
		t3.setHierDims(var2);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var3 = new String[] {};
		t3.setAxisPriority(var3);
		_f0.setMdbDef(t3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		_f5.setYearDim("");
		String[] var8 = new String[] {};
		_f5.setHierDims(var8);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var9 = new String[] {};
		_f5.setAxisPriority(var9);
		THIS.setAxisCount(0);
		int[] var10 = new int[] {};
		THIS.setAxisSizes(var10);
		int[] var11 = new int[] {};
		THIS.setDimCountByAxis(var11);
		boolean[] var12 = new boolean[] {};
		THIS.setIsSlicerAxis(var12);
		THIS.setMdxQuery("");
		// jtest_tested_method
		THIS.initChangedCells();
		assertEquals(5, t3.getDimCount()); // jtest_unverified
		assertEquals(5, _f5.getDimCount()); // jtest_unverified
		assertEquals(5, _f3.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testInitChangedCells1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsInitChangedCells1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: isMember(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#isMember(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsMember1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t3.setYearDim("");
		String[] var2 = new String[] {};
		t3.setHierDims(var2);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var3 = new String[] {};
		t3.setAxisPriority(var3);
		_f0.setMdbDef(t3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		_f5.setYearDim("");
		String[] var8 = new String[] {};
		_f5.setHierDims(var8);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var9 = new String[] {};
		_f5.setAxisPriority(var9);
		THIS.setAxisCount(0);
		int[] var10 = new int[] {};
		THIS.setAxisSizes(var10);
		int[] var11 = new int[] {};
		THIS.setDimCountByAxis(var11);
		boolean[] var12 = new boolean[] {};
		THIS.setIsSlicerAxis(var12);
		THIS.setMdxQuery("");
		// jtest_tested_method
		boolean RETVAL = THIS.isMember((String) null, (String) null);
		assertEquals(false, RETVAL); // jtest_unverified
		assertEquals(5, _f3.getDimCount()); // jtest_unverified
		assertEquals(5, _f5.getDimCount()); // jtest_unverified
		assertEquals(5, t3.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testIsMember1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsIsMember1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCache21() throws Throwable {
		// jtest_tested_method
		PafDataCache2 THIS = new PafDataCache2((PafDataCacheParms) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.mdb.PafDataCache2.<init>(Lcom/palladium/paf/mdb/PafDataCacheParms;)V>
		// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
		// jtest_unverified
	}

	/**
	 * Test for method: PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCache22() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		// jtest_tested_method
		PafDataCache2 THIS = new PafDataCache2(t0);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache2.validateDataCacheParms(PafDataCache2.java:142)
		// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:98)
		// jtest_unverified
	}

	/**
	 * Test for method: PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCache23() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		PafApplicationDef t1 = new PafApplicationDef();
		t0.setAxisCount(0);
		int[] var1 = new int[] {};
		t0.setAxisSize(var1);
		int[] var2 = new int[] {};
		t0.setDimCountByAxis(var2);
		String[] var3 = new String[] {};
		t0.setDimensions(var3);
		boolean[] var4 = new boolean[] {};
		t0.setIsSlicerAxis(var4);
		t0.setMdxQuery("");
		String[][] var5 = new String[][] {};
		t0.setMemberArray(var5);
		Set var6 = (Set) Stubs.makeStubObject(Set.class);
		t0.setLockedPeriods(var6);
		t0.setAppDef(t1);
		String[] var7 = new String[] {};
		t0.setActiveVersion(var7);
		// jtest_tested_method
		PafDataCache2 THIS = new PafDataCache2(t0);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache2.validateDataCacheParms(PafDataCache2.java:171)
		// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:98)
		// jtest_unverified
	}

	/**
	 * Test for method: PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCache28() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		PafApplicationDef t1 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f0 = new PafApplicationDef();
		t0.setAxisCount(0);
		int[] var1 = new int[] {};
		t0.setAxisSize(var1);
		int[] var2 = new int[] {};
		t0.setDimCountByAxis(var2);
		String[] var3 = new String[] {};
		t0.setDimensions(var3);
		boolean[] var4 = new boolean[] {};
		t0.setIsSlicerAxis(var4);
		t0.setMdxQuery("");
		String[][] var5 = new String[][] {};
		t0.setMemberArray(var5);
		Set var6 = (Set) Stubs.makeStubObject(Set.class);
		t0.setLockedPeriods(var6);
		t1.setSeasonList(t2);
		t1.setAppId("");
		PlanCycle[] var7 = new PlanCycle[] {};
		t1.setPlanCycles(var7);
		t1.setLastPeriod("");
		t1.setCurrentYear("");
		t3.setYearDim("");
		String[] var8 = new String[] {};
		t3.setHierDims(var8);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var9 = new String[] {};
		t3.setAxisPriority(var9);
		t1.setMdbDef(t3);
		Map var10 = (Map) Stubs.makeStubObject(Map.class);
		t1.setMeasures(var10);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		t1.setVersions(var11);
		t0.setAppDef(t1);
		String[] var12 = new String[] {};
		t0.setActiveVersion(var12);
		// jtest_tested_method
		PafDataCache2 THIS = new PafDataCache2(t0);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache2.validateDataCacheParms(PafDataCache2.java:152)
		// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:98)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafDataCache28.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafDataCache28(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCache212() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		// jtest_tested_method
		PafDataCache2 THIS = new PafDataCache2(t0);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache2.validateDataCacheParms(PafDataCache2.java:162)
		// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:98)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafDataCache212.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafDataCache212(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCache215() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		// jtest_tested_method
		PafDataCache2 THIS = new PafDataCache2(t0);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache2.validateArrayNotEmpty(PafDataCache2.java:332)
		// at com.palladium.paf.mdb.PafDataCache2.validateArray(PafDataCache2.java:264)
		// at com.palladium.paf.mdb.PafDataCache2.validateDataCacheParms(PafDataCache2.java:188)
		// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:98)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafDataCache215.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafDataCache215(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCache217() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		// jtest_tested_method
		PafDataCache2 THIS = new PafDataCache2(t0);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache2.validateArray(PafDataCache2.java:271)
		// at com.palladium.paf.mdb.PafDataCache2.validateDataCacheParms(PafDataCache2.java:188)
		// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:98)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafDataCache217.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafDataCache217(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 0, 0 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCache219() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		// jtest_tested_method
		PafDataCache2 THIS = new PafDataCache2(t0);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache2.validateArrayNotEmpty(PafDataCache2.java:313)
		// at com.palladium.paf.mdb.PafDataCache2.validateArray(PafDataCache2.java:242)
		// at com.palladium.paf.mdb.PafDataCache2.validateDataCacheParms(PafDataCache2.java:196)
		// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:98)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafDataCache219.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafDataCache219(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(3);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 0, 0, 0 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCache221() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		// jtest_tested_method
		PafDataCache2 THIS = new PafDataCache2(t0);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache2.validateArray(PafDataCache2.java:249)
		// at com.palladium.paf.mdb.PafDataCache2.validateDataCacheParms(PafDataCache2.java:196)
		// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:98)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafDataCache221.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafDataCache221(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(5);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 0, 0, 0, 0, 0 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCache223() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		// jtest_tested_method
		PafDataCache2 THIS = new PafDataCache2(t0);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache2.validateDataCacheParms(PafDataCache2.java:206)
		// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:98)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafDataCache223.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafDataCache223(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(7);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 0, 0, 0, 0, 0, 0, 0 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1, 2, 0, 0, 0, 0, 0 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false, false, false, false, false,
						false, false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCache225() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		// jtest_tested_method
		PafDataCache2 THIS = new PafDataCache2(t0);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache2.validateArrayNotEmpty(PafDataCache2.java:351)
		// at com.palladium.paf.mdb.PafDataCache2.validateArray(PafDataCache2.java:286)
		// at com.palladium.paf.mdb.PafDataCache2.validateDataCacheParms(PafDataCache2.java:213)
		// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:98)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafDataCache225.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafDataCache225(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(9);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false, false, false, false, false,
						false, false, false, false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCache228() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		// jtest_tested_method
		PafDataCache2 THIS = new PafDataCache2(t0);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache2.validateArrayNotEmpty(PafDataCache2.java:351)
		// at com.palladium.paf.mdb.PafDataCache2.validateArray(PafDataCache2.java:286)
		// at com.palladium.paf.mdb.PafDataCache2.validateDataCacheParms(PafDataCache2.java:217)
		// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:98)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafDataCache228.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafDataCache228(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 0 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[1];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[0][];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCache229() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		// jtest_tested_method
		PafDataCache2 THIS = new PafDataCache2(t0);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache2.validateArray(PafDataCache2.java:293)
		// at com.palladium.paf.mdb.PafDataCache2.validateDataCacheParms(PafDataCache2.java:213)
		// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:98)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafDataCache229.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafDataCache229(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 0 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[2];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCache230() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		// jtest_tested_method
		PafDataCache2 THIS = new PafDataCache2(t0);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.PafDataCache2.validateDataCacheParms(PafDataCache2.java:219)
		// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:98)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafDataCache230.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafDataCache230(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 0 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[1];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[1][];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCache231() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		// jtest_tested_method
		PafDataCache2 THIS = new PafDataCache2(t0);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
		// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
		// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafDataCache231.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafDataCache231(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 0 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[1];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { {} };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCache232() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		// jtest_tested_method
		PafDataCache2 THIS = new PafDataCache2(t0);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache2.validateDataCacheParms(PafDataCache2.java:224)
		// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:98)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafDataCache232.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafDataCache232(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 0 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[1];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCache234() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		// jtest_tested_method
		PafDataCache2 THIS = new PafDataCache2(t0);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
		// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
		// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafDataCache234.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafDataCache234(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 0 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[1];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { {} };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return null;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCache235() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f2.setYearDim("");
		String[] var1 = new String[] {};
		_f2.setHierDims(var1);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var2 = new String[] {};
		_f2.setAxisPriority(var2);
		// jtest_tested_method
		PafDataCache2 THIS = new PafDataCache2(t0);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:462)
		// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafDataCache235.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafDataCache235(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 0 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[1];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { {} };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCache236() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f1.setYearDim("");
		String[] var1 = new String[] {};
		_f1.setHierDims(var1);
		_f1.setMeasureDim("");
		_f1.setPlanTypeDim("");
		_f1.setTimeDim("");
		_f1.setVersionDim("");
		_f1.setDataSourceId("");
		String[] var2 = new String[] {};
		_f1.setAxisPriority(var2);
		// jtest_tested_method
		PafDataCache2 THIS = new PafDataCache2(t0);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:738)
		// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
		// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
		// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafDataCache236.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafDataCache236(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 0 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { {} };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCache239() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		PafApplicationDef t1 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		t0.setAxisCount(0);
		int[] var1 = new int[] {};
		t0.setAxisSize(var1);
		int[] var2 = new int[] {};
		t0.setDimCountByAxis(var2);
		String[] var3 = new String[] {};
		t0.setDimensions(var3);
		boolean[] var4 = new boolean[] {};
		t0.setIsSlicerAxis(var4);
		t0.setMdxQuery("");
		String[][] var5 = new String[][] {};
		t0.setMemberArray(var5);
		Set var6 = (Set) Stubs.makeStubObject(Set.class);
		t0.setLockedPeriods(var6);
		t1.setSeasonList(t2);
		t1.setAppId("");
		PlanCycle[] var7 = new PlanCycle[] {};
		t1.setPlanCycles(var7);
		t1.setLastPeriod("");
		t1.setCurrentYear("");
		t3.setYearDim("");
		String[] var8 = new String[] {};
		t3.setHierDims(var8);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var9 = new String[] {};
		t3.setAxisPriority(var9);
		t1.setMdbDef(t3);
		Map var10 = (Map) Stubs.makeStubObject(Map.class);
		t1.setMeasures(var10);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		t1.setVersions(var11);
		t0.setAppDef(t1);
		String[] var12 = new String[] {};
		t0.setActiveVersion(var12);
		// jtest_tested_method
		PafDataCache2 THIS = new PafDataCache2(t0);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache2.validateDataCacheParms(PafDataCache2.java:182)
		// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:98)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafDataCache239.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafDataCache239(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#PafDataCache2(com.palladium.paf.mdb.PafDataCacheParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCache241() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f5 = new MdbDef();
		_f2.setYearDim("");
		String[] var1 = new String[] {};
		_f2.setHierDims(var1);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var2 = new String[] {};
		_f2.setAxisPriority(var2);
		_f3.setYearDim("");
		String[] var3 = new String[] {};
		_f3.setHierDims(var3);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var4 = new String[] {};
		_f3.setAxisPriority(var4);
		// jtest_tested_method
		PafDataCache2 THIS = new PafDataCache2(t0);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:738)
		// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
		// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
		// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafDataCache241.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafDataCache241(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, null } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: setAxisSizes(int[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#setAxisSizes(int[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetAxisSizes1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		PafApplicationDef t1 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f0 = new PafApplicationDef();
		SeasonList t5 = new SeasonList();
		MdbDef t6 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		t0.setAxisCount(7);
		int[] var1 = new int[] {};
		t0.setAxisSize(var1);
		int[] var2 = new int[] {};
		t0.setDimCountByAxis(var2);
		String[] var3 = new String[] {};
		t0.setDimensions(var3);
		boolean[] var4 = new boolean[] {};
		t0.setIsSlicerAxis(var4);
		t0.setMdxQuery("");
		String[][] var5 = new String[][] {};
		t0.setMemberArray(var5);
		Set var6 = (Set) Stubs.makeStubObject(Set.class);
		t0.setLockedPeriods(var6);
		t1.setSeasonList(t2);
		t1.setAppId("");
		PlanCycle[] var7 = new PlanCycle[] {};
		t1.setPlanCycles(var7);
		t1.setLastPeriod("");
		t1.setCurrentYear("");
		t1.setMdbDef(t3);
		Map var8 = (Map) Stubs.makeStubObject(Map.class);
		t1.setMeasures(var8);
		Map var9 = (Map) Stubs.makeStubObject(Map.class);
		t1.setVersions(var9);
		t0.setAppDef(t1);
		String[] var10 = new String[] {};
		t0.setActiveVersion(var10);
		_f0.setSeasonList(t5);
		_f0.setAppId("");
		PlanCycle[] var11 = new PlanCycle[] {};
		_f0.setPlanCycles(var11);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		_f0.setMdbDef(t6);
		Map var12 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var12);
		Map var13 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var13);
		_f1.setYearDim("");
		String[] var14 = new String[] {};
		_f1.setHierDims(var14);
		_f1.setMeasureDim("");
		_f1.setPlanTypeDim("");
		_f1.setTimeDim("");
		_f1.setVersionDim("");
		_f1.setDataSourceId("");
		String[] var15 = new String[] {};
		_f1.setAxisPriority(var15);
		_f2.setYearDim("");
		String[] var16 = new String[] {};
		_f2.setHierDims(var16);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var17 = new String[] {};
		_f2.setAxisPriority(var17);
		int[] var18 = new int[] {};
		// jtest_tested_method
		THIS.setAxisSizes(var18);
		assertSame(var18, THIS.getAxisSizes()); // jtest_unverified
		assertEquals(5, _f1.getDimCount()); // jtest_unverified
		assertEquals(5, _f2.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testSetAxisSizes1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSetAxisSizes1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: setCellValue(java.lang.String[],double)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#setCellValue(java.lang.String[],double)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetCellValue2() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t3.setYearDim("");
		String[] var2 = new String[] {};
		t3.setHierDims(var2);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var3 = new String[] {};
		t3.setAxisPriority(var3);
		_f0.setMdbDef(t3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		_f5.setYearDim("");
		String[] var8 = new String[] {};
		_f5.setHierDims(var8);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var9 = new String[] {};
		_f5.setAxisPriority(var9);
		THIS.setAxisCount(1);
		int[] var10 = new int[] {};
		THIS.setAxisSizes(var10);
		int[] var11 = new int[] {};
		THIS.setDimCountByAxis(var11);
		boolean[] var12 = new boolean[] {};
		THIS.setIsSlicerAxis(var12);
		THIS.setMdxQuery("");
		String[] var13 = new String[] { "" };
		// jtest_tested_method
		THIS.setCellValue(var13, 0.0);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.PafDataCache2.membersToIndex(PafDataCache2.java:1689)
		// at com.palladium.paf.mdb.PafDataCache2.setCellValue(PafDataCache2.java:853)
		// Caused by: java.lang.IllegalArgumentException: IllegalArgumentException: Member to index conversion error - member [] not found in axis [0] (dimension [])
		// at com.palladium.paf.mdb.PafDataCache2.getMemberIndex(PafDataCache2.java:1647)
		// at com.palladium.paf.mdb.PafDataCache2.membersToIndex(PafDataCache2.java:1682)
		// jtest_unverified
	}

	/**
	 * Stubs method for testSetCellValue2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSetCellValue2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.containsKey(java.lang.Object)");
				switch (index) {
					case 1 :
					case 2 :
						return Boolean.TRUE;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					// 
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					case 3 :
						return Boolean.FALSE;
					// at com.palladium.paf.mdb.PafDataCache2.getMemberIndex(PafDataCache2.java:1640)
					// at com.palladium.paf.mdb.PafDataCache2.membersToIndex(PafDataCache2.java:1682)
					// at com.palladium.paf.mdb.PafDataCache2.setCellValue(PafDataCache2.java:853)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: setCellValueAndTrackChanges(int[],double)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#setCellValueAndTrackChanges(int[],double)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetCellValueAndTrackChanges1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t3.setYearDim("");
		String[] var2 = new String[] {};
		t3.setHierDims(var2);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var3 = new String[] {};
		t3.setAxisPriority(var3);
		_f0.setMdbDef(t3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		_f5.setYearDim("");
		String[] var8 = new String[] {};
		_f5.setHierDims(var8);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var9 = new String[] {};
		_f5.setAxisPriority(var9);
		THIS.setAxisCount(0);
		int[] var10 = new int[] {};
		THIS.setAxisSizes(var10);
		int[] var11 = new int[] {};
		THIS.setDimCountByAxis(var11);
		boolean[] var12 = new boolean[] {};
		THIS.setIsSlicerAxis(var12);
		THIS.setMdxQuery("");
		// jtest_tested_method
		THIS.setCellValueAndTrackChanges((int[]) null, 0.0);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.PafDataCache2.getDataCellIndex(PafDataCache2.java:1751)
		// at com.palladium.paf.mdb.PafDataCache2.getCellValue(PafDataCache2.java:840)
		// at com.palladium.paf.mdb.PafDataCache2.setCellValueAndTrackChanges(PafDataCache2.java:879)
		// jtest_unverified
	}

	/**
	 * Stubs method for testSetCellValueAndTrackChanges1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSetCellValueAndTrackChanges1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: setMdxQuery(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#setMdxQuery(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetMdxQuery1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		PafApplicationDef t1 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f0 = new PafApplicationDef();
		SeasonList t5 = new SeasonList();
		MdbDef t6 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		t0.setAxisCount(7);
		int[] var1 = new int[] {};
		t0.setAxisSize(var1);
		int[] var2 = new int[] {};
		t0.setDimCountByAxis(var2);
		String[] var3 = new String[] {};
		t0.setDimensions(var3);
		boolean[] var4 = new boolean[] {};
		t0.setIsSlicerAxis(var4);
		t0.setMdxQuery("");
		String[][] var5 = new String[][] {};
		t0.setMemberArray(var5);
		Set var6 = (Set) Stubs.makeStubObject(Set.class);
		t0.setLockedPeriods(var6);
		t1.setSeasonList(t2);
		t1.setAppId("");
		PlanCycle[] var7 = new PlanCycle[] {};
		t1.setPlanCycles(var7);
		t1.setLastPeriod("");
		t1.setCurrentYear("");
		t3.setYearDim("");
		String[] var8 = new String[] {};
		t3.setHierDims(var8);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var9 = new String[] {};
		t3.setAxisPriority(var9);
		t1.setMdbDef(t3);
		Map var10 = (Map) Stubs.makeStubObject(Map.class);
		t1.setMeasures(var10);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		t1.setVersions(var11);
		t0.setAppDef(t1);
		String[] var12 = new String[] {};
		t0.setActiveVersion(var12);
		_f0.setSeasonList(t5);
		_f0.setAppId("");
		PlanCycle[] var13 = new PlanCycle[] {};
		_f0.setPlanCycles(var13);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t6.setYearDim("");
		String[] var14 = new String[] {};
		t6.setHierDims(var14);
		t6.setMeasureDim("");
		t6.setPlanTypeDim("");
		t6.setTimeDim("");
		t6.setVersionDim("");
		t6.setDataSourceId("");
		String[] var15 = new String[] {};
		t6.setAxisPriority(var15);
		_f0.setMdbDef(t6);
		Map var16 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var16);
		Map var17 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var17);
		_f3.setYearDim("");
		String[] var18 = new String[] {};
		_f3.setHierDims(var18);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var19 = new String[] {};
		_f3.setAxisPriority(var19);
		_f5.setYearDim("");
		String[] var20 = new String[] {};
		_f5.setHierDims(var20);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var21 = new String[] {};
		_f5.setAxisPriority(var21);
		// jtest_tested_method
		THIS.setMdxQuery("");
		assertEquals("", THIS.getMdxQuery()); // jtest_unverified
		assertEquals(5, _f3.getDimCount()); // jtest_unverified
		assertEquals(5, _f5.getDimCount()); // jtest_unverified
		assertEquals(5, t6.getDimCount()); // jtest_unverified
		assertEquals(5, t3.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testSetMdxQuery1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSetMdxQuery1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: toString()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#toString()
	 * @author Parasoft Jtest 8.0
	 */
	public void testToString1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f7 = new MdbDef();
		_f8 = new Integer(0);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t3.setYearDim("");
		String[] var2 = new String[] {};
		t3.setHierDims(var2);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var3 = new String[] {};
		t3.setAxisPriority(var3);
		_f0.setMdbDef(t3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		_f5.setYearDim("");
		String[] var8 = new String[] {};
		_f5.setHierDims(var8);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var9 = new String[] {};
		_f5.setAxisPriority(var9);
		THIS.setAxisCount(1);
		int[] var10 = new int[] { 0 };
		THIS.setAxisSizes(var10);
		int[] var11 = new int[] {};
		THIS.setDimCountByAxis(var11);
		boolean[] var12 = new boolean[] { true };
		THIS.setIsSlicerAxis(var12);
		THIS.setMdxQuery("");
		// jtest_tested_method
		String RETVAL = THIS.toString();
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.mdb.PafDataCache2.getColumnCount(PafDataCache2.java:926)
		// at com.palladium.paf.mdb.PafDataCache2.getRowCount(PafDataCache2.java:1613)
		// at com.palladium.paf.mdb.PafDataCache2.toString(PafDataCache2.java:1864)
		// jtest_unverified
	}

	/**
	 * Stubs method for testToString1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsToString1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					case 5 :
						return _f7;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.toString(PafDataCache2.java:1862)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.toString(PafDataCache2.java:1862)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					case 3 :
						return _f8;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.toString(PafDataCache2.java:1862)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: update(com.palladium.paf.data.PafDataSlice,com.palladium.paf.mdb.PafDataSliceParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#update(com.palladium.paf.data.PafDataSlice,com.palladium.paf.mdb.PafDataSliceParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testUpdate1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t3.setYearDim("");
		String[] var2 = new String[] {};
		t3.setHierDims(var2);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var3 = new String[] {};
		t3.setAxisPriority(var3);
		_f0.setMdbDef(t3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		_f5.setYearDim("");
		String[] var8 = new String[] {};
		_f5.setHierDims(var8);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var9 = new String[] {};
		_f5.setAxisPriority(var9);
		THIS.setAxisCount(-1);
		int[] var10 = new int[] {};
		THIS.setAxisSizes(var10);
		int[] var11 = new int[] {};
		THIS.setDimCountByAxis(var11);
		boolean[] var12 = new boolean[] {};
		THIS.setIsSlicerAxis(var12);
		THIS.setMdxQuery("");
		// jtest_tested_method
		THIS.update((PafDataSlice) null, (PafDataSliceParms) null);
		// NegativeArraySizeException thrown
		// at com.palladium.paf.mdb.PafDataCache2.update(PafDataCache2.java:1156)
		// jtest_unverified
	}

	/**
	 * Stubs method for testUpdate1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsUpdate1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: updateCellIndex(java.lang.String[],int[],java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#updateCellIndex(java.lang.String[],int[],java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testUpdateCellIndex2() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t3.setYearDim("");
		String[] var2 = new String[] {};
		t3.setHierDims(var2);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var3 = new String[] {};
		t3.setAxisPriority(var3);
		_f0.setMdbDef(t3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		_f5.setYearDim("");
		String[] var8 = new String[] {};
		_f5.setHierDims(var8);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var9 = new String[] {};
		_f5.setAxisPriority(var9);
		THIS.setAxisCount(0);
		int[] var10 = new int[] {};
		THIS.setAxisSizes(var10);
		int[] var11 = new int[] {};
		THIS.setDimCountByAxis(var11);
		boolean[] var12 = new boolean[] {};
		THIS.setIsSlicerAxis(var12);
		THIS.setMdxQuery("");
		// jtest_tested_method
		String[] RETVAL = THIS.updateCellIndex(
			(String[]) null,
			(int[]) null,
			(String[]) null);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.mdb.PafDataCache2.updateCellIndex([Ljava/lang/String;[I[Ljava/lang/String;)[Ljava/lang/String;>
		// at com.palladium.paf.mdb.PafDataCache2.updateCellIndex(PafDataCache2.java:1228)
		// jtest_unverified
	}

	/**
	 * Stubs method for testUpdateCellIndex2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsUpdateCellIndex2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: validateMemberFilters(java.util.Map)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache2#validateMemberFilters(java.util.Map)
	 * @author Parasoft Jtest 8.0
	 */
	public void testValidateMemberFilters1() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Integer("0");
		_f5 = new MdbDef();
		_f6 = new Integer("0");
		PafDataCache2 THIS = new PafDataCache2(t0);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t3.setYearDim("");
		String[] var2 = new String[] {};
		t3.setHierDims(var2);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var3 = new String[] {};
		t3.setAxisPriority(var3);
		_f0.setMdbDef(t3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		_f5.setYearDim("");
		String[] var8 = new String[] {};
		_f5.setHierDims(var8);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var9 = new String[] {};
		_f5.setAxisPriority(var9);
		THIS.setAxisCount(0);
		int[] var10 = new int[] {};
		THIS.setAxisSizes(var10);
		int[] var11 = new int[] {};
		THIS.setDimCountByAxis(var11);
		boolean[] var12 = new boolean[] {};
		THIS.setIsSlicerAxis(var12);
		THIS.setMdxQuery("");
		// jtest_tested_method
		THIS.validateMemberFilters((Map) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.mdb.PafDataCache2.validateMemberFilters(Ljava/util/Map;)V>
		// at com.palladium.paf.mdb.PafDataCache2.validateMemberFilters(PafDataCache2.java:1882)
		// jtest_unverified
	}

	/**
	 * Stubs method for testValidateMemberFilters1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsValidateMemberFilters1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 2 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:95)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
					case 3 :
						return _f3;
					// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 4 :
						return _f5;
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureDim(PafDataCache2.java:1283)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.createIndexedDimensions(PafDataCache2.java:449)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:104)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getVersionDim(PafDataCache2.java:1390)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
				// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
				// 
				// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:731)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
				// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
				// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionAxis(PafDataCache2.java:1348)
					// at com.palladium.paf.mdb.PafDataCache2.getVersionSize(PafDataCache2.java:1429)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:117)
					case 2 :
						return _f6;
					// at com.palladium.paf.mdb.PafDataCache2.getAxisIndex(PafDataCache2.java:732)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureAxis(PafDataCache2.java:1250)
					// at com.palladium.paf.mdb.PafDataCache2.getMeasureSize(PafDataCache2.java:1292)
					// at com.palladium.paf.mdb.PafDataCache2.<init>(PafDataCache2.java:118)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
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
	 * Usage: java com.palladium.paf.mdb.PafDataCache2Test
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
			PafDataCache2Test.class,
			// fully qualified name of the tested class
			"com.palladium.paf.mdb.PafDataCache2",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafDataCache2.class;
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
private PafApplicationDef _f0;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private MdbDef _f1;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private MdbDef _f2;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private MdbDef _f3;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Integer _f4;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private MdbDef _f5;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Integer _f6;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private MdbDef _f7;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Integer _f8;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private VersionDef _f9;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private VersionDef _f10;
}

// JTEST_CURRENT_ID=1120448441.