/*
 * ES_VarianceVersionImpactsTest.java
 * Created by Jtest on 9/19/06 5:01:39 PM.
 * Updated by Jtest on 10/18/06 12:00:53 PM, 1 test case added, 1 test case removed.
 */

package com.palladium.paf.eval;

import com.palladium.paf.app.PafDimSpec;
import java.util.Set;
import java.util.Map;
import com.palladium.paf.app.PlanCycle;
import com.palladium.paf.comm.PafPlannerConfig;
import com.palladium.paf.app.Season;
import com.palladium.paf.app.PafPlannerRole;
import com.palladium.paf.app.UnitOfWork;
import com.palladium.paf.app.MdbDef;
import com.palladium.paf.app.SeasonList;
import com.palladium.paf.app.PafApplicationDef;
import com.palladium.paf.PafSecurityToken;
import com.palladium.paf.data.MemberTreeSet;
import com.palladium.paf.app.MeasureFunctionFactory;
import com.palladium.paf.rules.Formula;
import java.util.HashSet;
import com.palladium.paf.rules.RuleSet;
import com.palladium.paf.rules.RuleGroup;
import com.palladium.paf.rules.Rule;
import jtest.mocks.java.util.ListMock;
import jtest.JT;
import java.lang.reflect.Member;
import com.palladium.paf.state.PafClientState;
import com.palladium.paf.comm.ClientInitRequest;
import jtest.Stubs;
import com.palladium.paf.mdb.PafDataCache;
import com.palladium.paf.state.EvalState;
import com.palladium.paf.eval.ES_VarianceVersionImpacts;

/**
 * ES_VarianceVersionImpactsTest is a unit test class for class ES_VarianceVersionImpacts.
 * @see com.palladium.paf.eval.ES_VarianceVersionImpacts
 * @author Parasoft Jtest 8.0
 */
public class ES_VarianceVersionImpactsTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public ES_VarianceVersionImpactsTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_VarianceVersionImpacts#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation1() throws Throwable {
		ES_VarianceVersionImpacts THIS = new ES_VarianceVersionImpacts();
		// jtest_tested_method
		THIS.performEvaluation(
			(EvalState) null,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_VarianceVersionImpacts#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation5() throws Throwable {
		ES_VarianceVersionImpacts THIS = new ES_VarianceVersionImpacts();
		JT.invokeStatic(
			PafDataCache.class,
			"setAxisCount",
			new Object[] { new Integer(7) },
			new Class[] { Integer.TYPE });
		int[] var1 = new int[] {};
		JT.invokeStatic(
			PafDataCache.class,
			"setAxisSizes",
			new Object[] { var1 },
			new Class[] { int[].class });
		int[] var2 = new int[] {};
		JT.invokeStatic(
			PafDataCache.class,
			"setDimCountByAxis",
			new Object[] { var2 },
			new Class[] { int[].class });
		boolean[] var3 = new boolean[] {};
		JT.invokeStatic(
			PafDataCache.class,
			"setIsSlicerAxis",
			new Object[] { var3 },
			new Class[] { boolean[].class });
		JT.invokeStatic(
			PafDataCache.class,
			"setMdxQuery",
			new Object[] { "" },
			new Class[] { String.class });
		EvalState var4 = (EvalState) Stubs.makeStubObject(EvalState.class);
		PafDataCache var5 = (PafDataCache) Stubs
			.makeStubObject(PafDataCache.class);
		IFormulaEvalEngine var6 = (IFormulaEvalEngine) Stubs
			.makeStubObject(IFormulaEvalEngine.class);
		// jtest_tested_method
		THIS.performEvaluation(var4, var5, var6);
		// NullPointerException thrown
		// jtest_unverified
	}

	/**
	 * Test for method: performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_VarianceVersionImpacts#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation20() throws Throwable {
		ES_VarianceVersionImpacts THIS = new ES_VarianceVersionImpacts();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState("", t1);
		MemberTreeSet t3 = new MemberTreeSet();
		PafSecurityToken t4 = new PafSecurityToken();
		Boolean t5 = new Boolean((String) null);
		PafApplicationDef t6 = new PafApplicationDef();
		SeasonList t7 = new SeasonList();
		MdbDef t8 = new MdbDef();
		String[] var1 = new String[] { null, "", null };
		UnitOfWork t9 = new UnitOfWork(var1);
		PafPlannerRole t10 = new PafPlannerRole();
		Season t11 = new Season();
		PafPlannerConfig t12 = new PafPlannerConfig();
		EvalState t13 = new EvalState(t2);
		Object[] var2 = new Object[] {};
		ListMock t14 = new ListMock(var2);
		RuleGroup t15 = new RuleGroup();
		Rule t16 = new Rule();
		MeasureFunctionFactory var3 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		Formula t17 = new Formula((String) null, "12345", var3);
		Boolean t18 = new Boolean((String) null);
		Long t19 = new Long("0");
		RuleSet t20 = new RuleSet();
		ClientInitRequest t21 = new ClientInitRequest();
		PafClientState t22 = new PafClientState("", t21);
		t1.setClientType("");
		t1.setClientVersion("");
		t1.setIpAddress("");
		t1.setClientLanguage("0");
		t2.setUowTrees(t3);
		t4.setUserName("");
		t4.setValid(false);
		t4.setSessionToken("");
		t4.setAdmin(t5);
		t2.setSecurityToken(t4);
		t6.setSeasonList(t7);
		t6.setAppId("");
		PlanCycle[] var4 = new PlanCycle[] {};
		t6.setPlanCycles(var4);
		t6.setLastPeriod("");
		t6.setCurrentYear("");
		t8.setYearDim("");
		String[] var5 = new String[] {};
		t8.setHierDims(var5);
		t8.setMeasureDim("");
		t8.setPlanTypeDim("");
		t8.setTimeDim("");
		t8.setVersionDim("");
		t8.setDataSourceId("");
		String[] var6 = new String[] {};
		t8.setAxisPriority(var6);
		t6.setMdbDef(t8);
		Map var7 = (Map) Stubs.makeStubObject(Map.class);
		t6.setMeasures(var7);
		Map var8 = (Map) Stubs.makeStubObject(Map.class);
		t6.setVersions(var8);
		t2.setApp(t6);
		t2.setUnitOfWork(t9);
		Map var9 = (Map) Stubs.makeStubObject(Map.class);
		t2.setRuleSets(var9);
		Set var10 = (Set) Stubs.makeStubObject(Set.class);
		t2.setLockedPeriods(var10);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		t2.setLockedForwardPlannableInterMap(var11);
		Map var12 = (Map) Stubs.makeStubObject(Map.class);
		t2.setLockedNotPlannableInterMap(var12);
		t10.setRoleDesc("");
		t10.setRoleName("");
		t10.setPlanType("");
		t10.setPlanVersion("");
		String[] var13 = new String[] {};
		t10.setSeasonIds(var13);
		t2.setPlannerRole(t10);
		t11.setOpen(false);
		PafDimSpec[] var14 = new PafDimSpec[] {};
		t11.setOtherDims(var14);
		t11.setYear("");
		t11.setId("");
		t11.setTimePeriod("");
		t11.setPlanCycle("");
		t2.setPlanSeason(t11);
		t2.setClientLanguage("");
		Map var15 = (Map) Stubs.makeStubObject(Map.class);
		t2.setUserSelections(var15);
		Set var16 = (Set) Stubs.makeStubObject(Set.class);
		t2.setActiveVersions(var16);
		t12.setCycle("");
		String[] var17 = new String[] {};
		t12.setMenuItemNames(var17);
		t12.setRole("");
		String[] var18 = new String[] {};
		t12.setViewTreeItemNames(var18);
		t12.setDefaultEvalEnabled(false);
		t12.setDefaultRulesetName("");
		String[] var19 = new String[] {};
		t12.setRuleSetNames(var19);
		t2.setPlannerConfig(t12);
		t13.setTimePeriodList(t14);
		t13.setRuleGroup(t15);
		t16.setKey(7);
		t17.setExpression("6789@B");
		String[] var20 = new String[] {};
		t17.setExpressionTerms(var20);
		t17.setResultTerm("");
		t17.setResultFunction(false);
		t17.setParsed(false);
		t16.setFormula(t17);
		String[] var21 = new String[] {};
		t16.setTriggerMeasures(var21);
		t16.setSkipAggregation(true);
		t16.setSkipAllocation(true);
		t16.setBaseAllocateMeasure("");
		t16.setLockAllocation(true);
		t16.setEvalLockedIntersections(true);
		t16.setCalcAllPeriods(true);
		t16.setLockSystemEvaluationResult(true);
		t16.setLockUserEvaluationResult(t18);
		t16.setLockAllPriorTime(true);
		t16.setInitialTBFirstAllocation(true);
		t13.setRule(t16);
		t13.setStartTime(t19);
		HashSet var22 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t13.setForcedCalcs(var22);
		HashSet var23 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t13.setRequiredCalcs(var23);
		t20.setDimension("");
		t20.setType(7);
		t20.setName("");
		String[] var24 = new String[] {};
		t20.setMeasureList(var24);
		t13.setMeasureRuleSet(t20);
		t13.setStateChanged(true);
		t13.setClientState(t22);
		t13.setTimeSliceMode(true);
		PafDataCache var25 = (PafDataCache) Stubs
			.makeStubObject(PafDataCache.class);
		IFormulaEvalEngine var26 = (IFormulaEvalEngine) Stubs
			.makeStubObject(IFormulaEvalEngine.class);
		// jtest_tested_method
		THIS.performEvaluation(t13, var25, var26);
		assertEquals(5, t8.getDimCount()); // jtest_unverified
		// No exception thrown
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
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
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
					case 2 :
						return Boolean.TRUE;
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getFunction", argument_types)) {
				return null;
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
     * Usage: java com.palladium.paf.eval.ES_VarianceVersionImpactsTest
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
            ES_VarianceVersionImpactsTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.eval.ES_VarianceVersionImpacts",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return ES_VarianceVersionImpacts.class;
    }

    /**
     * Used to keep track of how many times a stubbed method has been called.
     * @author Parasoft Jtest 8.0
     */
private jtest.StubIterationCounter _stubs_iteration;
}

// JTEST_CURRENT_ID=-1373254101.