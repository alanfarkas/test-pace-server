/*
 * IntersectionUtilTest.java
 * Created by Jtest on 9/19/06 5:26:52 PM.
 * Updated by Jtest on 10/18/06 7:24:50 PM, 12 test cases added, 12 test cases removed.
 * Updated by Jtest on 11/9/06 3:11:18 AM, 12 test cases added, 12 test cases removed.
 */

package com.palladium.paf.data;

import com.palladium.paf.app.PafDimSpec;
import com.palladium.paf.app.PlanCycle;
import java.util.Set;
import com.palladium.paf.app.MdbDef;
import com.palladium.paf.app.SeasonList;
import com.palladium.paf.comm.PafPlannerConfig;
import com.palladium.paf.app.Season;
import com.palladium.paf.app.PafPlannerRole;
import com.palladium.paf.app.UnitOfWork;
import com.palladium.paf.PafSecurityToken;
import com.palladium.paf.app.PafApplicationDef;
import com.palladium.paf.state.PafClientState;
import com.palladium.paf.comm.ClientInitRequest;
import com.palladium.paf.state.IPafEvalState;
import java.util.List;
import java.util.Collection;
import java.lang.reflect.Member;
import jtest.Stubs;
import java.util.Map;
import java.util.ArrayList;
import com.palladium.paf.data.IntersectionUtil;

/**
 * IntersectionUtilTest is a unit test class for class IntersectionUtil.
 * @see com.palladium.paf.data.IntersectionUtil
 * @author Parasoft Jtest 8.0
 */
public class IntersectionUtilTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public IntersectionUtilTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: static buildFloorIntersections(com.palladium.paf.data.Intersection,com.palladium.paf.state.IPafEvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see IntersectionUtil#buildFloorIntersections(com.palladium.paf.data.Intersection,com.palladium.paf.state.IPafEvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testBuildFloorIntersections1() throws Throwable {
		// jtest_tested_method
		List RETVAL = IntersectionUtil.buildFloorIntersections(
			(Intersection) null,
			(IPafEvalState) null);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.data.IntersectionUtil.buildFloorIntersections(Lcom/palladium/paf/data/Intersection;Lcom/palladium/paf/state/IPafEvalState;)Ljava/util/List;>
		// at com.palladium.paf.data.IntersectionUtil.buildFloorIntersections(IntersectionUtil.java:74)
		// jtest_unverified
	}

	/**
	 * Test for method: static buildFloorIntersections(com.palladium.paf.data.Intersection,com.palladium.paf.state.IPafEvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see IntersectionUtil#buildFloorIntersections(com.palladium.paf.data.Intersection,com.palladium.paf.state.IPafEvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testBuildFloorIntersections3() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		_f0 = new PafClientState((String) null, t0);
		IPafEvalState var1 = (IPafEvalState) Stubs
			.makeStubObject(IPafEvalState.class);
		// jtest_tested_method
		List RETVAL = IntersectionUtil.buildFloorIntersections(
			(Intersection) null,
			var1);
		// NullPointerException thrown
		// at com.palladium.paf.data.IntersectionUtil.buildFloorIntersections(IntersectionUtil.java:75)
		// jtest_unverified
	}

	/**
	 * Stubs method for testBuildFloorIntersections3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsBuildFloorIntersections3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, IPafEvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientState", argument_types)) {
				return _f0;
				// at com.palladium.paf.data.IntersectionUtil.buildFloorIntersections(IntersectionUtil.java:74)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return null;
				// at com.palladium.paf.data.IntersectionUtil.buildFloorIntersections(IntersectionUtil.java:75)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static buildFloorIntersections(com.palladium.paf.data.Intersection,com.palladium.paf.state.IPafEvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see IntersectionUtil#buildFloorIntersections(com.palladium.paf.data.Intersection,com.palladium.paf.state.IPafEvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testBuildFloorIntersections5() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		_f0 = new PafClientState((String) null, t0);
		MemberTreeSet t2 = new MemberTreeSet();
		PafSecurityToken t3 = new PafSecurityToken(
			(String) null,
			(String) null,
			false);
		PafApplicationDef t4 = new PafApplicationDef();
		String[] var1 = new String[] {};
		String[][] var2 = new String[][] { {} };
		UnitOfWork t5 = new UnitOfWork(var1, var2);
		PafPlannerRole t6 = new PafPlannerRole();
		Season t7 = new Season();
		PafPlannerConfig t8 = new PafPlannerConfig();
		_f1 = new PafApplicationDef();
		SeasonList t10 = new SeasonList();
		MdbDef t11 = new MdbDef();
		t0.setClientType("");
		t0.setClientVersion("");
		t0.setIpAddress("");
		t0.setClientLanguage("");
		_f0.setUowTrees(t2);
		_f0.setSecurityToken(t3);
		_f0.setApp(t4);
		_f0.setUnitOfWork(t5);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setRuleSets(var3);
		Set var4 = (Set) Stubs.makeStubObject(Set.class);
		_f0.setLockedPeriods(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setLockedForwardPlannableInterMap(var5);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setLockedNotPlannableInterMap(var6);
		_f0.setPlannerRole(t6);
		_f0.setPlanSeason(t7);
		_f0.setClientLanguage("");
		Map var7 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setUserSelections(var7);
		Set var8 = (Set) Stubs.makeStubObject(Set.class);
		_f0.setActiveVersions(var8);
		_f0.setPlannerConfig(t8);
		_f1.setSeasonList(t10);
		_f1.setAppId("");
		PlanCycle[] var9 = new PlanCycle[] {};
		_f1.setPlanCycles(var9);
		_f1.setLastPeriod("");
		_f1.setCurrentYear("");
		_f1.setMdbDef(t11);
		Map var10 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setMeasures(var10);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setVersions(var11);
		IPafEvalState var12 = (IPafEvalState) Stubs
			.makeStubObject(IPafEvalState.class);
		// jtest_tested_method
		List RETVAL = IntersectionUtil.buildFloorIntersections(
			(Intersection) null,
			var12);
		// NullPointerException thrown
		// at com.palladium.paf.data.IntersectionUtil.buildFloorIntersections(IntersectionUtil.java:76)
		// jtest_unverified
	}

	/**
	 * Stubs method for testBuildFloorIntersections5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsBuildFloorIntersections5(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, IPafEvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientState", argument_types)) {
				return _f0;
				// at com.palladium.paf.data.IntersectionUtil.buildFloorIntersections(IntersectionUtil.java:74)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.IPafEvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.data.IntersectionUtil.buildFloorIntersections(IntersectionUtil.java:75)
					case 2 :
						return null;
					// at com.palladium.paf.data.IntersectionUtil.buildFloorIntersections(IntersectionUtil.java:76)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static buildFloorIntersections(com.palladium.paf.data.Intersection,com.palladium.paf.state.IPafEvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see IntersectionUtil#buildFloorIntersections(com.palladium.paf.data.Intersection,com.palladium.paf.state.IPafEvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testBuildFloorIntersections7() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		_f0 = new PafClientState((String) null, t0);
		MemberTreeSet t2 = new MemberTreeSet();
		PafSecurityToken t3 = new PafSecurityToken();
		PafApplicationDef t4 = new PafApplicationDef();
		SeasonList t5 = new SeasonList();
		MdbDef t6 = new MdbDef();
		PafSimpleUow t7 = new PafSimpleUow();
		UnitOfWork t8 = new UnitOfWork(t7);
		PafPlannerRole t9 = new PafPlannerRole();
		Season t10 = new Season();
		PafPlannerConfig t11 = new PafPlannerConfig();
		_f1 = new PafApplicationDef();
		t0.setClientType("");
		t0.setClientVersion("");
		t0.setIpAddress("");
		t0.setClientLanguage("");
		_f0.setUowTrees(t2);
		_f0.setSecurityToken(t3);
		t4.setSeasonList(t5);
		t4.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		t4.setPlanCycles(var1);
		t4.setLastPeriod("");
		t4.setCurrentYear("");
		t4.setMdbDef(t6);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		t4.setMeasures(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		t4.setVersions(var3);
		_f0.setApp(t4);
		PafMemberList[] var4 = new PafMemberList[] {};
		t7.setPafMemberEntries(var4);
		_f0.setUnitOfWork(t8);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setRuleSets(var5);
		Set var6 = (Set) Stubs.makeStubObject(Set.class);
		_f0.setLockedPeriods(var6);
		Map var7 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setLockedForwardPlannableInterMap(var7);
		Map var8 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setLockedNotPlannableInterMap(var8);
		t9.setRoleDesc("");
		t9.setRoleName("");
		t9.setPlanType("");
		t9.setPlanVersion("");
		String[] var9 = new String[] {};
		t9.setSeasonIds(var9);
		_f0.setPlannerRole(t9);
		t10.setOpen(false);
		PafDimSpec[] var10 = new PafDimSpec[] {};
		t10.setOtherDims(var10);
		t10.setYear("");
		t10.setId("");
		t10.setTimePeriod("");
		t10.setPlanCycle("");
		_f0.setPlanSeason(t10);
		_f0.setClientLanguage("");
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setUserSelections(var11);
		Set var12 = (Set) Stubs.makeStubObject(Set.class);
		_f0.setActiveVersions(var12);
		t11.setCycle("");
		String[] var13 = new String[] {};
		t11.setMenuItemNames(var13);
		t11.setRole("");
		String[] var14 = new String[] {};
		t11.setViewTreeItemNames(var14);
		t11.setDefaultEvalEnabled(false);
		t11.setDefaultRulesetName("");
		String[] var15 = new String[] {};
		t11.setRuleSetNames(var15);
		String[] var16 = new String[] {};
		t11.setVersionFilter(var16);
		_f0.setPlannerConfig(t11);
		IPafEvalState var17 = (IPafEvalState) Stubs
			.makeStubObject(IPafEvalState.class);
		// jtest_tested_method
		List RETVAL = IntersectionUtil.buildFloorIntersections(
			(Intersection) null,
			var17);
		// NullPointerException thrown
		// at com.palladium.paf.app.UnitOfWork.<init>(UnitOfWork.java:41)
		// jtest_unverified
	}

	/**
	 * Stubs method for testBuildFloorIntersections7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsBuildFloorIntersections7(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, IPafEvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientState", argument_types)) {
				return _f0;
				// at com.palladium.paf.data.IntersectionUtil.buildFloorIntersections(IntersectionUtil.java:74)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f1;
				// at com.palladium.paf.data.IntersectionUtil.buildFloorIntersections(IntersectionUtil.java:75)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static buildFloorIntersections(com.palladium.paf.data.Intersection,com.palladium.paf.state.IPafEvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see IntersectionUtil#buildFloorIntersections(com.palladium.paf.data.Intersection,com.palladium.paf.state.IPafEvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testBuildFloorIntersections8() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		_f0 = new PafClientState((String) null, t0);
		MemberTreeSet t2 = new MemberTreeSet();
		PafSecurityToken t3 = new PafSecurityToken(
			(String) null,
			(String) null,
			false);
		Boolean t4 = new Boolean(false);
		PafApplicationDef t5 = new PafApplicationDef();
		SeasonList t6 = new SeasonList();
		MdbDef t7 = new MdbDef();
		String[] var1 = new String[] { "", null };
		String[][] var2 = new String[][] { { null, null }, null };
		UnitOfWork t8 = new UnitOfWork(var1, var2);
		PafPlannerRole t9 = new PafPlannerRole();
		Season t10 = new Season();
		PafPlannerConfig t11 = new PafPlannerConfig();
		_f1 = new PafApplicationDef();
		_f2 = new MdbDef();
		_f3 = new PafApplicationDef();
		SeasonList t15 = new SeasonList();
		MdbDef t16 = new MdbDef();
		_f4 = new MdbDef();
		Intersection t18 = new Intersection((String[]) null, (String[]) null);
		t0.setClientType("");
		t0.setClientVersion("");
		t0.setIpAddress("");
		t0.setClientLanguage("0");
		_f0.setUowTrees(t2);
		t3.setUserName("");
		t3.setValid(false);
		t3.setSessionToken("");
		t3.setAdmin(t4);
		_f0.setSecurityToken(t3);
		t5.setSeasonList(t6);
		t5.setAppId("");
		PlanCycle[] var3 = new PlanCycle[] {};
		t5.setPlanCycles(var3);
		t5.setLastPeriod("");
		t5.setCurrentYear("");
		t7.setYearDim("");
		String[] var4 = new String[] {};
		t7.setHierDims(var4);
		t7.setMeasureDim("");
		t7.setPlanTypeDim("");
		t7.setTimeDim("");
		t7.setVersionDim("");
		t7.setDataSourceId("");
		String[] var5 = new String[] {};
		t7.setAxisPriority(var5);
		t5.setMdbDef(t7);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		t5.setMeasures(var6);
		Map var7 = (Map) Stubs.makeStubObject(Map.class);
		t5.setVersions(var7);
		_f0.setApp(t5);
		_f0.setUnitOfWork(t8);
		Map var8 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setRuleSets(var8);
		Set var9 = (Set) Stubs.makeStubObject(Set.class);
		_f0.setLockedPeriods(var9);
		Map var10 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setLockedForwardPlannableInterMap(var10);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setLockedNotPlannableInterMap(var11);
		_f0.setPlannerRole(t9);
		_f0.setPlanSeason(t10);
		_f0.setClientLanguage("");
		Map var12 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setUserSelections(var12);
		Set var13 = (Set) Stubs.makeStubObject(Set.class);
		_f0.setActiveVersions(var13);
		_f0.setPlannerConfig(t11);
		_f3.setSeasonList(t15);
		_f3.setAppId("");
		PlanCycle[] var14 = new PlanCycle[] {};
		_f3.setPlanCycles(var14);
		_f3.setLastPeriod("");
		_f3.setCurrentYear("");
		_f3.setMdbDef(t16);
		Map var15 = (Map) Stubs.makeStubObject(Map.class);
		_f3.setMeasures(var15);
		Map var16 = (Map) Stubs.makeStubObject(Map.class);
		_f3.setVersions(var16);
		_f4.setYearDim("");
		String[] var17 = new String[] {};
		_f4.setHierDims(var17);
		_f4.setMeasureDim("");
		_f4.setPlanTypeDim("");
		_f4.setTimeDim("");
		_f4.setVersionDim("");
		_f4.setDataSourceId("");
		String[] var18 = new String[] {};
		_f4.setAxisPriority(var18);
		IPafEvalState var19 = (IPafEvalState) Stubs
			.makeStubObject(IPafEvalState.class);
		// jtest_tested_method
		List RETVAL = IntersectionUtil.buildFloorIntersections(t18, var19);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.data.Intersection.<init>([Ljava/lang/String;[Ljava/lang/String;)V>
		// at com.palladium.paf.data.Intersection.getCoordinate(Intersection.java:66)
		// at com.palladium.paf.data.IntersectionUtil.buildFloorIntersections(IntersectionUtil.java:84)
		// jtest_unverified
	}

	/**
	 * Stubs method for testBuildFloorIntersections8.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsBuildFloorIntersections8(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, IPafEvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientState", argument_types)) {
				return _f0;
				// at com.palladium.paf.data.IntersectionUtil.buildFloorIntersections(IntersectionUtil.java:74)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.IPafEvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.data.IntersectionUtil.buildFloorIntersections(IntersectionUtil.java:75)
					case 2 :
						return _f3;
					// at com.palladium.paf.data.IntersectionUtil.buildFloorIntersections(IntersectionUtil.java:76)
					case 3 :
						return null;
					// at com.palladium.paf.data.IntersectionUtil.buildFloorIntersections(IntersectionUtil.java:84)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f2;
					// at com.palladium.paf.data.IntersectionUtil.buildFloorIntersections(IntersectionUtil.java:75)
					case 2 :
						return _f4;
					// at com.palladium.paf.data.IntersectionUtil.buildFloorIntersections(IntersectionUtil.java:76)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static buildFloorIntersections(com.palladium.paf.data.Intersection,com.palladium.paf.state.IPafEvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see IntersectionUtil#buildFloorIntersections(com.palladium.paf.data.Intersection,com.palladium.paf.state.IPafEvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testBuildFloorIntersections10() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		_f0 = new PafClientState((String) null, t0);
		MemberTreeSet t2 = new MemberTreeSet();
		PafSecurityToken t3 = new PafSecurityToken(
			(String) null,
			(String) null,
			false);
		PafApplicationDef t4 = new PafApplicationDef();
		SeasonList t5 = new SeasonList();
		MdbDef t6 = new MdbDef();
		String[] var1 = new String[] {};
		UnitOfWork t7 = new UnitOfWork(var1);
		PafPlannerRole t8 = new PafPlannerRole();
		Season t9 = new Season();
		PafPlannerConfig t10 = new PafPlannerConfig();
		_f1 = new PafApplicationDef();
		SeasonList t12 = new SeasonList();
		MdbDef t13 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new PafApplicationDef();
		_f4 = new MdbDef();
		String[] var2 = new String[] {};
		Intersection t17 = new Intersection(var2, (String[]) null);
		t0.setClientType("");
		t0.setClientVersion("");
		t0.setIpAddress("");
		t0.setClientLanguage("0");
		_f0.setUowTrees(t2);
		_f0.setSecurityToken(t3);
		t4.setSeasonList(t5);
		t4.setAppId("");
		PlanCycle[] var3 = new PlanCycle[] {};
		t4.setPlanCycles(var3);
		t4.setLastPeriod("");
		t4.setCurrentYear("");
		t6.setYearDim("");
		String[] var4 = new String[] {};
		t6.setHierDims(var4);
		t6.setMeasureDim("");
		t6.setPlanTypeDim("");
		t6.setTimeDim("");
		t6.setVersionDim("");
		t6.setDataSourceId("");
		String[] var5 = new String[] {};
		t6.setAxisPriority(var5);
		t4.setMdbDef(t6);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		t4.setMeasures(var6);
		Map var7 = (Map) Stubs.makeStubObject(Map.class);
		t4.setVersions(var7);
		_f0.setApp(t4);
		_f0.setUnitOfWork(t7);
		Map var8 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setRuleSets(var8);
		Set var9 = (Set) Stubs.makeStubObject(Set.class);
		_f0.setLockedPeriods(var9);
		Map var10 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setLockedForwardPlannableInterMap(var10);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setLockedNotPlannableInterMap(var11);
		_f0.setPlannerRole(t8);
		_f0.setPlanSeason(t9);
		_f0.setClientLanguage("");
		Map var12 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setUserSelections(var12);
		Set var13 = (Set) Stubs.makeStubObject(Set.class);
		_f0.setActiveVersions(var13);
		_f0.setPlannerConfig(t10);
		_f1.setSeasonList(t12);
		_f1.setAppId("");
		PlanCycle[] var14 = new PlanCycle[] {};
		_f1.setPlanCycles(var14);
		_f1.setLastPeriod("");
		_f1.setCurrentYear("");
		_f1.setMdbDef(t13);
		Map var15 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setMeasures(var15);
		Map var16 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setVersions(var16);
		_f4.setYearDim("");
		String[] var17 = new String[] {};
		_f4.setHierDims(var17);
		_f4.setMeasureDim("");
		_f4.setPlanTypeDim("");
		_f4.setTimeDim("");
		_f4.setVersionDim("");
		_f4.setDataSourceId("");
		String[] var18 = new String[] {};
		_f4.setAxisPriority(var18);
		IPafEvalState var19 = (IPafEvalState) Stubs
			.makeStubObject(IPafEvalState.class);
		// jtest_tested_method
		List RETVAL = IntersectionUtil.buildFloorIntersections(t17, var19);
		// NullPointerException thrown
		// at com.palladium.paf.data.IntersectionUtil.buildFloorIntersections(IntersectionUtil.java:84)
		// jtest_unverified
	}

	/**
	 * Stubs method for testBuildFloorIntersections10.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsBuildFloorIntersections10(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, IPafEvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientState", argument_types)) {
				return _f0;
				// at com.palladium.paf.data.IntersectionUtil.buildFloorIntersections(IntersectionUtil.java:74)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.IPafEvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.data.IntersectionUtil.buildFloorIntersections(IntersectionUtil.java:75)
					case 2 :
						return _f3;
					// at com.palladium.paf.data.IntersectionUtil.buildFloorIntersections(IntersectionUtil.java:76)
					case 3 :
						return null;
					// at com.palladium.paf.data.IntersectionUtil.buildFloorIntersections(IntersectionUtil.java:84)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f2;
					// at com.palladium.paf.data.IntersectionUtil.buildFloorIntersections(IntersectionUtil.java:75)
					case 2 :
						return _f4;
					// at com.palladium.paf.data.IntersectionUtil.buildFloorIntersections(IntersectionUtil.java:76)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static buildIntersections(java.util.Map,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see IntersectionUtil#buildIntersections(java.util.Map,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testBuildIntersections1() throws Throwable {
		// jtest_tested_method
		ArrayList RETVAL = IntersectionUtil.buildIntersections(
			(Map) null,
			(String[]) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.data.IntersectionUtil.buildIntersections(Ljava/util/Map;[Ljava/lang/String;)Ljava/util/ArrayList;>
		// at com.palladium.paf.data.IntersectionUtil.buildIntersections(IntersectionUtil.java:45)
		// jtest_unverified
	}

	/**
	 * Test for method: static buildIntersections(java.util.Map,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see IntersectionUtil#buildIntersections(java.util.Map,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testBuildIntersections2() throws Throwable {
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		// jtest_tested_method
		ArrayList RETVAL = IntersectionUtil.buildIntersections(
			var1,
			(String[]) null);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.data.IntersectionUtil.buildIntersections(Ljava/util/Map;[Ljava/lang/String;)Ljava/util/ArrayList;>
		// at com.palladium.paf.data.IntersectionUtil.buildIntersections(IntersectionUtil.java:48)
		// jtest_unverified
	}

	/**
	 * Stubs method for testBuildIntersections2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsBuildIntersections2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.data.IntersectionUtil.buildIntersections(IntersectionUtil.java:45)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static buildIntersections(java.util.Map,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see IntersectionUtil#buildIntersections(java.util.Map,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testBuildIntersections3() throws Throwable {
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		String[] var2 = new String[] {};
		// jtest_tested_method
		ArrayList RETVAL = IntersectionUtil.buildIntersections(var1, var2);
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.utility.Odometer.<init>(Odometer.java:47)
		// at com.palladium.paf.data.IntersectionUtil.buildIntersections(IntersectionUtil.java:60)
		// jtest_unverified
	}

	/**
	 * Stubs method for testBuildIntersections3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsBuildIntersections3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.data.IntersectionUtil.buildIntersections(IntersectionUtil.java:45)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static buildIntersections(java.util.Map,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see IntersectionUtil#buildIntersections(java.util.Map,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testBuildIntersections4() throws Throwable {
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		String[] var2 = new String[] { null };
		// jtest_tested_method
		ArrayList RETVAL = IntersectionUtil.buildIntersections(var1, var2);
		// ClassCastException thrown
		// at com.palladium.paf.data.IntersectionUtil.buildIntersections(IntersectionUtil.java:49)
		// jtest_unverified
	}

	/**
	 * Stubs method for testBuildIntersections4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsBuildIntersections4(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.data.IntersectionUtil.buildIntersections(IntersectionUtil.java:45)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.data.IntersectionUtil.buildIntersections(IntersectionUtil.java:49)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static buildIntersections(java.util.Map,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see IntersectionUtil#buildIntersections(java.util.Map,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testBuildIntersections5() throws Throwable {
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		String[] var2 = new String[] { null };
		// jtest_tested_method
		ArrayList RETVAL = IntersectionUtil.buildIntersections(var1, var2);
		// NullPointerException thrown
		// at java.util.ArrayList.<init>(ArrayList.java:133)
		// at com.palladium.paf.data.IntersectionUtil.buildIntersections(IntersectionUtil.java:49)
		// jtest_unverified
	}

	/**
	 * Stubs method for testBuildIntersections5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsBuildIntersections5(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.data.IntersectionUtil.buildIntersections(IntersectionUtil.java:45)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
				// at com.palladium.paf.data.IntersectionUtil.buildIntersections(IntersectionUtil.java:49)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static buildIntersections(java.util.Map,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see IntersectionUtil#buildIntersections(java.util.Map,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testBuildIntersections6() throws Throwable {
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		String[] var2 = new String[] { null };
		// jtest_tested_method
		ArrayList RETVAL = IntersectionUtil.buildIntersections(var1, var2);
		// ClassCastException thrown
		// at $Proxy11.toArray(Unknown Source)
		// at java.util.ArrayList.<init>(ArrayList.java:137)
		// at com.palladium.paf.data.IntersectionUtil.buildIntersections(IntersectionUtil.java:49)
		// jtest_unverified
	}

	/**
	 * Stubs method for testBuildIntersections6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsBuildIntersections6(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.data.IntersectionUtil.buildIntersections(IntersectionUtil.java:45)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return Stubs.makeStubObject(Collection.class);
				// at com.palladium.paf.data.IntersectionUtil.buildIntersections(IntersectionUtil.java:49)
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
	 * Usage: java com.palladium.paf.data.IntersectionUtilTest
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
			IntersectionUtilTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.data.IntersectionUtil",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return IntersectionUtil.class;
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
private PafClientState _f0;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafApplicationDef _f1;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private MdbDef _f2;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafApplicationDef _f3;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private MdbDef _f4;
			}

// JTEST_CURRENT_ID=-121414017.