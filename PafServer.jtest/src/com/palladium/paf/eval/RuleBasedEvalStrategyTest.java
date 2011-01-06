/*
 * RuleBasedEvalStrategyTest.java
 * Created by Jtest on 9/19/06 5:55:37 PM.
 * Updated by Jtest on 10/18/06 2:33:33 PM, 20 test cases added, 2 test cases removed.
 * Updated by Jtest on 11/9/06 1:31:18 AM, 18 test cases added, 18 test cases removed.
 */

package com.palladium.paf.eval;

import org.hibernate.connection.DriverManagerConnectionProvider;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.DriverManager;
import java.util.List;
import com.palladium.paf.app.VersionVarianceType;
import com.palladium.paf.app.VersionFormula;
import com.palladium.paf.funcs.CustomFunctionDef;
import com.palladium.paf.app.VersionType;
import java.util.ArrayList;
import java.util.Set;
import com.palladium.paf.app.MeasureFunctionFactory;
import com.palladium.paf.rules.Formula;
import java.util.Iterator;
import java.util.Collection;
import com.palladium.paf.server.PafAppService;
import com.palladium.paf.PafException;
import java.util.HashSet;
import com.palladium.paf.rules.Rule;
import com.palladium.paf.rules.RuleGroup;
import java.util.Map;
import com.palladium.paf.app.PlanCycle;
import com.palladium.paf.app.MdbDef;
import com.palladium.paf.app.SeasonList;
import com.palladium.paf.data.Intersection;
import jtest.mocks.java.util.ListMock;
import com.palladium.paf.app.VersionDef;
import com.palladium.paf.app.PafApplicationDef;
import com.palladium.paf.server.PafDataService;
import com.palladium.paf.rules.RuleSet;
import com.palladium.paf.state.SliceState;
import com.palladium.paf.state.PafClientState;
import com.palladium.paf.comm.ClientInitRequest;
import java.lang.reflect.Member;
import jtest.Stubs;
import com.palladium.paf.state.EvalState;
import com.palladium.paf.mdb.PafDataCache;
import com.palladium.paf.eval.RuleBasedEvalStrategy;

/**
 * RuleBasedEvalStrategyTest is a unit test class for class RuleBasedEvalStrategy.
 * @see com.palladium.paf.eval.RuleBasedEvalStrategy
 * @author Parasoft Jtest 8.0
 */
public class RuleBasedEvalStrategyTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public RuleBasedEvalStrategyTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }

	/**
	 * Test for method: executeStrategy(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleBasedEvalStrategy#executeStrategy(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExecuteStrategy2() throws Throwable {
		RuleBasedEvalStrategy THIS = new RuleBasedEvalStrategy();
		EvalState var1 = (EvalState) Stubs.makeStubObject(EvalState.class);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.executeStrategy(var1, (PafDataCache) null);
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
		// at com.palladium.paf.eval.RuleBasedEvalStrategy.<init>(RuleBasedEvalStrategy.java:61)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExecuteStrategy2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExecuteStrategy2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[] { Long.class };
			if (Stubs.matches(method, "setStartTime", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureRuleSet", argument_types)) {
				return null;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:97)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: executeStrategy(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleBasedEvalStrategy#executeStrategy(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExecuteStrategy7() throws Throwable {
		RuleBasedEvalStrategy THIS = new RuleBasedEvalStrategy();
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
		_f0 = new RuleSet();
		_f1 = new PafApplicationDef();
		SeasonList t13 = new SeasonList();
		MdbDef t14 = new MdbDef();
		_f2 = new PafApplicationDef();
		SeasonList t16 = new SeasonList();
		MdbDef t17 = new MdbDef();
		_f3 = new PafApplicationDef();
		SeasonList t19 = new SeasonList();
		MdbDef t20 = new MdbDef();
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
		_f0.setDimension("");
		_f0.setType(0);
		_f0.setName("");
		String[] var4 = new String[] {};
		_f0.setMeasureList(var4);
		_f1.setSeasonList(t13);
		_f1.setAppId("");
		PlanCycle[] var5 = new PlanCycle[] {};
		_f1.setPlanCycles(var5);
		_f1.setLastPeriod("");
		_f1.setCurrentYear("");
		t14.setYearDim("");
		String[] var6 = new String[] {};
		t14.setHierDims(var6);
		t14.setMeasureDim("");
		t14.setPlanTypeDim("");
		t14.setTimeDim("");
		t14.setVersionDim("");
		t14.setDataSourceId("");
		String[] var7 = new String[] {};
		t14.setAxisPriority(var7);
		_f1.setMdbDef(t14);
		Map var8 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setMeasures(var8);
		Map var9 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setVersions(var9);
		_f2.setSeasonList(t16);
		_f2.setAppId("");
		PlanCycle[] var10 = new PlanCycle[] {};
		_f2.setPlanCycles(var10);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
		t17.setYearDim("");
		String[] var11 = new String[] {};
		t17.setHierDims(var11);
		t17.setMeasureDim("");
		t17.setPlanTypeDim("");
		t17.setTimeDim("");
		t17.setVersionDim("");
		t17.setDataSourceId("");
		String[] var12 = new String[] {};
		t17.setAxisPriority(var12);
		_f2.setMdbDef(t17);
		Map var13 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var13);
		Map var14 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var14);
		_f3.setSeasonList(t19);
		_f3.setAppId("");
		PlanCycle[] var15 = new PlanCycle[] {};
		_f3.setPlanCycles(var15);
		_f3.setLastPeriod("");
		_f3.setCurrentYear("");
		t20.setYearDim("");
		String[] var16 = new String[] {};
		t20.setHierDims(var16);
		t20.setMeasureDim("");
		t20.setPlanTypeDim("");
		t20.setTimeDim("");
		t20.setVersionDim("");
		t20.setDataSourceId("");
		String[] var17 = new String[] {};
		t20.setAxisPriority(var17);
		_f3.setMdbDef(t20);
		Map var18 = (Map) Stubs.makeStubObject(Map.class);
		_f3.setMeasures(var18);
		Map var19 = (Map) Stubs.makeStubObject(Map.class);
		_f3.setVersions(var19);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.executeStrategy(t3, (PafDataCache) null);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
		// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
		// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExecuteStrategy7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExecuteStrategy7(
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
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.<init>(RuleBasedEvalStrategy.java:61)
			}
		}
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(PafAppService.class);
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// at com.palladium.paf.eval.ES_Aggregate.<init>(ES_Aggregate.java:53)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.<init>(RuleBasedEvalStrategy.java:68)
			}
		}
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[] { Long.class };
			if (Stubs.matches(method, "setStartTime", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureRuleSet", argument_types)) {
				return _f0;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:97)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:100)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 3 :
						return _f3;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:167)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "values", argument_types)) {
				return Stubs.makeStubObject(Collection.class);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		if (Stubs.matches(method, Collection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: executeStrategy(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleBasedEvalStrategy#executeStrategy(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExecuteStrategy8() throws Throwable {
		RuleBasedEvalStrategy THIS = new RuleBasedEvalStrategy();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState((SliceState) null, t2);
		_f0 = new RuleSet();
		_f1 = new PafApplicationDef();
		SeasonList t6 = new SeasonList();
		MdbDef t7 = new MdbDef();
		_f1.setSeasonList(t6);
		_f1.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f1.setPlanCycles(var1);
		_f1.setLastPeriod("");
		_f1.setCurrentYear("");
		t7.setYearDim("");
		String[] var2 = new String[] {};
		t7.setHierDims(var2);
		t7.setMeasureDim("");
		t7.setPlanTypeDim("");
		t7.setTimeDim("");
		t7.setVersionDim("");
		t7.setDataSourceId("");
		String[] var3 = new String[] {};
		t7.setAxisPriority(var3);
		_f1.setMdbDef(t7);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setVersions(var5);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.executeStrategy(t3, (PafDataCache) null);
		// NullPointerException thrown
		// at com.palladium.paf.eval.RuleBasedEvalStrategy.processLooseMeasures(RuleBasedEvalStrategy.java:345)
		// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:122)
		// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExecuteStrategy8.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExecuteStrategy8(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[] { Long.class };
			if (Stubs.matches(method, "setStartTime", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureRuleSet", argument_types)) {
				return _f0;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:97)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:100)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 2 :
						return null;
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.processLooseMeasures(RuleBasedEvalStrategy.java:345)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:122)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, ES_ConvertVariances.class)) {
			argument_types = new Class[] { EvalState.class, PafDataCache.class,
					IFormulaEvalEngine.class };
			if (Stubs.matches(method, "performEvaluation", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: executeStrategy(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleBasedEvalStrategy#executeStrategy(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExecuteStrategy9() throws Throwable {
		RuleBasedEvalStrategy THIS = new RuleBasedEvalStrategy();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		_f0 = new RuleSet();
		_f1 = new PafApplicationDef();
		SeasonList t6 = new SeasonList();
		MdbDef t7 = new MdbDef();
		_f2 = new PafApplicationDef();
		SeasonList t9 = new SeasonList();
		MdbDef t10 = new MdbDef();
		_f3 = new PafApplicationDef();
		SeasonList t12 = new SeasonList();
		MdbDef t13 = new MdbDef();
		_f0.setDimension("");
		_f0.setType(0);
		_f0.setName("");
		String[] var1 = new String[] {};
		_f0.setMeasureList(var1);
		_f1.setSeasonList(t6);
		_f1.setAppId("");
		PlanCycle[] var2 = new PlanCycle[] {};
		_f1.setPlanCycles(var2);
		_f1.setLastPeriod("");
		_f1.setCurrentYear("");
		t7.setYearDim("");
		String[] var3 = new String[] {};
		t7.setHierDims(var3);
		t7.setMeasureDim("");
		t7.setPlanTypeDim("");
		t7.setTimeDim("");
		t7.setVersionDim("");
		t7.setDataSourceId("");
		String[] var4 = new String[] {};
		t7.setAxisPriority(var4);
		_f1.setMdbDef(t7);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setMeasures(var5);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setVersions(var6);
		_f2.setSeasonList(t9);
		_f2.setAppId("");
		PlanCycle[] var7 = new PlanCycle[] {};
		_f2.setPlanCycles(var7);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
		t10.setYearDim("");
		String[] var8 = new String[] {};
		t10.setHierDims(var8);
		t10.setMeasureDim("");
		t10.setPlanTypeDim("");
		t10.setTimeDim("");
		t10.setVersionDim("");
		t10.setDataSourceId("");
		String[] var9 = new String[] {};
		t10.setAxisPriority(var9);
		_f2.setMdbDef(t10);
		Map var10 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var10);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var11);
		_f3.setSeasonList(t12);
		_f3.setAppId("");
		PlanCycle[] var12 = new PlanCycle[] {};
		_f3.setPlanCycles(var12);
		_f3.setLastPeriod("");
		_f3.setCurrentYear("");
		t13.setYearDim("");
		String[] var13 = new String[] {};
		t13.setHierDims(var13);
		t13.setMeasureDim("");
		t13.setPlanTypeDim("");
		t13.setTimeDim("");
		t13.setVersionDim("");
		t13.setDataSourceId("");
		String[] var14 = new String[] {};
		t13.setAxisPriority(var14);
		_f3.setMdbDef(t13);
		Map var15 = (Map) Stubs.makeStubObject(Map.class);
		_f3.setMeasures(var15);
		Map var16 = (Map) Stubs.makeStubObject(Map.class);
		_f3.setVersions(var16);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.executeStrategy(t3, (PafDataCache) null);
		// ClassCastException thrown
		// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
		// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
		// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
		// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExecuteStrategy9.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExecuteStrategy9(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[] { Long.class };
			if (Stubs.matches(method, "setStartTime", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureRuleSet", argument_types)) {
				return _f0;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:97)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:100)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 3 :
						return _f3;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:167)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "values", argument_types)) {
				return Stubs.makeStubObject(Collection.class);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		if (Stubs.matches(method, Collection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return "";
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: executeStrategy(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleBasedEvalStrategy#executeStrategy(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExecuteStrategy10() throws Throwable {
		RuleBasedEvalStrategy THIS = new RuleBasedEvalStrategy();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState((SliceState) null, t2);
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
		_f0 = new RuleSet();
		_f1 = new PafApplicationDef();
		SeasonList t15 = new SeasonList();
		MdbDef t16 = new MdbDef();
		_f2 = new PafApplicationDef();
		SeasonList t18 = new SeasonList();
		MdbDef t19 = new MdbDef();
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
		_f0.setDimension("");
		_f0.setType(0);
		_f0.setName("");
		String[] var5 = new String[] {};
		_f0.setMeasureList(var5);
		_f1.setSeasonList(t15);
		_f1.setAppId("");
		PlanCycle[] var6 = new PlanCycle[] {};
		_f1.setPlanCycles(var6);
		_f1.setLastPeriod("");
		_f1.setCurrentYear("");
		t16.setYearDim("");
		String[] var7 = new String[] {};
		t16.setHierDims(var7);
		t16.setMeasureDim("");
		t16.setPlanTypeDim("");
		t16.setTimeDim("");
		t16.setVersionDim("");
		t16.setDataSourceId("");
		String[] var8 = new String[] {};
		t16.setAxisPriority(var8);
		_f1.setMdbDef(t16);
		Map var9 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setMeasures(var9);
		Map var10 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setVersions(var10);
		_f2.setSeasonList(t18);
		_f2.setAppId("");
		PlanCycle[] var11 = new PlanCycle[] {};
		_f2.setPlanCycles(var11);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
		t19.setYearDim("");
		String[] var12 = new String[] {};
		t19.setHierDims(var12);
		t19.setMeasureDim("");
		t19.setPlanTypeDim("");
		t19.setTimeDim("");
		t19.setVersionDim("");
		t19.setDataSourceId("");
		String[] var13 = new String[] {};
		t19.setAxisPriority(var13);
		_f2.setMdbDef(t19);
		Map var14 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var14);
		Map var15 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var15);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.executeStrategy(t3, (PafDataCache) null);
		assertEquals(null, RETVAL); // jtest_unverified
		assertEquals(5, t16.getDimCount()); // jtest_unverified
		assertEquals(5, t19.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testExecuteStrategy10.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExecuteStrategy10(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[] { Long.class };
			if (Stubs.matches(method, "setStartTime", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureRuleSet", argument_types)) {
				return _f0;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:97)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:100)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.processLooseMeasures(RuleBasedEvalStrategy.java:345)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:122)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getSliceState", argument_types)) {
				return null;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:164)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		if (Stubs.matches(method, ES_ConvertVariances.class)) {
			argument_types = new Class[] { EvalState.class, PafDataCache.class,
					IFormulaEvalEngine.class };
			if (Stubs.matches(method, "performEvaluation", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "keySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.processLooseMeasures(RuleBasedEvalStrategy.java:345)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:122)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		if (Stubs.matches(method, ArrayList.class)) {
			argument_types = new Class[] { Collection.class };
			if (Stubs.matches(method, "addAll", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.processLooseMeasures(RuleBasedEvalStrategy.java:345)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:122)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: executeStrategy(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleBasedEvalStrategy#executeStrategy(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExecuteStrategy12() throws Throwable {
		RuleBasedEvalStrategy THIS = new RuleBasedEvalStrategy();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		Object[] var1 = new Object[] {};
		ListMock t4 = new ListMock(var1);
		RuleGroup t5 = new RuleGroup((Rule[]) null);
		Boolean t6 = new Boolean(false);
		Rule t7 = new Rule();
		Long t8 = new Long(0L);
		RuleSet t9 = new RuleSet();
		ClientInitRequest t10 = new ClientInitRequest();
		PafClientState t11 = new PafClientState((String) null, t10);
		_f0 = new RuleSet();
		_f1 = new PafApplicationDef();
		SeasonList t14 = new SeasonList();
		MdbDef t15 = new MdbDef();
		_f2 = new PafApplicationDef();
		SeasonList t17 = new SeasonList();
		MdbDef t18 = new MdbDef();
		_f3 = new PafApplicationDef();
		SeasonList t20 = new SeasonList();
		MdbDef t21 = new MdbDef();
		_f4 = new VersionDef((String) null, (VersionType) null);
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
		t3.setRule(t7);
		t3.setStartTime(t8);
		HashSet var3 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setForcedCalcs(var3);
		HashSet var4 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setRequiredCalcs(var4);
		t3.setMeasureRuleSet(t9);
		t3.setStateChanged(false);
		t3.setClientState(t11);
		t3.setTimeSliceMode(false);
		_f0.setDimension("");
		_f0.setType(0);
		_f0.setName("");
		String[] var5 = new String[] {};
		_f0.setMeasureList(var5);
		_f1.setSeasonList(t14);
		_f1.setAppId("");
		PlanCycle[] var6 = new PlanCycle[] {};
		_f1.setPlanCycles(var6);
		_f1.setLastPeriod("");
		_f1.setCurrentYear("");
		t15.setYearDim("");
		String[] var7 = new String[] {};
		t15.setHierDims(var7);
		t15.setMeasureDim("");
		t15.setPlanTypeDim("");
		t15.setTimeDim("");
		t15.setVersionDim("");
		t15.setDataSourceId("");
		String[] var8 = new String[] {};
		t15.setAxisPriority(var8);
		_f1.setMdbDef(t15);
		Map var9 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setMeasures(var9);
		Map var10 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setVersions(var10);
		_f2.setSeasonList(t17);
		_f2.setAppId("");
		PlanCycle[] var11 = new PlanCycle[] {};
		_f2.setPlanCycles(var11);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
		t18.setYearDim("");
		String[] var12 = new String[] {};
		t18.setHierDims(var12);
		t18.setMeasureDim("");
		t18.setPlanTypeDim("");
		t18.setTimeDim("");
		t18.setVersionDim("");
		t18.setDataSourceId("");
		String[] var13 = new String[] {};
		t18.setAxisPriority(var13);
		_f2.setMdbDef(t18);
		Map var14 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var14);
		Map var15 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var15);
		_f3.setSeasonList(t20);
		_f3.setAppId("");
		PlanCycle[] var16 = new PlanCycle[] {};
		_f3.setPlanCycles(var16);
		_f3.setLastPeriod("");
		_f3.setCurrentYear("");
		t21.setYearDim("");
		String[] var17 = new String[] {};
		t21.setHierDims(var17);
		t21.setMeasureDim("");
		t21.setPlanTypeDim("");
		t21.setTimeDim("");
		t21.setVersionDim("");
		t21.setDataSourceId("");
		String[] var18 = new String[] {};
		t21.setAxisPriority(var18);
		_f3.setMdbDef(t21);
		Map var19 = (Map) Stubs.makeStubObject(Map.class);
		_f3.setMeasures(var19);
		Map var20 = (Map) Stubs.makeStubObject(Map.class);
		_f3.setVersions(var20);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.executeStrategy(t3, (PafDataCache) null);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:85)
		// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
		// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExecuteStrategy12.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExecuteStrategy12(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[] { Long.class };
			if (Stubs.matches(method, "setStartTime", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureRuleSet", argument_types)) {
				return _f0;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:97)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:100)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 3 :
						return _f3;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentLockedCells", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:85)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:167)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "values", argument_types)) {
				return Stubs.makeStubObject(Collection.class);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		if (Stubs.matches(method, Collection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
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
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 2 :
					case 3 :
						return Boolean.FALSE;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					// 
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return _f4;
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: executeStrategy(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleBasedEvalStrategy#executeStrategy(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExecuteStrategy13() throws Throwable {
		RuleBasedEvalStrategy THIS = new RuleBasedEvalStrategy();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState((SliceState) null, t2);
		_f0 = new RuleSet();
		_f1 = new PafApplicationDef();
		SeasonList t6 = new SeasonList();
		MdbDef t7 = new MdbDef();
		_f2 = new PafApplicationDef();
		SeasonList t9 = new SeasonList();
		MdbDef t10 = new MdbDef();
		_f5 = new SliceState();
		_f1.setSeasonList(t6);
		_f1.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f1.setPlanCycles(var1);
		_f1.setLastPeriod("");
		_f1.setCurrentYear("");
		t7.setYearDim("");
		String[] var2 = new String[] {};
		t7.setHierDims(var2);
		t7.setMeasureDim("");
		t7.setPlanTypeDim("");
		t7.setTimeDim("");
		t7.setVersionDim("");
		t7.setDataSourceId("");
		String[] var3 = new String[] {};
		t7.setAxisPriority(var3);
		_f1.setMdbDef(t7);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setVersions(var5);
		_f2.setSeasonList(t9);
		_f2.setAppId("");
		PlanCycle[] var6 = new PlanCycle[] {};
		_f2.setPlanCycles(var6);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
		t10.setYearDim("");
		String[] var7 = new String[] {};
		t10.setHierDims(var7);
		t10.setMeasureDim("");
		t10.setPlanTypeDim("");
		t10.setTimeDim("");
		t10.setVersionDim("");
		t10.setDataSourceId("");
		String[] var8 = new String[] {};
		t10.setAxisPriority(var8);
		_f2.setMdbDef(t10);
		Map var9 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var9);
		Map var10 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var10);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.executeStrategy(t3, (PafDataCache) null);
		// NullPointerException thrown
		// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:165)
		// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExecuteStrategy13.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExecuteStrategy13(
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
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.<init>(RuleBasedEvalStrategy.java:61)
			}
		}
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(PafAppService.class);
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// at com.palladium.paf.eval.ES_Aggregate.<init>(ES_Aggregate.java:53)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.<init>(RuleBasedEvalStrategy.java:68)
			}
		}
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[] { Long.class };
			if (Stubs.matches(method, "setStartTime", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureRuleSet", argument_types)) {
				return _f0;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:97)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:100)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.processLooseMeasures(RuleBasedEvalStrategy.java:345)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:122)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getSliceState", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getSliceState()");
				switch (index) {
					case 1 :
						return _f5;
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:164)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 2 :
						return null;
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:165)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, ES_ConvertVariances.class)) {
			argument_types = new Class[] { EvalState.class, PafDataCache.class,
					IFormulaEvalEngine.class };
			if (Stubs.matches(method, "performEvaluation", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "keySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.processLooseMeasures(RuleBasedEvalStrategy.java:345)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:122)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		if (Stubs.matches(method, ArrayList.class)) {
			argument_types = new Class[] { Collection.class };
			if (Stubs.matches(method, "addAll", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.processLooseMeasures(RuleBasedEvalStrategy.java:345)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:122)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: executeStrategy(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleBasedEvalStrategy#executeStrategy(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExecuteStrategy14() throws Throwable {
		RuleBasedEvalStrategy THIS = new RuleBasedEvalStrategy();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		_f0 = new RuleSet();
		_f1 = new PafApplicationDef();
		SeasonList t6 = new SeasonList();
		MdbDef t7 = new MdbDef();
		_f2 = new PafApplicationDef();
		SeasonList t9 = new SeasonList();
		MdbDef t10 = new MdbDef();
		_f3 = new PafApplicationDef();
		SeasonList t12 = new SeasonList();
		MdbDef t13 = new MdbDef();
		_f4 = new VersionDef((String) null, (VersionType) null);
		_f6 = new VersionDef();
		_f0.setDimension("");
		_f0.setType(0);
		_f0.setName("");
		String[] var1 = new String[] {};
		_f0.setMeasureList(var1);
		_f1.setSeasonList(t6);
		_f1.setAppId("");
		PlanCycle[] var2 = new PlanCycle[] {};
		_f1.setPlanCycles(var2);
		_f1.setLastPeriod("");
		_f1.setCurrentYear("");
		t7.setYearDim("");
		String[] var3 = new String[] {};
		t7.setHierDims(var3);
		t7.setMeasureDim("");
		t7.setPlanTypeDim("");
		t7.setTimeDim("");
		t7.setVersionDim("");
		t7.setDataSourceId("");
		String[] var4 = new String[] {};
		t7.setAxisPriority(var4);
		_f1.setMdbDef(t7);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setMeasures(var5);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setVersions(var6);
		_f2.setSeasonList(t9);
		_f2.setAppId("");
		PlanCycle[] var7 = new PlanCycle[] {};
		_f2.setPlanCycles(var7);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
		t10.setYearDim("");
		String[] var8 = new String[] {};
		t10.setHierDims(var8);
		t10.setMeasureDim("");
		t10.setPlanTypeDim("");
		t10.setTimeDim("");
		t10.setVersionDim("");
		t10.setDataSourceId("");
		String[] var9 = new String[] {};
		t10.setAxisPriority(var9);
		_f2.setMdbDef(t10);
		Map var10 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var10);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var11);
		_f3.setSeasonList(t12);
		_f3.setAppId("");
		PlanCycle[] var12 = new PlanCycle[] {};
		_f3.setPlanCycles(var12);
		_f3.setLastPeriod("");
		_f3.setCurrentYear("");
		t13.setYearDim("");
		String[] var13 = new String[] {};
		t13.setHierDims(var13);
		t13.setMeasureDim("");
		t13.setPlanTypeDim("");
		t13.setTimeDim("");
		t13.setVersionDim("");
		t13.setDataSourceId("");
		String[] var14 = new String[] {};
		t13.setAxisPriority(var14);
		_f3.setMdbDef(t13);
		Map var15 = (Map) Stubs.makeStubObject(Map.class);
		_f3.setMeasures(var15);
		Map var16 = (Map) Stubs.makeStubObject(Map.class);
		_f3.setVersions(var16);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.executeStrategy(t3, (PafDataCache) null);

		// ClassCastException thrown
		// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
		// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
		// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExecuteStrategy14.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExecuteStrategy14(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[] { Long.class };
			if (Stubs.matches(method, "setStartTime", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureRuleSet", argument_types)) {
				return _f0;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:97)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:100)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 3 :
						return _f3;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:167)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "values", argument_types)) {
				return Stubs.makeStubObject(Collection.class);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		if (Stubs.matches(method, Collection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
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
					case 5 :
						return Boolean.TRUE;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					// 
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 3 :
					case 4 :
						return Boolean.FALSE;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					// 
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
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
						return _f4;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 2 :
						return _f6;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 3 :
						return "";
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: executeStrategy(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleBasedEvalStrategy#executeStrategy(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExecuteStrategy15() throws Throwable {
		RuleBasedEvalStrategy THIS = new RuleBasedEvalStrategy();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState((SliceState) null, t2);
		Object[] var1 = new Object[] {};
		ListMock t4 = new ListMock(var1);
		RuleGroup t5 = new RuleGroup();
		Rule t6 = new Rule();
		CustomFunctionDef[] var2 = new CustomFunctionDef[] {};
		MeasureFunctionFactory t7 = new MeasureFunctionFactory(
			var2,
			(ClassLoader) null);
		Formula t8 = new Formula("0", " ", t7);
		Boolean t9 = new Boolean(false);
		Long t10 = new Long("0");
		RuleSet t11 = new RuleSet();
		ClientInitRequest t12 = new ClientInitRequest();
		PafClientState t13 = new PafClientState((String) null, t12);
		_f0 = new RuleSet();
		_f1 = new PafApplicationDef();
		SeasonList t16 = new SeasonList();
		MdbDef t17 = new MdbDef();
		t3.setTimePeriodList(t4);
		t3.setRuleGroup(t5);
		t6.setKey(0);
		t6.setFormula(t8);
		String[] var3 = new String[] {};
		t6.setTriggerMeasures(var3);
		t6.setSkipAggregation(false);
		t6.setSkipAllocation(false);
		t6.setBaseAllocateMeasure("");
		t6.setLockAllocation(false);
		t6.setEvalLockedIntersections(false);
		t6.setCalcAllPeriods(false);
		t6.setLockSystemEvaluationResult(false);
		t6.setLockUserEvaluationResult(t9);
		t6.setLockAllPriorTime(false);
		t6.setInitialTBFirstAllocation(false);
		t3.setRule(t6);
		t3.setStartTime(t10);
		HashSet var4 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setForcedCalcs(var4);
		HashSet var5 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setRequiredCalcs(var5);
		t3.setMeasureRuleSet(t11);
		t3.setStateChanged(false);
		t3.setClientState(t13);
		t3.setTimeSliceMode(false);
		_f0.setDimension("");
		_f0.setType(0);
		_f0.setName("");
		String[] var6 = new String[] { null };
		_f0.setMeasureList(var6);
		_f1.setSeasonList(t16);
		_f1.setAppId("");
		PlanCycle[] var7 = new PlanCycle[] {};
		_f1.setPlanCycles(var7);
		_f1.setLastPeriod("");
		_f1.setCurrentYear("");
		t17.setYearDim("");
		String[] var8 = new String[] {};
		t17.setHierDims(var8);
		t17.setMeasureDim("");
		t17.setPlanTypeDim("");
		t17.setTimeDim("");
		t17.setVersionDim("");
		t17.setDataSourceId("");
		String[] var9 = new String[] {};
		t17.setAxisPriority(var9);
		_f1.setMdbDef(t17);
		Map var10 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setMeasures(var10);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setVersions(var11);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.executeStrategy(t3, (PafDataCache) null);
		// NullPointerException thrown
		// at com.palladium.paf.eval.RuleBasedEvalStrategy.processLooseMeasures(RuleBasedEvalStrategy.java:367)
		// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:122)
		// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExecuteStrategy15.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExecuteStrategy15(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[] { Long.class };
			if (Stubs.matches(method, "setStartTime", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureRuleSet", argument_types)) {
				return _f0;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:97)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f1;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:100)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getChangedCellsByMsr", argument_types)) {
				return null;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.processLooseMeasures(RuleBasedEvalStrategy.java:367)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:122)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		if (Stubs.matches(method, ES_ConvertVariances.class)) {
			argument_types = new Class[] { EvalState.class, PafDataCache.class,
					IFormulaEvalEngine.class };
			if (Stubs.matches(method, "performEvaluation", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: executeStrategy(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleBasedEvalStrategy#executeStrategy(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExecuteStrategy16() throws Throwable {
		RuleBasedEvalStrategy THIS = new RuleBasedEvalStrategy();
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
		_f0 = new RuleSet();
		_f1 = new PafApplicationDef();
		SeasonList t13 = new SeasonList();
		MdbDef t14 = new MdbDef();
		_f2 = new PafApplicationDef();
		SeasonList t16 = new SeasonList();
		MdbDef t17 = new MdbDef();
		_f3 = new PafApplicationDef();
		SeasonList t19 = new SeasonList();
		MdbDef t20 = new MdbDef();
		_f4 = new VersionDef((String) null, (VersionType) null);
		VersionType t22 = VersionType.valueOf("Calculated");
		VersionFormula t23 = new VersionFormula(
			(String) null,
			(String) null,
			(VersionVarianceType) null);
		_f6 = new VersionDef();
		_f7 = new VersionDef((String) null, (VersionType) null);
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
		_f0.setDimension("");
		_f0.setType(0);
		_f0.setName("");
		String[] var4 = new String[] {};
		_f0.setMeasureList(var4);
		_f1.setSeasonList(t13);
		_f1.setAppId("");
		PlanCycle[] var5 = new PlanCycle[] {};
		_f1.setPlanCycles(var5);
		_f1.setLastPeriod("");
		_f1.setCurrentYear("");
		t14.setYearDim("");
		String[] var6 = new String[] {};
		t14.setHierDims(var6);
		t14.setMeasureDim("");
		t14.setPlanTypeDim("");
		t14.setTimeDim("");
		t14.setVersionDim("");
		t14.setDataSourceId("");
		String[] var7 = new String[] {};
		t14.setAxisPriority(var7);
		_f1.setMdbDef(t14);
		Map var8 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setMeasures(var8);
		Map var9 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setVersions(var9);
		_f2.setSeasonList(t16);
		_f2.setAppId("");
		PlanCycle[] var10 = new PlanCycle[] {};
		_f2.setPlanCycles(var10);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
		t17.setYearDim("");
		String[] var11 = new String[] {};
		t17.setHierDims(var11);
		t17.setMeasureDim("");
		t17.setPlanTypeDim("");
		t17.setTimeDim("");
		t17.setVersionDim("");
		t17.setDataSourceId("");
		String[] var12 = new String[] {};
		t17.setAxisPriority(var12);
		_f2.setMdbDef(t17);
		Map var13 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var13);
		Map var14 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var14);
		_f3.setSeasonList(t19);
		_f3.setAppId("");
		PlanCycle[] var15 = new PlanCycle[] {};
		_f3.setPlanCycles(var15);
		_f3.setLastPeriod("");
		_f3.setCurrentYear("");
		t20.setYearDim("");
		String[] var16 = new String[] {};
		t20.setHierDims(var16);
		t20.setMeasureDim("");
		t20.setPlanTypeDim("");
		t20.setTimeDim("");
		t20.setVersionDim("");
		t20.setDataSourceId("");
		String[] var17 = new String[] {};
		t20.setAxisPriority(var17);
		_f3.setMdbDef(t20);
		Map var18 = (Map) Stubs.makeStubObject(Map.class);
		_f3.setMeasures(var18);
		Map var19 = (Map) Stubs.makeStubObject(Map.class);
		_f3.setVersions(var19);
		Map var20 = (Map) Stubs.makeStubObject(Map.class);
		_f4.setAliases(var20);
		_f4.setName("");
		_f4.setNumericFormatName("");
		_f4.setType(t22);
		_f4.setVersionFormula(t23);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.executeStrategy(t3, (PafDataCache) null);

		// ClassCastException thrown
		// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
		// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
		// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExecuteStrategy16.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExecuteStrategy16(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[] { Long.class };
			if (Stubs.matches(method, "setStartTime", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureRuleSet", argument_types)) {
				return _f0;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:97)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:100)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 3 :
						return _f3;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:167)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "values", argument_types)) {
				return Stubs.makeStubObject(Collection.class);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		if (Stubs.matches(method, Collection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
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
					case 3 :
					case 5 :
						return Boolean.TRUE;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					// 
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 4 :
						return Boolean.FALSE;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
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
						return _f4;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 2 :
						return _f6;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 3 :
						return _f7;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 4 :
						return "";
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: executeStrategy(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleBasedEvalStrategy#executeStrategy(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExecuteStrategy17() throws Throwable {
		RuleBasedEvalStrategy THIS = new RuleBasedEvalStrategy();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		_f0 = new RuleSet();
		_f1 = new PafApplicationDef();
		SeasonList t6 = new SeasonList();
		MdbDef t7 = new MdbDef();
		_f2 = new PafApplicationDef();
		SeasonList t9 = new SeasonList();
		MdbDef t10 = new MdbDef();
		_f3 = new PafApplicationDef();
		_f0.setDimension("");
		_f0.setType(0);
		_f0.setName("");
		String[] var1 = new String[] {};
		_f0.setMeasureList(var1);
		_f1.setSeasonList(t6);
		_f1.setAppId("");
		PlanCycle[] var2 = new PlanCycle[] {};
		_f1.setPlanCycles(var2);
		_f1.setLastPeriod("");
		_f1.setCurrentYear("");
		t7.setYearDim("");
		String[] var3 = new String[] {};
		t7.setHierDims(var3);
		t7.setMeasureDim("");
		t7.setPlanTypeDim("");
		t7.setTimeDim("");
		t7.setVersionDim("");
		t7.setDataSourceId("");
		String[] var4 = new String[] {};
		t7.setAxisPriority(var4);
		_f1.setMdbDef(t7);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setMeasures(var5);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setVersions(var6);
		_f2.setSeasonList(t9);
		_f2.setAppId("");
		PlanCycle[] var7 = new PlanCycle[] {};
		_f2.setPlanCycles(var7);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
		t10.setYearDim("");
		String[] var8 = new String[] {};
		t10.setHierDims(var8);
		t10.setMeasureDim("");
		t10.setPlanTypeDim("");
		t10.setTimeDim("");
		t10.setVersionDim("");
		t10.setDataSourceId("");
		String[] var9 = new String[] {};
		t10.setAxisPriority(var9);
		_f2.setMdbDef(t10);
		Map var10 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var10);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var11);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.executeStrategy(t3, (PafDataCache) null);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:167)
		// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
		// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
		// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExecuteStrategy17.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExecuteStrategy17(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[] { Long.class };
			if (Stubs.matches(method, "setStartTime", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureRuleSet", argument_types)) {
				return _f0;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:97)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:100)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 3 :
						return _f3;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: executeStrategy(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleBasedEvalStrategy#executeStrategy(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExecuteStrategy18() throws Throwable {
		RuleBasedEvalStrategy THIS = new RuleBasedEvalStrategy();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState((SliceState) null, t2);
		Object[] var1 = new Object[] {};
		ListMock t4 = new ListMock(var1);
		RuleGroup t5 = new RuleGroup((Rule[]) null);
		Boolean t6 = new Boolean(false);
		Rule t7 = new Rule();
		Long t8 = new Long(0L);
		RuleSet t9 = new RuleSet();
		ClientInitRequest t10 = new ClientInitRequest();
		PafClientState t11 = new PafClientState((String) null, t10);
		_f0 = new RuleSet();
		_f1 = new PafApplicationDef();
		SeasonList t14 = new SeasonList();
		MdbDef t15 = new MdbDef();
		_f2 = new PafApplicationDef();
		SeasonList t17 = new SeasonList();
		MdbDef t18 = new MdbDef();
		_f3 = new PafApplicationDef();
		SeasonList t20 = new SeasonList();
		MdbDef t21 = new MdbDef();
		Object[] var2 = new Object[] {};
		_f8 = new ListMock(var2);
		_f9 = new Intersection((String[]) null, (String[]) null);
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
		t3.setRule(t7);
		t3.setStartTime(t8);
		HashSet var4 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setForcedCalcs(var4);
		HashSet var5 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setRequiredCalcs(var5);
		t3.setMeasureRuleSet(t9);
		t3.setStateChanged(false);
		t3.setClientState(t11);
		t3.setTimeSliceMode(false);
		_f0.setDimension("");
		_f0.setType(0);
		_f0.setName("");
		String[] var6 = new String[] {};
		_f0.setMeasureList(var6);
		_f1.setSeasonList(t14);
		_f1.setAppId("");
		PlanCycle[] var7 = new PlanCycle[] {};
		_f1.setPlanCycles(var7);
		_f1.setLastPeriod("");
		_f1.setCurrentYear("");
		t15.setYearDim("");
		String[] var8 = new String[] {};
		t15.setHierDims(var8);
		t15.setMeasureDim("");
		t15.setPlanTypeDim("");
		t15.setTimeDim("");
		t15.setVersionDim("");
		t15.setDataSourceId("");
		String[] var9 = new String[] {};
		t15.setAxisPriority(var9);
		_f1.setMdbDef(t15);
		Map var10 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setMeasures(var10);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setVersions(var11);
		_f2.setSeasonList(t17);
		_f2.setAppId("");
		PlanCycle[] var12 = new PlanCycle[] {};
		_f2.setPlanCycles(var12);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
		t18.setYearDim("");
		String[] var13 = new String[] {};
		t18.setHierDims(var13);
		t18.setMeasureDim("");
		t18.setPlanTypeDim("");
		t18.setTimeDim("");
		t18.setVersionDim("");
		t18.setDataSourceId("");
		String[] var14 = new String[] {};
		t18.setAxisPriority(var14);
		_f2.setMdbDef(t18);
		Map var15 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var15);
		Map var16 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var16);
		_f3.setSeasonList(t20);
		_f3.setAppId("");
		PlanCycle[] var17 = new PlanCycle[] {};
		_f3.setPlanCycles(var17);
		_f3.setLastPeriod("");
		_f3.setCurrentYear("");
		t21.setYearDim("");
		String[] var18 = new String[] {};
		t21.setHierDims(var18);
		t21.setMeasureDim("");
		t21.setPlanTypeDim("");
		t21.setTimeDim("");
		t21.setVersionDim("");
		t21.setDataSourceId("");
		String[] var19 = new String[] {};
		t21.setAxisPriority(var19);
		_f3.setMdbDef(t21);
		Map var20 = (Map) Stubs.makeStubObject(Map.class);
		_f3.setMeasures(var20);
		Map var21 = (Map) Stubs.makeStubObject(Map.class);
		_f3.setVersions(var21);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.executeStrategy(t3, (PafDataCache) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.data.Intersection.<init>([Ljava/lang/String;[Ljava/lang/String;)V>
		// at com.palladium.paf.data.Intersection.getCoordinate(Intersection.java:66)
		// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:76)
		// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
		// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExecuteStrategy18.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExecuteStrategy18(
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
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.<init>(RuleBasedEvalStrategy.java:61)
			}
		}
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(PafAppService.class);
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// at com.palladium.paf.eval.ES_Aggregate.<init>(ES_Aggregate.java:53)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.<init>(RuleBasedEvalStrategy.java:68)
			}
		}
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[] { Long.class };
			if (Stubs.matches(method, "setStartTime", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureRuleSet", argument_types)) {
				return _f0;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:97)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:100)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 3 :
						return _f3;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVarianceVersions", argument_types)) {
				return _f8;
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return _f9;
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: executeStrategy(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleBasedEvalStrategy#executeStrategy(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExecuteStrategy20() throws Throwable {
		RuleBasedEvalStrategy THIS = new RuleBasedEvalStrategy();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		Object[] var1 = new Object[] {};
		ListMock t4 = new ListMock(var1);
		RuleGroup t5 = new RuleGroup((Rule[]) null);
		Boolean t6 = new Boolean(false);
		Rule t7 = new Rule();
		Long t8 = new Long(0L);
		RuleSet t9 = new RuleSet();
		ClientInitRequest t10 = new ClientInitRequest();
		PafClientState t11 = new PafClientState((String) null, t10);
		_f0 = new RuleSet();
		_f1 = new PafApplicationDef();
		SeasonList t14 = new SeasonList();
		MdbDef t15 = new MdbDef();
		_f2 = new PafApplicationDef();
		SeasonList t17 = new SeasonList();
		MdbDef t18 = new MdbDef();
		_f3 = new PafApplicationDef();
		SeasonList t20 = new SeasonList();
		MdbDef t21 = new MdbDef();
		Object[] var2 = new Object[] {};
		_f8 = new ListMock(var2);
		String[] var3 = new String[] { null };
		_f13 = Intersection.createIntersection(
			var3,
			(List) null,
			(List) null,
			(List) null);
		t3.setTimePeriodList(t4);
		Rule[] var4 = new Rule[] {};
		t5.setRules(var4);
		t5.setRuleGroupId("");
		t5.setBalanceSetKey("");
		t5.setPerpetual(false);
		t5.setDelayedPerpetual(false);
		t5.setSkipProtProc(false);
		t5.setPerpetualAllocation(false);
		t5.setPerformInitialAllocation(t6);
		t3.setRuleGroup(t5);
		t3.setRule(t7);
		t3.setStartTime(t8);
		HashSet var5 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setForcedCalcs(var5);
		HashSet var6 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setRequiredCalcs(var6);
		t3.setMeasureRuleSet(t9);
		t3.setStateChanged(false);
		t3.setClientState(t11);
		t3.setTimeSliceMode(false);
		_f0.setDimension("");
		_f0.setType(0);
		_f0.setName("");
		String[] var7 = new String[] {};
		_f0.setMeasureList(var7);
		_f1.setSeasonList(t14);
		_f1.setAppId("");
		PlanCycle[] var8 = new PlanCycle[] {};
		_f1.setPlanCycles(var8);
		_f1.setLastPeriod("");
		_f1.setCurrentYear("");
		t15.setYearDim("");
		String[] var9 = new String[] {};
		t15.setHierDims(var9);
		t15.setMeasureDim("");
		t15.setPlanTypeDim("");
		t15.setTimeDim("");
		t15.setVersionDim("");
		t15.setDataSourceId("");
		String[] var10 = new String[] {};
		t15.setAxisPriority(var10);
		_f1.setMdbDef(t15);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setMeasures(var11);
		Map var12 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setVersions(var12);
		_f2.setSeasonList(t17);
		_f2.setAppId("");
		PlanCycle[] var13 = new PlanCycle[] {};
		_f2.setPlanCycles(var13);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
		t18.setYearDim("");
		String[] var14 = new String[] {};
		t18.setHierDims(var14);
		t18.setMeasureDim("");
		t18.setPlanTypeDim("");
		t18.setTimeDim("");
		t18.setVersionDim("");
		t18.setDataSourceId("");
		String[] var15 = new String[] {};
		t18.setAxisPriority(var15);
		_f2.setMdbDef(t18);
		Map var16 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var16);
		Map var17 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var17);
		_f3.setSeasonList(t20);
		_f3.setAppId("");
		PlanCycle[] var18 = new PlanCycle[] {};
		_f3.setPlanCycles(var18);
		_f3.setLastPeriod("");
		_f3.setCurrentYear("");
		t21.setYearDim("");
		String[] var19 = new String[] {};
		t21.setHierDims(var19);
		t21.setMeasureDim("");
		t21.setPlanTypeDim("");
		t21.setTimeDim("");
		t21.setVersionDim("");
		t21.setDataSourceId("");
		String[] var20 = new String[] {};
		t21.setAxisPriority(var20);
		_f3.setMdbDef(t21);
		Map var21 = (Map) Stubs.makeStubObject(Map.class);
		_f3.setMeasures(var21);
		Map var22 = (Map) Stubs.makeStubObject(Map.class);
		_f3.setVersions(var22);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.executeStrategy(t3, (PafDataCache) null);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.data.Intersection.getCoordinate(Intersection.java:67)
		// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:76)
		// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
		// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExecuteStrategy20.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExecuteStrategy20(
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
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.<init>(RuleBasedEvalStrategy.java:61)
			}
		}
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(PafAppService.class);
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// at com.palladium.paf.eval.ES_Aggregate.<init>(ES_Aggregate.java:53)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.<init>(RuleBasedEvalStrategy.java:68)
			}
		}
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[] { Long.class };
			if (Stubs.matches(method, "setStartTime", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureRuleSet", argument_types)) {
				return _f0;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:97)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:100)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 3 :
						return _f3;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVarianceVersions", argument_types)) {
				return _f8;
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return _f13;
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: executeStrategy(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleBasedEvalStrategy#executeStrategy(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExecuteStrategy21() throws Throwable {
		RuleBasedEvalStrategy THIS = new RuleBasedEvalStrategy();
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
		_f0 = new RuleSet();
		_f1 = new PafApplicationDef();
		SeasonList t13 = new SeasonList();
		MdbDef t14 = new MdbDef();
		_f2 = new PafApplicationDef();
		SeasonList t16 = new SeasonList();
		MdbDef t17 = new MdbDef();
		_f3 = new PafApplicationDef();
		SeasonList t19 = new SeasonList();
		MdbDef t20 = new MdbDef();
		_f4 = new VersionDef();
		VersionType t22 = VersionType.valueOf("Calculated");
		VersionFormula t23 = new VersionFormula(
			(String) null,
			(String) null,
			(VersionVarianceType) null);
		VersionVarianceType t24 = VersionVarianceType.valueOf("SimpleVariance");
		_f6 = new VersionDef((String) null, (VersionType) null);
		VersionType t26 = VersionType.valueOf("Calculated");
		VersionFormula t27 = new VersionFormula();
		_f7 = new VersionDef((String) null, (VersionType) null);
		_f10 = new VersionDef();
		_f14 = new VersionDef();
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
		_f0.setDimension("");
		_f0.setType(0);
		_f0.setName("");
		String[] var4 = new String[] {};
		_f0.setMeasureList(var4);
		_f1.setSeasonList(t13);
		_f1.setAppId("");
		PlanCycle[] var5 = new PlanCycle[] {};
		_f1.setPlanCycles(var5);
		_f1.setLastPeriod("");
		_f1.setCurrentYear("");
		t14.setYearDim("");
		String[] var6 = new String[] {};
		t14.setHierDims(var6);
		t14.setMeasureDim("");
		t14.setPlanTypeDim("");
		t14.setTimeDim("");
		t14.setVersionDim("");
		t14.setDataSourceId("");
		String[] var7 = new String[] {};
		t14.setAxisPriority(var7);
		_f1.setMdbDef(t14);
		Map var8 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setMeasures(var8);
		Map var9 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setVersions(var9);
		_f2.setSeasonList(t16);
		_f2.setAppId("");
		PlanCycle[] var10 = new PlanCycle[] {};
		_f2.setPlanCycles(var10);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
		t17.setYearDim("");
		String[] var11 = new String[] {};
		t17.setHierDims(var11);
		t17.setMeasureDim("");
		t17.setPlanTypeDim("");
		t17.setTimeDim("");
		t17.setVersionDim("");
		t17.setDataSourceId("");
		String[] var12 = new String[] {};
		t17.setAxisPriority(var12);
		_f2.setMdbDef(t17);
		Map var13 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var13);
		Map var14 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var14);
		_f3.setSeasonList(t19);
		_f3.setAppId("");
		PlanCycle[] var15 = new PlanCycle[] {};
		_f3.setPlanCycles(var15);
		_f3.setLastPeriod("");
		_f3.setCurrentYear("");
		t20.setYearDim("");
		String[] var16 = new String[] {};
		t20.setHierDims(var16);
		t20.setMeasureDim("");
		t20.setPlanTypeDim("");
		t20.setTimeDim("");
		t20.setVersionDim("");
		t20.setDataSourceId("");
		String[] var17 = new String[] {};
		t20.setAxisPriority(var17);
		_f3.setMdbDef(t20);
		Map var18 = (Map) Stubs.makeStubObject(Map.class);
		_f3.setMeasures(var18);
		Map var19 = (Map) Stubs.makeStubObject(Map.class);
		_f3.setVersions(var19);
		Map var20 = (Map) Stubs.makeStubObject(Map.class);
		_f4.setAliases(var20);
		_f4.setName("");
		_f4.setNumericFormatName("");
		_f4.setType(t22);
		t23.setBaseVersion("");
		t23.setCompareVersion("");
		t23.setVarianceType(t24);
		_f4.setVersionFormula(t23);
		Map var21 = (Map) Stubs.makeStubObject(Map.class);
		_f6.setAliases(var21);
		_f6.setName("");
		_f6.setNumericFormatName("");
		_f6.setType(t26);
		_f6.setVersionFormula(t27);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.executeStrategy(t3, (PafDataCache) null);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:67)
		// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
		// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExecuteStrategy21.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExecuteStrategy21(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[] { Long.class };
			if (Stubs.matches(method, "setStartTime", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureRuleSet", argument_types)) {
				return _f0;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:97)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:100)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 3 :
						return _f3;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:167)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "values", argument_types)) {
				return Stubs.makeStubObject(Collection.class);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		if (Stubs.matches(method, Collection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
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
					case 3 :
					case 4 :
					case 5 :
					case 7 :
						return Boolean.TRUE;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					// 
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 6 :
						return Boolean.FALSE;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
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
						return _f4;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 2 :
						return _f6;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 3 :
						return _f7;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 4 :
						return _f10;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 5 :
						return _f14;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 6 :
						return null;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: executeStrategy(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleBasedEvalStrategy#executeStrategy(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExecuteStrategy23() throws Throwable {
		RuleBasedEvalStrategy THIS = new RuleBasedEvalStrategy();
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
		_f0 = new RuleSet();
		_f1 = new PafApplicationDef();
		SeasonList t13 = new SeasonList();
		MdbDef t14 = new MdbDef();
		_f2 = new PafApplicationDef();
		SeasonList t16 = new SeasonList();
		MdbDef t17 = new MdbDef();
		_f3 = new PafApplicationDef();
		SeasonList t19 = new SeasonList();
		MdbDef t20 = new MdbDef();
		_f4 = new VersionDef();
		VersionType t22 = VersionType.valueOf("Calculated");
		VersionFormula t23 = new VersionFormula();
		VersionVarianceType t24 = VersionVarianceType.valueOf("SimpleVariance");
		_f6 = new VersionDef((String) null, (VersionType) null);
		_f7 = new VersionDef((String) null, (VersionType) null);
		VersionType t27 = VersionType.valueOf("Calculated");
		VersionFormula t28 = new VersionFormula(
			(String) null,
			(String) null,
			(VersionVarianceType) null);
		VersionVarianceType t29 = VersionVarianceType.valueOf("SimpleVariance");
		_f10 = new VersionDef();
		_f14 = new VersionDef();
		_f15 = new VersionDef((String) null, (VersionType) null);
		_f16 = new VersionDef((String) null, (VersionType) null);
		VersionType t34 = VersionType.valueOf("Calculated");
		VersionFormula t35 = new VersionFormula(
			(String) null,
			(String) null,
			(VersionVarianceType) null);
		_f9 = new Intersection((String[]) null, (String[]) null);
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
		_f0.setDimension("");
		_f0.setType(0);
		_f0.setName("");
		String[] var4 = new String[] {};
		_f0.setMeasureList(var4);
		_f1.setSeasonList(t13);
		_f1.setAppId("");
		PlanCycle[] var5 = new PlanCycle[] {};
		_f1.setPlanCycles(var5);
		_f1.setLastPeriod("");
		_f1.setCurrentYear("");
		t14.setYearDim("");
		String[] var6 = new String[] {};
		t14.setHierDims(var6);
		t14.setMeasureDim("");
		t14.setPlanTypeDim("");
		t14.setTimeDim("");
		t14.setVersionDim("");
		t14.setDataSourceId("");
		String[] var7 = new String[] {};
		t14.setAxisPriority(var7);
		_f1.setMdbDef(t14);
		Map var8 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setMeasures(var8);
		Map var9 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setVersions(var9);
		_f2.setSeasonList(t16);
		_f2.setAppId("");
		PlanCycle[] var10 = new PlanCycle[] {};
		_f2.setPlanCycles(var10);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
		t17.setYearDim("");
		String[] var11 = new String[] {};
		t17.setHierDims(var11);
		t17.setMeasureDim("");
		t17.setPlanTypeDim("");
		t17.setTimeDim("");
		t17.setVersionDim("");
		t17.setDataSourceId("");
		String[] var12 = new String[] {};
		t17.setAxisPriority(var12);
		_f2.setMdbDef(t17);
		Map var13 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var13);
		Map var14 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var14);
		_f3.setSeasonList(t19);
		_f3.setAppId("");
		PlanCycle[] var15 = new PlanCycle[] {};
		_f3.setPlanCycles(var15);
		_f3.setLastPeriod("");
		_f3.setCurrentYear("");
		t20.setYearDim("");
		String[] var16 = new String[] {};
		t20.setHierDims(var16);
		t20.setMeasureDim("");
		t20.setPlanTypeDim("");
		t20.setTimeDim("");
		t20.setVersionDim("");
		t20.setDataSourceId("");
		String[] var17 = new String[] {};
		t20.setAxisPriority(var17);
		_f3.setMdbDef(t20);
		Map var18 = (Map) Stubs.makeStubObject(Map.class);
		_f3.setMeasures(var18);
		Map var19 = (Map) Stubs.makeStubObject(Map.class);
		_f3.setVersions(var19);
		Map var20 = (Map) Stubs.makeStubObject(Map.class);
		_f4.setAliases(var20);
		_f4.setName("");
		_f4.setNumericFormatName("");
		_f4.setType(t22);
		t23.setBaseVersion("");
		t23.setCompareVersion("");
		t23.setVarianceType(t24);
		_f4.setVersionFormula(t23);
		Map var21 = (Map) Stubs.makeStubObject(Map.class);
		_f7.setAliases(var21);
		_f7.setName("");
		_f7.setNumericFormatName("");
		_f7.setType(t27);
		t28.setBaseVersion("");
		t28.setCompareVersion("");
		t28.setVarianceType(t29);
		_f7.setVersionFormula(t28);
		Map var22 = (Map) Stubs.makeStubObject(Map.class);
		_f16.setAliases(var22);
		_f16.setName("");
		_f16.setNumericFormatName("");
		_f16.setType(t34);
		_f16.setVersionFormula(t35);
		String[] var23 = new String[] {};
		_f9.setCoordinates(var23);
		String[] var24 = new String[] { "" };
		_f9.setDimensions(var24);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.executeStrategy(t3, (PafDataCache) null);

		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.data.Intersection.hashCode(Intersection.java:108)
		// at java.util.HashMap.hash(HashMap.java:264)
		// at java.util.WeakHashMap.getEntry(WeakHashMap.java:370)
		// at java.util.WeakHashMap.containsKey(WeakHashMap.java:361)
		// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:76)
		// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
		// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExecuteStrategy23.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExecuteStrategy23(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[] { Long.class };
			if (Stubs.matches(method, "setStartTime", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureRuleSet", argument_types)) {
				return _f0;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:97)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:100)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 3 :
						return _f3;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:167)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "values", argument_types)) {
				return Stubs.makeStubObject(Collection.class);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		if (Stubs.matches(method, Collection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
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
					case 3 :
					case 4 :
					case 5 :
					case 6 :
					case 8 :
					case 10 :
						return Boolean.TRUE;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					// 
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					// 
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 7 :
					case 9 :
						return Boolean.FALSE;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					// 
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
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
						return _f4;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 2 :
						return _f6;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 3 :
						return _f7;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 4 :
						return _f10;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 5 :
						return _f14;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 6 :
						return _f15;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 7 :
						return _f16;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 8 :
						return _f9;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: executeStrategy(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleBasedEvalStrategy#executeStrategy(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExecuteStrategy24() throws Throwable {
		RuleBasedEvalStrategy THIS = new RuleBasedEvalStrategy();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		Object[] var1 = new Object[] {};
		ListMock t4 = new ListMock(var1);
		RuleGroup t5 = new RuleGroup((Rule[]) null);
		Boolean t6 = new Boolean(false);
		Rule t7 = new Rule();
		Long t8 = new Long(0L);
		RuleSet t9 = new RuleSet();
		ClientInitRequest t10 = new ClientInitRequest();
		PafClientState t11 = new PafClientState((String) null, t10);
		_f0 = new RuleSet();
		_f1 = new PafApplicationDef();
		SeasonList t14 = new SeasonList();
		MdbDef t15 = new MdbDef();
		_f2 = new PafApplicationDef();
		SeasonList t17 = new SeasonList();
		MdbDef t18 = new MdbDef();
		_f3 = new PafApplicationDef();
		SeasonList t20 = new SeasonList();
		MdbDef t21 = new MdbDef();
		VersionDef t23 = new VersionDef();
		Object[] var2 = new Object[] { t23 };
		_f8 = new ListMock(var2);
		VersionType t24 = VersionType.valueOf("Calculated");
		VersionFormula t25 = new VersionFormula();
		String[] var3 = new String[] {};
		_f13 = Intersection.createIntersection(
			var3,
			(List) null,
			(List) null,
			(List) null);
		ClientInitRequest t27 = new ClientInitRequest();
		_f17 = new PafClientState((String) null, t27);
		t3.setTimePeriodList(t4);
		Rule[] var4 = new Rule[] {};
		t5.setRules(var4);
		t5.setRuleGroupId("");
		t5.setBalanceSetKey("");
		t5.setPerpetual(false);
		t5.setDelayedPerpetual(false);
		t5.setSkipProtProc(false);
		t5.setPerpetualAllocation(false);
		t5.setPerformInitialAllocation(t6);
		t3.setRuleGroup(t5);
		t3.setRule(t7);
		t3.setStartTime(t8);
		HashSet var5 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setForcedCalcs(var5);
		HashSet var6 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setRequiredCalcs(var6);
		t3.setMeasureRuleSet(t9);
		t3.setStateChanged(false);
		t3.setClientState(t11);
		t3.setTimeSliceMode(false);
		_f0.setDimension("");
		_f0.setType(0);
		_f0.setName("");
		String[] var7 = new String[] {};
		_f0.setMeasureList(var7);
		_f1.setSeasonList(t14);
		_f1.setAppId("");
		PlanCycle[] var8 = new PlanCycle[] {};
		_f1.setPlanCycles(var8);
		_f1.setLastPeriod("");
		_f1.setCurrentYear("");
		t15.setYearDim("");
		String[] var9 = new String[] {};
		t15.setHierDims(var9);
		t15.setMeasureDim("");
		t15.setPlanTypeDim("");
		t15.setTimeDim("");
		t15.setVersionDim("");
		t15.setDataSourceId("");
		String[] var10 = new String[] {};
		t15.setAxisPriority(var10);
		_f1.setMdbDef(t15);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setMeasures(var11);
		Map var12 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setVersions(var12);
		_f2.setSeasonList(t17);
		_f2.setAppId("");
		PlanCycle[] var13 = new PlanCycle[] {};
		_f2.setPlanCycles(var13);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
		t18.setYearDim("");
		String[] var14 = new String[] {};
		t18.setHierDims(var14);
		t18.setMeasureDim("");
		t18.setPlanTypeDim("");
		t18.setTimeDim("");
		t18.setVersionDim("");
		t18.setDataSourceId("");
		String[] var15 = new String[] {};
		t18.setAxisPriority(var15);
		_f2.setMdbDef(t18);
		Map var16 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var16);
		Map var17 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var17);
		_f3.setSeasonList(t20);
		_f3.setAppId("");
		PlanCycle[] var18 = new PlanCycle[] {};
		_f3.setPlanCycles(var18);
		_f3.setLastPeriod("");
		_f3.setCurrentYear("");
		t21.setYearDim("");
		String[] var19 = new String[] {};
		t21.setHierDims(var19);
		t21.setMeasureDim("");
		t21.setPlanTypeDim("");
		t21.setTimeDim("");
		t21.setVersionDim("");
		t21.setDataSourceId("");
		String[] var20 = new String[] {};
		t21.setAxisPriority(var20);
		_f3.setMdbDef(t21);
		Map var21 = (Map) Stubs.makeStubObject(Map.class);
		_f3.setMeasures(var21);
		Map var22 = (Map) Stubs.makeStubObject(Map.class);
		_f3.setVersions(var22);
		Map var23 = (Map) Stubs.makeStubObject(Map.class);
		t23.setAliases(var23);
		t23.setName("0");
		t23.setNumericFormatName("");
		t23.setType(t24);
		t23.setVersionFormula(t25);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.executeStrategy(t3, (PafDataCache) null);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.eval.ES_ConvertVariances.convertChange(ES_ConvertVariances.java:112)
		// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:80)
		// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
		// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExecuteStrategy24.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExecuteStrategy24(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[] { Long.class };
			if (Stubs.matches(method, "setStartTime", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureRuleSet", argument_types)) {
				return _f0;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:97)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:100)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					case 3 :
						return _f3;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientState", argument_types)) {
				return _f17;
				// at com.palladium.paf.eval.ES_ConvertVariances.convertChange(ES_ConvertVariances.java:112)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:80)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVarianceVersions", argument_types)) {
				return _f8;
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return _f13;
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		if (Stubs.matches(method, Intersection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getCoordinate", argument_types)) {
				return "0";
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:76)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:84)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: executeStrategy(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleBasedEvalStrategy#executeStrategy(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExecuteStrategy25() throws Throwable {
		RuleBasedEvalStrategy THIS = new RuleBasedEvalStrategy();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState((SliceState) null, t2);
		Object[] var1 = new Object[] {};
		ListMock t4 = new ListMock(var1);
		RuleGroup t5 = new RuleGroup((Rule[]) null);
		Boolean t6 = new Boolean(false);
		Rule t7 = new Rule();
		Long t8 = new Long(0L);
		RuleSet t9 = new RuleSet();
		ClientInitRequest t10 = new ClientInitRequest();
		PafClientState t11 = new PafClientState((String) null, t10);
		_f0 = new RuleSet();
		_f1 = new PafApplicationDef();
		SeasonList t14 = new SeasonList();
		MdbDef t15 = new MdbDef();
		_f2 = new PafApplicationDef();
		SeasonList t17 = new SeasonList();
		MdbDef t18 = new MdbDef();
		_f3 = new PafApplicationDef();
		SeasonList t20 = new SeasonList();
		MdbDef t21 = new MdbDef();
		Object[] var2 = new Object[] {};
		_f8 = new ListMock(var2);
		String[] var3 = new String[] { "" };
		_f9 = new Intersection(var3);
		Object[] var4 = new Object[] { null };
		ListMock t24 = new ListMock(var4);
		Object[] var5 = new Object[] { null };
		ListMock t25 = new ListMock(var5);
		Object[] var6 = new Object[] { null };
		ListMock t26 = new ListMock(var6);
		String[] var7 = new String[] { "0", null, null };
		_f13 = Intersection.createIntersection(var7, t24, t26, t25);
		t3.setTimePeriodList(t4);
		Rule[] var8 = new Rule[] {};
		t5.setRules(var8);
		t5.setRuleGroupId("");
		t5.setBalanceSetKey("");
		t5.setPerpetual(false);
		t5.setDelayedPerpetual(false);
		t5.setSkipProtProc(false);
		t5.setPerpetualAllocation(false);
		t5.setPerformInitialAllocation(t6);
		t3.setRuleGroup(t5);
		t3.setRule(t7);
		t3.setStartTime(t8);
		HashSet var9 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setForcedCalcs(var9);
		HashSet var10 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setRequiredCalcs(var10);
		t3.setMeasureRuleSet(t9);
		t3.setStateChanged(false);
		t3.setClientState(t11);
		t3.setTimeSliceMode(false);
		_f0.setDimension("");
		_f0.setType(0);
		_f0.setName("");
		String[] var11 = new String[] {};
		_f0.setMeasureList(var11);
		_f1.setSeasonList(t14);
		_f1.setAppId("");
		PlanCycle[] var12 = new PlanCycle[] {};
		_f1.setPlanCycles(var12);
		_f1.setLastPeriod("");
		_f1.setCurrentYear("");
		t15.setYearDim("");
		String[] var13 = new String[] {};
		t15.setHierDims(var13);
		t15.setMeasureDim("");
		t15.setPlanTypeDim("");
		t15.setTimeDim("");
		t15.setVersionDim("");
		t15.setDataSourceId("");
		String[] var14 = new String[] {};
		t15.setAxisPriority(var14);
		_f1.setMdbDef(t15);
		Map var15 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setMeasures(var15);
		Map var16 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setVersions(var16);
		_f2.setSeasonList(t17);
		_f2.setAppId("");
		PlanCycle[] var17 = new PlanCycle[] {};
		_f2.setPlanCycles(var17);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
		t18.setYearDim("");
		String[] var18 = new String[] {};
		t18.setHierDims(var18);
		t18.setMeasureDim("");
		t18.setPlanTypeDim("");
		t18.setTimeDim("");
		t18.setVersionDim("0");
		t18.setDataSourceId("");
		String[] var19 = new String[] {};
		t18.setAxisPriority(var19);
		_f2.setMdbDef(t18);
		Map var20 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var20);
		Map var21 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var21);
		_f3.setSeasonList(t20);
		_f3.setAppId("");
		PlanCycle[] var22 = new PlanCycle[] {};
		_f3.setPlanCycles(var22);
		_f3.setLastPeriod("");
		_f3.setCurrentYear("");
		t21.setYearDim("");
		String[] var23 = new String[] {};
		t21.setHierDims(var23);
		t21.setMeasureDim("");
		t21.setPlanTypeDim("");
		t21.setTimeDim("");
		t21.setVersionDim("");
		t21.setDataSourceId("");
		String[] var24 = new String[] {};
		t21.setAxisPriority(var24);
		_f3.setMdbDef(t21);
		Map var25 = (Map) Stubs.makeStubObject(Map.class);
		_f3.setMeasures(var25);
		Map var26 = (Map) Stubs.makeStubObject(Map.class);
		_f3.setVersions(var26);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.executeStrategy(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// ClassCastException thrown, originator is possible setup problem
		// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:85)
		// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExecuteStrategy25.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExecuteStrategy25(
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
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.<init>(RuleBasedEvalStrategy.java:61)
			}
		}
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(PafAppService.class);
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// at com.palladium.paf.eval.ES_Aggregate.<init>(ES_Aggregate.java:53)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.<init>(RuleBasedEvalStrategy.java:68)
			}
		}
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
			}
			argument_types = new Class[] { Long.class };
			if (Stubs.matches(method, "setStartTime", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureRuleSet", argument_types)) {
				return _f0;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:100)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					case 3 :
						return _f3;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentLockedCells", argument_types)) {
				return Stubs.makeStubObject(HashSet.class);
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:85)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVarianceVersions", argument_types)) {
				return _f8;
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
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
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					// 
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:85)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					case 3 :
						return Boolean.FALSE;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
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
						return _f9;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					case 2 :
						return _f13;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					case 3 :
						return "";
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:85)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, HashSet.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:85)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: executeStrategy(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleBasedEvalStrategy#executeStrategy(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExecuteStrategy27() throws Throwable {
		RuleBasedEvalStrategy THIS = new RuleBasedEvalStrategy();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState((SliceState) null, t2);
		Object[] var1 = new Object[] {};
		ListMock t4 = new ListMock(var1);
		RuleGroup t5 = new RuleGroup((Rule[]) null);
		Boolean t6 = new Boolean(false);
		Rule t7 = new Rule();
		Long t8 = new Long(0L);
		RuleSet t9 = new RuleSet();
		ClientInitRequest t10 = new ClientInitRequest();
		PafClientState t11 = new PafClientState((String) null, t10);
		_f0 = new RuleSet();
		_f1 = new PafApplicationDef();
		SeasonList t14 = new SeasonList();
		MdbDef t15 = new MdbDef();
		_f2 = new PafApplicationDef();
		SeasonList t17 = new SeasonList();
		MdbDef t18 = new MdbDef();
		_f3 = new PafApplicationDef();
		SeasonList t20 = new SeasonList();
		MdbDef t21 = new MdbDef();
		VersionDef t23 = new VersionDef((String) null, (VersionType) null);
		Object[] var2 = new Object[] { t23 };
		_f8 = new ListMock(var2);
		String[] var3 = new String[] {};
		_f9 = new Intersection(var3);
		t3.setTimePeriodList(t4);
		Rule[] var4 = new Rule[] {};
		t5.setRules(var4);
		t5.setRuleGroupId("");
		t5.setBalanceSetKey("");
		t5.setPerpetual(false);
		t5.setDelayedPerpetual(false);
		t5.setSkipProtProc(false);
		t5.setPerpetualAllocation(false);
		t5.setPerformInitialAllocation(t6);
		t3.setRuleGroup(t5);
		t3.setRule(t7);
		t3.setStartTime(t8);
		HashSet var5 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setForcedCalcs(var5);
		HashSet var6 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setRequiredCalcs(var6);
		t3.setMeasureRuleSet(t9);
		t3.setStateChanged(false);
		t3.setClientState(t11);
		t3.setTimeSliceMode(false);
		_f0.setDimension("");
		_f0.setType(0);
		_f0.setName("");
		String[] var7 = new String[] {};
		_f0.setMeasureList(var7);
		_f1.setSeasonList(t14);
		_f1.setAppId("");
		PlanCycle[] var8 = new PlanCycle[] {};
		_f1.setPlanCycles(var8);
		_f1.setLastPeriod("");
		_f1.setCurrentYear("");
		t15.setYearDim("");
		String[] var9 = new String[] {};
		t15.setHierDims(var9);
		t15.setMeasureDim("");
		t15.setPlanTypeDim("");
		t15.setTimeDim("");
		t15.setVersionDim("");
		t15.setDataSourceId("");
		String[] var10 = new String[] {};
		t15.setAxisPriority(var10);
		_f1.setMdbDef(t15);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setMeasures(var11);
		Map var12 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setVersions(var12);
		_f2.setSeasonList(t17);
		_f2.setAppId("");
		PlanCycle[] var13 = new PlanCycle[] {};
		_f2.setPlanCycles(var13);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
		t18.setYearDim("");
		String[] var14 = new String[] {};
		t18.setHierDims(var14);
		t18.setMeasureDim("");
		t18.setPlanTypeDim("");
		t18.setTimeDim("");
		t18.setVersionDim("0");
		t18.setDataSourceId("");
		String[] var15 = new String[] {};
		t18.setAxisPriority(var15);
		_f2.setMdbDef(t18);
		Map var16 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var16);
		Map var17 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var17);
		_f3.setSeasonList(t20);
		_f3.setAppId("");
		PlanCycle[] var18 = new PlanCycle[] {};
		_f3.setPlanCycles(var18);
		_f3.setLastPeriod("");
		_f3.setCurrentYear("");
		t21.setYearDim("");
		String[] var19 = new String[] {};
		t21.setHierDims(var19);
		t21.setMeasureDim("");
		t21.setPlanTypeDim("");
		t21.setTimeDim("");
		t21.setVersionDim("");
		t21.setDataSourceId("");
		String[] var20 = new String[] {};
		t21.setAxisPriority(var20);
		_f3.setMdbDef(t21);
		Map var21 = (Map) Stubs.makeStubObject(Map.class);
		_f3.setMeasures(var21);
		Map var22 = (Map) Stubs.makeStubObject(Map.class);
		_f3.setVersions(var22);
		String[] var23 = new String[] { null, null };
		_f9.setCoordinates(var23);
		String[] var24 = new String[] { "", "0" };
		_f9.setDimensions(var24);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.executeStrategy(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// com.palladium.paf.PafException thrown, originator is possible setup problem
		// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:80)
		// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExecuteStrategy27.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExecuteStrategy27(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
			}
			argument_types = new Class[] { Long.class };
			if (Stubs.matches(method, "setStartTime", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureRuleSet", argument_types)) {
				return _f0;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:100)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					case 3 :
						return _f3;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVarianceVersions", argument_types)) {
				return _f8;
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return _f9;
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
			}
		}
		if (Stubs.matches(method, ES_ConvertVariances.class)) {
			argument_types = new Class[] { Intersection.class, EvalState.class,
					PafDataCache.class, IFormulaEvalEngine.class };
			if (Stubs.matches(method, "convertChange", argument_types)) {
				throw new PafException();
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:80)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: executeStrategy(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleBasedEvalStrategy#executeStrategy(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExecuteStrategy28() throws Throwable {
		RuleBasedEvalStrategy THIS = new RuleBasedEvalStrategy();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		Object[] var1 = new Object[] {};
		ListMock t4 = new ListMock(var1);
		RuleGroup t5 = new RuleGroup((Rule[]) null);
		Boolean t6 = new Boolean(false);
		Rule t7 = new Rule();
		Long t8 = new Long(0L);
		RuleSet t9 = new RuleSet();
		ClientInitRequest t10 = new ClientInitRequest();
		PafClientState t11 = new PafClientState((String) null, t10);
		_f0 = new RuleSet();
		_f1 = new PafApplicationDef();
		SeasonList t14 = new SeasonList();
		MdbDef t15 = new MdbDef();
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
		t3.setRule(t7);
		t3.setStartTime(t8);
		HashSet var3 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setForcedCalcs(var3);
		HashSet var4 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setRequiredCalcs(var4);
		t3.setMeasureRuleSet(t9);
		t3.setStateChanged(false);
		t3.setClientState(t11);
		t3.setTimeSliceMode(false);
		_f0.setDimension("");
		_f0.setType(0);
		_f0.setName("");
		String[] var5 = new String[] {};
		_f0.setMeasureList(var5);
		_f1.setSeasonList(t14);
		_f1.setAppId("");
		PlanCycle[] var6 = new PlanCycle[] {};
		_f1.setPlanCycles(var6);
		_f1.setLastPeriod("");
		_f1.setCurrentYear("");
		t15.setYearDim("");
		String[] var7 = new String[] {};
		t15.setHierDims(var7);
		t15.setMeasureDim("");
		t15.setPlanTypeDim("");
		t15.setTimeDim("");
		t15.setVersionDim("");
		t15.setDataSourceId("");
		String[] var8 = new String[] {};
		t15.setAxisPriority(var8);
		_f1.setMdbDef(t15);
		Map var9 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setMeasures(var9);
		Map var10 = (Map) Stubs.makeStubObject(Map.class);
		_f1.setVersions(var10);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.executeStrategy(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown
		// at com.palladium.paf.eval.RuleBasedEvalStrategy.processLooseMeasures(RuleBasedEvalStrategy.java:345)
		// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:122)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExecuteStrategy28.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExecuteStrategy28(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
			}
			argument_types = new Class[] { Long.class };
			if (Stubs.matches(method, "setStartTime", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:94)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureRuleSet", argument_types)) {
				return _f0;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:100)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.processLooseMeasures(RuleBasedEvalStrategy.java:345)
					// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:122)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, ES_ConvertVariances.class)) {
			argument_types = new Class[] { EvalState.class, PafDataCache.class,
					IFormulaEvalEngine.class };
			if (Stubs.matches(method, "performEvaluation", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.executeStrategy(RuleBasedEvalStrategy.java:103)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: RuleBasedEvalStrategy()
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleBasedEvalStrategy#RuleBasedEvalStrategy()
	 * @author Parasoft Jtest 8.0
	 */
	public void testRuleBasedEvalStrategy1() throws Throwable {
		// jtest_tested_method
		RuleBasedEvalStrategy THIS = new RuleBasedEvalStrategy();
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testRuleBasedEvalStrategy1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRuleBasedEvalStrategy1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
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
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1189)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
				// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.<init>(ES_EvalStdRulegroup.java:48)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.<init>(RuleBasedEvalStrategy.java:61)
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
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1189)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
				// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.<init>(ES_EvalStdRulegroup.java:48)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.<init>(RuleBasedEvalStrategy.java:61)
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
     * Usage: java com.palladium.paf.eval.RuleBasedEvalStrategyTest
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
            RuleBasedEvalStrategyTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.eval.RuleBasedEvalStrategy",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return RuleBasedEvalStrategy.class;
    }

        /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private RuleSet _f0;
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
private PafApplicationDef _f2;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafApplicationDef _f3;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private VersionDef _f4;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private SliceState _f5;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private VersionDef _f6;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private VersionDef _f7;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private ListMock _f8;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Intersection _f9;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private VersionDef _f10;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafApplicationDef _f11;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private SliceState _f12;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private com.palladium.paf.data.Intersection _f13;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private VersionDef _f14;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private VersionDef _f15;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private VersionDef _f16;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafClientState _f17;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private VersionDef _f18;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Intersection _f19;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private com.palladium.paf.data.Intersection _f20;
}

// JTEST_CURRENT_ID=1696574558.