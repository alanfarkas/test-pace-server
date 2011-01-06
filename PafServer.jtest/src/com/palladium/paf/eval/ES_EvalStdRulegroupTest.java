/*
 * ES_EvalStdRulegroupTest.java
 * Created by Jtest on 9/19/06 10:05:53 AM.
 * Updated by Jtest on 10/18/06 4:21:24 PM, 29 test cases added, 1 test case removed.
 * Updated by Jtest on 11/8/06 10:16:32 PM, 29 test cases added, 27 test cases removed.
 */

package com.palladium.paf.eval;

import com.palladium.paf.app.PafDimSpec;
import com.palladium.paf.comm.PafPlannerConfig;
import com.palladium.paf.app.Season;
import com.palladium.paf.app.PafPlannerRole;
import com.palladium.paf.app.UnitOfWork;
import com.palladium.paf.PafSecurityToken;
import com.palladium.paf.data.MemberTreeSet;
import com.palladium.paf.server.RuleMngr;
import com.palladium.paf.PafException;
import java.util.List;
import com.palladium.paf.data.Intersection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import com.palladium.paf.funcs.CustomFunctionDef;
import java.util.HashSet;
import com.palladium.paf.app.MeasureFunctionFactory;
import com.palladium.paf.rules.Formula;
import com.palladium.paf.rules.RuleSet;
import com.palladium.paf.rules.RuleGroup;
import jtest.mocks.java.util.ListMock;
import com.palladium.paf.rules.Rule;
import com.palladium.paf.server.PafDataService;
import java.util.Map;
import com.palladium.paf.app.PlanCycle;
import com.palladium.paf.app.MdbDef;
import com.palladium.paf.app.SeasonList;
import com.palladium.paf.state.SliceState;
import com.palladium.paf.state.PafClientState;
import com.palladium.paf.comm.ClientInitRequest;
import com.palladium.paf.server.PafAppService;
import com.palladium.paf.app.PafApplicationDef;
import jtest.Stubs;
import java.lang.reflect.Member;
import com.palladium.paf.mdb.PafDataCache;
import com.palladium.paf.state.EvalState;
import com.palladium.paf.eval.ES_EvalStdRulegroup;

/**
 * ES_EvalStdRulegroupTest is a unit test class for class ES_EvalStdRulegroup.
 * @see com.palladium.paf.eval.ES_EvalStdRulegroup
 * @author Parasoft Jtest 8.0
 */
public class ES_EvalStdRulegroupTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public ES_EvalStdRulegroupTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }
	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalStdRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation1() throws Throwable {
		ES_EvalStdRulegroup THIS = new ES_EvalStdRulegroup();
		// jtest_tested_method
		THIS.performEvaluation(
			(EvalState) null,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(Lcom/palladium/paf/state/EvalState;Lcom/palladium/paf/mdb/PafDataCache;Lcom/palladium/paf/eval/IFormulaEvalEngine;)V>
		// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPerformEvaluation1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPerformEvaluation1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
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
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.<init>(ES_EvalStdRulegroup.java:48)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
				// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.<init>(ES_EvalStdRulegroup.java:48)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalStdRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation2() throws Throwable {
		ES_EvalStdRulegroup THIS = new ES_EvalStdRulegroup();
		EvalState var1 = (EvalState) Stubs.makeStubObject(EvalState.class);
		// jtest_tested_method
		THIS.performEvaluation(
			var1,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
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
		// at com.palladium.paf.eval.ES_EvalStdRulegroup.<init>(ES_EvalStdRulegroup.java:48)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPerformEvaluation2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPerformEvaluation2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalStdRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation5() throws Throwable {
		ES_EvalStdRulegroup THIS = new ES_EvalStdRulegroup();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState((SliceState) null, t2);
		_f0 = new PafApplicationDef();
		_f24 = new MdbDef();
		_f24.setYearDim("");
		String[] var1 = new String[] {};
		_f24.setHierDims(var1);
		_f24.setMeasureDim("");
		_f24.setPlanTypeDim("");
		_f24.setTimeDim("");
		_f24.setVersionDim("");
		_f24.setDataSourceId("");
		String[] var2 = new String[] {};
		_f24.setAxisPriority(var2);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown
		// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
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
		if (Stubs.matches(method, PafDataService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "loadApplications", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
				// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.<init>(ES_EvalStdRulegroup.java:48)
			}
		}
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				return _f24;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalStdRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation7() throws Throwable {
		ES_EvalStdRulegroup THIS = new ES_EvalStdRulegroup();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		Object[] var1 = new Object[] {};
		ListMock t4 = new ListMock(var1);
		RuleGroup t5 = new RuleGroup((Rule[]) null);
		Rule t6 = new Rule();
		Long t7 = new Long(0L);
		RuleSet t8 = new RuleSet();
		ClientInitRequest t9 = new ClientInitRequest();
		PafClientState t10 = new PafClientState((String) null, t9);
		_f0 = new PafApplicationDef();
		_f24 = new MdbDef();
		_f1 = new Rule();
		Formula t14 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		Boolean t15 = new Boolean(false);
		t3.setTimePeriodList(t4);
		t3.setRuleGroup(t5);
		t3.setRule(t6);
		t3.setStartTime(t7);
		HashSet var2 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setForcedCalcs(var2);
		HashSet var3 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setRequiredCalcs(var3);
		t3.setMeasureRuleSet(t8);
		t3.setStateChanged(false);
		t3.setClientState(t10);
		t3.setTimeSliceMode(false);
		_f24.setYearDim("");
		String[] var4 = new String[] {};
		_f24.setHierDims(var4);
		_f24.setMeasureDim("");
		_f24.setPlanTypeDim("");
		_f24.setTimeDim("");
		_f24.setVersionDim("");
		_f24.setDataSourceId("");
		String[] var5 = new String[] {};
		_f24.setAxisPriority(var5);
		_f1.setKey(0);
		_f1.setFormula(t14);
		String[] var6 = new String[] {};
		_f1.setTriggerMeasures(var6);
		_f1.setSkipAggregation(false);
		_f1.setSkipAllocation(false);
		_f1.setBaseAllocateMeasure("");
		_f1.setLockAllocation(false);
		_f1.setEvalLockedIntersections(false);
		_f1.setCalcAllPeriods(false);
		_f1.setLockSystemEvaluationResult(false);
		_f1.setLockUserEvaluationResult(t15);
		_f1.setLockAllPriorTime(false);
		_f1.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown
		// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:71)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPerformEvaluation7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPerformEvaluation7(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return null;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:71)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				return _f1;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureName", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:68)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				return _f24;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalStdRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation9() throws Throwable {
		ES_EvalStdRulegroup THIS = new ES_EvalStdRulegroup();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		_f0 = new PafApplicationDef();
		_f24 = new MdbDef();
		_f1 = new Rule();
		CustomFunctionDef[] var1 = new CustomFunctionDef[] {};
		MeasureFunctionFactory t7 = new MeasureFunctionFactory(
			var1,
			(ClassLoader) null);
		Formula t8 = new Formula("0", " ", t7);
		Boolean t9 = new Boolean(false);
		_f2 = new PafApplicationDef();
		_f24.setYearDim("");
		String[] var2 = new String[] {};
		_f24.setHierDims(var2);
		_f24.setMeasureDim("");
		_f24.setPlanTypeDim("");
		_f24.setTimeDim("");
		_f24.setVersionDim("");
		_f24.setDataSourceId("");
		String[] var3 = new String[] {};
		_f24.setAxisPriority(var3);
		_f1.setKey(0);
		_f1.setFormula(t8);
		String[] var4 = new String[] {};
		_f1.setTriggerMeasures(var4);
		_f1.setSkipAggregation(false);
		_f1.setSkipAllocation(false);
		_f1.setBaseAllocateMeasure("");
		_f1.setLockAllocation(false);
		_f1.setEvalLockedIntersections(false);
		_f1.setCalcAllPeriods(false);
		_f1.setLockSystemEvaluationResult(false);
		_f1.setLockUserEvaluationResult(t9);
		_f1.setLockAllPriorTime(false);
		_f1.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown
		// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
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
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:71)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				return _f1;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureName", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				return _f24;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalStdRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation11() throws Throwable {
		ES_EvalStdRulegroup THIS = new ES_EvalStdRulegroup();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		_f0 = new PafApplicationDef();
		_f24 = new MdbDef();
		_f1 = new Rule();
		Formula t7 = new Formula(
			(String) null,
			"()",
			(MeasureFunctionFactory) null);
		Boolean t8 = new Boolean(false);
		_f3 = new Formula();
		_f24.setYearDim("");
		String[] var1 = new String[] {};
		_f24.setHierDims(var1);
		_f24.setMeasureDim("");
		_f24.setPlanTypeDim("");
		_f24.setTimeDim("");
		_f24.setVersionDim("");
		_f24.setDataSourceId("");
		String[] var2 = new String[] {};
		_f24.setAxisPriority(var2);
		_f1.setKey(0);
		t7.setExpression("*+,");
		String[] var3 = new String[] {};
		t7.setExpressionTerms(var3);
		t7.setResultTerm("");
		t7.setResultFunction(false);
		t7.setParsed(false);
		_f1.setFormula(t7);
		String[] var4 = new String[] {};
		_f1.setTriggerMeasures(var4);
		_f1.setSkipAggregation(false);
		_f1.setSkipAllocation(false);
		_f1.setBaseAllocateMeasure("");
		_f1.setLockAllocation(false);
		_f1.setEvalLockedIntersections(false);
		_f1.setCalcAllPeriods(false);
		_f1.setLockSystemEvaluationResult(false);
		_f1.setLockUserEvaluationResult(t8);
		_f1.setLockAllPriorTime(false);
		_f1.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown
		// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:66)
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
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getRule()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
					case 2 :
						return null;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:66)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				return _f24;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
		}
		if (Stubs.matches(method, Rule.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getFormula", argument_types)) {
				return _f3;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
			}
		}
		if (Stubs.matches(method, Formula.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isResultFunction", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalStdRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation12() throws Throwable {
		ES_EvalStdRulegroup THIS = new ES_EvalStdRulegroup();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		Object[] var1 = new Object[] {};
		ListMock t4 = new ListMock(var1);
		RuleGroup t5 = new RuleGroup((Rule[]) null);
		Boolean t6 = new Boolean(false);
		Rule t7 = new Rule();
		Formula t8 = new Formula(
			(String) null,
			"12345",
			(MeasureFunctionFactory) null);
		Boolean t9 = new Boolean(false);
		Long t10 = new Long(0L);
		RuleSet t11 = new RuleSet();
		ClientInitRequest t12 = new ClientInitRequest();
		PafClientState t13 = new PafClientState((String) null, t12);
		_f0 = new PafApplicationDef();
		_f24 = new MdbDef();
		_f1 = new Rule();
		Formula t17 = new Formula();
		Boolean t18 = new Boolean(false);
		_f2 = new PafApplicationDef();
		t3.setTimePeriodList(t4);
		Rule[] var2 = new Rule[] {};
		t5.setRules(var2);
		t5.setRuleGroupId("");
		t5.setBalanceSetKey("");
		t5.setPerpetual(false);
		t5.setDelayedPerpetual(false);
		t5.setSkipProtProc(false);
		t5.setPerpetualAllocation(false);
		t5.setPerformInitialAllocation(t6);
		t3.setRuleGroup(t5);
		t7.setKey(0);
		t7.setFormula(t8);
		String[] var3 = new String[] {};
		t7.setTriggerMeasures(var3);
		t7.setSkipAggregation(false);
		t7.setSkipAllocation(false);
		t7.setBaseAllocateMeasure("");
		t7.setLockAllocation(false);
		t7.setEvalLockedIntersections(false);
		t7.setCalcAllPeriods(false);
		t7.setLockSystemEvaluationResult(false);
		t7.setLockUserEvaluationResult(t9);
		t7.setLockAllPriorTime(false);
		t7.setInitialTBFirstAllocation(false);
		t3.setRule(t7);
		t3.setStartTime(t10);
		HashSet var4 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setForcedCalcs(var4);
		HashSet var5 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setRequiredCalcs(var5);
		t3.setMeasureRuleSet(t11);
		t3.setStateChanged(false);
		t3.setClientState(t13);
		t3.setTimeSliceMode(false);
		_f24.setYearDim("");
		String[] var6 = new String[] {};
		_f24.setHierDims(var6);
		_f24.setMeasureDim("");
		_f24.setPlanTypeDim("");
		_f24.setTimeDim("");
		_f24.setVersionDim("");
		_f24.setDataSourceId("");
		String[] var7 = new String[] {};
		_f24.setAxisPriority(var7);
		_f1.setKey(0);
		String[] var8 = new String[] {};
		t17.setExpressionTerms(var8);
		t17.setResultTerm("");
		t17.setResultFunction(false);
		t17.setParsed(false);
		_f1.setFormula(t17);
		String[] var9 = new String[] {};
		_f1.setTriggerMeasures(var9);
		_f1.setSkipAggregation(false);
		_f1.setSkipAllocation(false);
		_f1.setBaseAllocateMeasure("");
		_f1.setLockAllocation(false);
		_f1.setEvalLockedIntersections(false);
		_f1.setCalcAllPeriods(false);
		_f1.setLockSystemEvaluationResult(false);
		_f1.setLockUserEvaluationResult(t18);
		_f1.setLockAllPriorTime(false);
		_f1.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown
		// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:430)
		// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPerformEvaluation12.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPerformEvaluation12(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:71)
					case 3 :
						return null;
					// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:430)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getRule()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
					case 2 :
						return null;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureName", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				return _f24;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalStdRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation13() throws Throwable {
		ES_EvalStdRulegroup THIS = new ES_EvalStdRulegroup();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		_f0 = new PafApplicationDef();
		_f24 = new MdbDef();
		_f1 = new Rule();
		Formula t7 = new Formula((String) null, (String) null);
		Boolean t8 = new Boolean(false);
		_f3 = new Formula(
			(String) null,
			" ()*+,1",
			(MeasureFunctionFactory) null);
		_f4 = new Rule();
		Formula t11 = new Formula();
		Boolean t12 = new Boolean(false);
		MeasureFunctionFactory var1 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		_f6 = new Formula((String) null, "@B ()*+,1", var1);
		_f2 = new PafApplicationDef();
		_f5 = new PafApplicationDef();
		_f25 = new MdbDef();
		_f24.setYearDim("");
		String[] var2 = new String[] {};
		_f24.setHierDims(var2);
		_f24.setMeasureDim("");
		_f24.setPlanTypeDim("");
		_f24.setTimeDim("");
		_f24.setVersionDim("");
		_f24.setDataSourceId("");
		String[] var3 = new String[] {};
		_f24.setAxisPriority(var3);
		_f1.setKey(0);
		_f1.setFormula(t7);
		String[] var4 = new String[] {};
		_f1.setTriggerMeasures(var4);
		_f1.setSkipAggregation(false);
		_f1.setSkipAllocation(false);
		_f1.setBaseAllocateMeasure("");
		_f1.setLockAllocation(false);
		_f1.setEvalLockedIntersections(false);
		_f1.setCalcAllPeriods(false);
		_f1.setLockSystemEvaluationResult(false);
		_f1.setLockUserEvaluationResult(t8);
		_f1.setLockAllPriorTime(false);
		_f1.setInitialTBFirstAllocation(false);
		_f3.setExpression("23456789");
		String[] var5 = new String[] {};
		_f3.setExpressionTerms(var5);
		_f3.setResultTerm("");
		_f3.setResultFunction(false);
		_f3.setParsed(false);
		_f4.setKey(0);
		_f4.setFormula(t11);
		String[] var6 = new String[] {};
		_f4.setTriggerMeasures(var6);
		_f4.setSkipAggregation(false);
		_f4.setSkipAllocation(false);
		_f4.setBaseAllocateMeasure("");
		_f4.setLockAllocation(false);
		_f4.setEvalLockedIntersections(false);
		_f4.setCalcAllPeriods(false);
		_f4.setLockSystemEvaluationResult(false);
		_f4.setLockUserEvaluationResult(t12);
		_f4.setLockAllPriorTime(false);
		_f4.setInitialTBFirstAllocation(false);
		_f25.setYearDim("");
		String[] var7 = new String[] {};
		_f25.setHierDims(var7);
		_f25.setMeasureDim("");
		_f25.setPlanTypeDim("");
		_f25.setTimeDim("");
		_f25.setVersionDim("");
		_f25.setDataSourceId("");
		String[] var8 = new String[] {};
		_f25.setAxisPriority(var8);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:432)
		// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPerformEvaluation13.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPerformEvaluation13(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:71)
					case 3 :
						return _f5;
					// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:430)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getRule()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
					case 2 :
						return _f4;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:66)
					case 3 :
						return null;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureName", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f24;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f25;
					// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:430)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Rule.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getFormula", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.rules.Rule.getFormula()");
				switch (index) {
					case 1 :
						return _f3;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
					case 2 :
						return _f6;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:66)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Formula.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isResultFunction", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
			}
		}
		if (Stubs.matches(method, MeasureFunctionFactory.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getFunction", argument_types)) {
				return null;
				// at com.palladium.paf.rules.Formula.extractTerms(Formula.java:204)
				// at com.palladium.paf.rules.Formula.init(Formula.java:86)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
				// at com.palladium.paf.rules.Rule.getFormula(Rule.java:60)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:66)
				// 
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:270)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
				// at com.palladium.paf.rules.Rule.getFormula(Rule.java:60)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:66)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "isFunction", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
				// at com.palladium.paf.rules.Rule.getFormula(Rule.java:60)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:66)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalStdRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation14() throws Throwable {
		ES_EvalStdRulegroup THIS = new ES_EvalStdRulegroup();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		_f0 = new PafApplicationDef();
		SeasonList t5 = new SeasonList();
		MdbDef t6 = new MdbDef();
		_f1 = new Rule();
		Formula t8 = new Formula((String) null, (String) null);
		Boolean t9 = new Boolean(false);
		_f3 = new Formula((String) null, "", (MeasureFunctionFactory) null);
		_f2 = new PafApplicationDef();
		SeasonList t12 = new SeasonList();
		MdbDef t13 = new MdbDef();
		_f0.setSeasonList(t5);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t6.setYearDim("");
		String[] var2 = new String[] {};
		t6.setHierDims(var2);
		t6.setMeasureDim("");
		t6.setPlanTypeDim("");
		t6.setTimeDim("");
		t6.setVersionDim("");
		t6.setDataSourceId("");
		String[] var3 = new String[] {};
		t6.setAxisPriority(var3);
		_f0.setMdbDef(t6);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var5);
		_f1.setKey(0);
		t8.setExpression("");
		String[] var6 = new String[] {};
		t8.setExpressionTerms(var6);
		t8.setResultTerm("");
		t8.setResultFunction(false);
		t8.setParsed(false);
		_f1.setFormula(t8);
		String[] var7 = new String[] {};
		_f1.setTriggerMeasures(var7);
		_f1.setSkipAggregation(false);
		_f1.setSkipAllocation(false);
		_f1.setBaseAllocateMeasure("");
		_f1.setLockAllocation(false);
		_f1.setEvalLockedIntersections(false);
		_f1.setCalcAllPeriods(false);
		_f1.setLockSystemEvaluationResult(false);
		_f1.setLockUserEvaluationResult(t9);
		_f1.setLockAllPriorTime(false);
		_f1.setInitialTBFirstAllocation(false);
		_f3.setExpression("");
		String[] var8 = new String[] {};
		_f3.setExpressionTerms(var8);
		_f3.setResultTerm("");
		_f3.setResultFunction(false);
		_f3.setParsed(false);
		_f2.setSeasonList(t12);
		_f2.setAppId("");
		PlanCycle[] var9 = new PlanCycle[] {};
		_f2.setPlanCycles(var9);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
		_f2.setMdbDef(t13);
		Map var10 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var10);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var11);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		assertEquals(5, t6.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testPerformEvaluation14.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPerformEvaluation14(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "loadApplications", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
				// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.<init>(ES_EvalStdRulegroup.java:48)
			}
		}
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:71)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getRule()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
					case 2 :
						return null;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureName", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getOrigLockedCells", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:86)
			}
		}
		if (Stubs.matches(method, Rule.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getFormula", argument_types)) {
				return _f3;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
				// 
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:89)
			}
			argument_types = new Class[] { Collection.class };
			if (Stubs.matches(method, "addAll", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
			}
		}
		if (Stubs.matches(method, EvalUtil.class)) {
			argument_types = new Class[] { Rule.class, EvalState.class };
			if (Stubs.matches(method, "getChangeSet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
			}
		}
		if (Stubs.matches(method, Class.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "forName", argument_types)) {
				throw new ClassNotFoundException();
				// at org.springframework.context.support.AbstractApplicationContext.class$(AbstractApplicationContext.java:123)
				// at org.springframework.context.support.AbstractApplicationContext.<clinit>(AbstractApplicationContext.java:123)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:201)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalStdRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation15() throws Throwable {
		_f0 = new PafApplicationDef();
		_f24 = new MdbDef();
		_f25 = new MdbDef();
		ES_EvalStdRulegroup THIS = new ES_EvalStdRulegroup();
		ClientInitRequest t4 = new ClientInitRequest();
		PafClientState t5 = new PafClientState((String) null, t4);
		EvalState t6 = new EvalState(t5);
		Object[] var1 = new Object[] {};
		ListMock t7 = new ListMock(var1);
		RuleGroup t8 = new RuleGroup();
		Rule t9 = new Rule();
		Formula t10 = new Formula((String) null, (String) null);
		Boolean t11 = new Boolean(false);
		Long t12 = new Long("0");
		RuleSet t13 = new RuleSet();
		ClientInitRequest t14 = new ClientInitRequest();
		PafClientState t15 = new PafClientState((String) null, t14);
		_f2 = new PafApplicationDef();
		_f26 = new MdbDef();
		_f1 = new Rule();
		Formula t19 = new Formula();
		Boolean t20 = new Boolean(false);
		_f5 = new PafApplicationDef();
		_f24.setYearDim("");
		String[] var2 = new String[] { null, null, null, null, null };
		_f24.setHierDims(var2);
		_f24.setMeasureDim("");
		_f24.setPlanTypeDim("");
		_f24.setTimeDim("");
		_f24.setVersionDim("");
		_f24.setDataSourceId("");
		String[] var3 = new String[] {};
		_f24.setAxisPriority(var3);
		_f25.setYearDim("");
		String[] var4 = new String[] {};
		_f25.setHierDims(var4);
		_f25.setMeasureDim("");
		_f25.setPlanTypeDim("");
		_f25.setTimeDim("");
		_f25.setVersionDim("");
		_f25.setDataSourceId("");
		String[] var5 = new String[] {};
		_f25.setAxisPriority(var5);
		t6.setTimePeriodList(t7);
		t6.setRuleGroup(t8);
		t9.setKey(0);
		t9.setFormula(t10);
		String[] var6 = new String[] {};
		t9.setTriggerMeasures(var6);
		t9.setSkipAggregation(false);
		t9.setSkipAllocation(false);
		t9.setBaseAllocateMeasure("");
		t9.setLockAllocation(false);
		t9.setEvalLockedIntersections(false);
		t9.setCalcAllPeriods(false);
		t9.setLockSystemEvaluationResult(false);
		t9.setLockUserEvaluationResult(t11);
		t9.setLockAllPriorTime(false);
		t9.setInitialTBFirstAllocation(false);
		t6.setRule(t9);
		t6.setStartTime(t12);
		HashSet var7 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t6.setForcedCalcs(var7);
		HashSet var8 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t6.setRequiredCalcs(var8);
		t13.setDimension("");
		t13.setType(0);
		t13.setName("");
		String[] var9 = new String[] {};
		t13.setMeasureList(var9);
		t6.setMeasureRuleSet(t13);
		t6.setStateChanged(false);
		t6.setClientState(t15);
		t6.setTimeSliceMode(false);
		_f1.setKey(0);
		String[] var10 = new String[] {};
		t19.setExpressionTerms(var10);
		t19.setResultTerm("");
		t19.setResultFunction(false);
		t19.setParsed(false);
		_f1.setFormula(t19);
		String[] var11 = new String[] {};
		_f1.setTriggerMeasures(var11);
		_f1.setSkipAggregation(false);
		_f1.setSkipAllocation(false);
		_f1.setBaseAllocateMeasure("");
		_f1.setLockAllocation(false);
		_f1.setEvalLockedIntersections(false);
		_f1.setCalcAllPeriods(false);
		_f1.setLockSystemEvaluationResult(false);
		_f1.setLockUserEvaluationResult(t20);
		_f1.setLockAllPriorTime(false);
		_f1.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		THIS.performEvaluation(
			t6,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		assertEquals(10, _f24.getDimCount()); // jtest_unverified
		assertEquals(5, _f25.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testPerformEvaluation15.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPerformEvaluation15(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[] { _f0 };
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
				// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.<init>(ES_EvalStdRulegroup.java:48)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f24;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.<init>(ES_EvalStdRulegroup.java:48)
					case 2 :
						return _f25;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.<init>(ES_EvalStdRulegroup.java:48)
					case 3 :
						return _f26;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, PafDataService.class)) {
			argument_types = new Class[] { String[].class, String.class };
			if (Stubs.matches(method, "initMemberTreeStore", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
				// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.<init>(ES_EvalStdRulegroup.java:48)
			}
		}
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f5;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:71)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getRule()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
					case 2 :
						return null;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureName", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getOrigLockedCells", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:86)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
				// 
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:89)
			}
			argument_types = new Class[] { Collection.class };
			if (Stubs.matches(method, "addAll", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
			}
		}
		if (Stubs.matches(method, EvalUtil.class)) {
			argument_types = new Class[] { Rule.class, EvalState.class };
			if (Stubs.matches(method, "getChangeSet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalStdRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation16() throws Throwable {
		ES_EvalStdRulegroup THIS = new ES_EvalStdRulegroup();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		_f0 = new PafApplicationDef();
		_f24 = new MdbDef();
		_f1 = new Rule();
		Formula t7 = new Formula((String) null, (String) null);
		Boolean t8 = new Boolean(false);
		_f3 = new Formula((String) null, "", (MeasureFunctionFactory) null);
		_f4 = new Rule();
		Formula t11 = new Formula();
		Boolean t12 = new Boolean(false);
		_f6 = new Formula((String) null, "", (MeasureFunctionFactory) null);
		_f2 = new PafApplicationDef();
		_f5 = new PafApplicationDef();
		_f25 = new MdbDef();
		_f10 = new Rule();
		Formula t18 = new Formula();
		Boolean t19 = new Boolean(false);
		MeasureFunctionFactory var1 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		_f27 = new Formula((String) null, "", var1);
		_f24.setYearDim("");
		String[] var2 = new String[] {};
		_f24.setHierDims(var2);
		_f24.setMeasureDim("");
		_f24.setPlanTypeDim("");
		_f24.setTimeDim("");
		_f24.setVersionDim("");
		_f24.setDataSourceId("");
		String[] var3 = new String[] {};
		_f24.setAxisPriority(var3);
		_f1.setKey(0);
		t7.setExpression("");
		String[] var4 = new String[] {};
		t7.setExpressionTerms(var4);
		t7.setResultTerm("");
		t7.setResultFunction(false);
		t7.setParsed(false);
		_f1.setFormula(t7);
		String[] var5 = new String[] {};
		_f1.setTriggerMeasures(var5);
		_f1.setSkipAggregation(false);
		_f1.setSkipAllocation(false);
		_f1.setBaseAllocateMeasure("");
		_f1.setLockAllocation(false);
		_f1.setEvalLockedIntersections(false);
		_f1.setCalcAllPeriods(false);
		_f1.setLockSystemEvaluationResult(false);
		_f1.setLockUserEvaluationResult(t8);
		_f1.setLockAllPriorTime(false);
		_f1.setInitialTBFirstAllocation(false);
		_f3.setExpression("");
		String[] var6 = new String[] {};
		_f3.setExpressionTerms(var6);
		_f3.setResultTerm("");
		_f3.setResultFunction(false);
		_f3.setParsed(false);
		_f4.setKey(0);
		_f4.setFormula(t11);
		String[] var7 = new String[] {};
		_f4.setTriggerMeasures(var7);
		_f4.setSkipAggregation(false);
		_f4.setSkipAllocation(false);
		_f4.setBaseAllocateMeasure("");
		_f4.setLockAllocation(false);
		_f4.setEvalLockedIntersections(false);
		_f4.setCalcAllPeriods(false);
		_f4.setLockSystemEvaluationResult(false);
		_f4.setLockUserEvaluationResult(t12);
		_f4.setLockAllPriorTime(false);
		_f4.setInitialTBFirstAllocation(false);
		_f25.setYearDim("");
		String[] var8 = new String[] {};
		_f25.setHierDims(var8);
		_f25.setMeasureDim("");
		_f25.setPlanTypeDim("");
		_f25.setTimeDim("");
		_f25.setVersionDim("");
		_f25.setDataSourceId("");
		String[] var9 = new String[] {};
		_f25.setAxisPriority(var9);
		_f10.setKey(0);
		t18.setExpression("");
		String[] var10 = new String[] {};
		t18.setExpressionTerms(var10);
		t18.setResultTerm("");
		t18.setResultFunction(false);
		t18.setParsed(false);
		_f10.setFormula(t18);
		String[] var11 = new String[] {};
		_f10.setTriggerMeasures(var11);
		_f10.setSkipAggregation(false);
		_f10.setSkipAllocation(false);
		_f10.setBaseAllocateMeasure("");
		_f10.setLockAllocation(false);
		_f10.setEvalLockedIntersections(false);
		_f10.setCalcAllPeriods(false);
		_f10.setLockSystemEvaluationResult(false);
		_f10.setLockUserEvaluationResult(t19);
		_f10.setLockAllPriorTime(false);
		_f10.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown
		// at java.util.AbstractCollection.addAll(AbstractCollection.java:316)
		// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:86)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPerformEvaluation16.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPerformEvaluation16(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:71)
					case 3 :
						return _f5;
					// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:430)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getRule()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
					case 2 :
						return _f4;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:66)
					case 3 :
						return _f10;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureName", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTimePeriodList", argument_types)) {
				return null;
				// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:434)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getOrigLockedCells", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:86)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f24;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f25;
					// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:430)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Rule.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getFormula", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.rules.Rule.getFormula()");
				switch (index) {
					case 1 :
						return _f3;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
					case 2 :
						return _f6;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:66)
					case 3 :
						return _f27;
					// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:432)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTriggerMeasures", argument_types)) {
				return null;
				// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:437)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
			}
		}
		if (Stubs.matches(method, Formula.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isResultFunction", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
			}
		}
		if (Stubs.matches(method, MeasureFunctionFactory.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "isFunction", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
				// at com.palladium.paf.rules.Rule.getFormula(Rule.java:60)
				// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:432)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalStdRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation17() throws Throwable {
		ES_EvalStdRulegroup THIS = new ES_EvalStdRulegroup();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		Object[] var1 = new Object[] {};
		ListMock t4 = new ListMock(var1);
		RuleGroup t5 = new RuleGroup((Rule[]) null);
		Rule t6 = new Rule();
		Formula t7 = new Formula((String) null, (String) null);
		Boolean t8 = new Boolean(false);
		Long t9 = new Long(0L);
		RuleSet t10 = new RuleSet();
		ClientInitRequest t11 = new ClientInitRequest();
		PafClientState t12 = new PafClientState((String) null, t11);
		_f0 = new PafApplicationDef();
		_f24 = new MdbDef();
		_f1 = new Rule();
		Formula t16 = new Formula();
		Boolean t17 = new Boolean(false);
		_f2 = new PafApplicationDef();
		t3.setTimePeriodList(t4);
		t3.setRuleGroup(t5);
		t6.setKey(0);
		t6.setFormula(t7);
		String[] var2 = new String[] {};
		t6.setTriggerMeasures(var2);
		t6.setSkipAggregation(false);
		t6.setSkipAllocation(false);
		t6.setBaseAllocateMeasure("");
		t6.setLockAllocation(false);
		t6.setEvalLockedIntersections(false);
		t6.setCalcAllPeriods(false);
		t6.setLockSystemEvaluationResult(false);
		t6.setLockUserEvaluationResult(t8);
		t6.setLockAllPriorTime(false);
		t6.setInitialTBFirstAllocation(false);
		t3.setRule(t6);
		t3.setStartTime(t9);
		HashSet var3 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setForcedCalcs(var3);
		HashSet var4 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setRequiredCalcs(var4);
		t3.setMeasureRuleSet(t10);
		t3.setStateChanged(false);
		t3.setClientState(t12);
		t3.setTimeSliceMode(false);
		_f24.setYearDim("");
		String[] var5 = new String[] {};
		_f24.setHierDims(var5);
		_f24.setMeasureDim("");
		_f24.setPlanTypeDim("");
		_f24.setTimeDim("");
		_f24.setVersionDim("");
		_f24.setDataSourceId("");
		String[] var6 = new String[] {};
		_f24.setAxisPriority(var6);
		_f1.setKey(0);
		_f1.setFormula(t16);
		String[] var7 = new String[] {};
		_f1.setTriggerMeasures(var7);
		_f1.setSkipAggregation(false);
		_f1.setSkipAllocation(false);
		_f1.setBaseAllocateMeasure("");
		_f1.setLockAllocation(false);
		_f1.setEvalLockedIntersections(false);
		_f1.setCalcAllPeriods(false);
		_f1.setLockSystemEvaluationResult(false);
		_f1.setLockUserEvaluationResult(t17);
		_f1.setLockAllPriorTime(false);
		_f1.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// ClassCastException thrown
		// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPerformEvaluation17.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPerformEvaluation17(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:71)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getRule()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
					case 2 :
						return null;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureName", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getOrigLockedCells", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:86)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				return _f24;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
				// 
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:89)
			}
			argument_types = new Class[] { Collection.class };
			if (Stubs.matches(method, "addAll", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
			}
		}
		if (Stubs.matches(method, EvalUtil.class)) {
			argument_types = new Class[] { Rule.class, EvalState.class };
			if (Stubs.matches(method, "getChangeSet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return "";
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalStdRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation18() throws Throwable {
		ES_EvalStdRulegroup THIS = new ES_EvalStdRulegroup();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		_f0 = new PafApplicationDef();
		SeasonList t5 = new SeasonList();
		MdbDef t6 = new MdbDef();
		_f1 = new Rule();
		Formula t8 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		Boolean t9 = new Boolean(false);
		_f3 = new Formula((String) null, "", (MeasureFunctionFactory) null);
		_f2 = new PafApplicationDef();
		SeasonList t12 = new SeasonList();
		MdbDef t13 = new MdbDef();
		_f5 = new PafApplicationDef();
		SeasonList t15 = new SeasonList();
		MdbDef t16 = new MdbDef();
		_f4 = new Rule();
		Formula t18 = new Formula();
		Boolean t19 = new Boolean(false);
		_f6 = new Formula((String) null, "", (MeasureFunctionFactory) null);
		_f0.setSeasonList(t5);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		_f0.setMdbDef(t6);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var3);
		_f1.setKey(0);
		t8.setExpression("");
		String[] var4 = new String[] {};
		t8.setExpressionTerms(var4);
		t8.setResultTerm("");
		t8.setResultFunction(false);
		t8.setParsed(false);
		_f1.setFormula(t8);
		String[] var5 = new String[] {};
		_f1.setTriggerMeasures(var5);
		_f1.setSkipAggregation(false);
		_f1.setSkipAllocation(false);
		_f1.setBaseAllocateMeasure("");
		_f1.setLockAllocation(false);
		_f1.setEvalLockedIntersections(false);
		_f1.setCalcAllPeriods(false);
		_f1.setLockSystemEvaluationResult(false);
		_f1.setLockUserEvaluationResult(t9);
		_f1.setLockAllPriorTime(false);
		_f1.setInitialTBFirstAllocation(false);
		_f2.setSeasonList(t12);
		_f2.setAppId("");
		PlanCycle[] var6 = new PlanCycle[] {};
		_f2.setPlanCycles(var6);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
		_f2.setMdbDef(t13);
		Map var7 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var7);
		Map var8 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var8);
		_f5.setSeasonList(t15);
		_f5.setAppId("");
		PlanCycle[] var9 = new PlanCycle[] {};
		_f5.setPlanCycles(var9);
		_f5.setLastPeriod("");
		_f5.setCurrentYear("");
		_f5.setMdbDef(t16);
		Map var10 = (Map) Stubs.makeStubObject(Map.class);
		_f5.setMeasures(var10);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		_f5.setVersions(var11);
		_f4.setKey(0);
		t18.setExpression("");
		String[] var12 = new String[] {};
		t18.setExpressionTerms(var12);
		t18.setResultTerm("");
		t18.setResultFunction(false);
		t18.setParsed(false);
		_f4.setFormula(t18);
		String[] var13 = new String[] {};
		_f4.setTriggerMeasures(var13);
		_f4.setSkipAggregation(false);
		_f4.setSkipAllocation(false);
		_f4.setBaseAllocateMeasure("");
		_f4.setLockAllocation(false);
		_f4.setEvalLockedIntersections(false);
		_f4.setCalcAllPeriods(false);
		_f4.setLockSystemEvaluationResult(false);
		_f4.setLockUserEvaluationResult(t19);
		_f4.setLockAllPriorTime(false);
		_f4.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testPerformEvaluation18.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPerformEvaluation18(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:71)
					case 3 :
						return _f5;
					// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:430)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getRule()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
					case 2 :
						return _f4;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureName", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTimePeriodList", argument_types)) {
				return null;
				// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:434)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
			}
		}
		if (Stubs.matches(method, Rule.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getFormula", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.rules.Rule.getFormula()");
				switch (index) {
					case 1 :
						return _f3;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
					case 2 :
						return _f6;
					// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:432)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTriggerMeasures", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.rules.Rule.getTriggerMeasures()");
				switch (index) {
					case 1 :
					case 2 :
						return new String[0];
					// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:437)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					case 3 :
						return null;
					// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:437)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalStdRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation19() throws Throwable {
		ES_EvalStdRulegroup THIS = new ES_EvalStdRulegroup();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		_f0 = new PafApplicationDef();
		_f24 = new MdbDef();
		_f1 = new Rule();
		Formula t7 = new Formula((String) null, (String) null);
		Boolean t8 = new Boolean(false);
		_f3 = new Formula((String) null, "", (MeasureFunctionFactory) null);
		_f4 = new Rule();
		Formula t11 = new Formula();
		Boolean t12 = new Boolean(false);
		_f6 = new Formula((String) null, "", (MeasureFunctionFactory) null);
		_f2 = new PafApplicationDef();
		_f5 = new PafApplicationDef();
		_f25 = new MdbDef();
		_f10 = new Rule();
		Formula t18 = new Formula();
		Boolean t19 = new Boolean(false);
		_f27 = new Formula((String) null, (String) null);
		_f24.setYearDim("");
		String[] var1 = new String[] {};
		_f24.setHierDims(var1);
		_f24.setMeasureDim("");
		_f24.setPlanTypeDim("");
		_f24.setTimeDim("");
		_f24.setVersionDim("");
		_f24.setDataSourceId("");
		String[] var2 = new String[] {};
		_f24.setAxisPriority(var2);
		_f1.setKey(0);
		t7.setExpression("");
		String[] var3 = new String[] {};
		t7.setExpressionTerms(var3);
		t7.setResultTerm("");
		t7.setResultFunction(false);
		t7.setParsed(false);
		_f1.setFormula(t7);
		String[] var4 = new String[] {};
		_f1.setTriggerMeasures(var4);
		_f1.setSkipAggregation(false);
		_f1.setSkipAllocation(false);
		_f1.setBaseAllocateMeasure("");
		_f1.setLockAllocation(false);
		_f1.setEvalLockedIntersections(false);
		_f1.setCalcAllPeriods(false);
		_f1.setLockSystemEvaluationResult(false);
		_f1.setLockUserEvaluationResult(t8);
		_f1.setLockAllPriorTime(false);
		_f1.setInitialTBFirstAllocation(false);
		_f3.setExpression("");
		String[] var5 = new String[] {};
		_f3.setExpressionTerms(var5);
		_f3.setResultTerm("");
		_f3.setResultFunction(false);
		_f3.setParsed(false);
		_f4.setKey(0);
		t11.setExpression("");
		String[] var6 = new String[] {};
		t11.setExpressionTerms(var6);
		t11.setResultTerm("");
		t11.setResultFunction(false);
		t11.setParsed(false);
		_f4.setFormula(t11);
		String[] var7 = new String[] {};
		_f4.setTriggerMeasures(var7);
		_f4.setSkipAggregation(false);
		_f4.setSkipAllocation(false);
		_f4.setBaseAllocateMeasure("");
		_f4.setLockAllocation(false);
		_f4.setEvalLockedIntersections(false);
		_f4.setCalcAllPeriods(false);
		_f4.setLockSystemEvaluationResult(false);
		_f4.setLockUserEvaluationResult(t12);
		_f4.setLockAllPriorTime(false);
		_f4.setInitialTBFirstAllocation(false);
		_f25.setYearDim("");
		String[] var8 = new String[] {};
		_f25.setHierDims(var8);
		_f25.setMeasureDim("");
		_f25.setPlanTypeDim("");
		_f25.setTimeDim("");
		_f25.setVersionDim("");
		_f25.setDataSourceId("");
		String[] var9 = new String[] {};
		_f25.setAxisPriority(var9);
		_f10.setKey(0);
		_f10.setFormula(t18);
		String[] var10 = new String[] {};
		_f10.setTriggerMeasures(var10);
		_f10.setSkipAggregation(false);
		_f10.setSkipAllocation(false);
		_f10.setBaseAllocateMeasure("");
		_f10.setLockAllocation(false);
		_f10.setEvalLockedIntersections(false);
		_f10.setCalcAllPeriods(false);
		_f10.setLockSystemEvaluationResult(false);
		_f10.setLockUserEvaluationResult(t19);
		_f10.setLockAllPriorTime(false);
		_f10.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:437)
		// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPerformEvaluation19.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPerformEvaluation19(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:71)
					case 3 :
						return _f5;
					// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:430)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getRule()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
					case 2 :
						return _f4;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:66)
					case 3 :
						return _f10;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureName", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTimePeriodList", argument_types)) {
				return null;
				// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:434)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f24;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f25;
					// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:430)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Rule.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getFormula", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.rules.Rule.getFormula()");
				switch (index) {
					case 1 :
						return _f3;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
					case 2 :
						return _f6;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:66)
					case 3 :
						return _f27;
					// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:432)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTriggerMeasures", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.rules.Rule.getTriggerMeasures()");
				switch (index) {
					case 1 :
					case 2 :
						return new String[0];
					// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:437)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					case 3 :
						return null;
					// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:437)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Formula.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isResultFunction", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalStdRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation20() throws Throwable {
		ES_EvalStdRulegroup THIS = new ES_EvalStdRulegroup();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		Object[] var1 = new Object[] {};
		ListMock t4 = new ListMock(var1);
		RuleGroup t5 = new RuleGroup();
		Boolean t6 = new Boolean(false);
		Rule t7 = new Rule();
		Formula t8 = new Formula((String) null, (String) null);
		Boolean t9 = new Boolean(false);
		Long t10 = new Long("0");
		RuleSet t11 = new RuleSet();
		ClientInitRequest t12 = new ClientInitRequest();
		PafClientState t13 = new PafClientState((String) null, t12);
		_f0 = new PafApplicationDef();
		_f24 = new MdbDef();
		_f1 = new Rule();
		Formula t17 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		Boolean t18 = new Boolean(false);
		_f2 = new PafApplicationDef();
		_f7 = new Intersection((String[]) null, (String[]) null);
		t3.setTimePeriodList(t4);
		Rule[] var2 = new Rule[] {};
		t5.setRules(var2);
		t5.setRuleGroupId("");
		t5.setBalanceSetKey("");
		t5.setPerpetual(false);
		t5.setDelayedPerpetual(false);
		t5.setSkipProtProc(false);
		t5.setPerpetualAllocation(false);
		t5.setPerformInitialAllocation(t6);
		t3.setRuleGroup(t5);
		t7.setKey(0);
		t8.setExpression("");
		String[] var3 = new String[] {};
		t8.setExpressionTerms(var3);
		t8.setResultTerm("");
		t8.setResultFunction(false);
		t8.setParsed(false);
		t7.setFormula(t8);
		String[] var4 = new String[] {};
		t7.setTriggerMeasures(var4);
		t7.setSkipAggregation(false);
		t7.setSkipAllocation(false);
		t7.setBaseAllocateMeasure("");
		t7.setLockAllocation(false);
		t7.setEvalLockedIntersections(false);
		t7.setCalcAllPeriods(false);
		t7.setLockSystemEvaluationResult(false);
		t7.setLockUserEvaluationResult(t9);
		t7.setLockAllPriorTime(false);
		t7.setInitialTBFirstAllocation(false);
		t3.setRule(t7);
		t3.setStartTime(t10);
		HashSet var5 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setForcedCalcs(var5);
		HashSet var6 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setRequiredCalcs(var6);
		t11.setDimension("");
		t11.setType(0);
		t11.setName("");
		String[] var7 = new String[] {};
		t11.setMeasureList(var7);
		t3.setMeasureRuleSet(t11);
		t3.setStateChanged(false);
		t3.setClientState(t13);
		t3.setTimeSliceMode(false);
		_f24.setYearDim("");
		String[] var8 = new String[] {};
		_f24.setHierDims(var8);
		_f24.setMeasureDim("");
		_f24.setPlanTypeDim("");
		_f24.setTimeDim("");
		_f24.setVersionDim("");
		_f24.setDataSourceId("");
		String[] var9 = new String[] {};
		_f24.setAxisPriority(var9);
		_f1.setKey(0);
		t17.setExpression("");
		String[] var10 = new String[] {};
		t17.setExpressionTerms(var10);
		t17.setResultTerm("");
		t17.setResultFunction(false);
		t17.setParsed(false);
		_f1.setFormula(t17);
		String[] var11 = new String[] {};
		_f1.setTriggerMeasures(var11);
		_f1.setSkipAggregation(false);
		_f1.setSkipAllocation(false);
		_f1.setBaseAllocateMeasure("");
		_f1.setLockAllocation(false);
		_f1.setEvalLockedIntersections(false);
		_f1.setCalcAllPeriods(false);
		_f1.setLockSystemEvaluationResult(false);
		_f1.setLockUserEvaluationResult(t18);
		_f1.setLockAllPriorTime(false);
		_f1.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown
		// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:307)
		// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPerformEvaluation20.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPerformEvaluation20(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:71)
					case 3 :
						return null;
					// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:307)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getRule()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
					case 2 :
					case 3 :
						return null;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					// 
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureName", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getOrigLockedCells", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:86)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				return _f24;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
				// 
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:89)
			}
			argument_types = new Class[] { Collection.class };
			if (Stubs.matches(method, "addAll", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
			}
		}
		if (Stubs.matches(method, EvalUtil.class)) {
			argument_types = new Class[] { Rule.class, EvalState.class };
			if (Stubs.matches(method, "getChangeSet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return _f7;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalStdRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation21() throws Throwable {
		ES_EvalStdRulegroup THIS = new ES_EvalStdRulegroup();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		Object[] var1 = new Object[] {};
		ListMock t4 = new ListMock(var1);
		RuleGroup t5 = new RuleGroup((Rule[]) null);
		Boolean t6 = new Boolean(false);
		Rule t7 = new Rule();
		Formula t8 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		Boolean t9 = new Boolean(false);
		Long t10 = new Long(0L);
		RuleSet t11 = new RuleSet();
		ClientInitRequest t12 = new ClientInitRequest();
		PafClientState t13 = new PafClientState((String) null, t12);
		_f0 = new PafApplicationDef();
		_f24 = new MdbDef();
		_f1 = new Rule();
		Formula t17 = new Formula();
		Boolean t18 = new Boolean(false);
		_f2 = new PafApplicationDef();
		_f7 = new Intersection((String[]) null, (String[]) null);
		_f5 = new PafApplicationDef();
		_f25 = new MdbDef();
		t3.setTimePeriodList(t4);
		Rule[] var2 = new Rule[] {};
		t5.setRules(var2);
		t5.setRuleGroupId("");
		t5.setBalanceSetKey("");
		t5.setPerpetual(false);
		t5.setDelayedPerpetual(false);
		t5.setSkipProtProc(false);
		t5.setPerpetualAllocation(false);
		t5.setPerformInitialAllocation(t6);
		t3.setRuleGroup(t5);
		t7.setKey(0);
		t7.setFormula(t8);
		String[] var3 = new String[] {};
		t7.setTriggerMeasures(var3);
		t7.setSkipAggregation(false);
		t7.setSkipAllocation(false);
		t7.setBaseAllocateMeasure("");
		t7.setLockAllocation(false);
		t7.setEvalLockedIntersections(false);
		t7.setCalcAllPeriods(false);
		t7.setLockSystemEvaluationResult(false);
		t7.setLockUserEvaluationResult(t9);
		t7.setLockAllPriorTime(false);
		t7.setInitialTBFirstAllocation(false);
		t3.setRule(t7);
		t3.setStartTime(t10);
		HashSet var4 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setForcedCalcs(var4);
		HashSet var5 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setRequiredCalcs(var5);
		t3.setMeasureRuleSet(t11);
		t3.setStateChanged(false);
		t3.setClientState(t13);
		t3.setTimeSliceMode(false);
		_f24.setYearDim("");
		String[] var6 = new String[] {};
		_f24.setHierDims(var6);
		_f24.setMeasureDim("");
		_f24.setPlanTypeDim("");
		_f24.setTimeDim("");
		_f24.setVersionDim("");
		_f24.setDataSourceId("");
		String[] var7 = new String[] {};
		_f24.setAxisPriority(var7);
		_f1.setKey(0);
		_f1.setFormula(t17);
		String[] var8 = new String[] {};
		_f1.setTriggerMeasures(var8);
		_f1.setSkipAggregation(false);
		_f1.setSkipAllocation(false);
		_f1.setBaseAllocateMeasure("");
		_f1.setLockAllocation(false);
		_f1.setEvalLockedIntersections(false);
		_f1.setCalcAllPeriods(false);
		_f1.setLockSystemEvaluationResult(false);
		_f1.setLockUserEvaluationResult(t18);
		_f1.setLockAllPriorTime(false);
		_f1.setInitialTBFirstAllocation(false);
		_f25.setYearDim("");
		String[] var9 = new String[] {};
		_f25.setHierDims(var9);
		_f25.setMeasureDim("");
		_f25.setPlanTypeDim("");
		_f25.setTimeDim("");
		_f25.setVersionDim("");
		_f25.setDataSourceId("");
		String[] var10 = new String[] {};
		_f25.setAxisPriority(var10);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.data.Intersection.<init>([Ljava/lang/String;[Ljava/lang/String;)V>
		// at com.palladium.paf.data.Intersection.getCoordinate(Intersection.java:66)
		// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:307)
		// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPerformEvaluation21.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPerformEvaluation21(
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
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.<init>(ES_EvalStdRulegroup.java:48)
			}
		}
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:71)
					case 3 :
						return _f5;
					// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:307)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getRule()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
					case 2 :
					case 3 :
						return null;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					// 
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureName", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getOrigLockedCells", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:86)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f24;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f25;
					// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:307)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
				// 
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:89)
			}
			argument_types = new Class[] { Collection.class };
			if (Stubs.matches(method, "addAll", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
			}
		}
		if (Stubs.matches(method, EvalUtil.class)) {
			argument_types = new Class[] { Rule.class, EvalState.class };
			if (Stubs.matches(method, "getChangeSet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return _f7;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalStdRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation22() throws Throwable {
		ES_EvalStdRulegroup THIS = new ES_EvalStdRulegroup();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		Object[] var1 = new Object[] {};
		ListMock t4 = new ListMock(var1);
		RuleGroup t5 = new RuleGroup();
		Rule t6 = new Rule();
		Formula t7 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		Boolean t8 = new Boolean(false);
		Long t9 = new Long("0");
		RuleSet t10 = new RuleSet();
		ClientInitRequest t11 = new ClientInitRequest();
		PafClientState t12 = new PafClientState((String) null, t11);
		_f0 = new PafApplicationDef();
		_f24 = new MdbDef();
		_f1 = new Rule();
		Formula t16 = new Formula();
		Boolean t17 = new Boolean(false);
		_f3 = new Formula((String) null, "", (MeasureFunctionFactory) null);
		_f2 = new PafApplicationDef();
		_f5 = new PafApplicationDef();
		_f25 = new MdbDef();
		_f4 = new Rule();
		Formula t23 = new Formula((String) null, (String) null);
		Boolean t24 = new Boolean(false);
		_f6 = new Formula();
		t3.setTimePeriodList(t4);
		t3.setRuleGroup(t5);
		t6.setKey(0);
		t6.setFormula(t7);
		String[] var2 = new String[] {};
		t6.setTriggerMeasures(var2);
		t6.setSkipAggregation(false);
		t6.setSkipAllocation(false);
		t6.setBaseAllocateMeasure("");
		t6.setLockAllocation(false);
		t6.setEvalLockedIntersections(false);
		t6.setCalcAllPeriods(false);
		t6.setLockSystemEvaluationResult(false);
		t6.setLockUserEvaluationResult(t8);
		t6.setLockAllPriorTime(false);
		t6.setInitialTBFirstAllocation(false);
		t3.setRule(t6);
		t3.setStartTime(t9);
		HashSet var3 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setForcedCalcs(var3);
		HashSet var4 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setRequiredCalcs(var4);
		t10.setDimension("");
		t10.setType(0);
		t10.setName("");
		String[] var5 = new String[] {};
		t10.setMeasureList(var5);
		t3.setMeasureRuleSet(t10);
		t3.setStateChanged(false);
		t3.setClientState(t12);
		t3.setTimeSliceMode(false);
		_f24.setYearDim("");
		String[] var6 = new String[] {};
		_f24.setHierDims(var6);
		_f24.setMeasureDim("");
		_f24.setPlanTypeDim("");
		_f24.setTimeDim("");
		_f24.setVersionDim("");
		_f24.setDataSourceId("");
		String[] var7 = new String[] {};
		_f24.setAxisPriority(var7);
		_f1.setKey(0);
		_f1.setFormula(t16);
		String[] var8 = new String[] {};
		_f1.setTriggerMeasures(var8);
		_f1.setSkipAggregation(false);
		_f1.setSkipAllocation(false);
		_f1.setBaseAllocateMeasure("");
		_f1.setLockAllocation(false);
		_f1.setEvalLockedIntersections(false);
		_f1.setCalcAllPeriods(false);
		_f1.setLockSystemEvaluationResult(false);
		_f1.setLockUserEvaluationResult(t17);
		_f1.setLockAllPriorTime(false);
		_f1.setInitialTBFirstAllocation(false);
		_f3.setExpression("");
		String[] var9 = new String[] {};
		_f3.setExpressionTerms(var9);
		_f3.setResultTerm("");
		_f3.setResultFunction(false);
		_f3.setParsed(false);
		_f25.setYearDim("");
		String[] var10 = new String[] {};
		_f25.setHierDims(var10);
		_f25.setMeasureDim("");
		_f25.setPlanTypeDim("");
		_f25.setTimeDim("");
		_f25.setVersionDim("");
		_f25.setDataSourceId("");
		String[] var11 = new String[] {};
		_f25.setAxisPriority(var11);
		_f4.setKey(0);
		_f4.setFormula(t23);
		String[] var12 = new String[] {};
		_f4.setTriggerMeasures(var12);
		_f4.setSkipAggregation(false);
		_f4.setSkipAllocation(false);
		_f4.setBaseAllocateMeasure("");
		_f4.setLockAllocation(false);
		_f4.setEvalLockedIntersections(false);
		_f4.setCalcAllPeriods(false);
		_f4.setLockSystemEvaluationResult(false);
		_f4.setLockUserEvaluationResult(t24);
		_f4.setLockAllPriorTime(false);
		_f4.setInitialTBFirstAllocation(false);
		_f6.setExpression("");
		String[] var13 = new String[] { null };
		_f6.setExpressionTerms(var13);
		_f6.setResultTerm("");
		_f6.setResultFunction(false);
		_f6.setParsed(false);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.rules.Formula.getTermMeasures(Formula.java:225)
		// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:438)
		// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPerformEvaluation22.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPerformEvaluation22(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:71)
					case 3 :
						return _f5;
					// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:430)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getRule()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
					case 2 :
						return _f4;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureName", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTimePeriodList", argument_types)) {
				return null;
				// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:434)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f24;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f25;
					// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:430)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Rule.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getFormula", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.rules.Rule.getFormula()");
				switch (index) {
					case 1 :
						return _f3;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
					case 2 :
						return _f6;
					// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:432)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTriggerMeasures", argument_types)) {
				return new String[0];
				// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:437)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
			}
		}
		if (Stubs.matches(method, Formula.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isResultFunction", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalStdRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation23() throws Throwable {
		ES_EvalStdRulegroup THIS = new ES_EvalStdRulegroup();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		Object[] var1 = new Object[] {};
		ListMock t4 = new ListMock(var1);
		RuleGroup t5 = new RuleGroup((Rule[]) null);
		Rule t6 = new Rule();
		Formula t7 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		Boolean t8 = new Boolean(false);
		Long t9 = new Long(0L);
		RuleSet t10 = new RuleSet();
		ClientInitRequest t11 = new ClientInitRequest();
		PafClientState t12 = new PafClientState((String) null, t11);
		_f0 = new PafApplicationDef();
		_f24 = new MdbDef();
		_f1 = new Rule();
		Formula t16 = new Formula();
		Boolean t17 = new Boolean(false);
		_f2 = new PafApplicationDef();
		String[] var2 = new String[] {};
		_f8 = Intersection.createIntersection(
			var2,
			(List) null,
			(List) null,
			(List) null);
		_f5 = new PafApplicationDef();
		_f25 = new MdbDef();
		t3.setTimePeriodList(t4);
		t3.setRuleGroup(t5);
		t6.setKey(0);
		t6.setFormula(t7);
		String[] var3 = new String[] {};
		t6.setTriggerMeasures(var3);
		t6.setSkipAggregation(false);
		t6.setSkipAllocation(false);
		t6.setBaseAllocateMeasure("");
		t6.setLockAllocation(false);
		t6.setEvalLockedIntersections(false);
		t6.setCalcAllPeriods(false);
		t6.setLockSystemEvaluationResult(false);
		t6.setLockUserEvaluationResult(t8);
		t6.setLockAllPriorTime(false);
		t6.setInitialTBFirstAllocation(false);
		t3.setRule(t6);
		t3.setStartTime(t9);
		HashSet var4 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setForcedCalcs(var4);
		HashSet var5 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setRequiredCalcs(var5);
		t3.setMeasureRuleSet(t10);
		t3.setStateChanged(false);
		t3.setClientState(t12);
		t3.setTimeSliceMode(false);
		_f24.setYearDim("");
		String[] var6 = new String[] {};
		_f24.setHierDims(var6);
		_f24.setMeasureDim("");
		_f24.setPlanTypeDim("");
		_f24.setTimeDim("");
		_f24.setVersionDim("");
		_f24.setDataSourceId("");
		String[] var7 = new String[] {};
		_f24.setAxisPriority(var7);
		_f1.setKey(0);
		_f1.setFormula(t16);
		String[] var8 = new String[] {};
		_f1.setTriggerMeasures(var8);
		_f1.setSkipAggregation(false);
		_f1.setSkipAllocation(false);
		_f1.setBaseAllocateMeasure("");
		_f1.setLockAllocation(false);
		_f1.setEvalLockedIntersections(false);
		_f1.setCalcAllPeriods(false);
		_f1.setLockSystemEvaluationResult(false);
		_f1.setLockUserEvaluationResult(t17);
		_f1.setLockAllPriorTime(false);
		_f1.setInitialTBFirstAllocation(false);
		_f25.setYearDim("");
		String[] var9 = new String[] {};
		_f25.setHierDims(var9);
		_f25.setMeasureDim("");
		_f25.setPlanTypeDim("");
		_f25.setTimeDim("");
		_f25.setVersionDim("");
		_f25.setDataSourceId("");
		String[] var10 = new String[] {};
		_f25.setAxisPriority(var10);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:308)
		// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPerformEvaluation23.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPerformEvaluation23(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:71)
					case 3 :
						return _f5;
					// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:307)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getRule()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
					case 2 :
					case 3 :
						return null;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					// 
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureName", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getOrigLockedCells", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:86)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f24;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f25;
					// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:307)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
				// 
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:89)
			}
			argument_types = new Class[] { Collection.class };
			if (Stubs.matches(method, "addAll", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
			}
		}
		if (Stubs.matches(method, EvalUtil.class)) {
			argument_types = new Class[] { Rule.class, EvalState.class };
			if (Stubs.matches(method, "getChangeSet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return _f8;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalStdRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation25() throws Throwable {
		ES_EvalStdRulegroup THIS = new ES_EvalStdRulegroup();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		Object[] var1 = new Object[] {};
		ListMock t4 = new ListMock(var1);
		RuleGroup t5 = new RuleGroup((Rule[]) null);
		Boolean t6 = new Boolean(false);
		Rule t7 = new Rule();
		Formula t8 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		Boolean t9 = new Boolean(false);
		Long t10 = new Long(0L);
		RuleSet t11 = new RuleSet();
		ClientInitRequest t12 = new ClientInitRequest();
		PafClientState t13 = new PafClientState((String) null, t12);
		_f0 = new PafApplicationDef();
		_f24 = new MdbDef();
		_f1 = new Rule();
		Formula t17 = new Formula();
		Boolean t18 = new Boolean(false);
		_f2 = new PafApplicationDef();
		String[] var2 = new String[] {};
		_f7 = new Intersection(var2);
		t3.setTimePeriodList(t4);
		Rule[] var3 = new Rule[] {};
		t5.setRules(var3);
		t5.setRuleGroupId("");
		t5.setBalanceSetKey("");
		t5.setPerpetual(false);
		t5.setDelayedPerpetual(false);
		t5.setSkipProtProc(false);
		t5.setPerpetualAllocation(false);
		t5.setPerformInitialAllocation(t6);
		t3.setRuleGroup(t5);
		t7.setKey(0);
		t7.setFormula(t8);
		String[] var4 = new String[] {};
		t7.setTriggerMeasures(var4);
		t7.setSkipAggregation(false);
		t7.setSkipAllocation(false);
		t7.setBaseAllocateMeasure("");
		t7.setLockAllocation(false);
		t7.setEvalLockedIntersections(false);
		t7.setCalcAllPeriods(false);
		t7.setLockSystemEvaluationResult(false);
		t7.setLockUserEvaluationResult(t9);
		t7.setLockAllPriorTime(false);
		t7.setInitialTBFirstAllocation(false);
		t3.setRule(t7);
		t3.setStartTime(t10);
		HashSet var5 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setForcedCalcs(var5);
		HashSet var6 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setRequiredCalcs(var6);
		t3.setMeasureRuleSet(t11);
		t3.setStateChanged(false);
		t3.setClientState(t13);
		t3.setTimeSliceMode(false);
		_f24.setYearDim("");
		String[] var7 = new String[] {};
		_f24.setHierDims(var7);
		_f24.setMeasureDim("");
		_f24.setPlanTypeDim("");
		_f24.setTimeDim("");
		_f24.setVersionDim("");
		_f24.setDataSourceId("");
		String[] var8 = new String[] {};
		_f24.setAxisPriority(var8);
		_f1.setKey(0);
		_f1.setFormula(t17);
		String[] var9 = new String[] {};
		_f1.setTriggerMeasures(var9);
		_f1.setSkipAggregation(false);
		_f1.setSkipAllocation(false);
		_f1.setBaseAllocateMeasure("");
		_f1.setLockAllocation(false);
		_f1.setEvalLockedIntersections(false);
		_f1.setCalcAllPeriods(false);
		_f1.setLockSystemEvaluationResult(false);
		_f1.setLockUserEvaluationResult(t18);
		_f1.setLockAllPriorTime(false);
		_f1.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);

		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:201)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPerformEvaluation25.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPerformEvaluation25(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:71)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getRule()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
					case 2 :
					case 3 :
						return null;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					// 
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureName", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getOrigLockedCells", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:86)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				return _f24;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
				// 
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:89)
			}
			argument_types = new Class[] { Collection.class };
			if (Stubs.matches(method, "addAll", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
			}
		}
		if (Stubs.matches(method, EvalUtil.class)) {
			argument_types = new Class[] { Rule.class, EvalState.class };
			if (Stubs.matches(method, "getChangeSet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
			}
			argument_types = new Class[] { Intersection.class, Rule.class,
					EvalState.class };
			if (Stubs.matches(method, "changeTriggersFormula", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
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
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
					case 2 :
						return Boolean.FALSE;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return _f7;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
			}
		}
		if (Stubs.matches(method, ES_EvalBase.class)) {
			argument_types = new Class[] { IEvalStep.class, EvalState.class,
					PafDataCache.class };
			if (Stubs.matches(method, "logEvalDetail", argument_types)) {
				throw new PafException();
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:201)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalStdRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation27() throws Throwable {
		ES_EvalStdRulegroup THIS = new ES_EvalStdRulegroup();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		Object[] var1 = new Object[] {};
		ListMock t4 = new ListMock(var1);
		RuleGroup t5 = new RuleGroup((Rule[]) null);
		Rule t6 = new Rule();
		Formula t7 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		Boolean t8 = new Boolean(false);
		Long t9 = new Long(0L);
		RuleSet t10 = new RuleSet();
		ClientInitRequest t11 = new ClientInitRequest();
		PafClientState t12 = new PafClientState((String) null, t11);
		_f0 = new PafApplicationDef();
		_f24 = new MdbDef();
		_f1 = new Rule();
		Formula t16 = new Formula();
		Boolean t17 = new Boolean(false);
		_f2 = new PafApplicationDef();
		Object[] var2 = new Object[] {};
		ListMock t19 = new ListMock(var2);
		Object[] var3 = new Object[] { null };
		ListMock t20 = new ListMock(var3);
		Object[] var4 = new Object[] { null };
		ListMock t21 = new ListMock(var4);
		String[] var5 = new String[] { null, null };
		_f8 = Intersection.createIntersection(var5, t19, t21, t20);
		_f5 = new PafApplicationDef();
		_f25 = new MdbDef();
		t3.setTimePeriodList(t4);
		t3.setRuleGroup(t5);
		t6.setKey(0);
		t6.setFormula(t7);
		String[] var6 = new String[] {};
		t6.setTriggerMeasures(var6);
		t6.setSkipAggregation(false);
		t6.setSkipAllocation(false);
		t6.setBaseAllocateMeasure("");
		t6.setLockAllocation(false);
		t6.setEvalLockedIntersections(false);
		t6.setCalcAllPeriods(false);
		t6.setLockSystemEvaluationResult(false);
		t6.setLockUserEvaluationResult(t8);
		t6.setLockAllPriorTime(false);
		t6.setInitialTBFirstAllocation(false);
		t3.setRule(t6);
		t3.setStartTime(t9);
		HashSet var7 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setForcedCalcs(var7);
		HashSet var8 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setRequiredCalcs(var8);
		t3.setMeasureRuleSet(t10);
		t3.setStateChanged(false);
		t3.setClientState(t12);
		t3.setTimeSliceMode(false);
		_f24.setYearDim("");
		String[] var9 = new String[] {};
		_f24.setHierDims(var9);
		_f24.setMeasureDim("");
		_f24.setPlanTypeDim("");
		_f24.setTimeDim("");
		_f24.setVersionDim("");
		_f24.setDataSourceId("");
		String[] var10 = new String[] {};
		_f24.setAxisPriority(var10);
		_f1.setKey(0);
		_f1.setFormula(t16);
		String[] var11 = new String[] {};
		_f1.setTriggerMeasures(var11);
		_f1.setSkipAggregation(false);
		_f1.setSkipAllocation(false);
		_f1.setBaseAllocateMeasure("");
		_f1.setLockAllocation(false);
		_f1.setEvalLockedIntersections(false);
		_f1.setCalcAllPeriods(false);
		_f1.setLockSystemEvaluationResult(false);
		_f1.setLockUserEvaluationResult(t17);
		_f1.setLockAllPriorTime(false);
		_f1.setInitialTBFirstAllocation(false);
		_f25.setYearDim("");
		String[] var12 = new String[] {};
		_f25.setHierDims(var12);
		_f25.setMeasureDim("");
		_f25.setPlanTypeDim("");
		_f25.setTimeDim("");
		_f25.setVersionDim("");
		_f25.setDataSourceId("");
		String[] var13 = new String[] {};
		_f25.setAxisPriority(var13);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.data.Intersection.getCoordinate(Intersection.java:67)
		// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:307)
		// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPerformEvaluation27.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPerformEvaluation27(
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
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.<init>(ES_EvalStdRulegroup.java:48)
			}
		}
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:71)
					case 3 :
						return _f5;
					// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:307)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getRule()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
					case 2 :
					case 3 :
						return null;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					// 
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureName", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getOrigLockedCells", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:86)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f24;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f25;
					// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:307)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
				// 
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:89)
			}
			argument_types = new Class[] { Collection.class };
			if (Stubs.matches(method, "addAll", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
			}
		}
		if (Stubs.matches(method, EvalUtil.class)) {
			argument_types = new Class[] { Rule.class, EvalState.class };
			if (Stubs.matches(method, "getChangeSet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return _f8;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalStdRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation28() throws Throwable {
		ES_EvalStdRulegroup THIS = new ES_EvalStdRulegroup();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		Object[] var1 = new Object[] {};
		ListMock t4 = new ListMock(var1);
		RuleGroup t5 = new RuleGroup((Rule[]) null);
		Boolean t6 = new Boolean(false);
		Rule t7 = new Rule();
		Formula t8 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		Boolean t9 = new Boolean(false);
		Long t10 = new Long(0L);
		RuleSet t11 = new RuleSet();
		ClientInitRequest t12 = new ClientInitRequest();
		PafClientState t13 = new PafClientState((String) null, t12);
		_f0 = new PafApplicationDef();
		_f24 = new MdbDef();
		_f1 = new Rule();
		Formula t17 = new Formula();
		Boolean t18 = new Boolean(false);
		_f2 = new PafApplicationDef();
		_f7 = new Intersection((String[]) null, (String[]) null);
		t3.setTimePeriodList(t4);
		Rule[] var2 = new Rule[] {};
		t5.setRules(var2);
		t5.setRuleGroupId("");
		t5.setBalanceSetKey("");
		t5.setPerpetual(false);
		t5.setDelayedPerpetual(false);
		t5.setSkipProtProc(false);
		t5.setPerpetualAllocation(false);
		t5.setPerformInitialAllocation(t6);
		t3.setRuleGroup(t5);
		t7.setKey(0);
		t7.setFormula(t8);
		String[] var3 = new String[] {};
		t7.setTriggerMeasures(var3);
		t7.setSkipAggregation(false);
		t7.setSkipAllocation(false);
		t7.setBaseAllocateMeasure("");
		t7.setLockAllocation(false);
		t7.setEvalLockedIntersections(false);
		t7.setCalcAllPeriods(false);
		t7.setLockSystemEvaluationResult(false);
		t7.setLockUserEvaluationResult(t9);
		t7.setLockAllPriorTime(false);
		t7.setInitialTBFirstAllocation(false);
		t3.setRule(t7);
		t3.setStartTime(t10);
		HashSet var4 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setForcedCalcs(var4);
		HashSet var5 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setRequiredCalcs(var5);
		t3.setMeasureRuleSet(t11);
		t3.setStateChanged(false);
		t3.setClientState(t13);
		t3.setTimeSliceMode(false);
		_f24.setYearDim("");
		String[] var6 = new String[] {};
		_f24.setHierDims(var6);
		_f24.setMeasureDim("");
		_f24.setPlanTypeDim("");
		_f24.setTimeDim("");
		_f24.setVersionDim("");
		_f24.setDataSourceId("");
		String[] var7 = new String[] {};
		_f24.setAxisPriority(var7);
		_f1.setKey(0);
		_f1.setFormula(t17);
		String[] var8 = new String[] {};
		_f1.setTriggerMeasures(var8);
		_f1.setSkipAggregation(false);
		_f1.setSkipAllocation(false);
		_f1.setBaseAllocateMeasure("");
		_f1.setLockAllocation(false);
		_f1.setEvalLockedIntersections(false);
		_f1.setCalcAllPeriods(false);
		_f1.setLockSystemEvaluationResult(false);
		_f1.setLockUserEvaluationResult(t18);
		_f1.setLockAllPriorTime(false);
		_f1.setInitialTBFirstAllocation(false);
		String[] var9 = new String[] {};
		_f7.setCoordinates(var9);
		String[] var10 = new String[] {};
		_f7.setDimensions(var10);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown
		// at com.palladium.paf.server.RuleMngr.findLeadingRule(RuleMngr.java:282)
		// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:100)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPerformEvaluation28.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPerformEvaluation28(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:71)
					case 3 :
						return null;
					// at com.palladium.paf.server.RuleMngr.findLeadingRule(RuleMngr.java:282)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:100)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getRule()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
					case 2 :
					case 3 :
						return null;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					// 
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureName", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getOrigLockedCells", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureType", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:96)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRuleGroup", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:100)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				return _f24;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
				// 
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:89)
			}
			argument_types = new Class[] { Collection.class };
			if (Stubs.matches(method, "addAll", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
			}
		}
		if (Stubs.matches(method, EvalUtil.class)) {
			argument_types = new Class[] { Rule.class, EvalState.class };
			if (Stubs.matches(method, "getChangeSet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
			}
			argument_types = new Class[] { Intersection.class, Rule.class,
					EvalState.class };
			if (Stubs.matches(method, "changeTriggersFormula", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return _f7;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalStdRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation29() throws Throwable {
		ES_EvalStdRulegroup THIS = new ES_EvalStdRulegroup();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		Object[] var1 = new Object[] {};
		ListMock t4 = new ListMock(var1);
		RuleGroup t5 = new RuleGroup((Rule[]) null);
		Rule t6 = new Rule();
		Formula t7 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		Boolean t8 = new Boolean(false);
		Long t9 = new Long(0L);
		RuleSet t10 = new RuleSet();
		ClientInitRequest t11 = new ClientInitRequest();
		PafClientState t12 = new PafClientState((String) null, t11);
		_f0 = new PafApplicationDef();
		_f24 = new MdbDef();
		_f1 = new Rule();
		Formula t16 = new Formula();
		Boolean t17 = new Boolean(false);
		_f2 = new PafApplicationDef();
		String[] var2 = new String[] {};
		_f8 = Intersection.createIntersection(
			var2,
			(List) null,
			(List) null,
			(List) null);
		_f5 = new PafApplicationDef();
		_f25 = new MdbDef();
		_f4 = new Rule();
		Formula t23 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		Boolean t24 = new Boolean(false);
		String[] var3 = new String[] {};
		_f7 = new Intersection(var3);
		_f9 = new PafApplicationDef();
		_f26 = new MdbDef();
		_f10 = new Rule();
		Formula t29 = new Formula();
		Boolean t30 = new Boolean(false);
		t3.setTimePeriodList(t4);
		t3.setRuleGroup(t5);
		t6.setKey(0);
		t6.setFormula(t7);
		String[] var4 = new String[] {};
		t6.setTriggerMeasures(var4);
		t6.setSkipAggregation(false);
		t6.setSkipAllocation(false);
		t6.setBaseAllocateMeasure("");
		t6.setLockAllocation(false);
		t6.setEvalLockedIntersections(false);
		t6.setCalcAllPeriods(false);
		t6.setLockSystemEvaluationResult(false);
		t6.setLockUserEvaluationResult(t8);
		t6.setLockAllPriorTime(false);
		t6.setInitialTBFirstAllocation(false);
		t3.setRule(t6);
		t3.setStartTime(t9);
		HashSet var5 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setForcedCalcs(var5);
		HashSet var6 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setRequiredCalcs(var6);
		t3.setMeasureRuleSet(t10);
		t3.setStateChanged(false);
		t3.setClientState(t12);
		t3.setTimeSliceMode(false);
		_f24.setYearDim("");
		String[] var7 = new String[] {};
		_f24.setHierDims(var7);
		_f24.setMeasureDim("");
		_f24.setPlanTypeDim("");
		_f24.setTimeDim("");
		_f24.setVersionDim("");
		_f24.setDataSourceId("");
		String[] var8 = new String[] {};
		_f24.setAxisPriority(var8);
		_f1.setKey(0);
		_f1.setFormula(t16);
		String[] var9 = new String[] {};
		_f1.setTriggerMeasures(var9);
		_f1.setSkipAggregation(false);
		_f1.setSkipAllocation(false);
		_f1.setBaseAllocateMeasure("");
		_f1.setLockAllocation(false);
		_f1.setEvalLockedIntersections(false);
		_f1.setCalcAllPeriods(false);
		_f1.setLockSystemEvaluationResult(false);
		_f1.setLockUserEvaluationResult(t17);
		_f1.setLockAllPriorTime(false);
		_f1.setInitialTBFirstAllocation(false);
		_f25.setYearDim("");
		String[] var10 = new String[] {};
		_f25.setHierDims(var10);
		_f25.setMeasureDim("");
		_f25.setPlanTypeDim("");
		_f25.setTimeDim("");
		_f25.setVersionDim("");
		_f25.setDataSourceId("");
		String[] var11 = new String[] {};
		_f25.setAxisPriority(var11);
		_f4.setKey(0);
		_f4.setFormula(t23);
		String[] var12 = new String[] {};
		_f4.setTriggerMeasures(var12);
		_f4.setSkipAggregation(false);
		_f4.setSkipAllocation(false);
		_f4.setBaseAllocateMeasure("");
		_f4.setLockAllocation(false);
		_f4.setEvalLockedIntersections(false);
		_f4.setCalcAllPeriods(false);
		_f4.setLockSystemEvaluationResult(false);
		_f4.setLockUserEvaluationResult(t24);
		_f4.setLockAllPriorTime(false);
		_f4.setInitialTBFirstAllocation(false);
		_f26.setYearDim("");
		String[] var13 = new String[] {};
		_f26.setHierDims(var13);
		_f26.setMeasureDim("");
		_f26.setPlanTypeDim("");
		_f26.setTimeDim("");
		_f26.setVersionDim("");
		_f26.setDataSourceId("");
		String[] var14 = new String[] {};
		_f26.setAxisPriority(var14);
		_f10.setKey(0);
		_f10.setFormula(t29);
		String[] var15 = new String[] { null };
		_f10.setTriggerMeasures(var15);
		_f10.setSkipAggregation(false);
		_f10.setSkipAllocation(false);
		_f10.setBaseAllocateMeasure("");
		_f10.setLockAllocation(false);
		_f10.setEvalLockedIntersections(false);
		_f10.setCalcAllPeriods(false);
		_f10.setLockSystemEvaluationResult(false);
		_f10.setLockUserEvaluationResult(t30);
		_f10.setLockAllPriorTime(false);
		_f10.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:319)
		// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPerformEvaluation29.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPerformEvaluation29(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:71)
					case 3 :
						return _f5;
					// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:307)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					case 4 :
						return _f9;
					// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:307)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getRule()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
					case 2 :
						return null;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					case 3 :
						return _f4;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					case 4 :
						return _f10;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureName", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getOrigLockedCells", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:86)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f24;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f25;
					// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:307)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					case 3 :
						return _f26;
					// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:307)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
				// 
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:89)
			}
			argument_types = new Class[] { Collection.class };
			if (Stubs.matches(method, "addAll", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
			}
		}
		if (Stubs.matches(method, EvalUtil.class)) {
			argument_types = new Class[] { Rule.class, EvalState.class };
			if (Stubs.matches(method, "getChangeSet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Iterator.next()");
				switch (index) {
					case 1 :
						return _f8;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
					case 2 :
						return _f7;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Intersection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getCoordinate", argument_types)) {
				return "";
				// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:307)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
			}
		}
		if (Stubs.matches(method, Formula.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTermMeasures", argument_types)) {
				return new String[0];
				// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:312)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalStdRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation32() throws Throwable {
		ES_EvalStdRulegroup THIS = new ES_EvalStdRulegroup();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		Object[] var1 = new Object[] {};
		ListMock t4 = new ListMock(var1);
		RuleGroup t5 = new RuleGroup((Rule[]) null);
		Boolean t6 = new Boolean(false);
		Rule t7 = new Rule();
		Formula t8 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		Boolean t9 = new Boolean(false);
		Long t10 = new Long(0L);
		RuleSet t11 = new RuleSet();
		ClientInitRequest t12 = new ClientInitRequest();
		PafClientState t13 = new PafClientState((String) null, t12);
		_f0 = new PafApplicationDef();
		_f24 = new MdbDef();
		_f1 = new Rule();
		Formula t17 = new Formula();
		Boolean t18 = new Boolean(false);
		_f2 = new PafApplicationDef();
		String[] var2 = new String[] {};
		_f8 = Intersection.createIntersection(
			var2,
			(List) null,
			(List) null,
			(List) null);
		_f7 = new Intersection((String[]) null, (String[]) null);
		_f4 = new Rule();
		Formula t23 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		Boolean t24 = new Boolean(false);
		t3.setTimePeriodList(t4);
		Rule[] var3 = new Rule[] {};
		t5.setRules(var3);
		t5.setRuleGroupId("");
		t5.setBalanceSetKey("");
		t5.setPerpetual(false);
		t5.setDelayedPerpetual(false);
		t5.setSkipProtProc(false);
		t5.setPerpetualAllocation(false);
		t5.setPerformInitialAllocation(t6);
		t3.setRuleGroup(t5);
		t7.setKey(0);
		t7.setFormula(t8);
		String[] var4 = new String[] {};
		t7.setTriggerMeasures(var4);
		t7.setSkipAggregation(false);
		t7.setSkipAllocation(false);
		t7.setBaseAllocateMeasure("");
		t7.setLockAllocation(false);
		t7.setEvalLockedIntersections(false);
		t7.setCalcAllPeriods(false);
		t7.setLockSystemEvaluationResult(false);
		t7.setLockUserEvaluationResult(t9);
		t7.setLockAllPriorTime(false);
		t7.setInitialTBFirstAllocation(false);
		t3.setRule(t7);
		t3.setStartTime(t10);
		HashSet var5 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setForcedCalcs(var5);
		HashSet var6 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setRequiredCalcs(var6);
		t3.setMeasureRuleSet(t11);
		t3.setStateChanged(false);
		t3.setClientState(t13);
		t3.setTimeSliceMode(false);
		_f24.setYearDim("");
		String[] var7 = new String[] {};
		_f24.setHierDims(var7);
		_f24.setMeasureDim("");
		_f24.setPlanTypeDim("");
		_f24.setTimeDim("");
		_f24.setVersionDim("");
		_f24.setDataSourceId("");
		String[] var8 = new String[] {};
		_f24.setAxisPriority(var8);
		_f1.setKey(0);
		_f1.setFormula(t17);
		String[] var9 = new String[] {};
		_f1.setTriggerMeasures(var9);
		_f1.setSkipAggregation(false);
		_f1.setSkipAllocation(false);
		_f1.setBaseAllocateMeasure("");
		_f1.setLockAllocation(false);
		_f1.setEvalLockedIntersections(false);
		_f1.setCalcAllPeriods(false);
		_f1.setLockSystemEvaluationResult(false);
		_f1.setLockUserEvaluationResult(t18);
		_f1.setLockAllPriorTime(false);
		_f1.setInitialTBFirstAllocation(false);
		_f4.setKey(0);
		_f4.setFormula(t23);
		String[] var10 = new String[] {};
		_f4.setTriggerMeasures(var10);
		_f4.setSkipAggregation(false);
		_f4.setSkipAllocation(false);
		_f4.setBaseAllocateMeasure("");
		_f4.setLockAllocation(false);
		_f4.setEvalLockedIntersections(false);
		_f4.setCalcAllPeriods(false);
		_f4.setLockSystemEvaluationResult(false);
		_f4.setLockUserEvaluationResult(t24);
		_f4.setLockAllPriorTime(false);
		_f4.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// ClassCastException thrown
		// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:173)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPerformEvaluation32.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPerformEvaluation32(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:71)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getRule()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
					case 2 :
					case 3 :
					case 4 :
					case 5 :
						return null;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					// 
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					// 
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:103)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureName", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getOrigLockedCells", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureType", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:96)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRuleGroup", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:100)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				return _f24;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
				// 
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:89)
			}
			argument_types = new Class[] { Collection.class };
			if (Stubs.matches(method, "addAll", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
			}
		}
		if (Stubs.matches(method, EvalUtil.class)) {
			argument_types = new Class[] { Rule.class, EvalState.class };
			if (Stubs.matches(method, "getChangeSet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
			}
			argument_types = new Class[] { Intersection.class, Rule.class,
					EvalState.class };
			if (Stubs.matches(method, "changeTriggersFormula", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.eval.EvalUtil.changeTriggersFormula(com.palladium.paf.data.Intersection,com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState)");
				switch (index) {
					case 1 :
						return Boolean.FALSE;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					case 2 :
						return Boolean.TRUE;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Iterator.hasNext()");
				switch (index) {
					case 1 :
					case 2 :
					case 4 :
						return Boolean.TRUE;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
					// 
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:173)
					case 3 :
						return Boolean.FALSE;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Iterator.next()");
				switch (index) {
					case 1 :
						return _f8;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
					case 2 :
						return _f7;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
					case 3 :
						return "";
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:173)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, RuleMngr.class)) {
			argument_types = new Class[] { RuleGroup.class, EvalState.class,
					Intersection.class };
			if (Stubs.matches(method, "findLeadingRule", argument_types)) {
				return _f4;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:100)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalStdRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation35() throws Throwable {
		ES_EvalStdRulegroup THIS = new ES_EvalStdRulegroup();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		Object[] var1 = new Object[] {};
		ListMock t4 = new ListMock(var1);
		RuleGroup t5 = new RuleGroup((Rule[]) null);
		Boolean t6 = new Boolean(false);
		Rule t7 = new Rule();
		Formula t8 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		Boolean t9 = new Boolean(false);
		Long t10 = new Long(0L);
		RuleSet t11 = new RuleSet();
		ClientInitRequest t12 = new ClientInitRequest();
		PafClientState t13 = new PafClientState((String) null, t12);
		_f0 = new PafApplicationDef();
		_f24 = new MdbDef();
		_f1 = new Rule();
		Formula t17 = new Formula();
		Boolean t18 = new Boolean(false);
		_f2 = new PafApplicationDef();
		Object[] var2 = new Object[] { "0" };
		ListMock t20 = new ListMock(var2);
		Object[] var3 = new Object[] {};
		ListMock t21 = new ListMock(var3);
		Object[] var4 = new Object[] { null };
		ListMock t22 = new ListMock(var4);
		String[] var5 = new String[] { "", null };
		_f8 = Intersection.createIntersection(var5, t20, t22, t21);
		_f5 = new PafApplicationDef();
		_f25 = new MdbDef();
		_f4 = new Rule();
		Formula t27 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		Boolean t28 = new Boolean(false);
		_f7 = new Intersection();
		_f9 = new PafApplicationDef();
		_f26 = new MdbDef();
		_f10 = new Rule();
		Formula t33 = new Formula();
		Boolean t34 = new Boolean((String) null);
		String[] var6 = new String[] { "", "" };
		_f12 = new Intersection(var6, (String[]) null);
		_f13 = new PafApplicationDef();
		SeasonList t37 = new SeasonList();
		MdbDef t38 = new MdbDef();
		_f28 = new MdbDef();
		_f17 = new Rule();
		t3.setTimePeriodList(t4);
		Rule[] var7 = new Rule[] {};
		t5.setRules(var7);
		t5.setRuleGroupId("");
		t5.setBalanceSetKey("");
		t5.setPerpetual(false);
		t5.setDelayedPerpetual(false);
		t5.setSkipProtProc(false);
		t5.setPerpetualAllocation(false);
		t5.setPerformInitialAllocation(t6);
		t3.setRuleGroup(t5);
		t7.setKey(0);
		t7.setFormula(t8);
		String[] var8 = new String[] {};
		t7.setTriggerMeasures(var8);
		t7.setSkipAggregation(false);
		t7.setSkipAllocation(false);
		t7.setBaseAllocateMeasure("");
		t7.setLockAllocation(false);
		t7.setEvalLockedIntersections(false);
		t7.setCalcAllPeriods(false);
		t7.setLockSystemEvaluationResult(false);
		t7.setLockUserEvaluationResult(t9);
		t7.setLockAllPriorTime(false);
		t7.setInitialTBFirstAllocation(false);
		t3.setRule(t7);
		t3.setStartTime(t10);
		HashSet var9 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setForcedCalcs(var9);
		HashSet var10 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setRequiredCalcs(var10);
		t3.setMeasureRuleSet(t11);
		t3.setStateChanged(false);
		t3.setClientState(t13);
		t3.setTimeSliceMode(false);
		_f24.setYearDim("");
		String[] var11 = new String[] {};
		_f24.setHierDims(var11);
		_f24.setMeasureDim("");
		_f24.setPlanTypeDim("");
		_f24.setTimeDim("");
		_f24.setVersionDim("");
		_f24.setDataSourceId("");
		String[] var12 = new String[] {};
		_f24.setAxisPriority(var12);
		_f1.setKey(0);
		_f1.setFormula(t17);
		String[] var13 = new String[] {};
		_f1.setTriggerMeasures(var13);
		_f1.setSkipAggregation(false);
		_f1.setSkipAllocation(false);
		_f1.setBaseAllocateMeasure("");
		_f1.setLockAllocation(false);
		_f1.setEvalLockedIntersections(false);
		_f1.setCalcAllPeriods(false);
		_f1.setLockSystemEvaluationResult(false);
		_f1.setLockUserEvaluationResult(t18);
		_f1.setLockAllPriorTime(false);
		_f1.setInitialTBFirstAllocation(false);
		_f25.setYearDim("");
		String[] var14 = new String[] {};
		_f25.setHierDims(var14);
		_f25.setMeasureDim("");
		_f25.setPlanTypeDim("");
		_f25.setTimeDim("");
		_f25.setVersionDim("");
		_f25.setDataSourceId("");
		String[] var15 = new String[] {};
		_f25.setAxisPriority(var15);
		_f4.setKey(0);
		_f4.setFormula(t27);
		String[] var16 = new String[] {};
		_f4.setTriggerMeasures(var16);
		_f4.setSkipAggregation(false);
		_f4.setSkipAllocation(false);
		_f4.setBaseAllocateMeasure("");
		_f4.setLockAllocation(false);
		_f4.setEvalLockedIntersections(false);
		_f4.setCalcAllPeriods(false);
		_f4.setLockSystemEvaluationResult(false);
		_f4.setLockUserEvaluationResult(t28);
		_f4.setLockAllPriorTime(false);
		_f4.setInitialTBFirstAllocation(false);
		String[] var17 = new String[] {};
		_f7.setCoordinates(var17);
		String[] var18 = new String[] { "" };
		_f7.setDimensions(var18);
		_f26.setYearDim("");
		String[] var19 = new String[] {};
		_f26.setHierDims(var19);
		_f26.setMeasureDim("0");
		_f26.setPlanTypeDim("");
		_f26.setTimeDim("");
		_f26.setVersionDim("");
		_f26.setDataSourceId("");
		String[] var20 = new String[] {};
		_f26.setAxisPriority(var20);
		_f10.setKey(0);
		_f10.setFormula(t33);
		String[] var21 = new String[] { "", "" };
		_f10.setTriggerMeasures(var21);
		_f10.setSkipAggregation(false);
		_f10.setSkipAllocation(false);
		_f10.setBaseAllocateMeasure("");
		_f10.setLockAllocation(false);
		_f10.setEvalLockedIntersections(false);
		_f10.setCalcAllPeriods(false);
		_f10.setLockSystemEvaluationResult(false);
		_f10.setLockUserEvaluationResult(t34);
		_f10.setLockAllPriorTime(false);
		_f10.setInitialTBFirstAllocation(false);
		_f13.setSeasonList(t37);
		_f13.setAppId("");
		PlanCycle[] var22 = new PlanCycle[] {};
		_f13.setPlanCycles(var22);
		_f13.setLastPeriod("");
		_f13.setCurrentYear("");
		t38.setYearDim("");
		String[] var23 = new String[] {};
		t38.setHierDims(var23);
		t38.setMeasureDim("");
		t38.setPlanTypeDim("");
		t38.setTimeDim("");
		t38.setVersionDim("");
		t38.setDataSourceId("");
		String[] var24 = new String[] {};
		t38.setAxisPriority(var24);
		_f13.setMdbDef(t38);
		Map var25 = (Map) Stubs.makeStubObject(Map.class);
		_f13.setMeasures(var25);
		Map var26 = (Map) Stubs.makeStubObject(Map.class);
		_f13.setVersions(var26);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:312)
		// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPerformEvaluation35.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPerformEvaluation35(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:71)
					case 3 :
						return _f5;
					// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:307)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					case 4 :
						return _f9;
					// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:307)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					case 5 :
						return _f13;
					// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:307)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getRule()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
					case 2 :
						return null;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					case 3 :
						return _f4;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					case 4 :
						return _f10;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					case 5 :
						return _f17;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureName", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getOrigLockedCells", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:86)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f24;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f25;
					// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:307)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					case 3 :
						return _f26;
					// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:307)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					case 4 :
						return _f28;
					// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:307)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
				// 
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:89)
			}
			argument_types = new Class[] { Collection.class };
			if (Stubs.matches(method, "addAll", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
			}
		}
		if (Stubs.matches(method, EvalUtil.class)) {
			argument_types = new Class[] { Rule.class, EvalState.class };
			if (Stubs.matches(method, "getChangeSet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Iterator.next()");
				switch (index) {
					case 1 :
						return _f8;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
					case 2 :
						return _f7;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
					case 3 :
						return _f12;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Formula.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTermMeasures", argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:312)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalStdRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation38() throws Throwable {
		ES_EvalStdRulegroup THIS = new ES_EvalStdRulegroup();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		Object[] var1 = new Object[] {};
		ListMock t4 = new ListMock(var1);
		RuleGroup t5 = new RuleGroup((Rule[]) null);
		Rule t6 = new Rule();
		Formula t7 = new Formula();
		Boolean t8 = new Boolean(false);
		Long t9 = new Long(0L);
		RuleSet t10 = new RuleSet();
		ClientInitRequest t11 = new ClientInitRequest();
		PafClientState t12 = new PafClientState((String) null, t11);
		_f0 = new PafApplicationDef();
		_f24 = new MdbDef();
		_f1 = new Rule();
		Formula t16 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		Boolean t17 = new Boolean(false);
		_f2 = new PafApplicationDef();
		String[] var2 = new String[] {};
		_f8 = Intersection.createIntersection(
			var2,
			(List) null,
			(List) null,
			(List) null);
		_f5 = new PafApplicationDef();
		SeasonList t21 = new SeasonList();
		MdbDef t22 = new MdbDef();
		_f25 = new MdbDef();
		Rule[] var3 = new Rule[] { null, null };
		_f11 = new RuleGroup(var3);
		t3.setTimePeriodList(t4);
		t3.setRuleGroup(t5);
		t6.setKey(0);
		t6.setFormula(t7);
		String[] var4 = new String[] {};
		t6.setTriggerMeasures(var4);
		t6.setSkipAggregation(false);
		t6.setSkipAllocation(false);
		t6.setBaseAllocateMeasure("");
		t6.setLockAllocation(false);
		t6.setEvalLockedIntersections(false);
		t6.setCalcAllPeriods(false);
		t6.setLockSystemEvaluationResult(false);
		t6.setLockUserEvaluationResult(t8);
		t6.setLockAllPriorTime(false);
		t6.setInitialTBFirstAllocation(false);
		t3.setRule(t6);
		t3.setStartTime(t9);
		HashSet var5 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setForcedCalcs(var5);
		HashSet var6 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setRequiredCalcs(var6);
		t3.setMeasureRuleSet(t10);
		t3.setStateChanged(false);
		t3.setClientState(t12);
		t3.setTimeSliceMode(false);
		_f24.setYearDim("");
		String[] var7 = new String[] {};
		_f24.setHierDims(var7);
		_f24.setMeasureDim("");
		_f24.setPlanTypeDim("");
		_f24.setTimeDim("");
		_f24.setVersionDim("");
		_f24.setDataSourceId("");
		String[] var8 = new String[] {};
		_f24.setAxisPriority(var8);
		_f1.setKey(0);
		_f1.setFormula(t16);
		String[] var9 = new String[] {};
		_f1.setTriggerMeasures(var9);
		_f1.setSkipAggregation(false);
		_f1.setSkipAllocation(false);
		_f1.setBaseAllocateMeasure("");
		_f1.setLockAllocation(false);
		_f1.setEvalLockedIntersections(false);
		_f1.setCalcAllPeriods(false);
		_f1.setLockSystemEvaluationResult(false);
		_f1.setLockUserEvaluationResult(t17);
		_f1.setLockAllPriorTime(false);
		_f1.setInitialTBFirstAllocation(false);
		_f5.setSeasonList(t21);
		_f5.setAppId("");
		PlanCycle[] var10 = new PlanCycle[] {};
		_f5.setPlanCycles(var10);
		_f5.setLastPeriod("");
		_f5.setCurrentYear("");
		t22.setYearDim("");
		String[] var11 = new String[] {};
		t22.setHierDims(var11);
		t22.setMeasureDim("");
		t22.setPlanTypeDim("");
		t22.setTimeDim("");
		t22.setVersionDim("");
		t22.setDataSourceId("");
		String[] var12 = new String[] {};
		t22.setAxisPriority(var12);
		_f5.setMdbDef(t22);
		Map var13 = (Map) Stubs.makeStubObject(Map.class);
		_f5.setMeasures(var13);
		Map var14 = (Map) Stubs.makeStubObject(Map.class);
		_f5.setVersions(var14);
		_f25.setYearDim("");
		String[] var15 = new String[] {};
		_f25.setHierDims(var15);
		_f25.setMeasureDim("");
		_f25.setPlanTypeDim("");
		_f25.setTimeDim("");
		_f25.setVersionDim("");
		_f25.setDataSourceId("");
		String[] var16 = new String[] {};
		_f25.setAxisPriority(var16);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.server.RuleMngr.findLeadingRule(RuleMngr.java:289)
		// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:100)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPerformEvaluation38.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPerformEvaluation38(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:71)
					case 3 :
						return _f5;
					// at com.palladium.paf.server.RuleMngr.findLeadingRule(RuleMngr.java:282)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:100)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getRule()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
					case 2 :
					case 3 :
						return null;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					// 
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureName", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getOrigLockedCells", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureType", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:96)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRuleGroup", argument_types)) {
				return _f11;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:100)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f24;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f25;
					// at com.palladium.paf.server.RuleMngr.findLeadingRule(RuleMngr.java:282)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:100)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
				// 
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:89)
			}
			argument_types = new Class[] { Collection.class };
			if (Stubs.matches(method, "addAll", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
			}
		}
		if (Stubs.matches(method, EvalUtil.class)) {
			argument_types = new Class[] { Rule.class, EvalState.class };
			if (Stubs.matches(method, "getChangeSet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
			}
			argument_types = new Class[] { Intersection.class, Rule.class,
					EvalState.class };
			if (Stubs.matches(method, "changeTriggersFormula", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return _f8;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalStdRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation39() throws Throwable {
		ES_EvalStdRulegroup THIS = new ES_EvalStdRulegroup();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		Object[] var1 = new Object[] {};
		ListMock t4 = new ListMock(var1);
		RuleGroup t5 = new RuleGroup((Rule[]) null);
		Rule t6 = new Rule();
		Formula t7 = new Formula();
		Boolean t8 = new Boolean(false);
		Long t9 = new Long(0L);
		RuleSet t10 = new RuleSet();
		ClientInitRequest t11 = new ClientInitRequest();
		PafClientState t12 = new PafClientState((String) null, t11);
		_f0 = new PafApplicationDef();
		_f24 = new MdbDef();
		_f1 = new Rule();
		Formula t16 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		Boolean t17 = new Boolean(false);
		_f2 = new PafApplicationDef();
		_f7 = new Intersection();
		_f5 = new PafApplicationDef();
		_f25 = new MdbDef();
		t3.setTimePeriodList(t4);
		t3.setRuleGroup(t5);
		t6.setKey(0);
		t6.setFormula(t7);
		String[] var2 = new String[] {};
		t6.setTriggerMeasures(var2);
		t6.setSkipAggregation(false);
		t6.setSkipAllocation(false);
		t6.setBaseAllocateMeasure("");
		t6.setLockAllocation(false);
		t6.setEvalLockedIntersections(false);
		t6.setCalcAllPeriods(false);
		t6.setLockSystemEvaluationResult(false);
		t6.setLockUserEvaluationResult(t8);
		t6.setLockAllPriorTime(false);
		t6.setInitialTBFirstAllocation(false);
		t3.setRule(t6);
		t3.setStartTime(t9);
		HashSet var3 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setForcedCalcs(var3);
		HashSet var4 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setRequiredCalcs(var4);
		t3.setMeasureRuleSet(t10);
		t3.setStateChanged(false);
		t3.setClientState(t12);
		t3.setTimeSliceMode(false);
		_f24.setYearDim("");
		String[] var5 = new String[] {};
		_f24.setHierDims(var5);
		_f24.setMeasureDim("");
		_f24.setPlanTypeDim("");
		_f24.setTimeDim("");
		_f24.setVersionDim("");
		_f24.setDataSourceId("");
		String[] var6 = new String[] {};
		_f24.setAxisPriority(var6);
		_f1.setKey(0);
		_f1.setFormula(t16);
		String[] var7 = new String[] {};
		_f1.setTriggerMeasures(var7);
		_f1.setSkipAggregation(false);
		_f1.setSkipAllocation(false);
		_f1.setBaseAllocateMeasure("");
		_f1.setLockAllocation(false);
		_f1.setEvalLockedIntersections(false);
		_f1.setCalcAllPeriods(false);
		_f1.setLockSystemEvaluationResult(false);
		_f1.setLockUserEvaluationResult(t17);
		_f1.setLockAllPriorTime(false);
		_f1.setInitialTBFirstAllocation(false);
		String[] var8 = new String[] {};
		_f7.setCoordinates(var8);
		String[] var9 = new String[] { "" };
		_f7.setDimensions(var9);
		_f25.setYearDim("");
		String[] var10 = new String[] {};
		_f25.setHierDims(var10);
		_f25.setMeasureDim("");
		_f25.setPlanTypeDim("");
		_f25.setTimeDim("");
		_f25.setVersionDim("");
		_f25.setDataSourceId("");
		String[] var11 = new String[] {};
		_f25.setAxisPriority(var11);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);

		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.data.Intersection.hashCode(Intersection.java:108)
		// at java.util.HashMap.hash(HashMap.java:264)
		// at java.util.WeakHashMap.getEntry(WeakHashMap.java:370)
		// at java.util.WeakHashMap.containsKey(WeakHashMap.java:361)
		// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:307)
		// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPerformEvaluation39.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPerformEvaluation39(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:71)
					case 3 :
						return _f5;
					// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:307)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getRule()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
					case 2 :
					case 3 :
						return null;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					// 
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureName", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getOrigLockedCells", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:86)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f24;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f25;
					// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:307)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
				// 
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:89)
			}
			argument_types = new Class[] { Collection.class };
			if (Stubs.matches(method, "addAll", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
			}
		}
		if (Stubs.matches(method, EvalUtil.class)) {
			argument_types = new Class[] { Rule.class, EvalState.class };
			if (Stubs.matches(method, "getChangeSet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return _f7;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalStdRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation49() throws Throwable {
		ES_EvalStdRulegroup THIS = new ES_EvalStdRulegroup();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		MemberTreeSet t3 = new MemberTreeSet();
		PafSecurityToken t4 = new PafSecurityToken();
		PafApplicationDef t5 = new PafApplicationDef();
		String[] var1 = new String[] { null, "", null };
		String[][] var2 = new String[][] { { null, null, null }, null, null };
		UnitOfWork t6 = new UnitOfWork(var1, var2);
		PafPlannerRole t7 = new PafPlannerRole();
		Season t8 = new Season();
		PafPlannerConfig t9 = new PafPlannerConfig();
		EvalState t10 = new EvalState(t2);
		_f0 = new PafApplicationDef();
		SeasonList t12 = new SeasonList();
		MdbDef t13 = new MdbDef();
		_f24 = new MdbDef();
		_f1 = new Rule();
		Formula t16 = new Formula((String) null, (String) null);
		Boolean t17 = new Boolean(false);
		_f2 = new PafApplicationDef();
		_f5 = new PafApplicationDef();
		_f25 = new MdbDef();
		_f4 = new Rule();
		MeasureFunctionFactory var3 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		Formula t22 = new Formula((String) null, "", var3);
		Boolean t23 = new Boolean(false);
		t1.setClientType("");
		t1.setClientVersion("");
		t1.setIpAddress("");
		t1.setClientLanguage("0");
		t2.setUowTrees(t3);
		t2.setSecurityToken(t4);
		t2.setApp(t5);
		t2.setUnitOfWork(t6);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		t2.setRuleSets(var4);
		Set var5 = (Set) Stubs.makeStubObject(Set.class);
		t2.setLockedPeriods(var5);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		t2.setLockedForwardPlannableInterMap(var6);
		Map var7 = (Map) Stubs.makeStubObject(Map.class);
		t2.setLockedNotPlannableInterMap(var7);
		t7.setRoleDesc("");
		t7.setRoleName("");
		t7.setPlanType("");
		t7.setPlanVersion("");
		String[] var8 = new String[] {};
		t7.setSeasonIds(var8);
		t2.setPlannerRole(t7);
		t8.setOpen(false);
		PafDimSpec[] var9 = new PafDimSpec[] {};
		t8.setOtherDims(var9);
		t8.setYear("");
		t8.setId("");
		t8.setTimePeriod("");
		t8.setPlanCycle("");
		t2.setPlanSeason(t8);
		t2.setClientLanguage("");
		Map var10 = (Map) Stubs.makeStubObject(Map.class);
		t2.setUserSelections(var10);
		Set var11 = (Set) Stubs.makeStubObject(Set.class);
		t2.setActiveVersions(var11);
		t9.setCycle("");
		String[] var12 = new String[] {};
		t9.setMenuItemNames(var12);
		t9.setRole("");
		String[] var13 = new String[] {};
		t9.setViewTreeItemNames(var13);
		t9.setDefaultEvalEnabled(false);
		t9.setDefaultRulesetName("");
		String[] var14 = new String[] {};
		t9.setRuleSetNames(var14);
		String[] var15 = new String[] {};
		t9.setVersionFilter(var15);
		t2.setPlannerConfig(t9);
		_f0.setSeasonList(t12);
		_f0.setAppId("");
		PlanCycle[] var16 = new PlanCycle[] {};
		_f0.setPlanCycles(var16);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t13.setYearDim("");
		String[] var17 = new String[] {};
		t13.setHierDims(var17);
		t13.setMeasureDim("");
		t13.setPlanTypeDim("");
		t13.setTimeDim("");
		t13.setVersionDim("");
		t13.setDataSourceId("");
		String[] var18 = new String[] {};
		t13.setAxisPriority(var18);
		_f0.setMdbDef(t13);
		Map var19 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var19);
		Map var20 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var20);
		_f24.setYearDim("");
		String[] var21 = new String[] {};
		_f24.setHierDims(var21);
		_f24.setMeasureDim("");
		_f24.setPlanTypeDim("");
		_f24.setTimeDim("");
		_f24.setVersionDim("");
		_f24.setDataSourceId("");
		String[] var22 = new String[] {};
		_f24.setAxisPriority(var22);
		_f1.setKey(0);
		t16.setExpression("");
		String[] var23 = new String[] {};
		t16.setExpressionTerms(var23);
		t16.setResultTerm("");
		t16.setResultFunction(false);
		t16.setParsed(false);
		_f1.setFormula(t16);
		String[] var24 = new String[] {};
		_f1.setTriggerMeasures(var24);
		_f1.setSkipAggregation(false);
		_f1.setSkipAllocation(false);
		_f1.setBaseAllocateMeasure("");
		_f1.setLockAllocation(false);
		_f1.setEvalLockedIntersections(false);
		_f1.setCalcAllPeriods(false);
		_f1.setLockSystemEvaluationResult(false);
		_f1.setLockUserEvaluationResult(t17);
		_f1.setLockAllPriorTime(false);
		_f1.setInitialTBFirstAllocation(false);
		_f4.setKey(0);
		_f4.setFormula(t22);
		String[] var25 = new String[] { null };
		_f4.setTriggerMeasures(var25);
		_f4.setSkipAggregation(false);
		_f4.setSkipAllocation(false);
		_f4.setBaseAllocateMeasure("");
		_f4.setLockAllocation(false);
		_f4.setEvalLockedIntersections(false);
		_f4.setCalcAllPeriods(false);
		_f4.setLockSystemEvaluationResult(false);
		_f4.setLockUserEvaluationResult(t23);
		_f4.setLockAllPriorTime(false);
		_f4.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		THIS.performEvaluation(
			t10,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:446)
		// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPerformEvaluation49.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPerformEvaluation49(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:71)
					case 3 :
						return _f5;
					// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:430)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getRule()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
					case 2 :
						return _f4;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureName", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTimePeriodList", argument_types)) {
				return null;
				// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:434)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getChangedCellsByMsr", argument_types)) {
				return null;
				// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:446)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f24;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f25;
					// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:430)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
			}
		}
		if (Stubs.matches(method, MeasureFunctionFactory.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "isFunction", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
				// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:432)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalStdRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation50() throws Throwable {
		ES_EvalStdRulegroup THIS = new ES_EvalStdRulegroup();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		_f0 = new PafApplicationDef();
		_f24 = new MdbDef();
		_f1 = new Rule();
		Formula t7 = new Formula((String) null, (String) null);
		Boolean t8 = new Boolean(false);
		_f2 = new PafApplicationDef();
		_f5 = new PafApplicationDef();
		_f25 = new MdbDef();
		_f4 = new Rule();
		MeasureFunctionFactory var1 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		Formula t13 = new Formula((String) null, "", var1);
		Boolean t14 = new Boolean(false);
		_f24.setYearDim("");
		String[] var2 = new String[] {};
		_f24.setHierDims(var2);
		_f24.setMeasureDim("");
		_f24.setPlanTypeDim("");
		_f24.setTimeDim("");
		_f24.setVersionDim("");
		_f24.setDataSourceId("");
		String[] var3 = new String[] {};
		_f24.setAxisPriority(var3);
		_f1.setKey(0);
		t7.setExpression("");
		String[] var4 = new String[] {};
		t7.setExpressionTerms(var4);
		t7.setResultTerm("");
		t7.setResultFunction(false);
		t7.setParsed(false);
		_f1.setFormula(t7);
		String[] var5 = new String[] {};
		_f1.setTriggerMeasures(var5);
		_f1.setSkipAggregation(false);
		_f1.setSkipAllocation(false);
		_f1.setBaseAllocateMeasure("");
		_f1.setLockAllocation(false);
		_f1.setEvalLockedIntersections(false);
		_f1.setCalcAllPeriods(false);
		_f1.setLockSystemEvaluationResult(false);
		_f1.setLockUserEvaluationResult(t8);
		_f1.setLockAllPriorTime(false);
		_f1.setInitialTBFirstAllocation(false);
		_f25.setYearDim("");
		String[] var6 = new String[] {};
		_f25.setHierDims(var6);
		_f25.setMeasureDim("");
		_f25.setPlanTypeDim("");
		_f25.setTimeDim("");
		_f25.setVersionDim("");
		_f25.setDataSourceId("");
		String[] var7 = new String[] {};
		_f25.setAxisPriority(var7);
		_f4.setKey(0);
		_f4.setFormula(t13);
		String[] var8 = new String[] { null };
		_f4.setTriggerMeasures(var8);
		_f4.setSkipAggregation(false);
		_f4.setSkipAllocation(false);
		_f4.setBaseAllocateMeasure("");
		_f4.setLockAllocation(false);
		_f4.setEvalLockedIntersections(false);
		_f4.setCalcAllPeriods(false);
		_f4.setLockSystemEvaluationResult(false);
		_f4.setLockUserEvaluationResult(t14);
		_f4.setLockAllPriorTime(false);
		_f4.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);

		// ClassCastException thrown
		// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:446)
		// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPerformEvaluation50.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPerformEvaluation50(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:71)
					case 3 :
						return _f5;
					// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:430)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getRule()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
					case 2 :
						return _f4;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureName", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTimePeriodList", argument_types)) {
				return null;
				// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:434)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getChangedCellsByMsr", argument_types)) {
				return Stubs.makeStubObject(Map.class);
				// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:446)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f24;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f25;
					// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:430)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
			}
		}
		if (Stubs.matches(method, MeasureFunctionFactory.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "isFunction", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
				// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:432)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:446)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalStdRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation51() throws Throwable {
		ES_EvalStdRulegroup THIS = new ES_EvalStdRulegroup();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		_f0 = new PafApplicationDef();
		_f24 = new MdbDef();
		_f1 = new Rule();
		MeasureFunctionFactory var1 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		Formula t7 = new Formula((String) null, "", var1);
		Boolean t8 = new Boolean(false);
		_f2 = new PafApplicationDef();
		SeasonList t10 = new SeasonList();
		MdbDef t11 = new MdbDef();
		_f5 = new PafApplicationDef();
		_f25 = new MdbDef();
		_f4 = new Rule();
		Formula t15 = new Formula((String) null, (String) null);
		Boolean t16 = new Boolean(false);
		_f24.setYearDim("");
		String[] var2 = new String[] {};
		_f24.setHierDims(var2);
		_f24.setMeasureDim("");
		_f24.setPlanTypeDim("");
		_f24.setTimeDim("");
		_f24.setVersionDim("");
		_f24.setDataSourceId("");
		String[] var3 = new String[] {};
		_f24.setAxisPriority(var3);
		_f1.setKey(0);
		_f1.setFormula(t7);
		String[] var4 = new String[] {};
		_f1.setTriggerMeasures(var4);
		_f1.setSkipAggregation(false);
		_f1.setSkipAllocation(false);
		_f1.setBaseAllocateMeasure("");
		_f1.setLockAllocation(false);
		_f1.setEvalLockedIntersections(false);
		_f1.setCalcAllPeriods(false);
		_f1.setLockSystemEvaluationResult(false);
		_f1.setLockUserEvaluationResult(t8);
		_f1.setLockAllPriorTime(false);
		_f1.setInitialTBFirstAllocation(false);
		_f2.setSeasonList(t10);
		_f2.setAppId("");
		PlanCycle[] var5 = new PlanCycle[] {};
		_f2.setPlanCycles(var5);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
		t11.setYearDim("");
		String[] var6 = new String[] {};
		t11.setHierDims(var6);
		t11.setMeasureDim("");
		t11.setPlanTypeDim("");
		t11.setTimeDim("");
		t11.setVersionDim("");
		t11.setDataSourceId("");
		String[] var7 = new String[] {};
		t11.setAxisPriority(var7);
		_f2.setMdbDef(t11);
		Map var8 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var8);
		Map var9 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var9);
		_f4.setKey(0);
		_f4.setFormula(t15);
		String[] var10 = new String[] { null, null, null };
		_f4.setTriggerMeasures(var10);
		_f4.setSkipAggregation(false);
		_f4.setSkipAllocation(false);
		_f4.setBaseAllocateMeasure("");
		_f4.setLockAllocation(false);
		_f4.setEvalLockedIntersections(false);
		_f4.setCalcAllPeriods(true);
		_f4.setLockSystemEvaluationResult(false);
		_f4.setLockUserEvaluationResult(t16);
		_f4.setLockAllPriorTime(false);
		_f4.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);

		// ClassCastException thrown
		// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:451)
		// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPerformEvaluation51.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPerformEvaluation51(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:71)
					case 3 :
						return _f5;
					// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:430)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getRule()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
					case 2 :
						return _f4;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureName", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTimePeriodList", argument_types)) {
				return null;
				// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:434)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getChangedCellsByMsr", argument_types)) {
				return Stubs.makeStubObject(Map.class);
				// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:446)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f24;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f25;
					// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:430)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MeasureFunctionFactory.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "isFunction", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:451)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Map.get(java.lang.Object)");
				switch (index) {
					case 1 :
					case 2 :
						return null;
					// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:446)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					case 3 :
						return Stubs.makeStubObject(Set.class);
					// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:446)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:451)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return "";
				// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:451)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalStdRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation52() throws Throwable {
		ES_EvalStdRulegroup THIS = new ES_EvalStdRulegroup();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		_f0 = new PafApplicationDef();
		_f24 = new MdbDef();
		_f1 = new Rule();
		MeasureFunctionFactory var1 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		Formula t7 = new Formula((String) null, "", var1);
		Boolean t8 = new Boolean(false);
		_f2 = new PafApplicationDef();
		_f5 = new PafApplicationDef();
		_f25 = new MdbDef();
		_f4 = new Rule();
		Formula t13 = new Formula((String) null, (String) null);
		Boolean t14 = new Boolean(false);
		String[] var2 = new String[] {};
		_f8 = Intersection.createIntersection(
			var2,
			(List) null,
			(List) null,
			(List) null);
		_f24.setYearDim("");
		String[] var3 = new String[] {};
		_f24.setHierDims(var3);
		_f24.setMeasureDim("");
		_f24.setPlanTypeDim("");
		_f24.setTimeDim("");
		_f24.setVersionDim("");
		_f24.setDataSourceId("");
		String[] var4 = new String[] {};
		_f24.setAxisPriority(var4);
		_f1.setKey(0);
		_f1.setFormula(t7);
		String[] var5 = new String[] {};
		_f1.setTriggerMeasures(var5);
		_f1.setSkipAggregation(false);
		_f1.setSkipAllocation(false);
		_f1.setBaseAllocateMeasure("");
		_f1.setLockAllocation(false);
		_f1.setEvalLockedIntersections(false);
		_f1.setCalcAllPeriods(false);
		_f1.setLockSystemEvaluationResult(false);
		_f1.setLockUserEvaluationResult(t8);
		_f1.setLockAllPriorTime(false);
		_f1.setInitialTBFirstAllocation(false);
		_f25.setYearDim("");
		String[] var6 = new String[] {};
		_f25.setHierDims(var6);
		_f25.setMeasureDim("");
		_f25.setPlanTypeDim("");
		_f25.setTimeDim("");
		_f25.setVersionDim("");
		_f25.setDataSourceId("");
		String[] var7 = new String[] {};
		_f25.setAxisPriority(var7);
		_f4.setKey(0);
		_f4.setFormula(t13);
		String[] var8 = new String[] { null, null, null };
		_f4.setTriggerMeasures(var8);
		_f4.setSkipAggregation(false);
		_f4.setSkipAllocation(false);
		_f4.setBaseAllocateMeasure("");
		_f4.setLockAllocation(false);
		_f4.setEvalLockedIntersections(false);
		_f4.setCalcAllPeriods(true);
		_f4.setLockSystemEvaluationResult(false);
		_f4.setLockUserEvaluationResult(t14);
		_f4.setLockAllPriorTime(false);
		_f4.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:452)
		// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPerformEvaluation52.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPerformEvaluation52(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:71)
					case 3 :
						return _f5;
					// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:430)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getRule()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
					case 2 :
						return _f4;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureName", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTimePeriodList", argument_types)) {
				return null;
				// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:434)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getChangedCellsByMsr", argument_types)) {
				return Stubs.makeStubObject(Map.class);
				// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:446)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f24;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f25;
					// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:430)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MeasureFunctionFactory.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "isFunction", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:451)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Map.get(java.lang.Object)");
				switch (index) {
					case 1 :
					case 2 :
						return null;
					// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:446)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					case 3 :
						return Stubs.makeStubObject(Set.class);
					// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:446)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:451)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return _f8;
				// at com.palladium.paf.eval.EvalUtil.getChangeSet(EvalUtil.java:451)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalStdRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation53() throws Throwable {
		ES_EvalStdRulegroup THIS = new ES_EvalStdRulegroup();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		_f0 = new PafApplicationDef();
		_f24 = new MdbDef();
		_f1 = new Rule();
		MeasureFunctionFactory var1 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		Formula t7 = new Formula((String) null, "", var1);
		Boolean t8 = new Boolean(false);
		_f2 = new PafApplicationDef();
		SeasonList t10 = new SeasonList();
		MdbDef t11 = new MdbDef();
		String[] var2 = new String[] {};
		_f8 = Intersection.createIntersection(
			var2,
			(List) null,
			(List) null,
			(List) null);
		_f5 = new PafApplicationDef();
		_f25 = new MdbDef();
		_f4 = new Rule();
		MeasureFunctionFactory var3 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		Formula t16 = new Formula((String) null, "", var3);
		Boolean t17 = new Boolean(false);
		String[] var4 = new String[] {};
		_f14 = Intersection.createIntersection(
			var4,
			(List) null,
			(List) null,
			(List) null);
		_f9 = new PafApplicationDef();
		_f26 = new MdbDef();
		_f10 = new Rule();
		_f24.setYearDim("");
		String[] var5 = new String[] {};
		_f24.setHierDims(var5);
		_f24.setMeasureDim("");
		_f24.setPlanTypeDim("");
		_f24.setTimeDim("");
		_f24.setVersionDim("");
		_f24.setDataSourceId("");
		String[] var6 = new String[] {};
		_f24.setAxisPriority(var6);
		_f1.setKey(0);
		_f1.setFormula(t7);
		String[] var7 = new String[] {};
		_f1.setTriggerMeasures(var7);
		_f1.setSkipAggregation(false);
		_f1.setSkipAllocation(false);
		_f1.setBaseAllocateMeasure("");
		_f1.setLockAllocation(false);
		_f1.setEvalLockedIntersections(false);
		_f1.setCalcAllPeriods(false);
		_f1.setLockSystemEvaluationResult(false);
		_f1.setLockUserEvaluationResult(t8);
		_f1.setLockAllPriorTime(false);
		_f1.setInitialTBFirstAllocation(false);
		_f2.setSeasonList(t10);
		_f2.setAppId("");
		PlanCycle[] var8 = new PlanCycle[] {};
		_f2.setPlanCycles(var8);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
		t11.setYearDim("");
		String[] var9 = new String[] {};
		t11.setHierDims(var9);
		t11.setMeasureDim("");
		t11.setPlanTypeDim("");
		t11.setTimeDim("");
		t11.setVersionDim("");
		t11.setDataSourceId("");
		String[] var10 = new String[] {};
		t11.setAxisPriority(var10);
		_f2.setMdbDef(t11);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var11);
		Map var12 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var12);
		_f4.setKey(0);
		_f4.setFormula(t16);
		String[] var13 = new String[] { "", "", "" };
		_f4.setTriggerMeasures(var13);
		_f4.setSkipAggregation(false);
		_f4.setSkipAllocation(false);
		_f4.setBaseAllocateMeasure("");
		_f4.setLockAllocation(false);
		_f4.setEvalLockedIntersections(false);
		_f4.setCalcAllPeriods(false);
		_f4.setLockSystemEvaluationResult(false);
		_f4.setLockUserEvaluationResult(t17);
		_f4.setLockAllPriorTime(false);
		_f4.setInitialTBFirstAllocation(false);
		_f26.setYearDim("");
		String[] var14 = new String[] {};
		_f26.setHierDims(var14);
		_f26.setMeasureDim("");
		_f26.setPlanTypeDim("");
		_f26.setTimeDim("");
		_f26.setVersionDim("");
		_f26.setDataSourceId("");
		String[] var15 = new String[] {};
		_f26.setAxisPriority(var15);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:312)
		// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPerformEvaluation53.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPerformEvaluation53(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:71)
					case 3 :
						return _f5;
					// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:307)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					case 4 :
						return _f9;
					// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:307)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getRule()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
					case 2 :
						return null;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
					case 3 :
						return _f4;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					case 4 :
						return _f10;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureName", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getOrigLockedCells", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:86)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f24;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:58)
					case 2 :
						return _f25;
					// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:307)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					case 3 :
						return _f26;
					// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:307)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MeasureFunctionFactory.class)) {
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
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:65)
					case 2 :
						return Boolean.TRUE;
					// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
					// at com.palladium.paf.rules.Formula.init(Formula.java:87)
					// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
					// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:308)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getFunction", argument_types)) {
				return null;
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:270)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
				// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:308)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:79)
				// 
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:89)
			}
			argument_types = new Class[] { Collection.class };
			if (Stubs.matches(method, "addAll", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:86)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
			}
		}
		if (Stubs.matches(method, EvalUtil.class)) {
			argument_types = new Class[] { Rule.class, EvalState.class };
			if (Stubs.matches(method, "getChangeSet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:85)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Iterator.next()");
				switch (index) {
					case 1 :
						return _f8;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
					case 2 :
						return _f14;
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:93)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Intersection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getCoordinate", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.data.Intersection.getCoordinate(java.lang.String)");
				switch (index) {
					case 1 :
						return "0";
					// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:307)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
					case 2 :
						return "";
					// at com.palladium.paf.eval.EvalUtil.changeTriggersFormula(EvalUtil.java:307)
					// at com.palladium.paf.eval.ES_EvalStdRulegroup.performEvaluation(ES_EvalStdRulegroup.java:94)
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
     * Usage: java com.palladium.paf.eval.ES_EvalStdRulegroupTest
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
            ES_EvalStdRulegroupTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.eval.ES_EvalStdRulegroup",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return ES_EvalStdRulegroup.class;
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
private Rule _f1;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafApplicationDef _f2;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Formula _f3;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Rule _f4;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafApplicationDef _f5;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Formula _f6;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Intersection _f7;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private com.palladium.paf.data.Intersection _f8;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafApplicationDef _f9;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Rule _f10;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private RuleGroup _f11;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Intersection _f12;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafApplicationDef _f13;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private com.palladium.paf.data.Intersection _f14;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private com.palladium.paf.data.Intersection _f15;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private RuleGroup _f16;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Rule _f17;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Intersection _f18;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private com.palladium.paf.data.Intersection _f19;
			/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Rule _f22;
		/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private MdbDef _f24;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private MdbDef _f25;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private MdbDef _f26;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Formula _f27;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private MdbDef _f28;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafApplicationDef _f29;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private MdbDef _f30;
}

// JTEST_CURRENT_ID=524298498.