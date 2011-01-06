/*
 * PafSecurityServiceTest.java
 * Created by Jtest on 9/19/06 3:13:13 PM.
 * Updated by Jtest on 10/18/06 4:03:58 PM, 3 test cases added, 3 test cases removed.
 * Updated by Jtest on 11/8/06 8:53:34 PM, 3 test cases added, 3 test cases removed.
 */

package com.palladium.paf.server;

import com.palladium.paf.app.PlanCycle;
import com.palladium.paf.app.MdbDef;
import com.palladium.paf.app.SeasonList;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.DriverManager;
import com.palladium.paf.app.PafDimSpec;
import com.palladium.paf.data.PafMemberList;
import com.palladium.paf.data.PafSimpleUow;
import java.util.Set;
import java.util.Map;
import com.palladium.paf.comm.PafPlannerConfig;
import com.palladium.paf.app.Season;
import com.palladium.paf.app.PafPlannerRole;
import com.palladium.paf.app.PafApplicationDef;
import com.palladium.paf.PafSecurityToken;
import com.palladium.paf.data.MemberTreeSet;
import com.palladium.paf.comm.ClientInitRequest;
import org.hibernate.connection.DriverManagerConnectionProvider;
import java.sql.Connection;
import jtest.Stubs;
import java.lang.reflect.Member;
import com.palladium.paf.state.PafClientState;
import com.palladium.paf.server.comm.PafPlanSessionRequest;
import com.palladium.paf.app.UnitOfWork;
import com.palladium.paf.server.PafSecurityService;

/**
 * PafSecurityServiceTest is a unit test class for class PafSecurityService.
 * @see com.palladium.paf.server.PafSecurityService
 * @author Parasoft Jtest 8.0
 */
public class PafSecurityServiceTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public PafSecurityServiceTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }	/**
	 * Test for method: static authorize(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSecurityService#authorize(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAuthorize1() throws Throwable {
		// jtest_tested_method
		PafSecurityService.authorize((String) null, (String) null);
		// ExceptionInInitializerError thrown
		// Caused by: java.lang.NullPointerException
		// at com.palladium.paf.server.PafSecurityService.getPlannerRoles(PafSecurityService.java:181)
		// at com.palladium.paf.server.PafSecurityService.<clinit>(PafSecurityService.java:46)
		// jtest_unverified
	}

	/**
	 * Stubs method for testAuthorize1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAuthorize1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				throw new SQLException();
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafSecurityService.getPlannerRoles(PafSecurityService.java:178)
				// at com.palladium.paf.server.PafSecurityService.<clinit>(PafSecurityService.java:46)
				// 
				// at com.palladium.paf.server.PafSecurityService.authorize(PafSecurityService.java:71)
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
				// at com.palladium.paf.server.PafSecurityService.getPlannerRoles(PafSecurityService.java:178)
				// at com.palladium.paf.server.PafSecurityService.<clinit>(PafSecurityService.java:46)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static authorize(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSecurityService#authorize(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAuthorize2() throws Throwable {
		// jtest_tested_method
		PafSecurityService.authorize((String) null, (String) null);
		// NoClassDefFoundError thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testAuthorize2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAuthorize2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafSecurityService.authorize(PafSecurityService.java:71)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				throw new SQLException();
				// at com.palladium.paf.server.PafSecurityService.authorize(PafSecurityService.java:74)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				throw new SQLException();
				// at com.palladium.paf.server.PafSecurityService.authorize(PafSecurityService.java:135)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static getWorkSpec(com.palladium.paf.server.comm.PafPlanSessionRequest,com.palladium.paf.state.PafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafSecurityService#getWorkSpec(com.palladium.paf.server.comm.PafPlanSessionRequest,com.palladium.paf.state.PafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetWorkSpec6() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		MemberTreeSet t2 = new MemberTreeSet();
		PafSecurityToken t3 = new PafSecurityToken(
			(String) null,
			(String) null,
			false);
		PafApplicationDef t4 = new PafApplicationDef();
		PafSimpleUow t5 = new PafSimpleUow();
		UnitOfWork t6 = new UnitOfWork(t5);
		PafPlannerRole t7 = new PafPlannerRole();
		Season t8 = new Season();
		PafPlannerConfig t9 = new PafPlannerConfig();
		_f9 = new PafApplicationDef();
		SeasonList t11 = new SeasonList();
		MdbDef t12 = new MdbDef();
		t0.setClientType("");
		t0.setClientVersion("");
		t0.setIpAddress("");
		t0.setClientLanguage("");
		t1.setUowTrees(t2);
		t1.setSecurityToken(t3);
		t1.setApp(t4);
		PafMemberList[] var1 = new PafMemberList[] {};
		t5.setPafMemberEntries(var1);
		t1.setUnitOfWork(t6);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		t1.setRuleSets(var2);
		Set var3 = (Set) Stubs.makeStubObject(Set.class);
		t1.setLockedPeriods(var3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		t1.setLockedForwardPlannableInterMap(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		t1.setLockedNotPlannableInterMap(var5);
		t7.setRoleDesc("");
		t7.setRoleName("");
		t7.setPlanType("");
		t7.setPlanVersion("");
		String[] var6 = new String[] {};
		t7.setSeasonIds(var6);
		t1.setPlannerRole(t7);
		t8.setOpen(false);
		PafDimSpec[] var7 = new PafDimSpec[] {};
		t8.setOtherDims(var7);
		t8.setYear("");
		t8.setId("");
		t8.setTimePeriod("");
		t8.setPlanCycle("");
		t1.setPlanSeason(t8);
		t1.setClientLanguage("");
		Map var8 = (Map) Stubs.makeStubObject(Map.class);
		t1.setUserSelections(var8);
		Set var9 = (Set) Stubs.makeStubObject(Set.class);
		t1.setActiveVersions(var9);
		t9.setCycle("");
		String[] var10 = new String[] {};
		t9.setMenuItemNames(var10);
		t9.setRole("");
		String[] var11 = new String[] {};
		t9.setViewTreeItemNames(var11);
		t9.setDefaultEvalEnabled(false);
		t9.setDefaultRulesetName("");
		String[] var12 = new String[] {};
		t9.setRuleSetNames(var12);
		String[] var13 = new String[] {};
		t9.setVersionFilter(var13);
		t1.setPlannerConfig(t9);
		_f9.setSeasonList(t11);
		_f9.setAppId("");
		PlanCycle[] var14 = new PlanCycle[] {};
		_f9.setPlanCycles(var14);
		_f9.setLastPeriod("");
		_f9.setCurrentYear("");
		_f9.setMdbDef(t12);
		Map var15 = (Map) Stubs.makeStubObject(Map.class);
		_f9.setMeasures(var15);
		Map var16 = (Map) Stubs.makeStubObject(Map.class);
		_f9.setVersions(var16);
		// jtest_tested_method
		UnitOfWork RETVAL = PafSecurityService.getWorkSpec(
			(PafPlanSessionRequest) null,
			t1);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.app.MdbDef.getDimCount(MdbDef.java:118)
		// at com.palladium.paf.app.MdbDef.getAllDims(MdbDef.java:137)
		// at com.palladium.paf.server.PafSecurityService.getWorkSpec(PafSecurityService.java:238)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetWorkSpec6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetWorkSpec6(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if ("com.palladium.paf.server.PafMetaData".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "importRoles", argument_types)) {
				return new PafPlannerRole[0];
				// at com.palladium.paf.server.PafSecurityService.getPlannerRoles(PafSecurityService.java:180)
				// at com.palladium.paf.server.PafSecurityService.<clinit>(PafSecurityService.java:46)
			}
		}
		if (Stubs.matches(method, PafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f9;
				// at com.palladium.paf.server.PafSecurityService.getWorkSpec(PafSecurityService.java:236)
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
     * Usage: java com.palladium.paf.server.PafSecurityServiceTest
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
            PafSecurityServiceTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.server.PafSecurityService",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return PafSecurityService.class;
    }

                        											/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafApplicationDef _f9;
																														}

// JTEST_CURRENT_ID=-739089711.