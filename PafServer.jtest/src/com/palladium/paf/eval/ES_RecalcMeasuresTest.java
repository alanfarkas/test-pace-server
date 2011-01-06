/*
 * ES_RecalcMeasuresTest.java
 * Created by Jtest on 9/19/06 5:20:47 PM.
 * Updated by Jtest on 10/18/06 4:52:18 PM, 3 test cases added, 3 test cases removed.
 * Updated by Jtest on 11/8/06 10:45:44 PM, 3 test cases added, 3 test cases removed.
 */

package com.palladium.paf.eval;

import com.palladium.paf.server.PafAppService;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.DriverManager;
import com.palladium.paf.server.PafDataService;
import org.hibernate.connection.DriverManagerConnectionProvider;
import java.util.Set;
import java.util.Map;
import com.palladium.paf.comm.PafPlannerConfig;
import com.palladium.paf.app.Season;
import com.palladium.paf.app.PafPlannerRole;
import com.palladium.paf.app.UnitOfWork;
import com.palladium.paf.app.PafApplicationDef;
import com.palladium.paf.PafSecurityToken;
import com.palladium.paf.data.MemberTreeSet;
import com.palladium.paf.state.SliceState;
import com.palladium.paf.state.PafClientState;
import com.palladium.paf.comm.ClientInitRequest;
import java.lang.reflect.Member;
import jtest.Stubs;
import com.palladium.paf.mdb.PafDataCache;
import com.palladium.paf.state.EvalState;
import com.palladium.paf.eval.ES_RecalcMeasures;

/**
 * ES_RecalcMeasuresTest is a unit test class for class ES_RecalcMeasures.
 * @see com.palladium.paf.eval.ES_RecalcMeasures
 * @author Parasoft Jtest 8.0
 */
public class ES_RecalcMeasuresTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public ES_RecalcMeasuresTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }

	/**
	 * Test for method: ES_RecalcMeasures()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_RecalcMeasures#ES_RecalcMeasures()
	 * @author Parasoft Jtest 8.0
	 */
	public void testES_RecalcMeasures1() throws Throwable {
		// jtest_tested_method
		ES_RecalcMeasures THIS = new ES_RecalcMeasures();
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
		// at com.palladium.paf.eval.ES_RecalcMeasures.<init>(ES_RecalcMeasures.java:17)
		// jtest_unverified
	}

	/**
	 * Stubs method for testES_RecalcMeasures1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsES_RecalcMeasures1(
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
				// at com.palladium.paf.eval.ES_RecalcMeasures.<init>(ES_RecalcMeasures.java:17)
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
				// at com.palladium.paf.eval.ES_RecalcMeasures.<init>(ES_RecalcMeasures.java:17)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: ES_RecalcMeasures()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_RecalcMeasures#ES_RecalcMeasures()
	 * @author Parasoft Jtest 8.0
	 */
	public void testES_RecalcMeasures3() throws Throwable {
		// jtest_tested_method
		ES_RecalcMeasures THIS = new ES_RecalcMeasures();
		// NullPointerException thrown
		// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1199)
		// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
		// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
		// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
		// at com.palladium.paf.eval.ES_RecalcMeasures.<init>(ES_RecalcMeasures.java:17)
		// jtest_unverified
	}

	/**
	 * Stubs method for testES_RecalcMeasures3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsES_RecalcMeasures3(
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
				// at com.palladium.paf.eval.ES_RecalcMeasures.<init>(ES_RecalcMeasures.java:17)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
				// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
				// at com.palladium.paf.eval.ES_RecalcMeasures.<init>(ES_RecalcMeasures.java:17)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: ES_RecalcMeasures()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_RecalcMeasures#ES_RecalcMeasures()
	 * @author Parasoft Jtest 8.0
	 */
	public void testES_RecalcMeasures5() throws Throwable {
		// jtest_tested_method
		ES_RecalcMeasures THIS = new ES_RecalcMeasures();
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testES_RecalcMeasures5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsES_RecalcMeasures5(
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
	 * @see ES_RecalcMeasures#performEvaluation(com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.eval.IFormulaEvalEngine)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPerformEvaluation3() throws Throwable {
		ES_RecalcMeasures THIS = new ES_RecalcMeasures();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState((SliceState) null, t2);
		ClientInitRequest t4 = new ClientInitRequest();
		_f0 = new PafClientState((String) null, t4);
		MemberTreeSet t6 = new MemberTreeSet();
		PafSecurityToken t7 = new PafSecurityToken(
			(String) null,
			(String) null,
			false);
		PafApplicationDef t8 = new PafApplicationDef();
		String[] var1 = new String[] { "" };
		UnitOfWork t9 = new UnitOfWork(var1);
		PafPlannerRole t10 = new PafPlannerRole();
		Season t11 = new Season();
		PafPlannerConfig t12 = new PafPlannerConfig();
		t4.setClientType("");
		t4.setClientVersion("");
		t4.setIpAddress("");
		t4.setClientLanguage("0");
		_f0.setUowTrees(t6);
		_f0.setSecurityToken(t7);
		_f0.setApp(t8);
		_f0.setUnitOfWork(t9);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setRuleSets(var2);
		Set var3 = (Set) Stubs.makeStubObject(Set.class);
		_f0.setLockedPeriods(var3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setLockedForwardPlannableInterMap(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setLockedNotPlannableInterMap(var5);
		_f0.setPlannerRole(t10);
		_f0.setPlanSeason(t11);
		_f0.setClientLanguage("");
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setUserSelections(var6);
		Set var7 = (Set) Stubs.makeStubObject(Set.class);
		_f0.setActiveVersions(var7);
		_f0.setPlannerConfig(t12);
		// jtest_tested_method
		THIS.performEvaluation(
			t3,
			(PafDataCache) null,
			(IFormulaEvalEngine) null);
		// NullPointerException thrown
		// at com.palladium.paf.eval.ES_RecalcMeasures.performEvaluation(ES_RecalcMeasures.java:28)
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
				// at com.palladium.paf.eval.ES_RecalcMeasures.performEvaluation(ES_RecalcMeasures.java:28)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientState", argument_types)) {
				return _f0;
				// at com.palladium.paf.eval.ES_RecalcMeasures.performEvaluation(ES_RecalcMeasures.java:28)
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
     * Usage: java com.palladium.paf.eval.ES_RecalcMeasuresTest
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
            ES_RecalcMeasuresTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.eval.ES_RecalcMeasures",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return ES_RecalcMeasures.class;
    }

        /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private PafClientState _f0;
		}

// JTEST_CURRENT_ID=-734020016.