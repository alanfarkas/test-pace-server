/*
 * EvalUtilTest.java
 * Created by Jtest on 9/19/06 5:37:19 PM.
 * Updated by Jtest on 10/18/06 6:32:30 PM, 50 test cases added, 42 test cases removed.
 * Updated by Jtest on 11/9/06 1:22:21 AM, 47 test cases added, 47 test cases removed.
 */

package com.palladium.paf.eval;

import java.util.Properties;
import java.sql.DriverManager;
import java.util.Arrays;
import com.palladium.paf.server.PafAppService;
import com.palladium.paf.server.PafMetaData;
import com.palladium.paf.app.PlanCycle;
import com.palladium.paf.app.MdbDef;
import com.palladium.paf.app.SeasonList;
import java.util.HashSet;
import com.palladium.paf.rules.RuleSet;
import com.palladium.paf.rules.RuleGroup;
import com.palladium.paf.comm.PafPlannerConfig;
import com.palladium.paf.app.Season;
import com.palladium.paf.app.PafPlannerRole;
import com.palladium.paf.app.UnitOfWork;
import com.palladium.paf.PafSecurityToken;
import com.palladium.paf.data.MemberTreeSet;
import java.util.Collection;
import java.util.ArrayList;
import jtest.JT;
import java.util.Iterator;
import java.util.Map;
import com.palladium.paf.PafException;
import com.palladium.paf.funcs.CustomFunctionDef;
import com.palladium.paf.app.MeasureFunctionFactory;
import com.palladium.paf.mdb.PafDataCache;
import com.palladium.paf.rules.Formula;
import com.palladium.paf.rules.Rule;
import java.util.Set;
import com.palladium.paf.app.PafApplicationDef;
import jtest.mocks.java.util.ListMock;
import java.sql.SQLException;
import org.hibernate.connection.DriverManagerConnectionProvider;
import java.sql.Connection;
import com.palladium.paf.SortOrder;
import com.palladium.paf.state.SliceState;
import com.palladium.paf.state.PafClientState;
import com.palladium.paf.comm.ClientInitRequest;
import java.lang.reflect.Member;
import jtest.Stubs;
import java.util.List;
import com.palladium.paf.state.EvalState;
import com.palladium.paf.funcs.IPafFunction;
import com.palladium.paf.data.Intersection;
import com.palladium.paf.eval.EvalUtil;

/**
 * EvalUtilTest is a unit test class for class EvalUtil.
 * @see com.palladium.paf.eval.EvalUtil
 * @author Parasoft Jtest 8.0
 */
public class EvalUtilTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public EvalUtilTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }

	/**
	 * Test for method: static buildFloorIntersections(com.palladium.paf.data.Intersection,com.palladium.paf.state.EvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#buildFloorIntersections(com.palladium.paf.data.Intersection,com.palladium.paf.state.EvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testBuildFloorIntersections1() throws Throwable {
		// jtest_tested_method
		List RETVAL = EvalUtil.buildFloorIntersections(
			(Intersection) null,
			(EvalState) null);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.eval.EvalUtil.buildFloorIntersections(Lcom/palladium/paf/data/Intersection;Lcom/palladium/paf/state/EvalState;)Ljava/util/List;>
		// at com.palladium.paf.eval.EvalUtil.buildFloorIntersections(EvalUtil.java:374)
		// jtest_unverified
	}

	/**
	 * Test for method: static buildFloorIntersections(com.palladium.paf.data.Intersection,com.palladium.paf.state.EvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#buildFloorIntersections(com.palladium.paf.data.Intersection,com.palladium.paf.state.EvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testBuildFloorIntersections3() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		EvalState t2 = new EvalState((SliceState) null, t1);
		ClientInitRequest t3 = new ClientInitRequest();
		_f0 = new PafClientState((String) null, t3);
		MemberTreeSet t5 = new MemberTreeSet();
		PafSecurityToken t6 = new PafSecurityToken();
		PafApplicationDef t7 = new PafApplicationDef();
		String[] var1 = new String[] {};
		String[][] var2 = new String[][] { {} };
		UnitOfWork t8 = new UnitOfWork(var1, var2);
		PafPlannerRole t9 = new PafPlannerRole();
		Season t10 = new Season();
		PafPlannerConfig t11 = new PafPlannerConfig();
		t3.setClientType("");
		t3.setClientVersion("");
		t3.setIpAddress("");
		t3.setClientLanguage("");
		_f0.setUowTrees(t5);
		_f0.setSecurityToken(t6);
		_f0.setApp(t7);
		_f0.setUnitOfWork(t8);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setRuleSets(var3);
		Set var4 = (Set) Stubs.makeStubObject(Set.class);
		_f0.setLockedPeriods(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setLockedForwardPlannableInterMap(var5);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setLockedNotPlannableInterMap(var6);
		_f0.setPlannerRole(t9);
		_f0.setPlanSeason(t10);
		_f0.setClientLanguage("");
		Map var7 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setUserSelections(var7);
		Set var8 = (Set) Stubs.makeStubObject(Set.class);
		_f0.setActiveVersions(var8);
		_f0.setPlannerConfig(t11);
		// jtest_tested_method
		List RETVAL = EvalUtil.buildFloorIntersections((Intersection) null, t2);
		// NullPointerException thrown
		// at com.palladium.paf.eval.EvalUtil.buildFloorIntersections(EvalUtil.java:375)
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
		if (Stubs.matches(method, PafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:90)
				// at com.palladium.paf.eval.EvalUtil.buildFloorIntersections(EvalUtil.java:374)
			}
		}
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
				// at com.palladium.paf.eval.EvalUtil.buildFloorIntersections(EvalUtil.java:374)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientState", argument_types)) {
				return _f0;
				// at com.palladium.paf.eval.EvalUtil.buildFloorIntersections(EvalUtil.java:374)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return null;
				// at com.palladium.paf.eval.EvalUtil.buildFloorIntersections(EvalUtil.java:375)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static buildFloorIntersections(com.palladium.paf.data.Intersection,com.palladium.paf.state.EvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#buildFloorIntersections(com.palladium.paf.data.Intersection,com.palladium.paf.state.EvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testBuildFloorIntersections6() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		EvalState t2 = new EvalState((SliceState) null, t1);
		Object[] var1 = new Object[] {};
		ListMock t3 = new ListMock(var1);
		RuleGroup t4 = new RuleGroup((Rule[]) null);
		Rule t5 = new Rule();
		Long t6 = new Long("0");
		RuleSet t7 = new RuleSet();
		ClientInitRequest t8 = new ClientInitRequest();
		PafClientState t9 = new PafClientState((String) null, t8);
		MemberTreeSet t10 = new MemberTreeSet();
		PafSecurityToken t11 = new PafSecurityToken();
		PafApplicationDef t12 = new PafApplicationDef();
		String[] var2 = new String[] {};
		String[][] var3 = new String[][] { {} };
		UnitOfWork t13 = new UnitOfWork(var2, var3);
		PafPlannerRole t14 = new PafPlannerRole();
		Season t15 = new Season();
		PafPlannerConfig t16 = new PafPlannerConfig();
		ClientInitRequest t17 = new ClientInitRequest();
		_f0 = new PafClientState((String) null, t17);
		MemberTreeSet t19 = new MemberTreeSet();
		PafSecurityToken t20 = new PafSecurityToken();
		PafApplicationDef t21 = new PafApplicationDef();
		SeasonList t22 = new SeasonList();
		MdbDef t23 = new MdbDef();
		String[] var4 = new String[] {};
		String[][] var5 = new String[][] { {} };
		UnitOfWork t24 = new UnitOfWork(var4, var5);
		PafPlannerRole t25 = new PafPlannerRole();
		Season t26 = new Season();
		PafPlannerConfig t27 = new PafPlannerConfig();
		_f1 = new PafApplicationDef();
		SeasonList t29 = new SeasonList();
		MdbDef t30 = new MdbDef();
		_f8 = new PafApplicationDef();
		t2.setTimePeriodList(t3);
		t2.setRuleGroup(t4);
		t2.setRule(t5);
		t2.setStartTime(t6);
		HashSet var6 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t2.setForcedCalcs(var6);
		HashSet var7 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t2.setRequiredCalcs(var7);
		t2.setMeasureRuleSet(t7);
		t2.setStateChanged(false);
		t8.setClientType("");
		t8.setClientVersion("");
		t8.setIpAddress("");
		t8.setClientLanguage("");
		t9.setUowTrees(t10);
		t9.setSecurityToken(t11);
		t9.setApp(t12);
		t9.setUnitOfWork(t13);
		Map var8 = (Map) Stubs.makeStubObject(Map.class);
		t9.setRuleSets(var8);
		Set var9 = (Set) Stubs.makeStubObject(Set.class);
		t9.setLockedPeriods(var9);
		Map var10 = (Map) Stubs.makeStubObject(Map.class);
		t9.setLockedForwardPlannableInterMap(var10);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		t9.setLockedNotPlannableInterMap(var11);
		t9.setPlannerRole(t14);
		t9.setPlanSeason(t15);
		t9.setClientLanguage("");
		Map var12 = (Map) Stubs.makeStubObject(Map.class);
		t9.setUserSelections(var12);
		Set var13 = (Set) Stubs.makeStubObject(Set.class);
		t9.setActiveVersions(var13);
		t9.setPlannerConfig(t16);
		t2.setClientState(t9);
		t2.setTimeSliceMode(false);
		t17.setClientType("");
		t17.setClientVersion("");
		t17.setIpAddress("");
		t17.setClientLanguage("");
		_f0.setUowTrees(t19);
		_f0.setSecurityToken(t20);
		t21.setSeasonList(t22);
		t21.setAppId("");
		PlanCycle[] var14 = new PlanCycle[] {};
		t21.setPlanCycles(var14);
		t21.setLastPeriod("");
		t21.setCurrentYear("");
		t23.setYearDim("");
		String[] var15 = new String[] {};
		t23.setHierDims(var15);
		t23.setMeasureDim("");
		t23.setPlanTypeDim("");
		t23.setTimeDim("");
		t23.setVersionDim("");
		t23.setDataSourceId("");
		String[] var16 = new String[] {};
		t23.setAxisPriority(var16);
		t21.setMdbDef(t23);
		Map var17 = (Map) Stubs.makeStubObject(Map.class);
		t21.setMeasures(var17);
		Map var18 = (Map) Stubs.makeStubObject(Map.class);
		t21.setVersions(var18);
		_f0.setApp(t21);
		_f0.setUnitOfWork(t24);
		Map var19 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setRuleSets(var19);
		Set var20 = (Set) Stubs.makeStubObject(Set.class);
		_f0.setLockedPeriods(var20);
		Map var21 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setLockedForwardPlannableInterMap(var21);
		Map var22 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setLockedNotPlannableInterMap(var22);
		_f0.setPlannerRole(t25);
		_f0.setPlanSeason(t26);
		_f0.setClientLanguage("");
		Map var23 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setUserSelections(var23);
		Set var24 = (Set) Stubs.makeStubObject(Set.class);
		_f0.setActiveVersions(var24);
		_f0.setPlannerConfig(t27);
		_f1.setSeasonList(t29);
		_f1.setAppId("");
		PlanCycle[] var25 = new PlanCycle[] {};
		_f1.setPlanCycles(var25);
		_f1.setLastPeriod("");
		_f1.setCurrentYear("");
		_f1.setMdbDef(t30);
		Map var26 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setMeasures(var26);
		Map var27 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setVersions(var27);
		// jtest_tested_method
		List RETVAL = EvalUtil.buildFloorIntersections((Intersection) null, t2);
		// NullPointerException thrown
		// at com.palladium.paf.eval.EvalUtil.buildFloorIntersections(EvalUtil.java:376)
		// jtest_unverified
	}

	/**
	 * Stubs method for testBuildFloorIntersections6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsBuildFloorIntersections6(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:90)
				// at com.palladium.paf.eval.EvalUtil.buildFloorIntersections(EvalUtil.java:374)
			}
		}
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
				// at com.palladium.paf.eval.EvalUtil.buildFloorIntersections(EvalUtil.java:374)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.EvalUtil.buildFloorIntersections(EvalUtil.java:374)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientState", argument_types)) {
				return _f0;
				// at com.palladium.paf.eval.EvalUtil.buildFloorIntersections(EvalUtil.java:374)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.EvalUtil.buildFloorIntersections(EvalUtil.java:375)
					case 2 :
						return _f8;
					// at com.palladium.paf.eval.EvalUtil.buildFloorIntersections(EvalUtil.java:376)
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
	 * @see EvalUtil#buildIntersections(java.util.Map,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testBuildIntersections1() throws Throwable {
		// jtest_tested_method
		ArrayList RETVAL = EvalUtil.buildIntersections(
			(Map) null,
			(String[]) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.eval.EvalUtil.buildIntersections(Ljava/util/Map;[Ljava/lang/String;)Ljava/util/ArrayList;>
		// at com.palladium.paf.eval.EvalUtil.buildIntersections(EvalUtil.java:345)
		// jtest_unverified
	}

	/**
	 * Test for method: static buildIntersections(java.util.Map,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#buildIntersections(java.util.Map,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testBuildIntersections2() throws Throwable {
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		// jtest_tested_method
		ArrayList RETVAL = EvalUtil.buildIntersections(var1, (String[]) null);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.eval.EvalUtil.buildIntersections(Ljava/util/Map;[Ljava/lang/String;)Ljava/util/ArrayList;>
		// at com.palladium.paf.eval.EvalUtil.buildIntersections(EvalUtil.java:348)
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
				// at com.palladium.paf.eval.EvalUtil.buildIntersections(EvalUtil.java:345)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static buildIntersections(java.util.Map,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#buildIntersections(java.util.Map,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testBuildIntersections3() throws Throwable {
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		String[] var2 = new String[] {};
		// jtest_tested_method
		ArrayList RETVAL = EvalUtil.buildIntersections(var1, var2);
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.utility.Odometer.<init>(Odometer.java:47)
		// at com.palladium.paf.eval.EvalUtil.buildIntersections(EvalUtil.java:360)
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
				// at com.palladium.paf.eval.EvalUtil.buildIntersections(EvalUtil.java:345)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static buildIntersections(java.util.Map,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#buildIntersections(java.util.Map,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testBuildIntersections4() throws Throwable {
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		String[] var2 = new String[] { null };
		// jtest_tested_method
		ArrayList RETVAL = EvalUtil.buildIntersections(var1, var2);
		// ClassCastException thrown
		// at com.palladium.paf.eval.EvalUtil.buildIntersections(EvalUtil.java:349)
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
				// at com.palladium.paf.eval.EvalUtil.buildIntersections(EvalUtil.java:345)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.eval.EvalUtil.buildIntersections(EvalUtil.java:349)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static buildIntersections(java.util.Map,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#buildIntersections(java.util.Map,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testBuildIntersections5() throws Throwable {
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		String[] var2 = new String[] { null };
		// jtest_tested_method
		ArrayList RETVAL = EvalUtil.buildIntersections(var1, var2);
		// NullPointerException thrown
		// at java.util.ArrayList.<init>(ArrayList.java:133)
		// at com.palladium.paf.eval.EvalUtil.buildIntersections(EvalUtil.java:349)
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
				// at com.palladium.paf.eval.EvalUtil.buildIntersections(EvalUtil.java:345)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
				// at com.palladium.paf.eval.EvalUtil.buildIntersections(EvalUtil.java:349)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static buildIntersections(java.util.Map,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#buildIntersections(java.util.Map,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testBuildIntersections6() throws Throwable {
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		String[] var2 = new String[] { null };
		// jtest_tested_method
		ArrayList RETVAL = EvalUtil.buildIntersections(var1, var2);
		// ClassCastException thrown
		// at $Proxy3.toArray(Unknown Source)
		// at java.util.ArrayList.<init>(ArrayList.java:137)
		// at com.palladium.paf.eval.EvalUtil.buildIntersections(EvalUtil.java:349)
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
				// at com.palladium.paf.eval.EvalUtil.buildIntersections(EvalUtil.java:345)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return Stubs.makeStubObject(Collection.class);
				// at com.palladium.paf.eval.EvalUtil.buildIntersections(EvalUtil.java:349)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static calcIntersections(java.util.List,java.lang.String,com.palladium.paf.rules.Formula,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#calcIntersections(java.util.List,java.lang.String,com.palladium.paf.rules.Formula,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalcIntersections1() throws Throwable {
		// jtest_tested_method
		EvalUtil.calcIntersections(
			(List) null,
			(String) null,
			(Formula) null,
			(PafDataCache) null,
			(EvalState) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.eval.EvalUtil.calcIntersections(Ljava/util/List;Ljava/lang/String;Lcom/palladium/paf/rules/Formula;Lcom/palladium/paf/mdb/PafDataCache;Lcom/palladium/paf/state/EvalState;Lcom/palladium/paf/eval/IFormulaEvalEngine;)V>
		// at com.palladium.paf.eval.EvalUtil.calcIntersections(EvalUtil.java:248)
		// jtest_unverified
	}

	/**
	 * Test for method: static calcIntersections(java.util.List,java.lang.String,com.palladium.paf.rules.Formula,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#calcIntersections(java.util.List,java.lang.String,com.palladium.paf.rules.Formula,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalcIntersections2() throws Throwable {
		Object[] var1 = new Object[] {};
		ListMock t0 = new ListMock(var1);
		// jtest_tested_method
		EvalUtil.calcIntersections(
			t0,
			(String) null,
			(Formula) null,
			(PafDataCache) null,
			(EvalState) null,
			(IFormulaEvalEngine) null);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static calcIntersections(java.util.List,java.lang.String,com.palladium.paf.rules.Formula,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#calcIntersections(java.util.List,java.lang.String,com.palladium.paf.rules.Formula,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalcIntersections4() throws Throwable {
		Object[] var1 = new Object[] { null };
		ListMock t0 = new ListMock(var1);
		MeasureFunctionFactory var2 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		Formula t1 = new Formula((String) null, "", var2);
		IFormulaEvalEngine var3 = (IFormulaEvalEngine) Stubs
			.makeStubObject(IFormulaEvalEngine.class);
		// jtest_tested_method
		EvalUtil.calcIntersections(
			t0,
			(String) null,
			t1,
			(PafDataCache) null,
			(EvalState) null,
			var3);
		// NullPointerException thrown
		// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:238)
		// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:244)
		// at com.palladium.paf.eval.EvalUtil.calcIntersections(EvalUtil.java:249)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalcIntersections4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalcIntersections4(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, MeasureFunctionFactory.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "isFunction", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
				// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:192)
				// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:244)
				// at com.palladium.paf.eval.EvalUtil.calcIntersections(EvalUtil.java:249)
			}
		}
		if (Stubs.matches(method, IFormulaEvalEngine.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "Evaluate", argument_types)) {
				return new Double(0.000000);
				// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:221)
				// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:244)
				// at com.palladium.paf.eval.EvalUtil.calcIntersections(EvalUtil.java:249)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static calcIntersections(java.util.List,java.lang.String,com.palladium.paf.rules.Formula,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#calcIntersections(java.util.List,java.lang.String,com.palladium.paf.rules.Formula,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalcIntersections6() throws Throwable {
		Object[] var1 = new Object[] { null };
		ListMock t0 = new ListMock(var1);
		MeasureFunctionFactory var2 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		Formula t1 = new Formula((String) null, "", var2);
		t1.setExpression("");
		String[] var3 = new String[] { null };
		t1.setExpressionTerms(var3);
		t1.setResultTerm("");
		t1.setResultFunction(false);
		t1.setParsed(false);
		// jtest_tested_method
		EvalUtil.calcIntersections(
			t0,
			(String) null,
			t1,
			(PafDataCache) null,
			(EvalState) null,
			(IFormulaEvalEngine) null);
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:200)
		// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:244)
		// at com.palladium.paf.eval.EvalUtil.calcIntersections(EvalUtil.java:249)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalcIntersections6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalcIntersections6(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, MeasureFunctionFactory.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "isFunction", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
				// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:192)
				// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:244)
				// at com.palladium.paf.eval.EvalUtil.calcIntersections(EvalUtil.java:249)
				// 
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
				// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:192)
				// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:244)
				// at com.palladium.paf.eval.EvalUtil.calcIntersections(EvalUtil.java:249)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static calcIntersections(java.util.List,java.lang.String,com.palladium.paf.rules.Formula,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#calcIntersections(java.util.List,java.lang.String,com.palladium.paf.rules.Formula,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalcIntersections8() throws Throwable {
		Object[] var1 = new Object[] {};
		ListMock t0 = new ListMock(var1);
		Formula t1 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		String[] var2 = new String[] {};
		_f3 = new Intersection(var2);
		JT.invokeStatic(
			PafDataCache.class,
			"setAxisCount",
			new Object[] { new Integer(0) },
			new Class[] { Integer.TYPE });
		int[] var3 = new int[] {};
		JT.invokeStatic(
			PafDataCache.class,
			"setAxisSizes",
			new Object[] { var3 },
			new Class[] { int[].class });
		int[] var4 = new int[] {};
		JT.invokeStatic(
			PafDataCache.class,
			"setDimCountByAxis",
			new Object[] { var4 },
			new Class[] { int[].class });
		boolean[] var5 = new boolean[] {};
		JT.invokeStatic(
			PafDataCache.class,
			"setIsSlicerAxis",
			new Object[] { var5 },
			new Class[] { boolean[].class });
		JT.invokeStatic(
			PafDataCache.class,
			"setMdxQuery",
			new Object[] { "" },
			new Class[] { String.class });
		PafDataCache var6 = (PafDataCache) Stubs
			.makeStubObject(PafDataCache.class);
		IFormulaEvalEngine var7 = (IFormulaEvalEngine) Stubs
			.makeStubObject(IFormulaEvalEngine.class);
		// jtest_tested_method
		EvalUtil.calcIntersections(
			t0,
			(String) null,
			t1,
			var6,
			(EvalState) null,
			var7);
		// NullPointerException thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalcIntersections8.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalcIntersections8(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.EvalUtil.calcIntersections(EvalUtil.java:248)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Iterator.next()");
				switch (index) {
					case 1 :
						return _f3;
					// at com.palladium.paf.eval.EvalUtil.calcIntersections(EvalUtil.java:248)
					case 2 :
						return null;
					// at com.palladium.paf.eval.EvalUtil.calcIntersections(EvalUtil.java:248)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Formula.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getExpression", argument_types)) {
				return "";
				// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:212)
				// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:244)
				// at com.palladium.paf.eval.EvalUtil.calcIntersections(EvalUtil.java:249)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getExpressionTerms", argument_types)) {
				throw new PafException();
				// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:192)
				// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:244)
				// at com.palladium.paf.eval.EvalUtil.calcIntersections(EvalUtil.java:249)
			}
		}
		if (Stubs.matches(method, IFormulaEvalEngine.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "Evaluate", argument_types)) {
				return new Double(0.000000);
				// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:221)
				// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:244)
				// at com.palladium.paf.eval.EvalUtil.calcIntersections(EvalUtil.java:249)
			}
		}
		if (Stubs.matches(method, PafDataCache.class)) {
			argument_types = new Class[] { String[].class, Double.TYPE };
			if (Stubs.matches(method, "setCellValue", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:238)
				// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:244)
				// at com.palladium.paf.eval.EvalUtil.calcIntersections(EvalUtil.java:249)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static calcIntersections(java.util.Set,java.lang.String,com.palladium.paf.rules.Formula,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#calcIntersections(java.util.Set,java.lang.String,com.palladium.paf.rules.Formula,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalcIntersections11() throws Throwable {
		// jtest_tested_method
		EvalUtil.calcIntersections(
			(Set) null,
			(String) null,
			(Formula) null,
			(PafDataCache) null,
			(EvalState) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.eval.EvalUtil.calcIntersections(Ljava/util/Set;Ljava/lang/String;Lcom/palladium/paf/rules/Formula;Lcom/palladium/paf/mdb/PafDataCache;Lcom/palladium/paf/state/EvalState;Lcom/palladium/paf/eval/IFormulaEvalEngine;)V>
		// at com.palladium.paf.eval.EvalUtil.calcIntersections(EvalUtil.java:253)
		// jtest_unverified
	}

	/**
	 * Test for method: static calcIntersections(java.util.Set,java.lang.String,com.palladium.paf.rules.Formula,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#calcIntersections(java.util.Set,java.lang.String,com.palladium.paf.rules.Formula,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalcIntersections12() throws Throwable {
		Set var1 = (Set) Stubs.makeStubObject(Set.class);
		// jtest_tested_method
		EvalUtil.calcIntersections(
			var1,
			(String) null,
			(Formula) null,
			(PafDataCache) null,
			(EvalState) null,
			(IFormulaEvalEngine) null);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalcIntersections12.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalcIntersections12(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static calcIntersections(java.util.Set,java.lang.String,com.palladium.paf.rules.Formula,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#calcIntersections(java.util.Set,java.lang.String,com.palladium.paf.rules.Formula,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalcIntersections14() throws Throwable {
		Set var1 = (Set) Stubs.makeStubObject(Set.class);
		// jtest_tested_method
		EvalUtil.calcIntersections(
			var1,
			(String) null,
			(Formula) null,
			(PafDataCache) null,
			(EvalState) null,
			(IFormulaEvalEngine) null);
		// ClassCastException thrown
		// at com.palladium.paf.eval.EvalUtil.calcIntersections(EvalUtil.java:253)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalcIntersections14.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalcIntersections14(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.EvalUtil.calcIntersections(EvalUtil.java:253)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.EvalUtil.calcIntersections(EvalUtil.java:253)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return "";
				// at com.palladium.paf.eval.EvalUtil.calcIntersections(EvalUtil.java:253)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static calcIntersections(java.util.Set,java.lang.String,com.palladium.paf.rules.Formula,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#calcIntersections(java.util.Set,java.lang.String,com.palladium.paf.rules.Formula,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalcIntersections19() throws Throwable {
		String[] var1 = new String[] {};
		_f2 = Intersection.createIntersection(
			var1,
			(List) null,
			(List) null,
			(List) null);
		CustomFunctionDef t1 = new CustomFunctionDef();
		CustomFunctionDef t2 = new CustomFunctionDef();
		CustomFunctionDef t3 = new CustomFunctionDef();
		CustomFunctionDef t4 = new CustomFunctionDef();
		CustomFunctionDef[] var2 = new CustomFunctionDef[] { t1, t2, t3, t4 };
		MeasureFunctionFactory t5 = new MeasureFunctionFactory(var2);
		Formula t6 = new Formula("0", "", t5);
		String[] var3 = new String[] { null };
		_f7 = Intersection.createIntersection(
			var3,
			(List) null,
			(List) null,
			(List) null);
		t4.setClassName("");
		t4.setFunctionName("");
		JT.invokeStatic(
			PafDataCache.class,
			"setAxisCount",
			new Object[] { new Integer(0) },
			new Class[] { Integer.TYPE });
		int[] var4 = new int[] {};
		JT.invokeStatic(
			PafDataCache.class,
			"setAxisSizes",
			new Object[] { var4 },
			new Class[] { int[].class });
		int[] var5 = new int[] {};
		JT.invokeStatic(
			PafDataCache.class,
			"setDimCountByAxis",
			new Object[] { var5 },
			new Class[] { int[].class });
		boolean[] var6 = new boolean[] {};
		JT.invokeStatic(
			PafDataCache.class,
			"setIsSlicerAxis",
			new Object[] { var6 },
			new Class[] { boolean[].class });
		JT.invokeStatic(
			PafDataCache.class,
			"setMdxQuery",
			new Object[] { "" },
			new Class[] { String.class });
		Set var7 = (Set) Stubs.makeStubObject(Set.class);
		PafDataCache var8 = (PafDataCache) Stubs
			.makeStubObject(PafDataCache.class);
		IFormulaEvalEngine var9 = (IFormulaEvalEngine) Stubs
			.makeStubObject(IFormulaEvalEngine.class);
		// jtest_tested_method
		EvalUtil.calcIntersections(
			var7,
			(String) null,
			t6,
			var8,
			(EvalState) null,
			var9);
		// NullPointerException thrown
		// at com.palladium.paf.data.Intersection.hashCode(Intersection.java:107)
		// at java.util.HashMap.hash(HashMap.java:264)
		// at java.util.WeakHashMap.getEntry(WeakHashMap.java:370)
		// at java.util.WeakHashMap.containsKey(WeakHashMap.java:361)
		// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:144)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalcIntersections19.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalcIntersections19(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.EvalUtil.calcIntersections(EvalUtil.java:253)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.EvalUtil.calcIntersections(EvalUtil.java:253)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Iterator.next()");
				switch (index) {
					case 1 :
						return _f2;
					// at com.palladium.paf.eval.EvalUtil.calcIntersections(EvalUtil.java:253)
					case 2 :
						return _f7;
					// at com.palladium.paf.eval.EvalUtil.calcIntersections(EvalUtil.java:253)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Class.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "forName", argument_types)) {
				return java.lang.Object.class;
				// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:20)
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:267)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
				// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:192)
				// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:244)
				// at com.palladium.paf.eval.EvalUtil.calcIntersections(EvalUtil.java:254)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "newInstance", argument_types)) {
				return null;
				// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:20)
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:267)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
				// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:192)
				// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:244)
				// at com.palladium.paf.eval.EvalUtil.calcIntersections(EvalUtil.java:254)
			}
		}
		if (Stubs.matches(method, Formula.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getExpression", argument_types)) {
				return "";
				// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:212)
				// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:244)
				// at com.palladium.paf.eval.EvalUtil.calcIntersections(EvalUtil.java:254)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getExpressionTerms", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:192)
				// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:244)
				// at com.palladium.paf.eval.EvalUtil.calcIntersections(EvalUtil.java:254)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getFunctionTermFlags", argument_types)) {
				return new boolean[] { false };
				// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:193)
				// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:244)
				// at com.palladium.paf.eval.EvalUtil.calcIntersections(EvalUtil.java:254)
			}
		}
		if (Stubs.matches(method, IFormulaEvalEngine.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "Evaluate", argument_types)) {
				return new Double(0.000000);
				// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:221)
				// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:244)
				// at com.palladium.paf.eval.EvalUtil.calcIntersections(EvalUtil.java:254)
			}
		}
		if (Stubs.matches(method, PafDataCache.class)) {
			argument_types = new Class[] { String[].class, Double.TYPE };
			if (Stubs.matches(method, "setCellValue", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:238)
				// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:244)
				// at com.palladium.paf.eval.EvalUtil.calcIntersections(EvalUtil.java:254)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static changeTriggersFormula(com.palladium.paf.data.Intersection,com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#changeTriggersFormula(com.palladium.paf.data.Intersection,com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testChangeTriggersFormula1() throws Throwable {
		// jtest_tested_method
		boolean RETVAL = EvalUtil.changeTriggersFormula(
			(Intersection) null,
			(Rule) null,
			(EvalState) null);
		// NullPointerException thrown, originator is arg 3 to <Method com.palladium.paf.eval.EvalUtil.changeTriggersFormula(Lcom/palladium/paf/data/Intersection;Lcom/palladium/paf/rules/Rule;Lcom/palladium/paf/state/EvalState;)Z>
		// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:307)
		// jtest_unverified
	}

	/**
	 * Test for method: static changeTriggersFormula(com.palladium.paf.data.Intersection,com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#changeTriggersFormula(com.palladium.paf.data.Intersection,com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testChangeTriggersFormula5() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		MemberTreeSet t2 = new MemberTreeSet();
		PafSecurityToken t3 = new PafSecurityToken();
		PafApplicationDef t4 = new PafApplicationDef();
		String[] var1 = new String[] {};
		String[][] var2 = new String[][] { {} };
		UnitOfWork t5 = new UnitOfWork(var1, var2);
		PafPlannerRole t6 = new PafPlannerRole();
		Season t7 = new Season();
		PafPlannerConfig t8 = new PafPlannerConfig();
		EvalState t9 = new EvalState((SliceState) null, t1);
		_f1 = new PafApplicationDef();
		SeasonList t11 = new SeasonList();
		MdbDef t12 = new MdbDef();
		_f6 = new MdbDef();
		String[] var3 = new String[] {};
		Intersection t14 = Intersection.createIntersection(
			var3,
			(List) null,
			(List) null,
			(List) null);
		t0.setClientType("");
		t0.setClientVersion("");
		t0.setIpAddress("");
		t0.setClientLanguage("");
		t1.setUowTrees(t2);
		t1.setSecurityToken(t3);
		t1.setApp(t4);
		t1.setUnitOfWork(t5);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		t1.setRuleSets(var4);
		Set var5 = (Set) Stubs.makeStubObject(Set.class);
		t1.setLockedPeriods(var5);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		t1.setLockedForwardPlannableInterMap(var6);
		Map var7 = (Map) Stubs.makeStubObject(Map.class);
		t1.setLockedNotPlannableInterMap(var7);
		t1.setPlannerRole(t6);
		t1.setPlanSeason(t7);
		t1.setClientLanguage("");
		Map var8 = (Map) Stubs.makeStubObject(Map.class);
		t1.setUserSelections(var8);
		Set var9 = (Set) Stubs.makeStubObject(Set.class);
		t1.setActiveVersions(var9);
		t1.setPlannerConfig(t8);
		_f1.setSeasonList(t11);
		_f1.setAppId("");
		PlanCycle[] var10 = new PlanCycle[] {};
		_f1.setPlanCycles(var10);
		_f1.setLastPeriod("");
		_f1.setCurrentYear("");
		_f1.setMdbDef(t12);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setMeasures(var11);
		Map var12 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setVersions(var12);
		_f6.setYearDim("");
		String[] var13 = new String[] {};
		_f6.setHierDims(var13);
		_f6.setMeasureDim("");
		_f6.setPlanTypeDim("");
		_f6.setTimeDim("");
		_f6.setVersionDim("");
		_f6.setDataSourceId("");
		String[] var14 = new String[] {};
		_f6.setAxisPriority(var14);
		// jtest_tested_method
		boolean RETVAL = EvalUtil.changeTriggersFormula(t14, (Rule) null, t9);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.eval.EvalUtil.changeTriggersFormula(Lcom/palladium/paf/data/Intersection;Lcom/palladium/paf/rules/Rule;Lcom/palladium/paf/state/EvalState;)Z>
		// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:308)
		// jtest_unverified
	}

	/**
	 * Stubs method for testChangeTriggersFormula5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsChangeTriggersFormula5(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:90)
				// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:307)
			}
		}
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
				// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:307)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f1;
				// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:307)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				return _f6;
				// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:307)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static evalFormula(com.palladium.paf.rules.Formula,java.lang.String,com.palladium.paf.data.Intersection,com.palladium.paf.data.Intersection,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#evalFormula(com.palladium.paf.rules.Formula,java.lang.String,com.palladium.paf.data.Intersection,com.palladium.paf.data.Intersection,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEvalFormula1() throws Throwable {
		// jtest_tested_method
		EvalUtil.evalFormula(
			(Formula) null,
			(String) null,
			(Intersection) null,
			(Intersection) null,
			(PafDataCache) null,
			(EvalState) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.eval.EvalUtil.evalFormula(Lcom/palladium/paf/rules/Formula;Ljava/lang/String;Lcom/palladium/paf/data/Intersection;Lcom/palladium/paf/data/Intersection;Lcom/palladium/paf/mdb/PafDataCache;Lcom/palladium/paf/state/EvalState;Lcom/palladium/paf/eval/IFormulaEvalEngine;)V>
		// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:192)
		// jtest_unverified
	}

	/**
	 * Test for method: static evalFormula(com.palladium.paf.rules.Formula,java.lang.String,com.palladium.paf.data.Intersection,com.palladium.paf.data.Intersection,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#evalFormula(com.palladium.paf.rules.Formula,java.lang.String,com.palladium.paf.data.Intersection,com.palladium.paf.data.Intersection,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEvalFormula2() throws Throwable {
		Formula t0 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		// jtest_tested_method
		EvalUtil.evalFormula(
			t0,
			(String) null,
			(Intersection) null,
			(Intersection) null,
			(PafDataCache) null,
			(EvalState) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown, originator is arg 7 to <Method com.palladium.paf.eval.EvalUtil.evalFormula(Lcom/palladium/paf/rules/Formula;Ljava/lang/String;Lcom/palladium/paf/data/Intersection;Lcom/palladium/paf/data/Intersection;Lcom/palladium/paf/mdb/PafDataCache;Lcom/palladium/paf/state/EvalState;Lcom/palladium/paf/eval/IFormulaEvalEngine;)V>
		// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:221)
		// jtest_unverified
	}

	/**
	 * Test for method: static evalFormula(com.palladium.paf.rules.Formula,java.lang.String,com.palladium.paf.data.Intersection,com.palladium.paf.data.Intersection,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#evalFormula(com.palladium.paf.rules.Formula,java.lang.String,com.palladium.paf.data.Intersection,com.palladium.paf.data.Intersection,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEvalFormula3() throws Throwable {
		CustomFunctionDef[] var1 = new CustomFunctionDef[] {};
		MeasureFunctionFactory t0 = new MeasureFunctionFactory(
			var1,
			(ClassLoader) null);
		Formula t1 = new Formula("0", " ", t0);
		IFormulaEvalEngine var2 = (IFormulaEvalEngine) Stubs
			.makeStubObject(IFormulaEvalEngine.class);
		// jtest_tested_method
		EvalUtil.evalFormula(
			t1,
			(String) null,
			(Intersection) null,
			(Intersection) null,
			(PafDataCache) null,
			(EvalState) null,
			var2);
		// NullPointerException thrown, originator is arg 4 to <Method com.palladium.paf.eval.EvalUtil.evalFormula(Lcom/palladium/paf/rules/Formula;Ljava/lang/String;Lcom/palladium/paf/data/Intersection;Lcom/palladium/paf/data/Intersection;Lcom/palladium/paf/mdb/PafDataCache;Lcom/palladium/paf/state/EvalState;Lcom/palladium/paf/eval/IFormulaEvalEngine;)V>
		// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:238)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEvalFormula3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEvalFormula3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, IFormulaEvalEngine.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "Evaluate", argument_types)) {
				return new Double(0.000000);
				// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:221)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static evalFormula(com.palladium.paf.rules.Formula,java.lang.String,com.palladium.paf.data.Intersection,com.palladium.paf.data.Intersection,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#evalFormula(com.palladium.paf.rules.Formula,java.lang.String,com.palladium.paf.data.Intersection,com.palladium.paf.data.Intersection,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEvalFormula4() throws Throwable {
		Formula t0 = new Formula();
		// jtest_tested_method
		EvalUtil.evalFormula(
			t0,
			(String) null,
			(Intersection) null,
			(Intersection) null,
			(PafDataCache) null,
			(EvalState) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown
		// at java.lang.StringBuilder.<init>(StringBuilder.java:93)
		// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:212)
		// jtest_unverified
	}

	/**
	 * Test for method: static evalFormula(com.palladium.paf.rules.Formula,java.lang.String,com.palladium.paf.data.Intersection,com.palladium.paf.data.Intersection,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#evalFormula(com.palladium.paf.rules.Formula,java.lang.String,com.palladium.paf.data.Intersection,com.palladium.paf.data.Intersection,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEvalFormula5() throws Throwable {
		Formula t0 = new Formula(
			(String) null,
			"()",
			(MeasureFunctionFactory) null);
		Intersection t1 = new Intersection((String[]) null, (String[]) null);
		t0.setExpression("*+,");
		String[] var1 = new String[] {};
		t0.setExpressionTerms(var1);
		t0.setResultTerm("");
		t0.setResultFunction(false);
		t0.setParsed(false);
		IFormulaEvalEngine var2 = (IFormulaEvalEngine) Stubs
			.makeStubObject(IFormulaEvalEngine.class);
		// jtest_tested_method
		EvalUtil.evalFormula(
			t0,
			(String) null,
			(Intersection) null,
			t1,
			(PafDataCache) null,
			(EvalState) null,
			var2);
		// NullPointerException thrown, originator is arg 5 to <Method com.palladium.paf.eval.EvalUtil.evalFormula(Lcom/palladium/paf/rules/Formula;Ljava/lang/String;Lcom/palladium/paf/data/Intersection;Lcom/palladium/paf/data/Intersection;Lcom/palladium/paf/mdb/PafDataCache;Lcom/palladium/paf/state/EvalState;Lcom/palladium/paf/eval/IFormulaEvalEngine;)V>
		// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:238)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEvalFormula5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEvalFormula5(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, IFormulaEvalEngine.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "Evaluate", argument_types)) {
				return new Double(0.000000);
				// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:221)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static evalFormula(com.palladium.paf.rules.Formula,java.lang.String,com.palladium.paf.data.Intersection,com.palladium.paf.data.Intersection,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#evalFormula(com.palladium.paf.rules.Formula,java.lang.String,com.palladium.paf.data.Intersection,com.palladium.paf.data.Intersection,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEvalFormula7() throws Throwable {
		MeasureFunctionFactory var1 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		Formula t0 = new Formula((String) null, "12345", var1);
		String[] var2 = new String[] {};
		Intersection t1 = Intersection.createIntersection(
			var2,
			(List) null,
			(List) null,
			(List) null);
		PafDataCache var3 = (PafDataCache) Stubs
			.makeStubObject(PafDataCache.class);
		IFormulaEvalEngine var4 = (IFormulaEvalEngine) Stubs
			.makeStubObject(IFormulaEvalEngine.class);
		// jtest_tested_method
		EvalUtil.evalFormula(
			t0,
			(String) null,
			(Intersection) null,
			t1,
			var3,
			(EvalState) null,
			var4);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testEvalFormula7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEvalFormula7(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, MeasureFunctionFactory.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "isFunction", argument_types)) {
				return Boolean.TRUE;
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getFunction", argument_types)) {
				return null;
			}
		}
		if (Stubs.matches(method, IFormulaEvalEngine.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "Evaluate", argument_types)) {
				return new Double(0.000000);
			}
		}
		if (Stubs.matches(method, PafDataCache.class)) {
			argument_types = new Class[] { String[].class, Double.TYPE };
			if (Stubs.matches(method, "setCellValue", argument_types)) {
				return Stubs.VOID;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static evalFormula(com.palladium.paf.rules.Formula,java.lang.String,com.palladium.paf.data.Intersection,com.palladium.paf.data.Intersection,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#evalFormula(com.palladium.paf.rules.Formula,java.lang.String,com.palladium.paf.data.Intersection,com.palladium.paf.data.Intersection,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEvalFormula8() throws Throwable {
		MeasureFunctionFactory var1 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		Formula t0 = new Formula((String) null, "6789@B", var1);
		// jtest_tested_method
		EvalUtil.evalFormula(
			t0,
			(String) null,
			(Intersection) null,
			(Intersection) null,
			(PafDataCache) null,
			(EvalState) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown
		// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:202)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEvalFormula8.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEvalFormula8(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, MeasureFunctionFactory.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getFunction", argument_types)) {
				return null;
				// at com.palladium.paf.rules.Formula.extractTerms(Formula.java:204)
				// at com.palladium.paf.rules.Formula.init(Formula.java:86)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
				// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:192)
				// 
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:270)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
				// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:192)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "isFunction", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
				// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:192)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static evalFormula(com.palladium.paf.rules.Formula,java.lang.String,com.palladium.paf.data.Intersection,com.palladium.paf.data.Intersection,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#evalFormula(com.palladium.paf.rules.Formula,java.lang.String,com.palladium.paf.data.Intersection,com.palladium.paf.data.Intersection,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEvalFormula10() throws Throwable {
		MeasureFunctionFactory var1 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		Formula t0 = new Formula((String) null, "./06789@", var1);
		t0.setExpression("B ()*+,- ");
		String[] var2 = new String[] { null };
		t0.setExpressionTerms(var2);
		t0.setResultTerm("");
		t0.setResultFunction(false);
		t0.setParsed(false);
		// jtest_tested_method
		EvalUtil.evalFormula(
			t0,
			(String) null,
			(Intersection) null,
			(Intersection) null,
			(PafDataCache) null,
			(EvalState) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown, originator is arg 3 to <Method com.palladium.paf.eval.EvalUtil.evalFormula(Lcom/palladium/paf/rules/Formula;Ljava/lang/String;Lcom/palladium/paf/data/Intersection;Lcom/palladium/paf/data/Intersection;Lcom/palladium/paf/mdb/PafDataCache;Lcom/palladium/paf/state/EvalState;Lcom/palladium/paf/eval/IFormulaEvalEngine;)V>
		// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:205)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEvalFormula10.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEvalFormula10(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, MeasureFunctionFactory.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getFunction", argument_types)) {
				return null;
				// at com.palladium.paf.rules.Formula.extractTerms(Formula.java:204)
				// at com.palladium.paf.rules.Formula.init(Formula.java:86)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
				// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:192)
				// 
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:270)
				// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:192)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "isFunction", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.MeasureFunctionFactory.isFunction(java.lang.String)");
				switch (index) {
					case 1 :
						return Boolean.FALSE;
					// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
					// at com.palladium.paf.rules.Formula.init(Formula.java:87)
					// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
					// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:192)
					case 2 :
						return Boolean.TRUE;
					// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
					// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:192)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static evalFormula(com.palladium.paf.rules.Formula,java.lang.String,com.palladium.paf.data.Intersection,com.palladium.paf.data.Intersection,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#evalFormula(com.palladium.paf.rules.Formula,java.lang.String,com.palladium.paf.data.Intersection,com.palladium.paf.data.Intersection,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEvalFormula11() throws Throwable {
		Formula t0 = new Formula((String) null, (String) null);
		String[] var1 = new String[] { null };
		t0.setExpressionTerms(var1);
		t0.setResultTerm("");
		t0.setResultFunction(false);
		t0.setParsed(false);
		// jtest_tested_method
		EvalUtil.evalFormula(
			t0,
			(String) null,
			(Intersection) null,
			(Intersection) null,
			(PafDataCache) null,
			(EvalState) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown
		// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:200)
		// jtest_unverified
	}

	/**
	 * Test for method: static evalFormula(com.palladium.paf.rules.Formula,java.lang.String,com.palladium.paf.data.Intersection,com.palladium.paf.data.Intersection,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#evalFormula(com.palladium.paf.rules.Formula,java.lang.String,com.palladium.paf.data.Intersection,com.palladium.paf.data.Intersection,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEvalFormula12() throws Throwable {
		Formula t0 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		t0.setExpression("");
		String[] var1 = new String[] { null };
		t0.setExpressionTerms(var1);
		t0.setResultTerm("");
		t0.setResultFunction(false);
		t0.setParsed(false);
		// jtest_tested_method
		EvalUtil.evalFormula(
			t0,
			(String) null,
			(Intersection) null,
			(Intersection) null,
			(PafDataCache) null,
			(EvalState) null,
			(IFormulaEvalEngine) null);
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:200)
		// jtest_unverified
	}

	/**
	 * Test for method: static evalFormula(com.palladium.paf.rules.Formula,java.lang.String,com.palladium.paf.data.Intersection,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#evalFormula(com.palladium.paf.rules.Formula,java.lang.String,com.palladium.paf.data.Intersection,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEvalFormula20() throws Throwable {
		Formula t0 = new Formula();
		// jtest_tested_method
		EvalUtil.evalFormula(
			t0,
			(String) null,
			(Intersection) null,
			(PafDataCache) null,
			(EvalState) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown
		// at java.lang.StringBuilder.<init>(StringBuilder.java:93)
		// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:212)
		// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:244)
		// jtest_unverified
	}

	/**
	 * Test for method: static evalFormula(com.palladium.paf.rules.Formula,java.lang.String,com.palladium.paf.data.Intersection,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#evalFormula(com.palladium.paf.rules.Formula,java.lang.String,com.palladium.paf.data.Intersection,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.state.EvalState,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEvalFormula21() throws Throwable {
		Formula t0 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		t0.setExpression("");
		String[] var1 = new String[] { null };
		t0.setExpressionTerms(var1);
		t0.setResultTerm("");
		t0.setResultFunction(false);
		t0.setParsed(false);
		// jtest_tested_method
		EvalUtil.evalFormula(
			t0,
			(String) null,
			(Intersection) null,
			(PafDataCache) null,
			(EvalState) null,
			(IFormulaEvalEngine) null);
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:200)
		// at com.palladium.paf.eval.EvalUtil.evalFormula(EvalUtil.java:244)
		// jtest_unverified
	}

	/**
	 * Test for method: EvalUtil()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#EvalUtil()
	 * @author Parasoft Jtest 8.0
	 */
	public void testEvalUtil1() throws Throwable {
		// jtest_tested_method
		EvalUtil THIS = new EvalUtil();
		// ClassCastException thrown
		// at java.lang.Class.cast(Class.java:2920)
		// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
		// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
		// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
		// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
		// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
		// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
		// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
		// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
		// at com.palladium.paf.eval.EvalUtil.<init>(EvalUtil.java:65)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEvalUtil1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEvalUtil1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				throw new SQLException();
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
				// at com.palladium.paf.eval.EvalUtil.<init>(EvalUtil.java:65)
			}
		}
		if (Stubs.matches(method, DriverManagerConnectionProvider.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return null;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:72)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
				// at com.palladium.paf.eval.EvalUtil.<init>(EvalUtil.java:65)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static getChangeSet(com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#getChangeSet(com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetChangeSet1() throws Throwable {
		// jtest_tested_method
		Set RETVAL = EvalUtil.getChangeSet((Rule) null, (EvalState) null);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.eval.EvalUtil.getChangeSet(Lcom/palladium/paf/rules/Rule;Lcom/palladium/paf/state/EvalState;)Ljava/util/Set;>
		// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:430)
		// jtest_unverified
	}

	/**
	 * Test for method: static getChangeSet(com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#getChangeSet(com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetChangeSet4() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		MemberTreeSet t2 = new MemberTreeSet();
		PafSecurityToken t3 = new PafSecurityToken();
		PafApplicationDef t4 = new PafApplicationDef();
		String[] var1 = new String[] {};
		String[][] var2 = new String[][] { {} };
		UnitOfWork t5 = new UnitOfWork(var1, var2);
		PafPlannerRole t6 = new PafPlannerRole();
		Season t7 = new Season();
		PafPlannerConfig t8 = new PafPlannerConfig();
		EvalState t9 = new EvalState((SliceState) null, t1);
		Object[] var3 = new Object[] {};
		ListMock t10 = new ListMock(var3);
		RuleGroup t11 = new RuleGroup((Rule[]) null);
		Rule t12 = new Rule();
		Long t13 = new Long("0");
		RuleSet t14 = new RuleSet();
		ClientInitRequest t15 = new ClientInitRequest();
		PafClientState t16 = new PafClientState((String) null, t15);
		_f1 = new PafApplicationDef();
		SeasonList t18 = new SeasonList();
		MdbDef t19 = new MdbDef();
		t0.setClientType("");
		t0.setClientVersion("");
		t0.setIpAddress("");
		t0.setClientLanguage("");
		t1.setUowTrees(t2);
		t1.setSecurityToken(t3);
		t1.setApp(t4);
		t1.setUnitOfWork(t5);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		t1.setRuleSets(var4);
		Set var5 = (Set) Stubs.makeStubObject(Set.class);
		t1.setLockedPeriods(var5);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		t1.setLockedForwardPlannableInterMap(var6);
		Map var7 = (Map) Stubs.makeStubObject(Map.class);
		t1.setLockedNotPlannableInterMap(var7);
		t1.setPlannerRole(t6);
		t1.setPlanSeason(t7);
		t1.setClientLanguage("");
		Map var8 = (Map) Stubs.makeStubObject(Map.class);
		t1.setUserSelections(var8);
		Set var9 = (Set) Stubs.makeStubObject(Set.class);
		t1.setActiveVersions(var9);
		t1.setPlannerConfig(t8);
		t9.setTimePeriodList(t10);
		t9.setRuleGroup(t11);
		t9.setRule(t12);
		t9.setStartTime(t13);
		HashSet var10 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t9.setForcedCalcs(var10);
		HashSet var11 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t9.setRequiredCalcs(var11);
		t9.setMeasureRuleSet(t14);
		t9.setStateChanged(false);
		t9.setClientState(t16);
		t9.setTimeSliceMode(false);
		_f1.setSeasonList(t18);
		_f1.setAppId("");
		PlanCycle[] var12 = new PlanCycle[] {};
		_f1.setPlanCycles(var12);
		_f1.setLastPeriod("");
		_f1.setCurrentYear("");
		_f1.setMdbDef(t19);
		Map var13 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setMeasures(var13);
		Map var14 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setVersions(var14);
		// jtest_tested_method
		Set RETVAL = EvalUtil.getChangeSet((Rule) null, t9);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.eval.EvalUtil.getChangeSet(Lcom/palladium/paf/rules/Rule;Lcom/palladium/paf/state/EvalState;)Ljava/util/Set;>
		// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:432)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetChangeSet4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetChangeSet4(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
				// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:430)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:430)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f1;
				// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:430)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static getChangeSet(com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#getChangeSet(com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetChangeSet5() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		MemberTreeSet t2 = new MemberTreeSet();
		PafSecurityToken t3 = new PafSecurityToken();
		PafApplicationDef t4 = new PafApplicationDef();
		String[] var1 = new String[] {};
		String[][] var2 = new String[][] { {} };
		UnitOfWork t5 = new UnitOfWork(var1, var2);
		PafPlannerRole t6 = new PafPlannerRole();
		Season t7 = new Season();
		PafPlannerConfig t8 = new PafPlannerConfig();
		EvalState t9 = new EvalState((SliceState) null, t1);
		_f1 = new PafApplicationDef();
		SeasonList t11 = new SeasonList();
		MdbDef t12 = new MdbDef();
		Rule t13 = new Rule();
		t0.setClientType("");
		t0.setClientVersion("");
		t0.setIpAddress("");
		t0.setClientLanguage("");
		t1.setUowTrees(t2);
		t1.setSecurityToken(t3);
		t1.setApp(t4);
		t1.setUnitOfWork(t5);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		t1.setRuleSets(var3);
		Set var4 = (Set) Stubs.makeStubObject(Set.class);
		t1.setLockedPeriods(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		t1.setLockedForwardPlannableInterMap(var5);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		t1.setLockedNotPlannableInterMap(var6);
		t1.setPlannerRole(t6);
		t1.setPlanSeason(t7);
		t1.setClientLanguage("");
		Map var7 = (Map) Stubs.makeStubObject(Map.class);
		t1.setUserSelections(var7);
		Set var8 = (Set) Stubs.makeStubObject(Set.class);
		t1.setActiveVersions(var8);
		t1.setPlannerConfig(t8);
		_f1.setSeasonList(t11);
		_f1.setAppId("");
		PlanCycle[] var9 = new PlanCycle[] {};
		_f1.setPlanCycles(var9);
		_f1.setLastPeriod("");
		_f1.setCurrentYear("");
		_f1.setMdbDef(t12);
		Map var10 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setMeasures(var10);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setVersions(var11);
		// jtest_tested_method
		Set RETVAL = EvalUtil.getChangeSet(t13, t9);
		// NullPointerException thrown
		// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:438)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetChangeSet5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetChangeSet5(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
				// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:430)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f1;
				// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:430)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTimePeriodList", argument_types)) {
				return null;
				// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:434)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static getFunction(com.palladium.paf.funcs.IPafFunction,com.palladium.paf.app.PafApplicationDef)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#getFunction(com.palladium.paf.funcs.IPafFunction,com.palladium.paf.app.PafApplicationDef)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetFunction1() throws Throwable {
		// jtest_tested_method
		IPafFunction RETVAL = EvalUtil.getFunction(
			(IPafFunction) null,
			(PafApplicationDef) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.eval.EvalUtil.getFunction(Lcom/palladium/paf/funcs/IPafFunction;Lcom/palladium/paf/app/PafApplicationDef;)Lcom/palladium/paf/funcs/IPafFunction;>
		// at com.palladium.paf.eval.EvalUtil.getFunction(EvalUtil.java:88)
		// jtest_unverified
	}

	/**
	 * Test for method: static inverseTranslocateIntersection(com.palladium.paf.data.Intersection,com.palladium.paf.funcs.IPafFunction,com.palladium.paf.state.EvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#inverseTranslocateIntersection(com.palladium.paf.data.Intersection,com.palladium.paf.funcs.IPafFunction,com.palladium.paf.state.EvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testInverseTranslocateIntersection1() throws Throwable {
		// jtest_tested_method
		Intersection RETVAL = EvalUtil.inverseTranslocateIntersection(
			(Intersection) null,
			(IPafFunction) null,
			(EvalState) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.eval.EvalUtil.inverseTranslocateIntersection(Lcom/palladium/paf/data/Intersection;Lcom/palladium/paf/funcs/IPafFunction;Lcom/palladium/paf/state/EvalState;)Lcom/palladium/paf/data/Intersection;>
		// at com.palladium.paf.eval.EvalUtil.inverseTranslocateIntersection(EvalUtil.java:260)
		// jtest_unverified
	}

	/**
	 * Test for method: static inverseTranslocateIntersection(com.palladium.paf.data.Intersection,com.palladium.paf.funcs.IPafFunction,com.palladium.paf.state.EvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#inverseTranslocateIntersection(com.palladium.paf.data.Intersection,com.palladium.paf.funcs.IPafFunction,com.palladium.paf.state.EvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testInverseTranslocateIntersection2() throws Throwable {
		String[] var1 = new String[] { null, null };
		Intersection t0 = Intersection.createIntersection(
			var1,
			(List) null,
			(List) null,
			(List) null);
		// jtest_tested_method
		Intersection RETVAL = EvalUtil.inverseTranslocateIntersection(
			t0,
			(IPafFunction) null,
			(EvalState) null);
		// NullPointerException thrown, originator is arg 3 to <Method com.palladium.paf.eval.EvalUtil.inverseTranslocateIntersection(Lcom/palladium/paf/data/Intersection;Lcom/palladium/paf/funcs/IPafFunction;Lcom/palladium/paf/state/EvalState;)Lcom/palladium/paf/data/Intersection;>
		// at com.palladium.paf.eval.EvalUtil.inverseTranslocateIntersection(EvalUtil.java:262)
		// jtest_unverified
	}

	/**
	 * Test for method: static isLevel0(com.palladium.paf.data.Intersection,com.palladium.paf.state.EvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#isLevel0(com.palladium.paf.data.Intersection,com.palladium.paf.state.EvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsLevel01() throws Throwable {
		// jtest_tested_method
		boolean RETVAL = EvalUtil.isLevel0(
			(Intersection) null,
			(EvalState) null);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.eval.EvalUtil.isLevel0(Lcom/palladium/paf/data/Intersection;Lcom/palladium/paf/state/EvalState;)Z>
		// at com.palladium.paf.eval.EvalUtil.isLevel0(EvalUtil.java:325)
		// jtest_unverified
	}

	/**
	 * Test for method: static isLevel0(com.palladium.paf.data.Intersection,com.palladium.paf.state.EvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#isLevel0(com.palladium.paf.data.Intersection,com.palladium.paf.state.EvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsLevel03() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		EvalState t2 = new EvalState((SliceState) null, t1);
		ClientInitRequest t3 = new ClientInitRequest();
		_f0 = new PafClientState((String) null, t3);
		MemberTreeSet t5 = new MemberTreeSet();
		PafSecurityToken t6 = new PafSecurityToken();
		PafApplicationDef t7 = new PafApplicationDef();
		String[] var1 = new String[] {};
		String[][] var2 = new String[][] { {} };
		UnitOfWork t8 = new UnitOfWork(var1, var2);
		PafPlannerRole t9 = new PafPlannerRole();
		Season t10 = new Season();
		PafPlannerConfig t11 = new PafPlannerConfig();
		t3.setClientType("");
		t3.setClientVersion("");
		t3.setIpAddress("");
		t3.setClientLanguage("");
		_f0.setUowTrees(t5);
		_f0.setSecurityToken(t6);
		_f0.setApp(t7);
		_f0.setUnitOfWork(t8);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setRuleSets(var3);
		Set var4 = (Set) Stubs.makeStubObject(Set.class);
		_f0.setLockedPeriods(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setLockedForwardPlannableInterMap(var5);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setLockedNotPlannableInterMap(var6);
		_f0.setPlannerRole(t9);
		_f0.setPlanSeason(t10);
		_f0.setClientLanguage("");
		Map var7 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setUserSelections(var7);
		Set var8 = (Set) Stubs.makeStubObject(Set.class);
		_f0.setActiveVersions(var8);
		_f0.setPlannerConfig(t11);
		// jtest_tested_method
		boolean RETVAL = EvalUtil.isLevel0((Intersection) null, t2);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.eval.EvalUtil.isLevel0(Lcom/palladium/paf/data/Intersection;Lcom/palladium/paf/state/EvalState;)Z>
		// at com.palladium.paf.eval.EvalUtil.isLevel0(EvalUtil.java:329)
		// jtest_unverified
	}

	/**
	 * Stubs method for testIsLevel03.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsIsLevel03(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
				// at com.palladium.paf.eval.EvalUtil.isLevel0(EvalUtil.java:325)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientState", argument_types)) {
				return _f0;
				// at com.palladium.paf.eval.EvalUtil.isLevel0(EvalUtil.java:325)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static isLevel0(com.palladium.paf.data.Intersection,com.palladium.paf.state.EvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#isLevel0(com.palladium.paf.data.Intersection,com.palladium.paf.state.EvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsLevel04() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		EvalState t2 = new EvalState((SliceState) null, t1);
		Object[] var1 = new Object[] {};
		ListMock t3 = new ListMock(var1);
		RuleGroup t4 = new RuleGroup((Rule[]) null);
		Rule t5 = new Rule();
		Long t6 = new Long("0");
		RuleSet t7 = new RuleSet();
		ClientInitRequest t8 = new ClientInitRequest();
		PafClientState t9 = new PafClientState((String) null, t8);
		MemberTreeSet t10 = new MemberTreeSet();
		PafSecurityToken t11 = new PafSecurityToken();
		PafApplicationDef t12 = new PafApplicationDef();
		String[] var2 = new String[] {};
		String[][] var3 = new String[][] { {} };
		UnitOfWork t13 = new UnitOfWork(var2, var3);
		PafPlannerRole t14 = new PafPlannerRole();
		Season t15 = new Season();
		PafPlannerConfig t16 = new PafPlannerConfig();
		ClientInitRequest t17 = new ClientInitRequest();
		_f0 = new PafClientState((String) null, t17);
		String[] var4 = new String[] {};
		Intersection t19 = Intersection.createIntersection(
			var4,
			(List) null,
			(List) null,
			(List) null);
		t2.setTimePeriodList(t3);
		t2.setRuleGroup(t4);
		t2.setRule(t5);
		t2.setStartTime(t6);
		HashSet var5 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t2.setForcedCalcs(var5);
		HashSet var6 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t2.setRequiredCalcs(var6);
		t2.setMeasureRuleSet(t7);
		t2.setStateChanged(false);
		t8.setClientType("");
		t8.setClientVersion("");
		t8.setIpAddress("");
		t8.setClientLanguage("");
		t9.setUowTrees(t10);
		t9.setSecurityToken(t11);
		t9.setApp(t12);
		t9.setUnitOfWork(t13);
		Map var7 = (Map) Stubs.makeStubObject(Map.class);
		t9.setRuleSets(var7);
		Set var8 = (Set) Stubs.makeStubObject(Set.class);
		t9.setLockedPeriods(var8);
		Map var9 = (Map) Stubs.makeStubObject(Map.class);
		t9.setLockedForwardPlannableInterMap(var9);
		Map var10 = (Map) Stubs.makeStubObject(Map.class);
		t9.setLockedNotPlannableInterMap(var10);
		t9.setPlannerRole(t14);
		t9.setPlanSeason(t15);
		t9.setClientLanguage("");
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		t9.setUserSelections(var11);
		Set var12 = (Set) Stubs.makeStubObject(Set.class);
		t9.setActiveVersions(var12);
		t9.setPlannerConfig(t16);
		t2.setClientState(t9);
		t2.setTimeSliceMode(false);
		// jtest_tested_method
		boolean RETVAL = EvalUtil.isLevel0(t19, t2);
		assertEquals(true, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testIsLevel04.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsIsLevel04(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
				// at com.palladium.paf.eval.EvalUtil.isLevel0(EvalUtil.java:325)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.EvalUtil.isLevel0(EvalUtil.java:325)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientState", argument_types)) {
				return _f0;
				// at com.palladium.paf.eval.EvalUtil.isLevel0(EvalUtil.java:325)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static isLevel0(com.palladium.paf.data.Intersection,com.palladium.paf.state.EvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#isLevel0(com.palladium.paf.data.Intersection,com.palladium.paf.state.EvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsLevel010() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		MemberTreeSet t2 = new MemberTreeSet();
		PafSecurityToken t3 = new PafSecurityToken();
		PafApplicationDef t4 = new PafApplicationDef();
		String[] var1 = new String[] {};
		String[][] var2 = new String[][] { {} };
		UnitOfWork t5 = new UnitOfWork(var1, var2);
		PafPlannerRole t6 = new PafPlannerRole();
		Season t7 = new Season();
		PafPlannerConfig t8 = new PafPlannerConfig();
		EvalState t9 = new EvalState((SliceState) null, t1);
		ClientInitRequest t10 = new ClientInitRequest();
		_f0 = new PafClientState((String) null, t10);
		String[] var3 = new String[] { "" };
		Intersection t12 = Intersection.createIntersection(
			var3,
			(List) null,
			(List) null,
			(List) null);
		_f5 = new MemberTreeSet();
		t0.setClientType("");
		t0.setClientVersion("");
		t0.setIpAddress("");
		t0.setClientLanguage("");
		t1.setUowTrees(t2);
		t1.setSecurityToken(t3);
		t1.setApp(t4);
		t1.setUnitOfWork(t5);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		t1.setRuleSets(var4);
		Set var5 = (Set) Stubs.makeStubObject(Set.class);
		t1.setLockedPeriods(var5);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		t1.setLockedForwardPlannableInterMap(var6);
		Map var7 = (Map) Stubs.makeStubObject(Map.class);
		t1.setLockedNotPlannableInterMap(var7);
		t1.setPlannerRole(t6);
		t1.setPlanSeason(t7);
		t1.setClientLanguage("");
		Map var8 = (Map) Stubs.makeStubObject(Map.class);
		t1.setUserSelections(var8);
		Set var9 = (Set) Stubs.makeStubObject(Set.class);
		t1.setActiveVersions(var9);
		t1.setPlannerConfig(t8);
		// jtest_tested_method
		boolean RETVAL = EvalUtil.isLevel0(t12, t9);
		// NullPointerException thrown
		// at com.palladium.paf.data.Intersection.hashCode(Intersection.java:108)
		// at java.util.HashMap.hash(HashMap.java:264)
		// at java.util.WeakHashMap.getEntry(WeakHashMap.java:370)
		// at java.util.WeakHashMap.containsKey(WeakHashMap.java:361)
		// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:144)
		// jtest_unverified
	}

	/**
	 * Stubs method for testIsLevel010.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsIsLevel010(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
				// at com.palladium.paf.eval.EvalUtil.isLevel0(EvalUtil.java:325)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientState", argument_types)) {
				return _f0;
				// at com.palladium.paf.eval.EvalUtil.isLevel0(EvalUtil.java:325)
			}
		}
		if (Stubs.matches(method, PafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getUowTrees", argument_types)) {
				return _f5;
				// at com.palladium.paf.eval.EvalUtil.isLevel0(EvalUtil.java:325)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static sortIntersectionsByAxis(com.palladium.paf.data.Intersection[],java.lang.String[],com.palladium.paf.SortOrder)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#sortIntersectionsByAxis(com.palladium.paf.data.Intersection[],java.lang.String[],com.palladium.paf.SortOrder)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSortIntersectionsByAxis1() throws Throwable {
		// jtest_tested_method
		Intersection[] RETVAL = EvalUtil.sortIntersectionsByAxis(
			(Intersection[]) null,
			(String[]) null,
			(SortOrder) null);
		// NullPointerException thrown, originator is possible setup problem
		// at java.util.Arrays$ArrayList.<init>
		// at java.util.Arrays.asList
		// at com.palladium.paf.eval.EvalUtil.sortIntersectionsByAxis(EvalUtil.java:109)
		// jtest_unverified
	}

	/**
	 * Test for method: static sortIntersectionsByAxis(com.palladium.paf.data.Intersection[],java.lang.String[],com.palladium.paf.SortOrder)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#sortIntersectionsByAxis(com.palladium.paf.data.Intersection[],java.lang.String[],com.palladium.paf.SortOrder)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSortIntersectionsByAxis2() throws Throwable {
		Intersection[] var1 = new Intersection[] {};
		// jtest_tested_method
		Intersection[] RETVAL = EvalUtil.sortIntersectionsByAxis(
			var1,
			(String[]) null,
			(SortOrder) null);

		// ClassCastException thrown
		// at java.lang.Class.cast(Class.java:2920)
		// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
		// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
		// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
		// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
		// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
		// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
		// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
		// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
		// at com.palladium.paf.eval.EvalUtil.sortIntersectionsByAxis(EvalUtil.java:110)
		// jtest_unverified
	}

	/**
	 * Stubs method for testSortIntersectionsByAxis2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSortIntersectionsByAxis2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafMetaData.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "clearDataCache", argument_types)) {
				throw new PafException();
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
				// at com.palladium.paf.eval.EvalUtil.sortIntersectionsByAxis(EvalUtil.java:110)
			}
		}
		if (Stubs.matches(method, DriverManagerConnectionProvider.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:72)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
				// at com.palladium.paf.eval.EvalUtil.sortIntersectionsByAxis(EvalUtil.java:110)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				throw new SQLException();
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:74)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
				// at com.palladium.paf.eval.EvalUtil.sortIntersectionsByAxis(EvalUtil.java:110)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static sortIntersectionsByAxis(com.palladium.paf.data.Intersection[],java.lang.String[],com.palladium.paf.SortOrder)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#sortIntersectionsByAxis(com.palladium.paf.data.Intersection[],java.lang.String[],com.palladium.paf.SortOrder)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSortIntersectionsByAxis3() throws Throwable {
		Object[] var1 = new Object[] {};
		_f4 = new ListMock(var1);
		// jtest_tested_method
		Intersection[] RETVAL = EvalUtil.sortIntersectionsByAxis(
			(Intersection[]) null,
			(String[]) null,
			(SortOrder) null);
		// NullPointerException thrown
		// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1199)
		// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
		// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
		// at com.palladium.paf.eval.EvalUtil.sortIntersectionsByAxis(EvalUtil.java:110)
		// jtest_unverified
	}

	/**
	 * Stubs method for testSortIntersectionsByAxis3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSortIntersectionsByAxis3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Arrays.class)) {
			argument_types = new Class[] { Object[].class };
			if (Stubs.matches(method, "asList", argument_types)) {
				return _f4;
				// at com.palladium.paf.eval.EvalUtil.sortIntersectionsByAxis(EvalUtil.java:109)
			}
		}
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(PafAppService.class);
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
				// at com.palladium.paf.eval.EvalUtil.sortIntersectionsByAxis(EvalUtil.java:110)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
				// at com.palladium.paf.eval.EvalUtil.sortIntersectionsByAxis(EvalUtil.java:110)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static sortIntersectionsByAxis(com.palladium.paf.data.Intersection[],java.lang.String[],com.palladium.paf.SortOrder)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#sortIntersectionsByAxis(com.palladium.paf.data.Intersection[],java.lang.String[],com.palladium.paf.SortOrder)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSortIntersectionsByAxis4() throws Throwable {
		Intersection[] var1 = new Intersection[] {};
		// jtest_tested_method
		Intersection[] RETVAL = EvalUtil.sortIntersectionsByAxis(
			var1,
			(String[]) null,
			(SortOrder) null);
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0, RETVAL.length); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testSortIntersectionsByAxis4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSortIntersectionsByAxis4(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1189)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
				// at com.palladium.paf.eval.EvalUtil.sortIntersectionsByAxis(EvalUtil.java:110)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static sortIntersectionsByAxis(com.palladium.paf.data.Intersection[],java.lang.String[],com.palladium.paf.SortOrder)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#sortIntersectionsByAxis(com.palladium.paf.data.Intersection[],java.lang.String[],com.palladium.paf.SortOrder)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSortIntersectionsByAxis6() throws Throwable {
		Intersection[] var1 = new Intersection[] { null };
		// jtest_tested_method
		Intersection[] RETVAL = EvalUtil.sortIntersectionsByAxis(
			var1,
			(String[]) null,
			(SortOrder) null);
		assertEquals(null, var1[0]); // jtest_unverified
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(1, RETVAL.length); // jtest_unverified
		assertEquals(null, RETVAL[0]); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static sortIntersectionsByAxis(com.palladium.paf.data.Intersection[],java.lang.String[],com.palladium.paf.SortOrder)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#sortIntersectionsByAxis(com.palladium.paf.data.Intersection[],java.lang.String[],com.palladium.paf.SortOrder)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSortIntersectionsByAxis7() throws Throwable {
		Object[] var1 = new Object[] { null, null, null, null, null, null, null };
		_f4 = new ListMock(var1);
		// jtest_tested_method
		Intersection[] RETVAL = EvalUtil.sortIntersectionsByAxis(
			(Intersection[]) null,
			(String[]) null,
			(SortOrder) null);
		// NullPointerException thrown
		// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:58)
		// at java.util.Arrays.mergeSort(Arrays.java:1284)
		// at java.util.Arrays.mergeSort(Arrays.java:1295)
		// at java.util.Arrays.sort(Arrays.java:1223)
		// at java.util.Collections.sort(Collections.java:159)
		// at com.palladium.paf.eval.EvalUtil.sortIntersectionsByAxis(EvalUtil.java:110)
		// jtest_unverified
	}

	/**
	 * Stubs method for testSortIntersectionsByAxis7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSortIntersectionsByAxis7(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Arrays.class)) {
			argument_types = new Class[] { Object[].class };
			if (Stubs.matches(method, "asList", argument_types)) {
				return _f4;
				// at com.palladium.paf.eval.EvalUtil.sortIntersectionsByAxis(EvalUtil.java:109)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static translocateIntersection(com.palladium.paf.data.Intersection,com.palladium.paf.funcs.IPafFunction,com.palladium.paf.state.EvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#translocateIntersection(com.palladium.paf.data.Intersection,com.palladium.paf.funcs.IPafFunction,com.palladium.paf.state.EvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testTranslocateIntersection1() throws Throwable {
		// jtest_tested_method
		Intersection RETVAL = EvalUtil.translocateIntersection(
			(Intersection) null,
			(IPafFunction) null,
			(EvalState) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.eval.EvalUtil.translocateIntersection(Lcom/palladium/paf/data/Intersection;Lcom/palladium/paf/funcs/IPafFunction;Lcom/palladium/paf/state/EvalState;)Lcom/palladium/paf/data/Intersection;>
		// at com.palladium.paf.eval.EvalUtil.translocateIntersection(EvalUtil.java:277)
		// jtest_unverified
	}

	/**
	 * Test for method: static translocateIntersection(com.palladium.paf.data.Intersection,com.palladium.paf.funcs.IPafFunction,com.palladium.paf.state.EvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#translocateIntersection(com.palladium.paf.data.Intersection,com.palladium.paf.funcs.IPafFunction,com.palladium.paf.state.EvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testTranslocateIntersection2() throws Throwable {
		String[] var1 = new String[] { null, null, null, null, null, null,
				null, null, null };
		Intersection t0 = Intersection.createIntersection(
			var1,
			(List) null,
			(List) null,
			(List) null);
		// jtest_tested_method
		Intersection RETVAL = EvalUtil.translocateIntersection(
			t0,
			(IPafFunction) null,
			(EvalState) null);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.eval.EvalUtil.translocateIntersection(Lcom/palladium/paf/data/Intersection;Lcom/palladium/paf/funcs/IPafFunction;Lcom/palladium/paf/state/EvalState;)Lcom/palladium/paf/data/Intersection;>
		// at com.palladium.paf.eval.EvalUtil.translocateIntersection(EvalUtil.java:283)
		// jtest_unverified
	}

	/**
	 * Test for method: static translocateIntersection(com.palladium.paf.data.Intersection,com.palladium.paf.funcs.IPafFunction,com.palladium.paf.state.EvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#translocateIntersection(com.palladium.paf.data.Intersection,com.palladium.paf.funcs.IPafFunction,com.palladium.paf.state.EvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testTranslocateIntersection4() throws Throwable {
		String[] var1 = new String[] {};
		Intersection t0 = Intersection.createIntersection(
			var1,
			(List) null,
			(List) null,
			(List) null);
		IPafFunction var2 = (IPafFunction) Stubs
			.makeStubObject(IPafFunction.class);
		// jtest_tested_method
		Intersection RETVAL = EvalUtil.translocateIntersection(
			t0,
			var2,
			(EvalState) null);
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.eval.EvalUtil.translocateIntersection(EvalUtil.java:286)
		// jtest_unverified
	}

	/**
	 * Stubs method for testTranslocateIntersection4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsTranslocateIntersection4(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, IPafFunction.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getParms", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.funcs.IPafFunction.getParms()");
				switch (index) {
					case 1 :
					case 2 :
						return new String[0];
					// at com.palladium.paf.eval.EvalUtil.translocateIntersection(EvalUtil.java:283)
					case 3 :
						return null;
					// at com.palladium.paf.eval.EvalUtil.translocateIntersection(EvalUtil.java:286)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static translocateIntersection(com.palladium.paf.data.Intersection,com.palladium.paf.funcs.IPafFunction,com.palladium.paf.state.EvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalUtil#translocateIntersection(com.palladium.paf.data.Intersection,com.palladium.paf.funcs.IPafFunction,com.palladium.paf.state.EvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testTranslocateIntersection8() throws Throwable {
		String[] var1 = new String[] {};
		Intersection t0 = Intersection.createIntersection(
			var1,
			(List) null,
			(List) null,
			(List) null);
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState((SliceState) null, t2);
		ClientInitRequest t4 = new ClientInitRequest();
		_f0 = new PafClientState((String) null, t4);
		MemberTreeSet t6 = new MemberTreeSet();
		PafSecurityToken t7 = new PafSecurityToken();
		PafApplicationDef t8 = new PafApplicationDef();
		String[] var2 = new String[] { "", null, null, null, null, null, null };
		String[][] var3 = new String[][] {
				{ null, null, null, null, null, null, null }, null, null, null,
				null, null, null };
		UnitOfWork t9 = new UnitOfWork(var2, var3);
		PafPlannerRole t10 = new PafPlannerRole();
		Season t11 = new Season();
		PafPlannerConfig t12 = new PafPlannerConfig();
		t4.setClientType("");
		t4.setClientVersion("");
		t4.setIpAddress("");
		t4.setClientLanguage("");
		_f0.setUowTrees(t6);
		_f0.setSecurityToken(t7);
		_f0.setApp(t8);
		_f0.setUnitOfWork(t9);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setRuleSets(var4);
		Set var5 = (Set) Stubs.makeStubObject(Set.class);
		_f0.setLockedPeriods(var5);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setLockedForwardPlannableInterMap(var6);
		Map var7 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setLockedNotPlannableInterMap(var7);
		_f0.setPlannerRole(t10);
		_f0.setPlanSeason(t11);
		_f0.setClientLanguage("");
		Map var8 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setUserSelections(var8);
		Set var9 = (Set) Stubs.makeStubObject(Set.class);
		_f0.setActiveVersions(var9);
		_f0.setPlannerConfig(t12);
		IPafFunction var10 = (IPafFunction) Stubs
			.makeStubObject(IPafFunction.class);
		// jtest_tested_method
		Intersection RETVAL = EvalUtil.translocateIntersection(t0, var10, t3);
		// NullPointerException thrown
		// at com.palladium.paf.eval.EvalUtil.translocateIntersection(EvalUtil.java:284)
		// jtest_unverified
	}

	/**
	 * Stubs method for testTranslocateIntersection8.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsTranslocateIntersection8(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, IPafFunction.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getParms", argument_types)) {
				return new String[1];
				// at com.palladium.paf.eval.EvalUtil.translocateIntersection(EvalUtil.java:283)
			}
		}
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
				// at com.palladium.paf.eval.EvalUtil.translocateIntersection(EvalUtil.java:284)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientState", argument_types)) {
				return _f0;
				// at com.palladium.paf.eval.EvalUtil.translocateIntersection(EvalUtil.java:284)
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
     * Usage: java com.palladium.paf.eval.EvalUtilTest
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
            EvalUtilTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.eval.EvalUtil",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return EvalUtil.class;
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
private PafApplicationDef _f1;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private com.palladium.paf.data.Intersection _f2;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private Intersection _f3;
    	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafClientState _f0;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private ListMock _f4;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private MemberTreeSet _f5;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private MdbDef _f6;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private com.palladium.paf.data.Intersection _f7;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafApplicationDef _f8;
}

// JTEST_CURRENT_ID=-1745758267.