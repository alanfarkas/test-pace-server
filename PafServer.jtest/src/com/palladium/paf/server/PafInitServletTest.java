/*
 * PafInitServletTest.java
 * Created by Jtest on 9/19/06 3:17:39 PM.
 * Updated by Jtest on 10/18/06 2:19:46 PM, 7 test cases added, 2 test cases removed.
 * Updated by Jtest on 11/9/06 1:14:39 AM, 1 test case added, 1 test case removed.
 */

package com.palladium.paf.server;

import org.springframework.context.support.AbstractApplicationContext;
import com.palladium.paf.mdb.IPafConnectionProps;
import java.util.Map;
import com.palladium.paf.app.PlanCycle;
import com.palladium.paf.app.SeasonList;
import com.thoughtworks.xstream.XStream;
import java.util.Properties;
import java.sql.DriverManager;
import jtest.HttpServletRequestAdapter;
import jtest.HttpServletResponseAdapter;
import com.palladium.paf.app.PafApplicationDef;
import javax.servlet.GenericServlet;
import com.palladium.paf.app.MdbDef;
import java.sql.Statement;
import org.hibernate.connection.DriverManagerConnectionProvider;
import java.sql.PreparedStatement;
import java.sql.DatabaseMetaData;
import java.sql.Connection;
import jtest.Stubs;
import java.lang.reflect.Member;
import com.palladium.paf.server.PafInitServlet;

/**
 * PafInitServletTest is a unit test class for class PafInitServlet.
 * @see com.palladium.paf.server.PafInitServlet
 * @author Parasoft Jtest 8.0
 */
public class PafInitServletTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public PafInitServletTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }

	/**
	 * Test for method: destroy()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafInitServlet#destroy()
	 * @author Parasoft Jtest 8.0
	 */
	public void testDestroy1() throws Throwable {
		PafInitServlet THIS = new PafInitServlet();
		// jtest_tested_method
		THIS.init();

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
		// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:100)
		// jtest_unverified
	}

	/**
	 * Stubs method for testDestroy1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsDestroy1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				return Stubs.makeStubObject(DatabaseMetaData.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:74)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
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
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
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
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
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
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverName", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverVersion", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "supportsResultSetType", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:80)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "supportsBatchUpdates", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:81)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: destroy()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafInitServlet#destroy()
	 * @author Parasoft Jtest 8.0
	 */
	public void testDestroy3() throws Throwable {
		PafInitServlet THIS = new PafInitServlet();
		// jtest_tested_method
		THIS.init();
		assertEquals(null, THIS.getServletConfig()); // jtest_unverified
		assertEquals("", THIS.getServletInfo()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testDestroy3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsDestroy3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(PafAppService.class);
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1189)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:100)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1189)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:100)
			}
		}
		if (Stubs.matches(method, XStream.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "fromXML", argument_types)) {
				return null;
				// at com.palladium.utility.PafXStream.importObjectFromXml(PafXStream.java:110)
				// at com.palladium.paf.server.PafMetaData.importViews(PafMetaData.java:240)
				// at com.palladium.paf.server.PafViewService.assembleViews(PafViewService.java:135)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:118)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:101)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: destroy()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafInitServlet#destroy()
	 * @author Parasoft Jtest 8.0
	 */
	public void testDestroy13() throws Throwable {
		PafInitServlet THIS = new PafInitServlet();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		THIS.init();
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		t3.setYearDim("");
		String[] var2 = new String[] { null, null, null, null };
		t3.setHierDims(var2);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var3 = new String[] {};
		t3.setAxisPriority(var3);
		_f0.setMdbDef(t3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var5);
		// jtest_tested_method
		THIS.destroy();
		assertEquals(null, THIS.getServletConfig()); // jtest_unverified
		assertEquals("", THIS.getServletInfo()); // jtest_unverified
		assertEquals(9, t3.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testDestroy13.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsDestroy13(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[] { _f0 };
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1189)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:100)
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return Stubs.makeStubObject(IPafConnectionProps.class);
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:431)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1191)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:100)
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
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1191)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:100)
			}
		}
		if (Stubs.matches(method, GenericServlet.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "destroy", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafInitServlet.destroy(PafInitServlet.java:27)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafInitServlet#doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
	 * @author Parasoft Jtest 8.0
	 */
	public void testDoGet1() throws Throwable {
		PafInitServlet THIS = new PafInitServlet();
		HttpServletResponseAdapter t1 = new HttpServletResponseAdapter();
		THIS.init();
		HttpServletRequestAdapter var1 = new HttpServletRequestAdapter();
		// jtest_tested_method
		THIS.doGet(var1, t1);
		assertEquals(null, THIS.getServletConfig()); // jtest_unverified
		assertEquals("", THIS.getServletInfo()); // jtest_unverified
		assertEquals(
			"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n<HTML>\r\n  <HEAD><TITLE>A Servlet</TITLE></HEAD>\r\n  <BODY>\r\n    This is class com.palladium.paf.server.PafInitServlet, using the GET method\r\n  </BODY>\r\n</HTML>\r\n",
			t1.getContent()); // jtest_unverified
		assertEquals(null, t1.getErrorMessage()); // jtest_unverified
		assertEquals(0, t1.getStatus()); // jtest_unverified
		assertEquals(null, t1.getHeader()); // jtest_unverified
		assertEquals(null, t1.getRedirect()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafInitServlet#doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
	 * @author Parasoft Jtest 8.0
	 */
	public void testDoPost1() throws Throwable {
		PafInitServlet THIS = new PafInitServlet();
		HttpServletResponseAdapter t1 = new HttpServletResponseAdapter();
		THIS.init();
		HttpServletRequestAdapter var1 = new HttpServletRequestAdapter();
		// jtest_tested_method
		THIS.doPost(var1, t1);
		assertEquals(null, THIS.getServletConfig()); // jtest_unverified
		assertEquals("", THIS.getServletInfo()); // jtest_unverified
		assertEquals(
			"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n<HTML>\r\n  <HEAD><TITLE>A Servlet</TITLE></HEAD>\r\n  <BODY>\r\n    This is class com.palladium.paf.server.PafInitServlet, using the POST method\r\n  </BODY>\r\n</HTML>\r\n",
			t1.getContent()); // jtest_unverified
		assertEquals(null, t1.getErrorMessage()); // jtest_unverified
		assertEquals(0, t1.getStatus()); // jtest_unverified
		assertEquals(null, t1.getHeader()); // jtest_unverified
		assertEquals(null, t1.getRedirect()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafInitServlet#doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
	 * @author Parasoft Jtest 8.0
	 */
	public void testDoPost2() throws Throwable {
		PafInitServlet THIS = new PafInitServlet();
		_f0 = new PafApplicationDef();
		// jtest_tested_method
		THIS.init();
		assertEquals(null, THIS.getServletConfig()); // jtest_unverified
		assertEquals("", THIS.getServletInfo()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testDoPost2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsDoPost2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				return Stubs.makeStubObject(DatabaseMetaData.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:74)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
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
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
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
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
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
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverName", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverVersion", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "supportsResultSetType", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:80)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "supportsBatchUpdates", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:81)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:99)
			}
		}
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(PafAppService.class);
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1189)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:100)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[] { _f0 };
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1189)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:100)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: init()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafInitServlet#init()
	 * @author Parasoft Jtest 8.0
	 */
	public void testInit1() throws Throwable {
		PafInitServlet THIS = new PafInitServlet();
		// jtest_tested_method
		THIS.init();
		assertEquals(null, THIS.getServletConfig()); // jtest_unverified
		assertEquals("", THIS.getServletInfo()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testInit1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsInit1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1189)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
				// at com.palladium.paf.server.PafInitServlet.init(PafInitServlet.java:100)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafInitServlet()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafInitServlet#PafInitServlet()
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafInitServlet1() throws Throwable {
		// jtest_tested_method
		PafInitServlet THIS = new PafInitServlet();
		assertEquals(null, THIS.getServletConfig()); // jtest_unverified
		assertEquals("", THIS.getServletInfo()); // jtest_unverified
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
     * Usage: java com.palladium.paf.server.PafInitServletTest
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
            PafInitServletTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.server.PafInitServlet",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return PafInitServlet.class;
    }

        	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafApplicationDef _f0;
	}

// JTEST_CURRENT_ID=1686435671.