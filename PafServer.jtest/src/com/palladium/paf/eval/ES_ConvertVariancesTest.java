/*
 * ES_ConvertVariancesTest.java
 * Created by Jtest on 9/19/06 6:15:09 PM.
 * Updated by Jtest on 10/18/06 6:40:20 PM, 15 test cases added, 4 test cases removed.
 * Updated by Jtest on 11/9/06 2:09:12 AM, 14 test cases added, 14 test cases removed.
 */

package com.palladium.paf.eval;

import java.sql.SQLException;
import java.util.Properties;
import java.sql.DriverManager;
import java.util.List;
import com.palladium.paf.data.Intersection;
import com.palladium.paf.app.VersionVarianceType;
import com.palladium.paf.app.VersionFormula;
import com.palladium.paf.funcs.CustomFunctionDef;
import com.palladium.paf.app.VersionType;
import com.palladium.paf.app.VersionDef;
import java.util.Set;
import com.palladium.paf.app.MeasureFunctionFactory;
import com.palladium.paf.rules.Formula;
import java.util.Iterator;
import java.util.Collection;
import com.palladium.paf.server.PafAppService;
import java.util.Map;
import com.palladium.paf.app.PlanCycle;
import com.palladium.paf.app.SeasonList;
import java.util.HashSet;
import com.palladium.paf.rules.RuleSet;
import com.palladium.paf.rules.Rule;
import com.palladium.paf.rules.RuleGroup;
import jtest.mocks.java.util.ListMock;
import com.palladium.paf.app.MdbDef;
import com.palladium.paf.state.SliceState;
import com.palladium.paf.state.PafClientState;
import com.palladium.paf.comm.ClientInitRequest;
import org.hibernate.connection.DriverManagerConnectionProvider;
import com.palladium.paf.app.PafApplicationDef;
import java.lang.reflect.Member;
import jtest.Stubs;
import com.palladium.paf.mdb.PafDataCache;
import com.palladium.paf.state.EvalState;
import com.palladium.paf.eval.ES_ConvertVariances;

/**
 * ES_ConvertVariancesTest is a unit test class for class ES_ConvertVariances.
 * @see com.palladium.paf.eval.ES_ConvertVariances
 * @author Parasoft Jtest 8.0
 */
public class ES_ConvertVariancesTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public ES_ConvertVariancesTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }

	/**
	 * Test for method: ES_ConvertVariances()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_ConvertVariances#ES_ConvertVariances()
	 * @author Parasoft Jtest 8.0
	 */
	public void testES_ConvertVariances1() throws Throwable {
		// jtest_tested_method
		ES_ConvertVariances THIS = new ES_ConvertVariances();
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
		// at com.palladium.paf.eval.ES_ConvertVariances.<init>(ES_ConvertVariances.java:50)
		// jtest_unverified
	}

	/**
	 * Stubs method for testES_ConvertVariances1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsES_ConvertVariances1(
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
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
				// at com.palladium.paf.eval.ES_ConvertVariances.<init>(ES_ConvertVariances.java:50)
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
				// at com.palladium.paf.eval.ES_ConvertVariances.<init>(ES_ConvertVariances.java:50)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: ES_ConvertVariances()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_ConvertVariances#ES_ConvertVariances()
	 * @author Parasoft Jtest 8.0
	 */
	public void testES_ConvertVariances3() throws Throwable {
		// jtest_tested_method
		ES_ConvertVariances THIS = new ES_ConvertVariances();
		// NullPointerException thrown
		// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1199)
		// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
		// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
		// at com.palladium.paf.eval.ES_ConvertVariances.<init>(ES_ConvertVariances.java:50)
		// jtest_unverified
	}

	/**
	 * Stubs method for testES_ConvertVariances3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsES_ConvertVariances3(
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
				// at com.palladium.paf.eval.ES_ConvertVariances.<init>(ES_ConvertVariances.java:50)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
				// at com.palladium.paf.eval.ES_ConvertVariances.<init>(ES_ConvertVariances.java:50)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: ES_ConvertVariances()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_ConvertVariances#ES_ConvertVariances()
	 * @author Parasoft Jtest 8.0
	 */
	public void testES_ConvertVariances4() throws Throwable {
		// jtest_tested_method
		ES_ConvertVariances THIS = new ES_ConvertVariances();
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testES_ConvertVariances4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsES_ConvertVariances4(
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
				// at com.palladium.paf.eval.ES_ConvertVariances.<init>(ES_ConvertVariances.java:50)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_ConvertVariances#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation1() throws Throwable {
		ES_ConvertVariances THIS = new ES_ConvertVariances();
		// jtest_tested_method
		THIS.performEvaluation(
			(EvalState) null,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(Lcom/palladium/paf/state/EvalState;Lcom/palladium/paf/mdb/PafDataCache;Lcom/palladium/paf/eval/IFormulaEvalEngine;)V>
		// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
		// jtest_unverified
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_ConvertVariances#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation5() throws Throwable {
		ES_ConvertVariances THIS = new ES_ConvertVariances();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState((SliceState) null, t2);
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
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
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown
		// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
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
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
					case 2 :
						return null;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				return _f1;
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_ConvertVariances#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation8() throws Throwable {
		ES_ConvertVariances THIS = new ES_ConvertVariances();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState((SliceState) null, t2);
		_f0 = new PafApplicationDef();
		SeasonList t5 = new SeasonList();
		MdbDef t6 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new PafApplicationDef();
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
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown
		// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:167)
		// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
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
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				return _f1;
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_ConvertVariances#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation9() throws Throwable {
		ES_ConvertVariances THIS = new ES_ConvertVariances();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		_f0 = new PafApplicationDef();
		SeasonList t5 = new SeasonList();
		MdbDef t6 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new PafApplicationDef();
		SeasonList t9 = new SeasonList();
		MdbDef t10 = new MdbDef();
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
		_f2.setSeasonList(t9);
		_f2.setAppId("");
		PlanCycle[] var8 = new PlanCycle[] {};
		_f2.setPlanCycles(var8);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
		t10.setYearDim("");
		String[] var9 = new String[] {};
		t10.setHierDims(var9);
		t10.setMeasureDim("");
		t10.setPlanTypeDim("");
		t10.setTimeDim("");
		t10.setVersionDim("");
		t10.setDataSourceId("");
		String[] var10 = new String[] {};
		t10.setAxisPriority(var10);
		_f2.setMdbDef(t10);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var11);
		Map var12 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var12);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown
		// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
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
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				return _f1;
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:167)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "values", argument_types)) {
				return Stubs.makeStubObject(Collection.class);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
			}
		}
		if (Stubs.matches(method, Collection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_ConvertVariances#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation10() throws Throwable {
		ES_ConvertVariances THIS = new ES_ConvertVariances();
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
		_f0 = new PafApplicationDef();
		SeasonList t14 = new SeasonList();
		MdbDef t15 = new MdbDef();
		_f1 = new MdbDef();
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
		t10.setDimension("");
		t10.setType(0);
		t10.setName("");
		String[] var5 = new String[] {};
		t10.setMeasureList(var5);
		t3.setMeasureRuleSet(t10);
		t3.setStateChanged(false);
		t3.setClientState(t12);
		t3.setTimeSliceMode(false);
		_f0.setSeasonList(t14);
		_f0.setAppId("");
		PlanCycle[] var6 = new PlanCycle[] {};
		_f0.setPlanCycles(var6);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
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
		_f0.setMdbDef(t15);
		Map var9 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var9);
		Map var10 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var10);
		_f1.setYearDim("");
		String[] var11 = new String[] {};
		_f1.setHierDims(var11);
		_f1.setMeasureDim("");
		_f1.setPlanTypeDim("");
		_f1.setTimeDim("");
		_f1.setVersionDim("");
		_f1.setDataSourceId("");
		String[] var12 = new String[] {};
		_f1.setAxisPriority(var12);
		_f2.setSeasonList(t18);
		_f2.setAppId("");
		PlanCycle[] var13 = new PlanCycle[] {};
		_f2.setPlanCycles(var13);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
		t19.setYearDim("");
		String[] var14 = new String[] {};
		t19.setHierDims(var14);
		t19.setMeasureDim("");
		t19.setPlanTypeDim("");
		t19.setTimeDim("");
		t19.setVersionDim("");
		t19.setDataSourceId("");
		String[] var15 = new String[] {};
		t19.setAxisPriority(var15);
		_f2.setMdbDef(t19);
		Map var16 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var16);
		Map var17 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var17);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);

		// ClassCastException thrown
		// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
		// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
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
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				return _f1;
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:167)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "values", argument_types)) {
				return Stubs.makeStubObject(Collection.class);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
			}
		}
		if (Stubs.matches(method, Collection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return "";
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_ConvertVariances#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation11() throws Throwable {
		ES_ConvertVariances THIS = new ES_ConvertVariances();
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
		_f0 = new PafApplicationDef();
		SeasonList t13 = new SeasonList();
		MdbDef t14 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new PafApplicationDef();
		SeasonList t17 = new SeasonList();
		MdbDef t18 = new MdbDef();
		Object[] var2 = new Object[] {};
		_f3 = new ListMock(var2);
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
		_f0.setSeasonList(t13);
		_f0.setAppId("");
		PlanCycle[] var6 = new PlanCycle[] {};
		_f0.setPlanCycles(var6);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t14.setYearDim("");
		String[] var7 = new String[] {};
		t14.setHierDims(var7);
		t14.setMeasureDim("");
		t14.setPlanTypeDim("");
		t14.setTimeDim("");
		t14.setVersionDim("");
		t14.setDataSourceId("");
		String[] var8 = new String[] {};
		t14.setAxisPriority(var8);
		_f0.setMdbDef(t14);
		Map var9 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var9);
		Map var10 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var10);
		_f1.setYearDim("");
		String[] var11 = new String[] {};
		_f1.setHierDims(var11);
		_f1.setMeasureDim("");
		_f1.setPlanTypeDim("");
		_f1.setTimeDim("");
		_f1.setVersionDim("");
		_f1.setDataSourceId("");
		String[] var12 = new String[] {};
		_f1.setAxisPriority(var12);
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
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown
		// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:85)
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
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(PafAppService.class);
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// at com.palladium.paf.eval.ES_ConvertVariances.<init>(ES_ConvertVariances.java:51)
			}
		}
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentLockedCells", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:85)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				return _f1;
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVarianceVersions", argument_types)) {
				return _f3;
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_ConvertVariances#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation12() throws Throwable {
		ES_ConvertVariances THIS = new ES_ConvertVariances();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState((SliceState) null, t2);
		_f0 = new PafApplicationDef();
		SeasonList t5 = new SeasonList();
		MdbDef t6 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new PafApplicationDef();
		SeasonList t9 = new SeasonList();
		MdbDef t10 = new MdbDef();
		_f4 = new VersionDef((String) null, (VersionType) null);
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
		_f2.setSeasonList(t9);
		_f2.setAppId("");
		PlanCycle[] var8 = new PlanCycle[] {};
		_f2.setPlanCycles(var8);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
		t10.setYearDim("");
		String[] var9 = new String[] {};
		t10.setHierDims(var9);
		t10.setMeasureDim("");
		t10.setPlanTypeDim("");
		t10.setTimeDim("");
		t10.setVersionDim("");
		t10.setDataSourceId("");
		String[] var10 = new String[] {};
		t10.setAxisPriority(var10);
		_f2.setMdbDef(t10);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var11);
		Map var12 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var12);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// ClassCastException thrown
		// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
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
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				return _f1;
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:167)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "values", argument_types)) {
				return Stubs.makeStubObject(Collection.class);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
			}
		}
		if (Stubs.matches(method, Collection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Iterator.hasNext()");
				switch (index) {
					case 1 :
					case 3 :
						return Boolean.TRUE;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// 
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					case 2 :
						return Boolean.FALSE;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
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
					case 2 :
						return "";
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_ConvertVariances#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation13() throws Throwable {
		ES_ConvertVariances THIS = new ES_ConvertVariances();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		_f0 = new PafApplicationDef();
		SeasonList t5 = new SeasonList();
		MdbDef t6 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new PafApplicationDef();
		SeasonList t9 = new SeasonList();
		MdbDef t10 = new MdbDef();
		Object[] var1 = new Object[] { null };
		_f3 = new ListMock(var1);
		_f0.setSeasonList(t5);
		_f0.setAppId("");
		PlanCycle[] var2 = new PlanCycle[] {};
		_f0.setPlanCycles(var2);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t6.setYearDim("");
		String[] var3 = new String[] {};
		t6.setHierDims(var3);
		t6.setMeasureDim("");
		t6.setPlanTypeDim("");
		t6.setTimeDim("");
		t6.setVersionDim("");
		t6.setDataSourceId("");
		String[] var4 = new String[] {};
		t6.setAxisPriority(var4);
		_f0.setMdbDef(t6);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var5);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var6);
		_f1.setYearDim("");
		String[] var7 = new String[] {};
		_f1.setHierDims(var7);
		_f1.setMeasureDim("");
		_f1.setPlanTypeDim("");
		_f1.setTimeDim("");
		_f1.setVersionDim("");
		_f1.setDataSourceId("");
		String[] var8 = new String[] {};
		_f1.setAxisPriority(var8);
		_f2.setSeasonList(t9);
		_f2.setAppId("");
		PlanCycle[] var9 = new PlanCycle[] {};
		_f2.setPlanCycles(var9);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
		t10.setYearDim("");
		String[] var10 = new String[] {};
		t10.setHierDims(var10);
		t10.setMeasureDim("");
		t10.setPlanTypeDim("");
		t10.setTimeDim("");
		t10.setVersionDim("");
		t10.setDataSourceId("");
		String[] var11 = new String[] {};
		t10.setAxisPriority(var11);
		_f2.setMdbDef(t10);
		Map var12 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var12);
		Map var13 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var13);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown
		// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:67)
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
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				return _f1;
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVarianceVersions", argument_types)) {
				return _f3;
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_ConvertVariances#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation14() throws Throwable {
		ES_ConvertVariances THIS = new ES_ConvertVariances();
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
		_f0 = new PafApplicationDef();
		SeasonList t15 = new SeasonList();
		MdbDef t16 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new PafApplicationDef();
		SeasonList t19 = new SeasonList();
		MdbDef t20 = new MdbDef();
		_f4 = new VersionDef((String) null, (VersionType) null);
		_f5 = new VersionDef();
		_f6 = new VersionDef((String) null, (VersionType) null);
		VersionType t24 = VersionType.valueOf("Calculated");
		VersionFormula t25 = new VersionFormula(
			(String) null,
			(String) null,
			(VersionVarianceType) null);
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
		t11.setDimension("");
		t11.setType(0);
		t11.setName("");
		String[] var6 = new String[] {};
		t11.setMeasureList(var6);
		t3.setMeasureRuleSet(t11);
		t3.setStateChanged(false);
		t3.setClientState(t13);
		t3.setTimeSliceMode(false);
		_f0.setSeasonList(t15);
		_f0.setAppId("");
		PlanCycle[] var7 = new PlanCycle[] {};
		_f0.setPlanCycles(var7);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t16.setYearDim("");
		String[] var8 = new String[] {};
		t16.setHierDims(var8);
		t16.setMeasureDim("");
		t16.setPlanTypeDim("");
		t16.setTimeDim("");
		t16.setVersionDim("");
		t16.setDataSourceId("");
		String[] var9 = new String[] {};
		t16.setAxisPriority(var9);
		_f0.setMdbDef(t16);
		Map var10 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var10);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var11);
		_f1.setYearDim("");
		String[] var12 = new String[] {};
		_f1.setHierDims(var12);
		_f1.setMeasureDim("");
		_f1.setPlanTypeDim("");
		_f1.setTimeDim("");
		_f1.setVersionDim("");
		_f1.setDataSourceId("");
		String[] var13 = new String[] {};
		_f1.setAxisPriority(var13);
		_f2.setSeasonList(t19);
		_f2.setAppId("");
		PlanCycle[] var14 = new PlanCycle[] {};
		_f2.setPlanCycles(var14);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
		t20.setYearDim("");
		String[] var15 = new String[] {};
		t20.setHierDims(var15);
		t20.setMeasureDim("");
		t20.setPlanTypeDim("");
		t20.setTimeDim("");
		t20.setVersionDim("");
		t20.setDataSourceId("");
		String[] var16 = new String[] {};
		t20.setAxisPriority(var16);
		_f2.setMdbDef(t20);
		Map var17 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var17);
		Map var18 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var18);
		Map var19 = (Map) Stubs.makeStubObject(Map.class);
		_f6.setAliases(var19);
		_f6.setName("");
		_f6.setNumericFormatName("");
		_f6.setType(t24);
		_f6.setVersionFormula(t25);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// ClassCastException thrown
		// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
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
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				return _f1;
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:167)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "values", argument_types)) {
				return Stubs.makeStubObject(Collection.class);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
			}
		}
		if (Stubs.matches(method, Collection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
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
					case 6 :
						return Boolean.TRUE;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// 
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// 
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
					case 3 :
					case 5 :
						return Boolean.FALSE;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// 
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
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
					case 2 :
						return _f5;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					case 3 :
						return _f6;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					case 4 :
						return "";
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
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
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_ConvertVariances#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation15() throws Throwable {
		ES_ConvertVariances THIS = new ES_ConvertVariances();
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
		SeasonList t12 = new SeasonList();
		MdbDef t13 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new PafApplicationDef();
		SeasonList t16 = new SeasonList();
		MdbDef t17 = new MdbDef();
		Object[] var2 = new Object[] {};
		_f3 = new ListMock(var2);
		_f7 = new Intersection((String[]) null, (String[]) null);
		t3.setTimePeriodList(t4);
		t3.setRuleGroup(t5);
		t3.setRule(t6);
		t3.setStartTime(t7);
		HashSet var3 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setForcedCalcs(var3);
		HashSet var4 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setRequiredCalcs(var4);
		t3.setMeasureRuleSet(t8);
		t3.setStateChanged(false);
		t3.setClientState(t10);
		t3.setTimeSliceMode(false);
		_f0.setSeasonList(t12);
		_f0.setAppId("");
		PlanCycle[] var5 = new PlanCycle[] {};
		_f0.setPlanCycles(var5);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t13.setYearDim("");
		String[] var6 = new String[] {};
		t13.setHierDims(var6);
		t13.setMeasureDim("");
		t13.setPlanTypeDim("");
		t13.setTimeDim("");
		t13.setVersionDim("");
		t13.setDataSourceId("");
		String[] var7 = new String[] {};
		t13.setAxisPriority(var7);
		_f0.setMdbDef(t13);
		Map var8 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var8);
		Map var9 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var9);
		_f1.setYearDim("");
		String[] var10 = new String[] {};
		_f1.setHierDims(var10);
		_f1.setMeasureDim("");
		_f1.setPlanTypeDim("");
		_f1.setTimeDim("");
		_f1.setVersionDim("");
		_f1.setDataSourceId("");
		String[] var11 = new String[] {};
		_f1.setAxisPriority(var11);
		_f2.setSeasonList(t16);
		_f2.setAppId("");
		PlanCycle[] var12 = new PlanCycle[] {};
		_f2.setPlanCycles(var12);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
		t17.setYearDim("");
		String[] var13 = new String[] {};
		t17.setHierDims(var13);
		t17.setMeasureDim("");
		t17.setPlanTypeDim("");
		t17.setTimeDim("");
		t17.setVersionDim("");
		t17.setDataSourceId("");
		String[] var14 = new String[] {};
		t17.setAxisPriority(var14);
		_f2.setMdbDef(t17);
		Map var15 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var15);
		Map var16 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var16);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.data.Intersection.<init>([Ljava/lang/String;[Ljava/lang/String;)V>
		// at com.palladium.paf.data.Intersection.getCoordinate(Intersection.java:66)
		// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:76)
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
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				return _f1;
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVarianceVersions", argument_types)) {
				return _f3;
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return _f7;
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_ConvertVariances#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation17() throws Throwable {
		ES_ConvertVariances THIS = new ES_ConvertVariances();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		_f0 = new PafApplicationDef();
		SeasonList t5 = new SeasonList();
		MdbDef t6 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new PafApplicationDef();
		SeasonList t9 = new SeasonList();
		MdbDef t10 = new MdbDef();
		Object[] var1 = new Object[] {};
		_f3 = new ListMock(var1);
		_f4 = new VersionDef();
		VersionType t13 = VersionType.valueOf("Calculated");
		VersionFormula t14 = new VersionFormula();
		_f5 = new VersionDef((String) null, (VersionType) null);
		String[] var2 = new String[] { null };
		_f8 = Intersection.createIntersection(
			var2,
			(List) null,
			(List) null,
			(List) null);
		_f0.setSeasonList(t5);
		_f0.setAppId("");
		PlanCycle[] var3 = new PlanCycle[] {};
		_f0.setPlanCycles(var3);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
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
		_f0.setMdbDef(t6);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var6);
		Map var7 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var7);
		_f1.setYearDim("");
		String[] var8 = new String[] {};
		_f1.setHierDims(var8);
		_f1.setMeasureDim("");
		_f1.setPlanTypeDim("");
		_f1.setTimeDim("");
		_f1.setVersionDim("");
		_f1.setDataSourceId("");
		String[] var9 = new String[] {};
		_f1.setAxisPriority(var9);
		_f2.setSeasonList(t9);
		_f2.setAppId("");
		PlanCycle[] var10 = new PlanCycle[] {};
		_f2.setPlanCycles(var10);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
		t10.setYearDim("");
		String[] var11 = new String[] {};
		t10.setHierDims(var11);
		t10.setMeasureDim("");
		t10.setPlanTypeDim("");
		t10.setTimeDim("");
		t10.setVersionDim("");
		t10.setDataSourceId("");
		String[] var12 = new String[] {};
		t10.setAxisPriority(var12);
		_f2.setMdbDef(t10);
		Map var13 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var13);
		Map var14 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var14);
		Map var15 = (Map) Stubs.makeStubObject(Map.class);
		_f4.setAliases(var15);
		_f4.setName("");
		_f4.setNumericFormatName("");
		_f4.setType(t13);
		_f4.setVersionFormula(t14);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.data.Intersection.getCoordinate(Intersection.java:67)
		// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:76)
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
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				return _f1;
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVarianceVersions", argument_types)) {
				return _f3;
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
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
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// 
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
					case 3 :
						return Boolean.FALSE;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
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
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					case 2 :
						return _f5;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					case 3 :
						return _f8;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
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
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_ConvertVariances#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation26() throws Throwable {
		ES_ConvertVariances THIS = new ES_ConvertVariances();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState((SliceState) null, t2);
		Object[] var1 = new Object[] {};
		ListMock t4 = new ListMock(var1);
		RuleGroup t5 = new RuleGroup();
		Boolean t6 = new Boolean(false);
		Rule t7 = new Rule();
		Formula t8 = new Formula();
		Boolean t9 = new Boolean(false);
		Long t10 = new Long("0");
		RuleSet t11 = new RuleSet();
		ClientInitRequest t12 = new ClientInitRequest();
		PafClientState t13 = new PafClientState((String) null, t12);
		_f0 = new PafApplicationDef();
		SeasonList t15 = new SeasonList();
		MdbDef t16 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new PafApplicationDef();
		SeasonList t19 = new SeasonList();
		MdbDef t20 = new MdbDef();
		_f4 = new VersionDef();
		VersionType t22 = VersionType.valueOf("Calculated");
		VersionFormula t23 = new VersionFormula();
		VersionVarianceType t24 = VersionVarianceType.valueOf("SimpleVariance");
		_f5 = new VersionDef((String) null, (VersionType) null);
		VersionType t26 = VersionType.valueOf("Calculated");
		VersionFormula t27 = new VersionFormula(
			(String) null,
			(String) null,
			(VersionVarianceType) null);
		_f6 = new VersionDef((String) null, (VersionType) null);
		_f9 = new VersionDef();
		_f10 = new VersionDef();
		_f12 = new VersionDef((String) null, (VersionType) null);
		_f13 = new VersionDef((String) null, (VersionType) null);
		VersionType t33 = VersionType.valueOf("Calculated");
		VersionFormula t34 = new VersionFormula(
			(String) null,
			(String) null,
			(VersionVarianceType) null);
		VersionVarianceType t35 = VersionVarianceType.valueOf("SimpleVariance");
		_f16 = new VersionDef();
		VersionType t37 = VersionType.valueOf("Calculated");
		VersionFormula t38 = new VersionFormula();
		String[] var2 = new String[] { "" };
		_f8 = Intersection.createIntersection(
			var2,
			(List) null,
			(List) null,
			(List) null);
		ClientInitRequest t40 = new ClientInitRequest();
		_f11 = new PafClientState((String) null, t40);
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
		t11.setDimension("");
		t11.setType(0);
		t11.setName("");
		String[] var7 = new String[] {};
		t11.setMeasureList(var7);
		t3.setMeasureRuleSet(t11);
		t3.setStateChanged(false);
		t3.setClientState(t13);
		t3.setTimeSliceMode(false);
		_f0.setSeasonList(t15);
		_f0.setAppId("");
		PlanCycle[] var8 = new PlanCycle[] {};
		_f0.setPlanCycles(var8);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t16.setYearDim("");
		String[] var9 = new String[] {};
		t16.setHierDims(var9);
		t16.setMeasureDim("");
		t16.setPlanTypeDim("");
		t16.setTimeDim("");
		t16.setVersionDim("");
		t16.setDataSourceId("");
		String[] var10 = new String[] {};
		t16.setAxisPriority(var10);
		_f0.setMdbDef(t16);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var11);
		Map var12 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var12);
		_f2.setSeasonList(t19);
		_f2.setAppId("");
		PlanCycle[] var13 = new PlanCycle[] {};
		_f2.setPlanCycles(var13);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
		t20.setYearDim("");
		String[] var14 = new String[] {};
		t20.setHierDims(var14);
		t20.setMeasureDim("");
		t20.setPlanTypeDim("");
		t20.setTimeDim("");
		t20.setVersionDim("");
		t20.setDataSourceId("");
		String[] var15 = new String[] {};
		t20.setAxisPriority(var15);
		_f2.setMdbDef(t20);
		Map var16 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var16);
		Map var17 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var17);
		Map var18 = (Map) Stubs.makeStubObject(Map.class);
		_f4.setAliases(var18);
		_f4.setName("");
		_f4.setNumericFormatName("");
		_f4.setType(t22);
		t23.setBaseVersion("");
		t23.setCompareVersion("");
		t23.setVarianceType(t24);
		_f4.setVersionFormula(t23);
		Map var19 = (Map) Stubs.makeStubObject(Map.class);
		_f5.setAliases(var19);
		_f5.setName("");
		_f5.setNumericFormatName("");
		_f5.setType(t26);
		_f5.setVersionFormula(t27);
		Map var20 = (Map) Stubs.makeStubObject(Map.class);
		_f13.setAliases(var20);
		_f13.setName("");
		_f13.setNumericFormatName("");
		_f13.setType(t33);
		t34.setBaseVersion("");
		t34.setCompareVersion("");
		t34.setVarianceType(t35);
		_f13.setVersionFormula(t34);
		Map var21 = (Map) Stubs.makeStubObject(Map.class);
		_f16.setAliases(var21);
		_f16.setName("");
		_f16.setNumericFormatName("");
		_f16.setType(t37);
		_f16.setVersionFormula(t38);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown
		// at com.palladium.paf.data.Intersection.hashCode(Intersection.java:108)
		// at java.util.HashMap.hash(HashMap.java:264)
		// at java.util.WeakHashMap.getEntry(WeakHashMap.java:370)
		// at java.util.WeakHashMap.containsKey(WeakHashMap.java:361)
		// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:144)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPerformEvaluation26.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPerformEvaluation26(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientState", argument_types)) {
				return _f11;
				// at com.palladium.paf.eval.ES_ConvertVariances.convertChange(ES_ConvertVariances.java:112)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:80)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				return _f1;
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:61)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:167)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "values", argument_types)) {
				return Stubs.makeStubObject(Collection.class);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
			}
		}
		if (Stubs.matches(method, Collection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
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
					case 7 :
					case 8 :
					case 10 :
						return Boolean.TRUE;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					// 
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
					case 9 :
						return Boolean.FALSE;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
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
					case 2 :
						return _f5;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					case 3 :
						return _f6;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					case 4 :
						return _f9;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					case 5 :
						return _f10;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					case 6 :
						return _f12;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					case 7 :
						return _f13;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					case 8 :
						return _f16;
					// at com.palladium.paf.app.PafApplicationDef.getVarianceVersions(PafApplicationDef.java:168)
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:66)
					case 9 :
						return _f8;
					// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:75)
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
			}
		}
		if (Stubs.matches(method, HashSet.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "contains", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_ConvertVariances.performEvaluation(ES_ConvertVariances.java:76)
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
     * Usage: java com.palladium.paf.eval.ES_ConvertVariancesTest
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
            ES_ConvertVariancesTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.eval.ES_ConvertVariances",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return ES_ConvertVariances.class;
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
private PafApplicationDef _f2;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private ListMock _f3;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private VersionDef _f4;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private VersionDef _f5;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private VersionDef _f6;
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
private VersionDef _f9;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private VersionDef _f10;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafClientState _f11;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private VersionDef _f12;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private VersionDef _f13;
			/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private VersionDef _f16;
								}

// JTEST_CURRENT_ID=291262318.