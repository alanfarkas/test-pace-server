/*
 * PafAppServiceTest.java
 * Created by Jtest on 9/19/06 11:34:58 AM.
 * Updated by Jtest on 10/18/06 1:43:46 PM, 2 test cases added, 2 test cases removed.
 * Updated by Jtest on 11/8/06 11:36:46 PM, 17 test cases added, 1 test case removed.
 */

package com.palladium.paf.server;

import com.palladium.paf.funcs.CustomFunctionDef;
import com.palladium.paf.app.VersionDef;
import com.palladium.paf.comm.PafPlannerConfig;
import com.palladium.paf.app.Season;
import com.palladium.paf.app.PafPlannerRole;
import com.palladium.paf.app.UnitOfWork;
import com.palladium.paf.PafSecurityToken;
import com.palladium.paf.data.MemberTreeSet;
import com.palladium.paf.comm.ClientInitRequest;
import com.palladium.paf.state.PafClientState;
import java.util.Set;
import com.palladium.paf.app.CustomActionDef;
import java.util.Map;
import com.palladium.paf.app.PlanCycle;
import com.palladium.paf.comm.CustomMenuDef;
import com.palladium.paf.app.MdbDef;
import com.palladium.paf.app.SeasonList;
import java.sql.Statement;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.Connection;
import com.palladium.paf.state.IPafClientState;
import com.palladium.paf.CustomCommandResult;
import org.hibernate.connection.DriverManagerConnectionProvider;
import java.util.Properties;
import java.sql.DriverManager;
import com.palladium.paf.app.PafApplicationDef;
import jtest.Stubs;
import java.lang.reflect.Member;
import com.palladium.paf.server.PafAppService;

/**
 * PafAppServiceTest is a unit test class for class PafAppService.
 * @see com.palladium.paf.server.PafAppService
 * @author Parasoft Jtest 8.0
 */
public class PafAppServiceTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public PafAppServiceTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }
	/**
	 * Test for method: generateCustomMenuDefsFromCustomMenuDefNames(java.lang.String[],com.palladium.paf.app.PafApplicationDef)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAppService#generateCustomMenuDefsFromCustomMenuDefNames(java.lang.String[],com.palladium.paf.app.PafApplicationDef)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGenerateCustomMenuDefsFromCustomMenuDefNames1()
		throws Throwable {
		PafAppService THIS = PafAppService.getInstance();
		// jtest_tested_method
		CustomMenuDef[] RETVAL = THIS
			.generateCustomMenuDefsFromCustomMenuDefNames(
				(String[]) null,
				(PafApplicationDef) null);
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGenerateCustomMenuDefsFromCustomMenuDefNames1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGenerateCustomMenuDefsFromCustomMenuDefNames1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if ("com.palladium.paf.server.PafMetaData".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "importApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: generateCustomMenuDefsFromCustomMenuDefNames(java.lang.String[],com.palladium.paf.app.PafApplicationDef)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAppService#generateCustomMenuDefsFromCustomMenuDefNames(java.lang.String[],com.palladium.paf.app.PafApplicationDef)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGenerateCustomMenuDefsFromCustomMenuDefNames2()
		throws Throwable {
		PafAppService THIS = PafAppService.getInstance();
		String[] var1 = new String[] {};
		// jtest_tested_method
		CustomMenuDef[] RETVAL = THIS
			.generateCustomMenuDefsFromCustomMenuDefNames(
				var1,
				(PafApplicationDef) null);
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0, RETVAL.length); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGenerateCustomMenuDefsFromCustomMenuDefNames2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGenerateCustomMenuDefsFromCustomMenuDefNames2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if ("com.palladium.paf.server.PafMetaData".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "importApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: generateCustomMenuDefsFromCustomMenuDefNames(java.lang.String[],com.palladium.paf.app.PafApplicationDef)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAppService#generateCustomMenuDefsFromCustomMenuDefNames(java.lang.String[],com.palladium.paf.app.PafApplicationDef)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGenerateCustomMenuDefsFromCustomMenuDefNames3()
		throws Throwable {
		PafAppService THIS = PafAppService.getInstance();
		String[] var1 = new String[] { null };
		// jtest_tested_method
		CustomMenuDef[] RETVAL = THIS
			.generateCustomMenuDefsFromCustomMenuDefNames(
				var1,
				(PafApplicationDef) null);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.server.PafAppService.generateCustomMenuDefsFromCustomMenuDefNames([Ljava/lang/String;Lcom/palladium/paf/app/PafApplicationDef;)[Lcom/palladium/paf/comm/CustomMenuDef;>
		// at com.palladium.paf.server.PafAppService.generateCustomMenuDefsFromCustomMenuDefNames(PafAppService.java:244)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGenerateCustomMenuDefsFromCustomMenuDefNames3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGenerateCustomMenuDefsFromCustomMenuDefNames3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if ("com.palladium.paf.server.PafMetaData".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "importApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: generateCustomMenuDefsFromCustomMenuDefNames(java.lang.String[],com.palladium.paf.app.PafApplicationDef)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAppService#generateCustomMenuDefsFromCustomMenuDefNames(java.lang.String[],com.palladium.paf.app.PafApplicationDef)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGenerateCustomMenuDefsFromCustomMenuDefNames4()
		throws Throwable {
		PafAppService THIS = PafAppService.getInstance();
		PafApplicationDef t1 = new PafApplicationDef();
		_f1 = new CustomMenuDef();
		String[] var1 = new String[] { null };
		// jtest_tested_method
		CustomMenuDef[] RETVAL = THIS
			.generateCustomMenuDefsFromCustomMenuDefNames(var1, t1);
		assertEquals(null, var1[0]); // jtest_unverified
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(1, RETVAL.length); // jtest_unverified
		assertEquals(null, RETVAL[0]); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGenerateCustomMenuDefsFromCustomMenuDefNames4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGenerateCustomMenuDefsFromCustomMenuDefNames4(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if ("com.palladium.paf.server.PafMetaData".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "importApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getCustomMenuDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getCustomMenuDef(java.lang.String)");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.server.PafAppService.generateCustomMenuDefsFromCustomMenuDefNames(PafAppService.java:244)
					case 2 :
						return null;
					// at com.palladium.paf.server.PafAppService.generateCustomMenuDefsFromCustomMenuDefNames(PafAppService.java:245)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: generateCustomMenuDefsFromCustomMenuDefNames(java.lang.String[],com.palladium.paf.app.PafApplicationDef)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAppService#generateCustomMenuDefsFromCustomMenuDefNames(java.lang.String[],com.palladium.paf.app.PafApplicationDef)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGenerateCustomMenuDefsFromCustomMenuDefNames5()
		throws Throwable {
		PafAppService THIS = PafAppService.getInstance();
		PafApplicationDef t1 = new PafApplicationDef();
		_f1 = new CustomMenuDef();
		String[] var1 = new String[] { null, null };
		// jtest_tested_method
		CustomMenuDef[] RETVAL = THIS
			.generateCustomMenuDefsFromCustomMenuDefNames(var1, t1);
		assertEquals(null, var1[0]); // jtest_unverified
		assertEquals(null, var1[1]); // jtest_unverified
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(1, RETVAL.length); // jtest_unverified
		assertEquals(null, RETVAL[0]); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGenerateCustomMenuDefsFromCustomMenuDefNames5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGenerateCustomMenuDefsFromCustomMenuDefNames5(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if ("com.palladium.paf.server.PafMetaData".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "importApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getCustomMenuDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getCustomMenuDef(java.lang.String)");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.server.PafAppService.generateCustomMenuDefsFromCustomMenuDefNames(PafAppService.java:244)
					case 2 :
					case 3 :
						return null;
					// at com.palladium.paf.server.PafAppService.generateCustomMenuDefsFromCustomMenuDefNames(PafAppService.java:245)
					// 
					// at com.palladium.paf.server.PafAppService.generateCustomMenuDefsFromCustomMenuDefNames(PafAppService.java:244)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getApplication(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAppService#getApplication(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetApplication1() throws Throwable {
		PafAppService THIS = PafAppService.getInstance();
		// jtest_tested_method
		PafApplicationDef RETVAL = THIS.getApplication((String) null);
		// IllegalArgumentException thrown
		// at com.palladium.paf.server.PafAppService.getApplication(PafAppService.java:88)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetApplication1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetApplication1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if ("com.palladium.paf.server.PafMetaData".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "importApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// 
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.getApplication(PafAppService.java:82)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getApplications()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAppService#getApplications()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetApplications1() throws Throwable {
		_f0 = new PafApplicationDef();
		SeasonList t1 = new SeasonList();
		MdbDef t2 = new MdbDef();
		_f4 = new PafApplicationDef();
		_f5 = new PafApplicationDef();
		SeasonList t5 = new SeasonList();
		MdbDef t6 = new MdbDef();
		_f6 = new PafApplicationDef();
		_f7 = new PafApplicationDef();
		_f8 = new PafApplicationDef();
		SeasonList t10 = new SeasonList();
		MdbDef t11 = new MdbDef();
		_f9 = new PafApplicationDef();
		SeasonList t13 = new SeasonList();
		MdbDef t14 = new MdbDef();
		_f10 = new PafApplicationDef();
		_f11 = new PafApplicationDef();
		_f12 = new PafApplicationDef();
		SeasonList t18 = new SeasonList();
		MdbDef t19 = new MdbDef();
		PafAppService THIS = PafAppService.getInstance();
		_f0.setSeasonList(t1);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		_f0.setMdbDef(t2);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var3);
		_f5.setSeasonList(t5);
		_f5.setAppId("");
		PlanCycle[] var4 = new PlanCycle[] {};
		_f5.setPlanCycles(var4);
		_f5.setLastPeriod("");
		_f5.setCurrentYear("");
		t6.setYearDim("");
		String[] var5 = new String[] {};
		t6.setHierDims(var5);
		t6.setMeasureDim("");
		t6.setPlanTypeDim("");
		t6.setTimeDim("");
		t6.setVersionDim("");
		t6.setDataSourceId("");
		String[] var6 = new String[] {};
		t6.setAxisPriority(var6);
		_f5.setMdbDef(t6);
		Map var7 = (Map) Stubs.makeStubObject(Map.class);
		_f5.setMeasures(var7);
		Map var8 = (Map) Stubs.makeStubObject(Map.class);
		_f5.setVersions(var8);
		_f8.setSeasonList(t10);
		_f8.setAppId("");
		PlanCycle[] var9 = new PlanCycle[] {};
		_f8.setPlanCycles(var9);
		_f8.setLastPeriod("");
		_f8.setCurrentYear("");
		_f8.setMdbDef(t11);
		Map var10 = (Map) Stubs.makeStubObject(Map.class);
		_f8.setMeasures(var10);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		_f8.setVersions(var11);
		_f9.setSeasonList(t13);
		_f9.setAppId("");
		PlanCycle[] var12 = new PlanCycle[] {};
		_f9.setPlanCycles(var12);
		_f9.setLastPeriod("");
		_f9.setCurrentYear("");
		t14.setYearDim("");
		String[] var13 = new String[] {};
		t14.setHierDims(var13);
		t14.setMeasureDim("");
		t14.setPlanTypeDim("");
		t14.setTimeDim("");
		t14.setVersionDim("");
		t14.setDataSourceId("");
		String[] var14 = new String[] {};
		t14.setAxisPriority(var14);
		_f9.setMdbDef(t14);
		Map var15 = (Map) Stubs.makeStubObject(Map.class);
		_f9.setMeasures(var15);
		Map var16 = (Map) Stubs.makeStubObject(Map.class);
		_f9.setVersions(var16);
		_f12.setSeasonList(t18);
		_f12.setAppId("");
		PlanCycle[] var17 = new PlanCycle[] {};
		_f12.setPlanCycles(var17);
		_f12.setLastPeriod("");
		_f12.setCurrentYear("");
		t19.setYearDim("");
		String[] var18 = new String[] {};
		t19.setHierDims(var18);
		t19.setMeasureDim("");
		t19.setPlanTypeDim("");
		t19.setTimeDim("");
		t19.setVersionDim("");
		t19.setDataSourceId("");
		String[] var19 = new String[] {};
		t19.setAxisPriority(var19);
		_f12.setMdbDef(t19);
		Map var20 = (Map) Stubs.makeStubObject(Map.class);
		_f12.setMeasures(var20);
		Map var21 = (Map) Stubs.makeStubObject(Map.class);
		_f12.setVersions(var21);
		// jtest_tested_method
		PafApplicationDef[] RETVAL = THIS.getApplications();
		// ClassCastException thrown
		// at java.lang.Class.cast(Class.java:2920)
		// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
		// at com.palladium.paf.server.PafMetaData.importMeasures(PafMetaData.java:372)
		// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:65)
		// at com.palladium.paf.server.PafAppService.getApplications(PafAppService.java:76)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetApplications1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetApplications1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				return Stubs.makeStubObject(DatabaseMetaData.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:74)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
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
			}
		}
		if (Stubs.matches(method, DatabaseMetaData.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDatabaseProductName", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:75)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
			argument_types = new Class[0];
			if (Stubs.matches(
				method,
				"getDatabaseProductVersion",
				argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:77)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverName", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverVersion", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "supportsResultSetType", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:80)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "supportsBatchUpdates", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:81)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
		}
		if ("com.palladium.paf.server.PafMetaData".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "importApplications", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.server.PafMetaData.importApplications()");
				switch (index) {
					case 1 :
					case 2 :
						return new PafApplicationDef[] { _f0, _f4, _f5, _f6,
								_f7, _f8, _f9, _f10, _f11, _f12 };
					// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
					// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
					// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
					case 3 :
					case 4 :
						return new PafApplicationDef[0];
					// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
					// at com.palladium.paf.server.PafAppService.getApplications(PafAppService.java:76)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "importVersions", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.server.PafMetaData.importVersions()");
				switch (index) {
					case 1 :
						return null;
					// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:66)
					// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
					// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
					case 2 :
					case 3 :
					case 4 :
					case 5 :
					case 6 :
					case 7 :
					case 8 :
					case 9 :
					case 10 :
					case 11 :
					case 12 :
					case 13 :
					case 14 :
					case 15 :
					case 16 :
					case 17 :
					case 18 :
					case 19 :
						return new VersionDef[0];
					// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:66)
					// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
					// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[] { VersionDef[].class };
			if (Stubs.matches(method, "initVersions", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:66)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
			argument_types = new Class[] { CustomFunctionDef[].class };
			if (Stubs.matches(method, "initFunctionFactory", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:67)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
			argument_types = new Class[] { CustomMenuDef[].class };
			if (Stubs.matches(method, "initCustomMenus", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:68)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static getInstance()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAppService#getInstance()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetInstance3() throws Throwable {
		// jtest_tested_method
		PafAppService RETVAL = PafAppService.getInstance();
		assertNotNull(RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetInstance3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetInstance3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafMetaData.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "importApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}
	/**
	 * Test for method: getLockedList(com.palladium.paf.state.PafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAppService#getLockedList(com.palladium.paf.state.PafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLockedList1() throws Throwable {
		PafAppService THIS = PafAppService.getInstance();
		// jtest_tested_method
		Set RETVAL = THIS.getLockedList((PafClientState) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.server.PafAppService.getLockedList(Lcom/palladium/paf/state/PafClientState;)Ljava/util/Set;>
		// at com.palladium.paf.server.PafAppService.getLockedList(PafAppService.java:96)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetLockedList1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetLockedList1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if ("com.palladium.paf.server.PafMetaData".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "importApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getLockedList(com.palladium.paf.state.PafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAppService#getLockedList(com.palladium.paf.state.PafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLockedList2() throws Throwable {
		PafAppService THIS = PafAppService.getInstance();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		// jtest_tested_method
		Set RETVAL = THIS.getLockedList(t2);
		// NullPointerException thrown
		// at com.palladium.paf.server.PafAppService.getLockedList(PafAppService.java:104)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetLockedList2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetLockedList2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if ("com.palladium.paf.server.PafMetaData".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "importApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getLockedList(com.palladium.paf.state.PafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAppService#getLockedList(com.palladium.paf.state.PafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLockedList3() throws Throwable {
		PafAppService THIS = PafAppService.getInstance();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		MemberTreeSet t3 = new MemberTreeSet();
		PafSecurityToken t4 = new PafSecurityToken(
			(String) null,
			(String) null,
			false);
		PafApplicationDef t5 = new PafApplicationDef();
		String[] var1 = new String[] {};
		String[][] var2 = new String[][] { {} };
		UnitOfWork t6 = new UnitOfWork(var1, var2);
		PafPlannerRole t7 = new PafPlannerRole();
		Season t8 = new Season();
		PafPlannerConfig t9 = new PafPlannerConfig();
		t1.setClientType("");
		t1.setClientVersion("");
		t1.setIpAddress("");
		t1.setClientLanguage("");
		t2.setUowTrees(t3);
		t2.setSecurityToken(t4);
		t2.setApp(t5);
		t2.setUnitOfWork(t6);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		t2.setRuleSets(var3);
		Set var4 = (Set) Stubs.makeStubObject(Set.class);
		t2.setLockedPeriods(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		t2.setLockedForwardPlannableInterMap(var5);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		t2.setLockedNotPlannableInterMap(var6);
		t2.setPlannerRole(t7);
		t2.setPlanSeason(t8);
		t2.setClientLanguage("");
		Map var7 = (Map) Stubs.makeStubObject(Map.class);
		t2.setUserSelections(var7);
		Set var8 = (Set) Stubs.makeStubObject(Set.class);
		t2.setActiveVersions(var8);
		t2.setPlannerConfig(t9);
		// jtest_tested_method
		Set RETVAL = THIS.getLockedList(t2);
		assertEquals(var4, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetLockedList3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetLockedList3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if ("com.palladium.paf.server.PafMetaData".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "importApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: runCustomCommand(java.lang.String,java.lang.String[],java.lang.String[],com.palladium.paf.state.IPafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAppService#runCustomCommand(java.lang.String,java.lang.String[],java.lang.String[],com.palladium.paf.state.IPafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRunCustomCommand1() throws Throwable {
		PafAppService THIS = PafAppService.getInstance();
		// jtest_tested_method
		CustomCommandResult[] RETVAL = THIS.runCustomCommand(
			(String) null,
			(String[]) null,
			(String[]) null,
			(IPafClientState) null);
		// NullPointerException thrown, originator is arg 4 to <Method com.palladium.paf.server.PafAppService.runCustomCommand(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Lcom/palladium/paf/state/IPafClientState;)[Lcom/palladium/paf/CustomCommandResult;>
		// at com.palladium.paf.server.PafAppService.runCustomCommand(PafAppService.java:179)
		// jtest_unverified
	}

	/**
	 * Stubs method for testRunCustomCommand1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRunCustomCommand1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				return Stubs.makeStubObject(DatabaseMetaData.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:74)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
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
			}
		}
		if (Stubs.matches(method, DatabaseMetaData.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDatabaseProductName", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:75)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
			argument_types = new Class[0];
			if (Stubs.matches(
				method,
				"getDatabaseProductVersion",
				argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:77)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverName", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverVersion", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "supportsResultSetType", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:80)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "supportsBatchUpdates", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:81)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
		}
		if ("com.palladium.paf.server.PafMetaData".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "importApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: runCustomCommand(java.lang.String,java.lang.String[],java.lang.String[],com.palladium.paf.state.IPafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAppService#runCustomCommand(java.lang.String,java.lang.String[],java.lang.String[],com.palladium.paf.state.IPafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRunCustomCommand3() throws Throwable {
		PafAppService THIS = PafAppService.getInstance();
		_f0 = new PafApplicationDef();
		IPafClientState var1 = (IPafClientState) Stubs
			.makeStubObject(IPafClientState.class);
		// jtest_tested_method
		CustomCommandResult[] RETVAL = THIS.runCustomCommand(
			(String) null,
			(String[]) null,
			(String[]) null,
			var1);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.app.PafApplicationDef.getCustomMenuDef(PafApplicationDef.java:210)
		// at com.palladium.paf.server.PafAppService.runCustomCommand(PafAppService.java:179)
		// jtest_unverified
	}

	/**
	 * Stubs method for testRunCustomCommand3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRunCustomCommand3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if ("com.palladium.paf.server.PafMetaData".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "importApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
		}
		if (Stubs.matches(method, IPafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.PafAppService.runCustomCommand(PafAppService.java:179)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: runCustomCommand(java.lang.String,java.lang.String[],java.lang.String[],com.palladium.paf.state.IPafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAppService#runCustomCommand(java.lang.String,java.lang.String[],java.lang.String[],com.palladium.paf.state.IPafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRunCustomCommand9() throws Throwable {
		PafAppService THIS = PafAppService.getInstance();
		_f0 = new PafApplicationDef();
		_f1 = new CustomMenuDef();
		Integer t3 = new Integer(0);
		_f1.setBeginGroup(false);
		_f1.setCaption("");
		_f1.setEnableButton(false);
		_f1.setFaceID(t3);
		_f1.setKey("");
		String[] var1 = new String[] {};
		_f1.setUserPrompts(var1);
		_f1.setConfirmationMessage("");
		_f1.setTerminationMessage("");
		String[] var2 = new String[] {};
		_f1.setViewFilter(var2);
		CustomActionDef[] var3 = new CustomActionDef[] { null };
		_f1.setCustomActionDefs(var3);
		IPafClientState var4 = (IPafClientState) Stubs
			.makeStubObject(IPafClientState.class);
		// jtest_tested_method
		CustomCommandResult[] RETVAL = THIS.runCustomCommand(
			(String) null,
			(String[]) null,
			(String[]) null,
			var4);
		// NullPointerException thrown
		// at com.palladium.paf.server.PafAppService.runCustomCommand(PafAppService.java:185)
		// jtest_unverified
	}

	/**
	 * Stubs method for testRunCustomCommand9.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRunCustomCommand9(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if ("com.palladium.paf.server.PafMetaData".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "importApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
		}
		if (Stubs.matches(method, IPafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.PafAppService.runCustomCommand(PafAppService.java:179)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getCustomMenuDef", argument_types)) {
				return _f1;
				// at com.palladium.paf.server.PafAppService.runCustomCommand(PafAppService.java:179)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: runCustomCommand(java.lang.String,java.lang.String[],java.lang.String[],com.palladium.paf.state.IPafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAppService#runCustomCommand(java.lang.String,java.lang.String[],java.lang.String[],com.palladium.paf.state.IPafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRunCustomCommand10() throws Throwable {
		PafAppService THIS = PafAppService.getInstance();
		_f0 = new PafApplicationDef();
		_f1 = new CustomMenuDef();
		Integer t3 = new Integer("0");
		_f2 = new CustomActionDef();
		_f1.setBeginGroup(false);
		_f1.setCaption("");
		_f1.setEnableButton(false);
		_f1.setFaceID(t3);
		_f1.setKey("");
		String[] var1 = new String[] {};
		_f1.setUserPrompts(var1);
		_f1.setConfirmationMessage("");
		_f1.setTerminationMessage("");
		String[] var2 = new String[] {};
		_f1.setViewFilter(var2);
		CustomActionDef[] var3 = new CustomActionDef[] {};
		_f1.setCustomActionDefs(var3);
		IPafClientState var4 = (IPafClientState) Stubs
			.makeStubObject(IPafClientState.class);
		// jtest_tested_method
		CustomCommandResult[] RETVAL = THIS.runCustomCommand(
			(String) null,
			(String[]) null,
			(String[]) null,
			var4);
		// NullPointerException thrown
		// at com.palladium.paf.server.PafAppService.runCustomCommand(PafAppService.java:194)
		// jtest_unverified
	}

	/**
	 * Stubs method for testRunCustomCommand10.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRunCustomCommand10(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if ("com.palladium.paf.server.PafMetaData".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "importApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
		}
		if (Stubs.matches(method, IPafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.PafAppService.runCustomCommand(PafAppService.java:179)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getCustomMenuDef", argument_types)) {
				return _f1;
				// at com.palladium.paf.server.PafAppService.runCustomCommand(PafAppService.java:179)
			}
		}
		if (Stubs.matches(method, CustomMenuDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCustomActionDefs", argument_types)) {
				return new CustomActionDef[] { _f2 };
				// at com.palladium.paf.server.PafAppService.runCustomCommand(PafAppService.java:179)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: runCustomCommand(java.lang.String,java.lang.String[],java.lang.String[],com.palladium.paf.state.IPafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAppService#runCustomCommand(java.lang.String,java.lang.String[],java.lang.String[],com.palladium.paf.state.IPafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRunCustomCommand12() throws Throwable {
		PafAppService THIS = PafAppService.getInstance();
		_f0 = new PafApplicationDef();
		_f1 = new CustomMenuDef();
		Integer t3 = new Integer("0");
		_f2 = new CustomActionDef();
		_f1.setBeginGroup(false);
		_f1.setCaption("");
		_f1.setEnableButton(false);
		_f1.setFaceID(t3);
		_f1.setKey("");
		String[] var1 = new String[] {};
		_f1.setUserPrompts(var1);
		_f1.setConfirmationMessage("");
		_f1.setTerminationMessage("");
		String[] var2 = new String[] {};
		_f1.setViewFilter(var2);
		CustomActionDef[] var3 = new CustomActionDef[] {};
		_f1.setCustomActionDefs(var3);
		_f2.setActionClassName("");
		String[] var4 = new String[] {};
		_f2.setActionNamedParameters(var4);
		IPafClientState var5 = (IPafClientState) Stubs
			.makeStubObject(IPafClientState.class);
		// jtest_tested_method
		CustomCommandResult[] RETVAL = THIS.runCustomCommand(
			(String) null,
			(String[]) null,
			(String[]) null,
			var5);
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0, RETVAL.length); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testRunCustomCommand12.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRunCustomCommand12(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if ("com.palladium.paf.server.PafMetaData".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "importApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
		}
		if (Stubs.matches(method, IPafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.PafAppService.runCustomCommand(PafAppService.java:179)
			}
			argument_types = new Class[] { Properties.class };
			if (Stubs.matches(method, "generateTokenCatalog", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafAppService.runCustomCommand(PafAppService.java:207)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getCustomMenuDef", argument_types)) {
				return _f1;
				// at com.palladium.paf.server.PafAppService.runCustomCommand(PafAppService.java:179)
			}
		}
		if (Stubs.matches(method, CustomMenuDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCustomActionDefs", argument_types)) {
				return new CustomActionDef[] { _f2 };
				// at com.palladium.paf.server.PafAppService.runCustomCommand(PafAppService.java:179)
			}
		}
		if (Stubs.matches(method, Class.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "forName", argument_types)) {
				throw new ClassNotFoundException();
				// at com.palladium.paf.server.PafAppService.runCustomCommand(PafAppService.java:182)
			}
		}
		if (Stubs.matches(method, CustomActionDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(
				method,
				"getActionNamedParameters",
				argument_types)) {
				return new String[0];
				// at com.palladium.paf.server.PafAppService.runCustomCommand(PafAppService.java:194)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: runCustomCommand(java.lang.String,java.lang.String[],java.lang.String[],com.palladium.paf.state.IPafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAppService#runCustomCommand(java.lang.String,java.lang.String[],java.lang.String[],com.palladium.paf.state.IPafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRunCustomCommand13() throws Throwable {
		PafAppService THIS = PafAppService.getInstance();
		_f0 = new PafApplicationDef();
		_f1 = new CustomMenuDef();
		Integer t3 = new Integer("0");
		CustomActionDef t4 = new CustomActionDef();
		_f1.setBeginGroup(false);
		_f1.setCaption("");
		_f1.setEnableButton(false);
		_f1.setFaceID(t3);
		_f1.setKey("");
		String[] var1 = new String[] {};
		_f1.setUserPrompts(var1);
		_f1.setConfirmationMessage("");
		_f1.setTerminationMessage("");
		String[] var2 = new String[] {};
		_f1.setViewFilter(var2);
		CustomActionDef[] var3 = new CustomActionDef[] { t4 };
		_f1.setCustomActionDefs(var3);
		t4.setActionClassName("");
		String[] var4 = new String[] { null };
		t4.setActionNamedParameters(var4);
		IPafClientState var5 = (IPafClientState) Stubs
			.makeStubObject(IPafClientState.class);
		// jtest_tested_method
		CustomCommandResult[] RETVAL = THIS.runCustomCommand(
			(String) null,
			(String[]) null,
			(String[]) null,
			var5);
		// NullPointerException thrown
		// at com.palladium.paf.server.PafAppService.runCustomCommand(PafAppService.java:195)
		// jtest_unverified
	}

	/**
	 * Stubs method for testRunCustomCommand13.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRunCustomCommand13(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if ("com.palladium.paf.server.PafMetaData".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "importApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
		}
		if (Stubs.matches(method, IPafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.PafAppService.runCustomCommand(PafAppService.java:179)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getCustomMenuDef", argument_types)) {
				return _f1;
				// at com.palladium.paf.server.PafAppService.runCustomCommand(PafAppService.java:179)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: runCustomCommand(java.lang.String,java.lang.String[],java.lang.String[],com.palladium.paf.state.IPafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafAppService#runCustomCommand(java.lang.String,java.lang.String[],java.lang.String[],com.palladium.paf.state.IPafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRunCustomCommand14() throws Throwable {
		PafAppService THIS = PafAppService.getInstance();
		_f0 = new PafApplicationDef();
		_f1 = new CustomMenuDef();
		Integer t3 = new Integer("0");
		_f2 = new CustomActionDef();
		_f1.setBeginGroup(false);
		_f1.setCaption("");
		_f1.setEnableButton(false);
		_f1.setFaceID(t3);
		_f1.setKey("");
		String[] var1 = new String[] {};
		_f1.setUserPrompts(var1);
		_f1.setConfirmationMessage("");
		_f1.setTerminationMessage("");
		String[] var2 = new String[] {};
		_f1.setViewFilter(var2);
		CustomActionDef[] var3 = new CustomActionDef[] {};
		_f1.setCustomActionDefs(var3);
		_f2.setActionClassName("");
		String[] var4 = new String[] {};
		_f2.setActionNamedParameters(var4);
		IPafClientState var5 = (IPafClientState) Stubs
			.makeStubObject(IPafClientState.class);
		// jtest_tested_method
		CustomCommandResult[] RETVAL = THIS.runCustomCommand(
			(String) null,
			(String[]) null,
			(String[]) null,
			var5);
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.server.PafAppService.runCustomCommand(PafAppService.java:196)
		// jtest_unverified
	}

	/**
	 * Stubs method for testRunCustomCommand14.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRunCustomCommand14(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if ("com.palladium.paf.server.PafMetaData".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "importApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
			}
		}
		if (Stubs.matches(method, IPafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.PafAppService.runCustomCommand(PafAppService.java:179)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getCustomMenuDef", argument_types)) {
				return _f1;
				// at com.palladium.paf.server.PafAppService.runCustomCommand(PafAppService.java:179)
			}
		}
		if (Stubs.matches(method, CustomMenuDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCustomActionDefs", argument_types)) {
				return new CustomActionDef[] { _f2 };
				// at com.palladium.paf.server.PafAppService.runCustomCommand(PafAppService.java:179)
			}
		}
		if (Stubs.matches(method, Class.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "forName", argument_types)) {
				return java.lang.Object.class;
				// at com.palladium.paf.server.PafAppService.runCustomCommand(PafAppService.java:182)
			}
		}
		if (Stubs.matches(method, CustomActionDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(
				method,
				"getActionNamedParameters",
				argument_types)) {
				return new String[] { "" };
				// at com.palladium.paf.server.PafAppService.runCustomCommand(PafAppService.java:194)
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
     * Usage: java com.palladium.paf.server.PafAppServiceTest
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
            PafAppServiceTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.server.PafAppService",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return PafAppService.class;
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
private CustomMenuDef _f1;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private CustomActionDef _f2;
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
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafApplicationDef _f6;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafApplicationDef _f7;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafApplicationDef _f8;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafApplicationDef _f9;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafApplicationDef _f10;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafApplicationDef _f11;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafApplicationDef _f12;
}

// JTEST_CURRENT_ID=-1743032488.