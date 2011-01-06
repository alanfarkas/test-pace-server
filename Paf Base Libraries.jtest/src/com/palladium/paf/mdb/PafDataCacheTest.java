/*
 * PafDataCacheTest.java
 * Created by Jtest on 9/19/06 5:25:57 PM.
 * Updated by Jtest on 10/18/06 7:24:17 PM, 18 test cases added, 18 test cases removed.
 * Updated by Jtest on 11/9/06 3:10:26 AM, 18 test cases added, 18 test cases removed.
 */

package com.palladium.paf.mdb;

import java.util.Map;
import com.palladium.paf.app.PlanCycle;
import com.palladium.paf.app.MdbDef;
import com.palladium.paf.app.SeasonList;
import java.lang.reflect.Member;
import jtest.Stubs;
import java.util.Set;
import com.palladium.paf.app.PafApplicationDef;
import com.palladium.paf.mdb.PafDataCache;

/**
 * PafDataCacheTest is a unit test class for class PafDataCache.
 * @see com.palladium.paf.mdb.PafDataCache
 * @author Parasoft Jtest 8.0
 */
public class PafDataCacheTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafDataCacheTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: PafDataCache(com.palladium.paf.mdb.PafDataCacheParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache#PafDataCache(com.palladium.paf.mdb.PafDataCacheParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCache1() throws Throwable {
		// jtest_tested_method
		PafDataCache THIS = new PafDataCache((PafDataCacheParms) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.mdb.PafDataCache.<init>(Lcom/palladium/paf/mdb/PafDataCacheParms;)V>
		// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:85)
		// jtest_unverified
	}

	/**
	 * Test for method: PafDataCache(com.palladium.paf.mdb.PafDataCacheParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache#PafDataCache(com.palladium.paf.mdb.PafDataCacheParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCache2() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		// jtest_tested_method
		PafDataCache THIS = new PafDataCache(t0);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache.validateDataCacheParms(PafDataCache.java:141)
		// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:97)
		// jtest_unverified
	}

	/**
	 * Test for method: PafDataCache(com.palladium.paf.mdb.PafDataCacheParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache#PafDataCache(com.palladium.paf.mdb.PafDataCacheParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCache3() throws Throwable {
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
		PafDataCache THIS = new PafDataCache(t0);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache.validateDataCacheParms(PafDataCache.java:171)
		// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:97)
		// jtest_unverified
	}

	/**
	 * Test for method: PafDataCache(com.palladium.paf.mdb.PafDataCacheParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache#PafDataCache(com.palladium.paf.mdb.PafDataCacheParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCache8() throws Throwable {
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
		PafDataCache THIS = new PafDataCache(t0);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache.validateDataCacheParms(PafDataCache.java:151)
		// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:97)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafDataCache8.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafDataCache8(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:85)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:94)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafDataCache(com.palladium.paf.mdb.PafDataCacheParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache#PafDataCache(com.palladium.paf.mdb.PafDataCacheParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCache12() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		// jtest_tested_method
		PafDataCache THIS = new PafDataCache(t0);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache.validateDataCacheParms(PafDataCache.java:162)
		// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:97)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafDataCache12.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafDataCache12(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:85)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:94)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafDataCache(com.palladium.paf.mdb.PafDataCacheParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache#PafDataCache(com.palladium.paf.mdb.PafDataCacheParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCache15() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		// jtest_tested_method
		PafDataCache THIS = new PafDataCache(t0);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache.validateArrayNotEmpty(PafDataCache.java:332)
		// at com.palladium.paf.mdb.PafDataCache.validateArray(PafDataCache.java:264)
		// at com.palladium.paf.mdb.PafDataCache.validateDataCacheParms(PafDataCache.java:188)
		// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:97)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafDataCache15.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafDataCache15(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:85)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[0];
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:94)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafDataCache(com.palladium.paf.mdb.PafDataCacheParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache#PafDataCache(com.palladium.paf.mdb.PafDataCacheParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCache17() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		// jtest_tested_method
		PafDataCache THIS = new PafDataCache(t0);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache.validateArray(PafDataCache.java:271)
		// at com.palladium.paf.mdb.PafDataCache.validateDataCacheParms(PafDataCache.java:188)
		// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:97)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafDataCache17.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafDataCache17(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:85)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 0, 0 };
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:94)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafDataCache(com.palladium.paf.mdb.PafDataCacheParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache#PafDataCache(com.palladium.paf.mdb.PafDataCacheParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCache19() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		// jtest_tested_method
		PafDataCache THIS = new PafDataCache(t0);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache.validateArrayNotEmpty(PafDataCache.java:313)
		// at com.palladium.paf.mdb.PafDataCache.validateArray(PafDataCache.java:242)
		// at com.palladium.paf.mdb.PafDataCache.validateDataCacheParms(PafDataCache.java:196)
		// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:97)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafDataCache19.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafDataCache19(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:85)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(3);
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 0, 0, 0 };
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[0];
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:94)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafDataCache(com.palladium.paf.mdb.PafDataCacheParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache#PafDataCache(com.palladium.paf.mdb.PafDataCacheParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCache21() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		// jtest_tested_method
		PafDataCache THIS = new PafDataCache(t0);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache.validateArray(PafDataCache.java:249)
		// at com.palladium.paf.mdb.PafDataCache.validateDataCacheParms(PafDataCache.java:196)
		// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:97)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafDataCache21.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafDataCache21(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:85)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(5);
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 0, 0, 0, 0, 0 };
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:94)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafDataCache(com.palladium.paf.mdb.PafDataCacheParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache#PafDataCache(com.palladium.paf.mdb.PafDataCacheParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCache23() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		// jtest_tested_method
		PafDataCache THIS = new PafDataCache(t0);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache.validateDataCacheParms(PafDataCache.java:206)
		// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:97)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafDataCache23.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafDataCache23(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:85)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(7);
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 0, 0, 0, 0, 0, 0, 0 };
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1, 2, 0, 0, 0, 0, 0 };
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false, false, false, false, false,
						false, false };
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:94)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafDataCache(com.palladium.paf.mdb.PafDataCacheParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache#PafDataCache(com.palladium.paf.mdb.PafDataCacheParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCache25() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		// jtest_tested_method
		PafDataCache THIS = new PafDataCache(t0);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache.validateArrayNotEmpty(PafDataCache.java:351)
		// at com.palladium.paf.mdb.PafDataCache.validateArray(PafDataCache.java:286)
		// at com.palladium.paf.mdb.PafDataCache.validateDataCacheParms(PafDataCache.java:213)
		// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:97)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafDataCache25.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafDataCache25(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:85)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(9);
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1 };
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false, false, false, false, false,
						false, false, false, false };
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:94)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafDataCache(com.palladium.paf.mdb.PafDataCacheParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache#PafDataCache(com.palladium.paf.mdb.PafDataCacheParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCache28() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		// jtest_tested_method
		PafDataCache THIS = new PafDataCache(t0);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache.validateArrayNotEmpty(PafDataCache.java:351)
		// at com.palladium.paf.mdb.PafDataCache.validateArray(PafDataCache.java:286)
		// at com.palladium.paf.mdb.PafDataCache.validateDataCacheParms(PafDataCache.java:217)
		// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:97)
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
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:85)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 0 };
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[1];
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[0][];
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:94)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafDataCache(com.palladium.paf.mdb.PafDataCacheParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache#PafDataCache(com.palladium.paf.mdb.PafDataCacheParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCache29() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		// jtest_tested_method
		PafDataCache THIS = new PafDataCache(t0);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache.validateArray(PafDataCache.java:293)
		// at com.palladium.paf.mdb.PafDataCache.validateDataCacheParms(PafDataCache.java:213)
		// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:97)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafDataCache29.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafDataCache29(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:85)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 0 };
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[2];
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:94)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafDataCache(com.palladium.paf.mdb.PafDataCacheParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache#PafDataCache(com.palladium.paf.mdb.PafDataCacheParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCache30() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		// jtest_tested_method
		PafDataCache THIS = new PafDataCache(t0);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.PafDataCache.validateDataCacheParms(PafDataCache.java:219)
		// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:97)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafDataCache30.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafDataCache30(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:85)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 0 };
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[1];
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[1][];
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:94)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafDataCache(com.palladium.paf.mdb.PafDataCacheParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache#PafDataCache(com.palladium.paf.mdb.PafDataCacheParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCache31() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		// jtest_tested_method
		PafDataCache THIS = new PafDataCache(t0);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.PafDataCache.getMeasureDim(PafDataCache.java:1338)
		// at com.palladium.paf.mdb.PafDataCache.createIndexedDimensions(PafDataCache.java:449)
		// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:103)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafDataCache31.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafDataCache31(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:85)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 0 };
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[1];
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { {} };
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:94)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafDataCache(com.palladium.paf.mdb.PafDataCacheParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache#PafDataCache(com.palladium.paf.mdb.PafDataCacheParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCache32() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		// jtest_tested_method
		PafDataCache THIS = new PafDataCache(t0);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache.validateDataCacheParms(PafDataCache.java:224)
		// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:97)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafDataCache32.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafDataCache32(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:85)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 0 };
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[1];
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { { null } };
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:94)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafDataCache(com.palladium.paf.mdb.PafDataCacheParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache#PafDataCache(com.palladium.paf.mdb.PafDataCacheParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCache34() throws Throwable {
		PafDataCacheParms t0 = new PafDataCacheParms();
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		// jtest_tested_method
		PafDataCache THIS = new PafDataCache(t0);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.PafDataCache.getVersionDim(PafDataCache.java:1445)
		// at com.palladium.paf.mdb.PafDataCache.createIndexedDimensions(PafDataCache.java:449)
		// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:103)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafDataCache34.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafDataCache34(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:85)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 0 };
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[1];
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { {} };
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:94)
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
					// at com.palladium.paf.mdb.PafDataCache.getMeasureDim(PafDataCache.java:1338)
					// at com.palladium.paf.mdb.PafDataCache.createIndexedDimensions(PafDataCache.java:449)
					// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:103)
					case 2 :
						return null;
					// at com.palladium.paf.mdb.PafDataCache.getVersionDim(PafDataCache.java:1445)
					// at com.palladium.paf.mdb.PafDataCache.createIndexedDimensions(PafDataCache.java:449)
					// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:103)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafDataCache(com.palladium.paf.mdb.PafDataCacheParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCache#PafDataCache(com.palladium.paf.mdb.PafDataCacheParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCache35() throws Throwable {
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
		PafDataCache THIS = new PafDataCache(t0);
		// NegativeArraySizeException thrown
		// at com.palladium.paf.mdb.PafDataCache.createIndexedDimensions(PafDataCache.java:459)
		// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:103)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafDataCache35.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafDataCache35(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCacheParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:85)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedPeriods", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:87)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:88)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSize", argument_types)) {
				return new int[] { 0 };
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:89)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimCountByAxis", argument_types)) {
				return new int[] { 1 };
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDimensions", argument_types)) {
				return new String[1];
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIsSlicerAxis", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberArray", argument_types)) {
				return new String[][] { {} };
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdxQuery", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:94)
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
					// at com.palladium.paf.mdb.PafDataCache.getMeasureDim(PafDataCache.java:1338)
					// at com.palladium.paf.mdb.PafDataCache.createIndexedDimensions(PafDataCache.java:449)
					// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:103)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafDataCache.getVersionDim(PafDataCache.java:1445)
					// at com.palladium.paf.mdb.PafDataCache.createIndexedDimensions(PafDataCache.java:449)
					// at com.palladium.paf.mdb.PafDataCache.<init>(PafDataCache.java:103)
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
	 * Usage: java com.palladium.paf.mdb.PafDataCacheTest
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
			PafDataCacheTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.mdb.PafDataCache",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafDataCache.class;
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
}

// JTEST_CURRENT_ID=-284285667.