/*
 * ES_AggregateTest.java
 * Created by Jtest on 9/19/06 6:10:00 PM.
 * Updated by Jtest on 10/18/06 2:40:11 PM, 11 test cases added, 4 test cases removed.
 * Updated by Jtest on 11/9/06 1:35:35 AM, 9 test cases added, 9 test cases removed.
 */

package com.palladium.paf.eval;

import java.sql.SQLException;
import java.util.Properties;
import java.sql.DriverManager;
import com.palladium.paf.server.PafAppService;
import com.palladium.paf.app.MeasureType;
import com.palladium.paf.app.MeasureDef;
import java.util.HashSet;
import com.palladium.paf.rules.RuleSet;
import com.palladium.paf.rules.RuleGroup;
import jtest.mocks.java.util.ListMock;
import com.palladium.paf.app.MeasureFunctionFactory;
import com.palladium.paf.rules.Formula;
import java.util.Map;
import com.palladium.paf.app.PlanCycle;
import com.palladium.paf.app.MdbDef;
import com.palladium.paf.app.SeasonList;
import com.palladium.paf.app.PafApplicationDef;
import com.palladium.paf.state.SliceState;
import com.palladium.paf.state.PafClientState;
import com.palladium.paf.comm.ClientInitRequest;
import com.palladium.paf.server.PafDataService;
import org.hibernate.connection.DriverManagerConnectionProvider;
import com.palladium.paf.rules.Rule;
import java.lang.reflect.Member;
import jtest.Stubs;
import com.palladium.paf.mdb.PafDataCache;
import com.palladium.paf.state.EvalState;
import com.palladium.paf.eval.ES_Aggregate;

/**
 * ES_AggregateTest is a unit test class for class ES_Aggregate.
 * @see com.palladium.paf.eval.ES_Aggregate
 * @author Parasoft Jtest 8.0
 */
public class ES_AggregateTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public ES_AggregateTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }

	/**
	 * Test for method: ES_Aggregate()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_Aggregate#ES_Aggregate()
	 * @author Parasoft Jtest 8.0
	 */
	public void testES_Aggregate1() throws Throwable {
		// jtest_tested_method
		ES_Aggregate THIS = new ES_Aggregate();
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
		// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
		// at com.palladium.paf.eval.ES_Aggregate.<init>(ES_Aggregate.java:50)
		// jtest_unverified
	}

	/**
	 * Stubs method for testES_Aggregate1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsES_Aggregate1(Member method, Object _this, Object[] args)
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
				// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
				// at com.palladium.paf.eval.ES_Aggregate.<init>(ES_Aggregate.java:50)
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
				// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
				// at com.palladium.paf.eval.ES_Aggregate.<init>(ES_Aggregate.java:50)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: ES_Aggregate()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_Aggregate#ES_Aggregate()
	 * @author Parasoft Jtest 8.0
	 */
	public void testES_Aggregate3() throws Throwable {
		// jtest_tested_method
		ES_Aggregate THIS = new ES_Aggregate();
		// NullPointerException thrown
		// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1199)
		// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
		// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
		// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
		// at com.palladium.paf.eval.ES_Aggregate.<init>(ES_Aggregate.java:50)
		// jtest_unverified
	}

	/**
	 * Stubs method for testES_Aggregate3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsES_Aggregate3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(PafAppService.class);
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
				// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
				// at com.palladium.paf.eval.ES_Aggregate.<init>(ES_Aggregate.java:50)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
				// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
				// at com.palladium.paf.eval.ES_Aggregate.<init>(ES_Aggregate.java:50)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: ES_Aggregate()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_Aggregate#ES_Aggregate()
	 * @author Parasoft Jtest 8.0
	 */
	public void testES_Aggregate4() throws Throwable {
		// jtest_tested_method
		ES_Aggregate THIS = new ES_Aggregate();
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testES_Aggregate4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsES_Aggregate4(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1189)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
				// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
				// at com.palladium.paf.eval.ES_Aggregate.<init>(ES_Aggregate.java:50)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_Aggregate#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation1() throws Throwable {
		ES_Aggregate THIS = new ES_Aggregate();
		// jtest_tested_method
		THIS.performEvaluation(
			(EvalState) null,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.eval.ES_Aggregate.performEvaluation(Lcom/palladium/paf/state/EvalState;Lcom/palladium/paf/mdb/PafDataCache;Lcom/palladium/paf/eval/IFormulaEvalEngine;)V>
		// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:62)
		// jtest_unverified
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_Aggregate#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation3() throws Throwable {
		ES_Aggregate THIS = new ES_Aggregate();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState((SliceState) null, t2);
		_f0 = new Rule();
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown
		// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:66)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPerformEvaluation3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPerformEvaluation3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
				// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:62)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				return _f0;
				// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:62)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureName", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:64)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:66)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_Aggregate#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation4() throws Throwable {
		ES_Aggregate THIS = new ES_Aggregate();
		_f0 = new Rule();
		_f1 = new PafApplicationDef();
		SeasonList t3 = new SeasonList();
		MdbDef t4 = new MdbDef();
		_f1.setSeasonList(t3);
		_f1.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f1.setPlanCycles(var1);
		_f1.setLastPeriod("");
		_f1.setCurrentYear("");
		t4.setYearDim("");
		String[] var2 = new String[] {};
		t4.setHierDims(var2);
		t4.setMeasureDim("");
		t4.setPlanTypeDim("");
		t4.setTimeDim("");
		t4.setVersionDim("");
		t4.setDataSourceId("");
		String[] var3 = new String[] {};
		t4.setAxisPriority(var3);
		_f1.setMdbDef(t4);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setVersions(var5);
		EvalState var6 = (EvalState) Stubs.makeStubObject(EvalState.class);
		// jtest_tested_method
		THIS.performEvaluation(
			var6,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// ClassCastException thrown
		// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:67)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPerformEvaluation4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPerformEvaluation4(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				return _f0;
				// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:62)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureName", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:64)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f1;
				// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:66)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:67)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_Aggregate#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation5() throws Throwable {
		ES_Aggregate THIS = new ES_Aggregate();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState((SliceState) null, t2);
		_f0 = new Rule();
		Formula t5 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		Boolean t6 = new Boolean((String) null);
		_f0.setKey(0);
		_f0.setFormula(t5);
		String[] var1 = new String[] {};
		_f0.setTriggerMeasures(var1);
		_f0.setSkipAggregation(false);
		_f0.setSkipAllocation(false);
		_f0.setBaseAllocateMeasure("");
		_f0.setLockAllocation(false);
		_f0.setEvalLockedIntersections(false);
		_f0.setCalcAllPeriods(false);
		_f0.setLockSystemEvaluationResult(false);
		_f0.setLockUserEvaluationResult(t6);
		_f0.setLockAllPriorTime(false);
		_f0.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testPerformEvaluation5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPerformEvaluation5(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
				// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:62)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				return _f0;
				// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:62)
			}
		}
		if (Stubs.matches(method, Rule.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isSkipAggregation", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:62)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_Aggregate#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation8() throws Throwable {
		ES_Aggregate THIS = new ES_Aggregate();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState((SliceState) null, t2);
		_f0 = new Rule();
		_f1 = new PafApplicationDef();
		SeasonList t6 = new SeasonList();
		MdbDef t7 = new MdbDef();
		_f2 = new MeasureDef((String) null, (MeasureType) null);
		_f3 = new PafApplicationDef();
		SeasonList t10 = new SeasonList();
		MdbDef t11 = new MdbDef();
		_f1.setSeasonList(t6);
		_f1.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f1.setPlanCycles(var1);
		_f1.setLastPeriod("");
		_f1.setCurrentYear("");
		_f1.setMdbDef(t7);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setMeasures(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setVersions(var3);
		_f3.setSeasonList(t10);
		_f3.setAppId("");
		PlanCycle[] var4 = new PlanCycle[] {};
		_f3.setPlanCycles(var4);
		_f3.setLastPeriod("");
		_f3.setCurrentYear("");
		t11.setYearDim("");
		String[] var5 = new String[] {};
		t11.setHierDims(var5);
		t11.setMeasureDim("");
		t11.setPlanTypeDim("");
		t11.setTimeDim("");
		t11.setVersionDim("");
		t11.setDataSourceId("");
		String[] var6 = new String[] {};
		t11.setAxisPriority(var6);
		_f3.setMdbDef(t11);
		Map var7 = (Map) Stubs.makeStubObject(Map.class);
		_f3.setMeasures(var7);
		Map var8 = (Map) Stubs.makeStubObject(Map.class);
		_f3.setVersions(var8);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown
		// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:82)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPerformEvaluation8.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPerformEvaluation8(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
				// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:62)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				return _f0;
				// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:62)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureName", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:64)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:66)
					case 2 :
						return _f3;
					// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:81)
					case 3 :
						return null;
					// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:82)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f2;
				// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:67)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_Aggregate#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation9() throws Throwable {
		ES_Aggregate THIS = new ES_Aggregate();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState((SliceState) null, t2);
		Object[] var1 = new Object[] {};
		ListMock t4 = new ListMock(var1);
		RuleGroup t5 = new RuleGroup();
		Rule t6 = new Rule();
		Long t7 = new Long("0");
		RuleSet t8 = new RuleSet();
		ClientInitRequest t9 = new ClientInitRequest();
		PafClientState t10 = new PafClientState((String) null, t9);
		_f0 = new Rule();
		Formula t12 = new Formula();
		Boolean t13 = new Boolean((String) null);
		_f1 = new PafApplicationDef();
		SeasonList t15 = new SeasonList();
		MdbDef t16 = new MdbDef();
		_f3 = new PafApplicationDef();
		SeasonList t18 = new SeasonList();
		MdbDef t19 = new MdbDef();
		_f4 = new PafApplicationDef();
		SeasonList t21 = new SeasonList();
		MdbDef t22 = new MdbDef();
		t3.setTimePeriodList(t4);
		t3.setRuleGroup(t5);
		t3.setRule(t6);
		t3.setStartTime(t7);
		HashSet var2 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setForcedCalcs(var2);
		HashSet var3 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setRequiredCalcs(var3);
		t8.setDimension("");
		t8.setType(0);
		t8.setName("");
		String[] var4 = new String[] {};
		t8.setMeasureList(var4);
		t3.setMeasureRuleSet(t8);
		t3.setStateChanged(false);
		t3.setClientState(t10);
		t3.setTimeSliceMode(false);
		_f0.setKey(0);
		_f0.setFormula(t12);
		String[] var5 = new String[] {};
		_f0.setTriggerMeasures(var5);
		_f0.setSkipAggregation(false);
		_f0.setSkipAllocation(false);
		_f0.setBaseAllocateMeasure("");
		_f0.setLockAllocation(false);
		_f0.setEvalLockedIntersections(false);
		_f0.setCalcAllPeriods(false);
		_f0.setLockSystemEvaluationResult(false);
		_f0.setLockUserEvaluationResult(t13);
		_f0.setLockAllPriorTime(false);
		_f0.setInitialTBFirstAllocation(false);
		_f1.setSeasonList(t15);
		_f1.setAppId("");
		PlanCycle[] var6 = new PlanCycle[] {};
		_f1.setPlanCycles(var6);
		_f1.setLastPeriod("");
		_f1.setCurrentYear("");
		_f1.setMdbDef(t16);
		Map var7 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setMeasures(var7);
		Map var8 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setVersions(var8);
		_f3.setSeasonList(t18);
		_f3.setAppId("");
		PlanCycle[] var9 = new PlanCycle[] {};
		_f3.setPlanCycles(var9);
		_f3.setLastPeriod("");
		_f3.setCurrentYear("");
		t19.setYearDim("");
		String[] var10 = new String[] {};
		t19.setHierDims(var10);
		t19.setMeasureDim("");
		t19.setPlanTypeDim("");
		t19.setTimeDim("");
		t19.setVersionDim("");
		t19.setDataSourceId("");
		String[] var11 = new String[] {};
		t19.setAxisPriority(var11);
		_f3.setMdbDef(t19);
		Map var12 = (Map) Stubs.makeStubObject(Map.class);
		_f3.setMeasures(var12);
		Map var13 = (Map) Stubs.makeStubObject(Map.class);
		_f3.setVersions(var13);
		_f4.setSeasonList(t21);
		_f4.setAppId("");
		PlanCycle[] var14 = new PlanCycle[] {};
		_f4.setPlanCycles(var14);
		_f4.setLastPeriod("");
		_f4.setCurrentYear("");
		t22.setYearDim("");
		String[] var15 = new String[] {};
		t22.setHierDims(var15);
		t22.setMeasureDim("");
		t22.setPlanTypeDim("");
		t22.setTimeDim("");
		t22.setVersionDim("");
		t22.setDataSourceId("");
		String[] var16 = new String[] {};
		t22.setAxisPriority(var16);
		_f4.setMdbDef(t22);
		Map var17 = (Map) Stubs.makeStubObject(Map.class);
		_f4.setMeasures(var17);
		Map var18 = (Map) Stubs.makeStubObject(Map.class);
		_f4.setVersions(var18);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown
		// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:88)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPerformEvaluation9.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPerformEvaluation9(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
				// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:62)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:62)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				return _f0;
				// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:62)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureName", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:64)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:66)
					case 2 :
						return _f3;
					// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:81)
					case 3 :
						return _f4;
					// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:82)
					case 4 :
						return null;
					// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:88)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:67)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_Aggregate#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation10() throws Throwable {
		ES_Aggregate THIS = new ES_Aggregate();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState((SliceState) null, t2);
		_f0 = new Rule();
		_f1 = new PafApplicationDef();
		SeasonList t6 = new SeasonList();
		MdbDef t7 = new MdbDef();
		_f2 = new MeasureDef((String) null, (MeasureType) null);
		_f3 = new PafApplicationDef();
		SeasonList t10 = new SeasonList();
		MdbDef t11 = new MdbDef();
		_f4 = new PafApplicationDef();
		SeasonList t13 = new SeasonList();
		MdbDef t14 = new MdbDef();
		_f5 = new PafApplicationDef();
		SeasonList t16 = new SeasonList();
		MdbDef t17 = new MdbDef();
		_f1.setSeasonList(t6);
		_f1.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f1.setPlanCycles(var1);
		_f1.setLastPeriod("");
		_f1.setCurrentYear("");
		_f1.setMdbDef(t7);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setMeasures(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setVersions(var3);
		_f3.setSeasonList(t10);
		_f3.setAppId("");
		PlanCycle[] var4 = new PlanCycle[] {};
		_f3.setPlanCycles(var4);
		_f3.setLastPeriod("");
		_f3.setCurrentYear("");
		t11.setYearDim("");
		String[] var5 = new String[] {};
		t11.setHierDims(var5);
		t11.setMeasureDim("");
		t11.setPlanTypeDim("");
		t11.setTimeDim("");
		t11.setVersionDim("");
		t11.setDataSourceId("");
		String[] var6 = new String[] {};
		t11.setAxisPriority(var6);
		_f3.setMdbDef(t11);
		Map var7 = (Map) Stubs.makeStubObject(Map.class);
		_f3.setMeasures(var7);
		Map var8 = (Map) Stubs.makeStubObject(Map.class);
		_f3.setVersions(var8);
		_f4.setSeasonList(t13);
		_f4.setAppId("");
		PlanCycle[] var9 = new PlanCycle[] {};
		_f4.setPlanCycles(var9);
		_f4.setLastPeriod("");
		_f4.setCurrentYear("");
		t14.setYearDim("");
		String[] var10 = new String[] {};
		t14.setHierDims(var10);
		t14.setMeasureDim("");
		t14.setPlanTypeDim("");
		t14.setTimeDim("");
		t14.setVersionDim("");
		t14.setDataSourceId("");
		String[] var11 = new String[] {};
		t14.setAxisPriority(var11);
		_f4.setMdbDef(t14);
		Map var12 = (Map) Stubs.makeStubObject(Map.class);
		_f4.setMeasures(var12);
		Map var13 = (Map) Stubs.makeStubObject(Map.class);
		_f4.setVersions(var13);
		_f5.setSeasonList(t16);
		_f5.setAppId("");
		PlanCycle[] var14 = new PlanCycle[] {};
		_f5.setPlanCycles(var14);
		_f5.setLastPeriod("");
		_f5.setCurrentYear("");
		_f5.setMdbDef(t17);
		Map var15 = (Map) Stubs.makeStubObject(Map.class);
		_f5.setMeasures(var15);
		Map var16 = (Map) Stubs.makeStubObject(Map.class);
		_f5.setVersions(var16);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown
		// at com.palladium.paf.eval.ES_Aggregate.aggregateDimension(ES_Aggregate.java:124)
		// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:103)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPerformEvaluation10.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPerformEvaluation10(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "loadApplications", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
				// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
				// at com.palladium.paf.eval.ES_Aggregate.<init>(ES_Aggregate.java:50)
			}
		}
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(PafAppService.class);
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// at com.palladium.paf.eval.ES_Aggregate.<init>(ES_Aggregate.java:53)
			}
		}
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
				// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:62)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				return _f0;
				// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:62)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureName", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:64)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:66)
					case 2 :
						return _f3;
					// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:81)
					case 3 :
						return _f4;
					// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:82)
					case 4 :
						return _f5;
					// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:88)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDataCacheTrees", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_Aggregate.aggregateDimension(ES_Aggregate.java:124)
				// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:103)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f2;
				// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:67)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_Aggregate#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation11() throws Throwable {
		ES_Aggregate THIS = new ES_Aggregate();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState((SliceState) null, t2);
		Object[] var1 = new Object[] {};
		ListMock t4 = new ListMock(var1);
		RuleGroup t5 = new RuleGroup();
		Rule t6 = new Rule();
		Long t7 = new Long("0");
		RuleSet t8 = new RuleSet();
		ClientInitRequest t9 = new ClientInitRequest();
		PafClientState t10 = new PafClientState((String) null, t9);
		_f0 = new Rule();
		Formula t12 = new Formula((String) null, (String) null);
		Boolean t13 = new Boolean((String) null);
		_f1 = new PafApplicationDef();
		SeasonList t15 = new SeasonList();
		MdbDef t16 = new MdbDef();
		_f3 = new PafApplicationDef();
		SeasonList t18 = new SeasonList();
		MdbDef t19 = new MdbDef();
		_f4 = new PafApplicationDef();
		SeasonList t21 = new SeasonList();
		MdbDef t22 = new MdbDef();
		_f5 = new PafApplicationDef();
		SeasonList t24 = new SeasonList();
		MdbDef t25 = new MdbDef();
		t3.setTimePeriodList(t4);
		t3.setRuleGroup(t5);
		t3.setRule(t6);
		t3.setStartTime(t7);
		HashSet var2 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setForcedCalcs(var2);
		HashSet var3 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setRequiredCalcs(var3);
		t8.setDimension("");
		t8.setType(0);
		t8.setName("");
		String[] var4 = new String[] {};
		t8.setMeasureList(var4);
		t3.setMeasureRuleSet(t8);
		t3.setStateChanged(false);
		t3.setClientState(t10);
		t3.setTimeSliceMode(false);
		_f0.setKey(0);
		_f0.setFormula(t12);
		String[] var5 = new String[] {};
		_f0.setTriggerMeasures(var5);
		_f0.setSkipAggregation(false);
		_f0.setSkipAllocation(false);
		_f0.setBaseAllocateMeasure("");
		_f0.setLockAllocation(false);
		_f0.setEvalLockedIntersections(false);
		_f0.setCalcAllPeriods(false);
		_f0.setLockSystemEvaluationResult(false);
		_f0.setLockUserEvaluationResult(t13);
		_f0.setLockAllPriorTime(false);
		_f0.setInitialTBFirstAllocation(false);
		_f1.setSeasonList(t15);
		_f1.setAppId("");
		PlanCycle[] var6 = new PlanCycle[] {};
		_f1.setPlanCycles(var6);
		_f1.setLastPeriod("");
		_f1.setCurrentYear("");
		_f1.setMdbDef(t16);
		Map var7 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setMeasures(var7);
		Map var8 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setVersions(var8);
		_f3.setSeasonList(t18);
		_f3.setAppId("");
		PlanCycle[] var9 = new PlanCycle[] {};
		_f3.setPlanCycles(var9);
		_f3.setLastPeriod("");
		_f3.setCurrentYear("");
		t19.setYearDim("");
		String[] var10 = new String[] {};
		t19.setHierDims(var10);
		t19.setMeasureDim("");
		t19.setPlanTypeDim("");
		t19.setTimeDim("");
		t19.setVersionDim("");
		t19.setDataSourceId("");
		String[] var11 = new String[] {};
		t19.setAxisPriority(var11);
		_f3.setMdbDef(t19);
		Map var12 = (Map) Stubs.makeStubObject(Map.class);
		_f3.setMeasures(var12);
		Map var13 = (Map) Stubs.makeStubObject(Map.class);
		_f3.setVersions(var13);
		_f4.setSeasonList(t21);
		_f4.setAppId("");
		PlanCycle[] var14 = new PlanCycle[] {};
		_f4.setPlanCycles(var14);
		_f4.setLastPeriod("");
		_f4.setCurrentYear("");
		_f4.setMdbDef(t22);
		Map var15 = (Map) Stubs.makeStubObject(Map.class);
		_f4.setMeasures(var15);
		Map var16 = (Map) Stubs.makeStubObject(Map.class);
		_f4.setVersions(var16);
		_f5.setSeasonList(t24);
		_f5.setAppId("");
		PlanCycle[] var17 = new PlanCycle[] {};
		_f5.setPlanCycles(var17);
		_f5.setLastPeriod("");
		_f5.setCurrentYear("");
		t25.setYearDim("");
		String[] var18 = new String[] {};
		t25.setHierDims(var18);
		t25.setMeasureDim("");
		t25.setPlanTypeDim("");
		t25.setTimeDim("");
		t25.setVersionDim("");
		t25.setDataSourceId("");
		String[] var19 = new String[] {};
		t25.setAxisPriority(var19);
		_f5.setMdbDef(t25);
		Map var20 = (Map) Stubs.makeStubObject(Map.class);
		_f5.setMeasures(var20);
		Map var21 = (Map) Stubs.makeStubObject(Map.class);
		_f5.setVersions(var21);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown
		// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:99)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPerformEvaluation11.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPerformEvaluation11(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
				// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:62)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:62)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				return _f0;
				// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:62)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureName", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:64)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:66)
					case 2 :
						return _f3;
					// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:81)
					case 3 :
						return _f4;
					// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:82)
					case 4 :
						return _f5;
					// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:88)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_Aggregate.performEvaluation(ES_Aggregate.java:67)
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
     * Usage: java com.palladium.paf.eval.ES_AggregateTest
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
            ES_AggregateTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.eval.ES_Aggregate",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return ES_Aggregate.class;
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
private Rule _f0;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafApplicationDef _f1;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private MeasureDef _f2;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafApplicationDef _f3;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafApplicationDef _f4;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafApplicationDef _f5;
}

// JTEST_CURRENT_ID=-1115299415.