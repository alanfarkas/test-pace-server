/*
 * ES_EvalPepetualRulegroupTest.java
 * Created by Jtest on 9/19/06 6:21:46 PM.
 * Updated by Jtest on 10/18/06 3:26:18 PM, 14 test cases added, 9 test cases removed.
 * Updated by Jtest on 11/9/06 2:13:28 AM, 13 test cases added, 13 test cases removed.
 */

package com.palladium.paf.eval;

import java.sql.SQLException;
import java.util.Properties;
import java.sql.DriverManager;
import com.palladium.paf.funcs.IPafFunction;
import java.util.Iterator;
import java.util.Set;
import com.palladium.paf.server.PafAppService;
import com.palladium.paf.mdb.IPafConnectionProps;
import java.util.Map;
import com.palladium.paf.app.PlanCycle;
import com.palladium.paf.app.SeasonList;
import com.palladium.paf.PafException;
import com.palladium.paf.funcs.CustomFunctionDef;
import com.palladium.paf.app.MeasureFunctionFactory;
import com.palladium.paf.rules.Formula;
import com.palladium.paf.server.PafDataService;
import org.hibernate.connection.DriverManagerConnectionProvider;
import java.util.HashSet;
import com.palladium.paf.rules.RuleSet;
import com.palladium.paf.rules.Rule;
import com.palladium.paf.rules.RuleGroup;
import jtest.mocks.java.util.ListMock;
import com.palladium.paf.app.MdbDef;
import com.palladium.paf.app.PafApplicationDef;
import com.palladium.paf.state.SliceState;
import com.palladium.paf.state.PafClientState;
import com.palladium.paf.comm.ClientInitRequest;
import java.lang.reflect.Member;
import jtest.Stubs;
import com.palladium.paf.mdb.PafDataCache;
import com.palladium.paf.state.EvalState;
import com.palladium.paf.eval.ES_EvalPepetualRulegroup;

/**
 * ES_EvalPepetualRulegroupTest is a unit test class for class ES_EvalPepetualRulegroup.
 * @see com.palladium.paf.eval.ES_EvalPepetualRulegroup
 * @author Parasoft Jtest 8.0
 */
public class ES_EvalPepetualRulegroupTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public ES_EvalPepetualRulegroupTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }

	/**
	 * Test for method: ES_EvalPepetualRulegroup()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalPepetualRulegroup#ES_EvalPepetualRulegroup()
	 * @author Parasoft Jtest 8.0
	 */
	public void testES_EvalPepetualRulegroup1() throws Throwable {
		// jtest_tested_method
		ES_EvalPepetualRulegroup THIS = new ES_EvalPepetualRulegroup();
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
		// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.<init>(ES_EvalPepetualRulegroup.java:44)
		// jtest_unverified
	}

	/**
	 * Stubs method for testES_EvalPepetualRulegroup1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsES_EvalPepetualRulegroup1(
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
				// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.<init>(ES_EvalPepetualRulegroup.java:44)
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
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.<init>(ES_EvalPepetualRulegroup.java:44)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: ES_EvalPepetualRulegroup()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalPepetualRulegroup#ES_EvalPepetualRulegroup()
	 * @author Parasoft Jtest 8.0
	 */
	public void testES_EvalPepetualRulegroup3() throws Throwable {
		// jtest_tested_method
		ES_EvalPepetualRulegroup THIS = new ES_EvalPepetualRulegroup();
		// NullPointerException thrown
		// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1199)
		// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
		// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
		// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
		// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.<init>(ES_EvalPepetualRulegroup.java:44)
		// jtest_unverified
	}

	/**
	 * Stubs method for testES_EvalPepetualRulegroup3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsES_EvalPepetualRulegroup3(
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
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.<init>(ES_EvalPepetualRulegroup.java:44)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
				// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.<init>(ES_EvalPepetualRulegroup.java:44)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: ES_EvalPepetualRulegroup()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalPepetualRulegroup#ES_EvalPepetualRulegroup()
	 * @author Parasoft Jtest 8.0
	 */
	public void testES_EvalPepetualRulegroup5() throws Throwable {
		// jtest_tested_method
		ES_EvalPepetualRulegroup THIS = new ES_EvalPepetualRulegroup();
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testES_EvalPepetualRulegroup5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsES_EvalPepetualRulegroup5(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "clearMemberTreeCache", argument_types)) {
				return Stubs.VOID;
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "loadApplications", argument_types)) {
				return Stubs.VOID;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalPepetualRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation1() throws Throwable {
		ES_EvalPepetualRulegroup THIS = new ES_EvalPepetualRulegroup();
		// jtest_tested_method
		THIS.performEvaluation(
			(EvalState) null,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(Lcom/palladium/paf/state/EvalState;Lcom/palladium/paf/mdb/PafDataCache;Lcom/palladium/paf/eval/IFormulaEvalEngine;)V>
		// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:54)
		// jtest_unverified
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalPepetualRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation5() throws Throwable {
		ES_EvalPepetualRulegroup THIS = new ES_EvalPepetualRulegroup();
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
		// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:55)
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
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:54)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:54)
					case 2 :
						return null;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:55)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				return _f1;
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:54)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalPepetualRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation8() throws Throwable {
		ES_EvalPepetualRulegroup THIS = new ES_EvalPepetualRulegroup();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState((SliceState) null, t2);
		_f0 = new PafApplicationDef();
		SeasonList t5 = new SeasonList();
		MdbDef t6 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new PafApplicationDef();
		_f3 = new MdbDef();
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
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown
		// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:63)
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
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:54)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:54)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:55)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:63)
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
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:54)
					case 2 :
						return _f3;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:55)
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
	 * @see ES_EvalPepetualRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation9() throws Throwable {
		ES_EvalPepetualRulegroup THIS = new ES_EvalPepetualRulegroup();
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
		_f3 = new MdbDef();
		_f4 = new Rule();
		Formula t13 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		Boolean t14 = new Boolean(false);
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
		_f4.setKey(0);
		_f4.setFormula(t13);
		String[] var15 = new String[] {};
		_f4.setTriggerMeasures(var15);
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
		// NullPointerException thrown
		// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
		// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:79)
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
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:54)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:54)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:55)
					case 3 :
						return null;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:79)
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
						return _f4;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:63)
					case 2 :
						return null;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:79)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeSlice", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:79)
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
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:54)
					case 2 :
						return _f3;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:55)
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
	 * @see ES_EvalPepetualRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation10() throws Throwable {
		ES_EvalPepetualRulegroup THIS = new ES_EvalPepetualRulegroup();
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
		_f0 = new PafApplicationDef();
		SeasonList t12 = new SeasonList();
		MdbDef t13 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new PafApplicationDef();
		SeasonList t16 = new SeasonList();
		MdbDef t17 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Rule();
		CustomFunctionDef[] var2 = new CustomFunctionDef[] {};
		MeasureFunctionFactory t20 = new MeasureFunctionFactory(
			var2,
			(ClassLoader) null);
		Formula t21 = new Formula("0", " ", t20);
		Boolean t22 = new Boolean(false);
		_f5 = new PafApplicationDef();
		SeasonList t24 = new SeasonList();
		MdbDef t25 = new MdbDef();
		_f6 = new MdbDef();
		t3.setTimePeriodList(t4);
		t3.setRuleGroup(t5);
		t3.setRule(t6);
		t3.setStartTime(t7);
		HashSet var3 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setForcedCalcs(var3);
		HashSet var4 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t3.setRequiredCalcs(var4);
		t8.setDimension("");
		t8.setType(0);
		t8.setName("");
		String[] var5 = new String[] {};
		t8.setMeasureList(var5);
		t3.setMeasureRuleSet(t8);
		t3.setStateChanged(false);
		t3.setClientState(t10);
		t3.setTimeSliceMode(false);
		_f0.setSeasonList(t12);
		_f0.setAppId("");
		PlanCycle[] var6 = new PlanCycle[] {};
		_f0.setPlanCycles(var6);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t13.setYearDim("");
		String[] var7 = new String[] {};
		t13.setHierDims(var7);
		t13.setMeasureDim("");
		t13.setPlanTypeDim("");
		t13.setTimeDim("");
		t13.setVersionDim("");
		t13.setDataSourceId("");
		String[] var8 = new String[] {};
		t13.setAxisPriority(var8);
		_f0.setMdbDef(t13);
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
		_f2.setSeasonList(t16);
		_f2.setAppId("");
		PlanCycle[] var13 = new PlanCycle[] {};
		_f2.setPlanCycles(var13);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
		t17.setYearDim("");
		String[] var14 = new String[] {};
		t17.setHierDims(var14);
		t17.setMeasureDim("");
		t17.setPlanTypeDim("");
		t17.setTimeDim("");
		t17.setVersionDim("");
		t17.setDataSourceId("");
		String[] var15 = new String[] {};
		t17.setAxisPriority(var15);
		_f2.setMdbDef(t17);
		Map var16 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var16);
		Map var17 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var17);
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
		_f4.setKey(0);
		_f4.setFormula(t21);
		String[] var20 = new String[] {};
		_f4.setTriggerMeasures(var20);
		_f4.setSkipAggregation(false);
		_f4.setSkipAllocation(false);
		_f4.setBaseAllocateMeasure("");
		_f4.setLockAllocation(false);
		_f4.setEvalLockedIntersections(false);
		_f4.setCalcAllPeriods(false);
		_f4.setLockSystemEvaluationResult(false);
		_f4.setLockUserEvaluationResult(t22);
		_f4.setLockAllPriorTime(false);
		_f4.setInitialTBFirstAllocation(false);
		_f5.setSeasonList(t24);
		_f5.setAppId("");
		PlanCycle[] var21 = new PlanCycle[] {};
		_f5.setPlanCycles(var21);
		_f5.setLastPeriod("");
		_f5.setCurrentYear("");
		_f5.setMdbDef(t25);
		Map var22 = (Map) Stubs.makeStubObject(Map.class);
		_f5.setMeasures(var22);
		Map var23 = (Map) Stubs.makeStubObject(Map.class);
		_f5.setVersions(var23);
		_f6.setYearDim("");
		String[] var24 = new String[] {};
		_f6.setHierDims(var24);
		_f6.setMeasureDim("");
		_f6.setPlanTypeDim("");
		_f6.setTimeDim("");
		_f6.setVersionDim("");
		_f6.setDataSourceId("");
		String[] var25 = new String[] {};
		_f6.setAxisPriority(var25);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:55)
		// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:79)
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
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:54)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:54)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:54)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:55)
					case 3 :
						return _f5;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:79)
					case 4 :
						return null;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:55)
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:79)
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
						return _f4;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:63)
					case 2 :
						return null;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:79)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeSlice", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:79)
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
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:54)
					case 2 :
						return _f3;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:55)
					case 3 :
						return _f6;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:79)
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
	 * @see ES_EvalPepetualRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation11() throws Throwable {
		ES_EvalPepetualRulegroup THIS = new ES_EvalPepetualRulegroup();
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
		_f3 = new MdbDef();
		_f4 = new Rule();
		Formula t21 = new Formula();
		Boolean t22 = new Boolean(false);
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
		_f0.setSeasonList(t13);
		_f0.setAppId("");
		PlanCycle[] var5 = new PlanCycle[] {};
		_f0.setPlanCycles(var5);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
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
		_f0.setMdbDef(t14);
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
		_f3.setYearDim("");
		String[] var17 = new String[] {};
		_f3.setHierDims(var17);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var18 = new String[] {};
		_f3.setAxisPriority(var18);
		_f4.setKey(0);
		_f4.setFormula(t21);
		String[] var19 = new String[] {};
		_f4.setTriggerMeasures(var19);
		_f4.setSkipAggregation(false);
		_f4.setSkipAllocation(false);
		_f4.setBaseAllocateMeasure("");
		_f4.setLockAllocation(false);
		_f4.setEvalLockedIntersections(false);
		_f4.setCalcAllPeriods(false);
		_f4.setLockSystemEvaluationResult(false);
		_f4.setLockUserEvaluationResult(t22);
		_f4.setLockAllPriorTime(false);
		_f4.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown
		// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:64)
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
		if (Stubs.matches(method, PafDataService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "loadApplications", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
				// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.<init>(ES_EvalPepetualRulegroup.java:44)
			}
		}
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:54)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:54)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:54)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:55)
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
						return _f4;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:63)
					case 2 :
						return null;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:64)
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
						return _f1;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:54)
					case 2 :
						return _f3;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:55)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Formula.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isResultFunction", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:63)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalPepetualRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation13() throws Throwable {
		ES_EvalPepetualRulegroup THIS = new ES_EvalPepetualRulegroup();
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
		_f3 = new MdbDef();
		_f4 = new Rule();
		Formula t13 = new Formula(
			(String) null,
			"()",
			(MeasureFunctionFactory) null);
		Boolean t14 = new Boolean(false);
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
		_f1.setYearDim("");
		String[] var4 = new String[] {};
		_f1.setHierDims(var4);
		_f1.setMeasureDim("");
		_f1.setPlanTypeDim("");
		_f1.setTimeDim("");
		_f1.setVersionDim("");
		_f1.setDataSourceId("");
		String[] var5 = new String[] {};
		_f1.setAxisPriority(var5);
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
		_f3.setYearDim("");
		String[] var11 = new String[] {};
		_f3.setHierDims(var11);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var12 = new String[] {};
		_f3.setAxisPriority(var12);
		_f4.setKey(0);
		t13.setExpression("*+,");
		String[] var13 = new String[] {};
		t13.setExpressionTerms(var13);
		t13.setResultTerm("");
		t13.setResultFunction(false);
		t13.setParsed(false);
		_f4.setFormula(t13);
		String[] var14 = new String[] {};
		_f4.setTriggerMeasures(var14);
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

		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:79)
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
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:54)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:54)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:55)
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
						return _f4;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:63)
					case 2 :
						return null;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:79)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeSlice", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:79)
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
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:54)
					case 2 :
						return _f3;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:55)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, ES_EvalBase.class)) {
			argument_types = new Class[] { Rule.class, EvalState.class,
					String.class };
			if (Stubs.matches(method, "impactingChangeList", argument_types)) {
				throw new PafException();
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:79)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalPepetualRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation15() throws Throwable {
		ES_EvalPepetualRulegroup THIS = new ES_EvalPepetualRulegroup();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState((SliceState) null, t2);
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
		SeasonList t14 = new SeasonList();
		MdbDef t15 = new MdbDef();
		_f1 = new MdbDef();
		_f2 = new PafApplicationDef();
		SeasonList t18 = new SeasonList();
		MdbDef t19 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new Rule();
		_f7 = new Formula((String) null, "12345", (MeasureFunctionFactory) null);
		_f8 = new Rule();
		MeasureFunctionFactory var2 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		_f9 = new Formula((String) null, "6789@B", var2);
		_f5 = new PafApplicationDef();
		_f6 = new MdbDef();
		_f10 = new PafApplicationDef();
		SeasonList t28 = new SeasonList();
		MdbDef t29 = new MdbDef();
		_f11 = new MdbDef();
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
		_f0.setSeasonList(t14);
		_f0.setAppId("");
		PlanCycle[] var6 = new PlanCycle[] {};
		_f0.setPlanCycles(var6);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		_f0.setMdbDef(t15);
		Map var7 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var7);
		Map var8 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var8);
		_f1.setYearDim("");
		String[] var9 = new String[] {};
		_f1.setHierDims(var9);
		_f1.setMeasureDim("");
		_f1.setPlanTypeDim("");
		_f1.setTimeDim("");
		_f1.setVersionDim("");
		_f1.setDataSourceId("");
		String[] var10 = new String[] {};
		_f1.setAxisPriority(var10);
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
		_f3.setYearDim("");
		String[] var16 = new String[] {};
		_f3.setHierDims(var16);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var17 = new String[] {};
		_f3.setAxisPriority(var17);
		_f9.setExpression(" ()*+, ");
		String[] var18 = new String[] {};
		_f9.setExpressionTerms(var18);
		_f9.setResultTerm("");
		_f9.setResultFunction(false);
		_f9.setParsed(false);
		_f10.setSeasonList(t28);
		_f10.setAppId("");
		PlanCycle[] var19 = new PlanCycle[] {};
		_f10.setPlanCycles(var19);
		_f10.setLastPeriod("");
		_f10.setCurrentYear("");
		t29.setYearDim("");
		String[] var20 = new String[] {};
		t29.setHierDims(var20);
		t29.setMeasureDim("");
		t29.setPlanTypeDim("");
		t29.setTimeDim("");
		t29.setVersionDim("");
		t29.setDataSourceId("");
		String[] var21 = new String[] {};
		t29.setAxisPriority(var21);
		_f10.setMdbDef(t29);
		Map var22 = (Map) Stubs.makeStubObject(Map.class);
		_f10.setMeasures(var22);
		Map var23 = (Map) Stubs.makeStubObject(Map.class);
		_f10.setVersions(var23);
		_f11.setYearDim("");
		String[] var24 = new String[] {};
		_f11.setHierDims(var24);
		_f11.setMeasureDim("");
		_f11.setPlanTypeDim("");
		_f11.setTimeDim("");
		_f11.setVersionDim("");
		_f11.setDataSourceId("");
		String[] var25 = new String[] {};
		_f11.setAxisPriority(var25);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:61)
		// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:79)
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
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:54)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:54)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:54)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:55)
					case 3 :
						return _f5;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:79)
					case 4 :
						return _f10;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:55)
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:79)
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
						return _f4;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:63)
					case 2 :
						return _f8;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:64)
					case 3 :
						return null;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:79)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeSlice", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:79)
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
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:54)
					case 2 :
						return _f3;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:55)
					case 3 :
						return _f6;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:79)
					case 4 :
						return _f11;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:55)
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:79)
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
						return _f7;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:63)
					case 2 :
						return _f9;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:64)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Formula.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isResultFunction", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:63)
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
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:64)
				// 
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:270)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
				// at com.palladium.paf.rules.Rule.getFormula(Rule.java:60)
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:64)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "isFunction", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.MeasureFunctionFactory.isFunction(java.lang.String)");
				switch (index) {
					case 1 :
						return Boolean.TRUE;
					// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
					// at com.palladium.paf.rules.Formula.init(Formula.java:87)
					// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
					// at com.palladium.paf.rules.Rule.getFormula(Rule.java:60)
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:64)
					case 2 :
						return Boolean.FALSE;
					// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
					// at com.palladium.paf.rules.Rule.getFormula(Rule.java:60)
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:64)
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
	 * @see ES_EvalPepetualRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation17() throws Throwable {
		ES_EvalPepetualRulegroup THIS = new ES_EvalPepetualRulegroup();
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
		_f3 = new MdbDef();
		_f4 = new Rule();
		Formula t13 = new Formula(
			(String) null,
			"12345678",
			(MeasureFunctionFactory) null);
		Boolean t14 = new Boolean(false);
		MeasureFunctionFactory var1 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		_f7 = new Formula((String) null, "9@B()*+, ", var1);
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
		_f3.setYearDim("");
		String[] var14 = new String[] {};
		_f3.setHierDims(var14);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var15 = new String[] {};
		_f3.setAxisPriority(var15);
		_f4.setKey(0);
		_f4.setFormula(t13);
		String[] var16 = new String[] {};
		_f4.setTriggerMeasures(var16);
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
		_f7.setExpression(" ()*+, 123");
		String[] var17 = new String[] {};
		_f7.setExpressionTerms(var17);
		_f7.setResultTerm("");
		_f7.setResultFunction(false);
		_f7.setParsed(false);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown
		// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:170)
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
		if (Stubs.matches(method, PafDataService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "loadApplications", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
				// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.<init>(ES_EvalPepetualRulegroup.java:44)
			}
		}
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:54)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:54)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:55)
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
						return _f4;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:63)
					case 2 :
						return null;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:79)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeSlice", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:79)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:170)
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
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:54)
					case 2 :
						return _f3;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:55)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Rule.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getFormula", argument_types)) {
				return _f7;
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:63)
			}
		}
		if (Stubs.matches(method, MeasureFunctionFactory.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getFunction", argument_types)) {
				return null;
				// at com.palladium.paf.rules.Formula.extractTerms(Formula.java:204)
				// at com.palladium.paf.rules.Formula.init(Formula.java:86)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:63)
				// 
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:270)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:63)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "isFunction", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.MeasureFunctionFactory.isFunction(java.lang.String)");
				switch (index) {
					case 1 :
						return Boolean.TRUE;
					// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
					// at com.palladium.paf.rules.Formula.init(Formula.java:87)
					// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:63)
					case 2 :
						return Boolean.FALSE;
					// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:63)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, ES_EvalBase.class)) {
			argument_types = new Class[] { Rule.class, EvalState.class,
					String.class };
			if (Stubs.matches(method, "impactingChangeList", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:79)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:81)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:81)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalPepetualRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation19() throws Throwable {
		ES_EvalPepetualRulegroup THIS = new ES_EvalPepetualRulegroup();
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
		_f3 = new MdbDef();
		_f4 = new Rule();
		Formula t13 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		Boolean t14 = new Boolean(false);
		MeasureFunctionFactory var1 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		_f7 = new Formula((String) null, "", var1);
		_f8 = new Rule();
		MeasureFunctionFactory var2 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		_f9 = new Formula((String) null, "", var2);
		_f5 = new PafApplicationDef();
		_f6 = new MdbDef();
		_f10 = new PafApplicationDef();
		SeasonList t21 = new SeasonList();
		MdbDef t22 = new MdbDef();
		_f11 = new MdbDef();
		_f12 = new Rule();
		_f13 = new Formula();
		_f0.setSeasonList(t5);
		_f0.setAppId("");
		PlanCycle[] var3 = new PlanCycle[] {};
		_f0.setPlanCycles(var3);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
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
		_f4.setKey(0);
		t13.setExpression("");
		String[] var15 = new String[] {};
		t13.setExpressionTerms(var15);
		t13.setResultTerm("");
		t13.setResultFunction(false);
		t13.setParsed(false);
		_f4.setFormula(t13);
		String[] var16 = new String[] {};
		_f4.setTriggerMeasures(var16);
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
		_f9.setExpression("");
		String[] var17 = new String[] {};
		_f9.setExpressionTerms(var17);
		_f9.setResultTerm("");
		_f9.setResultFunction(false);
		_f9.setParsed(false);
		_f10.setSeasonList(t21);
		_f10.setAppId("");
		PlanCycle[] var18 = new PlanCycle[] {};
		_f10.setPlanCycles(var18);
		_f10.setLastPeriod("");
		_f10.setCurrentYear("");
		t22.setYearDim("");
		String[] var19 = new String[] {};
		t22.setHierDims(var19);
		t22.setMeasureDim("");
		t22.setPlanTypeDim("");
		t22.setTimeDim("");
		t22.setVersionDim("");
		t22.setDataSourceId("");
		String[] var20 = new String[] {};
		t22.setAxisPriority(var20);
		_f10.setMdbDef(t22);
		Map var21 = (Map) Stubs.makeStubObject(Map.class);
		_f10.setMeasures(var21);
		Map var22 = (Map) Stubs.makeStubObject(Map.class);
		_f10.setVersions(var22);
		_f11.setYearDim("");
		String[] var23 = new String[] {};
		_f11.setHierDims(var23);
		_f11.setMeasureDim("");
		_f11.setPlanTypeDim("");
		_f11.setTimeDim("");
		_f11.setVersionDim("");
		_f11.setDataSourceId("");
		String[] var24 = new String[] {};
		_f11.setAxisPriority(var24);
		_f13.setExpression("");
		String[] var25 = new String[] {};
		_f13.setExpressionTerms(var25);
		_f13.setResultTerm("");
		_f13.setResultFunction(false);
		_f13.setParsed(false);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		assertEquals(5, _f11.getDimCount()); // jtest_unverified
		assertEquals(5, _f1.getDimCount()); // jtest_unverified
		assertEquals(5, _f3.getDimCount()); // jtest_unverified
		assertEquals(5, t10.getDimCount()); // jtest_unverified
		assertEquals(5, t22.getDimCount()); // jtest_unverified
		// No exception thrown
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
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:54)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:54)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:55)
					case 3 :
						return _f5;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:79)
					case 4 :
						return _f10;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:55)
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:79)
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
						return _f4;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:63)
					case 2 :
						return _f8;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:64)
					case 3 :
						return _f12;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:79)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeSlice", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:79)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:170)
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
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:54)
					case 2 :
						return _f3;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:55)
					case 3 :
						return _f6;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:79)
					case 4 :
						return _f11;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:55)
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:79)
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
						return _f7;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:63)
					case 2 :
						return _f9;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:64)
					case 3 :
						return _f13;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:82)
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:79)
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
						return Boolean.TRUE;
					// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
					// at com.palladium.paf.rules.Formula.init(Formula.java:87)
					// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:63)
					case 2 :
					case 3 :
						return Boolean.FALSE;
					// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
					// at com.palladium.paf.rules.Formula.init(Formula.java:87)
					// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
					// at com.palladium.paf.rules.Rule.getFormula(Rule.java:60)
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:64)
					// 
					// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
					// at com.palladium.paf.rules.Rule.getFormula(Rule.java:60)
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:64)
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
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:63)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:170)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalPepetualRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation21() throws Throwable {
		ES_EvalPepetualRulegroup THIS = new ES_EvalPepetualRulegroup();
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
		_f3 = new MdbDef();
		_f4 = new Rule();
		Formula t13 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		Boolean t14 = new Boolean(false);
		MeasureFunctionFactory var1 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		_f7 = new Formula((String) null, "", var1);
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
		_f4.setKey(0);
		t13.setExpression("");
		String[] var14 = new String[] {};
		t13.setExpressionTerms(var14);
		t13.setResultTerm("");
		t13.setResultFunction(false);
		t13.setParsed(false);
		_f4.setFormula(t13);
		String[] var15 = new String[] {};
		_f4.setTriggerMeasures(var15);
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
		// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:81)
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
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:54)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:54)
					case 2 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:55)
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
						return _f4;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:63)
					case 2 :
						return null;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:79)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeSlice", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:79)
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
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:54)
					case 2 :
						return _f3;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:55)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Rule.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getFormula", argument_types)) {
				return _f7;
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:63)
			}
		}
		if (Stubs.matches(method, MeasureFunctionFactory.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "isFunction", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:63)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getFunction", argument_types)) {
				return null;
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:270)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:63)
			}
		}
		if (Stubs.matches(method, Formula.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isResultFunction", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:63)
			}
		}
		if (Stubs.matches(method, ES_EvalBase.class)) {
			argument_types = new Class[] { Rule.class, EvalState.class,
					String.class };
			if (Stubs.matches(method, "impactingChangeList", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:79)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:81)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:81)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return "";
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:81)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalPepetualRulegroup#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation22() throws Throwable {
		_f0 = new PafApplicationDef();
		SeasonList t1 = new SeasonList();
		MdbDef t2 = new MdbDef();
		_f1 = new MdbDef();
		_f3 = new MdbDef();
		_f2 = new PafApplicationDef();
		SeasonList t6 = new SeasonList();
		MdbDef t7 = new MdbDef();
		_f6 = new MdbDef();
		_f11 = new MdbDef();
		ES_EvalPepetualRulegroup THIS = new ES_EvalPepetualRulegroup();
		ClientInitRequest t11 = new ClientInitRequest();
		PafClientState t12 = new PafClientState((String) null, t11);
		EvalState t13 = new EvalState((SliceState) null, t12);
		_f5 = new PafApplicationDef();
		_f14 = new MdbDef();
		_f10 = new PafApplicationDef();
		SeasonList t17 = new SeasonList();
		MdbDef t18 = new MdbDef();
		_f15 = new MdbDef();
		_f4 = new Rule();
		Formula t21 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		Boolean t22 = new Boolean(false);
		MeasureFunctionFactory var1 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		_f7 = new Formula((String) null, "", var1);
		_f8 = new Rule();
		MeasureFunctionFactory var2 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		_f9 = new Formula((String) null, "", var2);
		_f0.setSeasonList(t1);
		_f0.setAppId("");
		PlanCycle[] var3 = new PlanCycle[] {};
		_f0.setPlanCycles(var3);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t2.setYearDim("");
		String[] var4 = new String[] {};
		t2.setHierDims(var4);
		t2.setMeasureDim("");
		t2.setPlanTypeDim("");
		t2.setTimeDim("");
		t2.setVersionDim("");
		t2.setDataSourceId("");
		String[] var5 = new String[] {};
		t2.setAxisPriority(var5);
		_f0.setMdbDef(t2);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var6);
		Map var7 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var7);
		_f1.setYearDim("");
		String[] var8 = new String[] { null, null, null, null, null };
		_f1.setHierDims(var8);
		_f1.setMeasureDim("");
		_f1.setPlanTypeDim("");
		_f1.setTimeDim("");
		_f1.setVersionDim("");
		_f1.setDataSourceId("");
		String[] var9 = new String[] {};
		_f1.setAxisPriority(var9);
		_f3.setYearDim("");
		String[] var10 = new String[] {};
		_f3.setHierDims(var10);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var11 = new String[] {};
		_f3.setAxisPriority(var11);
		_f2.setSeasonList(t6);
		_f2.setAppId("");
		PlanCycle[] var12 = new PlanCycle[] {};
		_f2.setPlanCycles(var12);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
		_f2.setMdbDef(t7);
		Map var13 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var13);
		Map var14 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var14);
		_f6.setYearDim("");
		String[] var15 = new String[] { null, null, null, null, null, null };
		_f6.setHierDims(var15);
		_f6.setMeasureDim("");
		_f6.setPlanTypeDim("");
		_f6.setTimeDim("");
		_f6.setVersionDim("");
		_f6.setDataSourceId("");
		String[] var16 = new String[] {};
		_f6.setAxisPriority(var16);
		_f11.setYearDim("");
		String[] var17 = new String[] {};
		_f11.setHierDims(var17);
		_f11.setMeasureDim("");
		_f11.setPlanTypeDim("");
		_f11.setTimeDim("");
		_f11.setVersionDim("");
		_f11.setDataSourceId("");
		String[] var18 = new String[] {};
		_f11.setAxisPriority(var18);
		_f14.setYearDim("");
		String[] var19 = new String[] {};
		_f14.setHierDims(var19);
		_f14.setMeasureDim("");
		_f14.setPlanTypeDim("");
		_f14.setTimeDim("");
		_f14.setVersionDim("");
		_f14.setDataSourceId("");
		String[] var20 = new String[] {};
		_f14.setAxisPriority(var20);
		_f10.setSeasonList(t17);
		_f10.setAppId("");
		PlanCycle[] var21 = new PlanCycle[] {};
		_f10.setPlanCycles(var21);
		_f10.setLastPeriod("");
		_f10.setCurrentYear("");
		_f10.setMdbDef(t18);
		Map var22 = (Map) Stubs.makeStubObject(Map.class);
		_f10.setMeasures(var22);
		Map var23 = (Map) Stubs.makeStubObject(Map.class);
		_f10.setVersions(var23);
		_f15.setYearDim("");
		String[] var24 = new String[] {};
		_f15.setHierDims(var24);
		_f15.setMeasureDim("");
		_f15.setPlanTypeDim("");
		_f15.setTimeDim("");
		_f15.setVersionDim("");
		_f15.setDataSourceId("");
		String[] var25 = new String[] {};
		_f15.setAxisPriority(var25);
		_f4.setKey(0);
		t21.setExpression("");
		String[] var26 = new String[] {};
		t21.setExpressionTerms(var26);
		t21.setResultTerm("");
		t21.setResultFunction(false);
		t21.setParsed(false);
		_f4.setFormula(t21);
		String[] var27 = new String[] {};
		_f4.setTriggerMeasures(var27);
		_f4.setSkipAggregation(false);
		_f4.setSkipAllocation(false);
		_f4.setBaseAllocateMeasure("");
		_f4.setLockAllocation(false);
		_f4.setEvalLockedIntersections(false);
		_f4.setCalcAllPeriods(false);
		_f4.setLockSystemEvaluationResult(false);
		_f4.setLockUserEvaluationResult(t22);
		_f4.setLockAllPriorTime(false);
		_f4.setInitialTBFirstAllocation(false);
		_f9.setExpression("");
		String[] var28 = new String[] {};
		_f9.setExpressionTerms(var28);
		_f9.setResultTerm("");
		_f9.setResultFunction(false);
		_f9.setParsed(false);
		// jtest_tested_method
		THIS.performEvaluation(
			t13,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown
		// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:129)
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
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[] { _f0, _f2 };
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
				// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.<init>(ES_EvalPepetualRulegroup.java:44)
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
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.<init>(ES_EvalPepetualRulegroup.java:44)
					case 2 :
						return _f3;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.<init>(ES_EvalPepetualRulegroup.java:44)
					case 3 :
						return _f6;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.<init>(ES_EvalPepetualRulegroup.java:44)
					case 4 :
						return _f11;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.<init>(ES_EvalPepetualRulegroup.java:44)
					case 5 :
						return _f14;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:54)
					case 6 :
						return _f15;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:55)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if ("org.springframework.context.support.AbstractApplicationContext"
			.equals(method.getDeclaringClass().getName())) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return Stubs.makeStubObject(IPafConnectionProps.class);
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:431)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
				// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.<init>(ES_EvalPepetualRulegroup.java:44)
			}
		}
		if (Stubs.matches(method, IPafConnectionProps.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(
				method,
				"getMetaDataServiceProvider",
				argument_types)) {
				return null;
				// at com.palladium.paf.server.PafDataService.getMetaDataProvider(PafDataService.java:532)
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:434)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
				// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.<init>(ES_EvalPepetualRulegroup.java:44)
			}
		}
		if (Stubs.matches(method, Class.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "forName", argument_types)) {
				return java.lang.Object.class;
				// at com.palladium.paf.server.PafDataService.getMetaDataProvider(PafDataService.java:532)
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:434)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
				// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.<init>(ES_EvalPepetualRulegroup.java:44)
			}
		}
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:54)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f5;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:54)
					case 2 :
						return _f10;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:55)
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
						return _f4;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:63)
					case 2 :
						return _f8;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:64)
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
						return _f7;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:63)
					case 2 :
						return _f9;
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:64)
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
						return Boolean.TRUE;
					// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
					// at com.palladium.paf.rules.Formula.init(Formula.java:87)
					// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:63)
					case 2 :
					case 3 :
						return Boolean.FALSE;
					// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
					// at com.palladium.paf.rules.Formula.init(Formula.java:87)
					// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
					// at com.palladium.paf.rules.Rule.getFormula(Rule.java:60)
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:64)
					// 
					// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
					// at com.palladium.paf.rules.Rule.getFormula(Rule.java:60)
					// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:64)
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
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:63)
			}
		}
		if (Stubs.matches(method, Formula.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "extractResultFunction", argument_types)) {
				return Stubs.makeStubObject(IPafFunction.class);
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:64)
			}
		}
		if (Stubs.matches(method, IPafFunction.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getOpCode", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalPepetualRulegroup.performEvaluation(ES_EvalPepetualRulegroup.java:129)
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
     * Usage: java com.palladium.paf.eval.ES_EvalPepetualRulegroupTest
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
            ES_EvalPepetualRulegroupTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.eval.ES_EvalPepetualRulegroup",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return ES_EvalPepetualRulegroup.class;
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
private MdbDef _f3;
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
private MdbDef _f6;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private Formula _f7;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Rule _f8;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Formula _f9;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafApplicationDef _f10;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private MdbDef _f11;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Rule _f12;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Formula _f13;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private MdbDef _f14;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private MdbDef _f15;
}

// JTEST_CURRENT_ID=113417233.