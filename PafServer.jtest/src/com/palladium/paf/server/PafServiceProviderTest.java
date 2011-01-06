/*
 * PafServiceProviderTest.java
 * Created by Jtest on 9/19/06 10:56:38 AM.
 * Updated by Jtest on 10/18/06 3:20:43 PM, 29 test cases added, 1 test case removed.
 * Updated by Jtest on 11/9/06 2:03:28 AM, 21 test cases removed.
 */

package com.palladium.paf.server;

import java.sql.SQLException;
import com.palladium.paf.server.comm.PafServerAck;
import com.palladium.paf.mdb.PafSimpleTree;
import com.palladium.paf.app.PlanCycle;
import com.palladium.paf.app.MdbDef;
import com.palladium.paf.app.SeasonList;
import org.hibernate.connection.DriverManagerConnectionProvider;
import com.palladium.paf.view.PafView;
import com.palladium.paf.server.comm.PafViewRequest;
import com.palladium.paf.data.PafDataSlice;
import com.palladium.paf.state.IPafClientState;
import com.palladium.paf.server.comm.PafCustomCommandRequest;
import com.palladium.paf.server.comm.PafCustomCommandResponse;
import java.util.Properties;
import java.sql.DriverManager;
import com.palladium.paf.mdb.PafMemberTree;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import com.palladium.paf.comm.PafRequest;
import java.util.Map;
import com.palladium.paf.app.UnitOfWork;
import com.palladium.paf.app.PafApplicationDef;
import com.palladium.paf.state.PafClientState;
import com.palladium.paf.comm.ClientInitRequest;
import jtest.Stubs;
import java.lang.reflect.Member;
import org.hibernate.cfg.Configuration;
import com.palladium.paf.server.PafServiceProvider;

/**
 * PafServiceProviderTest is a unit test class for class PafServiceProvider.
 * @see com.palladium.paf.server.PafServiceProvider
 * @author Parasoft Jtest 8.0
 */
public class PafServiceProviderTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public PafServiceProviderTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }
	/**
	 * Test for method: clientInit(com.palladium.paf.comm.ClientInitRequest)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafServiceProvider#clientInit(com.palladium.paf.comm.ClientInitRequest)
	 * @author Parasoft Jtest 8.0
	 */
	public void testClientInit2() throws Throwable {
		PafServiceProvider THIS = new PafServiceProvider();
		ClientInitRequest t1 = new ClientInitRequest();
		// jtest_tested_method
		PafServerAck RETVAL = THIS.clientInit(t1);
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("0.06216154813714814", RETVAL.getClientId()); // jtest_unverified
		assertEquals("x86 : Windows XP : 5.1 : 1.5.0_03", RETVAL.getPlatform()); // jtest_unverified
		assertEquals("1.2.0 - GA", RETVAL.getServerVersion()); // jtest_unverified
		assertEquals("1.2.0 - GA", THIS.getVersion()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getRunningApplicationName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafServiceProvider#getRunningApplicationName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRunningApplicationName5() throws Throwable {
		PafServiceProvider THIS = new PafServiceProvider();
		_f30 = new PafApplicationDef();
		// jtest_tested_method
		String RETVAL = THIS.getRunningApplicationName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetRunningApplicationName5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetRunningApplicationName5(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if ("com.palladium.paf.server.PafMetaData".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "importApplications", argument_types)) {
				return new PafApplicationDef[] { _f30 };
				// at com.palladium.paf.server.PafServiceProvider.getRunningApplicationName(PafServiceProvider.java:1250)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getRunningApplicationName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafServiceProvider#getRunningApplicationName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRunningApplicationName6() throws Throwable {
		PafServiceProvider THIS = new PafServiceProvider();
		_f30 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f30.setSeasonList(t2);
		_f30.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f30.setPlanCycles(var1);
		_f30.setLastPeriod("");
		_f30.setCurrentYear("");
		t3.setYearDim("");
		String[] var2 = new String[] {};
		t3.setHierDims(var2);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var3 = new String[] {};
		t3.setAxisPriority(var3);
		_f30.setMdbDef(t3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f30.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f30.setVersions(var5);
		// jtest_tested_method
		String RETVAL = THIS.getRunningApplicationName();
		assertEquals("", RETVAL); // jtest_unverified
		assertEquals(5, t3.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetRunningApplicationName6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetRunningApplicationName6(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if ("com.palladium.paf.server.PafMetaData".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "importApplications", argument_types)) {
				return new PafApplicationDef[] { _f30 };
				// at com.palladium.paf.server.PafServiceProvider.getRunningApplicationName(PafServiceProvider.java:1250)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getVersion()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafServiceProvider#getVersion()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetVersion1() throws Throwable {
		PafServiceProvider THIS = new PafServiceProvider();
		// jtest_tested_method
		String RETVAL = THIS.getVersion();
		assertEquals("1.2.0 - GA", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafServiceProvider()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafServiceProvider#PafServiceProvider()
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafServiceProvider1() throws Throwable {
		// jtest_tested_method
		PafServiceProvider THIS = new PafServiceProvider();
		assertEquals("1.2.0 - GA", THIS.getVersion()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafServiceProvider1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafServiceProvider1(
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
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:70)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// at com.palladium.paf.server.PafServiceProvider.<init>(PafServiceProvider.java:147)
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
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:70)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// at com.palladium.paf.server.PafServiceProvider.<init>(PafServiceProvider.java:147)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: reloadDatacache(com.palladium.paf.server.comm.PafViewRequest)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafServiceProvider#reloadDatacache(com.palladium.paf.server.comm.PafViewRequest)
	 * @author Parasoft Jtest 8.0
	 */
	public void testReloadDatacache4() throws Throwable {
		PafServiceProvider THIS = new PafServiceProvider();
		PafViewRequest t1 = new PafViewRequest();
		ClientInitRequest t2 = new ClientInitRequest();
		_f2 = new PafClientState((String) null, t2);
		t1.setViewName("");
		// jtest_tested_method
		PafDataSlice RETVAL = THIS.reloadDatacache(t1);
		assertEquals(null, RETVAL); // jtest_unverified
		assertEquals("1.2.0 - GA", THIS.getVersion()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testReloadDatacache4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsReloadDatacache4(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientId", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafServiceProvider.reloadDatacache(PafServiceProvider.java:997)
				// 
				// at com.palladium.paf.server.PafServiceProvider.reloadDatacache(PafServiceProvider.java:1000)
				// 
				// at com.palladium.paf.server.PafServiceProvider.reloadDatacache(PafServiceProvider.java:1033)
			}
		}
		if (Stubs.matches(method, ConcurrentHashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f2;
				// at com.palladium.paf.server.PafServiceProvider.reloadDatacache(PafServiceProvider.java:999)
			}
		}
		if (Stubs.matches(method, PafDataService.class)) {
			argument_types = new Class[] { PafClientState.class,
					PafApplicationDef.class, UnitOfWork.class };
			if (Stubs.matches(method, "loadDataCache", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafServiceProvider.reloadDatacache(PafServiceProvider.java:1003)
			}
		}
		if (Stubs.matches(method, PafViewRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getViewName", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafServiceProvider.reloadDatacache(PafServiceProvider.java:1008)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: runCustomCommand(com.palladium.paf.server.comm.PafCustomCommandRequest)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafServiceProvider#runCustomCommand(com.palladium.paf.server.comm.PafCustomCommandRequest)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRunCustomCommand4() throws Throwable {
		PafServiceProvider THIS = new PafServiceProvider();
		PafCustomCommandRequest t1 = new PafCustomCommandRequest();
		t1.setMenuCommandKey("");
		String[] var1 = new String[] {};
		t1.setParameterValues(var1);
		String[] var2 = new String[] {};
		t1.setParameterKeys(var2);
		// jtest_tested_method
		PafCustomCommandResponse RETVAL = THIS.runCustomCommand(t1);
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(null, RETVAL.getCommandResults()); // jtest_unverified
		assertEquals("1.2.0 - GA", THIS.getVersion()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testRunCustomCommand4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRunCustomCommand4(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientId", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafServiceProvider.runCustomCommand(PafServiceProvider.java:1133)
				// 
				// at com.palladium.paf.server.PafServiceProvider.runCustomCommand(PafServiceProvider.java:1139)
				// 
				// at com.palladium.paf.server.PafServiceProvider.runCustomCommand(PafServiceProvider.java:1153)
			}
		}
		if (Stubs.matches(method, PafCustomCommandRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMenuCommandKey", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafServiceProvider.runCustomCommand(PafServiceProvider.java:1136)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getParameterKeys", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafServiceProvider.runCustomCommand(PafServiceProvider.java:1137)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getParameterValues", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafServiceProvider.runCustomCommand(PafServiceProvider.java:1138)
			}
		}
		if (Stubs.matches(method, ConcurrentHashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return Stubs.makeStubObject(IPafClientState.class);
				// at com.palladium.paf.server.PafServiceProvider.runCustomCommand(PafServiceProvider.java:1139)
			}
		}
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[] { String.class, String[].class,
					String[].class, IPafClientState.class };
			if (Stubs.matches(method, "runCustomCommand", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafServiceProvider.runCustomCommand(PafServiceProvider.java:1139)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: saveViewCache()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafServiceProvider#saveViewCache()
	 * @author Parasoft Jtest 8.0
	 */
	public void testSaveViewCache1() throws Throwable {
		PafServiceProvider THIS = new PafServiceProvider();
		// jtest_tested_method
		THIS.saveViewCache();
		assertEquals("1.2.0 - GA", THIS.getVersion()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
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
     * Usage: java com.palladium.paf.server.PafServiceProviderTest
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
            PafServiceProviderTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.server.PafServiceProvider",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return PafServiceProvider.class;
    }

                /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private PafClientState _f2;
                                                                                                                                                                                                    																													/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafApplicationDef _f30;
																													}

// JTEST_CURRENT_ID=2071450806.