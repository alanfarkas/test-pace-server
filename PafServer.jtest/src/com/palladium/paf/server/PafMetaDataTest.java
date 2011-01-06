/*
 * PafMetaDataTest.java
 * Created by Jtest on 9/19/06 1:41:53 PM.
 * Updated by Jtest on 10/18/06 10:33:31 AM, 39 test cases added, 18 test cases removed.
 * Updated by Jtest on 11/8/06 8:22:39 PM, 42 test cases added, 14 test cases removed.
 */

package com.palladium.paf.server;

import org.hibernate.connection.UserSuppliedConnectionProvider;
import jtest.JT;
import org.hibernate.cfg.SettingsFactory;
import java.io.File;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import org.hibernate.Session;
import com.palladium.paf.rules.RuleSet;
import com.palladium.paf.view.LockedCell;
import com.palladium.paf.view.PageTuple;
import com.palladium.paf.view.ViewTuple;
import com.palladium.paf.data.PafDataSlice;
import com.palladium.paf.view.PafViewHeader;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.sql.Connection;
import org.hibernate.connection.DriverManagerConnectionProvider;
import org.springframework.context.ApplicationContext;
import java.util.Properties;
import com.palladium.paf.app.PafApplicationDef;
import com.palladium.paf.comm.CustomMenuDef;
import com.palladium.paf.funcs.CustomFunctionDef;
import com.palladium.paf.app.MeasureDef;
import com.palladium.paf.comm.PafPlannerConfig;
import com.palladium.paf.app.PafPlannerRole;
import com.palladium.paf.PafConfigFileNotFoundException;
import java.util.List;
import com.palladium.paf.view.PafUserSelection;
import com.palladium.paf.app.PafUser;
import com.palladium.paf.app.VersionDef;
import com.palladium.utility.PafXStream;
import java.util.Map;
import com.palladium.paf.view.PafViewSection;
import com.thoughtworks.xstream.XStream;
import org.springframework.context.support.AbstractApplicationContext;
import org.hibernate.cfg.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.hibernate.SessionFactory;
import jtest.Stubs;
import java.lang.reflect.Member;
import com.palladium.paf.view.PafView;
import com.palladium.paf.server.PafMetaData;

/**
 * PafMetaDataTest is a unit test class for class PafMetaData.
 * @see com.palladium.paf.server.PafMetaData
 * @author Parasoft Jtest 8.0
 */
public class PafMetaDataTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public PafMetaDataTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }
	/**
	 * Test for method: static clearDataCache()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#clearDataCache()
	 * @author Parasoft Jtest 8.0
	 */
	public void testClearDataCache1() throws Throwable {
		_f0 = new ServerSettings();
		SettingsFactory t1 = (SettingsFactory) JT.createObject(
			SettingsFactory.class,
			new Object[] {},
			new Class[] {});
		_f7 = (Configuration) JT.createObject(
			Configuration.class,
			new Object[] { t1 },
			new Class[] { SettingsFactory.class });
		_f0.setClearOutlineCache(true);
		_f0.setDebugMode(true);
		_f0.setEvaluationStepLogging(true);
		_f0.setPafSecurityBootupPassword("");
		_f0.setPafSecurityPassword("");
		_f0.setPafSecurityUser("");
		_f0.setCalcScriptTimeout("");
		_f0.setChangedCellLogging(true);
		// jtest_tested_method
		int RETVAL = PafMetaData.clearDataCache();
		assertEquals(0, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertEquals(_f0, PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testClearDataCache1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsClearDataCache1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:85)
			}
		}
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:110)
			}
		}
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
			}
		}
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "configure", argument_types)) {
				return _f7;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static closeSession()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#closeSession()
	 * @author Parasoft Jtest 8.0
	 */
	public void testCloseSession1() throws Throwable {
		_f0 = new ServerSettings();
		// jtest_tested_method
		PafMetaData.closeSession();
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertEquals(_f0, PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testCloseSession1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCloseSession1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
			}
		}
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static closeSession()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#closeSession()
	 * @author Parasoft Jtest 8.0
	 */
	public void testCloseSession2() throws Throwable {
		// jtest_tested_method
		PafMetaData.closeSession();
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(false, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testCloseSession2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCloseSession2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isDebugMode", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:110)
			}
		}
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static closeSession()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#closeSession()
	 * @author Parasoft Jtest 8.0
	 */
	public void testCloseSession3() throws Throwable {
		_f0 = new ServerSettings();
		_f0.setClearOutlineCache(false);
		_f0.setDebugMode(false);
		_f0.setEvaluationStepLogging(false);
		_f0.setPafSecurityBootupPassword("");
		_f0.setPafSecurityPassword("");
		_f0.setPafSecurityUser("");
		_f0.setCalcScriptTimeout("");
		_f0.setChangedCellLogging(false);
		// jtest_tested_method
		PafMetaData.closeSession();
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testCloseSession3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCloseSession3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
			}
		}
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
			}
		}
		if (Stubs.matches(method, ThreadLocal.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "get", argument_types)) {
				return Stubs.makeStubObject(Session.class);
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "set", argument_types)) {
				return Stubs.VOID;
			}
		}
		if (Stubs.matches(method, Session.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return null;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static closeSession()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#closeSession()
	 * @author Parasoft Jtest 8.0
	 */
	public void testCloseSession4() throws Throwable {
		// jtest_tested_method
		PafMetaData.closeSession();
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testCloseSession4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCloseSession4(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				return Stubs.makeStubObject(DatabaseMetaData.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:74)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
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
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverName", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverVersion", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "supportsResultSetType", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:80)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "supportsBatchUpdates", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:81)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static currentSession()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#currentSession()
	 * @author Parasoft Jtest 8.0
	 */
	public void testCurrentSession1() throws Throwable {
		// jtest_tested_method
		Session RETVAL = PafMetaData.currentSession();
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testCurrentSession1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCurrentSession1(
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
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				return Stubs.makeStubObject(DatabaseMetaData.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:74)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
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
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverName", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverVersion", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "supportsResultSetType", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:80)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "supportsBatchUpdates", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:81)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static exportMeasures(com.palladium.paf.app.MeasureDef[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#exportMeasures(com.palladium.paf.app.MeasureDef[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testExportMeasures1() throws Throwable {
		_f0 = new ServerSettings();
		MeasureDef[] var1 = new MeasureDef[] {};
		// jtest_tested_method
		PafMetaData.exportMeasures(var1);
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testExportMeasures1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExportMeasures1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
			}
		}
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static exportMeasures(com.palladium.paf.app.MeasureDef[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#exportMeasures(com.palladium.paf.app.MeasureDef[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testExportMeasures2() throws Throwable {
		// jtest_tested_method
		PafMetaData.exportMeasures((MeasureDef[]) null);
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(false, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testExportMeasures2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExportMeasures2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isDebugMode", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:110)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafServerHome", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafMetaData.getConfigDirPath(PafMetaData.java:100)
				// at com.palladium.paf.server.PafMetaData.exportMeasures(PafMetaData.java:362)
			}
		}
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PafXStream.class)) {
			argument_types = new Class[] { Object.class, String.class };
			if (Stubs.matches(method, "exportObjectToXml", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.exportMeasures(PafMetaData.java:362)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static exportMeasures(com.palladium.paf.app.MeasureDef[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#exportMeasures(com.palladium.paf.app.MeasureDef[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testExportMeasures3() throws Throwable {
		MeasureDef[] var1 = new MeasureDef[] {};
		// jtest_tested_method
		PafMetaData.exportMeasures(var1);
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testExportMeasures3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExportMeasures3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isDebugMode", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:110)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafServerHome", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafMetaData.getConfigDirPath(PafMetaData.java:100)
				// at com.palladium.paf.server.PafMetaData.exportMeasures(PafMetaData.java:362)
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
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				return Stubs.makeStubObject(DatabaseMetaData.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:74)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
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
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverName", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverVersion", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "supportsResultSetType", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:80)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "supportsBatchUpdates", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:81)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, File.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "createNewFile", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.utility.PafXStream.exportObjectToXml(PafXStream.java:146)
				// at com.palladium.paf.server.PafMetaData.exportMeasures(PafMetaData.java:362)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static exportRuleSets(com.palladium.paf.rules.RuleSet[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#exportRuleSets(com.palladium.paf.rules.RuleSet[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testExportRuleSets1() throws Throwable {
		// jtest_tested_method
		PafMetaData.exportRuleSets((RuleSet[]) null);
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(false, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testExportRuleSets1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExportRuleSets1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isDebugMode", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:110)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafServerHome", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafMetaData.getConfigDirPath(PafMetaData.java:100)
				// at com.palladium.paf.server.PafMetaData.exportRuleSets(PafMetaData.java:271)
			}
		}
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PafXStream.class)) {
			argument_types = new Class[] { Object.class, String.class };
			if (Stubs.matches(method, "exportObjectToXml", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.exportRuleSets(PafMetaData.java:271)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static exportRuleSets(com.palladium.paf.rules.RuleSet[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#exportRuleSets(com.palladium.paf.rules.RuleSet[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testExportRuleSets2() throws Throwable {
		_f0 = new ServerSettings();
		RuleSet[] var1 = new RuleSet[] {};
		// jtest_tested_method
		PafMetaData.exportRuleSets(var1);
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testExportRuleSets2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExportRuleSets2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
			}
		}
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static exportRuleSets(com.palladium.paf.rules.RuleSet[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#exportRuleSets(com.palladium.paf.rules.RuleSet[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testExportRuleSets3() throws Throwable {
		// jtest_tested_method
		PafMetaData.exportRuleSets((RuleSet[]) null);
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testExportRuleSets3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExportRuleSets3(
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
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				return Stubs.makeStubObject(DatabaseMetaData.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:74)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
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
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverName", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverVersion", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "supportsResultSetType", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:80)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "supportsBatchUpdates", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:81)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PafXStream.class)) {
			argument_types = new Class[] { Object.class, String.class };
			if (Stubs.matches(method, "exportObjectToXml", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.exportRuleSets(PafMetaData.java:271)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static exportRuleSets(com.palladium.paf.rules.RuleSet[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#exportRuleSets(com.palladium.paf.rules.RuleSet[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testExportRuleSets4() throws Throwable {
		// jtest_tested_method
		PafMetaData.exportRuleSets((RuleSet[]) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.server.PafMetaData.exportRuleSets([Lcom/palladium/paf/rules/RuleSet;)V>
		// at com.palladium.utility.PafXStream.exportObjectToXml(PafXStream.java:138)
		// at com.palladium.paf.server.PafMetaData.exportRuleSets(PafMetaData.java:271)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExportRuleSets4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExportRuleSets4(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isDebugMode", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:110)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafServerHome", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafMetaData.getConfigDirPath(PafMetaData.java:100)
				// at com.palladium.paf.server.PafMetaData.exportRuleSets(PafMetaData.java:271)
			}
		}
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				return Stubs.makeStubObject(DatabaseMetaData.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:74)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
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
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverName", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverVersion", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "supportsResultSetType", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:80)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "supportsBatchUpdates", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:81)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static exportScreens(com.palladium.paf.view.PafView[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#exportScreens(com.palladium.paf.view.PafView[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testExportScreens1() throws Throwable {
		// jtest_tested_method
		PafMetaData.exportScreens((PafView[]) null);
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(false, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testExportScreens1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExportScreens1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				throw new SQLException();
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
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
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static exportScreens(com.palladium.paf.view.PafView[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#exportScreens(com.palladium.paf.view.PafView[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testExportScreens2() throws Throwable {
		PafView[] var1 = new PafView[] {};
		// jtest_tested_method
		PafMetaData.exportScreens(var1);
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testExportScreens2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExportScreens2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, DriverManagerConnectionProvider.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				throw new SQLException();
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static exportScreens(com.palladium.paf.view.PafView[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#exportScreens(com.palladium.paf.view.PafView[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testExportScreens4() throws Throwable {
		PafView[] var1 = new PafView[] {};
		// jtest_tested_method
		PafMetaData.exportScreens(var1);
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testExportScreens4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExportScreens4(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				throw new SQLException();
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				throw new SQLException();
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				throw new SQLException();
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:74)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
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
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static exportScreens(com.palladium.paf.view.PafView[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#exportScreens(com.palladium.paf.view.PafView[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testExportScreens5() throws Throwable {
		PafView[] var1 = new PafView[] { null };
		// jtest_tested_method
		PafMetaData.exportScreens(var1);
		// NullPointerException thrown
		// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:161)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExportScreens5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExportScreens5(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				return Stubs.makeStubObject(DatabaseMetaData.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:74)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				throw new SQLException();
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				throw new SQLException();
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
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
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverName", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverVersion", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "supportsResultSetType", argument_types)) {
				return Boolean.TRUE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:80)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "supportsBatchUpdates", argument_types)) {
				return Boolean.TRUE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:81)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static exportScreens(com.palladium.paf.view.PafView[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#exportScreens(com.palladium.paf.view.PafView[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testExportScreens6() throws Throwable {
		PafView t0 = new PafView();
		PafView[] var1 = new PafView[] { t0 };
		// jtest_tested_method
		PafMetaData.exportScreens(var1);
		// UnsupportedOperationException thrown
		// at com.thoughtworks.xstream.core.util.OrderRetainingMap.entrySet(OrderRetainingMap.java:31)
		// at java.util.AbstractMap.hashCode(AbstractMap.java:555)
		// at java.util.HashMap.hash(HashMap.java:264)
		// at java.util.WeakHashMap.getEntry(WeakHashMap.java:370)
		// at java.util.WeakHashMap.containsKey(WeakHashMap.java:361)
		// at com.thoughtworks.xstream.converters.reflection.FieldDictionary.buildMap(FieldDictionary.java:48)
		// at com.thoughtworks.xstream.converters.reflection.FieldDictionary.serializableFieldsFor(FieldDictionary.java:20)
		// at com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider.visitSerializableFields(PureJavaReflectionProvider.java:100)
		// at com.thoughtworks.xstream.converters.reflection.ReflectionConverter.marshal(ReflectionConverter.java:44)
		// at com.thoughtworks.xstream.core.ReferenceByXPathMarshaller.convertAnother(ReferenceByXPathMarshaller.java:36)
		// at com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter.writeItem(AbstractCollectionConverter.java:68)
		// at com.thoughtworks.xstream.converters.collections.ArrayConverter.marshal(ArrayConverter.java:42)
		// at com.thoughtworks.xstream.core.ReferenceByXPathMarshaller.convertAnother(ReferenceByXPathMarshaller.java:36)
		// at com.thoughtworks.xstream.core.TreeMarshaller.start(TreeMarshaller.java:46)
		// at com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy.marshal(ReferenceByXPathMarshallingStrategy.java:17)
		// at com.thoughtworks.xstream.XStream.marshal(XStream.java:461)
		// at com.thoughtworks.xstream.XStream.marshal(XStream.java:451)
		// at com.thoughtworks.xstream.XStream.toXML(XStream.java:432)
		// at com.palladium.utility.PafXStream.exportObjectToXml(PafXStream.java:141)
		// at com.palladium.paf.server.PafMetaData.exportViews(PafMetaData.java:211)
		// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:198)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExportScreens6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExportScreens6(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.sql.Connection.prepareStatement(java.lang.String)");
				switch (index) {
					case 1 :
						return Stubs.makeStubObject(PreparedStatement.class);
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					case 2 :
						throw new SQLException();
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				return Stubs.makeStubObject(DatabaseMetaData.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:74)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
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
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverName", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverVersion", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "supportsResultSetType", argument_types)) {
				return Boolean.TRUE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:80)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "supportsBatchUpdates", argument_types)) {
				return Boolean.TRUE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:81)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static exportScreens(com.palladium.paf.view.PafView[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#exportScreens(com.palladium.paf.view.PafView[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testExportScreens8() throws Throwable {
		PafView t0 = new PafView();
		PafView t1 = new PafView();
		Integer t2 = new Integer(0);
		Integer t3 = new Integer("0");
		t1.setDesc("");
		PafViewHeader[] var1 = new PafViewHeader[] {};
		t1.setHeaders(var1);
		t1.setName("");
		PafViewSection[] var2 = new PafViewSection[] { null };
		t1.setViewSections(var2);
		t1.setBackGroundColor("");
		PafUserSelection[] var3 = new PafUserSelection[] {};
		t1.setUserSelections(var3);
		String[] var4 = new String[] {};
		t1.setViewSectionNames(var4);
		t1.setPageOrientation("");
		t1.setPagesTall(t2);
		t1.setPagesWide(t3);
		PafView[] var5 = new PafView[] { t0, t1 };
		// jtest_tested_method
		PafMetaData.exportScreens(var5);
		// NullPointerException thrown
		// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:179)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExportScreens8.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExportScreens8(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isDebugMode", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:110)
			}
		}
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.sql.Connection.prepareStatement(java.lang.String)");
				switch (index) {
					case 1 :
					case 2 :
						return Stubs.makeStubObject(PreparedStatement.class);
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// 
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					case 3 :
						throw new SQLException();
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				return Stubs.makeStubObject(DatabaseMetaData.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:74)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
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
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverName", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverVersion", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "supportsResultSetType", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:80)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "supportsBatchUpdates", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:81)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static exportScreens(com.palladium.paf.view.PafView[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#exportScreens(com.palladium.paf.view.PafView[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testExportScreens9() throws Throwable {
		PafView t0 = new PafView();
		_f1 = new PafViewSection();
		PafView t2 = new PafView();
		Integer t3 = new Integer(0);
		Integer t4 = new Integer("0");
		PafView t5 = new PafView();
		t2.setDesc("");
		PafViewHeader[] var1 = new PafViewHeader[] {};
		t2.setHeaders(var1);
		t2.setName("");
		PafViewSection[] var2 = new PafViewSection[] {};
		t2.setViewSections(var2);
		t2.setBackGroundColor("");
		PafUserSelection[] var3 = new PafUserSelection[] {};
		t2.setUserSelections(var3);
		String[] var4 = new String[] {};
		t2.setViewSectionNames(var4);
		t2.setPageOrientation("");
		t2.setPagesTall(t3);
		t2.setPagesWide(t4);
		PafView[] var5 = new PafView[] { t0, t2, t5 };
		// jtest_tested_method
		PafMetaData.exportScreens(var5);
		// NullPointerException thrown
		// at com.palladium.utility.PafXStream.exportObjectToXml(PafXStream.java:138)
		// at com.palladium.paf.server.PafMetaData.exportViewSections(PafMetaData.java:223)
		// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:195)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExportScreens9.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExportScreens9(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				return Stubs.makeStubObject(DatabaseMetaData.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:74)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.sql.PreparedStatement.executeUpdate()");
				switch (index) {
					case 1 :
					case 2 :
						return new Integer(0);
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// 
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					case 3 :
						throw new SQLException();
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
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
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverName", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverVersion", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "supportsResultSetType", argument_types)) {
				return Boolean.TRUE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:80)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "supportsBatchUpdates", argument_types)) {
				return Boolean.TRUE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:81)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PafView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getViewSections", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.view.PafView.getViewSections()");
				switch (index) {
					case 1 :
					case 2 :
						return new PafViewSection[] { _f1 };
					// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:164)
					case 3 :
					case 4 :
					case 5 :
					case 6 :
						return new PafViewSection[0];
					// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:164)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { String[].class };
			if (Stubs.matches(method, "setViewSectionNames", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:185)
			}
			argument_types = new Class[] { PafViewSection[].class };
			if (Stubs.matches(method, "setViewSections", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:190)
			}
		}
		if (Stubs.matches(method, Object.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClass", argument_types)) {
				return null;
				// at com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter.writeItem
				// at com.thoughtworks.xstream.converters.collections.ArrayConverter.marshal(ArrayConverter.java:42)
				// at com.thoughtworks.xstream.core.ReferenceByXPathMarshaller.convertAnother(ReferenceByXPathMarshaller.java:36)
				// at com.thoughtworks.xstream.core.TreeMarshaller.start(TreeMarshaller.java:46)
				// at com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy.marshal(ReferenceByXPathMarshallingStrategy.java:17)
				// at com.thoughtworks.xstream.XStream.marshal(XStream.java:461)
				// at com.thoughtworks.xstream.XStream.marshal(XStream.java:451)
				// at com.thoughtworks.xstream.XStream.toXML(XStream.java:432)
				// at com.palladium.utility.PafXStream.exportObjectToXml(PafXStream.java:141)
				// at com.palladium.paf.server.PafMetaData.exportViews(PafMetaData.java:211)
				// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:198)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static exportScreens(com.palladium.paf.view.PafView[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#exportScreens(com.palladium.paf.view.PafView[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testExportScreens10() throws Throwable {
		PafView t0 = new PafView();
		Integer t1 = new Integer(0);
		Integer t2 = new Integer("0");
		PafViewSection t3 = new PafViewSection();
		PafViewSection t4 = new PafViewSection();
		PafDataSlice t5 = new PafDataSlice((double[]) null, 0);
		Integer t6 = new Integer(0);
		Integer t7 = new Integer("0");
		PafViewSection t8 = new PafViewSection();
		PafViewSection t9 = new PafViewSection();
		PafDataSlice t10 = new PafDataSlice();
		Integer t11 = new Integer("0");
		Integer t12 = new Integer(0);
		PafView t13 = new PafView();
		PafView t14 = new PafView();
		PafView t15 = new PafView();
		Integer t16 = new Integer(0);
		Integer t17 = new Integer("0");
		t0.setDesc("<");
		PafViewHeader[] var1 = new PafViewHeader[] {};
		t0.setHeaders(var1);
		t0.setName("\"&");
		PafViewSection[] var2 = new PafViewSection[] { t3, t4, t8, t9 };
		t0.setViewSections(var2);
		t0.setBackGroundColor(">");
		PafUserSelection[] var3 = new PafUserSelection[] {};
		t0.setUserSelections(var3);
		String[] var4 = new String[] {};
		t0.setViewSectionNames(var4);
		t0.setPageOrientation("\r");
		t0.setPagesTall(t1);
		t0.setPagesWide(t2);
		t4.setDescription("\r");
		t4.setName("");
		ViewTuple[] var5 = new ViewTuple[] {};
		t4.setColTuples(var5);
		ViewTuple[] var6 = new ViewTuple[] {};
		t4.setRowTuples(var6);
		t4.setPafDataSlice(t5);
		t4.setDataAlias("\"");
		t4.setManaged(false);
		t4.setPrimaryFormattingAxis(0);
		t4.setReadOnly(false);
		String[] var7 = new String[] {};
		t4.setColAxisDims(var7);
		PageTuple[] var8 = new PageTuple[] {};
		t4.setPageTuples(var8);
		String[] var9 = new String[] {};
		t4.setRowAxisDims(var9);
		t4.setLeftOffset(0);
		t4.setTopOffset(0);
		PafViewHeader[] var10 = new PafViewHeader[] {};
		t4.setPafViewHeaders(var10);
		LockedCell[] var11 = new LockedCell[] {};
		t4.setForwardPlannableLockedCell(var11);
		LockedCell[] var12 = new LockedCell[] {};
		t4.setNotPlannableLockedCells(var12);
		t4.setGenerationFormatName("&");
		t4.setColumnWidth(t6);
		t4.setRowHeight(t7);
		t9.setDescription("<");
		t9.setName("'");
		ViewTuple[] var13 = new ViewTuple[] {};
		t9.setColTuples(var13);
		ViewTuple[] var14 = new ViewTuple[] {};
		t9.setRowTuples(var14);
		t9.setPafDataSlice(t10);
		t9.setDataAlias(">");
		t9.setManaged(false);
		t9.setPrimaryFormattingAxis(0);
		t9.setReadOnly(false);
		String[] var15 = new String[] {};
		t9.setColAxisDims(var15);
		PageTuple[] var16 = new PageTuple[] {};
		t9.setPageTuples(var16);
		String[] var17 = new String[] {};
		t9.setRowAxisDims(var17);
		t9.setLeftOffset(0);
		t9.setTopOffset(0);
		PafViewHeader[] var18 = new PafViewHeader[] {};
		t9.setPafViewHeaders(var18);
		LockedCell[] var19 = new LockedCell[] {};
		t9.setForwardPlannableLockedCell(var19);
		LockedCell[] var20 = new LockedCell[] {};
		t9.setNotPlannableLockedCells(var20);
		t9.setGenerationFormatName("\r");
		t9.setColumnWidth(t11);
		t9.setRowHeight(t12);
		t15.setDesc("&");
		PafViewHeader[] var21 = new PafViewHeader[] {};
		t15.setHeaders(var21);
		t15.setName("\"");
		PafViewSection[] var22 = new PafViewSection[] {};
		t15.setViewSections(var22);
		t15.setBackGroundColor("'");
		PafUserSelection[] var23 = new PafUserSelection[] {};
		t15.setUserSelections(var23);
		String[] var24 = new String[] {};
		t15.setViewSectionNames(var24);
		t15.setPageOrientation("<");
		t15.setPagesTall(t16);
		t15.setPagesWide(t17);
		PafView[] var25 = new PafView[] { t0, t13, t14, t15 };
		// jtest_tested_method
		PafMetaData.exportScreens(var25);
		// UnsupportedOperationException thrown
		// at com.thoughtworks.xstream.core.util.OrderRetainingMap.entrySet(OrderRetainingMap.java:31)
		// at java.util.AbstractMap.hashCode(AbstractMap.java:555)
		// at java.util.HashMap.hash(HashMap.java:264)
		// at java.util.WeakHashMap.getEntry(WeakHashMap.java:370)
		// at java.util.WeakHashMap.containsKey(WeakHashMap.java:361)
		// at com.thoughtworks.xstream.converters.reflection.FieldDictionary.buildMap(FieldDictionary.java:48)
		// at com.thoughtworks.xstream.converters.reflection.FieldDictionary.serializableFieldsFor(FieldDictionary.java:20)
		// at com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider.visitSerializableFields(PureJavaReflectionProvider.java:100)
		// at com.thoughtworks.xstream.converters.reflection.ReflectionConverter.marshal(ReflectionConverter.java:44)
		// at com.thoughtworks.xstream.core.ReferenceByXPathMarshaller.convertAnother(ReferenceByXPathMarshaller.java:36)
		// at com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter.writeItem(AbstractCollectionConverter.java:68)
		// at com.thoughtworks.xstream.converters.collections.ArrayConverter.marshal(ArrayConverter.java:42)
		// at com.thoughtworks.xstream.core.ReferenceByXPathMarshaller.convertAnother(ReferenceByXPathMarshaller.java:36)
		// at com.thoughtworks.xstream.core.TreeMarshaller.start(TreeMarshaller.java:46)
		// at com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy.marshal(ReferenceByXPathMarshallingStrategy.java:17)
		// at com.thoughtworks.xstream.XStream.marshal(XStream.java:461)
		// at com.thoughtworks.xstream.XStream.marshal(XStream.java:451)
		// at com.thoughtworks.xstream.XStream.toXML(XStream.java:432)
		// at com.palladium.utility.PafXStream.exportObjectToXml(PafXStream.java:141)
		// at com.palladium.paf.server.PafMetaData.exportViewSections(PafMetaData.java:223)
		// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:195)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExportScreens10.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExportScreens10(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isDebugMode", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:110)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafServerHome", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafMetaData.getConfigDirPath(PafMetaData.java:100)
				// at com.palladium.paf.server.PafMetaData.exportViewSections(PafMetaData.java:223)
				// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:195)
				// 
				// at com.palladium.paf.server.PafMetaData.getConfigDirPath(PafMetaData.java:100)
				// at com.palladium.paf.server.PafMetaData.exportViews(PafMetaData.java:211)
				// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:198)
			}
		}
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.sql.Connection.prepareStatement(java.lang.String)");
				switch (index) {
					case 1 :
					case 2 :
					case 3 :
						return Stubs.makeStubObject(PreparedStatement.class);
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// 
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// 
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					case 4 :
						throw new SQLException();
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				return Stubs.makeStubObject(DatabaseMetaData.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:74)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
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
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverName", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverVersion", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "supportsResultSetType", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:80)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "supportsBatchUpdates", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:81)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static exportScreens(com.palladium.paf.view.PafView[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#exportScreens(com.palladium.paf.view.PafView[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testExportScreens12() throws Throwable {
		PafView t0 = new PafView();
		PafView t1 = new PafView();
		Integer t2 = new Integer(0);
		Integer t3 = new Integer("0");
		PafViewSection t4 = new PafViewSection();
		PafViewSection t5 = new PafViewSection();
		PafDataSlice t6 = new PafDataSlice((double[]) null, 0);
		Integer t7 = new Integer(0);
		Integer t8 = new Integer("0");
		PafViewSection t9 = new PafViewSection();
		PafViewSection t10 = new PafViewSection();
		PafDataSlice t11 = new PafDataSlice();
		Integer t12 = new Integer("0");
		Integer t13 = new Integer(0);
		PafViewSection t14 = new PafViewSection();
		PafDataSlice t15 = new PafDataSlice((double[]) null, 0);
		Integer t16 = new Integer(0);
		Integer t17 = new Integer("0");
		PafViewSection t18 = new PafViewSection();
		PafViewSection t19 = new PafViewSection();
		PafViewSection t20 = new PafViewSection();
		PafDataSlice t21 = new PafDataSlice();
		Integer t22 = new Integer("0");
		Integer t23 = new Integer(0);
		PafViewSection t24 = new PafViewSection();
		PafDataSlice t25 = new PafDataSlice();
		Integer t26 = new Integer(0);
		Integer t27 = new Integer("0");
		PafViewSection t28 = new PafViewSection();
		PafView t29 = new PafView();
		PafView t30 = new PafView();
		Integer t31 = new Integer("0");
		Integer t32 = new Integer(0);
		PafView t33 = new PafView();
		Integer t34 = new Integer(0);
		Integer t35 = new Integer("0");
		PafView t36 = new PafView();
		t1.setDesc("");
		PafViewHeader[] var1 = new PafViewHeader[] {};
		t1.setHeaders(var1);
		t1.setName("");
		PafViewSection[] var2 = new PafViewSection[] { t4, t5, t9, t10, t14,
				t18, t19, t20, t24, t28 };
		t1.setViewSections(var2);
		t1.setBackGroundColor("");
		PafUserSelection[] var3 = new PafUserSelection[] {};
		t1.setUserSelections(var3);
		String[] var4 = new String[] {};
		t1.setViewSectionNames(var4);
		t1.setPageOrientation("");
		t1.setPagesTall(t2);
		t1.setPagesWide(t3);
		t5.setDescription("");
		t5.setName("");
		ViewTuple[] var5 = new ViewTuple[] {};
		t5.setColTuples(var5);
		ViewTuple[] var6 = new ViewTuple[] {};
		t5.setRowTuples(var6);
		t5.setPafDataSlice(t6);
		t5.setDataAlias("");
		t5.setManaged(false);
		t5.setPrimaryFormattingAxis(0);
		t5.setReadOnly(false);
		String[] var7 = new String[] {};
		t5.setColAxisDims(var7);
		PageTuple[] var8 = new PageTuple[] {};
		t5.setPageTuples(var8);
		String[] var9 = new String[] {};
		t5.setRowAxisDims(var9);
		t5.setLeftOffset(0);
		t5.setTopOffset(0);
		PafViewHeader[] var10 = new PafViewHeader[] {};
		t5.setPafViewHeaders(var10);
		LockedCell[] var11 = new LockedCell[] {};
		t5.setForwardPlannableLockedCell(var11);
		LockedCell[] var12 = new LockedCell[] {};
		t5.setNotPlannableLockedCells(var12);
		t5.setGenerationFormatName("");
		t5.setColumnWidth(t7);
		t5.setRowHeight(t8);
		t10.setDescription("");
		t10.setName("");
		ViewTuple[] var13 = new ViewTuple[] {};
		t10.setColTuples(var13);
		ViewTuple[] var14 = new ViewTuple[] {};
		t10.setRowTuples(var14);
		t11.setColumnCount(0);
		double[] var15 = new double[] {};
		t11.setData(var15);
		t11.setCompressedData("");
		t11.setCompressed(false);
		t10.setPafDataSlice(t11);
		t10.setDataAlias("");
		t10.setManaged(false);
		t10.setPrimaryFormattingAxis(0);
		t10.setReadOnly(false);
		String[] var16 = new String[] {};
		t10.setColAxisDims(var16);
		PageTuple[] var17 = new PageTuple[] {};
		t10.setPageTuples(var17);
		String[] var18 = new String[] {};
		t10.setRowAxisDims(var18);
		t10.setLeftOffset(0);
		t10.setTopOffset(0);
		PafViewHeader[] var19 = new PafViewHeader[] {};
		t10.setPafViewHeaders(var19);
		LockedCell[] var20 = new LockedCell[] {};
		t10.setForwardPlannableLockedCell(var20);
		LockedCell[] var21 = new LockedCell[] {};
		t10.setNotPlannableLockedCells(var21);
		t10.setGenerationFormatName("");
		t10.setColumnWidth(t12);
		t10.setRowHeight(t13);
		t14.setDescription("");
		t14.setName("");
		ViewTuple[] var22 = new ViewTuple[] {};
		t14.setColTuples(var22);
		ViewTuple[] var23 = new ViewTuple[] {};
		t14.setRowTuples(var23);
		t15.setColumnCount(0);
		double[] var24 = new double[] {};
		t15.setData(var24);
		t15.setCompressedData("");
		t15.setCompressed(false);
		t14.setPafDataSlice(t15);
		t14.setDataAlias("");
		t14.setManaged(false);
		t14.setPrimaryFormattingAxis(0);
		t14.setReadOnly(false);
		String[] var25 = new String[] {};
		t14.setColAxisDims(var25);
		PageTuple[] var26 = new PageTuple[] {};
		t14.setPageTuples(var26);
		String[] var27 = new String[] {};
		t14.setRowAxisDims(var27);
		t14.setLeftOffset(0);
		t14.setTopOffset(0);
		PafViewHeader[] var28 = new PafViewHeader[] {};
		t14.setPafViewHeaders(var28);
		LockedCell[] var29 = new LockedCell[] {};
		t14.setForwardPlannableLockedCell(var29);
		LockedCell[] var30 = new LockedCell[] {};
		t14.setNotPlannableLockedCells(var30);
		t14.setGenerationFormatName("");
		t14.setColumnWidth(t16);
		t14.setRowHeight(t17);
		t20.setDescription("");
		t20.setName("");
		ViewTuple[] var31 = new ViewTuple[] {};
		t20.setColTuples(var31);
		ViewTuple[] var32 = new ViewTuple[] {};
		t20.setRowTuples(var32);
		t20.setPafDataSlice(t21);
		t20.setDataAlias("");
		t20.setManaged(false);
		t20.setPrimaryFormattingAxis(0);
		t20.setReadOnly(false);
		String[] var33 = new String[] {};
		t20.setColAxisDims(var33);
		PageTuple[] var34 = new PageTuple[] {};
		t20.setPageTuples(var34);
		String[] var35 = new String[] {};
		t20.setRowAxisDims(var35);
		t20.setLeftOffset(0);
		t20.setTopOffset(0);
		PafViewHeader[] var36 = new PafViewHeader[] {};
		t20.setPafViewHeaders(var36);
		LockedCell[] var37 = new LockedCell[] {};
		t20.setForwardPlannableLockedCell(var37);
		LockedCell[] var38 = new LockedCell[] {};
		t20.setNotPlannableLockedCells(var38);
		t20.setGenerationFormatName("");
		t20.setColumnWidth(t22);
		t20.setRowHeight(t23);
		t24.setDescription("");
		t24.setName("");
		ViewTuple[] var39 = new ViewTuple[] {};
		t24.setColTuples(var39);
		ViewTuple[] var40 = new ViewTuple[] {};
		t24.setRowTuples(var40);
		t24.setPafDataSlice(t25);
		t24.setDataAlias("");
		t24.setManaged(false);
		t24.setPrimaryFormattingAxis(0);
		t24.setReadOnly(false);
		String[] var41 = new String[] {};
		t24.setColAxisDims(var41);
		PageTuple[] var42 = new PageTuple[] {};
		t24.setPageTuples(var42);
		String[] var43 = new String[] {};
		t24.setRowAxisDims(var43);
		t24.setLeftOffset(0);
		t24.setTopOffset(0);
		PafViewHeader[] var44 = new PafViewHeader[] {};
		t24.setPafViewHeaders(var44);
		LockedCell[] var45 = new LockedCell[] {};
		t24.setForwardPlannableLockedCell(var45);
		LockedCell[] var46 = new LockedCell[] {};
		t24.setNotPlannableLockedCells(var46);
		t24.setGenerationFormatName("");
		t24.setColumnWidth(t26);
		t24.setRowHeight(t27);
		t30.setDesc("");
		PafViewHeader[] var47 = new PafViewHeader[] {};
		t30.setHeaders(var47);
		t30.setName("");
		PafViewSection[] var48 = new PafViewSection[] {};
		t30.setViewSections(var48);
		t30.setBackGroundColor("");
		PafUserSelection[] var49 = new PafUserSelection[] {};
		t30.setUserSelections(var49);
		String[] var50 = new String[] {};
		t30.setViewSectionNames(var50);
		t30.setPageOrientation("");
		t30.setPagesTall(t31);
		t30.setPagesWide(t32);
		t33.setDesc("");
		PafViewHeader[] var51 = new PafViewHeader[] {};
		t33.setHeaders(var51);
		t33.setName("");
		PafViewSection[] var52 = new PafViewSection[] {};
		t33.setViewSections(var52);
		t33.setBackGroundColor("");
		PafUserSelection[] var53 = new PafUserSelection[] {};
		t33.setUserSelections(var53);
		String[] var54 = new String[] {};
		t33.setViewSectionNames(var54);
		t33.setPageOrientation("");
		t33.setPagesTall(t34);
		t33.setPagesWide(t35);
		PafView[] var55 = new PafView[] { t0, t1, t29, t30, t33, t36 };
		// jtest_tested_method
		PafMetaData.exportScreens(var55);
		assertEquals(t0, var55[0]); // jtest_unverified
		assertEquals(t1, var55[1]); // jtest_unverified
		assertEquals(t29, var55[2]); // jtest_unverified
		assertEquals(t36, var55[5]); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(false, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testExportScreens12.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExportScreens12(
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
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.sql.PreparedStatement.executeUpdate()");
				switch (index) {
					case 1 :
					case 2 :
					case 3 :
					case 4 :
						return new Integer(0);
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// 
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// 
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// 
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					case 5 :
						throw new SQLException();
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, XStream.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "toXML", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.thoughtworks.xstream.XStream.toXML(java.lang.Object)");
				switch (index) {
					case 1 :
						return "";
					// at com.palladium.utility.PafXStream.exportObjectToXml(PafXStream.java:141)
					// at com.palladium.paf.server.PafMetaData.exportViewSections(PafMetaData.java:223)
					// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:195)
					case 2 :
						return null;
					// at com.palladium.utility.PafXStream.exportObjectToXml(PafXStream.java:141)
					// at com.palladium.paf.server.PafMetaData.exportViews(PafMetaData.java:211)
					// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:198)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, File.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "createNewFile", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.utility.PafXStream.exportObjectToXml(PafXStream.java:146)
				// at com.palladium.paf.server.PafMetaData.exportViewSections(PafMetaData.java:223)
				// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:195)
				// 
				// at com.palladium.utility.PafXStream.exportObjectToXml(PafXStream.java:146)
				// at com.palladium.paf.server.PafMetaData.exportViews(PafMetaData.java:211)
				// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:198)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static exportScreens(com.palladium.paf.view.PafView[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#exportScreens(com.palladium.paf.view.PafView[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testExportScreens13() throws Throwable {
		PafView t0 = new PafView();
		PafView t1 = new PafView();
		Integer t2 = new Integer(0);
		Integer t3 = new Integer("0");
		PafView t4 = new PafView();
		PafView t5 = new PafView();
		Integer t6 = new Integer(0);
		Integer t7 = new Integer("0");
		PafView t8 = new PafView();
		Integer t9 = new Integer("0");
		Integer t10 = new Integer(0);
		PafView t11 = new PafView();
		PafView t12 = new PafView();
		t1.setDesc("");
		PafViewHeader[] var1 = new PafViewHeader[] {};
		t1.setHeaders(var1);
		t1.setName("");
		PafViewSection[] var2 = new PafViewSection[] {};
		t1.setViewSections(var2);
		t1.setBackGroundColor("");
		PafUserSelection[] var3 = new PafUserSelection[] {};
		t1.setUserSelections(var3);
		String[] var4 = new String[] {};
		t1.setViewSectionNames(var4);
		t1.setPageOrientation("");
		t1.setPagesTall(t2);
		t1.setPagesWide(t3);
		t5.setDesc("");
		PafViewHeader[] var5 = new PafViewHeader[] {};
		t5.setHeaders(var5);
		t5.setName("");
		PafViewSection[] var6 = new PafViewSection[] {};
		t5.setViewSections(var6);
		t5.setBackGroundColor("");
		PafUserSelection[] var7 = new PafUserSelection[] {};
		t5.setUserSelections(var7);
		String[] var8 = new String[] {};
		t5.setViewSectionNames(var8);
		t5.setPageOrientation("");
		t5.setPagesTall(t6);
		t5.setPagesWide(t7);
		t8.setDesc("");
		PafViewHeader[] var9 = new PafViewHeader[] {};
		t8.setHeaders(var9);
		t8.setName("");
		PafViewSection[] var10 = new PafViewSection[] {};
		t8.setViewSections(var10);
		t8.setBackGroundColor("");
		PafUserSelection[] var11 = new PafUserSelection[] {};
		t8.setUserSelections(var11);
		String[] var12 = new String[] {};
		t8.setViewSectionNames(var12);
		t8.setPageOrientation("");
		t8.setPagesTall(t9);
		t8.setPagesWide(t10);
		PafView[] var13 = new PafView[] { t0, t1, t4, t5, t8, t11, t12 };
		// jtest_tested_method
		PafMetaData.exportScreens(var13);
		assertEquals(t0, var13[0]); // jtest_unverified
		assertEquals(t1, var13[1]); // jtest_unverified
		assertEquals(t4, var13[2]); // jtest_unverified
		assertEquals(t12, var13[6]); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(false, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testExportScreens13.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExportScreens13(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isDebugMode", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:110)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafServerHome", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafMetaData.getConfigDirPath(PafMetaData.java:100)
				// at com.palladium.paf.server.PafMetaData.exportViewSections(PafMetaData.java:223)
				// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:195)
				// 
				// at com.palladium.paf.server.PafMetaData.getConfigDirPath(PafMetaData.java:100)
				// at com.palladium.paf.server.PafMetaData.exportViews(PafMetaData.java:211)
				// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:198)
			}
		}
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.sql.Connection.prepareStatement(java.lang.String)");
				switch (index) {
					case 1 :
					case 2 :
					case 3 :
					case 4 :
					case 5 :
						return Stubs.makeStubObject(PreparedStatement.class);
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// 
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// 
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// 
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// 
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					case 6 :
						throw new SQLException();
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PafView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getViewSections", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.view.PafView.getViewSections()");
				switch (index) {
					case 1 :
						return null;
					// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:164)
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
						return new PafViewSection[0];
					// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:164)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { PafViewSection[].class };
			if (Stubs.matches(method, "setViewSections", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:190)
			}
			argument_types = new Class[] { String[].class };
			if (Stubs.matches(method, "setViewSectionNames", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:185)
			}
		}
		if (Stubs.matches(method, XStream.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "toXML", argument_types)) {
				return null;
				// at com.palladium.utility.PafXStream.exportObjectToXml(PafXStream.java:141)
				// at com.palladium.paf.server.PafMetaData.exportViewSections(PafMetaData.java:223)
				// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:195)
				// 
				// at com.palladium.utility.PafXStream.exportObjectToXml(PafXStream.java:141)
				// at com.palladium.paf.server.PafMetaData.exportViews(PafMetaData.java:211)
				// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:198)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static exportScreens(com.palladium.paf.view.PafView[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#exportScreens(com.palladium.paf.view.PafView[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testExportScreens14() throws Throwable {
		PafView t0 = new PafView();
		PafView t1 = new PafView();
		Integer t2 = new Integer(0);
		Integer t3 = new Integer("0");
		PafViewSection t4 = new PafViewSection();
		PafViewSection t5 = new PafViewSection();
		PafDataSlice t6 = new PafDataSlice((double[]) null, 0);
		Integer t7 = new Integer(0);
		Integer t8 = new Integer("0");
		PafViewSection t9 = new PafViewSection();
		PafViewSection t10 = new PafViewSection();
		PafDataSlice t11 = new PafDataSlice();
		Integer t12 = new Integer("0");
		Integer t13 = new Integer(0);
		PafViewSection t14 = new PafViewSection();
		PafDataSlice t15 = new PafDataSlice((double[]) null, 0);
		Integer t16 = new Integer(0);
		Integer t17 = new Integer("0");
		PafViewSection t18 = new PafViewSection();
		PafViewSection t19 = new PafViewSection();
		PafViewSection t20 = new PafViewSection();
		PafDataSlice t21 = new PafDataSlice();
		Integer t22 = new Integer("0");
		Integer t23 = new Integer(0);
		PafViewSection t24 = new PafViewSection();
		PafDataSlice t25 = new PafDataSlice();
		Integer t26 = new Integer(0);
		Integer t27 = new Integer("0");
		PafViewSection t28 = new PafViewSection();
		PafView t29 = new PafView();
		PafView t30 = new PafView();
		Integer t31 = new Integer("0");
		Integer t32 = new Integer(0);
		PafView t33 = new PafView();
		Integer t34 = new Integer(0);
		Integer t35 = new Integer("0");
		PafView t36 = new PafView();
		t1.setDesc("");
		PafViewHeader[] var1 = new PafViewHeader[] {};
		t1.setHeaders(var1);
		t1.setName("");
		PafViewSection[] var2 = new PafViewSection[] { t4, t5, t9, t10, t14,
				t18, t19, t20, t24, t28 };
		t1.setViewSections(var2);
		t1.setBackGroundColor("");
		PafUserSelection[] var3 = new PafUserSelection[] {};
		t1.setUserSelections(var3);
		String[] var4 = new String[] {};
		t1.setViewSectionNames(var4);
		t1.setPageOrientation("");
		t1.setPagesTall(t2);
		t1.setPagesWide(t3);
		t5.setDescription("");
		t5.setName("");
		ViewTuple[] var5 = new ViewTuple[] {};
		t5.setColTuples(var5);
		ViewTuple[] var6 = new ViewTuple[] {};
		t5.setRowTuples(var6);
		t5.setPafDataSlice(t6);
		t5.setDataAlias("");
		t5.setManaged(false);
		t5.setPrimaryFormattingAxis(0);
		t5.setReadOnly(false);
		String[] var7 = new String[] {};
		t5.setColAxisDims(var7);
		PageTuple[] var8 = new PageTuple[] {};
		t5.setPageTuples(var8);
		String[] var9 = new String[] {};
		t5.setRowAxisDims(var9);
		t5.setLeftOffset(0);
		t5.setTopOffset(0);
		PafViewHeader[] var10 = new PafViewHeader[] {};
		t5.setPafViewHeaders(var10);
		LockedCell[] var11 = new LockedCell[] {};
		t5.setForwardPlannableLockedCell(var11);
		LockedCell[] var12 = new LockedCell[] {};
		t5.setNotPlannableLockedCells(var12);
		t5.setGenerationFormatName("");
		t5.setColumnWidth(t7);
		t5.setRowHeight(t8);
		t10.setDescription("");
		t10.setName("");
		ViewTuple[] var13 = new ViewTuple[] {};
		t10.setColTuples(var13);
		ViewTuple[] var14 = new ViewTuple[] {};
		t10.setRowTuples(var14);
		t11.setColumnCount(0);
		double[] var15 = new double[] {};
		t11.setData(var15);
		t11.setCompressedData("");
		t11.setCompressed(false);
		t10.setPafDataSlice(t11);
		t10.setDataAlias("");
		t10.setManaged(false);
		t10.setPrimaryFormattingAxis(0);
		t10.setReadOnly(false);
		String[] var16 = new String[] {};
		t10.setColAxisDims(var16);
		PageTuple[] var17 = new PageTuple[] {};
		t10.setPageTuples(var17);
		String[] var18 = new String[] {};
		t10.setRowAxisDims(var18);
		t10.setLeftOffset(0);
		t10.setTopOffset(0);
		PafViewHeader[] var19 = new PafViewHeader[] {};
		t10.setPafViewHeaders(var19);
		LockedCell[] var20 = new LockedCell[] {};
		t10.setForwardPlannableLockedCell(var20);
		LockedCell[] var21 = new LockedCell[] {};
		t10.setNotPlannableLockedCells(var21);
		t10.setGenerationFormatName("");
		t10.setColumnWidth(t12);
		t10.setRowHeight(t13);
		t14.setDescription("");
		t14.setName("");
		ViewTuple[] var22 = new ViewTuple[] {};
		t14.setColTuples(var22);
		ViewTuple[] var23 = new ViewTuple[] {};
		t14.setRowTuples(var23);
		t15.setColumnCount(0);
		double[] var24 = new double[] {};
		t15.setData(var24);
		t15.setCompressedData("");
		t15.setCompressed(false);
		t14.setPafDataSlice(t15);
		t14.setDataAlias("");
		t14.setManaged(false);
		t14.setPrimaryFormattingAxis(0);
		t14.setReadOnly(false);
		String[] var25 = new String[] {};
		t14.setColAxisDims(var25);
		PageTuple[] var26 = new PageTuple[] {};
		t14.setPageTuples(var26);
		String[] var27 = new String[] {};
		t14.setRowAxisDims(var27);
		t14.setLeftOffset(0);
		t14.setTopOffset(0);
		PafViewHeader[] var28 = new PafViewHeader[] {};
		t14.setPafViewHeaders(var28);
		LockedCell[] var29 = new LockedCell[] {};
		t14.setForwardPlannableLockedCell(var29);
		LockedCell[] var30 = new LockedCell[] {};
		t14.setNotPlannableLockedCells(var30);
		t14.setGenerationFormatName("");
		t14.setColumnWidth(t16);
		t14.setRowHeight(t17);
		t20.setDescription("");
		t20.setName("");
		ViewTuple[] var31 = new ViewTuple[] {};
		t20.setColTuples(var31);
		ViewTuple[] var32 = new ViewTuple[] {};
		t20.setRowTuples(var32);
		t20.setPafDataSlice(t21);
		t20.setDataAlias("");
		t20.setManaged(false);
		t20.setPrimaryFormattingAxis(0);
		t20.setReadOnly(false);
		String[] var33 = new String[] {};
		t20.setColAxisDims(var33);
		PageTuple[] var34 = new PageTuple[] {};
		t20.setPageTuples(var34);
		String[] var35 = new String[] {};
		t20.setRowAxisDims(var35);
		t20.setLeftOffset(0);
		t20.setTopOffset(0);
		PafViewHeader[] var36 = new PafViewHeader[] {};
		t20.setPafViewHeaders(var36);
		LockedCell[] var37 = new LockedCell[] {};
		t20.setForwardPlannableLockedCell(var37);
		LockedCell[] var38 = new LockedCell[] {};
		t20.setNotPlannableLockedCells(var38);
		t20.setGenerationFormatName("");
		t20.setColumnWidth(t22);
		t20.setRowHeight(t23);
		t24.setDescription("");
		t24.setName("");
		ViewTuple[] var39 = new ViewTuple[] {};
		t24.setColTuples(var39);
		ViewTuple[] var40 = new ViewTuple[] {};
		t24.setRowTuples(var40);
		t24.setPafDataSlice(t25);
		t24.setDataAlias("");
		t24.setManaged(false);
		t24.setPrimaryFormattingAxis(0);
		t24.setReadOnly(false);
		String[] var41 = new String[] {};
		t24.setColAxisDims(var41);
		PageTuple[] var42 = new PageTuple[] {};
		t24.setPageTuples(var42);
		String[] var43 = new String[] {};
		t24.setRowAxisDims(var43);
		t24.setLeftOffset(0);
		t24.setTopOffset(0);
		PafViewHeader[] var44 = new PafViewHeader[] {};
		t24.setPafViewHeaders(var44);
		LockedCell[] var45 = new LockedCell[] {};
		t24.setForwardPlannableLockedCell(var45);
		LockedCell[] var46 = new LockedCell[] {};
		t24.setNotPlannableLockedCells(var46);
		t24.setGenerationFormatName("");
		t24.setColumnWidth(t26);
		t24.setRowHeight(t27);
		t30.setDesc("");
		PafViewHeader[] var47 = new PafViewHeader[] {};
		t30.setHeaders(var47);
		t30.setName("");
		PafViewSection[] var48 = new PafViewSection[] {};
		t30.setViewSections(var48);
		t30.setBackGroundColor("");
		PafUserSelection[] var49 = new PafUserSelection[] {};
		t30.setUserSelections(var49);
		String[] var50 = new String[] {};
		t30.setViewSectionNames(var50);
		t30.setPageOrientation("");
		t30.setPagesTall(t31);
		t30.setPagesWide(t32);
		t33.setDesc("");
		PafViewHeader[] var51 = new PafViewHeader[] {};
		t33.setHeaders(var51);
		t33.setName("");
		PafViewSection[] var52 = new PafViewSection[] {};
		t33.setViewSections(var52);
		t33.setBackGroundColor("");
		PafUserSelection[] var53 = new PafUserSelection[] {};
		t33.setUserSelections(var53);
		String[] var54 = new String[] {};
		t33.setViewSectionNames(var54);
		t33.setPageOrientation("");
		t33.setPagesTall(t34);
		t33.setPagesWide(t35);
		PafView[] var55 = new PafView[] { t0, t1, t29, t30, t33, t36 };
		// jtest_tested_method
		PafMetaData.exportScreens(var55);
		assertEquals(t0, var55[0]); // jtest_unverified
		assertEquals(t1, var55[1]); // jtest_unverified
		assertEquals(t29, var55[2]); // jtest_unverified
		assertEquals(t36, var55[5]); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testExportScreens14.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExportScreens14(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isDebugMode", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:110)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafServerHome", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafMetaData.getConfigDirPath(PafMetaData.java:100)
				// at com.palladium.paf.server.PafMetaData.exportViewSections(PafMetaData.java:223)
				// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:195)
				// 
				// at com.palladium.paf.server.PafMetaData.getConfigDirPath(PafMetaData.java:100)
				// at com.palladium.paf.server.PafMetaData.exportViews(PafMetaData.java:211)
				// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:198)
			}
		}
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.sql.Connection.prepareStatement(java.lang.String)");
				switch (index) {
					case 1 :
					case 2 :
					case 3 :
					case 4 :
						return Stubs.makeStubObject(PreparedStatement.class);
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// 
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// 
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// 
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					case 5 :
						throw new SQLException();
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				return Stubs.makeStubObject(DatabaseMetaData.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:74)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
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
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverName", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverVersion", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "supportsResultSetType", argument_types)) {
				return Boolean.TRUE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:80)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "supportsBatchUpdates", argument_types)) {
				return Boolean.TRUE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:81)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, XStream.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "toXML", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.thoughtworks.xstream.XStream.toXML(java.lang.Object)");
				switch (index) {
					case 1 :
						return "";
					// at com.palladium.utility.PafXStream.exportObjectToXml(PafXStream.java:141)
					// at com.palladium.paf.server.PafMetaData.exportViewSections(PafMetaData.java:223)
					// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:195)
					case 2 :
						return null;
					// at com.palladium.utility.PafXStream.exportObjectToXml(PafXStream.java:141)
					// at com.palladium.paf.server.PafMetaData.exportViews(PafMetaData.java:211)
					// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:198)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static exportScreens(com.palladium.paf.view.PafView[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#exportScreens(com.palladium.paf.view.PafView[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testExportScreens15() throws Throwable {
		PafView t0 = new PafView();
		Integer t1 = new Integer(0);
		Integer t2 = new Integer("0");
		PafView t3 = new PafView();
		PafView t4 = new PafView();
		PafView t5 = new PafView();
		Integer t6 = new Integer(0);
		Integer t7 = new Integer("0");
		PafView t8 = new PafView();
		Integer t9 = new Integer("0");
		Integer t10 = new Integer(0);
		PafView t11 = new PafView();
		PafView t12 = new PafView();
		PafView t13 = new PafView();
		Integer t14 = new Integer(0);
		Integer t15 = new Integer("0");
		PafView t16 = new PafView();
		Integer t17 = new Integer("0");
		Integer t18 = new Integer(0);
		t0.setDesc("");
		PafViewHeader[] var1 = new PafViewHeader[] {};
		t0.setHeaders(var1);
		t0.setName("");
		PafViewSection[] var2 = new PafViewSection[] {};
		t0.setViewSections(var2);
		t0.setBackGroundColor("");
		PafUserSelection[] var3 = new PafUserSelection[] {};
		t0.setUserSelections(var3);
		String[] var4 = new String[] {};
		t0.setViewSectionNames(var4);
		t0.setPageOrientation("");
		t0.setPagesTall(t1);
		t0.setPagesWide(t2);
		t5.setDesc("");
		PafViewHeader[] var5 = new PafViewHeader[] {};
		t5.setHeaders(var5);
		t5.setName("");
		PafViewSection[] var6 = new PafViewSection[] {};
		t5.setViewSections(var6);
		t5.setBackGroundColor("");
		PafUserSelection[] var7 = new PafUserSelection[] {};
		t5.setUserSelections(var7);
		String[] var8 = new String[] {};
		t5.setViewSectionNames(var8);
		t5.setPageOrientation("");
		t5.setPagesTall(t6);
		t5.setPagesWide(t7);
		t8.setDesc("");
		PafViewHeader[] var9 = new PafViewHeader[] {};
		t8.setHeaders(var9);
		t8.setName("");
		PafViewSection[] var10 = new PafViewSection[] {};
		t8.setViewSections(var10);
		t8.setBackGroundColor("");
		PafUserSelection[] var11 = new PafUserSelection[] {};
		t8.setUserSelections(var11);
		String[] var12 = new String[] {};
		t8.setViewSectionNames(var12);
		t8.setPageOrientation("");
		t8.setPagesTall(t9);
		t8.setPagesWide(t10);
		t13.setDesc("");
		PafViewHeader[] var13 = new PafViewHeader[] {};
		t13.setHeaders(var13);
		t13.setName("");
		PafViewSection[] var14 = new PafViewSection[] {};
		t13.setViewSections(var14);
		t13.setBackGroundColor("");
		PafUserSelection[] var15 = new PafUserSelection[] {};
		t13.setUserSelections(var15);
		String[] var16 = new String[] {};
		t13.setViewSectionNames(var16);
		t13.setPageOrientation("");
		t13.setPagesTall(t14);
		t13.setPagesWide(t15);
		t16.setDesc("");
		PafViewHeader[] var17 = new PafViewHeader[] {};
		t16.setHeaders(var17);
		t16.setName("");
		PafViewSection[] var18 = new PafViewSection[] {};
		t16.setViewSections(var18);
		t16.setBackGroundColor("");
		PafUserSelection[] var19 = new PafUserSelection[] {};
		t16.setUserSelections(var19);
		String[] var20 = new String[] {};
		t16.setViewSectionNames(var20);
		t16.setPageOrientation("");
		t16.setPagesTall(t17);
		t16.setPagesWide(t18);
		PafView[] var21 = new PafView[] { t0, t3, t4, t5, t8, t11, t12, t13,
				t16 };
		// jtest_tested_method
		PafMetaData.exportScreens(var21);
		assertEquals(t0, var21[0]); // jtest_unverified
		assertEquals(t3, var21[1]); // jtest_unverified
		assertEquals(t4, var21[2]); // jtest_unverified
		assertEquals(t16, var21[8]); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(false, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testExportScreens15.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExportScreens15(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isDebugMode", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:110)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafServerHome", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafMetaData.getConfigDirPath(PafMetaData.java:100)
				// at com.palladium.paf.server.PafMetaData.exportViewSections(PafMetaData.java:223)
				// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:195)
				// 
				// at com.palladium.paf.server.PafMetaData.getConfigDirPath(PafMetaData.java:100)
				// at com.palladium.paf.server.PafMetaData.exportViews(PafMetaData.java:211)
				// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:198)
			}
		}
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.sql.Connection.prepareStatement(java.lang.String)");
				switch (index) {
					case 1 :
					case 2 :
					case 3 :
					case 4 :
					case 5 :
					case 6 :
						return Stubs.makeStubObject(PreparedStatement.class);
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// 
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// 
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// 
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// 
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// 
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					case 7 :
						throw new SQLException();
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PafView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getViewSections", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.view.PafView.getViewSections()");
				switch (index) {
					case 1 :
						return null;
					// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:164)
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
						return new PafViewSection[0];
					// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:164)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { PafViewSection[].class };
			if (Stubs.matches(method, "setViewSections", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:190)
			}
			argument_types = new Class[] { String[].class };
			if (Stubs.matches(method, "setViewSectionNames", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:185)
			}
		}
		if (Stubs.matches(method, XStream.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "toXML", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.thoughtworks.xstream.XStream.toXML(java.lang.Object)");
				switch (index) {
					case 1 :
						return "";
					// at com.palladium.utility.PafXStream.exportObjectToXml(PafXStream.java:141)
					// at com.palladium.paf.server.PafMetaData.exportViewSections(PafMetaData.java:223)
					// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:195)
					case 2 :
						return null;
					// at com.palladium.utility.PafXStream.exportObjectToXml(PafXStream.java:141)
					// at com.palladium.paf.server.PafMetaData.exportViews(PafMetaData.java:211)
					// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:198)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static exportScreens(com.palladium.paf.view.PafView[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#exportScreens(com.palladium.paf.view.PafView[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testExportScreens16() throws Throwable {
		PafView t0 = new PafView();
		PafView t1 = new PafView();
		Integer t2 = new Integer(0);
		Integer t3 = new Integer("0");
		PafView t4 = new PafView();
		PafView t5 = new PafView();
		Integer t6 = new Integer(0);
		Integer t7 = new Integer("0");
		PafView t8 = new PafView();
		Integer t9 = new Integer("0");
		Integer t10 = new Integer(0);
		PafView t11 = new PafView();
		PafView t12 = new PafView();
		PafView t13 = new PafView();
		Integer t14 = new Integer(0);
		Integer t15 = new Integer("0");
		PafView t16 = new PafView();
		Integer t17 = new Integer("0");
		Integer t18 = new Integer(0);
		PafView t19 = new PafView();
		t1.setDesc("");
		PafViewHeader[] var1 = new PafViewHeader[] {};
		t1.setHeaders(var1);
		t1.setName("");
		PafViewSection[] var2 = new PafViewSection[] {};
		t1.setViewSections(var2);
		t1.setBackGroundColor("");
		PafUserSelection[] var3 = new PafUserSelection[] {};
		t1.setUserSelections(var3);
		String[] var4 = new String[] {};
		t1.setViewSectionNames(var4);
		t1.setPageOrientation("");
		t1.setPagesTall(t2);
		t1.setPagesWide(t3);
		t5.setDesc("");
		PafViewHeader[] var5 = new PafViewHeader[] {};
		t5.setHeaders(var5);
		t5.setName("");
		PafViewSection[] var6 = new PafViewSection[] {};
		t5.setViewSections(var6);
		t5.setBackGroundColor("");
		PafUserSelection[] var7 = new PafUserSelection[] {};
		t5.setUserSelections(var7);
		String[] var8 = new String[] {};
		t5.setViewSectionNames(var8);
		t5.setPageOrientation("");
		t5.setPagesTall(t6);
		t5.setPagesWide(t7);
		t8.setDesc("");
		PafViewHeader[] var9 = new PafViewHeader[] {};
		t8.setHeaders(var9);
		t8.setName("");
		PafViewSection[] var10 = new PafViewSection[] {};
		t8.setViewSections(var10);
		t8.setBackGroundColor("");
		PafUserSelection[] var11 = new PafUserSelection[] {};
		t8.setUserSelections(var11);
		String[] var12 = new String[] {};
		t8.setViewSectionNames(var12);
		t8.setPageOrientation("");
		t8.setPagesTall(t9);
		t8.setPagesWide(t10);
		t13.setDesc("");
		PafViewHeader[] var13 = new PafViewHeader[] {};
		t13.setHeaders(var13);
		t13.setName("");
		PafViewSection[] var14 = new PafViewSection[] {};
		t13.setViewSections(var14);
		t13.setBackGroundColor("");
		PafUserSelection[] var15 = new PafUserSelection[] {};
		t13.setUserSelections(var15);
		String[] var16 = new String[] {};
		t13.setViewSectionNames(var16);
		t13.setPageOrientation("");
		t13.setPagesTall(t14);
		t13.setPagesWide(t15);
		t16.setDesc("");
		PafViewHeader[] var17 = new PafViewHeader[] {};
		t16.setHeaders(var17);
		t16.setName("");
		PafViewSection[] var18 = new PafViewSection[] {};
		t16.setViewSections(var18);
		t16.setBackGroundColor("");
		PafUserSelection[] var19 = new PafUserSelection[] {};
		t16.setUserSelections(var19);
		String[] var20 = new String[] {};
		t16.setViewSectionNames(var20);
		t16.setPageOrientation("");
		t16.setPagesTall(t17);
		t16.setPagesWide(t18);
		PafView[] var21 = new PafView[] { t0, t1, t4, t5, t8, t11, t12, t13,
				t16, t19 };
		// jtest_tested_method
		PafMetaData.exportScreens(var21);
		assertEquals(t0, var21[0]); // jtest_unverified
		assertEquals(t1, var21[1]); // jtest_unverified
		assertEquals(t4, var21[2]); // jtest_unverified
		assertEquals(t19, var21[9]); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(false, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testExportScreens16.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExportScreens16(
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
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.sql.PreparedStatement.executeUpdate()");
				switch (index) {
					case 1 :
					case 2 :
					case 3 :
					case 4 :
					case 5 :
					case 6 :
						return new Integer(0);
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// 
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// 
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// 
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// 
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// 
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					case 7 :
						throw new SQLException();
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, XStream.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "toXML", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.thoughtworks.xstream.XStream.toXML(java.lang.Object)");
				switch (index) {
					case 1 :
						return "";
					// at com.palladium.utility.PafXStream.exportObjectToXml(PafXStream.java:141)
					// at com.palladium.paf.server.PafMetaData.exportViewSections(PafMetaData.java:223)
					// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:195)
					case 2 :
						return "0";
					// at com.palladium.utility.PafXStream.exportObjectToXml(PafXStream.java:141)
					// at com.palladium.paf.server.PafMetaData.exportViews(PafMetaData.java:211)
					// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:198)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, File.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "createNewFile", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.utility.PafXStream.exportObjectToXml(PafXStream.java:146)
				// at com.palladium.paf.server.PafMetaData.exportViewSections(PafMetaData.java:223)
				// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:195)
				// 
				// at com.palladium.utility.PafXStream.exportObjectToXml(PafXStream.java:146)
				// at com.palladium.paf.server.PafMetaData.exportViews(PafMetaData.java:211)
				// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:198)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static exportScreens(com.palladium.paf.view.PafView[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#exportScreens(com.palladium.paf.view.PafView[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testExportScreens17() throws Throwable {
		PafView t0 = new PafView();
		PafView t1 = new PafView();
		Integer t2 = new Integer(0);
		Integer t3 = new Integer("0");
		PafView t4 = new PafView();
		PafView t5 = new PafView();
		Integer t6 = new Integer(0);
		Integer t7 = new Integer("0");
		PafView t8 = new PafView();
		Integer t9 = new Integer("0");
		Integer t10 = new Integer(0);
		PafView t11 = new PafView();
		PafView t12 = new PafView();
		t1.setDesc("");
		PafViewHeader[] var1 = new PafViewHeader[] {};
		t1.setHeaders(var1);
		t1.setName("");
		PafViewSection[] var2 = new PafViewSection[] {};
		t1.setViewSections(var2);
		t1.setBackGroundColor("");
		PafUserSelection[] var3 = new PafUserSelection[] {};
		t1.setUserSelections(var3);
		String[] var4 = new String[] {};
		t1.setViewSectionNames(var4);
		t1.setPageOrientation("");
		t1.setPagesTall(t2);
		t1.setPagesWide(t3);
		t5.setDesc("");
		PafViewHeader[] var5 = new PafViewHeader[] {};
		t5.setHeaders(var5);
		t5.setName("");
		PafViewSection[] var6 = new PafViewSection[] {};
		t5.setViewSections(var6);
		t5.setBackGroundColor("");
		PafUserSelection[] var7 = new PafUserSelection[] {};
		t5.setUserSelections(var7);
		String[] var8 = new String[] {};
		t5.setViewSectionNames(var8);
		t5.setPageOrientation("");
		t5.setPagesTall(t6);
		t5.setPagesWide(t7);
		t8.setDesc("");
		PafViewHeader[] var9 = new PafViewHeader[] {};
		t8.setHeaders(var9);
		t8.setName("");
		PafViewSection[] var10 = new PafViewSection[] {};
		t8.setViewSections(var10);
		t8.setBackGroundColor("");
		PafUserSelection[] var11 = new PafUserSelection[] {};
		t8.setUserSelections(var11);
		String[] var12 = new String[] {};
		t8.setViewSectionNames(var12);
		t8.setPageOrientation("");
		t8.setPagesTall(t9);
		t8.setPagesWide(t10);
		PafView[] var13 = new PafView[] { t0, t1, t4, t5, t8, t11, t12 };
		// jtest_tested_method
		PafMetaData.exportScreens(var13);
		assertEquals(t0, var13[0]); // jtest_unverified
		assertEquals(t1, var13[1]); // jtest_unverified
		assertEquals(t4, var13[2]); // jtest_unverified
		assertEquals(t12, var13[6]); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testExportScreens17.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExportScreens17(
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
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				return Stubs.makeStubObject(DatabaseMetaData.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:74)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.sql.PreparedStatement.executeUpdate()");
				switch (index) {
					case 1 :
					case 2 :
					case 3 :
					case 4 :
						return new Integer(0);
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// 
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// 
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// 
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					case 5 :
						throw new SQLException();
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
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
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverName", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverVersion", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "supportsResultSetType", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:80)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "supportsBatchUpdates", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:81)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PafView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getViewSections", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.view.PafView.getViewSections()");
				switch (index) {
					case 1 :
						return null;
					// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:164)
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
						return new PafViewSection[0];
					// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:164)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { PafViewSection[].class };
			if (Stubs.matches(method, "setViewSections", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:190)
			}
			argument_types = new Class[] { String[].class };
			if (Stubs.matches(method, "setViewSectionNames", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:185)
			}
		}
		if (Stubs.matches(method, XStream.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "toXML", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.thoughtworks.xstream.XStream.toXML(java.lang.Object)");
				switch (index) {
					case 1 :
						return null;
					// at com.palladium.utility.PafXStream.exportObjectToXml(PafXStream.java:141)
					// at com.palladium.paf.server.PafMetaData.exportViewSections(PafMetaData.java:223)
					// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:195)
					case 2 :
						return "";
					// at com.palladium.utility.PafXStream.exportObjectToXml(PafXStream.java:141)
					// at com.palladium.paf.server.PafMetaData.exportViews(PafMetaData.java:211)
					// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:198)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, File.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "createNewFile", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.utility.PafXStream.exportObjectToXml(PafXStream.java:146)
				// at com.palladium.paf.server.PafMetaData.exportViewSections(PafMetaData.java:223)
				// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:195)
				// 
				// at com.palladium.utility.PafXStream.exportObjectToXml(PafXStream.java:146)
				// at com.palladium.paf.server.PafMetaData.exportViews(PafMetaData.java:211)
				// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:198)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static exportScreens(com.palladium.paf.view.PafView[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#exportScreens(com.palladium.paf.view.PafView[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testExportScreens19() throws Throwable {
		PafView t0 = new PafView();
		Integer t1 = new Integer(0);
		Integer t2 = new Integer("0");
		PafView t3 = new PafView();
		PafView t4 = new PafView();
		PafView t5 = new PafView();
		Integer t6 = new Integer(0);
		Integer t7 = new Integer("0");
		PafView t8 = new PafView();
		Integer t9 = new Integer("0");
		Integer t10 = new Integer(0);
		PafView t11 = new PafView();
		PafView t12 = new PafView();
		PafView t13 = new PafView();
		Integer t14 = new Integer(0);
		Integer t15 = new Integer("0");
		PafView t16 = new PafView();
		Integer t17 = new Integer("0");
		Integer t18 = new Integer(0);
		t0.setDesc("");
		PafViewHeader[] var1 = new PafViewHeader[] {};
		t0.setHeaders(var1);
		t0.setName("");
		PafViewSection[] var2 = new PafViewSection[] {};
		t0.setViewSections(var2);
		t0.setBackGroundColor("");
		PafUserSelection[] var3 = new PafUserSelection[] {};
		t0.setUserSelections(var3);
		String[] var4 = new String[] {};
		t0.setViewSectionNames(var4);
		t0.setPageOrientation("");
		t0.setPagesTall(t1);
		t0.setPagesWide(t2);
		t5.setDesc("");
		PafViewHeader[] var5 = new PafViewHeader[] {};
		t5.setHeaders(var5);
		t5.setName("");
		PafViewSection[] var6 = new PafViewSection[] {};
		t5.setViewSections(var6);
		t5.setBackGroundColor("");
		PafUserSelection[] var7 = new PafUserSelection[] {};
		t5.setUserSelections(var7);
		String[] var8 = new String[] {};
		t5.setViewSectionNames(var8);
		t5.setPageOrientation("");
		t5.setPagesTall(t6);
		t5.setPagesWide(t7);
		t8.setDesc("");
		PafViewHeader[] var9 = new PafViewHeader[] {};
		t8.setHeaders(var9);
		t8.setName("");
		PafViewSection[] var10 = new PafViewSection[] {};
		t8.setViewSections(var10);
		t8.setBackGroundColor("");
		PafUserSelection[] var11 = new PafUserSelection[] {};
		t8.setUserSelections(var11);
		String[] var12 = new String[] {};
		t8.setViewSectionNames(var12);
		t8.setPageOrientation("");
		t8.setPagesTall(t9);
		t8.setPagesWide(t10);
		t13.setDesc("");
		PafViewHeader[] var13 = new PafViewHeader[] {};
		t13.setHeaders(var13);
		t13.setName("");
		PafViewSection[] var14 = new PafViewSection[] {};
		t13.setViewSections(var14);
		t13.setBackGroundColor("");
		PafUserSelection[] var15 = new PafUserSelection[] {};
		t13.setUserSelections(var15);
		String[] var16 = new String[] {};
		t13.setViewSectionNames(var16);
		t13.setPageOrientation("");
		t13.setPagesTall(t14);
		t13.setPagesWide(t15);
		t16.setDesc("");
		PafViewHeader[] var17 = new PafViewHeader[] {};
		t16.setHeaders(var17);
		t16.setName("");
		PafViewSection[] var18 = new PafViewSection[] {};
		t16.setViewSections(var18);
		t16.setBackGroundColor("");
		PafUserSelection[] var19 = new PafUserSelection[] {};
		t16.setUserSelections(var19);
		String[] var20 = new String[] {};
		t16.setViewSectionNames(var20);
		t16.setPageOrientation("");
		t16.setPagesTall(t17);
		t16.setPagesWide(t18);
		PafView[] var21 = new PafView[] { t0, t3, t4, t5, t8, t11, t12, t13,
				t16 };
		// jtest_tested_method
		PafMetaData.exportScreens(var21);
		assertEquals(t0, var21[0]); // jtest_unverified
		assertEquals(t3, var21[1]); // jtest_unverified
		assertEquals(t4, var21[2]); // jtest_unverified
		assertEquals(t16, var21[8]); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testExportScreens19.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExportScreens19(
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
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				return Stubs.makeStubObject(DatabaseMetaData.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:74)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.sql.PreparedStatement.executeUpdate()");
				switch (index) {
					case 1 :
					case 2 :
					case 3 :
					case 4 :
					case 5 :
						return new Integer(0);
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// 
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// 
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// 
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// 
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					case 6 :
						throw new SQLException();
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
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
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverName", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverVersion", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "supportsResultSetType", argument_types)) {
				return Boolean.TRUE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:80)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "supportsBatchUpdates", argument_types)) {
				return Boolean.TRUE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:81)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PafView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getViewSections", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.view.PafView.getViewSections()");
				switch (index) {
					case 1 :
						return null;
					// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:164)
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
						return new PafViewSection[0];
					// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:164)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { PafViewSection[].class };
			if (Stubs.matches(method, "setViewSections", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:190)
			}
			argument_types = new Class[] { String[].class };
			if (Stubs.matches(method, "setViewSectionNames", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:185)
			}
		}
		if (Stubs.matches(method, XStream.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "toXML", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.thoughtworks.xstream.XStream.toXML(java.lang.Object)");
				switch (index) {
					case 1 :
						return "";
					// at com.palladium.utility.PafXStream.exportObjectToXml(PafXStream.java:141)
					// at com.palladium.paf.server.PafMetaData.exportViewSections(PafMetaData.java:223)
					// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:195)
					case 2 :
						return "0";
					// at com.palladium.utility.PafXStream.exportObjectToXml(PafXStream.java:141)
					// at com.palladium.paf.server.PafMetaData.exportViews(PafMetaData.java:211)
					// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:198)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, File.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "createNewFile", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.utility.PafXStream.exportObjectToXml(PafXStream.java:146)
				// at com.palladium.paf.server.PafMetaData.exportViewSections(PafMetaData.java:223)
				// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:195)
				// 
				// at com.palladium.utility.PafXStream.exportObjectToXml(PafXStream.java:146)
				// at com.palladium.paf.server.PafMetaData.exportViews(PafMetaData.java:211)
				// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:198)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static exportScreens(com.palladium.paf.view.PafView[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#exportScreens(com.palladium.paf.view.PafView[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testExportScreens20() throws Throwable {
		PafView t0 = new PafView();
		PafView t1 = new PafView();
		Integer t2 = new Integer(0);
		Integer t3 = new Integer("0");
		PafView t4 = new PafView();
		PafView t5 = new PafView();
		Integer t6 = new Integer(0);
		Integer t7 = new Integer("0");
		PafView t8 = new PafView();
		Integer t9 = new Integer("0");
		Integer t10 = new Integer(0);
		PafView t11 = new PafView();
		PafView t12 = new PafView();
		PafView t13 = new PafView();
		Integer t14 = new Integer(0);
		Integer t15 = new Integer("0");
		PafView t16 = new PafView();
		Integer t17 = new Integer("0");
		Integer t18 = new Integer(0);
		PafView t19 = new PafView();
		t1.setDesc("");
		PafViewHeader[] var1 = new PafViewHeader[] {};
		t1.setHeaders(var1);
		t1.setName("");
		PafViewSection[] var2 = new PafViewSection[] {};
		t1.setViewSections(var2);
		t1.setBackGroundColor("");
		PafUserSelection[] var3 = new PafUserSelection[] {};
		t1.setUserSelections(var3);
		String[] var4 = new String[] {};
		t1.setViewSectionNames(var4);
		t1.setPageOrientation("");
		t1.setPagesTall(t2);
		t1.setPagesWide(t3);
		t5.setDesc("");
		PafViewHeader[] var5 = new PafViewHeader[] {};
		t5.setHeaders(var5);
		t5.setName("");
		PafViewSection[] var6 = new PafViewSection[] {};
		t5.setViewSections(var6);
		t5.setBackGroundColor("");
		PafUserSelection[] var7 = new PafUserSelection[] {};
		t5.setUserSelections(var7);
		String[] var8 = new String[] {};
		t5.setViewSectionNames(var8);
		t5.setPageOrientation("");
		t5.setPagesTall(t6);
		t5.setPagesWide(t7);
		t8.setDesc("");
		PafViewHeader[] var9 = new PafViewHeader[] {};
		t8.setHeaders(var9);
		t8.setName("");
		PafViewSection[] var10 = new PafViewSection[] {};
		t8.setViewSections(var10);
		t8.setBackGroundColor("");
		PafUserSelection[] var11 = new PafUserSelection[] {};
		t8.setUserSelections(var11);
		String[] var12 = new String[] {};
		t8.setViewSectionNames(var12);
		t8.setPageOrientation("");
		t8.setPagesTall(t9);
		t8.setPagesWide(t10);
		t13.setDesc("");
		PafViewHeader[] var13 = new PafViewHeader[] {};
		t13.setHeaders(var13);
		t13.setName("");
		PafViewSection[] var14 = new PafViewSection[] {};
		t13.setViewSections(var14);
		t13.setBackGroundColor("");
		PafUserSelection[] var15 = new PafUserSelection[] {};
		t13.setUserSelections(var15);
		String[] var16 = new String[] {};
		t13.setViewSectionNames(var16);
		t13.setPageOrientation("");
		t13.setPagesTall(t14);
		t13.setPagesWide(t15);
		t16.setDesc("");
		PafViewHeader[] var17 = new PafViewHeader[] {};
		t16.setHeaders(var17);
		t16.setName("");
		PafViewSection[] var18 = new PafViewSection[] {};
		t16.setViewSections(var18);
		t16.setBackGroundColor("");
		PafUserSelection[] var19 = new PafUserSelection[] {};
		t16.setUserSelections(var19);
		String[] var20 = new String[] {};
		t16.setViewSectionNames(var20);
		t16.setPageOrientation("");
		t16.setPagesTall(t17);
		t16.setPagesWide(t18);
		PafView[] var21 = new PafView[] { t0, t1, t4, t5, t8, t11, t12, t13,
				t16, t19 };
		// jtest_tested_method
		PafMetaData.exportScreens(var21);
		assertEquals(t0, var21[0]); // jtest_unverified
		assertEquals(t1, var21[1]); // jtest_unverified
		assertEquals(t4, var21[2]); // jtest_unverified
		assertEquals(t19, var21[9]); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testExportScreens20.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExportScreens20(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isDebugMode", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:110)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafServerHome", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafMetaData.getConfigDirPath(PafMetaData.java:100)
				// at com.palladium.paf.server.PafMetaData.exportViewSections(PafMetaData.java:223)
				// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:195)
				// 
				// at com.palladium.paf.server.PafMetaData.getConfigDirPath(PafMetaData.java:100)
				// at com.palladium.paf.server.PafMetaData.exportViews(PafMetaData.java:211)
				// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:198)
			}
		}
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.sql.Connection.prepareStatement(java.lang.String)");
				switch (index) {
					case 1 :
					case 2 :
					case 3 :
					case 4 :
					case 5 :
					case 6 :
						return Stubs.makeStubObject(PreparedStatement.class);
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// 
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// 
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// 
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// 
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// 
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					case 7 :
						throw new SQLException();
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				return Stubs.makeStubObject(DatabaseMetaData.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:74)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
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
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverName", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverVersion", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "supportsResultSetType", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:80)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "supportsBatchUpdates", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:81)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PafXStream.class)) {
			argument_types = new Class[] { Object.class, String.class };
			if (Stubs.matches(method, "exportObjectToXml", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.exportViewSections(PafMetaData.java:223)
				// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:195)
				// 
				// at com.palladium.paf.server.PafMetaData.exportViews(PafMetaData.java:211)
				// at com.palladium.paf.server.PafMetaData.exportScreens(PafMetaData.java:198)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static getAppContext()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#getAppContext()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAppContext1() throws Throwable {
		_f0 = new ServerSettings();
		// jtest_tested_method
		ApplicationContext RETVAL = PafMetaData.getAppContext();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			RETVAL.toString()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetAppContext1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetAppContext1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
			}
		}
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static getAppContext()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#getAppContext()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAppContext2() throws Throwable {
		// jtest_tested_method
		ApplicationContext RETVAL = PafMetaData.getAppContext();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			RETVAL.toString()); // jtest_unverified
		assertEquals(false, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetAppContext2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetAppContext2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static getPafProps()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#getPafProps()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPafProps1() throws Throwable {
		_f0 = new ServerSettings();
		// jtest_tested_method
		Properties RETVAL = PafMetaData.getPafProps();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			RETVAL.toString()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetPafProps1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetPafProps1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
			}
		}
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static getPafProps()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#getPafProps()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPafProps2() throws Throwable {
		// jtest_tested_method
		Properties RETVAL = PafMetaData.getPafProps();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			RETVAL.toString()); // jtest_unverified
		assertEquals(false, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetPafProps2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetPafProps2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isDebugMode", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:110)
			}
		}
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static getServerSettings()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#getServerSettings()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetServerSettings1() throws Throwable {
		_f0 = new ServerSettings();
		// jtest_tested_method
		ServerSettings RETVAL = PafMetaData.getServerSettings();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(false, RETVAL.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, RETVAL.isDebugMode()); // jtest_unverified
		assertEquals(false, RETVAL.isEvaluationStepLogging()); // jtest_unverified
		assertEquals(null, RETVAL.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals(null, RETVAL.getPafSecurityPassword()); // jtest_unverified
		assertEquals(null, RETVAL.getPafSecurityUser()); // jtest_unverified
		assertEquals(null, RETVAL.getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetServerSettings1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetServerSettings1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
			}
		}
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static getServerSettings()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#getServerSettings()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetServerSettings2() throws Throwable {
		// jtest_tested_method
		ServerSettings RETVAL = PafMetaData.getServerSettings();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(false, RETVAL.isDebugMode()); // jtest_unverified
		assertEquals(false, RETVAL.isClearOutlineCache()); // jtest_unverified
		assertEquals(false, RETVAL.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", RETVAL.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", RETVAL.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", RETVAL.getPafSecurityUser()); // jtest_unverified
		assertEquals("", RETVAL.getCalcScriptTimeout()); // jtest_unverified
		assertEquals(false, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetServerSettings2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetServerSettings2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isDebugMode", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:110)
			}
		}
		if (Stubs.matches(method, Class.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "forName", argument_types)) {
				return java.lang.Object.class;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:559)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static getServerSettings()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#getServerSettings()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetServerSettings3() throws Throwable {
		_f0 = new ServerSettings();
		// jtest_tested_method
		ServerSettings RETVAL = PafMetaData.getServerSettings();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(true, RETVAL.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, RETVAL.isDebugMode()); // jtest_unverified
		assertEquals(true, RETVAL.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", RETVAL.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", RETVAL.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", RETVAL.getPafSecurityUser()); // jtest_unverified
		assertEquals("", RETVAL.getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetServerSettings3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetServerSettings3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
			}
		}
		if ("org.springframework.context.support.AbstractApplicationContext"
			.equals(method.getDeclaringClass().getName())) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:85)
			}
		}
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:110)
			}
		}
		if (Stubs.matches(method, Class.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "forName", argument_types)) {
				return java.lang.Object.class;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:559)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at org.hibernate.cfg.SettingsFactory.class$(SettingsFactory.java:46)
				// at org.hibernate.cfg.SettingsFactory.<clinit>(SettingsFactory.java:46)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.util.XMLHelper.class$(XMLHelper.java:24)
				// at org.hibernate.util.XMLHelper.<clinit>(XMLHelper.java:24)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:146)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.util.DTDEntityResolver.class$(DTDEntityResolver.java:17)
				// at org.hibernate.util.DTDEntityResolver.<clinit>(DTDEntityResolver.java:17)
				// at org.hibernate.util.XMLHelper.<clinit>(XMLHelper.java:25)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:146)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.cfg.Environment.class$(Environment.java:448)
				// at org.hibernate.cfg.Environment.<clinit>(Environment.java:448)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:151)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.cfg.Environment.class$(Environment.java:448)
				// at org.hibernate.cfg.Environment.<clinit>(Environment.java:514)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:151)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.cfg.Environment.<clinit>(Environment.java:525)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:151)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.AbstractReassociateEventListener.class$(AbstractReassociateEventListener.java:28)
				// at org.hibernate.event.def.AbstractReassociateEventListener.<clinit>(AbstractReassociateEventListener.java:28)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:47)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.AbstractLockUpgradeEventListener.class$(AbstractLockUpgradeEventListener.java:26)
				// at org.hibernate.event.def.AbstractLockUpgradeEventListener.<clinit>(AbstractLockUpgradeEventListener.java:26)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:47)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.DefaultLoadEventListener.class$(DefaultLoadEventListener.java:44)
				// at org.hibernate.event.def.DefaultLoadEventListener.<clinit>(DefaultLoadEventListener.java:44)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:47)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.AbstractSaveEventListener.class$(AbstractSaveEventListener.java:48)
				// at org.hibernate.event.def.AbstractSaveEventListener.<clinit>(AbstractSaveEventListener.java:48)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:48)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.DefaultSaveOrUpdateEventListener.class$(DefaultSaveOrUpdateEventListener.java:37)
				// at org.hibernate.event.def.DefaultSaveOrUpdateEventListener.<clinit>(DefaultSaveOrUpdateEventListener.java:37)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:48)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.DefaultMergeEventListener.class$(DefaultMergeEventListener.java:36)
				// at org.hibernate.event.def.DefaultMergeEventListener.<clinit>(DefaultMergeEventListener.java:36)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:49)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.DefaultPersistEventListener.class$(DefaultPersistEventListener.java:29)
				// at org.hibernate.event.def.DefaultPersistEventListener.<clinit>(DefaultPersistEventListener.java:29)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:50)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.DefaultReplicateEventListener.class$(DefaultReplicateEventListener.java:33)
				// at org.hibernate.event.def.DefaultReplicateEventListener.<clinit>(DefaultReplicateEventListener.java:33)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:51)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.DefaultDeleteEventListener.class$(DefaultDeleteEventListener.java:39)
				// at org.hibernate.event.def.DefaultDeleteEventListener.<clinit>(DefaultDeleteEventListener.java:39)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:52)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.AbstractFlushingEventListener.class$(AbstractFlushingEventListener.java:39)
				// at org.hibernate.event.def.AbstractFlushingEventListener.<clinit>(AbstractFlushingEventListener.java:39)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:53)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.DefaultAutoFlushEventListener.class$(DefaultAutoFlushEventListener.java:20)
				// at org.hibernate.event.def.DefaultAutoFlushEventListener.<clinit>(DefaultAutoFlushEventListener.java:20)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:53)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.DefaultDirtyCheckEventListener.class$(DefaultDirtyCheckEventListener.java:19)
				// at org.hibernate.event.def.DefaultDirtyCheckEventListener.<clinit>(DefaultDirtyCheckEventListener.java:19)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:54)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.DefaultEvictEventListener.class$(DefaultEvictEventListener.java:32)
				// at org.hibernate.event.def.DefaultEvictEventListener.<clinit>(DefaultEvictEventListener.java:32)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:56)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.DefaultRefreshEventListener.class$(DefaultRefreshEventListener.java:36)
				// at org.hibernate.event.def.DefaultRefreshEventListener.<clinit>(DefaultRefreshEventListener.java:36)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:58)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.DefaultFlushEntityEventListener.class$(DefaultFlushEntityEventListener.java:40)
				// at org.hibernate.event.def.DefaultFlushEntityEventListener.<clinit>(DefaultFlushEntityEventListener.java:40)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:59)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.DefaultInitializeCollectionEventListener.class$(DefaultInitializeCollectionEventListener.java:28)
				// at org.hibernate.event.def.DefaultInitializeCollectionEventListener.<clinit>(DefaultInitializeCollectionEventListener.java:28)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:60)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.cfg.Configuration.class$(Configuration.java:111)
				// at org.hibernate.cfg.Configuration.getConfigurationInputStream(Configuration.java:1118)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1149)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1136)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.dom4j.DocumentFactory.createSingleton(DocumentFactory.java:70)
				// at org.dom4j.DocumentFactory.getInstance(DocumentFactory.java:95)
				// at org.dom4j.io.SAXReader.getDocumentFactory(SAXReader.java:645)
				// at org.dom4j.io.SAXReader.createContentHandler(SAXReader.java:969)
				// at org.dom4j.io.SAXReader.read(SAXReader.java:449)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1206)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1150)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1136)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.dom4j.tree.NamespaceCache.<clinit>(NamespaceCache.java:47)
				// at org.dom4j.Namespace.<clinit>(Namespace.java:25)
				// at org.dom4j.DocumentFactory.createNamespace(DocumentFactory.java:185)
				// at org.dom4j.tree.NamespaceStack.createNamespace(NamespaceStack.java:407)
				// at org.dom4j.tree.NamespaceStack.getQName(NamespaceStack.java:211)
				// at org.dom4j.io.SAXContentHandler.startElement(SAXContentHandler.java:234)
				// at org.apache.xerces.parsers.AbstractSAXParser.startElement
				// at org.apache.xerces.impl.dtd.XMLDTDValidator.startElement
				// at org.apache.xerces.impl.XMLNSDocumentScannerImpl.scanStartElement
				// at org.apache.xerces.impl.XMLNSDocumentScannerImpl$NSContentDispatcher.scanRootElementHook
				// at org.apache.xerces.impl.XMLDocumentFragmentScannerImpl$FragmentContentDispatcher.dispatch
				// at org.apache.xerces.impl.XMLDocumentFragmentScannerImpl.scanDocument
				// at org.apache.xerces.parsers.XML11Configuration.parse
				// at org.apache.xerces.parsers.XML11Configuration.parse
				// at org.apache.xerces.parsers.XMLParser.parse
				// at org.apache.xerces.parsers.AbstractSAXParser.parse
				// at org.dom4j.io.SAXReader.read(SAXReader.java:465)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1206)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1150)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1136)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.dom4j.tree.NamespaceCache.<clinit>(NamespaceCache.java:58)
				// at org.dom4j.Namespace.<clinit>(Namespace.java:25)
				// at org.dom4j.DocumentFactory.createNamespace(DocumentFactory.java:185)
				// at org.dom4j.tree.NamespaceStack.createNamespace(NamespaceStack.java:407)
				// at org.dom4j.tree.NamespaceStack.getQName(NamespaceStack.java:211)
				// at org.dom4j.io.SAXContentHandler.startElement(SAXContentHandler.java:234)
				// at org.apache.xerces.parsers.AbstractSAXParser.startElement
				// at org.apache.xerces.impl.dtd.XMLDTDValidator.startElement
				// at org.apache.xerces.impl.XMLNSDocumentScannerImpl.scanStartElement
				// at org.apache.xerces.impl.XMLNSDocumentScannerImpl$NSContentDispatcher.scanRootElementHook
				// at org.apache.xerces.impl.XMLDocumentFragmentScannerImpl$FragmentContentDispatcher.dispatch
				// at org.apache.xerces.impl.XMLDocumentFragmentScannerImpl.scanDocument
				// at org.apache.xerces.parsers.XML11Configuration.parse
				// at org.apache.xerces.parsers.XML11Configuration.parse
				// at org.apache.xerces.parsers.XMLParser.parse
				// at org.apache.xerces.parsers.AbstractSAXParser.parse
				// at org.dom4j.io.SAXReader.read(SAXReader.java:465)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1206)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1150)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1136)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.dom4j.QName.<clinit>(QName.java:39)
				// at org.dom4j.tree.QNameCache.get(QNameCache.java:117)
				// at org.dom4j.DocumentFactory.createQName(DocumentFactory.java:199)
				// at org.dom4j.tree.NamespaceStack.createQName(NamespaceStack.java:392)
				// at org.dom4j.tree.NamespaceStack.pushQName(NamespaceStack.java:374)
				// at org.dom4j.tree.NamespaceStack.getQName(NamespaceStack.java:213)
				// at org.dom4j.io.SAXContentHandler.startElement(SAXContentHandler.java:234)
				// at org.apache.xerces.parsers.AbstractSAXParser.startElement
				// at org.apache.xerces.impl.dtd.XMLDTDValidator.startElement
				// at org.apache.xerces.impl.XMLNSDocumentScannerImpl.scanStartElement
				// at org.apache.xerces.impl.XMLNSDocumentScannerImpl$NSContentDispatcher.scanRootElementHook
				// at org.apache.xerces.impl.XMLDocumentFragmentScannerImpl$FragmentContentDispatcher.dispatch
				// at org.apache.xerces.impl.XMLDocumentFragmentScannerImpl.scanDocument
				// at org.apache.xerces.parsers.XML11Configuration.parse
				// at org.apache.xerces.parsers.XML11Configuration.parse
				// at org.apache.xerces.parsers.XMLParser.parse
				// at org.apache.xerces.parsers.AbstractSAXParser.parse
				// at org.dom4j.io.SAXReader.read(SAXReader.java:465)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1206)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1150)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1136)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.cfg.Mappings.class$(Mappings.java:34)
				// at org.hibernate.cfg.Mappings.<clinit>(Mappings.java:34)
				// at org.hibernate.cfg.Configuration.createMappings(Configuration.java:379)
				// at org.hibernate.cfg.Configuration.add(Configuration.java:370)
				// at org.hibernate.cfg.Configuration.addInputStream(Configuration.java:409)
				// at org.hibernate.cfg.Configuration.addResource(Configuration.java:460)
				// at org.hibernate.cfg.Configuration.parseMappingElement(Configuration.java:1300)
				// at org.hibernate.cfg.Configuration.parseSessionFactory(Configuration.java:1272)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1254)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1230)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1150)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1136)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.cfg.HbmBinder.class$(HbmBinder.java:94)
				// at org.hibernate.cfg.HbmBinder.<clinit>(HbmBinder.java:94)
				// at org.hibernate.cfg.Configuration.add(Configuration.java:370)
				// at org.hibernate.cfg.Configuration.addInputStream(Configuration.java:409)
				// at org.hibernate.cfg.Configuration.addResource(Configuration.java:460)
				// at org.hibernate.cfg.Configuration.parseMappingElement(Configuration.java:1300)
				// at org.hibernate.cfg.Configuration.parseSessionFactory(Configuration.java:1272)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1254)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1230)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1150)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1136)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.util.ReflectHelper.class$(ReflectHelper.java:28)
				// at org.hibernate.util.ReflectHelper.<clinit>(ReflectHelper.java:28)
				// at org.hibernate.mapping.SimpleValue.setTypeUsingReflection(SimpleValue.java:275)
				// at org.hibernate.cfg.HbmBinder.bindSimpleId(HbmBinder.java:367)
				// at org.hibernate.cfg.HbmBinder.bindRootPersistentClassCommonValues(HbmBinder.java:301)
				// at org.hibernate.cfg.HbmBinder.bindRootClass(HbmBinder.java:242)
				// at org.hibernate.cfg.HbmBinder.bindRoot(HbmBinder.java:153)
				// at org.hibernate.cfg.Configuration.add(Configuration.java:370)
				// at org.hibernate.cfg.Configuration.addInputStream(Configuration.java:409)
				// at org.hibernate.cfg.Configuration.addResource(Configuration.java:460)
				// at org.hibernate.cfg.Configuration.parseMappingElement(Configuration.java:1300)
				// at org.hibernate.cfg.Configuration.parseSessionFactory(Configuration.java:1272)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1254)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1230)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1150)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1136)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.property.BasicPropertyAccessor.class$(BasicPropertyAccessor.java:26)
				// at org.hibernate.property.BasicPropertyAccessor.<clinit>(BasicPropertyAccessor.java:26)
				// at org.hibernate.util.ReflectHelper.<clinit>(ReflectHelper.java:30)
				// at org.hibernate.mapping.SimpleValue.setTypeUsingReflection(SimpleValue.java:275)
				// at org.hibernate.cfg.HbmBinder.bindSimpleId(HbmBinder.java:367)
				// at org.hibernate.cfg.HbmBinder.bindRootPersistentClassCommonValues(HbmBinder.java:301)
				// at org.hibernate.cfg.HbmBinder.bindRootClass(HbmBinder.java:242)
				// at org.hibernate.cfg.HbmBinder.bindRoot(HbmBinder.java:153)
				// at org.hibernate.cfg.Configuration.add(Configuration.java:370)
				// at org.hibernate.cfg.Configuration.addInputStream(Configuration.java:409)
				// at org.hibernate.cfg.Configuration.addResource(Configuration.java:460)
				// at org.hibernate.cfg.Configuration.parseMappingElement(Configuration.java:1300)
				// at org.hibernate.cfg.Configuration.parseSessionFactory(Configuration.java:1272)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1254)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1230)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1150)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1136)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.util.ReflectHelper.class$(ReflectHelper.java:28)
				// at org.hibernate.util.ReflectHelper.<clinit>(ReflectHelper.java:34)
				// at org.hibernate.mapping.SimpleValue.setTypeUsingReflection(SimpleValue.java:275)
				// at org.hibernate.cfg.HbmBinder.bindSimpleId(HbmBinder.java:367)
				// at org.hibernate.cfg.HbmBinder.bindRootPersistentClassCommonValues(HbmBinder.java:301)
				// at org.hibernate.cfg.HbmBinder.bindRootClass(HbmBinder.java:242)
				// at org.hibernate.cfg.HbmBinder.bindRoot(HbmBinder.java:153)
				// at org.hibernate.cfg.Configuration.add(Configuration.java:370)
				// at org.hibernate.cfg.Configuration.addInputStream(Configuration.java:409)
				// at org.hibernate.cfg.Configuration.addResource(Configuration.java:460)
				// at org.hibernate.cfg.Configuration.parseMappingElement(Configuration.java:1300)
				// at org.hibernate.cfg.Configuration.parseSessionFactory(Configuration.java:1272)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1254)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1230)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1150)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1136)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.property.BasicPropertyAccessor.class$(BasicPropertyAccessor.java:26)
				// at org.hibernate.property.BasicPropertyAccessor.getGetterOrNull(BasicPropertyAccessor.java:295)
				// at org.hibernate.property.BasicPropertyAccessor.createGetter(BasicPropertyAccessor.java:280)
				// at org.hibernate.property.BasicPropertyAccessor.getGetter(BasicPropertyAccessor.java:275)
				// at org.hibernate.util.ReflectHelper.getter(ReflectHelper.java:87)
				// at org.hibernate.util.ReflectHelper.reflectedPropertyClass(ReflectHelper.java:78)
				// at org.hibernate.mapping.SimpleValue.setTypeUsingReflection(SimpleValue.java:275)
				// at org.hibernate.cfg.HbmBinder.bindSimpleId(HbmBinder.java:367)
				// at org.hibernate.cfg.HbmBinder.bindRootPersistentClassCommonValues(HbmBinder.java:301)
				// at org.hibernate.cfg.HbmBinder.bindRootClass(HbmBinder.java:242)
				// at org.hibernate.cfg.HbmBinder.bindRoot(HbmBinder.java:153)
				// at org.hibernate.cfg.Configuration.add(Configuration.java:370)
				// at org.hibernate.cfg.Configuration.addInputStream(Configuration.java:409)
				// at org.hibernate.cfg.Configuration.addResource(Configuration.java:460)
				// at org.hibernate.cfg.Configuration.parseMappingElement(Configuration.java:1300)
				// at org.hibernate.cfg.Configuration.parseSessionFactory(Configuration.java:1272)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1254)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1230)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1150)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1136)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.type.NullableType.class$(NullableType.java:29)
				// at org.hibernate.type.NullableType.<clinit>(NullableType.java:29)
				// at org.hibernate.Hibernate.<clinit>(Hibernate.java:76)
				// at org.hibernate.type.TypeFactory.<clinit>(TypeFactory.java:47)
				// at org.hibernate.mapping.ManyToOne.getType(ManyToOne.java:26)
				// at org.hibernate.mapping.ManyToOne.createForeignKey(ManyToOne.java:39)
				// at org.hibernate.cfg.HbmBinder.createProperty(HbmBinder.java:1978)
				// at org.hibernate.cfg.HbmBinder.createClassProperties(HbmBinder.java:1943)
				// at org.hibernate.cfg.HbmBinder.createClassProperties(HbmBinder.java:1833)
				// at org.hibernate.cfg.HbmBinder.bindRootPersistentClassCommonValues(HbmBinder.java:325)
				// at org.hibernate.cfg.HbmBinder.bindRootClass(HbmBinder.java:242)
				// at org.hibernate.cfg.HbmBinder.bindRoot(HbmBinder.java:153)
				// at org.hibernate.cfg.Configuration.add(Configuration.java:370)
				// at org.hibernate.cfg.Configuration.addInputStream(Configuration.java:409)
				// at org.hibernate.cfg.Configuration.addResource(Configuration.java:460)
				// at org.hibernate.cfg.Configuration.parseMappingElement(Configuration.java:1300)
				// at org.hibernate.cfg.Configuration.parseSessionFactory(Configuration.java:1272)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1254)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1230)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1150)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1136)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.type.CurrencyType.<clinit>(CurrencyType.java:28)
				// at org.hibernate.Hibernate.<clinit>(Hibernate.java:168)
				// at org.hibernate.type.TypeFactory.<clinit>(TypeFactory.java:47)
				// at org.hibernate.mapping.ManyToOne.getType(ManyToOne.java:26)
				// at org.hibernate.mapping.ManyToOne.createForeignKey(ManyToOne.java:39)
				// at org.hibernate.cfg.HbmBinder.createProperty(HbmBinder.java:1978)
				// at org.hibernate.cfg.HbmBinder.createClassProperties(HbmBinder.java:1943)
				// at org.hibernate.cfg.HbmBinder.createClassProperties(HbmBinder.java:1833)
				// at org.hibernate.cfg.HbmBinder.bindRootPersistentClassCommonValues(HbmBinder.java:325)
				// at org.hibernate.cfg.HbmBinder.bindRootClass(HbmBinder.java:242)
				// at org.hibernate.cfg.HbmBinder.bindRoot(HbmBinder.java:153)
				// at org.hibernate.cfg.Configuration.add(Configuration.java:370)
				// at org.hibernate.cfg.Configuration.addInputStream(Configuration.java:409)
				// at org.hibernate.cfg.Configuration.addResource(Configuration.java:460)
				// at org.hibernate.cfg.Configuration.parseMappingElement(Configuration.java:1300)
				// at org.hibernate.cfg.Configuration.parseSessionFactory(Configuration.java:1272)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1254)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1230)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1150)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1136)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.type.CurrencyType.class$(CurrencyType.java:41)
				// at org.hibernate.type.CurrencyType.<clinit>(CurrencyType.java:41)
				// at org.hibernate.Hibernate.<clinit>(Hibernate.java:168)
				// at org.hibernate.type.TypeFactory.<clinit>(TypeFactory.java:47)
				// at org.hibernate.mapping.ManyToOne.getType(ManyToOne.java:26)
				// at org.hibernate.mapping.ManyToOne.createForeignKey(ManyToOne.java:39)
				// at org.hibernate.cfg.HbmBinder.createProperty(HbmBinder.java:1978)
				// at org.hibernate.cfg.HbmBinder.createClassProperties(HbmBinder.java:1943)
				// at org.hibernate.cfg.HbmBinder.createClassProperties(HbmBinder.java:1833)
				// at org.hibernate.cfg.HbmBinder.bindRootPersistentClassCommonValues(HbmBinder.java:325)
				// at org.hibernate.cfg.HbmBinder.bindRootClass(HbmBinder.java:242)
				// at org.hibernate.cfg.HbmBinder.bindRoot(HbmBinder.java:153)
				// at org.hibernate.cfg.Configuration.add(Configuration.java:370)
				// at org.hibernate.cfg.Configuration.addInputStream(Configuration.java:409)
				// at org.hibernate.cfg.Configuration.addResource(Configuration.java:460)
				// at org.hibernate.cfg.Configuration.parseMappingElement(Configuration.java:1300)
				// at org.hibernate.cfg.Configuration.parseSessionFactory(Configuration.java:1272)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1254)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1230)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1150)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1136)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.AssertionFailure.class$(AssertionFailure.java:16)
				// at org.hibernate.AssertionFailure.<clinit>(AssertionFailure.java:16)
				// at org.hibernate.type.CurrencyType.<clinit>(CurrencyType.java:45)
				// at org.hibernate.Hibernate.<clinit>(Hibernate.java:168)
				// at org.hibernate.type.TypeFactory.<clinit>(TypeFactory.java:47)
				// at org.hibernate.mapping.ManyToOne.getType(ManyToOne.java:26)
				// at org.hibernate.mapping.ManyToOne.createForeignKey(ManyToOne.java:39)
				// at org.hibernate.cfg.HbmBinder.createProperty(HbmBinder.java:1978)
				// at org.hibernate.cfg.HbmBinder.createClassProperties(HbmBinder.java:1943)
				// at org.hibernate.cfg.HbmBinder.createClassProperties(HbmBinder.java:1833)
				// at org.hibernate.cfg.HbmBinder.bindRootPersistentClassCommonValues(HbmBinder.java:325)
				// at org.hibernate.cfg.HbmBinder.bindRootClass(HbmBinder.java:242)
				// at org.hibernate.cfg.HbmBinder.bindRoot(HbmBinder.java:153)
				// at org.hibernate.cfg.Configuration.add(Configuration.java:370)
				// at org.hibernate.cfg.Configuration.addInputStream(Configuration.java:409)
				// at org.hibernate.cfg.Configuration.addResource(Configuration.java:460)
				// at org.hibernate.cfg.Configuration.parseMappingElement(Configuration.java:1300)
				// at org.hibernate.cfg.Configuration.parseSessionFactory(Configuration.java:1272)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1254)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1230)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1150)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1136)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
			}
		}
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importApplications()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importApplications()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportApplications1() throws Throwable {
		_f0 = new ServerSettings();
		// jtest_tested_method
		PafApplicationDef[] RETVAL = PafMetaData.importApplications();
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportApplications1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportApplications1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
			}
		}
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
			}
		}
		if (Stubs.matches(method, PafXStream.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "importObjectFromXml", argument_types)) {
				return null;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importApplications()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importApplications()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportApplications2() throws Throwable {
		_f0 = new ServerSettings();
		_f7 = new Configuration();
		// jtest_tested_method
		PafApplicationDef[] RETVAL = PafMetaData.importApplications();
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportApplications2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportApplications2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:85)
			}
		}
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "configure", argument_types)) {
				return _f7;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, XStream.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(XStream.class);
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:38)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
			}
			argument_types = new Class[] { String.class, Class.class };
			if (Stubs.matches(method, "alias", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:40)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:41)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:42)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:43)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:44)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:45)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:46)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:47)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:48)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:50)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:51)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:52)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:54)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:55)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:57)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:58)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:60)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:61)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:62)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:63)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:65)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:67)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:68)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:69)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:71)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:72)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:74)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:75)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:76)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:78)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:79)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:80)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:82)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:83)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
			}
		}
		if ("com.palladium.utility.PafXStream".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "importObjectFromXml", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importCustomMenus()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importCustomMenus()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportCustomMenus1() throws Throwable {
		_f0 = new ServerSettings();
		// jtest_tested_method
		CustomMenuDef[] RETVAL = PafMetaData.importCustomMenus();
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportCustomMenus1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportCustomMenus1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
			}
		}
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
			}
		}
		if (Stubs.matches(method, PafXStream.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "importObjectFromXml", argument_types)) {
				return null;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importCustomMenus()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importCustomMenus()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportCustomMenus2() throws Throwable {
		// jtest_tested_method
		CustomMenuDef[] RETVAL = PafMetaData.importCustomMenus();
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(false, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportCustomMenus2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportCustomMenus2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ThreadLocal.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at org.apache.derby.iapi.services.context.ContextService.getCurrentContextManager
				// at org.apache.derby.impl.services.monitor.BaseMonitor.bootService
				// at org.apache.derby.impl.services.monitor.BaseMonitor.startServices
				// at org.apache.derby.impl.services.monitor.BaseMonitor.runWithState
				// at org.apache.derby.impl.services.monitor.FileMonitor.<init>
				// at org.apache.derby.iapi.services.monitor.Monitor.startMonitor
				// at org.apache.derby.iapi.jdbc.JDBCBoot.boot
				// at org.apache.derby.jdbc.EmbeddedDriver.boot
				// at org.apache.derby.jdbc.EmbeddedDriver.<clinit>
				// at java.lang.Class.forName0
				// at java.lang.Class.forName
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:559)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importCustomMenus()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importCustomMenus()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportCustomMenus3() throws Throwable {
		_f0 = new ServerSettings();
		// jtest_tested_method
		CustomMenuDef[] RETVAL = PafMetaData.importCustomMenus();
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportCustomMenus3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportCustomMenus3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:85)
			}
		}
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, XStream.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(XStream.class);
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:38)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importCustomMenus(PafMetaData.java:477)
			}
			argument_types = new Class[] { String.class, Class.class };
			if (Stubs.matches(method, "alias", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:40)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importCustomMenus(PafMetaData.java:477)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:41)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importCustomMenus(PafMetaData.java:477)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:42)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importCustomMenus(PafMetaData.java:477)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:43)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importCustomMenus(PafMetaData.java:477)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:44)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importCustomMenus(PafMetaData.java:477)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:45)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importCustomMenus(PafMetaData.java:477)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:46)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importCustomMenus(PafMetaData.java:477)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:47)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importCustomMenus(PafMetaData.java:477)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:48)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importCustomMenus(PafMetaData.java:477)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:50)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importCustomMenus(PafMetaData.java:477)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:51)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importCustomMenus(PafMetaData.java:477)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:52)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importCustomMenus(PafMetaData.java:477)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:54)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importCustomMenus(PafMetaData.java:477)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:55)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importCustomMenus(PafMetaData.java:477)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:57)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importCustomMenus(PafMetaData.java:477)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:58)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importCustomMenus(PafMetaData.java:477)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:60)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importCustomMenus(PafMetaData.java:477)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:61)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importCustomMenus(PafMetaData.java:477)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:62)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importCustomMenus(PafMetaData.java:477)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:63)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importCustomMenus(PafMetaData.java:477)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:65)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importCustomMenus(PafMetaData.java:477)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:67)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importCustomMenus(PafMetaData.java:477)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:68)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importCustomMenus(PafMetaData.java:477)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:69)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importCustomMenus(PafMetaData.java:477)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:71)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importCustomMenus(PafMetaData.java:477)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:72)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importCustomMenus(PafMetaData.java:477)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:74)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importCustomMenus(PafMetaData.java:477)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:75)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importCustomMenus(PafMetaData.java:477)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:76)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importCustomMenus(PafMetaData.java:477)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:78)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importCustomMenus(PafMetaData.java:477)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:79)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importCustomMenus(PafMetaData.java:477)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:80)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importCustomMenus(PafMetaData.java:477)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:82)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importCustomMenus(PafMetaData.java:477)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:83)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importCustomMenus(PafMetaData.java:477)
			}
		}
		if ("com.palladium.utility.PafXStream".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "importObjectFromXml", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importCustomMenus(PafMetaData.java:477)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importFunctionDefs()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importFunctionDefs()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportFunctionDefs1() throws Throwable {
		_f0 = new ServerSettings();
		// jtest_tested_method
		CustomFunctionDef[] RETVAL = PafMetaData.importFunctionDefs();
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportFunctionDefs1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportFunctionDefs1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
			}
		}
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
			}
		}
		if (Stubs.matches(method, PafXStream.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "importObjectFromXml", argument_types)) {
				return null;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importFunctionDefs()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importFunctionDefs()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportFunctionDefs2() throws Throwable {
		_f0 = new ServerSettings();
		// jtest_tested_method
		CustomFunctionDef[] RETVAL = PafMetaData.importFunctionDefs();
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(false, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportFunctionDefs2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportFunctionDefs2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
			}
		}
		if ("org.springframework.context.support.AbstractApplicationContext"
			.equals(method.getDeclaringClass().getName())) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:85)
			}
		}
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:110)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafServerHome", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafMetaData.getConfigDirPath(PafMetaData.java:100)
				// at com.palladium.paf.server.PafMetaData.importFunctionDefs(PafMetaData.java:509)
			}
		}
		if (Stubs.matches(method, ThreadLocal.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at org.apache.derby.iapi.services.context.ContextService.getCurrentContextManager
				// at org.apache.derby.impl.services.monitor.BaseMonitor.bootService
				// at org.apache.derby.impl.services.monitor.BaseMonitor.startServices
				// at org.apache.derby.impl.services.monitor.BaseMonitor.runWithState
				// at org.apache.derby.impl.services.monitor.FileMonitor.<init>
				// at org.apache.derby.iapi.services.monitor.Monitor.startMonitor
				// at org.apache.derby.iapi.jdbc.JDBCBoot.boot
				// at org.apache.derby.jdbc.EmbeddedDriver.boot
				// at org.apache.derby.jdbc.EmbeddedDriver.<clinit>
				// at java.lang.Class.forName0
				// at java.lang.Class.forName
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:559)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importFunctionDefs()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importFunctionDefs()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportFunctionDefs3() throws Throwable {
		_f0 = new ServerSettings();
		_f0.setClearOutlineCache(false);
		_f0.setDebugMode(false);
		_f0.setEvaluationStepLogging(false);
		_f0.setPafSecurityBootupPassword("");
		_f0.setPafSecurityPassword("");
		_f0.setPafSecurityUser("");
		_f0.setCalcScriptTimeout("");
		_f0.setChangedCellLogging(false);
		// jtest_tested_method
		CustomFunctionDef[] RETVAL = PafMetaData.importFunctionDefs();
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportFunctionDefs3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportFunctionDefs3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:85)
			}
		}
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, XStream.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(XStream.class);
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:38)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importFunctionDefs(PafMetaData.java:508)
			}
			argument_types = new Class[] { String.class, Class.class };
			if (Stubs.matches(method, "alias", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:40)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importFunctionDefs(PafMetaData.java:508)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:41)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importFunctionDefs(PafMetaData.java:508)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:42)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importFunctionDefs(PafMetaData.java:508)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:43)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importFunctionDefs(PafMetaData.java:508)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:44)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importFunctionDefs(PafMetaData.java:508)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:45)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importFunctionDefs(PafMetaData.java:508)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:46)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importFunctionDefs(PafMetaData.java:508)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:47)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importFunctionDefs(PafMetaData.java:508)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:48)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importFunctionDefs(PafMetaData.java:508)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:50)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importFunctionDefs(PafMetaData.java:508)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:51)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importFunctionDefs(PafMetaData.java:508)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:52)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importFunctionDefs(PafMetaData.java:508)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:54)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importFunctionDefs(PafMetaData.java:508)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:55)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importFunctionDefs(PafMetaData.java:508)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:57)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importFunctionDefs(PafMetaData.java:508)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:58)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importFunctionDefs(PafMetaData.java:508)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:60)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importFunctionDefs(PafMetaData.java:508)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:61)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importFunctionDefs(PafMetaData.java:508)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:62)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importFunctionDefs(PafMetaData.java:508)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:63)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importFunctionDefs(PafMetaData.java:508)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:65)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importFunctionDefs(PafMetaData.java:508)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:67)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importFunctionDefs(PafMetaData.java:508)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:68)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importFunctionDefs(PafMetaData.java:508)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:69)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importFunctionDefs(PafMetaData.java:508)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:71)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importFunctionDefs(PafMetaData.java:508)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:72)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importFunctionDefs(PafMetaData.java:508)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:74)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importFunctionDefs(PafMetaData.java:508)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:75)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importFunctionDefs(PafMetaData.java:508)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:76)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importFunctionDefs(PafMetaData.java:508)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:78)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importFunctionDefs(PafMetaData.java:508)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:79)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importFunctionDefs(PafMetaData.java:508)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:80)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importFunctionDefs(PafMetaData.java:508)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:82)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importFunctionDefs(PafMetaData.java:508)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:83)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importFunctionDefs(PafMetaData.java:508)
			}
		}
		if ("com.palladium.utility.PafXStream".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "importObjectFromXml", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importFunctionDefs(PafMetaData.java:508)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importGenerationFormats()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importGenerationFormats()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportGenerationFormats1() throws Throwable {
		_f0 = new ServerSettings();
		// jtest_tested_method
		Map RETVAL = PafMetaData.importGenerationFormats();
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(false, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportGenerationFormats1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportGenerationFormats1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:85)
			}
		}
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:110)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafServerHome", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafMetaData.getConfigDirPath(PafMetaData.java:100)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
			}
		}
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importGenerationFormats()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importGenerationFormats()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportGenerationFormats2() throws Throwable {
		_f0 = new ServerSettings();
		// jtest_tested_method
		Map RETVAL = PafMetaData.importGenerationFormats();
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportGenerationFormats2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportGenerationFormats2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
			}
		}
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
			}
		}
		if (Stubs.matches(method, PafXStream.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "importObjectFromXml", argument_types)) {
				return null;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importGenerationFormats()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importGenerationFormats()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportGenerationFormats3() throws Throwable {
		_f0 = new ServerSettings();
		_f7 = new Configuration();
		// jtest_tested_method
		Map RETVAL = PafMetaData.importGenerationFormats();
		// ClassCastException thrown
		// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportGenerationFormats3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportGenerationFormats3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:85)
			}
		}
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:110)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafServerHome", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafMetaData.getConfigDirPath(PafMetaData.java:100)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
			}
		}
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				return Stubs.makeStubObject(DatabaseMetaData.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:74)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "configure", argument_types)) {
				return _f7;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
			}
		}
		if (Stubs.matches(method, UserSuppliedConnectionProvider.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:72)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
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
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverName", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverVersion", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "supportsResultSetType", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:80)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "supportsBatchUpdates", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:81)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, XStream.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(XStream.class);
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:38)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
			}
			argument_types = new Class[] { String.class, Class.class };
			if (Stubs.matches(method, "alias", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:40)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:41)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:42)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:43)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:44)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:45)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:46)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:47)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:48)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:50)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:51)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:52)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:54)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:55)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:57)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:58)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:60)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:61)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:62)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:63)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:65)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:67)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:68)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:69)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:71)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:72)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:74)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:75)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:76)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:78)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:79)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:80)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:82)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:83)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
			}
		}
		if ("com.palladium.utility.PafXStream".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "importObjectFromXml", argument_types)) {
				return "";
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importGenerationFormats()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importGenerationFormats()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportGenerationFormats4() throws Throwable {
		_f0 = new ServerSettings();
		_f7 = new Configuration();
		// jtest_tested_method
		Map RETVAL = PafMetaData.importGenerationFormats();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("0", RETVAL.toString()); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportGenerationFormats4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportGenerationFormats4(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:85)
			}
		}
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:110)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafServerHome", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafMetaData.getConfigDirPath(PafMetaData.java:100)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
			}
		}
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				return Stubs.makeStubObject(DatabaseMetaData.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:74)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "configure", argument_types)) {
				return _f7;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
			}
		}
		if (Stubs.matches(method, UserSuppliedConnectionProvider.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:72)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
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
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverName", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverVersion", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "supportsResultSetType", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:80)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "supportsBatchUpdates", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:81)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if ("com.palladium.utility.PafXStream".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "importObjectFromXml", argument_types)) {
				return Stubs.makeStubObject(Map.class);
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importGlobalNumericFormats()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importGlobalNumericFormats()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportGlobalNumericFormats1() throws Throwable {
		_f0 = new ServerSettings();
		_f7 = new Configuration();
		// jtest_tested_method
		Map RETVAL = PafMetaData.importGlobalNumericFormats();
		// ClassCastException thrown
		// at com.palladium.paf.server.PafMetaData.importGlobalNumericFormats(PafMetaData.java:437)
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportGlobalNumericFormats1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportGlobalNumericFormats1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Class.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "forName", argument_types)) {
				return java.lang.Object.class;
				// at org.springframework.context.support.AbstractApplicationContext.class$(AbstractApplicationContext.java:123)
				// at org.springframework.context.support.AbstractApplicationContext.<clinit>(AbstractApplicationContext.java:123)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
				// 
				// at org.hibernate.cfg.Configuration.class$(Configuration.java:111)
				// at org.hibernate.cfg.Configuration.<clinit>(Configuration.java:111)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.cfg.SettingsFactory.class$(SettingsFactory.java:46)
				// at org.hibernate.cfg.SettingsFactory.<clinit>(SettingsFactory.java:46)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.util.XMLHelper.class$(XMLHelper.java:24)
				// at org.hibernate.util.XMLHelper.<clinit>(XMLHelper.java:24)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:146)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.util.DTDEntityResolver.class$(DTDEntityResolver.java:17)
				// at org.hibernate.util.DTDEntityResolver.<clinit>(DTDEntityResolver.java:17)
				// at org.hibernate.util.XMLHelper.<clinit>(XMLHelper.java:25)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:146)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.cfg.Environment.class$(Environment.java:448)
				// at org.hibernate.cfg.Environment.<clinit>(Environment.java:448)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:151)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.cfg.Environment.class$(Environment.java:448)
				// at org.hibernate.cfg.Environment.<clinit>(Environment.java:514)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:151)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.cfg.Environment.<clinit>(Environment.java:525)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:151)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.AbstractReassociateEventListener.class$(AbstractReassociateEventListener.java:28)
				// at org.hibernate.event.def.AbstractReassociateEventListener.<clinit>(AbstractReassociateEventListener.java:28)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:47)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.AbstractLockUpgradeEventListener.class$(AbstractLockUpgradeEventListener.java:26)
				// at org.hibernate.event.def.AbstractLockUpgradeEventListener.<clinit>(AbstractLockUpgradeEventListener.java:26)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:47)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.DefaultLoadEventListener.class$(DefaultLoadEventListener.java:44)
				// at org.hibernate.event.def.DefaultLoadEventListener.<clinit>(DefaultLoadEventListener.java:44)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:47)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.AbstractSaveEventListener.class$(AbstractSaveEventListener.java:48)
				// at org.hibernate.event.def.AbstractSaveEventListener.<clinit>(AbstractSaveEventListener.java:48)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:48)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.DefaultSaveOrUpdateEventListener.class$(DefaultSaveOrUpdateEventListener.java:37)
				// at org.hibernate.event.def.DefaultSaveOrUpdateEventListener.<clinit>(DefaultSaveOrUpdateEventListener.java:37)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:48)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.DefaultMergeEventListener.class$(DefaultMergeEventListener.java:36)
				// at org.hibernate.event.def.DefaultMergeEventListener.<clinit>(DefaultMergeEventListener.java:36)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:49)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.DefaultPersistEventListener.class$(DefaultPersistEventListener.java:29)
				// at org.hibernate.event.def.DefaultPersistEventListener.<clinit>(DefaultPersistEventListener.java:29)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:50)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.DefaultReplicateEventListener.class$(DefaultReplicateEventListener.java:33)
				// at org.hibernate.event.def.DefaultReplicateEventListener.<clinit>(DefaultReplicateEventListener.java:33)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:51)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.DefaultDeleteEventListener.class$(DefaultDeleteEventListener.java:39)
				// at org.hibernate.event.def.DefaultDeleteEventListener.<clinit>(DefaultDeleteEventListener.java:39)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:52)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.AbstractFlushingEventListener.class$(AbstractFlushingEventListener.java:39)
				// at org.hibernate.event.def.AbstractFlushingEventListener.<clinit>(AbstractFlushingEventListener.java:39)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:53)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.DefaultAutoFlushEventListener.class$(DefaultAutoFlushEventListener.java:20)
				// at org.hibernate.event.def.DefaultAutoFlushEventListener.<clinit>(DefaultAutoFlushEventListener.java:20)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:53)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.DefaultDirtyCheckEventListener.class$(DefaultDirtyCheckEventListener.java:19)
				// at org.hibernate.event.def.DefaultDirtyCheckEventListener.<clinit>(DefaultDirtyCheckEventListener.java:19)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:54)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.DefaultEvictEventListener.class$(DefaultEvictEventListener.java:32)
				// at org.hibernate.event.def.DefaultEvictEventListener.<clinit>(DefaultEvictEventListener.java:32)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:56)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.DefaultRefreshEventListener.class$(DefaultRefreshEventListener.java:36)
				// at org.hibernate.event.def.DefaultRefreshEventListener.<clinit>(DefaultRefreshEventListener.java:36)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:58)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.DefaultFlushEntityEventListener.class$(DefaultFlushEntityEventListener.java:40)
				// at org.hibernate.event.def.DefaultFlushEntityEventListener.<clinit>(DefaultFlushEntityEventListener.java:40)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:59)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.DefaultInitializeCollectionEventListener.class$(DefaultInitializeCollectionEventListener.java:28)
				// at org.hibernate.event.def.DefaultInitializeCollectionEventListener.<clinit>(DefaultInitializeCollectionEventListener.java:28)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:60)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
			}
		}
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
			}
		}
		if ("org.springframework.context.support.AbstractApplicationContext"
			.equals(method.getDeclaringClass().getName())) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:85)
			}
		}
		if ("org.hibernate.cfg.Configuration".equals(method.getDeclaringClass()
			.getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "configure", argument_types)) {
				return _f7;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, XStream.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(XStream.class);
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:38)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalNumericFormats(PafMetaData.java:437)
			}
			argument_types = new Class[] { String.class, Class.class };
			if (Stubs.matches(method, "alias", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:40)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalNumericFormats(PafMetaData.java:437)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:41)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalNumericFormats(PafMetaData.java:437)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:42)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalNumericFormats(PafMetaData.java:437)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:43)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalNumericFormats(PafMetaData.java:437)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:44)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalNumericFormats(PafMetaData.java:437)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:45)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalNumericFormats(PafMetaData.java:437)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:46)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalNumericFormats(PafMetaData.java:437)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:47)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalNumericFormats(PafMetaData.java:437)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:48)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalNumericFormats(PafMetaData.java:437)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:50)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalNumericFormats(PafMetaData.java:437)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:51)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalNumericFormats(PafMetaData.java:437)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:52)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalNumericFormats(PafMetaData.java:437)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:54)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalNumericFormats(PafMetaData.java:437)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:55)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalNumericFormats(PafMetaData.java:437)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:57)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalNumericFormats(PafMetaData.java:437)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:58)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalNumericFormats(PafMetaData.java:437)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:60)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalNumericFormats(PafMetaData.java:437)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:61)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalNumericFormats(PafMetaData.java:437)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:62)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalNumericFormats(PafMetaData.java:437)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:63)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalNumericFormats(PafMetaData.java:437)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:65)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalNumericFormats(PafMetaData.java:437)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:67)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalNumericFormats(PafMetaData.java:437)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:68)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalNumericFormats(PafMetaData.java:437)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:69)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalNumericFormats(PafMetaData.java:437)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:71)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalNumericFormats(PafMetaData.java:437)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:72)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalNumericFormats(PafMetaData.java:437)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:74)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalNumericFormats(PafMetaData.java:437)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:75)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalNumericFormats(PafMetaData.java:437)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:76)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalNumericFormats(PafMetaData.java:437)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:78)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalNumericFormats(PafMetaData.java:437)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:79)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalNumericFormats(PafMetaData.java:437)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:80)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalNumericFormats(PafMetaData.java:437)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:82)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalNumericFormats(PafMetaData.java:437)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:83)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalNumericFormats(PafMetaData.java:437)
			}
		}
		if ("com.palladium.utility.PafXStream".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "importObjectFromXml", argument_types)) {
				return "";
				// at com.palladium.paf.server.PafMetaData.importGlobalNumericFormats(PafMetaData.java:437)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importGlobalNumericFormats()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importGlobalNumericFormats()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportGlobalNumericFormats2() throws Throwable {
		_f0 = new ServerSettings();
		// jtest_tested_method
		Map RETVAL = PafMetaData.importGlobalNumericFormats();
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportGlobalNumericFormats2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportGlobalNumericFormats2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
			}
		}
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
			}
		}
		if (Stubs.matches(method, PafXStream.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "importObjectFromXml", argument_types)) {
				return null;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importGlobalNumericFormats()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importGlobalNumericFormats()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportGlobalNumericFormats3() throws Throwable {
		_f0 = new ServerSettings();
		_f7 = new Configuration();
		// jtest_tested_method
		Map RETVAL = PafMetaData.importGlobalNumericFormats();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("0", RETVAL.toString()); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportGlobalNumericFormats3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportGlobalNumericFormats3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
			}
		}
		if ("org.springframework.context.support.AbstractApplicationContext"
			.equals(method.getDeclaringClass().getName())) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:85)
			}
		}
		if ("org.hibernate.cfg.Configuration".equals(method.getDeclaringClass()
			.getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "configure", argument_types)) {
				return _f7;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if ("com.palladium.utility.PafXStream".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "importObjectFromXml", argument_types)) {
				return Stubs.makeStubObject(Map.class);
				// at com.palladium.paf.server.PafMetaData.importGlobalNumericFormats(PafMetaData.java:437)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importGlobalStyles()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importGlobalStyles()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportGlobalStyles1() throws Throwable {
		_f0 = new ServerSettings();
		// jtest_tested_method
		Map RETVAL = PafMetaData.importGlobalStyles();
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportGlobalStyles1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportGlobalStyles1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
			}
		}
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importGlobalStyles()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importGlobalStyles()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportGlobalStyles2() throws Throwable {
		// jtest_tested_method
		Map RETVAL = PafMetaData.importGlobalStyles();
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(false, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportGlobalStyles2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportGlobalStyles2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isDebugMode", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:110)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafServerHome", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafMetaData.getConfigDirPath(PafMetaData.java:100)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
			}
		}
		if (Stubs.matches(method, Class.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "forName", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.lang.Class.forName(java.lang.String)");
				switch (index) {
					case 1 :
						return java.lang.Object.class;
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:559)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					case 2 :
						throw new ClassNotFoundException();
					// at com.thoughtworks.xstream.core.util.CompositeClassLoader.class$(CompositeClassLoader.java:40)
					// at com.thoughtworks.xstream.core.util.CompositeClassLoader.<init>(CompositeClassLoader.java:40)
					// at com.thoughtworks.xstream.XStream.<init>(XStream.java:191)
					// at com.thoughtworks.xstream.XStream.<init>(XStream.java:181)
					// at com.thoughtworks.xstream.XStream.<init>(XStream.java:156)
					// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:38)
					// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
					// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
					// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importGlobalStyles()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importGlobalStyles()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportGlobalStyles3() throws Throwable {
		_f0 = new ServerSettings();
		// jtest_tested_method
		Map RETVAL = PafMetaData.importGlobalStyles();
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportGlobalStyles3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportGlobalStyles3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:85)
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
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				return Stubs.makeStubObject(DatabaseMetaData.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:74)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
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
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverName", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverVersion", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "supportsResultSetType", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:80)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "supportsBatchUpdates", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:81)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, XStream.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "fromXML", argument_types)) {
				return null;
				// at com.palladium.utility.PafXStream.importObjectFromXml(PafXStream.java:110)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importGlobalStyles()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importGlobalStyles()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportGlobalStyles7() throws Throwable {
		_f0 = new ServerSettings();
		_f7 = new Configuration();
		_f0.setClearOutlineCache(false);
		_f0.setDebugMode(false);
		_f0.setEvaluationStepLogging(false);
		_f0.setPafSecurityBootupPassword("");
		_f0.setPafSecurityPassword("");
		_f0.setPafSecurityUser("");
		_f0.setCalcScriptTimeout("");
		_f0.setChangedCellLogging(false);
		// jtest_tested_method
		Map RETVAL = PafMetaData.importGlobalStyles();
		// ClassCastException thrown
		// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportGlobalStyles7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportGlobalStyles7(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
			}
		}
		if ("org.springframework.context.support.AbstractApplicationContext"
			.equals(method.getDeclaringClass().getName())) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:85)
			}
		}
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:110)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafServerHome", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafMetaData.getConfigDirPath(PafMetaData.java:100)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
			}
		}
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if ("org.hibernate.cfg.Configuration".equals(method.getDeclaringClass()
			.getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "configure", argument_types)) {
				return _f7;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, XStream.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(XStream.class);
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:38)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
			}
			argument_types = new Class[] { String.class, Class.class };
			if (Stubs.matches(method, "alias", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:40)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:41)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:42)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:43)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:44)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:45)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:46)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:47)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:48)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:50)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:51)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:52)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:54)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:55)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:57)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:58)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:60)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:61)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:62)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:63)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:65)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:67)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:68)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:69)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:71)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:72)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:74)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:75)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:76)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:78)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:79)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:80)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:82)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:83)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
			}
		}
		if ("com.palladium.utility.PafXStream".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "importObjectFromXml", argument_types)) {
				return "";
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importGlobalStyles()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importGlobalStyles()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportGlobalStyles9() throws Throwable {
		_f0 = new ServerSettings();
		_f7 = new Configuration();
		_f0.setClearOutlineCache(false);
		_f0.setDebugMode(false);
		_f0.setEvaluationStepLogging(false);
		_f0.setPafSecurityBootupPassword("");
		_f0.setPafSecurityPassword("");
		_f0.setPafSecurityUser("");
		_f0.setCalcScriptTimeout("");
		_f0.setChangedCellLogging(false);
		// jtest_tested_method
		Map RETVAL = PafMetaData.importGlobalStyles();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("0", RETVAL.toString()); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportGlobalStyles9.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportGlobalStyles9(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
			}
		}
		if ("org.springframework.context.support.AbstractApplicationContext"
			.equals(method.getDeclaringClass().getName())) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:85)
			}
		}
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:110)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafServerHome", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafMetaData.getConfigDirPath(PafMetaData.java:100)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
			}
		}
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if ("org.hibernate.cfg.Configuration".equals(method.getDeclaringClass()
			.getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "configure", argument_types)) {
				return _f7;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, XStream.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(XStream.class);
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:38)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
			}
			argument_types = new Class[] { String.class, Class.class };
			if (Stubs.matches(method, "alias", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:40)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:41)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:42)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:43)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:44)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:45)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:46)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:47)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:48)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:50)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:51)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:52)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:54)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:55)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:57)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:58)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:60)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:61)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:62)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:63)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:65)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:67)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:68)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:69)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:71)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:72)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:74)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:75)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:76)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:78)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:79)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:80)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:82)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:83)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
			}
		}
		if ("com.palladium.utility.PafXStream".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "importObjectFromXml", argument_types)) {
				return Stubs.makeStubObject(Map.class);
				// at com.palladium.paf.server.PafMetaData.importGlobalStyles(PafMetaData.java:415)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importMeasures()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importMeasures()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportMeasures1() throws Throwable {
		_f0 = new ServerSettings();
		// jtest_tested_method
		MeasureDef[] RETVAL = PafMetaData.importMeasures();
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportMeasures1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportMeasures1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
			}
		}
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
			}
		}
		if (Stubs.matches(method, XStream.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "fromXML", argument_types)) {
				return null;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importMeasures()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importMeasures()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportMeasures2() throws Throwable {
		// jtest_tested_method
		MeasureDef[] RETVAL = PafMetaData.importMeasures();
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(false, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportMeasures2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportMeasures2(
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
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PafXStream.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "importObjectFromXml", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importMeasures(PafMetaData.java:372)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importMeasures()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importMeasures()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportMeasures3() throws Throwable {
		// jtest_tested_method
		MeasureDef[] RETVAL = PafMetaData.importMeasures();
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportMeasures3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportMeasures3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isDebugMode", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:110)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafServerHome", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafMetaData.getConfigDirPath(PafMetaData.java:100)
				// at com.palladium.paf.server.PafMetaData.importMeasures(PafMetaData.java:373)
			}
		}
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				return Stubs.makeStubObject(DatabaseMetaData.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:74)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
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
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverName", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverVersion", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "supportsResultSetType", argument_types)) {
				return Boolean.TRUE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:80)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "supportsBatchUpdates", argument_types)) {
				return Boolean.TRUE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:81)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PafXStream.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "importObjectFromXml", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importMeasures(PafMetaData.java:372)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importPlannerConfig()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importPlannerConfig()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportPlannerConfig1() throws Throwable {
		// jtest_tested_method
		PafPlannerConfig[] RETVAL = PafMetaData.importPlannerConfig();
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(false, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportPlannerConfig1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportPlannerConfig1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isDebugMode", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:110)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafServerHome", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafMetaData.getConfigDirPath(PafMetaData.java:100)
				// at com.palladium.paf.server.PafMetaData.importPlannerConfig(PafMetaData.java:491)
			}
		}
		if (Stubs.matches(method, ThreadLocal.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at org.apache.derby.iapi.services.context.ContextService.getCurrentContextManager
				// at org.apache.derby.impl.services.monitor.BaseMonitor.bootService
				// at org.apache.derby.impl.services.monitor.BaseMonitor.startServices
				// at org.apache.derby.impl.services.monitor.BaseMonitor.runWithState
				// at org.apache.derby.impl.services.monitor.FileMonitor.<init>
				// at org.apache.derby.iapi.services.monitor.Monitor.startMonitor
				// at org.apache.derby.iapi.jdbc.JDBCBoot.boot
				// at org.apache.derby.jdbc.EmbeddedDriver.boot
				// at org.apache.derby.jdbc.EmbeddedDriver.<clinit>
				// at java.lang.Class.forName0
				// at java.lang.Class.forName
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:559)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importPlannerConfig()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importPlannerConfig()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportPlannerConfig2() throws Throwable {
		_f0 = new ServerSettings();
		// jtest_tested_method
		PafPlannerConfig[] RETVAL = PafMetaData.importPlannerConfig();
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportPlannerConfig2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportPlannerConfig2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
			}
		}
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
			}
		}
		if (Stubs.matches(method, PafXStream.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "importObjectFromXml", argument_types)) {
				return null;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importPlannerConfig()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importPlannerConfig()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportPlannerConfig3() throws Throwable {
		_f0 = new ServerSettings();
		_f7 = new Configuration();
		// jtest_tested_method
		PafPlannerConfig[] RETVAL = PafMetaData.importPlannerConfig();
		// ClassCastException thrown
		// at com.palladium.paf.server.PafMetaData.importPlannerConfig(PafMetaData.java:491)
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportPlannerConfig3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportPlannerConfig3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:85)
			}
		}
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "configure", argument_types)) {
				return _f7;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, XStream.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(XStream.class);
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:38)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importPlannerConfig(PafMetaData.java:491)
			}
			argument_types = new Class[] { String.class, Class.class };
			if (Stubs.matches(method, "alias", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:40)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importPlannerConfig(PafMetaData.java:491)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:41)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importPlannerConfig(PafMetaData.java:491)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:42)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importPlannerConfig(PafMetaData.java:491)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:43)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importPlannerConfig(PafMetaData.java:491)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:44)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importPlannerConfig(PafMetaData.java:491)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:45)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importPlannerConfig(PafMetaData.java:491)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:46)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importPlannerConfig(PafMetaData.java:491)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:47)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importPlannerConfig(PafMetaData.java:491)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:48)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importPlannerConfig(PafMetaData.java:491)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:50)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importPlannerConfig(PafMetaData.java:491)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:51)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importPlannerConfig(PafMetaData.java:491)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:52)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importPlannerConfig(PafMetaData.java:491)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:54)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importPlannerConfig(PafMetaData.java:491)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:55)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importPlannerConfig(PafMetaData.java:491)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:57)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importPlannerConfig(PafMetaData.java:491)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:58)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importPlannerConfig(PafMetaData.java:491)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:60)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importPlannerConfig(PafMetaData.java:491)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:61)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importPlannerConfig(PafMetaData.java:491)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:62)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importPlannerConfig(PafMetaData.java:491)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:63)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importPlannerConfig(PafMetaData.java:491)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:65)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importPlannerConfig(PafMetaData.java:491)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:67)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importPlannerConfig(PafMetaData.java:491)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:68)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importPlannerConfig(PafMetaData.java:491)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:69)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importPlannerConfig(PafMetaData.java:491)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:71)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importPlannerConfig(PafMetaData.java:491)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:72)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importPlannerConfig(PafMetaData.java:491)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:74)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importPlannerConfig(PafMetaData.java:491)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:75)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importPlannerConfig(PafMetaData.java:491)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:76)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importPlannerConfig(PafMetaData.java:491)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:78)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importPlannerConfig(PafMetaData.java:491)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:79)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importPlannerConfig(PafMetaData.java:491)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:80)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importPlannerConfig(PafMetaData.java:491)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:82)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importPlannerConfig(PafMetaData.java:491)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:83)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importPlannerConfig(PafMetaData.java:491)
			}
		}
		if ("com.palladium.utility.PafXStream".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "importObjectFromXml", argument_types)) {
				return "";
				// at com.palladium.paf.server.PafMetaData.importPlannerConfig(PafMetaData.java:491)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importRoles()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importRoles()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportRoles1() throws Throwable {
		_f0 = new ServerSettings();
		// jtest_tested_method
		PafPlannerRole[] RETVAL = PafMetaData.importRoles();
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportRoles1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportRoles1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
			}
		}
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importRoles()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importRoles()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportRoles2() throws Throwable {
		// jtest_tested_method
		PafPlannerRole[] RETVAL = PafMetaData.importRoles();
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(false, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportRoles2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportRoles2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isDebugMode", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:110)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafServerHome", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafMetaData.getConfigDirPath(PafMetaData.java:100)
				// at com.palladium.paf.server.PafMetaData.importRoles(PafMetaData.java:325)
			}
		}
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importRoles()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importRoles()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportRoles3() throws Throwable {
		// jtest_tested_method
		PafPlannerRole[] RETVAL = PafMetaData.importRoles();
		// ClassCastException thrown
		// at com.palladium.paf.server.PafMetaData.importRoles(PafMetaData.java:324)
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportRoles3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportRoles3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				return Stubs.makeStubObject(DatabaseMetaData.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:74)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
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
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverName", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverVersion", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "supportsResultSetType", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:80)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "supportsBatchUpdates", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:81)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PafXStream.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "importObjectFromXml", argument_types)) {
				return "";
				// at com.palladium.paf.server.PafMetaData.importRoles(PafMetaData.java:325)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importRuleSets()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importRuleSets()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportRuleSets1() throws Throwable {
		// jtest_tested_method
		List RETVAL = PafMetaData.importRuleSets();
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(false, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportRuleSets1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportRuleSets1(
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
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, XStream.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "fromXML", argument_types)) {
				return null;
				// at com.palladium.utility.PafXStream.importObjectFromXml(PafXStream.java:110)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importRuleSets(PafMetaData.java:277)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importRuleSets()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importRuleSets()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportRuleSets2() throws Throwable {
		// jtest_tested_method
		List RETVAL = PafMetaData.importRuleSets();
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportRuleSets2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportRuleSets2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isDebugMode", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:110)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafServerHome", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafMetaData.getConfigDirPath(PafMetaData.java:100)
				// at com.palladium.paf.server.PafMetaData.importRuleSets(PafMetaData.java:277)
			}
		}
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				return Stubs.makeStubObject(DatabaseMetaData.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:74)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
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
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverName", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverVersion", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "supportsResultSetType", argument_types)) {
				return Boolean.TRUE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:80)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "supportsBatchUpdates", argument_types)) {
				return Boolean.TRUE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:81)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importRuleSets()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importRuleSets()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportRuleSets3() throws Throwable {
		_f0 = new ServerSettings();
		_f0.setClearOutlineCache(false);
		_f0.setDebugMode(false);
		_f0.setEvaluationStepLogging(false);
		_f0.setPafSecurityBootupPassword("");
		_f0.setPafSecurityPassword("");
		_f0.setPafSecurityUser("");
		_f0.setCalcScriptTimeout("");
		_f0.setChangedCellLogging(false);
		// jtest_tested_method
		List RETVAL = PafMetaData.importRuleSets();
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportRuleSets3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportRuleSets3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
			}
		}
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
			}
		}
		if (Stubs.matches(method, PafXStream.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "importObjectFromXml", argument_types)) {
				throw new PafConfigFileNotFoundException();
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importRuleSets()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importRuleSets()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportRuleSets4() throws Throwable {
		// jtest_tested_method
		List RETVAL = PafMetaData.importRuleSets();
		// ClassCastException thrown
		// at java.lang.Class.cast(Class.java:2920)
		// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
		// at com.palladium.paf.server.PafMetaData.importRuleSets(PafMetaData.java:277)
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportRuleSets4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportRuleSets4(
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
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				return Stubs.makeStubObject(DatabaseMetaData.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:74)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
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
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverName", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverVersion", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "supportsResultSetType", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:80)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "supportsBatchUpdates", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:81)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importUserSelections()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importUserSelections()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportUserSelections1() throws Throwable {
		// jtest_tested_method
		PafUserSelection[] RETVAL = PafMetaData.importUserSelections();
		// ClassCastException thrown
		// at com.palladium.paf.server.PafMetaData.importUserSelections(PafMetaData.java:306)
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportUserSelections1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportUserSelections1(
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
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				return Stubs.makeStubObject(DatabaseMetaData.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:74)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
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
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverName", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverVersion", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "supportsResultSetType", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:80)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "supportsBatchUpdates", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:81)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PafXStream.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "importObjectFromXml", argument_types)) {
				return "";
				// at com.palladium.paf.server.PafMetaData.importUserSelections(PafMetaData.java:307)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importUserSelections()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importUserSelections()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportUserSelections2() throws Throwable {
		_f0 = new ServerSettings();
		// jtest_tested_method
		PafUserSelection[] RETVAL = PafMetaData.importUserSelections();
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportUserSelections2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportUserSelections2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
			}
		}
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
			}
		}
		if (Stubs.matches(method, PafXStream.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "importObjectFromXml", argument_types)) {
				return null;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importUserSelections()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importUserSelections()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportUserSelections3() throws Throwable {
		// jtest_tested_method
		PafUserSelection[] RETVAL = PafMetaData.importUserSelections();
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(false, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportUserSelections3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportUserSelections3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isDebugMode", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:110)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafServerHome", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafMetaData.getConfigDirPath(PafMetaData.java:100)
				// at com.palladium.paf.server.PafMetaData.importUserSelections(PafMetaData.java:307)
			}
		}
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importUsers()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importUsers()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportUsers1() throws Throwable {
		_f0 = new ServerSettings();
		// jtest_tested_method
		PafUser[] RETVAL = PafMetaData.importUsers();
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportUsers1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportUsers1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
			}
		}
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importUsers()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importUsers()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportUsers2() throws Throwable {
		// jtest_tested_method
		PafUser[] RETVAL = PafMetaData.importUsers();
		// ClassCastException thrown
		// at com.palladium.paf.server.PafMetaData.importUsers(PafMetaData.java:289)
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportUsers2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportUsers2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				return Stubs.makeStubObject(DatabaseMetaData.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:74)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
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
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverName", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverVersion", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "supportsResultSetType", argument_types)) {
				return Boolean.TRUE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:80)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "supportsBatchUpdates", argument_types)) {
				return Boolean.TRUE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:81)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PafXStream.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "importObjectFromXml", argument_types)) {
				return "";
				// at com.palladium.paf.server.PafMetaData.importUsers(PafMetaData.java:290)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importUsers()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importUsers()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportUsers3() throws Throwable {
		// jtest_tested_method
		PafUser[] RETVAL = PafMetaData.importUsers();
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(false, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportUsers3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportUsers3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isDebugMode", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:110)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafServerHome", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafMetaData.getConfigDirPath(PafMetaData.java:100)
				// at com.palladium.paf.server.PafMetaData.importUsers(PafMetaData.java:290)
			}
		}
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importVersions()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importVersions()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportVersions1() throws Throwable {
		_f0 = new ServerSettings();
		// jtest_tested_method
		VersionDef[] RETVAL = PafMetaData.importVersions();
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportVersions1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportVersions1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
			}
		}
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importVersions()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importVersions()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportVersions2() throws Throwable {
		// jtest_tested_method
		VersionDef[] RETVAL = PafMetaData.importVersions();
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(false, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportVersions2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportVersions2(
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
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importVersions()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importVersions()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportVersions3() throws Throwable {
		// jtest_tested_method
		VersionDef[] RETVAL = PafMetaData.importVersions();
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportVersions3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportVersions3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isDebugMode", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:110)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafServerHome", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafMetaData.getConfigDirPath(PafMetaData.java:100)
				// at com.palladium.paf.server.PafMetaData.importVersions(PafMetaData.java:378)
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
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				return Stubs.makeStubObject(DatabaseMetaData.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:74)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
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
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverName", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverVersion", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "supportsResultSetType", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:80)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "supportsBatchUpdates", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:81)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PafXStream.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "importObjectFromXml", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importVersions(PafMetaData.java:377)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importViewGroups()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importViewGroups()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportViewGroups1() throws Throwable {
		// jtest_tested_method
		Map RETVAL = PafMetaData.importViewGroups();
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(false, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportViewGroups1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportViewGroups1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isDebugMode", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:110)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafServerHome", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafMetaData.getConfigDirPath(PafMetaData.java:100)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
			}
		}
		if (Stubs.matches(method, ThreadLocal.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at org.apache.derby.iapi.services.context.ContextService.getCurrentContextManager
				// at org.apache.derby.impl.services.monitor.BaseMonitor.bootService
				// at org.apache.derby.impl.services.monitor.BaseMonitor.startServices
				// at org.apache.derby.impl.services.monitor.BaseMonitor.runWithState
				// at org.apache.derby.impl.services.monitor.FileMonitor.<init>
				// at org.apache.derby.iapi.services.monitor.Monitor.startMonitor
				// at org.apache.derby.iapi.jdbc.JDBCBoot.boot
				// at org.apache.derby.jdbc.EmbeddedDriver.boot
				// at org.apache.derby.jdbc.EmbeddedDriver.<clinit>
				// at java.lang.Class.forName0
				// at java.lang.Class.forName
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:559)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, XStream.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(XStream.class);
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:38)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
			}
			argument_types = new Class[] { String.class, Class.class };
			if (Stubs.matches(method, "alias", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:40)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:41)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:42)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:43)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:44)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:45)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:46)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:47)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:48)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:50)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:51)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:52)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:54)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:55)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:57)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:58)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:60)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:61)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:62)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:63)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:65)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:67)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:68)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:69)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:71)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:72)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:74)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:75)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:76)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:78)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:79)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:80)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:82)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:83)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importViewGroups()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importViewGroups()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportViewGroups2() throws Throwable {
		_f0 = new ServerSettings();
		// jtest_tested_method
		Map RETVAL = PafMetaData.importViewGroups();
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportViewGroups2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportViewGroups2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
			}
		}
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
			}
		}
		if (Stubs.matches(method, PafXStream.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "importObjectFromXml", argument_types)) {
				return null;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importViewGroups()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importViewGroups()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportViewGroups3() throws Throwable {
		_f0 = new ServerSettings();
		_f0.setClearOutlineCache(false);
		_f0.setDebugMode(false);
		_f0.setEvaluationStepLogging(false);
		_f0.setPafSecurityBootupPassword("");
		_f0.setPafSecurityPassword("");
		_f0.setPafSecurityUser("");
		_f0.setCalcScriptTimeout("");
		_f0.setChangedCellLogging(false);
		// jtest_tested_method
		Map RETVAL = PafMetaData.importViewGroups();
		// ClassCastException thrown
		// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportViewGroups3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportViewGroups3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Class.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "forName", argument_types)) {
				return java.lang.Object.class;
				// at org.springframework.context.support.AbstractApplicationContext.class$(AbstractApplicationContext.java:123)
				// at org.springframework.context.support.AbstractApplicationContext.<clinit>(AbstractApplicationContext.java:123)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
				// 
				// at org.hibernate.cfg.Configuration.class$(Configuration.java:111)
				// at org.hibernate.cfg.Configuration.<clinit>(Configuration.java:111)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.cfg.SettingsFactory.class$(SettingsFactory.java:46)
				// at org.hibernate.cfg.SettingsFactory.<clinit>(SettingsFactory.java:46)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.util.XMLHelper.class$(XMLHelper.java:24)
				// at org.hibernate.util.XMLHelper.<clinit>(XMLHelper.java:24)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:146)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.util.DTDEntityResolver.class$(DTDEntityResolver.java:17)
				// at org.hibernate.util.DTDEntityResolver.<clinit>(DTDEntityResolver.java:17)
				// at org.hibernate.util.XMLHelper.<clinit>(XMLHelper.java:25)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:146)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.cfg.Environment.class$(Environment.java:448)
				// at org.hibernate.cfg.Environment.<clinit>(Environment.java:448)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:151)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.cfg.Environment.class$(Environment.java:448)
				// at org.hibernate.cfg.Environment.<clinit>(Environment.java:514)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:151)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.cfg.Environment.<clinit>(Environment.java:525)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:151)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.AbstractReassociateEventListener.class$(AbstractReassociateEventListener.java:28)
				// at org.hibernate.event.def.AbstractReassociateEventListener.<clinit>(AbstractReassociateEventListener.java:28)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:47)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.AbstractLockUpgradeEventListener.class$(AbstractLockUpgradeEventListener.java:26)
				// at org.hibernate.event.def.AbstractLockUpgradeEventListener.<clinit>(AbstractLockUpgradeEventListener.java:26)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:47)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.DefaultLoadEventListener.class$(DefaultLoadEventListener.java:44)
				// at org.hibernate.event.def.DefaultLoadEventListener.<clinit>(DefaultLoadEventListener.java:44)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:47)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.AbstractSaveEventListener.class$(AbstractSaveEventListener.java:48)
				// at org.hibernate.event.def.AbstractSaveEventListener.<clinit>(AbstractSaveEventListener.java:48)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:48)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.DefaultSaveOrUpdateEventListener.class$(DefaultSaveOrUpdateEventListener.java:37)
				// at org.hibernate.event.def.DefaultSaveOrUpdateEventListener.<clinit>(DefaultSaveOrUpdateEventListener.java:37)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:48)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.DefaultMergeEventListener.class$(DefaultMergeEventListener.java:36)
				// at org.hibernate.event.def.DefaultMergeEventListener.<clinit>(DefaultMergeEventListener.java:36)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:49)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.DefaultPersistEventListener.class$(DefaultPersistEventListener.java:29)
				// at org.hibernate.event.def.DefaultPersistEventListener.<clinit>(DefaultPersistEventListener.java:29)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:50)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.DefaultReplicateEventListener.class$(DefaultReplicateEventListener.java:33)
				// at org.hibernate.event.def.DefaultReplicateEventListener.<clinit>(DefaultReplicateEventListener.java:33)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:51)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.DefaultDeleteEventListener.class$(DefaultDeleteEventListener.java:39)
				// at org.hibernate.event.def.DefaultDeleteEventListener.<clinit>(DefaultDeleteEventListener.java:39)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:52)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.AbstractFlushingEventListener.class$(AbstractFlushingEventListener.java:39)
				// at org.hibernate.event.def.AbstractFlushingEventListener.<clinit>(AbstractFlushingEventListener.java:39)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:53)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.DefaultAutoFlushEventListener.class$(DefaultAutoFlushEventListener.java:20)
				// at org.hibernate.event.def.DefaultAutoFlushEventListener.<clinit>(DefaultAutoFlushEventListener.java:20)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:53)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.DefaultDirtyCheckEventListener.class$(DefaultDirtyCheckEventListener.java:19)
				// at org.hibernate.event.def.DefaultDirtyCheckEventListener.<clinit>(DefaultDirtyCheckEventListener.java:19)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:54)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.DefaultEvictEventListener.class$(DefaultEvictEventListener.java:32)
				// at org.hibernate.event.def.DefaultEvictEventListener.<clinit>(DefaultEvictEventListener.java:32)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:56)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.DefaultRefreshEventListener.class$(DefaultRefreshEventListener.java:36)
				// at org.hibernate.event.def.DefaultRefreshEventListener.<clinit>(DefaultRefreshEventListener.java:36)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:58)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.DefaultFlushEntityEventListener.class$(DefaultFlushEntityEventListener.java:40)
				// at org.hibernate.event.def.DefaultFlushEntityEventListener.<clinit>(DefaultFlushEntityEventListener.java:40)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:59)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.event.def.DefaultInitializeCollectionEventListener.class$(DefaultInitializeCollectionEventListener.java:28)
				// at org.hibernate.event.def.DefaultInitializeCollectionEventListener.<clinit>(DefaultInitializeCollectionEventListener.java:28)
				// at org.hibernate.event.SessionEventListenerConfig.<init>(SessionEventListenerConfig.java:60)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:153)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.cfg.Configuration.class$(Configuration.java:111)
				// at org.hibernate.cfg.Configuration.getConfigurationInputStream(Configuration.java:1118)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1149)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1136)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.dom4j.DocumentFactory.createSingleton(DocumentFactory.java:70)
				// at org.dom4j.DocumentFactory.getInstance(DocumentFactory.java:95)
				// at org.dom4j.io.SAXReader.getDocumentFactory(SAXReader.java:645)
				// at org.dom4j.io.SAXReader.createContentHandler(SAXReader.java:969)
				// at org.dom4j.io.SAXReader.read(SAXReader.java:449)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1206)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1150)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1136)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.dom4j.tree.NamespaceCache.<clinit>(NamespaceCache.java:47)
				// at org.dom4j.Namespace.<clinit>(Namespace.java:25)
				// at org.dom4j.DocumentFactory.createNamespace(DocumentFactory.java:185)
				// at org.dom4j.tree.NamespaceStack.createNamespace(NamespaceStack.java:407)
				// at org.dom4j.tree.NamespaceStack.getQName(NamespaceStack.java:211)
				// at org.dom4j.io.SAXContentHandler.startElement(SAXContentHandler.java:234)
				// at org.apache.xerces.parsers.AbstractSAXParser.startElement
				// at org.apache.xerces.impl.dtd.XMLDTDValidator.startElement
				// at org.apache.xerces.impl.XMLNSDocumentScannerImpl.scanStartElement
				// at org.apache.xerces.impl.XMLNSDocumentScannerImpl$NSContentDispatcher.scanRootElementHook
				// at org.apache.xerces.impl.XMLDocumentFragmentScannerImpl$FragmentContentDispatcher.dispatch
				// at org.apache.xerces.impl.XMLDocumentFragmentScannerImpl.scanDocument
				// at org.apache.xerces.parsers.XML11Configuration.parse
				// at org.apache.xerces.parsers.XML11Configuration.parse
				// at org.apache.xerces.parsers.XMLParser.parse
				// at org.apache.xerces.parsers.AbstractSAXParser.parse
				// at org.dom4j.io.SAXReader.read(SAXReader.java:465)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1206)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1150)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1136)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.dom4j.tree.NamespaceCache.<clinit>(NamespaceCache.java:58)
				// at org.dom4j.Namespace.<clinit>(Namespace.java:25)
				// at org.dom4j.DocumentFactory.createNamespace(DocumentFactory.java:185)
				// at org.dom4j.tree.NamespaceStack.createNamespace(NamespaceStack.java:407)
				// at org.dom4j.tree.NamespaceStack.getQName(NamespaceStack.java:211)
				// at org.dom4j.io.SAXContentHandler.startElement(SAXContentHandler.java:234)
				// at org.apache.xerces.parsers.AbstractSAXParser.startElement
				// at org.apache.xerces.impl.dtd.XMLDTDValidator.startElement
				// at org.apache.xerces.impl.XMLNSDocumentScannerImpl.scanStartElement
				// at org.apache.xerces.impl.XMLNSDocumentScannerImpl$NSContentDispatcher.scanRootElementHook
				// at org.apache.xerces.impl.XMLDocumentFragmentScannerImpl$FragmentContentDispatcher.dispatch
				// at org.apache.xerces.impl.XMLDocumentFragmentScannerImpl.scanDocument
				// at org.apache.xerces.parsers.XML11Configuration.parse
				// at org.apache.xerces.parsers.XML11Configuration.parse
				// at org.apache.xerces.parsers.XMLParser.parse
				// at org.apache.xerces.parsers.AbstractSAXParser.parse
				// at org.dom4j.io.SAXReader.read(SAXReader.java:465)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1206)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1150)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1136)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.dom4j.QName.<clinit>(QName.java:39)
				// at org.dom4j.tree.QNameCache.get(QNameCache.java:117)
				// at org.dom4j.DocumentFactory.createQName(DocumentFactory.java:199)
				// at org.dom4j.tree.NamespaceStack.createQName(NamespaceStack.java:392)
				// at org.dom4j.tree.NamespaceStack.pushQName(NamespaceStack.java:374)
				// at org.dom4j.tree.NamespaceStack.getQName(NamespaceStack.java:213)
				// at org.dom4j.io.SAXContentHandler.startElement(SAXContentHandler.java:234)
				// at org.apache.xerces.parsers.AbstractSAXParser.startElement
				// at org.apache.xerces.impl.dtd.XMLDTDValidator.startElement
				// at org.apache.xerces.impl.XMLNSDocumentScannerImpl.scanStartElement
				// at org.apache.xerces.impl.XMLNSDocumentScannerImpl$NSContentDispatcher.scanRootElementHook
				// at org.apache.xerces.impl.XMLDocumentFragmentScannerImpl$FragmentContentDispatcher.dispatch
				// at org.apache.xerces.impl.XMLDocumentFragmentScannerImpl.scanDocument
				// at org.apache.xerces.parsers.XML11Configuration.parse
				// at org.apache.xerces.parsers.XML11Configuration.parse
				// at org.apache.xerces.parsers.XMLParser.parse
				// at org.apache.xerces.parsers.AbstractSAXParser.parse
				// at org.dom4j.io.SAXReader.read(SAXReader.java:465)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1206)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1150)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1136)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.cfg.Mappings.class$(Mappings.java:34)
				// at org.hibernate.cfg.Mappings.<clinit>(Mappings.java:34)
				// at org.hibernate.cfg.Configuration.createMappings(Configuration.java:379)
				// at org.hibernate.cfg.Configuration.add(Configuration.java:370)
				// at org.hibernate.cfg.Configuration.addInputStream(Configuration.java:409)
				// at org.hibernate.cfg.Configuration.addResource(Configuration.java:460)
				// at org.hibernate.cfg.Configuration.parseMappingElement(Configuration.java:1300)
				// at org.hibernate.cfg.Configuration.parseSessionFactory(Configuration.java:1272)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1254)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1230)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1150)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1136)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.cfg.HbmBinder.class$(HbmBinder.java:94)
				// at org.hibernate.cfg.HbmBinder.<clinit>(HbmBinder.java:94)
				// at org.hibernate.cfg.Configuration.add(Configuration.java:370)
				// at org.hibernate.cfg.Configuration.addInputStream(Configuration.java:409)
				// at org.hibernate.cfg.Configuration.addResource(Configuration.java:460)
				// at org.hibernate.cfg.Configuration.parseMappingElement(Configuration.java:1300)
				// at org.hibernate.cfg.Configuration.parseSessionFactory(Configuration.java:1272)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1254)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1230)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1150)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1136)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.util.ReflectHelper.class$(ReflectHelper.java:28)
				// at org.hibernate.util.ReflectHelper.<clinit>(ReflectHelper.java:28)
				// at org.hibernate.mapping.SimpleValue.setTypeUsingReflection(SimpleValue.java:275)
				// at org.hibernate.cfg.HbmBinder.bindSimpleId(HbmBinder.java:367)
				// at org.hibernate.cfg.HbmBinder.bindRootPersistentClassCommonValues(HbmBinder.java:301)
				// at org.hibernate.cfg.HbmBinder.bindRootClass(HbmBinder.java:242)
				// at org.hibernate.cfg.HbmBinder.bindRoot(HbmBinder.java:153)
				// at org.hibernate.cfg.Configuration.add(Configuration.java:370)
				// at org.hibernate.cfg.Configuration.addInputStream(Configuration.java:409)
				// at org.hibernate.cfg.Configuration.addResource(Configuration.java:460)
				// at org.hibernate.cfg.Configuration.parseMappingElement(Configuration.java:1300)
				// at org.hibernate.cfg.Configuration.parseSessionFactory(Configuration.java:1272)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1254)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1230)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1150)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1136)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.property.BasicPropertyAccessor.class$(BasicPropertyAccessor.java:26)
				// at org.hibernate.property.BasicPropertyAccessor.<clinit>(BasicPropertyAccessor.java:26)
				// at org.hibernate.util.ReflectHelper.<clinit>(ReflectHelper.java:30)
				// at org.hibernate.mapping.SimpleValue.setTypeUsingReflection(SimpleValue.java:275)
				// at org.hibernate.cfg.HbmBinder.bindSimpleId(HbmBinder.java:367)
				// at org.hibernate.cfg.HbmBinder.bindRootPersistentClassCommonValues(HbmBinder.java:301)
				// at org.hibernate.cfg.HbmBinder.bindRootClass(HbmBinder.java:242)
				// at org.hibernate.cfg.HbmBinder.bindRoot(HbmBinder.java:153)
				// at org.hibernate.cfg.Configuration.add(Configuration.java:370)
				// at org.hibernate.cfg.Configuration.addInputStream(Configuration.java:409)
				// at org.hibernate.cfg.Configuration.addResource(Configuration.java:460)
				// at org.hibernate.cfg.Configuration.parseMappingElement(Configuration.java:1300)
				// at org.hibernate.cfg.Configuration.parseSessionFactory(Configuration.java:1272)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1254)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1230)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1150)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1136)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.util.ReflectHelper.class$(ReflectHelper.java:28)
				// at org.hibernate.util.ReflectHelper.<clinit>(ReflectHelper.java:34)
				// at org.hibernate.mapping.SimpleValue.setTypeUsingReflection(SimpleValue.java:275)
				// at org.hibernate.cfg.HbmBinder.bindSimpleId(HbmBinder.java:367)
				// at org.hibernate.cfg.HbmBinder.bindRootPersistentClassCommonValues(HbmBinder.java:301)
				// at org.hibernate.cfg.HbmBinder.bindRootClass(HbmBinder.java:242)
				// at org.hibernate.cfg.HbmBinder.bindRoot(HbmBinder.java:153)
				// at org.hibernate.cfg.Configuration.add(Configuration.java:370)
				// at org.hibernate.cfg.Configuration.addInputStream(Configuration.java:409)
				// at org.hibernate.cfg.Configuration.addResource(Configuration.java:460)
				// at org.hibernate.cfg.Configuration.parseMappingElement(Configuration.java:1300)
				// at org.hibernate.cfg.Configuration.parseSessionFactory(Configuration.java:1272)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1254)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1230)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1150)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1136)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.property.BasicPropertyAccessor.class$(BasicPropertyAccessor.java:26)
				// at org.hibernate.property.BasicPropertyAccessor.getGetterOrNull(BasicPropertyAccessor.java:295)
				// at org.hibernate.property.BasicPropertyAccessor.createGetter(BasicPropertyAccessor.java:280)
				// at org.hibernate.property.BasicPropertyAccessor.getGetter(BasicPropertyAccessor.java:275)
				// at org.hibernate.util.ReflectHelper.getter(ReflectHelper.java:87)
				// at org.hibernate.util.ReflectHelper.reflectedPropertyClass(ReflectHelper.java:78)
				// at org.hibernate.mapping.SimpleValue.setTypeUsingReflection(SimpleValue.java:275)
				// at org.hibernate.cfg.HbmBinder.bindSimpleId(HbmBinder.java:367)
				// at org.hibernate.cfg.HbmBinder.bindRootPersistentClassCommonValues(HbmBinder.java:301)
				// at org.hibernate.cfg.HbmBinder.bindRootClass(HbmBinder.java:242)
				// at org.hibernate.cfg.HbmBinder.bindRoot(HbmBinder.java:153)
				// at org.hibernate.cfg.Configuration.add(Configuration.java:370)
				// at org.hibernate.cfg.Configuration.addInputStream(Configuration.java:409)
				// at org.hibernate.cfg.Configuration.addResource(Configuration.java:460)
				// at org.hibernate.cfg.Configuration.parseMappingElement(Configuration.java:1300)
				// at org.hibernate.cfg.Configuration.parseSessionFactory(Configuration.java:1272)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1254)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1230)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1150)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1136)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.type.NullableType.class$(NullableType.java:29)
				// at org.hibernate.type.NullableType.<clinit>(NullableType.java:29)
				// at org.hibernate.Hibernate.<clinit>(Hibernate.java:76)
				// at org.hibernate.type.TypeFactory.<clinit>(TypeFactory.java:47)
				// at org.hibernate.mapping.ManyToOne.getType(ManyToOne.java:26)
				// at org.hibernate.mapping.ManyToOne.createForeignKey(ManyToOne.java:39)
				// at org.hibernate.cfg.HbmBinder.createProperty(HbmBinder.java:1978)
				// at org.hibernate.cfg.HbmBinder.createClassProperties(HbmBinder.java:1943)
				// at org.hibernate.cfg.HbmBinder.createClassProperties(HbmBinder.java:1833)
				// at org.hibernate.cfg.HbmBinder.bindRootPersistentClassCommonValues(HbmBinder.java:325)
				// at org.hibernate.cfg.HbmBinder.bindRootClass(HbmBinder.java:242)
				// at org.hibernate.cfg.HbmBinder.bindRoot(HbmBinder.java:153)
				// at org.hibernate.cfg.Configuration.add(Configuration.java:370)
				// at org.hibernate.cfg.Configuration.addInputStream(Configuration.java:409)
				// at org.hibernate.cfg.Configuration.addResource(Configuration.java:460)
				// at org.hibernate.cfg.Configuration.parseMappingElement(Configuration.java:1300)
				// at org.hibernate.cfg.Configuration.parseSessionFactory(Configuration.java:1272)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1254)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1230)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1150)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1136)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.type.CurrencyType.<clinit>(CurrencyType.java:28)
				// at org.hibernate.Hibernate.<clinit>(Hibernate.java:168)
				// at org.hibernate.type.TypeFactory.<clinit>(TypeFactory.java:47)
				// at org.hibernate.mapping.ManyToOne.getType(ManyToOne.java:26)
				// at org.hibernate.mapping.ManyToOne.createForeignKey(ManyToOne.java:39)
				// at org.hibernate.cfg.HbmBinder.createProperty(HbmBinder.java:1978)
				// at org.hibernate.cfg.HbmBinder.createClassProperties(HbmBinder.java:1943)
				// at org.hibernate.cfg.HbmBinder.createClassProperties(HbmBinder.java:1833)
				// at org.hibernate.cfg.HbmBinder.bindRootPersistentClassCommonValues(HbmBinder.java:325)
				// at org.hibernate.cfg.HbmBinder.bindRootClass(HbmBinder.java:242)
				// at org.hibernate.cfg.HbmBinder.bindRoot(HbmBinder.java:153)
				// at org.hibernate.cfg.Configuration.add(Configuration.java:370)
				// at org.hibernate.cfg.Configuration.addInputStream(Configuration.java:409)
				// at org.hibernate.cfg.Configuration.addResource(Configuration.java:460)
				// at org.hibernate.cfg.Configuration.parseMappingElement(Configuration.java:1300)
				// at org.hibernate.cfg.Configuration.parseSessionFactory(Configuration.java:1272)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1254)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1230)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1150)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1136)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.type.CurrencyType.class$(CurrencyType.java:41)
				// at org.hibernate.type.CurrencyType.<clinit>(CurrencyType.java:41)
				// at org.hibernate.Hibernate.<clinit>(Hibernate.java:168)
				// at org.hibernate.type.TypeFactory.<clinit>(TypeFactory.java:47)
				// at org.hibernate.mapping.ManyToOne.getType(ManyToOne.java:26)
				// at org.hibernate.mapping.ManyToOne.createForeignKey(ManyToOne.java:39)
				// at org.hibernate.cfg.HbmBinder.createProperty(HbmBinder.java:1978)
				// at org.hibernate.cfg.HbmBinder.createClassProperties(HbmBinder.java:1943)
				// at org.hibernate.cfg.HbmBinder.createClassProperties(HbmBinder.java:1833)
				// at org.hibernate.cfg.HbmBinder.bindRootPersistentClassCommonValues(HbmBinder.java:325)
				// at org.hibernate.cfg.HbmBinder.bindRootClass(HbmBinder.java:242)
				// at org.hibernate.cfg.HbmBinder.bindRoot(HbmBinder.java:153)
				// at org.hibernate.cfg.Configuration.add(Configuration.java:370)
				// at org.hibernate.cfg.Configuration.addInputStream(Configuration.java:409)
				// at org.hibernate.cfg.Configuration.addResource(Configuration.java:460)
				// at org.hibernate.cfg.Configuration.parseMappingElement(Configuration.java:1300)
				// at org.hibernate.cfg.Configuration.parseSessionFactory(Configuration.java:1272)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1254)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1230)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1150)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1136)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// 
				// at org.hibernate.AssertionFailure.class$(AssertionFailure.java:16)
				// at org.hibernate.AssertionFailure.<clinit>(AssertionFailure.java:16)
				// at org.hibernate.type.CurrencyType.<clinit>(CurrencyType.java:45)
				// at org.hibernate.Hibernate.<clinit>(Hibernate.java:168)
				// at org.hibernate.type.TypeFactory.<clinit>(TypeFactory.java:47)
				// at org.hibernate.mapping.ManyToOne.getType(ManyToOne.java:26)
				// at org.hibernate.mapping.ManyToOne.createForeignKey(ManyToOne.java:39)
				// at org.hibernate.cfg.HbmBinder.createProperty(HbmBinder.java:1978)
				// at org.hibernate.cfg.HbmBinder.createClassProperties(HbmBinder.java:1943)
				// at org.hibernate.cfg.HbmBinder.createClassProperties(HbmBinder.java:1833)
				// at org.hibernate.cfg.HbmBinder.bindRootPersistentClassCommonValues(HbmBinder.java:325)
				// at org.hibernate.cfg.HbmBinder.bindRootClass(HbmBinder.java:242)
				// at org.hibernate.cfg.HbmBinder.bindRoot(HbmBinder.java:153)
				// at org.hibernate.cfg.Configuration.add(Configuration.java:370)
				// at org.hibernate.cfg.Configuration.addInputStream(Configuration.java:409)
				// at org.hibernate.cfg.Configuration.addResource(Configuration.java:460)
				// at org.hibernate.cfg.Configuration.parseMappingElement(Configuration.java:1300)
				// at org.hibernate.cfg.Configuration.parseSessionFactory(Configuration.java:1272)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1254)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1230)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1150)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1136)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
			}
		}
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
			}
		}
		if ("org.springframework.context.support.AbstractApplicationContext"
			.equals(method.getDeclaringClass().getName())) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:85)
			}
		}
		if (Stubs.matches(method, XStream.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(XStream.class);
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:38)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
			}
			argument_types = new Class[] { String.class, Class.class };
			if (Stubs.matches(method, "alias", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:40)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:41)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:42)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:43)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:44)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:45)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:46)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:47)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:48)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:50)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:51)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:52)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:54)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:55)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:57)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:58)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:60)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:61)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:62)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:63)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:65)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:67)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:68)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:69)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:71)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:72)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:74)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:75)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:76)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:78)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:79)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:80)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:82)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:83)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
			}
		}
		if ("com.palladium.utility.PafXStream".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "importObjectFromXml", argument_types)) {
				return "";
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importViewGroups()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importViewGroups()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportViewGroups4() throws Throwable {
		_f0 = new ServerSettings();
		_f0.setClearOutlineCache(false);
		_f0.setDebugMode(false);
		_f0.setEvaluationStepLogging(false);
		_f0.setPafSecurityBootupPassword("");
		_f0.setPafSecurityPassword("");
		_f0.setPafSecurityUser("");
		_f0.setCalcScriptTimeout("");
		_f0.setChangedCellLogging(false);
		// jtest_tested_method
		Map RETVAL = PafMetaData.importViewGroups();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("0", RETVAL.toString()); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportViewGroups4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportViewGroups4(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
			}
		}
		if ("org.springframework.context.support.AbstractApplicationContext"
			.equals(method.getDeclaringClass().getName())) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:85)
			}
		}
		if (Stubs.matches(method, Class.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "forName", argument_types)) {
				return java.lang.Object.class;
				// at org.hibernate.type.CurrencyType.<clinit>(CurrencyType.java:28)
				// at org.hibernate.Hibernate.<clinit>(Hibernate.java:168)
				// at org.hibernate.type.TypeFactory.<clinit>(TypeFactory.java:47)
				// at org.hibernate.mapping.ManyToOne.getType(ManyToOne.java:26)
				// at org.hibernate.mapping.ManyToOne.createForeignKey(ManyToOne.java:39)
				// at org.hibernate.cfg.HbmBinder.createProperty(HbmBinder.java:1978)
				// at org.hibernate.cfg.HbmBinder.createClassProperties(HbmBinder.java:1943)
				// at org.hibernate.cfg.HbmBinder.createClassProperties(HbmBinder.java:1833)
				// at org.hibernate.cfg.HbmBinder.bindRootPersistentClassCommonValues(HbmBinder.java:325)
				// at org.hibernate.cfg.HbmBinder.bindRootClass(HbmBinder.java:242)
				// at org.hibernate.cfg.HbmBinder.bindRoot(HbmBinder.java:153)
				// at org.hibernate.cfg.Configuration.add(Configuration.java:370)
				// at org.hibernate.cfg.Configuration.addInputStream(Configuration.java:409)
				// at org.hibernate.cfg.Configuration.addResource(Configuration.java:460)
				// at org.hibernate.cfg.Configuration.parseMappingElement(Configuration.java:1300)
				// at org.hibernate.cfg.Configuration.parseSessionFactory(Configuration.java:1272)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1254)
				// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1230)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1150)
				// at org.hibernate.cfg.Configuration.configure(Configuration.java:1136)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
			}
		}
		if ("com.palladium.utility.PafXStream".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "importObjectFromXml", argument_types)) {
				return Stubs.makeStubObject(Map.class);
				// at com.palladium.paf.server.PafMetaData.importViewGroups(PafMetaData.java:459)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importViewGroups()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importViewGroups()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportViewGroups5() throws Throwable {
		_f0 = new ServerSettings();
		_f0.setClearOutlineCache(true);
		_f0.setDebugMode(true);
		_f0.setEvaluationStepLogging(true);
		_f0.setPafSecurityBootupPassword("");
		_f0.setPafSecurityPassword("");
		_f0.setPafSecurityUser("");
		_f0.setCalcScriptTimeout("");
		// jtest_tested_method
		_f0.setChangedCellLogging(true);
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportViewGroups5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportViewGroups5(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Class.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "forName", argument_types)) {
				return java.lang.Object.class;
				// at org.springframework.context.support.AbstractApplicationContext.class$(AbstractApplicationContext.java:123)
				// at org.springframework.context.support.AbstractApplicationContext.<clinit>(AbstractApplicationContext.java:123)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:559)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at jtest.wbstubs.java.sql.DriverManagerWBS.class$(DriverManagerWBS.java:14)
				// at jtest.wbstubs.java.sql.DriverManagerWBS.getConnection(DriverManagerWBS.java:28)
				// at java.sql.DriverManager.getConnection
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
			}
		}
		if ("org.springframework.context.support.AbstractApplicationContext"
			.equals(method.getDeclaringClass().getName())) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:85)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importViewSections()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importViewSections()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportViewSections1() throws Throwable {
		// jtest_tested_method
		PafViewSection[] RETVAL = PafMetaData.importViewSections();
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportViewSections1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportViewSections1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isDebugMode", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:110)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafServerHome", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafMetaData.getConfigDirPath(PafMetaData.java:100)
				// at com.palladium.paf.server.PafMetaData.importViewSections(PafMetaData.java:261)
			}
		}
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				return Stubs.makeStubObject(DatabaseMetaData.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:74)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
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
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverName", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverVersion", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "supportsResultSetType", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:80)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "supportsBatchUpdates", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:81)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importViewSections()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importViewSections()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportViewSections2() throws Throwable {
		// jtest_tested_method
		PafViewSection[] RETVAL = PafMetaData.importViewSections();
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(false, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportViewSections2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportViewSections2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isDebugMode", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:110)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafServerHome", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafMetaData.getConfigDirPath(PafMetaData.java:100)
				// at com.palladium.paf.server.PafMetaData.importViewSections(PafMetaData.java:261)
			}
		}
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importViewSections()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importViewSections()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportViewSections4() throws Throwable {
		// jtest_tested_method
		PafViewSection[] RETVAL = PafMetaData.importViewSections();
		// ClassCastException thrown
		// at com.palladium.paf.server.PafMetaData.importViewSections(PafMetaData.java:260)
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportViewSections4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportViewSections4(
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
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				return Stubs.makeStubObject(DatabaseMetaData.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:74)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
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
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverName", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverVersion", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "supportsResultSetType", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:80)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "supportsBatchUpdates", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:81)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PafXStream.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "importObjectFromXml", argument_types)) {
				return "";
				// at com.palladium.paf.server.PafMetaData.importViewSections(PafMetaData.java:261)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importViews()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importViews()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportViews1() throws Throwable {
		_f0 = new ServerSettings();
		// jtest_tested_method
		PafView[] RETVAL = PafMetaData.importViews();
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals(null, PafMetaData.getServerSettings()
			.getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportViews1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportViews1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
			}
		}
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
			}
		}
		if (Stubs.matches(method, XStream.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "fromXML", argument_types)) {
				return null;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importViews()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importViews()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportViews2() throws Throwable {
		// jtest_tested_method
		PafView[] RETVAL = PafMetaData.importViews();
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(true, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(true, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportViews2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportViews2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				return Stubs.makeStubObject(DatabaseMetaData.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:74)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
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
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverName", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverVersion", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "supportsResultSetType", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:80)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "supportsBatchUpdates", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:81)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, XStream.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "fromXML", argument_types)) {
				return null;
				// at com.palladium.utility.PafXStream.importObjectFromXml(PafXStream.java:110)
				// at com.palladium.paf.server.PafMetaData.importViews(PafMetaData.java:240)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importViews()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importViews()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportViews3() throws Throwable {
		// jtest_tested_method
		PafView[] RETVAL = PafMetaData.importViews();
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(PafMetaData.getAppContext()); // jtest_unverified
		assertEquals(
			"org.springframework.context.support.ClassPathXmlApplicationContext: display name [null]; startup date [Wed Dec 31 18:00:00 CST 1969]; root of context hierarchy",
			PafMetaData.getAppContext().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getPafProps()); // jtest_unverified
		assertEquals(
			"{TitanCubeEsbUser=system, EDSUser=system, TitanServerEsbPswd=password, TitanCube2EsbUser=system, ;;EDSUrl=http://localhost:8080/eds/EssbaseEnterprise, ;;TitanCube2EsbServer=pchiadg1, ;;TitanServerEsbServer=pchiadg1, TitanServerEsbUser=system, TitanCubeEsbDb=Titan, TitanCube2EsbServer=localhost, EDSUrl=tcpip://localhost:5001, TitanCubeEsbApp=Titan, EDSDomain=essbase, TitanCubeEsbPswd=password, ;;=Alternate Cube Definition, EDSPswd=password, TitanServerEsbServer=localhost, ;;TitanCubeEsbServer=pchiadg1, TitanCubeEsbServer=localhost, TitanCube2EsbPswd=password, TitanCube2EsbDb=Basic, TitanCube2EsbApp=Sample}",
			PafMetaData.getPafProps().toString()); // jtest_unverified
		assertNotNull(PafMetaData.getServerSettings()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings().isDebugMode()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isClearOutlineCache()); // jtest_unverified
		assertEquals(false, PafMetaData.getServerSettings()
			.isEvaluationStepLogging()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityBootupPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings()
			.getPafSecurityPassword()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getPafSecurityUser()); // jtest_unverified
		assertEquals("", PafMetaData.getServerSettings().getCalcScriptTimeout()); // jtest_unverified
		assertEquals(false, PafMetaData.debugMode); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportViews3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportViews3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isDebugMode", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:110)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafServerHome", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafMetaData.getConfigDirPath(PafMetaData.java:100)
				// at com.palladium.paf.server.PafMetaData.importViews(PafMetaData.java:240)
			}
		}
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importViews()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMetaData#importViews()
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportViews5() throws Throwable {
		// jtest_tested_method
		PafView[] RETVAL = PafMetaData.importViews();
		// ClassCastException thrown
		// at com.palladium.paf.server.PafMetaData.importViews(PafMetaData.java:239)
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportViews5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportViews5(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				return Stubs.makeStubObject(DatabaseMetaData.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:74)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
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
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverName", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverVersion", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "supportsResultSetType", argument_types)) {
				return Boolean.TRUE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:80)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "supportsBatchUpdates", argument_types)) {
				return Boolean.TRUE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:81)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
			}
		}
		if (Stubs.matches(method, PafXStream.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "importObjectFromXml", argument_types)) {
				return "";
				// at com.palladium.paf.server.PafMetaData.importViews(PafMetaData.java:240)
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
     * Usage: java com.palladium.paf.server.PafMetaDataTest
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
            PafMetaDataTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.server.PafMetaData",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return PafMetaData.class;
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
private ServerSettings _f0;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private PafViewSection _f1;
                    	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Configuration _f7;
}

// JTEST_CURRENT_ID=340119638.