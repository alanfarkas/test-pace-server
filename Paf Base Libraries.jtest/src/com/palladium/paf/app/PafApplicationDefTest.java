/*
 * PafApplicationDefTest.java
 * Created by Jtest on 9/19/06 5:35:12 PM.
 * Updated by Jtest on 10/18/06 7:17:31 PM, 25 test cases added, 25 test cases removed.
 * Updated by Jtest on 11/9/06 2:49:23 AM, 25 test cases added, 25 test cases removed.
 */

package com.palladium.paf.app;

import com.palladium.paf.funcs.IPafFunction;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import com.palladium.paf.comm.CustomMenuDef;
import java.lang.reflect.Member;
import com.palladium.paf.funcs.CustomFunctionDef;
import jtest.Stubs;
import java.util.Map;
import com.palladium.paf.app.PafApplicationDef;

/**
 * PafApplicationDefTest is a unit test class for class PafApplicationDef.
 * @see com.palladium.paf.app.PafApplicationDef
 * @author Parasoft Jtest 8.0
 */
public class PafApplicationDefTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafApplicationDefTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: findPlanCycleVersion(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#findPlanCycleVersion(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindPlanCycleVersion1() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		// jtest_tested_method
		String RETVAL = THIS.findPlanCycleVersion((String) null);
		// NullPointerException thrown
		// at com.palladium.paf.app.PafApplicationDef.findPlanCycleVersion(PafApplicationDef.java:120)
		// jtest_unverified
	}

	/**
	 * Test for method: findPlanCycleVersion(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#findPlanCycleVersion(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindPlanCycleVersion4() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		SeasonList t1 = new SeasonList();
		MdbDef t2 = new MdbDef();
		PlanCycle t3 = new PlanCycle((String) null, (String) null);
		THIS.setSeasonList(t1);
		THIS.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] { t3 };
		THIS.setPlanCycles(var1);
		THIS.setLastPeriod("");
		THIS.setCurrentYear("");
		t2.setYearDim("");
		String[] var2 = new String[] {};
		t2.setHierDims(var2);
		t2.setMeasureDim("");
		t2.setPlanTypeDim("");
		t2.setTimeDim("");
		t2.setVersionDim("");
		t2.setDataSourceId("");
		String[] var3 = new String[] {};
		t2.setAxisPriority(var3);
		THIS.setMdbDef(t2);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setVersions(var5);
		// jtest_tested_method
		String RETVAL = THIS.findPlanCycleVersion((String) null);
		// NullPointerException thrown
		// at com.palladium.paf.app.PafApplicationDef.findPlanCycleVersion(PafApplicationDef.java:121)
		// jtest_unverified
	}

	/**
	 * Test for method: findPlanCycleVersion(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#findPlanCycleVersion(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindPlanCycleVersion6() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		SeasonList t1 = new SeasonList();
		MdbDef t2 = new MdbDef();
		PlanCycle t3 = new PlanCycle();
		THIS.setSeasonList(t1);
		THIS.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] { t3 };
		THIS.setPlanCycles(var1);
		THIS.setLastPeriod("");
		THIS.setCurrentYear("");
		t2.setYearDim("");
		String[] var2 = new String[] {};
		t2.setHierDims(var2);
		t2.setMeasureDim("");
		t2.setPlanTypeDim("");
		t2.setTimeDim("");
		t2.setVersionDim("");
		t2.setDataSourceId("");
		String[] var3 = new String[] {};
		t2.setAxisPriority(var3);
		THIS.setMdbDef(t2);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setVersions(var5);
		// jtest_tested_method
		String RETVAL = THIS.findPlanCycleVersion("0");
		// IllegalArgumentException thrown
		// at com.palladium.paf.app.PafApplicationDef.findPlanCycleVersion(PafApplicationDef.java:123)
		// jtest_unverified
	}

	/**
	 * Stubs method for testFindPlanCycleVersion6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsFindPlanCycleVersion6(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PlanCycle.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLabel", argument_types)) {
				return "";
				// at com.palladium.paf.app.PafApplicationDef.findPlanCycleVersion(PafApplicationDef.java:121)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: findPlanCycleVersion(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#findPlanCycleVersion(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindPlanCycleVersion8() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		SeasonList t1 = new SeasonList();
		MdbDef t2 = new MdbDef();
		PlanCycle t3 = new PlanCycle((String) null, (String) null);
		THIS.setSeasonList(t1);
		THIS.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] { t3 };
		THIS.setPlanCycles(var1);
		THIS.setLastPeriod("");
		THIS.setCurrentYear("");
		THIS.setMdbDef(t2);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setMeasures(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setVersions(var3);
		t3.setLabel("");
		t3.setVersion("");
		// jtest_tested_method
		String RETVAL = THIS.findPlanCycleVersion("");
		assertEquals(null, RETVAL); // jtest_unverified
		assertEquals("", THIS.getAppId()); // jtest_unverified
		assertEquals("", THIS.getCurrentYear()); // jtest_unverified
		assertEquals("", THIS.getLastPeriod()); // jtest_unverified
		assertEquals(t2, THIS.getMdbDef()); // jtest_unverified
		assertEquals(null, THIS.getMeasureFunctionFactory()); // jtest_unverified
		assertEquals(var2, THIS.getMeasures()); // jtest_unverified
		assertEquals(var1, THIS.getPlanCycles()); // jtest_unverified
		assertEquals(t1, THIS.getSeasonList()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testFindPlanCycleVersion8.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsFindPlanCycleVersion8(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PlanCycle.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLabel", argument_types)) {
				return "";
				// at com.palladium.paf.app.PafApplicationDef.findPlanCycleVersion(PafApplicationDef.java:121)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersion", argument_types)) {
				return null;
				// at com.palladium.paf.app.PafApplicationDef.findPlanCycleVersion(PafApplicationDef.java:121)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getAppId()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#getAppId()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAppId1() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		// jtest_tested_method
		String RETVAL = THIS.getAppId();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getCurrentYear()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#getCurrentYear()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetCurrentYear1() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		// jtest_tested_method
		String RETVAL = THIS.getCurrentYear();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getCustomFunction(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#getCustomFunction(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetCustomFunction1() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		// jtest_tested_method
		IPafFunction RETVAL = THIS.getCustomFunction((String) null);
		// NullPointerException thrown
		// at com.palladium.paf.app.PafApplicationDef.getCustomFunction(PafApplicationDef.java:206)
		// jtest_unverified
	}

	/**
	 * Test for method: getCustomMenuDef(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#getCustomMenuDef(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetCustomMenuDef1() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		// jtest_tested_method
		CustomMenuDef RETVAL = THIS.getCustomMenuDef((String) null);
		// NullPointerException thrown
		// at com.palladium.paf.app.PafApplicationDef.getCustomMenuDef(PafApplicationDef.java:210)
		// jtest_unverified
	}

	/**
	 * Test for method: getLastPeriod()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#getLastPeriod()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLastPeriod1() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		// jtest_tested_method
		String RETVAL = THIS.getLastPeriod();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getMdbDef()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#getMdbDef()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMdbDef1() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		// jtest_tested_method
		MdbDef RETVAL = THIS.getMdbDef();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getMeasureDef(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#getMeasureDef(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMeasureDef1() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		// jtest_tested_method
		MeasureDef RETVAL = THIS.getMeasureDef((String) null);
		// NullPointerException thrown
		// at com.palladium.paf.app.PafApplicationDef.getMeasureDef(PafApplicationDef.java:185)
		// jtest_unverified
	}

	/**
	 * Test for method: getMeasureDef(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#getMeasureDef(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMeasureDef2() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		SeasonList t1 = new SeasonList();
		MdbDef t2 = new MdbDef();
		THIS.setSeasonList(t1);
		THIS.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		THIS.setPlanCycles(var1);
		THIS.setLastPeriod("");
		THIS.setCurrentYear("");
		THIS.setMdbDef(t2);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setMeasures(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setVersions(var3);
		// jtest_tested_method
		MeasureDef RETVAL = THIS.getMeasureDef((String) null);
		// ClassCastException thrown
		// at com.palladium.paf.app.PafApplicationDef.getMeasureDef(PafApplicationDef.java:185)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMeasureDef2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMeasureDef2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.app.PafApplicationDef.getMeasureDef(PafApplicationDef.java:185)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMeasureDef(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#getMeasureDef(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMeasureDef3() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		SeasonList t1 = new SeasonList();
		MdbDef t2 = new MdbDef();
		THIS.setSeasonList(t1);
		THIS.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		THIS.setPlanCycles(var1);
		THIS.setLastPeriod("");
		THIS.setCurrentYear("");
		THIS.setMdbDef(t2);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setMeasures(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setVersions(var3);
		// jtest_tested_method
		MeasureDef RETVAL = THIS.getMeasureDef((String) null);
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMeasureDef3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMeasureDef3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
				// at com.palladium.paf.app.PafApplicationDef.getMeasureDef(PafApplicationDef.java:185)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMeasureFunctionFactory()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#getMeasureFunctionFactory()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMeasureFunctionFactory1() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		// jtest_tested_method
		MeasureFunctionFactory RETVAL = THIS.getMeasureFunctionFactory();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getMeasures()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#getMeasures()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMeasures1() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		// jtest_tested_method
		Map RETVAL = THIS.getMeasures();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPlanCycles()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#getPlanCycles()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPlanCycles1() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		// jtest_tested_method
		PlanCycle[] RETVAL = THIS.getPlanCycles();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getSeasonList()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#getSeasonList()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetSeasonList1() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		// jtest_tested_method
		SeasonList RETVAL = THIS.getSeasonList();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getVarianceVersions()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#getVarianceVersions()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetVarianceVersions1() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		// jtest_tested_method
		List RETVAL = THIS.getVarianceVersions();
		// NullPointerException thrown
		// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:167)
		// jtest_unverified
	}

	/**
	 * Test for method: getVarianceVersions()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#getVarianceVersions()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetVarianceVersions2() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		SeasonList t1 = new SeasonList();
		MdbDef t2 = new MdbDef();
		THIS.setSeasonList(t1);
		THIS.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		THIS.setPlanCycles(var1);
		THIS.setLastPeriod("");
		THIS.setCurrentYear("");
		THIS.setMdbDef(t2);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setMeasures(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setVersions(var3);
		// jtest_tested_method
		List RETVAL = THIS.getVarianceVersions();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0, RETVAL.size()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetVarianceVersions2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetVarianceVersions2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:167)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "values", argument_types)) {
				return Stubs.makeStubObject(Collection.class);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
			}
		}
		if (Stubs.matches(method, Collection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getVarianceVersions()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#getVarianceVersions()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetVarianceVersions4() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		SeasonList t1 = new SeasonList();
		MdbDef t2 = new MdbDef();
		_f0 = new VersionDef((String) null, (VersionType) null);
		THIS.setSeasonList(t1);
		THIS.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		THIS.setPlanCycles(var1);
		THIS.setLastPeriod("");
		THIS.setCurrentYear("");
		t2.setYearDim("");
		String[] var2 = new String[] {};
		t2.setHierDims(var2);
		t2.setMeasureDim("");
		t2.setPlanTypeDim("");
		t2.setTimeDim("");
		t2.setVersionDim("");
		t2.setDataSourceId("");
		String[] var3 = new String[] {};
		t2.setAxisPriority(var3);
		THIS.setMdbDef(t2);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setVersions(var5);
		// jtest_tested_method
		List RETVAL = THIS.getVarianceVersions();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0, RETVAL.size()); // jtest_unverified
		assertEquals(5, t2.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetVarianceVersions4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetVarianceVersions4(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:167)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "values", argument_types)) {
				return Stubs.makeStubObject(Collection.class);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
			}
		}
		if (Stubs.matches(method, Collection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Iterator.hasNext()");
				switch (index) {
					case 1 :
						return Boolean.TRUE;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					case 2 :
						return Boolean.FALSE;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return _f0;
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getVarianceVersions()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#getVarianceVersions()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetVarianceVersions5() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		SeasonList t1 = new SeasonList();
		MdbDef t2 = new MdbDef();
		THIS.setSeasonList(t1);
		THIS.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		THIS.setPlanCycles(var1);
		THIS.setLastPeriod("");
		THIS.setCurrentYear("");
		THIS.setMdbDef(t2);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setMeasures(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setVersions(var3);
		// jtest_tested_method
		List RETVAL = THIS.getVarianceVersions();
		// ClassCastException thrown
		// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetVarianceVersions5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetVarianceVersions5(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:167)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "values", argument_types)) {
				return Stubs.makeStubObject(Collection.class);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
			}
		}
		if (Stubs.matches(method, Collection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return "";
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getVersionDef(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#getVersionDef(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetVersionDef1() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		// jtest_tested_method
		VersionDef RETVAL = THIS.getVersionDef((String) null);
		// NullPointerException thrown
		// at com.palladium.paf.app.PafApplicationDef.getVersionDef(PafApplicationDef.java:196)
		// jtest_unverified
	}

	/**
	 * Test for method: getVersionDef(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#getVersionDef(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetVersionDef2() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		SeasonList t1 = new SeasonList();
		MdbDef t2 = new MdbDef();
		THIS.setSeasonList(t1);
		THIS.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		THIS.setPlanCycles(var1);
		THIS.setLastPeriod("");
		THIS.setCurrentYear("");
		THIS.setMdbDef(t2);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setMeasures(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setVersions(var3);
		// jtest_tested_method
		VersionDef RETVAL = THIS.getVersionDef((String) null);
		// ClassCastException thrown
		// at com.palladium.paf.app.PafApplicationDef.getVersionDef(PafApplicationDef.java:196)
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
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.app.PafApplicationDef.getVersionDef(PafApplicationDef.java:196)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getVersionDef(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#getVersionDef(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetVersionDef3() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		SeasonList t1 = new SeasonList();
		MdbDef t2 = new MdbDef();
		THIS.setSeasonList(t1);
		THIS.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		THIS.setPlanCycles(var1);
		THIS.setLastPeriod("");
		THIS.setCurrentYear("");
		THIS.setMdbDef(t2);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setMeasures(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setVersions(var3);
		// jtest_tested_method
		VersionDef RETVAL = THIS.getVersionDef((String) null);
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetVersionDef3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetVersionDef3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
				// at com.palladium.paf.app.PafApplicationDef.getVersionDef(PafApplicationDef.java:196)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getVersions()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#getVersions()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetVersions1() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		// jtest_tested_method
		Map RETVAL = THIS.getVersions();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: initCustomMenus(com.palladium.paf.comm.CustomMenuDef[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#initCustomMenus(com.palladium.paf.comm.CustomMenuDef[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testInitCustomMenus1() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		// jtest_tested_method
		THIS.initCustomMenus((CustomMenuDef[]) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.app.PafApplicationDef.initCustomMenus([Lcom/palladium/paf/comm/CustomMenuDef;)V>
		// at com.palladium.paf.app.PafApplicationDef.initCustomMenus(PafApplicationDef.java:75)
		// jtest_unverified
	}

	/**
	 * Test for method: initCustomMenus(com.palladium.paf.comm.CustomMenuDef[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#initCustomMenus(com.palladium.paf.comm.CustomMenuDef[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testInitCustomMenus2() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		CustomMenuDef[] var1 = new CustomMenuDef[] {};
		// jtest_tested_method
		THIS.initCustomMenus(var1);
		assertEquals(null, THIS.getAppId()); // jtest_unverified
		assertEquals(null, THIS.getCurrentYear()); // jtest_unverified
		assertEquals(null, THIS.getLastPeriod()); // jtest_unverified
		assertEquals(null, THIS.getMdbDef()); // jtest_unverified
		assertEquals(null, THIS.getMeasureFunctionFactory()); // jtest_unverified
		assertEquals(null, THIS.getMeasures()); // jtest_unverified
		assertEquals(null, THIS.getPlanCycles()); // jtest_unverified
		assertEquals(null, THIS.getSeasonList()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: initCustomMenus(com.palladium.paf.comm.CustomMenuDef[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#initCustomMenus(com.palladium.paf.comm.CustomMenuDef[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testInitCustomMenus4() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		CustomMenuDef t1 = new CustomMenuDef();
		CustomMenuDef[] var1 = new CustomMenuDef[] { t1 };
		// jtest_tested_method
		THIS.initCustomMenus(var1);
		assertEquals(t1, var1[0]); // jtest_unverified
		assertEquals(null, THIS.getAppId()); // jtest_unverified
		assertEquals(null, THIS.getCurrentYear()); // jtest_unverified
		assertEquals(null, THIS.getLastPeriod()); // jtest_unverified
		assertEquals(null, THIS.getMdbDef()); // jtest_unverified
		assertEquals(null, THIS.getMeasureFunctionFactory()); // jtest_unverified
		assertEquals(null, THIS.getMeasures()); // jtest_unverified
		assertEquals(null, THIS.getPlanCycles()); // jtest_unverified
		assertEquals(null, THIS.getSeasonList()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: initCustomMenus(com.palladium.paf.comm.CustomMenuDef[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#initCustomMenus(com.palladium.paf.comm.CustomMenuDef[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testInitCustomMenus5() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		SeasonList t1 = new SeasonList();
		MdbDef t2 = new MdbDef();
		THIS.setSeasonList(t1);
		THIS.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		THIS.setPlanCycles(var1);
		THIS.setLastPeriod("");
		THIS.setCurrentYear("");
		THIS.setMdbDef(t2);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setMeasures(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setVersions(var3);
		CustomMenuDef[] var4 = new CustomMenuDef[] { null };
		// jtest_tested_method
		THIS.initCustomMenus(var4);
		// NullPointerException thrown
		// at com.palladium.paf.app.PafApplicationDef.initCustomMenus(PafApplicationDef.java:76)
		// jtest_unverified
	}

	/**
	 * Test for method: initFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#initFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testInitFunctionFactory1() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		// jtest_tested_method
		THIS.initFunctionFactory((CustomFunctionDef[]) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.app.PafApplicationDef.initFunctionFactory([Lcom/palladium/paf/funcs/CustomFunctionDef;)V>
		// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:17)
		// at com.palladium.paf.app.PafApplicationDef.initFunctionFactory(PafApplicationDef.java:202)
		// jtest_unverified
	}

	/**
	 * Test for method: initFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#initFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testInitFunctionFactory2() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		CustomFunctionDef[] var1 = new CustomFunctionDef[] {};
		// jtest_tested_method
		THIS.initFunctionFactory(var1);
		assertEquals(null, THIS.getAppId()); // jtest_unverified
		assertEquals(null, THIS.getCurrentYear()); // jtest_unverified
		assertEquals(null, THIS.getLastPeriod()); // jtest_unverified
		assertEquals(null, THIS.getMdbDef()); // jtest_unverified
		assertNotNull(THIS.getMeasureFunctionFactory()); // jtest_unverified
		assertEquals(null, THIS.getMeasures()); // jtest_unverified
		assertEquals(null, THIS.getPlanCycles()); // jtest_unverified
		assertEquals(null, THIS.getSeasonList()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: initFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#initFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testInitFunctionFactory4() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		SeasonList t1 = new SeasonList();
		MdbDef t2 = new MdbDef();
		THIS.setSeasonList(t1);
		THIS.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		THIS.setPlanCycles(var1);
		THIS.setLastPeriod("");
		THIS.setCurrentYear("");
		THIS.setMdbDef(t2);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setMeasures(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setVersions(var3);
		CustomFunctionDef[] var4 = new CustomFunctionDef[] { null };
		// jtest_tested_method
		THIS.initFunctionFactory(var4);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:24)
		// at com.palladium.paf.app.PafApplicationDef.initFunctionFactory(PafApplicationDef.java:202)
		// jtest_unverified
	}

	/**
	 * Test for method: initFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#initFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testInitFunctionFactory5() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		SeasonList t1 = new SeasonList();
		MdbDef t2 = new MdbDef();
		CustomFunctionDef t3 = new CustomFunctionDef();
		THIS.setSeasonList(t1);
		THIS.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		THIS.setPlanCycles(var1);
		THIS.setLastPeriod("");
		THIS.setCurrentYear("");
		THIS.setMdbDef(t2);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setMeasures(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setVersions(var3);
		CustomFunctionDef[] var4 = new CustomFunctionDef[] { t3 };
		// jtest_tested_method
		THIS.initFunctionFactory(var4);
		// IllegalArgumentException thrown
		// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:24)
		// at com.palladium.paf.app.PafApplicationDef.initFunctionFactory(PafApplicationDef.java:202)
		// Caused by: java.lang.NullPointerException
		// at java.lang.Class.forName0(Native Method)
		// at java.lang.Class.forName(Class.java:164)
		// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:20)
		// jtest_unverified
	}

	/**
	 * Test for method: initFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#initFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testInitFunctionFactory7() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		SeasonList t1 = new SeasonList();
		MdbDef t2 = new MdbDef();
		CustomFunctionDef t3 = new CustomFunctionDef();
		THIS.setSeasonList(t1);
		THIS.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		THIS.setPlanCycles(var1);
		THIS.setLastPeriod("");
		THIS.setCurrentYear("");
		THIS.setMdbDef(t2);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setMeasures(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setVersions(var3);
		t3.setClassName("");
		t3.setFunctionName("");
		CustomFunctionDef[] var4 = new CustomFunctionDef[] { t3 };
		// jtest_tested_method
		THIS.initFunctionFactory(var4);
		// IllegalArgumentException thrown
		// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:24)
		// at com.palladium.paf.app.PafApplicationDef.initFunctionFactory(PafApplicationDef.java:202)
		// Caused by: java.lang.ClassNotFoundException
		// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:20)
		// jtest_unverified
	}

	/**
	 * Stubs method for testInitFunctionFactory7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsInitFunctionFactory7(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Class.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "forName", argument_types)) {
				throw new ClassNotFoundException();
				// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:20)
				// at com.palladium.paf.app.PafApplicationDef.initFunctionFactory(PafApplicationDef.java:202)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: initFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#initFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testInitFunctionFactory8() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		SeasonList t1 = new SeasonList();
		MdbDef t2 = new MdbDef();
		CustomFunctionDef t3 = new CustomFunctionDef();
		THIS.setSeasonList(t1);
		THIS.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		THIS.setPlanCycles(var1);
		THIS.setLastPeriod("");
		THIS.setCurrentYear("");
		THIS.setMdbDef(t2);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setMeasures(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setVersions(var3);
		t3.setClassName("");
		t3.setFunctionName("");
		CustomFunctionDef[] var4 = new CustomFunctionDef[] { t3 };
		// jtest_tested_method
		THIS.initFunctionFactory(var4);
		// IllegalArgumentException thrown
		// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:24)
		// at com.palladium.paf.app.PafApplicationDef.initFunctionFactory(PafApplicationDef.java:202)
		// Caused by: java.lang.ClassNotFoundException:
		// at java.lang.Class.forName0(Native Method)
		// at java.lang.Class.forName(Class.java:164)
		// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:20)
		// jtest_unverified
	}

	/**
	 * Test for method: initFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#initFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testInitFunctionFactory9() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		SeasonList t1 = new SeasonList();
		MdbDef t2 = new MdbDef();
		CustomFunctionDef t3 = new CustomFunctionDef();
		THIS.setSeasonList(t1);
		THIS.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		THIS.setPlanCycles(var1);
		THIS.setLastPeriod("");
		THIS.setCurrentYear("");
		THIS.setMdbDef(t2);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setMeasures(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setVersions(var3);
		CustomFunctionDef[] var4 = new CustomFunctionDef[] { t3 };
		// jtest_tested_method
		THIS.initFunctionFactory(var4);
		// IllegalArgumentException thrown
		// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:24)
		// at com.palladium.paf.app.PafApplicationDef.initFunctionFactory(PafApplicationDef.java:202)
		// Caused by: java.lang.ClassCastException: java.lang.Object
		// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:20)
		// jtest_unverified
	}

	/**
	 * Stubs method for testInitFunctionFactory9.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsInitFunctionFactory9(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Class.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "forName", argument_types)) {
				return java.lang.Object.class;
				// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:20)
				// at com.palladium.paf.app.PafApplicationDef.initFunctionFactory(PafApplicationDef.java:202)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: initMeasures(com.palladium.paf.app.MeasureDef[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#initMeasures(com.palladium.paf.app.MeasureDef[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testInitMeasures1() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		// jtest_tested_method
		THIS.initMeasures((MeasureDef[]) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.app.PafApplicationDef.initMeasures([Lcom/palladium/paf/app/MeasureDef;)V>
		// at com.palladium.paf.app.PafApplicationDef.initMeasures(PafApplicationDef.java:67)
		// jtest_unverified
	}

	/**
	 * Test for method: initMeasures(com.palladium.paf.app.MeasureDef[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#initMeasures(com.palladium.paf.app.MeasureDef[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testInitMeasures2() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		MeasureDef[] var1 = new MeasureDef[] {};
		// jtest_tested_method
		THIS.initMeasures(var1);
		assertEquals(null, THIS.getAppId()); // jtest_unverified
		assertEquals(null, THIS.getCurrentYear()); // jtest_unverified
		assertEquals(null, THIS.getLastPeriod()); // jtest_unverified
		assertEquals(null, THIS.getMdbDef()); // jtest_unverified
		assertEquals(null, THIS.getMeasureFunctionFactory()); // jtest_unverified
		assertNotNull(THIS.getMeasures()); // jtest_unverified
		assertEquals("{}", THIS.getMeasures().toString()); // jtest_unverified
		assertEquals(null, THIS.getPlanCycles()); // jtest_unverified
		assertEquals(null, THIS.getSeasonList()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: initMeasures(com.palladium.paf.app.MeasureDef[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#initMeasures(com.palladium.paf.app.MeasureDef[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testInitMeasures4() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		MeasureDef t1 = new MeasureDef((String) null, (MeasureType) null);
		MeasureDef[] var1 = new MeasureDef[] { t1 };
		// jtest_tested_method
		THIS.initMeasures(var1);
		assertEquals(t1, var1[0]); // jtest_unverified
		assertEquals(null, THIS.getAppId()); // jtest_unverified
		assertEquals(null, THIS.getCurrentYear()); // jtest_unverified
		assertEquals(null, THIS.getLastPeriod()); // jtest_unverified
		assertEquals(null, THIS.getMdbDef()); // jtest_unverified
		assertEquals(null, THIS.getMeasureFunctionFactory()); // jtest_unverified
		assertNotNull(THIS.getMeasures()); // jtest_unverified
		assertEquals(null, THIS.getPlanCycles()); // jtest_unverified
		assertEquals(null, THIS.getSeasonList()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: initMeasures(com.palladium.paf.app.MeasureDef[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#initMeasures(com.palladium.paf.app.MeasureDef[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testInitMeasures5() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		SeasonList t1 = new SeasonList();
		MdbDef t2 = new MdbDef();
		THIS.setSeasonList(t1);
		THIS.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		THIS.setPlanCycles(var1);
		THIS.setLastPeriod("");
		THIS.setCurrentYear("");
		THIS.setMdbDef(t2);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setMeasures(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setVersions(var3);
		MeasureDef[] var4 = new MeasureDef[] { null };
		// jtest_tested_method
		THIS.initMeasures(var4);
		// NullPointerException thrown
		// at com.palladium.paf.app.PafApplicationDef.initMeasures(PafApplicationDef.java:68)
		// jtest_unverified
	}

	/**
	 * Test for method: initVersions(com.palladium.paf.app.VersionDef[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#initVersions(com.palladium.paf.app.VersionDef[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testInitVersions1() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		// jtest_tested_method
		THIS.initVersions((VersionDef[]) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.app.PafApplicationDef.initVersions([Lcom/palladium/paf/app/VersionDef;)V>
		// at com.palladium.paf.app.PafApplicationDef.initVersions(PafApplicationDef.java:61)
		// jtest_unverified
	}

	/**
	 * Test for method: initVersions(com.palladium.paf.app.VersionDef[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#initVersions(com.palladium.paf.app.VersionDef[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testInitVersions2() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		VersionDef[] var1 = new VersionDef[] {};
		// jtest_tested_method
		THIS.initVersions(var1);
		assertEquals(null, THIS.getAppId()); // jtest_unverified
		assertEquals(null, THIS.getCurrentYear()); // jtest_unverified
		assertEquals(null, THIS.getLastPeriod()); // jtest_unverified
		assertEquals(null, THIS.getMdbDef()); // jtest_unverified
		assertEquals(null, THIS.getMeasureFunctionFactory()); // jtest_unverified
		assertEquals(null, THIS.getMeasures()); // jtest_unverified
		assertEquals(null, THIS.getPlanCycles()); // jtest_unverified
		assertEquals(null, THIS.getSeasonList()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: initVersions(com.palladium.paf.app.VersionDef[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#initVersions(com.palladium.paf.app.VersionDef[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testInitVersions4() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		VersionDef t1 = new VersionDef((String) null, (VersionType) null);
		VersionDef[] var1 = new VersionDef[] { t1 };
		// jtest_tested_method
		THIS.initVersions(var1);
		assertEquals(t1, var1[0]); // jtest_unverified
		assertEquals(null, THIS.getAppId()); // jtest_unverified
		assertEquals(null, THIS.getCurrentYear()); // jtest_unverified
		assertEquals(null, THIS.getLastPeriod()); // jtest_unverified
		assertEquals(null, THIS.getMdbDef()); // jtest_unverified
		assertEquals(null, THIS.getMeasureFunctionFactory()); // jtest_unverified
		assertEquals(null, THIS.getMeasures()); // jtest_unverified
		assertEquals(null, THIS.getPlanCycles()); // jtest_unverified
		assertEquals(null, THIS.getSeasonList()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: initVersions(com.palladium.paf.app.VersionDef[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#initVersions(com.palladium.paf.app.VersionDef[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testInitVersions5() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		SeasonList t1 = new SeasonList();
		MdbDef t2 = new MdbDef();
		THIS.setSeasonList(t1);
		THIS.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		THIS.setPlanCycles(var1);
		THIS.setLastPeriod("");
		THIS.setCurrentYear("");
		THIS.setMdbDef(t2);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setMeasures(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setVersions(var3);
		VersionDef[] var4 = new VersionDef[] { null };
		// jtest_tested_method
		THIS.initVersions(var4);
		// NullPointerException thrown
		// at com.palladium.paf.app.PafApplicationDef.initVersions(PafApplicationDef.java:62)
		// jtest_unverified
	}

	/**
	 * Test for method: isFunction(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#isFunction(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsFunction1() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		// jtest_tested_method
		boolean RETVAL = THIS.isFunction((String) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.app.PafApplicationDef.isFunction(Ljava/lang/String;)Z>
		// at com.palladium.paf.app.PafApplicationDef.isFunction(PafApplicationDef.java:217)
		// jtest_unverified
	}

	/**
	 * Test for method: isFunction(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#isFunction(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsFunction2() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		// jtest_tested_method
		boolean RETVAL = THIS.isFunction("");
		// NullPointerException thrown
		// at com.palladium.paf.app.PafApplicationDef.isFunction(PafApplicationDef.java:218)
		// jtest_unverified
	}

	/**
	 * Test for method: setAppId(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#setAppId(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetAppId1() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		// jtest_tested_method
		THIS.setAppId("");
		assertEquals("", THIS.getAppId()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setCurrentYear(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#setCurrentYear(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetCurrentYear1() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		// jtest_tested_method
		THIS.setCurrentYear("");
		assertEquals("", THIS.getCurrentYear()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setLastPeriod(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#setLastPeriod(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetLastPeriod1() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		// jtest_tested_method
		THIS.setLastPeriod("");
		assertEquals("", THIS.getLastPeriod()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setMdbDef(com.palladium.paf.app.MdbDef)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#setMdbDef(com.palladium.paf.app.MdbDef)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetMdbDef1() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		MdbDef t1 = new MdbDef();
		// jtest_tested_method
		THIS.setMdbDef(t1);
		assertEquals(t1, THIS.getMdbDef()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setMeasures(java.util.Map)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#setMeasures(java.util.Map)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetMeasures1() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		// jtest_tested_method
		THIS.setMeasures(var1);
		assertEquals(var1, THIS.getMeasures()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setPlanCycles(com.palladium.paf.app.PlanCycle[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#setPlanCycles(com.palladium.paf.app.PlanCycle[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetPlanCycles1() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		PlanCycle[] var1 = new PlanCycle[] {};
		// jtest_tested_method
		THIS.setPlanCycles(var1);
		assertSame(var1, THIS.getPlanCycles()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setSeasonList(com.palladium.paf.app.SeasonList)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#setSeasonList(com.palladium.paf.app.SeasonList)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetSeasonList1() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		SeasonList t1 = new SeasonList();
		// jtest_tested_method
		THIS.setSeasonList(t1);
		assertEquals(t1, THIS.getSeasonList()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setVersions(java.util.Map)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafApplicationDef#setVersions(java.util.Map)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetVersions1() throws Throwable {
		PafApplicationDef THIS = new PafApplicationDef();
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		// jtest_tested_method
		THIS.setVersions(var1);
		assertEquals(var1, THIS.getVersions()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.app.PafApplicationDefTest
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
			PafApplicationDefTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.app.PafApplicationDef",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafApplicationDef.class;
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
private VersionDef _f0;
																								}

// JTEST_CURRENT_ID=-1102991408.